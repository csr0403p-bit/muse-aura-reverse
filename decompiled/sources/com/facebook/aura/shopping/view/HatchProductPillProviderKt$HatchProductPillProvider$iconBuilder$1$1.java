package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BO6;
import X.C0981AMm;
import X.C14P;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductPillProvider$iconBuilder$1$1 extends AbstractC7559F3s implements G0W<AHD<? extends AuraMarkdownInlineEntitySlot>, BFM, Integer, BO6<String, ? extends C14P>> {
    public final /* synthetic */ C0981AMm<String, Float> $iconAspectRatios;
    public final /* synthetic */ ShoppingMerchantRanking $merchantRanking;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BO6<String, ShoppingResultProduct> $productsByPillId;

    public final BO6<String, C14P> invoke(AHD<AuraMarkdownInlineEntitySlot> ahd, BFM bfm, int i) {
        C7384Etj.A0Y(ahd, 0);
        bfm.AgE(-1506392679);
        BO6<String, C14P> bo6RememberHatchProductIconContent = HatchProductPillProviderKt.rememberHatchProductIconContent(ahd, this.$productsByPillId, this.$messageId, this.$merchantRanking, this.$iconAspectRatios, bfm, (i & 14) | AuraMarkdownInlineEntitySlot.$stable | (ShoppingResultProduct.$stable << 3));
        AnonymousClass001.A1D(bfm);
        return bo6RememberHatchProductIconContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$HatchProductPillProvider$iconBuilder$1$1(BO6<String, ShoppingResultProduct> bo6, String str, ShoppingMerchantRanking shoppingMerchantRanking, C0981AMm<String, Float> c0981AMm) {
        super(3);
        this.$productsByPillId = bo6;
        this.$messageId = str;
        this.$merchantRanking = shoppingMerchantRanking;
        this.$iconAspectRatios = c0981AMm;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BO6<String, ? extends C14P> invoke(AHD<? extends AuraMarkdownInlineEntitySlot> ahd, BFM bfm, Integer num) {
        return invoke((AHD<AuraMarkdownInlineEntitySlot>) ahd, bfm, AnonymousClass001.A0F(num));
    }
}
