package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BQG;
import X.BV4;
import X.BV6;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.F0C;
import android.os.SystemClock;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class VoyagerAsrSession {
    public static final long ACK_BURST_BYTES = 192000;
    public static final String AUDIO_ENCODER_FAILURE = "audio_encoder_failure";
    public static final String AUDIO_ENCODER_UNAVAILABLE = "audio_encoder_unavailable";
    public static final int BYTES_PER_SAMPLE = 2;
    public static final long BYTES_PER_SECOND = 48000;
    public static final long CATCH_UP_BYTES_PER_SECOND = 96000;
    public static final int CLOSE_NORMAL = 1000;
    public static final long MAX_PENDING_AUDIO_BYTES = 528000;
    public static final int MAX_SERVER_ERROR_MESSAGE_CHARS = 128;
    public static final int MAX_SERVER_ERROR_TOKEN_CHARS = 64;
    public static final long OPUS_RELEASE_SLICE_BYTES = 24000;
    public static final long START_TO_ACK_TIMEOUT_MS = 10000;
    public static final String TAG = "VoyagerAsrSession";
    public String accessToken;
    public Integer activeTurnId;
    public final VoyagerAsrAudioEncoding audioEncoding;
    public final Pcm24kTo16kDownsampler downsampler;
    public boolean endStreamRequested;
    public boolean endStreamSent;
    public boolean handshakeAcknowledged;
    public volatile boolean hasReceivedFinal;
    public final Set<Integer> incompleteTurnIds;
    public String latestPartial;
    public final VoyagerAsrListener listener;
    public final VoyagerAsrMode mode;
    public final String model;
    public OggOpusStreamEncoder opusEncoder;
    public final ArrayDeque<byte[]> pendingAudio;
    public volatile int pendingAudioBytes;
    public long releaseStartedAtMs;
    public long releasedBytes;
    public String sessionId;
    public final VoyagerAsrSocket socket;
    public boolean socketOpened;
    public boolean streamDrained;
    public boolean terminal;
    public final LinkedHashMap<Integer, String> turnTranscripts;
    public static final Companion Companion = new Companion();
    public static final String endStreamMessage = VoyagerAsrJsonKt.encodeVoyagerAsrEndStream();

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$completeLocked$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ VoyagerAsrCompletion $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoyagerAsrCompletion voyagerAsrCompletion) {
            super(0);
            this.$completion = voyagerAsrCompletion;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onCompleted(this.$completion);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$completeSettledTurnsLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C111661 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $completion;
        public final /* synthetic */ String $transcript;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111661(String str, Function0<Unit> function0) {
            super(0);
            this.$transcript = str;
            this.$completion = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onFinal(this.$transcript);
            Function0<Unit> function0 = this.$completion;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$failLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C111671 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ boolean $beforeAck;
        public final /* synthetic */ long $newlyDroppedBytes;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ VoyagerAsrServerError $serverError;
        public final /* synthetic */ VoyagerAsrSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111671(long j, VoyagerAsrSession voyagerAsrSession, boolean z, String str, VoyagerAsrServerError voyagerAsrServerError) {
            super(0);
            this.$newlyDroppedBytes = j;
            this.this$0 = voyagerAsrSession;
            this.$beforeAck = z;
            this.$reason = str;
            this.$serverError = voyagerAsrServerError;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long j = this.$newlyDroppedBytes;
            if (j > 0) {
                VoyagerAsrSession voyagerAsrSession = this.this$0;
                int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
                voyagerAsrSession.listener.onAudioDropped(j, this.$beforeAck);
            }
            VoyagerAsrSession voyagerAsrSession2 = this.this$0;
            int i2 = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession2.listener.onError(this.$reason, voyagerAsrSession2.sessionId, this.$serverError);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handleEndpointingMessageLocked$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $text;
        public final /* synthetic */ VoyagerAsrTranscriptJson $transcript;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson) {
            super(0);
            this.$text = str;
            this.$transcript = voyagerAsrTranscriptJson;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onPartial(this.$text, this.$transcript.audioProcessedMs);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handlePushToTalkMessageLocked$1, reason: invalid class name and case insensitive filesystem */
    public final class C111681 extends AbstractC7559F3s implements Function0<Unit> {
        public C111681() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onSpeechEnd();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handlePushToTalkMessageLocked$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $transcriptText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$transcriptText = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onFinal(this.$transcriptText);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handlePushToTalkMessageLocked$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass3() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onSpeechEnd();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handlePushToTalkMessageLocked$5, reason: invalid class name and case insensitive filesystem */
    public final class C111695 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ VoyagerAsrTranscriptJson $transcript;
        public final /* synthetic */ String $transcriptText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111695(String str, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson) {
            super(0);
            this.$transcriptText = str;
            this.$transcript = voyagerAsrTranscriptJson;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onPartial(this.$transcriptText, this.$transcript.audioProcessedMs);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$handlePushToTalkMessageLocked$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass6() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerAsrSession voyagerAsrSession = VoyagerAsrSession.this;
            int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
            voyagerAsrSession.listener.onSpeechEnd();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public VoyagerAsrSession(VoyagerAsrSocket voyagerAsrSocket, String str, String str2, VoyagerAsrMode voyagerAsrMode, String str3, VoyagerAsrListener voyagerAsrListener, VoyagerAsrAudioEncoding voyagerAsrAudioEncoding) {
        Pcm24kTo16kDownsampler pcm24kTo16kDownsampler;
        boolean zA1a = AnonymousClass002.A1a(voyagerAsrSocket, str);
        AnonymousClass005.A16(str2, voyagerAsrMode, str3, voyagerAsrListener, 2);
        C7384Etj.A0Y(voyagerAsrAudioEncoding, 6);
        this.socket = voyagerAsrSocket;
        this.model = str2;
        this.mode = voyagerAsrMode;
        this.listener = voyagerAsrListener;
        this.audioEncoding = voyagerAsrAudioEncoding;
        int iOrdinal = voyagerAsrAudioEncoding.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            pcm24kTo16kDownsampler = null;
        } else {
            if (iOrdinal != zA1a) {
                throw C3cG.A0q();
            }
            pcm24kTo16kDownsampler = new Pcm24kTo16kDownsampler();
        }
        this.downsampler = pcm24kTo16kDownsampler;
        this.pendingAudio = BV4.A0s();
        this.accessToken = str;
        this.sessionId = str3;
        this.latestPartial = "";
        this.turnTranscripts = C3cG.A0j();
        this.incompleteTurnIds = C3cG.A0k();
    }

    private final void fail(String str) {
        Function0<Unit> function0FailLocked;
        synchronized (this) {
            function0FailLocked = failLocked(str, 0, null);
        }
        if (function0FailLocked != null) {
            function0FailLocked.invoke();
        }
    }

    private final Function0<Unit> failLocked(String str, int i, VoyagerAsrServerError voyagerAsrServerError) {
        if (this.terminal) {
            return null;
        }
        this.terminal = true;
        this.accessToken = null;
        boolean z = !this.handshakeAcknowledged;
        long j = this.pendingAudioBytes + i;
        closeAudioLocked();
        return new C111671(j, this, z, str, voyagerAsrServerError);
    }

    public static final String toServerError$token(JsonObject jsonObject, VoyagerAsrSession voyagerAsrSession, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        String strTruncated;
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get(str) : null;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || (strTruncated = voyagerAsrSession.truncated(strA04, 64)) == null || C7BY.A0j(strTruncated)) {
            return null;
        }
        return strTruncated;
    }

    public final void appendAudio(byte[] bArr) {
        long j;
        C7384Etj.A0Y(bArr, 0);
        synchronized (this) {
            int length = bArr.length;
            if (length != 0) {
                boolean z = this.handshakeAcknowledged;
                boolean z2 = !z;
                Function0<Unit> function0FailLocked = null;
                if (this.terminal || this.endStreamRequested) {
                    j = length;
                } else {
                    if (z && this.pendingAudio.isEmpty()) {
                        String strSendAudioLocked = sendAudioLocked(bArr);
                        if (strSendAudioLocked != null) {
                            function0FailLocked = failLocked(strSendAudioLocked, length, null);
                        }
                    } else if (this.pendingAudioBytes + length > MAX_PENDING_AUDIO_BYTES) {
                        function0FailLocked = failLocked("audio_queue_overflow", length, null);
                    } else {
                        ArrayDeque<byte[]> arrayDeque = this.pendingAudio;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                        C7384Etj.A0U(bArrCopyOf);
                        arrayDeque.addLast(bArrCopyOf);
                        this.pendingAudioBytes += length;
                    }
                    j = 0;
                }
                if (j > 0) {
                    this.listener.onAudioDropped(j, z2);
                }
                if (function0FailLocked != null) {
                    function0FailLocked.invoke();
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this) {
            if (this.terminal) {
                return;
            }
            this.terminal = true;
            this.accessToken = null;
            boolean z = !this.handshakeAcknowledged;
            long j = this.pendingAudioBytes;
            closeAudioLocked();
            if (j > 0) {
                this.listener.onAudioDropped(j, z);
            }
        }
    }

    public final void endAudio() {
        synchronized (this) {
            if (this.terminal || this.endStreamRequested) {
                return;
            }
            this.endStreamRequested = true;
            Function0<Unit> function0EndStreamIfReadyLocked = endStreamIfReadyLocked();
            if (function0EndStreamIfReadyLocked != null) {
                function0EndStreamIfReadyLocked.invoke();
            }
        }
    }

    public final void onHandshakeTimeout() {
        synchronized (this) {
            if (this.terminal || this.handshakeAcknowledged) {
                return;
            }
            Function0<Unit> function0FailLocked = failLocked(this.socketOpened ? HatchGatewayConnectionKt.ERROR_TYPE_HANDSHAKE_TIMEOUT : VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT, 0, null);
            if (function0FailLocked != null) {
                function0FailLocked.invoke();
            }
        }
    }

    public final void onOpen(List<String> list) {
        C7384Etj.A0Y(list, 0);
        synchronized (this) {
            if (this.terminal) {
                return;
            }
            this.socketOpened = true;
            String str = this.accessToken;
            if (str == null) {
                str = "";
            }
            Function0<Unit> function0FailLocked = null;
            this.accessToken = null;
            if (C7BY.A0j(str) || C7BY.A0j(this.model)) {
                function0FailLocked = failLocked("invalid_configuration", 0, null);
            } else {
                VoyagerAsrAudioEncoding voyagerAsrAudioEncoding = this.audioEncoding;
                if (voyagerAsrAudioEncoding == VoyagerAsrAudioEncoding.OGG_OPUS && this.opusEncoder == null) {
                    function0FailLocked = failLocked(AUDIO_ENCODER_UNAVAILABLE, 0, null);
                } else {
                    if (!this.socket.send(VoyagerAsrJsonKt.encodeVoyagerAsrHandshake(str, this.model, voyagerAsrAudioEncoding, this.mode, list))) {
                        function0FailLocked = failLocked("handshake_send_failure", 0, null);
                    }
                }
            }
            if (function0FailLocked != null) {
                function0FailLocked.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:6:0x000e, B:10:0x0014, B:12:0x0018, B:14:0x0024, B:15:0x0028, B:17:0x002c, B:19:0x0034, B:22:0x003e, B:24:0x0046, B:25:0x0053, B:27:0x006c, B:28:0x006f, B:30:0x0073, B:33:0x007d, B:34:0x0081, B:35:0x0085, B:36:0x0086, B:43:0x0099, B:45:0x009d, B:46:0x00b1, B:3:0x0005), top: B:55:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextMessage(java.lang.String r10) {
        /*
            r9 = this;
            r2 = 0
            X.C7384Etj.A0Y(r10, r2)
            r4 = 1
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrMessageJson r5 = com.facebook.aura.composer.dictation.voyager.VoyagerAsrJsonKt.decodeVoyagerAsrMessage(r10)     // Catch: java.lang.Exception -> L98
            java.util.ArrayList r3 = X.C3cG.A0h()
            monitor-enter(r9)
            boolean r0 = r9.terminal     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L14
            monitor-exit(r9)
            return
        L14:
            kotlinx.serialization.json.JsonElement r0 = r5.error     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L28
            java.lang.String r1 = "server_error"
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrServerError r0 = r9.toServerError(r0)     // Catch: java.lang.Throwable -> Lc1
            kotlin.jvm.functions.Function0 r0 = r9.failLocked(r1, r2, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L89
        L24:
            r3.add(r0)     // Catch: java.lang.Throwable -> Lc1
            goto L89
        L28:
            boolean r0 = r9.handshakeAcknowledged     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L73
            java.lang.String r8 = r5.sessionId     // Catch: java.lang.Throwable -> Lc1
            int r0 = r8.length()     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L3e
            java.lang.String r1 = "invalid_handshake_response"
            r0 = 0
            kotlin.jvm.functions.Function0 r0 = r9.failLocked(r1, r2, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L89
            goto L24
        L3e:
            java.lang.String r7 = r9.sessionId     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r8.equals(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L53
            java.lang.String r6 = "VoyagerAsrSession"
            java.lang.String r1 = "Voyager returned a different session ID (sent=%s, returned=%s)"
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.Throwable -> Lc1
            X.CFK.A0H(r6, r1, r0)     // Catch: java.lang.Throwable -> Lc1
            r9.sessionId = r8     // Catch: java.lang.Throwable -> Lc1
        L53:
            r9.handshakeAcknowledged = r4     // Catch: java.lang.Throwable -> Lc1
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc1
            r9.releaseStartedAtMs = r0     // Catch: java.lang.Throwable -> Lc1
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$onTextMessage$1$3 r0 = new com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$onTextMessage$1$3     // Catch: java.lang.Throwable -> Lc1
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            r3.add(r0)     // Catch: java.lang.Throwable -> Lc1
            r0 = 192000(0x2ee00, double:9.48606E-319)
            kotlin.jvm.functions.Function0 r0 = r9.releaseAudioLocked(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L6f
            r3.add(r0)     // Catch: java.lang.Throwable -> Lc1
        L6f:
            boolean r0 = r9.terminal     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L89
        L73:
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrMode r0 = r9.mode     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == r2) goto L86
            if (r0 != r4) goto L81
            r9.handleEndpointingMessageLocked(r5, r3)     // Catch: java.lang.Throwable -> Lc1
            goto L89
        L81:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> Lc1
            throw r0     // Catch: java.lang.Throwable -> Lc1
        L86:
            r9.handlePushToTalkMessageLocked(r5, r3)     // Catch: java.lang.Throwable -> Lc1
        L89:
            monitor-exit(r9)
            java.util.Iterator r1 = r3.iterator()
        L8e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc0
            X.BV7.A1M(r1)
            goto L8e
        L98:
            monitor-enter(r9)
            boolean r0 = r9.handshakeAcknowledged     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb1
            java.lang.String r2 = "VoyagerAsrSession"
            java.lang.String r1 = "Ignoring malformed Voyager message (%d characters)"
            int r0 = r10.length()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lc1
            X.CFK.A0H(r2, r1, r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lb9
        Lb1:
            java.lang.String r1 = "malformed_server_message"
            r0 = 0
            kotlin.jvm.functions.Function0 r0 = r9.failLocked(r1, r2, r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            monitor-exit(r9)
            if (r0 == 0) goto Lc0
            r0.invoke()
        Lc0:
            return
        Lc1:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession.onTextMessage(java.lang.String):void");
    }

    public final boolean releasePendingAudio() {
        synchronized (this) {
            if (this.terminal || !this.handshakeAcknowledged) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = (((jElapsedRealtime - this.releaseStartedAtMs) * CATCH_UP_BYTES_PER_SECOND) / 1000) + ACK_BURST_BYTES;
            long j2 = this.releasedBytes;
            long j3 = j2 + ACK_BURST_BYTES;
            if (j > j3) {
                j = j3;
                this.releaseStartedAtMs = jElapsedRealtime - ((j2 * 1000) / CATCH_UP_BYTES_PER_SECOND);
            }
            Function0<Unit> function0ReleaseAudioLocked = releaseAudioLocked(j);
            boolean z = !this.pendingAudio.isEmpty();
            if (function0ReleaseAudioLocked != null) {
                function0ReleaseAudioLocked.invoke();
            }
            return z;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoyagerAsrAudioEncoding.values().length];
            try {
                AnonymousClass005.A0v(VoyagerAsrAudioEncoding.PCM_24KHZ, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(VoyagerAsrAudioEncoding.OGG_OPUS, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoyagerAsrAudioEncoding.PCM_16KHZ, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoyagerAsrMode.values().length];
            try {
                AnonymousClass005.A0v(VoyagerAsrMode.PUSH_TO_TALK, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(VoyagerAsrMode.ENDPOINTING, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void closeAudioLocked() {
        this.pendingAudio.clear();
        this.pendingAudioBytes = 0;
        final OggOpusStreamEncoder oggOpusStreamEncoder = this.opusEncoder;
        if (oggOpusStreamEncoder != null) {
            F0C.A05().execute(new Runnable() { // from class: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$closeAudioLocked$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    oggOpusStreamEncoder.release();
                }
            });
        }
        this.opusEncoder = null;
    }

    private final Function0<Unit> completeLocked(String str, boolean z) {
        if (this.terminal) {
            return null;
        }
        this.terminal = true;
        this.accessToken = null;
        closeAudioLocked();
        return new AnonymousClass1(new VoyagerAsrCompletion(this.sessionId, str, z));
    }

    private final Function0<Unit> completeSettledTurnsLocked() {
        if (this.terminal || !this.streamDrained || this.activeTurnId != null || !this.incompleteTurnIds.isEmpty()) {
            return null;
        }
        if (this.turnTranscripts.isEmpty()) {
            return completeLocked("end_of_stream_without_transcript", false);
        }
        this.hasReceivedFinal = true;
        return new C111661(this.latestPartial, completeLocked("speech_complete", false));
    }

    private final Function0<Unit> endStreamIfReadyLocked() {
        if (this.handshakeAcknowledged && this.endStreamRequested && !this.endStreamSent && this.pendingAudio.isEmpty()) {
            this.endStreamSent = true;
            String strSendEndStreamLocked = sendEndStreamLocked();
            if (strSendEndStreamLocked != null) {
                return failLocked(strSendEndStreamLocked, 0, null);
            }
        }
        return null;
    }

    public static /* synthetic */ Function0 failLocked$default(VoyagerAsrSession voyagerAsrSession, String str, int i, VoyagerAsrServerError voyagerAsrServerError, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            voyagerAsrServerError = null;
        }
        return voyagerAsrSession.failLocked(str, i, voyagerAsrServerError);
    }

    private final void handleEndpointingMessageLocked(VoyagerAsrMessageJson voyagerAsrMessageJson, List<Function0<Unit>> list) {
        Function0<Unit> function0CompleteSettledTurnsLocked;
        VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson = voyagerAsrMessageJson.speechStart;
        if (voyagerAsrSpeechBoundaryJson != null) {
            Integer numValueOf = Integer.valueOf(voyagerAsrSpeechBoundaryJson.turnId);
            this.activeTurnId = numValueOf;
            this.incompleteTurnIds.add(numValueOf);
            LinkedHashMap<Integer, String> linkedHashMap = this.turnTranscripts;
            Integer numValueOf2 = Integer.valueOf(voyagerAsrSpeechBoundaryJson.turnId);
            if (linkedHashMap.get(numValueOf2) == null) {
                linkedHashMap.put(numValueOf2, "");
            }
            function0CompleteSettledTurnsLocked = new VoyagerAsrSession$handleEndpointingMessageLocked$1$2(this);
        } else {
            VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2 = voyagerAsrMessageJson.speechEnd;
            if (voyagerAsrSpeechBoundaryJson2 != null) {
                Integer num = this.activeTurnId;
                if (num != null) {
                    if (num.intValue() != voyagerAsrSpeechBoundaryJson2.turnId) {
                        return;
                    }
                }
                this.activeTurnId = null;
                function0CompleteSettledTurnsLocked = new VoyagerAsrSession$handleEndpointingMessageLocked$2$1(this);
            } else {
                VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson = voyagerAsrMessageJson.speechComplete;
                if (voyagerAsrSpeechCompleteJson != null) {
                    Integer num2 = this.activeTurnId;
                    int i = voyagerAsrSpeechCompleteJson.turnId;
                    if (num2 != null && num2.intValue() == i) {
                        this.activeTurnId = null;
                        list.add(new VoyagerAsrSession$handleEndpointingMessageLocked$3$1(this));
                    }
                    this.incompleteTurnIds.remove(Integer.valueOf(voyagerAsrSpeechCompleteJson.turnId));
                    String turnTranscriptLocked = setTurnTranscriptLocked(voyagerAsrSpeechCompleteJson.turnId, voyagerAsrSpeechCompleteJson.transcript);
                    Function0<Unit> function0CompleteSettledTurnsLocked2 = completeSettledTurnsLocked();
                    if (function0CompleteSettledTurnsLocked2 == null) {
                        function0CompleteSettledTurnsLocked2 = new VoyagerAsrSession$handleEndpointingMessageLocked$3$2(this, turnTranscriptLocked);
                    }
                    list.add(function0CompleteSettledTurnsLocked2);
                    return;
                }
                VoyagerAsrTranscriptJson voyagerAsrTranscriptJson = voyagerAsrMessageJson.transcript;
                if (voyagerAsrTranscriptJson == null) {
                    return;
                }
                if (!this.endStreamSent || !voyagerAsrTranscriptJson.f17final || !C7BY.A0j(voyagerAsrTranscriptJson.transcript)) {
                    Integer num3 = this.activeTurnId;
                    if (num3 != null) {
                        list.add(new AnonymousClass5(setTurnTranscriptLocked(num3.intValue(), voyagerAsrTranscriptJson.transcript), voyagerAsrTranscriptJson));
                        return;
                    }
                    return;
                }
                this.streamDrained = true;
                function0CompleteSettledTurnsLocked = completeSettledTurnsLocked();
                if (function0CompleteSettledTurnsLocked == null) {
                    return;
                }
            }
        }
        list.add(function0CompleteSettledTurnsLocked);
    }

    private final void handlePushToTalkMessageLocked(VoyagerAsrMessageJson voyagerAsrMessageJson, List<Function0<Unit>> list) {
        Function0<Unit> anonymousClass6;
        boolean zA1X = AnonymousClass002.A1X(voyagerAsrMessageJson.speechEnd);
        VoyagerAsrTranscriptJson voyagerAsrTranscriptJson = voyagerAsrMessageJson.transcript;
        if (voyagerAsrTranscriptJson != null) {
            String str = voyagerAsrTranscriptJson.transcript;
            if (voyagerAsrTranscriptJson.f17final) {
                this.hasReceivedFinal = true;
                list.add(new AnonymousClass2(str));
                if (zA1X) {
                    list.add(new AnonymousClass3());
                }
                anonymousClass6 = completeLocked("final_segment", false);
                if (anonymousClass6 == null) {
                    return;
                }
            } else {
                this.latestPartial = str;
                list.add(new C111695(str, voyagerAsrTranscriptJson));
                if (!zA1X) {
                    return;
                } else {
                    anonymousClass6 = new AnonymousClass6();
                }
            }
        } else if (!zA1X) {
            return;
        } else {
            anonymousClass6 = new C111681();
        }
        list.add(anonymousClass6);
    }

    private final Function0<Unit> releaseAudioLocked(long j) {
        if (this.opusEncoder != null) {
            j = Math.min(j, this.releasedBytes + OPUS_RELEASE_SLICE_BYTES);
        }
        while (!this.pendingAudio.isEmpty() && this.releasedBytes + ((byte[]) AbstractC0878AGe.A0B(this.pendingAudio)).length <= j) {
            byte[] bArrRemoveFirst = this.pendingAudio.removeFirst();
            int i = this.pendingAudioBytes;
            int length = bArrRemoveFirst.length;
            this.pendingAudioBytes = i - length;
            this.releasedBytes += length;
            String strSendAudioLocked = sendAudioLocked(bArrRemoveFirst);
            if (strSendAudioLocked != null) {
                return failLocked(strSendAudioLocked, length, null);
            }
        }
        return endStreamIfReadyLocked();
    }

    private final String sendAudioLocked(byte[] bArr) {
        byte[] bArrProcess;
        OggOpusStreamEncoder oggOpusStreamEncoder = this.opusEncoder;
        if (oggOpusStreamEncoder != null) {
            bArr = oggOpusStreamEncoder.encode(bArr);
            if (bArr == null) {
                return AUDIO_ENCODER_FAILURE;
            }
        } else {
            Pcm24kTo16kDownsampler pcm24kTo16kDownsampler = this.downsampler;
            if (pcm24kTo16kDownsampler != null && (bArrProcess = pcm24kTo16kDownsampler.process(bArr)) != null) {
                bArr = bArrProcess;
            }
        }
        if (bArr.length == 0 || this.socket.send(bArr)) {
            return null;
        }
        return "audio_send_failure";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String sendEndStreamLocked() {
        /*
            r3 = this;
            com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder r0 = r3.opusEncoder
            r2 = 0
            if (r0 == 0) goto Le
            byte[] r1 = r0.finish()
            if (r1 != 0) goto L18
            java.lang.String r2 = "audio_encoder_failure"
            return r2
        Le:
            com.facebook.aura.composer.dictation.voyager.Pcm24kTo16kDownsampler r0 = r3.downsampler
            if (r0 == 0) goto L23
            byte[] r1 = r0.flush()
            if (r1 == 0) goto L23
        L18:
            int r0 = r1.length
            if (r0 == 0) goto L23
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrSocket r0 = r3.socket
            boolean r0 = r0.send(r1)
            if (r0 == 0) goto L2e
        L23:
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrSocket r1 = r3.socket
            java.lang.String r0 = com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession.endStreamMessage
            boolean r0 = r1.send(r0)
            if (r0 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r2 = "end_stream_send_failure"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession.sendEndStreamLocked():java.lang.String");
    }

    private final String setTurnTranscriptLocked(int i, String str) {
        this.turnTranscripts.put(Integer.valueOf(i), AnonymousClass002.A0l(str));
        Collection<String> collectionValues = this.turnTranscripts.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str2 : collectionValues) {
            if (C7384Etj.A06(str2) > 0) {
                arrayListA0h.add(str2);
            }
        }
        String strA0e = C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h);
        this.latestPartial = strA0e;
        return strA0e;
    }

    private final VoyagerAsrServerError toServerError(JsonElement jsonElement) {
        String strA04;
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement2;
        JsonObject jsonObject = null;
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null && (jsonElement2 = (JsonElement) jsonObject.get(ReplyAttributionSerializer.TYPE_MESSAGE)) != null) {
            jsonElement = jsonElement2;
        }
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null) {
            strA04 = "";
        }
        return new VoyagerAsrServerError(toServerError$token(jsonObject, this, "errorType"), toServerError$token(jsonObject, this, "errorCode"), truncated(strA04, 128), toServerError$token(jsonObject, this, "sessionId"));
    }

    public final boolean getHasReceivedFinal() {
        return this.hasReceivedFinal;
    }

    public final long pendingAudioMs() {
        return BV6.A0H(this.pendingAudioBytes) / 48000;
    }

    public final void prepareAudioEncoder() throws IOException {
        if (this.audioEncoding == VoyagerAsrAudioEncoding.OGG_OPUS) {
            OggOpusStreamEncoder oggOpusStreamEncoderCreate = OggOpusStreamEncoder.Companion.create();
            synchronized (this) {
                if (!this.terminal && this.opusEncoder == null) {
                    this.opusEncoder = oggOpusStreamEncoderCreate;
                } else if (oggOpusStreamEncoderCreate != null) {
                    oggOpusStreamEncoderCreate.release();
                }
            }
        }
    }

    private final String truncated(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(str.charAt(i2))) {
            i = i2;
        }
        return BQG.A17(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[LOOP:0: B:25:0x004f->B:27:0x0055, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClosed(int r5) {
        /*
            r4 = this;
            java.lang.String r1 = "socket_closed:"
            java.util.ArrayList r3 = X.C3cG.A0h()
            monitor-enter(r4)
            boolean r0 = r4.terminal     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto L12
            goto L1f
        L12:
            java.lang.String r2 = X.FGI.A0H(r1, r5)     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            r0 = 0
            kotlin.jvm.functions.Function0 r0 = r4.failLocked(r2, r0, r1)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L4a
            goto L3c
        L1f:
            boolean r0 = r4.endStreamSent     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L12
            java.lang.String r1 = r4.latestPartial     // Catch: java.lang.Throwable -> L5b
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L5b
            if (r0 <= 0) goto L40
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$onClosed$1$2 r0 = new com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession$onClosed$1$2     // Catch: java.lang.Throwable -> L5b
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L5b
            r3.add(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "clean_close_partial"
            r0 = 1
            kotlin.jvm.functions.Function0 r0 = r4.completeLocked(r1, r0)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L4a
        L3c:
            r3.add(r0)     // Catch: java.lang.Throwable -> L5b
            goto L4a
        L40:
            java.lang.String r1 = "clean_close_without_transcript"
            r0 = 0
            kotlin.jvm.functions.Function0 r0 = r4.completeLocked(r1, r0)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L4a
            goto L3c
        L4a:
            monitor-exit(r4)
            java.util.Iterator r1 = r3.iterator()
        L4f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            X.BV7.A1M(r1)
            goto L4f
        L59:
            monitor-exit(r4)
        L5a:
            return
        L5b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession.onClosed(int):void");
    }

    public final void onFailure() {
        fail("socket_failure");
    }
}
