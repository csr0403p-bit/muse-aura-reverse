package com.facebook.aura.shopping.view;

import X.AIC;
import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C1HY;
import X.C3cG;
import X.C5wL;
import X.C78N;
import X.F2N;
import X.G0V;
import android.content.Context;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.productactions.impl.ProductDetailsHeader;
import com.facebook.aura.productactions.impl.ProductDetailsHeaderKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsNotice;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDetailsPageKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Boolean> $isSettledPage;
        public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, Function0<Boolean> function0, int i) {
            super(2);
            this.$viewModel = shoppingProductDetailsViewModel;
            this.$isSettledPage = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsPageKt.CouponPriceRefreshEffect(this.$viewModel, this.$isSettledPage, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsHeaderActions$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingProductDetailsPageKey $productKey;
        public final /* synthetic */ ShoppingResultProduct $seededProduct;
        public final /* synthetic */ String $viewModelKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$productKey = shoppingProductDetailsPageKey;
            this.$seededProduct = shoppingResultProduct;
            this.$viewModelKey = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsPageKt.ShoppingProductDetailsHeaderActions(this.$productKey, this.$seededProduct, this.$viewModelKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ShoppingProductDetailsHeaderActions(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(shoppingProductDetailsPageKey, 0, str);
        bfm.AgG(-378837589);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, shoppingProductDetailsPageKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(shoppingResultProduct, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T & 14;
            int i5 = iA0T & 896;
            ProductDetailsHeader.INSTANCE.Content(ProductDetailsHeaderKt.rememberProductDetailsActions(shoppingProductDetailsPageKey, productDetailsViewModel(shoppingProductDetailsPageKey, shoppingResultProduct, str, bfm, (ShoppingResultProduct.$stable << 3) | i4 | (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i5), str, bfm, i4 | (ShoppingProductDetailsViewModel.$stable << 3) | i5), bRg2, bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(shoppingProductDetailsPageKey, shoppingResultProduct, str, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingProductDetailsNotice.values().length];
            try {
                AnonymousClass002.A13(ShoppingProductDetailsNotice.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingProductDetailsNotice.LOAD_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* renamed from: ShoppingProductDetailsPage-eWuZFaY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2074ShoppingProductDetailsPageeWuZFaY(com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey r54, float r55, float r56, kotlin.jvm.functions.Function0<java.lang.String> r57, com.facebook.aura.shopping.model.ShoppingResultProduct r58, java.lang.String r59, kotlin.jvm.functions.Function0<java.lang.Boolean> r60, X.BRg r61, X.BFM r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt.m2074ShoppingProductDetailsPageeWuZFaY(com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey, float, float, kotlin.jvm.functions.Function0, com.facebook.aura.shopping.model.ShoppingResultProduct, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final ShoppingProductDetailsViewModel productDetailsViewModel(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct, String str, BFM bfm, int i) {
        ShoppingProductDetailsViewModel.Factory factory = new ShoppingProductDetailsViewModel.Factory(shoppingProductDetailsPageKey, AKO.A06(LocalUserSessionKt.LocalUserSession, (BBI) bfm), shoppingResultProduct);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (ShoppingProductDetailsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ShoppingProductDetailsViewModel.class, str);
        }
        throw AnonymousClass001.A0o();
    }

    public static final void CouponPriceRefreshEffect(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, Function0<Boolean> function0, BFM bfm, int i) {
        bfm.AgG(1495274519);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingProductDetailsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            BBI bbi = (BBI) bfm;
            F2N lifecycle = ((C1HY) AKO.A07(AIC.A00, bbi)).getLifecycle();
            int i2 = iA05 & 14;
            boolean zA1C = AnonymousClass003.A1C(iA05) | (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(shoppingProductDetailsViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1(function0, shoppingProductDetailsViewModel, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, shoppingProductDetailsViewModel);
            boolean zA67 = bfm.A67(lifecycle) | (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(shoppingProductDetailsViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1(lifecycle, shoppingProductDetailsViewModel, null);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, shoppingProductDetailsViewModel, lifecycle);
            if (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(shoppingProductDetailsViewModel))) {
                z = true;
            }
            Object objAaT3 = bfm.AaT();
            if (z || objAaT3 == C78N.A00) {
                objAaT3 = new ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$3$1(shoppingProductDetailsViewModel);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, shoppingProductDetailsViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(shoppingProductDetailsViewModel, function0, i);
        }
    }

    public static final /* synthetic */ ShoppingProductDetailsUiState access$ShoppingProductDetailsPage_eWuZFaY$lambda$0(C1BO c1bo) {
        return (ShoppingProductDetailsUiState) c1bo.getValue();
    }

    public static final void showHydrationNoticeToast(Context context, ShoppingProductDetailsNotice shoppingProductDetailsNotice, ShoppingProductType shoppingProductType, final Function0<Unit> function0) {
        AuraToast.ToastArgs toastArgs;
        int iOrdinal = shoppingProductDetailsNotice.ordinal();
        if (iOrdinal == 1) {
            ShoppingProductType shoppingProductType2 = ShoppingProductType.MARKETPLACE;
            int i = R.string._name_removed__res_0x7f120dd0;
            if (shoppingProductType == shoppingProductType2) {
                i = R.string._name_removed__res_0x7f120dc7;
            }
            toastArgs = new AuraToast.ToastArgs(context.getString(i), null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        } else {
            if (iOrdinal != 0) {
                throw C3cG.A0q();
            }
            toastArgs = new AuraToast.ToastArgs(context.getString(R.string._name_removed__res_0x7f120dc8), null, AuraToast.Duration.CUSTOMIZED, null, new AuraToastOption.Button(context.getString(R.string._name_removed__res_0x7f120dd3), null, false, true), new View.OnClickListener() { // from class: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$showHydrationNoticeToast$args$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    function0.invoke();
                }
            }, true, null, AuraThemeMode.DEFAULT, 8000, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        }
        ToastApi.INSTANCE.showToast(toastArgs);
    }
}
