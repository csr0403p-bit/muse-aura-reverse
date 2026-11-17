package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.shopping.model.PdpAction;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductCtaRow$1$1$2 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ Integer $buyButtonColor;
    public final /* synthetic */ boolean $isAddingToCart;
    public final /* synthetic */ boolean $isBuyEnabled;
    public final /* synthetic */ boolean $isBuying;
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
    public final /* synthetic */ PdpAction $primary;

    public final void invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            ShoppingProductDetailsBodyKt.ShoppingPrimaryCta(this.$primary, this.$isBuyEnabled, this.$isBuying, this.$isAddingToCart, this.$buyButtonColor, this.$onAction, bRg, bfm, ((iA0d << 18) & 3670016) | PdpAction.$stable, 0);
        } else {
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductCtaRow$1$1$2(PdpAction pdpAction, boolean z, boolean z2, boolean z3, Integer num, G0U<? super PdpActionIntent, Unit> g0u) {
        super(3);
        this.$primary = pdpAction;
        this.$isBuyEnabled = z;
        this.$isBuying = z2;
        this.$isAddingToCart = z3;
        this.$buyButtonColor = num;
        this.$onAction = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
