package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC7607F5u;
import X.AbstractC9259GBm;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C1BN;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C56z;
import X.C57l;
import X.C57m;
import X.C60O;
import X.C7384Etj;
import X.C8eO;
import X.C9591GQq;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GSV;
import X.GTS;
import X.GV7;
import X.GVn;
import X.GX5;
import X.GXO;
import X.GXS;
import X.GXX;
import X.Hok;
import X.HpX;
import X.Hq2;
import X.HqE;
import X.Hr6;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.Hx3;
import X.Hxb;
import X.Hy1;
import X.HzP;
import X.InterfaceC05673vm;
import X.InterfaceC9637GWh;
import X.InterfaceC9638GWk;
import X.RunnableC9620GSe;
import android.content.Context;
import com.facebook.aura.analytics.impl.AuraXNativeHolderProvider;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.partners.voice.gating.VoiceCallAudioStream;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.rp.platform.calling.CallControllerImpl;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.metaaivoicestate.gen.ClientInstruction;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController implements Hr6 {
    public static final long ORPHAN_SESSION_END_TIMEOUT_MS = 60000;
    public static final long SESSION_END_CONFIRM_TIMEOUT_MS = 10000;
    public static final String TAG = "HatchRTSessionController";
    public volatile C57m _currentSession;
    public final String accessToken;
    public volatile VoiceCallAccessory accessory;
    public final F0C accessoryDelegate$delegate;
    public volatile C57m accessorySession;
    public volatile GX5 androidAudioManager;
    public final Object audioLock;
    public final F0C callController$delegate;
    public final HatchCallControllerConfig config;
    public final F0C connectFunnelProxy$delegate;
    public final Context context;
    public final AbstractC9259GBm coroutineDispatcher;
    public volatile GXO currentAudioProxy;
    public final Set<C57m> detachedSessions;
    public final AtomicBoolean didRegisterUser;
    public final GXS externalAudioManagerConfig;
    public final HatchGatewayConnection gateway;
    public final HatchCallJoinContext joinContext;
    public final F0C<HatchWsSignalingService> lazyHatchWsSignalingService;
    public final HatchRealTimeSessionController$mcProvider$1 mcProvider;
    public final F0C metaAiRsysSdk$delegate;
    public HatchMuxingSignalingService muxingSignalingService;
    public volatile G0U<? super C57m, Unit> onOrphanedSessionEnded;
    public volatile G0U<? super C57m, Unit> onOrphanedSessionStarted;
    public volatile G0U<? super String, Unit> onStartPhase;
    public final C3UX orphanScope;
    public final WeakHashMap<C57m, Long> orphanedSessions;
    public AttachedSpeech preConnectSpeech;
    public String preConnectSpeechCallId;
    public final Object preConnectSpeechLock;
    public final GXS proxyAudioManagerConfig;
    public final ScheduledExecutorService proxyCallbackExecutor;
    public volatile InterfaceC9637GWh routePinListener;
    public final F0C rsysDelegate$delegate;
    public final Object signalingLock;
    public final String userId;
    public final F0C xAnalyticsProvider$delegate;
    public static final Companion Companion = new Companion();
    public static final F0C<ScheduledExecutorService> audioStateExecutor$delegate = AbstractC5321DgF.A03(HatchRealTimeSessionController$Companion$audioStateExecutor$2.INSTANCE);

    public final class AttachedSpeech {
        public final PreConnectSpeechBuffer buffer;
        public final String callId;

        public final PreConnectSpeechBuffer getBuffer() {
            return this.buffer;
        }

        public final String getCallId() {
            return this.callId;
        }

        public AttachedSpeech(String str, PreConnectSpeechBuffer preConnectSpeechBuffer) {
            AnonymousClass003.A0u(str, preConnectSpeechBuffer);
            this.callId = str;
            this.buffer = preConnectSpeechBuffer;
        }
    }

    public final class Companion {
        private final ScheduledExecutorService getAudioStateExecutor() {
            return HatchRealTimeSessionController.audioStateExecutor$delegate.getValue();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$audioManagerConfig$1, reason: invalid class name */
    public final class AnonymousClass1 implements GXS {
        public final /* synthetic */ GVn $$delegate_0 = new GVn();
        public final /* synthetic */ boolean $skipsBluetoothSco;
        public final /* synthetic */ boolean $usesOutputManagerV2;

        public AnonymousClass1(boolean z, boolean z2) {
            this.$skipsBluetoothSco = z;
            this.$usesOutputManagerV2 = z2;
        }

        @Override // X.GXS
        public boolean allowBluetoothOverrideSpeakerPreference() {
            return false;
        }

        @Override // X.GXS
        public boolean changeAudioToHeadsetWhenHeadsetIsOn() {
            return false;
        }

        @Override // X.GXS
        public boolean closeAssetFileDescriptor() {
            return false;
        }

        @Override // X.GXS
        public boolean countScoRequestedAsBluetoothConnected() {
            return true;
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
            return true;
        }

        @Override // X.GXS
        public boolean enableAsyncRelease() {
            return false;
        }

        @Override // X.GXS
        public boolean enableAsyncReset() {
            return false;
        }

        @Override // X.GXS
        public boolean enableAsyncSetDataSource() {
            return false;
        }

        @Override // X.GXS
        public boolean enableAudioRouteChangeProgress() {
            return false;
        }

        @Override // X.GXS
        public boolean enableAudioRouteFailureToast() {
            return false;
        }

        @Override // X.GXS
        public boolean enableCatchListenIllegalStateException() {
            return false;
        }

        @Override // X.GXS
        public boolean enableClearCommunicationDeviceFixes() {
            return false;
        }

        @Override // X.GXS
        public boolean enableCompressedRawToneFallback() {
            return false;
        }

        @Override // X.GXS
        public boolean enableOnVolumeChangeOnBackgroundThread() {
            return true;
        }

        @Override // X.GXS
        public boolean enableReplayRouteOnEndpointsAvailable() {
            return false;
        }

        @Override // X.GXS
        public boolean enableSelectCommunicationDeviceFixes() {
            return true;
        }

        @Override // X.GXS
        public boolean enableSetVideoCallFix() {
            return false;
        }

        @Override // X.GXS
        public boolean enableSpeakerFailureRetry() {
            return false;
        }

        @Override // X.GXS
        public boolean enableSpeakerForValidBtDisconnect() {
            return false;
        }

        @Override // X.GXS
        public boolean fallBackWhenBluetoothUnusable() {
            return true;
        }

        @Override // X.GXS
        public boolean fixAudioRouteChange() {
            return true;
        }

        @Override // X.GXS
        /* renamed from: getSetAsyncTurnOnVideoSpeakerphoneExecutor */
        public ExecutorService mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor() {
            return null;
        }

        @Override // X.GXS
        /* renamed from: getSetAudioModeExecutor */
        public ExecutorService mo1795getSetAudioModeExecutor() {
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
        public boolean isAudioGoDarkTimelineUpdateEnabled() {
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
        public boolean preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable() {
            return false;
        }

        @Override // X.GXS
        public boolean preventAudioProxyRouteOverwrites() {
            return false;
        }

        @Override // X.GXS
        public boolean preventSpeakerphoneWhileBluetoothIsOn() {
            return true;
        }

        @Override // X.GXS
        public long replayRouteOnEndpointsAvailableTimeoutMs() {
            return 5000L;
        }

        @Override // X.GXS
        public boolean rtcBluetoothCheckEnabled() {
            return false;
        }

        @Override // X.GXS
        public boolean setupAndTeardownAudioManagerExternally() {
            return false;
        }

        @Override // X.GXS
        public boolean shouldSkipBluetoothScoForCall() {
            return this.$skipsBluetoothSco;
        }

        @Override // X.GXS
        public boolean shouldUseAudioOutputManagerAPIUpdate() {
            return this.$usesOutputManagerV2;
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
        public int speakerFailureMaxRetries() {
            return 3;
        }

        @Override // X.GXS
        public boolean useCachedSpeakerStateInCleanAudio() {
            return false;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController", f = "HatchRealTimeSessionController.kt", l = {439}, m = "awaitDetachedSessionTeardown", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$1, reason: invalid class name and case insensitive filesystem */
    public final class C132331 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132331(HtJ<? super C132331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRealTimeSessionController.this.awaitDetachedSessionTeardown(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$close$1", f = "HatchRealTimeSessionController.kt", l = {740}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$close$1, reason: invalid class name and case insensitive filesystem */
    public final class C132341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C57m $session;
        public final /* synthetic */ boolean $shouldUnregister;
        public int label;
        public final /* synthetic */ HatchRealTimeSessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132341(boolean z, HatchRealTimeSessionController hatchRealTimeSessionController, C57m c57m, HtJ<? super C132341> htJ) {
            super(2, htJ);
            this.$shouldUnregister = z;
            this.this$0 = hatchRealTimeSessionController;
            this.$session = c57m;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132341(this.$shouldUnregister, this.this$0, this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CallControllerImpl callController = this.$shouldUnregister ? this.this$0.getCallController() : null;
                C57m c57m = this.$session;
                String str = this.this$0.userId;
                this.label = 1;
                if (HatchRealTimeSessionTeardownKt.tearDownRealTimeSession(callController, c57m, str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.coroutineDispatcher.close();
            this.this$0.proxyCallbackExecutor.shutdown();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132341) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1, reason: invalid class name and case insensitive filesystem */
    public final class C132351 implements InterfaceC9637GWh {
        public final /* synthetic */ GXO $proxy;
        public GXX lastOutput;
        public final AtomicBoolean reasserting = C60O.A1E();

        public C132351(GXO gxo) {
            this.$proxy = gxo;
        }

        @Override // X.InterfaceC9637GWh
        public void audioOutputChanged() {
            if (this.reasserting.compareAndSet(false, true)) {
                try {
                    ExecutorService ioExecutor = AuraExecutors.INSTANCE.getIoExecutor();
                    final HatchRealTimeSessionController hatchRealTimeSessionController = HatchRealTimeSessionController.this;
                    final GXO gxo = this.$proxy;
                    ioExecutor.execute(new Runnable() { // from class: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1$audioOutputChanged$1
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x0077, Merged into TryCatch #1 {all -> 0x007a, blocks: (B:3:0x0001, B:4:0x0009, B:39:0x006e, B:43:0x0078, B:44:0x0079, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:11:0x0020, B:13:0x0026, B:15:0x002a, B:17:0x0035, B:19:0x003b, B:21:0x0043, B:25:0x004f, B:27:0x0053, B:30:0x005b, B:35:0x0065, B:38:0x006b, B:28:0x0056, B:22:0x0048, B:29:0x0059), top: B:50:0x0001 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: all -> 0x0077, Merged into TryCatch #1 {all -> 0x007a, blocks: (B:3:0x0001, B:4:0x0009, B:39:0x006e, B:43:0x0078, B:44:0x0079, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:11:0x0020, B:13:0x0026, B:15:0x002a, B:17:0x0035, B:19:0x003b, B:21:0x0043, B:25:0x004f, B:27:0x0053, B:30:0x005b, B:35:0x0065, B:38:0x006b, B:28:0x0056, B:22:0x0048, B:29:0x0059), top: B:50:0x0001 }] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[ADDED_TO_REGION] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r8 = this;
                                r3 = 0
                                com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController r2 = r1     // Catch: java.lang.Throwable -> L7a
                                java.lang.Object r6 = r2.audioLock     // Catch: java.lang.Throwable -> L7a
                                X.GXO r1 = r3     // Catch: java.lang.Throwable -> L7a
                                com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1 r7 = r2     // Catch: java.lang.Throwable -> L7a
                                monitor-enter(r6)     // Catch: java.lang.Throwable -> L7a
                                X.57m r0 = r2._currentSession     // Catch: java.lang.Throwable -> L77
                                if (r0 == 0) goto L6e
                                X.GXO r0 = r2.currentAudioProxy     // Catch: java.lang.Throwable -> L77
                                if (r0 != r1) goto L6e
                                X.GX5 r0 = r1.A0B     // Catch: java.lang.Throwable -> L77
                                X.GX4 r5 = r0.A01     // Catch: java.lang.Throwable -> L77
                                X.GXX r4 = r5.A0Q()     // Catch: java.lang.Throwable -> L77
                                boolean r0 = r5.A0Z()     // Catch: java.lang.Throwable -> L77
                                if (r0 != 0) goto L59
                                boolean r0 = r5.A0Y()     // Catch: java.lang.Throwable -> L77
                                if (r0 != 0) goto L59
                                boolean r0 = r5 instanceof X.GXE     // Catch: java.lang.Throwable -> L77
                                if (r0 == 0) goto L48
                                r1 = r5
                                X.GXE r1 = (X.GXE) r1     // Catch: java.lang.Throwable -> L77
                                X.GXS r0 = r1.A08     // Catch: java.lang.Throwable -> L77
                                boolean r0 = r0.shouldSkipBluetoothScoForCall()     // Catch: java.lang.Throwable -> L77
                                if (r0 != 0) goto L4f
                                X.GXK r1 = r1.A07     // Catch: java.lang.Throwable -> L77
                                boolean r0 = r1.A09     // Catch: java.lang.Throwable -> L77
                                if (r0 != 0) goto L4f
                                X.GXF r1 = r1.A05     // Catch: java.lang.Throwable -> L77
                                boolean r0 = r1.A05()     // Catch: java.lang.Throwable -> L77
                                if (r0 != 0) goto L59
                                boolean r0 = X.GXF.A01(r1)     // Catch: java.lang.Throwable -> L77
                                goto L4c
                            L48:
                                boolean r0 = r5.A0Y()     // Catch: java.lang.Throwable -> L77
                            L4c:
                                if (r0 == 0) goto L4f
                                goto L59
                            L4f:
                                boolean r0 = r5.aomIsHeadsetAttached     // Catch: java.lang.Throwable -> L77
                                if (r0 == 0) goto L56
                                X.GXX r2 = X.GXX.A04     // Catch: java.lang.Throwable -> L77
                                goto L5b
                            L56:
                                X.GXX r2 = X.GXX.A05     // Catch: java.lang.Throwable -> L77
                                goto L5b
                            L59:
                                X.GXX r2 = X.GXX.A02     // Catch: java.lang.Throwable -> L77
                            L5b:
                                X.GXX r0 = r7.lastOutput     // Catch: java.lang.Throwable -> L77
                                X.GXX r1 = X.GXX.A02     // Catch: java.lang.Throwable -> L77
                                if (r0 != r1) goto L64
                                r0 = 1
                                if (r4 != r1) goto L65
                            L64:
                                r0 = 0
                            L65:
                                r7.lastOutput = r4     // Catch: java.lang.Throwable -> L77
                                if (r4 != r2) goto L6b
                                if (r0 == 0) goto L6e
                            L6b:
                                r5.A0c(r2)     // Catch: java.lang.Throwable -> L77
                            L6e:
                                monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
                                com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1 r0 = r2
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.reasserting
                                r0.set(r3)
                                return
                            L77:
                                r0 = move-exception
                                monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
                                throw r0     // Catch: java.lang.Throwable -> L7a
                            L7a:
                                r1 = move-exception
                                com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1 r0 = r2
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.reasserting
                                r0.set(r3)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$createRoutePinListener$1$audioOutputChanged$1.run():void");
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    this.reasserting.set(false);
                } catch (Throwable th) {
                    this.reasserting.set(false);
                    throw th;
                }
            }
        }

        public String getLogName() {
            return "HatchRoutePin";
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2", f = "HatchRealTimeSessionController.kt", l = {381}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $reason;
        public final /* synthetic */ C57m $session;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$1", f = "HatchRealTimeSessionController.kt", l = {382, 383}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ C27k<Boolean> $endJob;
            public final /* synthetic */ C57m $session;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$1$1", f = "HatchRealTimeSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03061 extends AbstractC07127nr implements G0V<InterfaceC05673vm, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C03061(HtJ<? super C03061> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C03061 c03061 = new C03061(htJ);
                    c03061.L$0 = obj;
                    return c03061;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = this.L$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(obj2 instanceof C57l);
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC05673vm interfaceC05673vm, HtJ<? super Boolean> htJ) {
                    C03061 c03061 = new C03061(htJ);
                    c03061.L$0 = interfaceC05673vm;
                    return c03061.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C27k<Boolean> c27k, C57m c57m, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$endJob = c27k;
                this.$session = c57m;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$endJob, this.$session, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                boolean z = true;
                if (i == 0) {
                    Hwg.A00(obj);
                    C27k<Boolean> c27k = this.$endJob;
                    this.label = 1;
                    obj = C3cG.A0W(c27k, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return Boolean.valueOf(z);
                    }
                    Hwg.A00(obj);
                }
                if (AnonymousClass001.A1X(obj)) {
                    C1BN<InterfaceC05673vm> c1bnADx = this.$session.ADx();
                    C03061 c03061 = new C03061(null);
                    this.label = 2;
                    if (AbstractC9777Gfy.A00(this, c03061, c1bnADx) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, C57m c57m, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$reason = str;
            this.$session = c57m;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchRealTimeSessionController.this.new AnonymousClass2(this.$reason, this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnonymousClass001.A10(new HatchRealTimeSessionController$endSessionSafely$2$endJob$1(this.$reason, this.$session, null), HatchRealTimeSessionController.this.orphanScope), this.$session, null);
                this.L$0 = null;
                this.label = 1;
                obj = C3cI.A0S(anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Boolean.valueOf(C3cG.A1P(obj, true));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1", f = "HatchRealTimeSessionController.kt", l = {407}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C132361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $deadlineMs;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ C57m $session;
        public int I$0;
        public int label;
        public final /* synthetic */ HatchRealTimeSessionController this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1$1", f = "HatchRealTimeSessionController.kt", l = {410}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C03071 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ C57m $session;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1$1$1", f = "HatchRealTimeSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$quarantineSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03081 extends AbstractC07127nr implements G0V<InterfaceC05673vm, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C03081(HtJ<? super C03081> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C03081 c03081 = new C03081(htJ);
                    c03081.L$0 = obj;
                    return c03081;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = this.L$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(obj2 instanceof C57l);
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC05673vm interfaceC05673vm, HtJ<? super Boolean> htJ) {
                    C03081 c03081 = new C03081(htJ);
                    c03081.L$0 = interfaceC05673vm;
                    return c03081.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03071(C57m c57m, HtJ<? super C03071> htJ) {
                super(2, htJ);
                this.$session = c57m;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03071(this.$session, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<InterfaceC05673vm> c1bnADx = this.$session.ADx();
                    C03081 c03081 = new C03081(null);
                    this.label = 1;
                    if (AbstractC9777Gfy.A00(this, c03081, c1bnADx) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return true;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C03071(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132361(long j, HatchRealTimeSessionController hatchRealTimeSessionController, C57m c57m, String str, HtJ<? super C132361> htJ) {
            super(2, htJ);
            this.$deadlineMs = j;
            this.this$0 = hatchRealTimeSessionController;
            this.$session = c57m;
            this.$reason = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132361(this.$deadlineMs, this.this$0, this.$session, this.$reason, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    long jNanoTime = this.$deadlineMs - (System.nanoTime() / 1000000);
                    if (jNanoTime < 1) {
                        jNanoTime = 1;
                    }
                    C03071 c03071 = new C03071(this.$session, null);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = GAX.A01(this, c03071, jNanoTime);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (!C3cG.A1P(obj, true)) {
                    CFK.A06("HatchRTSessionController", C60O.A0r("Quarantined session timed out; releasing ownership (", this.$reason));
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0.onOrphanedSessionEnded.invoke(this.$session);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132361) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController", f = "HatchRealTimeSessionController.kt", l = {659, 679}, m = "startAccessorySession", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$startAccessorySession$1, reason: invalid class name and case insensitive filesystem */
    public final class C132371 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C132371(HtJ<? super C132371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRealTimeSessionController.this.startAccessorySession(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController", f = "HatchRealTimeSessionController.kt", l = {455, MC.frl_google_credential_manager.__CONFIG__, 483, 501, 526, 584, 608}, m = "startSession", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$startSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C132381 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public boolean Z$3;
        public int label;
        public /* synthetic */ Object result;

        public C132381(HtJ<? super C132381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRealTimeSessionController.this.startSession(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$startSession$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public final /* synthetic */ Object $audioModeOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Object obj) {
            super(1);
            this.$audioModeOwner = obj;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            DeviceCallStateTracker.INSTANCE.setOwnsAudioMode(this.$audioModeOwner, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$mcProvider$1] */
    public HatchRealTimeSessionController(Context context, String str, String str2, HatchGatewayConnection hatchGatewayConnection, HatchCallJoinContext hatchCallJoinContext) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(str, str2, hatchGatewayConnection, 1);
        C7384Etj.A0Y(hatchCallJoinContext, 4);
        this.context = context;
        this.userId = str;
        this.accessToken = str2;
        this.gateway = hatchGatewayConnection;
        this.joinContext = hatchCallJoinContext;
        this.onStartPhase = HatchRealTimeSessionController$onStartPhase$1.INSTANCE;
        this.onOrphanedSessionStarted = HatchRealTimeSessionController$onOrphanedSessionStarted$1.INSTANCE;
        this.onOrphanedSessionEnded = HatchRealTimeSessionController$onOrphanedSessionEnded$1.INSTANCE;
        this.config = new HatchCallControllerConfig(context);
        this.mcProvider = new Object() { // from class: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$mcProvider$1
            public boolean getBoolean(String str3) {
                return false;
            }

            public int getInt(String str3) {
                return 0;
            }

            public long getLong(String str3) {
                return 0L;
            }

            public String getString(String str3) {
                return "";
            }

            public boolean isGatingRouteChangeForwardingEnabled() {
                return false;
            }

            public boolean useSgAtEdge() {
                return false;
            }
        };
        this.callController$delegate = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$callController$2(this));
        this.lazyHatchWsSignalingService = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$lazyHatchWsSignalingService$1(this));
        this.signalingLock = C3cG.A0T();
        AuraExecutors auraExecutors = AuraExecutors.INSTANCE;
        this.coroutineDispatcher = new Hy1(auraExecutors.newSingleThreadExecutor("HatchRTSession"));
        this.proxyCallbackExecutor = auraExecutors.newSingleThreadScheduledExecutor("HatchRTProxy", null);
        this.proxyAudioManagerConfig = new GXS() { // from class: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$proxyAudioManagerConfig$1
            public final /* synthetic */ GVn $$delegate_0 = new GVn();

            @Override // X.GXS
            public boolean allowBluetoothOverrideSpeakerPreference() {
                return true;
            }

            @Override // X.GXS
            public boolean changeAudioToHeadsetWhenHeadsetIsOn() {
                return false;
            }

            @Override // X.GXS
            public boolean closeAssetFileDescriptor() {
                return false;
            }

            @Override // X.GXS
            public boolean countScoRequestedAsBluetoothConnected() {
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
            public boolean enableAsyncRelease() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAsyncReset() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAsyncSetDataSource() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAudioRouteChangeProgress() {
                return false;
            }

            @Override // X.GXS
            public boolean enableAudioRouteFailureToast() {
                return false;
            }

            @Override // X.GXS
            public boolean enableCatchListenIllegalStateException() {
                return false;
            }

            @Override // X.GXS
            public boolean enableClearCommunicationDeviceFixes() {
                return false;
            }

            @Override // X.GXS
            public boolean enableCompressedRawToneFallback() {
                return false;
            }

            @Override // X.GXS
            public boolean enableOnVolumeChangeOnBackgroundThread() {
                return false;
            }

            @Override // X.GXS
            public boolean enableReplayRouteOnEndpointsAvailable() {
                return false;
            }

            @Override // X.GXS
            public boolean enableSelectCommunicationDeviceFixes() {
                return false;
            }

            @Override // X.GXS
            public boolean enableSetVideoCallFix() {
                return false;
            }

            @Override // X.GXS
            public boolean enableSpeakerFailureRetry() {
                return false;
            }

            @Override // X.GXS
            public boolean enableSpeakerForValidBtDisconnect() {
                return false;
            }

            @Override // X.GXS
            public boolean fallBackWhenBluetoothUnusable() {
                return false;
            }

            @Override // X.GXS
            public boolean fixAudioRouteChange() {
                return false;
            }

            @Override // X.GXS
            /* renamed from: getSetAsyncTurnOnVideoSpeakerphoneExecutor */
            public ExecutorService mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor() {
                return null;
            }

            @Override // X.GXS
            /* renamed from: getSetAudioModeExecutor */
            public ExecutorService mo1795getSetAudioModeExecutor() {
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
            public boolean isAudioGoDarkTimelineUpdateEnabled() {
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
            public boolean preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable() {
                return true;
            }

            @Override // X.GXS
            public boolean preventAudioProxyRouteOverwrites() {
                return true;
            }

            @Override // X.GXS
            public boolean preventSpeakerphoneWhileBluetoothIsOn() {
                return false;
            }

            @Override // X.GXS
            public long replayRouteOnEndpointsAvailableTimeoutMs() {
                return 5000L;
            }

            @Override // X.GXS
            public boolean rtcBluetoothCheckEnabled() {
                return false;
            }

            @Override // X.GXS
            public boolean setupAndTeardownAudioManagerExternally() {
                return false;
            }

            @Override // X.GXS
            public boolean shouldSkipBluetoothScoForCall() {
                return false;
            }

            @Override // X.GXS
            public boolean shouldUseAudioOutputManagerAPIUpdate() {
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
            public int speakerFailureMaxRetries() {
                return 3;
            }

            @Override // X.GXS
            public boolean useCachedSpeakerStateInCleanAudio() {
                return false;
            }
        };
        this.externalAudioManagerConfig = new GXS(this) { // from class: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$externalAudioManagerConfig$1
            public final /* synthetic */ GXS $$delegate_0;

            @Override // X.GXS
            public boolean allowBluetoothOverrideSpeakerPreference() {
                return this.$$delegate_0.allowBluetoothOverrideSpeakerPreference();
            }

            @Override // X.GXS
            public boolean changeAudioToHeadsetWhenHeadsetIsOn() {
                return this.$$delegate_0.changeAudioToHeadsetWhenHeadsetIsOn();
            }

            @Override // X.GXS
            public boolean closeAssetFileDescriptor() {
                return this.$$delegate_0.closeAssetFileDescriptor();
            }

            @Override // X.GXS
            public boolean countScoRequestedAsBluetoothConnected() {
                return this.$$delegate_0.countScoRequestedAsBluetoothConnected();
            }

            @Override // X.GXS
            public boolean enableAsyncBluetoothSco() {
                return this.$$delegate_0.enableAsyncBluetoothSco();
            }

            @Override // X.GXS
            public boolean enableAsyncBluetoothToggle() {
                return this.$$delegate_0.enableAsyncBluetoothToggle();
            }

            @Override // X.GXS
            public boolean enableAsyncDevices() {
                return this.$$delegate_0.enableAsyncDevices();
            }

            @Override // X.GXS
            public boolean enableAsyncRelease() {
                return this.$$delegate_0.enableAsyncRelease();
            }

            @Override // X.GXS
            public boolean enableAsyncReset() {
                return this.$$delegate_0.enableAsyncReset();
            }

            @Override // X.GXS
            public boolean enableAsyncSetDataSource() {
                return this.$$delegate_0.enableAsyncSetDataSource();
            }

            @Override // X.GXS
            public boolean enableAudioRouteChangeProgress() {
                return this.$$delegate_0.enableAudioRouteChangeProgress();
            }

            @Override // X.GXS
            public boolean enableAudioRouteFailureToast() {
                return this.$$delegate_0.enableAudioRouteFailureToast();
            }

            @Override // X.GXS
            public boolean enableCatchListenIllegalStateException() {
                return this.$$delegate_0.enableCatchListenIllegalStateException();
            }

            @Override // X.GXS
            public boolean enableClearCommunicationDeviceFixes() {
                return this.$$delegate_0.enableClearCommunicationDeviceFixes();
            }

            @Override // X.GXS
            public boolean enableCompressedRawToneFallback() {
                return this.$$delegate_0.enableCompressedRawToneFallback();
            }

            @Override // X.GXS
            public boolean enableOnVolumeChangeOnBackgroundThread() {
                return this.$$delegate_0.enableOnVolumeChangeOnBackgroundThread();
            }

            @Override // X.GXS
            public boolean enableReplayRouteOnEndpointsAvailable() {
                return this.$$delegate_0.enableReplayRouteOnEndpointsAvailable();
            }

            @Override // X.GXS
            public boolean enableSelectCommunicationDeviceFixes() {
                return this.$$delegate_0.enableSelectCommunicationDeviceFixes();
            }

            @Override // X.GXS
            public boolean enableSetVideoCallFix() {
                return this.$$delegate_0.enableSetVideoCallFix();
            }

            @Override // X.GXS
            public boolean enableSpeakerFailureRetry() {
                return this.$$delegate_0.enableSpeakerFailureRetry();
            }

            @Override // X.GXS
            public boolean enableSpeakerForValidBtDisconnect() {
                return this.$$delegate_0.enableSpeakerForValidBtDisconnect();
            }

            @Override // X.GXS
            public boolean fallBackWhenBluetoothUnusable() {
                return this.$$delegate_0.fallBackWhenBluetoothUnusable();
            }

            @Override // X.GXS
            public boolean fixAudioRouteChange() {
                return this.$$delegate_0.fixAudioRouteChange();
            }

            @Override // X.GXS
            /* renamed from: getSetAsyncTurnOnVideoSpeakerphoneExecutor */
            public ExecutorService mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor() {
                return this.$$delegate_0.mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor();
            }

            @Override // X.GXS
            /* renamed from: getSetAudioModeExecutor */
            public ExecutorService mo1795getSetAudioModeExecutor() {
                return this.$$delegate_0.mo1795getSetAudioModeExecutor();
            }

            @Override // X.GXS
            public boolean invokeAudioRouteHealerOnBackgroundThread() {
                return this.$$delegate_0.invokeAudioRouteHealerOnBackgroundThread();
            }

            @Override // X.GXS
            public boolean invokeChangeAudioOnAudioOutputUpdate() {
                return this.$$delegate_0.invokeChangeAudioOnAudioOutputUpdate();
            }

            @Override // X.GXS
            public boolean isAsyncSelfHealerEnabled() {
                return this.$$delegate_0.isAsyncSelfHealerEnabled();
            }

            @Override // X.GXS
            public boolean isAudioGoDarkTimelineUpdateEnabled() {
                return this.$$delegate_0.isAudioGoDarkTimelineUpdateEnabled();
            }

            @Override // X.GXS
            public boolean isRequestAudioFocusAsyncEnabled() {
                return this.$$delegate_0.isRequestAudioFocusAsyncEnabled();
            }

            @Override // X.GXS
            public boolean offloadSetMicrophoneMute() {
                return this.$$delegate_0.offloadSetMicrophoneMute();
            }

            @Override // X.GXS
            public boolean preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable() {
                return this.$$delegate_0.preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable();
            }

            @Override // X.GXS
            public boolean preventAudioProxyRouteOverwrites() {
                return this.$$delegate_0.preventAudioProxyRouteOverwrites();
            }

            @Override // X.GXS
            public boolean preventSpeakerphoneWhileBluetoothIsOn() {
                return this.$$delegate_0.preventSpeakerphoneWhileBluetoothIsOn();
            }

            @Override // X.GXS
            public long replayRouteOnEndpointsAvailableTimeoutMs() {
                return this.$$delegate_0.replayRouteOnEndpointsAvailableTimeoutMs();
            }

            @Override // X.GXS
            public boolean rtcBluetoothCheckEnabled() {
                return this.$$delegate_0.rtcBluetoothCheckEnabled();
            }

            @Override // X.GXS
            public boolean setupAndTeardownAudioManagerExternally() {
                return true;
            }

            @Override // X.GXS
            public boolean shouldSkipBluetoothScoForCall() {
                return this.$$delegate_0.shouldSkipBluetoothScoForCall();
            }

            @Override // X.GXS
            public boolean shouldUseAudioOutputManagerAPIUpdate() {
                return this.$$delegate_0.shouldUseAudioOutputManagerAPIUpdate();
            }

            @Override // X.GXS
            public boolean shouldUseCustomAudioModule() {
                return this.$$delegate_0.shouldUseCustomAudioModule();
            }

            @Override // X.GXS
            public boolean shouldUseMediaPlayerReset() {
                return this.$$delegate_0.shouldUseMediaPlayerReset();
            }

            @Override // X.GXS
            public boolean shouldUseRsysAudio() {
                return this.$$delegate_0.shouldUseRsysAudio();
            }

            @Override // X.GXS
            public int speakerFailureMaxRetries() {
                return this.$$delegate_0.speakerFailureMaxRetries();
            }

            @Override // X.GXS
            public boolean useCachedSpeakerStateInCleanAudio() {
                return this.$$delegate_0.useCachedSpeakerStateInCleanAudio();
            }

            {
                this.$$delegate_0 = this.proxyAudioManagerConfig;
            }
        };
        this.rsysDelegate$delegate = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$rsysDelegate$2(this));
        this.metaAiRsysSdk$delegate = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$metaAiRsysSdk$2(this));
        this.xAnalyticsProvider$delegate = AbstractC5321DgF.A03(HatchRealTimeSessionController$xAnalyticsProvider$2.INSTANCE);
        this.connectFunnelProxy$delegate = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$connectFunnelProxy$2(this));
        this.accessoryDelegate$delegate = AbstractC7607F5u.A1A(null, new HatchRealTimeSessionController$accessoryDelegate$2(this));
        this.preConnectSpeechLock = C3cG.A0T();
        this.audioLock = C3cG.A0T();
        this.detachedSessions = C3cG.A0k();
        this.orphanedSessions = new WeakHashMap<>();
        this.orphanScope = Hxb.A02(AnonymousClass001.A0y().plus(new C8eO(null)));
        this.didRegisterUser = BV4.A12(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quarantineSession(C57m c57m, String str) {
        Long lValueOf;
        synchronized (this.audioLock) {
            lValueOf = null;
            if (this._currentSession == c57m) {
                this._currentSession = null;
            }
            this.detachedSessions.remove(c57m);
            if (!this.orphanedSessions.containsKey(c57m)) {
                lValueOf = Long.valueOf((System.nanoTime() / 1000000) + 60000);
                this.orphanedSessions.put(c57m, lValueOf);
            }
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            this.onOrphanedSessionStarted.invoke(c57m);
            CFK.A06("HatchRTSessionController", C60O.A0r("Quarantining voice session after unconfirmed teardown (", str));
            AnonymousClass001.A1J(new C132361(jLongValue, this, c57m, str, null), this.orphanScope);
        }
    }

    private final void teardownAudioLocked() {
        GXO gxo;
        PreConnectSpeechBuffer preConnectSpeechBufferDetachPreConnectSpeech = detachPreConnectSpeech(null);
        if (preConnectSpeechBufferDetachPreConnectSpeech != null) {
            preConnectSpeechBufferDetachPreConnectSpeech.discard();
        }
        InterfaceC9637GWh interfaceC9637GWh = this.routePinListener;
        if (interfaceC9637GWh != null && (gxo = this.currentAudioProxy) != null) {
            gxo.A0B.A01.A05.remove(interfaceC9637GWh);
        }
        this.routePinListener = null;
        GX5 gx5 = this.androidAudioManager;
        if (gx5 != null) {
            gx5.A01.A0S();
        }
        this.androidAudioManager = null;
        this.currentAudioProxy = null;
    }

    public final void detachSession(C57m c57m) {
        C7384Etj.A0Y(c57m, 0);
        synchronized (this.audioLock) {
            if (this._currentSession == c57m) {
                this._currentSession = null;
                if (!(c57m.ADx().getValue() instanceof C57l)) {
                    this.detachedSessions.add(c57m);
                }
            }
        }
    }

    public final void dropPreConnectSpeech(String str) {
        C7384Etj.A0Y(str, 0);
        PreConnectSpeechBuffer preConnectSpeechBufferDetachPreConnectSpeech = detachPreConnectSpeech(str);
        if (preConnectSpeechBufferDetachPreConnectSpeech != null) {
            preConnectSpeechBufferDetachPreConnectSpeech.discard();
        }
    }

    public final int injectPlayoutAudio(AudioFrame audioFrame) {
        G0U<? super AudioFrame, Integer> g0u;
        C7384Etj.A0Y(audioFrame, 0);
        C57m c57m = this._currentSession;
        if (c57m == null) {
            return 3;
        }
        C9591GQq c9591GQq = ((MetaAiRsysSdkRealTimeSession) c57m).A0C;
        if (c9591GQq.A0C == null || (g0u = c9591GQq.A0D) == null) {
            return 3;
        }
        return AnonymousClass001.A0F(g0u.invoke(audioFrame));
    }

    public final PreConnectSpeechBuffer preConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str) {
        PreConnectSpeechBuffer preConnectSpeechBuffer;
        C7384Etj.A0Y(str, 0);
        synchronized (this.preConnectSpeechLock) {
            AttachedSpeech attachedSpeech = this.preConnectSpeech;
            preConnectSpeechBuffer = null;
            if (attachedSpeech != null && str.equals(attachedSpeech.callId)) {
                preConnectSpeechBuffer = attachedSpeech.buffer;
            }
        }
        return preConnectSpeechBuffer;
    }

    public final boolean pushAccessoryAudio(short[] sArr, int i) {
        C7384Etj.A0Y(sArr, 0);
        return getAccessoryDelegate().pushMicrophone(sArr, i);
    }

    public final void setMicEnabled(C57m c57m, boolean z) {
        C7384Etj.A0Y(c57m, 0);
        if (c57m == this.accessorySession) {
            getAccessoryDelegate().micOpen = z;
        } else {
            c57m.Adk(z);
        }
    }

    public final void setOnOrphanedSessionEnded(G0U<? super C57m, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onOrphanedSessionEnded = g0u;
    }

    public final void setOnOrphanedSessionStarted(G0U<? super C57m, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onOrphanedSessionStarted = g0u;
    }

    public final void setOnStartPhase(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onStartPhase = g0u;
    }

    public final CapturedSpeech takePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str) {
        C7384Etj.A0Y(str, 0);
        PreConnectSpeechBuffer preConnectSpeechBufferDetachPreConnectSpeech = detachPreConnectSpeech(str);
        if (preConnectSpeechBufferDetachPreConnectSpeech != null) {
            return preConnectSpeechBufferDetachPreConnectSpeech.takeSpeech();
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCallAudioStream.values().length];
            try {
                AnonymousClass002.A13(VoiceCallAudioStream.VOICE_CALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCallAudioStream.ASSISTANT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCallAudioStream.MEDIA, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final GXS audioManagerConfig(boolean z, boolean z2) {
        return new AnonymousClass1(z2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {, blocks: (B:18:0x0031, B:23:0x003f, B:25:0x0059, B:26:0x0066, B:28:0x006c, B:30:0x007f, B:32:0x0091, B:34:0x0095), top: B:48:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b1 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitDetachedSessionTeardown(X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController.C132331
            if (r0 == 0) goto Lb4
            r5 = r14
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$1 r5 = (com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController.C132331) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto Lbb
            java.lang.Object r2 = r5.L$0
            X.Hwg.A00(r0)
        L22:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L2e
            r4 = 0
        L29:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L2e:
            java.lang.Object r8 = r13.audioLock
            monitor-enter(r8)
            java.util.Set<X.57m> r0 = r13.detachedSessions     // Catch: java.lang.Throwable -> Lc0
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lc0
            goto L3b
        L37:
            X.Hwg.A00(r0)
            goto L3c
        L3b:
            monitor-exit(r8)
        L3c:
            java.lang.Object r8 = r13.audioLock
            monitor-enter(r8)
            java.util.Set<X.57m> r1 = r13.detachedSessions     // Catch: java.lang.Throwable -> Lc0
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1 r0 = com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$pending$1$1.INSTANCE     // Catch: java.lang.Throwable -> Lc0
            X.AbstractC0882AGj.A0t(r1, r0)     // Catch: java.lang.Throwable -> Lc0
            long r11 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r0
            java.util.Set<X.57m> r0 = r13.detachedSessions     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r2 = X.AbstractC0878AGe.A0C(r0)     // Catch: java.lang.Throwable -> Lc0
            X.57m r2 = (X.C57m) r2     // Catch: java.lang.Throwable -> Lc0
            r7 = 0
            if (r2 != 0) goto L9f
            java.util.WeakHashMap<X.57m, java.lang.Long> r0 = r13.orphanedSessions     // Catch: java.lang.Throwable -> Lc0
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lc0
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> Lc0
        L66:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L9c
            java.lang.Object r9 = r10.next()     // Catch: java.lang.Throwable -> Lc0
            r3 = r9
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = r3.getValue()     // Catch: java.lang.Throwable -> Lc0
            long r1 = X.C3cG.A05(r0)     // Catch: java.lang.Throwable -> Lc0
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L66
            java.lang.Object r0 = r3.getKey()     // Catch: java.lang.Throwable -> Lc0
            X.57m r0 = (X.C57m) r0     // Catch: java.lang.Throwable -> Lc0
            X.1BN r0 = r0.ADx()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lc0
            boolean r0 = r0 instanceof X.C57l     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto L66
        L91:
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> Lc0
            if (r9 == 0) goto L9e
            java.lang.Object r2 = r9.getKey()     // Catch: java.lang.Throwable -> Lc0
            X.57m r2 = (X.C57m) r2     // Catch: java.lang.Throwable -> Lc0
            goto L9f
        L9c:
            r9 = r7
            goto L91
        L9e:
            r2 = r7
        L9f:
            monitor-exit(r8)
            if (r2 == 0) goto L29
            X.HwK r1 = X.HwK.A00
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1 r0 = new com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$ended$1
            r0.<init>(r13, r2, r7)
            r5.L$0 = r2
            r5.label = r4
            java.lang.Object r0 = X.GAo.A00(r5, r1, r0)
            if (r0 != r6) goto L22
            return r6
        Lb4:
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$1 r5 = new com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$awaitDetachedSessionTeardown$1
            r5.<init>(r14)
            goto L12
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController.awaitDetachedSessionTeardown(X.HtJ):java.lang.Object");
    }

    private final InterfaceC9637GWh createRoutePinListener(GXO gxo) {
        return new C132351(gxo);
    }

    private final PreConnectSpeechBuffer detachPreConnectSpeech(String str) {
        AttachedSpeech attachedSpeech;
        synchronized (this.preConnectSpeechLock) {
            if (str == null) {
                attachedSpeech = this.preConnectSpeech;
                if (attachedSpeech != null) {
                }
                return null;
            }
            if (str.equals(this.preConnectSpeechCallId)) {
                this.preConnectSpeechCallId = null;
            }
            attachedSpeech = this.preConnectSpeech;
            if (attachedSpeech != null || (str != null && !str.equals(attachedSpeech.callId))) {
                return null;
            }
            this.preConnectSpeech = null;
            GSV gsvA00 = GSV.A00(audioStateExecutor$delegate.getValue());
            gsvA00.A04.execute(new RunnableC9620GSe(gsvA00, null));
            return attachedSpeech.buffer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object endSessionSafely(C57m c57m, String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, HwK.A00, new AnonymousClass2(str, c57m, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessoryCallDelegate getAccessoryDelegate() {
        return (AccessoryCallDelegate) this.accessoryDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallControllerImpl getCallController() {
        return (CallControllerImpl) this.callController$delegate.getValue();
    }

    private final ConnectFunnelProxy getConnectFunnelProxy() {
        return (ConnectFunnelProxy) this.connectFunnelProxy$delegate.getValue();
    }

    private final HatchWsSignalingService getHatchWsSignalingService() {
        return this.lazyHatchWsSignalingService.getValue();
    }

    private final MetaAiRsysSdk getMetaAiRsysSdk() {
        return (MetaAiRsysSdk) this.metaAiRsysSdk$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GTS getRsysDelegate() {
        return (GTS) this.rsysDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraXNativeHolderProvider getXAnalyticsProvider() {
        return (AuraXNativeHolderProvider) this.xAnalyticsProvider$delegate.getValue();
    }

    private final void logConnectFunnelFailure(String str, Hx3 hx3) {
        if (hx3 instanceof HqE) {
            return;
        }
        ConnectFunnel.CProxy.fail(str, "start_session_failure", C7384Etj.areEqual(hx3, Hq2.A00) ? "voip_active" : hx3 instanceof HpX ? "other_meta_ai_session_active" : C7384Etj.areEqual(hx3, Hok.A00) ? "no_microphone_permission" : hx3 instanceof C56z ? ((C56z) hx3).A00 : "");
    }

    private final GV7 resolveSignalingService() {
        HatchMuxingSignalingService hatchMuxingSignalingService;
        CFK.A05("HatchRTSessionController", "Using Noise WS signaling transport for ULLC join");
        synchronized (this.signalingLock) {
            hatchMuxingSignalingService = this.muxingSignalingService;
            if (hatchMuxingSignalingService != null) {
                hatchMuxingSignalingService.setActiveDelegate(getHatchWsSignalingService());
            } else {
                hatchMuxingSignalingService = new HatchMuxingSignalingService(this.userId, getHatchWsSignalingService());
                this.muxingSignalingService = hatchMuxingSignalingService;
            }
        }
        return hatchMuxingSignalingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startAccessorySession(X.C9586GQf r19, X.HtJ<? super X.Hx3> r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController.startAccessorySession(X.GQf, X.HtJ):java.lang.Object");
    }

    public /* bridge */ void addMediaProjectionFGSType() {
    }

    public final void armPreConnectSpeech(String str) {
        synchronized (this.preConnectSpeechLock) {
            this.preConnectSpeechCallId = str;
        }
    }

    public final void close() {
        C57m c57m;
        synchronized (this.audioLock) {
            c57m = this._currentSession;
            this._currentSession = null;
            teardownAudioLocked();
        }
        boolean zCompareAndSet = this.didRegisterUser.compareAndSet(true, false);
        AnonymousClass001.A1J(new C132341(zCompareAndSet, this, c57m, null), Hxb.A02(AnonymousClass001.A0y()));
        getAccessoryDelegate().close();
    }

    public final VoiceCallAccessory getAccessory() {
        return this.accessory;
    }

    public C57m getCurrentSession() {
        return this._currentSession;
    }

    public final G0U<C57m, Unit> getOnOrphanedSessionEnded() {
        return this.onOrphanedSessionEnded;
    }

    public final G0U<C57m, Unit> getOnOrphanedSessionStarted() {
        return this.onOrphanedSessionStarted;
    }

    public final G0U<String, Unit> getOnStartPhase() {
        return this.onStartPhase;
    }

    public /* bridge */ void handleClientInstruction(ClientInstruction clientInstruction) {
    }

    public /* bridge */ void launchViewMessages(Context context) {
    }

    public /* bridge */ void onUserConfirmPsiMessages(String str) {
    }

    public /* bridge */ void onUserDenyPsiMessages(String str) {
    }

    public /* bridge */ void sendPsiMessages() {
    }

    public final void setAccessory(VoiceCallAccessory voiceCallAccessory) {
        this.accessory = voiceCallAccessory;
    }

    public final void setJoinRequestsVideoMedia(boolean z) {
        if (z || this.lazyHatchWsSignalingService.AOX()) {
            getHatchWsSignalingService().joinRequestsVideoMedia = z;
        }
    }

    public /* bridge */ void setPsiDelegate(InterfaceC9638GWk interfaceC9638GWk) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    @Override // X.Hr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startSession(X.C9586GQf r28, X.HtJ<? super X.Hx3> r29) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController.startSession(X.GQf, X.HtJ):java.lang.Object");
    }

    private final void startConnectFunnel(String str, Long l) {
        ConnectFunnel.CProxy.startWithProxy(getConnectFunnelProxy(), str, 2, l, null);
        ConnectFunnel.CProxy.annotateMultipleTyped(str, AnonymousClass006.A10(20, "meta_ai_call_controller"), AnonymousClass006.A10(16, AnonymousClass001.A0i()), null);
    }

    public final void releaseAccessoryAudio() {
        getAccessoryDelegate().unbind(null);
    }

    public final void startAccessoryMic(boolean z) {
        getAccessoryDelegate().micOpen = z;
    }
}
