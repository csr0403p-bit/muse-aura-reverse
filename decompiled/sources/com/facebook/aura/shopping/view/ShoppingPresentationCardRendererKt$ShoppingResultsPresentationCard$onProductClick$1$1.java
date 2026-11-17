package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.G0W;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.navigation.ShoppingProductDetailsNavigationKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingPresentationCardRendererKt$ShoppingResultsPresentationCard$onProductClick$1$1 extends AbstractC7559F3s implements G0W<Integer, ShoppingResultProduct, List<? extends ShoppingResultProduct>, Unit> {
    public final /* synthetic */ Context $androidContext;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ ShoppingResultsPresentation $shoppingResults;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ String $widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingPresentationCardRendererKt$ShoppingResultsPresentationCard$onProductClick$1$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, ShoppingResultsPresentation shoppingResultsPresentation, String str4, String str5, Context context) {
        super(3);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str;
        this.$hostMessageId = str2;
        this.$presentationId = str3;
        this.$shoppingResults = shoppingResultsPresentation;
        this.$presentationEventId = str4;
        this.$widgetId = str5;
        this.$androidContext = context;
    }

    public final void invoke(int i, ShoppingResultProduct shoppingResultProduct, List<ShoppingResultProduct> list) {
        AnonymousClass003.A0x(shoppingResultProduct, list);
        if (!ShoppingPresentationCardRendererKt.getShoppingResultPdpEnabled()) {
            String str = shoppingResultProduct.url;
            if (str != null) {
                HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$androidContext, this.$navigator, null, null);
                return;
            }
            return;
        }
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        String str2 = this.$sessionId;
        String str3 = this.$hostMessageId;
        ShoppingFormat shoppingFormat = ShoppingFormat.LIST;
        String str4 = this.$presentationId;
        ProductDetailsNavigationKt.navigateToProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str2, str3, shoppingFormat, str4, new ShoppingProductSource(str4, this.$presentationEventId, i, this.$widgetId, shoppingResultProduct.wireIndex, this.$shoppingResults.kind, null, null), ShoppingProductDetailsNavigationKt.shoppingProductSharedElementKey(shoppingFormat, this.$presentationId, i), list, null);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, ShoppingResultProduct shoppingResultProduct, List<? extends ShoppingResultProduct> list) {
        invoke(AnonymousClass001.A0F(num), shoppingResultProduct, (List<ShoppingResultProduct>) list);
        return Unit.INSTANCE;
    }
}
