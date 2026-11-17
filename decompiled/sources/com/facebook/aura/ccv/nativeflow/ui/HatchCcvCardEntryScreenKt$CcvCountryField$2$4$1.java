package com.facebook.aura.ccv.nativeflow.ui;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCountryField$2$4$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ AHD<HatchCcvCountryConfig> $countries;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<String, Unit> $onSelect;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        HatchCcvCountryConfig hatchCcvCountryConfig = (HatchCcvCountryConfig) AbstractC0878AGe.A0A(auraContextMenuItem.id, this.$countries);
        if (hatchCcvCountryConfig != null) {
            this.$onSelect.invoke(hatchCcvCountryConfig.country);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvCountryField$2$4$1(AHD<HatchCcvCountryConfig> ahd, MutableState<Boolean> mutableState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$countries = ahd;
        this.$expanded$delegate = mutableState;
        this.$onSelect = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
