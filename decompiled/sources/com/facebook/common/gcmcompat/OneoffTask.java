package com.facebook.common.gcmcompat;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV5;
import X.C60O;
import X.C60Q;
import X.C7580F4t;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class OneoffTask implements Parcelable {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new C7580F4t(16);
    public long A00;
    public long A01;
    public final int A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public OneoffTask(Bundle bundle, String str, String str2, long j, long j2, boolean z) {
        this.A03 = bundle;
        this.A02 = 0;
        this.A07 = false;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = true;
        this.A08 = z;
        this.A01 = j2;
        this.A00 = j;
    }

    public static void A00(Bundle bundle) {
        if (bundle != null) {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            if (parcelObtain.dataSize() > 10240) {
                parcelObtain.recycle();
                throw C60Q.A0U("Extras exceeding maximum size(10240 bytes): ", Integer.toString(parcelObtain.dataSize()));
            }
            parcelObtain.recycle();
            Iterator itA0w = BV5.A0w(bundle);
            while (itA0w.hasNext()) {
                Object obj = bundle.get(AnonymousClass005.A0j(itA0w));
                if (obj instanceof Bundle) {
                    A00((Bundle) obj);
                } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    throw C60O.A0i("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeBundle(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public OneoffTask(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A06 = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A02 = parcel.readInt();
        this.A07 = parcel.readInt() == 1;
        this.A03 = parcel.readBundle(getClass().getClassLoader());
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
    }

    public static void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            throw C60O.A0i("Must provide a valid tag.");
        }
        if (str.length() > 100) {
            throw C60O.A0i("Tag is larger than max permissible tag length (100)");
        }
    }
}
