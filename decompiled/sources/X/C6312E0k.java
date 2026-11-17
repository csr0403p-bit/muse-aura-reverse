package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E0k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6312E0k {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final StringBuilder A05;
    public final List<C6311E0j> A06;
    public final List<SpannableString> A07;

    public static SpannableString A00(C6312E0k c6312E0k) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c6312E0k.A05);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            List<C6311E0j> list = c6312E0k.A06;
            if (i >= list.size()) {
                break;
            }
            C6311E0j c6311E0j = list.get(i);
            boolean z2 = c6311E0j.A02;
            int i7 = c6311E0j.A01;
            if (i7 != 8) {
                z = true;
                if (i7 != 7) {
                    z = false;
                    if (i7 != 7) {
                        i6 = E0N.A0O[i7];
                    }
                }
            }
            int i8 = c6311E0j.A00;
            i++;
            if (i8 != (i < list.size() ? list.get(i).A00 : length)) {
                if (i2 != -1) {
                    if (!z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                        i2 = -1;
                    }
                } else if (z2) {
                    i2 = i8;
                }
                if (i3 != -1) {
                    if (!z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                        i3 = -1;
                    }
                } else if (z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E0J A01(int r24) {
        /*
            r23 = this;
            r1 = r24
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            r3 = 0
        L8:
            r7 = r23
            java.util.List<android.text.SpannableString> r2 = r7.A07
            int r0 = r2.size()
            if (r3 >= r0) goto L23
            java.lang.Object r0 = r2.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            r0 = 10
            r10.append(r0)
            int r3 = r3 + 1
            goto L8
        L23:
            android.text.SpannableString r0 = A00(r7)
            r10.append(r0)
            int r0 = r10.length()
            if (r0 != 0) goto L32
            r6 = 0
            return r6
        L32:
            int r9 = r7.A02
            int r0 = r7.A04
            int r9 = r9 + r0
            int r8 = 32 - r9
            int r0 = r10.length()
            int r8 = r8 - r0
            int r4 = r9 - r8
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2
            r2 = 1
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L9d
        L48:
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            r0 = 1107296256(0x42000000, float:32.0)
            if (r1 != r6) goto L54
            int r9 = 32 - r8
        L54:
            float r12 = (float) r9
            float r12 = r12 / r0
            float r12 = r12 * r4
            float r12 = r12 + r5
        L58:
            int r4 = r7.A03
            r0 = 7
            if (r4 <= r0) goto L81
            int r4 = r4 + (-17)
        L5f:
            r7 = 0
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r11 = (float) r4
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r23 = 0
            r21 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r16 = 0
            X.E0J r6 = new X.E0J
            r9 = r7
            r14 = r13
            r15 = r13
            r20 = r3
            r22 = r3
            r24 = r23
            r19 = r1
            r18 = r3
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r6
        L81:
            int r0 = r7.A00
            if (r0 != r2) goto L5f
            int r0 = r7.A01
            int r0 = r0 - r2
            int r4 = r4 - r0
            goto L5f
        L8a:
            int r0 = r7.A00
            if (r0 != r6) goto L9a
            int r1 = java.lang.Math.abs(r4)
            r0 = 3
            if (r1 < r0) goto L9c
            if (r8 < 0) goto L9c
            r1 = 2
            if (r4 > 0) goto L48
        L9a:
            r1 = 0
            goto L48
        L9c:
            r1 = 1
        L9d:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6312E0k.A01(int):X.E0J");
    }

    public final void A02() {
        StringBuilder sb = this.A05;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        List<C6311E0j> list = this.A06;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (list.get(size).A00 != length) {
                return;
            } else {
                r1.A00--;
            }
        }
    }

    public C6312E0k(int i, int i2) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A06 = arrayListA0h;
        this.A07 = C3cG.A0h();
        this.A05 = C60O.A0w();
        this.A00 = i;
        arrayListA0h.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
        this.A01 = i2;
    }
}
