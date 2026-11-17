package com.facebook.aura.network.notary;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.notary.HatchNotaryTokenCache", f = "HatchNotaryTokenCache.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "mintAndCache-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class HatchNotaryTokenCache$mintAndCache$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchNotaryTokenCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotaryTokenCache$mintAndCache$1(HatchNotaryTokenCache hatchNotaryTokenCache, HtJ<? super HatchNotaryTokenCache$mintAndCache$1> htJ) {
        super(htJ);
        this.this$0 = hatchNotaryTokenCache;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1607mintAndCache0E7RQCE(null, null, this));
    }
}
