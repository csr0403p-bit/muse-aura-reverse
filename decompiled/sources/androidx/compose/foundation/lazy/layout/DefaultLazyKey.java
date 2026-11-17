package androidx.compose.foundation.lazy.layout;

import X.BSH;
import X.C8j4;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new BSH(0);
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DefaultLazyKey) && this.A00 == ((DefaultLazyKey) obj).A00);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C8j4.A0w("DefaultLazyKey(index=", this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public DefaultLazyKey(int i) {
        this.A00 = i;
    }
}
