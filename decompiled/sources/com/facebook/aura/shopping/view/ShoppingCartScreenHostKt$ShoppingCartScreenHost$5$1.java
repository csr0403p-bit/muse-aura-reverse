package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenHostKt$ShoppingCartScreenHost$5$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ ShoppingCartViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.onOpenProviderCart();
        HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartScreenHostKt$ShoppingCartScreenHost$5$1(ShoppingCartViewModel shoppingCartViewModel, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator) {
        super(1);
        this.$viewModel = shoppingCartViewModel;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
