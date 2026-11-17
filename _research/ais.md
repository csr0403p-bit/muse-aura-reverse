Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions) Summary: [Nested Classes](https://developer.android.com/reference/android/app/AppInteractionSession#nestedclasses) \| [Constants](https://developer.android.com/reference/android/app/AppInteractionSession#constants) \| [Methods](https://developer.android.com/reference/android/app/AppInteractionSession#pubmethods) \| [Inherited Methods](https://developer.android.com/reference/android/app/AppInteractionSession#inhmethods)

# AppInteractionSession

*** ** * ** ***


`
public

final

class
AppInteractionSession
`


`

extends https://developer.android.com/reference/java/lang/Object


`

`


implements

https://developer.android.com/reference/java/lang/AutoCloseable


`

|---|---|
| [java.lang.Object](https://developer.android.com/reference/java/lang/Object) ||
| ↳ | android.app.AppInteractionSession |

<br />

*** ** * ** ***

Represents an app interaction session.

The session is used to associate app interactions with a continuous context. For example, a
session can be used to keep track of the user consent for the lifetime of the session. Developers
could use it to associate with relevant queries from users. For example, in a thread where a user
starts asking an agent to perform a task, developers could start a session and keep track of all
relevant actions within that session. So that if they need to access the same apps twice during
that thread, they don't need to ask permission twice.

The session will be automatically closed when reaching the maximum allowed lifetime. The
session owner will be notified of the close event via the `https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener#onAppInteractionSessionClosed(android.app.AppInteractionSession,%20int)` with `https://developer.android.com/reference/android/app/AppInteractionSession#CLOSE_REASON_TIMEOUT`.
**See also:**

- `https://developer.android.com/reference/android/app/AppInteractionManager#createSession(android.app.AppInteractionSession.CreateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<android.app.AppInteractionSession,android.app.AppInteractionException>)`

## Summary

| ### Nested classes ||
|---|---|
| ` class` | `https://developer.android.com/reference/android/app/AppInteractionSession.CreateParams` Parameters to create an `https://developer.android.com/reference/android/app/AppInteractionSession`, provided to `https://developer.android.com/reference/android/app/AppInteractionManager#createSession(android.app.AppInteractionSession.CreateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<android.app.AppInteractionSession,android.app.AppInteractionException>)`. |
| ` interface` | `https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener` Listener for session lifecycle events. |
| ` class` | `https://developer.android.com/reference/android/app/AppInteractionSession.UpdateParams` Parameters to update an `https://developer.android.com/reference/android/app/AppInteractionSession`, provided to `https://developer.android.com/reference/android/app/AppInteractionSession#update(android.app.AppInteractionSession.UpdateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,android.app.AppInteractionException>)`. |

| ### Constants ||
|---|---|
| `int` | `https://developer.android.com/reference/android/app/AppInteractionSession#CLOSE_REASON_CALLER_INITIATED` The session is closed due to the caller calling `https://developer.android.com/reference/android/app/AppInteractionSession#close()`. |
| `int` | `https://developer.android.com/reference/android/app/AppInteractionSession#CLOSE_REASON_TIMEOUT` The session is closed due to timeout. |
| `int` | `https://developer.android.com/reference/android/app/AppInteractionSession#CLOSE_REASON_UNKNOWN` Unknown reason for the session to be closed. |

| ### Public methods ||
|---|---|
| ` void` | ` https://developer.android.com/reference/android/app/AppInteractionSession#addLifecycleListener(java.util.concurrent.Executor,%20android.app.AppInteractionSession.LifecycleListener)(https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener listener) ` Adds a listener to receive session lifecycle events. |
| ` void` | ` https://developer.android.com/reference/android/app/AppInteractionSession#close()() ` Closes the session. |
| ` void` | ` https://developer.android.com/reference/android/app/AppInteractionSession#removeLifecycleListener(android.app.AppInteractionSession.LifecycleListener)(https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener listener) ` Removes a previously registered session lifecycle listener. |
| ` void` | ` https://developer.android.com/reference/android/app/AppInteractionSession#update(android.app.AppInteractionSession.UpdateParams,%20java.util.concurrent.Executor,%20android.os.OutcomeReceiver<java.lang.Void,android.app.AppInteractionException>)(https://developer.android.com/reference/android/app/AppInteractionSession.UpdateParams params, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/os/OutcomeReceiver<https://developer.android.com/reference/java/lang/Void, https://developer.android.com/reference/android/app/AppInteractionException> callback) ` Updates the session with the given `params`. |

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


From interface `

https://developer.android.com/reference/java/lang/AutoCloseable

` `
abstract


void` `
https://developer.android.com/reference/java/lang/AutoCloseable#close()()
`

Closes this resource, relinquishing any underlying resources.


## Constants

### CLOSE_REASON_CALLER_INITIATED

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final int CLOSE_REASON_CALLER_INITIATED
```

The session is closed due to the caller calling `https://developer.android.com/reference/android/app/AppInteractionSession#close()`.

<br />

Constant Value:

2
(0x00000002)


### CLOSE_REASON_TIMEOUT

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final int CLOSE_REASON_TIMEOUT
```

The session is closed due to timeout.

<br />

Constant Value:

1
(0x00000001)


### CLOSE_REASON_UNKNOWN

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public static final int CLOSE_REASON_UNKNOWN
```

Unknown reason for the session to be closed.

<br />

Constant Value:

0
(0x00000000)


## Public methods

### addLifecycleListener

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void addLifecycleListener (Executor executor, 
                AppInteractionSession.LifecycleListener listener)
```

Adds a listener to receive session lifecycle events.

<br />

| Parameters ||
|---|---|
| `executor` | `Executor`: The `https://developer.android.com/reference/java/util/concurrent/Executor` on which to invoke the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `listener` | `AppInteractionSession.LifecycleListener`: The `https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener` to receive lifecycle events. This value cannot be `null`. <br /> |

### close

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void close ()
```

Closes the session.

<br />

### removeLifecycleListener

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void removeLifecycleListener (AppInteractionSession.LifecycleListener listener)
```

Removes a previously registered session lifecycle listener.

<br />

| Parameters ||
|---|---|
| `listener` | `AppInteractionSession.LifecycleListener`: The `https://developer.android.com/reference/android/app/AppInteractionSession.LifecycleListener` that should no longer receive lifecycle events. This value cannot be `null`. <br /> |

### update

Added in [version 37.2](https://developer.android.com/topic/libraries/support-library/revisions)

```
public void update (AppInteractionSession.UpdateParams params, 
                Executor executor, 
                OutcomeReceiver<Void, AppInteractionException> callback)
```

Updates the session with the given `params`.

<br />

| Parameters ||
|---|---|
| `params` | `AppInteractionSession.UpdateParams`: The parameters to update the session with. This value cannot be `null`. <br /> |
| `executor` | `Executor`: The `https://developer.android.com/reference/java/util/concurrent/Executor` on which to invoke the callback. This value cannot be `null`. Callback and listener events are dispatched through this `https://developer.android.com/reference/java/util/concurrent/Executor`, providing an easy way to control which thread is used. To dispatch events through the main thread of your application, you can use `https://developer.android.com/reference/android/content/Context#getMainExecutor()`. Otherwise, provide an `https://developer.android.com/reference/java/util/concurrent/Executor` that dispatches to an appropriate thread. <br /> |
| `callback` | `OutcomeReceiver`: The `https://developer.android.com/reference/android/os/OutcomeReceiver` to receive the result of the update. This value cannot be `null`. <br /> |