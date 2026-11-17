package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC1815ArZ;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.Au3;
import X.BQG;
import X.C1805ArO;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;

/* loaded from: classes3.dex */
public abstract class HatchCardCaretKt {
    public static final int caretAfterFormatting(String str, C1805ArO c1805ArO) {
        boolean zA1a = AnonymousClass002.A1a(str, c1805ArO);
        String strAlphanumericsOnly = HatchCardNetworkKt.alphanumericsOnly(c1805ArO.A01.A00);
        String strAlphanumericsOnly2 = HatchCardNetworkKt.alphanumericsOnly(str);
        int iSignificantCharsBeforeCaret = significantCharsBeforeCaret(c1805ArO);
        String strA17 = BQG.A17(strAlphanumericsOnly, iSignificantCharsBeforeCaret);
        C7384Etj.A0Y(strAlphanumericsOnly2, 0);
        C7384Etj.A0Y(strA17, zA1a ? 1 : 0);
        boolean zStartsWith = strAlphanumericsOnly2.startsWith(strA17);
        int length = strAlphanumericsOnly2.length() - strAlphanumericsOnly.length();
        if (!zStartsWith) {
            iSignificantCharsBeforeCaret += length;
        }
        return offsetPastSignificantChars(str, iSignificantCharsBeforeCaret);
    }

    public static final int offsetPastSignificantChars(String str, int i) {
        if (i <= 0) {
            return 0;
        }
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (HatchCardNetworkKt.isAsciiAlphanumeric(str.charAt(i3)) && (i2 = i2 + 1) == i) {
                return i3 + 1;
            }
        }
        return length;
    }

    public static final int significantCharsBeforeCaret(C1805ArO c1805ArO) {
        String strA17 = BQG.A17(c1805ArO.A01.A00, AnonymousClass002.A09(c1805ArO.A00));
        int i = 0;
        for (int i2 = 0; i2 < strA17.length(); i2++) {
            if (HatchCardNetworkKt.isAsciiAlphanumeric(strA17.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public static final C1805ArO retargetingSeparatorBackspace(C1805ArO c1805ArO, C1805ArO c1805ArO2) {
        int iA09;
        CharSequence charSequenceSubSequence;
        AnonymousClass003.A0u(c1805ArO, c1805ArO2);
        if (Au3.A04(c1805ArO2.A00)) {
            long j = c1805ArO.A00;
            if (Au3.A04(j)) {
                String str = c1805ArO.A01.A00;
                int length = str.length();
                String str2 = c1805ArO2.A01.A00;
                int length2 = str2.length();
                if (length == length2 - 1 && (iA09 = AnonymousClass002.A09(j)) == AnonymousClass002.A09(r2) - 1) {
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (HatchCardNetworkKt.isAsciiAlphanumeric(str.charAt(i2))) {
                            i++;
                        }
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (HatchCardNetworkKt.isAsciiAlphanumeric(str2.charAt(i4))) {
                            i3++;
                        }
                    }
                    if (i == i3) {
                        String strA17 = BQG.A17(str, iA09);
                        int length3 = strA17.length() - 1;
                        if (length3 >= 0) {
                            while (true) {
                                int i5 = length3 - 1;
                                if (HatchCardNetworkKt.isAsciiAlphanumeric(strA17.charAt(length3))) {
                                    int i6 = length3 + 1;
                                    if (i6 < length3) {
                                        throw new IndexOutOfBoundsException(FGI.A0Y("End index (", ") is less than start index (", ").", i6, length3));
                                    }
                                    if (i6 == length3) {
                                        charSequenceSubSequence = str.subSequence(0, length);
                                    } else {
                                        StringBuilder sb = new StringBuilder(length - (i6 - length3));
                                        sb.append((CharSequence) str, 0, length3);
                                        sb.append((CharSequence) str, i6, length);
                                        charSequenceSubSequence = sb;
                                    }
                                    return new C1805ArO(charSequenceSubSequence.toString(), AbstractC1815ArZ.A00(length3, length3));
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                length3 = i5;
                            }
                        }
                    }
                }
            }
        }
        return c1805ArO;
    }
}
