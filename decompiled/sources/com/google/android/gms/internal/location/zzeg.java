package com.google.android.gms.internal.location;

import X.AbstractC4100CmU;
import X.AbstractC4197CpZ;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C4158CoD;
import X.C8j3;
import X.CRy;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.util.Log;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes5.dex */
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = C4158CoD.A03(71);
    public LocationRequest A00;

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return CS7.A01(this.A00, ((zzeg) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public zzeg(LocationRequest locationRequest, List list, long j, boolean z, boolean z2, boolean z3, boolean z4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z5;
        boolean z6;
        boolean z7;
        Object[] objArr;
        int i = locationRequest.A01;
        long j2 = locationRequest.A03;
        CRy.A08(C8j3.A1Q((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))), "intervalMillis must be greater than or equal to 0");
        int i2 = i;
        if (i == 100 || i == 102 || i == 104) {
            z5 = true;
        } else if (i == 105) {
            i2 = 105;
            z5 = true;
        } else {
            z5 = false;
        }
        Object[] objArrA1Y = BV5.A1Y(i2);
        if (!z5) {
            throw BV5.A0T("priority %d must be a Priority.PRIORITY_* constant", objArrA1Y);
        }
        long jMin = locationRequest.A04;
        boolean z8 = true;
        if (jMin != -1 && jMin < 0) {
            z8 = false;
        }
        CRy.A08(z8, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        long j3 = locationRequest.A05;
        CRy.A08(C8j3.A1Q((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1))), "maxUpdateDelayMillis must be greater than or equal to 0");
        long j4 = locationRequest.A06;
        CRy.A08(AnonymousClass002.A1N((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1))), "durationMillis must be greater than 0");
        int i3 = locationRequest.A02;
        CRy.A08(AnonymousClass002.A1N(i3), "maxUpdates must be greater than 0");
        float f = locationRequest.A00;
        CRy.A08(C8j3.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "minUpdateDistanceMeters must be greater than or equal to 0");
        boolean z9 = locationRequest.A08;
        long j5 = locationRequest.A07;
        boolean z10 = true;
        if (j5 != -1 && j5 < 0) {
            z10 = false;
        }
        CRy.A08(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        int i4 = locationRequest.A09;
        int i5 = i4;
        if (i4 == 0 || i4 == 1) {
            z6 = true;
        } else if (i4 == 2) {
            i5 = 2;
            z6 = true;
        } else {
            z6 = false;
        }
        Object[] objArrA1Y2 = BV5.A1Y(i5);
        if (!z6) {
            throw BV5.A0T("granularity %d must be a Granularity.GRANULARITY_* constant", objArrA1Y2);
        }
        int i6 = locationRequest.A0A;
        int i7 = i6;
        if (i6 == 0 || i6 == 1) {
            z7 = true;
        } else if (i6 == 2) {
            i7 = 2;
            z7 = true;
        } else {
            z7 = false;
        }
        Object[] objArrA1Y3 = BV5.A1Y(i7);
        if (!z7) {
            throw BV5.A0T("throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArrA1Y3);
        }
        boolean z11 = locationRequest.A0D;
        WorkSource workSource = locationRequest.A0B;
        zze zzeVar = locationRequest.A0C;
        if (zzeVar != null && zzeVar.A00 != null) {
            throw BV4.A0P();
        }
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    int i8 = clientIdentity.A00;
                    String str = clientIdentity.A01;
                    Method method = AbstractC4197CpZ.A01;
                    if (method != null) {
                        try {
                            objArr = new Object[]{Integer.valueOf(i8), str == null ? "" : str};
                        } catch (Exception e) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    } else {
                        method = AbstractC4197CpZ.A00;
                        if (method != null) {
                            objArr = new Object[]{Integer.valueOf(i8)};
                        }
                    }
                    method.invoke(workSource, objArr);
                }
            }
        }
        if (z) {
            new Object[1][0] = 1;
            i4 = 1;
        }
        if (z2) {
            Object[] objArr2 = {BV4.A0X()};
            i6 = 2;
        }
        z11 = z3 ? true : z11;
        z9 = z4 ? true : z9;
        if (j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            boolean z12 = true;
            if (j != -1 && j < 0) {
                z12 = false;
            }
            CRy.A08(z12, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            j5 = j;
        }
        if (jMin == -1) {
            jMin = j2;
        } else if (i != 105) {
            jMin = Math.min(jMin, j2);
        }
        this.A00 = new LocationRequest(new WorkSource(workSource), zzeVar, f, i, i3, i4, i6, j2, jMin, Math.max(j3, j2), LinkEncryptedPairingKt.LINK_COUNTER_MAX, j4, j5 == -1 ? j2 : j5, z9, z11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractC4100CmU.A00(parcel));
    }
}
