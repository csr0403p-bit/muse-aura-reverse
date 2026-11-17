package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$22$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $defaultDisclosureText;
    public final /* synthetic */ AuraDisclosureViewModel $disclosureViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$22$1(AuraDisclosureViewModel auraDisclosureViewModel, String str) {
        super(0);
        this.$disclosureViewModel = auraDisclosureViewModel;
        this.$defaultDisclosureText = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$disclosureViewModel.onClose(this.$defaultDisclosureText);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
