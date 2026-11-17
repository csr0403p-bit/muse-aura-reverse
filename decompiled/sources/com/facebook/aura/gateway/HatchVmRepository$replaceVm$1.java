package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {1054, 571, 574}, m = "replaceVm-BWLJW6A", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$replaceVm$1 extends HzP {
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
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$replaceVm$1(HatchVmRepository hatchVmRepository, HtJ<? super HatchVmRepository$replaceVm$1> htJ) {
        super(htJ);
        this.this$0 = hatchVmRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m962replaceVmBWLJW6A(null, null, null, this));
    }
}
