package com.google.android.gms.common.moduleinstall.internal;

import X.AbstractC4100CmU;
import X.BV6;
import X.C3986Cir;
import X.C4158CoD;
import X.CRy;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ApiFeatureRequest extends AbstractSafeParcelable {
    public final List A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = C4158CoD.A03(33);
    public static final Comparator A04 = C3986Cir.A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.A03 == apiFeatureRequest.A03 && CS7.A01(this.A00, apiFeatureRequest.A00) && CS7.A01(this.A01, apiFeatureRequest.A01)) {
            return CS7.A00(this.A02, apiFeatureRequest.A02);
        }
        return false;
    }

    public final int hashCode() {
        return BV6.A0A(Boolean.valueOf(this.A03), this.A00, this.A01, this.A02);
    }

    public ApiFeatureRequest(List list, String str, String str2, boolean z) {
        CRy.A03(list);
        this.A00 = list;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0C(parcel, this.A00, 1);
        AbstractC4100CmU.A08(parcel, 2, this.A03);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A0A(parcel, this.A02, 4);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
