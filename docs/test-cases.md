# Test Cases - CampusRide v1.0

## TC-01: Book ride with valid pickup and dropoff
**Linked to**: US-01, FR-01
**Priority**: Must Have

**Preconditions**: 
Student is logged in. Driver is online.

**Test Steps**:
1. Student opens CampusRide app
2. Enter Pickup: "FBC Main Gate"
3. Enter Dropoff: "Engineering Block"
4. Click "Book Ride"

**Expected Result**:
- Booking confirmation shows in <10 seconds
- Driver is assigned and student sees "Driver Found"
- Booking ID is generated

**Status**: Pass / Fail

---

## TC-02: Driver accepts ride request and student is notified
**Linked to**: US-02, FR-02  
**Priority**: Must Have

**Preconditions**: 
Student has created a ride request. Driver is logged in.

**Test Steps**:
1. Driver receives new ride notification
2. Driver clicks "Accept"
3. Check student app

**Expected Result**:
- Driver status changes to "On the way"
- Student receives push notification: "Driver John has accepted your ride"
- Student sees driver name and ETA

**Status**: Pass / Fail

---

## TC-03: Fare calculated based on distance
**Linked to**: US-03, FR-03
**Priority**: Should Have

**Preconditions**:
Student enters pickup and dropoff

**Test Steps**:
1. Enter Pickup: "Hostel A"
2. Enter Dropoff: "Library"
3. Click "Get Fare Estimate"

**Expected Result**:
- Estimated fare displays in <3 seconds
- Fare is > 0 and matches distance formula

**Status**: Pass / Fail