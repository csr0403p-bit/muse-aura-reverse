package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$PasswordsSettingsRow$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PasswordsEntryPoint $entryPoint;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPasswordsScreenKt$PasswordsSettingsRow$2$1(AuraNavigator auraNavigator, PasswordsEntryPoint passwordsEntryPoint) {
        super(0);
        this.$navigator = auraNavigator;
        this.$entryPoint = passwordsEntryPoint;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.entryRowTapped();
        this.$navigator.navigate(this.$entryPoint.getDestination(), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
