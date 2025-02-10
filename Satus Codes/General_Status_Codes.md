
| Code  | Meaning                  | Description |
|-------|--------------------------|-------------|
| **1xx (Informational)** |
| 100   | Continue                 | Request received, continue sending |
| 101   | Switching Protocols      | Server is switching protocols |
| **2xx (Success)** |
| 200   | OK                       | Request successful |
| 201   | Created                  | Resource created successfully |
| 202   | Accepted                 | Request accepted but not completed |
| 204   | No Content               | Request successful, no response body |
| **3xx (Redirection)** |
| 301   | Moved Permanently        | Resource has a new permanent URL |
| 302   | Found (Temporary Redirect) | Temporary redirect |
| 304   | Not Modified             | Resource not changed (used for caching) |
| **4xx (Client Errors)** |
| 400   | Bad Request              | Invalid request parameters |
| 401   | Unauthorized             | Authentication required |
| 403   | Forbidden                | No permission to access the resource |
| 404   | Not Found                | Resource doesn't exist |
| 405   | Method Not Allowed       | HTTP method not allowed for the resource |
| 409   | Conflict                 | Request conflicts with server state |
| 422   | Unprocessable Entity     | Validation error (wrong input format) |
| **5xx (Server Errors)** |
| 500   | Internal Server Error    | Generic server error |
| 502   | Bad Gateway              | Invalid response from upstream server |
| 503   | Service Unavailable      | Server overloaded or under maintenance |
| 504   | Gateway Timeout          | Upstream server took too long to respond |
