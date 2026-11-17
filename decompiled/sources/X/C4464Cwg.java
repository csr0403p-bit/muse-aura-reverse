package X;

/* renamed from: X.Cwg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4464Cwg extends AbstractC4467Cwj {
    public final C4468Cwk A00;
    public final Character A01;
    public volatile AbstractC4467Cwj A02;

    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        CeX.A02(i, i + i2, bArr.length);
        C4468Cwk c4468Cwk = this.A00;
        int i3 = c4468Cwk.A03;
        int i4 = 0;
        if (i2 > i3) {
            throw BV4.A0P();
        }
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        while (i4 < i2 * 8) {
            int i7 = c4468Cwk.A01;
            appendable.append(c4468Cwk.A07[c4468Cwk.A00 & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.A01 != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += c4468Cwk.A01;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4464Cwg)) {
            return false;
        }
        C4464Cwg c4464Cwg = (C4464Cwg) obj;
        return this.A00.equals(c4464Cwg.A00) && C6xC.A00(this.A01, c4464Cwg.A01);
    }

    public final int hashCode() {
        Character ch = this.A01;
        return AnonymousClass006.A0D(ch) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("BaseEncoding.");
        C4468Cwk c4468Cwk = this.A00;
        sbA0x.append(c4468Cwk);
        if (8 % c4468Cwk.A01 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                sbA0x.append(".withPadChar('");
                sbA0x.append(ch);
                str = "')";
            }
            sbA0x.append(str);
        }
        return sbA0x.toString();
    }

    public C4464Cwg(C4468Cwk c4468Cwk, Character ch) {
        this.A00 = c4468Cwk;
        if (ch != null) {
            byte[] bArr = c4468Cwk.A06;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw C60O.A0i(CL4.A00("Padding character %s was already in alphabet", ch));
            }
        }
        this.A01 = ch;
    }
}
