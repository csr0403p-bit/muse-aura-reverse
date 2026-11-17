package X;

/* renamed from: X.Au0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1937Au0 implements AzK {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1937Au0) {
                C1937Au0 c1937Au0 = (C1937Au0) obj;
                if (this.A01 != c1937Au0.A01 || this.A00 != c1937Au0.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AzK
    public final void A4d(C1917Ate c1917Ate) {
        int i = c1917Ate.A02;
        int i2 = this.A00;
        int iA00 = i + i2;
        if (((i ^ iA00) & (i2 ^ iA00)) < 0) {
            iA00 = c1917Ate.A04.A00();
        }
        c1917Ate.A02(i, Math.min(iA00, c1917Ate.A04.A00()));
        int i3 = c1917Ate.A03;
        int i4 = this.A01;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        c1917Ate.A02(Math.max(0, i5), i3);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C8j4.A0y("DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", this.A01, this.A00);
    }

    public C1937Au0(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw C60O.A0i(FGI.A0Y("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
