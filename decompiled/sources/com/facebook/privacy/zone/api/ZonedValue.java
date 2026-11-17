package com.facebook.privacy.zone.api;

import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* loaded from: classes5.dex */
public final class ZonedValue implements Parcelable {
    public static final Parcelable.Creator<ZonedValue<?>> CREATOR = new C7580F4t(19);
    public final ZonePolicy A00;
    public final T A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        Object obj = this.A01;
        parcel.writeString(obj == null ? "NULL" : C60Q.A0e(obj));
        parcel.writeValue(obj);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public ZonedValue(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        ?? value = parcel.readValue(!string.equals("NULL") ? Class.forName(string).getClassLoader() : null);
        Parcelable parcelable = parcel.readParcelable(ZonePolicy.class.getClassLoader());
        if (parcelable == null) {
            throw C60O.A0i("Required value was null.");
        }
        ZonePolicy zonePolicy = (ZonePolicy) parcelable;
        String string2 = parcel.readString();
        if (string2 == null) {
            throw C60O.A0i("Required value was null.");
        }
        C7384Etj.A0Y(zonePolicy, 1);
        this.A01 = value;
        this.A00 = zonePolicy;
        this.A02 = string2;
    }
}
