package com.facebook.aura.composer.dictation.voyager;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.BV4;
import X.BV8;
import X.C06H;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GBK;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.Hy1;
import android.os.SystemClock;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.aura.network.transport.HatchWebSocket;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsEvent;
import com.facebook.aura.network.transport.HatchWsMessage;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VoyagerAsrClient {
    public static final int ABNORMAL_CLOSE_CODE = 1006;
    public static final Companion Companion = new Companion();
    public static final long PENDING_AUDIO_RELEASE_INTERVAL_MS = 50;
    public static final String TAG = "VoyagerAsrClient";
    public static final String WS_URL = "wss://shortwave.facebook.com/voyager/v1/asr/duplex";
    public final VoyagerAsrAudioEncoding audioEncoding;
    public final String clientSessionId;
    public volatile boolean closed;
    public volatile long connectStartedAtMs;
    public volatile Long connectToOpenMs;
    public volatile HoC handshakeTimeoutJob;
    public final Function0<List<String>> languageBias;
    public final VoyagerAsrMode mode;
    public final String model;
    public Function0<Unit> onAcknowledged;
    public G0V<? super Long, ? super Boolean, Unit> onAudioDropped;
    public G0U<? super Integer, Unit> onAudioSent;
    public G0U<? super VoyagerAsrResult, Unit> onClosed;
    public G0U<? super String, Unit> onFinal;
    public G0U<? super String, Unit> onPartial;
    public Function0<Unit> onSpeechEnd;
    public Function0<Unit> onSpeechStart;
    public volatile Long openToAckMs;
    public volatile boolean opened;
    public volatile long openedAtMs;
    public final C3UX scope;
    public volatile boolean serverAnswered;
    public volatile HatchWebSocketSession session;
    public final AtomicBoolean terminalNotificationHandled;
    public volatile Long transcribedMs;
    public volatile VoyagerAsrSession voyagerSession;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final GBK newSerialDispatcherOnSharedIoExecutor() {
            int i = AuraExecutors.CORE_POOL_SIZE;
            return new Hy1(new AuraExecutors.SerialExecutor(F0C.A05()));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(int i) {
            G0U<? super Integer, Unit> g0u = VoyagerAsrClient.this.onAudioSent;
            if (g0u != null) {
                g0u.invoke(Integer.valueOf(i));
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$3", f = "VoyagerAsrClient.kt", l = {FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerAsrClient.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoyagerAsrClient.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(10000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrClient.this.voyagerSession;
            if (voyagerAsrSession != null) {
                voyagerAsrSession.onHandshakeTimeout();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$4", f = "VoyagerAsrClient.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerAsrClient.this.new AnonymousClass4(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoyagerAsrClient.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrClient.this.voyagerSession;
            if (voyagerAsrSession != null) {
                voyagerAsrSession.prepareAudioEncoder();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$5", f = "VoyagerAsrClient.kt", l = {185}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchWebSocketSession $newSession;
        public final /* synthetic */ String $sessionId;
        public int label;
        public final /* synthetic */ VoyagerAsrClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchWebSocketSession hatchWebSocketSession, VoyagerAsrClient voyagerAsrClient, String str, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$newSession = hatchWebSocketSession;
            this.this$0 = voyagerAsrClient;
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass5(this.$newSession, this.this$0, this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q<HatchWsMessage> incomingMessages = this.$newSession.getIncomingMessages();
                    final VoyagerAsrClient voyagerAsrClient = this.this$0;
                    C20Z<? super HatchWsMessage> c20z = new C20Z() { // from class: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient.start.5.1
                        public final Object emit(HatchWsMessage hatchWsMessage, HtJ<? super Unit> htJ) {
                            if (hatchWsMessage instanceof HatchWsMessage.Text) {
                                VoyagerAsrSession voyagerAsrSession = voyagerAsrClient.voyagerSession;
                                if (voyagerAsrSession != null) {
                                    voyagerAsrSession.onTextMessage(((HatchWsMessage.Text) hatchWsMessage).text);
                                }
                            } else {
                                if (!(hatchWsMessage instanceof HatchWsMessage.Binary)) {
                                    throw C3cG.A0q();
                                }
                                VoyagerAsrSession voyagerAsrSession2 = voyagerAsrClient.voyagerSession;
                                if (voyagerAsrSession2 != null) {
                                    voyagerAsrSession2.onFailure();
                                }
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((HatchWsMessage) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (incomingMessages.collect(c20z, this) == enumC10460Hji) {
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
                CFK.A08(VoyagerAsrClient.TAG, "incomingMessages collect failed", e2);
                this.this$0.notifyClosed(new VoyagerAsrResult("message_collection_failure", this.$sessionId, false, DictationOutcome.FAILED, null, false));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass5) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$6", f = "VoyagerAsrClient.kt", l = {202}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$start$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchWebSocketSession $newSession;
        public final /* synthetic */ String $sessionId;
        public int label;
        public final /* synthetic */ VoyagerAsrClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchWebSocketSession hatchWebSocketSession, VoyagerAsrClient voyagerAsrClient, String str, HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
            this.$newSession = hatchWebSocketSession;
            this.this$0 = voyagerAsrClient;
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass6(this.$newSession, this.this$0, this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q<HatchWsEvent> connectionEvents = this.$newSession.getConnectionEvents();
                    final VoyagerAsrClient voyagerAsrClient = this.this$0;
                    C20Z<? super HatchWsEvent> c20z = new C20Z() { // from class: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient.start.6.1
                        public final Object emit(HatchWsEvent hatchWsEvent, HtJ<? super Unit> htJ) {
                            if (hatchWsEvent instanceof HatchWsEvent.Open) {
                                voyagerAsrClient.onOpen();
                            } else if (hatchWsEvent instanceof HatchWsEvent.Failed) {
                                HatchWsEvent.Failed failed = (HatchWsEvent.Failed) hatchWsEvent;
                                CFK.A04(VoyagerAsrClient.TAG, AnonymousClass007.A0a("Socket failed: ", failed.failure));
                                if (failed.failure.httpCode != null) {
                                    voyagerAsrClient.serverAnswered = true;
                                }
                                VoyagerAsrSession voyagerAsrSession = voyagerAsrClient.voyagerSession;
                                if (voyagerAsrSession != null) {
                                    voyagerAsrSession.onFailure();
                                }
                            } else if (hatchWsEvent instanceof HatchWsEvent.Closed) {
                                HatchWsEvent.Closed closed = (HatchWsEvent.Closed) hatchWsEvent;
                                if (closed.code != 1006) {
                                    voyagerAsrClient.serverAnswered = true;
                                }
                                VoyagerAsrSession voyagerAsrSession2 = voyagerAsrClient.voyagerSession;
                                if (voyagerAsrSession2 != null) {
                                    voyagerAsrSession2.onClosed(closed.code);
                                }
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((HatchWsEvent) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (connectionEvents.collect(c20z, this) == enumC10460Hji) {
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
                CFK.A08(VoyagerAsrClient.TAG, "connectionEvents collect failed", e2);
                this.this$0.notifyClosed(new VoyagerAsrResult("event_collection_failure", this.$sessionId, false, DictationOutcome.FAILED, null, false));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass6) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$startReleasingPendingAudio$1", f = "VoyagerAsrClient.kt", l = {278}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient$startReleasingPendingAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C111651 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C111651(HtJ<? super C111651> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerAsrClient.this.new C111651(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoyagerAsrClient.this.new C111651(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                try {
                    Hwg.A00(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A08(VoyagerAsrClient.TAG, "pending audio release failed", e2);
                    VoyagerAsrClient voyagerAsrClient = VoyagerAsrClient.this;
                    voyagerAsrClient.notifyClosed(new VoyagerAsrResult("audio_send_failure", voyagerAsrClient.clientSessionId, false, DictationOutcome.FAILED, null, false));
                }
            }
            do {
                VoyagerAsrSession voyagerAsrSession = VoyagerAsrClient.this.voyagerSession;
                if (voyagerAsrSession == null || !voyagerAsrSession.releasePendingAudio()) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
            } while (C7Bq.A01(50L, this) != enumC10460Hji);
            return enumC10460Hji;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoyagerAsrClient(VoyagerAsrMode voyagerAsrMode, String str, String str2, Function0<? extends List<String>> function0, VoyagerAsrAudioEncoding voyagerAsrAudioEncoding) {
        C7384Etj.A0Y(voyagerAsrMode, 0);
        AnonymousClass005.A11(str, str2, function0, 1);
        C7384Etj.A0Y(voyagerAsrAudioEncoding, 4);
        this.mode = voyagerAsrMode;
        this.clientSessionId = str;
        this.model = str2;
        this.languageBias = function0;
        this.audioEncoding = voyagerAsrAudioEncoding;
        this.scope = C78W.A05(new C8eO(null), Companion.newSerialDispatcherOnSharedIoExecutor());
        this.terminalNotificationHandled = BV4.A12(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void cancelHandshakeTimeout() {
        HoC hoC = this.handshakeTimeoutJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.handshakeTimeoutJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOpen() {
        synchronized (this) {
            if (!this.closed && !this.opened) {
                this.opened = true;
                this.openedAtMs = SystemClock.elapsedRealtime();
                this.connectToOpenMs = Long.valueOf(this.openedAtMs - this.connectStartedAtMs);
                VoyagerAsrSession voyagerAsrSession = this.voyagerSession;
                if (voyagerAsrSession != null) {
                    voyagerAsrSession.onOpen(this.languageBias.invoke());
                }
            }
        }
    }

    public final void appendPcm(byte[] bArr) {
        VoyagerAsrSession voyagerAsrSession;
        C7384Etj.A0Y(bArr, 0);
        synchronized (this) {
            voyagerAsrSession = this.voyagerSession;
        }
        if (voyagerAsrSession != null) {
            voyagerAsrSession.appendAudio(bArr);
        }
    }

    public final synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            if (!this.opened) {
                CFK.A06(TAG, "close: socket never opened; cancelling Voyager session");
            }
            this.terminalNotificationHandled.set(true);
            VoyagerAsrSession voyagerAsrSession = this.voyagerSession;
            if (voyagerAsrSession != null) {
                voyagerAsrSession.cancel();
            }
            this.voyagerSession = null;
            HatchWebSocketSession hatchWebSocketSession = this.session;
            if (hatchWebSocketSession != null) {
                hatchWebSocketSession.close(1000, null);
            }
            this.session = null;
            HoC hoC = this.handshakeTimeoutJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.handshakeTimeoutJob = null;
            Hxb.A03(null, this.scope);
        }
    }

    public final void endAudio() {
        VoyagerAsrSession voyagerAsrSession;
        synchronized (this) {
            voyagerAsrSession = this.voyagerSession;
        }
        if (voyagerAsrSession != null) {
            voyagerAsrSession.endAudio();
        }
    }

    public final class VoyagerSocket implements VoyagerAsrSocket {
        public final G0U<Integer, Unit> onAudioSent;
        public final HatchWebSocketSession session;

        @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrSocket
        public boolean send(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            try {
                boolean zSend = this.session.send(bArr);
                if (zSend) {
                    this.onAudioSent.invoke(Integer.valueOf(bArr.length));
                }
                return zSend;
            } catch (Exception e) {
                CFK.A08(VoyagerAsrClient.TAG, "Failed to send Voyager audio frame", e);
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VoyagerSocket(HatchWebSocketSession hatchWebSocketSession, G0U<? super Integer, Unit> g0u) {
            AnonymousClass003.A0u(hatchWebSocketSession, g0u);
            this.session = hatchWebSocketSession;
            this.onAudioSent = g0u;
        }

        @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrSocket
        public boolean send(String str) {
            C7384Etj.A0Y(str, 0);
            try {
                return this.session.send(str);
            } catch (Exception e) {
                CFK.A08(VoyagerAsrClient.TAG, "Failed to send Voyager text frame", e);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyClosed(VoyagerAsrResult voyagerAsrResult) {
        if (C3cI.A1W(this.terminalNotificationHandled)) {
            G0U<? super VoyagerAsrResult, Unit> g0u = this.onClosed;
            if (g0u != null) {
                g0u.invoke(voyagerAsrResult);
            }
            close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startReleasingPendingAudio() {
        AnonymousClass001.A1J(new C111651(null), this.scope);
    }

    public final Long getConnectToOpenMs() {
        return this.connectToOpenMs;
    }

    public final Function0<Unit> getOnAcknowledged() {
        return this.onAcknowledged;
    }

    public final G0V<Long, Boolean, Unit> getOnAudioDropped() {
        return this.onAudioDropped;
    }

    public final G0U<Integer, Unit> getOnAudioSent() {
        return this.onAudioSent;
    }

    public final G0U<VoyagerAsrResult, Unit> getOnClosed() {
        return this.onClosed;
    }

    public final G0U<String, Unit> getOnFinal() {
        return this.onFinal;
    }

    public final G0U<String, Unit> getOnPartial() {
        return this.onPartial;
    }

    public final Function0<Unit> getOnSpeechEnd() {
        return this.onSpeechEnd;
    }

    public final Function0<Unit> getOnSpeechStart() {
        return this.onSpeechStart;
    }

    public final Long getOpenToAckMs() {
        return this.openToAckMs;
    }

    public final Long getTranscribedMs() {
        return this.transcribedMs;
    }

    public final boolean hasReceivedFinal() {
        VoyagerAsrSession voyagerAsrSession = this.voyagerSession;
        return voyagerAsrSession != null && voyagerAsrSession.hasReceivedFinal;
    }

    public final long pendingAudioMs() {
        VoyagerAsrSession voyagerAsrSession = this.voyagerSession;
        if (voyagerAsrSession != null) {
            return voyagerAsrSession.pendingAudioMs();
        }
        return 0L;
    }

    public final void setOnAcknowledged(Function0<Unit> function0) {
        this.onAcknowledged = function0;
    }

    public final void setOnAudioDropped(G0V<? super Long, ? super Boolean, Unit> g0v) {
        this.onAudioDropped = g0v;
    }

    public final void setOnAudioSent(G0U<? super Integer, Unit> g0u) {
        this.onAudioSent = g0u;
    }

    public final void setOnClosed(G0U<? super VoyagerAsrResult, Unit> g0u) {
        this.onClosed = g0u;
    }

    public final void setOnFinal(G0U<? super String, Unit> g0u) {
        this.onFinal = g0u;
    }

    public final void setOnPartial(G0U<? super String, Unit> g0u) {
        this.onPartial = g0u;
    }

    public final void setOnSpeechEnd(Function0<Unit> function0) {
        this.onSpeechEnd = function0;
    }

    public final void setOnSpeechStart(Function0<Unit> function0) {
        this.onSpeechStart = function0;
    }

    public final synchronized boolean start(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.session != null || this.closed) {
            CFK.A06(TAG, "start: client already started or closed; instances are single-use");
        } else {
            String str2 = this.clientSessionId;
            String strA0M = FGI.A0M("wss://shortwave.facebook.com/voyager/v1/asr/duplex?sessionId=", str2);
            HatchWebSocket hatchWebSocketWebSocket = HatchTransport.INSTANCE.webSocket(HatchAuthScheme.META_UNAUTH);
            this.connectStartedAtMs = SystemClock.elapsedRealtime();
            try {
                HatchWebSocketSession hatchWebSocketSessionConnect = hatchWebSocketWebSocket.connect(BV8.A0d(null, strA0M, AGH.A0E()));
                this.session = hatchWebSocketSessionConnect;
                this.voyagerSession = new VoyagerAsrSession(new VoyagerSocket(hatchWebSocketSessionConnect, new AnonymousClass1()), str, this.model, this.mode, str2, new VoyagerAsrListener() { // from class: com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient.start.2
                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onCompleted(VoyagerAsrCompletion voyagerAsrCompletion) {
                        C7384Etj.A0Y(voyagerAsrCompletion, 0);
                        VoyagerAsrClient.this.notifyClosed(new VoyagerAsrResult(voyagerAsrCompletion.terminalReason, voyagerAsrCompletion.sessionId, voyagerAsrCompletion.usedPreRewriteText, DictationOutcome.COMPLETED, null, false));
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onFinal(String str3) {
                        C7384Etj.A0Y(str3, 0);
                        G0U<? super String, Unit> g0u = VoyagerAsrClient.this.onFinal;
                        if (g0u != null) {
                            g0u.invoke(str3);
                        }
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onPartial(String str3, Long l) {
                        C7384Etj.A0Y(str3, 0);
                        if (l != null && !C7BY.A0j(str3)) {
                            VoyagerAsrClient.this.transcribedMs = l;
                        }
                        G0U<? super String, Unit> g0u = VoyagerAsrClient.this.onPartial;
                        if (g0u != null) {
                            g0u.invoke(str3);
                        }
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onAudioDropped(long j, boolean z) {
                        G0V<? super Long, ? super Boolean, Unit> g0v = VoyagerAsrClient.this.onAudioDropped;
                        if (g0v != null) {
                            g0v.invoke(Long.valueOf(j), Boolean.valueOf(z));
                        }
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onError(String str3, String str4, VoyagerAsrServerError voyagerAsrServerError) {
                        String strA0M2;
                        String str5;
                        boolean zA1b = AnonymousClass004.A1b(str3, str4);
                        String strA0M3 = null;
                        if (voyagerAsrServerError == null || (str5 = voyagerAsrServerError.errorType) == null) {
                            strA0M2 = null;
                            if (voyagerAsrServerError != null) {
                            }
                            CFK.A04(VoyagerAsrClient.TAG, FGI.A0j("Voyager session failed: ", str3, " (sessionId=", str4, AbstractC0878AGe.A0L("", "", "", BFI.A0F(new String[]{strA0M2, strA0M3}), null), ")"));
                            VoyagerAsrClient voyagerAsrClient = VoyagerAsrClient.this;
                            voyagerAsrClient.notifyClosed(new VoyagerAsrResult(str3, str4, zA1b, DictationOutcome.FAILED, voyagerAsrServerError, voyagerAsrClient.serverAnswered));
                        }
                        strA0M2 = FGI.A0M(", errorType=", str5);
                        String str6 = voyagerAsrServerError.errorCode;
                        if (str6 != null) {
                            strA0M3 = FGI.A0M(", errorCode=", str6);
                        }
                        CFK.A04(VoyagerAsrClient.TAG, FGI.A0j("Voyager session failed: ", str3, " (sessionId=", str4, AbstractC0878AGe.A0L("", "", "", BFI.A0F(new String[]{strA0M2, strA0M3}), null), ")"));
                        VoyagerAsrClient voyagerAsrClient2 = VoyagerAsrClient.this;
                        voyagerAsrClient2.notifyClosed(new VoyagerAsrResult(str3, str4, zA1b, DictationOutcome.FAILED, voyagerAsrServerError, voyagerAsrClient2.serverAnswered));
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onHandshakeAcknowledged() {
                        VoyagerAsrClient voyagerAsrClient = VoyagerAsrClient.this;
                        long jLongValue = Long.valueOf(voyagerAsrClient.openedAtMs).longValue();
                        voyagerAsrClient.openToAckMs = jLongValue > 0 ? Long.valueOf(C3cG.A04(jLongValue)) : null;
                        VoyagerAsrClient.this.cancelHandshakeTimeout();
                        VoyagerAsrClient.this.startReleasingPendingAudio();
                        Function0<Unit> function0 = VoyagerAsrClient.this.onAcknowledged;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onSpeechEnd() {
                        Function0<Unit> function0 = VoyagerAsrClient.this.onSpeechEnd;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    @Override // com.facebook.aura.composer.dictation.voyager.VoyagerAsrListener
                    public void onSpeechStart() {
                        Function0<Unit> function0 = VoyagerAsrClient.this.onSpeechStart;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }, this.audioEncoding);
                C3UX c3ux = this.scope;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                this.handshakeTimeoutJob = GAo.A02(num, c6ys, anonymousClass3, c3ux);
                GAo.A02(num, c6ys, new AnonymousClass4(null), this.scope);
                GAo.A02(num, c6ys, new AnonymousClass5(hatchWebSocketSessionConnect, this, str2, null), this.scope);
                GAo.A02(num, c6ys, new AnonymousClass6(hatchWebSocketSessionConnect, this, str2, null), this.scope);
                return true;
            } catch (Exception e) {
                CFK.A08(TAG, "start: failed to connect", e);
            }
        }
        return false;
    }

    public /* synthetic */ VoyagerAsrClient(VoyagerAsrMode voyagerAsrMode, String str, String str2, Function0 function0, VoyagerAsrAudioEncoding voyagerAsrAudioEncoding, int i, C06H c06h) {
        this(voyagerAsrMode, str, str2, function0, (i & 16) != 0 ? VoyagerAsrAudioEncoding.PCM_24KHZ : voyagerAsrAudioEncoding);
    }
}
