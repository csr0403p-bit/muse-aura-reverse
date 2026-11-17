package com.google.android.gms.wearable;

import X.AbstractC4100CmU;
import X.BV8;
import X.C4157CoC;
import X.C60O;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = C4157CoC.A00(59);
    public final int A00;
    public final int A01;
    public final int A02;
    public final zzf A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public volatile String A0E;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (CS7.A01(this.A04, connectionConfiguration.A04) && CS7.A01(this.A05, connectionConfiguration.A05) && CS7.A01(Integer.valueOf(this.A00), Integer.valueOf(connectionConfiguration.A00)) && CS7.A01(Integer.valueOf(this.A01), Integer.valueOf(connectionConfiguration.A01)) && CS7.A01(Boolean.valueOf(this.A09), Boolean.valueOf(connectionConfiguration.A09)) && CS7.A01(Boolean.valueOf(this.A0B), Boolean.valueOf(connectionConfiguration.A0B)) && CS7.A01(Boolean.valueOf(this.A0C), Boolean.valueOf(connectionConfiguration.A0C))) {
            return CS7.A00(Boolean.valueOf(this.A0D), Boolean.valueOf(connectionConfiguration.A0D));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D)});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ConnectionConfiguration[ Name=");
        sbA0x.append(this.A04);
        sbA0x.append(", Address=");
        sbA0x.append(this.A05);
        sbA0x.append(", Type=");
        sbA0x.append(this.A00);
        sbA0x.append(", Role=");
        sbA0x.append(this.A01);
        sbA0x.append(", Enabled=");
        sbA0x.append(this.A09);
        sbA0x.append(", IsConnected=");
        sbA0x.append(this.A0A);
        sbA0x.append(", PeerNodeId=");
        sbA0x.append(this.A0E);
        sbA0x.append(", BtlePriority=");
        sbA0x.append(this.A0B);
        sbA0x.append(", NodeId=");
        sbA0x.append(this.A06);
        sbA0x.append(", PackageName=");
        sbA0x.append(this.A07);
        sbA0x.append(", ConnectionRetryStrategy=");
        sbA0x.append(this.A02);
        sbA0x.append(", allowedConfigPackages=");
        sbA0x.append(this.A08);
        sbA0x.append(", Migrating=");
        sbA0x.append(this.A0C);
        sbA0x.append(", DataItemSyncEnabled=");
        sbA0x.append(this.A0D);
        sbA0x.append(", ConnectionRestrictions=");
        return BV8.A0u(this.A03, sbA0x);
    }

    public ConnectionConfiguration(zzf zzfVar, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = z;
        this.A0A = z2;
        this.A0E = str3;
        this.A0B = z3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = i3;
        this.A08 = list;
        this.A0C = z4;
        this.A0D = z5;
        this.A03 = zzfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A04, 2);
        AbstractC4100CmU.A0A(parcel, this.A05, 3);
        AbstractC4100CmU.A06(parcel, 4, this.A00);
        AbstractC4100CmU.A06(parcel, 5, this.A01);
        AbstractC4100CmU.A08(parcel, 6, this.A09);
        AbstractC4100CmU.A08(parcel, 7, this.A0A);
        AbstractC4100CmU.A0A(parcel, this.A0E, 8);
        AbstractC4100CmU.A08(parcel, 9, this.A0B);
        AbstractC4100CmU.A0A(parcel, this.A06, 10);
        AbstractC4100CmU.A0A(parcel, this.A07, 11);
        AbstractC4100CmU.A06(parcel, 12, this.A02);
        AbstractC4100CmU.A0B(parcel, this.A08, 13);
        AbstractC4100CmU.A08(parcel, 14, this.A0C);
        AbstractC4100CmU.A08(parcel, 15, this.A0D);
        AbstractC4100CmU.A09(parcel, this.A03, 16, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
