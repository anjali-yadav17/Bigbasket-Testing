# API Testing Document

This document outlines the essential API test scenarios and validations for the backend services powering the BigBasket platform.

## 1. Product Search API
**Endpoint:** `GET /api/v1/search`
**Description:** Fetches a list of products based on a search query string.

| Test Case | Description | Expected Status Code | Expected Response / Validation |
| :--- | :--- | :--- | :--- |
| **Valid Search** | Search with a valid keyword (e.g., `?q=apple`) | 200 OK | Response contains a non-empty `products` array with relevant items. |
| **Empty Search** | Search with an empty query (e.g., `?q=`) | 400 Bad Request | Error message: "Search query cannot be empty". |
| **Invalid Search** | Search with special characters (e.g., `?q=@#$%`) | 200 OK | Response contains an empty `products` array and `count: 0`. |
| **Performance** | Check response time for search. | 200 OK | Response time should be < 500ms. |

---

## 2. User Authentication (Login)
**Endpoint:** `POST /api/v1/auth/login`
**Description:** Authenticates the user and returns an access token.
**Payload:** `{"mobile": "9999999999", "otp": "1234"}`

| Test Case | Description | Expected Status Code | Expected Response / Validation |
| :--- | :--- | :--- | :--- |
| **Valid Login** | Provide valid registered mobile and correct OTP. | 200 OK | Returns an `access_token` and user profile details. |
| **Invalid OTP** | Provide valid mobile but incorrect OTP. | 401 Unauthorized | Error message: "Invalid OTP". |
| **Missing Fields** | Do not provide OTP in the JSON payload. | 400 Bad Request | Error message: "OTP is required". |
| **SQL Injection** | Attempt SQL injection in mobile field (`' OR 1=1 --`). | 400 Bad Request | Input validation error. Token not issued. |

---

## 3. Add to Cart API
**Endpoint:** `POST /api/v1/cart/add`
**Description:** Adds a specified quantity of a product to the user's cart. Requires Bearer Token.
**Payload:** `{"product_id": 1056, "quantity": 2}`
**Headers:** `Authorization: Bearer <token>`

| Test Case | Description | Expected Status Code | Expected Response / Validation |
| :--- | :--- | :--- | :--- |
| **Valid Add** | Add valid product ID with valid quantity. | 201 Created | Success message and updated cart total/items. |
| **Out of Stock** | Add a product ID that is currently out of stock. | 409 Conflict | Error message: "Product is out of stock". |
| **Invalid Token**| Call API without authorization token or expired token. | 401 Unauthorized | Error message: "Authentication required". |
| **Invalid Qty** | Send a negative quantity or `0`. | 400 Bad Request | Error message: "Quantity must be greater than 0". |

---

## Tools Used for API Testing:
* **Postman**: Used for manual execution, exploratory testing, and creating automated test suites.
* **Assertions Written in Postman (JavaScript):**
  * `pm.response.to.have.status(200);`
  * `pm.response.to.have.jsonSchema(schema);`
  * `pm.expect(pm.response.responseTime).to.be.below(500);`
