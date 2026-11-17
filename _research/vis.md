Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels) Summary: [Constants](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#constants) \| [Inherited Constants](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#inhconstants) \| [Ctors](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#pubctors) \| [Methods](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#pubmethods) \| [Protected Methods](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#promethods) \| [Inherited Methods](https://developer.android.com/reference/android/service/voice/VoiceInteractionService#inhmethods)

# VoiceInteractionService

*** ** * ** ***


`
public


class
VoiceInteractionService
`


`


`

`


`

`


`

`

extends https://developer.android.com/reference/android/app/Service


`

`


`

|---|---|---|---|---|
| [java.lang.Object](https://developer.android.com/reference/java/lang/Object) |||||
| ↳ | [android.content.Context](https://developer.android.com/reference/android/content/Context) ||||
|   | ↳ | [android.content.ContextWrapper](https://developer.android.com/reference/android/content/ContextWrapper) |||
|   |   | ↳ | [android.app.Service](https://developer.android.com/reference/android/app/Service) ||
|   |   |   | ↳ | android.service.voice.VoiceInteractionService |

<br />

*** ** * ** ***

Top-level service of the current global voice interactor, which is providing
support for hotwording, the back-end of a `https://developer.android.com/reference/android/app/VoiceInteractor`, etc.
The current VoiceInteractionService that has been selected by the user is kept
always running by the system, to allow it to do things like listen for hotwords
in the background to instigate voice interactions.

Because this service is always running, it should be kept as lightweight as
possible. Heavy-weight operations (including showing UI) should be implemented
in the associated `https://developer.android.com/reference/android/service/voice/VoiceInteractionSessionService` when
an actual voice interaction is taking place, and that service should run in a
separate process from this one.

## Summary

| ### Constants ||
|---|---|
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#SERVICE_INTERFACE` The `https://developer.android.com/reference/android/content/Intent` that must be declared as handled by the service. |
| `https://developer.android.com/reference/java/lang/String` | `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#SERVICE_META_DATA` Name under which a VoiceInteractionService component publishes information about itself. |

### Inherited constants

From class `https://developer.android.com/reference/android/app/Service` `int` `https://developer.android.com/reference/android/app/Service#START_CONTINUATION_MASK`

Bits returned by `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)` describing how to continue
the service if it is killed.


`int` `https://developer.android.com/reference/android/app/Service#START_FLAG_REDELIVERY`

This flag is set in `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)` if the Intent is a
re-delivery of a previously delivered intent, because the service
had previously returned `https://developer.android.com/reference/android/app/Service#START_REDELIVER_INTENT` but had been
killed before calling `https://developer.android.com/reference/android/app/Service#stopSelf(int)` for that Intent.


`int` `https://developer.android.com/reference/android/app/Service#START_FLAG_RETRY`

This flag is set in `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)` if the Intent is a
retry because the original attempt never got to or returned from
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`.


`int` `https://developer.android.com/reference/android/app/Service#START_NOT_STICKY`

Constant to return from `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`: if this service's
process is killed while it is started (after returning from
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`), and there are no new start intents to
deliver to it, then take the service out of the started state and
don't recreate until a future explicit call to
`https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)`.


`int` `https://developer.android.com/reference/android/app/Service#START_REDELIVER_INTENT`

Constant to return from `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`: if this service's
process is killed while it is started (after returning from
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`), then it will be scheduled for a restart
and the last delivered Intent re-delivered to it again via
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`.


`int` `https://developer.android.com/reference/android/app/Service#START_STICKY`

Constant to return from `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`: if this service's
process is killed while it is started (after returning from
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`), then leave it in the started state but
don't retain this delivered intent.


`int` `https://developer.android.com/reference/android/app/Service#START_STICKY_COMPATIBILITY`

Constant to return from `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)`: compatibility
version of `https://developer.android.com/reference/android/app/Service#START_STICKY` that does not guarantee that
`https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)` will be called again after being killed.


`int` `https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_DETACH`

Selector for `https://developer.android.com/reference/android/app/Service#stopForeground(int)`: if set, the notification previously supplied
to `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)` will be detached from the service's lifecycle.


`int` `https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_LEGACY`

*This constant was deprecated
in API level 33.
Use `https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_DETACH` instead. The legacy
behavior was inconsistent, leading to bugs around unpredictable results.*


`int` `https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_REMOVE`

Selector for `https://developer.android.com/reference/android/app/Service#stopForeground(int)`: if supplied, the notification previously
supplied to `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)` will be cancelled and removed from display.


From class `https://developer.android.com/reference/android/content/Context` `https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ACCESSIBILITY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/accessibility/AccessibilityManager` for giving the user
feedback for UI events through the registered event listeners.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ACCOUNT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/accounts/AccountManager` for receiving intents at a
time of your choosing.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ACTIVITY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/ActivityManager` for interacting with the global
system state.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ADVANCED_PROTECTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/security/advancedprotection/AdvancedProtectionManager`


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ALARM_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/AlarmManager` for receiving intents at a
time of your choosing.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#APPWIDGET_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/appwidget/AppWidgetManager` for accessing AppWidgets.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#APP_FUNCTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/app/appfunctions/AppFunctionManager` for
executing app functions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#APP_INTERACTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/app/AppInteractionManager` for managing app interactions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#APP_OPS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/AppOpsManager` for tracking application operations
on the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#APP_SEARCH_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/app/appsearch/AppSearchManager` for
indexing and querying app data managed by the system.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#AUDIO_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/AudioManager` for handling management of volume,
ringer modes and audio routing.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#AUTHENTICATION_POLICY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an `https://developer.android.com/reference/android/security/authenticationpolicy/AuthenticationPolicyManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#AUTOFILL_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/view/autofill/AutofillManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#BATTERY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/BatteryManager` for managing battery state.


`int` `https://developer.android.com/reference/android/content/Context#BIND_ABOVE_CLIENT`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: indicates that the client application
binding to this service considers the service to be more important than
the app itself.


`int` `https://developer.android.com/reference/android/content/Context#BIND_ADJUST_WITH_ACTIVITY`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: If binding from an activity, allow the
target service's process importance to be raised based on whether the
activity is visible to the user, regardless whether another flag is
used to reduce the amount that the client process's overall importance
is used to impact it.


`int` `https://developer.android.com/reference/android/content/Context#BIND_ALLOW_ACTIVITY_STARTS`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: If binding from an app that is visible, the bound service is
allowed to start an activity from background.


`int` `https://developer.android.com/reference/android/content/Context#BIND_ALLOW_OOM_MANAGEMENT`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: allow the process hosting the bound
service to go through its normal memory management.


`int` `https://developer.android.com/reference/android/content/Context#BIND_AUTO_CREATE`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: automatically create the service as long
as the binding exists.


`int` `https://developer.android.com/reference/android/content/Context#BIND_DEBUG_UNBIND`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: include debugging help for mismatched
calls to unbind.


`int` `https://developer.android.com/reference/android/content/Context#BIND_EXTERNAL_SERVICE`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: The service being bound is an
`https://developer.android.com/reference/android/R.attr#isolatedProcess`,
`https://developer.android.com/reference/android/R.attr#externalService` service.


`long` `https://developer.android.com/reference/android/content/Context#BIND_EXTERNAL_SERVICE_LONG`

Works in the same way as `https://developer.android.com/reference/android/content/Context#BIND_EXTERNAL_SERVICE`, but it's defined as a `long`
value that is compatible to `https://developer.android.com/reference/android/content/Context.BindServiceFlags`.


`int` `https://developer.android.com/reference/android/content/Context#BIND_IMPORTANT`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: this service is very important to
the client, so should be brought to the foreground process level
when the client is.


`int` `https://developer.android.com/reference/android/content/Context#BIND_INCLUDE_CAPABILITIES`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: If binding from an app that has specific capabilities
due to its foreground state such as an activity or foreground service, then this flag will
allow the bound app to get the same capabilities, as long as it has the required permissions
as well.


`int` `https://developer.android.com/reference/android/content/Context#BIND_NOT_FOREGROUND`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: don't allow this binding to raise
the target service's process to the foreground scheduling priority.


`int` `https://developer.android.com/reference/android/content/Context#BIND_NOT_PERCEPTIBLE`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: If binding from an app that is visible or user-perceptible,
lower the target service's importance to below the perceptible level.


`int` `https://developer.android.com/reference/android/content/Context#BIND_PACKAGE_ISOLATED_PROCESS`

Flag for `https://developer.android.com/reference/android/content/Context#bindIsolatedService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: Bind the service into a shared isolated process,
but only with other isolated services from the same package that declare the same process
name.


`int` `https://developer.android.com/reference/android/content/Context#BIND_SHARED_ISOLATED_PROCESS`

Flag for `https://developer.android.com/reference/android/content/Context#bindIsolatedService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: Bind the service into a shared isolated process.


`int` `https://developer.android.com/reference/android/content/Context#BIND_WAIVE_PRIORITY`

Flag for `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`: don't impact the scheduling or
memory management priority of the target service's hosting process.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#BIOMETRIC_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/biometrics/BiometricManager` for handling
biometric and PIN/pattern/password authentication.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#BLOB_STORE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/blob/BlobStoreManager` for contributing and accessing data blobs
from the blob store maintained by the system.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#BLUETOOTH_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/bluetooth/BluetoothManager` for using Bluetooth.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#BUGREPORT_SERVICE`

Service to capture a bugreport.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CAMERA_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/camera2/CameraManager` for interacting with
camera devices.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CAPTIONING_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/accessibility/CaptioningManager` for obtaining
captioning properties and listening for changes in captioning
preferences.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CARRIER_CONFIG_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/CarrierConfigManager` for reading carrier configuration values.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CHOOSER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/service/chooser/ChooserManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CLIPBOARD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/ClipboardManager` for accessing and modifying
the contents of the global clipboard.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#COMPANION_DEVICE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/companion/CompanionDeviceManager` for managing companion devices


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CONNECTIVITY_DIAGNOSTICS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/ConnectivityDiagnosticsManager` for performing network connectivity diagnostics
as well as receiving network connectivity information from the system.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CONNECTIVITY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/ConnectivityManager` for handling management of
network connections.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CONSUMER_IR_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/ConsumerIrManager` for transmitting infrared
signals from the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CONTACT_KEYS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/provider/E2eeContactKeysManager` to managing contact keys.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CONTENT_RESTRICTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/contentsafety/ContentSafetyManager`.


`int` `https://developer.android.com/reference/android/content/Context#CONTEXT_IGNORE_SECURITY`

Flag for use with `https://developer.android.com/reference/android/content/Context#createPackageContext(java.lang.String,%20int)`: ignore any security
restrictions on the Context being requested, allowing it to always
be loaded.


`int` `https://developer.android.com/reference/android/content/Context#CONTEXT_INCLUDE_CODE`

Flag for use with `https://developer.android.com/reference/android/content/Context#createPackageContext(java.lang.String,%20int)`: include the application
code with the context.


`int` `https://developer.android.com/reference/android/content/Context#CONTEXT_RESTRICTED`

Flag for use with `https://developer.android.com/reference/android/content/Context#createPackageContext(java.lang.String,%20int)`: a restricted context may
disable specific features.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CREDENTIAL_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/credentials/CredentialManager` to authenticate a user to your app.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#CROSS_PROFILE_APPS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/pm/CrossProfileApps` for cross profile operations.


`int` `https://developer.android.com/reference/android/content/Context#DEVICE_ID_DEFAULT`

The default device ID, which is the ID of the primary (non-virtual) device.


`int` `https://developer.android.com/reference/android/content/Context#DEVICE_ID_INVALID`

Invalid device ID.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DEVICE_LOCK_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/devicelock/DeviceLockManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DEVICE_POLICY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/admin/DevicePolicyManager` for working with global
device policy management.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DISPLAY_HASH_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to access
`https://developer.android.com/reference/android/view/displayhash/DisplayHashManager` to handle display hashes.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DISPLAY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/display/DisplayManager` for interacting with display devices.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DOMAIN_VERIFICATION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to access
`https://developer.android.com/reference/android/content/pm/verify/domain/DomainVerificationManager` to retrieve approval and
user state for declared web domains.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DOWNLOAD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/DownloadManager` for requesting HTTP downloads.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#DROPBOX_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/DropBoxManager` instance for recording
diagnostic logs.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#EUICC_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/euicc/EuiccManager` to manage the device eUICC (embedded SIM).


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#FILE_INTEGRITY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/security/FileIntegrityManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#FILE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/storage/FileManager` for handling file operations.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#GAME_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/GameManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#GRAMMATICAL_INFLECTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/GrammaticalInflectionManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#HARDWARE_PROPERTIES_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/HardwarePropertiesManager` for accessing the hardware properties service.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#HEALTHCONNECT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/health/connect/HealthConnectManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#HID_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/hid/HidManager` for interacting with HID devices.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#INPUT_METHOD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/inputmethod/InputMethodManager` for accessing input
methods.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#INPUT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/hardware/input/InputManager` for interacting with input devices.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#IPSEC_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/net/IpSecManager` for encrypting Sockets or Networks with
IPSec.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#JOB_SCHEDULER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/job/JobScheduler` instance for managing occasional
background tasks.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#KEYCHAIN_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/security/KeyChainManager` for managing KeyChain certificates and grants.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#KEYGUARD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/KeyguardManager` for controlling keyguard.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#KEYSTORE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/security/keystore/KeyStoreManager` for accessing
[Android Keystore](https://developer.android.com/privacy-and-security/keystore)
functions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#LAUNCHER_APPS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/pm/LauncherApps` for querying and monitoring launchable apps across
profiles of a user.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#LAYOUT_INFLATER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/LayoutInflater` for inflating layout resources in this
context.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#LOCALE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/LocaleManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#LOCATION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/location/LocationManager` for controlling location
updates.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_COMMUNICATION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/MediaCommunicationManager`
for managing `https://developer.android.com/reference/android/media/MediaSession2`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_METRICS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/metrics/MediaMetricsManager` for interacting with media metrics
on the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_PROJECTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/media/projection/MediaProjectionManager` instance for managing
media projection sessions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_QUALITY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/quality/MediaQualityManager` for standardize picture
and audio API parameters.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_ROUTER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.Class<T>)` to retrieve a
`https://developer.android.com/reference/android/media/MediaRouter` for controlling and managing
routing of media.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEDIA_SESSION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/session/MediaSessionManager` for managing media Sessions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MEMORY_BUDGET_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/MemoryBudgetManager` for monitoring memory budgets.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MIDI_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/midi/MidiManager` for accessing the MIDI service.


`int` `https://developer.android.com/reference/android/content/Context#MODE_APPEND`

File creation mode: for use with `https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)`, if the file
already exists then write data to the end of the existing file
instead of erasing it.


`int` `https://developer.android.com/reference/android/content/Context#MODE_ENABLE_WRITE_AHEAD_LOGGING`

Database open flag: when set, the database is opened with write-ahead
logging enabled by default.


`int` `https://developer.android.com/reference/android/content/Context#MODE_MULTI_PROCESS`

*This constant was deprecated
in API level 23.
MODE_MULTI_PROCESS does not work reliably in
some versions of Android, and furthermore does not provide any
mechanism for reconciling concurrent modifications across
processes. Applications should not attempt to use it. Instead,
they should use an explicit cross-process data management
approach such as `https://developer.android.com/reference/android/content/ContentProvider`.*


`int` `https://developer.android.com/reference/android/content/Context#MODE_NO_LOCALIZED_COLLATORS`

Database open flag: when set, the database is opened without support for
localized collators.


`int` `https://developer.android.com/reference/android/content/Context#MODE_PRIVATE`

File creation mode: the default mode, where the created file can only
be accessed by the calling application (or all applications sharing the
same user ID).


`int` `https://developer.android.com/reference/android/content/Context#MODE_WORLD_READABLE`

*This constant was deprecated
in API level 17.
Creating world-readable files is very dangerous, and likely
to cause security holes in applications. It is strongly
discouraged; instead, applications should use more formal
mechanism for interactions such as `https://developer.android.com/reference/android/content/ContentProvider`,
`https://developer.android.com/reference/android/content/BroadcastReceiver`, and `https://developer.android.com/reference/android/app/Service`.
There are no guarantees that this access mode will remain on
a file, such as when it goes through a backup and restore.*


`int` `https://developer.android.com/reference/android/content/Context#MODE_WORLD_WRITEABLE`

*This constant was deprecated
in API level 17.
Creating world-writable files is very dangerous, and likely
to cause security holes in applications. It is strongly
discouraged; instead, applications should use more formal
mechanism for interactions such as `https://developer.android.com/reference/android/content/ContentProvider`,
`https://developer.android.com/reference/android/content/BroadcastReceiver`, and `https://developer.android.com/reference/android/app/Service`.
There are no guarantees that this access mode will remain on
a file, such as when it goes through a backup and restore.*


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#MULTISENSORY_MANAGER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve the service that plays multisensory
feedback.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#NETWORK_STATS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/usage/NetworkStatsManager` for querying network usage stats.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#NFC_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/nfc/NfcManager` for using NFC.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#NOTIFICATION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/NotificationManager` for informing the user of
background events.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#NPU_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#NSD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/nsd/NsdManager` for handling management of network service
discovery


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#OVERLAY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/content/om/OverlayManager` for managing overlay packages.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PCC_SANDBOX_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/privatecompute/PccSandboxManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PEOPLE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to access a `https://developer.android.com/reference/android/app/people/PeopleManager` to interact
with your published conversations.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PERFORMANCE_HINT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/PerformanceHintManager` for accessing the performance hinting service.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PERSISTENT_DATA_BLOCK_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/service/persistentdata/PersistentDataBlockManager` instance
for interacting with a storage device that lives across factory resets.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#POWER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/PowerManager` for controlling power management,
including "wake locks," which let you keep the device on while
you're running long tasks.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PRINT_SERVICE`

`https://developer.android.com/reference/android/print/PrintManager` for printing and managing
printers and print tasks.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#PROFILING_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/os/ProfilingManager`.


`int` `https://developer.android.com/reference/android/content/Context#RECEIVER_EXPORTED`

Flag for `https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter)`: The receiver can receive broadcasts from other Apps.


`int` `https://developer.android.com/reference/android/content/Context#RECEIVER_NOT_EXPORTED`

Flag for `https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter)`: The receiver cannot receive broadcasts from other Apps.


`int` `https://developer.android.com/reference/android/content/Context#RECEIVER_VISIBLE_TO_INSTANT_APPS`

Flag for `https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter)`: The receiver can receive broadcasts from Instant Apps.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#RESTRICTIONS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/RestrictionsManager` for retrieving application restrictions
and requesting permissions for restricted operations.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#ROLE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/role/RoleManager`
for managing roles.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SATELLITE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/satellite/SatelliteManager` for accessing satellite functionality.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SEARCH_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/SearchManager` for handling searches.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SECURITY_STATE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/SecurityStateManager` for accessing the security state manager service.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SENSOR_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/hardware/SensorManager` for accessing sensors.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SERIAL_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/hardware/serial/SerialManager` for access to serial ports.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SHORTCUT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/pm/ShortcutManager` for accessing the launcher shortcut service.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#STATUS_BAR_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/StatusBarManager` for interacting with the status bar and quick settings.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#STORAGE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/os/storage/StorageManager` for accessing system storage
functions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#STORAGE_STATS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/usage/StorageStatsManager` for accessing system storage
statistics.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#SYSTEM_HEALTH_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/health/SystemHealthManager` for accessing system health (battery, power,
memory, etc) metrics.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TELECOM_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telecom/TelecomManager` to manage telecom-related features
of the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TELEPHONY_IMS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve an
`https://developer.android.com/reference/android/telephony/ims/ImsManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TELEPHONY_PHONE_NUMBER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/PhoneNumberManager` for parsing phone numbers.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TELEPHONY_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/TelephonyManager` for handling management the
telephony features of the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TELEPHONY_SUBSCRIPTION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/telephony/SubscriptionManager` for handling management the
telephony subscriptions of the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TETHERING_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/TetheringManager`
for managing tethering functions.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TEXT_CLASSIFICATION_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/textclassifier/TextClassificationManager` for text classification services.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TEXT_SERVICES_MANAGER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/textservice/TextServicesManager` for accessing
text services.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TIME_MANAGER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/time/TimeManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TV_AD_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/tv/ad/TvAdManager` for interacting with TV client-side advertisement
services on the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TV_INPUT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/tv/TvInputManager` for interacting with TV inputs
on the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#TV_INTERACTIVE_APP_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/media/tv/interactive/TvInteractiveAppManager` for interacting with TV
interactive applications on the device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#UI_MODE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/app/UiModeManager` for controlling UI modes.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#USAGE_STATS_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/app/usage/UsageStatsManager` for querying device usage stats.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#USB_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/hardware/usb/UsbManager` for access to USB devices (as a USB host)
and for controlling this device's behavior as a USB device.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#USER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/os/UserManager` for managing users on devices that support multiple users.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#VIBRATOR_MANAGER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/os/VibratorManager`
for accessing the device vibrators, interacting with individual ones and playing synchronized
effects on multiple vibrators.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#VIBRATOR_SERVICE`

*This constant was deprecated
in API level 31.
Use `https://developer.android.com/reference/android/os/VibratorManager` to retrieve the default system vibrator.*


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#VIRTUAL_DEVICE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/companion/virtual/VirtualDeviceManager` for managing virtual devices.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#VPN_MANAGEMENT_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/VpnManager` to
manage profiles for the platform built-in VPN.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WALLPAPER_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
com.android.server.WallpaperService for accessing wallpapers.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WEB_APP_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/content/pm/webapp/WebAppManager`.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WIFI_AWARE_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/net/wifi/aware/WifiAwareManager` for handling management of
Wi-Fi Aware.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WIFI_P2P_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/wifi/p2p/WifiP2pManager` for handling management of
Wi-Fi peer-to-peer connections.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WIFI_RTT_RANGING_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/wifi/rtt/WifiRttManager` for ranging devices with wifi.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WIFI_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a `https://developer.android.com/reference/android/net/wifi/WifiManager` for handling management of
Wi-Fi access.


`https://developer.android.com/reference/java/lang/String` `https://developer.android.com/reference/android/content/Context#WINDOW_SERVICE`

Use with `https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)` to retrieve a
`https://developer.android.com/reference/android/view/WindowManager` for accessing the system's window
manager.


From interface `https://developer.android.com/reference/android/content/ComponentCallbacks2` `int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_BACKGROUND`

Level for `https://developer.android.com/reference/android/content/ComponentCallbacks2#onTrimMemory(int)`: the process has gone on to the
LRU list.


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_COMPLETE`

*This constant was deprecated
in API level 35.
Apps are not notified of this level since API level 34*


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_MODERATE`

*This constant was deprecated
in API level 35.
Apps are not notified of this level since API level 34*


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_RUNNING_CRITICAL`

*This constant was deprecated
in API level 35.
Apps are not notified of this level since API level 34*


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_RUNNING_LOW`

*This constant was deprecated
in API level 35.
Apps are not notified of this level since API level 34*


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_RUNNING_MODERATE`

*This constant was deprecated
in API level 35.
Apps are not notified of this level since API level 34*


`int` `https://developer.android.com/reference/android/content/ComponentCallbacks2#TRIM_MEMORY_UI_HIDDEN`

Level for `https://developer.android.com/reference/android/content/ComponentCallbacks2#onTrimMemory(int)`: the process had been showing
a user interface, and is no longer doing so.


| ### Public constructors ||
|---|---|
| ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#VoiceInteractionService()() ` |

| ### Public methods ||
|---|---|
| ` int` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#getDisabledShowContext()() ` Return the value set by `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#setDisabledShowContext(int)`. |
| ` static boolean` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#isActiveService(android.content.Context,%20android.content.ComponentName)(https://developer.android.com/reference/android/content/Context context, https://developer.android.com/reference/android/content/ComponentName service) ` Check whether the given service component is the currently active VoiceInteractionService. |
| ` https://developer.android.com/reference/android/os/IBinder` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onBind(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent) ` Return the communication channel to the service. |
| ` https://developer.android.com/reference/java/util/Set<https://developer.android.com/reference/java/lang/String>` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onGetSupportedVoiceActions(java.util.Set<java.lang.String>)(https://developer.android.com/reference/java/util/Set<https://developer.android.com/reference/java/lang/String> voiceActions) ` Request to query for what extended voice actions this service supports. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onLaunchVoiceAssistFromKeyguard()() ` Called when a user has activated an affordance to launch voice assist from the Keyguard. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onPrepareToShowSession(android.os.Bundle,%20int)(https://developer.android.com/reference/android/os/Bundle args, int flags) ` Notify the interactor when the system prepares to show session. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onReady()() ` Called during service initialization to tell you when the system is ready to receive interaction from it. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onShowSessionFailed(android.os.Bundle)(https://developer.android.com/reference/android/os/Bundle args) ` Called when the show session failed. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onShutdown()() ` Called during service de-initialization to tell you when the system is shutting the service down. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#setDisabledShowContext(int)(int flags) ` Set contextual options you would always like to have disabled when a session is shown. |
| ` final void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#setInvocationEffectEnabled(boolean)(boolean enabled) ` Sets the enabled state for the invocation effect, a graphical indication displayed when a voice session is launched by the system. |
| ` final void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#setUiHints(android.os.Bundle)(https://developer.android.com/reference/android/os/Bundle hints) ` Provide hints to be reflected in the system UI. |
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)(https://developer.android.com/reference/android/os/Bundle args, int flags) ` Request that the associated `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession` be shown to the user, starting it if necessary. |

| ### Protected methods ||
|---|---|
| ` void` | ` https://developer.android.com/reference/android/service/voice/VoiceInteractionService#dump(java.io.FileDescriptor,%20java.io.PrintWriter,%20java.lang.String[])(https://developer.android.com/reference/java/io/FileDescriptor fd, https://developer.android.com/reference/java/io/PrintWriter pw, https://developer.android.com/reference/java/lang/String args) ` Print the Service's state into the given stream. |

### Inherited methods

From class `

https://developer.android.com/reference/android/app/Service

` `


void` `
https://developer.android.com/reference/android/app/Service#attachBaseContext(android.content.Context)(https://developer.android.com/reference/android/content/Context newBase)
`

Set the base context for this ContextWrapper.


`


void` `
https://developer.android.com/reference/android/app/Service#dump(java.io.FileDescriptor,%20java.io.PrintWriter,%20java.lang.String[])(https://developer.android.com/reference/java/io/FileDescriptor fd, https://developer.android.com/reference/java/io/PrintWriter writer, https://developer.android.com/reference/java/lang/String args)
`

Print the Service's state into the given stream.


`


final

https://developer.android.com/reference/android/app/Application` `
https://developer.android.com/reference/android/app/Service#getApplication()()
`

Return the application that owns this service.


`


final

int` `
https://developer.android.com/reference/android/app/Service#getForegroundServiceType()()
`

If the service has become a foreground service by calling
`https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)`
or `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification,%20int)`, `https://developer.android.com/reference/android/app/Service#getForegroundServiceType()`
returns the current foreground service type.


`
abstract


https://developer.android.com/reference/android/os/IBinder` `
https://developer.android.com/reference/android/app/Service#onBind(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Return the communication channel to the service.


`


void` `
https://developer.android.com/reference/android/app/Service#onConfigurationChanged(android.content.res.Configuration)(https://developer.android.com/reference/android/content/res/Configuration newConfig)
`

Called by the system when the device configuration changes while your
component is running.


`


void` `
https://developer.android.com/reference/android/app/Service#onCreate()()
`

Called by the system when the service is first created.


`


void` `
https://developer.android.com/reference/android/app/Service#onDestroy()()
`

Called by the system to notify a Service that it is no longer used and is being removed.


`


void` `
https://developer.android.com/reference/android/app/Service#onLowMemory()()
`

This is called when the overall system is running low on memory, and
actively running processes should trim their memory usage.


`


void` `
https://developer.android.com/reference/android/app/Service#onRebind(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Called when new clients have connected to the service, after it had
previously been notified that all had disconnected in its
`https://developer.android.com/reference/android/app/Service#onUnbind(android.content.Intent)`.


`


void` `
https://developer.android.com/reference/android/app/Service#onStart(android.content.Intent,%20int)(https://developer.android.com/reference/android/content/Intent intent, int startId)
`

*This method was deprecated
in API level 15.
Implement `https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)` instead.*


`


int` `
https://developer.android.com/reference/android/app/Service#onStartCommand(android.content.Intent,%20int,%20int)(https://developer.android.com/reference/android/content/Intent intent, int flags, int startId)
`

Called by the system every time a client explicitly starts the service by calling
`https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)`, providing the arguments it supplied and a
unique integer token representing the start request.


`


void` `
https://developer.android.com/reference/android/app/Service#onTaskRemoved(android.content.Intent)(https://developer.android.com/reference/android/content/Intent rootIntent)
`

This is called if the service is currently running and the user has
removed a task that comes from the service's application.


`


void` `
https://developer.android.com/reference/android/app/Service#onTimeout(int,%20int)(int startId, int fgsType)
`

Callback called when a particular foreground service type has timed out.


`


void` `
https://developer.android.com/reference/android/app/Service#onTimeout(int)(int startId)
`

Callback called on timeout for `https://developer.android.com/reference/android/content/pm/ServiceInfo#FOREGROUND_SERVICE_TYPE_SHORT_SERVICE`.


`


void` `
https://developer.android.com/reference/android/app/Service#onTrimMemory(int)(int level)
`

Called when the operating system has determined that it is a good
time for a process to trim unneeded memory from its process.


`


boolean` `
https://developer.android.com/reference/android/app/Service#onUnbind(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Called when all clients have disconnected from a particular interface
published by the service.


`


final

void` `
https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)(int id, https://developer.android.com/reference/android/app/Notification notification)
`

If your service is started (running through `https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)`), then
also make this service run in the foreground, supplying the ongoing
notification to be shown to the user while in this state.


`


final

void` `
https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification,%20int)(int id, https://developer.android.com/reference/android/app/Notification notification, int foregroundServiceType)
`

An overloaded version of `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)` with additional
foregroundServiceType parameter.


`


final

void` `
https://developer.android.com/reference/android/app/Service#stopForeground(int)(int notificationBehavior)
`

Remove this service from foreground state, allowing it to be killed if
more memory is needed.


`


final

void` `
https://developer.android.com/reference/android/app/Service#stopForeground(boolean)(boolean removeNotification)
`

*This method was deprecated
in API level 33.
call `https://developer.android.com/reference/android/app/Service#stopForeground(int)` and pass either
`https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_REMOVE` or `https://developer.android.com/reference/android/app/Service#STOP_FOREGROUND_DETACH`
explicitly instead.*


`


final

void` `
https://developer.android.com/reference/android/app/Service#stopSelf()()
`

Stop the service, if it was previously started.


`


final

void` `
https://developer.android.com/reference/android/app/Service#stopSelf(int)(int startId)
`

Old version of `https://developer.android.com/reference/android/app/Service#stopSelfResult(int)` that doesn't return a result.


`


final

boolean` `
https://developer.android.com/reference/android/app/Service#stopSelfResult(int)(int startId)
`

Stop the service if the most recent time it was started was
<var translate="no">startId</var>.


From class `

https://developer.android.com/reference/android/content/ContextWrapper

` `


void` `
https://developer.android.com/reference/android/content/ContextWrapper#attachBaseContext(android.content.Context)(https://developer.android.com/reference/android/content/Context base)
`

Set the base context for this ContextWrapper.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindIsolatedService(android.content.Intent,%20int,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, int flags, https://developer.android.com/reference/java/lang/String instanceName, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Variation of `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)` that, in the specific case of isolated
services, allows the caller to generate multiple instances of a service
from a single component declaration.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindService(android.content.Intent,%20int,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, int flags, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Same as `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)` with executor to control ServiceConnection
callbacks.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindService(android.content.Intent,%20android.content.ServiceConnection,%20android.content.Context.BindServiceFlags)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags)
`

See `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, int flags)
`

Connects to an application service, creating it if needed.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

See `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20int,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20int,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, int flags, https://developer.android.com/reference/android/os/UserHandle user)
`

Binds to a service in the given `user` in the same manner as `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20android.content.Context.BindServiceFlags,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags, https://developer.android.com/reference/android/os/UserHandle user)
`

See `https://developer.android.com/reference/android/content/Context#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20int,%20android.os.UserHandle)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingOrSelfPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether the calling process of an IPC *or you* have been
granted a particular permission.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingOrSelfUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Determine whether the calling process of an IPC *or you* has been granted
permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingOrSelfUriPermissions(java.util.List<android.net.Uri>,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int modeFlags)
`

Determine whether the calling process of an IPC *or you* has been granted
permission to access a list of URIs.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether the calling process of an IPC you are handling has been
granted a particular permission.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Determine whether the calling process and uid has been
granted permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/ContextWrapper#checkCallingUriPermissions(java.util.List<android.net.Uri>,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int modeFlags)
`

Determine whether the calling process and uid has been
granted permission to access a list of URIs.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkContentUriPermissionFull(android.net.Uri,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a specific content URI.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkPermission(java.lang.String,%20int,%20int)(https://developer.android.com/reference/java/lang/String permission, int pid, int uid)
`

Determine whether the given permission is allowed for a particular process and user ID
running in the system.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkSelfPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether *you* have been granted a particular permission.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkUriPermission(android.net.Uri,%20java.lang.String,%20java.lang.String,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, https://developer.android.com/reference/java/lang/String readPermission, https://developer.android.com/reference/java/lang/String writePermission, int pid, int uid, int modeFlags)
`

Check both a Uri and normal permission.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#checkUriPermission(android.net.Uri,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/ContextWrapper#checkUriPermissions(java.util.List<android.net.Uri>,%20int,%20int,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a list of URIs.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#clearWallpaper()()
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#clear()` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createAttributionContext(java.lang.String)(https://developer.android.com/reference/java/lang/String attributionTag)
`

Return a new Context object for the current Context but attribute to a different tag.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createConfigurationContext(android.content.res.Configuration)(https://developer.android.com/reference/android/content/res/Configuration overrideConfiguration)
`

Return a new Context object for the current Context but whose resources
are adjusted to match the given Configuration.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createContext(android.content.ContextParams)(https://developer.android.com/reference/android/content/ContextParams contextParams)
`

Creates a context with specific properties and behaviors.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createContextForSplit(java.lang.String)(https://developer.android.com/reference/java/lang/String splitName)
`

Return a new Context object for the given split name.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createDeviceContext(int)(int deviceId)
`

Returns a new `Context` object from the current context but with device association
given by the `deviceId`.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createDeviceProtectedStorageContext()()
`

Return a new Context object for the current Context but whose storage
APIs are backed by device-protected storage.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createDisplayContext(android.view.Display)(https://developer.android.com/reference/android/view/Display display)
`

Returns a new `Context` object from the current context but with resources
adjusted to match the metrics of `display`.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createPackageContext(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String packageName, int flags)
`

Return a new Context object for the given application name.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createWindowContext(int,%20android.os.Bundle)(int type, https://developer.android.com/reference/android/os/Bundle options)
`

Creates a Context for a non-activity window.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#createWindowContext(android.view.Display,%20int,%20android.os.Bundle)(https://developer.android.com/reference/android/view/Display display, int type, https://developer.android.com/reference/android/os/Bundle options)
`

Creates a `Context` for a non-`https://developer.android.com/reference/android/app/Activity` window on the given
`https://developer.android.com/reference/android/view/Display`.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#databaseList()()
`

Returns an array of strings naming the private databases associated with
this Context's application package.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#deleteDatabase(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete an existing private SQLiteDatabase associated with this Context's
application package.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#deleteFile(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete the given private file associated with this Context's
application package.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#deleteSharedPreferences(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete an existing shared preferences file.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceCallingOrSelfPermission(java.lang.String,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, https://developer.android.com/reference/java/lang/String message)
`

If neither you nor the calling process of an IPC you are
handling has been granted a particular permission, throw a
`https://developer.android.com/reference/java/lang/SecurityException`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceCallingOrSelfUriPermission(android.net.Uri,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If the calling process of an IPC *or you* has not been
granted permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceCallingPermission(java.lang.String,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, https://developer.android.com/reference/java/lang/String message)
`

If the calling process of an IPC you are handling has not been
granted a particular permission, throw a `https://developer.android.com/reference/java/lang/SecurityException`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceCallingUriPermission(android.net.Uri,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If the calling process and uid has not been granted
permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforcePermission(java.lang.String,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, int pid, int uid, https://developer.android.com/reference/java/lang/String message)
`

If the given permission is not allowed for a particular process
and user ID running in the system, throw a `https://developer.android.com/reference/java/lang/SecurityException`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceUriPermission(android.net.Uri,%20java.lang.String,%20java.lang.String,%20int,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, https://developer.android.com/reference/java/lang/String readPermission, https://developer.android.com/reference/java/lang/String writePermission, int pid, int uid, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

Enforce both a Uri and normal permission.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#enforceUriPermission(android.net.Uri,%20int,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If a particular process and uid has not been granted
permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#fileList()()
`

Returns an array of strings naming the private files associated with
this Context's application package.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#getApplicationContext()()
`

Return the context of the single, global Application object of the
current process.


`


https://developer.android.com/reference/android/content/pm/ApplicationInfo` `
https://developer.android.com/reference/android/content/ContextWrapper#getApplicationInfo()()
`

Return the full application info for this context's package.


`


https://developer.android.com/reference/android/content/res/AssetManager` `
https://developer.android.com/reference/android/content/ContextWrapper#getAssets()()
`

Returns an AssetManager instance for the application's package.


`


https://developer.android.com/reference/android/content/AttributionSource` `
https://developer.android.com/reference/android/content/ContextWrapper#getAttributionSource()()
`


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getAttributionTag()()
`

<br />

Attribution can be used in complex apps to logically separate parts of the app.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/ContextWrapper#getBaseContext()()
` `


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getCacheDir()()
`

Returns the absolute path to the application specific cache directory on
the filesystem.


`


https://developer.android.com/reference/java/lang/ClassLoader` `
https://developer.android.com/reference/android/content/ContextWrapper#getClassLoader()()
`

Return a class loader you can use to retrieve classes in this package.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getCodeCacheDir()()
`

Returns the absolute path to the application specific cache directory on
the filesystem designed for storing cached code.


`


https://developer.android.com/reference/android/content/ContentResolver` `
https://developer.android.com/reference/android/content/ContextWrapper#getContentResolver()()
`

Return a ContentResolver instance for your application's package.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getDataDir()()
`

Returns the absolute path to the directory on the filesystem where all
private files belonging to this app are stored.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getDatabasePath(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Returns the absolute path on the filesystem where a database created with
`https://developer.android.com/reference/android/content/Context#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory)` is stored.


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#getDeviceId()()
`

Gets the device ID this context is associated with.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getDir(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Retrieve, creating if needed, a new directory in which the application
can place its own custom data files.


`


https://developer.android.com/reference/android/view/Display` `
https://developer.android.com/reference/android/content/ContextWrapper#getDisplay()()
`

Get the display this context is associated with.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getExternalCacheDir()()
`

Returns absolute path to application-specific directory on the primary
shared/external storage device where the application can place cache
files it owns.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getExternalCacheDirs()()
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application can place cache
files it owns.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getExternalFilesDir(java.lang.String)(https://developer.android.com/reference/java/lang/String type)
`

Returns the absolute path to the directory on the primary shared/external
storage device where the application can place persistent files it owns.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getExternalFilesDirs(java.lang.String)(https://developer.android.com/reference/java/lang/String type)
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application can place
persistent files it owns.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getExternalMediaDirs()()
`

*This method is deprecated.
These directories still exist and are scanned, but developers
are encouraged to migrate to inserting content into a
`https://developer.android.com/reference/android/provider/MediaStore` collection directly, as any app can
contribute new media to `https://developer.android.com/reference/android/provider/MediaStore` with no
permissions required, starting in
`https://developer.android.com/reference/android/os/Build.VERSION_CODES#Q`.*


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getFileStreamPath(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Returns the absolute path on the filesystem where a file created with
`https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)` is stored.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getFilesDir()()
`

Returns the absolute path to the directory on the filesystem where files
created with `https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)` are stored.


`


https://developer.android.com/reference/java/util/concurrent/Executor` `
https://developer.android.com/reference/android/content/ContextWrapper#getMainExecutor()()
`

Return an `https://developer.android.com/reference/java/util/concurrent/Executor` that will run enqueued tasks on the main
thread associated with this context.


`


https://developer.android.com/reference/android/os/Looper` `
https://developer.android.com/reference/android/content/ContextWrapper#getMainLooper()()
`

Return the Looper for the main thread of the current process.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getNoBackupFilesDir()()
`

Returns the absolute path to the directory on the filesystem similar to
`https://developer.android.com/reference/android/content/Context#getFilesDir()`.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getObbDir()()
`

Return the primary shared/external storage directory where this
application's OBB files (if there are any) can be found.


`


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/ContextWrapper#getObbDirs()()
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application's OBB files (if
there are any) can be found.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getOpPackageName()()
`

Return the package name that should be used for `https://developer.android.com/reference/android/app/AppOpsManager` calls from
this context, so that app ops manager's uid verification will work with the name.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getPackageCodePath()()
`

Return the full path to this context's primary Android package.


`


https://developer.android.com/reference/android/content/pm/PackageManager` `
https://developer.android.com/reference/android/content/ContextWrapper#getPackageManager()()
`

Return PackageManager instance to find global package information.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getPackageName()()
`

Return the name of this application's package.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getPackageResourcePath()()
`

Return the full path to this context's primary Android package.


`


https://developer.android.com/reference/android/content/ContextParams` `
https://developer.android.com/reference/android/content/ContextWrapper#getParams()()
`

Return the set of parameters which this Context was created with, if it
was created via `https://developer.android.com/reference/android/content/Context#createContext(android.content.ContextParams)`.


`


https://developer.android.com/reference/android/content/res/Resources` `
https://developer.android.com/reference/android/content/ContextWrapper#getResources()()
`

Returns a Resources instance for the application's package.


`


https://developer.android.com/reference/android/content/SharedPreferences` `
https://developer.android.com/reference/android/content/ContextWrapper#getSharedPreferences(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Retrieve and hold the contents of the preferences file 'name', returning
a SharedPreferences through which you can retrieve and modify its
values.


`


https://developer.android.com/reference/java/lang/Object` `
https://developer.android.com/reference/android/content/ContextWrapper#getSystemService(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Return the handle to a system-level service by name.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/ContextWrapper#getSystemServiceName(java.lang.Class<?>)(https://developer.android.com/reference/java/lang/Class<?> serviceClass)
`

Gets the name of the system-level service that is represented by the specified class.


`


https://developer.android.com/reference/android/content/res/Resources.Theme` `
https://developer.android.com/reference/android/content/ContextWrapper#getTheme()()
`

Return the Theme object associated with this Context.


`


https://developer.android.com/reference/android/graphics/drawable/Drawable` `
https://developer.android.com/reference/android/content/ContextWrapper#getWallpaper()()
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDrawable()` instead.*


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#getWallpaperDesiredMinimumHeight()()
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDesiredMinimumHeight()` instead.*


`


int` `
https://developer.android.com/reference/android/content/ContextWrapper#getWallpaperDesiredMinimumWidth()()
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDesiredMinimumWidth()` instead.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)(https://developer.android.com/reference/java/lang/String toPackage, https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Grant permission to access a specific Uri to another package, regardless
of whether that package has general permission to access the Uri's
content provider.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#isDeviceProtectedStorage()()
`

Indicates if the storage APIs of this Context are backed by
device-protected storage.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#isRestricted()()
`

Indicates whether this Context is restricted.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#isUiContext()()
`

Returns `true` if the context is a UI context which can access UI components such as
`https://developer.android.com/reference/android/view/WindowManager`, `https://developer.android.com/reference/android/view/LayoutInflater` or
`https://developer.android.com/reference/android/app/WallpaperManager`.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#moveDatabaseFrom(android.content.Context,%20java.lang.String)(https://developer.android.com/reference/android/content/Context sourceContext, https://developer.android.com/reference/java/lang/String name)
`

Move an existing database file from the given source storage context to
this context.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#moveSharedPreferencesFrom(android.content.Context,%20java.lang.String)(https://developer.android.com/reference/android/content/Context sourceContext, https://developer.android.com/reference/java/lang/String name)
`

Move an existing shared preferences file from the given source storage
context to this context.


`


https://developer.android.com/reference/java/io/FileInputStream` `
https://developer.android.com/reference/android/content/ContextWrapper#openFileInput(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Open a private file associated with this Context's application package
for reading.


`


https://developer.android.com/reference/java/io/FileOutputStream` `
https://developer.android.com/reference/android/content/ContextWrapper#openFileOutput(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Open a private file associated with this Context's application package
for writing.


`


https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase` `
https://developer.android.com/reference/android/content/ContextWrapper#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory,%20android.database.DatabaseErrorHandler)(https://developer.android.com/reference/java/lang/String name, int mode, https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.CursorFactory factory, https://developer.android.com/reference/android/database/DatabaseErrorHandler errorHandler)
`

Open a new private SQLiteDatabase associated with this Context's
application package.


`


https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase` `
https://developer.android.com/reference/android/content/ContextWrapper#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory)(https://developer.android.com/reference/java/lang/String name, int mode, https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.CursorFactory factory)
`

Open a new private SQLiteDatabase associated with this Context's
application package.


`


https://developer.android.com/reference/android/graphics/drawable/Drawable` `
https://developer.android.com/reference/android/content/ContextWrapper#peekWallpaper()()
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#peekDrawable()` instead.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#rebindService(android.content.ServiceConnection,%20android.content.Context.BindServiceFlags)(https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags)
`

Rebind an application service with updated bind service flags


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#registerComponentCallbacks(android.content.ComponentCallbacks)(https://developer.android.com/reference/android/content/ComponentCallbacks callback)
`

Add a new `https://developer.android.com/reference/android/content/ComponentCallbacks` to the base application of the
Context, which will be called at the same times as the ComponentCallbacks
methods of activities and other components are called.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#registerDeviceIdChangeListener(java.util.concurrent.Executor,%20java.util.function.IntConsumer)(https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/java/util/function/IntConsumer listener)
`

Adds a new device ID changed listener to the `Context`, which will be called when
the device association is changed by the system.


`


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/ContextWrapper#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter)
`

Register a BroadcastReceiver to be run in the main activity thread.


`


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/ContextWrapper#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20int)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, int flags)
`

Register to receive intent broadcasts, with the receiver optionally being
exposed to Instant Apps.


`


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/ContextWrapper#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20java.lang.String,%20android.os.Handler,%20int)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, https://developer.android.com/reference/java/lang/String broadcastPermission, https://developer.android.com/reference/android/os/Handler scheduler, int flags)
`

Register to receive intent broadcasts, to run in the context of
<var translate="no">scheduler</var>.


`


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/ContextWrapper#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20java.lang.String,%20android.os.Handler)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, https://developer.android.com/reference/java/lang/String broadcastPermission, https://developer.android.com/reference/android/os/Handler scheduler)
`

Register to receive intent broadcasts, to run in the context of
<var translate="no">scheduler</var>.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#removeStickyBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#removeStickyBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#revokeSelfPermissionsOnKill(java.util.Collection<java.lang.String>)(https://developer.android.com/reference/java/util/Collection<https://developer.android.com/reference/java/lang/String> permissions)
`

Triggers the revocation of one or more permissions for the calling package.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#revokeUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Remove all permissions to access a particular content provider Uri
that were previously added with `https://developer.android.com/reference/android/content/Context#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)` or *any other* mechanism.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#revokeUriPermission(java.lang.String,%20android.net.Uri,%20int)(https://developer.android.com/reference/java/lang/String targetPackage, https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Remove permissions to access a particular content provider Uri
that were previously added with `https://developer.android.com/reference/android/content/Context#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)` for a specific target
package.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options)
`

Broadcast the given intent to all interested BroadcastReceivers, allowing
an optional required permission to be enforced.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendBroadcast(android.content.Intent,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Broadcast the given intent to all interested BroadcastReceivers, allowing
an optional required permission to be enforced.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Broadcast the given intent to all interested BroadcastReceivers.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to specify the
user the broadcast will be sent to.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent,%20java.lang.String)` that allows you to specify the
user the broadcast will be sent to.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/java/lang/String receiverAppOp, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of
`https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)` that allows you to specify the App Op to enforce restrictions on which receivers
the broadcast will be sent to.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20int,%20java.lang.String,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20java.lang.String,%20android.os.Bundle,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, int initialCode, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/java/lang/String receiverAppOp, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras, https://developer.android.com/reference/android/os/Bundle options)
`


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to
receive data back from the broadcast.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options)
`

Broadcast the given intent to all interested BroadcastReceivers, delivering
them one at a time to allow more preferred receivers to consume the
broadcast before it is delivered to less preferred receivers.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to
receive data back from the broadcast.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcast(android.content.Intent,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Broadcast the given intent to all interested BroadcastReceivers, delivering
them one at a time to allow more preferred receivers to consume the
broadcast before it is delivered to less preferred receivers.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendOrderedBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of
`https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)`
that allows you to specify the
user the broadcast will be sent to.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendStickyBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendStickyBroadcast(android.content.Intent,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/Bundle options)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendStickyBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendStickyOrderedBroadcast(android.content.Intent,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#sendStickyOrderedBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

*This method is deprecated.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#setTheme(int)(int resid)
`

Set the base theme for this context.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#setWallpaper(android.graphics.Bitmap)(https://developer.android.com/reference/android/graphics/Bitmap bitmap)
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#setBitmap(android.graphics.Bitmap)` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#setWallpaper(java.io.InputStream)(https://developer.android.com/reference/java/io/InputStream data)
`

*This method is deprecated.
Use `https://developer.android.com/reference/android/app/WallpaperManager#setStream(java.io.InputStream)` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#shouldShowRequestPermissionRationale(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Gets whether you should show UI with rationale before requesting a permission.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startActivities(android.content.Intent[],%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intents, https://developer.android.com/reference/android/os/Bundle options)
`

Launch multiple new activities.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startActivities(android.content.Intent[])(https://developer.android.com/reference/android/content/Intent intents)
`

Same as `https://developer.android.com/reference/android/content/Context#startActivities(android.content.Intent[],%20android.os.Bundle)` with no options
specified.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startActivity(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Same as `https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent,%20android.os.Bundle)` with no options
specified.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startActivity(android.content.Intent,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/Bundle options)
`

Launch a new activity.


`


https://developer.android.com/reference/android/content/ComponentName` `
https://developer.android.com/reference/android/content/ContextWrapper#startForegroundService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent service)
`

Similar to `https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)`, but with an implicit promise that the
Service will call `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)` once it begins running.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#startInstrumentation(android.content.ComponentName,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/ComponentName className, https://developer.android.com/reference/java/lang/String profileFile, https://developer.android.com/reference/android/os/Bundle arguments)
`

Start executing an `https://developer.android.com/reference/android/app/Instrumentation` class.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int)(https://developer.android.com/reference/android/content/IntentSender intent, https://developer.android.com/reference/android/content/Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
`

Same as `https://developer.android.com/reference/android/content/Context#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int,%20android.os.Bundle)`
with no options specified.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int,%20android.os.Bundle)(https://developer.android.com/reference/android/content/IntentSender intent, https://developer.android.com/reference/android/content/Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, https://developer.android.com/reference/android/os/Bundle options)
`

Like `https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent,%20android.os.Bundle)`, but taking a IntentSender
to start.


`


https://developer.android.com/reference/android/content/ComponentName` `
https://developer.android.com/reference/android/content/ContextWrapper#startService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent service)
`

Request that a given application service be started.


`


boolean` `
https://developer.android.com/reference/android/content/ContextWrapper#stopService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent name)
`

Request that a given application service be stopped.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#unbindService(android.content.ServiceConnection)(https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Disconnect from an application service.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#unregisterComponentCallbacks(android.content.ComponentCallbacks)(https://developer.android.com/reference/android/content/ComponentCallbacks callback)
`

Remove a `https://developer.android.com/reference/android/content/ComponentCallbacks` object that was previously registered
with `https://developer.android.com/reference/android/content/ContextWrapper#registerComponentCallbacks(android.content.ComponentCallbacks)`.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#unregisterDeviceIdChangeListener(java.util.function.IntConsumer)(https://developer.android.com/reference/java/util/function/IntConsumer listener)
`

Removes a device ID changed listener from the Context.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#unregisterReceiver(android.content.BroadcastReceiver)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver)
`

Unregister a previously registered BroadcastReceiver.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#updateServiceBindings(java.util.Collection<android.content.Context.UpdateBindingParams>)(https://developer.android.com/reference/java/util/Collection<https://developer.android.com/reference/android/content/Context.UpdateBindingParams> params)
`

Perform a batch update of existing bindings.


`


void` `
https://developer.android.com/reference/android/content/ContextWrapper#updateServiceGroup(android.content.ServiceConnection,%20int,%20int)(https://developer.android.com/reference/android/content/ServiceConnection conn, int group, int importance)
`

For a service previously bound with `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)` or a related method, change
how the system manages that service's process in relation to other processes.


From class `

https://developer.android.com/reference/android/content/Context

` `


boolean` `
https://developer.android.com/reference/android/content/Context#bindIsolatedService(android.content.Intent,%20int,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, int flags, https://developer.android.com/reference/java/lang/String instanceName, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Variation of `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)` that, in the specific case of isolated
services, allows the caller to generate multiple instances of a service
from a single component declaration.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindIsolatedService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags, https://developer.android.com/reference/java/lang/String instanceName, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

See `https://developer.android.com/reference/android/content/Context#bindIsolatedService(android.content.Intent,%20int,%20java.lang.String,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20int,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, int flags, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Same as `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)` with executor to control ServiceConnection
callbacks.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20android.content.Context.BindServiceFlags)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags)
`

See `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.ServiceConnection,%20int)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, int flags)
`

Connects to an application service, creating it if needed.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags, https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/android/content/ServiceConnection conn)
`

See `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20int,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20int,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, int flags, https://developer.android.com/reference/android/os/UserHandle user)
`

Binds to a service in the given `user` in the same manner as `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`.


`


boolean` `
https://developer.android.com/reference/android/content/Context#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20android.content.Context.BindServiceFlags,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent service, https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags, https://developer.android.com/reference/android/os/UserHandle user)
`

See `https://developer.android.com/reference/android/content/Context#bindServiceAsUser(android.content.Intent,%20android.content.ServiceConnection,%20int,%20android.os.UserHandle)`
Call `https://developer.android.com/reference/android/content/Context.BindServiceFlags#of(long)` to obtain a BindServiceFlags object.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkCallingOrSelfPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether the calling process of an IPC *or you* have been
granted a particular permission.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkCallingOrSelfUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Determine whether the calling process of an IPC *or you* has been granted
permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/Context#checkCallingOrSelfUriPermissions(java.util.List<android.net.Uri>,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int modeFlags)
`

Determine whether the calling process of an IPC *or you* has been granted
permission to access a list of URIs.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkCallingPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether the calling process of an IPC you are handling has been
granted a particular permission.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkCallingUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Determine whether the calling process and uid has been
granted permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/Context#checkCallingUriPermissions(java.util.List<android.net.Uri>,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int modeFlags)
`

Determine whether the calling process and uid has been
granted permission to access a list of URIs.


`


int` `
https://developer.android.com/reference/android/content/Context#checkContentUriPermissionFull(android.net.Uri,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a specific content URI.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkPermission(java.lang.String,%20int,%20int)(https://developer.android.com/reference/java/lang/String permission, int pid, int uid)
`

Determine whether the given permission is allowed for a particular process and user ID
running in the system.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkSelfPermission(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Determine whether *you* have been granted a particular permission.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkUriPermission(android.net.Uri,%20java.lang.String,%20java.lang.String,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, https://developer.android.com/reference/java/lang/String readPermission, https://developer.android.com/reference/java/lang/String writePermission, int pid, int uid, int modeFlags)
`

Check both a Uri and normal permission.


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#checkUriPermission(android.net.Uri,%20int,%20int,%20int)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a specific URI.


`


int[]` `
https://developer.android.com/reference/android/content/Context#checkUriPermissions(java.util.List<android.net.Uri>,%20int,%20int,%20int)(https://developer.android.com/reference/java/util/List<https://developer.android.com/reference/android/net/Uri> uris, int pid, int uid, int modeFlags)
`

Determine whether a particular process and uid has been granted
permission to access a list of URIs.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#clearWallpaper()()
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#clear()` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createAttributionContext(java.lang.String)(https://developer.android.com/reference/java/lang/String attributionTag)
`

Return a new Context object for the current Context but attribute to a different tag.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createConfigurationContext(android.content.res.Configuration)(https://developer.android.com/reference/android/content/res/Configuration overrideConfiguration)
`

Return a new Context object for the current Context but whose resources
are adjusted to match the given Configuration.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createContext(android.content.ContextParams)(https://developer.android.com/reference/android/content/ContextParams contextParams)
`

Creates a context with specific properties and behaviors.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createContextForSplit(java.lang.String)(https://developer.android.com/reference/java/lang/String splitName)
`

Return a new Context object for the given split name.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createDeviceContext(int)(int deviceId)
`

Returns a new `Context` object from the current context but with device association
given by the `deviceId`.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createDeviceProtectedStorageContext()()
`

Return a new Context object for the current Context but whose storage
APIs are backed by device-protected storage.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createDisplayContext(android.view.Display)(https://developer.android.com/reference/android/view/Display display)
`

Returns a new `Context` object from the current context but with resources
adjusted to match the metrics of `display`.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createPackageContext(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String packageName, int flags)
`

Return a new Context object for the given application name.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createWindowContext(int,%20android.os.Bundle)(int type, https://developer.android.com/reference/android/os/Bundle options)
`

Creates a Context for a non-activity window.


`


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#createWindowContext(android.view.Display,%20int,%20android.os.Bundle)(https://developer.android.com/reference/android/view/Display display, int type, https://developer.android.com/reference/android/os/Bundle options)
`

Creates a `Context` for a non-`https://developer.android.com/reference/android/app/Activity` window on the given
`https://developer.android.com/reference/android/view/Display`.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#databaseList()()
`

Returns an array of strings naming the private databases associated with
this Context's application package.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#deleteDatabase(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete an existing private SQLiteDatabase associated with this Context's
application package.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#deleteFile(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete the given private file associated with this Context's
application package.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#deleteSharedPreferences(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Delete an existing shared preferences file.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceCallingOrSelfPermission(java.lang.String,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, https://developer.android.com/reference/java/lang/String message)
`

If neither you nor the calling process of an IPC you are
handling has been granted a particular permission, throw a
`https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceCallingOrSelfUriPermission(android.net.Uri,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If the calling process of an IPC *or you* has not been
granted permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceCallingPermission(java.lang.String,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, https://developer.android.com/reference/java/lang/String message)
`

If the calling process of an IPC you are handling has not been
granted a particular permission, throw a `https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceCallingUriPermission(android.net.Uri,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If the calling process and uid has not been granted
permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforcePermission(java.lang.String,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/java/lang/String permission, int pid, int uid, https://developer.android.com/reference/java/lang/String message)
`

If the given permission is not allowed for a particular process
and user ID running in the system, throw a `https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceUriPermission(android.net.Uri,%20java.lang.String,%20java.lang.String,%20int,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, https://developer.android.com/reference/java/lang/String readPermission, https://developer.android.com/reference/java/lang/String writePermission, int pid, int uid, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

Enforce both a Uri and normal permission.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#enforceUriPermission(android.net.Uri,%20int,%20int,%20int,%20java.lang.String)(https://developer.android.com/reference/android/net/Uri uri, int pid, int uid, int modeFlags, https://developer.android.com/reference/java/lang/String message)
`

If a particular process and uid has not been granted
permission to access a specific URI, throw `https://developer.android.com/reference/java/lang/SecurityException`.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#fileList()()
`

Returns an array of strings naming the private files associated with
this Context's application package.


`
abstract


https://developer.android.com/reference/android/content/Context` `
https://developer.android.com/reference/android/content/Context#getApplicationContext()()
`

Return the context of the single, global Application object of the
current process.


`
abstract


https://developer.android.com/reference/android/content/pm/ApplicationInfo` `
https://developer.android.com/reference/android/content/Context#getApplicationInfo()()
`

Return the full application info for this context's package.


`
abstract


https://developer.android.com/reference/android/content/res/AssetManager` `
https://developer.android.com/reference/android/content/Context#getAssets()()
`

Returns an AssetManager instance for the application's package.


`


https://developer.android.com/reference/android/content/AttributionSource` `
https://developer.android.com/reference/android/content/Context#getAttributionSource()()
` `


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getAttributionTag()()
`

<br />

Attribution can be used in complex apps to logically separate parts of the app.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getCacheDir()()
`

Returns the absolute path to the application specific cache directory on
the filesystem.


`
abstract


https://developer.android.com/reference/java/lang/ClassLoader` `
https://developer.android.com/reference/android/content/Context#getClassLoader()()
`

Return a class loader you can use to retrieve classes in this package.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getCodeCacheDir()()
`

Returns the absolute path to the application specific cache directory on
the filesystem designed for storing cached code.


`


final

int` `
https://developer.android.com/reference/android/content/Context#getColor(int)(int id)
`

Returns a color associated with a particular resource ID and styled for
the current theme.


`


final

https://developer.android.com/reference/android/content/res/ColorStateList` `
https://developer.android.com/reference/android/content/Context#getColorStateList(int)(int id)
`

Returns a color state list associated with a particular resource ID and
styled for the current theme.


`
abstract


https://developer.android.com/reference/android/content/ContentResolver` `
https://developer.android.com/reference/android/content/Context#getContentResolver()()
`

Return a ContentResolver instance for your application's package.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getDataDir()()
`

Returns the absolute path to the directory on the filesystem where all
private files belonging to this app are stored.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getDatabasePath(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Returns the absolute path on the filesystem where a database created with
`https://developer.android.com/reference/android/content/Context#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory)` is stored.


`


int` `
https://developer.android.com/reference/android/content/Context#getDeviceId()()
`

Gets the device ID this context is associated with.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getDir(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Retrieve, creating if needed, a new directory in which the application
can place its own custom data files.


`


https://developer.android.com/reference/android/view/Display` `
https://developer.android.com/reference/android/content/Context#getDisplay()()
`

Get the display this context is associated with.


`


final

https://developer.android.com/reference/android/graphics/drawable/Drawable` `
https://developer.android.com/reference/android/content/Context#getDrawable(int)(int id)
`

Returns a drawable object associated with a particular resource ID and
styled for the current theme.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getExternalCacheDir()()
`

Returns absolute path to application-specific directory on the primary
shared/external storage device where the application can place cache
files it owns.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getExternalCacheDirs()()
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application can place cache
files it owns.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getExternalFilesDir(java.lang.String)(https://developer.android.com/reference/java/lang/String type)
`

Returns the absolute path to the directory on the primary shared/external
storage device where the application can place persistent files it owns.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getExternalFilesDirs(java.lang.String)(https://developer.android.com/reference/java/lang/String type)
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application can place
persistent files it owns.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getExternalMediaDirs()()
`

*This method was deprecated
in API level 30.
These directories still exist and are scanned, but developers
are encouraged to migrate to inserting content into a
`https://developer.android.com/reference/android/provider/MediaStore` collection directly, as any app can
contribute new media to `https://developer.android.com/reference/android/provider/MediaStore` with no
permissions required, starting in
`https://developer.android.com/reference/android/os/Build.VERSION_CODES#Q`.*


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getFileStreamPath(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Returns the absolute path on the filesystem where a file created with
`https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)` is stored.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getFilesDir()()
`

Returns the absolute path to the directory on the filesystem where files
created with `https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)` are stored.


`


https://developer.android.com/reference/java/util/concurrent/Executor` `
https://developer.android.com/reference/android/content/Context#getMainExecutor()()
`

Return an `https://developer.android.com/reference/java/util/concurrent/Executor` that will run enqueued tasks on the main
thread associated with this context.


`
abstract


https://developer.android.com/reference/android/os/Looper` `
https://developer.android.com/reference/android/content/Context#getMainLooper()()
`

Return the Looper for the main thread of the current process.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getNoBackupFilesDir()()
`

Returns the absolute path to the directory on the filesystem similar to
`https://developer.android.com/reference/android/content/Context#getFilesDir()`.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getObbDir()()
`

Return the primary shared/external storage directory where this
application's OBB files (if there are any) can be found.


`
abstract


https://developer.android.com/reference/java/io/File` `
https://developer.android.com/reference/android/content/Context#getObbDirs()()
`

Returns absolute paths to application-specific directories on all
shared/external storage devices where the application's OBB files (if
there are any) can be found.


`


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getOpPackageName()()
`

Return the package name that should be used for `https://developer.android.com/reference/android/app/AppOpsManager` calls from
this context, so that app ops manager's uid verification will work with the name.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getPackageCodePath()()
`

Return the full path to this context's primary Android package.


`
abstract


https://developer.android.com/reference/android/content/pm/PackageManager` `
https://developer.android.com/reference/android/content/Context#getPackageManager()()
`

Return PackageManager instance to find global package information.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getPackageName()()
`

Return the name of this application's package.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getPackageResourcePath()()
`

Return the full path to this context's primary Android package.


`


https://developer.android.com/reference/android/content/ContextParams` `
https://developer.android.com/reference/android/content/Context#getParams()()
`

Return the set of parameters which this Context was created with, if it
was created via `https://developer.android.com/reference/android/content/Context#createContext(android.content.ContextParams)`.


`
abstract


https://developer.android.com/reference/android/content/res/Resources` `
https://developer.android.com/reference/android/content/Context#getResources()()
`

Returns a Resources instance for the application's package.


`
abstract


https://developer.android.com/reference/android/content/SharedPreferences` `
https://developer.android.com/reference/android/content/Context#getSharedPreferences(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Retrieve and hold the contents of the preferences file 'name', returning
a SharedPreferences through which you can retrieve and modify its
values.


`


final

https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getString(int)(int resId)
`

Returns a localized string from the application's package's
default string table.


`


final

https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getString(int,%20java.lang.Object[])(int resId, https://developer.android.com/reference/java/lang/Object formatArgs)
`

Returns a localized formatted string from the application's package's
default string table, substituting the format arguments as defined in
`https://developer.android.com/reference/java/util/Formatter` and `https://developer.android.com/reference/java/lang/String#format(java.lang.String,%20java.lang.Object[])`.


`


final
<T>
T` `
https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.Class<T>)(https://developer.android.com/reference/java/lang/Class<T> serviceClass)
`

Return the handle to a system-level service by class.


`
abstract


https://developer.android.com/reference/java/lang/Object` `
https://developer.android.com/reference/android/content/Context#getSystemService(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Return the handle to a system-level service by name.


`
abstract


https://developer.android.com/reference/java/lang/String` `
https://developer.android.com/reference/android/content/Context#getSystemServiceName(java.lang.Class<?>)(https://developer.android.com/reference/java/lang/Class<?> serviceClass)
`

Gets the name of the system-level service that is represented by the specified class.


`


final

https://developer.android.com/reference/java/lang/CharSequence` `
https://developer.android.com/reference/android/content/Context#getText(int)(int resId)
`

Return a localized, styled CharSequence from the application's package's
default string table.


`
abstract


https://developer.android.com/reference/android/content/res/Resources.Theme` `
https://developer.android.com/reference/android/content/Context#getTheme()()
`

Return the Theme object associated with this Context.


`


https://developer.android.com/reference/android/content/Context.BindServiceFlags` `
https://developer.android.com/reference/android/content/Context#getUpdateableFlags()()
`

Gets the list of bind flags that may be updated (i.e.


`
abstract


https://developer.android.com/reference/android/graphics/drawable/Drawable` `
https://developer.android.com/reference/android/content/Context#getWallpaper()()
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDrawable()` instead.*


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#getWallpaperDesiredMinimumHeight()()
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDesiredMinimumHeight()` instead.*


`
abstract


int` `
https://developer.android.com/reference/android/content/Context#getWallpaperDesiredMinimumWidth()()
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#getDesiredMinimumWidth()` instead.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)(https://developer.android.com/reference/java/lang/String toPackage, https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Grant permission to access a specific Uri to another package, regardless
of whether that package has general permission to access the Uri's
content provider.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#isDeviceProtectedStorage()()
`

Indicates if the storage APIs of this Context are backed by
device-protected storage.


`


boolean` `
https://developer.android.com/reference/android/content/Context#isRestricted()()
`

Indicates whether this Context is restricted.


`


boolean` `
https://developer.android.com/reference/android/content/Context#isUiContext()()
`

Returns `true` if the context is a UI context which can access UI components such as
`https://developer.android.com/reference/android/view/WindowManager`, `https://developer.android.com/reference/android/view/LayoutInflater` or
`https://developer.android.com/reference/android/app/WallpaperManager`.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#moveDatabaseFrom(android.content.Context,%20java.lang.String)(https://developer.android.com/reference/android/content/Context sourceContext, https://developer.android.com/reference/java/lang/String name)
`

Move an existing database file from the given source storage context to
this context.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#moveSharedPreferencesFrom(android.content.Context,%20java.lang.String)(https://developer.android.com/reference/android/content/Context sourceContext, https://developer.android.com/reference/java/lang/String name)
`

Move an existing shared preferences file from the given source storage
context to this context.


`


final

https://developer.android.com/reference/android/content/res/TypedArray` `
https://developer.android.com/reference/android/content/Context#obtainStyledAttributes(android.util.AttributeSet,%20int[])(https://developer.android.com/reference/android/util/AttributeSet set, int[] attrs)
`

Retrieve styled attribute information in this Context's theme.


`


final

https://developer.android.com/reference/android/content/res/TypedArray` `
https://developer.android.com/reference/android/content/Context#obtainStyledAttributes(android.util.AttributeSet,%20int[],%20int,%20int)(https://developer.android.com/reference/android/util/AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes)
`

Retrieve styled attribute information in this Context's theme.


`


final

https://developer.android.com/reference/android/content/res/TypedArray` `
https://developer.android.com/reference/android/content/Context#obtainStyledAttributes(int,%20int[])(int resid, int[] attrs)
`

Retrieve styled attribute information in this Context's theme.


`


final

https://developer.android.com/reference/android/content/res/TypedArray` `
https://developer.android.com/reference/android/content/Context#obtainStyledAttributes(int[])(int[] attrs)
`

Retrieve styled attribute information in this Context's theme.


`
abstract


https://developer.android.com/reference/java/io/FileInputStream` `
https://developer.android.com/reference/android/content/Context#openFileInput(java.lang.String)(https://developer.android.com/reference/java/lang/String name)
`

Open a private file associated with this Context's application package
for reading.


`
abstract


https://developer.android.com/reference/java/io/FileOutputStream` `
https://developer.android.com/reference/android/content/Context#openFileOutput(java.lang.String,%20int)(https://developer.android.com/reference/java/lang/String name, int mode)
`

Open a private file associated with this Context's application package
for writing.


`
abstract


https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase` `
https://developer.android.com/reference/android/content/Context#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory,%20android.database.DatabaseErrorHandler)(https://developer.android.com/reference/java/lang/String name, int mode, https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.CursorFactory factory, https://developer.android.com/reference/android/database/DatabaseErrorHandler errorHandler)
`

Open a new private SQLiteDatabase associated with this Context's
application package.


`
abstract


https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase` `
https://developer.android.com/reference/android/content/Context#openOrCreateDatabase(java.lang.String,%20int,%20android.database.sqlite.SQLiteDatabase.CursorFactory)(https://developer.android.com/reference/java/lang/String name, int mode, https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.CursorFactory factory)
`

Open a new private SQLiteDatabase associated with this Context's
application package.


`
abstract


https://developer.android.com/reference/android/graphics/drawable/Drawable` `
https://developer.android.com/reference/android/content/Context#peekWallpaper()()
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#peekDrawable()` instead.*


`


void` `
https://developer.android.com/reference/android/content/Context#rebindService(android.content.ServiceConnection,%20android.content.Context.BindServiceFlags)(https://developer.android.com/reference/android/content/ServiceConnection conn, https://developer.android.com/reference/android/content/Context.BindServiceFlags flags)
`

Rebind an application service with updated bind service flags


`


void` `
https://developer.android.com/reference/android/content/Context#registerComponentCallbacks(android.content.ComponentCallbacks)(https://developer.android.com/reference/android/content/ComponentCallbacks callback)
`

Add a new `https://developer.android.com/reference/android/content/ComponentCallbacks` to the base application of the
Context, which will be called at the same times as the ComponentCallbacks
methods of activities and other components are called.


`


void` `
https://developer.android.com/reference/android/content/Context#registerDeviceIdChangeListener(java.util.concurrent.Executor,%20java.util.function.IntConsumer)(https://developer.android.com/reference/java/util/concurrent/Executor executor, https://developer.android.com/reference/java/util/function/IntConsumer listener)
`

Adds a new device ID changed listener to the `Context`, which will be called when
the device association is changed by the system.


`
abstract


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter)
`

Register a BroadcastReceiver to be run in the main activity thread.


`
abstract


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20int)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, int flags)
`

Register to receive intent broadcasts, with the receiver optionally being
exposed to Instant Apps.


`
abstract


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20java.lang.String,%20android.os.Handler,%20int)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, https://developer.android.com/reference/java/lang/String broadcastPermission, https://developer.android.com/reference/android/os/Handler scheduler, int flags)
`

Register to receive intent broadcasts, to run in the context of
<var translate="no">scheduler</var>.


`
abstract


https://developer.android.com/reference/android/content/Intent` `
https://developer.android.com/reference/android/content/Context#registerReceiver(android.content.BroadcastReceiver,%20android.content.IntentFilter,%20java.lang.String,%20android.os.Handler)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver, https://developer.android.com/reference/android/content/IntentFilter filter, https://developer.android.com/reference/java/lang/String broadcastPermission, https://developer.android.com/reference/android/os/Handler scheduler)
`

Register to receive intent broadcasts, to run in the context of
<var translate="no">scheduler</var>.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#removeStickyBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#removeStickyBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/Context#revokeSelfPermissionOnKill(java.lang.String)(https://developer.android.com/reference/java/lang/String permName)
`

Triggers the asynchronous revocation of a runtime permission.


`


void` `
https://developer.android.com/reference/android/content/Context#revokeSelfPermissionsOnKill(java.util.Collection<java.lang.String>)(https://developer.android.com/reference/java/util/Collection<https://developer.android.com/reference/java/lang/String> permissions)
`

Triggers the revocation of one or more permissions for the calling package.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#revokeUriPermission(android.net.Uri,%20int)(https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Remove all permissions to access a particular content provider Uri
that were previously added with `https://developer.android.com/reference/android/content/Context#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)` or *any other* mechanism.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#revokeUriPermission(java.lang.String,%20android.net.Uri,%20int)(https://developer.android.com/reference/java/lang/String toPackage, https://developer.android.com/reference/android/net/Uri uri, int modeFlags)
`

Remove permissions to access a particular content provider Uri
that were previously added with `https://developer.android.com/reference/android/content/Context#grantUriPermission(java.lang.String,%20android.net.Uri,%20int)` for a specific target
package.


`


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options)
`

Broadcast the given intent to all interested BroadcastReceivers, allowing
an optional required permission to be enforced.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Broadcast the given intent to all interested BroadcastReceivers, allowing
an optional required permission to be enforced.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Broadcast the given intent to all interested BroadcastReceivers.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to specify the
user the broadcast will be sent to.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent,%20java.lang.String)` that allows you to specify the
user the broadcast will be sent to.


`


void` `
https://developer.android.com/reference/android/content/Context#sendBroadcastWithMultiplePermissions(android.content.Intent,%20java.lang.String[])(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermissions)
`

Broadcast the given intent to all interested BroadcastReceivers, allowing
an array of required permissions to be enforced.


`


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/java/lang/String receiverAppOp, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of
`https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)` that allows you to specify the App Op to enforce restrictions on which receivers
the broadcast will be sent to.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to
receive data back from the broadcast.


`


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options)
`

Broadcast the given intent to all interested BroadcastReceivers, delivering
them one at a time to allow more preferred receivers to consume the
broadcast before it is delivered to less preferred receivers.


`


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.os.Bundle,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/os/Bundle options, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of `https://developer.android.com/reference/android/content/Context#sendBroadcast(android.content.Intent)` that allows you to
receive data back from the broadcast.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/java/lang/String receiverPermission)
`

Broadcast the given intent to all interested BroadcastReceivers, delivering
them one at a time to allow more preferred receivers to consume the
broadcast before it is delivered to less preferred receivers.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendOrderedBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/java/lang/String receiverPermission, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

Version of
`https://developer.android.com/reference/android/content/Context#sendOrderedBroadcast(android.content.Intent,%20java.lang.String,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)`
that allows you to specify the
user the broadcast will be sent to.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendStickyBroadcast(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`


void` `
https://developer.android.com/reference/android/content/Context#sendStickyBroadcast(android.content.Intent,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/Bundle options)
`

*This method was deprecated
in API level 31.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendStickyBroadcastAsUser(android.content.Intent,%20android.os.UserHandle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendStickyOrderedBroadcast(android.content.Intent,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#sendStickyOrderedBroadcastAsUser(android.content.Intent,%20android.os.UserHandle,%20android.content.BroadcastReceiver,%20android.os.Handler,%20int,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/UserHandle user, https://developer.android.com/reference/android/content/BroadcastReceiver resultReceiver, https://developer.android.com/reference/android/os/Handler scheduler, int initialCode, https://developer.android.com/reference/java/lang/String initialData, https://developer.android.com/reference/android/os/Bundle initialExtras)
`

*This method was deprecated
in API level 21.
Sticky broadcasts should not be used. They provide no security (anyone
can access them), no protection (anyone can modify them), and many other problems.
The recommended pattern is to use a non-sticky broadcast to report that *something*
has changed, with another mechanism for apps to retrieve the current value whenever
desired.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#setTheme(int)(int resid)
`

Set the base theme for this context.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#setWallpaper(android.graphics.Bitmap)(https://developer.android.com/reference/android/graphics/Bitmap bitmap)
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#setBitmap(android.graphics.Bitmap)` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#setWallpaper(java.io.InputStream)(https://developer.android.com/reference/java/io/InputStream data)
`

*This method was deprecated
in API level 15.
Use `https://developer.android.com/reference/android/app/WallpaperManager#setStream(java.io.InputStream)` instead.*

*This method requires the caller to hold the permission
`https://developer.android.com/reference/android/Manifest.permission#SET_WALLPAPER`.*


`


boolean` `
https://developer.android.com/reference/android/content/Context#shouldShowRequestPermissionRationale(java.lang.String)(https://developer.android.com/reference/java/lang/String permission)
`

Gets whether you should show UI with rationale before requesting a permission.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startActivities(android.content.Intent[],%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intents, https://developer.android.com/reference/android/os/Bundle options)
`

Launch multiple new activities.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startActivities(android.content.Intent[])(https://developer.android.com/reference/android/content/Intent intents)
`

Same as `https://developer.android.com/reference/android/content/Context#startActivities(android.content.Intent[],%20android.os.Bundle)` with no options
specified.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent)(https://developer.android.com/reference/android/content/Intent intent)
`

Same as `https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent,%20android.os.Bundle)` with no options
specified.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent,%20android.os.Bundle)(https://developer.android.com/reference/android/content/Intent intent, https://developer.android.com/reference/android/os/Bundle options)
`

Launch a new activity.


`
abstract


https://developer.android.com/reference/android/content/ComponentName` `
https://developer.android.com/reference/android/content/Context#startForegroundService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent service)
`

Similar to `https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)`, but with an implicit promise that the
Service will call `https://developer.android.com/reference/android/app/Service#startForeground(int,%20android.app.Notification)` once it begins running.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#startInstrumentation(android.content.ComponentName,%20java.lang.String,%20android.os.Bundle)(https://developer.android.com/reference/android/content/ComponentName className, https://developer.android.com/reference/java/lang/String profileFile, https://developer.android.com/reference/android/os/Bundle arguments)
`

Start executing an `https://developer.android.com/reference/android/app/Instrumentation` class.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int)(https://developer.android.com/reference/android/content/IntentSender intent, https://developer.android.com/reference/android/content/Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
`

Same as `https://developer.android.com/reference/android/content/Context#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int,%20android.os.Bundle)`
with no options specified.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#startIntentSender(android.content.IntentSender,%20android.content.Intent,%20int,%20int,%20int,%20android.os.Bundle)(https://developer.android.com/reference/android/content/IntentSender intent, https://developer.android.com/reference/android/content/Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, https://developer.android.com/reference/android/os/Bundle options)
`

Like `https://developer.android.com/reference/android/content/Context#startActivity(android.content.Intent,%20android.os.Bundle)`, but taking a IntentSender
to start.


`
abstract


https://developer.android.com/reference/android/content/ComponentName` `
https://developer.android.com/reference/android/content/Context#startService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent service)
`

Request that a given application service be started.


`
abstract


boolean` `
https://developer.android.com/reference/android/content/Context#stopService(android.content.Intent)(https://developer.android.com/reference/android/content/Intent service)
`

Request that a given application service be stopped.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#unbindService(android.content.ServiceConnection)(https://developer.android.com/reference/android/content/ServiceConnection conn)
`

Disconnect from an application service.


`


void` `
https://developer.android.com/reference/android/content/Context#unregisterComponentCallbacks(android.content.ComponentCallbacks)(https://developer.android.com/reference/android/content/ComponentCallbacks callback)
`

Remove a `https://developer.android.com/reference/android/content/ComponentCallbacks` object that was previously registered
with `https://developer.android.com/reference/android/content/Context#registerComponentCallbacks(android.content.ComponentCallbacks)`.


`


void` `
https://developer.android.com/reference/android/content/Context#unregisterDeviceIdChangeListener(java.util.function.IntConsumer)(https://developer.android.com/reference/java/util/function/IntConsumer listener)
`

Removes a device ID changed listener from the Context.


`
abstract


void` `
https://developer.android.com/reference/android/content/Context#unregisterReceiver(android.content.BroadcastReceiver)(https://developer.android.com/reference/android/content/BroadcastReceiver receiver)
`

Unregister a previously registered BroadcastReceiver.


`


void` `
https://developer.android.com/reference/android/content/Context#updateServiceBindings(java.util.Collection<android.content.Context.UpdateBindingParams>)(https://developer.android.com/reference/java/util/Collection<https://developer.android.com/reference/android/content/Context.UpdateBindingParams> params)
`

Perform a batch update of existing bindings.


`


void` `
https://developer.android.com/reference/android/content/Context#updateServiceGroup(android.content.ServiceConnection,%20int,%20int)(https://developer.android.com/reference/android/content/ServiceConnection conn, int group, int importance)
`

For a service previously bound with `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)` or a related method, change
how the system manages that service's process in relation to other processes.


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

https://developer.android.com/reference/android/content/ComponentCallbacks2

` `
abstract


void` `
https://developer.android.com/reference/android/content/ComponentCallbacks2#onTrimMemory(int)(int level)
`

Called when the operating system has determined that it is a good
time for a process to trim unneeded memory from its process.


From interface `

https://developer.android.com/reference/android/content/ComponentCallbacks

` `
abstract


void` `
https://developer.android.com/reference/android/content/ComponentCallbacks#onConfigurationChanged(android.content.res.Configuration)(https://developer.android.com/reference/android/content/res/Configuration newConfig)
`

Called by the system when the device configuration changes while your
component is running.


`
abstract


void` `
https://developer.android.com/reference/android/content/ComponentCallbacks#onLowMemory()()
`

*This method was deprecated
in API level 35.
Since API level 14 this is superseded by
`https://developer.android.com/reference/android/content/ComponentCallbacks2#onTrimMemory(int)`.
Since API level 34 this is never called.
If you're overriding ComponentCallbacks2#onTrimMemory and
your minSdkVersion is greater than API 14, you can provide
an empty implementation for this method.*


## Constants

### SERVICE_INTERFACE

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String SERVICE_INTERFACE
```

The `https://developer.android.com/reference/android/content/Intent` that must be declared as handled by the service.
To be supported, the service must also require the
`https://developer.android.com/reference/android/Manifest.permission#BIND_VOICE_INTERACTION` permission so
that other applications can not abuse it.

<br />

Constant Value:

"android.service.voice.VoiceInteractionService"


### SERVICE_META_DATA

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static final String SERVICE_META_DATA
```

Name under which a VoiceInteractionService component publishes information about itself.
This meta-data should reference an XML resource containing a
``<`https://developer.android.com/reference/android/R.styleable#VoiceInteractionService`>`` tag.

<br />

Constant Value:

"android.voice_interaction"


## Public constructors

### VoiceInteractionService

```
public VoiceInteractionService ()
```

<br />

<br />

## Public methods

### getDisabledShowContext

Added in [API level 23](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public int getDisabledShowContext ()
```

Return the value set by `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#setDisabledShowContext(int)`.

<br />

| Returns ||
|---|---|
| `int` | <br /> |

### isActiveService

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public static boolean isActiveService (Context context, 
                ComponentName service)
```

Check whether the given service component is the currently active
VoiceInteractionService.

<br />

| Parameters ||
|---|---|
| `context` | `Context` <br /> |
| `service` | `ComponentName` <br /> |

| Returns ||
|---|---|
| `boolean` | <br /> |

### onBind

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public IBinder onBind (Intent intent)
```

Return the communication channel to the service. May return null if
clients can not bind to the service. The returned
`https://developer.android.com/reference/android/os/IBinder` is usually for a complex interface
that has been [described using
aidl](https://developer.android.com/guide/components/aidl).

*Note that unlike other application components, calls on to the
IBinder interface returned here may not happen on the main thread
of the process* . More information about the main thread can be found in
[Processes and
Threads](https://developer.android.com/guide/topics/fundamentals/processes-and-threads).

<br />

<br />

| Parameters ||
|---|---|
| `intent` | `Intent`: The Intent that was used to bind to this service, as given to `https://developer.android.com/reference/android/content/Context#bindService(android.content.Intent,%20android.content.Context.BindServiceFlags,%20java.util.concurrent.Executor,%20android.content.ServiceConnection)`. Note that any extras that were included with the Intent at that point will *not* be seen here. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/android/os/IBinder` | Return an IBinder through which clients can call on to the service. <br /> |

### onGetSupportedVoiceActions

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public Set<String> onGetSupportedVoiceActions (Set<String> voiceActions)
```

Request to query for what extended voice actions this service supports. This method will
be called when the system checks the supported actions of this
`https://developer.android.com/reference/android/service/voice/VoiceInteractionService`. Supported actions may be delivered to
`https://developer.android.com/reference/android/service/voice/VoiceInteractionSession` later to request a session to perform an action.

Voice actions are defined in support libraries and could vary based on platform context.
For example, car related voice actions will be defined in car support libraries.

<br />

| Parameters ||
|---|---|
| `voiceActions` | `Set`: A set of checked voice actions. This value cannot be `null`. <br /> |

| Returns ||
|---|---|
| `https://developer.android.com/reference/java/util/Set<https://developer.android.com/reference/java/lang/String>` | Returns a subset of checked voice actions. Additional voice actions in the returned set will be ignored. Returns empty set if no actions are supported. This value cannot be `null`. <br /> |

### onLaunchVoiceAssistFromKeyguard

Added in [API level 23](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void onLaunchVoiceAssistFromKeyguard ()
```

Called when a user has activated an affordance to launch voice assist from the Keyguard.

This method will only be called if the VoiceInteractionService has set
`https://developer.android.com/reference/android/R.attr#supportsLaunchVoiceAssistFromKeyguard` and the Keyguard is showing.

A valid implementation must start a new activity that should use `https://developer.android.com/reference/android/view/WindowManager.LayoutParams#FLAG_SHOW_WHEN_LOCKED` to display
on top of the lock screen.

<br />

<br />

### onPrepareToShowSession

Added in [API level 34](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void onPrepareToShowSession (Bundle args, 
                int flags)
```

Notify the interactor when the system prepares to show session. The system is going to
bind the session service.

<br />

| Parameters ||
|---|---|
| `args` | `Bundle`: The arguments that were supplied to `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)`. It always includes `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#KEY_SHOW_SESSION_ID`. This value cannot be `null`. <br /> |
| `flags` | `int`: The show flags originally provided to `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)`. <br /> |

**See also:**

- `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onShowSessionFailed(android.os.Bundle)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#onShow(android.os.Bundle,%20int)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#show(android.os.Bundle,%20int)`

### onReady

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void onReady ()
```

Called during service initialization to tell you when the system is ready
to receive interaction from it. You should generally do initialization here
rather than in `https://developer.android.com/reference/android/app/Service#onCreate()`. Methods such as `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)` will
not be operational until this point.

Note: Under some circumstances, it is possible for `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onReady()` to be called after
`https://developer.android.com/reference/android/app/Service#onDestroy()` has been called. This can happen in cases where the system is in the
process of shutting down the service, but the `IVoiceInteractionManagerService`
still sends a final "ready" signal. Therefore, implementations must be prepared for
`https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onReady()` to be called even after `https://developer.android.com/reference/android/app/Service#onDestroy()`, and should not rely on a
fixed lifecycle order.

<br />

### onShowSessionFailed

Added in [API level 34](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void onShowSessionFailed (Bundle args)
```

Called when the show session failed. E.g. When the system bound the session service failed.

<br />

| Parameters ||
|---|---|
| `args` | `Bundle`: Additional info about the show session attempt that failed. For now, includes `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#KEY_SHOW_SESSION_ID`. This value cannot be `null`. <br /> |

**See also:**

- `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#showSession(android.os.Bundle,%20int)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onPrepareToShowSession(android.os.Bundle,%20int)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#onShow(android.os.Bundle,%20int)`
- `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#show(android.os.Bundle,%20int)`

### onShutdown

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void onShutdown ()
```

Called during service de-initialization to tell you when the system is shutting the
service down.
At this point this service may no longer be the active `https://developer.android.com/reference/android/service/voice/VoiceInteractionService`.

Note: After this method is called, it is possible for other methods on this service
to be called, including `https://developer.android.com/reference/android/service/voice/VoiceInteractionService#onReady()`. Implementations should be prepared to handle
this case gracefully.

<br />

### setDisabledShowContext

Added in [API level 23](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void setDisabledShowContext (int flags)
```

Set contextual options you would always like to have disabled when a session
is shown. The flags may be any combination of
`https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#SHOW_WITH_ASSIST` and
`https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#SHOW_WITH_SCREENSHOT`.

<br />

| Parameters ||
|---|---|
| `flags` | `int` <br /> |

### setInvocationEffectEnabled

Added in [version 36.1](https://developer.android.com/topic/libraries/support-library/revisions)

```
public final void setInvocationEffectEnabled (boolean enabled)
```

Sets the enabled state for the invocation effect, a graphical indication displayed when a
voice session is launched by the system.

This effect is specifically triggered when a voice session is initiated via a dedicated
system entry point, e.g. by long-pressing the power button to activate the current
`https://developer.android.com/reference/android/service/voice/VoiceInteractionService`. It does not apply to voice sessions
started by general `https://developer.android.com/reference/android/content/Intent#ACTION_ASSIST` intents from arbitrary applications.

**Controlling the Effect and Persistence:**
The `https://developer.android.com/reference/android/service/voice/VoiceInteractionService` (the API caller) controls this
setting. The choice (enabled or disabled) made through this method is persisted by SystemUI
for the current user and their selected assistant. This allows the setting to be remembered
across device reboots or if the same `https://developer.android.com/reference/android/service/voice/VoiceInteractionService`
is restarted for that specific user and assistant combination.

**Default State and Behavior on Context Change:**

- The invocation effect is **disabled by default**.
- If the current user changes, or if the selected assistant for that user changes, any previously persisted setting for a different user/assistant combination will not automatically apply to the new context.
- In such new contexts (e.g., a new user or a change in the selected assistant), or if this method has not been explicitly called to enable the effect for the current context, the effect will remain **disabled** (its default state).
- To enable the effect, or to ensure a specific state (enabled or disabled) is applied, the `https://developer.android.com/reference/android/service/voice/VoiceInteractionService` **must call this method**. It is strongly recommended to do so every time the service becomes active to assert the intended state for the current operational context.

**System Conditions:**
SystemUI will honor the state set by this method for the invocation effect, provided other
system-level conditions are met, such as the correct hardware gesture for invocation
(e.g., power button long-press) being detected. Note that the actual visualization of this
effect is contingent on the specific SystemUI implementation; some variants, such as those on
automotive or television platforms, may not have a visual representation for this effect.

<br />

| Parameters ||
|---|---|
| `enabled` | `boolean`: `true` to enable the invocation effect for the current user and assistant, `false` to disable it. This state is persisted by SystemUI. <br /> |

| Throws ||
|---|---|
| `https://developer.android.com/reference/java/lang/SecurityException` | if the caller is not the current active `https://developer.android.com/reference/android/service/voice/VoiceInteractionService`. |

### setUiHints

Added in [API level 29](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public final void setUiHints (Bundle hints)
```

Provide hints to be reflected in the system UI.

<br />

| Parameters ||
|---|---|
| `hints` | `Bundle`: Arguments used to show UI. This value cannot be `null`. <br /> |

### showSession

Added in [API level 23](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
public void showSession (Bundle args, 
                int flags)
```

Request that the associated `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession` be
shown to the user, starting it if necessary.

<br />

| Parameters ||
|---|---|
| `args` | `Bundle`: Arbitrary arguments that will be propagated to the session. <br /> |
| `flags` | `int`: Indicates additional optional behavior that should be performed. May be any combination of `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#SHOW_WITH_ASSIST` and `https://developer.android.com/reference/android/service/voice/VoiceInteractionSession#SHOW_WITH_SCREENSHOT` to request that the system generate and deliver assist data on the current foreground app as part of showing the session UI. <br /> |

## Protected methods

### dump

Added in [API level 21](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)

```
protected void dump (FileDescriptor fd, 
                PrintWriter pw, 
                String[] args)
```

Print the Service's state into the given stream. This gets invoked if
you run "adb shell dumpsys activity service \<yourservicename\>"
(note that for this command to work, the service must be running, and
you must specify a fully-qualified service name).
This is distinct from "dumpsys \<servicename\>", which only works for
named system services and which invokes the `https://developer.android.com/reference/android/os/IBinder#dump(java.io.FileDescriptor,%20java.lang.String[])` method
on the `https://developer.android.com/reference/android/os/IBinder` interface registered with ServiceManager.

<br />

| Parameters ||
|---|---|
| `fd` | `FileDescriptor`: The raw file descriptor that the dump is being sent to. <br /> |
| `pw` | `PrintWriter`: The PrintWriter to which you should dump your state. This will be closed for you after you return. <br /> |
| `args` | `String`: additional arguments to the dump request. <br /> |