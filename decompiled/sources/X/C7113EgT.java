package X;

import android.util.SparseIntArray;

/* renamed from: X.EgT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7113EgT {
    public final int A00;
    public final EC1 A01;
    public final C7139Egv A02;
    public final C7139Egv A03;
    public final C7139Egv A04;
    public final C7139Egv A05;
    public final InterfaceC3590CVw A06;
    public final InterfaceC3590CVw A07;
    public final InterfaceC3590CVw A08;
    public final String A09;

    public static void A00(SparseIntArray sparseIntArray) {
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
    }

    public C7113EgT(EC1 ec1) {
        C7267Ejs.A00();
        this.A02 = new C7139Egv(AbstractC7142Egy.A00, -1);
        this.A06 = Eh1.A00();
        int i = AbstractC6940Ecs.A00;
        int i2 = 131072;
        SparseIntArray sparseIntArray = new SparseIntArray();
        do {
            sparseIntArray.put(i2, i);
            i2 *= 2;
        } while (i2 <= 4194304);
        this.A03 = new C7139Egv(sparseIntArray, i);
        if (ec1 == null) {
            synchronized (C7141Egx.class) {
                C7141Egx c7141Egx = C7141Egx.A00;
                ec1 = c7141Egx;
                if (c7141Egx == null) {
                    C7141Egx c7141Egx2 = new C7141Egx();
                    C7141Egx.A00 = c7141Egx2;
                    ec1 = c7141Egx2;
                }
            }
        }
        this.A01 = ec1;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A00(sparseIntArray2);
        this.A04 = new C7139Egv(sparseIntArray2, -1);
        this.A07 = Eh1.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A05 = new C7139Egv(sparseIntArray3, -1);
        this.A08 = Eh1.A00();
        this.A09 = "legacy";
        this.A00 = 4194304;
        C7267Ejs.A00();
    }

    public C7113EgT() {
        C7141Egx c7141Egx;
        C7267Ejs.A00();
        this.A02 = new C7139Egv(AbstractC7142Egy.A00, -1);
        this.A06 = Eh1.A00();
        int i = AbstractC6940Ecs.A00;
        int i2 = 131072;
        SparseIntArray sparseIntArray = new SparseIntArray();
        do {
            sparseIntArray.put(i2, i);
            i2 *= 2;
        } while (i2 <= 4194304);
        this.A03 = new C7139Egv(sparseIntArray, i);
        synchronized (C7141Egx.class) {
            c7141Egx = C7141Egx.A00;
            if (c7141Egx == null) {
                c7141Egx = new C7141Egx();
                C7141Egx.A00 = c7141Egx;
            }
        }
        this.A01 = c7141Egx;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A00(sparseIntArray2);
        this.A04 = new C7139Egv(sparseIntArray2, -1);
        this.A07 = Eh1.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A05 = new C7139Egv(sparseIntArray3, -1);
        this.A08 = Eh1.A00();
        this.A09 = "legacy";
        this.A00 = 4194304;
        C7267Ejs.A00();
    }
}
