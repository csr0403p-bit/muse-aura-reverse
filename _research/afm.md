Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels) Summary: [Constants](https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#constants) \| [Methods](https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#pubmethods) \| [Inherited Methods](https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#inhmethods)

# AppFunctionManager

*** ** * ** ***


`
public

final

class
AppFunctionManager
`


`

extends https://developer.android.com/reference/java/lang/Object


`

`


`

|---|---|
| [java.lang.Object](https://developer.android.com/reference/java/lang/Object) ||
| ↳ | android.app.appfunctions.AppFunctionManager |

<br />

*** ** * ** ***

Provides access to App Functions.

See `https://developer.android.com/reference/android/app/appfunctions/package-summary` for a comprehensive overview of App Functions.

## Summary

| ### Constants ||
|---|---|
| `int` | `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_DEFAULT` The default state of the app function. |
| `int` | `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_DISABLED` The app function is disabled. |
| `int` | `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_ENABLED` The app function is enabled. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#PROPERTY_SUPPORT_APP_FUNCTION_USER_CONTROL` Application level `https://developer.android.com/reference/android/content/pm/PackageManager.Property` tag that informs the system whether the app supports runtime user control when invoking app functions. |

| ### Public methods ||
|---|---|
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#executeAppFunction(android.app.AppInteractionSession,%20android.app.appfunctions.ExecuteAppFunctionRequest,%20java.util.concurrent.Executor,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)(https://developer.android.com/reference/android/app/AppInteractionSession appInteractionSession, https://developer.android.com/reference/android/app/appfunctions/ExecuteAppFunctionRequest request, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/CancellationSignal cancellationSignal, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/android/app/appfunctions/ExecuteAppFunctionResponse, https://developer.android.com/reference/android/app/appfunctions/AppFunctionException> callback) ` Executes the app function with an `https://developer.android.com/reference/android/app/AppInteractionSession`. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest,%20java.util.concurrent.Executor,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)(https://developer.android.com/reference/android/app/appfunctions/ExecuteAppFunctionRequest request, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/CancellationSignal cancellationSignal, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/android/app/appfunctions/ExecuteAppFunctionResponse, https://developer.android.com/reference/android/app/appfunctions/AppFunctionException> callback) ` Executes the app function. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionActivityStates(java.util.Set<android.app.appfunctions.AppFunctionActivityId>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionActivityState>,java.lang.Exception>)(https://developer.android.com/reference/java/util/Set<https://developer.android.com/reference/android/app/appfunctions/AppFunctionActivityId> activityIds, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/app/appfunctions/AppFunctionActivityState>, https://developer.android.com/reference/java/lang/Exception> callback) ` Retrieves the registered app functions for the specified activities. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/app/appfunctions/AppFunctionName> appFunctionNames, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/app/appfunctions/AppFunctionState>, https://developer.android.com/reference/java/lang/Exception> callback) ` Retrieves the runtime state of the specified app functions. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#isAppFunctionEnabled(java.lang.String,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Boolean,java.lang.Exception>)(https://developer.android.com/reference/java/lang/String functionIdentifier, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/lang/Boolean, https://developer.android.com/reference/java/lang/Exception> callback) ` Retrieves whether an app function owned by the calling package is enabled (allows execution). |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#isAppFunctionEnabled(java.lang.String,%20java.lang.String,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Boolean,java.lang.Exception>)(https://developer.android.com/reference/java/lang/String functionIdentifier, https://developer.android.com/reference/java/lang/String targetPackage, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/lang/Boolean, https://developer.android.com/reference/java/lang/Exception> callback) ` Retrieves whether an app function is enabled (allows execution). |
| ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionObservation` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#observeAppFunctions(java.util.concurrent.Executor,%20android.app.appfunctions.AppFunctionObserver)(https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver appFunctionObserver) ` Registers an observer to monitor changes to app functions within packages that the caller can query. |
| ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunction(java.lang.String,%20java.util.concurrent.Executor,%20android.app.appfunctions.AppFunction)(https://developer.android.com/reference/java/lang/String functionIdentifier, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/app/appfunctions/AppFunction appFunction) ` Registers a runtime implementation for an app function, that can be executed using `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#executeAppFunction(android.app.AppInteractionSession,%20android.app.appfunctions.ExecuteAppFunctionRequest,%20java.util.concurrent.Executor,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)`. |
| ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunctions(java.util.List<android.app.appfunctions.RegisterAppFunctionRequest>)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/app/appfunctions/RegisterAppFunctionRequest> requests) ` Registers several `https://developer.android.com/reference/android/app/appfunctions/AppFunction` implementations at once, sharing a single lifecycle. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)(https://developer.android.com/reference/android/app/appfunctions/AppFunctionSearchSpec searchSpec, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata>, https://developer.android.com/reference/java/lang/Exception> callback) ` Searches app function `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata`s. |
| ` void` | ` https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#setAppFunctionEnabled(java.lang.String,%20int,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,java.lang.Exception>)(https://developer.android.com/reference/java/lang/String functionIdentifier, int newEnabledState, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/lang/Void, https://developer.android.com/reference/java/lang/Exception> callback) ` Sets the enabled state of the app function owned by the calling package. |

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

### APP_FUNCTION_STATE_DEFAULT

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final int APP_FUNCTION_STATE_DEFAULT
```

The default state of the app function.

To reset the enabled state to the default value, call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#setAppFunctionEnabled(java.lang.String,%20int,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,java.lang.Exception>)` with
this value.

<br />

Constant Value:

0
(0x00000000)


### APP_FUNCTION_STATE_DISABLED

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final int APP_FUNCTION_STATE_DISABLED
```

The app function is disabled.

To disable an app function, call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#setAppFunctionEnabled(java.lang.String,%20int,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,java.lang.Exception>)` with this value.

<br />

Constant Value:

2
(0x00000002)


### APP_FUNCTION_STATE_ENABLED

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final int APP_FUNCTION_STATE_ENABLED
```

The app function is enabled.

To enable an app function, call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#setAppFunctionEnabled(java.lang.String,%20int,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,java.lang.Exception>)` with this value.

<br />

Constant Value:

1
(0x00000001)


### PROPERTY_SUPPORT_APP_FUNCTION_USER_CONTROL

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String PROPERTY_SUPPORT_APP_FUNCTION_USER_CONTROL
```

Application level `https://developer.android.com/reference/android/content/pm/PackageManager.Property` tag that informs the
system whether the app supports runtime user control when invoking app functions.

Setting this property to `true` indicates that the app supports runtime user
control. Therefore, the system will no longer automatically grant "always allow" access to
the caller at package installation time.

Setting this property to `false` (or leaving it unset) indicates that the app has
not migrated to runtime user control. To maintain compatibility, the system will grant the
caller "always allow" access by default. However, users can still manually adjust the
permission in system settings to restrict or block this access.

This property will stop being respected in a future Android release.

**Syntax:**

```
<application>
  <property
    android:name="android.app.appfunctions.PROPERTY_SUPPORTS_APP_FUNCTION_USER_CONTROL"
    android:value="true|false"/>
</application>
```

<br />

<br />

Constant Value:

"android.app.appfunctions.PROPERTY_SUPPORTS_APP_FUNCTION_USER_CONTROL"


## Public methods

### executeAppFunction

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void executeAppFunction (AppInteractionSession appInteractionSession, 
                ExecuteAppFunctionRequest request, 
                Executor executor, 
                CancellationSignal cancellationSignal, 
                OutcomeReceiver<ExecuteAppFunctionResponse, AppFunctionException> callback)
```

Executes the app function with an `https://developer.android.com/reference/android/app/AppInteractionSession`.

Applications can execute functions they define. To execute functions defined in another
component, the caller must have the `https://developer.android.com/reference/android/Manifest.permission#EXECUTE_APP_FUNCTIONS` or
`android.permission.EXECUTE_APP_FUNCTIONS_SYSTEM` permissions.

A function can only be executed while its `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState#isEnabled()` is true.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionException` for possible failures.

<br />

| Parameters ||
|---|---|
| `appInteractionSession` | `AppInteractionSession`: the app interaction session to associate with the function execution. This value cannot be `null`. <br /> |
| `request` | `ExecuteAppFunctionRequest`: the request to execute the app function. This value cannot be `null`. <br /> |
| `executor` | `Executor`: the executor to run the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `cancellationSignal` | `CancellationSignal`: the cancellation signal to cancel the execution. This value cannot be `null`. <br /> |
| `callback` | `OutcomeReceiver`: the callback to receive the function execution result or error. This value cannot be `null`. <br /> |

**See also:**

- `https://developer.android.com/reference/android/app/AppInteractionManager#createSession(android.app.AppInteractionSession.CreateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<android.app.AppInteractionSession,android.app.AppInteractionException>)`

### executeAppFunction

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void executeAppFunction (ExecuteAppFunctionRequest request, 
                Executor executor, 
                CancellationSignal cancellationSignal, 
                OutcomeReceiver<ExecuteAppFunctionResponse, AppFunctionException> callback)
```

Executes the app function.

Applications can execute functions they define. To execute functions defined in another
component, the caller must have the `https://developer.android.com/reference/android/Manifest.permission#EXECUTE_APP_FUNCTIONS` or
`android.permission.EXECUTE_APP_FUNCTIONS_SYSTEM` permissions.

A function can only be executed while its `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState#isEnabled()` is true.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionException` for possible failures.

<br />

| Parameters ||
|---|---|
| `request` | `ExecuteAppFunctionRequest`: the request to execute the app function. This value cannot be `null`. <br /> |
| `executor` | `Executor`: the executor to run the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `cancellationSignal` | `CancellationSignal`: the cancellation signal to cancel the execution. This value cannot be `null`. <br /> |
| `callback` | `OutcomeReceiver`: the callback to receive the function execution result or error. This value cannot be `null`. <br /> |

### getAppFunctionActivityStates

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void getAppFunctionActivityStates (Set<AppFunctionActivityId> activityIds, 
                Executor executor, 
                OutcomeReceiver<List<AppFunctionActivityState>, Exception> callback)
```

Retrieves the registered app functions for the specified activities.

Each `https://developer.android.com/reference/android/app/appfunctions/AppFunctionActivityState` contains the set of registered `https://developer.android.com/reference/android/app/appfunctions/AppFunctionName`s associated with a requested `https://developer.android.com/reference/android/app/appfunctions/AppFunctionActivityId`.

Functions that do not exist or are not visible to the calling application will be silently
omitted from the result. Requested activities that have no registered functions will be
omitted from the result.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionActivityId` for potential usages, including conversion from `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession.ActivityId`.

This method follows the same permission rules as `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)`.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` for retrieving the runtime state of app functions based
on their names.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)` on how to retrieve the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` of app
functions.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#observeAppFunctions(java.util.concurrent.Executor,%20android.app.appfunctions.AppFunctionObserver)` for observing changes to app functions' `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState`s.

