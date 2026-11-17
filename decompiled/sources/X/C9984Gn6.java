package X;

/* renamed from: X.Gn6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9984Gn6 implements AutoCloseable {
    public Integer A00;
    public byte[] A02;
    public byte[] A03;
    public char[] A04;
    public char[] A05;
    public char[] A06;
    public final C9518GMl A08;
    public final C10002GnY A09;
    public final C10061Goi A0A;
    public final C9517GMk A0B;
    public final HjR A0C;
    public final boolean A0D;

    @Deprecated
    public final Object A0E;
    public boolean A01 = true;
    public boolean A07 = false;

    public static final void A00(Object obj) {
        if (obj != null) {
            throw C3cG.A0Q("Trying to call same allocXxx() method second time");
        }
    }

    public final void A01(byte[] bArr) {
        byte[] bArr2 = this.A02;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw C60O.A0i("Trying to release buffer smaller than original");
        }
        this.A02 = null;
        this.A0C.A01(3, bArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        if (this.A01) {
            this.A01 = false;
        }
    }

    public C9984Gn6(C9518GMl c9518GMl, C10002GnY c10002GnY, C10061Goi c10061Goi, C9517GMk c9517GMk, HjR hjR, boolean z) {
        this.A09 = c10002GnY;
        this.A0A = c10061Goi;
        this.A08 = c9518GMl;
        this.A0C = hjR;
        this.A0B = c9517GMk;
        this.A0E = c9517GMk.A00;
        this.A0D = z;
    }
}
