package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$2$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $lastName$delegate;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$lastName$delegate.Af8(str);
        this.$nameGateViewModel.onNameEdited();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1$2$1$1(AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, MutableState<String> mutableState) {
        super(1);
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$lastName$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
