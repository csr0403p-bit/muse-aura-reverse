package androidx.media3.common;

import X.BV4;
import X.C60O;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C7580F4t(12);
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                StreamKey streamKey = (StreamKey) obj;
                if (this.A01 != streamKey.A01 || this.A00 != streamKey.A00 || this.A02 != streamKey.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.A01 - streamKey2.A01;
        if (i != 0) {
            return i;
        }
        int i2 = this.A00 - streamKey2.A00;
        return i2 == 0 ? this.A02 - streamKey2.A02 : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }

    public StreamKey(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append(".");
        sbA0w.append(this.A00);
        sbA0w.append(".");
        return BV4.A0l(sbA0w, this.A02);
    }

    public StreamKey() {
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = -1;
    }
}
