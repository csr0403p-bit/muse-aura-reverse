package com.google.android.gms.auth.api.signin;

import X.AbstractC4100CmU;
import X.BV4;
import X.C4158CoD;
import X.C4400CvD;
import X.C60O;
import X.InterfaceC4461Cwd;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public String A00;
    public final int A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final Set A0A = C60O.A13();
    public final long A0B;
    public final String A0C;
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = C4158CoD.A03(15);
    public static final InterfaceC4461Cwd A0D = C4400CvD.A00;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A0C.equals(this.A0C)) {
                        HashSet hashSetA0x = BV4.A0x(googleSignInAccount.A09);
                        hashSetA0x.addAll(googleSignInAccount.A0A);
                        HashSet hashSetA0x2 = BV4.A0x(this.A09);
                        hashSetA0x2.addAll(this.A0A);
                        if (hashSetA0x.equals(hashSetA0x2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.A0C.hashCode() + 527;
        HashSet hashSetA0x = BV4.A0x(this.A09);
        hashSetA0x.addAll(this.A0A);
        return (iHashCode * 31) + hashSetA0x.hashCode();
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A01 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = uri;
        this.A00 = str5;
        this.A0B = j;
        this.A0C = str6;
        this.A09 = list;
        this.A07 = str7;
        this.A08 = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A01);
        AbstractC4100CmU.A0A(parcel, this.A03, 2);
        AbstractC4100CmU.A0A(parcel, this.A04, 3);
        AbstractC4100CmU.A0A(parcel, this.A05, 4);
        AbstractC4100CmU.A0A(parcel, this.A06, 5);
        AbstractC4100CmU.A09(parcel, this.A02, 6, i);
        AbstractC4100CmU.A0A(parcel, this.A00, 7);
        AbstractC4100CmU.A07(parcel, 8, this.A0B);
        AbstractC4100CmU.A0A(parcel, this.A0C, 9);
        AbstractC4100CmU.A0C(parcel, this.A09, 10);
        AbstractC4100CmU.A0A(parcel, this.A07, 11);
        AbstractC4100CmU.A0A(parcel, this.A08, 12);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
