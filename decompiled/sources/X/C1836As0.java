package X;

/* renamed from: X.As0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1836As0 {
    public final int A00;
    public final int A01;
    public final InterfaceC1841AsE A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1836As0) {
                C1836As0 c1836As0 = (C1836As0) obj;
                if (!this.A02.equals(c1836As0.A02) || this.A01 != c1836As0.A01 || this.A00 != c1836As0.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A02) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ParagraphIntrinsicInfo(intrinsics=");
        sbA0x.append(this.A02);
        sbA0x.append(", startIndex=");
        sbA0x.append(this.A01);
        sbA0x.append(", endIndex=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1836As0(InterfaceC1841AsE interfaceC1841AsE, int i, int i2) {
        this.A02 = interfaceC1841AsE;
        this.A01 = i;
        this.A00 = i2;
    }
}
