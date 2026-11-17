package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.G0U;
import X.HtJ;
import X.HxE;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoicePreviewCache$createFlight$result$1$result$1", f = "VoicePreviewCache.kt", l = {368, 283}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class VoicePreviewCache$createFlight$result$1$result$1 extends AbstractC07127nr implements G0U<HtJ<? super byte[]>, Object> {
    public final /* synthetic */ HxE<String, String> $key;
    public final /* synthetic */ long $requestGeneration;
    public final /* synthetic */ AtomicBoolean $userRequested;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ VoicePreviewCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewCache$createFlight$result$1$result$1(VoicePreviewCache voicePreviewCache, AtomicBoolean atomicBoolean, HxE<String, String> hxE, long j, HtJ<? super VoicePreviewCache$createFlight$result$1$result$1> htJ) {
        super(1, htJ);
        this.this$0 = voicePreviewCache;
        this.$userRequested = atomicBoolean;
        this.$key = hxE;
        this.$requestGeneration = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new VoicePreviewCache$createFlight$result$1$result$1(this.this$0, this.$userRequested, this.$key, this.$requestGeneration, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:34:0x00b7, B:40:0x00cb, B:51:0x00d8, B:52:0x00d9, B:13:0x005c, B:14:0x005e, B:19:0x006b, B:20:0x006c, B:22:0x0072, B:24:0x0082, B:27:0x008b, B:42:0x00cd, B:48:0x00d5, B:15:0x005f, B:17:0x0065, B:35:0x00b8, B:37:0x00be, B:39:0x00c4), top: B:60:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: all -> 0x00da, DONT_GENERATE, TryCatch #2 {all -> 0x00da, blocks: (B:30:0x00ae, B:31:0x00b1, B:33:0x00b5, B:34:0x00b7, B:40:0x00cb, B:51:0x00d8, B:52:0x00d9, B:13:0x005c, B:14:0x005e, B:19:0x006b, B:20:0x006c, B:22:0x0072, B:24:0x0082, B:27:0x008b, B:42:0x00cd, B:48:0x00d5, B:15:0x005f, B:17:0x0065, B:35:0x00b8, B:37:0x00be, B:39:0x00c4), top: B:60:0x0007, inners: #0, #1 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoicePreviewCache$createFlight$result$1$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super byte[]> htJ) {
        return ((VoicePreviewCache$createFlight$result$1$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
