package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi", f = "HatchAuthApi.kt", l = {878}, m = "confirmPasskey-BWLJW6A", v = 2)
/* loaded from: classes6.dex */
public final class HatchAuthApi$confirmPasskey$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAuthApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$confirmPasskey$1(HatchAuthApi hatchAuthApi, HtJ<? super HatchAuthApi$confirmPasskey$1> htJ) {
        super(htJ);
        this.this$0 = hatchAuthApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1252confirmPasskeyBWLJW6A(null, null, null, this));
    }
}
