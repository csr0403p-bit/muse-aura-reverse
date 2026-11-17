package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7BY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7BY extends AbstractC2159Azp {
    public static final int A08(CharSequence charSequence, char c, int i) {
        C7384Etj.A0Y(charSequence, 0);
        return !(charSequence instanceof String) ? A0D(charSequence, new char[]{c}, i) : ((String) charSequence).indexOf(c, i);
    }

    public static final int A09(CharSequence charSequence, char c, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (cArr[0] == charSequence.charAt(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final int A0B(CharSequence charSequence, String str, int i, boolean z) {
        C7384Etj.A0Y(charSequence, 0);
        C7384Etj.A0Y(str, 1);
        return (z || !(charSequence instanceof String)) ? A0A(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int A0C(CharSequence charSequence, String str, int i, boolean z) {
        C7384Etj.A0Y(str, 1);
        return (z || !(charSequence instanceof String)) ? A0A(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static final int A0D(CharSequence charSequence, char[] cArr, int i) {
        if (cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (c == cCharAt) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static final Boolean A0E(String str) {
        boolean z = false;
        if (str.equals("true")) {
            z = true;
        } else if (!str.equals("false")) {
            return null;
        }
        return Boolean.valueOf(z);
    }

    public static final CharSequence A0F(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean zA00 = C7LE.A00(charSequence.charAt(i2));
            if (z) {
                if (!zA00) {
                    break;
                }
                length--;
            } else if (zA00) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence A0G(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!C7LE.A00(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final CharSequence A0H(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C7LE.A00(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final String A0K(CharSequence charSequence, String str) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(charSequence, 1);
        return A0o(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static final String A0L(CharSequence charSequence, String str) {
        C7384Etj.A0Y(str, 0);
        return A0n(str, charSequence) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    public static final String A0Q(String str, String str2, char c) {
        AnonymousClass002.A1A(str, 0, str2);
        int iA08 = A08(str, c, 0);
        return iA08 != -1 ? str.substring(iA08 + 1, str.length()) : str2;
    }

    public static final String A0R(String str, String str2, char c) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 2);
        int length = str.length();
        int iA09 = A09(str, c, length - 1);
        return iA09 != -1 ? str.substring(iA09 + 1, length) : str2;
    }

    public static final String A0S(String str, String str2, char c) {
        AnonymousClass002.A1A(str, 0, str2);
        int iA08 = A08(str, c, 0);
        return iA08 != -1 ? str.substring(0, iA08) : str2;
    }

    public static final String A0T(String str, String str2, char c) {
        AnonymousClass002.A1A(str, 0, str2);
        int iA09 = A09(str, c, str.length() - 1);
        return iA09 != -1 ? str.substring(0, iA09) : str2;
    }

    public static final String A0U(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str3, 2);
        int iA0B = A0B(str, str2, 0, false);
        return iA0B != -1 ? str.substring(iA0B + str2.length(), str.length()) : str3;
    }

    public static final String A0V(String str, String str2, String str3) {
        AnonymousClass002.A1A(str, 0, str3);
        int length = str.length();
        int iA0C = A0C(str, str2, length - 1, false);
        return iA0C != -1 ? str.substring(iA0C + str2.length(), length) : str3;
    }

    public static final String A0W(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str3, 2);
        int iA0B = A0B(str, str2, 0, false);
        return iA0B != -1 ? str.substring(0, iA0B) : str3;
    }

    public static final String A0X(String str, String str2, String str3) {
        AnonymousClass002.A1A(str, 0, str3);
        int iA0C = A0C(str, str2, str.length() - 1, false);
        return iA0C != -1 ? str.substring(0, iA0C) : str3;
    }

    public static final String A0Y(String str, char... cArr) {
        C7384Etj.A0Y(str, 0);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean zA0K = BFI.A0K(cArr, str.charAt(i2));
            if (z) {
                if (!zA0K) {
                    break;
                }
                length--;
            } else if (zA0K) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static final String A0Z(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        C7384Etj.A0Y(str, 0);
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!BFI.A0K(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final StringBuilder A0c(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        AnonymousClass002.A1B(charSequence, 0, charSequence2);
        if (i2 < i) {
            throw new IndexOutOfBoundsException(FGI.A0Y("End index (", ") is less than start index (", ").", i2, i));
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(charSequence, 0, i);
        sbA0w.append(charSequence2);
        sbA0w.append(charSequence, i2, charSequence.length());
        return sbA0w;
    }

    public static List A0d(CharSequence charSequence) {
        return A0g(charSequence, new char[]{'&'});
    }

    public static List A0e(CharSequence charSequence, String str) {
        return A0i(charSequence, new String[]{str}, 0);
    }

    public static final List A0f(CharSequence charSequence, String str, int i) {
        int length = 0;
        int iA0B = A0B(charSequence, str, 0, false);
        if (iA0B == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = false;
        int i2 = 10;
        if (i > 0) {
            z = true;
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iA0B).toString());
            length = str.length() + iA0B;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iA0B = A0B(charSequence, str, length, false);
        } while (iA0B != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final List A0g(CharSequence charSequence, char[] cArr) {
        C7384Etj.A0Y(charSequence, 0);
        if (cArr.length == 1) {
            return A0f(charSequence, String.valueOf(cArr[0]), 0);
        }
        C7AD c7ad = new C7AD(charSequence, new C3bQ(cArr, 4), 0);
        ArrayList arrayList = new ArrayList(10);
        C7AC c7ac = new C7AC(c7ad);
        while (c7ac.hasNext()) {
            ADq next = c7ac.next();
            C7384Etj.A0Y(next, 1);
            arrayList.add(charSequence.subSequence(next.A00, next.A01 + 1).toString());
        }
        return arrayList;
    }

    public static List A0h(CharSequence charSequence, char[] cArr, char c) {
        cArr[0] = c;
        return A0g(charSequence, cArr);
    }

    public static final List A0i(CharSequence charSequence, String[] strArr, int i) {
        C7384Etj.A0Y(charSequence, 0);
        String str = strArr[0];
        if (str.length() > 0) {
            return A0f(charSequence, str, i);
        }
        C7AD c7ad = new C7AD(charSequence, new C3bQ(Arrays.asList(strArr), 5), i);
        ArrayList arrayList = new ArrayList(10);
        C7AC c7ac = new C7AC(c7ad);
        while (c7ac.hasNext()) {
            ADq next = c7ac.next();
            C7384Etj.A0Y(next, 1);
            arrayList.add(charSequence.subSequence(next.A00, next.A01 + 1).toString());
        }
        return arrayList;
    }

    public static final boolean A0j(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C7LE.A00(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0k(CharSequence charSequence, char c) {
        C7384Etj.A0Y(charSequence, 0);
        return A08(charSequence, c, 0) >= 0;
    }

    public static final boolean A0l(CharSequence charSequence, char c) {
        C7384Etj.A0Y(charSequence, 0);
        return charSequence.length() > 0 && charSequence.charAt(charSequence.length() + (-1)) == c;
    }

    public static final boolean A0m(CharSequence charSequence, char c) {
        C7384Etj.A0Y(charSequence, 0);
        return charSequence.length() > 0 && charSequence.charAt(0) == c;
    }

    public static final boolean A0n(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return A0p(charSequence, charSequence2, charSequence.length() - charSequence2.length(), 0, charSequence2.length(), false);
        }
        String str = (String) charSequence;
        String str2 = (String) charSequence2;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        return str.endsWith(str2);
    }

    public static final boolean A0o(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return A0p(charSequence, charSequence2, 0, 0, charSequence2.length(), false);
        }
        String str = (String) charSequence;
        String str2 = (String) charSequence2;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        return str.startsWith(str2);
    }

    public static final boolean A0p(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!HlF.A02(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0q(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7384Etj.A0Y(charSequence, 0);
        C7384Etj.A0Y(charSequence2, 1);
        return (charSequence2 instanceof String ? A0B(charSequence, (String) charSequence2, 0, z) : A0A(charSequence, charSequence2, 0, charSequence.length(), z, false)) >= 0;
    }

    public static final int A0A(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int i3;
        C0968AJv c0968AJv;
        int i4;
        int i5;
        if (z2) {
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            i3 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            c0968AJv = new C0968AJv(i, i2, -1);
        } else {
            i3 = 0;
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            c0968AJv = new ADq(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i6 = c0968AJv.A00;
            int i7 = c0968AJv.A01;
            int i8 = c0968AJv.A02;
            if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                do {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    C7384Etj.A0Y(str2, 2);
                    if (!z ? str.regionMatches(i3, str2, i6, length3) : str.regionMatches(z, i3, str2, i6, length3)) {
                        return i6;
                    }
                    i5 = i6;
                    i6 += i8;
                } while (i5 != i7);
            }
        } else {
            int i9 = c0968AJv.A00;
            int i10 = c0968AJv.A01;
            int i11 = c0968AJv.A02;
            if (i11 <= 0 ? !(i11 >= 0 || i10 > i9) : i9 <= i10) {
                do {
                    i4 = i9;
                    if (A0p(charSequence2, charSequence, i3, i4, charSequence2.length(), z)) {
                        return i9;
                    }
                    i9 += i11;
                } while (i4 != i10);
            }
        }
        return -1;
    }

    public static String A0M(String str) {
        return A0R(str, str, '/');
    }

    public static String A0N(String str) {
        return A0R(str, "", '.').toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    public static final String A0O(String str, int i) {
        Object sb;
        C7384Etj.A0Y(str, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0I("Desired length ", i, C8j2.A00(3)));
        }
        int length = str.length();
        if (i <= length) {
            sb = str.subSequence(0, length);
        } else {
            sb = new StringBuilder(i);
            sb.append(str);
            int i2 = i - length;
            int i3 = 1;
            if (1 <= i2) {
                while (true) {
                    sb.append(' ');
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return sb.toString();
    }

    public static final String A0P(String str, int i) {
        CharSequence charSequenceSubSequence;
        C7384Etj.A0Y(str, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0I("Desired length ", i, C8j2.A00(3)));
        }
        int length = str.length();
        if (i <= length) {
            charSequenceSubSequence = str.subSequence(0, length);
        } else {
            StringBuilder sb = new StringBuilder(i);
            int i2 = i - length;
            int i3 = 1;
            if (1 <= i2) {
                while (true) {
                    sb.append('0');
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final String A0I(CharSequence charSequence, CharSequence charSequence2) {
        boolean zA1b = AnonymousClass004.A1b(charSequence, charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (i2 >= 0 && ((i2 <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i2 + 1))) || (i2 <= charSequence2.length() - 2 && Character.isHighSurrogate(charSequence2.charAt(i2)) && Character.isLowSurrogate(charSequence2.charAt(i2 + 1))))) {
            i = i2;
        }
        return charSequence.subSequence(zA1b ? 1 : 0, i).toString();
    }

    public static final String A0J(CharSequence charSequence, CharSequence charSequence2, String str) {
        int iA02 = C60R.A02(str);
        return (iA02 >= charSequence.length() + charSequence2.length() && A0o(str, charSequence) && A0n(str, charSequence2)) ? str.substring(charSequence.length(), iA02 - charSequence2.length()) : str;
    }

    public static final String A0a(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int iA02 = C60R.A02(str);
        int i = 0;
        while (true) {
            if (i >= iA02) {
                charSequenceSubSequence = "";
                break;
            }
            if (!BFI.A0K(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, iA02);
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static String A0b(Iterator it) {
        return A0F((String) it.next()).toString();
    }
}
