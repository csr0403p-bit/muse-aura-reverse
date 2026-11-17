package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraSubscriptionNameGateViewModel.HeldPurchase $held;
    public final /* synthetic */ Function0<Unit> $leavePage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$3$1(AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchase, Function0<Unit> function0) {
        super(1);
        this.$held = heldPurchase;
        this.$leavePage = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$held == null) {
            this.$leavePage.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
