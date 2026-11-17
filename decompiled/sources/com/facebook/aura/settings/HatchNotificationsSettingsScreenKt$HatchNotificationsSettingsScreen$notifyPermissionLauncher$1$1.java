package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$notifyPermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasNotifyPermission$delegate;
    public final /* synthetic */ MutableState<Boolean> $showDeniedDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$notifyPermissionLauncher$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$hasNotifyPermission$delegate = mutableState;
        this.$showDeniedDialog$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$hasNotifyPermission$delegate);
        if (z) {
            return;
        }
        MutableState.A09(true, this.$showDeniedDialog$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
