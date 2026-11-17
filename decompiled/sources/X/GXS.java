package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public interface GXS {
    boolean allowBluetoothOverrideSpeakerPreference();

    boolean changeAudioToHeadsetWhenHeadsetIsOn();

    boolean closeAssetFileDescriptor();

    boolean countScoRequestedAsBluetoothConnected();

    boolean enableAsyncBluetoothSco();

    boolean enableAsyncBluetoothToggle();

    boolean enableAsyncDevices();

    boolean enableAsyncRelease();

    boolean enableAsyncReset();

    boolean enableAsyncSetDataSource();

    boolean enableAudioRouteChangeProgress();

    boolean enableAudioRouteFailureToast();

    boolean enableCatchListenIllegalStateException();

    boolean enableClearCommunicationDeviceFixes();

    boolean enableCompressedRawToneFallback();

    boolean enableOnVolumeChangeOnBackgroundThread();

    boolean enableReplayRouteOnEndpointsAvailable();

    boolean enableSelectCommunicationDeviceFixes();

    boolean enableSetVideoCallFix();

    boolean enableSpeakerFailureRetry();

    boolean enableSpeakerForValidBtDisconnect();

    boolean fallBackWhenBluetoothUnusable();

    boolean fixAudioRouteChange();

    /* renamed from: getSetAsyncTurnOnVideoSpeakerphoneExecutor */
    ExecutorService mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor();

    /* renamed from: getSetAudioModeExecutor */
    ExecutorService mo1795getSetAudioModeExecutor();

    boolean invokeAudioRouteHealerOnBackgroundThread();

    boolean invokeChangeAudioOnAudioOutputUpdate();

    boolean isAsyncSelfHealerEnabled();

    boolean isAudioGoDarkTimelineUpdateEnabled();

    boolean isRequestAudioFocusAsyncEnabled();

    boolean offloadSetMicrophoneMute();

    boolean preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable();

    boolean preventAudioProxyRouteOverwrites();

    boolean preventSpeakerphoneWhileBluetoothIsOn();

    long replayRouteOnEndpointsAvailableTimeoutMs();

    boolean rtcBluetoothCheckEnabled();

    boolean setupAndTeardownAudioManagerExternally();

    boolean shouldSkipBluetoothScoForCall();

    boolean shouldUseAudioOutputManagerAPIUpdate();

    boolean shouldUseCustomAudioModule();

    boolean shouldUseMediaPlayerReset();

    boolean shouldUseRsysAudio();

    int speakerFailureMaxRetries();

    boolean useCachedSpeakerStateInCleanAudio();
}
