package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.CmU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4100CmU {
    public static void A0C(Parcel parcel, List list, int i) {
        if (list != null) {
            int iA01 = A01(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int iDataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int iDataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int iDataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(iDataPosition);
                    parcel.writeInt(iDataPosition3 - iDataPosition2);
                    parcel.setDataPosition(iDataPosition3);
                }
            }
            A05(parcel, iA01);
        }
    }

    public static void A0E(Parcel parcel, Parcelable[] parcelableArr, int i, int i2) {
        if (parcelableArr != null) {
            int iA01 = A01(parcel, i);
            parcel.writeInt(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int iDataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int iDataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int iDataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(iDataPosition);
                    parcel.writeInt(iDataPosition3 - iDataPosition2);
                    parcel.setDataPosition(iDataPosition3);
                }
            }
            A05(parcel, iA01);
        }
    }

    public static int A00(Parcel parcel) {
        return A01(parcel, 20293);
    }

    public static int A01(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void A02(Bundle bundle, Parcel parcel, int i) {
        if (bundle != null) {
            int iA01 = A01(parcel, i);
            parcel.writeBundle(bundle);
            A05(parcel, iA01);
        }
    }

    public static void A03(IBinder iBinder, Parcel parcel, int i) {
        if (iBinder != null) {
            int iA01 = A01(parcel, i);
            parcel.writeStrongBinder(iBinder);
            A05(parcel, iA01);
        }
    }

    public static void A04(Parcel parcel, float f, int i) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void A06(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void A07(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void A08(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A09(Parcel parcel, Parcelable parcelable, int i, int i2) {
        if (parcelable != null) {
            int iA01 = A01(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A05(parcel, iA01);
        }
    }

    public static void A0A(Parcel parcel, String str, int i) {
        if (str != null) {
            int iA01 = A01(parcel, i);
            parcel.writeString(str);
            A05(parcel, iA01);
        }
    }

    public static void A0B(Parcel parcel, List list, int i) {
        if (list != null) {
            int iA01 = A01(parcel, i);
            parcel.writeStringList(list);
            A05(parcel, iA01);
        }
    }

    public static void A0D(Parcel parcel, byte[] bArr, int i) {
        if (bArr != null) {
            int iA01 = A01(parcel, i);
            parcel.writeByteArray(bArr);
            A05(parcel, iA01);
        }
    }

    public static void A05(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
