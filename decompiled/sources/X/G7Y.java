package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes6.dex */
public class G7Y {
    public static final G7Y A04 = new G7Y(new char[0], new int[0], new boolean[0], 0);
    public final int A00;
    public final char[] A01;
    public final int[] A02;
    public final boolean[] A03;

    public C9238G7t A01(G7T g7t) {
        char cCharAt;
        C7384Etj.A0Y(g7t, 0);
        char cCharAt2 = g7t.A04.A00.charAt(g7t.A00);
        if (cCharAt2 == '*' || cCharAt2 == '-' || cCharAt2 == '+') {
            return new C9238G7t(cCharAt2, 1, 1);
        }
        CharSequence charSequence = g7t.A03;
        int i = g7t.A02;
        int i2 = i;
        while (i2 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i2)) && cCharAt < ':') {
            i2++;
        }
        if (i2 <= i || i2 - i > 9 || i2 >= charSequence.length()) {
            return null;
        }
        if (charSequence.charAt(i2) != '.' && charSequence.charAt(i2) != ')') {
            return null;
        }
        int i3 = (i2 + 1) - i;
        return new C9238G7t(charSequence.charAt(i2), i3, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r7 == r4.length()) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.G7Y A02(X.G7T r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7Y.A02(X.G7T):X.G7Y");
    }

    public final boolean A04(int i) {
        ADq aDqA0C = ATD.A0C(0, i);
        if (!(aDqA0C instanceof Collection) || !C3cG.A1N(aDqA0C)) {
            Iterator<Integer> it = aDqA0C.iterator();
            while (it.hasNext()) {
                int iA00 = ((BNt) it).A00();
                if (this.A01[iA00] != '>' && this.A03[iA00]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A05(G7Y g7y) {
        if (g7y != null) {
            int length = this.A02.length;
            int length2 = g7y.A02.length;
            if (length >= length2) {
                ADq aDqA0C = ATD.A0C(0, length2);
                if (!(aDqA0C instanceof Collection) || !C3cG.A1N(aDqA0C)) {
                    Iterator<Integer> it = aDqA0C.iterator();
                    while (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        if (this.A01[iA00] != g7y.A01[iA00]) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final G7Y A00(G7Y g7y, char c, int i, int i2, boolean z) {
        int[] iArr = g7y.A02;
        int length = iArr.length;
        int i3 = length + 1;
        int[] iArrA1a = AbstractC7607F5u.A1a(iArr, i3);
        char[] cArrCopyOf = Arrays.copyOf(g7y.A01, i3);
        C7384Etj.A0U(cArrCopyOf);
        boolean[] zArrCopyOf = Arrays.copyOf(g7y.A03, i3);
        C7384Etj.A0U(zArrCopyOf);
        iArrA1a[length] = (length == 0 ? 0 : iArr[length - 1]) + i;
        cArrCopyOf[length] = c;
        zArrCopyOf[length] = z;
        if (!(g7y instanceof C9229G7k)) {
            AnonymousClass005.A0x(iArrA1a, cArrCopyOf, zArrCopyOf);
            return new G7Y(cArrCopyOf, iArrA1a, zArrCopyOf, i2);
        }
        int length2 = cArrCopyOf.length - (AnonymousClass005.A1Z(iArrA1a, cArrCopyOf, zArrCopyOf) ? 1 : 0);
        char c2 = cArrCopyOf[length2];
        char c3 = c2;
        if (c2 >= '\u0080') {
            c3 = (char) (c2 - 'd');
        }
        cArrCopyOf[length2] = c3;
        return new C9229G7k(cArrCopyOf, iArrA1a, zArrCopyOf, i2, AnonymousClass002.A1P(c2, c3));
    }

    public final /* bridge */ /* synthetic */ G7Y A03(G7T g7t) {
        G7Y g7y;
        Integer numValueOf;
        boolean z;
        int i;
        boolean z2;
        int i2;
        if (g7t == null) {
            return this instanceof C9229G7k ? C9229G7k.A01 : A04;
        }
        if (g7t.A02 != -1) {
            throw new MarkdownParsingException(AnonymousClass007.A0a("given ", g7t));
        }
        CharSequence charSequence = g7t.A03;
        int[] iArr = this.A02;
        int length = iArr.length;
        int i3 = 0;
        G7Y g7yA00 = this instanceof C9229G7k ? C9229G7k.A01 : A04;
        do {
            g7y = g7yA00;
            if (i3 < length) {
                F1E f1e = new F1E();
                int iA00 = AbstractC9223G7e.A00(charSequence, g7yA00);
                f1e.element = iA00;
                F1E f1e2 = new F1E();
                F1E f1e3 = new F1E();
                char[] cArr = this.A01;
                if (cArr[i3] == '>') {
                    int iA02 = BV6.A02(iA00);
                    int i4 = 0;
                    while (iA02 < charSequence.length() && charSequence.charAt(iA02) == ' ') {
                        i4++;
                        iA02++;
                        if (i4 >= 3) {
                            break;
                        }
                    }
                    if (iA02 < charSequence.length() && charSequence.charAt(iA02) == '>') {
                        int i5 = i4 + 1;
                        numValueOf = Integer.valueOf(i5);
                        f1e.element += i5;
                        i3++;
                    }
                } else {
                    numValueOf = null;
                }
                int i6 = i3;
                while (i3 < length && cArr[i3] != '>') {
                    int iA022 = BV6.A02(iArr[i3] - (i3 == 0 ? 0 : iArr[i3 - 1]));
                    int i7 = f1e3.element;
                    int i8 = f1e.element;
                    int i9 = i8;
                    while (true) {
                        z2 = true;
                        if (f1e3.element >= iA022 || i9 >= charSequence.length()) {
                            break;
                        }
                        char cCharAt = charSequence.charAt(f1e.element);
                        if (cCharAt != ' ') {
                            if (cCharAt != '\t') {
                                break;
                            }
                            i2 = 4 - (f1e2.element % 4);
                        } else {
                            i2 = 1;
                        }
                        f1e3.element += i2;
                        f1e2.element += i2;
                        i9 = f1e.element + 1;
                        f1e.element = i9;
                    }
                    if (f1e.element == charSequence.length()) {
                        f1e3.element = Integer.MAX_VALUE;
                    }
                    int i10 = f1e3.element;
                    if (iA022 <= i10) {
                        f1e3.element = i10 - iA022;
                    } else {
                        f1e.element = i8;
                        f1e3.element = i7;
                        z2 = false;
                    }
                    if (!Boolean.valueOf(z2).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                if (numValueOf != null) {
                    int iA023 = BV6.A02(1);
                    int i11 = f1e3.element;
                    int i12 = f1e.element;
                    int i13 = i12;
                    while (true) {
                        z = true;
                        if (f1e3.element >= iA023 || i13 >= charSequence.length()) {
                            break;
                        }
                        char cCharAt2 = charSequence.charAt(f1e.element);
                        if (cCharAt2 != ' ') {
                            if (cCharAt2 != '\t') {
                                break;
                            }
                            i = 4 - (f1e2.element % 4);
                        } else {
                            i = 1;
                        }
                        f1e3.element += i;
                        f1e2.element += i;
                        i13 = f1e.element + 1;
                        f1e.element = i13;
                    }
                    if (f1e.element == charSequence.length()) {
                        f1e3.element = Integer.MAX_VALUE;
                    }
                    int i14 = f1e3.element;
                    if (iA023 <= i14) {
                        f1e3.element = i14 - iA023;
                    } else {
                        f1e.element = i12;
                        f1e3.element = i11;
                        z = false;
                    }
                    g7yA00 = A00(g7y, '>', (Boolean.valueOf(z).booleanValue() ? 1 : 0) + numValueOf.intValue(), f1e.element, true);
                } else {
                    g7yA00 = g7y;
                }
                while (i6 < i3) {
                    g7yA00 = A00(g7yA00, cArr[i6], iArr[i6] - (i6 == 0 ? 0 : iArr[i6 - 1]), f1e.element, false);
                    i6++;
                }
            }
        } while (!g7yA00.equals(g7y));
        return g7y;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MdConstraints: ");
        sbA0x.append(new String(this.A01));
        sbA0x.append('(');
        int[] iArr = this.A02;
        int length = iArr.length;
        return C8j5.A0X(sbA0x, length == 0 ? 0 : iArr[length - 1]);
    }

    public G7Y(char[] cArr, int[] iArr, boolean[] zArr, int i) {
        this.A02 = iArr;
        this.A01 = cArr;
        this.A03 = zArr;
        this.A00 = i;
    }
}
