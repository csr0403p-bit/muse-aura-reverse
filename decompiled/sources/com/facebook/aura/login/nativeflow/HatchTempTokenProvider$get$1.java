package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchTempTokenProvider", f = "HatchTempTokenProvider.kt", l = {111, 50}, m = "get-IoAF18A", v = 2)
/* loaded from: classes2.dex */
public final class HatchTempTokenProvider$get$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchTempTokenProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTempTokenProvider$get$1(HatchTempTokenProvider hatchTempTokenProvider, HtJ<? super HatchTempTokenProvider$get$1> htJ) {
        super(htJ);
        this.this$0 = hatchTempTokenProvider;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1272getIoAF18A(this));
    }
}
