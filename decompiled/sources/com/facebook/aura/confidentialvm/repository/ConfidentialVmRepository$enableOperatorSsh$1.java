package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {1398, 1422, 1448, 1422}, m = "enableOperatorSsh-IoAF18A", v = 2)
/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$enableOperatorSsh$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
    public Object L$16;
    public Object L$17;
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
    public final /* synthetic */ ConfidentialVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$enableOperatorSsh$1(ConfidentialVmRepository confidentialVmRepository, HtJ<? super ConfidentialVmRepository$enableOperatorSsh$1> htJ) {
        super(htJ);
        this.this$0 = confidentialVmRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m450enableOperatorSshIoAF18A(this));
    }
}
