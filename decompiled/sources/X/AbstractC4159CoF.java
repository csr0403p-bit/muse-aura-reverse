package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;

/* renamed from: X.CoF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4159CoF {
    public static int A01(Parcel parcel, int i) {
        A0F(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A02(Parcel parcel, int i) {
        A0F(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A03(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int A04(Parcel parcel, int i, int i2, int i3, int i4) {
        if (i != i2) {
            A0E(parcel, i3);
            return i4;
        }
        A0F(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long A05(Parcel parcel, int i) {
        A0F(parcel, i, 8);
        return parcel.readLong();
    }

    public static String A0A(Parcel parcel, String str, int i, int i2, int i3) {
        if (i == i2) {
            return A09(parcel, i3);
        }
        A0E(parcel, i3);
        return str;
    }

    public static boolean A0H(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return A0G(parcel, i3);
        }
        A0E(parcel, i3);
        return z;
    }

    public static int A00(Parcel parcel) {
        int i = parcel.readInt();
        int iA03 = A03(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != '\u4f45') {
            throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))));
        }
        int i2 = iA03 + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(parcel, FGI.A0T("Size read is invalid start=", " end=", iDataPosition, i2));
        }
        return i2;
    }

    public static Bundle A06(Parcel parcel, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA03);
        return bundle;
    }

    public static IBinder A07(Parcel parcel, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA03);
        return strongBinder;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Landroid/os/Parcelable;>(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator<TT;>;)TT; */
    public static Parcelable A08(Parcel parcel, Parcelable.Creator creator, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA03);
        return parcelable;
    }

    public static String A09(Parcel parcel, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA03);
        return string;
    }

    public static ArrayList<String> A0B(Parcel parcel, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA03);
        return arrayListCreateStringArrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator<TT;>;)Ljava/util/ArrayList<TT;>; */
    public static ArrayList A0C(Parcel parcel, Parcelable.Creator creator, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA03);
        return arrayListCreateTypedArrayList;
    }

    public static void A0D(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(parcel, FGI.A0H("Overread allowed size end=", i));
        }
    }

    public static void A0E(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A03(parcel, i));
    }

    public static void A0F(Parcel parcel, int i, int i2) {
        int iA03 = A03(parcel, i);
        if (iA03 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iA03);
        StringBuilder sbA0y = C60O.A0y("Expected size ", i2);
        sbA0y.append(" got ");
        sbA0y.append(iA03);
        throw new SafeParcelReader$ParseException(parcel, C3cJ.A0N(" (0x", hexString, sbA0y));
    }

    public static boolean A0G(Parcel parcel, int i) {
        return AnonymousClass002.A1L(A02(parcel, i));
    }

    public static byte[] A0I(Parcel parcel, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iA03);
        return bArrCreateByteArray;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator<TT;>;)[TT; */
    public static Object[] A0J(Parcel parcel, Parcelable.Creator creator, int i) {
        int iA03 = A03(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iA03 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA03);
        return objArrCreateTypedArray;
    }
}
