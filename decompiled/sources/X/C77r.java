package X;

import android.os.Parcel;

/* renamed from: X.77r, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77r {
    public final long A00;
    public final String A01;
    public final byte[] A02;

    /* JADX WARN: Incorrect types in method signature: <P:Ljava/lang/Object;>([BLX/G0U<-Landroid/os/Parcel;+TP;>;)TP; */
    public static final Object A00(G0U g0u, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        C7384Etj.A0U(parcelObtain);
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return g0u.invoke(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public C77r(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        C7384Etj.A0X(string);
        this.A01 = string;
        this.A00 = parcel.readLong();
    }
}
