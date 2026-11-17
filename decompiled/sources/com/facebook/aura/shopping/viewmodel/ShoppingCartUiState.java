package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.viewmodel.ShoppingCartRead;

/* loaded from: classes4.dex */
public final class ShoppingCartUiState extends C06G {
    public static final int $stable = 0;
    public final boolean checkoutFailed;
    public final boolean checkoutSucceeded;
    public final boolean isCheckingOut;
    public final ShoppingCartRead read;
    public final ShoppingCartPresentation saved;

    public final ShoppingCartUiState copy(ShoppingCartPresentation shoppingCartPresentation, ShoppingCartRead shoppingCartRead, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(shoppingCartRead, 1);
        return new ShoppingCartUiState(shoppingCartPresentation, shoppingCartRead, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartUiState) {
                ShoppingCartUiState shoppingCartUiState = (ShoppingCartUiState) obj;
                if (!C7384Etj.areEqual(this.saved, shoppingCartUiState.saved) || !C7384Etj.areEqual(this.read, shoppingCartUiState.read) || this.isCheckingOut != shoppingCartUiState.isCheckingOut || this.checkoutFailed != shoppingCartUiState.checkoutFailed || this.checkoutSucceeded != shoppingCartUiState.checkoutSucceeded) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingCartUiState(ShoppingCartPresentation shoppingCartPresentation, ShoppingCartRead shoppingCartRead, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : shoppingCartPresentation, (i & 2) != 0 ? ShoppingCartRead.Loading.INSTANCE : shoppingCartRead, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), C3cI.A1S(i, z3));
    }

    public static /* synthetic */ ShoppingCartUiState copy$default(ShoppingCartUiState shoppingCartUiState, ShoppingCartPresentation shoppingCartPresentation, ShoppingCartRead shoppingCartRead, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingCartPresentation = shoppingCartUiState.saved;
        }
        if ((i & 2) != 0) {
            shoppingCartRead = shoppingCartUiState.read;
        }
        if ((i & 4) != 0) {
            z = shoppingCartUiState.isCheckingOut;
        }
        if ((i & 8) != 0) {
            z2 = shoppingCartUiState.checkoutFailed;
        }
        if ((i & 16) != 0) {
            z3 = shoppingCartUiState.checkoutSucceeded;
        }
        return shoppingCartUiState.copy(shoppingCartPresentation, shoppingCartRead, z, z2, z3);
    }

    public final ShoppingCartPresentation component1() {
        return this.saved;
    }

    public final ShoppingCartRead component2() {
        return this.read;
    }

    public final boolean component3() {
        return this.isCheckingOut;
    }

    public final boolean component4() {
        return this.checkoutFailed;
    }

    public final boolean component5() {
        return this.checkoutSucceeded;
    }

    public final boolean getCheckoutFailed() {
        return this.checkoutFailed;
    }

    public final boolean getCheckoutSucceeded() {
        return this.checkoutSucceeded;
    }

    public final ShoppingCartRead getRead() {
        return this.read;
    }

    public final ShoppingCartPresentation getSaved() {
        return this.saved;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.read, AnonymousClass006.A0D(this.saved) * 31), this.isCheckingOut), this.checkoutFailed), this.checkoutSucceeded);
    }

    public final boolean isCheckingOut() {
        return this.isCheckingOut;
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCartUiState(ShoppingCartPresentation shoppingCartPresentation, ShoppingCartRead shoppingCartRead, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(shoppingCartRead, 1);
        this.saved = shoppingCartPresentation;
        this.read = shoppingCartRead;
        this.isCheckingOut = z;
        this.checkoutFailed = z2;
        this.checkoutSucceeded = z3;
    }

    public ShoppingCartUiState() {
        this(null, ShoppingCartRead.Loading.INSTANCE, false, false, false);
    }
}
