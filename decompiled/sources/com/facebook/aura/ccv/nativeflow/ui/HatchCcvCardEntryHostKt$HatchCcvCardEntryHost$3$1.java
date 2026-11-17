package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $hasLoggedCountryPicker$delegate;
    public final /* synthetic */ boolean $isCountryPickerShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$3$1(boolean z, MutableState<Boolean> mutableState) {
        super(1);
        this.$isCountryPickerShown = z;
        this.$hasLoggedCountryPicker$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isCountryPickerShown && !MutableState.A0A((MutableState) this.$hasLoggedCountryPicker$delegate)) {
            MutableState.A09(true, this.$hasLoggedCountryPicker$delegate);
            HatchCcvCardEntryHostKt.logCcvImpression(HatchComponent.CCV_COUNTRY_PICKER, null);
        }
        return new C78g() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
