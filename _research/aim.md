Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions) Summary: [Constants](https://developer.android.com/reference/android/app/AppInteractionManager#constants) \| [Methods](https://developer.android.com/reference/android/app/AppInteractionManager#pubmethods) \| [Inherited Methods](https://developer.android.com/reference/android/app/AppInteractionManager#inhmethods)

# AppInteractionManager

*** ** * ** ***


`
public

final

class
AppInteractionManager
`


`

extends https://developer.android.com/reference/java/lang/Object


`

`


`

|---|---|
| [java.lang.Object](https://developer.android.com/reference/java/lang/Object) ||
| ↳ | android.app.AppInteractionManager |

<br />

*** ** * ** ***

Provides access to App Interaction access control APIs.

## Summary

| ### Constants ||
|---|---|
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#ACTION_MANAGE_APP_INTERACTION_ACCESS` Activity action: Launches a UI that shows list of all interactors and provides management of App Interaction access of those interactors. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#ACTION_MANAGE_INTERACTOR_ACCESS` Activity action: Launches a UI that shows a list of all targets that the specified interactor package can access, and provides management of App Interaction access of those targets. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#ACTION_MANAGE_INTERACTOR_TARGET_ACCESS` Activity action: Launches a UI that provides management of App Interaction access of a specific interactor to a specific target. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#ACTION_MANAGE_TARGET_ACCESS` Activity action: Launches a UI that shows list of all interactors for a specific target and provides management of App Interaction access by those interactors. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_INTERACTOR_PACKAGE_NAME` Intent extra: A `https://developer.android.com/reference/java/lang/String` specifying the package name of the interactor when requesting or managing App Interaction access. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_TARGET_PACKAGE_NAME` Intent extra: A `String` specifying the target package name when managing App Interaction access. |

| ### Public methods ||
|---|---|
| ` void` | ` https://developer.android.com/reference/android/app/AppInteractionManager#createSession(android.app.AppInteractionSession.CreateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<android.app.AppInteractionSession,android.app.AppInteractionException>)(https://developer.android.com/reference/android/app/AppInteractionSession.CreateParams params, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/android/app/AppInteractionSession, https://developer.android.com/reference/android/app/AppInteractionException> callback) ` Creates an app interaction session for the given params. |

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

### ACTION_MANAGE_APP_INTERACTION_ACCESS

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ACTION_MANAGE_APP_INTERACTION_ACCESS
```

Activity action: Launches a UI that shows list of all interactors and provides management of
App Interaction access of those interactors.

Input: Nothing.

Output: Nothing.

<br />

Constant Value:

"android.app.action.MANAGE_APP_INTERACTION_ACCESS"


### ACTION_MANAGE_INTERACTOR_ACCESS

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ACTION_MANAGE_INTERACTOR_ACCESS
```

Activity action: Launches a UI that shows a list of all targets that the specified interactor
package can access, and provides management of App Interaction access of those targets.

Input: `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_INTERACTOR_PACKAGE_NAME` specifies the package whose access will be
managed by the launched UI.

Output: Nothing.

<br />

Constant Value:

"android.app.action.MANAGE_INTERACTOR_ACCESS"


### ACTION_MANAGE_INTERACTOR_TARGET_ACCESS

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ACTION_MANAGE_INTERACTOR_TARGET_ACCESS
```

Activity action: Launches a UI that provides management of App Interaction access of a
specific interactor to a specific target.

Input: `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_INTERACTOR_PACKAGE_NAME` specifies the interactor package name.

Input: `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_TARGET_PACKAGE_NAME` specifies the target package name.

Output: Nothing.

<br />

Constant Value:

"android.app.action.MANAGE_INTERACTOR_TARGET_ACCESS"


### ACTION_MANAGE_TARGET_ACCESS

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String ACTION_MANAGE_TARGET_ACCESS
```

Activity action: Launches a UI that shows list of all interactors for a specific target and
provides management of App Interaction access by those interactors.

Input: `https://developer.android.com/reference/android/app/AppInteractionManager#EXTRA_TARGET_PACKAGE_NAME` specifies the package whose access will be
managed by the launched UI.

Output: Nothing.

<br />

Constant Value:

"android.app.action.MANAGE_TARGET_ACCESS"


### EXTRA_INTERACTOR_PACKAGE_NAME

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String EXTRA_INTERACTOR_PACKAGE_NAME
```

Intent extra: A `https://developer.android.com/reference/java/lang/String` specifying the package name of the interactor when requesting
or managing App Interaction access.

<br />

Constant Value:

"android.app.extra.INTERACTOR_PACKAGE_NAME"


### EXTRA_TARGET_PACKAGE_NAME

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final String EXTRA_TARGET_PACKAGE_NAME
```

Intent extra: A `String` specifying the target package name when managing App
Interaction access.

<br />

Constant Value:

"android.app.extra.TARGET_PACKAGE_NAME"


## Public methods

### createSession

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void createSession (AppInteractionSession.CreateParams params, 
                Executor executor, 
                OutcomeReceiver<AppInteractionSession, AppInteractionException> callback)
```

Creates an app interaction session for the given params.

Example usage:

    AppInteractionSession.CreateParams createSessionParams =
        new AppInteractionSession.CreateParams.Builder()
            .setOnStartIntentSenderCallback(
                executor,
                intentSender -> {
                    // The callback will be invoked if the session creation requires user consent
                    try {
                        context.startIntentSender(intentSender, null, 0, 0, 0);
                    } catch (IntentSender.SendIntentException e) {
                        // Handle exception
                    }
                }
            )
            .setTargetPackages(Arrays.asList("com.example.target1"))
            .build();

    appInteractionManager.createSession(createSessionParams, executor, callback);

<br />

<br />

| Parameters ||
|---|---|
| `params` | `AppInteractionSession.CreateParams`: The params to create the session. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The executor to run the callback on. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `callback` | `OutcomeReceiver`: The callback to be called when the session is created or an error occurs. This value cannot be `null`. <br /> |