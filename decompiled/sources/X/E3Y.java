package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E3Y extends AbstractC6411E4n {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final AbstractC6411E4n[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E3Y e3y = (E3Y) obj;
                if (this.A02 != e3y.A02 || this.A01 != e3y.A01 || !C6xC.A00(this.A00, e3y.A00) || !Arrays.equals(this.A03, e3y.A03) || !Arrays.equals(this.A04, e3y.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public E3Y(String str, AbstractC6411E4n[] abstractC6411E4nArr, String[] strArr, boolean z, boolean z2) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = abstractC6411E4nArr;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, (((527 + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31);
    }
}
