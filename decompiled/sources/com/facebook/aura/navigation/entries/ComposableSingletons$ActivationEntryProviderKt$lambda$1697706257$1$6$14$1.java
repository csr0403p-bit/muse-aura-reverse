package com.facebook.aura.navigation.entries;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$14$1 extends C7438Evz implements G0V<AgeCheckMethod, Integer, Unit> {
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$14$1(Object obj) {
        super(2, obj, AuraActivationViewModel.class, "onAgeMethodPicked", "onAgeMethodPicked(Lcom/facebook/aura/user/provider/AgeCheckMethod;I)V", 0);
    }

    public final void invoke(AgeCheckMethod ageCheckMethod, int i) {
        ((AuraActivationViewModel) AnonymousClass006.A0o(ageCheckMethod, this)).onAgeMethodPicked(ageCheckMethod, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AgeCheckMethod ageCheckMethod, Integer num) {
        invoke(ageCheckMethod, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
