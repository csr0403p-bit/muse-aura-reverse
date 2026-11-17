package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$3$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ G0U<Boolean, Unit> $onEnabledChange;
    public final /* synthetic */ MutableState<Boolean> $showTurnOffDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$3$1(boolean z, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$checked = z;
        this.$onEnabledChange = g0u;
        this.$showTurnOffDialog$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        if (z != this.$checked) {
            HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.DATA_CONTROLS, HatchScreen.DATA_CONTROLS, HatchComponent.AI_TRAINING_TOGGLE, null, null);
            if (!this.$checked || z) {
                AnonymousClass001.A1K(true, this.$onEnabledChange);
            } else {
                MutableState.A09(true, this.$showTurnOffDialog$delegate);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
