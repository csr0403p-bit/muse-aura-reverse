package com.facebook.aura.navigation.entries;

import X.C7438Evz;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$17$1 extends C7438Evz implements Function0<Unit> {
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$17$1(Object obj) {
        super(0, obj, AuraActivationViewModel.class, "onAgeLogOutConfirmationDismissed", "onAgeLogOutConfirmationDismissed()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraActivationViewModel) this.receiver).onAgeLogOutConfirmationDismissed();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
