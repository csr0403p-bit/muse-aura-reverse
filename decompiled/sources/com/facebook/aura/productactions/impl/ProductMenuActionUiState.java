package com.facebook.aura.productactions.impl;

import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C8j5;

/* loaded from: classes4.dex */
public final class ProductMenuActionUiState {
    public static final int $stable = 0;
    public final boolean enabled;
    public final int icon;
    public final ProductMenuActionId id;
    public final boolean inFlight;
    public final int label;

    public final ProductMenuActionUiState copy(ProductMenuActionId productMenuActionId, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(productMenuActionId, 0);
        return new ProductMenuActionUiState(productMenuActionId, i, i2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductMenuActionUiState) {
                ProductMenuActionUiState productMenuActionUiState = (ProductMenuActionUiState) obj;
                if (this.id != productMenuActionUiState.id || this.label != productMenuActionUiState.label || this.icon != productMenuActionUiState.icon || this.enabled != productMenuActionUiState.enabled || this.inFlight != productMenuActionUiState.inFlight) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProductMenuActionUiState copy$default(ProductMenuActionUiState productMenuActionUiState, ProductMenuActionId productMenuActionId, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            productMenuActionId = productMenuActionUiState.id;
        }
        if ((i3 & 2) != 0) {
            i = productMenuActionUiState.label;
        }
        if ((i3 & 4) != 0) {
            i2 = productMenuActionUiState.icon;
        }
        if ((i3 & 8) != 0) {
            z = productMenuActionUiState.enabled;
        }
        if ((i3 & 16) != 0) {
            z2 = productMenuActionUiState.inFlight;
        }
        return productMenuActionUiState.copy(productMenuActionId, i, i2, z, z2);
    }

    public final ProductMenuActionId component1() {
        return this.id;
    }

    public final int component2() {
        return this.label;
    }

    public final int component3() {
        return this.icon;
    }

    public final boolean component4() {
        return this.enabled;
    }

    public final boolean component5() {
        return this.inFlight;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final ProductMenuActionId getId() {
        return this.id;
    }

    public final boolean getInFlight() {
        return this.inFlight;
    }

    public final int getLabel() {
        return this.label;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((((AnonymousClass005.A0E(this.id) + this.label) * 31) + this.icon) * 31, this.enabled), this.inFlight);
    }

    public String toString() {
        ProductMenuActionId productMenuActionId = this.id;
        int i = this.label;
        int i2 = this.icon;
        boolean z = this.enabled;
        boolean z2 = this.inFlight;
        StringBuilder sbA0f = C3cG.A0f(productMenuActionId, "ProductMenuActionUiState(id=");
        sbA0f.append(", label=");
        sbA0f.append(i);
        sbA0f.append(", icon=");
        sbA0f.append(i2);
        sbA0f.append(", enabled=");
        sbA0f.append(z);
        return C8j5.A0W(", inFlight=", sbA0f, z2);
    }

    public /* synthetic */ ProductMenuActionUiState(ProductMenuActionId productMenuActionId, int i, int i2, boolean z, boolean z2, int i3, C06H c06h) {
        this(productMenuActionId, i, i2, z, C3cI.A1S(i3, z2));
    }

    public ProductMenuActionUiState(ProductMenuActionId productMenuActionId, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(productMenuActionId, 0);
        this.id = productMenuActionId;
        this.label = i;
        this.icon = i2;
        this.enabled = z;
        this.inFlight = z2;
    }
}
