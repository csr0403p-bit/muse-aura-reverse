package com.facebook.aura.partners.voice.session.impl;

import X.AGH;
import X.AHI;
import X.ATD;
import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7535F0i;
import X.AbstractC7559F3s;
import X.AbstractC7606F5t;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.AnonymousClass602;
import X.AnonymousClass603;
import X.BLG;
import X.BO7;
import X.BV3;
import X.C05563uZ;
import X.C05663ul;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10517Hof;
import X.C10518Hog;
import X.C10543Hqv;
import X.C10650I0u;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C22I;
import X.C27k;
import X.C3Ej;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3bP;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3pU;
import X.C3pd;
import X.C3rb;
import X.C4o7;
import X.C57l;
import X.C57m;
import X.C60I;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C7438Evz;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C8472Feb;
import X.C8892Ft9;
import X.C9258GBl;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.F1E;
import X.F1F;
import X.F2X;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.G2k;
import X.G2l;
import X.G50;
import X.GAX;
import X.GAo;
import X.GBM;
import X.GDB;
import X.GQb;
import X.HoC;
import X.Hok;
import X.HpX;
import X.Hq2;
import X.Hr6;
import X.HrH;
import X.Ht9;
import X.HtJ;
import X.Hu1;
import X.HwK;
import X.HwN;
import X.HwV;
import X.Hwg;
import X.Hx3;
import X.Hx4;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.HzR;
import X.InterfaceC05673vm;
import X.InterfaceC2261BLa;
import X.InterfaceC2349BUy;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.conversation.api.ConversationInputBlocks;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.AgentStatusPayload;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarCallIdleVideo;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchGatewayEventKt;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.PlayoutInjection;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.avatar.DarkCallMediaKt;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReference;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import com.facebook.aura.partners.voice.avatar.HatchAvatarSelection;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.voice.gating.VoiceCallVolume;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.infra.StartCallResult;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import com.facebook.aura.partners.voice.intf.CaptionSpeaker;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceBugReportInfo;
import com.facebook.aura.partners.voice.intf.VoiceBugReportRepository;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.aura.partners.voice.intf.VoiceCallActivity;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;
import com.facebook.aura.partners.voice.intf.VoiceEndCallRequest;
import com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatus;
import com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatusKt;
import com.facebook.aura.partners.voice.intf.VoicePreConnectFailure;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar;
import com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate;
import com.facebook.aura.partners.voice.uicontrol.EndVoiceCallRequest;
import com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallRequest;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink;
import com.facebook.aura.threadvoicecaption.ThreadVoiceCaption;
import com.facebook.aura.threadvoicecaption.ThreadVoiceCaptionBus;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1;
import com.facebook.rsys.audio.frame.AudioFrameData;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.audio.frame.gen.AudioFrameMetadata;
import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController implements VoiceCallManager {
    public static final long ACCESSORY_RENDERER_RELEASE_WAIT_MS = 1000;
    public static final int ACCESSORY_VIDEO_CREATE_ATTEMPTS = 3;
    public static final long ACCESSORY_VIDEO_RETRY_MS = 500;
    public static final long AUDIO_LEVEL_IDLE_INTERVAL_MS = 1000;
    public static final long AUDIO_LEVEL_INTERVAL_MS = 50;
    public static final float AUDIO_LEVEL_MAX = 127.0f;
    public static final float AUDIO_NOISE_FLOOR = 0.7f;
    public static final int BOT_AUDIO_ACTIVE_RAW_THRESHOLD = 32;
    public static final float BOT_LEVEL_CEILING = 0.88f;
    public static final long CONNECTED_CONFIRMATION_MS = 1500;
    public static final Companion Companion = new Companion();
    public static final float ECHO_DUCK_STRENGTH = 0.85f;
    public static final float MIC_LEVEL_CEILING = 1.0f;
    public static final int MIC_STATUS_ATTEMPTS = 10;
    public static final long MIC_STATUS_RETRY_DELAY_MS = 1000;
    public static final float NORMALIZE_EPSILON = 1.0E-6f;
    public static final float NORMAL_PLAYOUT_GAIN = 1.0f;
    public static final long PLAYBACK_IDLE_DEBOUNCE_MS = 400;
    public static final float PREVIEW_BOT_PLAYOUT_GAIN = 0.0f;
    public static final long SHARED_CALL_ID_TIMEOUT_MS = 2000;
    public final BLG<Boolean> _accessoryLiveVideo;
    public final C3Em<Unit> _callEnded;
    public final BLG<VoiceCallUiState> _callState;
    public final BLG<Boolean> _embodimentReady;
    public final BLG<Integer> _embodimentReadyGeneration;
    public final BLG<Float> _userSpeechLevel;
    public volatile VoiceCallAccessory accessory;
    public final C1BN<Boolean> accessoryLiveVideo;
    public volatile AccessoryVideo accessoryVideo;
    public volatile String admittedCallId;
    public volatile long agentStatusAdmissionFloor;
    public final InterfaceC2261BLa agentStatusUpdateMutex;
    public final AtomicBoolean asrLocalAudioObserved;
    public final AtomicBoolean asrUserCaptionObserved;
    public final AtomicBoolean asrVoiceStateObserved;
    public final AtomicInteger asrVoiceStateUpdateCount;
    public volatile HoC assistantCaptionJob;
    public String assistantCaptionThreadId;
    public final AtomicInteger audioLevelGeneration;
    public volatile HoC audioLevelJob;
    public final String authToken;
    public final HatchAvatarReferenceImageProvider avatarReferenceProvider;
    public final HatchVoiceAvatarStore avatarStore;
    public volatile HxE<String, HatchCallJoinContext.AvatarUpdatingStart> avatarUpdatingStart;
    public volatile HoC callAvatarAwaitJob;
    public volatile ConcurrentHashMap<String, HatchVoiceVideoConfigStore.Snapshot> callAvatarHistory;
    public volatile HoC callAvatarHistoryJob;
    public final BLG<String> callAvatarWithoutImageCallId;
    public final AtomicBoolean callConnectedRecorded;
    public final C22I<Unit> callEnded;
    public final ReentrantLock callLifecycleLock;
    public final BLG<CallMarkerState> callMarker;
    public boolean callOutputChosen;
    public final BLG<CallPortraitFraming> callPortraitFraming;
    public volatile HxE<String, String> callShownAvatarStem;
    public volatile CallStartAvatar callStartAvatar;
    public volatile CallStartWait callStartWait;
    public final C1BN<VoiceCallUiState> callState;
    public volatile HxE<String, HatchAiIdentityHandler.AvatarImageKey> callVideoAvatarKey;
    public VoiceCallVolume.Lease callVolumeLease;
    public final InterfaceC2261BLa captionMutex;
    public HxE<String, CallAvatarUpdate.DisplayCrop> completedCropLog;
    public final AtomicInteger connectAttempt;
    public final AtomicBoolean connectOutcomeSettled;
    public volatile HoC connectWatchdogJob;
    public volatile HoC connectedTransitionJob;
    public final VoiceCallConnectionTracker connectionTracker;
    public final Context context;
    public final AtomicBoolean controllerClosed;
    public final C3UX coroutineScope;
    public volatile int currentMarkerKey;
    public C57m currentSession;
    public String currentSessionPinOwner;
    public String currentUserTurnId;
    public final InterfaceC2261BLa embodimentBindMutex;
    public volatile int embodimentGeneration;
    public final C1BN<Boolean> embodimentReady;
    public final C1BN<Integer> embodimentReadyGeneration;
    public final EmbodimentRendererRegistry embodimentRenderers;
    public volatile HoC embodimentVideoPolicyJob;
    public final HatchGatewayConnection gateway;
    public final String gatewayWsUrl;
    public String handedOffText;
    public String handedOffTurnId;
    public final HatchIdentityProvider identityProvider;
    public volatile HoC idleVideoUpdateJob;
    public final HatchCallJoinContext joinContext;
    public volatile String lastBotText;
    public volatile Integer lastCaptionBotState;
    public volatile String lastUserText;
    public volatile String liveAvatarCompletedCallId;
    public volatile HxE<String, ? extends CallAvatarUpdate.FailureReason> liveAvatarFailedCall;
    public volatile HxE<Integer, String> liveAvatarUnavailableNotice;
    public volatile HxE<HxE<String, String>, ? extends HoC> liveAvatarUpdateTimeout;
    public volatile HxE<String, Long> liveAvatarUpdatingSince;
    public final ReentrantLock lock;
    public final InterfaceC2261BLa markerMutex;
    public final C3UX markerScope;
    public boolean micMutedForPreview;
    public final HzR<MicStatusReport> micStatusReports;
    public final BLG<String> newAvatarStillCallId;
    public final Function0<Unit> onClose;
    public final G0U<Boolean, Unit> onJoinRequestsVideoMedia;
    public volatile PendingCallAvatarSwap pendingCallAvatarSwap;
    public PendingEmbodimentSurface pendingEmbodimentSurface;
    public final ConcurrentHashMap<String, String> pendingPinOwners;
    public volatile HxE<String, ? extends CallAvatarUpdate.FailureReason> pendingPreConnectFailure;
    public final HzR<PlaybackStatusReport> playbackStatusReports;
    public volatile HoC playoutStartedJob;
    public final BLG<String> portraitMissingCallId;
    public volatile HoC postTurnTimeoutJob;
    public volatile PreConnectLiveCaption preConnectCaption;
    public volatile boolean preConnectSpeechEligible;
    public String preConnectText;
    public String preConnectTurnId;
    public volatile HxE<String, String> preConnectUpdatingStem;
    public volatile String previousAvatarShownCallId;
    public Integer previousThreadBotState;
    public Boolean rejoinRestoreMuted;
    public final ConcurrentHashMap<String, String> retainedStaticAvatarPaths;
    public final Hr6 rtSessionController;
    public final AtomicBoolean serverConnectedMarked;
    public String serverVideoDisabledNoticeCallId;
    public volatile HoC sessionJob;
    public final ConcurrentHashMap<C57m, String> sessionPinOwners;
    public volatile HoC sharedCallIdJob;
    public volatile HxE<String, String> startingPinOwner;
    public final C3UX teardownScope;
    public final ThreadVoiceCaptionBus threadCaptionBus;
    public final Object threadCaptionLock;
    public volatile String timerClosedWaitCallId;
    public volatile HoC turnLatencyJob;
    public final VoiceTurnLatencyTracker turnLatencyTracker;
    public volatile boolean userPlacedAttempt;
    public final AbstractC3358CGz userSession;
    public final C1BN<Float> userSpeechLevel;
    public final AtomicBoolean userSpeechSignaled;
    public final HatchVoiceVideoConfigStore videoConfigStore;
    public final VoiceBugReportRepository voiceBugReportRepository;
    public final VoiceCallActivityRepository voiceCallRepository;
    public final VoiceCallStateHolder voiceCallStateHolder;
    public final SessionController$voiceControlHandler$1 voiceControlHandler;
    public final InterfaceC2261BLa voiceControlMutex;
    public boolean voiceRestartInProgress;
    public volatile HoC voiceStateJob;
    public volatile HoC weakConnectionJob;
    public WeakNetworkNotices weakNetworkNotices;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$10", f = "SessionController.kt", l = {817}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass10(HtJ<? super AnonymousClass10> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass10(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    final SessionController sessionController = SessionController.this;
                    BLG<VoiceCallUiState> blg = sessionController._callState;
                    C20Z<? super VoiceCallUiState> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.10.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((VoiceCallUiState) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(VoiceCallUiState voiceCallUiState, HtJ<? super Unit> htJ) {
                            boolean zA1Z = AnonymousClass006.A1Z(voiceCallUiState.phase, VoiceCallPhase.ENDED);
                            if (sessionController.voiceCallStateHolder.setCallActiveIfCurrent(voiceCallUiState.callAttemptGeneration, zA1Z)) {
                                HatchNotificationSuppression.voiceCallActive = zA1Z;
                                if (!zA1Z) {
                                    sessionController.clearThreadCaption(voiceCallUiState.callAttemptGeneration);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (blg.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass10(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$11", f = "SessionController.kt", l = {846}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass11(HtJ<? super AnonymousClass11> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass11(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final F1F f1f = new F1F();
                final SessionController sessionController = SessionController.this;
                C1BN<Boolean> c1bn = sessionController.voiceCallStateHolder.isCallActive;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.11.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        boolean z2 = false;
                        F1F f1f2 = f1f;
                        boolean z3 = f1f2.element;
                        if (z) {
                            if (!z3) {
                                f1f2.element = true;
                                VoiceCallForegroundService.Companion companion = VoiceCallForegroundService.Companion;
                                Context contextA0I = AnonymousClass001.A0I(sessionController.context);
                                if (sessionController.accessory != null) {
                                    z2 = true;
                                }
                                companion.start(contextA0I, z2);
                            }
                        } else if (z3) {
                            f1f2.element = false;
                            VoiceCallForegroundService.Companion.stop(AnonymousClass001.A0I(sessionController.context));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass11(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$12", f = "SessionController.kt", l = {857}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass12(HtJ<? super AnonymousClass12> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass12(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(sessionController.voiceCallStateHolder.isEmbodimentDisplayEnabled);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.12.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        SessionController sessionController2 = sessionController;
                        sessionController2.connectionTracker.onEmbodimentDisplayToggled(z, sessionController2.currentMarkerKey);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass12(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$13", f = "SessionController.kt", l = {861}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass13(HtJ<? super AnonymousClass13> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass13(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                this.label = 1;
                if (sessionController.trackEmbodimentVisibility(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass13(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$14", f = "SessionController.kt", l = {881}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$14$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$14$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super HxE<? extends Boolean, ? extends Boolean>>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                if (this.label == 0) {
                    return AnonymousClass002.A0q(AnonymousClass001.A0k(obj, z), z2);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super HxE<? extends Boolean, ? extends Boolean>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), (HtJ<? super HxE<Boolean, Boolean>>) htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super HxE<Boolean, Boolean>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$14$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$14$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G2j<VoiceEmbodimentVisibleMedia, AgentActivityStatus, HxE<? extends Boolean, ? extends Boolean>, HtJ<? super HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(4, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia, AgentActivityStatus agentActivityStatus, HxE<Boolean, Boolean> hxE, HtJ<? super HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = voiceEmbodimentVisibleMedia;
                anonymousClass2.L$1 = agentActivityStatus;
                anonymousClass2.L$2 = hxE;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                Object obj4 = this.L$2;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new HwV(obj2, obj3, obj4);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia, AgentActivityStatus agentActivityStatus, HxE<? extends Boolean, ? extends Boolean> hxE, HtJ<? super HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>>> htJ) {
                return invoke2(voiceEmbodimentVisibleMedia, agentActivityStatus, (HxE<Boolean, Boolean>) hxE, (HtJ<? super HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$14$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$14$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0W<HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>>, VoiceEmbodimentMedia, HtJ<? super HxE<? extends HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>>, ? extends VoiceEmbodimentMedia>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
                super(3, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>> hwV, VoiceEmbodimentMedia voiceEmbodimentMedia, HtJ<? super HxE<? extends HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>, ? extends VoiceEmbodimentMedia>> htJ) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
                anonymousClass3.L$0 = hwV;
                anonymousClass3.L$1 = voiceEmbodimentMedia;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0r(obj2, obj3);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>> hwV, VoiceEmbodimentMedia voiceEmbodimentMedia, HtJ<? super HxE<? extends HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, ? extends HxE<? extends Boolean, ? extends Boolean>>, ? extends VoiceEmbodimentMedia>> htJ) {
                return invoke2((HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>) hwV, voiceEmbodimentMedia, (HtJ<? super HxE<? extends HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>, ? extends VoiceEmbodimentMedia>>) htJ);
            }
        }

        public AnonymousClass14(HtJ<? super AnonymousClass14> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass14(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceCallStateHolder voiceCallStateHolder = SessionController.this.voiceCallStateHolder;
                C20Q c20qA04 = C3rb.A04(new AnonymousClass3(null), C3rb.A00(new AnonymousClass2(null), voiceCallStateHolder.embodimentVisibleMedia, voiceCallStateHolder.agentActivityStatus, C3rb.A03(new AnonymousClass1(null), voiceCallStateHolder.isBotSpeaking, voiceCallStateHolder.isBotAudioActive)), SessionController.this.voiceCallStateHolder.embodimentMedia);
                final SessionController sessionController = SessionController.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.14.4
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<? extends HwV<? extends VoiceEmbodimentVisibleMedia, ? extends AgentActivityStatus, HxE<Boolean, Boolean>>, ? extends VoiceEmbodimentMedia>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(X.HxE<? extends X.HwV<? extends com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia, ? extends com.facebook.aura.model.AgentActivityStatus, X.HxE<java.lang.Boolean, java.lang.Boolean>>, ? extends com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia> r12, X.HtJ<? super kotlin.Unit> r13) {
                        /*
                            r11 = this;
                            A r0 = r12.first
                            X.HwV r0 = (X.HwV) r0
                            B r5 = r12.second
                            A r6 = r0.first
                            com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia r6 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia) r6
                            B r4 = r0.second
                            com.facebook.aura.model.AgentActivityStatus r4 = (com.facebook.aura.model.AgentActivityStatus) r4
                            C r1 = r0.third
                            X.HxE r1 = (X.HxE) r1
                            A r0 = r1.first
                            boolean r3 = X.AnonymousClass001.A1X(r0)
                            B r0 = r1.second
                            boolean r2 = X.AnonymousClass001.A1X(r0)
                            boolean r7 = com.facebook.aura.partners.voice.session.impl.SessionControllerKt.isWorkingVideoBusy(r4)
                            com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
                            boolean r1 = r0.isEmbodimentVideoStateSwapActive()
                            r9 = 0
                            if (r7 == 0) goto L30
                            if (r5 == 0) goto L30
                            r10 = 1
                            if (r1 != 0) goto L31
                        L30:
                            r10 = 0
                        L31:
                            com.facebook.aura.partners.voice.session.impl.SessionController r0 = r1
                            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r5 = r0.connectionTracker
                            if (r3 != 0) goto L3b
                            if (r1 == 0) goto L3c
                            if (r2 == 0) goto L3c
                        L3b:
                            r9 = 1
                        L3c:
                            int r11 = r0.currentMarkerKey
                            r8 = r7
                            r5.onWorkingVideoState(r6, r7, r8, r9, r10, r11)
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass14.AnonymousClass4.emit(X.HxE, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c20qA04.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass14(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$15", f = "SessionController.kt", l = {898}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass15(HtJ<? super AnonymousClass15> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass15(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<String> c22i = sessionController.voiceCallStateHolder.restartRequests;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.15.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.aura.partners.voice.session.impl.SessionController$VoiceRestartState] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.locks.ReentrantLock] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.locks.ReentrantLock] */
                    /* JADX WARN: Type inference failed for: r3v3 */
                    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.locks.ReentrantLock] */
                    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.concurrent.locks.ReentrantLock] */
                    /* JADX WARN: Type inference failed for: r3v7 */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        Unit unit;
                        CallEndOwnership callEndOwnershipEndCallInternal$default;
                        SessionController sessionController2 = sessionController;
                        ReentrantLock reentrantLock = sessionController2.callLifecycleLock;
                        reentrantLock.lock();
                        try {
                            if (sessionController2.controllerClosed.get()) {
                                unit = Unit.INSTANCE;
                            } else {
                                ReentrantLock reentrantLockA0p = C3cH.A0p(sessionController2);
                                try {
                                    VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(sessionController2);
                                    VoiceCallPhase voiceCallPhase = VoiceCallPhase.ENDED;
                                    if (voiceCallPhaseA0I == voiceCallPhase || (str != null && !str.equals(C3cI.A0X(sessionController2)))) {
                                        unit = Unit.INSTANCE;
                                    } else {
                                        sessionController2.voiceRestartInProgress = true;
                                        ?? CaptureRestartStateLocked = sessionController2.captureRestartStateLocked();
                                        reentrantLockA0p.unlock();
                                        try {
                                            callEndOwnershipEndCallInternal$default = SessionController.endCallInternal$default(sessionController2, str, VoiceCallConnectionTracker.END_REASON_RESTART, new SessionController$15$1$1$ownership$1(sessionController2), AnonymousClass002.A1Y(str), true, false, null, false, null, 480, null);
                                        } catch (Throwable th) {
                                            th = th;
                                            CaptureRestartStateLocked = C3cH.A0p(sessionController2);
                                            try {
                                                sessionController2.voiceRestartInProgress = false;
                                            } finally {
                                            }
                                        }
                                        try {
                                            if (callEndOwnershipEndCallInternal$default == null) {
                                                unit = Unit.INSTANCE;
                                                ReentrantLock reentrantLockA0p2 = C3cH.A0p(sessionController2);
                                                sessionController2.voiceRestartInProgress = false;
                                                CaptureRestartStateLocked = reentrantLockA0p2;
                                            } else {
                                                reentrantLockA0p = C3cH.A0p(sessionController2);
                                                try {
                                                    if (!sessionController2.controllerClosed.get() && C3cI.A0I(sessionController2) != voiceCallPhase && sessionController2.connectAttempt.get() == callEndOwnershipEndCallInternal$default.generation) {
                                                        SessionController.startCallInternal$default(sessionController2, CaptureRestartStateLocked.muted, CaptureRestartStateLocked.speakerOn, false, true, CaptureRestartStateLocked.captionsEnabled, CaptureRestartStateLocked.audioOnlyReason, null, null, null, null, 960, null);
                                                        ReentrantLock reentrantLockA0p3 = C3cH.A0p(sessionController2);
                                                        sessionController2.voiceRestartInProgress = false;
                                                        unit = Unit.INSTANCE;
                                                        CaptureRestartStateLocked = reentrantLockA0p3;
                                                    } else {
                                                        unit = Unit.INSTANCE;
                                                        CaptureRestartStateLocked = C3cH.A0p(sessionController2);
                                                        sessionController2.voiceRestartInProgress = false;
                                                    }
                                                } finally {
                                                    reentrantLockA0p.unlock();
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                } finally {
                                }
                            }
                            return unit;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass15(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$16", f = "SessionController.kt", l = {949}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$16, reason: invalid class name */
    public final class AnonymousClass16 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass16(HtJ<? super AnonymousClass16> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass16(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<VoiceEndCallRequest> c22i = sessionController.voiceCallStateHolder.endCallRequests;
                C20Z<? super VoiceEndCallRequest> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.16.1

                    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$16$1$2, reason: invalid class name */
                    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
                        public final /* synthetic */ VoiceEndCallRequest $request;
                        public final /* synthetic */ boolean $superseded;
                        public final /* synthetic */ SessionController this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(boolean z, SessionController sessionController, VoiceEndCallRequest voiceEndCallRequest) {
                            super(0);
                            this.$superseded = z;
                            this.this$0 = sessionController;
                            this.$request = voiceEndCallRequest;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (this.$superseded) {
                                this.this$0.voiceCallStateHolder.notifyCallMoved();
                            }
                            if ("out_of_credits".equals(this.$request.reason)) {
                                this.this$0.voiceCallStateHolder.notifyOutOfCredits();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((VoiceEndCallRequest) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r3
  0x0031: PHI (r3v5 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:18:0x0049, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.partners.voice.intf.VoiceEndCallRequest r9, X.HtJ<? super kotlin.Unit> r10) {
                        /*
                            r8 = this;
                            com.facebook.aura.partners.voice.session.impl.SessionController r0 = r1
                            com.facebook.aura.partners.voice.intf.VoiceCallPhase r1 = X.C3cI.A0I(r0)
                            com.facebook.aura.partners.voice.intf.VoiceCallPhase r0 = com.facebook.aura.partners.voice.intf.VoiceCallPhase.ENDED
                            if (r1 == r0) goto L45
                            com.facebook.aura.partners.voice.session.impl.SessionController r0 = r1
                            java.lang.String r6 = X.C3cI.A0X(r0)
                            java.lang.String r1 = r9.activeCallId
                            java.lang.String r0 = r9.targetCallId
                            com.facebook.aura.partners.voice.api.VoiceEndCallDecision r2 = com.facebook.aura.partners.voice.api.VoiceEndCallDecisionKt.voiceEndCallDecision(r1, r6, r0)
                            com.facebook.aura.partners.voice.api.VoiceEndCallDecision r0 = com.facebook.aura.partners.voice.api.VoiceEndCallDecision.IGNORE
                            if (r2 == r0) goto L45
                            java.lang.String r5 = r9.reason
                            java.lang.String r0 = "audio_takeover"
                            boolean r1 = r0.equals(r5)
                            com.facebook.aura.partners.voice.api.VoiceEndCallDecision r0 = com.facebook.aura.partners.voice.api.VoiceEndCallDecision.END_SUPPRESS_EARCON
                            r3 = 1
                            boolean r0 = X.AnonymousClass002.A1Z(r2, r0)
                            com.facebook.aura.partners.voice.session.impl.SessionController r2 = r1
                            if (r0 != 0) goto L48
                            if (r1 != 0) goto L48
                        L31:
                            java.lang.String r4 = "user_hangup"
                            if (r1 != 0) goto L4d
                            if (r5 == 0) goto L38
                            r4 = r5
                        L38:
                            r5 = 0
                        L39:
                            com.facebook.aura.partners.voice.session.impl.SessionController$16$1$2 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$16$1$2
                            r7.<init>(r0, r2, r9)
                            r9 = 32
                            r8 = 0
                            r10 = r8
                            com.facebook.aura.partners.voice.session.impl.SessionController.endCall$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        L45:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L48:
                            r3 = 0
                            if (r0 == 0) goto L31
                            java.lang.String r4 = "superseded"
                        L4d:
                            if (r1 == 0) goto L38
                            goto L39
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass16.AnonymousClass1.emit(com.facebook.aura.partners.voice.intf.VoiceEndCallRequest, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass16(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$17", f = "SessionController.kt", l = {976}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$17, reason: invalid class name */
    public final class AnonymousClass17 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass17(HtJ<? super AnonymousClass17> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass17(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(sessionController.voiceCallStateHolder.isPreviewActive);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.17.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        SessionController sessionController2 = sessionController;
                        ReentrantLock reentrantLockA0p = C3cH.A0p(sessionController2);
                        try {
                            C57m c57m = sessionController2.currentSession;
                            if (c57m != null) {
                                float f = 1.0f;
                                if (z) {
                                    f = 0.0f;
                                }
                                c57m.Acw(f);
                            }
                            sessionController2.applyPreviewMicMuteLocked(z);
                            return Unit.INSTANCE;
                        } finally {
                            reentrantLockA0p.unlock();
                        }
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass17(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$18", f = "SessionController.kt", l = {986}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$18, reason: invalid class name */
    public final class AnonymousClass18 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass18(HtJ<? super AnonymousClass18> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass18(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<Unit> c22i = sessionController.voiceCallStateHolder.toggleMuteRequests;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.18.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        if (C3cI.A0I(sessionController) != VoiceCallPhase.ENDED) {
                            sessionController.toggleMute();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass18(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$19", f = "SessionController.kt", l = {991}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$19, reason: invalid class name */
    public final class AnonymousClass19 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$19$1", f = "SessionController.kt", l = {994, 996}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$19$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<MicStatusReport, HtJ<? super Unit>, Object> {
            public int I$0;
            public int I$1;
            public int I$2;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SessionController sessionController, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = sessionController;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:19:0x0058, B:20:0x005b, B:22:0x0065, B:24:0x0068, B:12:0x0030, B:14:0x003c, B:16:0x003f, B:27:0x006e, B:8:0x0023, B:10:0x002a), top: B:40:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:19:0x0058, B:20:0x005b, B:22:0x0065, B:24:0x0068, B:12:0x0030, B:14:0x003c, B:16:0x003f, B:27:0x006e, B:8:0x0023, B:10:0x002a), top: B:40:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:19:0x0058, B:20:0x005b, B:22:0x0065, B:24:0x0068, B:12:0x0030, B:14:0x003c, B:16:0x003f, B:27:0x006e, B:8:0x0023, B:10:0x002a), top: B:40:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:19:0x0058, B:20:0x005b, B:22:0x0065, B:24:0x0068, B:12:0x0030, B:14:0x003c, B:16:0x003f, B:27:0x006e, B:8:0x0023, B:10:0x002a), top: B:40:0x000a }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:20:0x005b). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
                /*
                    r11 = this;
                    java.lang.Object r8 = r11.L$0
                    com.facebook.aura.partners.voice.session.impl.SessionController$MicStatusReport r8 = (com.facebook.aura.partners.voice.session.impl.SessionController.MicStatusReport) r8
                    X.Hji r7 = X.EnumC10460Hji.A02
                    int r0 = r11.label
                    r6 = 2
                    r5 = 1
                    if (r0 == 0) goto L27
                    if (r0 == r5) goto L19
                    if (r0 != r6) goto L96
                    int r4 = r11.I$1
                    int r3 = r11.I$0
                    java.lang.Object r2 = r11.L$1
                    com.facebook.aura.partners.voice.session.impl.SessionController r2 = (com.facebook.aura.partners.voice.session.impl.SessionController) r2
                    goto L58
                L19:
                    int r4 = r11.I$2
                    int r0 = r11.I$1
                    int r3 = r11.I$0
                    java.lang.Object r2 = r11.L$1
                    com.facebook.aura.partners.voice.session.impl.SessionController r2 = (com.facebook.aura.partners.voice.session.impl.SessionController) r2
                    X.Hwg.A00(r12)     // Catch: java.lang.Exception -> L87
                    goto L83
                L27:
                    X.Hwg.A00(r12)
                    com.facebook.aura.partners.voice.session.impl.SessionController r2 = r11.this$0     // Catch: java.lang.Exception -> L87
                    r4 = 0
                    r3 = 10
                L2f:
                    r10 = r4
                L30:
                    java.lang.String r1 = X.C3cI.A0X(r2)     // Catch: java.lang.Exception -> L87
                    java.lang.String r0 = r8.callId     // Catch: java.lang.Exception -> L87
                    boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Exception -> L87
                    if (r0 != 0) goto L3f
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L87
                    return r7
                L3f:
                    com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r9 = r2.voiceCallRepository     // Catch: java.lang.Exception -> L87
                    java.lang.String r1 = r8.callId     // Catch: java.lang.Exception -> L87
                    boolean r0 = r8.muted     // Catch: java.lang.Exception -> L87
                    r11.L$0 = r8     // Catch: java.lang.Exception -> L87
                    r11.L$1 = r2     // Catch: java.lang.Exception -> L87
                    r11.I$0 = r3     // Catch: java.lang.Exception -> L87
                    r11.I$1 = r4     // Catch: java.lang.Exception -> L87
                    r11.I$2 = r10     // Catch: java.lang.Exception -> L87
                    r11.label = r6     // Catch: java.lang.Exception -> L87
                    java.lang.Object r12 = r9.reportMicStatus(r1, r0, r11)     // Catch: java.lang.Exception -> L87
                    if (r12 != r7) goto L5b
                    goto L86
                L58:
                    X.Hwg.A00(r12)     // Catch: java.lang.Exception -> L87
                L5b:
                    java.lang.Boolean r0 = X.AnonymousClass001.A0h()     // Catch: java.lang.Exception -> L87
                    boolean r0 = X.C7384Etj.areEqual(r12, r0)     // Catch: java.lang.Exception -> L87
                    if (r0 != 0) goto L68
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L87
                    return r7
                L68:
                    int r4 = r4 + 1
                    if (r4 >= r3) goto L93
                    if (r4 <= 0) goto L2f
                    r11.L$0 = r8     // Catch: java.lang.Exception -> L87
                    r11.L$1 = r2     // Catch: java.lang.Exception -> L87
                    r11.I$0 = r3     // Catch: java.lang.Exception -> L87
                    r11.I$1 = r4     // Catch: java.lang.Exception -> L87
                    r11.I$2 = r4     // Catch: java.lang.Exception -> L87
                    r11.label = r5     // Catch: java.lang.Exception -> L87
                    r0 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r0 = X.C7Bq.A01(r0, r11)     // Catch: java.lang.Exception -> L87
                    if (r0 == r7) goto L95
                    r0 = r4
                L83:
                    r10 = r4
                    r4 = r0
                    goto L30
                L86:
                    return r7
                L87:
                    r2 = move-exception
                    boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                    if (r0 != 0) goto L9a
                    java.lang.String r1 = "Failed to report mic status"
                    java.lang.String r0 = "VoiceSessionController"
                    X.CFK.A0A(r0, r1, r2)
                L93:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                L95:
                    return r7
                L96:
                    java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
                L9a:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass19.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(MicStatusReport micStatusReport, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(micStatusReport, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass19(HtJ<? super AnonymousClass19> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass19(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C05563uZ c05563uZA01 = Hu1.A01(sessionController.micStatusReports);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sessionController, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass1, c05563uZA01) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass19(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$20", f = "SessionController.kt", l = {1015}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$20, reason: invalid class name */
    public final class AnonymousClass20 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$20$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class AnonymousClass2 extends F2X implements G0W {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(String str, boolean z, HtJ<? super HxE<String, Boolean>> htJ) {
                return AnonymousClass002.A0q(str, z);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return new HxE(obj, obj2);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$20$3", f = "SessionController.kt", l = {1017}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$20$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<HxE<? extends String, ? extends Boolean>, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<String> $reportedCallId;
            public final /* synthetic */ C10543Hqv<Boolean> $reportedPlaying;
            public final /* synthetic */ BO7 $seq;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public boolean Z$0;
            public int label;
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C10543Hqv<String> c10543Hqv, C10543Hqv<Boolean> c10543Hqv2, BO7 bo7, SessionController sessionController, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$reportedCallId = c10543Hqv;
                this.$reportedPlaying = c10543Hqv2;
                this.$seq = bo7;
                this.this$0 = sessionController;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportedCallId, this.$reportedPlaying, this.$seq, this.this$0, htJ);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends String, ? extends Boolean> hxE, HtJ<? super Unit> htJ) {
                return invoke2((HxE<String, Boolean>) hxE, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean, java.lang.Object] */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean zA1X;
                ?? A0d;
                HxE hxE = (HxE) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    String str = (String) hxE.first;
                    zA1X = AnonymousClass001.A1X(hxE.second);
                    A0d = str;
                    if (str != null) {
                        if (!zA1X) {
                            this.L$0 = null;
                            this.L$1 = str;
                            this.Z$0 = zA1X;
                            this.label = 1;
                            if (C7Bq.A01(400L, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            zA1X = false;
                            A0d = str;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                zA1X = this.Z$0;
                A0d = C3cG.A0d(this.L$1, obj);
                if (!C7384Etj.areEqual(A0d, this.$reportedCallId.element)) {
                    this.$reportedCallId.element = A0d;
                    this.$reportedPlaying.element = null;
                    this.$seq.element = 0L;
                }
                ?? ValueOf = Boolean.valueOf(zA1X);
                C10543Hqv<Boolean> c10543Hqv = this.$reportedPlaying;
                if (!ValueOf.equals(c10543Hqv.element)) {
                    c10543Hqv.element = ValueOf;
                    BO7 bo7 = this.$seq;
                    long j = bo7.element + 1;
                    bo7.element = j;
                    this.this$0.playbackStatusReports.AhZ(new PlaybackStatusReport(A0d, j, zA1X));
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<String, Boolean> hxE, HtJ<? super Unit> htJ) {
                return ((AnonymousClass3) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass20(HtJ<? super AnonymousClass20> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass20(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                C10543Hqv c10543HqvA0z = C3cG.A0z();
                BO7 bo7 = new BO7();
                SessionController sessionController = SessionController.this;
                C60I c60iA03 = C3rb.A03(AnonymousClass2.INSTANCE, GDB.A01(new SessionController$20$invokeSuspend$$inlined$map$1(sessionController.callMarker)), sessionController.voiceCallStateHolder.isBotAudioActive);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(c10543HqvA10, c10543HqvA0z, bo7, sessionController, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass3, c60iA03) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass20(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$21", f = "SessionController.kt", l = {1030, 1033}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$21, reason: invalid class name */
    public final class AnonymousClass21 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass21(HtJ<? super AnonymousClass21> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass21(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0054 -> B:9:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:9:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:9:0x001f). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
            /*
                r12 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L14
                if (r0 == r4) goto L2d
                if (r0 != r5) goto L7c
                java.lang.Object r3 = r12.L$0
                X.GCW r3 = (X.GCW) r3
                X.Hwg.A00(r13)     // Catch: java.lang.Exception -> L6e
                goto L1f
            L14:
                X.Hwg.A00(r13)
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                X.HzR<com.facebook.aura.partners.voice.session.impl.SessionController$PlaybackStatusReport> r0 = r0.playbackStatusReports
                X.GCW r3 = r0.APO()
            L1f:
                r12.L$0 = r3
                r0 = 0
                r12.L$1 = r0
                r12.label = r4
                java.lang.Object r13 = r3.A01(r12)
                if (r13 != r6) goto L34
                return r6
            L2d:
                java.lang.Object r3 = r12.L$0
                X.GCW r3 = (X.GCW) r3
                X.Hwg.A00(r13)
            L34:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r0 = r13.booleanValue()
                if (r0 == 0) goto L81
                java.lang.Object r2 = r3.A00()
                com.facebook.aura.partners.voice.session.impl.SessionController$PlaybackStatusReport r2 = (com.facebook.aura.partners.voice.session.impl.SessionController.PlaybackStatusReport) r2
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                X.BLG<com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState> r0 = r0.callMarker
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState r0 = (com.facebook.aura.partners.voice.session.impl.SessionController.CallMarkerState) r0
                java.lang.String r1 = r0.callId
                java.lang.String r0 = r2.callId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L1f
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = com.facebook.aura.partners.voice.session.impl.SessionController.this     // Catch: java.lang.Exception -> L6e
                com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r7 = r0.voiceCallRepository     // Catch: java.lang.Exception -> L6e
                java.lang.String r8 = r2.callId     // Catch: java.lang.Exception -> L6e
                long r9 = r2.seq     // Catch: java.lang.Exception -> L6e
                boolean r11 = r2.playing     // Catch: java.lang.Exception -> L6e
                r12.L$0 = r3     // Catch: java.lang.Exception -> L6e
                r0 = 0
                r12.L$1 = r0     // Catch: java.lang.Exception -> L6e
                r12.label = r5     // Catch: java.lang.Exception -> L6e
                java.lang.Object r0 = r7.reportPlaybackStatus(r8, r9, r11, r12)     // Catch: java.lang.Exception -> L6e
                if (r0 != r6) goto L1f
                goto L7b
            L6e:
                r2 = move-exception
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L80
                java.lang.String r1 = "Failed to report playback status"
                java.lang.String r0 = "VoiceSessionController"
                X.CFK.A0A(r0, r1, r2)
                goto L1f
            L7b:
                return r6
            L7c:
                java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            L80:
                throw r2
            L81:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass21.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass21(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$22", f = "SessionController.kt", l = {1041}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$22, reason: invalid class name */
    public final class AnonymousClass22 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass22(HtJ<? super AnonymousClass22> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass22(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<Unit> c22i = sessionController.voiceCallStateHolder.callIdleShownEvents;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.22.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        SessionController sessionController2 = sessionController;
                        sessionController2.connectionTracker.point("embodiment_idle_first_frame", C3cG.A0R(sessionController2.currentMarkerKey), false);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass22(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$23", f = "SessionController.kt", l = {1046}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$23, reason: invalid class name */
    public final class AnonymousClass23 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass23(HtJ<? super AnonymousClass23> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass23(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<Unit> c22i = sessionController.voiceCallStateHolder.callIdlePosterShownEvents;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.23.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        SessionController sessionController2 = sessionController;
                        sessionController2.connectionTracker.point("embodiment_idle_poster_shown", C3cG.A0R(sessionController2.currentMarkerKey), false);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass23(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$24", f = "SessionController.kt", l = {1059}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$24, reason: invalid class name */
    public final class AnonymousClass24 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$24$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$24$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    boolean r2 = r3.Z$0
                    boolean r1 = r3.Z$1
                    int r0 = r3.label
                    if (r0 != 0) goto L16
                    X.Hwg.A00(r4)
                    if (r2 != 0) goto L10
                    r0 = 1
                    if (r1 == 0) goto L11
                L10:
                    r0 = 0
                L11:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L16:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass24.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass24(HtJ<? super AnonymousClass24> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass24(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(C3rb.A04(new AnonymousClass1(null), AuraAppLifecycleManager.isAppInForegroundFlow, AbstractC05623ug.A00(AnonymousClass001.A0y(), VoicePrefs.INSTANCE.observeBackgroundingEnabled(SessionController.this.userSession))));
                final SessionController sessionController = SessionController.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.24.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z && sessionController.accessory == null && !sessionController.voiceCallStateHolder.keepAssistantCallInBackground && C3cI.A0I(sessionController) != VoiceCallPhase.ENDED && !AnonymousClass003.A1Z(AuraAppLifecycleManager._isAppInForegroundNormalPriority)) {
                            try {
                                SessionController.endCall$default(sessionController, false, VoiceCallConnectionTracker.END_REASON_APP_BACKGROUND, null, null, null, null, 60, null);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Exception e2) {
                                CFK.A08(SessionControllerKt.TAG, "Failed to end call on app background", e2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass24(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$3", f = "SessionController.kt", l = {718}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$3$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ SessionController this$0;

            public AnonymousClass1(SessionController sessionController) {
                this.this$0 = sessionController;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchGatewayStateSnapshot) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.HatchGatewayStateSnapshot r8, X.HtJ<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.SessionController$3$1$emit$1
                    if (r0 == 0) goto L2e
                    r6 = r9
                    com.facebook.aura.partners.voice.session.impl.SessionController$3$1$emit$1 r6 = (com.facebook.aura.partners.voice.session.impl.SessionController$3$1$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L2e
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r5 = r6.result
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r1 = r6.label
                    r3 = 0
                    r0 = 1
                    if (r1 == 0) goto L39
                    if (r1 != r0) goto L34
                    java.lang.Object r1 = r6.L$2
                    com.facebook.aura.partners.voice.session.impl.SessionController r1 = (com.facebook.aura.partners.voice.session.impl.SessionController) r1
                    java.lang.Object r2 = r6.L$1
                    X.BLa r2 = (X.InterfaceC2261BLa) r2
                    java.lang.Object r8 = r6.L$0
                    com.facebook.aura.gateway.HatchGatewayStateSnapshot r8 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r8
                    X.Hwg.A00(r5)
                    goto L4f
                L2e:
                    com.facebook.aura.partners.voice.session.impl.SessionController$3$1$emit$1 r6 = new com.facebook.aura.partners.voice.session.impl.SessionController$3$1$emit$1
                    r6.<init>(r7, r9)
                    goto L12
                L34:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L39:
                    X.Hwg.A00(r5)
                    com.facebook.aura.partners.voice.session.impl.SessionController r1 = r7.this$0
                    X.BLa r2 = r1.agentStatusUpdateMutex
                    r6.L$0 = r8
                    r6.L$1 = r2
                    r6.L$2 = r1
                    r6.label = r0
                    java.lang.Object r0 = r2.APs(r3, r6)
                    if (r0 != r4) goto L4f
                    return r4
                L4f:
                    com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r8.connection     // Catch: java.lang.Throwable -> L62
                    boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected     // Catch: java.lang.Throwable -> L62
                    if (r0 != 0) goto L5c
                    com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r1 = r1.voiceCallStateHolder     // Catch: java.lang.Throwable -> L62
                    com.facebook.aura.model.AgentActivityStatus r0 = com.facebook.aura.model.AgentActivityStatus.ONLINE     // Catch: java.lang.Throwable -> L62
                    r1.setAgentActivityStatus(r0)     // Catch: java.lang.Throwable -> L62
                L5c:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L62
                    r2.Ahe(r3)
                    return r4
                L62:
                    r0 = move-exception
                    r2.Ahe(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass3.AnonymousClass1.emit(com.facebook.aura.gateway.HatchGatewayStateSnapshot, X.HtJ):java.lang.Object");
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C1BN<HatchGatewayStateSnapshot> c1bn = sessionController.gateway.gatewayState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sessionController);
                this.label = 1;
                if (c1bn.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$4", f = "SessionController.kt", l = {726}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                this.label = 1;
                if (sessionController.trackReconnectConnectivity(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$5", f = "SessionController.kt", l = {728}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass5(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = SessionController.this;
                C22I<String> c22i = sessionController.voiceCallStateHolder.liveAvatarUnavailableShown;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.5.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        CFK.A05(SessionControllerKt.TAG, "live_avatar.unavailable_toast decision=shown");
                        VoicePrefs.INSTANCE.markLiveAvatarUnavailableNoticed(sessionController.userSession, str);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$6", f = "SessionController.kt", l = {745}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$6$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$6$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<HatchVoiceVideoConfigStore.Snapshot, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$6$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03111 extends AbstractC7559F3s implements Function0<Boolean> {
                public static final C03111 INSTANCE = new C03111();

                public C03111() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled());
                }
            }

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            @Override // X.G0W
            public final Object invoke(HatchVoiceVideoConfigStore.Snapshot snapshot, Boolean bool, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = snapshot;
                anonymousClass1.L$1 = bool;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                PreparedHatchAvatar preparedHatchAvatar;
                HatchAvatarSelection hatchAvatarSelection;
                HatchAvatarReference hatchAvatarReference;
                HatchVoiceVideoConfigStore.Snapshot snapshot = (HatchVoiceVideoConfigStore.Snapshot) this.L$0;
                Boolean bool = (Boolean) this.L$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                boolean z = false;
                if (snapshot != null && (preparedHatchAvatar = snapshot.avatar) != null && (hatchAvatarSelection = preparedHatchAvatar.selection) != null && (hatchAvatarReference = hatchAvatarSelection.reference) != null && !hatchAvatarReference.embodimentCompatible) {
                    z = true;
                }
                return Boolean.valueOf(VoiceLiveAvatarUpdateStatusKt.embodimentCompatibleForCall(bool, !z, C03111.INSTANCE));
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$6$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ VoiceCallStateHolder $tmp0;

            public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder) {
                this.$tmp0 = voiceCallStateHolder;
            }

            public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                this.$tmp0.setAvatarEmbodimentCompatible(z);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, VoiceCallStateHolder.class, "setAvatarEmbodimentCompatible", "setAvatarEmbodimentCompatible(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.setAvatarEmbodimentCompatible(AnonymousClass001.A1X(obj));
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass6(HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass6(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), sessionController.videoConfigStore.presentation, sessionController.voiceCallStateHolder.callAvatarEmbodimentCompatible);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SessionController.this.voiceCallStateHolder);
                this.label = 1;
                if (c60iA03.collect(anonymousClass2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass6(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$7", f = "SessionController.kt", l = {764}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$7$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$7$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<AvatarMedia, Boolean, HtJ<? super AvatarStatusVideos>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SessionController sessionController, HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
                this.this$0 = sessionController;
            }

            public final Object invoke(AvatarMedia avatarMedia, boolean z, HtJ<? super AvatarStatusVideos> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.L$0 = avatarMedia;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AvatarMedia avatarMedia = (AvatarMedia) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                AvatarStatusVideos avatarStatusVideosStatusVideos = AvatarMediaUrlsKt.statusVideos(AvatarMediaSelectionKt.select(avatarMedia, z), this.this$0.userSession);
                SessionController sessionController = this.this$0;
                if (!z) {
                    return avatarStatusVideosStatusVideos;
                }
                return new AvatarStatusVideos(avatarStatusVideosStatusVideos.idle, avatarStatusVideosStatusVideos.working, DarkCallMediaKt.darkCallMakingSomethingUrl(avatarMedia, sessionController.userSession), avatarStatusVideosStatusVideos.connecting, avatarStatusVideosStatusVideos.wakingVideo, avatarStatusVideosStatusVideos.startFrames);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(AvatarMedia avatarMedia, Boolean bool, HtJ<? super AvatarStatusVideos> htJ) {
                return invoke(avatarMedia, AnonymousClass001.A1X(bool), htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$7$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$7$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G2k<AiIdentity, AvatarStatusVideos, String, String, HtJ<? super AvatarStatusVideos>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ Object L$3;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(5, htJ);
            }

            @Override // X.G2k
            public final Object invoke(AiIdentity aiIdentity, AvatarStatusVideos avatarStatusVideos, String str, String str2, HtJ<? super AvatarStatusVideos> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = aiIdentity;
                anonymousClass2.L$1 = avatarStatusVideos;
                anonymousClass2.L$2 = str;
                anonymousClass2.L$3 = str2;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AiIdentity aiIdentity = (AiIdentity) this.L$0;
                AvatarStatusVideos avatarStatusVideos = (AvatarStatusVideos) this.L$1;
                String str = (String) this.L$2;
                Object obj2 = this.L$3;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return SessionControllerKt.callStatusVideos(aiIdentity, avatarStatusVideos, str, AnonymousClass002.A1X(obj2));
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$7$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ VoiceCallStateHolder $tmp0;

            public AnonymousClass3(VoiceCallStateHolder voiceCallStateHolder) {
                this.$tmp0 = voiceCallStateHolder;
            }

            public final Object emit(AvatarStatusVideos avatarStatusVideos, HtJ<? super Unit> htJ) {
                this.$tmp0.setCallStatusVideos(avatarStatusVideos);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, VoiceCallStateHolder.class, "setCallStatusVideos", "setCallStatusVideos(Lcom/facebook/aura/model/AvatarStatusVideos;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.setCallStatusVideos((AvatarStatusVideos) obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass7(HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass7(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                HatchIdentityProvider hatchIdentityProvider = sessionController.identityProvider;
                C1BN<AiIdentity> c1bn = hatchIdentityProvider.aiIdentity;
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(sessionController, null), hatchIdentityProvider.avatarMedia, sessionController.avatarReferenceProvider.isCallEmbodimentDark);
                SessionController sessionController2 = SessionController.this;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AnonymousClass2(null), c1bn, c60iA03, sessionController2.voiceCallStateHolder.callAvatarImagePath, sessionController2.callAvatarWithoutImageCallId);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(SessionController.this.voiceCallStateHolder);
                this.label = 1;
                if (anonymousClass603A01.collect(anonymousClass3, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass7(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$8", f = "SessionController.kt", l = {774}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$8$2", f = "SessionController.kt", l = {776, 777}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$8$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $plannedRestartOutage;
            public Object L$0;
            public int label;
            public final /* synthetic */ SessionController this$0;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$8$2$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$8$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                    anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                    return anonymousClass1;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(!z);
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SessionController sessionController, C20Q<Boolean> c20q, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = sessionController;
                this.$plannedRestartOutage = c20q;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, this.$plannedRestartOutage, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C57m c57mShowServiceRestartReconnecting;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    c57mShowServiceRestartReconnecting = this.this$0.showServiceRestartReconnecting();
                    if (c57mShowServiceRestartReconnecting != null) {
                        this.L$0 = c57mShowServiceRestartReconnecting;
                        this.label = 1;
                        if (C7Bq.A01(8000L, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    c57mShowServiceRestartReconnecting = (C57m) this.L$0;
                    Hwg.A00(obj);
                    this.this$0.clearServiceRestartReconnecting(c57mShowServiceRestartReconnecting);
                    return Unit.INSTANCE;
                }
                c57mShowServiceRestartReconnecting = (C57m) this.L$0;
                Hwg.A00(obj);
                C20Q<Boolean> c20q = this.$plannedRestartOutage;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = c57mShowServiceRestartReconnecting;
                this.label = 2;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, c20q) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                this.this$0.clearServiceRestartReconnecting(c57mShowServiceRestartReconnecting);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass8(HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass8(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = SessionController.this.gateway;
                C20Q c20qA04 = C3rb.A04(new SessionController$8$plannedRestartOutage$1(null), hatchGatewayConnection.serviceRestartPending, hatchGatewayConnection.connectionState);
                SessionController$8$invokeSuspend$$inlined$filter$1 sessionController$8$invokeSuspend$$inlined$filter$1 = new SessionController$8$invokeSuspend$$inlined$filter$1(c20qA04);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SessionController.this, c20qA04, null);
                this.L$0 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, sessionController$8$invokeSuspend$$inlined$filter$1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass8(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$9", f = "SessionController.kt", l = {782}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$9$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ SessionController this$0;

            public AnonymousClass1(SessionController sessionController) {
                this.this$0 = sessionController;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((AgentStatusPayload) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.AgentStatusPayload r13, X.HtJ<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.facebook.aura.partners.voice.session.impl.SessionController$9$1$emit$1
                    if (r0 == 0) goto L32
                    r7 = r14
                    com.facebook.aura.partners.voice.session.impl.SessionController$9$1$emit$1 r7 = (com.facebook.aura.partners.voice.session.impl.SessionController$9$1$emit$1) r7
                    int r2 = r7.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L32
                    int r2 = r2 - r1
                    r7.label = r2
                L12:
                    java.lang.Object r3 = r7.result
                    X.Hji r2 = X.EnumC10460Hji.A02
                    int r1 = r7.label
                    r4 = 0
                    r0 = 1
                    if (r1 == 0) goto L3d
                    if (r1 != r0) goto L38
                    java.lang.Object r6 = r7.L$3
                    com.facebook.aura.partners.voice.session.impl.SessionController r6 = (com.facebook.aura.partners.voice.session.impl.SessionController) r6
                    java.lang.Object r5 = r7.L$2
                    X.BLa r5 = (X.InterfaceC2261BLa) r5
                    java.lang.Object r9 = r7.L$1
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object r13 = r7.L$0
                    com.facebook.aura.gateway.AgentStatusPayload r13 = (com.facebook.aura.gateway.AgentStatusPayload) r13
                    X.Hwg.A00(r3)
                    goto L57
                L32:
                    com.facebook.aura.partners.voice.session.impl.SessionController$9$1$emit$1 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$9$1$emit$1
                    r7.<init>(r12, r14)
                    goto L12
                L38:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L3d:
                    X.Hwg.A00(r3)
                    java.lang.String r9 = r13.sessionId
                    com.facebook.aura.partners.voice.session.impl.SessionController r6 = r12.this$0
                    X.BLa r5 = r6.agentStatusUpdateMutex
                    r7.L$0 = r13
                    r7.L$1 = r9
                    r7.L$2 = r5
                    r7.L$3 = r6
                    r7.label = r0
                    java.lang.Object r0 = r5.APs(r4, r7)
                    if (r0 != r2) goto L57
                    return r2
                L57:
                    com.facebook.aura.gateway.HatchGatewayConnection r0 = r6.gateway     // Catch: java.lang.Throwable -> L9d
                    X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r0 = r0.gatewayState     // Catch: java.lang.Throwable -> L9d
                    java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L9d
                    com.facebook.aura.gateway.HatchGatewayStateSnapshot r0 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r0     // Catch: java.lang.Throwable -> L9d
                    com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r0.connection     // Catch: java.lang.Throwable -> L9d
                    boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected     // Catch: java.lang.Throwable -> L9d
                    if (r0 == 0) goto L97
                    long r2 = r13.sequence     // Catch: java.lang.Throwable -> L9d
                    long r0 = r6.agentStatusAdmissionFloor     // Catch: java.lang.Throwable -> L9d
                    int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r7 <= 0) goto L97
                    long r0 = r13.sequence     // Catch: java.lang.Throwable -> L9d
                    com.facebook.aura.gateway.HatchGatewayConnection r2 = r6.gateway     // Catch: java.lang.Throwable -> L9d
                    long r7 = r2.getAgentStatusConnectionFloor()     // Catch: java.lang.Throwable -> L9d
                    int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r2 <= 0) goto L97
                    com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r6.voiceCallStateHolder     // Catch: java.lang.Throwable -> L9d
                    boolean r0 = r0.isAgentActivityTarget(r9)     // Catch: java.lang.Throwable -> L9d
                    if (r0 == 0) goto L97
                    com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r8 = r6.voiceCallStateHolder     // Catch: java.lang.Throwable -> L9d
                    com.facebook.aura.model.AgentActivityStatus r10 = r13.activityStatusForCurrentSubscription()     // Catch: java.lang.Throwable -> L9d
                    java.lang.String r11 = r13.activityText     // Catch: java.lang.Throwable -> L9d
                    java.lang.String r12 = r13.activityEmoji     // Catch: java.lang.Throwable -> L9d
                    java.lang.String r13 = r13.activityDetail     // Catch: java.lang.Throwable -> L9d
                    com.facebook.aura.partners.voice.session.impl.SessionController$9$1$1$1 r14 = new com.facebook.aura.partners.voice.session.impl.SessionController$9$1$1$1     // Catch: java.lang.Throwable -> L9d
                    r14.<init>(r6)     // Catch: java.lang.Throwable -> L9d
                    r8.setAgentActivityStatusForMatchingThread(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L9d
                L97:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9d
                    r5.Ahe(r4)
                    return r2
                L9d:
                    r0 = move-exception
                    r5.Ahe(r4)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.AnonymousClass9.AnonymousClass1.emit(com.facebook.aura.gateway.AgentStatusPayload, X.HtJ):java.lang.Object");
            }
        }

        public AnonymousClass9(HtJ<? super AnonymousClass9> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new AnonymousClass9(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<AgentStatusPayload> agentStatusEvents = SessionController.this.gateway.getAgentStatusEvents();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SessionController.this);
                this.label = 1;
                if (agentStatusEvents.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new AnonymousClass9(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class AccessoryVideo {
        public C57m boundSession;
        public int createFailures;
        public final int height;
        public AccessoryIdleClip idle;
        public Float idleFocusY;
        public HoC idleWait;
        public boolean lastIdleFailed;
        public EmbodimentVideoRenderer renderer;
        public final Surface surface;
        public final int width;

        public AccessoryVideo(Surface surface, int i, int i2) {
            C7384Etj.A0Y(surface, 0);
            this.surface = surface;
            this.width = i;
            this.height = i2;
        }

        public final C57m getBoundSession() {
            return this.boundSession;
        }

        public final int getCreateFailures() {
            return this.createFailures;
        }

        public final int getHeight() {
            return this.height;
        }

        public final AccessoryIdleClip getIdle() {
            return this.idle;
        }

        public final Float getIdleFocusY() {
            return this.idleFocusY;
        }

        public final HoC getIdleWait() {
            return this.idleWait;
        }

        public final boolean getLastIdleFailed() {
            return this.lastIdleFailed;
        }

        public final EmbodimentVideoRenderer getRenderer() {
            return this.renderer;
        }

        public final Surface getSurface() {
            return this.surface;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setBoundSession(C57m c57m) {
            this.boundSession = c57m;
        }

        public final void setCreateFailures(int i) {
            this.createFailures = i;
        }

        public final void setIdle(AccessoryIdleClip accessoryIdleClip) {
            this.idle = accessoryIdleClip;
        }

        public final void setIdleFocusY(Float f) {
            this.idleFocusY = f;
        }

        public final void setIdleWait(HoC hoC) {
            this.idleWait = hoC;
        }

        public final void setLastIdleFailed(boolean z) {
            this.lastIdleFailed = z;
        }

        public final void setRenderer(EmbodimentVideoRenderer embodimentVideoRenderer) {
            this.renderer = embodimentVideoRenderer;
        }
    }

    public final class CallEndOwnership extends C06G {
        public final long callAttemptGeneration;
        public final int generation;
        public final String pinOwner;
        public final C57m session;
        public final EmbodimentVideoRenderer staleRenderer;
        public final boolean wasActive;

        public static /* synthetic */ CallEndOwnership copy$default(CallEndOwnership callEndOwnership, C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer, String str, boolean z, int i, long j, int i2, Object obj) {
            C57m c57m2 = c57m;
            EmbodimentVideoRenderer embodimentVideoRenderer2 = embodimentVideoRenderer;
            String str2 = str;
            boolean z2 = z;
            int i3 = i;
            long j2 = j;
            if ((i2 & 1) != 0) {
                c57m2 = callEndOwnership.session;
            }
            if ((i2 & 2) != 0) {
                embodimentVideoRenderer2 = callEndOwnership.staleRenderer;
            }
            if ((i2 & 4) != 0) {
                str2 = callEndOwnership.pinOwner;
            }
            if ((i2 & 8) != 0) {
                z2 = callEndOwnership.wasActive;
            }
            if ((i2 & 16) != 0) {
                i3 = callEndOwnership.generation;
            }
            if ((i2 & 32) != 0) {
                j2 = callEndOwnership.callAttemptGeneration;
            }
            return new CallEndOwnership(c57m2, embodimentVideoRenderer2, str2, z2, i3, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CallEndOwnership) {
                    CallEndOwnership callEndOwnership = (CallEndOwnership) obj;
                    if (!C7384Etj.areEqual(this.session, callEndOwnership.session) || !C7384Etj.areEqual(this.staleRenderer, callEndOwnership.staleRenderer) || !C7384Etj.areEqual(this.pinOwner, callEndOwnership.pinOwner) || this.wasActive != callEndOwnership.wasActive || this.generation != callEndOwnership.generation || this.callAttemptGeneration != callEndOwnership.callAttemptGeneration) {
                    }
                }
                return false;
            }
            return true;
        }

        public final C57m component1() {
            return this.session;
        }

        public final EmbodimentVideoRenderer component2() {
            return this.staleRenderer;
        }

        public final String component3() {
            return this.pinOwner;
        }

        public final boolean component4() {
            return this.wasActive;
        }

        public final int component5() {
            return this.generation;
        }

        public final long component6() {
            return this.callAttemptGeneration;
        }

        public final CallEndOwnership copy(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer, String str, boolean z, int i, long j) {
            return new CallEndOwnership(c57m, embodimentVideoRenderer, str, z, i, j);
        }

        public final long getCallAttemptGeneration() {
            return this.callAttemptGeneration;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getPinOwner() {
            return this.pinOwner;
        }

        public final C57m getSession() {
            return this.session;
        }

        public final EmbodimentVideoRenderer getStaleRenderer() {
            return this.staleRenderer;
        }

        public final boolean getWasActive() {
            return this.wasActive;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.callAttemptGeneration, (C0KA.A01(((((AnonymousClass006.A0D(this.session) * 31) + AnonymousClass006.A0D(this.staleRenderer)) * 31) + AnonymousClass005.A0H(this.pinOwner)) * 31, this.wasActive) + this.generation) * 31);
        }

        public CallEndOwnership(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer, String str, boolean z, int i, long j) {
            this.session = c57m;
            this.staleRenderer = embodimentVideoRenderer;
            this.pinOwner = str;
            this.wasActive = z;
            this.generation = i;
            this.callAttemptGeneration = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CallMarkerState extends C06G {
        public final VoiceAudioOnlyReason audioOnlyReason;
        public final long callAttemptGeneration;
        public final String callId;
        public final String callServerInfoData;
        public final int connectGeneration;
        public final String cosmosThreadId;
        public final long placedAtMillis;
        public final Boolean poorLinkVideoFallbackEnabled;
        public final boolean requestsGeneratedVideo;
        public final String rtcSessionId;
        public final long startedAtMillis;
        public final String threadId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CallMarkerState) {
                    CallMarkerState callMarkerState = (CallMarkerState) obj;
                    if (!C7384Etj.areEqual(this.callId, callMarkerState.callId) || !C7384Etj.areEqual(this.rtcSessionId, callMarkerState.rtcSessionId) || !C7384Etj.areEqual(this.threadId, callMarkerState.threadId) || !C7384Etj.areEqual(this.cosmosThreadId, callMarkerState.cosmosThreadId) || this.connectGeneration != callMarkerState.connectGeneration || this.callAttemptGeneration != callMarkerState.callAttemptGeneration || this.placedAtMillis != callMarkerState.placedAtMillis || this.startedAtMillis != callMarkerState.startedAtMillis || this.requestsGeneratedVideo != callMarkerState.requestsGeneratedVideo || !C7384Etj.areEqual(this.poorLinkVideoFallbackEnabled, callMarkerState.poorLinkVideoFallbackEnabled) || this.audioOnlyReason != callMarkerState.audioOnlyReason || !C7384Etj.areEqual(this.callServerInfoData, callMarkerState.callServerInfoData)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CallMarkerState copy$default(CallMarkerState callMarkerState, String str, String str2, String str3, String str4, int i, long j, long j2, long j3, boolean z, Boolean bool, VoiceAudioOnlyReason voiceAudioOnlyReason, String str5, int i2, Object obj) {
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            int i3 = i;
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            boolean z2 = z;
            Boolean bool2 = bool;
            VoiceAudioOnlyReason voiceAudioOnlyReason2 = voiceAudioOnlyReason;
            String str9 = str5;
            if ((i2 & 1) != 0) {
                str = callMarkerState.callId;
            }
            if ((i2 & 2) != 0) {
                str6 = callMarkerState.rtcSessionId;
            }
            if ((i2 & 4) != 0) {
                str7 = callMarkerState.threadId;
            }
            if ((i2 & 8) != 0) {
                str8 = callMarkerState.cosmosThreadId;
            }
            if ((i2 & 16) != 0) {
                i3 = callMarkerState.connectGeneration;
            }
            if ((i2 & 32) != 0) {
                j4 = callMarkerState.callAttemptGeneration;
            }
            if ((i2 & 64) != 0) {
                j5 = callMarkerState.placedAtMillis;
            }
            if ((i2 & 128) != 0) {
                j6 = callMarkerState.startedAtMillis;
            }
            if ((i2 & 256) != 0) {
                z2 = callMarkerState.requestsGeneratedVideo;
            }
            if ((i2 & 512) != 0) {
                bool2 = callMarkerState.poorLinkVideoFallbackEnabled;
            }
            if ((i2 & 1024) != 0) {
                voiceAudioOnlyReason2 = callMarkerState.audioOnlyReason;
            }
            if ((i2 & 2048) != 0) {
                str9 = callMarkerState.callServerInfoData;
            }
            String str10 = str6;
            return new CallMarkerState(str, str10, str7, str8, i3, j4, j5, j6, z2, bool2, voiceAudioOnlyReason2, str9);
        }

        public final String component1() {
            return this.callId;
        }

        public final Boolean component10() {
            return this.poorLinkVideoFallbackEnabled;
        }

        public final VoiceAudioOnlyReason component11() {
            return this.audioOnlyReason;
        }

        public final String component12() {
            return this.callServerInfoData;
        }

        public final String component2() {
            return this.rtcSessionId;
        }

        public final String component3() {
            return this.threadId;
        }

        public final String component4() {
            return this.cosmosThreadId;
        }

        public final int component5() {
            return this.connectGeneration;
        }

        public final long component6() {
            return this.callAttemptGeneration;
        }

        public final long component7() {
            return this.placedAtMillis;
        }

        public final long component8() {
            return this.startedAtMillis;
        }

        public final boolean component9() {
            return this.requestsGeneratedVideo;
        }

        public final CallMarkerState copy(String str, String str2, String str3, String str4, int i, long j, long j2, long j3, boolean z, Boolean bool, VoiceAudioOnlyReason voiceAudioOnlyReason, String str5) {
            return new CallMarkerState(str, str2, str3, str4, i, j, j2, j3, z, bool, voiceAudioOnlyReason, str5);
        }

        public final VoiceAudioOnlyReason getAudioOnlyReason() {
            return this.audioOnlyReason;
        }

        public final long getCallAttemptGeneration() {
            return this.callAttemptGeneration;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getCallServerInfoData() {
            return this.callServerInfoData;
        }

        public final int getConnectGeneration() {
            return this.connectGeneration;
        }

        public final String getCosmosThreadId() {
            return this.cosmosThreadId;
        }

        public final long getPlacedAtMillis() {
            return this.placedAtMillis;
        }

        public final Boolean getPoorLinkVideoFallbackEnabled() {
            return this.poorLinkVideoFallbackEnabled;
        }

        public final boolean getRequestsGeneratedVideo() {
            return this.requestsGeneratedVideo;
        }

        public final String getRtcSessionId() {
            return this.rtcSessionId;
        }

        public final long getStartedAtMillis() {
            return this.startedAtMillis;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public int hashCode() {
            return ((((C0KA.A01(AnonymousClass006.A06(this.startedAtMillis, AnonymousClass006.A06(this.placedAtMillis, AnonymousClass006.A06(this.callAttemptGeneration, ((((((((AnonymousClass006.A0G(this.callId) * 31) + AnonymousClass006.A0G(this.rtcSessionId)) * 31) + AnonymousClass006.A0G(this.threadId)) * 31) + AnonymousClass006.A0G(this.cosmosThreadId)) * 31) + this.connectGeneration) * 31))), this.requestsGeneratedVideo) + AnonymousClass006.A0D(this.poorLinkVideoFallbackEnabled)) * 31) + AnonymousClass006.A0D(this.audioOnlyReason)) * 31) + AnonymousClass005.A0H(this.callServerInfoData);
        }

        public CallMarkerState(String str, String str2, String str3, String str4, int i, long j, long j2, long j3, boolean z, Boolean bool, VoiceAudioOnlyReason voiceAudioOnlyReason, String str5) {
            this.callId = str;
            this.rtcSessionId = str2;
            this.threadId = str3;
            this.cosmosThreadId = str4;
            this.connectGeneration = i;
            this.callAttemptGeneration = j;
            this.placedAtMillis = j2;
            this.startedAtMillis = j3;
            this.requestsGeneratedVideo = z;
            this.poorLinkVideoFallbackEnabled = bool;
            this.audioOnlyReason = voiceAudioOnlyReason;
            this.callServerInfoData = str5;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ CallMarkerState(String str, String str2, String str3, String str4, int i, long j, long j2, long j3, boolean z, Boolean bool, VoiceAudioOnlyReason voiceAudioOnlyReason, String str5, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, C3cH.A03(i2 & 32, j), C3cH.A03(i2 & 64, j2), (i2 & 128) == 0 ? j3 : 0L, (i2 & 256) == 0 ? z : false, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : voiceAudioOnlyReason, (i2 & 2048) != 0 ? null : str5);
        }

        public CallMarkerState() {
            this(null, null, null, null, 0, 0L, 0L, 0L, false, null, null, null);
        }
    }

    public final class CapturedUndeliveredSpeech {
        public final long callAttemptGeneration;
        public final String callId;
        public final CapturedSpeech captured;
        public final String endReason;
        public final PreConnectLiveCaption liveCaption;
        public final VoiceCallStateHolder.PendingThread pendingToken;
        public final String threadId;
        public final String turnId;

        public CapturedUndeliveredSpeech(VoiceCallStateHolder.PendingThread pendingThread, long j, String str, String str2, String str3, String str4, CapturedSpeech capturedSpeech, PreConnectLiveCaption preConnectLiveCaption) {
            C7384Etj.A0Y(pendingThread, 0);
            AnonymousClass003.A0y(str3, str4);
            C7384Etj.A0Y(capturedSpeech, 6);
            this.pendingToken = pendingThread;
            this.callAttemptGeneration = j;
            this.threadId = str;
            this.turnId = str2;
            this.callId = str3;
            this.endReason = str4;
            this.captured = capturedSpeech;
            this.liveCaption = preConnectLiveCaption;
        }

        public final long getCallAttemptGeneration() {
            return this.callAttemptGeneration;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final CapturedSpeech getCaptured() {
            return this.captured;
        }

        public final String getEndReason() {
            return this.endReason;
        }

        public final PreConnectLiveCaption getLiveCaption() {
            return this.liveCaption;
        }

        public final VoiceCallStateHolder.PendingThread getPendingToken() {
            return this.pendingToken;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public final String getTurnId() {
            return this.turnId;
        }
    }

    public final class Companion {
        public final String callStartAwaitedStem$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, String str2, String str3, CallStartAvatarLayout callStartAvatarLayout) {
            C7384Etj.A0Y(callStartAvatarLayout, 3);
            if (str == null) {
                if (str2 != null) {
                    return str2;
                }
                str = null;
                if (str3 != null && callStartAvatarLayout == CallStartAvatarLayout.NEW_AVATAR_STILL) {
                    return str3;
                }
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar completedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(java.lang.String r1, java.lang.String r2, com.facebook.aura.partners.voice.session.impl.CallStartAvatar r3, java.lang.String r4, boolean r5, X.G0U<? super java.lang.String, com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot> r6) {
            /*
                r0 = this;
                r0 = 5
                X.C7384Etj.A0Y(r6, r0)
                if (r1 != 0) goto L17
                if (r3 == 0) goto L12
                if (r5 != 0) goto L12
                java.lang.String r0 = r3.avatarStem
                boolean r0 = X.C7384Etj.areEqual(r0, r2)
                if (r0 == 0) goto L2d
            L12:
                com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$Unchanged r1 = com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar.Unchanged.INSTANCE
            L14:
                com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar r1 = (com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar) r1
                return r1
            L17:
                boolean r0 = r1.equals(r2)
                if (r0 != 0) goto L12
                boolean r0 = r1.equals(r4)
                if (r0 != 0) goto L41
                if (r3 == 0) goto L33
                java.lang.String r0 = r3.avatarStem
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L33
            L2d:
                com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$CallStart r1 = new com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$CallStart
                r1.<init>(r3)
                goto L14
            L33:
                java.lang.Object r0 = r6.invoke(r1)
                com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot r0 = (com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot) r0
                if (r0 == 0) goto L41
                com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$Remembered r1 = new com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$Remembered
                r1.<init>(r0)
                return r1
            L41:
                com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar$AwaitPrepared r1 = com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar.AwaitPrepared.INSTANCE
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.Companion.completedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(java.lang.String, java.lang.String, com.facebook.aura.partners.voice.session.impl.CallStartAvatar, java.lang.String, boolean, X.G0U):com.facebook.aura.partners.voice.session.impl.CompletedCallAvatar");
        }

        public final boolean keepsLiveAvatarTimer$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(HxE<String, String> hxE, String str, String str2) {
            boolean zA1a = AnonymousClass002.A1a(hxE, str);
            if (C3cG.A1O(str, hxE) && str2 != null && C7384Etj.areEqual(hxE.second, str2)) {
                return zA1a;
            }
            return false;
        }

        public final HatchCallJoinContext.AvatarUpdatingStart rearmedCallStart$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart) {
            C7384Etj.A0Y(avatarUpdatingStart, 0);
            return new HatchCallJoinContext.AvatarUpdatingStart(avatarUpdatingStart.presentation, null, avatarUpdatingStart.previousStem, avatarUpdatingStart.previousImagePath);
        }

        public final LiftedCallAvatar rejoinCallStartAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, CallStartAvatar callStartAvatar, HxE<String, HatchCallJoinContext.AvatarUpdatingStart> hxE, boolean z, String str2, G0U<? super String, HatchVoiceVideoConfigStore.Snapshot> g0u) {
            HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart;
            AnonymousClass002.A1D(str, 0, g0u);
            if (((hxE == null || !C3cG.A1O(str, hxE) || (avatarUpdatingStart = hxE.second) == null) ? null : avatarUpdatingStart.presentation) != HatchCallJoinContext.AvatarUpdatingPresentation.PREVIOUS_LIVE && !z) {
                return null;
            }
            LiftedCallAvatar liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = liftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str, callStartAvatar, hxE, g0u);
            if (C7384Etj.areEqual(liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, LiftedCallAvatar.Unchanged.INSTANCE) || ((liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl instanceof LiftedCallAvatar.CallStart) && C7384Etj.areEqual(((LiftedCallAvatar.CallStart) liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl).start.avatarStem, str2))) {
                return null;
            }
            return liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        
            if (r2 != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout startPresentationLayout$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.AvatarUpdatingPresentation r1, boolean r2) {
            /*
                r0 = this;
                r0 = -1
                if (r1 == 0) goto L14
                int r1 = r1.ordinal()
                if (r1 == r0) goto L14
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 0
                if (r1 == r0) goto L16
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L14:
                if (r2 == 0) goto L19
            L16:
                com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r0 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.PREVIOUS_AVATAR_LIVE
                return r0
            L19:
                com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r0 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.NEW_AVATAR_STILL
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.Companion.startPresentationLayout$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingPresentation, boolean):com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout");
        }

        /* loaded from: classes4.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchCallJoinContext.AvatarUpdatingPresentation.values().length];
                try {
                    AnonymousClass002.A13(HatchCallJoinContext.AvatarUpdatingPresentation.NEW_STILL, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchCallJoinContext.AvatarUpdatingPresentation.PREVIOUS_LIVE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final boolean rearmsCallStartWait$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, String str2) {
            return (str2 == null || str == null || str2.equals(str)) ? false : true;
        }

        public final String generateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl() {
            return AbstractC7535F0i.A00().toString().toUpperCase(Locale.ROOT);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar liftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(java.lang.String r3, com.facebook.aura.partners.voice.session.impl.CallStartAvatar r4, X.HxE<java.lang.String, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.AvatarUpdatingStart> r5, X.G0U<? super java.lang.String, com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot> r6) {
            /*
                r2 = this;
                X.AnonymousClass003.A0w(r3, r6)
                r2 = 0
                if (r4 == 0) goto L38
                java.lang.String r0 = r4.callId
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L38
            Le:
                if (r5 == 0) goto L3a
                boolean r0 = X.C3cG.A1O(r3, r5)
                if (r0 == 0) goto L3a
                B r1 = r5.second
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingStart r1 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.AvatarUpdatingStart) r1
                if (r1 == 0) goto L3a
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingPresentation r0 = r1.presentation
                if (r0 == 0) goto L3a
                java.lang.String r2 = r1.previousStem
                if (r4 == 0) goto L45
                java.lang.String r0 = r4.avatarStem
                if (r0 == 0) goto L45
                if (r2 == 0) goto L30
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L47
            L30:
                java.lang.String r0 = r1.previousImagePath
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$CallStart r1 = new com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$CallStart
                r1.<init>(r4, r0)
                return r1
            L38:
                r4 = r2
                goto Le
            L3a:
                if (r4 == 0) goto L42
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$CallStart r1 = new com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$CallStart
                r1.<init>(r4, r2)
                goto L54
            L42:
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$Unchanged r1 = com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar.Unchanged.INSTANCE
                goto L54
            L45:
                if (r2 == 0) goto L57
            L47:
                java.lang.Object r0 = r6.invoke(r2)
                com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot r0 = (com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot) r0
                if (r0 == 0) goto L57
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$Remembered r1 = new com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$Remembered
                r1.<init>(r0)
            L54:
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar r1 = (com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar) r1
                return r1
            L57:
                java.lang.String r0 = r1.previousImagePath
                if (r0 == 0) goto L61
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$PreviousImage r1 = new com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$PreviousImage
                r1.<init>(r2, r0)
                return r1
            L61:
                com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$Cleared r1 = new com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar$Cleared
                r1.<init>(r2)
                goto L54
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.Companion.liftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(java.lang.String, com.facebook.aura.partners.voice.session.impl.CallStartAvatar, X.HxE, X.G0U):com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar");
        }

        public final LiftedCallAvatar previousLiveCallStart$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, CallStartAvatar callStartAvatar, HxE<String, HatchCallJoinContext.AvatarUpdatingStart> hxE, G0U<? super String, HatchVoiceVideoConfigStore.Snapshot> g0u) {
            HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart;
            AnonymousClass003.A0w(str, g0u);
            if (((hxE == null || !C3cG.A1O(str, hxE) || (avatarUpdatingStart = hxE.second) == null) ? null : avatarUpdatingStart.presentation) != HatchCallJoinContext.AvatarUpdatingPresentation.PREVIOUS_LIVE) {
                return null;
            }
            LiftedCallAvatar liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = liftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str, callStartAvatar, hxE, g0u);
            if ((liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl instanceof LiftedCallAvatar.CallStart) || C7384Etj.areEqual(liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, LiftedCallAvatar.Unchanged.INSTANCE)) {
                return null;
            }
            return liftedCallAvatarLiftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class MicStatusReport {
        public final String callId;
        public final boolean muted;

        public MicStatusReport(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.callId = str;
            this.muted = z;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getMuted() {
            return this.muted;
        }
    }

    public final class PendingEmbodimentSurface extends C06G {
        public final int generation;
        public final int height;
        public final Surface surface;
        public final int width;

        public PendingEmbodimentSurface(Surface surface, int i, int i2, int i3) {
            C7384Etj.A0Y(surface, 0);
            this.surface = surface;
            this.width = i;
            this.height = i2;
            this.generation = i3;
        }

        public final PendingEmbodimentSurface copy(Surface surface, int i, int i2, int i3) {
            C7384Etj.A0Y(surface, 0);
            return new PendingEmbodimentSurface(surface, i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingEmbodimentSurface) {
                    PendingEmbodimentSurface pendingEmbodimentSurface = (PendingEmbodimentSurface) obj;
                    if (!C7384Etj.areEqual(this.surface, pendingEmbodimentSurface.surface) || this.width != pendingEmbodimentSurface.width || this.height != pendingEmbodimentSurface.height || this.generation != pendingEmbodimentSurface.generation) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingEmbodimentSurface copy$default(PendingEmbodimentSurface pendingEmbodimentSurface, Surface surface, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                surface = pendingEmbodimentSurface.surface;
            }
            if ((i4 & 2) != 0) {
                i = pendingEmbodimentSurface.width;
            }
            if ((i4 & 4) != 0) {
                i2 = pendingEmbodimentSurface.height;
            }
            if ((i4 & 8) != 0) {
                i3 = pendingEmbodimentSurface.generation;
            }
            C7384Etj.A0Y(surface, 0);
            return new PendingEmbodimentSurface(surface, i, i2, i3);
        }

        public final Surface component1() {
            return this.surface;
        }

        public final int component2() {
            return this.width;
        }

        public final int component3() {
            return this.height;
        }

        public final int component4() {
            return this.generation;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final int getHeight() {
            return this.height;
        }

        public final Surface getSurface() {
            return this.surface;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0E(this.surface) + this.width) * 31) + this.height) * 31) + this.generation;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PlaybackStatusReport {
        public final String callId;
        public final boolean playing;
        public final long seq;

        public PlaybackStatusReport(String str, long j, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.callId = str;
            this.seq = j;
            this.playing = z;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getPlaying() {
            return this.playing;
        }

        public final long getSeq() {
            return this.seq;
        }
    }

    public final class VoiceRestartState extends C06G {
        public final VoiceAudioOnlyReason audioOnlyReason;
        public final boolean captionsEnabled;
        public final boolean muted;
        public final boolean speakerOn;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VoiceRestartState) {
                    VoiceRestartState voiceRestartState = (VoiceRestartState) obj;
                    if (this.muted != voiceRestartState.muted || this.speakerOn != voiceRestartState.speakerOn || this.captionsEnabled != voiceRestartState.captionsEnabled || this.audioOnlyReason != voiceRestartState.audioOnlyReason) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ VoiceRestartState copy$default(VoiceRestartState voiceRestartState, boolean z, boolean z2, boolean z3, VoiceAudioOnlyReason voiceAudioOnlyReason, int i, Object obj) {
            if ((i & 1) != 0) {
                z = voiceRestartState.muted;
            }
            if ((i & 2) != 0) {
                z2 = voiceRestartState.speakerOn;
            }
            if ((i & 4) != 0) {
                z3 = voiceRestartState.captionsEnabled;
            }
            if ((i & 8) != 0) {
                voiceAudioOnlyReason = voiceRestartState.audioOnlyReason;
            }
            return new VoiceRestartState(z, z2, z3, voiceAudioOnlyReason);
        }

        public final boolean component1() {
            return this.muted;
        }

        public final boolean component2() {
            return this.speakerOn;
        }

        public final boolean component3() {
            return this.captionsEnabled;
        }

        public final VoiceAudioOnlyReason component4() {
            return this.audioOnlyReason;
        }

        public final VoiceRestartState copy(boolean z, boolean z2, boolean z3, VoiceAudioOnlyReason voiceAudioOnlyReason) {
            return new VoiceRestartState(z, z2, z3, voiceAudioOnlyReason);
        }

        public final VoiceAudioOnlyReason getAudioOnlyReason() {
            return this.audioOnlyReason;
        }

        public final boolean getCaptionsEnabled() {
            return this.captionsEnabled;
        }

        public final boolean getMuted() {
            return this.muted;
        }

        public final boolean getSpeakerOn() {
            return this.speakerOn;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(C0KA.A02(this.muted), this.speakerOn), this.captionsEnabled) + AnonymousClass006.A0D(this.audioOnlyReason);
        }

        public VoiceRestartState(boolean z, boolean z2, boolean z3, VoiceAudioOnlyReason voiceAudioOnlyReason) {
            this.muted = z;
            this.speakerOn = z2;
            this.captionsEnabled = z3;
            this.audioOnlyReason = voiceAudioOnlyReason;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WeakNetworkNotices {
        public final String callId;
        public final boolean inEpisode;
        public final int shown;

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getInEpisode() {
            return this.inEpisode;
        }

        public final int getShown() {
            return this.shown;
        }

        public WeakNetworkNotices(String str, int i, boolean z) {
            this.callId = str;
            this.shown = i;
            this.inEpisode = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$annotateMediaTransport$1", f = "SessionController.kt", l = {5134}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$annotateMediaTransport$1, reason: invalid class name and case insensitive filesystem */
    public final class C132461 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ C57m $session;
        public int label;
        public final /* synthetic */ SessionController this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$annotateMediaTransport$1$1", f = "SessionController.kt", l = {5139}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$annotateMediaTransport$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C03121 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
            public final /* synthetic */ C57m $session;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03121(C57m c57m, HtJ<? super C03121> htJ) {
                super(2, htJ);
                this.$session = c57m;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03121(this.$session, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
                return new C03121(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    SessionController$annotateMediaTransport$1$1$invokeSuspend$$inlined$mapNotNull$1 sessionController$annotateMediaTransport$1$1$invokeSuspend$$inlined$mapNotNull$1 = new SessionController$annotateMediaTransport$1$1$invokeSuspend$$inlined$mapNotNull$1(((MetaAiRsysSdkRealTimeSession) this.$session).A0C.A0B);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A02(sessionController$annotateMediaTransport$1$1$invokeSuspend$$inlined$mapNotNull$1, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132461(C57m c57m, SessionController sessionController, int i, HtJ<? super C132461> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.this$0 = sessionController;
            this.$markerKey = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132461(this.$session, this.this$0, this.$markerKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C03121 c03121 = new C03121(this.$session, null);
                this.label = 1;
                obj = C3cI.A0S(c03121, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String str = (String) obj;
            if (str != null) {
                this.this$0.connectionTracker.annotate("media_transport", str, C3cG.A0R(this.$markerKey));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132461) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$applyPortraitAdmission$1", f = "SessionController.kt", l = {3694}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$applyPortraitAdmission$1, reason: invalid class name and case insensitive filesystem */
    public final class C132471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAiIdentityHandler.AvatarImageKey $avatarKey;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ boolean $isNewCall;
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ boolean $startedOnCommittedAvatar;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132471(String str, long j, int i, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, boolean z, boolean z2, HtJ<? super C132471> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$generation = j;
            this.$markerKey = i;
            this.$avatarKey = avatarImageKey;
            this.$isNewCall = z;
            this.$startedOnCommittedAvatar = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132471(this.$callId, this.$generation, this.$markerKey, this.$avatarKey, this.$isNewCall, this.$startedOnCommittedAvatar, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCallJoinContext hatchCallJoinContext = SessionController.this.joinContext;
                String str2 = this.$callId;
                long j = this.$generation;
                this.label = 1;
                obj = hatchCallJoinContext.awaitAdmission(str2, j, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchCallJoinContext.CallAdmission callAdmission = (HatchCallJoinContext.CallAdmission) obj;
            HatchVideoCrop hatchVideoCrop = callAdmission != null ? callAdmission.portraitCrop : null;
            SessionController.this.connectionTracker.annotate("call_portrait_admitted", AnonymousClass002.A1X(hatchVideoCrop), C3cG.A0R(this.$markerKey));
            SessionController sessionController = SessionController.this;
            ReentrantLock reentrantLock = sessionController.lock;
            String str3 = this.$callId;
            HatchAiIdentityHandler.AvatarImageKey avatarImageKey = this.$avatarKey;
            boolean z = this.$isNewCall;
            boolean z2 = this.$startedOnCommittedAvatar;
            int i2 = this.$markerKey;
            reentrantLock.lock();
            try {
                if (C3cJ.A0z(sessionController, str3)) {
                    sessionController.admittedCallId = str3;
                    if (callAdmission != null) {
                        boolean zCurrentCallEmbodimentDark = sessionController.avatarReferenceProvider.currentCallEmbodimentDark();
                        sessionController.avatarReferenceProvider.pinCallIdleAppearance(Boolean.valueOf(callAdmission.darkPortrait));
                        if (zCurrentCallEmbodimentDark && !callAdmission.darkPortrait) {
                            sessionController.restoreLightCallMediaLocked();
                        }
                    }
                    if (hatchVideoCrop == null) {
                        sessionController.portraitMissingCallId.Af8(str3);
                        sessionController.voiceCallStateHolder.setCallAvatarEmbodimentCompatible(null);
                    } else {
                        if (callAdmission.avatarUpdating) {
                            avatarImageKey = null;
                        }
                        sessionController.applyPortraitCropLocked(str3, hatchVideoCrop, avatarImageKey);
                    }
                    if (z) {
                        sessionController.beginCallAvatarLocked(str3, callAdmission, z2, i2);
                    } else if (C7384Etj.areEqual(sessionController.newAvatarStillCallId.getValue(), str3)) {
                        Boolean boolValueOf = Boolean.valueOf(callAdmission != null && callAdmission.avatarUpdating);
                        if (C7384Etj.areEqual(sessionController.liveAvatarCompletedCallId, str3)) {
                            str = "completed";
                        } else {
                            HxE<String, ? extends CallAvatarUpdate.FailureReason> hxE = sessionController.liveAvatarFailedCall;
                            str = C7384Etj.areEqual(hxE != null ? hxE.first : null, str3) ? "failed" : "none";
                        }
                        CFK.A02(boolValueOf, str, SessionControllerKt.TAG, "live_avatar.rejoin action=keep_hidden avatar_updating=%b outcome=%s");
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132471) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitEmbodimentRendererRelease$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$awaitEmbodimentRendererRelease$2, reason: invalid class name and case insensitive filesystem */
    public final class C132482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmbodimentVideoRenderer $renderer;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132482(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer, HtJ<? super C132482> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$renderer = embodimentVideoRenderer;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132482(this.$session, this.$renderer, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SessionController.this.releaseEmbodimentRenderer(this.$session, this.$renderer);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132482) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1", f = "SessionController.kt", l = {4566}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C132491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $avatarStem;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ String $owner;
        public final /* synthetic */ PendingCallAvatarSwap $pending;
        public final /* synthetic */ HatchVideoCrop $portraitCrop;
        public final /* synthetic */ boolean $stillShown;
        public Object L$0;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132491(String str, SessionController sessionController, String str2, String str3, HatchVideoCrop hatchVideoCrop, boolean z, PendingCallAvatarSwap pendingCallAvatarSwap, HtJ<? super C132491> htJ) {
            super(2, htJ);
            this.$avatarStem = str;
            this.this$0 = sessionController;
            this.$callId = str2;
            this.$owner = str3;
            this.$portraitCrop = hatchVideoCrop;
            this.$stillShown = z;
            this.$pending = pendingCallAvatarSwap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132491(this.$avatarStem, this.this$0, this.$callId, this.$owner, this.$portraitCrop, this.$stillShown, this.$pending, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoC;
            HatchVoiceVideoConfigStore.Snapshot snapshotRepin;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController$awaitPreparedAvatarLocked$1$adopted$1 sessionController$awaitPreparedAvatarLocked$1$adopted$1 = new SessionController$awaitPreparedAvatarLocked$1$adopted$1(this.this$0, this.$callId, new F1E(), this.$owner, this.$portraitCrop, this.$avatarStem, this.$stillShown, null);
                this.L$0 = null;
                this.label = 1;
                obj = GAX.A01(this, sessionController$awaitPreparedAvatarLocked$1$adopted$1, SessionControllerKt.LIVE_AVATAR_UPDATE_STATUS_TIMEOUT_MS);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj != null) {
                String str = this.$avatarStem;
                CFK.A03(str != null ? str : "none", SessionControllerKt.TAG, "live_avatar.wait.end avatar_stem=%s result=adopted");
            } else {
                SessionController sessionController = this.this$0;
                ReentrantLock reentrantLock = sessionController.lock;
                String str2 = this.$avatarStem;
                String str3 = this.$callId;
                PendingCallAvatarSwap pendingCallAvatarSwap = this.$pending;
                String str4 = this.$owner;
                reentrantLock.lock();
                try {
                    CFK.A02(str2 != null ? str2 : "none", C3cJ.A0z(sessionController, str3) ? "timeout" : "call_changed", SessionControllerKt.TAG, "live_avatar.wait.end avatar_stem=%s result=%s");
                    String str5 = null;
                    if (sessionController.pendingCallAvatarSwap == pendingCallAvatarSwap) {
                        sessionController.pendingCallAvatarSwap = null;
                        if (C3cJ.A0z(sessionController, str3)) {
                            sessionController.endLiveAvatarUpdateTimeoutLocked("wait_ended");
                            sessionController.liftNewAvatarStillLocked(str3);
                            sessionController.voiceCallStateHolder.hideLiveAvatarUpdateStatus();
                            sessionController.liveAvatarUpdatingSince = null;
                        }
                    }
                    if (C3cJ.A0z(sessionController, str3) && C7384Etj.areEqual(sessionController.currentSessionPinOwner, str4) && ((hoC = sessionController.idleVideoUpdateJob) == null || !hoC.isActive())) {
                        HxE<String, String> hxE = sessionController.callShownAvatarStem;
                        if (hxE != null && C3cG.A1O(str3, hxE)) {
                            str5 = hxE.second;
                        }
                        HatchVoiceVideoConfigStore.Snapshot value = sessionController.videoConfigStore.updates.getValue();
                        if (value != null && C7384Etj.areEqual(value.avatarStem, str5) && (snapshotRepin = sessionController.videoConfigStore.repin(str4)) != null) {
                            sessionController.observeIdleVideoForCall(str3, snapshotRepin, sessionController.gateway.getCommittedAvatarImageKey());
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132491) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarHistory$1", f = "SessionController.kt", l = {4463}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C132501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ ConcurrentHashMap<String, HatchVoiceVideoConfigStore.Snapshot> $history;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarHistory$1$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 extends F2X implements G0W {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(HatchVoiceVideoConfigStore.Snapshot snapshot, String str, HtJ<? super HxE<HatchVoiceVideoConfigStore.Snapshot, String>> htJ) {
                return C3cG.A0r(snapshot, str);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return C3cG.A0r(obj, obj2);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarHistory$1$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarHistory$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $callId;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$callId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$callId, htJ);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String> hxE, HtJ<? super Boolean> htJ) {
                return invoke2((HxE<HatchVoiceVideoConfigStore.Snapshot, String>) hxE, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HxE hxE = (HxE) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(C7384Etj.areEqual(hxE.second, this.$callId));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<HatchVoiceVideoConfigStore.Snapshot, String> hxE, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass3) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132501(String str, ConcurrentHashMap<String, HatchVoiceVideoConfigStore.Snapshot> concurrentHashMap, HtJ<? super C132501> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$history = concurrentHashMap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132501(this.$callId, this.$history, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C10650I0u c10650I0u = new C10650I0u(new AnonymousClass3(this.$callId, null), C3rb.A03(AnonymousClass2.INSTANCE, sessionController.videoConfigStore.updates, new SessionController$beginCallAvatarHistory$1$invokeSuspend$$inlined$map$1(sessionController.callMarker)), 4);
                final ConcurrentHashMap<String, HatchVoiceVideoConfigStore.Snapshot> concurrentHashMap = this.$history;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.beginCallAvatarHistory.1.4
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<HatchVoiceVideoConfigStore.Snapshot, String>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HxE<HatchVoiceVideoConfigStore.Snapshot, String> hxE, HtJ<? super Unit> htJ) {
                        String str;
                        HatchVoiceVideoConfigStore.Snapshot snapshot = hxE.first;
                        if (snapshot != null && (str = snapshot.avatarStem) != null) {
                            concurrentHashMap.put(str, snapshot);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c10650I0u.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132501) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarLocked$4, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C132514 extends C7438Evz implements G0U<String, HatchVoiceVideoConfigStore.Snapshot> {
        public C132514(Object obj) {
            super(1, obj, ConcurrentHashMap.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // X.G0U
        public final HatchVoiceVideoConfigStore.Snapshot invoke(String str) {
            return (HatchVoiceVideoConfigStore.Snapshot) ((AbstractMap) AnonymousClass006.A0o(str, this)).get(str);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$beginRtcRejoin$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$beginRtcRejoin$2, reason: invalid class name and case insensitive filesystem */
    public final class C132522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ ReconnectVoiceCallRequest $request;
        public final /* synthetic */ VoiceRestartState $restoreState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132522(String str, ReconnectVoiceCallRequest reconnectVoiceCallRequest, VoiceRestartState voiceRestartState, HtJ<? super C132522> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$request = reconnectVoiceCallRequest;
            this.$restoreState = voiceRestartState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132522(this.$callId, this.$request, this.$restoreState, htJ);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.partners.voice.session.impl.SessionController$VoiceRestartState, java.util.concurrent.locks.ReentrantLock] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ?? r1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                try {
                    SessionController sessionController = SessionController.this;
                    ReentrantLock reentrantLock = sessionController.callLifecycleLock;
                    String str = this.$callId;
                    ReconnectVoiceCallRequest reconnectVoiceCallRequest = this.$request;
                    r1 = this.$restoreState;
                    reentrantLock.lock();
                    try {
                        sessionController.rejoinCall(str, reconnectVoiceCallRequest.rootCallServerInfoData, r1);
                        SessionController sessionController2 = SessionController.this;
                        ReentrantLock reentrantLockA0p = C3cH.A0p(sessionController2);
                        sessionController2.voiceRestartInProgress = false;
                        Unit unit = Unit.INSTANCE;
                        reentrantLockA0p.unlock();
                        return unit;
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    SessionController sessionController3 = SessionController.this;
                    ReentrantLock reentrantLockA0p2 = C3cH.A0p(sessionController3);
                    sessionController3.voiceRestartInProgress = false;
                    reentrantLockA0p2.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                r1.unlock();
                throw th2;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132522) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {2491}, m = "bindAccessoryVideo", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindAccessoryVideo$1, reason: invalid class name and case insensitive filesystem */
    public final class C132531 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C132531(HtJ<? super C132531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.bindAccessoryVideo(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurface$1", f = "SessionController.kt", l = {3052}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurface$1, reason: invalid class name and case insensitive filesystem */
    public final class C132541 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132541(C57m c57m, HtJ<? super C132541> htJ) {
            super(2, htJ);
            this.$session = c57m;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132541(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C57m c57m = this.$session;
                this.label = 1;
                if (sessionController.bindEmbodimentSurfaceOnMain(c57m, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132541) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {3077, 3097, 3143, 3148, 3176, 3198}, m = "bindEmbodimentSurfaceLocked", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C132551 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C132551(HtJ<? super C132551> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.bindEmbodimentSurfaceLocked(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceLocked$6, reason: invalid class name and case insensitive filesystem */
    public final class C132566 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ EmbodimentVideoRenderer $renderer;
        public final /* synthetic */ C57m $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132566(int i, C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer) {
            super(0);
            this.$markerKey = i;
            this.$session = c57m;
            this.$renderer = embodimentVideoRenderer;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2() {
            /*
                r5 = this;
                com.facebook.aura.partners.voice.session.impl.SessionController r4 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                java.util.concurrent.locks.ReentrantLock r3 = r4.lock
                X.57m r1 = r5.$session
                com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r2 = r5.$renderer
                r3.lock()
                X.57m r0 = r4.currentSession     // Catch: java.lang.Throwable -> L2d
                if (r0 != r1) goto L16
                com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r0 = r4.embodimentRenderers     // Catch: java.lang.Throwable -> L2d
                com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r1 = r0.active     // Catch: java.lang.Throwable -> L2d
                r0 = 1
                if (r1 == r2) goto L17
            L16:
                r0 = 0
            L17:
                r3.unlock()
                if (r0 == 0) goto L2c
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r3 = r0.connectionTracker
                int r0 = r5.$markerKey
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "first_video_frame"
                r0 = 0
                r3.point(r1, r2, r0)
            L2c:
                return
            L2d:
                r0 = move-exception
                r3.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132566.invoke2():void");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceLocked$8, reason: invalid class name and case insensitive filesystem */
    public final class C132578 extends AbstractC7559F3s implements Function0<Long> {
        public final /* synthetic */ EmbodimentVideoRenderer $renderer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132578(EmbodimentVideoRenderer embodimentVideoRenderer) {
            super(0);
            this.$renderer = embodimentVideoRenderer;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.$renderer.frameCount.get());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {6105, 3056}, m = "bindEmbodimentSurfaceOnMain", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceOnMain$1, reason: invalid class name and case insensitive filesystem */
    public final class C132581 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132581(HtJ<? super C132581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.bindEmbodimentSurfaceOnMain(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {5596, 5635, 5635, 5635}, m = "collectAudioLevels", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectAudioLevels$1, reason: invalid class name and case insensitive filesystem */
    public final class C132591 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132591(HtJ<? super C132591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.collectAudioLevels(null, 0, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectAudioLevels$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectAudioLevels$3, reason: invalid class name and case insensitive filesystem */
    public final class C132613 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132613(C57m c57m, int i, long j, HtJ<? super C132613> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$generation = i;
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132613(this.$session, this.$generation, this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            SessionController sessionController = SessionController.this;
            ReentrantLock reentrantLock = sessionController.lock;
            int i = this.$generation;
            long j = this.$callAttemptGeneration;
            reentrantLock.lock();
            try {
                if (i == sessionController.audioLevelGeneration.get()) {
                    AnonymousClass002.A1I(sessionController._userSpeechLevel, AnonymousClass001.A0l());
                    sessionController.voiceCallStateHolder.resetBotAudioLevelIfCurrent(j);
                }
                try {
                    ((MetaAiRsysSdkRealTimeSession) this.$session).A0B.A01 = 1000L;
                } catch (Exception e) {
                    CFK.A0A(SessionControllerKt.TAG, "failed to reset audio level interval", e);
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132613) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {5417}, m = "collectCaptions", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C132621 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132621(HtJ<? super C132621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.collectCaptions(null, 0L, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$2, reason: invalid class name and case insensitive filesystem */
    public final class C132632<T> implements C20Z {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ C57m $session;

        public static final void emit$lambda$0$0$replaceOrAppendInactive(List<CaptionEntry> list, int i, CaptionSpeaker captionSpeaker, String str) {
            if (i >= 0) {
                list.set(i, new CaptionEntry(captionSpeaker, str, null));
            } else {
                list.add(new CaptionEntry(captionSpeaker, str, null));
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CaptionSpeaker.values().length];
                try {
                    AnonymousClass002.A13(CaptionSpeaker.USER, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(CaptionSpeaker.BOT, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C132632(long j, C57m c57m) {
            this.$callAttemptGeneration = j;
            this.$session = c57m;
        }

        public static final void emit$lambda$0$0$replaceOrAppendActive(List<CaptionEntry> list, int i, CaptionSpeaker captionSpeaker, String str) {
            if (i >= 0) {
                CaptionEntry captionEntry = (CaptionEntry) AbstractC0878AGe.A0I(list);
                if ((captionEntry != null ? captionEntry.speaker : null) == captionSpeaker) {
                    list.set(i, new CaptionEntry(captionSpeaker, str, null));
                    return;
                }
            }
            list.add(new CaptionEntry(captionSpeaker, str, null));
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((MetaAiVoiceState) obj, (HtJ<? super Unit>) htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0278 A[Catch: all -> 0x0371, TryCatch #0 {all -> 0x0371, blocks: (B:83:0x017c, B:84:0x0180, B:86:0x018c, B:88:0x019a, B:89:0x019c, B:90:0x01a4, B:92:0x01aa, B:94:0x01b6, B:95:0x01ba, B:96:0x01c2, B:98:0x01c8, B:100:0x01d4, B:101:0x01d8, B:104:0x01e0, B:112:0x01f0, B:118:0x01fe, B:136:0x026a, B:137:0x0272, B:139:0x0278, B:141:0x0285, B:142:0x028f, B:144:0x0295, B:146:0x02a2, B:156:0x02bf, B:157:0x02c2, B:160:0x02cc, B:171:0x02ef, B:163:0x02db, B:158:0x02c6, B:159:0x02c9, B:194:0x036c, B:195:0x0370, B:135:0x0260, B:120:0x020b, B:131:0x0247, B:121:0x021e, B:123:0x022b, B:125:0x022f, B:133:0x0254, B:134:0x025c, B:128:0x023d, B:130:0x0241, B:132:0x024b, B:172:0x0316), top: B:199:0x017c }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0295 A[Catch: all -> 0x0371, TryCatch #0 {all -> 0x0371, blocks: (B:83:0x017c, B:84:0x0180, B:86:0x018c, B:88:0x019a, B:89:0x019c, B:90:0x01a4, B:92:0x01aa, B:94:0x01b6, B:95:0x01ba, B:96:0x01c2, B:98:0x01c8, B:100:0x01d4, B:101:0x01d8, B:104:0x01e0, B:112:0x01f0, B:118:0x01fe, B:136:0x026a, B:137:0x0272, B:139:0x0278, B:141:0x0285, B:142:0x028f, B:144:0x0295, B:146:0x02a2, B:156:0x02bf, B:157:0x02c2, B:160:0x02cc, B:171:0x02ef, B:163:0x02db, B:158:0x02c6, B:159:0x02c9, B:194:0x036c, B:195:0x0370, B:135:0x0260, B:120:0x020b, B:131:0x0247, B:121:0x021e, B:123:0x022b, B:125:0x022f, B:133:0x0254, B:134:0x025c, B:128:0x023d, B:130:0x0241, B:132:0x024b, B:172:0x0316), top: B:199:0x017c }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x02db A[Catch: all -> 0x0371, TryCatch #0 {all -> 0x0371, blocks: (B:83:0x017c, B:84:0x0180, B:86:0x018c, B:88:0x019a, B:89:0x019c, B:90:0x01a4, B:92:0x01aa, B:94:0x01b6, B:95:0x01ba, B:96:0x01c2, B:98:0x01c8, B:100:0x01d4, B:101:0x01d8, B:104:0x01e0, B:112:0x01f0, B:118:0x01fe, B:136:0x026a, B:137:0x0272, B:139:0x0278, B:141:0x0285, B:142:0x028f, B:144:0x0295, B:146:0x02a2, B:156:0x02bf, B:157:0x02c2, B:160:0x02cc, B:171:0x02ef, B:163:0x02db, B:158:0x02c6, B:159:0x02c9, B:194:0x036c, B:195:0x0370, B:135:0x0260, B:120:0x020b, B:131:0x0247, B:121:0x021e, B:123:0x022b, B:125:0x022f, B:133:0x0254, B:134:0x025c, B:128:0x023d, B:130:0x0241, B:132:0x024b, B:172:0x0316), top: B:199:0x017c }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x02b5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x02b3 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState r39, X.HtJ<? super kotlin.Unit> r40) {
            /*
                Method dump skipped, instructions count: 887
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132632.emit(com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState, X.HtJ):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {4925}, m = "collectSessionState", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$1, reason: invalid class name and case insensitive filesystem */
    public final class C132641 extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C132641(HtJ<? super C132641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.collectSessionState(null, 0, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$2", f = "SessionController.kt", l = {4888}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$2, reason: invalid class name and case insensitive filesystem */
    public final class C132652 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ C57m $session;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132652(C57m c57m, SessionController sessionController, int i, HtJ<? super C132652> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.this$0 = sessionController;
            this.$markerKey = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132652(this.$session, this.this$0, this.$markerKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<String> c1bn = ((MetaAiRsysSdkRealTimeSession) this.$session).A0d;
                final SessionController sessionController = this.this$0;
                final int i2 = this.$markerKey;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.collectSessionState.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        sessionController.updateRecordedSharedCallId(str, i2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132652) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$3", f = "SessionController.kt", l = {4893}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$3, reason: invalid class name and case insensitive filesystem */
    public final class C132663 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ C57m $session;
        public int label;
        public final /* synthetic */ SessionController this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$3$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132663(C57m c57m, SessionController sessionController, int i, long j, HtJ<? super C132663> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.this$0 = sessionController;
            this.$markerKey = i;
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132663(this.$session, this.this$0, this.$markerKey, this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Boolean> c1bn = ((MetaAiRsysSdkRealTimeSession) this.$session).A0c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A01(this, anonymousClass1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj != null) {
                this.this$0.connectionTracker.point("audio_playout_started", C3cG.A0R(this.$markerKey), false);
                this.this$0.voiceCallStateHolder.emitCallStartHapticIfCurrent(this.$callAttemptGeneration);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132663) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$4", f = "SessionController.kt", l = {4904}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$4, reason: invalid class name and case insensitive filesystem */
    public final class C132674 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ int $markerKey;
        public final /* synthetic */ boolean $poorLinkFallbackActive;
        public final /* synthetic */ boolean $requestsGeneratedVideo;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132674(C57m c57m, int i, String str, long j, boolean z, boolean z2, HtJ<? super C132674> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$markerKey = i;
            this.$callId = str;
            this.$callAttemptGeneration = j;
            this.$requestsGeneratedVideo = z;
            this.$poorLinkFallbackActive = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132674(this.$session, this.$markerKey, this.$callId, this.$callAttemptGeneration, this.$requestsGeneratedVideo, this.$poorLinkFallbackActive, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C57m c57m = this.$session;
                int i2 = this.$markerKey;
                String str = this.$callId;
                long j = this.$callAttemptGeneration;
                boolean z = this.$requestsGeneratedVideo;
                boolean z2 = this.$poorLinkFallbackActive;
                this.label = 1;
                if (sessionController.observeEmbodimentVideoPolicy(c57m, i2, str, j, z, z2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132674) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$5", f = "SessionController.kt", l = {4922}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$collectSessionState$5, reason: invalid class name and case insensitive filesystem */
    public final class C132685 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132685(C57m c57m, String str, long j, HtJ<? super C132685> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$callId = str;
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132685(this.$session, this.$callId, this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                C57m c57m = this.$session;
                String str = this.$callId;
                long j = this.$callAttemptGeneration;
                this.label = 1;
                if (sessionController.observeWeakConnection(c57m, str, j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132685) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$createAccessoryRenderer$1, reason: invalid class name and case insensitive filesystem */
    public final class C132701 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ EmbodimentVideoRenderer $renderer;
        public final /* synthetic */ AccessoryVideo $video;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$createAccessoryRenderer$1$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$createAccessoryRenderer$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03131 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ EmbodimentVideoRenderer $renderer;
            public final /* synthetic */ AccessoryVideo $video;
            public int label;
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03131(SessionController sessionController, AccessoryVideo accessoryVideo, EmbodimentVideoRenderer embodimentVideoRenderer, HtJ<? super C03131> htJ) {
                super(2, htJ);
                this.this$0 = sessionController;
                this.$video = accessoryVideo;
                this.$renderer = embodimentVideoRenderer;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03131(this.this$0, this.$video, this.$renderer, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                SessionController sessionController = this.this$0;
                ReentrantLock reentrantLock = sessionController.lock;
                AccessoryVideo accessoryVideo = this.$video;
                EmbodimentVideoRenderer embodimentVideoRenderer = this.$renderer;
                reentrantLock.lock();
                try {
                    if (sessionController.accessoryVideo == accessoryVideo && accessoryVideo.renderer == embodimentVideoRenderer) {
                        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) sessionController._accessoryLiveVideo);
                        HoC hoC = accessoryVideo.idleWait;
                        if (hoC != null) {
                            hoC.A5w(null);
                        }
                        AccessoryIdleClip accessoryIdleClip = accessoryVideo.idle;
                        if (accessoryIdleClip != null) {
                            accessoryIdleClip.stop();
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03131) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132701(AccessoryVideo accessoryVideo, EmbodimentVideoRenderer embodimentVideoRenderer) {
            super(0);
            this.$video = accessoryVideo;
            this.$renderer = embodimentVideoRenderer;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SessionController sessionController = SessionController.this;
            AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C03131(sessionController, this.$video, this.$renderer, null), sessionController.coroutineScope);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {2461}, m = "detachAccessoryVideoSurface", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$1, reason: invalid class name and case insensitive filesystem */
    public final class C132711 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132711(HtJ<? super C132711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.detachAccessoryVideoSurface(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$2", f = "SessionController.kt", l = {2461}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C132722 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HoC $release;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132722(HoC hoC, HtJ<? super C132722> htJ) {
            super(2, htJ);
            this.$release = hoC;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132722(this.$release, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HoC hoC = this.$release;
                this.label = 1;
                if (hoC.APQ(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C132722(this.$release, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C132731 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C132731 INSTANCE = new C132731();

        public C132731() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$endCallIfStillConnecting$1", f = "SessionController.kt", l = {1587, 1589}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallIfStillConnecting$1, reason: invalid class name and case insensitive filesystem */
    public final class C132741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ int $connectGeneration;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ int $markerKey;
        public long J$0;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallIfStillConnecting$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C03141 extends C7438Evz implements Function0<Unit> {
            public C03141(Object obj) {
                super(0, obj, VoiceCallStateHolder.class, "notifyConnectTimeout", "notifyConnectTimeout()V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((VoiceCallStateHolder) this.receiver).notifyConnectTimeout();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132741(String str, long j, int i, int i2, HtJ<? super C132741> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$generation = j;
            this.$connectGeneration = i;
            this.$markerKey = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132741(this.$callId, this.$generation, this.$connectGeneration, this.$markerKey, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L48
                if (r0 == r4) goto L5c
                if (r0 != r5) goto L72
                long r1 = r8.J$0
                X.Hwg.A00(r9)
            L11:
                com.facebook.aura.partners.voice.session.impl.SessionController r6 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                java.lang.String r5 = r8.$callId
                long r3 = r8.$generation
                int r0 = r8.$connectGeneration
                boolean r0 = com.facebook.aura.partners.voice.session.impl.SessionController.access$claimConnectOutcome(r6, r5, r3, r0)
                if (r0 == 0) goto L45
                java.lang.Long r0 = X.C3cG.A0S(r1)
                r7 = 0
                java.lang.Object[] r2 = new java.lang.Object[]{r0}
                java.lang.String r1 = "VoiceSessionController"
                java.lang.String r0 = "Voice connect did not complete within %dms of the join; ending call"
                X.CFK.A0H(r1, r0, r2)
                com.facebook.aura.partners.voice.session.impl.SessionController r1 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                java.lang.String r2 = r8.$callId
                int r3 = r8.$markerKey
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r1.voiceCallStateHolder
                com.facebook.aura.partners.voice.session.impl.SessionController$endCallIfStillConnecting$1$1 r6 = new com.facebook.aura.partners.voice.session.impl.SessionController$endCallIfStillConnecting$1$1
                r6.<init>(r0)
                r8 = 40
                r5 = 0
                java.lang.String r4 = "connect_timeout"
                r9 = r5
                com.facebook.aura.partners.voice.session.impl.SessionController.endCallOnFailure$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L45:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L48:
                X.Hwg.A00(r9)
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = com.facebook.aura.partners.voice.session.impl.SessionController.this
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext r3 = r0.joinContext
                java.lang.String r2 = r8.$callId
                long r0 = r8.$generation
                r8.label = r4
                java.lang.Object r9 = r3.awaitAdmission(r2, r0, r8)
                if (r9 != r6) goto L5f
                return r6
            L5c:
                X.Hwg.A00(r9)
            L5f:
                if (r9 == 0) goto L45
                com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
                long r1 = r0.getConnectTimeoutMs()
                r8.J$0 = r1
                r8.label = r5
                java.lang.Object r0 = X.C7Bq.A01(r1, r8)
                if (r0 != r6) goto L11
                return r6
            L72:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132741.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132741) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C132751 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C132751 INSTANCE = new C132751();

        public C132751() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1", f = "SessionController.kt", l = {1619}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C132761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ int $connectGeneration;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ int $markerKey;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C03151 extends C7438Evz implements Function0<Unit> {
            public C03151(Object obj) {
                super(0, obj, VoiceCallStateHolder.class, "notifyConnectTimeout", "notifyConnectTimeout()V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((VoiceCallStateHolder) this.receiver).notifyConnectTimeout();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SessionController sessionController) {
                super(0);
                this.this$0 = sessionController;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.voiceCallStateHolder.notifyOutOfCredits();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnCosmosJoinFailure$1$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<Unit> {
            public AnonymousClass3(Object obj) {
                super(0, obj, VoiceCallStateHolder.class, "notifyCapacityUnavailable", "notifyCapacityUnavailable()V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((VoiceCallStateHolder) this.receiver).notifyCapacityUnavailable();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132761(String str, long j, int i, int i2, HtJ<? super C132761> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$generation = j;
            this.$connectGeneration = i;
            this.$markerKey = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C132761 c132761 = SessionController.this.new C132761(this.$callId, this.$generation, this.$connectGeneration, this.$markerKey, htJ);
            c132761.L$0 = obj;
            return c132761;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoCA11;
            Object objAwaitJoinFailure = obj;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objAwaitJoinFailure);
                hoCA11 = AnonymousClass001.A11(new SessionController$endCallOnCosmosJoinFailure$1$retries$1(SessionController.this, this.$callId, this.$generation, this.$markerKey, null), c3ux);
                HatchCallJoinContext hatchCallJoinContext = SessionController.this.joinContext;
                String str = this.$callId;
                long j = this.$generation;
                this.L$0 = null;
                this.L$1 = hoCA11;
                this.label = 1;
                objAwaitJoinFailure = hatchCallJoinContext.awaitJoinFailure(str, j, this);
                if (objAwaitJoinFailure == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hoCA11 = (HoC) this.L$1;
                Hwg.A00(objAwaitJoinFailure);
            }
            HatchCallJoinContext.JoinFailure joinFailure = (HatchCallJoinContext.JoinFailure) objAwaitJoinFailure;
            hoCA11.A5w(null);
            if (joinFailure != null && SessionController.this.claimConnectOutcome(this.$callId, this.$generation, this.$connectGeneration)) {
                String str2 = joinFailure.errorCode;
                if (C60N.A00(1).equals(str2)) {
                    CFK.A06(SessionControllerKt.TAG, "media-to-Cosmos join got no response; ending call");
                    SessionController sessionController = SessionController.this;
                    SessionController.endCallOnFailure$default(sessionController, this.$callId, this.$markerKey, VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT, null, new C03151(sessionController.voiceCallStateHolder), false, 40, null);
                } else {
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    CFK.A0H(SessionControllerKt.TAG, "media-to-Cosmos join rejected (%s); ending call", str2);
                    SessionController.this.connectionTracker.annotate("cosmos_join_error_code", str2, C3cG.A0R(this.$markerKey));
                    if (str2.equals("out_of_credits")) {
                        SessionController sessionController2 = SessionController.this;
                        SessionController.endCall$default(sessionController2, true, "out_of_credits", null, this.$callId, new AnonymousClass2(sessionController2), null, 36, null);
                    } else {
                        boolean zEquals = str2.equals(SessionControllerKt.COSMOS_JOIN_CAPACITY_UNAVAILABLE);
                        SessionController sessionController3 = SessionController.this;
                        String str3 = this.$callId;
                        int i2 = this.$markerKey;
                        if (zEquals) {
                            sessionController3.endCallOnFailure(str3, i2, VoiceCallConnectionTracker.END_REASON_START_FAILED, VoiceCallConnectionTracker.STAGE_COSMOS_JOIN_REJECTED, new AnonymousClass3(sessionController3.voiceCallStateHolder), false);
                        } else {
                            SessionController.endCallOnFailure$default(sessionController3, str3, i2, VoiceCallConnectionTracker.END_REASON_START_FAILED, VoiceCallConnectionTracker.STAGE_COSMOS_JOIN_REJECTED, null, false, 48, null);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C132771 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C132771 INSTANCE = new C132771();

        public C132771() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endCallOnFailure$2, reason: invalid class name and case insensitive filesystem */
    public final class C132782 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $endReason;
        public final /* synthetic */ C10543Hqv<Long> $failedAtElapsedRealtimeMs;
        public final /* synthetic */ Function0<Unit> $onSpeechNotSent;
        public final /* synthetic */ CallEndOwnership $ownership;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132782(CallEndOwnership callEndOwnership, SessionController sessionController, Function0<Unit> function0, C10543Hqv<Long> c10543Hqv, String str) {
            super(0);
            this.$ownership = callEndOwnership;
            this.this$0 = sessionController;
            this.$onSpeechNotSent = function0;
            this.$failedAtElapsedRealtimeMs = c10543Hqv;
            this.$endReason = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CallEndOwnership callEndOwnership = this.$ownership;
            if (callEndOwnership == null || !this.this$0.isStillCurrentGeneration(callEndOwnership.generation)) {
                return;
            }
            this.$onSpeechNotSent.invoke();
            Long l = this.$failedAtElapsedRealtimeMs.element;
            if (l != null) {
                CallEndOwnership callEndOwnership2 = this.$ownership;
                if (callEndOwnership2.wasActive) {
                    boolean zEquals = VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE.equals(this.$endReason);
                    SessionController sessionController = this.this$0;
                    if (!zEquals) {
                        sessionController.voiceCallStateHolder.notifyPreConnectFailure(new VoicePreConnectFailure(callEndOwnership2.callAttemptGeneration, l.longValue()));
                    } else {
                        VoiceCallStateHolder voiceCallStateHolder = sessionController.voiceCallStateHolder;
                        voiceCallStateHolder.notifyOtherCallBlockedStart(C3cG.A0c(voiceCallStateHolder));
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1", f = "SessionController.kt", l = {2297, 2316, 2322}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1, reason: invalid class name and case insensitive filesystem */
    public final class C132791 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $pinOwner;
        public final /* synthetic */ boolean $playEndEarcon;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ C57m $session;
        public Object L$0;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132791(C57m c57m, SessionController sessionController, String str, String str2, boolean z, HtJ<? super C132791> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.this$0 = sessionController;
            this.$pinOwner = str;
            this.$reason = str2;
            this.$playEndEarcon = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132791(this.$session, this.this$0, this.$pinOwner, this.$reason, this.$playEndEarcon, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r13.label
                java.lang.String r10 = "VoiceSessionController"
                r2 = 60000(0xea60, double:2.9644E-319)
                r7 = 3
                r12 = 2
                r6 = 0
                r5 = 1
                if (r0 == 0) goto L2c
                if (r0 == r5) goto L96
                if (r0 == r12) goto L6c
                if (r0 != r7) goto Lb2
                X.Hwg.A00(r14)
            L18:
                boolean r0 = X.C3cG.A1P(r14, r5)
                if (r0 != 0) goto La0
                com.facebook.aura.partners.voice.session.impl.SessionController r3 = r13.this$0
                X.57m r2 = r13.$session
                java.lang.String r1 = r13.$pinOwner
                java.lang.String r0 = r13.$reason
                com.facebook.aura.partners.voice.session.impl.SessionController.access$watchOrphanedSession(r3, r2, r1, r0)
            L29:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L2c:
                X.Hwg.A00(r14)
                X.57m r0 = r13.$session
                boolean r0 = X.C57m.A00(r0)
                if (r0 == 0) goto L49
                X.57m r4 = r13.$session
                boolean r1 = r13.$playEndEarcon
                com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$released$1 r0 = new com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$released$1
                r0.<init>(r4, r1, r6)
                r13.label = r5
                java.lang.Object r14 = X.GAX.A01(r13, r0, r2)
                if (r14 != r8) goto L99
                return r8
            L49:
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = r13.this$0
                X.3UX r11 = r0.teardownScope
                X.57m r9 = r13.$session
                java.lang.String r4 = r13.$reason
                boolean r1 = r13.$playEndEarcon
                com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$endJob$1 r0 = new com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$endJob$1
                r0.<init>(r9, r4, r1, r6)
                X.Hrx r1 = X.AnonymousClass001.A10(r0, r11)
                com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$endReturned$1 r0 = new com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$endReturned$1
                r0.<init>(r1, r6)
                r13.L$0 = r6
                r13.label = r12
                java.lang.Object r14 = X.C3cI.A0S(r0, r13)
                if (r14 != r8) goto L6f
                return r8
            L6c:
                X.Hwg.A00(r14)
            L6f:
                boolean r4 = X.C3cG.A1P(r14, r5)
                if (r4 != 0) goto L7a
                java.lang.String r0 = "Voice session end did not complete; waiting for native termination"
                X.CFK.A06(r10, r0)
            L7a:
                X.57m r0 = r13.$session
                boolean r0 = X.C57m.A00(r0)
                if (r0 != 0) goto La0
                X.57m r1 = r13.$session
                com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$nativeEnded$1 r0 = new com.facebook.aura.partners.voice.session.impl.SessionController$endSessionAndReleasePin$1$nativeEnded$1
                r0.<init>(r1, r6)
                r13.L$0 = r6
                r13.Z$0 = r4
                r13.label = r7
                java.lang.Object r14 = X.GAX.A01(r13, r0, r2)
                if (r14 != r8) goto L18
                return r8
            L96:
                X.Hwg.A00(r14)
            L99:
                if (r14 != 0) goto La0
                java.lang.String r0 = "Audio release timed out for a session that had already ended"
                X.CFK.A06(r10, r0)
            La0:
                com.facebook.aura.partners.voice.session.impl.SessionController r1 = r13.this$0
                java.lang.String r0 = r13.$pinOwner
                com.facebook.aura.partners.voice.session.impl.SessionController.access$releaseEmbodimentOwnership(r1, r0)
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = r13.this$0
                java.util.concurrent.ConcurrentHashMap<X.57m, java.lang.String> r1 = r0.sessionPinOwners
                X.57m r0 = r13.$session
                r1.remove(r0)
                goto L29
            Lb2:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132791) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {4814, 4820}, m = "ensureGatewayConnected", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$1, reason: invalid class name and case insensitive filesystem */
    public final class C132801 extends HzP {
        public int I$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C132801(HtJ<? super C132801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.ensureGatewayConnected(this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$forceEndCurrentCallInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C132811 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C132811 INSTANCE = new C132811();

        public C132811() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1", f = "SessionController.kt", l = {1933}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1, reason: invalid class name and case insensitive filesystem */
    public final class C132821 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ String $turnId;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1$1", f = "SessionController.kt", l = {1934}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03161 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public int label;
            public final /* synthetic */ SessionController this$0;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1$1$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handOffPreConnectCaption$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public final class C03171 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C03171(HtJ<? super C03171> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C03171 c03171 = new C03171(htJ);
                    c03171.Z$0 = AnonymousClass001.A1X(obj);
                    return c03171;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C03171) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03161(SessionController sessionController, HtJ<? super C03161> htJ) {
                super(2, htJ);
                this.this$0 = sessionController;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03161(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bn = this.this$0.voiceCallStateHolder.isBotAudioActive;
                    C03171 c03171 = new C03171(null);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A00(this, c03171, c1bn);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C03161(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132821(String str, long j, HtJ<? super C132821> htJ) {
            super(2, htJ);
            this.$turnId = str;
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132821(this.$turnId, this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C03161 c03161 = new C03161(SessionController.this, null);
                this.label = 1;
                if (C3cI.A0S(c03161, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SessionController sessionController = SessionController.this;
            Object obj2 = sessionController.threadCaptionLock;
            String str = this.$turnId;
            long j = this.$callAttemptGeneration;
            synchronized (obj2) {
                if (C7384Etj.areEqual(sessionController.handedOffTurnId, str) && C7384Etj.areEqual(sessionController.currentUserTurnId, str)) {
                    sessionController.clearThreadCaption(j);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132821) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {5265, 5265}, m = "handleSessionEnded", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$1, reason: invalid class name and case insensitive filesystem */
    public final class C132831 extends HzP {
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
        public int label;
        public /* synthetic */ Object result;

        public C132831(HtJ<? super C132831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.handleSessionEnded(null, null, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$4", f = "SessionController.kt", l = {5267}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$4, reason: invalid class name and case insensitive filesystem */
    public final class C132844 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ F1F $connectTimedOut;
        public final /* synthetic */ F1F $isCurrentGeneration;
        public final /* synthetic */ CallEndOwnership $ownership;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132844(C57m c57m, CallEndOwnership callEndOwnership, F1F f1f, F1F f1f2, HtJ<? super C132844> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$ownership = callEndOwnership;
            this.$isCurrentGeneration = f1f;
            this.$connectTimedOut = f1f2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132844(this.$session, this.$ownership, this.$isCurrentGeneration, this.$connectTimedOut, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController$handleSessionEnded$4$released$1 sessionController$handleSessionEnded$4$released$1 = new SessionController$handleSessionEnded$4$released$1(this.$session, this.$ownership, this.$isCurrentGeneration, this.$connectTimedOut, null);
                this.label = 1;
                obj = GAX.A01(this, sessionController$handleSessionEnded$4$released$1, 60000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj == null) {
                CFK.A06(SessionControllerKt.TAG, "Audio release timed out for a session that ended on its own");
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132844) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$5, reason: invalid class name and case insensitive filesystem */
    public final class C132855 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ F1F $connectTimedOut;
        public final /* synthetic */ C10543Hqv<Long> $failedAtElapsedRealtimeMs;
        public final /* synthetic */ CallEndOwnership $ownership;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132855(CallEndOwnership callEndOwnership, SessionController sessionController, C10543Hqv<Long> c10543Hqv, F1F f1f) {
            super(0);
            this.$ownership = callEndOwnership;
            this.this$0 = sessionController;
            this.$failedAtElapsedRealtimeMs = c10543Hqv;
            this.$connectTimedOut = f1f;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CallEndOwnership callEndOwnership = this.$ownership;
            if (callEndOwnership.wasActive && this.this$0.isStillCurrentGeneration(callEndOwnership.generation)) {
                Long l = this.$failedAtElapsedRealtimeMs.element;
                if (this.$connectTimedOut.element) {
                    this.this$0.voiceCallStateHolder.notifyConnectTimeout();
                } else if (l != null) {
                    this.this$0.voiceCallStateHolder.notifyPreConnectFailure(new VoicePreConnectFailure(this.$ownership.callAttemptGeneration, l.longValue()));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$liftNewAvatarStillLocked$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C132861 extends C7438Evz implements G0U<String, HatchVoiceVideoConfigStore.Snapshot> {
        public C132861(Object obj) {
            super(1, obj, ConcurrentHashMap.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // X.G0U
        public final HatchVoiceVideoConfigStore.Snapshot invoke(String str) {
            return (HatchVoiceVideoConfigStore.Snapshot) ((AbstractMap) AnonymousClass006.A0o(str, this)).get(str);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$maybeSignalUserSpeechStarted$1", f = "SessionController.kt", l = {2819}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$maybeSignalUserSpeechStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C132871 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C132871(HtJ<? super C132871> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132871(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    VoiceCallActivityRepository voiceCallActivityRepository = SessionController.this.voiceCallRepository;
                    this.label = 1;
                    if (voiceCallActivityRepository.userSpeechStarted(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A0A(SessionControllerKt.TAG, "Failed to notify user-speech-started marker", e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SessionController.this.new C132871(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$noticeServerVideoDisabled$1", f = "SessionController.kt", l = {3667}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$noticeServerVideoDisabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C132881 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ int $markerKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132881(String str, long j, int i, HtJ<? super C132881> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$generation = j;
            this.$markerKey = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132881(this.$callId, this.$generation, this.$markerKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCallJoinContext hatchCallJoinContext = SessionController.this.joinContext;
                    String str = this.$callId;
                    long j = this.$generation;
                    this.label = 1;
                    obj = hatchCallJoinContext.awaitServerVideoDisabled(str, j, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (AnonymousClass001.A1X(obj)) {
                    SessionController.this.connectionTracker.annotate(HatchWsSignalingTransportProxy.AUDIO_ONLY_REASON_SERVER_VIDEO_DISABLED, true, C3cG.A0R(this.$markerKey));
                    SessionController sessionController = SessionController.this;
                    ReentrantLock reentrantLock = sessionController.lock;
                    String str2 = this.$callId;
                    reentrantLock.lock();
                    try {
                        if (C3cJ.A0z(sessionController, str2) && !C7384Etj.areEqual(sessionController.serverVideoDisabledNoticeCallId, str2)) {
                            z = true;
                            sessionController.serverVideoDisabledNoticeCallId = str2;
                        }
                        if (z) {
                            SessionController.this.voiceCallStateHolder.notifyServerVideoDisabled();
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(SessionControllerKt.TAG, "Server video-disabled join outcome unavailable", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132881) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$1", f = "SessionController.kt", l = {5856}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$1, reason: invalid class name and case insensitive filesystem */
    public final class C132891 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ CallMarkerState $prev;
        public final /* synthetic */ long $startedAt;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132891(String str, long j, CallMarkerState callMarkerState, HtJ<? super C132891> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$startedAt = j;
            this.$prev = callMarkerState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132891(this.$callId, this.$startedAt, this.$prev, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                String str = this.$callId;
                long j = this.$startedAt;
                CallMarkerState callMarkerState = this.$prev;
                this.label = 1;
                if (sessionController.sendEndCall(str, j, callMarkerState, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132891) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$2", f = "SessionController.kt", l = {5859, 5860}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$2, reason: invalid class name and case insensitive filesystem */
    public final class C132902 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C27k<Boolean> $admitted;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ CallMarkerState $prev;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$2$1", f = "SessionController.kt", l = {5859}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallEnded$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ C27k<Boolean> $admitted;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C27k<Boolean> c27k, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$admitted = c27k;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$admitted, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C78T c78t = this.$admitted;
                    this.label = 1;
                    obj = ((GBM) c78t).A0E(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new AnonymousClass1(this.$admitted, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132902(String str, CallMarkerState callMarkerState, C27k<Boolean> c27k, HtJ<? super C132902> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$prev = callMarkerState;
            this.$admitted = c27k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132902(this.$callId, this.$prev, this.$admitted, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$admitted, null);
                this.label = 1;
                obj = GAX.A01(this, anonymousClass1, 15000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (C3cG.A1P(obj, true)) {
                SessionController sessionController = SessionController.this;
                String str = this.$callId;
                CallMarkerState callMarkerState = this.$prev;
                long j = callMarkerState.placedAtMillis;
                this.label = 2;
                if (sessionController.sendEndCall(str, j, callMarkerState, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132902) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallStarted$1", f = "SessionController.kt", l = {5778, 6105, 5798, 5795}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C132911 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ CallMarkerState $prev;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallStarted$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03181 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ SessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03181(SessionController sessionController) {
                super(0);
                this.this$0 = sessionController;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.voiceCallStateHolder.notifyOutOfCredits();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$notifyCallStarted$1$WhenMappings */
        /* loaded from: classes6.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[HatchCallJoinContext.BindResult.values().length];
                try {
                    AnonymousClass005.A0v(HatchCallJoinContext.BindResult.BOUND, iArr, 1);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass005.A0v(HatchCallJoinContext.BindResult.FAILED, iArr, 2);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass005.A0v(HatchCallJoinContext.BindResult.UNBOUND, iArr, 3);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[StartCallResult.values().length];
                try {
                    AnonymousClass005.A0v(StartCallResult.OK, iArr2, 1);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass005.A0v(StartCallResult.OUT_OF_CREDITS, iArr2, 2);
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    AnonymousClass005.A0v(StartCallResult.FAILED, iArr2, 3);
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132911(String str, CallMarkerState callMarkerState, HtJ<? super C132911> htJ) {
            super(2, htJ);
            this.$callId = str;
            this.$prev = callMarkerState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132911(this.$callId, this.$prev, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: all -> 0x0146, Exception -> 0x0148, TryCatch #9 {Exception -> 0x0148, all -> 0x0146, blocks: (B:35:0x00b4, B:37:0x00c5, B:38:0x00c7), top: B:94:0x00b4 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[Catch: all -> 0x0142, Exception -> 0x0144, TryCatch #10 {Exception -> 0x0144, all -> 0x0142, blocks: (B:41:0x00de, B:43:0x00e6, B:44:0x00fe), top: B:92:0x00de }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0138 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014d A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #2 {all -> 0x0181, blocks: (B:49:0x0139, B:63:0x0149, B:65:0x014d, B:73:0x0180), top: B:85:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0180 A[Catch: all -> 0x0181, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0181, blocks: (B:49:0x0139, B:63:0x0149, B:65:0x014d, B:73:0x0180), top: B:85:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132911.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132911) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$2, reason: invalid class name and case insensitive filesystem */
    public final class C132922 extends AbstractC07127nr implements G2l<Boolean, Boolean, String, String, Boolean, HtJ<? super VoiceEmbodimentVideoSuppression>, Object> {
        public final /* synthetic */ String $callId;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public /* synthetic */ boolean Z$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132922(String str, HtJ<? super C132922> htJ) {
            super(6, htJ);
            this.$callId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            boolean z3 = this.Z$2;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return new VoiceEmbodimentVideoSuppression(z, z2, true, C7384Etj.areEqual(obj2, this.$callId), C7384Etj.areEqual(obj3, this.$callId), z3);
        }

        @Override // X.G2l
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, String str, String str2, Boolean bool3, HtJ<? super VoiceEmbodimentVideoSuppression> htJ) {
            return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), str, str2, AnonymousClass001.A1X(bool3), htJ);
        }

        public final Object invoke(boolean z, boolean z2, String str, String str2, boolean z3, HtJ<? super VoiceEmbodimentVideoSuppression> htJ) {
            C132922 c132922 = new C132922(this.$callId, htJ);
            c132922.Z$0 = z;
            c132922.Z$1 = z2;
            c132922.L$0 = str;
            c132922.L$1 = str2;
            c132922.Z$2 = z3;
            return c132922.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$3, reason: invalid class name and case insensitive filesystem */
    public final class C132933 extends AbstractC07127nr implements G0V<VoiceEmbodimentVideoSuppression, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132933(C57m c57m, HtJ<? super C132933> htJ) {
            super(2, htJ);
            this.$session = c57m;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132933(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(C57m.A00(this.$session));
        }

        @Override // X.G0V
        public final Object invoke(VoiceEmbodimentVideoSuppression voiceEmbodimentVideoSuppression, HtJ<? super Boolean> htJ) {
            return new C132933(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1", f = "SessionController.kt", l = {4711}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C132951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $attemptCallId;
        public final /* synthetic */ HatchAiIdentityHandler.AvatarImageKey $callIdleAvatarKey;
        public final /* synthetic */ HatchVoiceVideoConfigStore.Snapshot $pinned;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03191 extends AbstractC07127nr implements G0W<VoiceEmbodimentMedia, Boolean, HtJ<? super VoiceEmbodimentMedia>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C03191(HtJ<? super C03191> htJ) {
                super(3, htJ);
            }

            public final Object invoke(VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z, HtJ<? super VoiceEmbodimentMedia> htJ) {
                C03191 c03191 = new C03191(htJ);
                c03191.L$0 = voiceEmbodimentMedia;
                return c03191.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentMedia voiceEmbodimentMedia, Boolean bool, HtJ<? super VoiceEmbodimentMedia> htJ) {
                return invoke(voiceEmbodimentMedia, AnonymousClass001.A1X(bool), htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G2l<HatchReadyCallIdle, HatchVoiceVideoConfigStore.Snapshot, VoiceEmbodimentMedia, String, CallPortraitFraming, HtJ<? super CallIdleInputs>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ Object L$3;
            public /* synthetic */ Object L$4;
            public int label;

            public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
                super(6, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchReadyCallIdle hatchReadyCallIdle = (HatchReadyCallIdle) this.L$0;
                HatchVoiceVideoConfigStore.Snapshot snapshot = (HatchVoiceVideoConfigStore.Snapshot) this.L$1;
                VoiceEmbodimentMedia voiceEmbodimentMedia = (VoiceEmbodimentMedia) this.L$2;
                String str = (String) this.L$3;
                CallPortraitFraming callPortraitFraming = (CallPortraitFraming) this.L$4;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new CallIdleInputs(hatchReadyCallIdle, snapshot, voiceEmbodimentMedia, str, callPortraitFraming);
            }

            @Override // X.G2l
            public final Object invoke(HatchReadyCallIdle hatchReadyCallIdle, HatchVoiceVideoConfigStore.Snapshot snapshot, VoiceEmbodimentMedia voiceEmbodimentMedia, String str, CallPortraitFraming callPortraitFraming, HtJ<? super CallIdleInputs> htJ) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
                anonymousClass3.L$0 = hatchReadyCallIdle;
                anonymousClass3.L$1 = snapshot;
                anonymousClass3.L$2 = voiceEmbodimentMedia;
                anonymousClass3.L$3 = str;
                anonymousClass3.L$4 = callPortraitFraming;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$4", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeIdleVideoForCall$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC07127nr implements G0V<CallIdleInputs, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $attemptCallId;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(String str, HtJ<? super AnonymousClass4> htJ) {
                super(2, htJ);
                this.$attemptCallId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$attemptCallId, htJ);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                CallIdleInputs callIdleInputs = (CallIdleInputs) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(C7384Etj.areEqual(callIdleInputs.callId, this.$attemptCallId));
            }

            @Override // X.G0V
            public final Object invoke(CallIdleInputs callIdleInputs, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass4) create(callIdleInputs, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132951(String str, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, HtJ<? super C132951> htJ) {
            super(2, htJ);
            this.$attemptCallId = str;
            this.$pinned = snapshot;
            this.$callIdleAvatarKey = avatarImageKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C132951 c132951 = SessionController.this.new C132951(this.$attemptCallId, this.$pinned, this.$callIdleAvatarKey, htJ);
            c132951.L$0 = obj;
            return c132951;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoCA11;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                hoCA11 = AnonymousClass001.A11(new SessionController$observeIdleVideoForCall$1$callIdleLoad$1(SessionController.this, null), c3ux);
                final C10543Hqv c10543HqvA0z = C3cG.A0z();
                final F1F f1f = new F1F();
                SessionController sessionController = SessionController.this;
                HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = sessionController.avatarReferenceProvider;
                C1BN<HatchReadyCallIdle> c1bn = hatchAvatarReferenceImageProvider.readyCallIdle;
                C1BN<HatchVoiceVideoConfigStore.Snapshot> c1bn2 = sessionController.videoConfigStore.updates;
                C60I c60iA03 = C3rb.A03(new C03191(null), sessionController.voiceCallStateHolder.embodimentMedia, hatchAvatarReferenceImageProvider.isCallEmbodimentDark);
                SessionController sessionController2 = SessionController.this;
                C10650I0u c10650I0u = new C10650I0u(new AnonymousClass4(this.$attemptCallId, null), new AnonymousClass603(3, new AnonymousClass3(null), new C20Q[]{c1bn, c1bn2, c60iA03, GDB.A01(new SessionController$observeIdleVideoForCall$1$invokeSuspend$$inlined$map$1(sessionController2.callMarker)), sessionController2.callPortraitFraming}), 4);
                final SessionController sessionController3 = SessionController.this;
                final HatchVoiceVideoConfigStore.Snapshot snapshot = this.$pinned;
                final String str = this.$attemptCallId;
                final HatchAiIdentityHandler.AvatarImageKey avatarImageKey = this.$callIdleAvatarKey;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.observeIdleVideoForCall.1.5
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((CallIdleInputs) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[PHI: r3
  0x00d1: PHI (r3v6 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$LiveRtc) = 
  (r3v5 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$LiveRtc)
  (r3v0 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$LiveRtc)
 binds: [B:39:0x00ca, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.partners.voice.session.impl.CallIdleInputs r9, X.HtJ<? super kotlin.Unit> r10) {
                        /*
                            Method dump skipped, instructions count: 233
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C132951.AnonymousClass5.emit(com.facebook.aura.partners.voice.session.impl.CallIdleInputs, X.HtJ):java.lang.Object");
                    }
                };
                this.L$0 = null;
                this.L$1 = hoCA11;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (c10650I0u.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hoCA11 = (HoC) this.L$1;
                Hwg.A00(obj);
            }
            hoCA11.A5w(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132951) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeWeakConnection$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$observeWeakConnection$2, reason: invalid class name and case insensitive filesystem */
    public final class C132962 extends AbstractC07127nr implements G0V<List<? extends MediaStats>, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132962(C57m c57m, HtJ<? super C132962> htJ) {
            super(2, htJ);
            this.$session = c57m;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C132962(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(C57m.A00(this.$session));
        }

        @Override // X.G0V
        public final Object invoke(List<? extends MediaStats> list, HtJ<? super Boolean> htJ) {
            return new C132962(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$onAccessoryIdleFailed$1", f = "SessionController.kt", l = {2607}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$onAccessoryIdleFailed$1, reason: invalid class name and case insensitive filesystem */
    public final class C132981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AccessoryVideo $video;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132981(AccessoryVideo accessoryVideo, HtJ<? super C132981> htJ) {
            super(2, htJ);
            this.$video = accessoryVideo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C132981(this.$video, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                AccessoryVideo accessoryVideo = this.$video;
                this.label = 1;
                if (sessionController.startAccessoryIdle(accessoryVideo, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132981) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {6105, 700}, m = "performVoiceControl", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C132991 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132991(HtJ<? super C132991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.performVoiceControl(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$recordCallConnected$1, reason: invalid class name and case insensitive filesystem */
    public final class C133001 extends AbstractC7559F3s implements G0U<VoiceBugReportInfo, VoiceBugReportInfo> {
        public final /* synthetic */ long $now;
        public final /* synthetic */ String $sharedCallId;

        @Override // X.G0U
        public final VoiceBugReportInfo invoke(VoiceBugReportInfo voiceBugReportInfo) {
            if (voiceBugReportInfo != null) {
                String str = this.$sharedCallId;
                if (str == null) {
                    str = voiceBugReportInfo.sharedCallId;
                }
                Long l = voiceBugReportInfo.connectedAtMillis;
                VoiceBugReportInfo voiceBugReportInfoCopy = voiceBugReportInfo.copy(str, voiceBugReportInfo.startedAtMillis, Long.valueOf(l != null ? l.longValue() : this.$now), voiceBugReportInfo.endedAtMillis, true);
                if (voiceBugReportInfoCopy != null) {
                    return voiceBugReportInfoCopy;
                }
            }
            String str2 = this.$sharedCallId;
            long j = this.$now;
            return new VoiceBugReportInfo(str2, j, Long.valueOf(j), null, true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133001(String str, long j) {
            super(1);
            this.$sharedCallId = str;
            this.$now = j;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$recordCallEnded$1, reason: invalid class name and case insensitive filesystem */
    public final class C133011 extends AbstractC7559F3s implements G0U<VoiceBugReportInfo, VoiceBugReportInfo> {
        public final /* synthetic */ F1F $justEnded;
        public final /* synthetic */ long $now;

        @Override // X.G0U
        public final VoiceBugReportInfo invoke(VoiceBugReportInfo voiceBugReportInfo) {
            F1F f1f = this.$justEnded;
            f1f.element = false;
            if (voiceBugReportInfo == null || voiceBugReportInfo.endedAtMillis != null) {
                return voiceBugReportInfo;
            }
            f1f.element = true;
            return voiceBugReportInfo.copy(voiceBugReportInfo.sharedCallId, voiceBugReportInfo.startedAtMillis, voiceBugReportInfo.connectedAtMillis, Long.valueOf(this.$now), false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133011(F1F f1f, long j) {
            super(1);
            this.$justEnded = f1f;
            this.$now = j;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$releaseAccessoryRendererLater$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$releaseAccessoryRendererLater$1, reason: invalid class name and case insensitive filesystem */
    public final class C133021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmbodimentVideoRenderer $renderer;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133021(EmbodimentVideoRenderer embodimentVideoRenderer, HtJ<? super C133021> htJ) {
            super(2, htJ);
            this.$renderer = embodimentVideoRenderer;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133021(this.$renderer, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$renderer.release();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C133021(this.$renderer, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {5830}, m = "resolveCallServerInfoData", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$1, reason: invalid class name and case insensitive filesystem */
    public final class C133031 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C133031(HtJ<? super C133031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.resolveCallServerInfoData(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$retryAccessoryVideoBind$1", f = "SessionController.kt", l = {2473, 2474}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$retryAccessoryVideoBind$1, reason: invalid class name and case insensitive filesystem */
    public final class C133041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AccessoryVideo $video;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133041(AccessoryVideo accessoryVideo, HtJ<? super C133041> htJ) {
            super(2, htJ);
            this.$video = accessoryVideo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133041(this.$video, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(500L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            SessionController sessionController = SessionController.this;
            AccessoryVideo accessoryVideo = this.$video;
            this.label = 2;
            if (sessionController.bindAccessoryVideo(accessoryVideo, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133041) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$scheduleAccessoryVideoBind$1", f = "SessionController.kt", l = {2468}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$scheduleAccessoryVideoBind$1, reason: invalid class name and case insensitive filesystem */
    public final class C133051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AccessoryVideo $video;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133051(AccessoryVideo accessoryVideo, HtJ<? super C133051> htJ) {
            super(2, htJ);
            this.$video = accessoryVideo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133051(this.$video, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SessionController sessionController = SessionController.this;
                AccessoryVideo accessoryVideo = this.$video;
                this.label = 1;
                if (sessionController.bindAccessoryVideo(accessoryVideo, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133051) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$scheduleCaptionClear$1", f = "SessionController.kt", l = {5721, 6105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$scheduleCaptionClear$1, reason: invalid class name and case insensitive filesystem */
    public final class C133061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133061(long j, HtJ<? super C133061> htJ) {
            super(2, htJ);
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133061(this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SessionController sessionController;
            InterfaceC2261BLa interfaceC2261BLa;
            long j;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(SessionControllerKt.TAG, "Post-turn caption clear failed", e2);
            }
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    this.label = 1;
                    if (C7Bq.A01(4000L, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        j = this.J$0;
                        sessionController = (SessionController) this.L$1;
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        Hwg.A00(obj);
                        sessionController.clearCaptions(j);
                        interfaceC2261BLa.Ahe(null);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                sessionController.clearCaptions(j);
                interfaceC2261BLa.Ahe(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
            sessionController = SessionController.this;
            interfaceC2261BLa = sessionController.captionMutex;
            j = this.$callAttemptGeneration;
            this.L$0 = interfaceC2261BLa;
            this.L$1 = sessionController;
            this.J$0 = j;
            this.label = 2;
            if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133061) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {6105, 5870}, m = "sendEndCall", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$sendEndCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C133071 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C133071(HtJ<? super C133071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.sendEndCall(null, 0L, null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$sendUndeliveredSpeech$1, reason: invalid class name and case insensitive filesystem */
    public final class C133081 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ F1F $sent;
        public final /* synthetic */ CapturedUndeliveredSpeech $speech;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133081(CapturedUndeliveredSpeech capturedUndeliveredSpeech, F1F f1f) {
            super(1);
            this.$speech = capturedUndeliveredSpeech;
            this.$sent = f1f;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            PreConnectLiveCaption preConnectLiveCaption = this.$speech.liveCaption;
            if (preConnectLiveCaption != null) {
                preConnectLiveCaption.close(!this.$sent.element);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$showConnectedUiLocked$2", f = "SessionController.kt", l = {5332}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$showConnectedUiLocked$2, reason: invalid class name and case insensitive filesystem */
    public final class C133092 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133092(C57m c57m, String str, HtJ<? super C133092> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$callId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133092(this.$session, this.$callId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceCallUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(1500L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SessionController sessionController = SessionController.this;
            ReentrantLock reentrantLock = sessionController.lock;
            C57m c57m = this.$session;
            String str = this.$callId;
            reentrantLock.lock();
            try {
                if (sessionController.isCurrentCallLocked(c57m, str) && C3cI.A0I(sessionController) != VoiceCallPhase.ENDED) {
                    BLG<VoiceCallUiState> blg = sessionController._callState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, VoiceCallPhase.ACTIVE, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 131070, null)));
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133092) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {2542, 2548, 2566, 2567}, m = "startAccessoryIdle", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startAccessoryIdle$1, reason: invalid class name and case insensitive filesystem */
    public final class C133101 extends HzP {
        public float F$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C133101(HtJ<? super C133101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.startAccessoryIdle(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startAccessoryIdle$4", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startAccessoryIdle$4, reason: invalid class name and case insensitive filesystem */
    public final class C133114 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $focusY;
        public final /* synthetic */ String $path;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133114(String str, float f, HtJ<? super C133114> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$focusY = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133114(this.$path, this.$focusY, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            VoicePrefs.INSTANCE.setLastAccessoryIdle(SessionController.this.userSession, this.$path, this.$focusY);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133114) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$1", f = "SessionController.kt", l = {1534, 1537}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C133121 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callId;
        public final /* synthetic */ int $connectGeneration;
        public final /* synthetic */ long $connectTimeoutMs;
        public final /* synthetic */ int $markerKey;
        public long J$0;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C03201 extends C7438Evz implements Function0<Unit> {
            public C03201(Object obj) {
                super(0, obj, VoiceCallStateHolder.class, "notifyConnectTimeout", "notifyConnectTimeout()V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((VoiceCallStateHolder) this.receiver).notifyConnectTimeout();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133121(long j, SessionController sessionController, String str, int i, int i2, HtJ<? super C133121> htJ) {
            super(2, htJ);
            this.$connectTimeoutMs = j;
            this.this$0 = sessionController;
            this.$callId = str;
            this.$markerKey = i;
            this.$connectGeneration = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133121(this.$connectTimeoutMs, this.this$0, this.$callId, this.$markerKey, this.$connectGeneration, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: Exception -> 0x00a9, CancellationException -> 0x00b2, TryCatch #3 {CancellationException -> 0x00b2, Exception -> 0x00a9, blocks: (B:25:0x0051, B:26:0x0054, B:34:0x0077, B:36:0x007c, B:13:0x0027, B:14:0x002a, B:17:0x0036, B:22:0x0044, B:38:0x00a5, B:39:0x00a8, B:10:0x001c), top: B:48:0x0009 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r13.label
                java.lang.String r2 = "VoiceSessionController"
                r9 = 2
                r12 = 0
                r7 = 1
                if (r0 == 0) goto L19
                if (r0 == r7) goto L27
                if (r0 != r9) goto L14
                long r4 = r13.J$0
                boolean r6 = r13.Z$0
                goto L51
            L14:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L19:
                X.Hwg.A00(r14)
                long r0 = r13.$connectTimeoutMs     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r13.label = r7     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.Object r0 = X.C7Bq.A01(r0, r13)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                if (r0 != r8) goto L2a
                return r8
            L27:
                X.Hwg.A00(r14)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
            L2a:
                com.facebook.aura.partners.voice.session.impl.SessionController r0 = r13.this$0     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.util.concurrent.locks.ReentrantLock r3 = X.C3cH.A0p(r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                X.57m r0 = r0.currentSession     // Catch: java.lang.Throwable -> La4
                boolean r6 = X.AnonymousClass002.A1X(r0)
                r3.unlock()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                long r4 = r13.$connectTimeoutMs
                r10 = r4
                if (r6 == 0) goto L42
                r0 = 3
                long r0 = r0 * r4
                r4 = r0
            L42:
                long r0 = r4 - r10
                r13.Z$0 = r6     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r13.J$0 = r4     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r13.label = r9     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.Object r0 = X.C7Bq.A01(r0, r13)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                if (r0 != r8) goto L54
                return r8
            L51:
                X.Hwg.A00(r14)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
            L54:
                com.facebook.aura.partners.voice.session.impl.SessionController r8 = r13.this$0     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.util.concurrent.locks.ReentrantLock r3 = r8.lock     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                int r1 = r13.$connectGeneration     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r3.lock()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.util.concurrent.atomic.AtomicInteger r0 = r8.connectAttempt     // Catch: java.lang.Throwable -> La4
                int r0 = r0.get()     // Catch: java.lang.Throwable -> La4
                if (r0 != r1) goto L76
                com.facebook.aura.partners.voice.intf.VoiceCallPhase r1 = X.C3cI.A0I(r8)     // Catch: java.lang.Throwable -> La4
                com.facebook.aura.partners.voice.intf.VoiceCallPhase r0 = com.facebook.aura.partners.voice.intf.VoiceCallPhase.ENDED     // Catch: java.lang.Throwable -> La4
                if (r1 == r0) goto L76
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.connectOutcomeSettled     // Catch: java.lang.Throwable -> La4
                boolean r1 = r0.compareAndSet(r12, r7)     // Catch: java.lang.Throwable -> La4
                r0 = 1
                if (r1 != 0) goto L77
            L76:
                r0 = 0
            L77:
                r3.unlock()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                if (r0 == 0) goto Laf
                java.lang.String r3 = "Voice connect did not complete within %dms (session started: %s); ending call"
                java.lang.Long r1 = X.C3cG.A0S(r4)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                X.CFK.A0H(r2, r3, r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                com.facebook.aura.partners.voice.session.impl.SessionController r6 = r13.this$0     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.String r7 = r13.$callId     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                int r8 = r13.$markerKey     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                java.lang.String r9 = "connect_timeout"
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r6.voiceCallStateHolder     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$1$1 r11 = new com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$1$1     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r11.<init>(r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                r13 = 40
                r10 = 0
                r14 = r10
                com.facebook.aura.partners.voice.session.impl.SessionController.endCallOnFailure$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                goto Laf
            La4:
                r0 = move-exception
                r3.unlock()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
                throw r0     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lb2
            La9:
                r1 = move-exception
                java.lang.String r0 = "Connect watchdog failed"
                X.CFK.A0A(r2, r0, r1)
            Laf:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            Lb2:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C133121.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133121) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {2578}, m = "startIdleClip", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$1, reason: invalid class name and case insensitive filesystem */
    public final class C133131 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C133131(HtJ<? super C133131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.startIdleClip(null, null, null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startPreConnectCaptionLocked$1", f = "SessionController.kt", l = {1882}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startPreConnectCaptionLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C133141 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PreConnectLiveCaption $caption;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133141(PreConnectLiveCaption preConnectLiveCaption, HtJ<? super C133141> htJ) {
            super(2, htJ);
            this.$caption = preConnectLiveCaption;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133141(this.$caption, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    PreConnectLiveCaption preConnectLiveCaption = this.$caption;
                    this.label = 1;
                    if (preConnectLiveCaption.run(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(SessionControllerKt.TAG, "Pre-connect live caption failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C133141(this.$caption, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController", f = "SessionController.kt", l = {3296, 3319, 3376, 3463, 3464, 3643}, m = "startRpSession", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startRpSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C133151 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
        public Object L$2;
        public Object L$20;
        public Object L$21;
        public Object L$22;
        public Object L$23;
        public Object L$24;
        public Object L$25;
        public Object L$26;
        public Object L$27;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C133151(HtJ<? super C133151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionController.this.startRpSession(null, 0, false, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$2, reason: invalid class name and case insensitive filesystem */
    public final class C133162 extends AbstractC07127nr implements G2l<VoiceEmbodimentPlacement, Boolean, Boolean, Boolean, Boolean, HtJ<? super EmbodimentSurfaceInputs>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public /* synthetic */ boolean Z$2;
        public /* synthetic */ boolean Z$3;
        public int label;

        public C133162(HtJ<? super C133162> htJ) {
            super(6, htJ);
        }

        public final Object invoke(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3, boolean z4, HtJ<? super EmbodimentSurfaceInputs> htJ) {
            C133162 c133162 = new C133162(htJ);
            c133162.L$0 = voiceEmbodimentPlacement;
            c133162.Z$0 = z;
            c133162.Z$1 = z2;
            c133162.Z$2 = z3;
            c133162.Z$3 = z4;
            return c133162.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = r6.L$0
                com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement r5 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement) r5
                boolean r4 = r6.Z$0
                boolean r3 = r6.Z$1
                boolean r1 = r6.Z$2
                boolean r2 = r6.Z$3
                int r0 = r6.label
                if (r0 != 0) goto L1f
                X.Hwg.A00(r7)
                if (r1 == 0) goto L18
                r1 = 1
                if (r2 != 0) goto L19
            L18:
                r1 = 0
            L19:
                com.facebook.aura.partners.voice.session.impl.EmbodimentSurfaceInputs r0 = new com.facebook.aura.partners.voice.session.impl.EmbodimentSurfaceInputs
                r0.<init>(r5, r4, r3, r1)
                return r0
            L1f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.C133162.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G2l
        public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentPlacement voiceEmbodimentPlacement, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HtJ<? super EmbodimentSurfaceInputs> htJ) {
            return invoke(voiceEmbodimentPlacement, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), AnonymousClass001.A1X(bool4), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$3, reason: invalid class name and case insensitive filesystem */
    public final class C133173 extends AbstractC07127nr implements G2j<VoiceEmbodimentPaintedMedia, Boolean, VoiceEmbodimentPaintedMedia, HtJ<? super VoiceEmbodimentPaintedMedia>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ boolean Z$0;
        public int label;

        public C133173(HtJ<? super C133173> htJ) {
            super(4, htJ);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, Boolean bool, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia2, HtJ<? super VoiceEmbodimentPaintedMedia> htJ) {
            return invoke(voiceEmbodimentPaintedMedia, AnonymousClass001.A1X(bool), voiceEmbodimentPaintedMedia2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            boolean z = this.Z$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return z ? obj2 : obj3;
        }

        public final Object invoke(VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, boolean z, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia2, HtJ<? super VoiceEmbodimentPaintedMedia> htJ) {
            if (htJ != null) {
                htJ.getContext();
            }
            Hwg.A00(Unit.INSTANCE);
            if (z) {
                return voiceEmbodimentPaintedMedia;
            }
            return voiceEmbodimentPaintedMedia2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$4", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$trackEmbodimentVisibility$4, reason: invalid class name and case insensitive filesystem */
    public final class C133184 extends AbstractC07127nr implements G2l<EmbodimentSurfaceInputs, Boolean, HatchSystemPipPresentationState, Boolean, VoiceEmbodimentPaintedMedia, HtJ<? super VoiceEmbodimentInputs>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public C133184(HtJ<? super C133184> htJ) {
            super(6, htJ);
        }

        @Override // X.G2l
        public /* bridge */ /* synthetic */ Object invoke(EmbodimentSurfaceInputs embodimentSurfaceInputs, Boolean bool, HatchSystemPipPresentationState hatchSystemPipPresentationState, Boolean bool2, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, HtJ<? super VoiceEmbodimentInputs> htJ) {
            return invoke(embodimentSurfaceInputs, AnonymousClass001.A1X(bool), hatchSystemPipPresentationState, AnonymousClass001.A1X(bool2), voiceEmbodimentPaintedMedia, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EmbodimentSurfaceInputs embodimentSurfaceInputs = (EmbodimentSurfaceInputs) this.L$0;
            boolean z = this.Z$0;
            Object obj2 = this.L$1;
            boolean z2 = this.Z$1;
            VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia = (VoiceEmbodimentPaintedMedia) this.L$2;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            VoiceEmbodimentPlacement voiceEmbodimentPlacement = embodimentSurfaceInputs.inAppPlacement;
            boolean z3 = embodimentSurfaceInputs.displayEnabled;
            boolean z4 = embodimentSurfaceInputs.liveAvatarEnabled;
            boolean z5 = embodimentSurfaceInputs.embodimentAvailable;
            boolean zA1Z = AnonymousClass002.A1Z(obj2, HatchSystemPipPresentationState.ACTIVE);
            if (z2) {
                voiceEmbodimentPaintedMedia = VoiceEmbodimentPaintedMedia.NONE;
            }
            return new VoiceEmbodimentInputs(voiceEmbodimentPlacement, z3, z4, z5, z, zA1Z, z2, voiceEmbodimentPaintedMedia);
        }

        public final Object invoke(EmbodimentSurfaceInputs embodimentSurfaceInputs, boolean z, HatchSystemPipPresentationState hatchSystemPipPresentationState, boolean z2, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, HtJ<? super VoiceEmbodimentInputs> htJ) {
            C133184 c133184 = new C133184(htJ);
            c133184.L$0 = embodimentSurfaceInputs;
            c133184.Z$0 = z;
            c133184.L$1 = hatchSystemPipPresentationState;
            c133184.Z$1 = z2;
            c133184.L$2 = voiceEmbodimentPaintedMedia;
            return c133184.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$trackReconnectConnectivity$2, reason: invalid class name and case insensitive filesystem */
    public final class C133202 extends AbstractC7559F3s implements G0U<AuraNetworkState, Long> {
        public static final C133202 INSTANCE = new C133202();

        public C133202() {
            super(1);
        }

        @Override // X.G0U
        public final Long invoke(AuraNetworkState auraNetworkState) {
            C7384Etj.A0Y(auraNetworkState, 0);
            return Long.valueOf(auraNetworkState instanceof AuraNetworkState.Offline ? 1500L : 0L);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$trackReconnectConnectivity$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$trackReconnectConnectivity$3, reason: invalid class name and case insensitive filesystem */
    public final class C133213 extends AbstractC07127nr implements G0W<HatchGatewayConnectionState, AuraNetworkState, HtJ<? super HxE<? extends Boolean, ? extends AuraNetworkState>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C133213(HtJ<? super C133213> htJ) {
            super(3, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchGatewayConnectionState hatchGatewayConnectionState, AuraNetworkState auraNetworkState, HtJ<? super HxE<Boolean, ? extends AuraNetworkState>> htJ) {
            C133213 c133213 = new C133213(htJ);
            c133213.L$0 = hatchGatewayConnectionState;
            c133213.L$1 = auraNetworkState;
            return c133213.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0r(C3cG.A0P(obj2 instanceof HatchGatewayConnectionState.Connected), obj3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, AuraNetworkState auraNetworkState, HtJ<? super HxE<? extends Boolean, ? extends AuraNetworkState>> htJ) {
            return invoke2(hatchGatewayConnectionState, auraNetworkState, (HtJ<? super HxE<Boolean, ? extends AuraNetworkState>>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$updateRecordedSharedCallId$1, reason: invalid class name and case insensitive filesystem */
    public final class C133231 extends AbstractC7559F3s implements G0U<VoiceBugReportInfo, VoiceBugReportInfo> {
        public final /* synthetic */ String $sharedCallId;

        @Override // X.G0U
        public final VoiceBugReportInfo invoke(VoiceBugReportInfo voiceBugReportInfo) {
            Long l;
            return (voiceBugReportInfo == null || (l = voiceBugReportInfo.endedAtMillis) != null) ? voiceBugReportInfo : voiceBugReportInfo.copy(this.$sharedCallId, voiceBugReportInfo.startedAtMillis, voiceBugReportInfo.connectedAtMillis, l, voiceBugReportInfo.isActive);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133231(String str) {
            super(1);
            this.$sharedCallId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1", f = "SessionController.kt", l = {2349}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C133241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $pinOwner;
        public final /* synthetic */ C57m $session;
        public int I$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1$1", f = "SessionController.kt", l = {2350}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03221 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ C57m $session;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1$1$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$watchOrphanedSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03231 extends AbstractC07127nr implements G0V<InterfaceC05673vm, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C03231(HtJ<? super C03231> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C03231 c03231 = new C03231(htJ);
                    c03231.L$0 = obj;
                    return c03231;
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
                    C03231 c03231 = new C03231(htJ);
                    c03231.L$0 = interfaceC05673vm;
                    return c03231.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03221(C57m c57m, HtJ<? super C03221> htJ) {
                super(2, htJ);
                this.$session = c57m;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03221(this.$session, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<InterfaceC05673vm> c1bnADx = this.$session.ADx();
                    C03231 c03231 = new C03231(null);
                    this.label = 1;
                    if (AbstractC9777Gfy.A00(this, c03231, c1bnADx) == enumC10460Hji) {
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
                return new C03221(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133241(C57m c57m, String str, HtJ<? super C133241> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$pinOwner = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SessionController.this.new C133241(this.$session, this.$pinOwner, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C03221 c03221 = new C03221(this.$session, null);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = GAX.A01(this, c03221, 60000L);
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
                    CFK.A06(SessionControllerKt.TAG, FGI.A0M("Orphaned voice session timed out; releasing owner=", this.$pinOwner));
                }
                return Unit.INSTANCE;
            } finally {
                SessionController.this.onOrphanedSessionEnded$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(this.$session);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133241) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.aura.partners.voice.session.impl.SessionController$voiceControlHandler$1] */
    public SessionController(Context context, C3UX c3ux, Hr6 hr6, HatchIdentityProvider hatchIdentityProvider, AbstractC3358CGz abstractC3358CGz, String str, String str2, HatchCallJoinContext hatchCallJoinContext, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(c3ux, hr6, hatchIdentityProvider, 1);
        AnonymousClass005.A13(abstractC3358CGz, hatchCallJoinContext, function0, 4);
        C7384Etj.A0Y(g0u, 9);
        this.context = context;
        this.coroutineScope = c3ux;
        this.rtSessionController = hr6;
        this.identityProvider = hatchIdentityProvider;
        this.userSession = abstractC3358CGz;
        this.gatewayWsUrl = str;
        this.authToken = str2;
        this.joinContext = hatchCallJoinContext;
        this.onClose = function0;
        this.onJoinRequestsVideoMedia = g0u;
        this.voiceCallRepository = new VoiceCallActivityRepository(abstractC3358CGz);
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gateway = companion;
        this.voiceBugReportRepository = VoiceBugReportRepository.Companion.getInstance(abstractC3358CGz);
        this.videoConfigStore = HatchVoiceVideoConfigStore.Companion.getInstance(abstractC3358CGz);
        this.avatarStore = HatchVoiceAvatarStore.Companion.getInstance(abstractC3358CGz);
        this.avatarReferenceProvider = HatchAvatarReferenceImageProvider.Companion.getInstance(abstractC3358CGz);
        this.pendingPinOwners = new ConcurrentHashMap<>();
        this.sessionPinOwners = new ConcurrentHashMap<>();
        this.retainedStaticAvatarPaths = new ConcurrentHashMap<>();
        HrH hrH = HwN.A01;
        this.portraitMissingCallId = C3cG.A14(hrH);
        this.newAvatarStillCallId = C3cG.A14(hrH);
        this.callPortraitFraming = C3cG.A14(hrH);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        HzC hzCA0x = C3cH.A0x(auraDispatchers.io());
        this.markerScope = hzCA0x;
        this.teardownScope = C3cH.A0x(auraDispatchers.io());
        this.markerMutex = new C9258GBl();
        this.captionMutex = new C9258GBl();
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._accessoryLiveVideo = c9286GCnA14;
        this.accessoryLiveVideo = C3cG.A11(c9286GCnA14);
        long j = 0;
        this.callMarker = C3cG.A14(new CallMarkerState(null, null, null, null, 0, 0L, 0L, 0L, false, null, null, null));
        Integer num = C79.A00;
        this.micStatusReports = AbstractC10623Hzj.A00(num, -1);
        this.playbackStatusReports = AbstractC10623Hzj.A00(num, -1);
        C9286GCn c9286GCnA142 = C3cG.A14(new VoiceCallUiState(null, j, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, false, null == true ? 1 : 0, null == true ? 1 : 0, VoicePrefs.INSTANCE.getCaptionsEnabled(abstractC3358CGz), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, j, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 130559, null == true ? 1 : 0));
        this._callState = c9286GCnA142;
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new SessionController$callState$1(null), c9286GCnA142, hatchIdentityProvider.aiIdentityName, hatchIdentityProvider.cachedAvatarUri);
        C3Ej c3Ej = C3Ek.A00;
        String value = hatchIdentityProvider.aiIdentityName.getValue();
        VoiceCallPhase voiceCallPhase = VoiceCallPhase.ENDED;
        AHI ahi = AHI.A01;
        this.callState = AnonymousClass441.A00(new VoiceCallUiState(voiceCallPhase, 0L, null, null, value, null, false, false, true, false, ahi, ahi, null, 0L, 0, false, VoiceCallActivity.IDLE), c3ux, anonymousClass603A00, c3Ej);
        C9286GCn c9286GCnA143 = C3cG.A14(AnonymousClass005.A0a());
        this._userSpeechLevel = c9286GCnA143;
        this.userSpeechLevel = C3cG.A11(c9286GCnA143);
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._callEnded = c9290GCrA12;
        this.callEnded = C3pd.A00(c9290GCrA12);
        this.turnLatencyTracker = new VoiceTurnLatencyTracker();
        this.connectionTracker = new VoiceCallConnectionTracker();
        this.threadCaptionLock = C3cG.A0T();
        this.threadCaptionBus = ThreadVoiceCaptionBus.Companion.getInstance(abstractC3358CGz);
        this.lock = new ReentrantLock();
        this.callLifecycleLock = new ReentrantLock();
        this.voiceControlMutex = new C9258GBl();
        this.controllerClosed = new AtomicBoolean(false);
        this.connectAttempt = new AtomicInteger(0);
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        this.voiceCallStateHolder = voiceCallStateHolderA0K;
        this.voiceControlHandler = new VoiceControlHandler() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController$voiceControlHandler$1
            @Override // com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler
            public Object applyCallAvatarUpdate(CallAvatarUpdate callAvatarUpdate, HtJ<? super VoiceControlHandler.Result> htJ) {
                SessionController sessionController = this.this$0;
                return sessionController.performVoiceControl(new SessionController$voiceControlHandler$1$applyCallAvatarUpdate$2(sessionController, callAvatarUpdate), htJ);
            }

            @Override // com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler
            public Object endCall(EndVoiceCallRequest endVoiceCallRequest, HtJ<? super VoiceControlHandler.Result> htJ) {
                SessionController sessionController = this.this$0;
                return sessionController.performVoiceControl(new SessionController$voiceControlHandler$1$endCall$2(sessionController, endVoiceCallRequest), htJ);
            }

            @Override // com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler
            public Object mute(HtJ<? super VoiceControlHandler.Result> htJ) {
                SessionController sessionController = this.this$0;
                return sessionController.performVoiceControl(new SessionController$voiceControlHandler$1$mute$2(sessionController), htJ);
            }

            @Override // com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler
            public Object reconnectCall(ReconnectVoiceCallRequest reconnectVoiceCallRequest, HtJ<? super VoiceControlHandler.Result> htJ) {
                SessionController sessionController = this.this$0;
                return sessionController.performVoiceControl(new SessionController$voiceControlHandler$1$reconnectCall$2(sessionController, reconnectVoiceCallRequest), htJ);
            }

            @Override // com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler
            public Object setLiveAvatar(boolean z, HtJ<? super VoiceControlHandler.Result> htJ) {
                SessionController sessionController = this.this$0;
                return sessionController.performVoiceControl(new SessionController$voiceControlHandler$1$setLiveAvatar$2(sessionController, z), htJ);
            }
        };
        this.agentStatusUpdateMutex = new C9258GBl();
        AgentStatusPayload agentStatusPayload = (AgentStatusPayload) AbstractC0878AGe.A0I(companion.getAgentStatusEvents().getReplayCache());
        this.agentStatusAdmissionFloor = agentStatusPayload != null ? agentStatusPayload.sequence : 0L;
        this.callAvatarWithoutImageCallId = C3cG.A14(hrH);
        voiceCallStateHolderA0K.attachCallState(getCallState());
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, anonymousClass3, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass4(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass5(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass6(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass7(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass8(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass9(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass10(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass11(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass12(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass13(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass14(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass15(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass16(null), c3ux);
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass17(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass18(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass19(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass20(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass21(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass22(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass23(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass24(null), c3ux);
        this.embodimentRenderers = new EmbodimentRendererRegistry();
        this.embodimentBindMutex = new C9258GBl();
        C9286GCn c9286GCnA144 = C3cG.A14(false);
        this._embodimentReady = c9286GCnA144;
        this.embodimentReady = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA145 = C3cG.A14(hrH);
        this._embodimentReadyGeneration = c9286GCnA145;
        this.embodimentReadyGeneration = C3cG.A11(c9286GCnA145);
        this.callAvatarHistory = new ConcurrentHashMap<>();
        this.audioLevelGeneration = new AtomicInteger(0);
        this.lastBotText = "";
        this.lastUserText = "";
        this.serverConnectedMarked = new AtomicBoolean(false);
        this.connectOutcomeSettled = new AtomicBoolean(false);
        this.callConnectedRecorded = new AtomicBoolean(false);
        this.asrLocalAudioObserved = new AtomicBoolean(false);
        this.asrVoiceStateObserved = new AtomicBoolean(false);
        this.asrUserCaptionObserved = new AtomicBoolean(false);
        this.asrVoiceStateUpdateCount = new AtomicInteger(0);
        this.userSpeechSignaled = new AtomicBoolean(false);
        this.weakNetworkNotices = new WeakNetworkNotices(null, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyCallAvatarUpdateLocked(java.lang.String r14, com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate r15) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.applyCallAvatarUpdateLocked(java.lang.String, com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate):void");
    }

    private final void applyPortraitAdmission(String str, long j, int i, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, boolean z, boolean z2) {
        AnonymousClass001.A1J(new C132471(str, j, i, avatarImageKey, z2, z, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPortraitCropLocked(String str, HatchVideoCrop hatchVideoCrop, HatchAiIdentityHandler.AvatarImageKey avatarImageKey) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        AvatarCallIdleVideo avatarCallIdleVideo;
        String strPrefKey;
        String str2 = null;
        if (avatarImageKey != null && avatarImageKey.equals(this.gateway.getCommittedAvatarImageKey()) && (strPrefKey = SessionControllerKt.prefKey(avatarImageKey)) != null) {
            VoicePrefs.INSTANCE.setCallPortraitCrop(this.userSession, strPrefKey, hatchVideoCrop.top, hatchVideoCrop.bottom);
        }
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming = SessionControllerKt.toReferenceFraming(hatchVideoCrop);
        AnonymousClass001.A1E(this.callPortraitFraming, null, new CallPortraitFraming(str, referenceFraming));
        Object objA0R = C3cI.A0R(this);
        if (!(objA0R instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) objA0R) == null) {
            return;
        }
        VoiceCallStateHolder voiceCallStateHolder = this.voiceCallStateHolder;
        VoiceEmbodimentMedia.LiveRtc liveRtcCopy = liveRtc.copy(liveRtc.idleVideoUri, liveRtc.referenceAssetId, liveRtc.fallbackAvatar, liveRtc.previewFraming, referenceFraming);
        HatchReadyCallIdle value = this.avatarReferenceProvider.readyCallIdle.getValue();
        if (value != null && (avatarCallIdleVideo = value.video) != null) {
            str2 = avatarCallIdleVideo.url;
        }
        voiceCallStateHolder.compareAndSetEmbodimentMedia(liveRtc, SessionControllerKt.withWwwIdlePortraitFraming(liveRtcCopy, referenceFraming, str2, this.avatarReferenceProvider.idlePosters.posters.getValue()));
    }

    private final void beginCallAvatarHistory(String str, VoiceEmbodimentMedia voiceEmbodimentMedia, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str2) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        String str3 = str2;
        endCallAvatarHistoryLocked();
        clearCallStartAvatar();
        if ((voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) && (liveRtc = (VoiceEmbodimentMedia.LiveRtc) voiceEmbodimentMedia) != null && VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled()) {
            if (str2 == null || !this.avatarStore.retainCachedAvatarFile(str3)) {
                str3 = null;
            }
            this.callStartAvatar = new CallStartAvatar(str, snapshot != null ? snapshot.avatarStem : null, liveRtc, snapshot, avatarImageKey, str3);
            ConcurrentHashMap<String, HatchVoiceVideoConfigStore.Snapshot> concurrentHashMap = new ConcurrentHashMap<>();
            this.callAvatarHistory = concurrentHashMap;
            this.callAvatarHistoryJob = AnonymousClass001.A11(new C132501(str, concurrentHashMap, null), this.coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc A[PHI: r4
  0x00bc: PHI (r4v1 com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout) = 
  (r4v0 com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout)
  (r4v5 com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout)
  (r4v5 com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout)
 binds: [B:55:0x00b8, B:13:0x001e, B:15:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beginCallAvatarLocked(java.lang.String r13, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.CallAdmission r14, boolean r15, int r16) {
        /*
            r12 = this;
            r9 = r12
            X.HxE<java.lang.String, ? extends com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate$FailureReason> r1 = r12.liveAvatarFailedCall
            r12 = 0
            r10 = r13
            if (r1 == 0) goto Lc0
            boolean r0 = X.C3cG.A1O(r13, r1)
            if (r0 == 0) goto Lc0
            B r6 = r1.second
            com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate$FailureReason r6 = (com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate.FailureReason) r6
        L11:
            r2 = 1
            if (r14 == 0) goto Lb6
            boolean r0 = r14.avatarUpdating
            if (r0 != r2) goto Lb6
            com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r4 = r9.callStartAvatarLayout(r14, r15)
        L1c:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingStart r8 = r14.avatarUpdatingStart
            if (r8 == 0) goto Lbc
            com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r0 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.LIVE
            if (r4 == r0) goto Lbc
            java.lang.String r0 = r9.liveAvatarCompletedCallId
            boolean r0 = X.C7384Etj.areEqual(r0, r13)
            if (r0 != 0) goto Lbd
            X.HxE r0 = X.C3cG.A0r(r13, r8)
        L30:
            r9.avatarUpdatingStart = r0
            com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r0 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.LIVE
            java.lang.String r5 = "avatar_updating_at_start"
            r3 = r16
            if (r4 != r0) goto L50
            if (r6 == 0) goto L3f
            r9.logPreConnectFailure(r13, r6)
        L3f:
            if (r14 == 0) goto L4f
            boolean r0 = r14.avatarUpdating
            if (r0 != r2) goto L4f
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r9.connectionTracker
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.annotate(r5, r1, r0)
        L4f:
            return
        L50:
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r1 = r9.connectionTracker
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.annotate(r5, r2, r0)
            java.lang.String r0 = r9.liveAvatarCompletedCallId
            boolean r0 = X.C7384Etj.areEqual(r0, r13)
            java.lang.String r1 = "none"
            java.lang.String r2 = "completed"
            if (r0 == 0) goto Laf
            r0 = r2
        L66:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Laa
            boolean r1 = r9.beginLiveAvatarUpdateLocked(r13, r4, r3)
            if (r1 != 0) goto Laa
            java.lang.String r5 = "live why=no_still"
        L74:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L92
            com.facebook.aura.partners.voice.session.impl.SessionController$Companion r7 = com.facebook.aura.partners.voice.session.impl.SessionController.Companion
            com.facebook.aura.partners.voice.session.impl.CallStartAvatar r4 = r9.callStartAvatar
            X.HxE<java.lang.String, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingStart> r3 = r9.avatarUpdatingStart
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot> r2 = r9.callAvatarHistory
            com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarLocked$4 r1 = new com.facebook.aura.partners.voice.session.impl.SessionController$beginCallAvatarLocked$4
            r1.<init>(r2)
            com.facebook.aura.partners.voice.session.impl.LiftedCallAvatar r11 = r7.previousLiveCallStart$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(r13, r4, r3, r1)
            if (r11 == 0) goto L92
            r13 = 4
            r14 = r12
            showLiftedCallAvatarLocked$default(r9, r10, r11, r12, r13, r14)
        L92:
            if (r8 == 0) goto La7
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingPresentation r1 = r8.presentation
            if (r1 == 0) goto La7
            java.lang.String r3 = "server"
        L9a:
            java.lang.String r2 = "VoiceSessionController"
            java.lang.String r1 = "live_avatar.call_start avatar_updating=true layout=%s outcome=%s presentation=%s"
            X.CFK.A01(r5, r0, r3, r2, r1)
            if (r6 == 0) goto L4f
            r9.logPreConnectFailure(r10, r6)
            return
        La7:
            java.lang.String r3 = "local"
            goto L9a
        Laa:
            java.lang.String r5 = X.AnonymousClass006.A0x(r4)
            goto L74
        Laf:
            if (r6 == 0) goto Lb4
            java.lang.String r0 = "failed"
            goto L66
        Lb4:
            r0 = r1
            goto L66
        Lb6:
            com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r4 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.LIVE
            if (r14 == 0) goto Lbc
            goto L1c
        Lbc:
            r8 = r12
        Lbd:
            r0 = r12
            goto L30
        Lc0:
            r6 = r12
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.beginCallAvatarLocked(java.lang.String, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean beginLiveAvatarUpdateLocked(java.lang.String r11, com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r7 = r11
            X.HxE r0 = X.C3cG.A0r(r11, r0)
            r6 = r10
            r10.callVideoAvatarKey = r0
            java.lang.Long r0 = X.C3cI.A0O()
            X.HxE r0 = X.C3cG.A0r(r11, r0)
            r10.liveAvatarUpdatingSince = r0
            java.lang.String r11 = r10.awaitedAvatarStem(r11, r12)
            com.facebook.aura.partners.voice.session.impl.CallStartWait r0 = new com.facebook.aura.partners.voice.session.impl.CallStartWait
            r0.<init>(r7, r11)
            r10.callStartWait = r0
            com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout r5 = com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout.NEW_AVATAR_STILL
            if (r12 != r5) goto L29
            boolean r0 = r10.showNewAvatarStillLocked(r7)
            r4 = 1
            if (r0 != 0) goto L2a
        L29:
            r4 = 0
        L2a:
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r1 = r10.connectionTracker
            java.lang.String r0 = "avatar_updating_video_hidden"
            r10 = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r1.annotate(r0, r4, r3)
            if (r4 == 0) goto L41
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r6.connectionTracker
            java.lang.String r1 = "avatar_updating"
            java.lang.String r0 = "video_off_reason"
            r2.annotate(r0, r1, r3)
        L41:
            if (r12 != r5) goto L46
            r2 = 0
            if (r4 == 0) goto L47
        L46:
            r2 = 1
        L47:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r6.voiceCallStateHolder
            long r8 = r0.callStartElapsedRealtimeMs
            r0 = 150000(0x249f0, double:7.411E-319)
            long r8 = r8 + r0
            r6.showLiveAvatarUpdateStatusLocked(r7, r8, r10, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.beginLiveAvatarUpdateLocked(java.lang.String, com.facebook.aura.partners.voice.session.impl.CallStartAvatarLayout, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceControlHandler.Result beginRtcRejoin(ReconnectVoiceCallRequest reconnectVoiceCallRequest) {
        VoiceControlHandler.Result result;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            String strA0X = C3cI.A0X(this);
            if (this.controllerClosed.get()) {
                result = VoiceControlHandler.Result.NO_ACTIVE_CALL;
            } else if (strA0X == null || C3cI.A0I(this) == VoiceCallPhase.ENDED || !strA0X.equalsIgnoreCase(reconnectVoiceCallRequest.targetCallId)) {
                result = VoiceControlHandler.Result.STALE_CALL;
            } else {
                if (!this.voiceRestartInProgress) {
                    this.voiceRestartInProgress = true;
                    VoiceRestartState voiceRestartStateCaptureRestartStateLocked = captureRestartStateLocked();
                    reentrantLockA0p.unlock();
                    String str = reconnectVoiceCallRequest.reason;
                    if (str == null) {
                        str = "<absent>";
                    }
                    CFK.A02(strA0X, str, SessionControllerKt.TAG, "RTC rejoin requested callId=%s reason=%s");
                    AnonymousClass001.A1I(AnonymousClass001.A0y(), new C132522(strA0X, reconnectVoiceCallRequest, voiceRestartStateCaptureRestartStateLocked, null), this.coroutineScope);
                    return VoiceControlHandler.Result.PERFORMED;
                }
                result = VoiceControlHandler.Result.CALL_TRANSITIONING;
            }
            return result;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectAudioLevels(X.C57m r15, final int r16, final long r17, X.HtJ<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.collectAudioLevels(X.57m, int, long, X.HtJ):java.lang.Object");
    }

    private final void endCallIfStillConnecting(String str, long j, int i, int i2) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C132741(str, j, i, i2, null), this.coroutineScope);
    }

    private final void endCallOnCosmosJoinFailure(String str, long j, int i, int i2) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C132761(str, j, i, i2, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endSessionAndReleasePin(C57m c57m, String str, String str2, boolean z) {
        AnonymousClass001.A1J(new C132791(c57m, this, str, str2, z, null), this.teardownScope);
    }

    private final CallEndOwnership forceEndCurrentCallInternal(String str, String str2, Function0<Unit> function0, boolean z, boolean z2, Long l, boolean z3) {
        return endCallInternal(null, str, function0, true, z, z2, l, z3, str2);
    }

    private final void forceTeardown() {
        CallEndOwnership callEndOwnershipForceEndCurrentCallInternal = forceEndCurrentCallInternal(VoiceCallConnectionTracker.END_REASON_TEARDOWN, null, new SessionController$forceTeardown$ownership$1(this, this.currentMarkerKey), false, false, null, false);
        if (callEndOwnershipForceEndCurrentCallInternal != null && callEndOwnershipForceEndCurrentCallInternal.wasActive && isStillCurrentGeneration(callEndOwnershipForceEndCurrentCallInternal.generation)) {
            recordCallEnded();
        }
    }

    private final void handOffPreConnectCaption() {
        String str;
        long j = C3cG.A0L(this).callAttemptGeneration;
        synchronized (this.threadCaptionLock) {
            str = this.preConnectTurnId;
            this.handedOffTurnId = str;
            this.handedOffText = this.preConnectText;
        }
        stopPreConnectCaption(false, false);
        if (str != null) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C132821(str, j, null), this.coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean liftNewAvatarStillLocked(String str) {
        if (!this.newAvatarStillCallId.A6e(str, null)) {
            return false;
        }
        showLiftedCallAvatarLocked$default(this, str, Companion.liftedCallAvatar$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str, this.callStartAvatar, this.avatarUpdatingStart, new C132861(this.callAvatarHistory)), null, 4, null);
        return true;
    }

    private final VoiceControlHandler.Result logCallAvatarUpdateReceived(String str, CallAvatarUpdate callAvatarUpdate, boolean z, VoiceControlHandler.Result result) {
        String wireValue;
        String str2;
        String str3;
        String str4 = str;
        String wireValue2 = callAvatarUpdate.status.getWireValue();
        CallAvatarUpdate.FailureReason failureReason = callAvatarUpdate.failureReason;
        if (failureReason == null || (wireValue = failureReason.getWireValue()) == null) {
            wireValue = "none";
        }
        String str5 = callAvatarUpdate.avatarStem;
        if (str5 == null) {
            str5 = "none";
        }
        AiIdentity aiIdentityA0R = C3cH.A0R(this.gateway);
        if (aiIdentityA0R == null || (str2 = aiIdentityA0R.avatarStem) == null) {
            str2 = "none";
        }
        HxE<String, String> hxE = this.callShownAvatarStem;
        if (hxE == null || !C3cG.A1O(str, hxE) || (str3 = hxE.second) == null) {
            str3 = "none";
        }
        if (str == null) {
            str4 = "none";
        }
        CFK.A0G(SessionControllerKt.TAG, "live_avatar.received status=%s reason=%s avatar_stem=%s identity_stem=%s shown_stem=%s call_id=%s target_call_id=%s started_on_previous=%b result=%s", wireValue2, wireValue, str5, str2, str3, str4, callAvatarUpdate.targetCallId, Boolean.valueOf(callAvatarUpdate.startedOnPrevious), AnonymousClass006.A0x(result));
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[PHI: r9
  0x0069: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String) binds: [B:20:0x0033, B:22:0x0051, B:24:0x0055, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logCompletedDecision(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            r7 = r14
            X.HxE<java.lang.String, com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate$DisplayCrop> r1 = r10.completedCropLog
            r4 = 0
            if (r1 == 0) goto L10
            boolean r0 = X.C3cG.A1O(r11, r1)
            if (r0 == 0) goto L10
            B r4 = r1.second
            com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate$DisplayCrop r4 = (com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate.DisplayCrop) r4
        L10:
            java.lang.String r0 = "swapped"
            r5 = r12
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L6c
            java.lang.String r0 = " trigger="
            java.lang.String r6 = X.FGI.A0M(r0, r13)
        L1f:
            java.lang.String r9 = "none"
            if (r14 != 0) goto L24
            r7 = r9
        L24:
            X.HxE<java.lang.String, java.lang.String> r1 = r10.callShownAvatarStem
            if (r1 == 0) goto L32
            boolean r0 = X.C3cG.A1O(r11, r1)
            if (r0 == 0) goto L32
            B r8 = r1.second
            if (r8 != 0) goto L33
        L32:
            r8 = r9
        L33:
            if (r4 == 0) goto L69
            java.lang.Float r0 = r4.x
            java.lang.Float r3 = r4.y
            java.lang.Float r2 = r4.size
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r3)
            java.lang.String r9 = X.AnonymousClass006.A0y(r2, r0, r1)
            java.lang.Float r0 = r4.x
            if (r0 == 0) goto L69
            java.lang.Float r0 = r4.y
            if (r0 == 0) goto L69
            java.lang.Float r0 = r4.size
            if (r0 == 0) goto L69
            java.lang.String r10 = "server"
        L5d:
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            java.lang.String r1 = "VoiceSessionController"
            java.lang.String r0 = "live_avatar.completed decision=%s%s avatar_stem=%s shown_stem=%s crop=%s framing=%s"
            X.CFK.A0G(r1, r0, r2)
            return
        L69:
            java.lang.String r10 = "default"
            goto L5d
        L6c:
            java.lang.String r6 = ""
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.logCompletedDecision(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private final void logPreConnectFailure(String str, CallAvatarUpdate.FailureReason failureReason) {
        this.pendingPreConnectFailure = null;
        CFK.A01(failureReason.getWireValue(), (!admittedForVideo() || (C7384Etj.areEqual(this.liveAvatarCompletedCallId, str) && failureReason != CallAvatarUpdate.FailureReason.NOT_ANIMATABLE)) ? "silent" : "shown", "keep_media", SessionControllerKt.TAG, "live_avatar.failed reason=%s display=%s why=before_connect action=%s");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float normalizeLevel(int i, float f) {
        float f2 = i / 127.0f;
        float f3 = f - 0.7f;
        if (f3 < 1.0E-6f) {
            f3 = 1.0E-6f;
        }
        return AnonymousClass003.A00((f2 - 0.7f) / f3);
    }

    private final void noticeServerVideoDisabled(String str, long j, int i) {
        AnonymousClass001.A1J(new C132881(str, j, i, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean notifyCallEnded(String str, boolean z) {
        CallMarkerState value;
        CallMarkerState callMarkerState;
        C3UX c3ux;
        HwK hwK;
        G0V c132902;
        if (str == null) {
            return false;
        }
        BLG<CallMarkerState> blg = this.callMarker;
        do {
            value = blg.getValue();
            callMarkerState = value;
        } while (!blg.A6e(value, str.equals(callMarkerState.callId) ? new CallMarkerState(null, null, null, null, 0, 0L, 0L, 0L, false, null, null, null) : callMarkerState));
        if (!str.equals(callMarkerState.callId)) {
            return false;
        }
        this.voiceCallStateHolder.clearActiveAppAudioCall(str);
        C27k<Boolean> c27kReset = this.joinContext.reset(str);
        long j = callMarkerState.startedAtMillis;
        if (j == 0) {
            if (c27kReset != null && !z) {
                c3ux = this.markerScope;
                hwK = HwK.A00;
                c132902 = new C132902(str, callMarkerState, c27kReset, null);
            }
            return true;
        }
        c3ux = this.markerScope;
        hwK = HwK.A00;
        c132902 = new C132891(str, j, callMarkerState, null);
        AnonymousClass001.A1I(hwK, c132902, c3ux);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeEmbodimentVideoPolicy(final C57m c57m, final int i, final String str, final long j, final boolean z, boolean z2, HtJ<? super Unit> htJ) {
        C20Q c05663ul = z2 ? new C05663ul(new SessionController$observeEmbodimentVideoPolicy$poorLink$1(c57m, new EmbodimentLinkQualityGate(2), null)) : new C20Y(AnonymousClass001.A0h());
        final F1F f1f = new F1F();
        final F1F f1f2 = new F1F();
        final F1E f1e = new F1E();
        final F1F f1f3 = new F1F();
        return C3cG.A0U(new C10650I0u(new C132933(c57m, null), GDB.A01(new AnonymousClass603(3, new C132922(str, null), new C20Q[]{c05663ul, new C05663ul(new SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1(this, null)), this.portraitMissingCallId, this.newAvatarStillCallId, this.accessory != null ? new C20Y(AnonymousClass001.A0h()) : new C10650I0u(new SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3(null), C4o7.A00(SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$2.INSTANCE, new SessionController$observeEmbodimentVideoPolicy$$inlined$map$1(this.voiceCallStateHolder.isEmbodimentVisible)), 1)})), 4).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.observeEmbodimentVideoPolicy.4
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((VoiceEmbodimentVideoSuppression) obj, (HtJ<? super Unit>) htJ2);
            }

            public final Object emit(VoiceEmbodimentVideoSuppression voiceEmbodimentVideoSuppression, HtJ<? super Unit> htJ2) {
                String str2;
                String str3;
                SessionController sessionController = SessionController.this;
                ReentrantLock reentrantLock = sessionController.lock;
                C57m c57m2 = c57m;
                reentrantLock.lock();
                try {
                    if (!AnonymousClass006.A1Z(sessionController.currentSession, c57m2) && SessionController.this.voiceCallStateHolder.setEmbodimentVideoSuppressionIfCurrent(j, voiceEmbodimentVideoSuppression)) {
                        boolean z3 = voiceEmbodimentVideoSuppression.poorLink;
                        F1F f1f4 = f1f3;
                        if (z3 != f1f4.element) {
                            f1f4.element = z3;
                            if (SessionController.this.claimWeakNetworkNotice(str, z3, !f1f2.element)) {
                                SessionController.this.voiceCallStateHolder.notifyWeakNetwork();
                            }
                        }
                        if (z) {
                            boolean liveVideoBlocked = voiceEmbodimentVideoSuppression.getLiveVideoBlocked();
                            F1F f1f5 = f1f2;
                            if (liveVideoBlocked != f1f5.element) {
                                f1f5.element = liveVideoBlocked;
                                if (liveVideoBlocked) {
                                    f1e.element++;
                                }
                                VoiceCallConnectionTracker voiceCallConnectionTracker = SessionController.this.connectionTracker;
                                if (liveVideoBlocked) {
                                    str3 = "live_video_suppressed";
                                } else {
                                    str3 = "live_video_resumed";
                                }
                                voiceCallConnectionTracker.point(str3, C3cG.A0R(i), true);
                                SessionController.this.connectionTracker.annotate("live_video_suppressions", f1e.element, C3cG.A0R(i));
                            }
                            boolean liveVideoSuppressed = voiceEmbodimentVideoSuppression.getLiveVideoSuppressed();
                            F1F f1f6 = f1f;
                            if (liveVideoSuppressed != f1f6.element) {
                                f1f6.element = liveVideoSuppressed;
                                if (liveVideoSuppressed) {
                                    str2 = "suppressed";
                                } else {
                                    str2 = "resumed";
                                }
                                CFK.A0G(SessionControllerKt.TAG, "Live avatar video %s: poorLink=%b memoryBlocked=%b portraitMissing=%b avatarUpdating=%b offScreen=%b", str2, Boolean.valueOf(voiceEmbodimentVideoSuppression.poorLink), Boolean.valueOf(voiceEmbodimentVideoSuppression.memoryBlocked), Boolean.valueOf(voiceEmbodimentVideoSuppression.portraitMissing), Boolean.valueOf(voiceEmbodimentVideoSuppression.avatarUpdating), Boolean.valueOf(voiceEmbodimentVideoSuppression.offScreen));
                                C57m c57m3 = c57m;
                                int i2 = 17;
                                if (liveVideoSuppressed) {
                                    i2 = 16;
                                }
                                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) c57m3;
                                AnonymousClass001.A1I(metaAiRsysSdkRealTimeSession.A0W, new MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1(metaAiRsysSdkRealTimeSession, null, i2), metaAiRsysSdkRealTimeSession.A0X);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, htJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeIdleVideoForCall(String str, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchAiIdentityHandler.AvatarImageKey avatarImageKey) {
        AnonymousClass002.A1K(this.idleVideoUpdateJob);
        if (str != null) {
            this.idleVideoUpdateJob = AnonymousClass001.A11(new C132951(str, snapshot, avatarImageKey, null), this.coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumePendingCallAvatarSwapLocked(String str) {
        PendingCallAvatarSwap pendingCallAvatarSwap = this.pendingCallAvatarSwap;
        if (pendingCallAvatarSwap == null || !C7384Etj.areEqual(pendingCallAvatarSwap.callId, C3cI.A0X(this))) {
            return;
        }
        boolean z = pendingCallAvatarSwap.stillShown;
        String str2 = pendingCallAvatarSwap.callId;
        HatchVideoCrop hatchVideoCrop = pendingCallAvatarSwap.portraitCrop;
        if (z) {
            awaitPreparedAvatarLocked(str2, str, hatchVideoCrop, pendingCallAvatarSwap.avatarStem, pendingCallAvatarSwap.avatarImagePath, true, false);
            return;
        }
        if (swapCallAvatarLocked(str2, hatchVideoCrop, pendingCallAvatarSwap.avatarStem, pendingCallAvatarSwap.avatarImagePath, "rejoin")) {
            this.newAvatarStillCallId.A6e(pendingCallAvatarSwap.callId, null);
            endLiveAvatarUpdateTimeoutLocked("completed_after_rejoin");
            if (C3cH.A1R(this.voiceCallStateHolder.isLiveAvatarUpdating)) {
                this.voiceCallStateHolder.hideLiveAvatarUpdateStatus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:12))(0)|7|(1:(1:(5:11|40|13|34|35)(2:16|17))(1:18))(2:19|(1:21))|42|22|(1:24)|25|(1:27)|34|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:13:0x002f, B:31:0x007d, B:33:0x0081, B:36:0x008e), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:13:0x002f, B:31:0x007d, B:33:0x0081, B:36:0x008e), top: B:40:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendEndCall(java.lang.String r10, long r11, com.facebook.aura.partners.voice.session.impl.SessionController.CallMarkerState r13, X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            r9 = this;
            r7 = r11
            r3 = r14
            r6 = r10
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C133071
            if (r0 == 0) goto L29
            r10 = r3
            com.facebook.aura.partners.voice.session.impl.SessionController$sendEndCall$1 r10 = (com.facebook.aura.partners.voice.session.impl.SessionController.C133071) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r10.label = r2
        L15:
            java.lang.Object r5 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r10.label
            r1 = 2
            r0 = 1
            r3 = 0
            if (r2 == 0) goto L4b
            if (r2 == r0) goto L3a
            if (r2 != r1) goto L35
            java.lang.Object r2 = r10.L$2
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            goto L2f
        L29:
            com.facebook.aura.partners.voice.session.impl.SessionController$sendEndCall$1 r10 = new com.facebook.aura.partners.voice.session.impl.SessionController$sendEndCall$1
            r10.<init>(r14)
            goto L15
        L2f:
            X.Hwg.A00(r5)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L8f
            goto L88
        L33:
            r4 = move-exception
            goto L7d
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            long r7 = r10.J$0
            java.lang.Object r2 = r10.L$2
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r13 = r10.L$1
            com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState r13 = (com.facebook.aura.partners.voice.session.impl.SessionController.CallMarkerState) r13
            java.lang.Object r0 = r10.L$0
            java.lang.String r6 = X.C3cG.A0d(r0, r5)
            goto L61
        L4b:
            X.Hwg.A00(r5)
            X.BLa r2 = r9.markerMutex
            r10.L$0 = r6
            r10.L$1 = r13
            r10.L$2 = r2
            r10.J$0 = r11
            r10.label = r0
            java.lang.Object r0 = r2.APs(r3, r10)
            if (r0 != r4) goto L61
            return r4
        L61:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r5 = r9.voiceCallRepository     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            java.lang.String r9 = r13.cosmosThreadId     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            if (r9 != 0) goto L69
            java.lang.String r9 = r13.threadId     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
        L69:
            r10.L$0 = r3     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            r10.L$1 = r3     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            r10.L$2 = r2     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            r10.J$0 = r7     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            r10.label = r1     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            java.lang.Object r0 = r5.endCall(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            if (r0 != r4) goto L88
            return r4
        L7a:
            r0 = move-exception
            goto L90
        L7c:
            r4 = move-exception
        L7d:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L8e
            java.lang.String r1 = "VoiceSessionController"
            java.lang.String r0 = "Failed to notify end-call marker"
            X.CFK.A0A(r1, r0, r4)     // Catch: java.lang.Throwable -> L8f
        L88:
            r2.Ahe(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L8e:
            throw r4     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
        L90:
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.sendEndCall(java.lang.String, long, com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState, X.HtJ):java.lang.Object");
    }

    private final void sendUndeliveredSpeech(CapturedUndeliveredSpeech capturedUndeliveredSpeech, Function0<Unit> function0) {
        if (capturedUndeliveredSpeech == null) {
            function0.invoke();
            return;
        }
        F1F f1f = new F1F();
        AnonymousClass001.A11(new SessionController$sendUndeliveredSpeech$job$1(capturedUndeliveredSpeech, this, f1f, function0, null), this.markerScope).AO5(new C133081(capturedUndeliveredSpeech, f1f));
    }

    private final void showCallAvatarLocked(String str, String str2, VoiceEmbodimentMedia.LiveRtc liveRtc, VoiceEmbodimentMedia.LiveRtc liveRtc2, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str3, HatchVideoCrop hatchVideoCrop) {
        String str4;
        HatchAiIdentityHandler.AvatarImageKey avatarImageKey2;
        HatchAiIdentityHandler.AvatarImageKey avatarImageKey3;
        PreparedHatchAvatar preparedHatchAvatar;
        String str5 = null;
        this.pendingCallAvatarSwap = null;
        HoC hoC = this.callAvatarAwaitJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.callAvatarAwaitJob = null;
        if (snapshot == null || (preparedHatchAvatar = snapshot.avatar) == null || (str4 = preparedHatchAvatar.avatarStillPath) == null || !this.avatarStore.retainCachedAvatarFile(str4)) {
            str4 = null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.retainedStaticAvatarPaths;
        String strPut = str4 != null ? concurrentHashMap.put(str2, str4) : concurrentHashMap.remove(str2);
        if (strPut != null) {
            this.avatarStore.releaseAvatarFile(strPut);
        }
        this.videoConfigStore.releasePin(str2);
        this.voiceCallStateHolder.compareAndSetEmbodimentMedia(liveRtc, liveRtc2);
        this.callVideoAvatarKey = C3cG.A0r(str, snapshot != null ? snapshot.avatarKey : null);
        this.callShownAvatarStem = C3cG.A0r(str, str3);
        String strPrefKey = (snapshot == null || (avatarImageKey3 = snapshot.avatarKey) == null) ? null : SessionControllerKt.prefKey(avatarImageKey3);
        if (hatchVideoCrop != null && strPrefKey != null) {
            VoicePrefs.INSTANCE.setCallPortraitCrop(this.userSession, strPrefKey, hatchVideoCrop.top, hatchVideoCrop.bottom);
        }
        if (snapshot != null && (avatarImageKey2 = snapshot.avatarKey) != null) {
            str5 = avatarImageKey2.path;
        }
        setCallAvatarImagePathLocked(str5);
        observeIdleVideoForCall(str, snapshot, avatarImageKey);
    }

    private final void showPreviousAvatarStillLocked(String str, String str2, VoiceEmbodimentMedia.LiveRtc liveRtc, String str3, String str4) {
        String strAvatarImageUrl = str4 != null ? HatchAiIdentityHandler.Companion.avatarImageUrl(str4, this.userSession) : null;
        showCallAvatarLocked(str, str2, liveRtc, SessionControllerKt.currentAvatarStillMedia(this.avatarReferenceProvider.currentCallEmbodimentDark() ^ true ? strAvatarImageUrl : null, liveRtc.liveFraming), null, null, str3, null);
        if (strAvatarImageUrl != null) {
            setCallAvatarImagePathLocked(str4);
        } else {
            this.callAvatarWithoutImageCallId.Af8(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164 A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:65:0x0160, B:67:0x0164, B:69:0x0168, B:70:0x017c), top: B:79:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #0 {all -> 0x0182, blocks: (B:65:0x0160, B:67:0x0164, B:69:0x0168, B:70:0x017c), top: B:79:0x0160 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startAccessoryIdle(com.facebook.aura.partners.voice.session.impl.SessionController.AccessoryVideo r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.startAccessoryIdle(com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startCallInternal(boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason r60, java.lang.Long r61, com.facebook.aura.partners.voice.session.impl.SessionController.CallMarkerState r62, com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint r63, java.util.Map<java.lang.String, java.lang.String> r64) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.startCallInternal(boolean, boolean, boolean, boolean, boolean, com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason, java.lang.Long, com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState, com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint, java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startIdleClip(com.facebook.aura.partners.voice.session.impl.SessionController.AccessoryVideo r12, com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r13, java.lang.String r14, java.lang.Float r15, boolean r16, X.HtJ<? super java.lang.Boolean> r17) {
        /*
            r11 = this;
            r8 = r13
            r3 = r17
            r10 = r12
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C133131
            r9 = r11
            if (r0 == 0) goto L59
            r5 = r3
            com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$1 r5 = (com.facebook.aura.partners.voice.session.impl.SessionController.C133131) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.label = r2
        L17:
            java.lang.Object r4 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L90
            java.lang.Object r15 = r5.L$3
            java.lang.Float r15 = (java.lang.Float) r15
            java.lang.Object r8 = r5.L$1
            java.lang.Object r10 = r5.L$0
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r10 = (com.facebook.aura.partners.voice.session.impl.SessionController.AccessoryVideo) r10
            X.Hwg.A00(r4)
        L2f:
            com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip r4 = (com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip) r4
            r2 = 0
            if (r4 != 0) goto L5f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        L39:
            X.78T r0 = X.AnonymousClass002.A0s(r4)
            r12 = 0
            com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$clip$1 r6 = new com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$clip$1
            r7 = r14
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.L$0 = r10
            r5.L$1 = r13
            r5.L$2 = r12
            r5.L$3 = r15
            r5.Z$0 = r11
            r5.label = r3
            java.lang.Object r4 = X.GAo.A00(r5, r0, r6)
            if (r4 != r1) goto L2f
            return r1
        L59:
            com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$1 r5 = new com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$1
            r5.<init>(r3)
            goto L17
        L5f:
            java.util.concurrent.locks.ReentrantLock r1 = X.C3cH.A0p(r9)
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r0 = r9.accessoryVideo     // Catch: java.lang.Throwable -> L8b
            if (r0 != r10) goto L78
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r10.renderer     // Catch: java.lang.Throwable -> L8b
            if (r0 != r8) goto L78
            com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip r0 = r10.idle     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L78
            X.BLG<java.lang.Boolean> r0 = r9._accessoryLiveVideo     // Catch: java.lang.Throwable -> L8b
            boolean r0 = X.AnonymousClass003.A1Z(r0)     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L78
            r2 = 1
        L78:
            if (r2 == 0) goto L7e
            r10.idle = r4     // Catch: java.lang.Throwable -> L8b
            r10.idleFocusY = r15     // Catch: java.lang.Throwable -> L8b
        L7e:
            r1.unlock()
            if (r2 != 0) goto L86
            r4.stop()
        L86:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            return r1
        L8b:
            r0 = move-exception
            r1.unlock()
            throw r0
        L90:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.startIdleClip(com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo, com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer, java.lang.String, java.lang.Float, boolean, X.HtJ):java.lang.Object");
    }

    private final void startPreConnectCaptionLocked(String str, long j, int i) {
        HatchRealTimeSessionController hatchSessionController;
        PreConnectSpeechBuffer preConnectSpeechBufferPreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl;
        if (!this.preConnectSpeechEligible || this.serverConnectedMarked.get() || (hatchSessionController = getHatchSessionController()) == null || (preConnectSpeechBufferPreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = hatchSessionController.preConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str)) == null || !VoiceGating.INSTANCE.isStreamingCaptionsToThreadEnabled()) {
            return;
        }
        PreConnectLiveCaption preConnectLiveCaption = new PreConnectLiveCaption(preConnectSpeechBufferPreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, AnonymousClass007.A0a(SessionControllerKt.PRE_CONNECT_DICTATION_SESSION_PREFIX, AbstractC7535F0i.A00()), new SessionController$startPreConnectCaptionLocked$caption$1(this), new SessionController$startPreConnectCaptionLocked$caption$2(this, AbstractC7535F0i.A00().toString().toUpperCase(Locale.ROOT), j, i), new PreConnectSpeechReporter(this.voiceCallRepository, str, C3cG.A0c(this.voiceCallStateHolder), this.markerScope));
        this.preConnectCaption = preConnectLiveCaption;
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C133141(preConnectLiveCaption, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceEmbodimentMedia.LiveRtc wwwIdleUpdate(VoiceEmbodimentMedia.LiveRtc liveRtc, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchVoiceVideoConfigStore.Snapshot snapshot2) {
        if (snapshot2 != null && snapshot != null && snapshot.sameMediaGeneration(snapshot2) && C7384Etj.areEqual(this.videoConfigStore.snapshot(), snapshot)) {
            PreparedHatchAvatar preparedHatchAvatar = snapshot.avatar;
            HatchAvatarReference hatchAvatarReference = preparedHatchAvatar.selection.reference;
            String str = hatchAvatarReference.idleVideoUri;
            if (str == null) {
                str = liveRtc.idleVideoUri;
            }
            String str2 = hatchAvatarReference.assetId;
            VoiceEmbodimentMedia.StaticAvatar staticAvatarEmbodimentFallback = SessionControllerKt.embodimentFallback(preparedHatchAvatar);
            if (staticAvatarEmbodimentFallback == null) {
                staticAvatarEmbodimentFallback = liveRtc.fallbackAvatar;
            }
            VoiceEmbodimentMedia.LiveRtc liveRtcCopy = liveRtc.copy(str, str2, staticAvatarEmbodimentFallback, SessionControllerKt.embodimentPreviewFraming(preparedHatchAvatar), liveRtc.liveFraming);
            if (!C7384Etj.areEqual(liveRtcCopy, liveRtc)) {
                return liveRtcCopy;
            }
        }
        return null;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public boolean attachAccessoryVideoSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            boolean z = false;
            if (this.accessory != null && surface.isValid() && i > 0 && i2 > 0) {
                AccessoryVideo accessoryVideo = this.accessoryVideo;
                if (accessoryVideo != null) {
                    unbindAccessoryVideoLocked(accessoryVideo);
                }
                this.accessoryVideo = new AccessoryVideo(surface, i, i2);
                AnonymousClass004.A1D(false, this._accessoryLiveVideo);
                scheduleAccessoryVideoBind();
                z = true;
            }
            return z;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public Integer attachEmbodimentSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        if (!surface.isValid() || i <= 0 || i2 <= 0) {
            CFK.A0H(SessionControllerKt.TAG, "Ignoring an invalid embodiment surface: %dx%d valid=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(surface.isValid()));
            return null;
        }
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            this.embodimentGeneration++;
            this.pendingEmbodimentSurface = new PendingEmbodimentSurface(surface, i, i2, this.embodimentGeneration);
            C57m c57m = this.currentSession;
            Integer numValueOf = Integer.valueOf(this.embodimentGeneration);
            if (c57m == null) {
                return numValueOf;
            }
            bindEmbodimentSurface(c57m);
            return numValueOf;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void detachEmbodimentSurface(android.view.Surface r9) {
        /*
            r8 = this;
            r5 = 0
            X.C7384Etj.A0Y(r9, r5)
            java.util.concurrent.locks.ReentrantLock r7 = X.C3cH.A0p(r8)
            com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface r0 = r8.pendingEmbodimentSurface     // Catch: java.lang.Throwable -> La4
            r4 = 0
            if (r0 == 0) goto L10
            android.view.Surface r0 = r0.surface     // Catch: java.lang.Throwable -> La4
            goto L11
        L10:
            r0 = r4
        L11:
            boolean r2 = X.AnonymousClass002.A1Z(r0, r9)
            com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r0 = r8.embodimentRenderers     // Catch: java.lang.Throwable -> La4
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r0.activeFor(r9)     // Catch: java.lang.Throwable -> La4
            boolean r1 = X.AnonymousClass002.A1X(r0)
            com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r0 = r8.embodimentRenderers     // Catch: java.lang.Throwable -> La4
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r6 = r0.retiringFor(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "VoiceSessionController"
            if (r6 == 0) goto L35
            if (r2 != 0) goto L3d
            if (r1 != 0) goto L3d
            X.57m r0 = r8.currentSession     // Catch: java.lang.Throwable -> La4
            X.HxE r0 = X.C3cG.A0r(r0, r4)     // Catch: java.lang.Throwable -> La4
            r2 = r4
            goto L6d
        L35:
            if (r2 != 0) goto L3d
            if (r1 != 0) goto L3d
        L39:
            r7.unlock()
        L3c:
            return
        L3d:
            com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r1 = r8.embodimentRenderers     // Catch: java.lang.Throwable -> La4
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r1.active     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L52
            if (r0 == 0) goto L61
            android.view.Surface r0 = r0.boundSurface     // Catch: java.lang.Throwable -> La4
            if (r0 == r9) goto L61
            int r0 = r8.embodimentGeneration     // Catch: java.lang.Throwable -> La4
            int r0 = r0 + 1
            r8.embodimentGeneration = r0     // Catch: java.lang.Throwable -> La4
            r8.pendingEmbodimentSurface = r4     // Catch: java.lang.Throwable -> La4
            goto L39
        L52:
            com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface r0 = r8.pendingEmbodimentSurface     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L61
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r2 = r1.retireActive()     // Catch: java.lang.Throwable -> La4
            X.57m r0 = r8.currentSession     // Catch: java.lang.Throwable -> La4
            X.HxE r0 = X.C3cG.A0r(r0, r4)     // Catch: java.lang.Throwable -> La4
            goto L6c
        L61:
            X.57m r1 = r8.currentSession     // Catch: java.lang.Throwable -> La4
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r8.clearEmbodimentStateLocked()     // Catch: java.lang.Throwable -> La4
            X.HxE r0 = X.C3cG.A0r(r1, r0)     // Catch: java.lang.Throwable -> La4
            r2 = r4
        L6c:
            r6 = r4
        L6d:
            r7.unlock()
            A r1 = r0.first
            X.57m r1 = (X.C57m) r1
            B r0 = r0.second
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = (com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer) r0
            if (r6 == 0) goto L90
            r1 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r6.awaitReleaseCompletion(r1)
            if (r0 != 0) goto L3c
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Timed out after %d ms waiting for a retiring embodiment surface"
            X.CFK.A0H(r3, r0, r1)
            return
        L90:
            if (r2 == 0) goto La0
            X.BLG<java.lang.Boolean> r0 = r8._embodimentReady
            X.AnonymousClass003.A14(r0, r5)
            X.BLG<java.lang.Integer> r0 = r8._embodimentReadyGeneration
            r0.Af8(r4)
            r8.releaseEmbodimentRenderer(r1, r2)
            return
        La0:
            r8.finishEmbodimentTeardown(r1, r0)
            return
        La4:
            r0 = move-exception
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.detachEmbodimentSurface(android.view.Surface):void");
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public PlayoutInjection injectPlayoutPcm48k(long j, short[] sArr) {
        HatchRealTimeSessionController hatchSessionController;
        C7384Etj.A0Y(sArr, 1);
        if (ownsCallGeneration(j) && (hatchSessionController = getHatchSessionController()) != null) {
            AudioFrameData audioFrameData = new AudioFrameData(sArr);
            try {
                G50<AudioFrameMetadata> g50 = AudioFrameMetadata.CONVERTER;
                AudioFrame audioFrameCreateFrame = AudioFrame.CProxy.createFrame(audioFrameData, new AudioFrameMetadata(48000, 1, sArr.length, false, null));
                C7384Etj.A0U(audioFrameCreateFrame);
                int iInjectPlayoutAudio = hatchSessionController.injectPlayoutAudio(audioFrameCreateFrame);
                if (iInjectPlayoutAudio == 0) {
                    return PlayoutInjection.ACCEPTED;
                }
                if (iInjectPlayoutAudio == 1) {
                    return PlayoutInjection.BUFFER_FULL;
                }
            } catch (Exception e) {
                CFK.A0A(SessionControllerKt.TAG, "injectPlayoutAudio failed", e);
                return PlayoutInjection.REJECTED;
            } finally {
                audioFrameData.releaseAndSyncFromNative();
            }
        }
        return PlayoutInjection.REJECTED;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void logSystemPipEvent(VoiceSystemPipEvent voiceSystemPipEvent) {
        C7384Etj.A0Y(voiceSystemPipEvent, 0);
        this.connectionTracker.point(voiceSystemPipEvent.getPointName(), null, true);
    }

    public final void onOrphanedSessionEnded$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(C57m c57m) {
        C7384Etj.A0Y(c57m, 0);
        String strRemove = this.sessionPinOwners.remove(c57m);
        if (strRemove != null) {
            CFK.A03(strRemove, SessionControllerKt.TAG, "video_config.orphan_ended owner=%s");
            releaseEmbodimentOwnership(strRemove);
        }
    }

    public final void onOrphanedSessionStarted$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(C57m c57m) {
        C7384Etj.A0Y(c57m, 0);
        String strRemove = this.pendingPinOwners.remove(((MetaAiRsysSdkRealTimeSession) c57m).A0G);
        if (strRemove != null) {
            this.sessionPinOwners.putIfAbsent(c57m, strRemove);
        }
    }

    public final void onRtStartPhase$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str) {
        C7384Etj.A0Y(str, 0);
        this.connectionTracker.point(str, Integer.valueOf(this.currentMarkerKey), false);
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void resizeEmbodimentSurface(Surface surface, int i, int i2) {
        Surface surface2;
        C7384Etj.A0Y(surface, 0);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            PendingEmbodimentSurface pendingEmbodimentSurface = this.pendingEmbodimentSurface;
            if (pendingEmbodimentSurface != null && (surface2 = pendingEmbodimentSurface.surface) == surface) {
                this.pendingEmbodimentSurface = new PendingEmbodimentSurface(surface2, i, i2, pendingEmbodimentSurface.generation);
            }
            this.embodimentRenderers.activeFor(surface);
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public boolean sendInput(long j, String str) {
        VoiceCallPhase voiceCallPhase;
        C57m c57m;
        C7384Etj.A0Y(str, 1);
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            VoiceCallUiState voiceCallUiStateA0L = C3cG.A0L(this);
            boolean z = false;
            if (!this.controllerClosed.get() && !this.voiceRestartInProgress && (((voiceCallPhase = voiceCallUiStateA0L.phase) == VoiceCallPhase.CONNECTED || voiceCallPhase == VoiceCallPhase.ACTIVE) && voiceCallUiStateA0L.callAttemptGeneration == j && C3cH.A09(this.voiceCallStateHolder.callAttemptGeneration) == j && !C7BY.A0j(str) && (c57m = this.currentSession) != null && !C57m.A00(c57m))) {
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) c57m;
                AnonymousClass001.A1J(new C8892Ft9(metaAiRsysSdkRealTimeSession, null, str, null, 1), metaAiRsysSdkRealTimeSession.A0X);
                CFK.A03(C3cI.A0X(this), SessionControllerKt.TAG, "Submitted text input to voice SDK (callId=%s)");
                z = true;
            }
            return z;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    public static final /* synthetic */ String access$currentThreadId(SessionController sessionController, CallMarkerState callMarkerState) {
        String str = callMarkerState.cosmosThreadId;
        return str == null ? callMarkerState.threadId : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float accessoryFocusY() {
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming;
        CallPortraitFraming value = this.callPortraitFraming.getValue();
        if (value != null && (referenceFraming = value.framing) != null) {
            return Float.valueOf(ATD.A03(((referenceFraming.cropTopFraction + 1.0f) - referenceFraming.cropBottomFraction) / 2.0f, 0.0f, 1.0f));
        }
        AccessoryVideo accessoryVideo = this.accessoryVideo;
        if (accessoryVideo == null || AnonymousClass003.A1Z(this._accessoryLiveVideo)) {
            return null;
        }
        return accessoryVideo.idleFocusY;
    }

    private final boolean addAccessoryRenderTarget(C57m c57m, AccessoryVideo accessoryVideo, EmbodimentVideoRenderer embodimentVideoRenderer) {
        try {
            c57m.A3l(embodimentVideoRenderer.videoSink, Integer.valueOf(accessoryVideo.width), Integer.valueOf(accessoryVideo.height), HatchPriceImpressionEventDataKt.NO_DISCOUNT, new C8472Feb(37));
            return true;
        } catch (RuntimeException e) {
            CFK.A0K(SessionControllerKt.TAG, e, "Failed adding the accessory video target");
            return false;
        }
    }

    private final boolean admittedForVideo() {
        return C7384Etj.areEqual(this.voiceCallStateHolder.callAvatarEmbodimentCompatible.getValue(), AnonymousClass001.A0i());
    }

    private final void annotateGatewayUnavailable(boolean z, int i) {
        AuraNetworkState.Online online;
        VoiceCallConnectionTracker voiceCallConnectionTracker = this.connectionTracker;
        AuraNetworkMonitor auraNetworkMonitor = AuraNetworkMonitor.INSTANCE;
        voiceCallConnectionTracker.onGatewayUnavailable(auraNetworkMonitor.isKnownOffline() ? VoiceCallConnectionTracker.STAGE_DEVICE_OFFLINE : z ? VoiceCallConnectionTracker.STAGE_GATEWAY_NOT_CONNECTED : VoiceCallConnectionTracker.STAGE_GATEWAY_BOOTSTRAP_FAILED, i);
        VoiceCallConnectionTracker voiceCallConnectionTracker2 = this.connectionTracker;
        String strA0e = C3cH.A0e(",", auraNetworkMonitor.getTransports());
        if (strA0e.length() == 0) {
            strA0e = networkTransport();
        }
        Integer numValueOf = Integer.valueOf(i);
        voiceCallConnectionTracker2.annotate("network_transports", strA0e, numValueOf);
        AuraNetworkState value = AuraNetworkMonitor.state.getValue();
        if ((value instanceof AuraNetworkState.Online) && (online = (AuraNetworkState.Online) value) != null) {
            this.connectionTracker.annotate(BV3.A00(72), online.isValidated, numValueOf);
        }
        Long offlineForMs = auraNetworkMonitor.getOfflineForMs();
        if (offlineForMs != null) {
            this.connectionTracker.annotate("offline_for_ms", offlineForMs.longValue(), numValueOf);
        }
    }

    private final void annotateMediaTransport(C57m c57m, int i) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C132461(c57m, this, i, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPreviewMicMuteLocked(boolean z) {
        C57m c57m = this.currentSession;
        boolean z2 = this.micMutedForPreview;
        if (!z) {
            if (z2) {
                this.micMutedForPreview = false;
                setSessionMic(c57m, (C3cG.A0L(this).isMuted || C3cG.A0L(this).isReconnecting) ? false : true);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.micMutedForPreview = true;
        dropPreConnectSpeechLocked();
        setSessionMic(c57m, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void armLiveAvatarUnavailableNotice(boolean r5, boolean r6, boolean r7, int r8) {
        /*
            r4 = this;
            if (r7 != 0) goto L7
            if (r5 == 0) goto L7
            r3 = 1
            if (r6 == 0) goto L8
        L7:
            r3 = 0
        L8:
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r4.gateway
            com.facebook.aura.gateway.HatchAiIdentityHandler$AvatarImageKey r1 = r0.getCommittedAvatarImageKey()
            r0 = 0
            if (r1 == 0) goto L29
            java.lang.String r2 = com.facebook.aura.partners.voice.session.impl.SessionControllerKt.prefKey(r1)
            if (r2 == 0) goto L29
            if (r3 == 0) goto L29
            com.facebook.aura.partners.voice.gating.VoiceGating r1 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
            boolean r1 = r1.isLiveAvatarUpdateEnabled()
            if (r1 == 0) goto L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.HxE r0 = X.C3cG.A0r(r0, r2)
        L29:
            r4.liveAvatarUnavailableNotice = r0
            X.HxE<java.lang.Integer, java.lang.String> r0 = r4.liveAvatarUnavailableNotice
            if (r0 == 0) goto L36
            java.lang.String r1 = "VoiceSessionController"
            java.lang.String r0 = "live_avatar.unavailable_toast decision=armed"
            X.CFK.A05(r1, r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.armLiveAvatarUnavailableNotice(boolean, boolean, boolean, int):void");
    }

    private final void awaitPreparedAvatarLocked(String str, String str2, HatchVideoCrop hatchVideoCrop, String str3, String str4, boolean z, boolean z2) {
        PendingCallAvatarSwap pendingCallAvatarSwap = new PendingCallAvatarSwap(str, hatchVideoCrop, str3, z, str4);
        this.pendingCallAvatarSwap = pendingCallAvatarSwap;
        CFK.A03(str3 == null ? "none" : str3, SessionControllerKt.TAG, "live_avatar.wait.start avatar_stem=%s");
        if (z2) {
            HoC hoC = this.idleVideoUpdateJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.idleVideoUpdateJob = null;
        }
        HoC hoC2 = this.callAvatarAwaitJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.callAvatarAwaitJob = AnonymousClass001.A11(new C132491(str3, this, str, str2, hatchVideoCrop, z, pendingCallAvatarSwap, null), this.coroutineScope);
    }

    public static /* synthetic */ void awaitPreparedAvatarLocked$default(SessionController sessionController, String str, String str2, HatchVideoCrop hatchVideoCrop, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 64) != 0) {
            z2 = true;
        }
        sessionController.awaitPreparedAvatarLocked(str, str2, hatchVideoCrop, str3, str4, z, z2);
    }

    private final String awaitedAvatarStem(String str, CallStartAvatarLayout callStartAvatarLayout) {
        HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart;
        Companion companion = Companion;
        HxE<String, HatchCallJoinContext.AvatarUpdatingStart> hxE = this.avatarUpdatingStart;
        String str2 = (hxE == null || !C3cG.A1O(str, hxE) || (avatarUpdatingStart = hxE.second) == null) ? null : avatarUpdatingStart.awaitedStem;
        HxE<String, String> hxE2 = this.preConnectUpdatingStem;
        String str3 = (hxE2 == null || !C3cG.A1O(str, hxE2)) ? null : hxE2.second;
        AiIdentity aiIdentityA0R = C3cH.A0R(this.gateway);
        return companion.callStartAwaitedStem$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str2, str3, aiIdentityA0R != null ? aiIdentityA0R.avatarStem : null, callStartAvatarLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bindAccessoryVideo(com.facebook.aura.partners.voice.session.impl.SessionController.AccessoryVideo r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132531
            if (r0 == 0) goto L6d
            r7 = r10
            com.facebook.aura.partners.voice.session.impl.SessionController$bindAccessoryVideo$1 r7 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132531) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L84
            java.lang.Object r9 = r7.L$0
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r9 = (com.facebook.aura.partners.voice.session.impl.SessionController.AccessoryVideo) r9
            X.Hwg.A00(r1)
        L24:
            java.util.concurrent.locks.ReentrantLock r1 = X.C3cH.A0p(r8)
            goto L73
        L29:
            X.Hwg.A00(r1)
            java.util.concurrent.locks.ReentrantLock r1 = X.C3cH.A0p(r8)
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r0 = r8.accessoryVideo     // Catch: java.lang.Throwable -> L89
            r4 = 0
            if (r0 != r9) goto L3a
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r9.renderer     // Catch: java.lang.Throwable -> L89
            r3 = 1
            if (r0 == 0) goto L3b
        L3a:
            r3 = 0
        L3b:
            r1.unlock()
            if (r3 == 0) goto L60
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r2 = r8.createAccessoryRenderer(r9)
            if (r2 != 0) goto L49
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L49:
            java.util.concurrent.locks.ReentrantLock r1 = X.C3cH.A0p(r8)
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r0 = r8.accessoryVideo     // Catch: java.lang.Throwable -> L89
            if (r0 != r9) goto L58
            com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r0 = r9.renderer     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L58
            r4 = 1
            r9.renderer = r2     // Catch: java.lang.Throwable -> L89
        L58:
            r1.unlock()
            if (r4 != 0) goto L60
            r8.releaseAccessoryRendererLater(r2)
        L60:
            r7.L$0 = r9
            r7.Z$0 = r3
            r7.label = r5
            java.lang.Object r0 = r8.startAccessoryIdle(r9, r7)
            if (r0 != r6) goto L24
            return r6
        L6d:
            com.facebook.aura.partners.voice.session.impl.SessionController$bindAccessoryVideo$1 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$bindAccessoryVideo$1
            r7.<init>(r10)
            goto L12
        L73:
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r0 = r8.accessoryVideo     // Catch: java.lang.Throwable -> L89
            if (r0 != r9) goto L7e
            X.57m r0 = r8.currentSession     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L7e
            r8.bindAccessoryVideoLocked(r9, r0)     // Catch: java.lang.Throwable -> L89
        L7e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L89
            r1.unlock()
            return r6
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L89:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.bindAccessoryVideo(com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo, X.HtJ):java.lang.Object");
    }

    private final void bindAccessoryVideoLocked(AccessoryVideo accessoryVideo, C57m c57m) {
        C57m c57m2;
        EmbodimentVideoRenderer embodimentVideoRenderer = accessoryVideo.renderer;
        if (embodimentVideoRenderer == null || (c57m2 = accessoryVideo.boundSession) == c57m) {
            return;
        }
        removeAccessoryRenderTarget(c57m2, embodimentVideoRenderer);
        if (!addAccessoryRenderTarget(c57m, accessoryVideo, embodimentVideoRenderer)) {
            c57m = null;
        }
        accessoryVideo.boundSession = c57m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindEmbodimentSurface(C57m c57m) {
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C132541(c57m, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e2 A[EXC_TOP_SPLITTER, PHI: r0 r1 r6 r13
  0x00e2: PHI (r0v11 X.57m) = (r0v0 X.57m), (r0v15 X.57m) binds: [B:43:0x00e1, B:41:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r1v17 com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface) = 
  (r1v12 com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface)
  (r1v32 com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface)
 binds: [B:43:0x00e1, B:41:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r6v16 boolean) = (r6v8 boolean), (r6v17 boolean) binds: [B:43:0x00e1, B:41:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r13v5 int) = (r13v1 int), (r13v6 int) binds: [B:43:0x00e1, B:41:0x00dd] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #4 {all -> 0x025b, blocks: (B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:52:0x0107, B:58:0x0119, B:61:0x0139, B:95:0x0218, B:97:0x021e, B:14:0x004a, B:16:0x004e, B:17:0x0052, B:19:0x005a, B:28:0x0098, B:30:0x009c, B:31:0x00a0, B:33:0x00a4, B:34:0x00a8, B:20:0x0063), top: B:116:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bindEmbodimentSurfaceLocked(X.C57m r18, X.HtJ<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.bindEmbodimentSurfaceLocked(X.57m, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bindEmbodimentSurfaceOnMain(X.C57m r8, X.HtJ<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132581
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceOnMain$1 r6 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132581) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L3d
            if (r1 == r0) goto L31
            if (r1 != r3) goto L2c
            java.lang.Object r1 = r6.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L5c
        L26:
            com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceOnMain$1 r6 = new com.facebook.aura.partners.voice.session.impl.SessionController$bindEmbodimentSurfaceOnMain$1
            r6.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r1 = r6.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r8 = r6.L$0
            X.57m r8 = (X.C57m) r8
            X.Hwg.A00(r5)
            goto L4f
        L3d:
            X.Hwg.A00(r5)
            X.BLa r1 = r7.embodimentBindMutex
            r6.L$0 = r8
            r6.L$1 = r1
            r6.label = r0
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r4) goto L4f
            return r4
        L4f:
            r6.L$0 = r2     // Catch: java.lang.Throwable -> L65
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L65
            r6.label = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r7.bindEmbodimentSurfaceLocked(r8, r6)     // Catch: java.lang.Throwable -> L65
            if (r0 != r4) goto L5f
            return r4
        L5c:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L67
        L5f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            r1.Ahe(r2)
            return r0
        L65:
            r0 = move-exception
            goto L68
        L67:
            r0 = move-exception
        L68:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.bindEmbodimentSurfaceOnMain(X.57m, X.HtJ):java.lang.Object");
    }

    private final CallStartAvatarLayout callStartAvatarLayout(HatchCallJoinContext.CallAdmission callAdmission, boolean z) {
        if (callAdmission == null || !callAdmission.avatarUpdating || callAdmission.portraitCrop == null || !VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled()) {
            return CallStartAvatarLayout.LIVE;
        }
        Companion companion = Companion;
        HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart = callAdmission.avatarUpdatingStart;
        return companion.startPresentationLayout$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(avatarUpdatingStart != null ? avatarUpdatingStart.presentation : null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceRestartState captureRestartStateLocked() {
        Boolean bool = this.rejoinRestoreMuted;
        return new VoiceRestartState(bool != null ? bool.booleanValue() : C3cG.A0L(this).isMuted, C3cG.A0L(this).isSpeakerOn, C3cG.A0L(this).isCaptionsEnabled, C3cI.A0J(this).audioOnlyReason);
    }

    private final void clearAssistantCaptionStateLocked() {
        VoiceCallUiState value;
        HoC hoC = this.assistantCaptionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.assistantCaptionJob = null;
        this.threadCaptionBus.clearAssistant(this.assistantCaptionThreadId);
        this.assistantCaptionThreadId = null;
        BLG<VoiceCallUiState> blg = this._callState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 126975, null)));
    }

    private final void clearCallStartAvatar() {
        String str;
        CallStartAvatar callStartAvatar = this.callStartAvatar;
        if (callStartAvatar != null && (str = callStartAvatar.stillPath) != null) {
            this.avatarStore.releaseAvatarFile(str);
        }
        this.callStartAvatar = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearCaptions(long j) {
        VoiceCallUiState value;
        VoiceCallUiState voiceCallUiStateCopy$default;
        BLG<VoiceCallUiState> blg = this._callState;
        do {
            value = blg.getValue();
            voiceCallUiStateCopy$default = value;
            if (voiceCallUiStateCopy$default.callAttemptGeneration == j) {
                AHI ahi = AHI.A01;
                voiceCallUiStateCopy$default = VoiceCallUiState.copy$default(voiceCallUiStateCopy$default, null, 0L, null, null, null, null, false, false, false, false, ahi, ahi, null, 0L, 0, false, null, 95231, null);
            }
        } while (!blg.A6e(value, voiceCallUiStateCopy$default));
        clearThreadCaption(j);
    }

    private final EmbodimentVideoRenderer clearEmbodimentStateLocked() {
        this.embodimentGeneration++;
        this.pendingEmbodimentSurface = null;
        AnonymousClass003.A14(this._embodimentReady, false);
        this._embodimentReadyGeneration.Af8(null);
        return this.embodimentRenderers.retireActive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearServiceRestartReconnecting(C57m c57m) {
        VoiceCallUiState value;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            if (this.currentSession == c57m && !this.voiceRestartInProgress && this.rejoinRestoreMuted == null && C3cG.A0L(this).isReconnecting && (c57m.ADx().getValue() instanceof GQb)) {
                BLG<VoiceCallUiState> blg = this._callState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 130943, null)));
                setMutedLocked(C3cG.A0L(this).isMuted, c57m);
            }
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearThreadCaption(long j) {
        synchronized (this.threadCaptionLock) {
            if (this.threadCaptionBus.publishUserCaptionIfCurrent(j, null)) {
                this.currentUserTurnId = null;
                this.previousThreadBotState = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectCaptions(X.C57m r7, long r8, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132621
            if (r0 == 0) goto L22
            r5 = r10
            com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$1 r5 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132621) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L49
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$1 r5 = new com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$1
            r5.<init>(r10)
            goto L12
        L28:
            X.Hwg.A00(r1)
            r0 = r7
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.F0C r0 = r0.A0Q
            java.lang.Object r2 = r0.getValue()
            X.22I r2 = (X.C22I) r2
            com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$2 r1 = new com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$2
            r1.<init>(r8, r7)
            r0 = 0
            r5.L$0 = r0
            r5.J$0 = r8
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L4c
            return r4
        L49:
            X.Hwg.A00(r1)
        L4c:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.collectCaptions(X.57m, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectSessionState(final X.C57m r25, final int r26, final java.lang.String r27, final java.lang.String r28, long r29, X.HtJ<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.collectSessionState(X.57m, int, java.lang.String, java.lang.String, long, X.HtJ):java.lang.Object");
    }

    private final EmbodimentVideoRenderer createAccessoryRenderer(AccessoryVideo accessoryVideo) {
        try {
            EmbodimentVideoRenderer embodimentVideoRendererCreate = EmbodimentVideoRenderer.Companion.create(accessoryVideo.surface, accessoryVideo.width, accessoryVideo.height, this.currentMarkerKey, new SessionController$createAccessoryRenderer$renderer$1(this), EmbodimentVideoRenderer$Companion$create$2.INSTANCE);
            embodimentVideoRendererCreate.onFirstLiveFrame = new C132701(accessoryVideo, embodimentVideoRendererCreate);
            return embodimentVideoRendererCreate;
        } catch (RuntimeException e) {
            ReentrantLock reentrantLockA0p = C3cH.A0p(this);
            try {
                int i = accessoryVideo.createFailures + 1;
                accessoryVideo.createFailures = i;
                reentrantLockA0p.unlock();
                CFK.A0K(SessionControllerKt.TAG, e, FGI.A0I("Failed creating the accessory video renderer (", i, ")"));
                if (i >= 3) {
                    return null;
                }
                retryAccessoryVideoBind(accessoryVideo);
                return null;
            } catch (Throwable th) {
                reentrantLockA0p.unlock();
                throw th;
            }
        }
    }

    private final VoiceEmbodimentMedia.LiveRtc currentAvatarStillMediaLocked(String str, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        String string;
        String path;
        String strPut;
        Uri uriRetainCurrentAvatarFile = this.avatarStore.retainCurrentAvatarFile();
        if (uriRetainCurrentAvatarFile != null && (path = uriRetainCurrentAvatarFile.getPath()) != null && (strPut = this.retainedStaticAvatarPaths.put(str, path)) != null) {
            this.avatarStore.releaseAvatarFile(strPut);
        }
        String str2 = null;
        if (uriRetainCurrentAvatarFile != null && (string = uriRetainCurrentAvatarFile.toString()) != null && (!this.avatarReferenceProvider.currentCallEmbodimentDark())) {
            str2 = string;
        }
        return SessionControllerKt.currentAvatarStillMedia(str2, referenceFraming);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int currentGreetingDelayMs() {
        VoiceGating voiceGating = VoiceGating.INSTANCE;
        if (voiceGating.isGreetingDelayEnabled()) {
            return VoicePrefs.INSTANCE.getGreetingDelayMs(this.userSession, voiceGating.getGreetingDelayDefaultMs());
        }
        return 0;
    }

    private final String currentThreadId(CallMarkerState callMarkerState) {
        String str = callMarkerState.cosmosThreadId;
        return str == null ? callMarkerState.threadId : str;
    }

    private final void detachEmbodimentRenderTarget(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer) {
        if (c57m != null) {
            try {
                c57m.Aav(embodimentVideoRenderer.videoSink, HatchPriceImpressionEventDataKt.NO_DISCOUNT);
            } catch (RuntimeException e) {
                CFK.A0K(SessionControllerKt.TAG, e, "Failed detaching the embodiment render target");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void endCall$default(SessionController sessionController, boolean z, String str, String str2, String str3, Function0 function0, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function0 = C132731.INSTANCE;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        sessionController.endCall(z, str, str2, str3, function0, l);
    }

    private final void endCallAvatarHistoryLocked() {
        this.callAvatarHistoryJob = C3cI.A15(this.callAvatarHistoryJob);
        this.callAvatarHistory = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void endCallAvatarStateLocked(String str) {
        HoC hoC;
        PendingCallAvatarSwap pendingCallAvatarSwap = this.pendingCallAvatarSwap;
        if (pendingCallAvatarSwap != null && (hoC = this.callAvatarAwaitJob) != null && hoC.isActive()) {
            String str2 = pendingCallAvatarSwap.avatarStem;
            if (str2 == null) {
                str2 = "none";
            }
            CFK.A03(str2, SessionControllerKt.TAG, "live_avatar.wait.end avatar_stem=%s result=call_changed");
        }
        this.pendingCallAvatarSwap = null;
        HoC hoC2 = this.callAvatarAwaitJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.callAvatarAwaitJob = null;
        endCallAvatarHistoryLocked();
        clearCallStartAvatar();
        this.callShownAvatarStem = null;
        this.previousAvatarShownCallId = null;
        this.callAvatarWithoutImageCallId.Af8(null);
        endLiveAvatarUpdateTimeoutLocked(str);
        this.voiceCallStateHolder.hideLiveAvatarUpdateStatus();
        this.liveAvatarUpdatingSince = null;
        this.liveAvatarCompletedCallId = null;
        this.liveAvatarFailedCall = null;
        this.callStartWait = null;
        this.avatarUpdatingStart = null;
        HxE<String, ? extends CallAvatarUpdate.FailureReason> hxE = this.pendingPreConnectFailure;
        if (hxE != null) {
            logPreConnectFailure(hxE.first, (CallAvatarUpdate.FailureReason) hxE.second);
        }
        this.timerClosedWaitCallId = null;
        this.admittedCallId = null;
        this.avatarReferenceProvider.pinCallIdleAppearance(null);
        this.preConnectUpdatingStem = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.session.impl.SessionController.CallEndOwnership endCallInternal(java.lang.String r38, java.lang.String r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, boolean r41, boolean r42, boolean r43, java.lang.Long r44, boolean r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.endCallInternal(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, boolean, boolean, boolean, java.lang.Long, boolean, java.lang.String):com.facebook.aura.partners.voice.session.impl.SessionController$CallEndOwnership");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallEndOwnership endCallInternal$default(SessionController sessionController, String str, String str2, Function0 function0, boolean z, boolean z2, boolean z3, Long l, boolean z4, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = C132751.INSTANCE;
        }
        boolean zA1K = C3cG.A1K(i & 8, z);
        boolean zA1S = C3cI.A1S(i, z2);
        boolean zA1R = AnonymousClass002.A1R(i, z3);
        if ((i & 64) != 0) {
            l = null;
        }
        boolean zA1N = C3cH.A1N(i, z4);
        if ((i & 256) != 0) {
            str3 = null;
        }
        return sessionController.endCallInternal(str, str2, function0, zA1K, zA1S, zA1R, l, zA1N, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endLiveAvatarUpdateTimeoutLocked(String str) {
        HoC hoC;
        HoC hoC2;
        HxE<HxE<String, String>, ? extends HoC> hxE = this.liveAvatarUpdateTimeout;
        if (hxE != null && (hoC2 = (HoC) hxE.second) != null && hoC2.isActive()) {
            CFK.A03(str, SessionControllerKt.TAG, "live_avatar.timer.cancel why=%s");
        }
        HxE<HxE<String, String>, ? extends HoC> hxE2 = this.liveAvatarUpdateTimeout;
        if (hxE2 != null && (hoC = (HoC) hxE2.second) != null) {
            hoC.A5w(null);
        }
        this.liveAvatarUpdateTimeout = null;
    }

    private final String endedReason(C57l c57l) {
        Integer num = c57l.A00;
        return (num == null || num.intValue() != 40) ? !c57l.A02 ? (num == null || num.intValue() != 7) ? VoiceCallConnectionTracker.END_REASON_SERVER_ENDED : VoiceCallConnectionTracker.END_REASON_NETWORK_DROP : VoiceCallConnectionTracker.END_REASON_NETWORK_DROP : VoiceCallConnectionTracker.END_REASON_SERVER_TIMEOUT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureGatewayConnected(X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132801
            if (r0 == 0) goto Lab
            r7 = r11
            com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$1 r7 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132801) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r6 = 0
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L50
            if (r1 == r4) goto L8d
            if (r1 != r5) goto Lb2
            boolean r2 = r7.Z$0
            int r3 = r7.I$0
            X.Hwg.A00(r0)
        L28:
            boolean r0 = X.C3cG.A1P(r0, r4)
            if (r0 == 0) goto L2f
            r6 = 1
        L2f:
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r5 = r10.connectionTracker
            java.lang.Integer r4 = X.C3cG.A0R(r3)
            java.lang.String r1 = "gateway_wait_end"
            r0 = 0
            r5.point(r1, r4, r0)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r4 = r10.connectionTracker
            java.lang.String r1 = "gateway_wait_connected"
            java.lang.Integer r0 = X.C3cG.A0R(r3)
            r4.annotate(r1, r6, r0)
            if (r6 != 0) goto L4b
            r10.annotateGatewayUnavailable(r2, r3)
        L4b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L50:
            X.Hwg.A00(r0)
            boolean r0 = r10.isGatewayReady()
            if (r0 == 0) goto L5e
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L5e:
            int r3 = r10.currentMarkerKey
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r10.connectionTracker
            java.lang.Integer r1 = X.C3cG.A0R(r3)
            r9 = 0
            java.lang.String r0 = "gateway_wait_start"
            r2.point(r0, r1, r6)
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r10.gateway
            X.1BN<java.lang.Boolean> r0 = r2.serviceRestartPending
            boolean r0 = X.C3cH.A1R(r0)
            if (r0 != 0) goto L81
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r10.gateway
            X.1BN<java.lang.Boolean> r0 = r0.storageRecoveryConnected
            boolean r1 = X.C3cH.A1R(r0)
            r0 = 1
            if (r1 == 0) goto L82
        L81:
            r0 = 0
        L82:
            r7.I$0 = r3
            r7.label = r4
            java.lang.Object r0 = r2.fetchAndConnect(r0, r4, r9, r7)
            if (r0 != r8) goto L92
            return r8
        L8d:
            int r3 = r7.I$0
            X.Hwg.A00(r0)
        L92:
            boolean r2 = X.AnonymousClass001.A1X(r0)
            if (r2 == 0) goto L2f
            r1 = 0
            com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$connected$1 r0 = new com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$connected$1
            r0.<init>(r10, r1)
            r7.I$0 = r3
            r7.Z$0 = r2
            r7.label = r5
            java.lang.Object r0 = X.C3cI.A0S(r0, r7)
            if (r0 != r8) goto L28
            return r8
        Lab:
            com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$1 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$ensureGatewayConnected$1
            r7.<init>(r11)
            goto L12
        Lb2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.ensureGatewayConnected(X.HtJ):java.lang.Object");
    }

    private final void finishEmbodimentTeardown(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer) {
        if (embodimentVideoRenderer != null) {
            C3cJ.A0i(embodimentVideoRenderer, this);
        }
        releaseEmbodimentRenderer(c57m, embodimentVideoRenderer);
    }

    private final void finishOwnedEmbodimentTeardown(CallEndOwnership callEndOwnership) {
        finishEmbodimentTeardown(callEndOwnership.session, callEndOwnership.staleRenderer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallEndOwnership forceEndCurrentCallInternal$default(SessionController sessionController, String str, String str2, Function0 function0, boolean z, boolean z2, Long l, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function0 = C132811.INSTANCE;
        }
        boolean zA1P = AnonymousClass005.A1P(i, z);
        boolean zA1Q = AnonymousClass005.A1Q(i, z2);
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        return sessionController.forceEndCurrentCallInternal(str, str2, function0, zA1P, zA1Q, l, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchRealTimeSessionController getHatchSessionController() {
        Hr6 hr6 = this.rtSessionController;
        if (hr6 instanceof HatchRealTimeSessionController) {
            return (HatchRealTimeSessionController) hr6;
        }
        return null;
    }

    private final String getLogName(CompletedCallAvatar completedCallAvatar) {
        if (C7384Etj.areEqual(completedCallAvatar, CompletedCallAvatar.Unchanged.INSTANCE)) {
            return BV3.A00(12);
        }
        if (C7384Etj.areEqual(completedCallAvatar, CompletedCallAvatar.AwaitPrepared.INSTANCE)) {
            return "await_prepared";
        }
        if (completedCallAvatar instanceof CompletedCallAvatar.CallStart) {
            return "call_start";
        }
        if (completedCallAvatar instanceof CompletedCallAvatar.Remembered) {
            return "remembered";
        }
        throw C3cG.A0q();
    }

    private final String getOrCreateRtcSessionId(String str) {
        CallMarkerState value;
        CallMarkerState callMarkerStateCopy$default;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            String strGenerateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = Companion.generateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl();
            BLG<CallMarkerState> blg = this.callMarker;
            do {
                value = blg.getValue();
                callMarkerStateCopy$default = value;
                if (C7384Etj.areEqual(callMarkerStateCopy$default.callId, str) && callMarkerStateCopy$default.rtcSessionId == null) {
                    callMarkerStateCopy$default = CallMarkerState.copy$default(callMarkerStateCopy$default, null, strGenerateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, null, null, 0, 0L, 0L, 0L, false, null, null, null, 4093, null);
                }
            } while (!blg.A6e(value, callMarkerStateCopy$default));
            if (C7384Etj.areEqual(callMarkerStateCopy$default.callId, str)) {
                String str2 = callMarkerStateCopy$default.rtcSessionId;
                if (str2 != null) {
                    strGenerateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = str2;
                }
            } else {
                strGenerateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = null;
            }
            return strGenerateRtcSessionId$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012f A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013b A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:25:0x0075, B:27:0x007b, B:30:0x008f, B:32:0x0093, B:34:0x009e, B:36:0x00a5, B:39:0x00af, B:41:0x00b7, B:49:0x00cd, B:52:0x00d3, B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:58:0x00fa, B:60:0x00fe, B:61:0x0101, B:63:0x0105, B:64:0x0108, B:66:0x010c, B:67:0x010f, B:69:0x0113, B:70:0x0116, B:72:0x011a, B:73:0x011d, B:75:0x0126, B:76:0x0129, B:78:0x012f, B:79:0x0132, B:81:0x013b, B:82:0x013e, B:83:0x0156, B:85:0x0162, B:88:0x016c, B:90:0x019d, B:92:0x01b2, B:44:0x00c1), top: B:138:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, com.facebook.aura.partners.voice.session.impl.SessionController$CapturedUndeliveredSpeech] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSessionEnded(X.C57m r49, X.C57l r50, int r51, java.lang.String r52, java.lang.String r53, X.HtJ<? super kotlin.Unit> r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.handleSessionEnded(X.57m, X.57l, int, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x016b: INVOKE (r8 I:java.util.concurrent.locks.ReentrantLock) VIRTUAL call: java.util.concurrent.locks.ReentrantLock.unlock():void A[MD:():void (c)] (LINE:363), block:B:66:0x016b */
    public final Object handleSessionStateUpdate(C57m c57m, InterfaceC05673vm interfaceC05673vm, int i, String str, String str2, HtJ<? super Unit> htJ) throws Throwable {
        ReentrantLock reentrantLockUnlock;
        ReentrantLock reentrantLockA0p;
        VoiceCallUiState value;
        Unit unit;
        VoiceCallUiState value2;
        VoiceCallUiState voiceCallUiState;
        VoiceCallUiState value3;
        boolean z = true;
        try {
            if (interfaceC05673vm instanceof C10518Hog) {
                reentrantLockA0p = C3cH.A0p(this);
                if (!isCurrentCallLocked(c57m, str2)) {
                    unit = Unit.INSTANCE;
                    reentrantLockA0p.unlock();
                    return unit;
                }
                HoC hoC = this.connectedTransitionJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                BLG<VoiceCallUiState> blg = this._callState;
                do {
                    value3 = blg.getValue();
                } while (!blg.A6e(value3, VoiceCallUiState.copy$default(value3, VoiceCallPhase.CONNECTING, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 131070, null)));
                reentrantLockA0p.unlock();
            } else if (interfaceC05673vm instanceof GQb) {
                ReentrantLock reentrantLockA0p2 = C3cH.A0p(this);
                if (isCurrentCallLocked(c57m, str2)) {
                    c57m.Acw(C3cH.A1R(this.voiceCallStateHolder.isPreviewActive) ? 0.0f : 1.0f);
                    Boolean bool = this.rejoinRestoreMuted;
                    BLG<VoiceCallUiState> blg2 = this._callState;
                    do {
                        value2 = blg2.getValue();
                        voiceCallUiState = value2;
                    } while (!blg2.A6e(value2, VoiceCallUiState.copy$default(voiceCallUiState, null, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 130943, null)));
                    boolean z2 = voiceCallUiState.isReconnecting;
                    if (bool != null || z2) {
                        this.rejoinRestoreMuted = null;
                        setMutedLocked(bool != null ? bool.booleanValue() : C3cG.A0L(this).isMuted, c57m);
                    } else if (C3cG.A0L(this).isMuted || this.micMutedForPreview) {
                        setSessionMic(c57m, false);
                    }
                } else {
                    z = false;
                }
                reentrantLockA0p2.unlock();
                if (z) {
                    applyBotAudio();
                    if (markServerConnected(c57m)) {
                        if (this.connectionTracker.onConnected(i)) {
                            this.connectionTracker.annotate("network_transport_at_connect", networkTransport(), C3cG.A0R(i));
                            annotateMediaTransport(c57m, i);
                        }
                        showLiveAvatarUnavailableNoticeOnce(i);
                    }
                }
            } else if (interfaceC05673vm instanceof C10517Hof) {
                reentrantLockA0p = C3cH.A0p(this);
                if (!isCurrentCallLocked(c57m, str2)) {
                    unit = Unit.INSTANCE;
                    reentrantLockA0p.unlock();
                    return unit;
                }
                HoC hoC2 = this.connectedTransitionJob;
                if (hoC2 != null) {
                    hoC2.A5w(null);
                }
                this.connectionTracker.onReconnecting(i);
                BLG<VoiceCallUiState> blg3 = this._callState;
                do {
                    value = blg3.getValue();
                } while (!blg3.A6e(value, VoiceCallUiState.copy$default(value, VoiceCallPhase.CONNECTING, 0L, null, null, null, null, false, true, false, false, null, null, null, 0L, 0, false, null, 130942, null)));
                setSessionMic(c57m, false);
                reentrantLockA0p.unlock();
            } else {
                if (!(interfaceC05673vm instanceof C57l)) {
                    throw C3cG.A0q();
                }
                Object objHandleSessionEnded = handleSessionEnded(c57m, (C57l) interfaceC05673vm, i, str, str2, htJ);
                if (objHandleSessionEnded == EnumC10460Hji.A02) {
                    return objHandleSessionEnded;
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            reentrantLockUnlock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGatewayReady() {
        return (this.gateway.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected) && !C3cH.A1R(this.gateway.serviceRestartPending);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStillCurrentGeneration(int i) {
        return AnonymousClass002.A1Q(this.connectAttempt.get(), i);
    }

    private final boolean lightStillAllowed() {
        return !this.avatarReferenceProvider.currentCallEmbodimentDark();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeSignalUserSpeechStarted() {
        if (!this.userSpeechSignaled.get() && VoiceGating.INSTANCE.isGreetingDelayEnabled() && C3cI.A1W(this.userSpeechSignaled)) {
            AnonymousClass001.A1J(new C132871(null), this.markerScope);
        }
    }

    private final String networkTransport() {
        AuraNetworkState value = AuraNetworkMonitor.state.getValue();
        if (value instanceof AuraNetworkState.Online) {
            return ((AuraNetworkState.Online) value).transport.name();
        }
        if (C7384Etj.areEqual(value, AuraNetworkState.Offline.INSTANCE)) {
            return "offline";
        }
        if (C7384Etj.areEqual(value, AuraNetworkState.Unknown.INSTANCE)) {
            return "unknown";
        }
        throw C3cG.A0q();
    }

    private final VoiceEmbodimentMedia.LiveRtc newAvatarStillMediaLocked(String str, String str2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart;
        String str3;
        HxE<String, HatchCallJoinContext.AvatarUpdatingStart> hxE = this.avatarUpdatingStart;
        if (hxE != null && C3cG.A1O(str, hxE) && (avatarUpdatingStart = hxE.second) != null && avatarUpdatingStart.presentation != null && (str3 = avatarUpdatingStart.awaitedStem) != null) {
            AiIdentity aiIdentityA0R = C3cH.A0R(this.gateway);
            if (!str3.equals(aiIdentityA0R != null ? aiIdentityA0R.avatarStem : null)) {
                return SessionControllerKt.currentAvatarStillMedia(null, referenceFraming);
            }
        }
        return currentAvatarStillMediaLocked(str2, referenceFraming);
    }

    private final boolean ownsCallGeneration(long j) {
        return !this.controllerClosed.get() && C3cI.A0I(this) != VoiceCallPhase.ENDED && C3cH.A1P(this.voiceCallStateHolder) && C3cH.A09(this.voiceCallStateHolder.callGeneration) == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0083: INVOKE (r5 I:X.BLa), (r6 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:131), block:B:30:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performVoiceControl(kotlin.jvm.functions.Function0<? extends com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result> r10, X.HtJ<? super com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132991
            if (r0 == 0) goto L26
            r7 = r11
            com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$1 r7 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132991) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r3 = r7.label
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L3d
            if (r3 == r1) goto L31
            if (r3 != r2) goto L2c
            java.lang.Object r5 = r7.L$1
            X.BLa r5 = (X.InterfaceC2261BLa) r5
            goto L79
        L26:
            com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$1 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$1
            r7.<init>(r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r5 = r7.L$1
            X.BLa r5 = (X.InterfaceC2261BLa) r5
            java.lang.Object r10 = r7.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            X.Hwg.A00(r0)
            goto L4f
        L3d:
            X.Hwg.A00(r0)
            X.BLa r5 = r9.voiceControlMutex
            r7.L$0 = r10
            r7.L$1 = r5
            r7.label = r1
            java.lang.Object r0 = r5.APs(r6, r7)
            if (r0 != r8) goto L4f
            return r8
        L4f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.controllerClosed     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L5a
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r0 = com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result.NO_ACTIVE_CALL     // Catch: java.lang.Throwable -> L82
            goto L7e
        L5a:
            X.78T r4 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> L82
            com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$2$1 r3 = new com.facebook.aura.partners.voice.session.impl.SessionController$performVoiceControl$2$1     // Catch: java.lang.Throwable -> L82
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L82
            r7.L$0 = r6     // Catch: java.lang.Throwable -> L82
            r7.L$1 = r5     // Catch: java.lang.Throwable -> L82
            r7.label = r2     // Catch: java.lang.Throwable -> L82
            r2 = 10
            r1 = 42
            X.EZD r0 = new X.EZD     // Catch: java.lang.Throwable -> L82
            r0.<init>(r3, r6, r2, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = X.GAo.A00(r7, r4, r0)     // Catch: java.lang.Throwable -> L82
            if (r0 != r8) goto L7c
            return r8
        L79:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L82
        L7c:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r0 = (com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result) r0     // Catch: java.lang.Throwable -> L82
        L7e:
            r5.Ahe(r6)
            return r0
        L82:
            r0 = move-exception
            r5.Ahe(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.performVoiceControl(kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[PHI: r3
  0x00aa: PHI (r3v4 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot) = 
  (r3v1 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot)
  (r3v5 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot)
 binds: [B:7:0x0026, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot) = 
  (r3v0 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot)
  (r3v5 com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot)
 binds: [B:3:0x0015, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot pinCachedVideoConfig(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r13.currentMarkerKey
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r13.connectionTracker
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.String r1 = "avatar_ref_start"
            r0 = 0
            r2.point(r1, r4, r0)
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore r0 = r13.videoConfigStore
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot r3 = r0.pin(r14)
            if (r3 != 0) goto L24
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore r0 = r13.videoConfigStore
            r0.seedRestoredAvatar()
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore r0 = r13.videoConfigStore
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot r3 = r0.pin(r14)
            if (r3 == 0) goto Laa
        L24:
            com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r0 = r3.avatar
            if (r0 == 0) goto Laa
            com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r9 = r0.selection
            if (r9 == 0) goto Lab
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r11 = r9.reference
        L2e:
            r8 = 1
            r7 = 0
            boolean r0 = X.AnonymousClass002.A1X(r3)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.String r5 = "none"
            if (r11 == 0) goto L40
            java.lang.String r10 = r11.assetId
            if (r10 != 0) goto L41
        L40:
            r10 = r5
        L41:
            if (r9 == 0) goto L47
            java.lang.String r2 = r9.kind
            if (r2 != 0) goto L48
        L47:
            r2 = r5
        L48:
            java.lang.String r1 = "VoiceSessionController"
            java.lang.String r0 = "video_config.call_snapshot available=%b assetId=%s kind=%s"
            X.CFK.A01(r12, r10, r2, r1, r0)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r1 = r13.connectionTracker
            java.lang.String r0 = "avatar_ref_end"
            r1.point(r0, r4, r7)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r13.connectionTracker
            if (r11 == 0) goto L5e
            java.lang.String r1 = r11.assetId
            if (r1 != 0) goto L60
        L5e:
            java.lang.String r1 = ""
        L60:
            java.lang.String r0 = "avatar_asset_id"
            r2.annotate(r0, r1, r4)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r13.connectionTracker
            if (r9 == 0) goto L6d
            java.lang.String r1 = r9.kind
            if (r1 != 0) goto L6e
        L6d:
            r1 = r5
        L6e:
            java.lang.String r0 = "reference_kind"
            r2.annotate(r0, r1, r4)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r1 = r13.connectionTracker
            if (r3 == 0) goto L7d
            com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r0 = r3.avatar
            if (r0 == 0) goto L7d
            java.lang.Boolean r6 = r0.referenceFromOriginal
        L7d:
            boolean r0 = X.AnonymousClass002.A1b(r6, r8)
            if (r0 == 0) goto L9a
            java.lang.String r5 = "original"
        L85:
            java.lang.String r0 = "reference_source"
            r1.annotate(r0, r5, r4)
            com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker r2 = r13.connectionTracker
            com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore r0 = r13.videoConfigStore
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r0.originalStillFailure
            boolean r1 = X.AnonymousClass003.A1Y(r0)
            java.lang.String r0 = "original_still_failed"
            r2.annotate(r0, r1, r4)
            return r3
        L9a:
            boolean r0 = X.AnonymousClass002.A1b(r6, r7)
            if (r0 == 0) goto La3
            java.lang.String r5 = "thumbnail"
            goto L85
        La3:
            if (r6 != 0) goto Lad
            if (r3 == 0) goto L85
            java.lang.String r5 = "unknown"
            goto L85
        Laa:
            r9 = r6
        Lab:
            r11 = r6
            goto L2e
        Lad:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.pinCachedVideoConfig(java.lang.String):com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean publishPreConnectCaption(String str, String str2, long j, int i) {
        boolean zPublishUserCaptionIfCurrent;
        synchronized (this.threadCaptionLock) {
            if (this.preConnectCaption == null || this.serverConnectedMarked.get() || C3cG.A0L(this).callAttemptGeneration != j) {
                zPublishUserCaptionIfCurrent = false;
            } else {
                if (!C7384Etj.areEqual(this.preConnectTurnId, str)) {
                    this.connectionTracker.annotate("pre_connect_caption_shown", true, Integer.valueOf(i));
                }
                this.currentUserTurnId = str;
                this.preConnectTurnId = str;
                this.preConnectText = str2;
                zPublishUserCaptionIfCurrent = this.threadCaptionBus.publishUserCaptionIfCurrent(j, new ThreadVoiceCaption(str, str2, C3cG.A0c(this.voiceCallStateHolder), true));
            }
        }
        return zPublishUserCaptionIfCurrent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishThreadCaption(java.lang.String r7, java.lang.String r8, int r9, long r10) {
        /*
            r6 = this;
            java.lang.Object r4 = r6.threadCaptionLock
            monitor-enter(r4)
            com.facebook.aura.partners.voice.intf.VoiceCallUiState r0 = X.C3cG.A0L(r6)     // Catch: java.lang.Throwable -> La9
            long r0 = r0.callAttemptGeneration     // Catch: java.lang.Throwable -> La9
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L88
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r6.voiceCallStateHolder     // Catch: java.lang.Throwable -> La9
            boolean r0 = X.C3cH.A1P(r0)     // Catch: java.lang.Throwable -> La9
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L24
            com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE     // Catch: java.lang.Throwable -> La9
            boolean r0 = r0.isStreamingCaptionsToThreadEnabled()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L24
            r1 = 2
            if (r9 == r2) goto L3b
            if (r9 == r1) goto L46
        L24:
            if (r9 != 0) goto L31
            java.lang.String r1 = r6.currentUserTurnId     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r6.handedOffTurnId     // Catch: java.lang.Throwable -> La9
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L31
            r3 = 1
        L31:
            java.lang.String r0 = r6.currentUserTurnId     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L88
            if (r3 != 0) goto L88
            r6.clearThreadCaption(r10)     // Catch: java.lang.Throwable -> La9
            goto L88
        L3b:
            java.lang.Integer r0 = r6.previousThreadBotState     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L46
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La9
            if (r0 != r1) goto L46
            r3 = 1
        L46:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> La9
            r6.previousThreadBotState = r0     // Catch: java.lang.Throwable -> La9
            r2 = 0
            if (r3 == 0) goto L51
            r6.currentUserTurnId = r2     // Catch: java.lang.Throwable -> La9
        L51:
            int r1 = r7.length()     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L88
            java.lang.String r5 = r6.currentUserTurnId     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L8b
            java.lang.String r0 = r6.handedOffTurnId     // Catch: java.lang.Throwable -> La9
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L73
            java.lang.String r0 = r6.handedOffText     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L69
            java.lang.String r0 = ""
        L69:
            int r0 = r0.length()     // Catch: java.lang.Throwable -> La9
            if (r1 < r0) goto L88
            r6.handedOffTurnId = r2     // Catch: java.lang.Throwable -> La9
            r6.handedOffText = r2     // Catch: java.lang.Throwable -> La9
        L73:
            com.facebook.aura.threadvoicecaption.ThreadVoiceCaptionBus r3 = r6.threadCaptionBus     // Catch: java.lang.Throwable -> La9
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r6.voiceCallStateHolder     // Catch: java.lang.Throwable -> La9
            X.1BN<java.lang.String> r0 = r0.activeThreadId     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La9
            r1 = 0
            com.facebook.aura.threadvoicecaption.ThreadVoiceCaption r0 = new com.facebook.aura.threadvoicecaption.ThreadVoiceCaption     // Catch: java.lang.Throwable -> La9
            r0.<init>(r5, r7, r2, r1)     // Catch: java.lang.Throwable -> La9
            r3.publishUserCaptionIfCurrent(r10, r0)     // Catch: java.lang.Throwable -> La9
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La9
            goto La7
        L8b:
            if (r8 == 0) goto L8e
            goto L9d
        L8e:
            java.util.UUID r0 = X.AbstractC7535F0i.A00()     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> La9
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = r1.toUpperCase(r0)     // Catch: java.lang.Throwable -> La9
            goto La3
        L9d:
            boolean r0 = X.C7BY.A0j(r8)     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L8e
        La3:
            r6.currentUserTurnId = r8     // Catch: java.lang.Throwable -> La9
            r5 = r8
            goto L73
        La7:
            monitor-exit(r4)
            return r0
        La9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.publishThreadCaption(java.lang.String, java.lang.String, int, long):java.lang.Object");
    }

    private final void reassertAccessoryVideoLocked(C57m c57m) {
        EmbodimentVideoRenderer embodimentVideoRenderer;
        AccessoryVideo accessoryVideo = this.accessoryVideo;
        if (accessoryVideo == null || (embodimentVideoRenderer = accessoryVideo.renderer) == null || accessoryVideo.boundSession != c57m) {
            return;
        }
        removeAccessoryRenderTarget(c57m, embodimentVideoRenderer);
        if (addAccessoryRenderTarget(c57m, accessoryVideo, embodimentVideoRenderer)) {
            return;
        }
        accessoryVideo.boundSession = null;
    }

    private final void recordConnectedOnce() {
        if (C3cI.A1W(this.callConnectedRecorded)) {
            notifyCallStarted();
            recordCallConnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rejoinCall(String str, String str2, VoiceRestartState voiceRestartState) {
        String str3 = str2;
        if (resumableCall(str) == null) {
            CFK.A0H(SessionControllerKt.TAG, "RTC rejoin dropped callId=%s: call ended before teardown", str);
            return;
        }
        if (DeviceCallStateTracker.INSTANCE.isInCallNow()) {
            CFK.A0H(SessionControllerKt.TAG, "RTC rejoin dropped callId=%s: another call has the microphone", str);
            endCallOnFailure(str, this.currentMarkerKey, VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE, AbstractC7606F5t.A00(47), C132771.INSTANCE, false);
            return;
        }
        this.connectionTracker.onCallEnded(VoiceCallConnectionTracker.END_REASON_RTC_REJOIN, Integer.valueOf(this.currentMarkerKey), null);
        forceEndCurrentCallInternal(VoiceCallConnectionTracker.END_REASON_RTC_REJOIN, null, C132811.INSTANCE, true, false, null, true);
        CallMarkerState callMarkerStateResumableCall = resumableCall(str);
        if (callMarkerStateResumableCall == null) {
            CFK.A0H(SessionControllerKt.TAG, "RTC rejoin dropped callId=%s: call ended during teardown", str);
            this.connectionTracker.onRejoinAbandoned();
            return;
        }
        boolean z = voiceRestartState.muted;
        boolean z2 = voiceRestartState.speakerOn;
        boolean z3 = voiceRestartState.captionsEnabled;
        VoiceAudioOnlyReason voiceAudioOnlyReason = voiceRestartState.audioOnlyReason;
        if (str2 == null) {
            str3 = callMarkerStateResumableCall.callServerInfoData;
        }
        startCallInternal(z, z2, false, true, z3, voiceAudioOnlyReason, null, CallMarkerState.copy$default(callMarkerStateResumableCall, null, null, null, null, 0, 0L, 0L, 0L, false, null, null, str3, 2047, null), null, AGH.A0E());
    }

    private final HoC releaseAccessoryRendererLater(EmbodimentVideoRenderer embodimentVideoRenderer) {
        C3UX c3ux = this.teardownScope;
        return GAo.A02(C79.A00, HwK.A00, new C133021(embodimentVideoRenderer, null), c3ux);
    }

    private final void releaseCallAudioLocked() {
        VoiceCallVolume.Lease lease = this.callVolumeLease;
        if (lease != null) {
            lease.restore();
        }
        this.callVolumeLease = null;
        DeviceCallStateTracker.INSTANCE.setUsesMediaOutput(this, false);
        this.callOutputChosen = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseEmbodimentOwnership(String str) {
        String strRemove;
        if (str != null && (strRemove = this.retainedStaticAvatarPaths.remove(str)) != null) {
            this.avatarStore.releaseAvatarFile(strRemove);
        }
        this.videoConfigStore.releasePin(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r2.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void releaseEmbodimentRenderer(X.C57m r4, com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L34
            r3.detachEmbodimentRenderTarget(r4, r5)
            if (r4 == 0) goto L11
            java.util.concurrent.locks.ReentrantLock r2 = X.C3cH.A0p(r3)
            r3.reassertAccessoryVideoLocked(r4)     // Catch: java.lang.Throwable -> L2f
            r2.unlock()
        L11:
            r5.release()     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.locks.ReentrantLock r2 = X.C3cH.A0p(r3)
            com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r0 = r3.embodimentRenderers     // Catch: java.lang.Throwable -> L2f
            r0.completeRetirement(r5)     // Catch: java.lang.Throwable -> L2f
            r2.unlock()
            return
        L21:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = X.C3cH.A0p(r3)
            com.facebook.aura.partners.voice.session.impl.EmbodimentRendererRegistry r0 = r3.embodimentRenderers     // Catch: java.lang.Throwable -> L2f
            r0.completeRetirement(r5)     // Catch: java.lang.Throwable -> L2f
            r2.unlock()
            throw r1
        L2f:
            r1 = move-exception
            r2.unlock()
            throw r1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.releaseEmbodimentRenderer(X.57m, com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer):void");
    }

    private final void removeAccessoryRenderTarget(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer) {
        if (c57m != null) {
            try {
                c57m.Aav(embodimentVideoRenderer.videoSink, HatchPriceImpressionEventDataKt.NO_DISCOUNT);
            } catch (RuntimeException e) {
                CFK.A0K(SessionControllerKt.TAG, e, "Failed removing the accessory video target");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveCallServerInfoData(X.HtJ<? super java.lang.String> r9) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C133031
            if (r0 == 0) goto L21
            r7 = r9
            com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$1 r7 = (com.facebook.aura.partners.voice.session.impl.SessionController.C133031) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            java.lang.String r5 = "VoiceSessionController"
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L27
            goto L4d
        L21:
            com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$1 r7 = new com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$1
            r7.<init>(r9)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r1)
            java.util.concurrent.locks.ReentrantLock r1 = X.C3cH.A0p(r8)
            X.57m r0 = r8.currentSession     // Catch: java.lang.Throwable -> L67
            r1.unlock()
            if (r0 != 0) goto L3b
            return r3
        L3b:
            com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$callServerInfoData$1 r2 = new com.facebook.aura.partners.voice.session.impl.SessionController$resolveCallServerInfoData$callServerInfoData$1     // Catch: java.lang.Exception -> L5b
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L5b
            r7.L$0 = r3     // Catch: java.lang.Exception -> L5b
            r7.label = r4     // Catch: java.lang.Exception -> L5b
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = X.GAX.A01(r7, r2, r0)     // Catch: java.lang.Exception -> L5b
            if (r1 != r6) goto L50
            return r6
        L4d:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L5b
        L50:
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L5b
            if (r6 != 0) goto L5a
            java.lang.String r0 = "start-call: shared call id unavailable after 2000ms"
            X.CFK.A06(r5, r0)
        L5a:
            return r6
        L5b:
            r1 = move-exception
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L66
            java.lang.String r0 = "start-call: failed to resolve shared call id"
            X.CFK.A0A(r5, r0, r1)
            return r3
        L66:
            throw r1
        L67:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.resolveCallServerInfoData(X.HtJ):java.lang.Object");
    }

    private final EmbodimentVideoRenderer retireEmbodimentRendererLocked() {
        return this.embodimentRenderers.retireActive();
    }

    private final void retryAccessoryVideoBind(AccessoryVideo accessoryVideo) {
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C133041(accessoryVideo, null), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleAccessoryVideoBind() {
        AccessoryVideo accessoryVideo = this.accessoryVideo;
        if (accessoryVideo != null) {
            AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C133051(accessoryVideo, null), this.coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleCaptionClear(long j) {
        HtJ htJA13 = AnonymousClass006.A13(this.postTurnTimeoutJob);
        C3UX c3ux = this.coroutineScope;
        this.postTurnTimeoutJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133061(j, htJA13), c3ux);
    }

    private final void setCallAvatarImagePathLocked(String str) {
        this.callAvatarWithoutImageCallId.Af8(null);
        this.voiceCallStateHolder.setCallAvatarImagePath(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMutedLocked(boolean z, C57m c57m) {
        VoiceCallUiState value;
        boolean z2;
        if (this.rejoinRestoreMuted != null) {
            this.rejoinRestoreMuted = Boolean.valueOf(z);
            return;
        }
        BLG<VoiceCallUiState> blg = this._callState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, z, false, false, false, null, null, null, 0L, 0, false, null, 131007, null)));
        if (!z) {
            if (!this.micMutedForPreview) {
                z2 = true;
                if (C3cG.A0L(this).isReconnecting) {
                }
            }
            setSessionMic(c57m, z2);
        }
        dropPreConnectSpeechLocked();
        z2 = false;
        setSessionMic(c57m, z2);
    }

    private final void setSessionMic(C57m c57m, boolean z) {
        if (c57m != null) {
            HatchRealTimeSessionController hatchSessionController = getHatchSessionController();
            if (hatchSessionController != null) {
                hatchSessionController.setMicEnabled(c57m, z);
            } else {
                c57m.Adk(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUserMutedLocked(boolean z) {
        Boolean bool = this.rejoinRestoreMuted;
        boolean zA1P = AnonymousClass002.A1P(z ? 1 : 0, bool != null ? bool.booleanValue() : C3cG.A0L(this).isMuted);
        setMutedLocked(z, this.currentSession);
        String strA0X = C3cI.A0X(this);
        if (!zA1P || strA0X == null) {
            return;
        }
        this.micStatusReports.AhZ(new MicStatusReport(strA0X, z));
    }

    private final void showConnectedUiLocked(C57m c57m, String str) {
        VoiceCallUiState value;
        VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(this);
        if (voiceCallPhaseA0I == VoiceCallPhase.ACTIVE || voiceCallPhaseA0I == VoiceCallPhase.ENDED) {
            return;
        }
        BLG<VoiceCallUiState> blg = this._callState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, VoiceCallPhase.CONNECTED, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, null, 131070, null)));
        HoC hoC = this.connectedTransitionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.connectedTransitionJob = AnonymousClass001.A11(new C133092(c57m, str, null), this.coroutineScope);
    }

    private final void showLiftedCallAvatarLocked(String str, LiftedCallAvatar liftedCallAvatar, String str2) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        String str3;
        String str4;
        String strAvatarImageUrl;
        if (str2 != null) {
            Object objA0R = C3cI.A0R(this);
            VoiceEmbodimentMedia.StaticAvatar staticAvatar = null;
            if (!(objA0R instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) objA0R) == null) {
                return;
            }
            LiftedCallAvatar.Unchanged unchanged = LiftedCallAvatar.Unchanged.INSTANCE;
            if (!C7384Etj.areEqual(liftedCallAvatar, unchanged)) {
                if (liftedCallAvatar instanceof LiftedCallAvatar.CallStart) {
                    LiftedCallAvatar.CallStart callStart = (LiftedCallAvatar.CallStart) liftedCallAvatar;
                    VoiceEmbodimentMedia.LiveRtc liveRtc2 = callStart.start.media;
                    VoiceEmbodimentMedia.ReferenceFraming referenceFraming = liveRtc.liveFraming;
                    VoiceEmbodimentMedia.StaticAvatar staticAvatar2 = liveRtc2.fallbackAvatar;
                    if (staticAvatar2 == null) {
                        String str5 = callStart.previousImagePath;
                        if (str5 != null && (!this.avatarReferenceProvider.currentCallEmbodimentDark()) && (strAvatarImageUrl = HatchAiIdentityHandler.Companion.avatarImageUrl(str5, this.userSession)) != null) {
                            staticAvatar = new VoiceEmbodimentMedia.StaticAvatar(strAvatarImageUrl, SessionControllerKt.UNCROPPED_STILL_FRAMING);
                        }
                    } else {
                        staticAvatar = staticAvatar2;
                    }
                    VoiceEmbodimentMedia.LiveRtc liveRtcCopy = liveRtc2.copy(liveRtc2.idleVideoUri, liveRtc2.referenceAssetId, staticAvatar, liveRtc2.previewFraming, referenceFraming);
                    CallStartAvatar callStartAvatar = callStart.start;
                    showCallAvatarLocked(str, str2, liveRtc, liveRtcCopy, callStartAvatar.pinned, callStartAvatar.idleAvatarKey, callStartAvatar.avatarStem, null);
                } else if (liftedCallAvatar instanceof LiftedCallAvatar.Remembered) {
                    LiftedCallAvatar.Remembered remembered = (LiftedCallAvatar.Remembered) liftedCallAvatar;
                    VoiceEmbodimentMedia.LiveRtc liveRtcLiveRtcMedia = SessionControllerKt.liveRtcMedia(remembered.snapshot.avatar, liveRtc.liveFraming, this.avatarReferenceProvider.currentCallEmbodimentDark());
                    HatchVoiceVideoConfigStore.Snapshot snapshot = remembered.snapshot;
                    showCallAvatarLocked(str, str2, liveRtc, liveRtcLiveRtcMedia, snapshot, snapshot.avatarKey, snapshot.avatarStem, null);
                } else {
                    if (liftedCallAvatar instanceof LiftedCallAvatar.Cleared) {
                        str3 = ((LiftedCallAvatar.Cleared) liftedCallAvatar).avatarStem;
                        str4 = null;
                    } else {
                        if (!(liftedCallAvatar instanceof LiftedCallAvatar.PreviousImage)) {
                            throw C3cG.A0q();
                        }
                        LiftedCallAvatar.PreviousImage previousImage = (LiftedCallAvatar.PreviousImage) liftedCallAvatar;
                        str3 = previousImage.avatarStem;
                        str4 = previousImage.imagePath;
                    }
                    showPreviousAvatarStillLocked(str, str2, liveRtc, str3, str4);
                }
            }
            if ((liftedCallAvatar instanceof LiftedCallAvatar.CallStart) || C7384Etj.areEqual(liftedCallAvatar, unchanged)) {
                return;
            }
            this.previousAvatarShownCallId = str;
        }
    }

    public static /* synthetic */ void showLiftedCallAvatarLocked$default(SessionController sessionController, String str, LiftedCallAvatar liftedCallAvatar, String str2, int i, Object obj) {
        if ((i & 4) != 0 && (str2 = sessionController.currentSessionPinOwner) == null) {
            HxE<String, String> hxE = sessionController.startingPinOwner;
            str2 = null;
            if (hxE != null && C3cG.A1O(str, hxE)) {
                str2 = hxE.second;
            }
        }
        sessionController.showLiftedCallAvatarLocked(str, liftedCallAvatar, str2);
    }

    private final void showLiveAvatarUnavailableNoticeOnce(int i) {
        HxE<Integer, String> hxE = this.liveAvatarUnavailableNotice;
        if (hxE != null) {
            int iA0F = AnonymousClass001.A0F(hxE.first);
            String str = hxE.second;
            if (iA0F == i) {
                this.liveAvatarUnavailableNotice = null;
                if (VoicePrefs.INSTANCE.liveAvatarUnavailableNoticedAvatars(this.userSession).contains(str)) {
                    CFK.A05(SessionControllerKt.TAG, "live_avatar.unavailable_toast decision=suppressed why=already_noticed");
                } else {
                    CFK.A05(SessionControllerKt.TAG, "live_avatar.unavailable_toast decision=requested");
                    this.voiceCallStateHolder.notifyLiveAvatarUnavailable(str);
                }
            }
        }
    }

    private final void showLiveAvatarUpdateStatusLocked(String str, long j, int i, String str2) {
        this.voiceCallStateHolder.showLiveAvatarUpdateStatus();
        HxE<HxE<String, String>, ? extends HoC> hxE = this.liveAvatarUpdateTimeout;
        if (hxE != null) {
            HxE<String, String> hxE2 = hxE.first;
            if (((HoC) hxE.second).isActive() && Companion.keepsLiveAvatarTimer$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(hxE2, str, str2)) {
                return;
            }
        }
        HxE<HxE<String, String>, ? extends HoC> hxE3 = this.liveAvatarUpdateTimeout;
        if (hxE3 != null) {
            AnonymousClass002.A1K((HoC) hxE3.second);
        }
        CFK.A03(Long.valueOf(C3cH.A04(j)), SessionControllerKt.TAG, "live_avatar.timer.start duration_ms=%d");
        this.liveAvatarUpdateTimeout = C3cG.A0r(C3cG.A0r(str, str2), AnonymousClass001.A11(new SessionController$showLiveAvatarUpdateStatusLocked$job$1(j, this, str, i, null), this.coroutineScope));
    }

    private final boolean showNewAvatarStillLocked(String str) {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        HxE<String, String> hxE;
        String str2 = this.currentSessionPinOwner;
        if (str2 != null || ((hxE = this.startingPinOwner) != null && C3cG.A1O(str, hxE) && (str2 = hxE.second) != null)) {
            Object objA0R = C3cI.A0R(this);
            if ((objA0R instanceof VoiceEmbodimentMedia.LiveRtc) && (liveRtc = (VoiceEmbodimentMedia.LiveRtc) objA0R) != null) {
                VoiceEmbodimentMedia.LiveRtc liveRtcNewAvatarStillMediaLocked = newAvatarStillMediaLocked(str, str2, liveRtc.liveFraming);
                if (liveRtcNewAvatarStillMediaLocked.fallbackAvatar != null) {
                    HoC hoC = this.idleVideoUpdateJob;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    this.idleVideoUpdateJob = null;
                    this.voiceCallStateHolder.compareAndSetEmbodimentMedia(liveRtc, liveRtcNewAvatarStillMediaLocked);
                    if (C3cI.A0R(this) == liveRtcNewAvatarStillMediaLocked) {
                        this.newAvatarStillCallId.Af8(str);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C57m showServiceRestartReconnecting() {
        VoiceCallPhase voiceCallPhaseA0I;
        VoiceCallUiState value;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            C57m c57m = this.currentSession;
            if (c57m != null && ((voiceCallPhaseA0I = C3cI.A0I(this)) == VoiceCallPhase.CONNECTED || voiceCallPhaseA0I == VoiceCallPhase.ACTIVE)) {
                BLG<VoiceCallUiState> blg = this._callState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, false, true, false, false, null, null, null, 0L, 0, false, null, 130943, null)));
                setSessionMic(c57m, false);
                return c57m;
            }
            return null;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startCallInternal$default(SessionController sessionController, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, VoiceAudioOnlyReason voiceAudioOnlyReason, Long l, CallMarkerState callMarkerState, VoiceCallEntryPoint voiceCallEntryPoint, Map map, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 8, z4);
        if ((i & 16) != 0) {
            z5 = true;
        }
        if ((i & 32) != 0) {
            voiceAudioOnlyReason = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            callMarkerState = null;
        }
        if ((i & 256) != 0) {
            voiceCallEntryPoint = null;
        }
        if ((i & 512) != 0) {
            map = AGH.A0E();
        }
        sessionController.startCallInternal(z, z2, z3, zA1K, z5, voiceAudioOnlyReason, l, callMarkerState, voiceCallEntryPoint, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String startFailureReason(Hx3 hx3) {
        return hx3 instanceof Hok ? VoiceCallConnectionTracker.END_REASON_NO_MIC_PERMISSION : hx3 instanceof Hx4 ? C3cH.A1R(this.gateway.serviceRestartPending) ? VoiceCallConnectionTracker.END_REASON_SERVICE_RESTARTING : VoiceCallConnectionTracker.END_REASON_NO_NETWORK : hx3 instanceof Hq2 ? VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE : hx3 instanceof HpX ? VoiceCallConnectionTracker.END_REASON_SESSION_ALREADY_ACTIVE : VoiceCallConnectionTracker.END_REASON_START_FAILED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPreConnectCaption(boolean z, boolean z2) {
        PreConnectLiveCaption preConnectLiveCaption = this.preConnectCaption;
        if (preConnectLiveCaption != null) {
            preConnectLiveCaption.close(z2);
        }
        this.preConnectCaption = null;
        synchronized (this.threadCaptionLock) {
            String str = this.preConnectTurnId;
            if (str != null) {
                this.preConnectTurnId = null;
                this.preConnectText = null;
                if (z && str.equals(this.currentUserTurnId)) {
                    clearThreadCaption(C3cG.A0L(this).callAttemptGeneration);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0183, code lost:
    
        if (r28.equals(r0 != null ? r0.avatarStem : null) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean swapCallAvatarLocked(java.lang.String r26, com.facebook.aura.partners.voice.infra.HatchVideoCrop r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.swapCallAvatarLocked(java.lang.String, com.facebook.aura.partners.voice.infra.HatchVideoCrop, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static /* synthetic */ boolean swapCallAvatarLocked$default(SessionController sessionController, String str, HatchVideoCrop hatchVideoCrop, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = "completed";
        }
        return sessionController.swapCallAvatarLocked(str, hatchVideoCrop, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackReconnectConnectivity(HtJ<? super Unit> htJ) {
        return C3cG.A0U(C3rb.A04(new C133213(null), this.gateway.connectionState, C4o7.A00(C133202.INSTANCE, AuraNetworkMonitor.state)).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.trackReconnectConnectivity.4
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((HxE<Boolean, ? extends AuraNetworkState>) obj, (HtJ<? super Unit>) htJ2);
            }

            public final Object emit(HxE<Boolean, ? extends AuraNetworkState> hxE, HtJ<? super Unit> htJ2) {
                SessionController.this.connectionTracker.onConnectivity(AnonymousClass001.A1X(hxE.first), (AuraNetworkState) hxE.second);
                return Unit.INSTANCE;
            }
        }, htJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackTurnLatency(HatchChatEvent hatchChatEvent) {
        VoiceCallUiState value;
        VoiceCallUiState voiceCallUiState;
        VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(this);
        if (voiceCallPhaseA0I == VoiceCallPhase.CONNECTED || voiceCallPhaseA0I == VoiceCallPhase.ACTIVE) {
            String strA0c = C3cG.A0c(this.voiceCallStateHolder);
            if (HatchGatewayEventKt.isInConversation(hatchChatEvent, strA0c, null)) {
                if (hatchChatEvent instanceof HatchChatEvent.MessageUser) {
                    this.turnLatencyTracker.onUserTurnCommitted(((HatchChatEvent.MessageUser) hatchChatEvent).message.id, strA0c);
                    BLG<VoiceCallUiState> blg = this._callState;
                    do {
                        value = blg.getValue();
                        voiceCallUiState = value;
                    } while (!blg.A6e(value, VoiceCallUiState.copy$default(voiceCallUiState, null, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, voiceCallUiState.userTurnCount + 1, false, null, 114687, null)));
                    return;
                }
                if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
                    HatchChatEvent.MessageStart messageStart = (HatchChatEvent.MessageStart) hatchChatEvent;
                    if (messageStart.isUserLiveTranscript) {
                        return;
                    }
                    this.turnLatencyTracker.onBotResponseStarted(messageStart.messageId, messageStart.replyToMessageId);
                }
            }
        }
    }

    private final VoiceControlHandler.Result tryPerformVoiceControl(G0U<? super C57m, ? extends VoiceControlHandler.Result> g0u) throws InterruptedException {
        VoiceControlHandler.Result resultInvoke;
        int i = this.connectAttempt.get();
        this.lock.lockInterruptibly();
        try {
            if (this.controllerClosed.get()) {
                resultInvoke = VoiceControlHandler.Result.NO_ACTIVE_CALL;
            } else if (i != this.connectAttempt.get() || this.voiceRestartInProgress) {
                resultInvoke = VoiceControlHandler.Result.CALL_TRANSITIONING;
            } else {
                VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(this);
                if (voiceCallPhaseA0I == VoiceCallPhase.ENDED) {
                    resultInvoke = VoiceControlHandler.Result.NO_ACTIVE_CALL;
                } else {
                    C57m c57m = this.currentSession;
                    resultInvoke = c57m == null ? voiceCallPhaseA0I == VoiceCallPhase.CONNECTING ? VoiceControlHandler.Result.CALL_TRANSITIONING : VoiceControlHandler.Result.NO_ACTIVE_CALL : C57m.A00(c57m) ? VoiceControlHandler.Result.CALL_TRANSITIONING : g0u.invoke(c57m);
                }
            }
            return resultInvoke;
        } finally {
            this.lock.unlock();
        }
    }

    private final HoC unbindAccessoryVideoLocked(AccessoryVideo accessoryVideo) {
        HoC hoC = accessoryVideo.idleWait;
        if (hoC != null) {
            hoC.A5w(null);
        }
        accessoryVideo.idleWait = null;
        AccessoryIdleClip accessoryIdleClip = accessoryVideo.idle;
        if (accessoryIdleClip != null) {
            accessoryIdleClip.stop();
        }
        accessoryVideo.idle = null;
        AnonymousClass003.A14(this._accessoryLiveVideo, false);
        EmbodimentVideoRenderer embodimentVideoRenderer = accessoryVideo.renderer;
        if (embodimentVideoRenderer == null) {
            return null;
        }
        removeAccessoryRenderTarget(accessoryVideo.boundSession, embodimentVideoRenderer);
        accessoryVideo.renderer = null;
        accessoryVideo.boundSession = null;
        return releaseAccessoryRendererLater(embodimentVideoRenderer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBotActivity(MetaAiVoiceState metaAiVoiceState, long j) {
        VoiceCallUiState value;
        VoiceCallUiState voiceCallUiStateCopy$default;
        VoiceCallUiState voiceCallUiStateA0L = C3cG.A0L(this);
        if (voiceCallUiStateA0L.callAttemptGeneration == j) {
            VoiceCallPhase voiceCallPhase = voiceCallUiStateA0L.phase;
            if (voiceCallPhase == VoiceCallPhase.CONNECTED || voiceCallPhase == VoiceCallPhase.ACTIVE) {
                int i = metaAiVoiceState.state;
                VoiceCallActivity voiceCallActivity = i != 2 ? i != 3 ? VoiceCallActivity.IDLE : VoiceCallActivity.SPEAKING : VoiceCallActivity.THINKING;
                if (this.voiceCallStateHolder.setBotSpeakingIfCurrent(j, AnonymousClass002.A1Z(voiceCallActivity, VoiceCallActivity.SPEAKING))) {
                    BLG<VoiceCallUiState> blg = this._callState;
                    do {
                        value = blg.getValue();
                        voiceCallUiStateCopy$default = value;
                        if (voiceCallUiStateCopy$default.callAttemptGeneration == j) {
                            voiceCallUiStateCopy$default = VoiceCallUiState.copy$default(voiceCallUiStateCopy$default, null, 0L, null, null, null, null, false, false, false, false, null, null, null, 0L, 0, false, voiceCallActivity, 65535, null);
                        }
                    } while (!blg.A6e(value, voiceCallUiStateCopy$default));
                    int i2 = metaAiVoiceState.state;
                    Integer num = this.lastCaptionBotState;
                    if (num == null || i2 != num.intValue()) {
                        this.lastCaptionBotState = Integer.valueOf(metaAiVoiceState.state);
                        int i3 = metaAiVoiceState.state;
                        if (i3 == 2 || i3 == 3) {
                            AnonymousClass002.A1K(this.postTurnTimeoutJob);
                        } else {
                            if (C3cG.A0L(this).captionEntries.isEmpty()) {
                                return;
                            }
                            scheduleCaptionClear(j);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecordedSharedCallId(String str, int i) {
        if (str != null) {
            this.connectionTracker.onJoinAnswered(i);
            this.connectionTracker.annotate("shared_call_id", str, Integer.valueOf(i));
            this.voiceBugReportRepository.updateLatestCallInfo(new C133231(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void watchOrphanedSession(C57m c57m, String str, String str2) {
        if (str != null) {
            this.sessionPinOwners.put(c57m, str);
            CFK.A0H(SessionControllerKt.TAG, "video_config.pin_orphaned owner=%s reason=%s", str, str2);
            AnonymousClass001.A1J(new C133241(c57m, str, null), this.teardownScope);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.aura.partners.voice.session.impl.SessionController$voiceControlHandler$1, com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler, java.util.concurrent.locks.ReentrantLock] */
    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void close() {
        if (C3cI.A1W(this.controllerClosed)) {
            VoiceUiControlSink companion = VoiceUiControlSink.Companion.getInstance(this.userSession);
            ?? r0 = this.voiceControlHandler;
            companion.unregisterVoiceControlHandler(r0);
            try {
                try {
                    ReentrantLock reentrantLock = this.callLifecycleLock;
                    reentrantLock.lock();
                    try {
                        forceTeardown();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    r0.unlock();
                    throw th;
                }
            } finally {
                ReentrantLock reentrantLockA0p = C3cH.A0p(this);
                endCallAvatarStateLocked("controller_closed");
                reentrantLockA0p.unlock();
                Hxb.A03(null, this.markerScope);
                this.onClose.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object detachAccessoryVideoSurface(android.view.Surface r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.SessionController.C132711
            if (r0 == 0) goto L5b
            r6 = r9
            com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$1 r6 = (com.facebook.aura.partners.voice.session.impl.SessionController.C132711) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L61
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L29
            java.lang.String r1 = "VoiceSessionController"
            java.lang.String r0 = "The accessory video renderer did not release in time"
            X.CFK.A06(r1, r0)
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2c:
            X.Hwg.A00(r1)
            java.util.concurrent.locks.ReentrantLock r3 = X.C3cH.A0p(r7)
            com.facebook.aura.partners.voice.session.impl.SessionController$AccessoryVideo r2 = r7.accessoryVideo     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L66
            android.view.Surface r0 = r2.surface     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r0 != r8) goto L66
            r7.accessoryVideo = r1     // Catch: java.lang.Throwable -> L6c
            X.HoC r0 = r7.unbindAccessoryVideoLocked(r2)     // Catch: java.lang.Throwable -> L6c
            r3.unlock()
            if (r0 == 0) goto L29
            com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$2 r2 = new com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$2
            r2.<init>(r0, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.GAX.A01(r6, r2, r0)
            if (r1 != r5) goto L20
            return r5
        L5b:
            com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$1 r6 = new com.facebook.aura.partners.voice.session.impl.SessionController$detachAccessoryVideoSurface$1
            r6.<init>(r9)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L66:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            r3.unlock()
            return r0
        L6c:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.detachAccessoryVideoSurface(android.view.Surface, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C1BN<Boolean> getAccessoryLiveVideo() {
        return this.accessoryLiveVideo;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C22I<Unit> getCallEnded() {
        return this.callEnded;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C1BN<VoiceCallUiState> getCallState() {
        return this.callState;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C1BN<Boolean> getEmbodimentReady() {
        return this.embodimentReady;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C1BN<Integer> getEmbodimentReadyGeneration() {
        return this.embodimentReadyGeneration;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public boolean getHasAccessory() {
        return AnonymousClass002.A1X(this.accessory);
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public C1BN<Float> getUserSpeechLevel() {
        return this.userSpeechLevel;
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public Object pushAccessoryAudio(long j, short[] sArr, int i, HtJ<? super Boolean> htJ) {
        HatchRealTimeSessionController hatchSessionController;
        boolean z = false;
        if (this.accessory != null && ownsCallGeneration(j) && (hatchSessionController = getHatchSessionController()) != null && hatchSessionController.pushAccessoryAudio(sArr, i)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void registerVoiceControlHandler$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl() {
        VoiceUiControlSink.Companion.getInstance(this.userSession).registerVoiceControlHandler(this.voiceControlHandler);
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void startCall(VoiceAudioOnlyReason voiceAudioOnlyReason, Boolean bool, VoiceCallEntryPoint voiceCallEntryPoint, Map<String, String> map, VoiceCallAccessory voiceCallAccessory) {
        C7384Etj.A0Y(map, 3);
        if (ConfidentialSessionGate.Companion.getInstance(this.userSession).getShouldHideUnsupportedCvmFeatures() || ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            return;
        }
        if (!this.callLifecycleLock.tryLock()) {
            CFK.A06(SessionControllerKt.TAG, AnonymousClass007.A0a("startCall skipped: call lifecycle transition in progress; phase=", C3cI.A0I(this)));
            return;
        }
        try {
            if (!this.controllerClosed.get()) {
                long jNow = AwakeTimeSinceBootClock.INSTANCE.now();
                VoiceCallPhase voiceCallPhaseA0I = C3cI.A0I(this);
                if (voiceCallPhaseA0I != VoiceCallPhase.ENDED) {
                    CFK.A06(SessionControllerKt.TAG, AnonymousClass001.A0v(" forcing teardown", C3cG.A0f(voiceCallPhaseA0I, "startCall self-heal: phase=")));
                    forceTeardown();
                }
                if (!this.controllerClosed.get()) {
                    this.accessory = voiceCallAccessory;
                    HatchRealTimeSessionController hatchSessionController = getHatchSessionController();
                    if (hatchSessionController != null) {
                        hatchSessionController.accessory = voiceCallAccessory;
                    }
                    startCallInternal(false, true, true, false, bool != null ? bool.booleanValue() : VoicePrefs.INSTANCE.getCaptionsEnabled(this.userSession), voiceAudioOnlyReason, Long.valueOf(jNow), null, voiceCallEntryPoint, map);
                }
            }
        } finally {
            this.callLifecycleLock.unlock();
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void toggleCaptions() {
        VoiceCallUiState value;
        AHI ahi;
        VoiceCallUiState value2;
        boolean z = C3cG.A0L(this).isCaptionsEnabled;
        this._callState.getValue();
        VoicePrefs.INSTANCE.setCaptionsEnabled(this.userSession, !z);
        if (!z) {
            BLG<VoiceCallUiState> blg = this._callState;
            do {
                value2 = blg.getValue();
            } while (!blg.A6e(value2, VoiceCallUiState.copy$default(value2, null, 0L, null, null, null, null, false, false, false, true, null, null, null, 0L, 0, false, null, 130559, null)));
        } else {
            this.lastBotText = "";
            this.lastUserText = "";
            BLG<VoiceCallUiState> blg2 = this._callState;
            do {
                value = blg2.getValue();
                ahi = AHI.A01;
            } while (!blg2.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, false, false, false, false, ahi, ahi, null, 0L, 0, false, null, 90623, null)));
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void toggleSpeaker() {
        VoiceCallUiState value;
        boolean z = !C3cG.A0L(this).isSpeakerOn;
        BLG<VoiceCallUiState> blg = this._callState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, VoiceCallUiState.copy$default(value, null, 0L, null, null, null, null, false, false, z, false, null, null, null, 0L, 0, false, null, 130815, null)));
        applyBotAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean adoptPreparedAvatarLocked(java.lang.String r8, java.lang.String r9, com.facebook.aura.partners.voice.infra.HatchVideoCrop r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.adoptPreparedAvatarLocked(java.lang.String, java.lang.String, com.facebook.aura.partners.voice.infra.HatchVideoCrop, java.lang.String):boolean");
    }

    private final void applyBotAudio() {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            C57m c57m = this.currentSession;
            if (c57m != null) {
                c57m.Acv(C3cG.A0L(this).isSpeakerOn);
            }
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitEmbodimentRendererRelease(C57m c57m, EmbodimentVideoRenderer embodimentVideoRenderer, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y().plus(HwK.A00), new C132482(c57m, embodimentVideoRenderer, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean claimConnectOutcome(String str, long j, int i) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            boolean z = false;
            if (this.connectAttempt.get() == i && C3cJ.A0z(this, str) && this.joinContext.isCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str, j) && C3cI.A0I(this) != VoiceCallPhase.ENDED && this.connectOutcomeSettled.compareAndSet(false, true)) {
                z = true;
                HoC hoC = this.connectWatchdogJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
            }
            return z;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean claimWeakNetworkNotice(String str, boolean z, boolean z2) {
        int i;
        int i2;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            WeakNetworkNotices weakNetworkNotices = this.weakNetworkNotices;
            if (!C7384Etj.areEqual(weakNetworkNotices.callId, str)) {
                weakNetworkNotices = null;
            }
            boolean z3 = false;
            if (weakNetworkNotices == null) {
                weakNetworkNotices = new WeakNetworkNotices(str, 0, false);
            }
            if (!z || !z2 || weakNetworkNotices.inEpisode || (i2 = weakNetworkNotices.shown) >= 2) {
                i = weakNetworkNotices.shown;
            } else {
                z3 = true;
                i = i2 + 1;
            }
            this.weakNetworkNotices = new WeakNetworkNotices(str, i, z);
            return z3;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    private final void dropPreConnectSpeechLocked() {
        HatchRealTimeSessionController hatchSessionController;
        HatchRealTimeSessionController hatchSessionController2 = getHatchSessionController();
        if (hatchSessionController2 != null) {
            hatchSessionController2.armPreConnectSpeech(null);
        }
        this.preConnectSpeechEligible = false;
        stopPreConnectCaption(true, true);
        String strA0X = C3cI.A0X(this);
        if (strA0X == null || (hatchSessionController = getHatchSessionController()) == null) {
            return;
        }
        hatchSessionController.dropPreConnectSpeech(strA0X);
    }

    private final boolean embodiesCommittedAvatar(HatchVoiceVideoConfigStore.Snapshot snapshot) {
        HatchAiIdentityHandler.AvatarImageKey avatarImageKey;
        Object objA0R = C3cI.A0R(this);
        VoiceEmbodimentMedia.LiveRtc liveRtc = objA0R instanceof VoiceEmbodimentMedia.LiveRtc ? (VoiceEmbodimentMedia.LiveRtc) objA0R : null;
        return (snapshot == null || (avatarImageKey = snapshot.avatarKey) == null || !avatarImageKey.equals(this.gateway.getCommittedAvatarImageKey()) || liveRtc == null || liveRtc.idleVideoUri == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void endCallOnFailure(String str, int i, String str2, String str3, Function0<Unit> function0, boolean z) {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        C10543Hqv c10543HqvA0z2 = C3cG.A0z();
        CallMarkerState value = this.callMarker.getValue();
        if (!C7384Etj.areEqual(value.callId, str)) {
            value = null;
        }
        CallEndOwnership callEndOwnershipEndCallInternal = endCallInternal(str, str2, new SessionController$endCallOnFailure$ownership$1(z, c10543HqvA0z2, this, str2, c10543HqvA0z, value, i, str3), false, false, false, null, false, str3);
        sendUndeliveredSpeech((CapturedUndeliveredSpeech) c10543HqvA0z.element, new C132782(callEndOwnershipEndCallInternal, this, function0, c10543HqvA0z2, str2));
        if (callEndOwnershipEndCallInternal != null && isStillCurrentGeneration(callEndOwnershipEndCallInternal.generation) && callEndOwnershipEndCallInternal.wasActive) {
            recordCallEnded();
            C3cG.A1I(this._callEnded);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void endCallOnFailure$default(SessionController sessionController, String str, int i, String str2, String str3, Function0 function0, boolean z, int i2, Object obj) {
        String strA0u = AnonymousClass006.A0u(i2, str3);
        if ((i2 & 16) != 0) {
            function0 = C132771.INSTANCE;
        }
        if ((i2 & 32) != 0) {
            z = true;
        }
        sessionController.endCallOnFailure(str, i, str2, strA0u, function0, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentCallLocked(C57m c57m, String str) {
        return C3cJ.A0z(this, str) && this.currentSession == c57m;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isEmbodimentGenerationCurrent(X.C57m r4, int r5) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r2 = X.C3cH.A0p(r3)
            X.57m r0 = r3.currentSession     // Catch: java.lang.Throwable -> L16
            if (r0 != r4) goto L11
            com.facebook.aura.partners.voice.session.impl.SessionController$PendingEmbodimentSurface r0 = r3.pendingEmbodimentSurface     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            int r1 = r0.generation     // Catch: java.lang.Throwable -> L16
            r0 = 1
            if (r1 == r5) goto L12
        L11:
            r0 = 0
        L12:
            r2.unlock()
            return r0
        L16:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.isEmbodimentGenerationCurrent(X.57m, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean markEmbodimentReadyIfCurrent(C57m c57m, PendingEmbodimentSurface pendingEmbodimentSurface) {
        boolean z;
        PendingEmbodimentSurface pendingEmbodimentSurface2;
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            if (this.currentSession != c57m || (pendingEmbodimentSurface2 = this.pendingEmbodimentSurface) == null || pendingEmbodimentSurface2.generation != pendingEmbodimentSurface.generation || this.embodimentRenderers.activeFor(pendingEmbodimentSurface.surface) == null) {
                z = false;
            } else {
                z = true;
                AnonymousClass001.A1E(this._embodimentReadyGeneration, C3cJ.A0C(this._embodimentReady, true), Integer.valueOf(pendingEmbodimentSurface.generation));
            }
            return z;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean markServerConnected(C57m c57m) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            String strA0X = C3cI.A0X(this);
            boolean z = false;
            if (strA0X != null && isCurrentCallLocked(c57m, strA0X) && C3cI.A0I(this) != VoiceCallPhase.ENDED) {
                boolean zCompareAndSet = this.connectOutcomeSettled.compareAndSet(false, true);
                AtomicBoolean atomicBoolean = this.serverConnectedMarked;
                if (zCompareAndSet) {
                    atomicBoolean.set(true);
                    HoC hoC = this.connectWatchdogJob;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    handOffPreConnectCaption();
                    HatchRealTimeSessionController hatchSessionController = getHatchSessionController();
                    if (hatchSessionController != null) {
                        hatchSessionController.dropPreConnectSpeech(strA0X);
                    }
                    ConnectFunnel.CProxy.markPoint(((MetaAiRsysSdkRealTimeSession) c57m).A0G, 25, null);
                    recordConnectedOnce();
                } else if (!atomicBoolean.get()) {
                }
                showConnectedUiLocked(c57m, strA0X);
                z = true;
            }
            return z;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    private final long millisSinceCallStart() {
        return SystemClock.elapsedRealtime() - this.voiceCallStateHolder.callStartElapsedRealtimeMs;
    }

    private final void notifyCallStarted() {
        CallMarkerState value;
        CallMarkerState callMarkerState;
        long jCurrentTimeMillis = System.currentTimeMillis();
        BLG<CallMarkerState> blg = this.callMarker;
        do {
            value = blg.getValue();
            callMarkerState = value;
        } while (!blg.A6e(value, (callMarkerState.callId == null || callMarkerState.startedAtMillis != 0) ? callMarkerState : CallMarkerState.copy$default(callMarkerState, null, null, null, null, 0, 0L, 0L, jCurrentTimeMillis, false, null, null, null, 3967, null)));
        String str = callMarkerState.callId;
        if (str == null || callMarkerState.startedAtMillis != 0) {
            return;
        }
        AnonymousClass001.A1I(HwK.A00, new C132911(str, callMarkerState, null), this.markerScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeWeakConnection(final C57m c57m, final String str, final long j, HtJ<? super Unit> htJ) {
        return C3cG.A0U(new SessionController$observeWeakConnection$$inlined$mapNotNull$1(new C10650I0u(new C132962(c57m, null), ((MetaAiRsysSdkRealTimeSession) c57m).A0C.A0B, 4), new EmbodimentLinkQualityGate(Integer.MAX_VALUE)).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.observeWeakConnection.4
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit(AnonymousClass001.A1X(obj), (HtJ<? super Unit>) htJ2);
            }

            public final Object emit(boolean z, HtJ<? super Unit> htJ2) {
                SessionController sessionController = SessionController.this;
                ReentrantLock reentrantLock = sessionController.lock;
                C57m c57m2 = c57m;
                reentrantLock.lock();
                try {
                    if (!AnonymousClass006.A1Z(sessionController.currentSession, c57m2) && SessionController.this.voiceCallStateHolder.setConnectionWeakIfCurrent(j, z) && SessionController.this.claimWeakNetworkNotice(str, z, true)) {
                        SessionController.this.voiceCallStateHolder.notifyWeakConnection();
                    }
                    return Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, htJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAccessoryIdleFailed(AccessoryVideo accessoryVideo, AccessoryIdleClip accessoryIdleClip, boolean z) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            if (this.accessoryVideo == accessoryVideo && accessoryVideo.idle == accessoryIdleClip) {
                accessoryVideo.idle = null;
                accessoryVideo.idleFocusY = null;
                if (z) {
                    accessoryVideo.lastIdleFailed = true;
                }
                if (z) {
                    AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C132981(accessoryVideo, null), this.coroutineScope);
                }
            }
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long preConnectFailureTimeLocked(String str) {
        Long lA0O = C3cI.A0O();
        if (this.userPlacedAttempt && !this.serverConnectedMarked.get() && SessionControllerKt.END_REASONS_WITH_FAILURE_TOAST.contains(str)) {
            return lA0O;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishRoutableCall(String str) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            CallMarkerState callMarkerStateA0J = C3cI.A0J(this);
            if (C7384Etj.areEqual(callMarkerStateA0J.callId, str)) {
                this.voiceCallStateHolder.setActiveAppAudioCall(str, callMarkerStateA0J.threadId);
            }
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    private final void recordCallConnected() {
        C1BN<String> c1bn;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            C57m c57m = this.currentSession;
            this.voiceBugReportRepository.updateLatestCallInfo(new C133001((c57m == null || (c1bn = ((MetaAiRsysSdkRealTimeSession) c57m).A0d) == null) ? null : c1bn.getValue(), jCurrentTimeMillis));
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    private final void recordCallEnded() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        F1F f1f = new F1F();
        this.voiceBugReportRepository.updateLatestCallInfo(new C133011(f1f, jCurrentTimeMillis));
        if (f1f.element) {
            VoiceCatalogRepository.Companion.invalidateCatalog(this.userSession);
        }
    }

    private final void releaseAccessory() {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            HatchRealTimeSessionController hatchSessionController = getHatchSessionController();
            if (hatchSessionController != null) {
                hatchSessionController.accessory = null;
                hatchSessionController.releaseAccessoryAudio();
            }
            this.accessory = null;
            AccessoryVideo accessoryVideo = this.accessoryVideo;
            if (accessoryVideo != null) {
                unbindAccessoryVideoLocked(accessoryVideo);
            }
            this.accessoryVideo = null;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreLightCallMediaLocked() {
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        HatchVoiceVideoConfigStore.Snapshot snapshot;
        PreparedHatchAvatar preparedHatchAvatar;
        Object objA0R = C3cI.A0R(this);
        HatchReadyCallIdle hatchReadyCallIdle = null;
        if (!(objA0R instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) objA0R) == null || (snapshot = this.videoConfigStore.snapshot()) == null || (preparedHatchAvatar = snapshot.avatar) == null) {
            return;
        }
        VoiceEmbodimentMedia.LiveRtc liveRtcLiveRtcMedia = SessionControllerKt.liveRtcMedia(preparedHatchAvatar, liveRtc.liveFraming, false);
        HatchReadyCallIdle value = this.avatarReferenceProvider.readyCallIdle.getValue();
        if (value != null && !value.video.dark) {
            hatchReadyCallIdle = value;
        }
        VoiceEmbodimentMedia.LiveRtc liveRtcWithJarvisIdle = SessionControllerKt.withJarvisIdle(liveRtcLiveRtcMedia, hatchReadyCallIdle);
        CFK.A05(SessionControllerKt.TAG, "call_idle.restore_light reason=admitted_light");
        this.voiceCallStateHolder.compareAndSetEmbodimentMedia(liveRtc, liveRtcWithJarvisIdle);
    }

    private final CallMarkerState resumableCall(String str) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            CallMarkerState value = this.callMarker.getValue();
            CallMarkerState callMarkerState = value;
            if (this.controllerClosed.get() || !C7384Etj.areEqual(callMarkerState.callId, str) || C3cI.A0I(this) == VoiceCallPhase.ENDED) {
                value = null;
            }
            return value;
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPreConnectCaption(String str, long j, int i) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            startPreConnectCaptionLocked(str, j, i);
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CapturedUndeliveredSpeech takeUndeliveredSpeechLocked(CallMarkerState callMarkerState, String str, int i) {
        String str2;
        String str3;
        HatchRealTimeSessionController hatchSessionController = getHatchSessionController();
        if (hatchSessionController == null || (str2 = callMarkerState.callId) == null) {
            return null;
        }
        if (this.serverConnectedMarked.get()) {
            stopPreConnectCaption(false, true);
            hatchSessionController.dropPreConnectSpeech(str2);
            return null;
        }
        if (!this.preConnectSpeechEligible) {
            stopPreConnectCaption(false, true);
            hatchSessionController.dropPreConnectSpeech(str2);
            this.connectionTracker.annotate("undelivered_speech_ms", 0, Integer.valueOf(i));
            return null;
        }
        PreConnectLiveCaption preConnectLiveCaption = this.preConnectCaption;
        if (preConnectLiveCaption != null) {
            preConnectLiveCaption.flush();
        } else {
            preConnectLiveCaption = null;
        }
        this.preConnectCaption = null;
        synchronized (this.threadCaptionLock) {
            str3 = this.preConnectTurnId;
        }
        CapturedSpeech capturedSpeechTakePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl = hatchSessionController.takePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str2);
        this.connectionTracker.annotate("undelivered_speech_ms", capturedSpeechTakePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl != null ? capturedSpeechTakePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl.voicedMs : 0, Integer.valueOf(i));
        if (capturedSpeechTakePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl != null) {
            VoiceCallStateHolder.PendingThread undeliveredSpeechPending = this.voiceCallStateHolder.setUndeliveredSpeechPending(callMarkerState.threadId);
            stopPreConnectCaption(false, true);
            return new CapturedUndeliveredSpeech(undeliveredSpeechPending, C3cG.A0L(this).callAttemptGeneration, callMarkerState.threadId, str3, str2, str, capturedSpeechTakePreConnectSpeech$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl, preConnectLiveCaption);
        }
        if (preConnectLiveCaption != null) {
            preConnectLiveCaption.close(true);
        }
        stopPreConnectCaption(false, true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timeOutLiveAvatarUpdateLocked(String str, int i) {
        if (C3cJ.A0z(this, str) && C3cH.A1R(this.voiceCallStateHolder.isLiveAvatarUpdating)) {
            CFK.A05(SessionControllerKt.TAG, "live_avatar.timer.expired");
            this.connectionTracker.annotate(SessionControllerKt.LIVE_AVATAR_UPDATE_STATUS, "timeout", Integer.valueOf(i));
            liftNewAvatarStillLocked(str);
            CallStartWait callStartWait = this.callStartWait;
            if (!C7384Etj.areEqual(callStartWait != null ? callStartWait.callId : null, str)) {
                this.voiceCallStateHolder.hideLiveAvatarUpdateStatus();
                return;
            }
            this.callStartWait = null;
            this.timerClosedWaitCallId = str;
            this.voiceCallStateHolder.closeLiveAvatarUpdateStatus(VoiceLiveAvatarUpdateStatus.COULD_NOT_UPDATE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackEmbodimentVisibility(HtJ<? super Unit> htJ) {
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        VoiceCallStateHolder voiceCallStateHolder = this.voiceCallStateHolder;
        C1BN<VoiceEmbodimentPlacement> c1bn = voiceCallStateHolder.embodimentInAppPlacement;
        C1BN<Boolean> c1bn2 = voiceCallStateHolder.isEmbodimentDisplayEnabled;
        C20Q<Boolean> c20qObserveLiveAvatarEnabled = VoicePrefs.INSTANCE.observeLiveAvatarEnabled(this.userSession, true);
        VoiceCallStateHolder voiceCallStateHolder2 = this.voiceCallStateHolder;
        AnonymousClass603 anonymousClass603 = new AnonymousClass603(3, new C133162(null), new C20Q[]{c1bn, c1bn2, c20qObserveLiveAvatarEnabled, voiceCallStateHolder2.embodimentAvailable, voiceCallStateHolder2.avatarEmbodimentCompatible});
        C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundImmediateFlow;
        C1BN<HatchSystemPipPresentationState> c1bn3 = HatchSystemPipRuntime.presentationState;
        VoiceCallStateHolder voiceCallStateHolder3 = this.voiceCallStateHolder;
        return C3cG.A0U(C4o7.A00(new C3bP(250L, 1), GDB.A01(new AnonymousClass603(3, new C133184(null), new C20Q[]{anonymousClass603, c20q, c1bn3, voiceCallStateHolder3.isReconnecting, C3rb.A00(new C133173(null), voiceCallStateHolder3.embodimentPaintedMedia, voiceCallStateHolder3.embodimentMediaRevealed, voiceCallStateHolder3.embodimentTakeoverIdleMedia)}))).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.trackEmbodimentVisibility.5
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((VoiceEmbodimentInputs) obj, (HtJ<? super Unit>) htJ2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(VoiceEmbodimentInputs voiceEmbodimentInputs, HtJ<? super Unit> htJ2) {
                VoiceEmbodimentStateReason voiceEmbodimentStateReasonReasonSince = VoiceEmbodimentVisibilityTrackerKt.reasonSince(voiceEmbodimentInputs, c10543HqvA0z.element, new SessionController$trackEmbodimentVisibility$5$reason$1(this));
                c10543HqvA0z.element = voiceEmbodimentInputs;
                this.connectionTracker.onEmbodimentState(VoiceEmbodimentVisibilityTrackerKt.placement(voiceEmbodimentInputs), voiceEmbodimentInputs.media, voiceEmbodimentStateReasonReasonSince);
                return Unit.INSTANCE;
            }
        }, htJ));
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void endCall(long j) {
        endCall(true, VoiceCallConnectionTracker.END_REASON_USER_HANGUP, null, null, C132731.INSTANCE, Long.valueOf(j));
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void endCallForOtherCall(long j) {
        endCall(false, VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE, null, null, C132731.INSTANCE, Long.valueOf(j));
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void setMuted(long j, boolean z) {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            if (ownsCallGeneration(j)) {
                setUserMutedLocked(z);
            }
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void toggleMute() {
        ReentrantLock reentrantLockA0p = C3cH.A0p(this);
        try {
            setUserMutedLocked(!C3cG.A0L(this).isMuted);
        } finally {
            reentrantLockA0p.unlock();
        }
    }

    public static final /* synthetic */ VoiceControlHandler.Result access$logCallAvatarUpdateReceived(SessionController sessionController, String str, CallAvatarUpdate callAvatarUpdate, boolean z, VoiceControlHandler.Result result) {
        sessionController.logCallAvatarUpdateReceived(str, callAvatarUpdate, z, result);
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0511, code lost:
    
        if (r12 == r23) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x057b, code lost:
    
        if (r5 == null) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0654 A[PHI: r3
  0x0654: PHI (r3v72 com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason) = 
  (r3v71 com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason)
  (r3v96 com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason)
 binds: [B:221:0x064a, B:224:0x0652] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0689 A[PHI: r8
  0x0689: PHI (r8v17 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia) = 
  (r8v13 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia)
  (r8v18 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia)
 binds: [B:242:0x0687, B:237:0x0677] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06ff A[PHI: r8
  0x06ff: PHI (r8v15 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia) = 
  (r8v13 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia)
  (r8v17 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia)
 binds: [B:242:0x0687, B:244:0x068b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0703 A[PHI: r18
  0x0703: PHI (r18v3 int) = (r18v2 int), (r18v5 int), (r18v5 int), (r18v5 int) binds: [B:227:0x0658, B:229:0x065c, B:231:0x0664, B:233:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0209 A[Catch: all -> 0x0a06, TRY_LEAVE, TryCatch #0 {all -> 0x0a06, blocks: (B:29:0x0203, B:31:0x0209, B:33:0x020f, B:36:0x021c, B:39:0x0227, B:40:0x022c, B:42:0x023b, B:45:0x0241, B:50:0x0252, B:51:0x0272, B:53:0x0278, B:55:0x027e, B:57:0x0282, B:58:0x0286, B:60:0x029f, B:61:0x02a2, B:64:0x02a8, B:67:0x02b6, B:69:0x02ba, B:76:0x02cc, B:78:0x02d5, B:80:0x02d9, B:83:0x02df, B:85:0x02e7, B:88:0x02ec, B:91:0x02f3, B:93:0x02fb, B:95:0x0302, B:97:0x0306, B:103:0x0312, B:106:0x0319, B:111:0x0321, B:113:0x0329, B:118:0x0331, B:120:0x0341, B:121:0x0343, B:128:0x0352, B:129:0x0356, B:130:0x0363, B:132:0x0367, B:133:0x036c, B:136:0x0374, B:138:0x037b, B:140:0x0383, B:142:0x0391, B:143:0x0393, B:145:0x03aa, B:146:0x03ad, B:82:0x02dd, B:75:0x02c5), top: B:361:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a39 A[Catch: all -> 0x0a7f, TryCatch #2 {all -> 0x0a7f, blocks: (B:333:0x0a21, B:335:0x0a2a, B:337:0x0a2f, B:338:0x0a31, B:340:0x0a39, B:343:0x0a45, B:349:0x0a4f, B:332:0x0a1d), top: B:365:0x0a1d }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0250 A[PHI: r9
  0x0250: PHI (r9v39 java.lang.Boolean) = (r9v37 java.lang.Boolean), (r9v40 java.lang.Boolean) binds: [B:48:0x024e, B:46:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c2 A[PHI: r13
  0x02c2: PHI (r13v25 boolean) = (r13v24 boolean), (r13v24 boolean), (r13v24 boolean), (r13v28 boolean) binds: [B:68:0x02b8, B:70:0x02bd, B:71:0x02bf, B:84:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5 A[Catch: all -> 0x0a06, TryCatch #0 {all -> 0x0a06, blocks: (B:29:0x0203, B:31:0x0209, B:33:0x020f, B:36:0x021c, B:39:0x0227, B:40:0x022c, B:42:0x023b, B:45:0x0241, B:50:0x0252, B:51:0x0272, B:53:0x0278, B:55:0x027e, B:57:0x0282, B:58:0x0286, B:60:0x029f, B:61:0x02a2, B:64:0x02a8, B:67:0x02b6, B:69:0x02ba, B:76:0x02cc, B:78:0x02d5, B:80:0x02d9, B:83:0x02df, B:85:0x02e7, B:88:0x02ec, B:91:0x02f3, B:93:0x02fb, B:95:0x0302, B:97:0x0306, B:103:0x0312, B:106:0x0319, B:111:0x0321, B:113:0x0329, B:118:0x0331, B:120:0x0341, B:121:0x0343, B:128:0x0352, B:129:0x0356, B:130:0x0363, B:132:0x0367, B:133:0x036c, B:136:0x0374, B:138:0x037b, B:140:0x0383, B:142:0x0391, B:143:0x0393, B:145:0x03aa, B:146:0x03ad, B:82:0x02dd, B:75:0x02c5), top: B:361:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0302 A[Catch: all -> 0x0a06, TryCatch #0 {all -> 0x0a06, blocks: (B:29:0x0203, B:31:0x0209, B:33:0x020f, B:36:0x021c, B:39:0x0227, B:40:0x022c, B:42:0x023b, B:45:0x0241, B:50:0x0252, B:51:0x0272, B:53:0x0278, B:55:0x027e, B:57:0x0282, B:58:0x0286, B:60:0x029f, B:61:0x02a2, B:64:0x02a8, B:67:0x02b6, B:69:0x02ba, B:76:0x02cc, B:78:0x02d5, B:80:0x02d9, B:83:0x02df, B:85:0x02e7, B:88:0x02ec, B:91:0x02f3, B:93:0x02fb, B:95:0x0302, B:97:0x0306, B:103:0x0312, B:106:0x0319, B:111:0x0321, B:113:0x0329, B:118:0x0331, B:120:0x0341, B:121:0x0343, B:128:0x0352, B:129:0x0356, B:130:0x0363, B:132:0x0367, B:133:0x036c, B:136:0x0374, B:138:0x037b, B:140:0x0383, B:142:0x0391, B:143:0x0393, B:145:0x03aa, B:146:0x03ad, B:82:0x02dd, B:75:0x02c5), top: B:361:0x0203 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startRpSession(java.lang.String r67, int r68, boolean r69, java.lang.Long r70, com.facebook.aura.partners.voice.session.impl.SessionController.CallMarkerState r71, com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint r72, X.HtJ<? super X.Hx3> r73) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController.startRpSession(java.lang.String, int, boolean, java.lang.Long, com.facebook.aura.partners.voice.session.impl.SessionController$CallMarkerState, com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint, X.HtJ):java.lang.Object");
    }

    public /* synthetic */ SessionController(Context context, C3UX c3ux, Hr6 hr6, HatchIdentityProvider hatchIdentityProvider, AbstractC3358CGz abstractC3358CGz, String str, String str2, HatchCallJoinContext hatchCallJoinContext, Function0 function0, G0U g0u, int i, C06H c06h) {
        this(context, c3ux, hr6, hatchIdentityProvider, abstractC3358CGz, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, hatchCallJoinContext, (i & 256) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 512) != 0 ? AnonymousClass2.INSTANCE : g0u);
    }

    private final void endCall(boolean z, String str, String str2, String str3, Function0<Unit> function0, Long l) {
        CallEndOwnership callEndOwnershipEndCallInternal;
        SessionController$endCall$onEndAccepted$1 sessionController$endCall$onEndAccepted$1 = new SessionController$endCall$onEndAccepted$1(this, str, this.currentMarkerKey, str2, function0);
        if (str3 == null) {
            callEndOwnershipEndCallInternal = forceEndCurrentCallInternal(str, str2, sessionController$endCall$onEndAccepted$1, false, z, l, false);
        } else {
            callEndOwnershipEndCallInternal = endCallInternal(str3, str, sessionController$endCall$onEndAccepted$1, false, false, z, null, false, str2);
        }
        if (callEndOwnershipEndCallInternal != null && callEndOwnershipEndCallInternal.wasActive && isStillCurrentGeneration(callEndOwnershipEndCallInternal.generation)) {
            recordCallEnded();
        }
    }

    @Override // com.facebook.aura.partners.voice.api.VoiceCallManager
    public void endCall() {
        endCall(true, VoiceCallConnectionTracker.END_REASON_USER_HANGUP, null, null, C132731.INSTANCE, null);
    }
}
