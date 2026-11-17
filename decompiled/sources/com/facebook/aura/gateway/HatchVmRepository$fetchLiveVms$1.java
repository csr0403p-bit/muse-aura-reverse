package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {334}, m = "fetchLiveVms-IoAF18A", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$fetchLiveVms$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$fetchLiveVms$1(HatchVmRepository hatchVmRepository, HtJ<? super HatchVmRepository$fetchLiveVms$1> htJ) {
        super(htJ);
        this.this$0 = hatchVmRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m966fetchLiveVmsIoAF18A(this));
    }
}
