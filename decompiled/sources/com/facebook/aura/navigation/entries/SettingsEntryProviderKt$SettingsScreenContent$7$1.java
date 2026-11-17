package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.logout.AuraLogoutHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final SettingsEntryProviderKt$SettingsScreenContent$7$1 INSTANCE = new SettingsEntryProviderKt$SettingsScreenContent$7$1();

    public SettingsEntryProviderKt$SettingsScreenContent$7$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        AuraLogoutHelper.INSTANCE.performLogout();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraLogoutHelper.INSTANCE.performLogout();
    }
}
