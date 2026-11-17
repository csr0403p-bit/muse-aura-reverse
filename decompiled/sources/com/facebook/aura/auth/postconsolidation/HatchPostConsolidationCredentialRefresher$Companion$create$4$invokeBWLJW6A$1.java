package com.facebook.aura.auth.postconsolidation;

import X.HtJ;
import X.HzP;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$create$4", f = "HatchPostConsolidationCredentialRefresher.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invoke-BWLJW6A", v = 2)
/* renamed from: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$create$4$invoke-BWLJW6A$1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher$Companion$create$4$invokeBWLJW6A$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchPostConsolidationCredentialRefresher$Companion$create$4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPostConsolidationCredentialRefresher$Companion$create$4$invokeBWLJW6A$1(HatchPostConsolidationCredentialRefresher$Companion$create$4 hatchPostConsolidationCredentialRefresher$Companion$create$4, HtJ<? super HatchPostConsolidationCredentialRefresher$Companion$create$4$invokeBWLJW6A$1> htJ) {
        super(htJ);
        this.this$0 = hatchPostConsolidationCredentialRefresher$Companion$create$4;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
