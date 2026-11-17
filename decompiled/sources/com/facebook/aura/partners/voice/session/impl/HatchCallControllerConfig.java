package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;
import X.C9639GWl;
import X.CEV;
import X.FGI;
import X.G8R;
import X.G8S;
import X.GTn;
import X.GXS;
import android.content.Context;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public final class HatchCallControllerConfig {
    public final String appId;
    public final G8S appOverlayConfigLayer;
    public final Context context;
    public final String deviceId;
    public final G8S mobileConfigLayer;
    public final C9639GWl sgEdgeVipEndpoint;
    public final C9639GWl sgVipEndpoint;

    public HatchCallControllerConfig(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        this.appId = "4331325740476680";
        this.deviceId = AuraDeviceId.INSTANCE.get();
        this.mobileConfigLayer = new G8S() { // from class: com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig$mobileConfigLayer$1
            @Override // X.G8S
            public long fetchMC(long j) {
                return -1L;
            }

            @Override // X.G8S
            public G8R getReporter() {
                return new G8R() { // from class: com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig$mobileConfigLayer$1$getReporter$1
                    public final void report(String str, String str2) {
                    }
                };
            }

            @Override // X.G8S
            public String getSoftErrorCategory() {
                return VoiceSessionHelpers.THREAD_ENTRYPOINT;
            }

            @Override // X.G8S
            public void logMCExposure(long j) {
            }
        };
        this.appOverlayConfigLayer = new HatchAppOverlayConfigLayer();
        this.sgVipEndpoint = new C9639GWl();
        this.sgEdgeVipEndpoint = new C9639GWl();
    }

    public ScheduledExecutorService createExecutor(final String str) {
        C7384Etj.A0Y(str, 0);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig.createExecutor.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, FGI.A0M("hatch-rp-", str));
            }
        });
        C7384Etj.A0U(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public String getLogCacheDirectory(Context context) throws IOException {
        C7384Etj.A0Y(context, 0);
        File cacheDir = context.getCacheDir();
        C7384Etj.A0U(cacheDir);
        String canonicalPath = CEV.A00(cacheDir, "HatchRsysLogs").getCanonicalPath();
        C7384Etj.A0U(canonicalPath);
        return canonicalPath;
    }

    public void onSdkCreate(GTn gTn) {
        C7384Etj.A0Y(gTn, 0);
        gTn.A04 = true;
        gTn.A01 = DevXAgentApi.CProxy.createApi();
    }

    public GXS createAudioExperimentConfig() {
        return new GXS() { // from class: com.facebook.aura.partners.voice.session.impl.HatchCallControllerConfig.createAudioExperimentConfig.1
            @Override // X.GXS
            public /* bridge */ boolean allowBluetoothOverrideSpeakerPreference() {
                return false;
            }

            @Override // X.GXS
            public boolean changeAudioToHeadsetWhenHeadsetIsOn() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean closeAssetFileDescriptor() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean countScoRequestedAsBluetoothConnected() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAsyncBluetoothSco() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAsyncBluetoothToggle() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAsyncDevices() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableAsyncRelease() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableAsyncReset() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableAsyncSetDataSource() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableAudioRouteChangeProgress() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableAudioRouteFailureToast() {
                return false;
            }

            @Override // X.GXS
            public boolean enableCatchListenIllegalStateException() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableClearCommunicationDeviceFixes() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableCompressedRawToneFallback() {
                return false;
            }

            @Override // X.GXS
            public boolean enableOnVolumeChangeOnBackgroundThread() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableReplayRouteOnEndpointsAvailable() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableSelectCommunicationDeviceFixes() {
                return false;
            }

            @Override // X.GXS
            public boolean enableSetVideoCallFix() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableSpeakerFailureRetry() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean enableSpeakerForValidBtDisconnect() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean fallBackWhenBluetoothUnusable() {
                return false;
            }

            @Override // X.GXS
            public boolean fixAudioRouteChange() {
                return false;
            }

            public Void getSetAsyncTurnOnVideoSpeakerphoneExecutor() {
                return null;
            }

            public Void getSetAudioModeExecutor() {
                return null;
            }

            @Override // X.GXS
            public boolean invokeAudioRouteHealerOnBackgroundThread() {
                return false;
            }

            @Override // X.GXS
            public boolean invokeChangeAudioOnAudioOutputUpdate() {
                return false;
            }

            @Override // X.GXS
            public boolean isAsyncSelfHealerEnabled() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean isAudioGoDarkTimelineUpdateEnabled() {
                return false;
            }

            @Override // X.GXS
            public boolean isRequestAudioFocusAsyncEnabled() {
                return false;
            }

            @Override // X.GXS
            public boolean offloadSetMicrophoneMute() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable() {
                return false;
            }

            @Override // X.GXS
            public boolean preventAudioProxyRouteOverwrites() {
                return true;
            }

            @Override // X.GXS
            public /* bridge */ boolean preventSpeakerphoneWhileBluetoothIsOn() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ long replayRouteOnEndpointsAvailableTimeoutMs() {
                return 5000L;
            }

            @Override // X.GXS
            public boolean rtcBluetoothCheckEnabled() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean setupAndTeardownAudioManagerExternally() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean shouldSkipBluetoothScoForCall() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ boolean shouldUseAudioOutputManagerAPIUpdate() {
                return false;
            }

            @Override // X.GXS
            public boolean shouldUseCustomAudioModule() {
                return false;
            }

            @Override // X.GXS
            public boolean shouldUseMediaPlayerReset() {
                return false;
            }

            @Override // X.GXS
            public boolean shouldUseRsysAudio() {
                return false;
            }

            @Override // X.GXS
            public /* bridge */ int speakerFailureMaxRetries() {
                return 3;
            }

            @Override // X.GXS
            public /* bridge */ boolean useCachedSpeakerStateInCleanAudio() {
                return false;
            }

            @Override // X.GXS
            /* renamed from: getSetAsyncTurnOnVideoSpeakerphoneExecutor, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ ExecutorService mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor() {
                return null;
            }

            @Override // X.GXS
            /* renamed from: getSetAudioModeExecutor, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ ExecutorService mo1795getSetAudioModeExecutor() {
                return null;
            }
        };
    }

    public String getAppId() {
        return this.appId;
    }

    public G8S getAppOverlayConfigLayer() {
        return this.appOverlayConfigLayer;
    }

    public /* bridge */ File getCallSummaryDirectory(Context context) {
        return null;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public G8S getMobileConfigLayer() {
        return this.mobileConfigLayer;
    }

    public C9639GWl getSgEdgeVipEndpoint() {
        return this.sgEdgeVipEndpoint;
    }

    public C9639GWl getSgVipEndpoint() {
        return this.sgVipEndpoint;
    }
}
