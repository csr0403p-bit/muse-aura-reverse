package X;

import java.util.Arrays;

/* renamed from: X.E3b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6374E3b extends AbstractC6411E4n {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final AbstractC6411E4n[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6374E3b c6374E3b = (C6374E3b) obj;
                if (this.A01 != c6374E3b.A01 || this.A00 != c6374E3b.A00 || this.A03 != c6374E3b.A03 || this.A02 != c6374E3b.A02 || !C6xC.A00(this.A04, c6374E3b.A04) || !Arrays.equals(this.A05, c6374E3b.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public C6374E3b(String str, AbstractC6411E4n[] abstractC6411E4nArr, int i, int i2, long j, long j2) {
        super("CHAP");
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = abstractC6411E4nArr;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A04, (((((((527 + this.A01) * 31) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31);
    }
}
