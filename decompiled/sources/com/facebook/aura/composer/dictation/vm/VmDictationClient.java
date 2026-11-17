package com.facebook.aura.composer.dictation.vm;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BQG;
import X.BV3;
import X.C06H;
import X.C10571Hud;
import X.C27k;
import X.C2zT;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C8eO;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GAt;
import X.GCV;
import X.Ho5;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.HzR;
import X.InterfaceC10560Hsz;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class VmDictationClient {
    public static final Companion Companion = new Companion();
    public static final int MAX_ERROR_CODE_CHARS = 64;
    public static final int MAX_ERROR_MESSAGE_CHARS = 128;
    public static final int MAX_LINE_BYTES = 1048576;
    public static final int MAX_LOGGED_ERROR_CHARS = 512;
    public static final int MAX_QUEUED_AUDIO_CHUNKS = 500;
    public static final byte NEWLINE = 10;
    public static final long OPEN_TIMEOUT_MS = 10000;
    public static final String SAMPLE_RATE_PARAM = "sample_rate_hz";
    public static final String SESSION_CAP_ERROR_CODE = "session_cap";
    public static final String TAG = "VmDictationClient";
    public final HzR<byte[]> audio;
    public final AtomicBoolean closed;
    public G0V<? super DictationOutcome, ? super String, Unit> onClosed;
    public G0U<? super String, Unit> onFinal;
    public G0U<? super String, Unit> onPartial;
    public final InterfaceC10560Hsz<Unit> opened;
    public final ByteArrayOutputStream pendingLine;
    public final VmDictationClient$responseHandler$1 responseHandler;
    public final C3UX scope;
    public volatile HatchDuplexHttpStream stream;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient", f = "VmDictationClient.kt", l = {106}, m = "openStream", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$openStream$1, reason: invalid class name */
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
            return VmDictationClient.this.openStream(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$start$1", f = "VmDictationClient.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C111611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C111611(HtJ<? super C111611> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmDictationClient.this.new C111611(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VmDictationClient vmDictationClient = VmDictationClient.this;
                this.label = 1;
                if (vmDictationClient.streamAudio(this) == enumC10460Hji) {
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
            return VmDictationClient.this.new C111611(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient", f = "VmDictationClient.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, 91, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 96}, m = "streamAudio", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C111621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111621(HtJ<? super C111621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VmDictationClient.this.streamAudio(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$2", f = "VmDictationClient.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ InterfaceC10560Hsz<HatchDuplexHttpStream> $opening;
        public int label;
        public final /* synthetic */ VmDictationClient this$0;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$2$1", f = "VmDictationClient.kt", l = {84}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC10560Hsz<HatchDuplexHttpStream> $opening;
            public Object L$0;
            public int label;
            public final /* synthetic */ VmDictationClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10560Hsz<HatchDuplexHttpStream> interfaceC10560Hsz, VmDictationClient vmDictationClient, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$opening = interfaceC10560Hsz;
                this.this$0 = vmDictationClient;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$opening, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                InterfaceC10560Hsz<HatchDuplexHttpStream> interfaceC10560Hsz;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    interfaceC10560Hsz = this.$opening;
                    VmDictationClient vmDictationClient = this.this$0;
                    this.L$0 = interfaceC10560Hsz;
                    this.label = 1;
                    obj = vmDictationClient.openStream(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    interfaceC10560Hsz = (InterfaceC10560Hsz) this.L$0;
                    Hwg.A00(obj);
                }
                C3cG.A1F(interfaceC10560Hsz, obj);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC10560Hsz<HatchDuplexHttpStream> interfaceC10560Hsz, VmDictationClient vmDictationClient, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$opening = interfaceC10560Hsz;
            this.this$0 = vmDictationClient;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$opening, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HwK hwK = HwK.A00;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$opening, this.this$0, null);
                this.label = 1;
                if (GAo.A00(this, hwK, anonymousClass1) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$3", f = "VmDictationClient.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchDuplexHttpStream $duplexStream;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchDuplexHttpStream hatchDuplexHttpStream, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$duplexStream = hatchDuplexHttpStream;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmDictationClient.this.new AnonymousClass3(this.$duplexStream, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VmDictationClient vmDictationClient;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                vmDictationClient = VmDictationClient.this;
                HatchDuplexHttpStream hatchDuplexHttpStream = this.$duplexStream;
                this.L$0 = vmDictationClient;
                this.label = 1;
                obj = hatchDuplexHttpStream.awaitResponse(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                vmDictationClient = (VmDictationClient) this.L$0;
                Hwg.A00(obj);
            }
            vmDictationClient.onResponseCompleted((HatchHttpResponse) obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$4", f = "VmDictationClient.kt", l = {91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmDictationClient.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<Unit> interfaceC10560Hsz = VmDictationClient.this.opened;
                this.label = 1;
                if (C3cG.A0W(interfaceC10560Hsz, this) == enumC10460Hji) {
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
            return VmDictationClient.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.aura.composer.dictation.vm.VmDictationClient$responseHandler$1] */
    public VmDictationClient(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0y(C78W.A02(new C8eO(null), AnonymousClass001.A0y()), new VmDictationClient$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
        this.audio = new GCV(500, null);
        this.opened = new GAt(null);
        this.closed = new AtomicBoolean(false);
        this.pendingLine = new ByteArrayOutputStream();
        this.responseHandler = new HatchDuplexResponseHandler() { // from class: com.facebook.aura.composer.dictation.vm.VmDictationClient$responseHandler$1
            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public void onBody(byte[] bArr) throws IOException {
                C7384Etj.A0Y(bArr, 0);
                this.this$0.consumeBody(bArr);
            }

            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public /* bridge */ void onComplete(HatchHttpResponse hatchHttpResponse) {
            }

            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public void onResponse(int i, Map<String, String> map) {
                if (200 > i || i >= 300) {
                    return;
                }
                C3cG.A1F(this.this$0.opened, Unit.INSTANCE);
            }
        };
    }

    public final void appendPcm(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        if (this.closed.get()) {
            return;
        }
        Object objAhZ = this.audio.AhZ(bArr);
        if (!(objAhZ instanceof C2zT) || (objAhZ instanceof Ho5)) {
            return;
        }
        finish(DictationOutcome.FAILED, BV3.A00(51));
    }

    private final boolean appendToLine(byte[] bArr, int i, int i2) throws IOException {
        if ((this.pendingLine.size() + i2) - i > 1048576) {
            finish(DictationOutcome.FAILED, "malformed_stream");
            return false;
        }
        this.pendingLine.write(bArr, i, i2 - i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeBody(byte[] bArr) throws IOException {
        if (this.closed.get()) {
            return;
        }
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            if (bArr[i] == 10) {
                if (!appendToLine(bArr, i2, i3)) {
                    return;
                }
                consumeLine();
                i2 = i4;
            }
            i++;
            i3 = i4;
        }
        appendToLine(bArr, i2, length);
    }

    private final void consumeLine() {
        Object objA0s;
        G0U<? super String, Unit> g0u;
        String str;
        DictationOutcome dictationOutcome;
        byte[] byteArray = this.pendingLine.toByteArray();
        C7384Etj.A0U(byteArray);
        String strA0l = AnonymousClass002.A0l(new String(byteArray, DCl.A05));
        this.pendingLine.reset();
        int length = strA0l.length();
        if (length == 0 || this.closed.get()) {
            return;
        }
        Object obj = null;
        if (!C7BY.A0j(strA0l)) {
            try {
                objA0s = HatchJsonKt.HatchJson.A00(strA0l, VmDictationEventJson$$serializer.INSTANCE);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (!(objA0s instanceof C10571Hud)) {
                obj = objA0s;
            }
        }
        VmDictationEventJson vmDictationEventJson = (VmDictationEventJson) obj;
        if (vmDictationEventJson == null) {
            CFK.A0H(TAG, "Ignoring malformed dictation event (%d characters)", Integer.valueOf(length));
            return;
        }
        String str2 = vmDictationEventJson.type;
        int iHashCode = str2.hashCode();
        if (iHashCode == -792934015) {
            if (!str2.equals(C60N.A00(27)) || (g0u = this.onPartial) == null) {
                return;
            }
            g0u.invoke(vmDictationEventJson.text);
            return;
        }
        if (iHashCode == 96784904) {
            if (str2.equals("error")) {
                CFK.A0H(TAG, "Daemon error: code=%s message=%s", BQG.A17(vmDictationEventJson.code, 64), BQG.A17(vmDictationEventJson.message, 128));
                String str3 = vmDictationEventJson.code;
                str = SESSION_CAP_ERROR_CODE;
                if (!SESSION_CAP_ERROR_CODE.equals(str3)) {
                    dictationOutcome = DictationOutcome.FAILED;
                    str = "server_error";
                }
                finish(dictationOutcome, str);
            }
            return;
        }
        if (iHashCode != 97436022) {
            return;
        }
        str = "final";
        if (!str2.equals("final")) {
            return;
        }
        G0U<? super String, Unit> g0u2 = this.onFinal;
        if (g0u2 != null) {
            g0u2.invoke(vmDictationEventJson.text);
        }
        dictationOutcome = DictationOutcome.COMPLETED;
        finish(dictationOutcome, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish(DictationOutcome dictationOutcome, String str) {
        if (C3cI.A1W(this.closed)) {
            release();
            G0V<? super DictationOutcome, ? super String, Unit> g0v = this.onClosed;
            if (g0v != null) {
                g0v.invoke(dictationOutcome, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResponseCompleted(HatchHttpResponse hatchHttpResponse) {
        DictationOutcome dictationOutcome;
        String str;
        if (this.closed.get()) {
            return;
        }
        if (hatchHttpResponse.isSuccessful) {
            consumeLine();
            dictationOutcome = DictationOutcome.FAILED;
            str = "closed_without_final";
        } else {
            Integer numValueOf = Integer.valueOf(hatchHttpResponse.statusCode);
            String str2 = hatchHttpResponse.errorMessage;
            CFK.A0H(TAG, "Dictation stream failed: code=%d %s", numValueOf, str2 != null ? BQG.A17(str2, 512) : null);
            dictationOutcome = DictationOutcome.FAILED;
            str = hatchHttpResponse.statusCode > 0 ? "http_error" : "stream_failed";
        }
        finish(dictationOutcome, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openStream(X.HtJ<? super com.facebook.aura.network.transport.HatchDuplexHttpStream> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.facebook.aura.composer.dictation.vm.VmDictationClient.AnonymousClass1
            if (r0 == 0) goto L66
            r11 = r13
            com.facebook.aura.composer.dictation.vm.VmDictationClient$openStream$1 r11 = (com.facebook.aura.composer.dictation.vm.VmDictationClient.AnonymousClass1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r1 = r11.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 != r2) goto L6c
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.network.transport.HatchDuplexHttpStream r1 = (com.facebook.aura.network.transport.HatchDuplexHttpStream) r1
            if (r1 != 0) goto L2d
            com.facebook.aura.composer.dictation.engine.DictationOutcome r1 = com.facebook.aura.composer.dictation.engine.DictationOutcome.FAILED
            java.lang.String r0 = "open_failed"
            r12.finish(r1, r0)
            r1 = 0
        L2c:
            return r1
        L2d:
            r12.stream = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.closed
            boolean r0 = r0.get()
            if (r0 == 0) goto L2c
            r1.cancel()
            return r1
        L3b:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$VoiceDictation r5 = com.facebook.aura.network.api.JarvisPath.VoiceDictation.INSTANCE
            X.CGz r6 = r12.userSession
            com.facebook.aura.composer.dictation.vm.VmDictationClient$responseHandler$1 r7 = r12.responseHandler
            r0 = 0
            java.lang.Long r8 = X.C3cG.A0S(r0)
            r0 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            java.lang.String r0 = "sample_rate_hz"
            X.HxE r0 = X.C3cG.A0r(r0, r1)
            r10 = 0
            X.HxE[] r9 = new X.HxE[]{r0}
            r11.label = r2
            java.lang.Object r1 = r4.openJarvisDuplexStream(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r3) goto L20
            return r3
        L66:
            com.facebook.aura.composer.dictation.vm.VmDictationClient$openStream$1 r11 = new com.facebook.aura.composer.dictation.vm.VmDictationClient$openStream$1
            r11.<init>(r13)
            goto L12
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.vm.VmDictationClient.openStream(X.HtJ):java.lang.Object");
    }

    private final void release() {
        this.audio.A5w(null);
        HatchDuplexHttpStream hatchDuplexHttpStream = this.stream;
        if (hatchDuplexHttpStream != null) {
            hatchDuplexHttpStream.cancel();
        }
        Hxb.A03(null, this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00de -> B:14:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object streamAudio(X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.vm.VmDictationClient.streamAudio(X.HtJ):java.lang.Object");
    }

    public final void cancel() {
        if (C3cI.A1W(this.closed)) {
            release();
        }
    }

    public final void endAudio() {
        this.audio.A6R(null);
    }

    public final G0V<DictationOutcome, String, Unit> getOnClosed() {
        return this.onClosed;
    }

    public final G0U<String, Unit> getOnFinal() {
        return this.onFinal;
    }

    public final G0U<String, Unit> getOnPartial() {
        return this.onPartial;
    }

    public final C27k<Unit> getOpenSignal() {
        return this.opened;
    }

    public final void setOnClosed(G0V<? super DictationOutcome, ? super String, Unit> g0v) {
        this.onClosed = g0v;
    }

    public final void setOnFinal(G0U<? super String, Unit> g0u) {
        this.onFinal = g0u;
    }

    public final void setOnPartial(G0U<? super String, Unit> g0u) {
        this.onPartial = g0u;
    }

    public final void start() {
        AnonymousClass001.A1J(new C111611(null), this.scope);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