<br />

| Parameters ||
|---|---|
| `activityIds` | `Set`: The set of activity IDs to retrieve function states for. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The executor to run the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `callback` | `OutcomeReceiver`: The callback to receive the list of activity states. This value cannot be `null`. <br /> |

**See also:**

- `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#getAppFunctionActivityId(android.service.voice.VoiceInteractionSession.ActivityId)`

### getAppFunctionStates

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void getAppFunctionStates (List<AppFunctionName> appFunctionNames, 
                Executor executor, 
                OutcomeReceiver<List<AppFunctionState>, Exception> callback)
```

Retrieves the runtime state of the specified app functions.

This includes runtime-changing properties such as whether the functions are currently
enabled or disabled. Functions that do not exist or are not visible to the calling
application will be silently omitted from the result list.

This method follows the same permission rules as `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)`.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionActivityStates(java.util.Set<android.app.appfunctions.AppFunctionActivityId>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionActivityState>,java.lang.Exception>)` for retrieving the states of app functions
associated with a specific activity.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)` on how to retrieve the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` of app
functions.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#observeAppFunctions(java.util.concurrent.Executor,%20android.app.appfunctions.AppFunctionObserver)` for observing changes to app functions' `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState`s.

<br />

| Parameters ||
|---|---|
| `appFunctionNames` | `List`: The names of the app functions to request the state for. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The executor to run the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `callback` | `OutcomeReceiver`: The callback to receive the function state result. This value cannot be `null`. <br /> |

