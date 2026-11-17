package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraInternalSettingsScreenKey;
import com.facebook.aura.navigation.key.InternalSettingsPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$AuraInternalStatusSettingsEntryProviderKt$lambda$548569093$1$1$2$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = AuraInternalSettingsScreenKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new AuraInternalSettingsScreenKey(InternalSettingsPage.MAIN), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
