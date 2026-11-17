package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$2$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ SharedPreferences $prefs;
    public final /* synthetic */ MutableState<Boolean> $shakeToReportEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$2$1$1$1(SharedPreferences sharedPreferences, MutableState<Boolean> mutableState) {
        super(1);
        this.$prefs = sharedPreferences;
        this.$shakeToReportEnabled$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.SHAKE_TO_REPORT_TOGGLE, null, null);
        MutableState.A09(z, this.$shakeToReportEnabled$delegate);
        SharedPreferences sharedPreferences = this.$prefs;
        C7384Etj.A0X(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(AuraRageShakeManager.PREF_KEY_ENABLED, z);
        editorEdit.apply();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
