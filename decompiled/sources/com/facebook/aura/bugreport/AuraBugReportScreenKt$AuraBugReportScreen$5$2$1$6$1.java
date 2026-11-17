package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$6$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $selectedCategoryId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$6$1(MutableState<String> mutableState) {
        super(1);
        this.$selectedCategoryId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        MutableState<String> mutableState = this.$selectedCategoryId$delegate;
        float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
        mutableState.Af8(str);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        if (str != null) {
            hatchInteractionLogger.logClick(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.BUG_REPORT_CATEGORY_CHIP, null, null, null);
        } else {
            hatchInteractionLogger.logToggle(false, HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.BUG_REPORT_CATEGORY_CHIP, null, null);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
