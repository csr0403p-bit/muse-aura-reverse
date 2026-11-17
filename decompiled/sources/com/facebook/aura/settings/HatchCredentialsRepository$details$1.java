package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository", f = "HatchCredentialsRepository.kt", l = {127}, m = "details-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class HatchCredentialsRepository$details$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$details$1(HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super HatchCredentialsRepository$details$1> htJ) {
        super(htJ);
        this.this$0 = hatchCredentialsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1944detailsgIAlus(null, this));
    }
}
