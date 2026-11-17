package com.facebook.aura.file.view;

import X.AKQ;
import X.AQC;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0881AGi;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PDFContentViewKt {
    public static final String PDF_MIME_TYPE = "application/pdf";
    public static final String TAG = "PDFContentView";

    /* renamed from: com.facebook.aura.file.view.PDFContentViewKt$PdfLoadingContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PDFContentViewKt.PdfLoadingContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.PDFContentViewKt$PdfPage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ float $aspectRatio;
        public final /* synthetic */ int $index;
        public final /* synthetic */ Function0<Unit> $onPageError;
        public final /* synthetic */ int $renderWidth;
        public final /* synthetic */ PdfRendererHolder $renderer;
        public final /* synthetic */ int $totalPages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i, float f, int i2, int i3, PdfRendererHolder pdfRendererHolder, Function0<Unit> function0, int i4) {
            super(2);
            this.$index = i;
            this.$aspectRatio = f;
            this.$totalPages = i2;
            this.$renderWidth = i3;
            this.$renderer = pdfRendererHolder;
            this.$onPageError = function0;
            this.$$changed = i4;
        }

        public final void invoke(BFM bfm, int i) {
            PDFContentViewKt.PdfPage(this.$index, this.$aspectRatio, this.$totalPages, this.$renderWidth, this.$renderer, this.$onPageError, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: PDFContent-6a0pyJM, reason: not valid java name */
    public static final void m922PDFContent6a0pyJM(File file, BRg bRg, float f, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object pDFContentViewKt$PDFContent$6;
        BRg bRg2 = bRg;
        float f2 = f;
        C7384Etj.A0Y(file, 0);
        bfm.AgG(-980604983);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            boolean zA67 = bfm.A67(file);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new PDFContentViewKt$PDFContent$1$1(file);
                bfm.Ai0(objAaT);
            }
            int i5 = iA0T & 14;
            C78e.A05(bfm, file, (G0U) objAaT);
            if (file.length() > AuraFileViewerLimits.INSTANCE.getMaxRenderBytes()) {
                bfm.AgE(1164967158);
                OpenExternallyCardKt.OpenExternallyCard(file, "application/pdf", bRg2, (String) null, bfm, i5 | 48 | ((iA0T << 3) & 896), 8);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    pDFContentViewKt$PDFContent$6 = new PDFContentViewKt$PDFContent$2(file, bRg2, f2, i, i2);
                    C3cG.A1D(bBbAAc, pDFContentViewKt$PDFContent$6);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1165062297);
            int iAuraLayoutWidth = (int) (AuraLayoutSizeKt.auraLayoutWidth(bfm, 0) * ((Resources) bfm.A6v(AndroidCompositionLocals_androidKt.A04)).getDisplayMetrics().density);
            float fA00 = C60Q.A00(bfm);
            boolean zA65 = bfm.A65(file);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new PdfRendererHolder();
                bfm.Ai0(objAaT2);
            }
            PdfRendererHolder pdfRendererHolder = (PdfRendererHolder) objAaT2;
            boolean zA652 = bfm.A65(file);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass004.A11(bfm, C0881AGi.A00);
            }
            MutableState mutableState = (MutableState) objAaT3;
            boolean zA653 = bfm.A65(file);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT4;
            boolean zA1W = AnonymousClass005.A1W(bfm, file, mutableState2, mutableState, bfm.A67(pdfRendererHolder));
            Object objAaT5 = bfm.AaT();
            if (zA1W || objAaT5 == C78N.A00) {
                objAaT5 = new PDFContentViewKt$PDFContent$3$1(pdfRendererHolder, file, mutableState2, mutableState, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, file);
            boolean zA672 = bfm.A67(pdfRendererHolder);
            Object objAaT6 = bfm.AaT();
            if (zA672 || objAaT6 == C78N.A00) {
                objAaT6 = new PDFContentViewKt$PDFContent$4$1(pdfRendererHolder);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A17(bfm, objAaT6, pdfRendererHolder);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(-1763508681);
                OpenExternallyCardKt.OpenExternallyCard(file, "application/pdf", bRg2, (String) null, bfm, i5 | 48 | ((iA0T << 3) & 896), 8);
            } else if (((List) mutableState.getValue()).isEmpty()) {
                bfm.AgE(-1763505329);
                PdfLoadingContent(bRg2, bfm, (iA0T >> 3) & 14, 0);
            } else {
                bfm.AgE(-1763502261);
                FileViewerZoomKt.ZoomableContainer(C10G.A04(AnonymousClass001.A0R(bRg2), fA00), 0.0f, B1V.A00(bfm, new PDFContentViewKt$PDFContent$5(f2, mutableState, iAuraLayoutWidth, pdfRendererHolder, mutableState2), -2867037), bfm, 384, 2);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            pDFContentViewKt$PDFContent$6 = new PDFContentViewKt$PDFContent$6(file, bRg2, f2, i, i2);
            C3cG.A1D(bBbAAc, pDFContentViewKt$PDFContent$6);
        }
    }

    public static final void PdfLoadingContent(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1068938467);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202a4);
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), 200.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new PDFContentViewKt$PdfLoadingContent$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    public static final void PdfPage(int i, float f, int i2, int i3, PdfRendererHolder pdfRendererHolder, Function0<Unit> function0, BFM bfm, int i4) {
        bfm.AgG(226440182);
        int iA0D = (i4 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i4 : i4;
        if ((i4 & 48) == 0) {
            iA0D |= AnonymousClass004.A05(bfm, f);
        }
        if ((i4 & 384) == 0) {
            iA0D |= AnonymousClass004.A0F(bfm, i2);
        }
        if ((i4 & 3072) == 0) {
            iA0D |= AnonymousClass007.A06(bfm, i3);
        }
        if ((i4 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, pdfRendererHolder, i4, 32768) ? 1 : 0);
        }
        if ((196608 & i4) == 0) {
            iA0D |= AnonymousClass004.A0Y(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 74899, 74898), bfm, iA0D)) {
            int i5 = iA0D & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            int i6 = i + 1;
            String strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(i6), R.string._name_removed__res_0x7f1209eb);
            Integer numValueOf = Integer.valueOf(i);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState, ((57344 & iA0D) == 16384 || ((iA0D & 32768) != 0 && bfm.A67(pdfRendererHolder))) | AnonymousClass003.A17(i5) | AnonymousClass004.A1M(iA0D), AnonymousClass007.A1I(iA0D));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new PDFContentViewKt$PdfPage$1$1(pdfRendererHolder, i, i3, function0, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, numValueOf);
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new PDFContentViewKt$PdfPage$2$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, numValueOf);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA012 = C1b8.A01(C11U.A01(BJe.A00(C10G.A02, f, false), 8.0f), B6A.A08);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            Bitmap bitmap = (Bitmap) mutableState.getValue();
            if (bitmap != null) {
                bfm.AgE(1334984472);
                AuraImageKt.AuraImage(new BitmapDrawable((Resources) bfm.A6v(AndroidCompositionLocals_androidKt.A04), bitmap), C10G.A01, null, strA0t, false, bfm, 48, 20);
                BBI.A0R(bbi, false);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(strA0t, bfm, 1335178129);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == C78N.A00) {
                    objAaT4 = new PDFContentViewKt$PdfPage$3$1$1$1(strA0t);
                    bfm.Ai0(objAaT4);
                }
                AnonymousClass007.A0v(bfm, bs0, (G0U) objAaT4);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            String strA07 = FGI.A07(i6, i2, " / ");
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA07, C3U4.A04(new AQC(C2VU.A00), AuraDimensKt.SpacingXsmall), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(i, f, i2, i3, pdfRendererHolder, function0, i4);
        }
    }

    public static final /* synthetic */ List access$PDFContent_6a0pyJM$lambda$3(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    public static final /* synthetic */ Bitmap access$PdfPage$lambda$1(MutableState mutableState) {
        return (Bitmap) mutableState.getValue();
    }
}
