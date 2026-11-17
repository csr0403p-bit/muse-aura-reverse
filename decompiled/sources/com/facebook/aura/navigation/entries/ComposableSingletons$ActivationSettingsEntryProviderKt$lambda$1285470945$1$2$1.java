package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LegalWebPageScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1285470945$1$2$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1285470945$1$2$1(AuraNavigator auraNavigator) {
        super(2);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        this.$navigator.navigate(new LegalWebPageScreenKey(str, str2), AnonymousClass004.A1b(str, str2));
    }
}
