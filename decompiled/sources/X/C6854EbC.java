package X;

import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EbC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6854EbC {
    public static final char[] A0A = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;
    public final boolean A06;
    public final String A07;
    public final String A08;
    public final List<String> A09;

    public static final String A01(String str, int i, int i2, boolean z) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int i3 = iCharCount + 1;
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C6818EaW c6818EaW = new C6818EaW();
                c6818EaW.A0B(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37) {
                        int i4 = iCharCount + 2;
                        if (i4 < i2) {
                            int iA00 = AbstractC6843Eav.A00(str.charAt(iCharCount + 1));
                            int iA002 = AbstractC6843Eav.A00(str.charAt(i4));
                            if (iA00 != -1 && iA002 != -1) {
                                c6818EaW.Aif((iA00 << 4) + iA002);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        }
                        c6818EaW.A09(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    } else if (iCodePointAt == 43 && z) {
                        c6818EaW.Aif(32);
                        iCharCount++;
                    } else {
                        c6818EaW.A09(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return C6818EaW.A00(DCl.A05, c6818EaW, c6818EaW.A00);
            }
            iCharCount = i3;
        }
        return str.substring(i, i2);
    }

    public static final String A02(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z4) && !C7BY.A0k(str2, (char) iCodePointAt))) {
                if (iCodePointAt == 37) {
                    if (z && (!z2 || A04(str, iCharCount, i2))) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt != 43 || !z3) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            C6818EaW c6818EaW = new C6818EaW();
            c6818EaW.A0B(str, i, iCharCount);
            C6818EaW c6818EaW2 = null;
            while (iCharCount < i2) {
                int iCodePointAt2 = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                    if (iCodePointAt2 == 43 && z3) {
                        String str3 = z ? "+" : "%2B";
                        c6818EaW.A0B(str3, 0, str3.length());
                    } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && !z4) || C7BY.A0k(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !A04(str, iCharCount, i2)))))) {
                        if (c6818EaW2 == null) {
                            c6818EaW2 = new C6818EaW();
                        }
                        c6818EaW2.A09(iCodePointAt2);
                        while (!c6818EaW2.AB9()) {
                            byte b = c6818EaW2.readByte();
                            c6818EaW.Aif(37);
                            char[] cArr = A0A;
                            c6818EaW.Aif(cArr[((b & 255) >> 4) & 15]);
                            c6818EaW.Aif(cArr[b & 15]);
                        }
                    } else {
                        c6818EaW.A09(iCodePointAt2);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt2);
            }
            return C6818EaW.A00(DCl.A05, c6818EaW, c6818EaW.A00);
        }
        return str.substring(i, i2);
    }

    public static final int A00(String str) {
        if (str.equals(AuraDeeplinkHandlerActivity.HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static final boolean A04(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC6843Eav.A00(str.charAt(i + 1)) != -1 && AbstractC6843Eav.A00(str.charAt(i3)) != -1;
    }

    public final String A05() {
        if (this.A07.length() == 0) {
            return "";
        }
        String str = this.A04;
        return str.substring(C7BY.A08(str, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, this.A03.length() + 3) + 1, C7BY.A08(str, '@', 0));
    }

    public final String A06() {
        String str = this.A04;
        int iA08 = C7BY.A08(str, '/', this.A03.length() + 3);
        int length = str.length();
        int i = iA08;
        byte[] bArr = AbstractC6843Eav.A06;
        while (true) {
            if (i >= length) {
                i = length;
                break;
            }
            int i2 = i + 1;
            if (C7BY.A0k("?#", str.charAt(i))) {
                break;
            }
            i = i2;
        }
        return str.substring(iA08, i);
    }

    public final String A07() {
        if (this.A05 == null) {
            return null;
        }
        String str = this.A04;
        int iA08 = C7BY.A08(str, '?', 0) + 1;
        int length = str.length();
        int i = iA08;
        byte[] bArr = AbstractC6843Eav.A06;
        while (true) {
            if (i >= length) {
                i = length;
                break;
            }
            int i2 = i + 1;
            if (str.charAt(i) == '#') {
                break;
            }
            i = i2;
        }
        return str.substring(iA08, i);
    }

    public final String A08() {
        if (this.A08.length() == 0) {
            return "";
        }
        int length = this.A03.length() + 3;
        String str = this.A04;
        int length2 = str.length();
        int i = length;
        byte[] bArr = AbstractC6843Eav.A06;
        while (true) {
            if (i >= length2) {
                i = length2;
                break;
            }
            int i2 = i + 1;
            if (C7BY.A0k(":@", str.charAt(i))) {
                break;
            }
            i = i2;
        }
        return str.substring(length, i);
    }

    public final String A09() {
        C6855EbD c6855EbD;
        try {
            c6855EbD = new C6855EbD();
            c6855EbD.A01("/...", this);
        } catch (IllegalArgumentException unused) {
            c6855EbD = null;
        }
        C7384Etj.A0X(c6855EbD);
        int length = "".length();
        String strA02 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, false);
        C7384Etj.A0Y(strA02, 0);
        c6855EbD.A03 = strA02;
        String strA022 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, false);
        C7384Etj.A0Y(strA022, 0);
        c6855EbD.A02 = strA022;
        return c6855EbD.A00().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    public final URI A0A() {
        String strA0g;
        String strA02;
        ArrayList arrayListA0u = BV5.A0u("");
        String str = this.A03;
        String strA08 = A08();
        C7384Etj.A0Y(strA08, 0);
        String strA05 = A05();
        C7384Etj.A0Y(strA05, 0);
        String str2 = this.A02;
        int i = this.A00;
        int iA00 = A00(str);
        if (i == iA00) {
            i = -1;
        }
        arrayListA0u.clear();
        arrayListA0u.addAll(A0B());
        String strA07 = A07();
        AbstractList abstractListA03 = null;
        abstractListA03 = null;
        if (strA07 != null && (strA02 = A02(strA07, " \"'<>#", 0, strA07.length(), true, false, true, false)) != null) {
            abstractListA03 = A03(strA02);
        }
        if (this.A01 == null) {
            strA0g = null;
        } else {
            String str3 = this.A04;
            strA0g = BV4.A0g(C7BY.A08(str3, '#', 0), str3);
        }
        String strA03 = C06827l3.A02("[\"<>^`{|}]").A03(str2, "");
        int size = arrayListA0u.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String str4 = (String) arrayListA0u.get(i3);
            arrayListA0u.set(i3, A02(str4, "[]", 0, str4.length(), true, true, false, false));
        }
        if (abstractListA03 != null) {
            int size2 = abstractListA03.size();
            while (i2 < size2) {
                int i4 = i2 + 1;
                String str5 = (String) abstractListA03.get(i2);
                abstractListA03.set(i2, str5 == null ? null : A02(str5, "\\^`{|}", 0, str5.length(), true, true, true, false));
                i2 = i4;
            }
        }
        String strA022 = strA0g != null ? A02(strA0g, " \"#<>\\^`{|}", 0, strA0g.length(), true, true, false, true) : null;
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("://");
        if (strA08.length() > 0 || strA05.length() > 0) {
            sbA0g.append(strA08);
            if (strA05.length() > 0) {
                sbA0g.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                sbA0g.append(strA05);
            }
            sbA0g.append('@');
        }
        if (C7BY.A0k(strA03, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR)) {
            sbA0g.append('[');
            sbA0g.append(strA03);
            sbA0g.append(']');
        } else {
            sbA0g.append(strA03);
        }
        if (i == -1) {
            i = iA00;
        }
        if (i != iA00) {
            sbA0g.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            sbA0g.append(i);
        }
        int size3 = arrayListA0u.size();
        for (int i5 = 0; i5 < size3; i5++) {
            sbA0g.append('/');
            sbA0g.append(C60Q.A0n(arrayListA0u, i5));
        }
        if (abstractListA03 != null) {
            sbA0g.append('?');
            C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, abstractListA03.size()), 2);
            int i6 = c0968AJvA0B.A00;
            int i7 = c0968AJvA0B.A01;
            int i8 = c0968AJvA0B.A02;
            if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                while (true) {
                    int i9 = i6 + i8;
                    String strA0n = C60Q.A0n(abstractListA03, i6);
                    String strA0n2 = C60Q.A0n(abstractListA03, i6 + 1);
                    if (i6 > 0) {
                        sbA0g.append('&');
                    }
                    sbA0g.append(strA0n);
                    if (strA0n2 != null) {
                        sbA0g.append('=');
                        sbA0g.append(strA0n2);
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 = i9;
                }
            }
        }
        if (strA022 != null) {
            sbA0g.append('#');
            sbA0g.append(strA022);
        }
        String string = sbA0g.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(C06827l3.A02("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").A03(string, ""));
                C7384Etj.A0U(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw BV4.A0e(e);
            }
        }
    }

    public final List<String> A0B() {
        String str = this.A04;
        int iA08 = C7BY.A08(str, '/', this.A03.length() + 3);
        int i = iA08;
        int length = str.length();
        int i2 = iA08;
        byte[] bArr = AbstractC6843Eav.A06;
        while (true) {
            if (iA08 >= length) {
                break;
            }
            iA08++;
            if (C7BY.A0k("?#", str.charAt(i2))) {
                length = i2;
                break;
            }
            i2 = iA08;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        while (i < length) {
            int i3 = i + 1;
            i = i3;
            while (true) {
                if (i >= length) {
                    i = length;
                    break;
                }
                int i4 = i + 1;
                if (str.charAt(i) != '/') {
                    i = i4;
                }
            }
            arrayListA0h.add(str.substring(i3, i));
        }
        return arrayListA0h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6854EbC) && ((C6854EbC) obj).A04.equals(this.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        return this.A04;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;)V */
    public C6854EbC(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i) {
        AnonymousClass003.A0x(str2, str3);
        C7384Etj.A0Y(str6, 8);
        this.A03 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A02 = str4;
        this.A00 = i;
        this.A09 = list;
        this.A05 = list2;
        this.A01 = str5;
        this.A04 = str6;
        this.A06 = str.equals("https");
    }

    public static final List<String> A03(String str) {
        ArrayList arrayListA0y = C3cI.A0y(str);
        int i = 0;
        while (true) {
            int length = str.length();
            if (i > length) {
                return arrayListA0y;
            }
            String strSubstring = null;
            int iA08 = C7BY.A08(str, '&', i);
            if (iA08 == -1) {
                iA08 = length;
            }
            int iA082 = C7BY.A08(str, '=', i);
            if (iA082 == -1 || iA082 > iA08) {
                arrayListA0y.add(str.substring(i, iA08));
            } else {
                arrayListA0y.add(str.substring(i, iA082));
                strSubstring = str.substring(iA082 + 1, iA08);
            }
            arrayListA0y.add(strSubstring);
            i = iA08 + 1;
        }
    }
}
