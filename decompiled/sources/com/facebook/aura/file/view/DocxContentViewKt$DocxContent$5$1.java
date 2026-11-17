package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
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
import X.G0U;
import X.G0W;
import com.facebook.aura.file.docx.DocElement;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class DocxContentViewKt$DocxContent$5$1 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ List<DocElement> $docElements;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocxContentViewKt$DocxContent$5$1(float f, List<? extends DocElement> list) {
        super(3);
        this.$contentBottomPadding = f;
        this.$docElements = list;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0n(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            BRg bRgA0B = C3U4.A0B(C10G.A01, AuraDimensKt.SpacingMedium, 0.0f);
            boolean z2 = !z;
            C1DP c1dp = new C1DP(0.0f, C06G.A00(bfm), 0.0f, this.$contentBottomPadding);
            boolean zA67 = bfm.A67(this.$docElements);
            List<DocElement> list = this.$docElements;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new DocxContentViewKt$DocxContent$5$1$1$1(list);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA0B, (G0U) objAaT, 0, 378, false, z2);
            return;
        }
        bfm.Afo();
    }
}
