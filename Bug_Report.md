# Bug Reports

This document tracks identified defects during test execution.

## Bug ID: BB_101
* **Module:** Cart
* **Severity:** High
* **Priority:** Critical
* **Title:** Removed item still visible in cart upon page refresh.
* **Steps to Reproduce:**
  1. Login to application.
  2. Add 'Amul Butter 500g' to the cart.
  3. Navigate to Cart page.
  4. Click on 'Remove' icon next to the item.
  5. Refresh the page (F5).
* **Expected Result:** The item should be permanently removed and cart should be empty.
* **Actual Result:** The removed item reappears in the cart after the page refresh.
* **Environment:** Chrome v114, Windows 11.
* **Status:** Open

---

## Bug ID: BB_102
* **Module:** Search
* **Severity:** Medium
* **Priority:** Medium
* **Title:** Sorting by "Price: High to Low" does not sort correctly for items with active discounts.
* **Steps to Reproduce:**
  1. Search for 'Rice'.
  2. Apply sorting filter "Price: High to Low".
* **Expected Result:** Items should be sorted strictly by their final selling price in descending order.
* **Actual Result:** Items are being sorted by their MRP instead of the discounted price.
* **Environment:** Firefox v113, macOS.
* **Status:** Open
