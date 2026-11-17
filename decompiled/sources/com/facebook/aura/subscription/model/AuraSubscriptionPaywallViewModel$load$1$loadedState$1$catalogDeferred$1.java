package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionCatalog;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {338}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SubscriptionCatalog>, Object> {
    public final /* synthetic */ SubscriptionCatalog $cachedCatalog;
    public final /* synthetic */ boolean $isCvm;
    public int label;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1(SubscriptionCatalog subscriptionCatalog, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, boolean z, HtJ<? super AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1> htJ) {
        super(2, htJ);
        this.$cachedCatalog = subscriptionCatalog;
        this.this$0 = auraSubscriptionPaywallViewModel;
        this.$isCvm = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1(this.$cachedCatalog, this.this$0, this.$isCvm, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            obj = this.$cachedCatalog;
            if (obj == null) {
                AuraSubscriptionRepository auraSubscriptionRepository = this.this$0.repository;
                boolean z = this.$isCvm;
                this.label = 1;
                obj = auraSubscriptionRepository.fetchSubscriptionCatalog(z, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return obj;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (obj == null) {
            return null;
        }
        this.this$0.catalogsByIsCvm.put(Boolean.valueOf(this.$isCvm), obj);
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super SubscriptionCatalog> htJ) {
        return ((AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
