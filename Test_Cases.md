# Test Cases

## Module: User Login / Authentication

| Test Case ID | Test Scenario | Steps to Reproduce | Expected Result | Priority |
| :--- | :--- | :--- | :--- | :--- |
| TC_LOG_01 | Valid Login | 1. Go to Login page.<br>2. Enter valid email/mobile.<br>3. Enter valid OTP/password.<br>4. Click Login. | User should be successfully logged in and redirected to homepage. | High |
| TC_LOG_02 | Invalid OTP | 1. Enter valid mobile.<br>2. Enter invalid OTP.<br>3. Click Login. | Error message "Invalid OTP" should be displayed. | High |
| TC_LOG_03 | Empty Fields | 1. Leave mobile field empty.<br>2. Click Login. | Validation error "Please enter mobile number" should appear. | Medium |

## Module: Search Products

| Test Case ID | Test Scenario | Steps to Reproduce | Expected Result | Priority |
| :--- | :--- | :--- | :--- | :--- |
| TC_SRC_01 | Exact Keyword | 1. Enter "Apple" in search bar.<br>2. Press Enter. | Relevant apple products should be listed. | High |
| TC_SRC_02 | Typo Handling | 1. Enter "Aple" in search bar. | Auto-correct suggestions or closest matches should be shown. | Medium |
| TC_SRC_03 | Filters & Sorting | 1. Search "Milk".<br>2. Apply "Price: Low to High". | Results should be sorted by price in ascending order. | High |

## Module: Shopping Cart

| Test Case ID | Test Scenario | Steps to Reproduce | Expected Result | Priority |
| :--- | :--- | :--- | :--- | :--- |
| TC_CRT_01 | Add Item | 1. Click "Add" on a product. | Cart count should increase by 1, and item should appear in cart. | Critical |
| TC_CRT_02 | Increase Quantity | 1. Go to Cart.<br>2. Click "+" next to an item. | Item quantity and total price should update accurately. | High |
| TC_CRT_03 | Remove Item | 1. Click "Delete" or "-" until 0. | Item should be removed from cart. | High |

## Module: Payment Gateway

| Test Case ID | Test Scenario | Steps to Reproduce | Expected Result | Priority |
| :--- | :--- | :--- | :--- | :--- |
| TC_PAY_01 | Successful Card Payment | 1. Proceed to checkout.<br>2. Enter valid card details.<br>3. Submit OTP. | Order should be placed successfully. | Critical |
| TC_PAY_02 | Failed Payment Handling | 1. Enter invalid CVV/OTP. | Transaction should fail with an appropriate error, redirecting to retry page. | High |
