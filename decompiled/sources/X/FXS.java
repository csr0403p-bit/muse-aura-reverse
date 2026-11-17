package X;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class FXS {
    public static final FXS A02;
    public static final FXS A03;
    public static final InterfaceC7910FKh A04;
    public static final String A05;
    public static final String A06;
    public final InterfaceC7910FKh A00;
    public final boolean A01;

    static {
        InterfaceC7910FKh interfaceC7910FKh = AbstractC8200FYr.A01;
        A04 = interfaceC7910FKh;
        A05 = Character.toString('\u200e');
        A06 = Character.toString('\u200f');
        A02 = new FXS(interfaceC7910FKh, false);
        A03 = new FXS(interfaceC7910FKh, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r6 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r5 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        r2 = r5 - 1;
        r1 = r8.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (java.lang.Character.isLowSurrogate(r1) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r1 = java.lang.Character.codePointBefore(r8, r5);
        r5 = r5 - java.lang.Character.charCount(r1);
        r0 = java.lang.Character.getDirectionality(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        switch(r0) {
            case 14: goto L71;
            case 15: goto L71;
            case 16: goto L70;
            case 17: goto L70;
            case 18: goto L69;
            default: goto L76;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r4 != r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (r4 != r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r1 >= '\u0700') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r0 = X.FXW.A00[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r0 = java.lang.Character.getDirectionality(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.CharSequence r8) {
        /*
            byte[] r0 = X.FXW.A00
            int r7 = r8.length()
            r5 = 0
            r4 = 0
            r6 = 0
            r3 = 0
        La:
            r2 = 1
            if (r5 >= r7) goto L52
            if (r4 != 0) goto L56
            char r1 = r8.charAt(r5)
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L42
            int r1 = java.lang.Character.codePointAt(r8, r5)
            int r0 = java.lang.Character.charCount(r1)
            int r5 = r5 + r0
            byte r0 = java.lang.Character.getDirectionality(r1)
        L26:
            if (r0 == 0) goto L97
            if (r0 == r2) goto L93
            r1 = 2
            if (r0 == r1) goto L93
            r1 = 9
            if (r0 == r1) goto La
            switch(r0) {
                case 14: goto L3e;
                case 15: goto L3e;
                case 16: goto L3a;
                case 17: goto L3a;
                case 18: goto L36;
                default: goto L34;
            }
        L34:
            r4 = r3
            goto La
        L36:
            int r3 = r3 + (-1)
            r6 = 0
            goto La
        L3a:
            int r3 = r3 + 1
            r6 = 1
            goto La
        L3e:
            int r3 = r3 + 1
            r6 = -1
            goto La
        L42:
            int r5 = r5 + 1
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L4d
            byte[] r0 = X.FXW.A00
            r0 = r0[r1]
            goto L26
        L4d:
            byte r0 = java.lang.Character.getDirectionality(r1)
            goto L26
        L52:
            if (r4 != 0) goto L56
        L54:
            r6 = 0
            return r6
        L56:
            if (r6 == 0) goto L59
            return r6
        L59:
            if (r5 <= 0) goto L54
            int r2 = r5 + (-1)
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L84
            int r1 = java.lang.Character.codePointBefore(r8, r5)
            int r0 = java.lang.Character.charCount(r1)
            int r5 = r5 - r0
            byte r0 = java.lang.Character.getDirectionality(r1)
        L74:
            switch(r0) {
                case 14: goto L7e;
                case 15: goto L7e;
                case 16: goto L7b;
                case 17: goto L7b;
                case 18: goto L78;
                default: goto L77;
            }
        L77:
            goto L59
        L78:
            int r3 = r3 + 1
            goto L59
        L7b:
            if (r4 != r3) goto L81
            goto L95
        L7e:
            if (r4 != r3) goto L81
            goto L99
        L81:
            int r3 = r3 + (-1)
            goto L59
        L84:
            r5 = r2
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L8e
            byte[] r0 = X.FXW.A00
            r0 = r0[r1]
            goto L74
        L8e:
            byte r0 = java.lang.Character.getDirectionality(r1)
            goto L74
        L93:
            if (r3 != 0) goto L34
        L95:
            r6 = 1
            return r6
        L97:
            if (r3 != 0) goto L34
        L99:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXS.A00(java.lang.CharSequence):int");
    }

    public static int A01(CharSequence charSequence) {
        byte directionality;
        byte[] bArr = FXW.A00;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (length > 0) {
            char cCharAt = charSequence.charAt(length - 1);
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, length);
                length -= Character.charCount(iCodePointBefore);
                directionality = Character.getDirectionality(iCodePointBefore);
            } else {
                length--;
                directionality = cCharAt < '\u0700' ? FXW.A00[cCharAt] : Character.getDirectionality(cCharAt);
            }
            if (directionality != 0) {
                if (directionality == 1 || directionality == 2) {
                    if (i == 0) {
                        return 1;
                    }
                } else if (directionality != 9) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                i2 = i;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder A02(X.FXS r6, X.InterfaceC7910FKh r7, java.lang.CharSequence r8) {
        /*
            if (r8 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r4 = 0
            int r0 = r8.length()
            boolean r5 = r7.AOx(r8, r4, r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            if (r5 == 0) goto L85
            X.FKh r1 = X.AbstractC8200FYr.A05
        L16:
            int r0 = r8.length()
            boolean r0 = r1.AOx(r8, r4, r0)
            boolean r3 = r6.A01
            if (r3 != 0) goto L76
            if (r0 != 0) goto L2b
            int r1 = A00(r8)
            r0 = 1
            if (r1 != r0) goto L82
        L2b:
            java.lang.String r0 = X.FXS.A05
        L2d:
            r2.append(r0)
            if (r5 == r3) goto L72
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r5 == 0) goto L38
            r0 = 8235(0x202b, float:1.154E-41)
        L38:
            r2.append(r0)
            r2.append(r8)
            r0 = 8236(0x202c, float:1.1541E-41)
            r2.append(r0)
        L43:
            if (r5 == 0) goto L6f
            X.FKh r1 = X.AbstractC8200FYr.A05
        L47:
            int r0 = r8.length()
            boolean r0 = r1.AOx(r8, r4, r0)
            if (r3 != 0) goto L60
            if (r0 != 0) goto L5a
            int r1 = A01(r8)
            r0 = 1
            if (r1 != r0) goto L6c
        L5a:
            java.lang.String r0 = X.FXS.A05
        L5c:
            r2.append(r0)
            return r2
        L60:
            if (r0 == 0) goto L69
            int r1 = A01(r8)
            r0 = -1
            if (r1 != r0) goto L6c
        L69:
            java.lang.String r0 = X.FXS.A06
            goto L5c
        L6c:
            java.lang.String r0 = ""
            goto L5c
        L6f:
            X.FKh r1 = X.AbstractC8200FYr.A04
            goto L47
        L72:
            r2.append(r8)
            goto L43
        L76:
            if (r0 == 0) goto L7f
            int r1 = A00(r8)
            r0 = -1
            if (r1 != r0) goto L82
        L7f:
            java.lang.String r0 = X.FXS.A06
            goto L2d
        L82:
            java.lang.String r0 = ""
            goto L2d
        L85:
            X.FKh r1 = X.AbstractC8200FYr.A04
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXS.A02(X.FXS, X.FKh, java.lang.CharSequence):android.text.SpannableStringBuilder");
    }

    public final String A04(String str) {
        InterfaceC7910FKh interfaceC7910FKh = this.A00;
        if (str == null) {
            return null;
        }
        return A02(this, interfaceC7910FKh, str).toString();
    }

    public FXS(InterfaceC7910FKh interfaceC7910FKh, boolean z) {
        this.A01 = z;
        this.A00 = interfaceC7910FKh;
    }

    public static FXS A03() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? A03 : A02;
    }
}
