package com.meta.foa.cds;

import X.C10638I0i;
import X.C7384Etj;
import X.Hi4;
import X.InterfaceC8011FPi;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class CdsOpenScreenCallerDismissCallback implements Parcelable {
    public static final Parcelable.Creator<CdsOpenScreenCallerDismissCallback> CREATOR = new C10638I0i(28);
    public final InterfaceC8011FPi A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeInt(Hi4.A00(this.A00));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CdsOpenScreenCallerDismissCallback(InterfaceC8011FPi interfaceC8011FPi) {
        this.A00 = interfaceC8011FPi;
    }
}
