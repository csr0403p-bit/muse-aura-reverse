package com.facebook.aura.partners.voice.intf;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.Bs8;
import X.C06H;
import X.C10649I0t;
import X.C1BN;
import X.C20Q;
import X.C22I;
import X.C3Ej;
import X.C3Ek;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C3pS;
import X.C3pd;
import X.C3rb;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C8eO;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2l;
import X.GAt;
import X.GDB;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.microphone.api.MicrophoneClaim;
import com.facebook.aura.microphone.api.MicrophonePriority;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallStateHolder implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final AtomicReference<VoiceCallStateHolder> activeInstanceRef = new AtomicReference<>(null);
    public final BLG<ActiveAppAudioCall> _activeAppAudioCall;
    public final BLG<String> _activeThreadId;
    public final BLG<VoiceAgentActivity> _agentActivity;
    public final BLG<Boolean> _areEmbodimentMediaResourcesActive;
    public final BLG<Boolean> _avatarEmbodimentCompatible;
    public final BLG<VoiceBotAudioActivityState> _botAudioActivityState;
    public final BLG<Float> _botAudioLevel;
    public final BLG<VoiceBotOutputActivityState> _botOutputActivityState;
    public final BLG<Long> _callAttemptGeneration;
    public final BLG<Boolean> _callAvatarEmbodimentCompatible;
    public final BLG<String> _callAvatarImagePath;
    public final BLG<Long> _callGeneration;
    public final C3Em<Unit> _callIdlePosterShownEvents;
    public final C3Em<Unit> _callIdleShownEvents;
    public final C3Em<Unit> _callMovedEvents;
    public final C3Em<Long> _callStartHapticEvents;
    public final C3Em<Long> _callStarted;
    public final BLG<C1BN<VoiceCallUiState>> _callStateSource;
    public final BLG<AvatarStatusVideos> _callStatusVideos;
    public final C3Em<Unit> _capacityUnavailableEvents;
    public final C3Em<Unit> _connectTimeoutEvents;
    public final BLG<VoiceEmbodimentCallState> _embodimentCallState;
    public final BLG<VoiceEmbodimentPlacement> _embodimentInAppPlacement;
    public final BLG<Boolean> _embodimentMediaRevealed;
    public final BLG<VoiceEmbodimentPaintedMedia> _embodimentPaintedMedia;
    public final BLG<VoiceEmbodimentPaintedMedia> _embodimentTakeoverIdleMedia;
    public final BLG<VoiceEmbodimentVideoSuppression> _embodimentVideoSuppression;
    public final BLG<VoiceEmbodimentVisibleMedia> _embodimentVisibleMedia;
    public final C3Em<VoiceEndCallRequest> _endCallRequests;
    public final BLG<Boolean> _isBotSpeaking;
    public final BLG<Boolean> _isCallActive;
    public final BLG<Boolean> _isCompactPresentationActive;
    public final BLG<Boolean> _isConnectionWeak;
    public final BLG<Boolean> _isPreviewActive;
    public final C3Em<String> _liveAvatarUnavailableEvents;
    public final C3Em<String> _liveAvatarUnavailableShown;
    public final C3Em<Unit> _networkDropEndEvents;
    public final C3Em<Unit> _noNetworkCallBlockedEvents;
    public final C3Em<OtherCallBlockedStart> _otherCallBlockedStarts;
    public final C3Em<Unit> _outOfCreditsEvents;
    public final BLG<Long> _pendingCallStart;
    public final C3Em<VoicePreConnectFailure> _preConnectFailureEvents;
    public final C3Em<String> _restartRequests;
    public final C3Em<Unit> _serverVideoDisabledEvents;
    public final BLG<VoiceEmbodimentStillHandoff> _stillHandoff;
    public final BLG<VoiceCallSurfaceState> _surfaceState;
    public final C3Em<Unit> _toggleMuteRequests;
    public final BLG<UndeliveredSpeechOffer> _undeliveredSpeech;
    public final BLG<PendingThread> _undeliveredSpeechPending;
    public final C3Em<Unit> _undeliveredSpeechSentEvents;
    public final C3Em<Unit> _weakConnectionEvents;
    public final C3Em<Unit> _weakNetworkEvents;
    public final C1BN<ActiveAppAudioCall> activeAppAudioCall;
    public final C1BN<String> activeThreadId;
    public final C1BN<VoiceAgentActivity> agentActivity;
    public long agentActivityExpiryGeneration;
    public HoC agentActivityExpiryJob;
    public long agentActivityRevision;
    public final C1BN<AgentActivityStatus> agentActivityStatus;
    public long announcedEndedCallGeneration;
    public final C1BN<Boolean> areEmbodimentMediaResourcesActive;
    public final C1BN<Boolean> avatarEmbodimentCompatible;
    public final C1BN<String> avatarPath;
    public boolean botAudioActive;
    public final C1BN<VoiceBotAudioActivityState> botAudioActivityState;
    public final C1BN<Float> botAudioLevel;
    public final C1BN<String> botName;
    public final C1BN<VoiceBotOutputActivityState> botOutputActivityState;
    public final C1BN<Long> callAttemptGeneration;
    public final C1BN<Boolean> callAvatarEmbodimentCompatible;
    public final C1BN<String> callAvatarImagePath;
    public final C1BN<Long> callGeneration;
    public final C22I<Unit> callIdlePosterShownEvents;
    public final C22I<Unit> callIdleShownEvents;
    public final C22I<Unit> callMovedEvents;
    public VoiceCallStart callStart;
    public volatile long callStartElapsedRealtimeMs;
    public final C22I<Long> callStartHapticEvents;
    public Long callStartHapticGeneration;
    public final C22I<Long> callStarted;
    public final C1BN<AvatarStatusVideos> callStatusVideos;
    public final C22I<Unit> capacityUnavailableEvents;
    public final Set<Object> compactPresentationOwners;
    public final C22I<Unit> connectTimeoutEvents;
    public final C1BN<Boolean> embodimentAvailable;
    public final C1BN<VoiceEmbodimentCallState> embodimentCallState;
    public EmbodimentHideRestoreState embodimentHideRestoreState;
    public final Set<Object> embodimentIdlePlayerOwners;
    public final C1BN<VoiceEmbodimentPlacement> embodimentInAppPlacement;
    public final C1BN<VoiceEmbodimentMedia> embodimentMedia;
    public final C1BN<Boolean> embodimentMediaRevealed;
    public final C1BN<VoiceEmbodimentPaintedMedia> embodimentPaintedMedia;
    public final Set<Object> embodimentRtcRendererOwners;
    public final C1BN<VoiceEmbodimentPaintedMedia> embodimentTakeoverIdleMedia;
    public final C1BN<VoiceEmbodimentVideoSuppression> embodimentVideoSuppression;
    public final C1BN<VoiceEmbodimentVisibleMedia> embodimentVisibleMedia;
    public final C22I<VoiceEndCallRequest> endCallRequests;
    public final C1BN<Boolean> isBotAudioActive;
    public final C1BN<Boolean> isBotSpeaking;
    public final C1BN<Boolean> isCallActive;
    public final C1BN<Boolean> isCompactPresentationActive;
    public final C1BN<Boolean> isConnectionWeak;
    public final C1BN<Boolean> isEmbodimentDisplayEnabled;
    public final C1BN<Boolean> isEmbodimentVisible;
    public final C1BN<Boolean> isInputReady;
    public final C1BN<Boolean> isLiveAvatarUpdating;
    public final C1BN<Boolean> isMuteControlAvailable;
    public final C1BN<Boolean> isMuted;
    public final C1BN<Boolean> isPreviewActive;
    public final C1BN<Boolean> isReconnecting;
    public final C20Q<Boolean> isVoiceSwitchShown;
    public volatile boolean keepAssistantCallInBackground;
    public final C22I<String> liveAvatarUnavailableEvents;
    public final C22I<String> liveAvatarUnavailableShown;
    public final C1BN<VoiceLiveAvatarUpdateStatus> liveAvatarUpdateStatus;
    public final VoiceLiveAvatarUpdateStatusLine liveAvatarUpdateStatusLine;
    public MicrophoneClaim microphoneClaim;
    public final C22I<Unit> networkDropEndEvents;
    public long nextCallStartRequest;
    public long nextEmbodimentHideGeneration;
    public final C22I<Unit> noNetworkCallBlockedEvents;
    public final C22I<OtherCallBlockedStart> otherCallBlockedStarts;
    public final C22I<Unit> outOfCreditsEvents;
    public final C1BN<Long> pendingCallStart;
    public VoiceEmbodimentStateReason pendingEmbodimentStateReason;
    public long pendingEmbodimentStateReasonAtMs;
    public final C22I<VoicePreConnectFailure> preConnectFailureEvents;
    public final Set<Object> previewOwners;
    public Long restartHideRebindGeneration;
    public final C22I<String> restartRequests;
    public final C3UX scope;
    public final C22I<Unit> serverVideoDisabledEvents;
    public final C1BN<VoiceEmbodimentStillHandoff> stillHandoff;
    public final C1BN<VoiceCallSurfaceState> surfaceState;
    public final C22I<Unit> toggleMuteRequests;
    public final C22I<Unit> undeliveredSpeechSentEvents;
    public final AbstractC3358CGz userSession;
    public final C22I<Unit> weakConnectionEvents;
    public final C22I<Unit> weakNetworkEvents;

    public final class Companion {
        public final VoiceCallStateHolder getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceCallStateHolder) abstractC3358CGz.A03(VoiceCallStateHolder.class, new VoiceCallStateHolder$Companion$getInstance$1(abstractC3358CGz));
        }

        public final String normalizedThreadId(String str) {
            String strA0l;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                return null;
            }
            return strA0l;
        }

        public final VoiceCallStateHolder getActiveInstance() {
            return VoiceCallStateHolder.activeInstanceRef.get();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class PendingThread {
        public static final int $stable = 0;
        public final String threadId;

        public final String getThreadId() {
            return this.threadId;
        }

        public PendingThread(String str) {
            this.threadId = str;
        }
    }

    /* loaded from: classes6.dex */
    public final class UndeliveredSpeechOffer {
        public static final int $stable = 8;
        public final InterfaceC10560Hsz<Boolean> claimed;
        public final String text;
        public final String threadId;
        public final String turnId;

        public UndeliveredSpeechOffer(String str, String str2, String str3) {
            C7384Etj.A0Y(str3, 2);
            this.threadId = str;
            this.turnId = str2;
            this.text = str3;
            this.claimed = new GAt(null);
        }

        public final InterfaceC10560Hsz<Boolean> getClaimed$fbandroid_express_aura_java_com_facebook_aura_partners_voice_intf_intf() {
            return this.claimed;
        }

        public final String getText() {
            return this.text;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public final String getTurnId() {
            return this.turnId;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder", f = "VoiceCallStateHolder.kt", l = {1144}, m = "awaitUndeliveredSpeechSettled", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallStateHolder.this.awaitUndeliveredSpeechSettled(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$2", f = "VoiceCallStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<PendingThread, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1Y(obj2));
        }

        @Override // X.G0V
        public final Object invoke(PendingThread pendingThread, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = pendingThread;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isBotAudioActive$1, reason: invalid class name and case insensitive filesystem */
    public final class C131371 extends AbstractC7559F3s implements G0U<VoiceBotAudioActivityState, Boolean> {
        public static final C131371 INSTANCE = new C131371();

        public C131371() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(VoiceBotAudioActivityState voiceBotAudioActivityState) {
            C7384Etj.A0Y(voiceBotAudioActivityState, 0);
            return Boolean.valueOf(voiceBotAudioActivityState.active);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isEmbodimentDisplayEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C131381 extends AbstractC7559F3s implements G0U<VoiceCallSurfaceState, Boolean> {
        public static final C131381 INSTANCE = new C131381();

        public C131381() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(VoiceCallSurfaceState voiceCallSurfaceState) {
            C7384Etj.A0Y(voiceCallSurfaceState, 0);
            return Boolean.valueOf(VoiceCallStateKt.isEmbodimentDisplayEnabled(voiceCallSurfaceState));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isEmbodimentVisible$1, reason: invalid class name and case insensitive filesystem */
    public final class C131391 extends AbstractC7559F3s implements G0U<VoiceCallSurfaceState, Boolean> {
        public static final C131391 INSTANCE = new C131391();

        public C131391() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(VoiceCallSurfaceState voiceCallSurfaceState) {
            C7384Etj.A0Y(voiceCallSurfaceState, 0);
            return Boolean.valueOf(voiceCallSurfaceState instanceof VoiceCallSurfaceState.Visible);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isInputReady$2", f = "VoiceCallStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isInputReady$2, reason: invalid class name and case insensitive filesystem */
    public final class C131402 extends AbstractC07127nr implements G2j<VoiceCallUiState, Boolean, Long, HtJ<? super Boolean>, Object> {
        public int label;

        public C131402(HtJ<? super C131402> htJ) {
            super(4, htJ);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(VoiceCallUiState voiceCallUiState, Boolean bool, Long l, HtJ<? super Boolean> htJ) {
            l.longValue();
            return VoiceCallStateHolder.this.new C131402(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(VoiceCallStateHolder.this.canAcceptInput());
        }

        public final Object invoke(VoiceCallUiState voiceCallUiState, boolean z, long j, HtJ<? super Boolean> htJ) {
            return VoiceCallStateHolder.this.new C131402(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isLiveAvatarUpdating$1, reason: invalid class name and case insensitive filesystem */
    public final class C131411 extends AbstractC7559F3s implements G0U<VoiceLiveAvatarUpdateStatus, Boolean> {
        public static final C131411 INSTANCE = new C131411();

        public C131411() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus) {
            return Boolean.valueOf(AnonymousClass002.A1Z(voiceLiveAvatarUpdateStatus, VoiceLiveAvatarUpdateStatus.UPDATING));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isReconnectingStatusShown$1", f = "VoiceCallStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$isReconnectingStatusShown$1, reason: invalid class name and case insensitive filesystem */
    public final class C131421 extends AbstractC07127nr implements G2j<Boolean, Boolean, String, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $threadId;
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131421(String str, HtJ<? super C131421> htJ) {
            super(4, htJ);
            this.$threadId = str;
        }

        public final Object invoke(boolean z, boolean z2, String str, HtJ<? super Boolean> htJ) {
            C131421 c131421 = new C131421(this.$threadId, htJ);
            c131421.Z$0 = z;
            c131421.Z$1 = z2;
            c131421.L$0 = str;
            return c131421.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r3 = r4.Z$0
                boolean r2 = r4.Z$1
                java.lang.Object r1 = r4.L$0
                java.lang.String r1 = (java.lang.String) r1
                int r0 = r4.label
                if (r0 != 0) goto L2e
                X.Hwg.A00(r5)
                if (r3 == 0) goto L28
                if (r2 == 0) goto L28
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$Companion r0 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.Companion
                java.lang.String r2 = r0.normalizedThreadId(r1)
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$Companion r1 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.Companion
                java.lang.String r0 = r4.$threadId
                java.lang.String r0 = r1.normalizedThreadId(r0)
                boolean r1 = X.C7384Etj.areEqual(r2, r0)
                r0 = 1
                if (r1 != 0) goto L29
            L28:
                r0 = 0
            L29:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L2e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.C131421.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, String str, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), str, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$liveAvatarUpdateStatusShown$1", f = "VoiceCallStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$liveAvatarUpdateStatusShown$1, reason: invalid class name and case insensitive filesystem */
    public final class C131431 extends AbstractC07127nr implements G2l<VoiceLiveAvatarUpdateStatus, Boolean, String, VoiceEmbodimentMedia, Boolean, HtJ<? super VoiceLiveAvatarUpdateStatus>, Object> {
        public final /* synthetic */ String $threadId;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public /* synthetic */ Object L$3;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131431(String str, HtJ<? super C131431> htJ) {
            super(6, htJ);
            this.$threadId = str;
        }

        @Override // X.G2l
        public /* bridge */ /* synthetic */ Object invoke(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, Boolean bool, String str, VoiceEmbodimentMedia voiceEmbodimentMedia, Boolean bool2, HtJ<? super VoiceLiveAvatarUpdateStatus> htJ) {
            return invoke(voiceLiveAvatarUpdateStatus, AnonymousClass001.A1X(bool), str, voiceEmbodimentMedia, bool2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            boolean z = this.Z$0;
            String str = (String) this.L$1;
            Object obj3 = this.L$2;
            Object obj4 = this.L$3;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (obj2 != null) {
                String str2 = this.$threadId;
                if (z && (obj3 instanceof VoiceEmbodimentMedia.LiveRtc) && C7384Etj.areEqual(obj4, AnonymousClass001.A0i())) {
                    Companion companion = VoiceCallStateHolder.Companion;
                    if (C7384Etj.areEqual(companion.normalizedThreadId(str), companion.normalizedThreadId(str2))) {
                        return obj2;
                    }
                }
            }
            return null;
        }

        public final Object invoke(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, boolean z, String str, VoiceEmbodimentMedia voiceEmbodimentMedia, Boolean bool, HtJ<? super VoiceLiveAvatarUpdateStatus> htJ) {
            C131431 c131431 = new C131431(this.$threadId, htJ);
            c131431.L$0 = voiceLiveAvatarUpdateStatus;
            c131431.Z$0 = z;
            c131431.L$1 = str;
            c131431.L$2 = voiceEmbodimentMedia;
            c131431.L$3 = bool;
            return c131431.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder", f = "VoiceCallStateHolder.kt", l = {1114, 1119}, m = "offerUndeliveredSpeech", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$1, reason: invalid class name and case insensitive filesystem */
    public final class C131441 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C131441(HtJ<? super C131441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallStateHolder.this.offerUndeliveredSpeech(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$2", f = "VoiceCallStateHolder.kt", l = {1114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$2, reason: invalid class name and case insensitive filesystem */
    public final class C131452 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ UndeliveredSpeechOffer $speech;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131452(UndeliveredSpeechOffer undeliveredSpeechOffer, HtJ<? super C131452> htJ) {
            super(2, htJ);
            this.$speech = undeliveredSpeechOffer;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C131452(this.$speech, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.$speech.claimed;
                this.label = 1;
                obj = C3cG.A0W(interfaceC10560Hsz, this);
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
            return new C131452(this.$speech, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$setAgentActivityLocked$1", f = "VoiceCallStateHolder.kt", l = {948}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$setAgentActivityLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C131461 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $generation;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131461(long j, HtJ<? super C131461> htJ) {
            super(2, htJ);
            this.$generation = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceCallStateHolder.this.new C131461(this.$generation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(900000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            VoiceCallStateHolder.this.expireAgentActivityStatus(this.$generation);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C131461) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$setCallActive$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void expireAgentActivityStatus(long j) {
        if (this.agentActivityExpiryGeneration == j) {
            this.agentActivityExpiryJob = null;
            writeAgentActivityLocked(new VoiceAgentActivity(AgentActivityStatus.ONLINE, null, null, null));
        }
    }

    private final void resetBotAudioLevelLocked() {
        this.botAudioActive = false;
        Object objA0V = C3cG.A0V(this._botAudioActivityState, new VoiceBotAudioActivityState(false));
        publishBotOutputActivityLocked();
        AnonymousClass001.A1E(this._botAudioLevel, objA0V, AnonymousClass005.A0a());
    }

    private final synchronized void resetEmbodimentMediaResources() {
        this.embodimentRtcRendererOwners.clear();
        this.embodimentIdlePlayerOwners.clear();
        publishEmbodimentMediaResourcesActive();
    }

    public final synchronized VoiceAgentActivityCancelToken agentActivityCancelToken(String str) {
        return new VoiceAgentActivityCancelToken(Companion.normalizedThreadId(str), this.agentActivityRevision);
    }

    public final void attachCallState(C1BN<VoiceCallUiState> c1bn) {
        C7384Etj.A0Y(c1bn, 0);
        AnonymousClass002.A1I(this._callStateSource, c1bn);
    }

    public final synchronized long beginCall(boolean z, boolean z2) {
        resetBotOutputStateLocked();
        BLG<Long> blg = this._callAttemptGeneration;
        C3cG.A0V(blg, Long.valueOf(C3cH.A08(blg) + 1));
        AnonymousClass003.A14(this._isConnectionWeak, false);
        Long value = this._callGeneration.getValue();
        value.longValue();
        if (!z) {
            value = null;
        }
        this.restartHideRebindGeneration = value;
        setAgentActivityStatus(AgentActivityStatus.ONLINE);
        if (!z2) {
            resetEmbodimentPresentation();
        }
        Long value2 = this._callAttemptGeneration.getValue();
        value2.longValue();
        this.callStartHapticGeneration = z ? null : value2;
        return C3cH.A08(this._callAttemptGeneration);
    }

    public final synchronized boolean beginEmbodimentHideRequest(long j) {
        boolean z;
        EmbodimentHideRestoreState embodimentHideRestoreState = this.embodimentHideRestoreState;
        z = false;
        if (embodimentHideRestoreState != null && embodimentHideRestoreState.generation == j && embodimentHideRestoreState.callGeneration == C3cH.A08(this._callGeneration) && AnonymousClass003.A1Z(this._isCallActive)) {
            z = true;
            embodimentHideRestoreState.requestingHide = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean canAcceptInput() {
        /*
            r7 = this;
            monitor-enter(r7)
            X.BLG<X.1BN<com.facebook.aura.partners.voice.intf.VoiceCallUiState>> r0 = r7._callStateSource     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L35
            X.1BN r0 = (X.C1BN) r0     // Catch: java.lang.Throwable -> L35
            r6 = 0
            if (r0 == 0) goto L33
            java.lang.Object r5 = r0.getValue()     // Catch: java.lang.Throwable -> L35
            com.facebook.aura.partners.voice.intf.VoiceCallUiState r5 = (com.facebook.aura.partners.voice.intf.VoiceCallUiState) r5     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L33
            X.BLG<java.lang.Boolean> r0 = r7._isCallActive     // Catch: java.lang.Throwable -> L35
            boolean r0 = X.AnonymousClass003.A1Z(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L33
            long r3 = r5.callAttemptGeneration     // Catch: java.lang.Throwable -> L35
            X.BLG<java.lang.Long> r0 = r7._callAttemptGeneration     // Catch: java.lang.Throwable -> L35
            long r1 = X.C3cH.A08(r0)     // Catch: java.lang.Throwable -> L35
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            com.facebook.aura.partners.voice.intf.VoiceCallPhase r1 = r5.phase     // Catch: java.lang.Throwable -> L35
            com.facebook.aura.partners.voice.intf.VoiceCallPhase r0 = com.facebook.aura.partners.voice.intf.VoiceCallPhase.CONNECTED     // Catch: java.lang.Throwable -> L35
            if (r1 == r0) goto L32
            com.facebook.aura.partners.voice.intf.VoiceCallPhase r0 = com.facebook.aura.partners.voice.intf.VoiceCallPhase.ACTIVE     // Catch: java.lang.Throwable -> L35
            if (r1 != r0) goto L33
        L32:
            r6 = 1
        L33:
            monitor-exit(r7)
            return r6
        L35:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L35
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.canAcceptInput():boolean");
    }

    public final synchronized void clearBusyAgentActivity(VoiceAgentActivityCancelToken voiceAgentActivityCancelToken) {
        C7384Etj.A0Y(voiceAgentActivityCancelToken, 0);
        if (voiceAgentActivityCancelToken.revision == this.agentActivityRevision && C7384Etj.areEqual(voiceAgentActivityCancelToken.threadId, Companion.normalizedThreadId(this._activeThreadId.getValue()))) {
            switch (this.agentActivityStatus.getValue().ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    setAgentActivityLocked(new VoiceAgentActivity(AgentActivityStatus.ONLINE, null, null, null));
                    break;
                default:
                    throw C3cG.A0q();
            }
        }
    }

    public final void clearUndeliveredSpeechPending(PendingThread pendingThread) {
        C7384Etj.A0Y(pendingThread, 0);
        C9286GCn.A00(pendingThread, HwN.A01, (C9286GCn) this._undeliveredSpeechPending);
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.previewOwners.clear();
        C9286GCn.A00(null, false, (C9286GCn) this._isPreviewActive);
        this._activeAppAudioCall.Af8(null);
        setCallActive(false);
        this.embodimentHideRestoreState = null;
        resetEmbodimentMediaResources();
        Hxb.A03(null, this.scope);
        Bs8.A00(this, null, activeInstanceRef);
    }

    public final void closeLiveAvatarUpdateStatus(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus) {
        C7384Etj.A0Y(voiceLiveAvatarUpdateStatus, 0);
        this.liveAvatarUpdateStatusLine.close(voiceLiveAvatarUpdateStatus);
        logLiveAvatarStatusWinnerIfOverridden();
    }

    public final synchronized boolean consumeCallEndedAnnouncement(long j) {
        if (AnonymousClass003.A1Z(this._isCallActive) || j != C3cH.A08(this._callGeneration) || j == this.announcedEndedCallGeneration) {
            return false;
        }
        this.announcedEndedCallGeneration = j;
        return true;
    }

    public final synchronized VoiceCallStart consumeCallStart(long j) {
        Long value = this._pendingCallStart.getValue();
        if (value == null || value.longValue() != j) {
            return null;
        }
        this._pendingCallStart.Af8(null);
        VoiceCallStart voiceCallStart = this.callStart;
        this.callStart = null;
        return voiceCallStart;
    }

    public final synchronized boolean consumeCallStartHaptic(long j) {
        Long l = this.callStartHapticGeneration;
        if (l == null || l.longValue() != j) {
            return false;
        }
        this.callStartHapticGeneration = null;
        return true;
    }

    public final synchronized VoiceEmbodimentStateReason consumeEmbodimentStateReason() {
        VoiceEmbodimentStateReason voiceEmbodimentStateReason;
        voiceEmbodimentStateReason = this.pendingEmbodimentStateReason;
        if (voiceEmbodimentStateReason == null || SystemClock.elapsedRealtime() - this.pendingEmbodimentStateReasonAtMs > 2000) {
            voiceEmbodimentStateReason = null;
        }
        this.pendingEmbodimentStateReason = null;
        return voiceEmbodimentStateReason;
    }

    public final synchronized void emitCallStartHapticIfCurrent(long j) {
        Long l;
        if (AnonymousClass003.A1Z(this._isCallActive) && (l = this.callStartHapticGeneration) != null && l.longValue() == j) {
            this._callStartHapticEvents.AhV(Long.valueOf(j));
        }
    }

    public final synchronized void finishEmbodimentHide(long j, boolean z) {
        EmbodimentHideRestoreState embodimentHideRestoreState = this.embodimentHideRestoreState;
        if (embodimentHideRestoreState != null && embodimentHideRestoreState.generation == j) {
            if (z) {
                this.embodimentHideRestoreState = null;
            } else {
                restorePendingEmbodimentHide();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isAgentActivityTarget(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.BLG<java.lang.Boolean> r0 = r2._isCallActive     // Catch: java.lang.Throwable -> L13
            boolean r0 = X.AnonymousClass003.A1Z(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r2.matchesAgentActivityScopeLocked(r3)     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.isAgentActivityTarget(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isPreConnectFailureNoticeCurrent(com.facebook.aura.partners.voice.intf.VoicePreConnectFailure r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)     // Catch: java.lang.Throwable -> L2a
            X.BLG<java.lang.Boolean> r0 = r6._isCallActive     // Catch: java.lang.Throwable -> L2a
            boolean r0 = X.AnonymousClass003.A1Z(r0)     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L27
            long r3 = r7.callAttemptGeneration     // Catch: java.lang.Throwable -> L2a
            X.BLG<java.lang.Long> r0 = r6._callAttemptGeneration     // Catch: java.lang.Throwable -> L2a
            long r1 = X.C3cH.A08(r0)     // Catch: java.lang.Throwable -> L2a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2a
            long r0 = r7.failedAtElapsedRealtimeMs     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 - r0
            r2 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L28
        L27:
            r0 = 0
        L28:
            monitor-exit(r6)
            return r0
        L2a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.isPreConnectFailureNoticeCurrent(com.facebook.aura.partners.voice.intf.VoicePreConnectFailure):boolean");
    }

    public final synchronized void markEmbodimentRtcFramePainted(long j) {
        VoiceEmbodimentCallState value = this._embodimentCallState.getValue();
        if (AnonymousClass003.A1Z(this._isCallActive)) {
            long j2 = value.generation;
            if (j == j2) {
                AnonymousClass002.A1I(this._embodimentCallState, new VoiceEmbodimentCallState(j2, true));
            }
        }
    }

    public final synchronized void noteEmbodimentStateReason(VoiceEmbodimentStateReason voiceEmbodimentStateReason) {
        C7384Etj.A0Y(voiceEmbodimentStateReason, 0);
        if (AnonymousClass003.A1Z(this._isCallActive)) {
            this.pendingEmbodimentStateReason = voiceEmbodimentStateReason;
            this.pendingEmbodimentStateReasonAtMs = SystemClock.elapsedRealtime();
        }
    }

    public final void notifyLiveAvatarUnavailable(String str) {
        C7384Etj.A0Y(str, 0);
        this._liveAvatarUnavailableEvents.AhV(str);
    }

    public final void notifyPreConnectFailure(VoicePreConnectFailure voicePreConnectFailure) {
        C7384Etj.A0Y(voicePreConnectFailure, 0);
        this._preConnectFailureEvents.AhV(voicePreConnectFailure);
    }

    public final void onLiveAvatarUnavailableShown(String str) {
        C7384Etj.A0Y(str, 0);
        this._liveAvatarUnavailableShown.AhV(str);
    }

    public final synchronized void registerCompactPresentation(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.compactPresentationOwners.add(obj);
        AnonymousClass004.A1D(true, this._isCompactPresentationActive);
        this.keepAssistantCallInBackground = true;
    }

    public final synchronized void requestCallStart(String str, VoiceCallStart voiceCallStart) {
        C7384Etj.A0Y(voiceCallStart, 1);
        if (!AnonymousClass003.A1Z(this._isCallActive) && this._pendingCallStart.getValue() == null) {
            setActiveThreadId(str);
            this.callStart = voiceCallStart;
            BLG<Long> blg = this._pendingCallStart;
            long j = this.nextCallStartRequest + 1;
            this.nextCallStartRequest = j;
            AnonymousClass002.A1I(blg, Long.valueOf(j));
        }
    }

    public final synchronized void resetBotAudioLevel() {
        resetBotAudioLevelLocked();
    }

    public final synchronized boolean resetBotAudioLevelIfCurrent(long j) {
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        resetBotAudioLevelLocked();
        return true;
    }

    public final synchronized void resetEmbodimentPresentation() {
        Object objA0V = C3cG.A0V(this._embodimentVideoSuppression, new VoiceEmbodimentVideoSuppression(false, true, false, false, false, false));
        AnonymousClass001.A1E(this._embodimentVisibleMedia, objA0V, VoiceEmbodimentVisibleMedia.NONE);
        AnonymousClass001.A1E(this._embodimentPaintedMedia, objA0V, VoiceEmbodimentPaintedMedia.NONE);
        AnonymousClass001.A1E(this._embodimentTakeoverIdleMedia, objA0V, VoiceEmbodimentPaintedMedia.STATIC);
        AnonymousClass003.A14(this._embodimentMediaRevealed, false);
        BLG<VoiceEmbodimentCallState> blg = this._embodimentCallState;
        AnonymousClass001.A1E(blg, objA0V, new VoiceEmbodimentCallState(blg.getValue().generation + 1, false));
    }

    public final synchronized boolean restoreEmbodimentOnForeground() {
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A1R(this.isEmbodimentDisplayEnabled)) {
            return false;
        }
        this.embodimentHideRestoreState = null;
        setEmbodimentDisplayEnabled(true, VoiceEmbodimentStateReason.APP_FOREGROUND);
        return true;
    }

    public final void setActiveAppAudioCall(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1I(this._activeAppAudioCall, new ActiveAppAudioCall(str, str2));
    }

    public final synchronized void setActiveThreadId(String str) {
        if (!C7384Etj.areEqual(this._activeThreadId.getValue(), str)) {
            this._activeThreadId.Af8(str);
            setAgentActivityStatus(AgentActivityStatus.ONLINE);
        }
    }

    public final synchronized void setAgentActivityStatus(AgentActivityStatus agentActivityStatus) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        setAgentActivityLocked(new VoiceAgentActivity(agentActivityStatus, null, null, null));
    }

    public final synchronized void setAgentActivityStatusForMatchingThread(String str, AgentActivityStatus agentActivityStatus, String str2, String str3, String str4, Function0<Boolean> function0) {
        AnonymousClass002.A1D(agentActivityStatus, 1, function0);
        if (AnonymousClass003.A1Y(function0) && AnonymousClass003.A1Z(this._isCallActive) && matchesAgentActivityScopeLocked(str)) {
            String str5 = null;
            if (str2 == null || C7BY.A0j(str2)) {
                str2 = null;
            }
            if (str3 != null && !C7BY.A0j(str3)) {
                str5 = str3;
            }
            setAgentActivityLocked(new VoiceAgentActivity(agentActivityStatus, str2, str5, str4));
        }
    }

    public final synchronized boolean setBotAudioLevelIfCurrent(long j, float f, boolean z) {
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        this.botAudioActive = z;
        Object objA0V = C3cG.A0V(this._botAudioActivityState, new VoiceBotAudioActivityState(z));
        publishBotOutputActivityLocked();
        AnonymousClass001.A1E(this._botAudioLevel, objA0V, Float.valueOf(f));
        return true;
    }

    public final synchronized boolean setBotSpeakingIfCurrent(long j, boolean z) {
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        setBotSpeakingLocked(z);
        return true;
    }

    public final synchronized void setCallActive(boolean z) {
        Long l;
        boolean zA1Z = AnonymousClass003.A1Z(this._isCallActive);
        if (!zA1Z && z) {
            long jA08 = C3cH.A08(this._callGeneration);
            BLG<Long> blg = this._callGeneration;
            AnonymousClass001.A1E(blg, null, Long.valueOf(C3cH.A08(blg) + 1));
            EmbodimentHideRestoreState embodimentHideRestoreState = this.embodimentHideRestoreState;
            if (embodimentHideRestoreState != null && (l = this.restartHideRebindGeneration) != null && l.longValue() == jA08 && embodimentHideRestoreState.requestingHide && embodimentHideRestoreState.callGeneration == jA08) {
                embodimentHideRestoreState.callGeneration = C3cH.A08(this._callGeneration);
            }
            this.restartHideRebindGeneration = null;
            this.callStartElapsedRealtimeMs = SystemClock.elapsedRealtime();
            this.microphoneClaim = Microphone.INSTANCE.claim(this.userSession, MicrophonePriority.SESSION, AnonymousClass3.INSTANCE);
        }
        AnonymousClass003.A14(this._isCallActive, z);
        if (zA1Z) {
            if (!z) {
                MicrophoneClaim microphoneClaim = this.microphoneClaim;
                if (microphoneClaim != null) {
                    microphoneClaim.release();
                }
                this.microphoneClaim = null;
                this.keepAssistantCallInBackground = false;
                AnonymousClass001.A1E(this._embodimentVisibleMedia, null, VoiceEmbodimentVisibleMedia.NONE);
                AnonymousClass001.A1E(this._embodimentPaintedMedia, null, VoiceEmbodimentPaintedMedia.NONE);
                AnonymousClass001.A1E(this._embodimentInAppPlacement, null, VoiceEmbodimentPlacement.AVATAR);
                AnonymousClass001.A1E(this._embodimentTakeoverIdleMedia, null, VoiceEmbodimentPaintedMedia.STATIC);
                AnonymousClass001.A1E(this._embodimentMediaRevealed, null, false);
                this.pendingEmbodimentStateReason = null;
                setAgentActivityStatus(AgentActivityStatus.ONLINE);
                this.embodimentHideRestoreState = null;
                resetEmbodimentMediaResources();
                hideLiveAvatarUpdateStatus();
                this._callAvatarEmbodimentCompatible.Af8(null);
                this._callAvatarImagePath.Af8(null);
                BLG<VoiceCallSurfaceState> blg2 = this._surfaceState;
                while (!blg2.A6e(blg2.getValue(), new VoiceCallSurfaceState.Unavailable(true))) {
                }
                resetBotOutputStateLocked();
                BLG<VoiceEmbodimentVideoSuppression> blg3 = this._embodimentVideoSuppression;
                VoiceEmbodimentVideoSuppression value = blg3.getValue();
                C9286GCn.A00(null, new VoiceEmbodimentVideoSuppression(false, value.memoryBlocked, value.memoryMeasured, value.portraitMissing, value.avatarUpdating, value.offScreen), (C9286GCn) blg3);
                AnonymousClass001.A1E(this._isConnectionWeak, null, false);
            }
        } else if (z) {
            this._callStarted.AhV(this._callGeneration.getValue());
        }
    }

    public final synchronized boolean setCallActiveIfCurrent(long j, boolean z) {
        if (C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        setCallActive(z);
        return true;
    }

    public final void setCallStatusVideos(AvatarStatusVideos avatarStatusVideos) {
        C7384Etj.A0Y(avatarStatusVideos, 0);
        AnonymousClass002.A1I(this._callStatusVideos, avatarStatusVideos);
    }

    public final synchronized boolean setConnectionWeakIfCurrent(long j, boolean z) {
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        AnonymousClass004.A1D(z, this._isConnectionWeak);
        return true;
    }

    public final synchronized void setEmbodimentDisplayEnabled(boolean z, VoiceEmbodimentStateReason voiceEmbodimentStateReason) {
        VoiceCallSurfaceState value;
        VoiceCallSurfaceState hidden;
        C7384Etj.A0Y(voiceEmbodimentStateReason, 1);
        if (z != C3cH.A1R(this.isEmbodimentDisplayEnabled)) {
            noteEmbodimentStateReason(voiceEmbodimentStateReason);
        }
        BLG<VoiceCallSurfaceState> blg = this._surfaceState;
        do {
            value = blg.getValue();
            hidden = value;
            if (hidden instanceof VoiceCallSurfaceState.Unavailable) {
                hidden = new VoiceCallSurfaceState.Unavailable(z);
            } else if (hidden instanceof VoiceCallSurfaceState.Hidden) {
                if (z) {
                    hidden = new VoiceCallSurfaceState.Loading(((VoiceCallSurfaceState.Hidden) hidden).media);
                }
            } else if (hidden instanceof VoiceCallSurfaceState.Loading) {
                if (!z) {
                    hidden = new VoiceCallSurfaceState.Hidden(((VoiceCallSurfaceState.Loading) hidden).media);
                }
            } else {
                if (!(hidden instanceof VoiceCallSurfaceState.Visible)) {
                    throw C3cG.A0q();
                }
                if (!z) {
                    hidden = new VoiceCallSurfaceState.Hidden(((VoiceCallSurfaceState.Visible) hidden).media);
                }
            }
        } while (!blg.A6e(value, hidden));
    }

    public final synchronized void setEmbodimentIdlePlayerMounted(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        Set<Object> set = this.embodimentIdlePlayerOwners;
        if (z) {
            set.add(obj);
        } else {
            set.remove(obj);
        }
        publishEmbodimentMediaResourcesActive();
    }

    public final synchronized void setEmbodimentInAppPlacement(VoiceEmbodimentPlacement voiceEmbodimentPlacement) {
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        if (AnonymousClass003.A1Z(this._isCallActive)) {
            AnonymousClass002.A1I(this._embodimentInAppPlacement, voiceEmbodimentPlacement);
        }
    }

    public final synchronized void setEmbodimentMediaRevealed(long j, boolean z) {
        if (AnonymousClass003.A1Z(this._isCallActive) && j == this._embodimentCallState.getValue().generation) {
            AnonymousClass004.A1D(z, this._embodimentMediaRevealed);
        }
    }

    public final synchronized void setEmbodimentPaintedMedia(long j, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia) {
        C7384Etj.A0Y(voiceEmbodimentPaintedMedia, 1);
        if (AnonymousClass003.A1Z(this._isCallActive) && j == this._embodimentCallState.getValue().generation) {
            AnonymousClass002.A1I(this._embodimentPaintedMedia, voiceEmbodimentPaintedMedia);
        }
    }

    public final synchronized void setEmbodimentRtcRendererAttached(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        Set<Object> set = this.embodimentRtcRendererOwners;
        if (z) {
            set.add(obj);
        } else {
            set.remove(obj);
        }
        publishEmbodimentMediaResourcesActive();
    }

    public final synchronized boolean setEmbodimentVideoSuppressionIfCurrent(long j, VoiceEmbodimentVideoSuppression voiceEmbodimentVideoSuppression) {
        C7384Etj.A0Y(voiceEmbodimentVideoSuppression, 1);
        if (!AnonymousClass003.A1Z(this._isCallActive) || C3cH.A08(this._callAttemptGeneration) != j) {
            return false;
        }
        AnonymousClass002.A1I(this._embodimentVideoSuppression, voiceEmbodimentVideoSuppression);
        return true;
    }

    public final synchronized void setEmbodimentVisibleMedia(long j, VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia) {
        C7384Etj.A0Y(voiceEmbodimentVisibleMedia, 1);
        if (AnonymousClass003.A1Z(this._isCallActive) && j == this._embodimentCallState.getValue().generation) {
            AnonymousClass002.A1I(this._embodimentVisibleMedia, voiceEmbodimentVisibleMedia);
        }
    }

    public final synchronized void setPreviewActive(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        Set<Object> set = this.previewOwners;
        if (z) {
            set.add(obj);
        } else {
            set.remove(obj);
        }
        AnonymousClass004.A1D(!this.previewOwners.isEmpty(), this._isPreviewActive);
    }

    public final synchronized Long stageEmbodimentHide() {
        if (this.embodimentHideRestoreState != null || !AnonymousClass003.A1Z(this._isCallActive)) {
            return null;
        }
        long j = this.nextEmbodimentHideGeneration + 1;
        this.nextEmbodimentHideGeneration = j;
        this.embodimentHideRestoreState = new EmbodimentHideRestoreState(j, C3cH.A08(this._callGeneration), C3cH.A1R(this.isEmbodimentDisplayEnabled), false);
        setEmbodimentDisplayEnabled(false, VoiceEmbodimentStateReason.PIP_HIDE_AVATAR);
        return Long.valueOf(j);
    }

    public final synchronized void unregisterCompactPresentation(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.compactPresentationOwners.remove(obj);
        AnonymousClass004.A1D(!this.compactPresentationOwners.isEmpty(), this._isCompactPresentationActive);
        if (this.compactPresentationOwners.isEmpty()) {
            this.keepAssistantCallInBackground = false;
        }
    }

    public final void updateStillHandoff(G0U<? super VoiceEmbodimentStillHandoff, VoiceEmbodimentStillHandoff> g0u) {
        VoiceEmbodimentStillHandoff value;
        C7384Etj.A0Y(g0u, 0);
        BLG<VoiceEmbodimentStillHandoff> blg = this._stillHandoff;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, g0u.invoke(value)));
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass002.A13(AgentActivityStatus.RESPONDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentActivityStatus.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.COMPOSING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.COMPACTING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.ONLINE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoiceCallStateHolder(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._activeAppAudioCall = c9286GCnA14;
        this.activeAppAudioCall = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._isCallActive = c9286GCnA142;
        C3Pi c3PiA11 = C3cG.A11(c9286GCnA142);
        this.isCallActive = c3PiA11;
        this.compactPresentationOwners = C3cG.A0k();
        C9286GCn c9286GCnA143 = C3cG.A14(false);
        this._isCompactPresentationActive = c9286GCnA143;
        this.isCompactPresentationActive = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(hrH);
        this._pendingCallStart = c9286GCnA144;
        this.pendingCallStart = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA145 = C3cG.A14(false);
        this._isBotSpeaking = c9286GCnA145;
        this.isBotSpeaking = C3cG.A11(c9286GCnA145);
        C9286GCn c9286GCnA146 = C3cG.A14(new VoiceEmbodimentVideoSuppression(false, true, false, false, false, false));
        this._embodimentVideoSuppression = c9286GCnA146;
        this.embodimentVideoSuppression = C3cG.A11(c9286GCnA146);
        C9286GCn c9286GCnA147 = C3cG.A14(new VoiceBotOutputActivityState(false, 0L, 0L));
        this._botOutputActivityState = c9286GCnA147;
        this.botOutputActivityState = C3cG.A11(c9286GCnA147);
        C9286GCn c9286GCnA148 = C3cG.A14(new VoiceAgentActivity(AgentActivityStatus.ONLINE, null, null, null));
        this._agentActivity = c9286GCnA148;
        C3Pi c3PiA112 = C3cG.A11(c9286GCnA148);
        this.agentActivity = c3PiA112;
        this.agentActivityStatus = new MappedStateFlow(c3PiA112, VoiceCallStateHolder$agentActivityStatus$1.INSTANCE);
        C9286GCn c9286GCnA149 = C3cG.A14(new VoiceEmbodimentCallState(0L, false));
        this._embodimentCallState = c9286GCnA149;
        this.embodimentCallState = C3cG.A11(c9286GCnA149);
        C9286GCn c9286GCnA1410 = C3cG.A14(VoiceEmbodimentVisibleMedia.NONE);
        this._embodimentVisibleMedia = c9286GCnA1410;
        this.embodimentVisibleMedia = C3cG.A11(c9286GCnA1410);
        C9286GCn c9286GCnA1411 = C3cG.A14(VoiceEmbodimentPaintedMedia.NONE);
        this._embodimentPaintedMedia = c9286GCnA1411;
        this.embodimentPaintedMedia = C3cG.A11(c9286GCnA1411);
        C9286GCn c9286GCnA1412 = C3cG.A14(VoiceEmbodimentPlacement.AVATAR);
        this._embodimentInAppPlacement = c9286GCnA1412;
        this.embodimentInAppPlacement = C3cG.A11(c9286GCnA1412);
        C9286GCn c9286GCnA1413 = C3cG.A14(VoiceEmbodimentPaintedMedia.STATIC);
        this._embodimentTakeoverIdleMedia = c9286GCnA1413;
        this.embodimentTakeoverIdleMedia = C3cG.A11(c9286GCnA1413);
        C9286GCn c9286GCnA1414 = C3cG.A14(false);
        this._embodimentMediaRevealed = c9286GCnA1414;
        this.embodimentMediaRevealed = C3cG.A11(c9286GCnA1414);
        C9286GCn c9286GCnA1415 = C3cG.A14(AnonymousClass005.A0a());
        this._botAudioLevel = c9286GCnA1415;
        this.botAudioLevel = C3cG.A11(c9286GCnA1415);
        C9286GCn c9286GCnA1416 = C3cG.A14(new VoiceBotAudioActivityState(false));
        this._botAudioActivityState = c9286GCnA1416;
        C3Pi c3PiA113 = C3cG.A11(c9286GCnA1416);
        this.botAudioActivityState = c3PiA113;
        this.isBotAudioActive = new MappedStateFlow(c3PiA113, C131371.INSTANCE);
        HzC hzCA02 = Hxb.A02(C78W.A02(new C8eO(null), C3cG.A0v()));
        this.scope = hzCA02;
        C9286GCn c9286GCnA1417 = C3cG.A14(new VoiceCallSurfaceState.Unavailable(true));
        this._surfaceState = c9286GCnA1417;
        C3Pi c3PiA114 = C3cG.A11(c9286GCnA1417);
        this.surfaceState = c3PiA114;
        this.embodimentRtcRendererOwners = C3cG.A0k();
        this.embodimentIdlePlayerOwners = C3cG.A0k();
        C9286GCn c9286GCnA1418 = C3cG.A14(false);
        this._areEmbodimentMediaResourcesActive = c9286GCnA1418;
        this.areEmbodimentMediaResourcesActive = C3cG.A11(c9286GCnA1418);
        this.embodimentMedia = new MappedStateFlow(c3PiA114, VoiceCallStateHolder$embodimentMedia$1.INSTANCE);
        this.embodimentAvailable = new MappedStateFlow(c3PiA114, VoiceCallStateHolder$embodimentAvailable$1.INSTANCE);
        this.isEmbodimentDisplayEnabled = new MappedStateFlow(c3PiA114, C131381.INSTANCE);
        this.isEmbodimentVisible = new MappedStateFlow(c3PiA114, C131391.INSTANCE);
        this.isMuteControlAvailable = c3PiA11;
        VoiceLiveAvatarUpdateStatusLine voiceLiveAvatarUpdateStatusLine = new VoiceLiveAvatarUpdateStatusLine(hzCA02);
        this.liveAvatarUpdateStatusLine = voiceLiveAvatarUpdateStatusLine;
        C9286GCn c9286GCnA1419 = C3cG.A14(new VoiceEmbodimentStillHandoff(0L, null, null, null, null, 0, 0));
        this._stillHandoff = c9286GCnA1419;
        this.stillHandoff = C3cG.A11(c9286GCnA1419);
        C9286GCn c9286GCnA1420 = C3cG.A14(hrH);
        this._callAvatarImagePath = c9286GCnA1420;
        this.callAvatarImagePath = C3cG.A11(c9286GCnA1420);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(true);
        this._avatarEmbodimentCompatible = c9286GCnA0v;
        this.avatarEmbodimentCompatible = C3cG.A11(c9286GCnA0v);
        C9286GCn c9286GCnA1421 = C3cG.A14(new AvatarStatusVideos(null, null, null, null, null, null));
        this._callStatusVideos = c9286GCnA1421;
        this.callStatusVideos = C3cG.A11(c9286GCnA1421);
        C9286GCn c9286GCnA1422 = C3cG.A14(hrH);
        this._callAvatarEmbodimentCompatible = c9286GCnA1422;
        this.callAvatarEmbodimentCompatible = C3cG.A11(c9286GCnA1422);
        C1BN<VoiceLiveAvatarUpdateStatus> c1bn = voiceLiveAvatarUpdateStatusLine.status;
        this.liveAvatarUpdateStatus = c1bn;
        this.isLiveAvatarUpdating = new MappedStateFlow(c1bn, C131411.INSTANCE);
        C9286GCn c9286GCnA1423 = C3cG.A14(false);
        this._isPreviewActive = c9286GCnA1423;
        this.isPreviewActive = C3cG.A11(c9286GCnA1423);
        this.previewOwners = C3cG.A0k();
        C9286GCn c9286GCnA1424 = C3cG.A14(hrH);
        this._activeThreadId = c9286GCnA1424;
        this.activeThreadId = C3cG.A11(c9286GCnA1424);
        C9286GCn c9286GCnA1425 = C3cG.A14(hrH);
        this._callStateSource = c9286GCnA1425;
        C3pS c3pSA00 = AbstractC05633ui.A00(new VoiceCallStateHolder$special$$inlined$flatMapLatest$1(null), c9286GCnA1425);
        C3Ej c3Ej = C3Ek.A00;
        this.isMuted = AnonymousClass441.A00(false, hzCA02, c3pSA00, c3Ej);
        this.isReconnecting = AnonymousClass441.A00(false, hzCA02, AbstractC05633ui.A00(new VoiceCallStateHolder$special$$inlined$flatMapLatest$2(null), c9286GCnA1425), c3Ej);
        this.botName = AnonymousClass441.A00(null, hzCA02, AbstractC05633ui.A00(new VoiceCallStateHolder$special$$inlined$flatMapLatest$3(null), c9286GCnA1425), c3Ej);
        this.avatarPath = AnonymousClass441.A00(null, hzCA02, AbstractC05633ui.A00(new VoiceCallStateHolder$special$$inlined$flatMapLatest$4(null), c9286GCnA1425), c3Ej);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._restartRequests = c9290GCrA12;
        this.restartRequests = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 1);
        this._endCallRequests = c9290GCrA122;
        this.endCallRequests = C3pd.A00(c9290GCrA122);
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, 1);
        this._outOfCreditsEvents = c9290GCrA123;
        this.outOfCreditsEvents = C3pd.A00(c9290GCrA123);
        C9290GCr c9290GCrA124 = C3cG.A12(num, 0, 1);
        this._connectTimeoutEvents = c9290GCrA124;
        this.connectTimeoutEvents = C3pd.A00(c9290GCrA124);
        C9290GCr c9290GCrA125 = C3cG.A12(num, 0, 1);
        this._capacityUnavailableEvents = c9290GCrA125;
        this.capacityUnavailableEvents = C3pd.A00(c9290GCrA125);
        C9290GCr c9290GCrA126 = C3cG.A12(num, 0, 1);
        this._noNetworkCallBlockedEvents = c9290GCrA126;
        this.noNetworkCallBlockedEvents = C3pd.A00(c9290GCrA126);
        C9290GCr c9290GCrA127 = C3cG.A12(num, 0, 1);
        this._liveAvatarUnavailableEvents = c9290GCrA127;
        this.liveAvatarUnavailableEvents = C3pd.A00(c9290GCrA127);
        C9290GCr c9290GCrA128 = C3cG.A12(num, 0, 1);
        this._networkDropEndEvents = c9290GCrA128;
        this.networkDropEndEvents = C3pd.A00(c9290GCrA128);
        C9290GCr c9290GCrA129 = C3cG.A12(num, 0, 1);
        this._callMovedEvents = c9290GCrA129;
        this.callMovedEvents = C3pd.A00(c9290GCrA129);
        C9290GCr c9290GCrA1210 = C3cG.A12(num, 0, 1);
        this._weakNetworkEvents = c9290GCrA1210;
        this.weakNetworkEvents = C3pd.A00(c9290GCrA1210);
        C9286GCn c9286GCnA1426 = C3cG.A14(false);
        this._isConnectionWeak = c9286GCnA1426;
        this.isConnectionWeak = C3cG.A11(c9286GCnA1426);
        C9290GCr c9290GCrA1211 = C3cG.A12(num, 0, 1);
        this._weakConnectionEvents = c9290GCrA1211;
        this.weakConnectionEvents = C3pd.A00(c9290GCrA1211);
        C9290GCr c9290GCrA1212 = C3cG.A12(num, 0, 1);
        this._serverVideoDisabledEvents = c9290GCrA1212;
        this.serverVideoDisabledEvents = C3pd.A00(c9290GCrA1212);
        C9290GCr c9290GCrA1213 = C3cG.A12(num, 0, 1);
        this._preConnectFailureEvents = c9290GCrA1213;
        this.preConnectFailureEvents = C3pd.A00(c9290GCrA1213);
        C9290GCr c9290GCrA1214 = C3cG.A12(num, 0, 1);
        this._otherCallBlockedStarts = c9290GCrA1214;
        this.otherCallBlockedStarts = C3pd.A00(c9290GCrA1214);
        C9290GCr c9290GCrA1215 = C3cG.A12(num, 0, 1);
        this._callStartHapticEvents = c9290GCrA1215;
        this.callStartHapticEvents = C3pd.A00(c9290GCrA1215);
        this._undeliveredSpeech = C3cG.A14(hrH);
        this._undeliveredSpeechPending = C3cG.A14(hrH);
        C9290GCr c9290GCrA1216 = C3cG.A12(num, 0, 1);
        this._undeliveredSpeechSentEvents = c9290GCrA1216;
        this.undeliveredSpeechSentEvents = C3pd.A00(c9290GCrA1216);
        C9290GCr c9290GCrA1217 = C3cG.A12(num, 0, 1);
        this._toggleMuteRequests = c9290GCrA1217;
        this.toggleMuteRequests = C3pd.A00(c9290GCrA1217);
        C9290GCr c9290GCrA1218 = C3cG.A12(num, 0, 1);
        this._callIdleShownEvents = c9290GCrA1218;
        this.callIdleShownEvents = C3pd.A00(c9290GCrA1218);
        C9290GCr c9290GCrA1219 = C3cG.A12(num, 0, 1);
        this._callIdlePosterShownEvents = c9290GCrA1219;
        this.callIdlePosterShownEvents = C3pd.A00(c9290GCrA1219);
        C9286GCn c9286GCnA1427 = C3cG.A14(0L);
        this._callGeneration = c9286GCnA1427;
        this.callGeneration = C3cG.A11(c9286GCnA1427);
        C9290GCr c9290GCrA1220 = C3cG.A12(num, 0, 8);
        this._callStarted = c9290GCrA1220;
        this.callStarted = C3pd.A00(c9290GCrA1220);
        C9286GCn c9286GCnA1428 = C3cG.A14(0L);
        this._callAttemptGeneration = c9286GCnA1428;
        C3Pi c3PiA115 = C3cG.A11(c9286GCnA1428);
        this.callAttemptGeneration = c3PiA115;
        this.isInputReady = AnonymousClass441.A00(false, hzCA02, C3rb.A00(new C131402(null), AbstractC05633ui.A00(new VoiceCallStateHolder$special$$inlined$flatMapLatest$5(null), c9286GCnA1425), c3PiA11, c3PiA115), c3Ej);
        this.isVoiceSwitchShown = GDB.A01(new VoiceCallStateHolder$special$$inlined$map$1(c3PiA112));
        C9290GCr c9290GCrA1221 = C3cG.A12(num, 0, 1);
        this._liveAvatarUnavailableShown = c9290GCrA1221;
        this.liveAvatarUnavailableShown = C3pd.A00(c9290GCrA1221);
    }

    public static /* synthetic */ void getAvatarPath$annotations() {
    }

    public static /* synthetic */ void getBotName$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFor(PendingThread pendingThread, String str) {
        if (pendingThread != null) {
            Companion companion = Companion;
            if (C7384Etj.areEqual(companion.normalizedThreadId(pendingThread.threadId), companion.normalizedThreadId(str))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void isInputReady$annotations() {
    }

    public static /* synthetic */ void isMuted$annotations() {
    }

    public static /* synthetic */ void isReconnecting$annotations() {
    }

    private final void logLiveAvatarStatusWinner(String str) {
        CFK.A03(str, VoiceCallStateHolderKt.TAG, "live_avatar.status_winner winner=%s");
    }

    private final void logLiveAvatarStatusWinnerIfOverridden() {
        VoiceLiveAvatarUpdateStatus value = this.liveAvatarUpdateStatus.getValue();
        if (value != null) {
            String strLiveAvatarStatusWinner = VoiceLiveAvatarUpdateStatusKt.liveAvatarStatusWinner(C3cH.A1R(this.isReconnecting), value, AbstractC0878AGe.A0k(VoiceLiveAvatarUpdateStatusKt.VOICE_SWITCH_ACTIVITY_DETAILS, this._agentActivity.getValue().activityDetail));
            if (VoiceLiveAvatarUpdateStatusKt.LIVE_AVATAR_WINNER_NOTICE.equals(strLiveAvatarStatusWinner)) {
                return;
            }
            logLiveAvatarStatusWinner(strLiveAvatarStatusWinner);
        }
    }

    private final boolean matchesAgentActivityScopeLocked(String str) {
        String value = this._activeThreadId.getValue();
        if (str == null) {
            if (value == null) {
                return true;
            }
        } else if (str.equals(value)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void publishBotOutputActivityLocked() {
        /*
            r10 = this;
            X.BLG<java.lang.Boolean> r0 = r10._isBotSpeaking
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto Ld
            boolean r0 = r10.botAudioActive
            r6 = 0
            if (r0 == 0) goto Le
        Ld:
            r6 = 1
        Le:
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState> r4 = r10._botOutputActivityState
        L10:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState r2 = (com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState) r2
            long r7 = r2.generation
            if (r6 == 0) goto L20
            boolean r1 = r2.active
            r0 = 1
            if (r1 == 0) goto L21
        L20:
            r0 = 0
        L21:
            long r0 = (long) r0
            long r7 = r7 + r0
            if (r6 != 0) goto L39
            boolean r0 = r2.active
            if (r0 == 0) goto L39
            long r9 = android.os.SystemClock.elapsedRealtime()
        L2d:
            com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState r5 = new com.facebook.aura.partners.voice.intf.VoiceBotOutputActivityState
            r5.<init>(r6, r7, r9)
            boolean r0 = r4.A6e(r3, r5)
            if (r0 == 0) goto L10
            return
        L39:
            long r9 = r2.inactiveAtMs
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.publishBotOutputActivityLocked():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void publishEmbodimentMediaResourcesActive() {
        /*
            r3 = this;
            X.BLG<java.lang.Boolean> r2 = r3._areEmbodimentMediaResourcesActive
            java.util.Set<java.lang.Object> r0 = r3.embodimentRtcRendererOwners
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            java.util.Set<java.lang.Object> r0 = r3.embodimentIdlePlayerOwners
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            X.AnonymousClass004.A1D(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.publishEmbodimentMediaResourcesActive():void");
    }

    public static /* synthetic */ void requestEndCall$default(VoiceCallStateHolder voiceCallStateHolder, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        voiceCallStateHolder.requestEndCall(str, str2, str3);
    }

    private final void resetBotOutputStateLocked() {
        VoiceBotOutputActivityState value;
        Object objA0C = C3cJ.A0C(this._isBotSpeaking, false);
        this.botAudioActive = false;
        AnonymousClass001.A1E(this._botAudioActivityState, objA0C, new VoiceBotAudioActivityState(false));
        BLG<VoiceBotOutputActivityState> blg = this._botOutputActivityState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, new VoiceBotOutputActivityState(false, value.generation, 0L)));
        AnonymousClass001.A1E(this._botAudioLevel, objA0C, AnonymousClass005.A0a());
    }

    private final void restorePendingEmbodimentHide() {
        EmbodimentHideRestoreState embodimentHideRestoreState = this.embodimentHideRestoreState;
        if (embodimentHideRestoreState != null) {
            this.embodimentHideRestoreState = null;
            setEmbodimentDisplayEnabled(embodimentHideRestoreState.displayEnabled, VoiceEmbodimentStateReason.SYSTEM);
        }
    }

    private final void setAgentActivityLocked(VoiceAgentActivity voiceAgentActivity) {
        HoC hoC = this.agentActivityExpiryJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.agentActivityExpiryJob = null;
        long j = this.agentActivityExpiryGeneration + 1;
        this.agentActivityExpiryGeneration = j;
        writeAgentActivityLocked(voiceAgentActivity);
        if (hasFiniteLifetime(voiceAgentActivity.status)) {
            this.agentActivityExpiryJob = AnonymousClass001.A11(new C131461(j, null), this.scope);
        }
    }

    public static /* synthetic */ void setAgentActivityStatusForMatchingThread$default(VoiceCallStateHolder voiceCallStateHolder, String str, AgentActivityStatus agentActivityStatus, String str2, String str3, String str4, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        voiceCallStateHolder.setAgentActivityStatusForMatchingThread(str, agentActivityStatus, str2, str3, str4, function0);
    }

    private final void setBotSpeakingLocked(boolean z) {
        AnonymousClass004.A1D(z, this._isBotSpeaking);
        publishBotOutputActivityLocked();
    }

    public static /* synthetic */ void setEmbodimentDisplayEnabled$default(VoiceCallStateHolder voiceCallStateHolder, boolean z, VoiceEmbodimentStateReason voiceEmbodimentStateReason, int i, Object obj) {
        if ((i & 2) != 0) {
            voiceEmbodimentStateReason = VoiceEmbodimentStateReason.DISPLAY_TOGGLE;
        }
        voiceCallStateHolder.setEmbodimentDisplayEnabled(z, voiceEmbodimentStateReason);
    }

    private final void writeAgentActivityLocked(VoiceAgentActivity voiceAgentActivity) {
        this.agentActivityRevision++;
        String str = this._agentActivity.getValue().activityDetail;
        Set<String> set = VoiceLiveAvatarUpdateStatusKt.VOICE_SWITCH_ACTIVITY_DETAILS;
        boolean zA0k = AbstractC0878AGe.A0k(set, str);
        this._agentActivity.Af8(voiceAgentActivity);
        boolean zA0k2 = AbstractC0878AGe.A0k(set, voiceAgentActivity.activityDetail);
        VoiceLiveAvatarUpdateStatus value = this.liveAvatarUpdateStatus.getValue();
        if (zA0k2 == zA0k || value == null) {
            return;
        }
        logLiveAvatarStatusWinner(VoiceLiveAvatarUpdateStatusKt.liveAvatarStatusWinner(C3cH.A1R(this.isReconnecting), value, zA0k2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitUndeliveredSpeechSettled(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.AnonymousClass1
            if (r0 == 0) goto L37
            r5 = r7
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$1 r5 = (com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$PendingThread> r2 = r6._undeliveredSpeechPending
            r1 = 0
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$2 r0 = new com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L20
            return r4
        L37:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$1 r5 = new com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$awaitUndeliveredSpeechSettled$1
            r5.<init>(r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.awaitUndeliveredSpeechSettled(X.HtJ):java.lang.Object");
    }

    public final void clearActiveAppAudioCall(String str) {
        ActiveAppAudioCall value;
        ActiveAppAudioCall activeAppAudioCall;
        if (str != null) {
            BLG<ActiveAppAudioCall> blg = this._activeAppAudioCall;
            do {
                value = blg.getValue();
                activeAppAudioCall = value;
                if (activeAppAudioCall == null || str.equals(activeAppAudioCall.callId)) {
                    activeAppAudioCall = null;
                }
            } while (!blg.A6e(value, activeAppAudioCall));
        }
    }

    public final C1BN<ActiveAppAudioCall> getActiveAppAudioCall() {
        return this.activeAppAudioCall;
    }

    public final C1BN<String> getActiveThreadId() {
        return this.activeThreadId;
    }

    public final C1BN<VoiceAgentActivity> getAgentActivity() {
        return this.agentActivity;
    }

    public final C1BN<AgentActivityStatus> getAgentActivityStatus() {
        return this.agentActivityStatus;
    }

    public final C1BN<Boolean> getAreEmbodimentMediaResourcesActive() {
        return this.areEmbodimentMediaResourcesActive;
    }

    public final C1BN<Boolean> getAvatarEmbodimentCompatible() {
        return this.avatarEmbodimentCompatible;
    }

    public final C1BN<String> getAvatarPath() {
        return this.avatarPath;
    }

    public final C1BN<VoiceBotAudioActivityState> getBotAudioActivityState() {
        return this.botAudioActivityState;
    }

    public final C1BN<Float> getBotAudioLevel() {
        return this.botAudioLevel;
    }

    public final C1BN<String> getBotName() {
        return this.botName;
    }

    public final C1BN<VoiceBotOutputActivityState> getBotOutputActivityState() {
        return this.botOutputActivityState;
    }

    public final C1BN<Long> getCallAttemptGeneration() {
        return this.callAttemptGeneration;
    }

    public final C1BN<Boolean> getCallAvatarEmbodimentCompatible() {
        return this.callAvatarEmbodimentCompatible;
    }

    public final C1BN<String> getCallAvatarImagePath() {
        return this.callAvatarImagePath;
    }

    public final C1BN<Long> getCallGeneration() {
        return this.callGeneration;
    }

    public final C22I<Unit> getCallIdlePosterShownEvents() {
        return this.callIdlePosterShownEvents;
    }

    public final C22I<Unit> getCallIdleShownEvents() {
        return this.callIdleShownEvents;
    }

    public final C22I<Unit> getCallMovedEvents() {
        return this.callMovedEvents;
    }

    public final long getCallStartElapsedRealtimeMs() {
        return this.callStartElapsedRealtimeMs;
    }

    public final C22I<Long> getCallStartHapticEvents() {
        return this.callStartHapticEvents;
    }

    public final C22I<Long> getCallStarted() {
        return this.callStarted;
    }

    public final C1BN<AvatarStatusVideos> getCallStatusVideos() {
        return this.callStatusVideos;
    }

    public final C22I<Unit> getCapacityUnavailableEvents() {
        return this.capacityUnavailableEvents;
    }

    public final C22I<Unit> getConnectTimeoutEvents() {
        return this.connectTimeoutEvents;
    }

    public final C1BN<Boolean> getEmbodimentAvailable() {
        return this.embodimentAvailable;
    }

    public final C1BN<VoiceEmbodimentCallState> getEmbodimentCallState() {
        return this.embodimentCallState;
    }

    public final C1BN<VoiceEmbodimentPlacement> getEmbodimentInAppPlacement() {
        return this.embodimentInAppPlacement;
    }

    public final C1BN<VoiceEmbodimentMedia> getEmbodimentMedia() {
        return this.embodimentMedia;
    }

    public final C1BN<Boolean> getEmbodimentMediaRevealed() {
        return this.embodimentMediaRevealed;
    }

    public final C1BN<VoiceEmbodimentPaintedMedia> getEmbodimentPaintedMedia() {
        return this.embodimentPaintedMedia;
    }

    public final C1BN<VoiceEmbodimentPaintedMedia> getEmbodimentTakeoverIdleMedia() {
        return this.embodimentTakeoverIdleMedia;
    }

    public final C1BN<VoiceEmbodimentVideoSuppression> getEmbodimentVideoSuppression() {
        return this.embodimentVideoSuppression;
    }

    public final C1BN<VoiceEmbodimentVisibleMedia> getEmbodimentVisibleMedia() {
        return this.embodimentVisibleMedia;
    }

    public final C22I<VoiceEndCallRequest> getEndCallRequests() {
        return this.endCallRequests;
    }

    public final boolean getKeepAssistantCallInBackground() {
        return this.keepAssistantCallInBackground;
    }

    public final C22I<String> getLiveAvatarUnavailableEvents() {
        return this.liveAvatarUnavailableEvents;
    }

    public final C22I<String> getLiveAvatarUnavailableShown() {
        return this.liveAvatarUnavailableShown;
    }

    public final C1BN<VoiceLiveAvatarUpdateStatus> getLiveAvatarUpdateStatus() {
        return this.liveAvatarUpdateStatus;
    }

    public final C22I<Unit> getNetworkDropEndEvents() {
        return this.networkDropEndEvents;
    }

    public final C22I<Unit> getNoNetworkCallBlockedEvents() {
        return this.noNetworkCallBlockedEvents;
    }

    public final C22I<OtherCallBlockedStart> getOtherCallBlockedStarts() {
        return this.otherCallBlockedStarts;
    }

    public final C22I<Unit> getOutOfCreditsEvents() {
        return this.outOfCreditsEvents;
    }

    public final C1BN<Long> getPendingCallStart() {
        return this.pendingCallStart;
    }

    public final C22I<VoicePreConnectFailure> getPreConnectFailureEvents() {
        return this.preConnectFailureEvents;
    }

    public final C22I<String> getRestartRequests() {
        return this.restartRequests;
    }

    public final C22I<Unit> getServerVideoDisabledEvents() {
        return this.serverVideoDisabledEvents;
    }

    public final C1BN<VoiceEmbodimentStillHandoff> getStillHandoff() {
        return this.stillHandoff;
    }

    public final C1BN<VoiceCallSurfaceState> getSurfaceState() {
        return this.surfaceState;
    }

    public final C22I<Unit> getToggleMuteRequests() {
        return this.toggleMuteRequests;
    }

    public final C22I<Unit> getUndeliveredSpeechSentEvents() {
        return this.undeliveredSpeechSentEvents;
    }

    public final C22I<Unit> getWeakConnectionEvents() {
        return this.weakConnectionEvents;
    }

    public final C22I<Unit> getWeakNetworkEvents() {
        return this.weakNetworkEvents;
    }

    public final void hideLiveAvatarUpdateStatus() {
        this.liveAvatarUpdateStatusLine.hide();
    }

    public final C1BN<Boolean> isBotAudioActive() {
        return this.isBotAudioActive;
    }

    public final C1BN<Boolean> isBotSpeaking() {
        return this.isBotSpeaking;
    }

    public final C1BN<Boolean> isCallActive() {
        return this.isCallActive;
    }

    public final C1BN<Boolean> isCompactPresentationActive() {
        return this.isCompactPresentationActive;
    }

    public final C1BN<Boolean> isConnectionWeak() {
        return this.isConnectionWeak;
    }

    public final C1BN<Boolean> isEmbodimentDisplayEnabled() {
        return this.isEmbodimentDisplayEnabled;
    }

    public final C1BN<Boolean> isEmbodimentVisible() {
        return this.isEmbodimentVisible;
    }

    public final C1BN<Boolean> isInputReady() {
        return this.isInputReady;
    }

    public final C1BN<Boolean> isLiveAvatarUpdating() {
        return this.isLiveAvatarUpdating;
    }

    public final C1BN<Boolean> isMuteControlAvailable() {
        return this.isMuteControlAvailable;
    }

    public final C1BN<Boolean> isMuted() {
        return this.isMuted;
    }

    public final C1BN<Boolean> isPreviewActive() {
        return this.isPreviewActive;
    }

    public final C1BN<Boolean> isReconnecting() {
        return this.isReconnecting;
    }

    public final C20Q<Boolean> isReconnectingStatusShown(String str) {
        return GDB.A01(C3rb.A00(new C131421(str, null), this.isReconnecting, this.isCallActive, this.activeThreadId));
    }

    public final boolean isUndeliveredSpeechPending(String str) {
        return isFor(this._undeliveredSpeechPending.getValue(), str);
    }

    public final C20Q<Boolean> isVoiceSwitchShown() {
        return this.isVoiceSwitchShown;
    }

    public final C20Q<VoiceLiveAvatarUpdateStatus> liveAvatarUpdateStatusShown(String str) {
        return GDB.A01(new AnonymousClass603(3, new C131431(str, null), new C20Q[]{this.liveAvatarUpdateStatus, this.isCallActive, this.activeThreadId, this.embodimentMedia, this.callAvatarEmbodimentCompatible}));
    }

    public final void notifyCallIdlePosterShown() {
        if (AnonymousClass003.A1Z(this._isCallActive)) {
            AnonymousClass002.A1I(this._embodimentTakeoverIdleMedia, VoiceEmbodimentPaintedMedia.STATIC);
        }
        C3cG.A1I(this._callIdlePosterShownEvents);
    }

    public final void notifyCallIdleShown() {
        if (AnonymousClass003.A1Z(this._isCallActive)) {
            AnonymousClass002.A1I(this._embodimentTakeoverIdleMedia, VoiceEmbodimentPaintedMedia.IDLE);
        }
        C3cG.A1I(this._callIdleShownEvents);
    }

    public final void notifyCallMoved() {
        C3cG.A1I(this._callMovedEvents);
    }

    public final void notifyCapacityUnavailable() {
        C3cG.A1I(this._capacityUnavailableEvents);
    }

    public final void notifyConnectTimeout() {
        C3cG.A1I(this._connectTimeoutEvents);
    }

    public final void notifyNetworkDropEnd() {
        C3cG.A1I(this._networkDropEndEvents);
    }

    public final void notifyNoNetworkCallBlocked() {
        C3cG.A1I(this._noNetworkCallBlockedEvents);
    }

    public final void notifyOtherCallBlockedStart(String str) {
        this._otherCallBlockedStarts.AhV(new OtherCallBlockedStart(str));
    }

    public final void notifyOutOfCredits() {
        C3cG.A1I(this._outOfCreditsEvents);
    }

    public final void notifyServerVideoDisabled() {
        C3cG.A1I(this._serverVideoDisabledEvents);
    }

    public final void notifyWeakConnection() {
        C3cG.A1I(this._weakConnectionEvents);
    }

    public final void notifyWeakNetwork() {
        C3cG.A1I(this._weakNetworkEvents);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object offerUndeliveredSpeech(java.lang.String r9, java.lang.String r10, java.lang.String r11, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.C131441
            if (r0 == 0) goto L85
            r5 = r12
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$1 r5 = (com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.C131441) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r3 = r5.label
            r4 = 2
            r1 = 1
            r2 = 0
            if (r3 == 0) goto L3b
            if (r3 == r1) goto L33
            if (r3 != r4) goto L8b
            X.Hwg.A00(r0)
        L24:
            r6 = r0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L32
            X.3Em<kotlin.Unit> r0 = r8._undeliveredSpeechSentEvents
            X.C3cG.A1I(r0)
        L32:
            return r6
        L33:
            java.lang.Object r3 = r5.L$3
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer r3 = (com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.UndeliveredSpeechOffer) r3
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L91
            goto L60
        L3b:
            X.Hwg.A00(r0)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer r3 = new com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer
            r3.<init>(r9, r10, r11)
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer> r0 = r8._undeliveredSpeech
            X.AnonymousClass001.A1E(r0, r2, r3)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$2 r7 = new com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$2     // Catch: java.lang.Throwable -> L91
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L91
            r5.L$0 = r2     // Catch: java.lang.Throwable -> L91
            r5.L$1 = r2     // Catch: java.lang.Throwable -> L91
            r5.L$2 = r2     // Catch: java.lang.Throwable -> L91
            r5.L$3 = r3     // Catch: java.lang.Throwable -> L91
            r5.label = r1     // Catch: java.lang.Throwable -> L91
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.GAX.A01(r5, r7, r0)     // Catch: java.lang.Throwable -> L91
            if (r0 != r6) goto L60
            goto L90
        L60:
            X.Hsz<java.lang.Boolean> r1 = r3.claimed
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            X.C3cG.A1F(r1, r0)
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer> r1 = r8._undeliveredSpeech
            X.GCn r1 = (X.C9286GCn) r1
            X.HrH r0 = X.HwN.A01
            X.C9286GCn.A00(r3, r0, r1)
            X.Hsz<java.lang.Boolean> r0 = r3.claimed
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r2
            r5.L$3 = r2
            r5.label = r4
            java.lang.Object r0 = X.C3cG.A0W(r0, r5)
            if (r0 != r6) goto L24
            return r6
        L85:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$1 r5 = new com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$offerUndeliveredSpeech$1
            r5.<init>(r12)
            goto L12
        L8b:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L90:
            return r6
        L91:
            r2 = move-exception
            X.Hsz<java.lang.Boolean> r1 = r3.claimed
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            X.C3cG.A1F(r1, r0)
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$UndeliveredSpeechOffer> r1 = r8._undeliveredSpeech
            X.GCn r1 = (X.C9286GCn) r1
            X.HrH r0 = X.HwN.A01
            X.C9286GCn.A00(r3, r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.offerUndeliveredSpeech(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void requestEndCall(String str, String str2, String str3) {
        this._endCallRequests.AhV(new VoiceEndCallRequest(str, str2, str3));
    }

    public final void requestRestart(String str) {
        this._restartRequests.AhV(str);
    }

    public final void requestToggleMute() {
        C3cG.A1I(this._toggleMuteRequests);
    }

    public final void setAvatarEmbodimentCompatible(boolean z) {
        AnonymousClass004.A1D(z, this._avatarEmbodimentCompatible);
    }

    public final void setCallAvatarEmbodimentCompatible(Boolean bool) {
        this._callAvatarEmbodimentCompatible.Af8(bool);
    }

    public final void setCallAvatarImagePath(String str) {
        this._callAvatarImagePath.Af8(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEmbodimentMedia(com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia r4) {
        /*
            r3 = this;
            X.BLG<com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState> r3 = r3._surfaceState
        L2:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState r1 = (com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState) r1
            if (r4 != 0) goto L1b
            boolean r0 = com.facebook.aura.partners.voice.intf.VoiceCallStateKt.isEmbodimentDisplayEnabled(r1)
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Unavailable r1 = new com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Unavailable
            r1.<init>(r0)
        L14:
            boolean r0 = r3.A6e(r2, r1)
            if (r0 == 0) goto L2
            return
        L1b:
            boolean r0 = r1 instanceof com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState.Unavailable
            if (r0 == 0) goto L2b
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Unavailable r1 = (com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState.Unavailable) r1
            boolean r0 = r1.displayEnabled
            if (r0 == 0) goto L3d
        L25:
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Loading r1 = new com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Loading
            r1.<init>(r4)
            goto L14
        L2b:
            boolean r0 = r1 instanceof com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState.Hidden
            if (r0 != 0) goto L3d
            boolean r0 = r1 instanceof com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState.Loading
            if (r0 != 0) goto L25
            boolean r0 = r1 instanceof com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState.Visible
            if (r0 == 0) goto L14
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Visible r1 = new com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Visible
            r1.<init>(r4)
            goto L14
        L3d:
            com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Hidden r1 = new com.facebook.aura.partners.voice.intf.VoiceCallSurfaceState$Hidden
            r1.<init>(r4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.setEmbodimentMedia(com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia):void");
    }

    public final void setEmbodimentVisible(boolean z) {
        VoiceCallSurfaceState value;
        VoiceCallSurfaceState loading;
        BLG<VoiceCallSurfaceState> blg = this._surfaceState;
        do {
            value = blg.getValue();
            loading = value;
            if (loading instanceof VoiceCallSurfaceState.Loading) {
                if (z) {
                    loading = new VoiceCallSurfaceState.Visible(((VoiceCallSurfaceState.Loading) loading).media);
                }
            } else if (loading instanceof VoiceCallSurfaceState.Visible) {
                if (!z) {
                    loading = new VoiceCallSurfaceState.Loading(((VoiceCallSurfaceState.Visible) loading).media);
                }
            } else if (!(loading instanceof VoiceCallSurfaceState.Hidden) && !(loading instanceof VoiceCallSurfaceState.Unavailable)) {
                throw C3cG.A0q();
            }
        } while (!blg.A6e(value, loading));
    }

    public final PendingThread setUndeliveredSpeechPending(String str) {
        PendingThread pendingThread = new PendingThread(str);
        AnonymousClass002.A1I(this._undeliveredSpeechPending, pendingThread);
        return pendingThread;
    }

    public final void showLiveAvatarUpdateStatus() {
        this.liveAvatarUpdateStatusLine.showUpdating();
        logLiveAvatarStatusWinnerIfOverridden();
    }

    public final C20Q<UndeliveredSpeechOffer> undeliveredSpeech(String str) {
        return new VoiceCallStateHolder$undeliveredSpeech$$inlined$filter$2(new VoiceCallStateHolder$undeliveredSpeech$$inlined$filter$1(new C10649I0t(this._undeliveredSpeech, 2), str));
    }

    public final C20Q<Boolean> undeliveredSpeechPending(String str) {
        return GDB.A01(new VoiceCallStateHolder$undeliveredSpeechPending$$inlined$map$1(this._undeliveredSpeechPending, this, str));
    }

    private final boolean hasFiniteLifetime(AgentActivityStatus agentActivityStatus) {
        switch (agentActivityStatus.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                throw C3cG.A0q();
        }
    }

    public final void compareAndSetEmbodimentMedia(VoiceEmbodimentMedia voiceEmbodimentMedia, VoiceEmbodimentMedia voiceEmbodimentMedia2) {
        VoiceCallSurfaceState value;
        VoiceCallSurfaceState visible;
        AnonymousClass003.A0u(voiceEmbodimentMedia, voiceEmbodimentMedia2);
        BLG<VoiceCallSurfaceState> blg = this._surfaceState;
        do {
            value = blg.getValue();
            visible = value;
            if (C7384Etj.areEqual(VoiceCallStateKt.getEmbodimentMedia(visible), voiceEmbodimentMedia) && !(visible instanceof VoiceCallSurfaceState.Unavailable)) {
                if (visible instanceof VoiceCallSurfaceState.Hidden) {
                    visible = new VoiceCallSurfaceState.Hidden(voiceEmbodimentMedia2);
                } else if (visible instanceof VoiceCallSurfaceState.Loading) {
                    visible = new VoiceCallSurfaceState.Loading(voiceEmbodimentMedia2);
                } else {
                    if (!(visible instanceof VoiceCallSurfaceState.Visible)) {
                        throw C3cG.A0q();
                    }
                    visible = new VoiceCallSurfaceState.Visible(voiceEmbodimentMedia2);
                }
            }
        } while (!blg.A6e(value, visible));
    }

    public /* synthetic */ VoiceCallStateHolder(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void clearActiveAppAudioCall() {
        this._activeAppAudioCall.Af8(null);
    }
}
