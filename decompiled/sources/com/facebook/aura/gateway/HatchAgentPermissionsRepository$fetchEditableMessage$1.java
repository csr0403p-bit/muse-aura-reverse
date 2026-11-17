package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "fetchEditableMessage-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$fetchEditableMessage$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$fetchEditableMessage$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super HatchAgentPermissionsRepository$fetchEditableMessage$1> htJ) {
        super(htJ);
        this.this$0 = hatchAgentPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m951fetchEditableMessagegIAlus(null, this));
    }
}
