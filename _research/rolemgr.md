Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels) Summary: [Constants](https://developer.android.com/reference/android/app/role/RoleManager#constants) \| [Methods](https://developer.android.com/reference/android/app/role/RoleManager#pubmethods) \| [Inherited Methods](https://developer.android.com/reference/android/app/role/RoleManager#inhmethods)

# RoleManager

*** ** * ** ***


`
public

final

class
RoleManager
`


`

extends https://developer.android.com/reference/java/lang/Object


`

`


`

|---|---|
| [java.lang.Object](https://developer.android.com/reference/java/lang/Object) ||
| ↳ | android.app.role.RoleManager |

<br />

*** ** * ** ***

This class provides information about and manages roles.


A role is a unique name within the system associated with certain privileges. The list of
available roles might change with a system app update, so apps should not make assumption about
the availability of roles. Instead, they should always query if the role is available using
`https://developer.android.com/reference/android/app/role/RoleManager#isRoleAvailable(java.lang.String)` before trying to do anything with it. Some predefined role names
are available as constants in this class, and a list of possibly available roles can be found in
the [AndroidX Role
library](https://developer.android.com/reference/androidx/core/role/package-summary).


There can be multiple applications qualifying for a role, but only a subset of them can become
role holders. To qualify for a role, an application must meet certain requirements, including
defining certain components in its manifest. These requirements can be found in the AndroidX
Libraries. Then the application will need user consent to become a role holder, which can be
requested using `https://developer.android.com/reference/android/app/Activity#startActivityForResult(android.content.Intent,%20int)` with the
`Intent` obtained from `https://developer.android.com/reference/android/app/role/RoleManager#createRequestRoleIntent(java.lang.String)`.


Upon becoming a role holder, the application may be granted certain privileges that are role
specific. When the application loses its role, these privileges will also be revoked.

## Summary

| ### Constants ||
|---|---|
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_ASSISTANT` The name of the assistant app role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_BROWSER` The name of the browser role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_CALL_REDIRECTION` The name of the call redirection role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_CALL_SCREENING` The name of the call screening and caller id role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_CONTENT_SAFETY` The name of the content safety role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_DIALER` The name of the dialer role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_EMERGENCY` The name of the emergency role |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_HOME` The name of the home role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_NOTES` The name of the notes role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_REGISTERED_APP_STORE` The name of the registered app store role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_SEARCH_ENGINE` The name of the search engine role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_SMS` The name of the SMS role. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/role/RoleManager#ROLE_WALLET` The name of the Wallet role. |

| ### Public methods ||
|---|---|
| ` https://developer.android.com/reference/android/content/Intent` | ` https://developer.android.com/reference/android/app/role/RoleManager#createRequestRoleIntent(java.lang.String)(https://developer.android.com/reference/java/lang/String roleName) ` Returns an `Intent` suitable for passing to `https://developer.android.com/reference/android/app/Activity#startActivityForResult(android.content.Intent,%20int)` which prompts the user to grant a role to this application. |
| ` boolean` | ` https://developer.android.com/reference/android/app/role/RoleManager#isRoleAvailable(java.lang.String)(https://developer.android.com/reference/java/lang/String roleName) ` Check whether a role is available in the system. |
| ` boolean` | ` https://developer.android.com/reference/android/app/role/RoleManager#isRoleHeld(java.lang.String)(https://developer.android.com/reference/java/lang/String roleName) ` Check whether the calling application is holding a particular role. |

### Inherited methods

From class `

https://developer.android.com/reference/java/lang/Object

` `


https://developer.android.com/reference/java/lang/Object` `
https://developer.android.com/reference/java/lang/Object#clone()()
`

Creates and returns a copy of this object.


`


boolean` `
https://developer.android.com/reference/java/lang/Object#equals(java.lang.Object)(https://developer.android.com/reference/java/lang/Object obj)
`

Indicates whether some other object is "equal to" this one.


`


void` `
https://developer.android.com/reference/java/lang/Object#finalize()()
`

Called by the garbage collector on an object when garbage collection
determines that there are no more references to the object.


`


final

https://developer.android.com/reference/java/lang/Class<?>` `
https://developer.android.com/reference/java/lang/Object#getClass()()
`

Returns the runtime class of this `Object`.


`


int` `
https://developer.android.com/reference/java/lang/Object#hashCode()()
`

Returns a hash code value for the object.


`


final

void` `
https://developer.android.com/reference/java/lang/Object#notify()()
`

Wakes up a single thread that is waiting on this object's
monitor.


`


final

void` `
https://developer.android.com/reference/java/lang/Object#notifyAll()()
`

Wakes up all threads that are waiting on this object's monitor.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/java/lang/Object#toString()()
`

Returns a string representation of the object.


`


final

void` `
https://developer.android.com/reference/java/lang/Object#wait(long,%20int)(long timeoutMillis, int nanos)
`

Causes the current thread to wait until it is awakened, typically
by being *notified* or *interrupted*, or until a
certain amount of real time has elapsed.


`


final

void` `
https://developer.android.com/reference/java/lang/Object#wait(long)(long timeoutMillis)
`

Causes the current thread to wait until it is awakened, typically
by being *notified* or *interrupted*, or until a
certain amount of real time has elapsed.


`


final

void` `
https://developer.android.com/reference/java/lang/Object#wait()()
`

Causes the current thread to wait until it is awakened, typically
by being *notified* or *interrupted*.


## Constants

### ROLE_ASSISTANT

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_ASSISTANT
```

The name of the assistant app role.

<br />

**See also:**

- `https://developer.android.com/reference/android/service/voice/VoiceInteractionService`

Constant Value:

"android.app.role.ASSISTANT"


### ROLE_BROWSER

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_BROWSER
```

The name of the browser role.

<br />

**See also:**

- `https://developer.android.com/reference/android/content/Intent#CATEGORY_APP_BROWSER`

Constant Value:

"android.app.role.BROWSER"


### ROLE_CALL_REDIRECTION

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_CALL_REDIRECTION
```

The name of the call redirection role.


A call redirection app provides a means to re-write the phone number for an outgoing call to
place the call through a call redirection service.

<br />

**See also:**

- `https://developer.android.com/reference/android/telecom/CallRedirectionService`

Constant Value:

"android.app.role.CALL_REDIRECTION"


### ROLE_CALL_SCREENING

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_CALL_SCREENING
```

The name of the call screening and caller id role.

<br />

**See also:**

- `https://developer.android.com/reference/android/telecom/CallScreeningService`

Constant Value:

"android.app.role.CALL_SCREENING"


### ROLE_CONTENT_SAFETY

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ROLE_CONTENT_SAFETY
```

The name of the content safety role.

This role enables the ability to view and restrict content for the user.

<br />

**See also:**

- `https://developer.android.com/`
- `https://developer.android.com/reference/android/app/contentsafety/ContentSafetyManager`

Constant Value:

"android.app.role.CONTENT_SAFETY"


### ROLE_DIALER

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_DIALER
```

The name of the dialer role.

<br />

**See also:**

- `https://developer.android.com/reference/android/content/Intent#ACTION_DIAL`
- `https://developer.android.com/reference/android/telecom/InCallService`

Constant Value:

"android.app.role.DIALER"


### ROLE_EMERGENCY

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_EMERGENCY
```

The name of the emergency role

<br />

Constant Value:

"android.app.role.EMERGENCY"


### ROLE_HOME

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_HOME
```

The name of the home role.

<br />

**See also:**

- `https://developer.android.com/reference/android/content/Intent#CATEGORY_HOME`

Constant Value:

"android.app.role.HOME"


### ROLE_NOTES

Added in [API level 34](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_NOTES
```

The name of the notes role.

<br />

**See also:**

- `https://developer.android.com/reference/android/content/Intent#ACTION_CREATE_NOTE`
- `https://developer.android.com/reference/android/content/Intent#EXTRA_USE_STYLUS_MODE`

Constant Value:

"android.app.role.NOTES"


### ROLE_REGISTERED_APP_STORE

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ROLE_REGISTERED_APP_STORE
```

The name of the registered app store role.
This role is managed from `https://developer.android.com/reference/android/content/pm/PackageManager` when a registered app
store is installed or updated.

<br />

Constant Value:

"android.app.role.REGISTERED_APP_STORE"


### ROLE_SEARCH_ENGINE

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ROLE_SEARCH_ENGINE
```

The name of the search engine role.

<br />

Constant Value:

"android.app.role.SEARCH_ENGINE"


### ROLE_SMS

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_SMS
```

The name of the SMS role.

<br />

**See also:**

- `https://developer.android.com/reference/android/content/Intent#CATEGORY_APP_MESSAGING`

Constant Value:

"android.app.role.SMS"


### ROLE_WALLET

Added in [API level 35](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String ROLE_WALLET
```

The name of the Wallet role.

<br />

**See also:**

- `https://developer.android.com/reference/android/nfc/cardemulation/CardEmulation`

Constant Value:

"android.app.role.WALLET"


## Public methods

### createRequestRoleIntent

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public Intent createRequestRoleIntent (String roleName)
```

Returns an `Intent` suitable for passing to
`https://developer.android.com/reference/android/app/Activity#startActivityForResult(android.content.Intent,%20int)` which prompts the user to
grant a role to this application.


If the role is granted, the `resultCode` will be
`https://developer.android.com/reference/android/app/Activity#RESULT_OK`, otherwise it will be
`https://developer.android.com/reference/android/app/Activity#RESULT_CANCELED`.

<br />

| Parameters ||
|---|---|
| `roleName` | `String`: the name of requested role. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/android/content/Intent` | the `Intent` to prompt user to grant the role. This value cannot be `null`. <br /> |

### isRoleAvailable

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public boolean isRoleAvailable (String roleName)
```

Check whether a role is available in the system.

<br />

| Parameters ||
|---|---|
| `roleName` | `String`: the name of role to checking for. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `boolean` | whether the role is available in the system <br /> |

### isRoleHeld

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public boolean isRoleHeld (String roleName)
```

Check whether the calling application is holding a particular role.

<br />

| Parameters ||
|---|---|
| `roleName` | `String`: the name of the role to check for. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `boolean` | whether the calling application is holding the role <br /> |