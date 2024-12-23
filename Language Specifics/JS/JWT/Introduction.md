[**JWT official website**](https://jwt.io/)  

# JWT : Json Wen Token  
JWT is a self-contained safe-url transmission technique between 2 parties.  
basically it is a string which is used to exchange information between client & server.  

#### JWT consists of three parts, separated by dots (.)  
- **`Header`**
- **`Payload`**
- **`Signature`**

take a look at this jwt string  
```css
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0IiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```  
```css
Header.Payload.Signature
```  
each `.` represents seperation of parts
```css
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9 is : Header
eyJzdWIiOiIxMjM0IiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ is : Payload
SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c is : Signature
```  

## 1. Header  
Metadata about the token, typically the type (JWT) and signing algorithm (`HS256`, `RS256`, etc.).
#### Syntax  
```css
{
  algorithm name,
  algorithm type
}

```  
#### Example  
```css
{
  "alg": "HS256",
  "typ": "JWT"
}
```  
## 2. Payload  
Fields such as user ID, roles, or other custom attributes. closing with `issued at` timestamp.    
#### Syntax  
```css
{
  subject or ID,
  Name,
  .
  .
  etc,
  issuedAt
}
```  
#### Example  
```css
{
  "sub": "1234",
  "name": "billy batson",
  "iat": 1516239022 (UNIX timestamp)
}
```  
## 3. Signature  
Ensures the token's integrity and authenticity. Created by signing the header and payload using a secret key or private key.  
#### Syntax  
```css
    /* HMAC (Hash-based Message Authentication Code) */
    HMACSHA256(
        HeaderEncoding,
        PayloadEncoding,
        Secret-Key
    )
```  
#### Example  
```css
HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
        Secret-Key
) secret base64 encoded
```  