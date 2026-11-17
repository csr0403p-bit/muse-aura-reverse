package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$17$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchCcvViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchCcvCardEntryHostKt.logCcvClick(HatchComponent.CCV_COUNTRY_PICKER);
        this.$viewModel.onBillingCountrySelected(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$17$1(HatchCcvViewModel hatchCcvViewModel) {
        super(1);
        this.$viewModel = hatchCcvViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
