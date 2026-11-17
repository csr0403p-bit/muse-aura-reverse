package com.facebook.aura.navigation.entries;

import X.C7438Evz;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$2$1 extends C7438Evz implements Function0<Unit> {
    public ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$2$1(Object obj) {
        super(0, obj, HatchRedeemInviteCodeViewModel.class, "onConfirmClick", "onConfirmClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchRedeemInviteCodeViewModel) this.receiver).onConfirmClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
