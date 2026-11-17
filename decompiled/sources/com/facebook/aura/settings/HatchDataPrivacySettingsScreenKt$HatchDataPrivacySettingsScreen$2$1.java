package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isResetting;
    public final /* synthetic */ MutableState<Boolean> $showResetDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$2$1(boolean z, MutableState<Boolean> mutableState) {
        super(0);
        this.$isResetting = z;
        this.$showResetDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isResetting) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.DATA_CONTROLS, HatchScreen.RESET_HATCH_DIALOG, HatchComponent.CLOSE_BUTTON, null, null);
        MutableState.A09(false, this.$showResetDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
