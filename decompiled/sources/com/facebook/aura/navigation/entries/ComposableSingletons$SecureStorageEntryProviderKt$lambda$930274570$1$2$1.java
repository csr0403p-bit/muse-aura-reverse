package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SecureStorageEntryProviderKt$lambda$-930274570$1$2$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchCredentialsViewModel $catalogViewModel;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1$2$1(HatchCredentialsViewModel hatchCredentialsViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$catalogViewModel = hatchCredentialsViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$catalogViewModel.loadCredentials();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
