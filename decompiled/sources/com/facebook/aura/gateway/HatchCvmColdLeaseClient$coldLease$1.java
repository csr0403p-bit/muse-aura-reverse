package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmColdLeaseClient", f = "HatchCvmColdLeaseClient.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "coldLease-gIAlu-s", v = 2)
/* loaded from: classes4.dex */
public final class HatchCvmColdLeaseClient$coldLease$1 extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchCvmColdLeaseClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCvmColdLeaseClient$coldLease$1(HatchCvmColdLeaseClient hatchCvmColdLeaseClient, HtJ<? super HatchCvmColdLeaseClient$coldLease$1> htJ) {
        super(htJ);
        this.this$0 = hatchCvmColdLeaseClient;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m955coldLeasegIAlus(null, this));
    }
}
