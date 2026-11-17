package com.google.android.gms.common.api;

import X.AbstractC4100CmU;
import X.AnonymousClass006;
import X.C4233Cqh;
import X.C60O;
import X.C6xC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public final ComplianceOptions A00;
    public static final Parcelable.Creator<ApiMetadata> CREATOR = C4233Cqh.A01;
    public static final ApiMetadata A01 = new ApiMetadata(null);

    public final boolean equals(Object obj) {
        if (obj instanceof ApiMetadata) {
            return C6xC.A00(this.A00, ((ApiMetadata) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C60O.A0r("ApiMetadata(complianceOptions=", String.valueOf(this.A00));
    }

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.A00 = complianceOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractC4100CmU.A00(parcel));
    }
}
