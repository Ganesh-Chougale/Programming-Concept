### **`1xx` - Informational Responses**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 100  | Continue                     | Client can continue the request. |
| 101  | Switching Protocols          | Server switching protocols as requested. |
| 102  | Processing                   | Server is processing but no response yet (WebDAV). |
| 103  | Early Hints                  | Preload resources before the final response. |

---

### **`2xx` - Success**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 200  | OK                           | Request was successful. |
| 201  | Created                      | A new resource was created successfully. |
| 202  | Accepted                     | Request received but not yet processed. |
| 203  | Non-Authoritative Information | Response from a third-party source. |
| 204  | No Content                   | Request successful, but no response body. |
| 205  | Reset Content                | Instructs client to reset document view. |
| 206  | Partial Content              | Partial response for range requests. |
| 207  | Multi-Status                 | Multiple status codes in one response (WebDAV). |
| 208  | Already Reported             | Resource already listed (WebDAV). |
| 226  | IM Used                      | Server fulfilled request using GET and instance manipulation. |

---

### **`3xx` - Redirection**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 300  | Multiple Choices             | Multiple options available for the resource. |
| 301  | Moved Permanently            | Resource has been permanently moved. |
| 302  | Found                        | Temporary redirection to another URL. |
| 303  | See Other                    | Redirect using GET method. |
| 304  | Not Modified                 | Resource not changed, use cached version. |
| 305  | Use Proxy                    | Deprecated. Request must be made via a proxy. |
| 306  | (Unused)                     | No longer in use, reserved for future. |
| 307  | Temporary Redirect           | Temporary redirect, maintains HTTP method. |
| 308  | Permanent Redirect           | Permanent redirect, maintains HTTP method. |

---

### **`4xx` - Client Errors**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 400  | Bad Request                  | Invalid request due to client error. |
| 401  | Unauthorized                 | Authentication required. |
| 402  | Payment Required             | Reserved for future use (e.g., digital payments). |
| 403  | Forbidden                    | Client does not have permission to access. |
| 404  | Not Found                    | Requested resource was not found. |
| 405  | Method Not Allowed           | HTTP method not allowed for this resource. |
| 406  | Not Acceptable               | Server cannot fulfill request due to content negotiation. |
| 407  | Proxy Authentication Required | Client must authenticate with proxy. |
| 408  | Request Timeout              | Server timed out waiting for the request. |
| 409  | Conflict                     | Request conflicts with current server state. |
| 410  | Gone                         | Resource is permanently gone. |
| 411  | Length Required              | Content-Length header is missing. |
| 412  | Precondition Failed          | One or more conditions in the request failed. |
| 413  | Payload Too Large            | Request body too large to process. |
| 414  | URI Too Long                 | Requested URL is too long. |
| 415  | Unsupported Media Type       | Request format is unsupported. |
| 416  | Range Not Satisfiable        | Requested range is invalid. |
| 417  | Expectation Failed           | Server cannot meet the expectation in request headers. |
| 418  | I'm a Teapot                 | Fun RFC joke, used in April Fools' jokes. 🍵 |
| 419  | Authentication Timeout       | Not in official HTTP standards but used in some web apps. |
| 421  | Misdirected Request          | Server cannot handle request (wrong server). |
| 422  | Unprocessable Entity         | Request valid but cannot be processed. |
| 423  | Locked                       | Resource is locked (WebDAV). |
| 424  | Failed Dependency            | Failed due to a dependency (WebDAV). |
| 425  | Too Early                    | Prevents replay attacks. |
| 426  | Upgrade Required             | Client should upgrade protocol (e.g., HTTP to HTTPS). |
| 428  | Precondition Required        | Server requires request to have conditions. |
| 429  | Too Many Requests            | Rate limiting (client sent too many requests). |
| 431  | Request Header Fields Too Large | Headers too large to process. |
| 451  | Unavailable for Legal Reasons | Resource blocked due to legal reasons (e.g., censorship). |

---

### **`5xx` - Server Errors**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 500  | Internal Server Error        | Generic server error. |
| 501  | Not Implemented              | Server does not support the request method. |
| 502  | Bad Gateway                  | Invalid response from upstream server. |
| 503  | Service Unavailable          | Server is overloaded or under maintenance. |
| 504  | Gateway Timeout              | Upstream server took too long to respond. |
| 505  | HTTP Version Not Supported   | Server does not support requested HTTP version. |
| 506  | Variant Also Negotiates      | Configuration error (rare). |
| 507  | Insufficient Storage         | Server lacks storage to process request (WebDAV). |
| 508  | Loop Detected                | Infinite loop detected in processing request (WebDAV). |
| 510  | Not Extended                 | Additional server extensions required. |
| 511  | Network Authentication Required | Client must authenticate to access the network. |

---

### **Unofficial / Non-Standard Codes**
| Code | Name                         | Description |
|------|------------------------------|-------------|
| 419  | Page Expired                 | Used by some web applications for expired sessions. |
| 420  | Enhance Your Calm (Twitter)  | Rate limiting (deprecated). |
| 430  | Request Header Fields Too Large (Shopify) | Shopify-specific rate limiting. |
| 450  | Blocked by Windows Parental Controls | Used by Microsoft. |
| 498  | Invalid Token (Esri)         | Authentication token expired. |
| 509  | Bandwidth Limit Exceeded     | Server exceeded bandwidth limit (Apache, not standard). |
| 526  | Invalid SSL Certificate      | Cloudflare-specific SSL error. |

---
