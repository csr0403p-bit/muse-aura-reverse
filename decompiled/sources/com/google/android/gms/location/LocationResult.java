package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.AbstractC4204Cpq;
import X.AbstractC4390Cur;
import X.AbstractC4470Cwm;
import X.AnonymousClass001;
import X.BV4;
import X.BV6;
import X.C3cH;
import X.C4158CoD;
import X.C60O;
import X.C8j3;
import X.CS7;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = C4158CoD.A03(95);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            int i = Build.VERSION.SDK_INT;
            List<Location> list = this.A00;
            if (i >= 31) {
                return list.equals(locationResult.A00);
            }
            int size = list.size();
            List list2 = locationResult.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location location : list) {
                    Location location2 = (Location) it.next();
                    if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !CS7.A01(location.getProvider(), location2.getProvider())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sbA0x = C60O.A0x("LocationResult");
        StringBuilder sb = AbstractC4470Cwm.A02;
        List<Location> list = this.A00;
        sbA0x.ensureCapacity(list.size() * 100);
        sbA0x.append("[");
        boolean z = false;
        for (Location location : list) {
            sbA0x.ensureCapacity(100);
            if (location == null) {
                sbA0x.append((String) null);
            } else {
                sbA0x.append("{");
                sbA0x.append(location.getProvider());
                C8j3.A1K(sbA0x);
                if (Build.VERSION.SDK_INT >= 31 ? AbstractC4390Cur.A00(location) : location.isFromMockProvider()) {
                    sbA0x.append("mock, ");
                }
                DecimalFormat decimalFormat = AbstractC4470Cwm.A00;
                BV6.A1O(sbA0x, decimalFormat, location.getLatitude());
                sbA0x.append(",");
                BV6.A1O(sbA0x, decimalFormat, location.getLongitude());
                if (location.hasAccuracy()) {
                    sbA0x.append("\u00b1");
                    BV6.A1O(sbA0x, AbstractC4470Cwm.A01, location.getAccuracy());
                    sbA0x.append("m");
                }
                if (location.hasAltitude()) {
                    sbA0x.append(", alt=");
                    DecimalFormat decimalFormat2 = AbstractC4470Cwm.A01;
                    BV6.A1O(sbA0x, decimalFormat2, location.getAltitude());
                    if (location.hasVerticalAccuracy()) {
                        sbA0x.append("\u00b1");
                        BV6.A1O(sbA0x, decimalFormat2, location.getVerticalAccuracyMeters());
                    }
                    sbA0x.append("m");
                }
                if (location.hasSpeed()) {
                    sbA0x.append(", spd=");
                    DecimalFormat decimalFormat3 = AbstractC4470Cwm.A01;
                    BV6.A1O(sbA0x, decimalFormat3, location.getSpeed());
                    if (location.hasSpeedAccuracy()) {
                        sbA0x.append("\u00b1");
                        BV6.A1O(sbA0x, decimalFormat3, location.getSpeedAccuracyMetersPerSecond());
                    }
                    sbA0x.append("m/s");
                }
                if (location.hasBearing()) {
                    sbA0x.append(", brg=");
                    DecimalFormat decimalFormat4 = AbstractC4470Cwm.A01;
                    BV6.A1O(sbA0x, decimalFormat4, location.getBearing());
                    if (location.hasBearingAccuracy()) {
                        sbA0x.append("\u00b1");
                        BV6.A1O(sbA0x, decimalFormat4, location.getBearingAccuracyDegrees());
                    }
                    sbA0x.append("\u00b0");
                }
                Bundle extras = location.getExtras();
                if (extras != null && (string2 = extras.getString("floorLabel")) != null) {
                    sbA0x.append(", fl=");
                    sbA0x.append(string2);
                }
                Bundle extras2 = location.getExtras();
                if (extras2 != null && (string = extras2.getString("levelId")) != null) {
                    sbA0x.append(", lv=");
                    sbA0x.append(string);
                }
                long jA04 = C3cH.A04(System.currentTimeMillis());
                sbA0x.append(", ert=");
                long jA05 = BV4.A05(location.getElapsedRealtimeNanos()) + jA04;
                sbA0x.append(jA05 >= 0 ? AbstractC4204Cpq.A01.format(new Date(jA05)) : Long.toString(jA05));
                sbA0x.append('}');
            }
            C8j3.A1K(sbA0x);
            z = true;
        }
        if (z) {
            sbA0x.setLength(sbA0x.length() - 2);
        }
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0C(parcel, this.A00, 1);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
