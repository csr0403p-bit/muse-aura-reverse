package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import com.facebook.aura.shopping.viewmodel.ProductItemsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ProductItemsScreenHostKt {

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenHostKt$ProductItemsScreenHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ProductItemsScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ProductItemsScreenKey productItemsScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = productItemsScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductItemsScreenHostKt.ProductItemsScreenHost(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ProductItemsScreenHost(ProductItemsScreenKey productItemsScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(productItemsScreenKey, 0);
        bfm.AgG(-1077204050);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, productItemsScreenKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            ProductItemsViewModel.Factory factory = new ProductItemsViewModel.Factory(productItemsScreenKey, abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ProductItemsViewModel productItemsViewModel = (ProductItemsViewModel) AnonymousClass004.A14(factory, bodA00, AnonymousClass005.A0Y(bodA00), ProductItemsViewModel.class);
            ProductItemsUiState productItemsUiState = (ProductItemsUiState) C1BO.A07(bfm, productItemsViewModel.uiState);
            boolean zA1M = AnonymousClass003.A1M(bfm, productItemsViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ProductItemsScreenHostKt$ProductItemsScreenHost$1$1(productItemsViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            ProductItemsScreenKt.ProductItemsScreen(productItemsUiState, (Function0) objAaT, productItemsScreenKey.sessionId, productItemsScreenKey.messageId, bRg2, bfm, (iA0T << 9) & 57344, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(productItemsScreenKey, bRg2, i, i2);
        }
    }
}
