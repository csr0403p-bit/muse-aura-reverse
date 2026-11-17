package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onLogOutClick;
    public final /* synthetic */ MutableState<Boolean> $showLogoutDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$3$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onLogOutClick = function0;
        this.$showLogoutDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchActivationSettingsScreenKt.logSettingsClick(HatchScreen.LOGOUT_DIALOG, HatchComponent.CONFIRM_BUTTON);
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        MutableState.A09(false, this.$showLogoutDialog$delegate);
        Function0<Unit> function0 = this.$onLogOutClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
