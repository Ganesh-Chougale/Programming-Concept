const playAsylum = new Promise((res) => {
    setTimeout(() => res("completed Arkham Asylum"), 100); // Resolves first
});

const playCity = new Promise((res, rej) => {
    setTimeout(() => rej("Arkham City crashed!"), 200); // Rejects later
});

Promise.race([playAsylum, playCity])
    .then((message) => {
        console.log("Race resolved with:", message);
    })
    .catch((error) => {
        console.log("Race rejected with:", error);
    });