### isAppFunctionEnabled

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void isAppFunctionEnabled (String functionIdentifier, 
                Executor executor, 
                OutcomeReceiver<Boolean, Exception> callback)
```

Retrieves whether an app function owned by the calling package is enabled (allows execution).

Same as `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#isAppFunctionEnabled(java.lang.String,%20java.lang.String,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Boolean,java.lang.Exception>)` but only
for checking functions owned by the calling package.

This is equivalent to calling `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` and checking the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState#isEnabled()` property of the result. Consider using `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` to get the full state of the app function.

<br />

| Parameters ||
|---|---|
| `functionIdentifier` | `String`: the identifier of the app function to check (unique within the target package). This value cannot be `null`. <br /> |
| `executor` | `Executor`: the executor to run the request. This value cannot be `null`. <br /> |
| `callback` | `OutcomeReceiver`: the callback to receive the function enabled check result. This value cannot be `null`. <br /> |

### isAppFunctionEnabled

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void isAppFunctionEnabled (String functionIdentifier, 
                String targetPackage, 
                Executor executor, 
                OutcomeReceiver<Boolean, Exception> callback)
```

Retrieves whether an app function is enabled (allows execution).

This is equivalent to calling `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` and checking the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState#isEnabled()` property of the result. Consider using `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` to get the full state of the app function.

