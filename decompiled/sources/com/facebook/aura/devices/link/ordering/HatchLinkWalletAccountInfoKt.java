package com.facebook.aura.devices.link.ordering;

import X.AGI;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.wallet.address.HatchWalletAccountInfoResponseJson;
import com.facebook.aura.wallet.address.HatchWalletSavedAddressJson;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HatchLinkWalletAccountInfoKt {
    public static final HatchLinkSavedDetails toSavedDetails(HatchWalletAccountInfoResponseJson hatchWalletAccountInfoResponseJson) {
        C7384Etj.A0Y(hatchWalletAccountInfoResponseJson, 0);
        List<HatchWalletSavedAddressJson> list = hatchWalletAccountInfoResponseJson.addresses;
        ArrayList<HatchWalletSavedAddressJson> arrayListA0h = C3cG.A0h();
        for (HatchWalletSavedAddressJson hatchWalletSavedAddressJson : list) {
            HatchWalletSavedAddressJson hatchWalletSavedAddressJson2 = hatchWalletSavedAddressJson;
            String str = hatchWalletSavedAddressJson2.country;
            if (str != null && str.equalsIgnoreCase("US") && !C7BY.A0j(hatchWalletSavedAddressJson2.street1) && !C7BY.A0j(hatchWalletSavedAddressJson2.city) && !C7BY.A0j(hatchWalletSavedAddressJson2.state)) {
                AnonymousClass006.A1F(hatchWalletSavedAddressJson2.postal_code, hatchWalletSavedAddressJson, arrayListA0h);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchWalletSavedAddressJson hatchWalletSavedAddressJson3 : arrayListA0h) {
            String str2 = hatchWalletSavedAddressJson3.id;
            if (str2 != null && !C7BY.A0j(str2)) {
                String str3 = hatchWalletSavedAddressJson3.street1;
                String str4 = hatchWalletSavedAddressJson3.street2;
                if (str4 == null) {
                    str4 = "";
                }
                arrayListA0h2.add(new HatchLinkSavedAddress(str2, str3, str4, hatchWalletSavedAddressJson3.city, hatchWalletSavedAddressJson3.state, hatchWalletSavedAddressJson3.postal_code));
            }
        }
        return new HatchLinkSavedDetails(AGI.A07(arrayListA0h2));
    }
}
