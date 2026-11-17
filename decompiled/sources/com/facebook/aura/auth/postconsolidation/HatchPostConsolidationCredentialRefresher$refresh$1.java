package com.facebook.aura.auth.postconsolidation;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher", f = "HatchPostConsolidationCredentialRefresher.kt", l = {81}, m = "refresh$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation", v = 2)
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher$refresh$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchPostConsolidationCredentialRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPostConsolidationCredentialRefresher$refresh$1(HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher, HtJ<? super HatchPostConsolidationCredentialRefresher$refresh$1> htJ) {
        super(htJ);
        this.this$0 = hatchPostConsolidationCredentialRefresher;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation(null, this);
    }
}
