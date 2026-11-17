package com.android.billingclient.api;

import X.AbstractC9548GOe;
import X.AbstractC9566GOx;
import X.AnonymousClass007;
import X.BV3;
import X.BV6;
import X.BV8;
import X.C60O;
import X.C9530GNh;
import X.EnumC9535GNn;
import X.FGI;
import X.GND;
import X.GNF;
import X.GNH;
import X.GNM;
import X.GNN;
import X.GO0;
import X.HmC;
import X.ServiceConnectionC9532GNj;
import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.s1;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class q extends s1 {
    public final int A00;
    public final ServiceConnectionC9532GNj A01;
    public final Boolean A02;
    public final /* synthetic */ C9530GNh A03;

    @Override // com.android.billingclient.s1
    public final boolean A02(Parcel parcel, Parcel parcel2, int i) {
        C9530GNh c9530GNh;
        ServiceConnectionC9532GNj serviceConnectionC9532GNj;
        GNM gnmA00;
        EnumC9535GNn enumC9535GNn;
        boolean zBooleanValue;
        int i2;
        GNF gnd;
        String strA0H;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
        s1.A00(parcel);
        if (bundle == null) {
            GNN.A06("BillingClient", "Response bundle is null.");
            serviceConnectionC9532GNj = this.A01;
            gnmA00 = GO0.A0K;
            enumC9535GNn = EnumC9535GNn.A21;
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            GNN.A06("BillingClient", "Response bundle doesn't contain a response code");
            serviceConnectionC9532GNj = this.A01;
            gnmA00 = GO0.A0K;
            enumC9535GNn = EnumC9535GNn.A2M;
        } else {
            if (bundle.getInt("RESPONSE_CODE") != 0) {
                serviceConnectionC9532GNj = this.A01;
                int i3 = bundle.getInt("RESPONSE_CODE");
                String string = bundle.getString("DEBUG_MESSAGE", "");
                GNM gnm = GO0.A00;
                gnmA00 = AbstractC9548GOe.A00(string, i3);
                enumC9535GNn = EnumC9535GNn.A03;
                zBooleanValue = this.A02.booleanValue();
                strA0H = FGI.A0H("Response code from Phonesky: ", bundle.getInt("RESPONSE_CODE"));
                i2 = this.A00;
                C9530GNh.A09(this.A03, 0);
                serviceConnectionC9532GNj.A08(gnmA00, enumC9535GNn, strA0H, i2, zBooleanValue);
                serviceConnectionC9532GNj.A07(gnmA00);
                return true;
            }
            if (bundle.containsKey("BILLING_API_VERSION_KEY")) {
                int i4 = bundle.getInt("BILLING_API_VERSION_KEY");
                c9530GNh = this.A03;
                C9530GNh.A07(c9530GNh, i4);
                c9530GNh.A09 = i4 >= 3;
                Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
                if (bundle2 != null) {
                    try {
                        AbstractC9566GOx.A04 = bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
                    } catch (Throwable th) {
                        GNN.A07("BillingClient", AnonymousClass007.A0a("Error reading EnableDelegationApi experiment flag: ", bundle2), th);
                    }
                    try {
                        AbstractC9566GOx.A01 = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
                    } catch (Throwable th2) {
                        GNN.A07("BillingClient", AnonymousClass007.A0a("Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ", bundle2), th2);
                    }
                    try {
                        AbstractC9566GOx.A02 = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
                    } catch (Throwable th3) {
                        GNN.A07("BillingClient", AnonymousClass007.A0a("Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ", bundle2), th3);
                    }
                    try {
                        AbstractC9566GOx.A00 = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
                    } catch (Throwable th4) {
                        GNN.A07("BillingClient", AnonymousClass007.A0a("Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ", bundle2), th4);
                    }
                    try {
                        AbstractC9566GOx.A03 = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
                    } catch (Throwable th5) {
                        GNN.A07("BillingClient", AnonymousClass007.A0a("Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ", bundle2), th5);
                    }
                }
                Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
                if (bundle3 != null) {
                    Object[] objArrCopyOf = new Object[4];
                    int i5 = 0;
                    for (HmC hmC : HmC.values()) {
                        if (bundle3.getBoolean(hmC.name(), false)) {
                            int length = objArrCopyOf.length;
                            int i6 = i5 + 1;
                            if (i6 < 0) {
                                throw C60O.A0i(BV3.A00(54));
                            }
                            if (i6 > length && (length = length + (length >> 1) + 1) < i6 && (length = Integer.highestOneBit(i5) << 1) < 0) {
                                length = Integer.MAX_VALUE;
                            }
                            if (length > length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, length);
                            }
                            int i7 = i5;
                            i5++;
                            objArrCopyOf[i7] = hmC;
                        }
                    }
                    if (i5 == 0) {
                        gnd = GNH.A05;
                    } else if (i5 != 1) {
                        gnd = GNF.A01(objArrCopyOf, i5);
                        gnd.size();
                    } else {
                        gnd = new GND(BV6.A0n(objArrCopyOf, 0));
                    }
                    c9530GNh.A03 = gnd;
                    if (c9530GNh.A0T != null) {
                        c9530GNh.A0T.A00 = c9530GNh.A03;
                    }
                }
                if (c9530GNh.A00 < 3) {
                    GNN.A06("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    serviceConnectionC9532GNj = this.A01;
                    gnmA00 = GO0.A0E;
                    enumC9535GNn = EnumC9535GNn.A0V;
                    zBooleanValue = this.A02.booleanValue();
                    i2 = this.A00;
                    C9530GNh.A09(c9530GNh, 0);
                    strA0H = null;
                    serviceConnectionC9532GNj.A08(gnmA00, enumC9535GNn, strA0H, i2, zBooleanValue);
                    serviceConnectionC9532GNj.A07(gnmA00);
                    return true;
                }
                serviceConnectionC9532GNj = this.A01;
                boolean zBooleanValue2 = this.A02.booleanValue();
                int i8 = this.A00;
                C9530GNh.A08(c9530GNh, 0);
                synchronized (c9530GNh.A0O) {
                    if (c9530GNh.A0R == 3) {
                        return true;
                    }
                    serviceConnectionC9532GNj.A06(i8, zBooleanValue2);
                    gnmA00 = GO0.A0L;
                    serviceConnectionC9532GNj.A07(gnmA00);
                    return true;
                }
            }
            GNN.A06("BillingClient", "Billing API version not found in response bundle.");
            serviceConnectionC9532GNj = this.A01;
            gnmA00 = GO0.A0K;
            enumC9535GNn = EnumC9535GNn.A2J;
        }
        zBooleanValue = this.A02.booleanValue();
        i2 = this.A00;
        c9530GNh = this.A03;
        C9530GNh.A09(c9530GNh, 0);
        strA0H = null;
        serviceConnectionC9532GNj.A08(gnmA00, enumC9535GNn, strA0H, i2, zBooleanValue);
        serviceConnectionC9532GNj.A07(gnmA00);
        return true;
    }

    public q() {
        attachInterface(this, "com.android.vending.billing.IInAppBillingInitializeCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(C9530GNh c9530GNh, ServiceConnectionC9532GNj serviceConnectionC9532GNj, Boolean bool, int i) {
        this();
        this.A03 = c9530GNh;
        this.A01 = serviceConnectionC9532GNj;
        this.A02 = bool;
        this.A00 = i;
    }
}
