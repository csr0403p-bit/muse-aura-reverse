package com.android.billingclient.api;

import X.BV8;
import X.C9558GOp;
import X.EnumC9535GNn;
import X.EnumC9540GNw;
import X.FGI;
import X.G4i;
import X.GNK;
import X.GNM;
import X.GNN;
import X.GNO;
import X.GNT;
import X.GNr;
import X.GO0;
import X.GOW;
import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.s1;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class n extends s1 {
    public final int A00;
    public final GNK A01;
    public final GOW A02;

    @Override // com.android.billingclient.s1
    public final boolean A02(Parcel parcel, Parcel parcel2, int i) {
        GNM gnmA00;
        GNK gnk;
        EnumC9535GNn enumC9535GNn;
        EnumC9540GNw enumC9540GNw;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
        s1.A00(parcel);
        if (bundle == null) {
            gnk = this.A01;
            enumC9535GNn = EnumC9535GNn.A1f;
            enumC9540GNw = EnumC9540GNw.A0B;
            gnmA00 = GO0.A0K;
        } else {
            int iA00 = GNN.A00(bundle, "BillingClient");
            String strA03 = GNN.A03(bundle, "BillingClient");
            GNO gno = new GNO();
            gno.A00 = iA00;
            gno.A01 = strA03;
            if (iA00 != 0) {
                GNN.A06("BillingClient", FGI.A0H("getBillingConfig() failed. Response code: ", iA00));
                gnmA00 = gno.A00();
                gnk = this.A01;
                enumC9535GNn = EnumC9535GNn.A2E;
            } else {
                if (bundle.containsKey("BILLING_CONFIG")) {
                    try {
                        this.A02.A00(new C9558GOp(bundle.getString("BILLING_CONFIG")), gno.A00());
                    } catch (JSONException e) {
                        GNN.A07("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
                        GNK gnk2 = this.A01;
                        EnumC9535GNn enumC9535GNn2 = EnumC9535GNn.A1l;
                        EnumC9540GNw enumC9540GNw2 = EnumC9540GNw.A0B;
                        GNM gnm = GO0.A0K;
                        ((GNT) gnk2).A04(GNr.A00(gnm, enumC9540GNw2, enumC9535GNn2, G4i.A01, null), this.A00);
                        this.A02.A00(null, gnm);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                GNN.A06("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                gno.A00 = 6;
                gnmA00 = gno.A00();
                gnk = this.A01;
                enumC9535GNn = EnumC9535GNn.A1i;
            }
            enumC9540GNw = EnumC9540GNw.A0B;
        }
        ((GNT) gnk).A04(GNr.A00(gnmA00, enumC9540GNw, enumC9535GNn, G4i.A01, null), this.A00);
        this.A02.A00(null, gnmA00);
        parcel2.writeNoException();
        return true;
    }

    public n() {
        attachInterface(this, "com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    public n(GNK gnk, GOW gow, int i) {
        this();
        this.A02 = gow;
        this.A01 = gnk;
        this.A00 = i;
    }
}
