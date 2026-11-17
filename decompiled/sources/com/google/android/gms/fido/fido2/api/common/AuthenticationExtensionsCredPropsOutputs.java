package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV4;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = C4158CoD.A03(44);
    public final boolean A00;

    public final boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.A00 == ((AuthenticationExtensionsCredPropsOutputs) obj).A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(BV4.A1Z(this.A00));
    }

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A08(parcel, 1, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
