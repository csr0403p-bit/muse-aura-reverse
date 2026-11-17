package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenKt$ShoppingCartScreen$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ShoppingSecondaryAction $link;
    public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingCartScreenKt$ShoppingCartScreen$2$1(ShoppingSecondaryAction shoppingSecondaryAction, G0U<? super String, Unit> g0u) {
        super(2);
        this.$link = shoppingSecondaryAction;
        this.$onOpenProviderCart = g0u;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        String str = this.$link.label;
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$link, bfm.A65(this.$onOpenProviderCart));
        G0U<String, Unit> g0u = this.$onOpenProviderCart;
        ShoppingSecondaryAction shoppingSecondaryAction = this.$link;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new ShoppingCartScreenKt$ShoppingCartScreen$2$1$1$1(g0u, shoppingSecondaryAction);
            BBI.A0T(bfm, objAaT);
        }
        ShoppingLinkMenuButtonKt.ShoppingLinkMenuButton(str, (Function0) objAaT, null, bfm, 0, 4);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
