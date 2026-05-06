# Requirement Traceability Matrix (RTM)

The RTM ensures that all system requirements are covered by corresponding test cases.

| Req ID | Requirement Description | Test Case ID | Status | Bug ID (If Failed) |
| :--- | :--- | :--- | :--- | :--- |
| REQ-01 | User should be able to login via OTP. | TC_LOG_01, TC_LOG_02 | Passed | - |
| REQ-02 | System should validate empty login fields. | TC_LOG_03 | Passed | - |
| REQ-03 | Users can search for products using keywords. | TC_SRC_01 | Passed | - |
| REQ-04 | Users can sort products by price. | TC_SRC_03 | Failed | BB_102 |
| REQ-05 | Users can add items to the cart. | TC_CRT_01 | Passed | - |
| REQ-06 | Users can modify quantity in the cart. | TC_CRT_02 | Passed | - |
| REQ-07 | Users can remove items from the cart. | TC_CRT_03 | Failed | BB_101 |
| REQ-08 | Users can pay via Credit/Debit Cards. | TC_PAY_01 | Passed | - |
| REQ-09 | System handles failed payment gracefully. | TC_PAY_02 | Passed | - |
