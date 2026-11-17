package com.google.android.gms.internal.location;

import X.AbstractC3798Ceh;
import X.AbstractC4100CmU;
import X.BV4;
import X.BV7;
import X.C3800Cej;
import X.C4158CoD;
import X.C7384Etj;
import X.C8j3;
import X.F0W;
import X.Hs1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = C4158CoD.A03(75);
    public final zze A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Deprecated(level = Hs1.A02, message = "only for Parcelable.Creator")
    public zze(zze zzeVar, String str, String str2, String str3, List list, int i) {
        C7384Etj.A0Y(str, 1);
        if (zzeVar != null && zzeVar.A00 != null) {
            throw BV4.A0O();
        }
        this.A01 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3 == null ? zzeVar != null ? zzeVar.A04 : null : str3;
        if (list == null && (zzeVar == null || (list = zzeVar.A05) == null)) {
            F0W f0w = AbstractC3798Ceh.A00;
            list = C3800Cej.A02;
        }
        this.A05 = AbstractC3798Ceh.A00(list);
        this.A00 = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A01);
        AbstractC4100CmU.A0A(parcel, this.A02, 3);
        AbstractC4100CmU.A0A(parcel, this.A03, 4);
        AbstractC4100CmU.A0A(parcel, this.A04, 6);
        AbstractC4100CmU.A09(parcel, this.A00, 7, i);
        AbstractC4100CmU.A0C(parcel, this.A05, 8);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    static {
        Process.myUid();
        Process.myPid();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (this.A01 == zzeVar.A01 && C7384Etj.areEqual(this.A02, zzeVar.A02) && C7384Etj.areEqual(this.A03, zzeVar.A03) && C7384Etj.areEqual(this.A04, zzeVar.A04) && C7384Etj.areEqual(this.A00, zzeVar.A00)) {
            return C8j3.A1W(this.A05, zzeVar.A05, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0F(Integer.valueOf(this.A01), this.A02, this.A03, this.A04, this.A00);
    }

    public final String toString() {
        String str = this.A02;
        int length = str.length();
        int i = length + 18;
        String str2 = this.A03;
        StringBuilder sbA0p = BV4.A0p(i + (str2 != null ? str2.length() : 0));
        sbA0p.append(this.A01);
        sbA0p.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sbA0p.append(str);
        if (str2 != null) {
            sbA0p.append("[");
            if (str2.startsWith(str)) {
                sbA0p.append((CharSequence) str2, length, str2.length());
            } else {
                sbA0p.append(str2);
            }
            sbA0p.append("]");
        }
        String str3 = this.A04;
        if (str3 != null) {
            sbA0p.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            BV4.A1N(sbA0p, str3.hashCode());
        }
        return sbA0p.toString();
    }
}
