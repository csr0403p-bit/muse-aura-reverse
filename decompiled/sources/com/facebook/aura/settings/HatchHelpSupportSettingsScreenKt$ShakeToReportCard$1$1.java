package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHelpSupportSettingsScreenKt$ShakeToReportCard$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ SharedPreferences $rageShakePrefs;
    public final /* synthetic */ MutableState<Boolean> $shakeToReportEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHelpSupportSettingsScreenKt$ShakeToReportCard$1$1(SharedPreferences sharedPreferences, MutableState<Boolean> mutableState) {
        super(1);
        this.$rageShakePrefs = sharedPreferences;
        this.$shakeToReportEnabled$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.HELP_SUPPORT, HatchScreen.HELP_SUPPORT, HatchComponent.SHAKE_TO_REPORT_TOGGLE, null, null);
        MutableState.A09(z, this.$shakeToReportEnabled$delegate);
        this.$rageShakePrefs.edit().putBoolean(AuraRageShakeManager.PREF_KEY_ENABLED, z).apply();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
