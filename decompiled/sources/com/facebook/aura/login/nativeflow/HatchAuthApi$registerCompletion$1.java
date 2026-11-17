package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi", f = "HatchAuthApi.kt", l = {223}, m = "registerCompletion-5p_uFSQ", v = 2)
/* loaded from: classes6.dex */
public final class HatchAuthApi$registerCompletion$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAuthApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$registerCompletion$1(HatchAuthApi hatchAuthApi, HtJ<? super HatchAuthApi$registerCompletion$1> htJ) {
        super(htJ);
        this.this$0 = hatchAuthApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1257registerCompletion5p_uFSQ(null, null, null, null, null, null, null, null, null, null, this));
    }
}
