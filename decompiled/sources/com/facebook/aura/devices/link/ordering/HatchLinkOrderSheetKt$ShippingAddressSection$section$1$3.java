package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.checkout.ui.HatchSelectableOption;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$ShippingAddressSection$section$1$3 extends AbstractC7559F3s implements G0U<HatchSelectableOption, Unit> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $latestOnEditAddress$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSelectableOption hatchSelectableOption) {
        C7384Etj.A0Y(hatchSelectableOption, 0);
        C1BO<G0U<String, Unit>> c1bo = this.$latestOnEditAddress$delegate;
        Set<HatchLinkOrderField> set = HatchLinkOrderSheetKt.ADDRESS_FIELDS;
        C1BO.A0B(c1bo).invoke(hatchSelectableOption.id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderSheetKt$ShippingAddressSection$section$1$3(C1BO<? extends G0U<? super String, Unit>> c1bo) {
        super(1);
        this.$latestOnEditAddress$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSelectableOption hatchSelectableOption) {
        invoke2(hatchSelectableOption);
        return Unit.INSTANCE;
    }
}
