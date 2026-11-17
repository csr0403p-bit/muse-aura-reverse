package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.settings.MC;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PDFContentViewKt$PDFContent$5 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ MutableState<Boolean> $loadError$delegate;
    public final /* synthetic */ MutableState<List<PageSize>> $pageSizes$delegate;
    public final /* synthetic */ int $renderWidth;
    public final /* synthetic */ PdfRendererHolder $rendererHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PDFContent$5(float f, MutableState<List<PageSize>> mutableState, int i, PdfRendererHolder pdfRendererHolder, MutableState<Boolean> mutableState2) {
        super(3);
        this.$contentBottomPadding = f;
        this.$pageSizes$delegate = mutableState;
        this.$renderWidth = i;
        this.$rendererHolder = pdfRendererHolder;
        this.$loadError$delegate = mutableState2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        int iA0n = i;
        if ((i & 6) == 0) {
            iA0n = i | AnonymousClass004.A0n(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            BRg bRgA0B = C3U4.A0B(C10G.A01, AuraDimensKt.SpacingMedium, 0.0f);
            boolean z2 = !z;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            C1DP c1dp = new C1DP(0.0f, C06G.A00(bfm), 0.0f, this.$contentBottomPadding);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$loadError$delegate, AnonymousClass001.A1T(bfm, this.$rendererHolder, AnonymousClass001.A1a(bfm.A65(this.$pageSizes$delegate), bfm, this.$renderWidth)));
            MutableState<List<PageSize>> mutableState = this.$pageSizes$delegate;
            int i2 = this.$renderWidth;
            PdfRendererHolder pdfRendererHolder = this.$rendererHolder;
            MutableState<Boolean> mutableState2 = this.$loadError$delegate;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new PDFContentViewKt$PDFContent$5$1$1(mutableState, i2, pdfRendererHolder, mutableState2);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0B, (G0U) objAaT, 0, MC.mwa_help_and_support.__CONFIG__, false, z2);
            return;
        }
        bfm.Afo();
    }
}
