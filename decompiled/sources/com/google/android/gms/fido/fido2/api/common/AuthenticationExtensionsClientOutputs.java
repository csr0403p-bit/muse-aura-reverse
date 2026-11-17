package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV4;
import X.BV7;
import X.C4158CoD;
import X.CS7;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = C4158CoD.A03(43);
    public final AuthenticationExtensionsCredPropsOutputs A00;
    public final UvmEntries A01;
    public final zzf A02;
    public final zzh A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (CS7.A01(this.A01, authenticationExtensionsClientOutputs.A01) && CS7.A01(this.A02, authenticationExtensionsClientOutputs.A02) && CS7.A01(this.A00, authenticationExtensionsClientOutputs.A00) && CS7.A01(this.A03, authenticationExtensionsClientOutputs.A03)) {
            return CS7.A00(this.A04, authenticationExtensionsClientOutputs.A04);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0F(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public AuthenticationExtensionsClientOutputs(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, UvmEntries uvmEntries, zzf zzfVar, zzh zzhVar, String str) {
        this.A01 = uvmEntries;
        this.A02 = zzfVar;
        this.A00 = authenticationExtensionsCredPropsOutputs;
        this.A03 = zzhVar;
        this.A04 = str;
    }

    public final JSONObject A00() throws JSONException {
        try {
            JSONObject jSONObjectA18 = BV4.A18();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.A00;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObjectA182 = BV4.A18();
                    jSONObjectA182.put("rk", authenticationExtensionsCredPropsOutputs.A00);
                    jSONObjectA18.put("credProps", jSONObjectA182);
                } catch (JSONException e) {
                    throw BV4.A0d("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.A01;
            if (uvmEntries != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    List list = uvmEntries.A00;
                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            UvmEntry uvmEntry = (UvmEntry) list.get(i);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put((int) uvmEntry.A02);
                            jSONArray2.put((int) uvmEntry.A01);
                            jSONArray2.put((int) uvmEntry.A02);
                            jSONArray.put(i, jSONArray2);
                        }
                    }
                    jSONObjectA18.put("uvm", jSONArray);
                } catch (JSONException e2) {
                    throw BV4.A0d("Error encoding UvmEntries to JSON object", e2);
                }
            }
            zzh zzhVar = this.A03;
            if (zzhVar != null) {
                jSONObjectA18.put("prf", zzhVar.A00());
            }
            Object obj = this.A04;
            if (obj != null) {
                jSONObjectA18.put("txAuthSimple", obj);
            }
            return jSONObjectA18;
        } catch (JSONException e3) {
            throw BV4.A0d("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final String toString() {
        return FGI.A0U("AuthenticationExtensionsClientOutputs{", A00().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A01, 1, i);
        AbstractC4100CmU.A09(parcel, this.A02, 2, i);
        AbstractC4100CmU.A09(parcel, this.A00, 3, i);
        AbstractC4100CmU.A09(parcel, this.A03, 4, i);
        AbstractC4100CmU.A0A(parcel, this.A04, 5);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