If the operation fails, the callback's `https://developer.android.com/reference/android/os/OutcomeReceiver#onError(E)` is called with
errors:

- `https://developer.android.com/reference/java/lang/IllegalArgumentException`, if the function is not found or the caller does not have access to it.

<br />

<br />

| Parameters ||
|---|---|
| `functionIdentifier` | `String`: the identifier of the app function to check (unique within the target package). This value cannot be `null`. <br /> |
| `targetPackage` | `String`: the package name of the app function's owner. This value cannot be `null`. <br /> |
| `executor` | `Executor`: the executor to run the request. This value cannot be `null`. <br /> |
| `callback` | `OutcomeReceiver`: the callback to receive the function enabled check result. This value cannot be `null`. <br /> |

**See also:**

- `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState#isEnabled()`

### observeAppFunctions

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public AppFunctionObservation observeAppFunctions (Executor executor, 
                AppFunctionObserver appFunctionObserver)
```

Registers an observer to monitor changes to app functions within packages that the caller can
query.

The caller should retain a reference to the returned `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObservation`, and
call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObservation#cancel()` when observation is no longer required.

The callback is only triggered by changes after its registration. Any changes that occur
before the registration are not reported.

An example usage flow is:

1. Call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#observeAppFunctions(java.util.concurrent.Executor,%20android.app.appfunctions.AppFunctionObserver)`, to start monitoring app function changes, using the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver`.
2. Call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)` and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` to get the initial list of app functions and their states.
3. In `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver#onAppFunctionMetadataChanged(java.util.Set<java.lang.String>)`, call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>,java.lang.Exception>)` with a `https://developer.android.com/reference/android/app/appfunctions/AppFunctionSearchSpec` that matches the changed packages to get the updated metadata.
4. In `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver#onAppFunctionStatesChanged(java.util.Set<android.app.appfunctions.AppFunctionName>)`, call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` with the list of `https://developer.android.com/reference/android/app/appfunctions/AppFunctionName`s that matches the changed functions to get the updated states.

   Note that this is guaranteed to trigger after `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver#onAppFunctionMetadataChanged(java.util.Set<java.lang.String>)` for new functions or functions that
   also changed states, so there's no need to call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` in `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver#onAppFunctionMetadataChanged(java.util.Set<java.lang.String>)`.

<br />

<br />

| Parameters ||
|---|---|
| `executor` | `Executor`: the executor to run the `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObserver` callbacks. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `appFunctionObserver` | `AppFunctionObserver`: the observer to receive updates to registered app functions. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObservation` | An `https://developer.android.com/reference/android/app/appfunctions/AppFunctionObservation` used to cancel this observation. This value cannot be `null`. <br /> |

### registerAppFunction

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public AppFunctionRegistration registerAppFunction (String functionIdentifier, 
                Executor executor, 
                AppFunction appFunction)
```

Registers a runtime implementation for an app function, that can be executed using `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#executeAppFunction(android.app.AppInteractionSession,%20android.app.appfunctions.ExecuteAppFunctionRequest,%20java.util.concurrent.Executor,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)`.

