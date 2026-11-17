package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AHG;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0953AJg;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.InterfaceC0962AJp;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsUiState extends C06G {
    public static final int $stable = 0;
    public final boolean addToCartFailed;
    public final boolean addToCartSucceeded;
    public final boolean buyFailed;
    public final boolean buySucceeded;
    public final boolean commercialContentPending;
    public final ShoppingProductDetailsDisplayState display;
    public final boolean hasHydrationFailure;
    public final ShoppingProductDetailsHydrationState hydration;
    public final boolean hydrationPending;
    public final boolean isAddingToCart;
    public final boolean isBuying;
    public final ShoppingProductDetailsNotice notice;
    public final ProductDetailsPresentation presentation;
    public final AHG<String> refreshingPriceIds;
    public final InterfaceC0962AJp<String, String> selections;
    public final AHG<String> unavailablePriceIds;
    public final AHG<String> unconfirmedPriceIds;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsUiState) {
                ShoppingProductDetailsUiState shoppingProductDetailsUiState = (ShoppingProductDetailsUiState) obj;
                if (!C7384Etj.areEqual(this.presentation, shoppingProductDetailsUiState.presentation) || !C7384Etj.areEqual(this.display, shoppingProductDetailsUiState.display) || !C7384Etj.areEqual(this.selections, shoppingProductDetailsUiState.selections) || this.hydration != shoppingProductDetailsUiState.hydration || this.isBuying != shoppingProductDetailsUiState.isBuying || this.buyFailed != shoppingProductDetailsUiState.buyFailed || this.buySucceeded != shoppingProductDetailsUiState.buySucceeded || this.isAddingToCart != shoppingProductDetailsUiState.isAddingToCart || this.addToCartFailed != shoppingProductDetailsUiState.addToCartFailed || this.addToCartSucceeded != shoppingProductDetailsUiState.addToCartSucceeded || this.hasHydrationFailure != shoppingProductDetailsUiState.hasHydrationFailure || this.notice != shoppingProductDetailsUiState.notice || this.commercialContentPending != shoppingProductDetailsUiState.commercialContentPending || this.hydrationPending != shoppingProductDetailsUiState.hydrationPending || !C7384Etj.areEqual(this.refreshingPriceIds, shoppingProductDetailsUiState.refreshingPriceIds) || !C7384Etj.areEqual(this.unconfirmedPriceIds, shoppingProductDetailsUiState.unconfirmedPriceIds) || !C7384Etj.areEqual(this.unavailablePriceIds, shoppingProductDetailsUiState.unavailablePriceIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingProductDetailsUiState(ProductDetailsPresentation productDetailsPresentation, ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, InterfaceC0962AJp interfaceC0962AJp, ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ShoppingProductDetailsNotice shoppingProductDetailsNotice, boolean z8, boolean z9, AHG ahg, AHG ahg2, AHG ahg3, int i, C06H c06h) {
        this(productDetailsPresentation, shoppingProductDetailsDisplayState, (i & 4) != 0 ? C0953AJg.A03 : interfaceC0962AJp, (i & 8) != 0 ? ShoppingProductDetailsHydrationState.HYDRATING : shoppingProductDetailsHydrationState, C3cI.A1S(i, z), AnonymousClass002.A1R(i, z2), C3cG.A1K(i & 64, z3), C3cH.A1N(i, z4), C3cG.A1K(i & 256, z5), C3cG.A1K(i & 512, z6), C3cG.A1K(i & 1024, z7), (i & 2048) != 0 ? null : shoppingProductDetailsNotice, C3cG.A1K(i & 4096, z8), C3cG.A1K(i & 8192, z9), (i & 16384) != 0 ? C0943AIw.A03 : ahg, (32768 & i) != 0 ? C0943AIw.A03 : ahg2, (i & 65536) != 0 ? C0943AIw.A03 : ahg3);
    }

    public static /* synthetic */ ShoppingProductDetailsUiState copy$default(ShoppingProductDetailsUiState shoppingProductDetailsUiState, ProductDetailsPresentation productDetailsPresentation, ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, InterfaceC0962AJp interfaceC0962AJp, ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ShoppingProductDetailsNotice shoppingProductDetailsNotice, boolean z8, boolean z9, AHG ahg, AHG ahg2, AHG ahg3, int i, Object obj) {
        ProductDetailsPresentation productDetailsPresentation2 = productDetailsPresentation;
        ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState2 = shoppingProductDetailsDisplayState;
        InterfaceC0962AJp interfaceC0962AJp2 = interfaceC0962AJp;
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState2 = shoppingProductDetailsHydrationState;
        boolean z10 = z;
        boolean z11 = z2;
        boolean z12 = z3;
        boolean z13 = z4;
        boolean z14 = z5;
        boolean z15 = z6;
        boolean z16 = z7;
        ShoppingProductDetailsNotice shoppingProductDetailsNotice2 = shoppingProductDetailsNotice;
        boolean z17 = z8;
        boolean z18 = z9;
        AHG ahg4 = ahg;
        AHG ahg5 = ahg2;
        AHG ahg6 = ahg3;
        if ((i & 1) != 0) {
            productDetailsPresentation2 = shoppingProductDetailsUiState.presentation;
        }
        if ((i & 2) != 0) {
            shoppingProductDetailsDisplayState2 = shoppingProductDetailsUiState.display;
        }
        if ((i & 4) != 0) {
            interfaceC0962AJp2 = shoppingProductDetailsUiState.selections;
        }
        if ((i & 8) != 0) {
            shoppingProductDetailsHydrationState2 = shoppingProductDetailsUiState.hydration;
        }
        if ((i & 16) != 0) {
            z10 = shoppingProductDetailsUiState.isBuying;
        }
        if ((i & 32) != 0) {
            z11 = shoppingProductDetailsUiState.buyFailed;
        }
        if ((i & 64) != 0) {
            z12 = shoppingProductDetailsUiState.buySucceeded;
        }
        if ((i & 128) != 0) {
            z13 = shoppingProductDetailsUiState.isAddingToCart;
        }
        if ((i & 256) != 0) {
            z14 = shoppingProductDetailsUiState.addToCartFailed;
        }
        if ((i & 512) != 0) {
            z15 = shoppingProductDetailsUiState.addToCartSucceeded;
        }
        if ((i & 1024) != 0) {
            z16 = shoppingProductDetailsUiState.hasHydrationFailure;
        }
        if ((i & 2048) != 0) {
            shoppingProductDetailsNotice2 = shoppingProductDetailsUiState.notice;
        }
        if ((i & 4096) != 0) {
            z17 = shoppingProductDetailsUiState.commercialContentPending;
        }
        if ((i & 8192) != 0) {
            z18 = shoppingProductDetailsUiState.hydrationPending;
        }
        if ((i & 16384) != 0) {
            ahg4 = shoppingProductDetailsUiState.refreshingPriceIds;
        }
        if ((i & 32768) != 0) {
            ahg5 = shoppingProductDetailsUiState.unconfirmedPriceIds;
        }
        if ((i & 65536) != 0) {
            ahg6 = shoppingProductDetailsUiState.unavailablePriceIds;
        }
        boolean z19 = z10;
        return shoppingProductDetailsUiState.copy(productDetailsPresentation2, shoppingProductDetailsDisplayState2, interfaceC0962AJp2, shoppingProductDetailsHydrationState2, z19, z11, z12, z13, z14, z15, z16, shoppingProductDetailsNotice2, z17, z18, ahg4, ahg5, ahg6);
    }

    public final ProductDetailsPresentation component1() {
        return this.presentation;
    }

    public final boolean component10() {
        return this.addToCartSucceeded;
    }

    public final boolean component11() {
        return this.hasHydrationFailure;
    }

    public final ShoppingProductDetailsNotice component12() {
        return this.notice;
    }

    public final boolean component13() {
        return this.commercialContentPending;
    }

    public final boolean component14() {
        return this.hydrationPending;
    }

    public final AHG<String> component15() {
        return this.refreshingPriceIds;
    }

    public final AHG<String> component16() {
        return this.unconfirmedPriceIds;
    }

    public final AHG<String> component17() {
        return this.unavailablePriceIds;
    }

    public final ShoppingProductDetailsDisplayState component2() {
        return this.display;
    }

    public final InterfaceC0962AJp<String, String> component3() {
        return this.selections;
    }

    public final ShoppingProductDetailsHydrationState component4() {
        return this.hydration;
    }

    public final boolean component5() {
        return this.isBuying;
    }

    public final boolean component6() {
        return this.buyFailed;
    }

    public final boolean component7() {
        return this.buySucceeded;
    }

    public final boolean component8() {
        return this.isAddingToCart;
    }

    public final boolean component9() {
        return this.addToCartFailed;
    }

    public final boolean getAddToCartFailed() {
        return this.addToCartFailed;
    }

    public final boolean getAddToCartSucceeded() {
        return this.addToCartSucceeded;
    }

    public final boolean getBuyFailed() {
        return this.buyFailed;
    }

    public final boolean getBuySucceeded() {
        return this.buySucceeded;
    }

    public final boolean getCommercialContentPending() {
        return this.commercialContentPending;
    }

    public final ShoppingProductDetailsDisplayState getDisplay() {
        return this.display;
    }

    public final boolean getHasHydrationFailure() {
        return this.hasHydrationFailure;
    }

    public final ShoppingProductDetailsHydrationState getHydration() {
        return this.hydration;
    }

    public final boolean getHydrationPending() {
        return this.hydrationPending;
    }

    public final ShoppingProductDetailsNotice getNotice() {
        return this.notice;
    }

    public final ProductDetailsPresentation getPresentation() {
        return this.presentation;
    }

    public final AHG<String> getRefreshingPriceIds() {
        return this.refreshingPriceIds;
    }

    public final AHD<ShoppingResultProductUiModel> getRelatedProducts() {
        return this.display.relatedProducts;
    }

    public final InterfaceC0962AJp<String, String> getSelections() {
        return this.selections;
    }

    public final AHD<ShoppingResultProductUiModel> getSellerOtherListings() {
        return this.display.sellerOtherListings;
    }

    public final AHG<String> getUnavailablePriceIds() {
        return this.unavailablePriceIds;
    }

    public final AHG<String> getUnconfirmedPriceIds() {
        return this.unconfirmedPriceIds;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.unavailablePriceIds, AnonymousClass005.A0F(this.unconfirmedPriceIds, AnonymousClass005.A0F(this.refreshingPriceIds, C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.hydration, AnonymousClass005.A0F(this.selections, AnonymousClass005.A0F(this.display, AnonymousClass005.A0E(this.presentation)))), this.isBuying), this.buyFailed), this.buySucceeded), this.isAddingToCart), this.addToCartFailed), this.addToCartSucceeded), this.hasHydrationFailure) + AnonymousClass006.A0D(this.notice)) * 31, this.commercialContentPending), this.hydrationPending))));
    }

    public final boolean isAddingToCart() {
        return this.isAddingToCart;
    }

    public final boolean isBuying() {
        return this.isBuying;
    }

    public final ShoppingProductDetailsUiState copy(ProductDetailsPresentation productDetailsPresentation, ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, InterfaceC0962AJp<String, String> interfaceC0962AJp, ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ShoppingProductDetailsNotice shoppingProductDetailsNotice, boolean z8, boolean z9, AHG<String> ahg, AHG<String> ahg2, AHG<String> ahg3) {
        AnonymousClass005.A14(productDetailsPresentation, shoppingProductDetailsDisplayState, interfaceC0962AJp, shoppingProductDetailsHydrationState);
        C7384Etj.A0Y(ahg, 14);
        AnonymousClass003.A12(ahg2, ahg3);
        return new ShoppingProductDetailsUiState(productDetailsPresentation, shoppingProductDetailsDisplayState, interfaceC0962AJp, shoppingProductDetailsHydrationState, z, z2, z3, z4, z5, z6, z7, shoppingProductDetailsNotice, z8, z9, ahg, ahg2, ahg3);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingProductDetailsUiState(ProductDetailsPresentation productDetailsPresentation, ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, InterfaceC0962AJp<String, String> interfaceC0962AJp, ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ShoppingProductDetailsNotice shoppingProductDetailsNotice, boolean z8, boolean z9, AHG<String> ahg, AHG<String> ahg2, AHG<String> ahg3) {
        AnonymousClass005.A14(productDetailsPresentation, shoppingProductDetailsDisplayState, interfaceC0962AJp, shoppingProductDetailsHydrationState);
        C7384Etj.A0Y(ahg, 14);
        AnonymousClass003.A12(ahg2, ahg3);
        this.presentation = productDetailsPresentation;
        this.display = shoppingProductDetailsDisplayState;
        this.selections = interfaceC0962AJp;
        this.hydration = shoppingProductDetailsHydrationState;
        this.isBuying = z;
        this.buyFailed = z2;
        this.buySucceeded = z3;
        this.isAddingToCart = z4;
        this.addToCartFailed = z5;
        this.addToCartSucceeded = z6;
        this.hasHydrationFailure = z7;
        this.notice = shoppingProductDetailsNotice;
        this.commercialContentPending = z8;
        this.hydrationPending = z9;
        this.refreshingPriceIds = ahg;
        this.unconfirmedPriceIds = ahg2;
        this.unavailablePriceIds = ahg3;
    }
}
