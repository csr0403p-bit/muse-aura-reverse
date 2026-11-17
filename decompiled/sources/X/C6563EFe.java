package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.EFe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6563EFe extends AbstractC6562EFd {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public C6563EFe(Parcel parcel) {
        this(parcel, new DQZ(0), new DQZ(0), new DQZ(0), "", parcel.dataPosition(), parcel.dataSize());
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/os/Parcel;IILjava/lang/String;LX/DQZ<Ljava/lang/String;Ljava/lang/reflect/Method;>;LX/DQZ<Ljava/lang/String;Ljava/lang/reflect/Method;>;LX/DQZ<Ljava/lang/String;Ljava/lang/Class<*>;>;)V */
    public C6563EFe(Parcel parcel, DQZ dqz, DQZ dqz2, DQZ dqz3, String str, int i, int i2) {
        super(dqz, dqz2, dqz3);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
