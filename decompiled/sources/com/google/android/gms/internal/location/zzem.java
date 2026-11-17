package com.google.android.gms.internal.location;

import X.AbstractC3798Ceh;
import X.AbstractC4100CmU;
import X.C3800Cej;
import X.C4158CoD;
import X.F0W;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = C4158CoD.A03(74);
    public final PendingIntent A00;
    public final String A01;
    public final List A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A02;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0B(parcel, list, 1);
        AbstractC4100CmU.A09(parcel, this.A00, 2, i);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zzem(PendingIntent pendingIntent, String str, List list) {
        AbstractC3798Ceh abstractC3798CehA00;
        if (list == null) {
            F0W f0w = AbstractC3798Ceh.A00;
            abstractC3798CehA00 = C3800Cej.A02;
        } else {
            abstractC3798CehA00 = AbstractC3798Ceh.A00(list);
        }
        this.A02 = abstractC3798CehA00;
        this.A00 = pendingIntent;
        this.A01 = str;
    }
}
