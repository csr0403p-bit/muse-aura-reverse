package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV4;
import X.BV6;
import X.BV7;
import X.C4158CoD;
import X.CS7;
import X.DA8;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = C4158CoD.A03(46);
    public final DA8 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (this.A01 == zzhVar.A01) {
            return CS7.A00(this.A00, zzhVar.A00);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(Boolean.valueOf(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A01;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A08(parcel, 1, z);
        DA8 da8 = this.A00;
        AbstractC4100CmU.A0D(parcel, da8 == null ? null : da8.A04(), 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zzh(DA8 da8, boolean z) {
        this.A01 = z;
        this.A00 = da8;
    }

    public final JSONObject A00() throws JSONException {
        try {
            JSONObject jSONObjectA18 = BV4.A18();
            if (this.A01) {
                jSONObjectA18.put("enabled", true);
            }
            DA8 da8 = this.A00;
            byte[] bArrA04 = da8 == null ? null : da8.A04();
            if (bArrA04 != null) {
                JSONObject jSONObjectA182 = BV4.A18();
                BV6.A1N("first", jSONObjectA182, Arrays.copyOf(bArrA04, 32));
                if (bArrA04.length == 64) {
                    BV6.A1N("second", jSONObjectA182, Arrays.copyOfRange(bArrA04, 32, 64));
                }
                jSONObjectA18.put("results", jSONObjectA182);
            }
            return jSONObjectA18;
        } catch (JSONException e) {
            throw BV4.A0d("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final String toString() {
        return FGI.A0U("AuthenticationExtensionsPrfOutputs{", A00().toString(), "}");
    }
}
