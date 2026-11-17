package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.AbstractC4295Csi;
import X.AbstractC4467Cwj;
import X.BV7;
import X.C3cI;
import X.C4158CoD;
import X.C4387Cun;
import X.CRy;
import X.CS7;
import X.DA8;
import X.DA9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = C4158CoD.A03(48);
    public final DA8 A00;
    public final DA8 A01;
    public final DA8 A02;
    public final String[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (CS7.A01(this.A00, authenticatorAttestationResponse.A00) && CS7.A01(this.A01, authenticatorAttestationResponse.A01)) {
            return CS7.A00(this.A02, authenticatorAttestationResponse.A02);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0E(AbstractSafeParcelable.A05(this.A00), AbstractSafeParcelable.A05(this.A01), AbstractSafeParcelable.A05(this.A02));
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        CRy.A03(bArr);
        DA9 da9A01 = DA8.A01(bArr, bArr.length);
        CRy.A03(bArr2);
        DA9 da9A012 = DA8.A01(bArr2, bArr2.length);
        CRy.A03(bArr3);
        DA9 da9A013 = DA8.A01(bArr3, bArr3.length);
        CRy.A03(da9A01);
        this.A00 = da9A01;
        CRy.A03(da9A012);
        this.A01 = da9A012;
        CRy.A03(da9A013);
        this.A02 = da9A013;
        CRy.A03(strArr);
        this.A03 = strArr;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        C4387Cun c4387Cun = new C4387Cun();
        AbstractC4467Cwj abstractC4467Cwj = AbstractC4467Cwj.A00;
        C4387Cun c4387CunA04 = AbstractSafeParcelable.A04(AbstractSafeParcelable.A04(AbstractSafeParcelable.A04(c4387Cun, BV7.A0v(abstractC4467Cwj, this.A00), "keyHandle"), BV7.A0v(abstractC4467Cwj, this.A01), "clientDataJSON"), BV7.A0v(abstractC4467Cwj, this.A02), "attestationObject");
        String string = Arrays.toString(this.A03);
        C4387Cun c4387Cun2 = new C4387Cun();
        c4387CunA04.A00 = c4387Cun2;
        c4387Cun2.A01 = string;
        c4387Cun2.A02 = "transports";
        return AbstractC4295Csi.A00(c4387Cun, strA0Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0D(parcel, this.A00.A04(), 2);
        AbstractC4100CmU.A0D(parcel, this.A01.A04(), 3);
        AbstractC4100CmU.A0D(parcel, this.A02.A04(), 4);
        String[] strArr = this.A03;
        if (strArr != null) {
            int iA01 = AbstractC4100CmU.A01(parcel, 5);
            parcel.writeStringArray(strArr);
            AbstractC4100CmU.A05(parcel, iA01);
        }
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
