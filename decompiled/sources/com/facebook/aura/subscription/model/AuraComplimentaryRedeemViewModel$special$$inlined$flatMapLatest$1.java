package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.C20Z;
import X.G0W;
import X.HtJ;
import com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1", f = "AuraComplimentaryRedeemViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super AuraComplimentaryRedeemViewModel.UiState>, SubscriptionDetailsState, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AuraComplimentaryRedeemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1(HtJ htJ, AuraComplimentaryRedeemViewModel auraComplimentaryRedeemViewModel) {
        super(3, htJ);
        this.this$0 = auraComplimentaryRedeemViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = r6.L$0
            X.20Z r5 = (X.C20Z) r5
            java.lang.Object r1 = r6.L$1
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 != r3) goto L5e
            X.Hwg.A00(r7)
        L12:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L15:
            X.Hwg.A00(r7)
            com.facebook.aura.subscription.repo.SubscriptionDetailsState r1 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r1
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Unresolved r0 = com.facebook.aura.subscription.repo.SubscriptionDetailsState.Unresolved.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L37
            com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$UiState$Loading r0 = com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel.UiState.Loading.INSTANCE
        L24:
            X.20Y r1 = new X.20Y
            r1.<init>(r0)
        L29:
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r3
            java.lang.Object r0 = X.C3pU.A01(r6, r1, r5)
            if (r0 != r4) goto L12
            return r4
        L37:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Failed r0 = com.facebook.aura.subscription.repo.SubscriptionDetailsState.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L5b
            boolean r0 = r1 instanceof com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success
            if (r0 == 0) goto L63
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r1 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success) r1
            com.facebook.aura.subscription.repo.SubscriptionDetails r0 = r1.details
            com.facebook.aura.subscription.repo.ComplimentaryRedeemPage r2 = r0.complimentaryRedeemPage
            if (r2 == 0) goto L5b
            com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel r0 = r6.this$0
            com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController r1 = r0.controller
            java.lang.String r0 = r2.offerId
            X.20Q r0 = r1.stateFor(r0)
            com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$uiState$lambda$0$$inlined$map$1 r1 = new com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$uiState$lambda$0$$inlined$map$1
            r1.<init>(r0, r2)
            goto L29
        L5b:
            com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$UiState$Closed r0 = com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel.UiState.Closed.INSTANCE
            goto L24
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L63:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super AuraComplimentaryRedeemViewModel.UiState> c20z, SubscriptionDetailsState subscriptionDetailsState, HtJ<? super Unit> htJ) {
        AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1 auraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1 = new AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1(htJ, this.this$0);
        auraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1.L$0 = c20z;
        auraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1.L$1 = subscriptionDetailsState;
        return auraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
