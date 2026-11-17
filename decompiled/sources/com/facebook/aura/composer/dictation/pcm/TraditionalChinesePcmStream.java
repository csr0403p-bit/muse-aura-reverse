package com.facebook.aura.composer.dictation.pcm;

import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class TraditionalChinesePcmStream implements PcmDictationStream {
    public final PcmDictationStream stream;

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream", f = "PcmDictation.kt", l = {111}, m = "finish", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream$finish$1, reason: invalid class name */
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
            return TraditionalChinesePcmStream.this.finish(this);
        }
    }

    public TraditionalChinesePcmStream(PcmDictationStream pcmDictationStream) {
        C7384Etj.A0Y(pcmDictationStream, 0);
        this.stream = pcmDictationStream;
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void append(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        this.stream.append(sArr);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public Object awaitAcknowledged(HtJ<? super Boolean> htJ) {
        return this.stream.awaitAcknowledged(htJ);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void close() {
        this.stream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object finish(X.HtJ<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream.AnonymousClass1
            if (r0 == 0) goto L39
            r4 = r6
            com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream$finish$1 r4 = (com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.Hwg.A00(r3)
        L20:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L3f
            com.facebook.aura.composer.dictation.DictationLanguages r0 = com.facebook.aura.composer.dictation.DictationLanguages.INSTANCE
            java.lang.String r2 = r0.toTraditionalChinese(r3)
            return r2
        L2b:
            X.Hwg.A00(r3)
            com.facebook.aura.composer.dictation.pcm.PcmDictationStream r0 = r5.stream
            r4.label = r1
            java.lang.Object r3 = r0.finish(r4)
            if (r3 != r2) goto L20
            return r2
        L39:
            com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream$finish$1 r4 = new com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream$finish$1
            r4.<init>(r6)
            goto L12
        L3f:
            r2 = 0
            return r2
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.pcm.TraditionalChinesePcmStream.finish(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public G0U<String, Unit> getOnPartial() {
        return this.stream.getOnPartial();
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void setOnPartial(G0U<? super String, Unit> g0u) {
        this.stream.setOnPartial(g0u);
    }
}