`https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#executeAppFunction(android.app.AppInteractionSession,%20android.app.appfunctions.ExecuteAppFunctionRequest,%20java.util.concurrent.Executor,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)` targeting an app function provided by this method will trigger
the `https://developer.android.com/reference/android/app/appfunctions/AppFunction#onExecuteAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest,%20android.os.CancellationSignal,%20android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse,android.app.appfunctions.AppFunctionException>)` method of the provided implementation, as long
as the process registering it is not frozen, and the `https://developer.android.com/reference/android/content/Context` registering it is not
destroyed (at which point the registration will be removed).

You must declare the app function in your `AndroidManifest.xml` using an
application-level `<property>` named `android.app.appfunctions`. See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` for details on the XML schema (`your_app_functions.xml` in the
example below).

**Example manifest declaration:**

    <application ...>
      <property
          android:name="android.app.appfunctions"
          android:value="your_app_functions.xml" />
      ...
    </application>

Function implementations can only be registered from `https://developer.android.com/reference/android/app/Activity` or
`https://developer.android.com/reference/android/app/Service` contexts. If registering from an `https://developer.android.com/reference/android/app/Activity`,
strongly consider `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata#SCOPE_ACTIVITY` for your function definition.

The `functionIdentifier` must correspond to an app function declared in your app's
application-level XML assets. If the identifier is not found, this method will throw an
`https://developer.android.com/reference/java/lang/IllegalArgumentException`. Attempting to register a duplicate function based on the
rules of `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata#getScope()` will throw an `https://developer.android.com/reference/java/lang/IllegalStateException`.

To register multiple functions at once, consider using `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunctions(java.util.List<android.app.appfunctions.RegisterAppFunctionRequest>)` as a
more efficient alternative.

The system holds a strong reference to the provided `https://developer.android.com/reference/android/app/appfunctions/AppFunction` implementation as
long as it is registered. To prevent memory leaks and ensure the system is aware that the
function is no longer available, you must explicitly call `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration#unregister()` when the function is no longer relevant (e.g., in `https://developer.android.com/reference/android/app/Activity#onStop()` or before `https://developer.android.com/reference/android/app/Service#stopForeground(boolean)`).

<br />

| Parameters ||
|---|---|
| `functionIdentifier` | `String`: The unique identifier for the function, which must match an entry in the app's XML resource declarations. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The `https://developer.android.com/reference/java/util/concurrent/Executor` on which the function will be invoked. This value cannot be `null`. <br /> |
| `appFunction` | `AppFunction`: The `https://developer.android.com/reference/android/app/appfunctions/AppFunction` implementation to be executed when the function is triggered. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` | A `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` object that can be used to unregister the function. This value cannot be `null`. <br /> |

| Throws ||
|---|---|
| `https://developer.android.com/reference/java/lang/IllegalArgumentException` | if the provided `functionIdentifier` is not declared in the app's application-level XML resources or if an activity-scoped function is registered from a non-Activity context. |
| `https://developer.android.com/reference/java/lang/IllegalStateException` | if a duplicate function is already registered (see `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata#getScope()`), or if not called from `https://developer.android.com/reference/android/app/Activity` or `https://developer.android.com/reference/android/app/Service` contexts. |

### registerAppFunctions

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public AppFunctionRegistration registerAppFunctions (List<RegisterAppFunctionRequest> requests)
```

Registers several `https://developer.android.com/reference/android/app/appfunctions/AppFunction` implementations at once, sharing a single lifecycle.

This is a more efficient alternative to calling `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunction(java.lang.String,%20java.util.concurrent.Executor,%20android.app.appfunctions.AppFunction)` multiple
times.

### Behavior and Lifecycle

Each function registered through this method follows the same execution and lifecycle
rules as those registered with `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunction(java.lang.String,%20java.util.concurrent.Executor,%20android.app.appfunctions.AppFunction)`.

### Batch Operation and Atomicity

The registration is atomic: either all functions in the provided list are registered
successfully, or none are. If any function in the list fails validation (e.g., its is already
registered or not declared in the manifest), this method will throw an exception, and no
functions from the batch will be registered. Each function in the request follows the scoping
rules declared in the app's XML resources.

A single `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` object is returned, which can be used to
unregister the entire batch of functions with one call.

