package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.AbstractC4204Cpq;
import X.BV6;
import X.C3cH;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zze;

/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = C4158CoD.A03(94);
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final WorkSource A0B;
    public final zze A0C;
    public final boolean A0D;

    @Deprecated
    public LocationRequest() {
        this(new WorkSource(), null, 0.0f, 102, Integer.MAX_VALUE, 0, 0, 3600000L, 600000L, 0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, LinkEncryptedPairingKt.LINK_COUNTER_MAX, 3600000L, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.gms.location.LocationRequest
            r11 = 0
            if (r0 == 0) goto L8b
            com.google.android.gms.location.LocationRequest r13 = (com.google.android.gms.location.LocationRequest) r13
            int r1 = r12.A01
            int r0 = r13.A01
            if (r1 != r0) goto L8b
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L19
            long r3 = r12.A03
            long r1 = r13.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
        L19:
            long r3 = r12.A04
            long r1 = r13.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            long r3 = r12.A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8e
            r10 = 1
            long r5 = r3 >> r10
            long r1 = r12.A03
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L8e
        L32:
            long r1 = r13.A05
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8c
            r9 = 1
            long r7 = r1 >> r9
            long r5 = r13.A03
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L8c
        L43:
            if (r10 != r9) goto L8b
            if (r10 == 0) goto L4b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
        L4b:
            long r3 = r12.A06
            long r1 = r13.A06
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            int r1 = r12.A02
            int r0 = r13.A02
            if (r1 != r0) goto L8b
            float r1 = r12.A00
            float r0 = r13.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L8b
            boolean r1 = r12.A08
            boolean r0 = r13.A08
            if (r1 != r0) goto L8b
            int r1 = r12.A09
            int r0 = r13.A09
            if (r1 != r0) goto L8b
            int r1 = r12.A0A
            int r0 = r13.A0A
            if (r1 != r0) goto L8b
            boolean r1 = r12.A0D
            boolean r0 = r13.A0D
            if (r1 != r0) goto L8b
            android.os.WorkSource r1 = r12.A0B
            android.os.WorkSource r0 = r13.A0B
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8b
            com.google.android.gms.internal.location.zze r1 = r12.A0C
            com.google.android.gms.internal.location.zze r0 = r13.A0C
            boolean r11 = X.CS7.A00(r1, r0)
        L8b:
            return r11
        L8c:
            r9 = 0
            goto L43
        L8e:
            r10 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A01), Long.valueOf(this.A03), Long.valueOf(this.A04), this.A0B);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A01);
        AbstractC4100CmU.A07(parcel, 2, this.A03);
        AbstractC4100CmU.A07(parcel, 3, this.A04);
        AbstractC4100CmU.A06(parcel, 6, this.A02);
        AbstractC4100CmU.A04(parcel, this.A00, 7);
        AbstractC4100CmU.A07(parcel, 8, this.A05);
        AbstractC4100CmU.A08(parcel, 9, this.A08);
        AbstractC4100CmU.A07(parcel, 10, this.A06);
        AbstractC4100CmU.A07(parcel, 11, this.A07);
        AbstractC4100CmU.A06(parcel, 12, this.A09);
        AbstractC4100CmU.A06(parcel, 13, this.A0A);
        AbstractC4100CmU.A08(parcel, 15, this.A0D);
        AbstractC4100CmU.A09(parcel, this.A0B, 16, i);
        AbstractC4100CmU.A09(parcel, this.A0C, 17, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public static String A00(long j) {
        String string;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return "\u221e";
        }
        StringBuilder sb = AbstractC4204Cpq.A00;
        synchronized (sb) {
            sb.setLength(0);
            AbstractC4204Cpq.A00(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public LocationRequest(WorkSource workSource, zze zzeVar, float f, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        long j7 = j5;
        this.A01 = i;
        if (i == 105) {
            this.A03 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        } else {
            this.A03 = j;
        }
        this.A04 = j2;
        this.A05 = j3;
        this.A06 = j4 != LinkEncryptedPairingKt.LINK_COUNTER_MAX ? Math.min(Math.max(1L, C3cH.A04(j4)), j7) : j7;
        this.A02 = i2;
        this.A00 = f;
        this.A08 = z;
        this.A07 = j6 != -1 ? j6 : j;
        this.A09 = i3;
        this.A0A = i4;
        this.A0D = z2;
        this.A0B = workSource;
        this.A0C = zzeVar;
    }
}
