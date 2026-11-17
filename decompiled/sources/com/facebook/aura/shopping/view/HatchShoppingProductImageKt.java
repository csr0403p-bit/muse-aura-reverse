package com.facebook.aura.shopping.view;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AKH;
import X.ARL;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B18;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BOI;
import X.BRg;
import X.C01N;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1b8;
import X.C78N;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.ReducedMotionKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchShoppingProductImageKt {

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingProductImageKt$HatchProductImagePlaceholder$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingProductImageKt.HatchProductImagePlaceholder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchProductImagePlaceholder(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(297344147);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = ReducedMotionKt.rememberAnimatorDurationScale(false, bfm, 0, 1) > 0.0f;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).elevated;
            long j2 = AnonymousClass001.A0f(bfm, akh).shimmeringHighlight;
            boolean zA66 = bfm.A66(z);
            Object objAaT = bfm.AaT();
            if (zA66 || objAaT == C78N.A00) {
                objAaT = new HatchShoppingProductImageKt$HatchProductImagePlaceholder$shimmer$1$1(z);
                bfm.Ai0(objAaT);
            }
            BO4 bo4A01 = BOI.A01(bfm, (Function0) objAaT, 0.0f, 124, j, j2);
            C1D3 c1d3A00 = C1D8.A00(8.0f);
            BRg bRgA00 = BOI.A00(C1b8.A03(bRg2, c1d3A00, AnonymousClass001.A0f(bfm, akh).elevated), c1d3A00, bo4A01);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchShoppingProductImageKt$HatchProductImagePlaceholder$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            C01N.A07(bfm, AnonymousClass001.A0X(bRgA00, objAaT2));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    /* renamed from: HatchShoppingProductImage-gNPyAyM, reason: not valid java name */
    public static final void m2038HatchShoppingProductImagegNPyAyM(String str, String str2, String str3, boolean z, float f, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z2, G0V<? super Integer, ? super Integer, Unit> g0v2, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchShoppingProductImageKt$HatchShoppingProductImage$4;
        BRg bRg2 = bRg;
        boolean z3 = z2;
        G0V<? super Integer, ? super Integer, Unit> g0v3 = g0v2;
        AnonymousClass002.A1D(str, 0, g0v);
        bfm.AgG(-71837896);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0u = 12582912;
        if (i4 != 0) {
            iA0d |= iA0u;
        } else if ((12582912 & i) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z3);
            iA0d |= iA0u;
        }
        int i5 = i2 & 256;
        int iA0b = 100663296;
        if (i5 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            iA0b = AnonymousClass004.A0b(bfm, g0v3);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                g0v3 = null;
            }
            boolean zA1I = AnonymousClass004.A1I(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                if (str2 == null || (objAaT = AGI.A0E(str2)) == null) {
                    objAaT = AHI.A01;
                }
                bfm.Ai0(objAaT);
            }
            ProductImageRecovery productImageRecoveryRememberProductImageRecovery = HatchProductImageRecoveryKt.rememberProductImageRecovery(str, str3, z, (AHD) objAaT, null, bfm, AnonymousClass002.A07(iA0d >> 3, iA0d & 14), 16);
            String str4 = (String) AbstractC0878AGe.A0G(productImageRecoveryRememberProductImageRecovery.resolution.imageUrls);
            if (str4 == null) {
                bfm.AgE(-1228427814);
                if (productImageRecoveryRememberProductImageRecovery.resolution.reservesHero) {
                    bfm.AgE(-1228387018);
                    HatchProductImagePlaceholder(bRg2, bfm, (iA0d >> 18) & 14, 0);
                } else {
                    bfm.AgE(-1228330257);
                    AnonymousClass003.A13(bfm, g0v, iA0d >> 15);
                }
                AnonymousClass006.A1N(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchShoppingProductImageKt$HatchShoppingProductImage$4 = new HatchShoppingProductImageKt$HatchShoppingProductImage$1(str, str2, str3, z, f, g0v, bRg2, z3, g0v3, i, i2);
                    bBbAAc.A06 = hatchShoppingProductImageKt$HatchShoppingProductImage$4;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -1228289430);
            boolean zA1L = AnonymousClass003.A1L(bfm, str4, productImageRecoveryRememberProductImageRecovery.onLoadFailed);
            Object objAaT2 = bfm.AaT();
            if (zA1L || objAaT2 == C78N.A00) {
                objAaT2 = new HatchShoppingProductImageKt$HatchShoppingProductImage$onFailure$1$1(productImageRecoveryRememberProductImageRecovery, str4);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            ARL arl = B18.A00;
            G0V<? super BFM, ? super Integer, Unit> g0v4 = g0v;
            Function0 function02 = null;
            if (z) {
                g0v4 = null;
                function02 = function0;
            }
            boolean zA65 = bfm.A65(str4) | AnonymousClass005.A1F(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchShoppingProductImageKt$HatchShoppingProductImage$3$1(str4, g0v3);
                bfm.Ai0(objAaT3);
            }
            C1DG c1dg = new C1DG(f);
            int i6 = ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3456;
            int i7 = iA0d << 6;
            AuraImageKt.m2573AuraImageXRP3Ue8(str4, bRg2, arl, null, null, false, c1dg, 0L, false, z3, false, g0v4, null, function02, (G0V) objAaT3, bfm, AnonymousClass001.A06(i7, i6 | (3670016 & i7)), 0, 5552);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchShoppingProductImageKt$HatchShoppingProductImage$4 = new HatchShoppingProductImageKt$HatchShoppingProductImage$4(str, str2, str3, z, f, g0v, bRg2, z3, g0v3, i, i2);
            bBbAAc.A06 = hatchShoppingProductImageKt$HatchShoppingProductImage$4;
        }
    }
}
