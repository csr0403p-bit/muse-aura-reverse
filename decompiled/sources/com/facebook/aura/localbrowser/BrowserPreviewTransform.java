package com.facebook.aura.localbrowser;

import X.AFs;
import X.AGE;
import X.ATD;
import X.AWx;
import X.AbstractC0871AFr;
import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BL4;
import X.C00q;
import X.C06H;
import X.C1bi;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.facebook.aura.localbrowser.BrowserPreviewTransform;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class BrowserPreviewTransform {
    public static final Companion Companion = new Companion();
    public boolean adjusted;
    public final boolean fillOnReset;
    public final long imageSize;
    public final MutableState offset$delegate;
    public final MutableState viewport$delegate;
    public final C00q zoom$delegate;

    public final class Companion {
        public static final List createSaver$lambda$0(C1bi c1bi, BrowserPreviewTransform browserPreviewTransform) {
            C7384Etj.A0Y(browserPreviewTransform, 1);
            long j = browserPreviewTransform.imageSize;
            return Arrays.asList(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) (j & 4294967295L)), Boolean.valueOf(browserPreviewTransform.fillOnReset), Integer.valueOf((int) (browserPreviewTransform.m1197getViewportYbymL2g() >> 32)), Integer.valueOf((int) (browserPreviewTransform.m1197getViewportYbymL2g() & 4294967295L)), Float.valueOf(browserPreviewTransform.zoom$delegate.AFn()), Float.valueOf(AnonymousClass001.A00(AWx.A07(browserPreviewTransform.offset$delegate))), Float.valueOf(AnonymousClass001.A01(4294967295L, AWx.A07(browserPreviewTransform.offset$delegate))), Boolean.valueOf(browserPreviewTransform.adjusted));
        }

        public static final BrowserPreviewTransform createSaver$lambda$1(List list) {
            C7384Etj.A0Y(list, 0);
            Object obj = list.get(0);
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Int");
            int iA0F = AnonymousClass001.A0F(obj);
            C7384Etj.A0Z(C8j4.A0q(list), "null cannot be cast to non-null type kotlin.Int");
            long jA0F = (iA0F << 32) | (AnonymousClass001.A0F(r0) & 4294967295L);
            Object obj2 = list.get(2);
            C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            BrowserPreviewTransform browserPreviewTransform = new BrowserPreviewTransform(jA0F, AnonymousClass001.A1X(obj2));
            Object obj3 = list.get(3);
            C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iA0F2 = AnonymousClass001.A0F(obj3);
            Object obj4 = list.get(4);
            C7384Etj.A0Z(obj4, "null cannot be cast to non-null type kotlin.Int");
            browserPreviewTransform.m1199setViewportozmzZPI(C8j3.A0R(iA0F2, AnonymousClass001.A0F(obj4)));
            Object obj5 = list.get(5);
            String strA00 = AbstractC7606F5t.A00(1);
            C7384Etj.A0Z(obj5, strA00);
            browserPreviewTransform.setZoom(AnonymousClass001.A02(obj5));
            Object obj6 = list.get(6);
            C7384Etj.A0Z(obj6, strA00);
            float fA02 = AnonymousClass001.A02(obj6);
            Object obj7 = list.get(7);
            C7384Etj.A0Z(obj7, strA00);
            browserPreviewTransform.m1198setOffsetk4lQ0M(AnonymousClass005.A0M(fA02, AnonymousClass001.A02(obj7)));
            Object obj8 = list.get(8);
            C7384Etj.A0Z(obj8, "null cannot be cast to non-null type kotlin.Boolean");
            browserPreviewTransform.adjusted = AnonymousClass001.A1X(obj8);
            return browserPreviewTransform;
        }

        public final AFs<BrowserPreviewTransform, Object> createSaver() {
            return AbstractC0871AFr.A00(new G0U() { // from class: com.facebook.aura.localbrowser.BrowserPreviewTransform$Companion$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return BrowserPreviewTransform.Companion.createSaver$lambda$1((List) obj);
                }
            }, new G0V() { // from class: com.facebook.aura.localbrowser.BrowserPreviewTransform$Companion$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserPreviewTransform.Companion.createSaver$lambda$0((C1bi) obj, (BrowserPreviewTransform) obj2);
                }
            });
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void reset() {
        this.adjusted = false;
        setZoom(this.fillOnReset ? getFillZoom() : 1.0f);
        m1198setOffsetk4lQ0M((C8j3.A0P(AnonymousClass001.A01(m1201getPanLimitF1C5BW0(), 4294967295L)) & 4294967295L) | (AnonymousClass002.A0F() << 32));
    }

    public final void zoomBy(float f) {
        m1203transformWko1d7g(AnonymousClass005.A0L(((int) (m1197getViewportYbymL2g() >> 32)) / 2.0f, ((int) (m1197getViewportYbymL2g() & 4294967295L)) / 2.0f), 0L, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getViewport-YbymL2g, reason: not valid java name */
    public final long m1197getViewportYbymL2g() {
        return ((BL4) this.viewport$delegate.getValue()).A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOffset-k-4lQ0M, reason: not valid java name */
    public final void m1198setOffsetk4lQ0M(long j) {
        AWx.A0G(this.offset$delegate, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViewport-ozmzZPI, reason: not valid java name */
    public final void m1199setViewportozmzZPI(long j) {
        this.viewport$delegate.Af8(BL4.A00(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setZoom(float f) {
        this.zoom$delegate.AdS(f);
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m1200getOffsetF1C5BW0() {
        return AWx.A07(this.offset$delegate);
    }

    /* renamed from: getPanLimit-F1C5BW0, reason: not valid java name */
    public final long m1201getPanLimitF1C5BW0() {
        float fitScale = (((((int) (this.imageSize >> 32)) * getFitScale()) * this.zoom$delegate.AFn()) - ((int) (m1197getViewportYbymL2g() >> 32))) / 2.0f;
        if (fitScale < 0.0f) {
            fitScale = 0.0f;
        }
        float fitScale2 = (((((int) (this.imageSize & 4294967295L)) * getFitScale()) * this.zoom$delegate.AFn()) - ((int) (m1197getViewportYbymL2g() & 4294967295L))) / 2.0f;
        if (fitScale2 < 0.0f) {
            fitScale2 = 0.0f;
        }
        return AnonymousClass005.A0M(fitScale, fitScale2);
    }

    public final float getZoom() {
        return this.zoom$delegate.AFn();
    }

    /* renamed from: transform-Wko1d7g, reason: not valid java name */
    public final void m1203transformWko1d7g(long j, long j2, float f) {
        float fA03 = ATD.A03(this.zoom$delegate.AFn() * f, 1.0f, Math.max(4.0f, getFillZoom()));
        long jA04 = AWx.A04(j, AnonymousClass005.A0L(((int) (m1197getViewportYbymL2g() >> 32)) / 2.0f, ((int) (m1197getViewportYbymL2g() & 4294967295L)) / 2.0f));
        long jA05 = AWx.A05(AWx.A04(jA04, AWx.A02(AWx.A04(jA04, AWx.A07(this.offset$delegate)), fA03 / this.zoom$delegate.AFn())), j2);
        this.adjusted = true;
        setZoom(fA03);
        m1198setOffsetk4lQ0M(m1196clampMKHz9U(jA05));
    }

    /* renamed from: clamp-MK-Hz9U, reason: not valid java name */
    private final long m1196clampMKHz9U(long j) {
        long jM1201getPanLimitF1C5BW0 = m1201getPanLimitF1C5BW0();
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = AnonymousClass001.A00(jM1201getPanLimitF1C5BW0);
        float fA03 = ATD.A03(fA00, -fA002, fA002);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        float fA012 = AnonymousClass001.A01(jM1201getPanLimitF1C5BW0, 4294967295L);
        return AnonymousClass005.A0M(fA03, ATD.A03(fA01, -fA012, fA012));
    }

    private final float getFillZoom() {
        if (getFitScale() > 0.0f) {
            return Math.max(((int) (m1197getViewportYbymL2g() >> 32)) / ((int) (this.imageSize >> 32)), ((int) (m1197getViewportYbymL2g() & 4294967295L)) / ((int) (4294967295L & this.imageSize))) / getFitScale();
        }
        return 1.0f;
    }

    private final float getFitScale() {
        return Math.min(((int) (m1197getViewportYbymL2g() >> 32)) / ((int) (this.imageSize >> 32)), ((int) (m1197getViewportYbymL2g() & 4294967295L)) / ((int) (4294967295L & this.imageSize)));
    }

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    public final void m1202resizeozmzZPI(long j) {
        int i;
        long jM1197getViewportYbymL2g = m1197getViewportYbymL2g();
        if (jM1197getViewportYbymL2g != j) {
            m1199setViewportozmzZPI(j);
            if (!this.adjusted) {
                reset();
                return;
            }
            int i2 = (int) (jM1197getViewportYbymL2g >> 32);
            if (i2 > 0 && (i = (int) (jM1197getViewportYbymL2g & 4294967295L)) > 0) {
                m1198setOffsetk4lQ0M(AnonymousClass005.A0L((AnonymousClass001.A00(AWx.A07(this.offset$delegate)) * ((int) (j >> 32))) / i2, (AnonymousClass001.A01(AWx.A07(this.offset$delegate), 4294967295L) * ((int) (j & 4294967295L))) / i));
            }
            m1198setOffsetk4lQ0M(m1196clampMKHz9U(AWx.A07(this.offset$delegate)));
        }
    }

    public /* synthetic */ BrowserPreviewTransform(long j, boolean z, C06H c06h) {
        this(j, z);
    }

    public BrowserPreviewTransform(long j, boolean z) {
        this.imageSize = j;
        this.fillOnReset = z;
        BL4 bl4A00 = BL4.A00(0L);
        AGE age = AGE.A00;
        this.viewport$delegate = C3cG.A08(age, bl4A00);
        this.zoom$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
        this.offset$delegate = AWx.A0A(age, 0L);
    }
}
