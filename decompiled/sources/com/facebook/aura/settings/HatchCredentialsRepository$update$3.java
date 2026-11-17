package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.qpl.module.MC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository", f = "HatchCredentialsRepository.kt", l = {MC.mwa_qpl_metadata.__CONFIG__}, m = "update-BWLJW6A", v = 2)
/* loaded from: classes2.dex */
public final class HatchCredentialsRepository$update$3 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$10;
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
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$update$3(HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super HatchCredentialsRepository$update$3> htJ) {
        super(htJ);
        this.this$0 = hatchCredentialsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1941updateBWLJW6A(null, null, null, this));
    }
}
