package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchAddressFields$section$1$autocomplete$1$1 extends AbstractC7559F3s implements G0U<HatchAddressSuggestion, Map<String, ? extends String>> {
    public final /* synthetic */ HatchAddressFields this$0;

    @Override // X.G0U
    public final Map<String, String> invoke(HatchAddressSuggestion hatchAddressSuggestion) {
        C7384Etj.A0Y(hatchAddressSuggestion, 0);
        HatchAddressFields hatchAddressFields = this.this$0;
        return C3cH.A0n(hatchAddressFields.getZipId(), hatchAddressSuggestion.zip, C3cG.A0r(hatchAddressFields.getLine1Id(), hatchAddressSuggestion.line1), C3cG.A0r(hatchAddressFields.getCityId(), hatchAddressSuggestion.city), C3cG.A0r(hatchAddressFields.getStateId(), hatchAddressSuggestion.state));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAddressFields$section$1$autocomplete$1$1(HatchAddressFields hatchAddressFields) {
        super(1);
        this.this$0 = hatchAddressFields;
    }
}
