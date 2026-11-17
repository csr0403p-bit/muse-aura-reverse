package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* renamed from: X.E0l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6313E0l implements InterfaceC6304E0a {
    public final int A00;
    public final int A01;
    public final float A02;
    public final int A03;
    public final E1P A04 = BV6.A0X();
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            if (r7 == r8) goto L2b
            r5 = r11 | 33
            r0 = r7 & 1
            r4 = 0
            r1 = 1
            boolean r3 = X.AnonymousClass002.A1L(r0)
            r0 = r7 & 2
            boolean r2 = X.AnonymousClass002.A1L(r0)
            if (r3 == 0) goto L36
            if (r2 == 0) goto L17
            r1 = 3
        L17:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r6.setSpan(r0, r9, r10, r5)
        L1f:
            r0 = r7 & 4
            if (r0 == 0) goto L2c
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L28:
            r6.setSpan(r0, r9, r10, r5)
        L2b:
            return
        L2c:
            if (r3 != 0) goto L2b
            if (r2 != 0) goto L2b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L28
        L36:
            if (r2 == 0) goto L1f
            r1 = 2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6313E0l.A00(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    @Override // X.InterfaceC6304E0a
    public final void AXd(InterfaceC5344Dgn interfaceC5344Dgn, E03 e03, byte[] bArr, int i, int i2) {
        String strA0M;
        ImmutableList immutableListOf;
        E1P e1p = this.A04;
        e1p.A0T(bArr, i2 + i);
        e1p.A0R(i);
        C1G.A07(BV5.A1P(e1p.A04(), 2));
        int iA0D = e1p.A0D();
        if (iA0D == 0) {
            strA0M = "";
        } else {
            int i3 = e1p.A01;
            Charset charsetA0N = e1p.A0N();
            int i4 = iA0D - (e1p.A01 - i3);
            if (charsetA0N == null) {
                charsetA0N = StandardCharsets.UTF_8;
            }
            strA0M = e1p.A0M(charsetA0N, i4);
        }
        if (strA0M.isEmpty()) {
            immutableListOf = ImmutableList.of();
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA0M);
            int i5 = this.A01;
            A00(spannableStringBuilder, i5, 0, 0, spannableStringBuilder.length(), 16711680);
            int i6 = this.A00;
            int length = spannableStringBuilder.length();
            if (i6 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.A05;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float fA01 = this.A02;
            while (e1p.A04() >= 8) {
                int i7 = e1p.A01;
                int iA05 = e1p.A05();
                int iA052 = e1p.A05();
                if (iA052 == 1937013100) {
                    C1G.A07(e1p.A04() >= 2);
                    int iA0D2 = e1p.A0D();
                    for (int i8 = 0; i8 < iA0D2; i8++) {
                        C1G.A07(BV5.A1P(e1p.A04(), 12));
                        int iA0D3 = e1p.A0D();
                        int iA0D4 = e1p.A0D();
                        int iA06 = BV6.A06(e1p, 2);
                        e1p.A0S(1);
                        int iA053 = e1p.A05();
                        if (iA0D4 > spannableStringBuilder.length()) {
                            CNC.A04("Tx3gParser", FGI.A0Y("Truncating styl end (", ") to cueText.length() (", ").", iA0D4, spannableStringBuilder.length()));
                            iA0D4 = spannableStringBuilder.length();
                        }
                        if (iA0D3 >= iA0D4) {
                            CNC.A04("Tx3gParser", FGI.A0Y("Ignoring styl with start (", ") >= end (", ").", iA0D3, iA0D4));
                        } else {
                            A00(spannableStringBuilder, iA06, i5, iA0D3, iA0D4, 0);
                            if (iA053 != i6) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan((iA053 >>> 8) | ((iA053 & 255) << 24)), iA0D3, iA0D4, 33);
                            }
                        }
                    }
                } else if (iA052 == 1952608120 && this.A06) {
                    C1G.A07(e1p.A04() >= 2);
                    fA01 = BV7.A01(e1p.A0D() / this.A03, 0.95f, 0.0f);
                }
                e1p.A0R(i7 + iA05);
            }
            immutableListOf = ImmutableList.of(new E0J(null, null, null, spannableStringBuilder, fA01, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, -16777216, Integer.MIN_VALUE, 0, false));
        }
        InterfaceC5344Dgn.A00(interfaceC5344Dgn, immutableListOf);
    }

    public C6313E0l(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.A00 = -1;
            this.A05 = "sans-serif";
            this.A02 = 0.85f;
            this.A03 = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.A01 = bArr[24];
        this.A00 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | BV6.A0D(bArr, 28) | (bArr[29] & 255);
        this.A05 = "Serif".equals(BV4.A0n(StandardCharsets.UTF_8, bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.A03 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.A06 = z;
        if (z) {
            this.A02 = BV7.A01(((bArr[11] & 255) | BV6.A0D(bArr, 10)) / i, 0.95f, 0.0f);
        } else {
            this.A02 = 0.85f;
        }
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }
}
