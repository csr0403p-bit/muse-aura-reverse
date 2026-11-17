package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV4;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = C4158CoD.A03(41);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof UvmEntries) {
            List list = this.A00;
            List list2 = ((UvmEntries) obj).A00;
            if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.A00;
        return Arrays.hashCode(new Object[]{list == null ? null : BV4.A0x(list)});
    }

    public UvmEntries(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0C(parcel, this.A00, 1);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
