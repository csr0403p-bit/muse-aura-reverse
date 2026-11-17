package com.google.android.gms.auth.api.identity;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.CRy;
import X.CS7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

@Deprecated
/* loaded from: classes5.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = C4158CoD.A03(13);
    public final Uri A00;
    public final PublicKeyCredential A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (CS7.A01(this.A02, signInCredential.A02) && CS7.A01(this.A03, signInCredential.A03) && CS7.A01(this.A04, signInCredential.A04) && CS7.A01(this.A05, signInCredential.A05) && CS7.A01(this.A00, signInCredential.A00) && CS7.A01(this.A06, signInCredential.A06) && CS7.A01(this.A07, signInCredential.A07) && CS7.A01(this.A08, signInCredential.A08)) {
            return CS7.A00(this.A01, signInCredential.A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04, this.A05, this.A00, this.A06, this.A07, this.A08, this.A01});
    }

    public SignInCredential(Uri uri, PublicKeyCredential publicKeyCredential, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        CRy.A03(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = publicKeyCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A02, 1);
        AbstractC4100CmU.A0A(parcel, this.A03, 2);
        AbstractC4100CmU.A0A(parcel, this.A04, 3);
        AbstractC4100CmU.A0A(parcel, this.A05, 4);
        AbstractC4100CmU.A09(parcel, this.A00, 5, i);
        AbstractC4100CmU.A0A(parcel, this.A06, 6);
        AbstractC4100CmU.A0A(parcel, this.A07, 7);
        AbstractC4100CmU.A0A(parcel, this.A08, 8);
        AbstractC4100CmU.A09(parcel, this.A01, 9, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
