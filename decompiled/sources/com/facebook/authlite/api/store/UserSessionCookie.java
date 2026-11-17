package com.facebook.authlite.api.store;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C4158CoD;
import X.C7384Etj;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class UserSessionCookie extends C06G implements Parcelable {
    public static final Parcelable.Creator<UserSessionCookie> CREATOR = C4158CoD.A03(1);
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserSessionCookie) {
                UserSessionCookie userSessionCookie = (UserSessionCookie) obj;
                if (!C7384Etj.areEqual(this.A04, userSessionCookie.A04) || !C7384Etj.areEqual(this.A06, userSessionCookie.A06) || !C7384Etj.areEqual(this.A03, userSessionCookie.A03) || !C7384Etj.areEqual(this.A01, userSessionCookie.A01) || !C7384Etj.areEqual(this.A02, userSessionCookie.A02) || !C7384Etj.areEqual(this.A00, userSessionCookie.A00) || !C7384Etj.areEqual(this.A05, userSessionCookie.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        Long l = this.A01;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A02);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A05);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A05, (AnonymousClass005.A0I(this.A02, (AnonymousClass005.A0I(this.A03, AnonymousClass005.A0I(this.A06, AnonymousClass001.A0G(this.A04))) + AnonymousClass006.A0D(this.A01)) * 31) + C3cH.A02(this.A00)) * 31);
    }

    public final String toString() {
        String str = this.A04;
        String str2 = this.A06;
        String str3 = this.A03;
        Long l = this.A01;
        String str4 = this.A02;
        Boolean bool = this.A00;
        String str5 = this.A05;
        StringBuilder sbA0x = C3cI.A0x("UserSessionCookie(name=", str);
        sbA0x.append(", value=");
        sbA0x.append(str2);
        sbA0x.append(", expires=");
        sbA0x.append(str3);
        sbA0x.append(", expiresTimestamp=");
        sbA0x.append(l);
        sbA0x.append(", domain=");
        sbA0x.append(str4);
        sbA0x.append(", secure=");
        sbA0x.append(bool);
        return C3cJ.A0N(", path=", str5, sbA0x);
    }

    public UserSessionCookie(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        C7384Etj.A0Y(str5, 6);
        this.A04 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A01 = l;
        this.A02 = str4;
        this.A00 = bool;
        this.A05 = str5;
    }
}
