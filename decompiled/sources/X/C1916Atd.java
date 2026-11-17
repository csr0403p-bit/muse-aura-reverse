package X;

/* renamed from: X.Atd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1916Atd implements AzK {
    public final int A00;
    public final ApQ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1916Atd) {
                C1916Atd c1916Atd = (C1916Atd) obj;
                if (!C7384Etj.areEqual(this.A01.A00, c1916Atd.A01.A00) || this.A00 != c1916Atd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AzK
    public final void A4d(C1917Ate c1917Ate) {
        int i;
        int i2 = c1917Ate.A01;
        if (i2 != -1) {
            i = c1917Ate.A00;
        } else {
            i2 = c1917Ate.A03;
            i = c1917Ate.A02;
        }
        String str = this.A01.A00;
        c1917Ate.A05(i2, i, str);
        int i3 = c1917Ate.A03;
        int i4 = c1917Ate.A02;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.A00;
        int i6 = i4 + i5;
        int iA04 = ATD.A04(i5 > 0 ? i6 - 1 : i6 - str.length(), 0, c1917Ate.A04.A00());
        c1917Ate.A04(iA04, iA04);
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01.A00) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CommitTextCommand(text='");
        sbA0x.append(this.A01.A00);
        sbA0x.append("', newCursorPosition=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1916Atd(ApQ apQ, int i) {
        this.A01 = apQ;
        this.A00 = i;
    }
}
