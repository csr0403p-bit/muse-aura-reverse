package X;

import com.google.common.base.Preconditions;

/* renamed from: X.CzX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4592CzX extends AbstractC4591CzW {
    public final CzV A00;
    public final Character A01;
    public volatile AbstractC4591CzW A02;

    public final void A01(Appendable target, byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        CzV czV = this.A00;
        int i = czV.A01;
        int i2 = 0;
        Preconditions.checkArgument(BV7.A1S(len, i));
        long j = 0;
        for (int i3 = 0; i3 < len; i3++) {
            j = (j | (bytes[off + i3] & 255)) << 8;
        }
        int i4 = czV.A00;
        int i5 = ((len + 1) * 8) - i4;
        while (i2 < len * 8) {
            target.append(czV.A07[((int) (j >>> (i5 - i2))) & czV.A03]);
            i2 += i4;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i2 < i * 8) {
                target.append(ch.charValue());
                i2 += i4;
            }
        }
    }

    public final boolean equals(Object other) {
        if (!(other instanceof C4592CzX)) {
            return false;
        }
        C4592CzX c4592CzX = (C4592CzX) other;
        return this.A00.equals(c4592CzX.A00) && C6xC.A00(this.A01, c4592CzX.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("BaseEncoding.");
        CzV czV = this.A00;
        sbA0x.append(czV);
        if (8 % czV.A00 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4592CzX(X.CzV r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 == 0) goto L16
            char r2 = r5.charValue()
            byte[] r1 = r4.A06
            int r0 = r1.length
            if (r2 >= r0) goto L16
            r2 = r1[r2]
            r0 = -1
            r1 = 0
            if (r2 != r0) goto L17
        L16:
            r1 = 1
        L17:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r5)
            r3.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4592CzX.<init>(X.CzV, java.lang.Character):void");
    }
}
