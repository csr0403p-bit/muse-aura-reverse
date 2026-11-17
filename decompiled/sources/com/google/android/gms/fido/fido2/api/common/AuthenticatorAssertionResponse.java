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
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = C4158CoD.A03(47);
    public final DA8 A00;
    public final DA8 A01;
    public final DA8 A02;
    public final DA8 A03;
    public final DA8 A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (CS7.A01(this.A00, authenticatorAssertionResponse.A00) && CS7.A01(this.A01, authenticatorAssertionResponse.A01) && CS7.A01(this.A02, authenticatorAssertionResponse.A02) && CS7.A01(this.A03, authenticatorAssertionResponse.A03)) {
            return CS7.A00(this.A04, authenticatorAssertionResponse.A04);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0F(AbstractSafeParcelable.A05(this.A00), AbstractSafeParcelable.A05(this.A01), AbstractSafeParcelable.A05(this.A02), AbstractSafeParcelable.A05(this.A03), AbstractSafeParcelable.A05(this.A04));
    }

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        CRy.A03(bArr);
        DA9 da9A01 = DA8.A01(bArr, bArr.length);
        CRy.A03(bArr2);
        DA9 da9A012 = DA8.A01(bArr2, bArr2.length);
        CRy.A03(bArr3);
        DA9 da9A013 = DA8.A01(bArr3, bArr3.length);
        CRy.A03(bArr4);
        DA9 da9A014 = DA8.A01(bArr4, bArr4.length);
        DA9 da9A015 = bArr5 == null ? null : DA8.A01(bArr5, bArr5.length);
        CRy.A03(da9A01);
        this.A00 = da9A01;
        CRy.A03(da9A012);
        this.A01 = da9A012;
        CRy.A03(da9A013);
        this.A02 = da9A013;
        CRy.A03(da9A014);
        this.A03 = da9A014;
        this.A04 = da9A015;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        C4387Cun c4387Cun = new C4387Cun();
        AbstractC4467Cwj abstractC4467Cwj = AbstractC4467Cwj.A00;
        C4387Cun c4387CunA04 = AbstractSafeParcelable.A04(AbstractSafeParcelable.A04(AbstractSafeParcelable.A04(AbstractSafeParcelable.A04(c4387Cun, BV7.A0v(abstractC4467Cwj, this.A00), "keyHandle"), BV7.A0v(abstractC4467Cwj, this.A01), "clientDataJSON"), BV7.A0v(abstractC4467Cwj, this.A02), "authenticatorData"), BV7.A0v(abstractC4467Cwj, this.A03), "signature");
        DA8 da8 = this.A04;
        if (da8 != null) {
            String strA0v = BV7.A0v(abstractC4467Cwj, da8);
            C4387Cun c4387Cun2 = new C4387Cun();
            c4387CunA04.A00 = c4387Cun2;
            c4387Cun2.A01 = strA0v;
            c4387Cun2.A02 = HatchPasskeyW3cKt.USER_HANDLE_KEY;
        }
        return AbstractC4295Csi.A00(c4387Cun, strA0Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0D(parcel, this.A00.A04(), 2);
        AbstractC4100CmU.A0D(parcel, this.A01.A04(), 3);
        AbstractC4100CmU.A0D(parcel, this.A02.A04(), 4);
        AbstractC4100CmU.A0D(parcel, this.A03.A04(), 5);
        DA8 da8 = this.A04;
        AbstractC4100CmU.A0D(parcel, da8 == null ? null : da8.A04(), 6);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
