package com.facebook.aura.shopping.view;

import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B18;
import X.BFM;
import X.BRg;
import X.C05253Tt;
import X.C0Ig;
import X.C10G;
import X.C1DG;
import X.C2VU;
import X.C2aw;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ float $imageHeight;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1(float f, String str, float f2) {
        super(3);
        this.$imageHeight = f;
        this.$uri = str;
        this.$decodeAtSize = f2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            float fA00 = Constraints.A00(((C05253Tt) c0Ig).A00);
            if (fA00 > 0.0f) {
                BRg bRgA04 = C10G.A04(C10G.A01(C2VU.A05, C10G.A02, true), this.$imageHeight);
                if (C1DG.A01(6.0f, 0.0f) > 0) {
                    bRgA04 = AbstractC1396AiR.A00(bRgA04, new C2aw());
                }
                boolean zA62 = bfm.A62(fA00);
                Object objAaT = bfm.AaT();
                if (zA62 || objAaT == C78N.A00) {
                    objAaT = new HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1$1$1(fA00);
                    bfm.Ai0(objAaT);
                }
                AuraImageKt.m2573AuraImageXRP3Ue8(this.$uri, AnonymousClass001.A0W(bRgA04, objAaT), B18.A02, null, null, false, new C1DG(this.$decodeAtSize), 0L, false, false, false, null, null, null, null, bfm, 3456, 0, 32688);
                return;
            }
            return;
        }
        bfm.Afo();
    }
}
