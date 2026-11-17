package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionCatalog;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {343, 344}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$load$1$loadedState$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSubscriptionPaywallViewModel.UiState>, Object> {
    public final /* synthetic */ SubscriptionCatalog $cachedCatalog;
    public final /* synthetic */ CheckoutNotice $carriedNotice;
    public final /* synthetic */ boolean $isCvm;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallViewModel$load$1$loadedState$1(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, CheckoutNotice checkoutNotice, SubscriptionCatalog subscriptionCatalog, boolean z, HtJ<? super AuraSubscriptionPaywallViewModel$load$1$loadedState$1> htJ) {
        super(2, htJ);
        this.this$0 = auraSubscriptionPaywallViewModel;
        this.$carriedNotice = checkoutNotice;
        this.$cachedCatalog = subscriptionCatalog;
        this.$isCvm = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AuraSubscriptionPaywallViewModel$load$1$loadedState$1 auraSubscriptionPaywallViewModel$load$1$loadedState$1 = new AuraSubscriptionPaywallViewModel$load$1$loadedState$1(this.this$0, this.$carriedNotice, this.$cachedCatalog, this.$isCvm, htJ);
        auraSubscriptionPaywallViewModel$load$1$loadedState$1.L$0 = obj;
        return auraSubscriptionPaywallViewModel$load$1$loadedState$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r9 = r10.L$0
            X.3UX r9 = (X.C3UX) r9
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r8 = 2
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 == r6) goto L66
            if (r0 != r8) goto L8c
            java.lang.Object r2 = r10.L$3
            com.facebook.aura.subscription.repo.SubscriptionCatalog r2 = (com.facebook.aura.subscription.repo.SubscriptionCatalog) r2
            X.Hwg.A00(r11)
        L17:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState r11 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r11
            if (r2 == 0) goto L31
            if (r11 != 0) goto L83
            r3 = 1
        L1e:
            r6 = 0
        L1f:
            java.lang.String r2 = "load_paywall failed: missing_data (catalog="
            java.lang.String r1 = " details="
            java.lang.String r0 = ")"
            java.lang.String r1 = X.FGI.A0p(r2, r1, r0, r3, r6)
            java.lang.String r0 = "AuraSubscriptionPaywallViewModel"
            X.CFK.A06(r0, r1)
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Error r7 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Error.INSTANCE
        L30:
            return r7
        L31:
            r3 = 0
            if (r11 == 0) goto L1e
            goto L1f
        L35:
            X.Hwg.A00(r11)
            com.facebook.aura.subscription.repo.SubscriptionCatalog r3 = r10.$cachedCatalog
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel r2 = r10.this$0
            boolean r1 = r10.$isCvm
            r5 = 0
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1 r0 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$catalogDeferred$1
            r0.<init>(r3, r2, r1, r5)
            X.6ys r4 = X.C6ys.A00
            java.lang.Integer r3 = X.C79.A00
            X.Hrx r2 = X.GAo.A01(r3, r4, r0, r9)
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel r1 = r10.this$0
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1 r0 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1$detailsDeferred$1
            r0.<init>(r1, r5)
            X.Hrx r1 = X.GAo.A01(r3, r4, r0, r9)
            r10.L$0 = r5
            r10.L$1 = r5
            r10.L$2 = r1
            r10.label = r6
            java.lang.Object r11 = r2.A0E(r10)
            if (r11 != r7) goto L6d
            return r7
        L66:
            java.lang.Object r1 = r10.L$2
            X.27k r1 = (X.C27k) r1
            X.Hwg.A00(r11)
        L6d:
            com.facebook.aura.subscription.repo.SubscriptionCatalog r11 = (com.facebook.aura.subscription.repo.SubscriptionCatalog) r11
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r11
            r10.label = r8
            java.lang.Object r0 = X.C3cG.A0W(r1, r10)
            if (r0 == r7) goto L30
            r2 = r11
            r11 = r0
            goto L17
        L83:
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel r1 = r10.this$0
            com.facebook.aura.subscription.model.CheckoutNotice r0 = r10.$carriedNotice
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState r7 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.access$resolveLoadedState(r1, r2, r11, r0)
            return r7
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1$loadedState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super AuraSubscriptionPaywallViewModel.UiState> htJ) {
        return ((AuraSubscriptionPaywallViewModel$load$1$loadedState$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
