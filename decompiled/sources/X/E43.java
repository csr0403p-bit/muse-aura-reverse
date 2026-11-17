package X;

import android.util.SparseArray;

/* loaded from: classes5.dex */
public final class E43 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A07;
    public byte[] A08;
    public final E4H A0B;
    public final InterfaceC5563Dkg A0C;
    public final SparseArray<C6377E3e> A0A = BV4.A0B();
    public final SparseArray<E5O> A09 = BV4.A0B();
    public boolean A06 = false;

    public E43(InterfaceC5563Dkg interfaceC5563Dkg) {
        this.A0C = interfaceC5563Dkg;
        byte[] bArr = new byte[128];
        this.A08 = bArr;
        this.A0B = new E4H(bArr, 0, 0);
    }
}
