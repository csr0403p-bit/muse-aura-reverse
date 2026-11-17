package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: X.7kj, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7kj {
    public static final Pattern A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static final boolean A02(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt((length - 1) - i2) - '0';
            if (i2 % 2 != 0 && (iCharAt = iCharAt * 2) > 9) {
                iCharAt -= 9;
            }
            i += iCharAt;
        }
        return i % 10 == 0;
    }

    static {
        String strA0U = FGI.A0U("3|", C7ki.A02.prefixMatchRegexPattern.pattern(), "[\\d]*");
        String strA0U2 = FGI.A0U("6|60|601|64|62|622|622[19]|62212|62292|65|652|6521|653|6531|", C7ki.A03.prefixMatchRegexPattern.pattern(), "[\\d]*");
        String strA0U3 = FGI.A0U("3|35|352|", C7ki.A04.prefixMatchRegexPattern.pattern(), "[\\d]*");
        String strA0U4 = FGI.A0U("5|2|2[2-7]|22[2-9]|27[0-2]|", C7ki.A05.prefixMatchRegexPattern.pattern(), "[\\d]*");
        String strA0U5 = FGI.A0U("5|50|508|6|65|652|6521|653|6530|6531|60|", C7ki.A06.prefixMatchRegexPattern.pattern(), "[\\d]*");
        String strA0M = FGI.A0M(C7ki.A08.prefixMatchRegexPattern.pattern(), "[\\d]*");
        A00 = Pattern.compile(strA0U);
        A01 = Pattern.compile(strA0U2);
        A02 = Pattern.compile(strA0U3);
        A03 = Pattern.compile(strA0U4);
        A04 = Pattern.compile(strA0U5);
        A05 = Pattern.compile(strA0M);
    }

    public static final C7ki A00(String str) {
        if (str != null && str.length() != 0) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (C7ki c7ki : C7ki.values()) {
                if (c7ki != C7ki.A07) {
                    arrayListA0h.add(c7ki);
                }
            }
            String strA03 = C06827l3.A02("[^\\d+]").A03(str, "");
            if (strA03.length() != 0) {
                String strA032 = C06827l3.A02("[^\\d+]").A03(strA03, "");
                C7ki c7ki2 = C7ki.A08;
                if (arrayListA0h.contains(c7ki2) && A01(strA032, A05)) {
                    return c7ki2;
                }
                C7ki c7ki3 = C7ki.A05;
                if (arrayListA0h.contains(c7ki3) && A01(strA032, A03)) {
                    return c7ki3;
                }
                C7ki c7ki4 = C7ki.A02;
                if (arrayListA0h.contains(c7ki4) && A01(strA032, A00)) {
                    return c7ki4;
                }
                C7ki c7ki5 = C7ki.A04;
                if (arrayListA0h.contains(c7ki5) && A01(strA032, A02)) {
                    return c7ki5;
                }
                C7ki c7ki6 = C7ki.A03;
                if (arrayListA0h.contains(c7ki6) && A01(strA032, A01)) {
                    return c7ki6;
                }
                C7ki c7ki7 = C7ki.A06;
                if (arrayListA0h.contains(c7ki7) && A01(strA032, A04)) {
                    return c7ki7;
                }
            }
        }
        return C7ki.A07;
    }

    public static boolean A01(CharSequence charSequence, Pattern pattern) {
        C7384Etj.A0V(pattern);
        return pattern.matcher(charSequence).matches();
    }
}
