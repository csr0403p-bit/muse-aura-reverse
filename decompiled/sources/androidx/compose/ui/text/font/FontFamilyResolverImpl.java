package androidx.compose.ui.text.font;

import X.AbstractC1996Aw5;
import X.AnonymousClass002;
import X.AzI;
import X.Azu;
import X.B0J;
import X.B0K;
import X.B8y;
import X.B97;
import X.B98;
import X.B99;
import X.B9D;
import X.B9E;
import X.B9F;
import X.BNK;
import X.BT9;
import X.C1600AmS;
import X.C1736ApY;
import X.C1847AsK;
import X.C1BO;
import X.C2005AwE;
import X.C2148Aza;
import X.C2297BSx;
import X.C2K7;
import X.C3cG;
import X.C6ys;
import X.C7384Etj;
import X.C7523EzA;
import X.G0U;
import X.InterfaceC2149Azb;
import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class FontFamilyResolverImpl implements C2K7 {
    public final B8y A00;
    public final B9D A01;
    public final B98 A02;
    public final B9F A03;
    public final B97 A04;
    public final G0U<B0J, Object> A05;

    @Override // X.C2K7
    public final C1BO<Object> AbY(AbstractC1996Aw5 abstractC1996Aw5, C1736ApY c1736ApY, int i, int i2) {
        C1736ApY c1736ApY2 = c1736ApY;
        int i3 = ((C1600AmS) this.A03).A00;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            int i4 = c1736ApY.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = 1000;
            }
            c1736ApY2 = new C1736ApY(i4);
        }
        return A00(this, new B0J(abstractC1996Aw5, c1736ApY2, null, i, i2));
    }

    public /* synthetic */ FontFamilyResolverImpl(B98 b98, B9F b9f) {
        B97 b97 = B99.A01;
        B8y b8y = new B8y(B99.A00, C6ys.A00);
        B9D b9d = new B9D();
        this.A02 = b98;
        this.A03 = b9f;
        this.A04 = b97;
        this.A00 = b8y;
        this.A01 = b9d;
        this.A05 = C2297BSx.A00(this, 36);
    }

    public static final B9E A00(FontFamilyResolverImpl fontFamilyResolverImpl, B0J b0j) {
        B9E b9eA02;
        Typeface typefaceCreate;
        B97 b97 = fontFamilyResolverImpl.A04;
        BNK bnk = b97.A01;
        synchronized (bnk) {
            C7523EzA<B0J, B9E> c7523EzA = b97.A00;
            b9eA02 = c7523EzA.A02(b0j);
            if (b9eA02 != null) {
                if (!b9eA02.ADA()) {
                    c7523EzA.A04(b0j);
                }
            }
            try {
                b9eA02 = fontFamilyResolverImpl.A00.A00(fontFamilyResolverImpl.A02, b0j, new BT9(21, b0j, b97), fontFamilyResolverImpl.A05);
                if (b9eA02 == null) {
                    B9D b9d = fontFamilyResolverImpl.A01;
                    AbstractC1996Aw5 abstractC1996Aw5 = b0j.A02;
                    if (abstractC1996Aw5 == null || (abstractC1996Aw5 instanceof C2148Aza)) {
                        C1736ApY c1736ApY = b0j.A03;
                        int i = b0j.A00;
                        typefaceCreate = (i == 0 && C7384Etj.areEqual(c1736ApY, C1736ApY.A04)) ? Typeface.DEFAULT : Typeface.create(Typeface.DEFAULT, c1736ApY.A00, AnonymousClass002.A1Q(i, 1));
                    } else if (abstractC1996Aw5 instanceof C1847AsK) {
                        typefaceCreate = b9d.A00.A7v(b0j.A03, (C1847AsK) abstractC1996Aw5, b0j.A00);
                    } else {
                        if (!(abstractC1996Aw5 instanceof C2005AwE)) {
                            throw C3cG.A0Q("Could not load font");
                        }
                        Azu azu = ((C2005AwE) abstractC1996Aw5).A00;
                        C7384Etj.A0Z(azu, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                        typefaceCreate = ((AzI) ((InterfaceC2149Azb) azu)).A00;
                    }
                    b9eA02 = new B0K(typefaceCreate, true);
                }
                synchronized (bnk) {
                    if (c7523EzA.A02(b0j) == null && b9eA02.ADA()) {
                        c7523EzA.A05(b0j, b9eA02);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return b9eA02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    @Override // X.C2K7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AYM(X.AbstractC1996Aw5 r20, X.HtJ<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.AYM(X.Aw5, X.HtJ):java.lang.Object");
    }
}
