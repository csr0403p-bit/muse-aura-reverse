package com.facebook.aura.markdown.render;

import X.AT3;
import X.ATD;
import X.AnonymousClass003;
import X.ApQ;
import X.C06H;
import X.C0zF;
import X.C1733ApU;
import X.C1778Aqa;
import X.C1956Auv;
import X.C1957Auw;
import X.C1958Aux;
import X.C1960Auz;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import android.graphics.DashPathEffect;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AuraDottedUnderline {
    public static final int $stable = 8;
    public static final String ANNOTATION_TAG = "DOTTED_UNDERLINE";
    public static final Companion Companion = new Companion();
    public final float baselineOffset;
    public C0zF dashEffect;
    public float dashEffectDensity;
    public final float dashWidth;
    public final float gapWidth;
    public C1958Aux layoutResult;
    public final float strokeWidth;

    /* renamed from: drawAll-4WTKRHQ$fbandroid_express_aura_java_com_facebook_aura_markdown_render_render, reason: not valid java name */
    public final void m1358xd7e5825f(AT3 at3, long j) {
        C7384Etj.A0Y(at3, 0);
        C1958Aux c1958Aux = this.layoutResult;
        if (c1958Aux != null) {
            ApQ apQ = c1958Aux.A04.A03;
            List<C1733ApU<String>> listA05 = apQ.A05(ANNOTATION_TAG, 0, apQ.length());
            if (listA05.isEmpty()) {
                return;
            }
            C0zF c0zFDashPathEffect = dashPathEffect(at3);
            float fAh4 = at3.Ah4(this.strokeWidth);
            float fAh42 = at3.Ah4(this.baselineOffset);
            Iterator<C1733ApU<String>> it = listA05.iterator();
            while (it.hasNext()) {
                m1357drawww6aTOc(at3, it.next(), c1958Aux, j, c0zFDashPathEffect, fAh4, fAh42);
            }
        }
    }

    /* renamed from: drawRanges-bw27NRU$fbandroid_express_aura_java_com_facebook_aura_markdown_render_render, reason: not valid java name */
    public final void m1359xaa5a628c(AT3 at3, long j, List<C1733ApU<String>> list) {
        AnonymousClass003.A0v(at3, list);
        C1958Aux c1958Aux = this.layoutResult;
        if (c1958Aux == null || list.isEmpty()) {
            return;
        }
        C0zF c0zFDashPathEffect = dashPathEffect(at3);
        float fAh4 = at3.Ah4(this.strokeWidth);
        float fAh42 = at3.Ah4(this.baselineOffset);
        Iterator<C1733ApU<String>> it = list.iterator();
        while (it.hasNext()) {
            m1357drawww6aTOc(at3, it.next(), c1958Aux, j, c0zFDashPathEffect, fAh4, fAh42);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuraDottedUnderline() {
        float f = 0.0f;
        this(f, f, f, f, 15, null);
    }

    private final C0zF dashPathEffect(AT3 at3) {
        C0zF c0zF = this.dashEffect;
        if (c0zF != null && this.dashEffectDensity == at3.AEm()) {
            return c0zF;
        }
        C1778Aqa c1778Aqa = new C1778Aqa(new DashPathEffect(new float[]{at3.Ah4(this.dashWidth), at3.Ah4(this.gapWidth)}, 0.0f));
        this.dashEffect = c1778Aqa;
        this.dashEffectDensity = at3.AEm();
        return c1778Aqa;
    }

    /* renamed from: draw-ww6aTOc, reason: not valid java name */
    private final void m1357drawww6aTOc(AT3 at3, C1733ApU<String> c1733ApU, C1958Aux c1958Aux, long j, C0zF c0zF, float f, float f2) {
        int iA0A;
        int iA04;
        int iA042;
        int iA09;
        int iA092;
        C1956Auv c1956Auv = c1958Aux.A03;
        int i = c1956Auv.A02 - 1;
        if (i < 0 || (iA042 = ATD.A04(c1733ApU.A00, (iA04 = ATD.A04(c1733ApU.A01, 0, (iA0A = c1956Auv.A0A(i, true)))), iA0A)) <= iA04 || (iA09 = c1956Auv.A09(iA04)) > (iA092 = c1956Auv.A09(iA042 - 1))) {
            return;
        }
        while (true) {
            int iMax = Math.max(iA04, c1958Aux.A03(iA09));
            int iMin = Math.min(iA042, c1956Auv.A0A(iA09, true));
            if (iMin > iMax) {
                float fA02 = c1958Aux.A02(iMax, true);
                float fA022 = c1958Aux.A02(iMin, true);
                float fMin = Math.min(fA02, fA022);
                float fMax = Math.max(fA02, fA022);
                if (fMax - fMin >= f) {
                    C1960Auz c1960AuzA02 = C1956Auv.A02(c1956Auv, iA09);
                    float fA023 = ((C1957Auw) c1960AuzA02.A06).A01.A02(iA09 - c1960AuzA02.A03) + c1960AuzA02.A01 + f2;
                    float fA06 = c1956Auv.A06(iA09) - (f / 2.0f);
                    if (fA023 > fA06) {
                        fA023 = fA06;
                    }
                    long jA0P = C8j3.A0P(fMin);
                    long jA0P2 = C8j3.A0P(fA023) & 4294967295L;
                    at3.A9X(null, c0zF, f, 1.0f, 0, 3, j, (jA0P << 32) | jA0P2, jA0P2 | C8j4.A0K(fMax));
                }
            }
            if (iA09 == iA092) {
                return;
            } else {
                iA09++;
            }
        }
    }

    public final C1958Aux getLayoutResult() {
        return this.layoutResult;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void setLayoutResult(C1958Aux c1958Aux) {
        this.layoutResult = c1958Aux;
    }

    public AuraDottedUnderline(float f, float f2, float f3, float f4) {
        this.strokeWidth = f;
        this.dashWidth = f2;
        this.gapWidth = f3;
        this.baselineOffset = f4;
        this.dashEffectDensity = Float.NaN;
    }

    public /* synthetic */ AuraDottedUnderline(float f, float f2, float f3, float f4, C06H c06h) {
        this(f, f2, f3, f4);
    }

    public /* synthetic */ AuraDottedUnderline(float f, float f2, float f3, float f4, int i, C06H c06h) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? 2.0f : f4);
    }
}
