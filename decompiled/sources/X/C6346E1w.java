package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;

/* renamed from: X.E1w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6346E1w {
    public static final int A0L;
    public static final int A0M = A00(2, 2, 2, 0);
    public static final int[] A0N;
    public static final int[] A0O;
    public static final int[] A0P;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public int A0I;
    public final List<SpannableString> A0K = C3cG.A0h();
    public final SpannableStringBuilder A0J = new SpannableStringBuilder();

    static {
        int iA00 = A00(0, 0, 0, 0);
        A0L = iA00;
        int iA002 = A00(0, 0, 0, 3);
        A0P = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0O = new int[]{iA00, iA002, iA00, iA00, iA002, iA00, iA00};
        A0N = new int[]{iA00, iA00, iA00, iA00, iA00, iA002, iA002};
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(int r5, int r6, int r7, int r8) {
        /*
            r4 = 0
            r0 = 4
            X.C1G.A03(r5, r0)
            X.C1G.A03(r6, r0)
            X.C1G.A03(r7, r0)
            X.C1G.A03(r8, r0)
            r3 = 1
            if (r8 == 0) goto L1a
            if (r8 == r3) goto L1a
            r0 = 2
            if (r8 == r0) goto L2f
            r0 = 3
            r2 = 0
            if (r8 == r0) goto L1c
        L1a:
            r2 = 255(0xff, float:3.57E-43)
        L1c:
            r1 = 0
            if (r5 <= r3) goto L21
            r1 = 255(0xff, float:3.57E-43)
        L21:
            r0 = 0
            if (r6 <= r3) goto L26
            r0 = 255(0xff, float:3.57E-43)
        L26:
            if (r7 <= r3) goto L2a
            r4 = 255(0xff, float:3.57E-43)
        L2a:
            int r0 = android.graphics.Color.argb(r2, r1, r0, r4)
            return r0
        L2f:
            r2 = 127(0x7f, float:1.78E-43)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6346E1w.A00(int, int, int, int):int");
    }

    public static final SpannableString A01(C6346E1w c6346E1w) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c6346E1w.A0J);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (c6346E1w.A04 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), c6346E1w.A04, length, 33);
            }
            if (c6346E1w.A0A != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), c6346E1w.A0A, length, 33);
            }
            if (c6346E1w.A02 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(c6346E1w.A0I), c6346E1w.A02, length, 33);
            }
            if (c6346E1w.A01 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(c6346E1w.A0H), c6346E1w.A01, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A02() {
        this.A0K.clear();
        this.A0J.clear();
        this.A04 = -1;
        this.A0A = -1;
        this.A02 = -1;
        this.A01 = -1;
        this.A08 = 0;
        this.A0E = false;
        this.A0G = false;
        this.A07 = 4;
        this.A0F = false;
        this.A0B = 0;
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = 15;
        this.A05 = 0;
        this.A0D = 0;
        this.A06 = 0;
        int i = A0L;
        this.A0C = i;
        this.A0I = A0M;
        this.A0H = i;
    }

    public final void A03(char c) {
        if (c != '\n') {
            this.A0J.append(c);
            return;
        }
        List<SpannableString> list = this.A0K;
        list.add(A01(this));
        this.A0J.clear();
        if (this.A04 != -1) {
            this.A04 = 0;
        }
        if (this.A0A != -1) {
            this.A0A = 0;
        }
        if (this.A02 != -1) {
            this.A02 = 0;
        }
        if (this.A01 != -1) {
            this.A01 = 0;
        }
        while (true) {
            if (list.size() < this.A09 && list.size() < 15) {
                this.A08 = list.size();
                return;
            }
            list.remove(0);
        }
    }

    public final void A04(int i, int i2) {
        int i3;
        int i4;
        if (this.A02 != -1 && (i4 = this.A0I) != i) {
            SpannableStringBuilder spannableStringBuilder = this.A0J;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), this.A02, spannableStringBuilder.length(), 33);
        }
        if (i != A0M) {
            this.A02 = this.A0J.length();
            this.A0I = i;
        }
        if (this.A01 != -1 && (i3 = this.A0H) != i2) {
            SpannableStringBuilder spannableStringBuilder2 = this.A0J;
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(i3), this.A01, spannableStringBuilder2.length(), 33);
        }
        if (i2 != A0L) {
            this.A01 = this.A0J.length();
            this.A0H = i2;
        }
    }

    public C6346E1w() {
        A02();
    }
}
