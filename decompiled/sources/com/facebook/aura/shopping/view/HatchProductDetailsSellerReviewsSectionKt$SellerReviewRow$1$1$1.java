package com.facebook.aura.shopping.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C0A3;
import X.C11U;
import X.C1b8;
import X.C3U4;
import X.G0W;
import com.facebook.aura.shopping.model.PdpSellerReview;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsSellerReviewsSectionKt$SellerReviewRow$1$1$1 extends AbstractC7559F3s implements G0W<C0A3, BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ PdpSellerReview $review;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsSellerReviewsSectionKt$SellerReviewRow$1$1$1(PdpSellerReview pdpSellerReview, AuraColors auraColors) {
        super(3);
        this.$review = pdpSellerReview;
        this.$colors = auraColors;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0A3 c0a3, BFM bfm, Integer num) {
        invoke(c0a3, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0A3 c0a3, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c0a3), bfm, i)) {
            List listA0a = AbstractC0878AGe.A0a(this.$review.tags, 5);
            AuraColors auraColors = this.$colors;
            Iterator it = listA0a.iterator();
            while (it.hasNext()) {
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass005.A0j(it), C3U4.A0B(C1b8.A01(C11U.A01(BRg.A00, HatchProductDetailsSellerReviewsSectionKt.ReviewPillCorner), auraColors.background), AuraDimensKt.SpacingXsmall, AuraDimensKt.SpacingNano), auraColors.primaryText, C06G.A0Z(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            }
            return;
        }
        bfm.Afo();
    }
}
