package com.facebook.aura.subscription.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {524}, m = "applyChange-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository$applyChange$1 extends HzP {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraSubscriptionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionRepository$applyChange$1(AuraSubscriptionRepository auraSubscriptionRepository, HtJ<? super AuraSubscriptionRepository$applyChange$1> htJ) {
        super(htJ);
        this.this$0 = auraSubscriptionRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2259applyChange0E7RQCE(null, false, this));
    }
}
