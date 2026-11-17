package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.AbstractC4110Cmr;
import X.AbstractC4197CpZ;
import X.AbstractC4204Cpq;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C4158CoD;
import X.C60O;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zze;

/* loaded from: classes5.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = C4158CoD.A03(97);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final WorkSource A05;
    public final boolean A06;
    public final zze A07;

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.A03 == currentLocationRequest.A03 && this.A00 == currentLocationRequest.A00 && this.A01 == currentLocationRequest.A01 && this.A04 == currentLocationRequest.A04 && this.A06 == currentLocationRequest.A06 && this.A02 == currentLocationRequest.A02 && CS7.A01(this.A05, currentLocationRequest.A05)) {
            return CS7.A00(this.A07, currentLocationRequest.A07);
        }
        return false;
    }

    public final int hashCode() {
        return BV6.A0A(Long.valueOf(this.A03), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A04));
    }

    public CurrentLocationRequest(WorkSource workSource, zze zzeVar, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A03 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = j2;
        this.A06 = z;
        this.A02 = i3;
        this.A05 = workSource;
        this.A07 = zzeVar;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("CurrentLocationRequest[");
        sbA0w.append(AbstractC4110Cmr.A00(this.A01));
        long j = this.A03;
        if (j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            sbA0w.append(", maxAge=");
            AbstractC4204Cpq.A00(j, sbA0w);
        }
        long j2 = this.A04;
        if (j2 != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            sbA0w.append(", duration=");
            sbA0w.append(j2);
            sbA0w.append("ms");
        }
        int i = this.A00;
        if (i != 0) {
            sbA0w.append(", ");
            if (i == 1) {
                str2 = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    throw BV4.A0P();
                }
                str2 = "GRANULARITY_FINE";
            }
            sbA0w.append(str2);
        }
        if (this.A06) {
            sbA0w.append(", bypass");
        }
        int i2 = this.A02;
        if (i2 != 0) {
            sbA0w.append(", ");
            if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    throw BV4.A0P();
                }
                str = "THROTTLE_NEVER";
            }
            sbA0w.append(str);
        }
        WorkSource workSource = this.A05;
        if (!AbstractC4197CpZ.A00(workSource)) {
            sbA0w.append(", workSource=");
            sbA0w.append(workSource);
        }
        zze zzeVar = this.A07;
        if (zzeVar != null) {
            sbA0w.append(", impersonation=");
            sbA0w.append(zzeVar);
        }
        return BV5.A0o(sbA0w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A07(parcel, 1, this.A03);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A06(parcel, 3, this.A01);
        AbstractC4100CmU.A07(parcel, 4, this.A04);
        AbstractC4100CmU.A08(parcel, 5, this.A06);
        AbstractC4100CmU.A09(parcel, this.A05, 6, i);
        AbstractC4100CmU.A06(parcel, 7, this.A02);
        AbstractC4100CmU.A09(parcel, this.A07, 9, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
