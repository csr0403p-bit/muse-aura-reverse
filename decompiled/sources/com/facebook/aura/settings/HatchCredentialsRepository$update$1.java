package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsRepository", f = "HatchCredentialsRepository.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "update-yxL6bBk", v = 2)
/* loaded from: classes2.dex */
public final class HatchCredentialsRepository$update$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchCredentialsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsRepository$update$1(HatchCredentialsRepository hatchCredentialsRepository, HtJ<? super HatchCredentialsRepository$update$1> htJ) {
        super(htJ);
        this.this$0 = hatchCredentialsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1946updateyxL6bBk(null, null, null, null, this));
    }
}
