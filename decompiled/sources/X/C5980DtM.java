package X;

/* renamed from: X.DtM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5980DtM {
    public final boolean A01;
    public final String[] A02 = new String[25];
    public int A00 = 0;

    public final synchronized void A00(String str) {
        if (this.A01) {
            int i = this.A00;
            String[] strArr = this.A02;
            int i2 = i;
            if (i >= 25) {
                i2 = 0;
            }
            strArr[i2] = str;
            int i3 = i + 1;
            this.A00 = i3;
            if (i3 >= 25) {
                this.A00 = 0;
            }
        }
    }

    public C5980DtM(boolean z) {
        this.A01 = z;
    }
}
