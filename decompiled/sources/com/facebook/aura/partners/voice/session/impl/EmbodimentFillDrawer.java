package com.facebook.aura.partners.voice.session.impl;

import X.Ab3;
import X.BV9;
import X.C60P;
import X.C7384Etj;
import X.G2j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.webrtc.GlRectDrawer;

/* loaded from: classes5.dex */
public final class EmbodimentFillDrawer extends GlRectDrawer {
    public final Function0<Float> focusY;

    public EmbodimentFillDrawer(Function0<Float> function0) {
        C7384Etj.A0Y(function0, 0);
        this.focusY = function0;
    }

    @Override // org.webrtc.GlRectDrawer, org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        C7384Etj.A0Y(fArr, 1);
        if (i2 <= 0 || i3 <= 0 || i6 <= 0 || i7 <= 0) {
            return;
        }
        float f = i2;
        float f2 = i3;
        float fMax = Math.max(i6 / f, i7 / f2);
        int iA02 = Ab3.A02(f, fMax);
        if (iA02 < 1) {
            iA02 = 1;
        }
        int iA022 = Ab3.A02(f2, fMax);
        if (iA022 < 1) {
            iA022 = 1;
        }
        super.drawOes(i, fArr, i2, i3, i4 + ((i6 - iA02) / 2), BV9.A00(this, i5, i7, iA022), iA02, iA022);
    }

    @Override // org.webrtc.GlRectDrawer, org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        C7384Etj.A0Y(fArr, 1);
        if (i2 <= 0 || i3 <= 0 || i6 <= 0 || i7 <= 0) {
            return;
        }
        float f = i2;
        float f2 = i3;
        float fMax = Math.max(i6 / f, i7 / f2);
        int iA02 = Ab3.A02(f, fMax);
        if (iA02 < 1) {
            iA02 = 1;
        }
        int iA022 = Ab3.A02(f2, fMax);
        if (iA022 < 1) {
            iA022 = 1;
        }
        super.drawRgb(i, fArr, i2, i3, i4 + ((i6 - iA02) / 2), BV9.A00(this, i5, i7, iA022), iA02, iA022);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // org.webrtc.GlRectDrawer, org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        ?? A1Y = C60P.A1Y(iArr, fArr);
        if (i <= 0 || i2 <= 0 || i5 <= 0 || i6 <= 0) {
            return;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(i5 / f, i6 / f2);
        int iA02 = Ab3.A02(f, fMax);
        if (iA02 < A1Y) {
            iA02 = 1;
        }
        int iA022 = Ab3.A02(f2, fMax);
        if (iA022 < A1Y) {
            iA022 = 1;
        }
        super.drawYuv(iArr, fArr, i, i2, i3 + ((i5 - iA02) / 2), BV9.A00(this, i4, i6, iA022), iA02, iA022);
    }

    private final void drawFill(int i, int i2, int i3, int i4, int i5, int i6, G2j<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> g2j) {
        if (i <= 0 || i2 <= 0 || i5 <= 0 || i6 <= 0) {
            return;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(i5 / f, i6 / f2);
        int iA02 = Ab3.A02(f, fMax);
        if (iA02 < 1) {
            iA02 = 1;
        }
        int iA022 = Ab3.A02(f2, fMax);
        if (iA022 < 1) {
            iA022 = 1;
        }
        g2j.invoke(Integer.valueOf(i3 + ((i5 - iA02) / 2)), Integer.valueOf(BV9.A00(this, i4, i6, iA022)), Integer.valueOf(iA02), Integer.valueOf(iA022));
    }
}
