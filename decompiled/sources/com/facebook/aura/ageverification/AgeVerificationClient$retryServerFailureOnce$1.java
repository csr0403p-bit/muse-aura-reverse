package com.facebook.aura.ageverification;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient", f = "AgeVerificationClient.kt", l = {208, 214}, m = "retryServerFailureOnce-gIAlu-s", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$retryServerFailureOnce$1<T> extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AgeVerificationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeVerificationClient$retryServerFailureOnce$1(AgeVerificationClient ageVerificationClient, HtJ<? super AgeVerificationClient$retryServerFailureOnce$1> htJ) {
        super(htJ);
        this.this$0 = ageVerificationClient;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m216retryServerFailureOncegIAlus(null, this));
    }
}
