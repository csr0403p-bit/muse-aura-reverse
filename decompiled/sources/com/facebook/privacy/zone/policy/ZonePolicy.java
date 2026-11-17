package com.facebook.privacy.zone.policy;

import X.BWR;
import X.C3cG;
import X.C4158CoD;
import X.C7384Etj;
import X.Cx5;
import X.Ey9;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ZonePolicy implements Parcelable {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ZonePolicy[] A01;
    public static final Parcelable.Creator<ZonePolicy> CREATOR;
    public final BWR enforcementMode;
    public final Cx5 purposePolicy;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeString(name());
    }

    static {
        Cx5 cx5 = Cx5.A02;
        BWR bwr = BWR.A03;
        ZonePolicy zonePolicy = new ZonePolicy(bwr, cx5, "ALLOW_ALL_POLICY", 0);
        ZonePolicy zonePolicy2 = new ZonePolicy(bwr, Cx5.A09, "ACCESS_TOKEN_POLICY", 1);
        Cx5 cx52 = Cx5.A03;
        ZonePolicy zonePolicy3 = new ZonePolicy(bwr, cx52, "DEFAULT_PURPOSES_OPERATIONAL_POLICY", 2);
        BWR bwr2 = BWR.A02;
        ZonePolicy zonePolicy4 = new ZonePolicy(bwr2, cx52, "DEFAULT_PURPOSES_OPERATIONAL_STRICT_POLICY", 3);
        ZonePolicy zonePolicy5 = new ZonePolicy(bwr, Cx5.A0A, "FAMILY_DEVICE_ID_POLICY", 4);
        ZonePolicy zonePolicy6 = new ZonePolicy(bwr, Cx5.A04, "INFRASTRUCTURE_ANALYTICS_POLICY", 5);
        ZonePolicy zonePolicy7 = new ZonePolicy(bwr, Cx5.A06, "MESSAGING_ARMADILLO_METADATA", 6);
        Cx5 cx53 = Cx5.A0C;
        ZonePolicy zonePolicy8 = new ZonePolicy(bwr, cx53, "MESSAGING_CONTENT_E2EE_POLICY", 7);
        Cx5 cx54 = Cx5.A0D;
        ZonePolicy[] zonePolicyArr = {zonePolicy, zonePolicy2, zonePolicy3, zonePolicy4, zonePolicy5, zonePolicy6, zonePolicy7, zonePolicy8, new ZonePolicy(bwr, cx54, "MESSAGING_CONTENT_OPEN_POLICY", 8), new ZonePolicy(bwr, Cx5.A0B, "MESSAGING_CONTENT_DEBUGGING_POLICY", 9), new ZonePolicy(bwr, Cx5.A05, "MESSAGE_CONTENT_DATA_TYPE", 10), new ZonePolicy(bwr2, cx53, "MESSAGING_CONTENT_E2EE_STRICT_POLICY", 11), new ZonePolicy(bwr2, cx54, "MESSAGING_CONTENT_OPEN_STRICT_POLICY", 12), new ZonePolicy(bwr, Cx5.A08, "MESSAGING_TRAFFIC_METADATA", 13), new ZonePolicy(bwr, Cx5.A0E, "SENSITIVE_DATA_NO_ADS", 14), new ZonePolicy(bwr, Cx5.A07, "MESSAGING_CONTENT_POLICY", 15)};
        A01 = zonePolicyArr;
        A00 = C3cG.A0w(zonePolicyArr);
        CREATOR = C4158CoD.A03(4);
    }

    public static ZonePolicy valueOf(String str) {
        return (ZonePolicy) Enum.valueOf(ZonePolicy.class, str);
    }

    public static ZonePolicy[] values() {
        return (ZonePolicy[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ZonePolicy(BWR bwr, Cx5 cx5, String str, int i) {
        this.purposePolicy = cx5;
        this.enforcementMode = bwr;
    }
}
