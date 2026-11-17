package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpEyebrowState;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsUiState extends C06G {
    public static final int $stable = 0;
    public final boolean addToCartFailed;
    public final boolean addToCartSucceeded;
    public final InstacartProductCtaState cta;
    public final PdpEyebrowState eyebrow;
    public final AHD<String> imageUrls;
    public final boolean isAddingToCart;
    public final ProductDetailsPresentation presentation;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstacartProductDetailsUiState) {
                InstacartProductDetailsUiState instacartProductDetailsUiState = (InstacartProductDetailsUiState) obj;
                if (!C7384Etj.areEqual(this.presentation, instacartProductDetailsUiState.presentation) || !C7384Etj.areEqual(this.imageUrls, instacartProductDetailsUiState.imageUrls) || !C7384Etj.areEqual(this.eyebrow, instacartProductDetailsUiState.eyebrow) || !C7384Etj.areEqual(this.cta, instacartProductDetailsUiState.cta) || this.isAddingToCart != instacartProductDetailsUiState.isAddingToCart || this.addToCartFailed != instacartProductDetailsUiState.addToCartFailed || this.addToCartSucceeded != instacartProductDetailsUiState.addToCartSucceeded) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstacartProductDetailsUiState copy$default(InstacartProductDetailsUiState instacartProductDetailsUiState, ProductDetailsPresentation productDetailsPresentation, AHD ahd, PdpEyebrowState pdpEyebrowState, InstacartProductCtaState instacartProductCtaState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            productDetailsPresentation = instacartProductDetailsUiState.presentation;
        }
        if ((i & 2) != 0) {
            ahd = instacartProductDetailsUiState.imageUrls;
        }
        if ((i & 4) != 0) {
            pdpEyebrowState = instacartProductDetailsUiState.eyebrow;
        }
        if ((i & 8) != 0) {
            instacartProductCtaState = instacartProductDetailsUiState.cta;
        }
        if ((i & 16) != 0) {
            z = instacartProductDetailsUiState.isAddingToCart;
        }
        if ((i & 32) != 0) {
            z2 = instacartProductDetailsUiState.addToCartFailed;
        }
        if ((i & 64) != 0) {
            z3 = instacartProductDetailsUiState.addToCartSucceeded;
        }
        return instacartProductDetailsUiState.copy(productDetailsPresentation, ahd, pdpEyebrowState, instacartProductCtaState, z, z2, z3);
    }

    public final ProductDetailsPresentation component1() {
        return this.presentation;
    }

    public final AHD<String> component2() {
        return this.imageUrls;
    }

    public final PdpEyebrowState component3() {
        return this.eyebrow;
    }

    public final InstacartProductCtaState component4() {
        return this.cta;
    }

    public final boolean component5() {
        return this.isAddingToCart;
    }

    public final boolean component6() {
        return this.addToCartFailed;
    }

    public final boolean component7() {
        return this.addToCartSucceeded;
    }

    public final boolean getAddToCartFailed() {
        return this.addToCartFailed;
    }

    public final boolean getAddToCartSucceeded() {
        return this.addToCartSucceeded;
    }

    public final InstacartProductCtaState getCta() {
        return this.cta;
    }

    public final PdpEyebrowState getEyebrow() {
        return this.eyebrow;
    }

    public final AHD<String> getImageUrls() {
        return this.imageUrls;
    }

    public final ProductDetailsPresentation getPresentation() {
        return this.presentation;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.cta, AnonymousClass005.A0F(this.eyebrow, AnonymousClass005.A0F(this.imageUrls, AnonymousClass005.A0E(this.presentation)))), this.isAddingToCart), this.addToCartFailed), this.addToCartSucceeded);
    }

    public final boolean isAddingToCart() {
        return this.isAddingToCart;
    }

    public InstacartProductDetailsUiState(ProductDetailsPresentation productDetailsPresentation, AHD<String> ahd, PdpEyebrowState pdpEyebrowState, InstacartProductCtaState instacartProductCtaState, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A14(productDetailsPresentation, ahd, pdpEyebrowState, instacartProductCtaState);
        this.presentation = productDetailsPresentation;
        this.imageUrls = ahd;
        this.eyebrow = pdpEyebrowState;
        this.cta = instacartProductCtaState;
        this.isAddingToCart = z;
        this.addToCartFailed = z2;
        this.addToCartSucceeded = z3;
    }

    public final InstacartProductDetailsUiState copy(ProductDetailsPresentation productDetailsPresentation, AHD<String> ahd, PdpEyebrowState pdpEyebrowState, InstacartProductCtaState instacartProductCtaState, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A14(productDetailsPresentation, ahd, pdpEyebrowState, instacartProductCtaState);
        return new InstacartProductDetailsUiState(productDetailsPresentation, ahd, pdpEyebrowState, instacartProductCtaState, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InstacartProductDetailsUiState(ProductDetailsPresentation productDetailsPresentation, AHD ahd, PdpEyebrowState pdpEyebrowState, InstacartProductCtaState instacartProductCtaState, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(productDetailsPresentation, ahd, pdpEyebrowState, instacartProductCtaState, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, C3cG.A1K(i & 64, z3));
    }
}
