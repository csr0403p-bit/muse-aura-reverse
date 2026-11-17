package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShoppingResultsCardKt$ProductImageOrFallback$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingResultsCardKt$ProductImageOrFallback$2(AuraIconSize auraIconSize, BRg bRg) {
        super(2);
        this.$iconSize = auraIconSize;
        this.$modifier = bRg;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            HatchShoppingResultsCardKt.ProductImageFallback(this.$iconSize, this.$modifier, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }
}
