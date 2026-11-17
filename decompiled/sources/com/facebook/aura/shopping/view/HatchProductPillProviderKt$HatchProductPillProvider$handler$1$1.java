package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntity;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductPillProvider$handler$1$1 extends AbstractC7559F3s implements G0U<AuraInline.Custom, AuraMarkdownInlineEntity> {
    public final /* synthetic */ BO6<String, ShoppingResultProduct> $productsByPillId;

    @Override // X.G0U
    public final AuraMarkdownInlineEntity invoke(AuraInline.Custom custom) {
        ShoppingResultProduct shoppingResultProduct;
        String str;
        C7384Etj.A0Y(custom, 0);
        String strKey = IndexedInlineEntityExtension.INSTANCE.key(custom, ShoppingProductEntityMarkdown.INLINE_NAME);
        if (strKey == null || (shoppingResultProduct = this.$productsByPillId.get(strKey)) == null || (str = shoppingResultProduct.name) == null || C7BY.A0j(str)) {
            return null;
        }
        return new AuraMarkdownInlineEntity(strKey, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$HatchProductPillProvider$handler$1$1(BO6<String, ShoppingResultProduct> bo6) {
        super(1);
        this.$productsByPillId = bo6;
    }
}
