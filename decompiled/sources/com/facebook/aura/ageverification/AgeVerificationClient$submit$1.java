package com.facebook.aura.ageverification;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient", f = "AgeVerificationClient.kt", l = {272}, m = "submit-0E7RQCE", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$submit$1 extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AgeVerificationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeVerificationClient$submit$1(AgeVerificationClient ageVerificationClient, HtJ<? super AgeVerificationClient$submit$1> htJ) {
        super(htJ);
        this.this$0 = ageVerificationClient;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m218submit0E7RQCE(null, null, this));
    }
}
