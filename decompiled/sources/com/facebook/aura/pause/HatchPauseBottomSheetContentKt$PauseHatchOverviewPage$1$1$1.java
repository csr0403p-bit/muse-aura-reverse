package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPauseBottomSheetContentKt$PauseHatchOverviewPage$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onContinue;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        Function0<Unit> function0 = this.$onContinue;
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120f32, null, null, null, true, false, null, function0, null, null, bs0, i);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120ed6, null, null, null, true, false, null, this.$onCancel, null, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetContentKt$PauseHatchOverviewPage$1$1$1(Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$onContinue = function0;
        this.$onCancel = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
