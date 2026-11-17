package com.facebook.aura.shopping.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.C78N;
import X.C9tI;
import X.G0U;
import X.G0W;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$rememberHatchProductIconContent$1$1$1$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public final /* synthetic */ Map<String, Float> $aspectRatios;
    public final /* synthetic */ long $iconHeight;
    public final /* synthetic */ ShoppingMerchantRanking $merchantRanking;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ ShoppingResultProduct $product;
    public final /* synthetic */ AuraMarkdownInlineEntitySlot $slot;
    public final /* synthetic */ AXN $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$rememberHatchProductIconContent$1$1$1$1(ShoppingResultProduct shoppingResultProduct, String str, AuraMarkdownInlineEntitySlot auraMarkdownInlineEntitySlot, ShoppingMerchantRanking shoppingMerchantRanking, AXN axn, long j, Map<String, Float> map) {
        super(3);
        this.$product = shoppingResultProduct;
        this.$messageId = str;
        this.$slot = auraMarkdownInlineEntitySlot;
        this.$merchantRanking = shoppingMerchantRanking;
        this.$this_with = axn;
        this.$iconHeight = j;
        this.$aspectRatios = map;
    }

    public final void invoke(String str, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        ShoppingResultProduct shoppingResultProduct = this.$product;
        String str2 = this.$messageId;
        Integer numA0r = C9tI.A0r(this.$slot.key);
        ShoppingMerchantRanking shoppingMerchantRanking = this.$merchantRanking;
        float fAgw = this.$this_with.Agw(this.$iconHeight);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$slot, bfm.A67(this.$aspectRatios));
        Map<String, Float> map = this.$aspectRatios;
        AuraMarkdownInlineEntitySlot auraMarkdownInlineEntitySlot = this.$slot;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new HatchProductPillProviderKt$rememberHatchProductIconContent$1$1$1$1$1$1(map, auraMarkdownInlineEntitySlot);
            BBI.A0T(bfm, objAaT);
        }
        HatchProductPillProviderKt.m2030HatchProductEntityIconiHT50w(shoppingResultProduct, str2, numA0r, shoppingMerchantRanking, fAgw, (G0U) objAaT, null, bfm, ShoppingResultProduct.$stable, 64);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
