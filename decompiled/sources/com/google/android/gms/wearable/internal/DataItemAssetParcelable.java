package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.BV4;
import X.C4157CoC;
import X.C60O;
import X.CRy;
import X.InterfaceC3988Cj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepName
/* loaded from: classes5.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, InterfaceC3988Cj7 {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = C4157CoC.A00(12);
    public final String A00;
    public final String A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DataItemAssetParcelable[@");
        BV4.A1N(sbA0x, hashCode());
        String str = this.A00;
        if (str == null) {
            sbA0x.append(",noid");
        } else {
            sbA0x.append(",");
            sbA0x.append(str);
        }
        sbA0x.append(", key=");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public DataItemAssetParcelable(InterfaceC3988Cj7 interfaceC3988Cj7) {
        DataItemAssetParcelable dataItemAssetParcelable = (DataItemAssetParcelable) interfaceC3988Cj7;
        String str = dataItemAssetParcelable.A00;
        CRy.A03(str);
        this.A00 = str;
        String str2 = dataItemAssetParcelable.A01;
        CRy.A03(str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 2);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
