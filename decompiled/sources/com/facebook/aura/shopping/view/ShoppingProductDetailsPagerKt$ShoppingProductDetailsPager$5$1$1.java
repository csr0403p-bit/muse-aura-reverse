package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.C01r;
import X.C78N;
import X.C8j3;
import X.FGI;
import X.G2j;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1 extends AbstractC7559F3s implements G2j<C01r, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ float $pageBottomPadding;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ AHD<ShoppingProductDetailsPagerItem> $pages;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1(AHD<ShoppingProductDetailsPagerItem> ahd, float f, float f2, PagerState pagerState) {
        super(4);
        this.$pages = ahd;
        this.$topPadding = f;
        this.$pageBottomPadding = f2;
        this.$pagerState = pagerState;
    }

    public final void invoke(C01r c01r, int i, BFM bfm, int i2) {
        int iA0E = i2;
        if ((i2 & 48) == 0) {
            iA0E = i2 | AnonymousClass004.A0E(bfm, i);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
            bfm.Afo();
            return;
        }
        ShoppingProductDetailsPagerItem shoppingProductDetailsPagerItem = (ShoppingProductDetailsPagerItem) this.$pages.get(i);
        ShoppingProductDetailsPageKey shoppingProductDetailsPageKey = shoppingProductDetailsPagerItem.key;
        float f = this.$topPadding;
        float f2 = this.$pageBottomPadding;
        boolean zA65 = bfm.A65(shoppingProductDetailsPagerItem);
        int i3 = iA0E & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$pagerState, zA65 | AnonymousClass002.A1Q(i3, 32));
        PagerState pagerState = this.$pagerState;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$1$1(shoppingProductDetailsPagerItem, i, pagerState);
            BBI.A0T(bfm, objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        ShoppingResultProduct shoppingResultProduct = shoppingProductDetailsPagerItem.seededProduct;
        String strA0H = FGI.A0H("product_details_page_", i);
        boolean zA1V = C8j3.A1V(bfm, this.$pagerState, i3 == 32);
        PagerState pagerState2 = this.$pagerState;
        Object objAaT2 = bfm.AaT();
        if (zA1V || objAaT2 == C78N.A00) {
            objAaT2 = new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$2$1(i, pagerState2);
            BBI.A0T(bfm, objAaT2);
        }
        ShoppingProductDetailsPageKt.m2074ShoppingProductDetailsPageeWuZFaY(shoppingProductDetailsPageKey, f, f2, function0, shoppingResultProduct, strA0H, (Function0) objAaT2, null, bfm, ShoppingResultProduct.$stable << 12, 128);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C01r c01r, Integer num, BFM bfm, Integer num2) {
        invoke(c01r, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
