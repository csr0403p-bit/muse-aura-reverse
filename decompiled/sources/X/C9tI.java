package X;

import android.view.inputmethod.ExtractedText;
import com.facebook.forker.Process;

/* renamed from: X.9tI, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tI extends C9tJ {
    public static final Integer A0r(String str) {
        boolean z;
        int i;
        int i2;
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char cCharAt = str.charAt(0);
            int i4 = Process.WAIT_RESULT_STOPPED;
            if (cCharAt < '0') {
                i = 1;
                if (length != 1) {
                    if (cCharAt == '+') {
                        z = false;
                    } else if (cCharAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    }
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int iDigit = Character.digit((int) str.charAt(i), 10);
                if (iDigit >= 0 && ((i3 >= i5 || (i5 == -59652323 && i3 >= (i5 = i4 / 10))) && (i2 = i3 * 10) >= i4 + iDigit)) {
                    i3 = i2 - iDigit;
                    i++;
                }
            }
            return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[PHI: r12
  0x0055: PHI (r12v2 long) = (r12v1 long), (r12v3 long) binds: [B:18:0x0046, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long A0s(java.lang.String r18) {
        /*
            r0 = 0
            r11 = r18
            X.C7384Etj.A0Y(r11, r0)
            r10 = 10
            int r9 = r11.length()
            r18 = 0
            if (r9 == 0) goto L54
            r8 = 0
            char r1 = r11.charAt(r0)
            r0 = 48
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 >= r0) goto L64
            r7 = 1
            if (r9 == r7) goto L54
            r0 = 43
            if (r1 == r0) goto L63
            r0 = 45
            if (r1 != r0) goto L54
            r16 = -9223372036854775808
            r8 = 1
        L2c:
            r14 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r5 = 0
            r12 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L38:
            if (r8 >= r9) goto L66
            char r0 = r11.charAt(r8)
            int r2 = java.lang.Character.digit(r0, r10)
            if (r2 < 0) goto L54
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L54
            r0 = 10
            long r12 = r16 / r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L55
        L54:
            return r18
        L55:
            r0 = 10
            long r5 = r5 * r0
            long r3 = (long) r2
            long r1 = r16 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L54
            long r5 = r5 - r3
            int r8 = r8 + 1
            goto L38
        L63:
            r8 = 1
        L64:
            r7 = 0
            goto L2c
        L66:
            if (r7 == 0) goto L6d
            java.lang.Long r18 = java.lang.Long.valueOf(r5)
            return r18
        L6d:
            long r0 = -r5
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9tI.A0s(java.lang.String):java.lang.Long");
    }

    public static final void A0u(String str) {
        throw new NumberFormatException(FGI.A0N("Invalid number format: '", str, '\''));
    }

    public static void A0t(ExtractedText extractedText, CharSequence charSequence, long j) {
        extractedText.selectionStart = Au3.A02(j);
        extractedText.selectionEnd = Au3.A01(j);
        extractedText.flags = !C7BY.A0k(charSequence, '\n') ? 1 : 0;
    }
}