<br />

| Parameters ||
|---|---|
| `requests` | `List`: A list of `https://developer.android.com/reference/android/app/appfunctions/RegisterAppFunctionRequest` objects, each specifying a function to be registered. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` | A single `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration` object that can be used to unregister all the functions in the batch with one call. This value cannot be `null`. <br /> |

| Throws ||
|---|---|
| `https://developer.android.com/reference/java/lang/IllegalArgumentException` | if any `https://developer.android.com/reference/android/app/appfunctions/RegisterAppFunctionRequest#getFunctionIdentifier()` is not declared in the app's application-level XML assets or the `requests` list is empty. |
| `https://developer.android.com/reference/java/lang/IllegalStateException` | if any function in the `requests` list is already registered by this app. |

### searchAppFunctions

Added in [API level 37](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void searchAppFunctions (AppFunctionSearchSpec searchSpec, 
                Executor executor, 
                OutcomeReceiver<List<AppFunctionMetadata>, Exception> callback)
```

Searches app function `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata`s.

Note that the state is not guaranteed to be the latest, as metadata can change between
request and execute times when apps are updated.

The calling app can search for:

- Functions in its own package (no permission required).
- Functions in other packages that it is allowed to query via `https://developer.android.com/reference/android/content/pm/PackageManager#canPackageQuery(java.lang.String,%20java.lang.String)` when holding the `https://developer.android.com/reference/android/Manifest.permission#EXECUTE_APP_FUNCTIONS` permission.
- Functions in other packages that it is allowed to query via `https://developer.android.com/reference/android/content/pm/PackageManager#canPackageQuery(java.lang.String,%20java.lang.String)` when holding either the `android.permission.EXECUTE_APP_FUNCTIONS_SYSTEM` or `android.permission.DISCOVER_APP_FUNCTIONS` permission on API level 37 and above.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>,java.lang.Exception>)` and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#getAppFunctionActivityStates(java.util.Set<android.app.appfunctions.AppFunctionActivityId>,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionActivityState>,java.lang.Exception>)` on how to
retrieve the runtime state of app functions.

See `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#observeAppFunctions(java.util.concurrent.Executor,%20android.app.appfunctions.AppFunctionObserver)` for observing changes to app functions' `https://developer.android.com/reference/android/app/appfunctions/AppFunctionMetadata` and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionState`s.

<br />

| Parameters ||
|---|---|
| `searchSpec` | `AppFunctionSearchSpec`: The spec of app functions to search for. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The executor to run the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `callback` | `OutcomeReceiver`: The callback to receive the search results. This value cannot be `null`. <br /> |

### setAppFunctionEnabled

Added in [API level 36](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void setAppFunctionEnabled (String functionIdentifier, 
                int newEnabledState, 
                Executor executor, 
                OutcomeReceiver<Void, Exception> callback)
```

Sets the enabled state of the app function owned by the calling package.

**Important:** This method only applies to functions backed by an `https://developer.android.com/reference/android/app/appfunctions/AppFunctionService`. It cannot be used to modify the state of functions registered at
runtime. For runtime-registered app functions, use `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#registerAppFunction(java.lang.String,%20java.util.concurrent.Executor,%20android.app.appfunctions.AppFunction)` to register
them and `https://developer.android.com/reference/android/app/appfunctions/AppFunctionRegistration#unregister()` to unregister them instead.

<br />

| Parameters ||
|---|---|
| `functionIdentifier` | `String`: the identifier of the app function to enable (unique within the calling package). This value cannot be `null`. <br /> |
| `newEnabledState` | `int`: the new state of the app function. Value is one of the following: - `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_DEFAULT` - `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_ENABLED` - `https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager#APP_FUNCTION_STATE_DISABLED` |
| `executor` | `Executor`: the executor to run the callback. This value cannot be `null`. <br /> |
| `callback` | `OutcomeReceiver`: the callback to receive the result of the function enablement. Can return `https://developer.android.com/reference/java/lang/IllegalArgumentException` if the function is not found or the caller does not have access to it. This value cannot be `null`. <br /> |

| Throws ||
|---|---|
| `https://developer.android.com/reference/java/lang/IllegalArgumentException` | if the function is runtime-registered. |