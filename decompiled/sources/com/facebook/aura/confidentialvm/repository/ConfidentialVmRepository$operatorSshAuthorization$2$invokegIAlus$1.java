package com.facebook.aura.confidentialvm.repository;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$2", f = "ConfidentialVmRepository.kt", l = {1109}, m = "invoke-gIAlu-s", v = 2)
/* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$2$invoke-gIAlu-s$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$operatorSshAuthorization$2$invokegIAlus$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfidentialVmRepository$operatorSshAuthorization$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$operatorSshAuthorization$2$invokegIAlus$1(ConfidentialVmRepository$operatorSshAuthorization$2 confidentialVmRepository$operatorSshAuthorization$2, HtJ<? super ConfidentialVmRepository$operatorSshAuthorization$2$invokegIAlus$1> htJ) {
        super(htJ);
        this.this$0 = confidentialVmRepository$operatorSshAuthorization$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
