package com.facebook.aura.network.acs;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.acs.HatchAcsCvmClient", f = "HatchAcsCvmClient.kt", l = {15}, m = "issueCredential-IoAF18A", v = 2)
/* loaded from: classes4.dex */
public final class HatchAcsCvmClient$issueCredential$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAcsCvmClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAcsCvmClient$issueCredential$1(HatchAcsCvmClient hatchAcsCvmClient, HtJ<? super HatchAcsCvmClient$issueCredential$1> htJ) {
        super(htJ);
        this.this$0 = hatchAcsCvmClient;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1582issueCredentialIoAF18A(this));
    }
}
