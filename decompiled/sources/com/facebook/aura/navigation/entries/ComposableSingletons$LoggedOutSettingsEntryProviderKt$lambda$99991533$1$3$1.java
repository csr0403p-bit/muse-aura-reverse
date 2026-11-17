package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LoggedOutLegalSafetyScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$-99991533$1$3$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$3$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) LoggedOutLegalSafetyScreenKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
