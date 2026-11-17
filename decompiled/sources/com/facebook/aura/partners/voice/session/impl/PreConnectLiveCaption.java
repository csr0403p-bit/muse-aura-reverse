package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import com.facebook.aura.composer.dictation.pcm.PcmDictationStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class PreConnectLiveCaption {

    @Deprecated
    public static final int BURST_SAMPLES = 72000;

    @Deprecated
    public static final int CHUNK_SAMPLES = 2400;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int LEAD_SAMPLES = 7200;

    @Deprecated
    public static final long TICK_MS = 50;
    public volatile boolean acknowledged;
    public final PreConnectSpeechBuffer buffer;
    public final String clientSessionId;
    public volatile boolean closed;
    public long cursor;
    public volatile boolean finishing;
    public final G0U<String, Boolean> onText;
    public final PreConnectSpeechReporter reporter;
    public int sentSamples;
    public volatile boolean shown;
    public boolean speechEnded;
    public final G0U<String, PcmDictationStream> startStream;
    public volatile boolean started;
    public volatile PcmDictationStream stream;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption", f = "PreConnectLiveCaption.kt", l = {79}, m = "finish", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$finish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreConnectLiveCaption.this.finish(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption", f = "PreConnectLiveCaption.kt", l = {32, R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "run", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$1, reason: invalid class name and case insensitive filesystem */
    public final class C132441 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132441(HtJ<? super C132441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreConnectLiveCaption.this.run(this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            if (AnonymousClass003.A1X(str, PreConnectLiveCaption.this.onText)) {
                PreConnectLiveCaption.this.shown = true;
            }
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption", f = "PreConnectLiveCaption.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 66}, m = "streamSpeech", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$streamSpeech$1, reason: invalid class name and case insensitive filesystem */
    public final class C132451 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132451(HtJ<? super C132451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreConnectLiveCaption.this.streamSpeech(null, this);
        }
    }

    private final synchronized void send(int i) {
        PcmDictationStream pcmDictationStream = this.stream;
        if (pcmDictationStream != null) {
            PcmChunk pcmChunk = this.buffer.read(this.cursor, i);
            this.cursor = pcmChunk.end;
            short[] sArr = pcmChunk.pcm;
            int length = sArr.length;
            if (length != 0) {
                this.sentSamples += length;
                pcmDictationStream.append(sArr);
            }
        }
    }

    public final synchronized void close(boolean z) {
        closeStream();
        this.reporter.close(z);
    }

    public final synchronized void closeStream() {
        this.closed = true;
        PcmDictationStream pcmDictationStream = this.stream;
        if (pcmDictationStream != null) {
            pcmDictationStream.close();
        }
    }

    public final synchronized void flush() {
        this.finishing = true;
        if (this.acknowledged) {
            send(Integer.MAX_VALUE);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ void close$default(PreConnectLiveCaption preConnectLiveCaption, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        preConnectLiveCaption.close(z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:13:0x0027
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object streamSpeech(com.facebook.aura.composer.dictation.pcm.PcmDictationStream r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.C132451
            if (r0 == 0) goto L97
            r5 = r10
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$streamSpeech$1 r5 = (com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.C132451) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L68
            if (r0 == r7) goto L76
            if (r0 != r4) goto L9e
            X.Hwg.A00(r1)
        L23:
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r8.buffer
            boolean r0 = r0.capturing
            if (r0 == 0) goto L86
            boolean r0 = r8.closed
            if (r0 != 0) goto L86
            boolean r0 = r8.finishing
            if (r0 != 0) goto L86
            int r2 = r8.sentSamples
            r1 = 72000(0x11940, float:1.00893E-40)
            r0 = 2400(0x960, float:3.363E-42)
            if (r2 >= r1) goto L3c
            int r0 = r1 - r2
        L3c:
            r8.send(r0)
            boolean r0 = r8.shown
            if (r0 == 0) goto L4c
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r8.buffer
            boolean r0 = r0.hasSpeechEnded()
            r1 = 1
            if (r0 != 0) goto L4d
        L4c:
            r1 = 0
        L4d:
            boolean r0 = r8.speechEnded
            if (r1 == r0) goto L58
            r8.speechEnded = r1
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter r0 = r8.reporter
            r0.onSpeechEnded(r1)
        L58:
            r0 = 0
            r5.L$0 = r0
            r5.I$0 = r1
            r5.label = r4
            r0 = 50
            java.lang.Object r0 = X.C7Bq.A01(r0, r5)
            if (r0 != r6) goto L23
            return r6
        L68:
            X.Hwg.A00(r1)
            r5.L$0 = r9
            r5.label = r7
            java.lang.Object r1 = r9.awaitAcknowledged(r5)
            if (r1 != r6) goto L7d
            return r6
        L76:
            java.lang.Object r9 = r5.L$0
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r9 = (com.facebook.aura.composer.dictation.pcm.PcmDictationStream) r9
            X.Hwg.A00(r1)
        L7d:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L89
            r9.close()
        L86:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L89:
            monitor-enter(r8)
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r8.buffer     // Catch: java.lang.Throwable -> La3
            long r2 = r0.speechStart     // Catch: java.lang.Throwable -> La3
            r0 = 7200(0x1c20, double:3.5573E-320)
            long r2 = r2 - r0
            r8.cursor = r2     // Catch: java.lang.Throwable -> La3
            r8.acknowledged = r7     // Catch: java.lang.Throwable -> La3
            monitor-exit(r8)
            goto L23
        L97:
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$streamSpeech$1 r5 = new com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$streamSpeech$1
            r5.<init>(r10)
            goto L12
        L9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.streamSpeech(com.facebook.aura.composer.dictation.pcm.PcmDictationStream, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.aura.composer.dictation.pcm.PcmDictationStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finish(X.HtJ<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.AnonymousClass1
            if (r0 == 0) goto L23
            r5 = r7
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$finish$1 r5 = (com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L29
            java.lang.Object r1 = r5.L$0
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r1 = (com.facebook.aura.composer.dictation.pcm.PcmDictationStream) r1
            goto L44
        L23:
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$finish$1 r5 = new com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$finish$1
            r5.<init>(r7)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r0)
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r1 = r6.stream
            if (r1 == 0) goto L58
            boolean r0 = r6.acknowledged     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L4f
            r5.L$0 = r1     // Catch: java.lang.Throwable -> L53
            r5.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r1.finish(r5)     // Catch: java.lang.Throwable -> L53
            if (r0 != r4) goto L47
            return r4
        L44:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L53
        L47:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L4f
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)     // Catch: java.lang.Throwable -> L53
        L4f:
            r1.close()
            return r2
        L53:
            r0 = move-exception
            r1.close()
            throw r0
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.finish(X.HtJ):java.lang.Object");
    }

    public final String getClientSessionId() {
        return this.clientSessionId;
    }

    public final boolean getStarted() {
        return this.started;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.composer.dictation.pcm.PcmDictationStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(X.HtJ<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.C132441
            if (r0 == 0) goto L25
            r3 = r10
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$1 r3 = (com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.C132441) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r6 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 == r5) goto L34
            if (r0 != r4) goto L2f
            java.lang.Object r1 = r3.L$0
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r1 = (com.facebook.aura.composer.dictation.pcm.PcmDictationStream) r1
            goto L2b
        L25:
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$1 r3 = new com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$1
            r3.<init>(r10)
            goto L12
        L2b:
            X.Hwg.A00(r6)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L77
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r6)
        L37:
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r9.buffer
            boolean r0 = r0.capturing
            if (r0 == 0) goto L52
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r9.buffer
            long r0 = r0.speechStart
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 >= 0) goto L52
            r3.label = r5
            r0 = 50
            java.lang.Object r0 = X.C7Bq.A01(r0, r3)
            if (r0 != r2) goto L37
            return r2
        L52:
            com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer r0 = r9.buffer
            boolean r0 = r0.capturing
            if (r0 == 0) goto L77
            X.G0U<java.lang.String, com.facebook.aura.composer.dictation.pcm.PcmDictationStream> r1 = r9.startStream
            java.lang.String r0 = r9.clientSessionId
            java.lang.Object r1 = r1.invoke(r0)
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r1 = (com.facebook.aura.composer.dictation.pcm.PcmDictationStream) r1
            if (r1 == 0) goto L77
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$2 r0 = new com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption$run$2
            r0.<init>()
            r1.setOnPartial(r0)
            r9.started = r5
            r9.stream = r1
            boolean r0 = r9.closed
            if (r0 == 0) goto L7a
            r1.close()
        L77:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L7a:
            r3.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L85
            r3.label = r4     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r0 = r9.streamSpeech(r1, r3)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r0 != r2) goto L77
            return r2
        L85:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption.run(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreConnectLiveCaption(PreConnectSpeechBuffer preConnectSpeechBuffer, String str, G0U<? super String, ? extends PcmDictationStream> g0u, G0U<? super String, Boolean> g0u2, PreConnectSpeechReporter preConnectSpeechReporter) {
        AnonymousClass005.A17(preConnectSpeechBuffer, str, g0u, g0u2, preConnectSpeechReporter);
        this.buffer = preConnectSpeechBuffer;
        this.clientSessionId = str;
        this.startStream = g0u;
        this.onText = g0u2;
        this.reporter = preConnectSpeechReporter;
    }
}
