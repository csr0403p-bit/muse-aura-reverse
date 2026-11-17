package X;

/* renamed from: X.CXy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3614CXy {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public final byte A00() {
        int i = this.A00;
        if (i >= this.A01) {
            throw new IllegalStateException("Check failed.");
        }
        byte[] bArr = this.A02;
        this.A00 = i + 1;
        return bArr[i];
    }

    public C3614CXy(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A01 = i;
    }
}
