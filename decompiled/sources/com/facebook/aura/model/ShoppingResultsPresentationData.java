package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResultsPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingResultsPresentation shoppingResults;

    public final class Companion {
        public final C9hr<ShoppingResultsPresentationData> serializer() {
            return ShoppingResultsPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShoppingResultsPresentationData copy(ShoppingResultsPresentation shoppingResultsPresentation) {
        C7384Etj.A0Y(shoppingResultsPresentation, 0);
        return new ShoppingResultsPresentationData(shoppingResultsPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingResultsPresentationData) && C7384Etj.areEqual(this.shoppingResults, ((ShoppingResultsPresentationData) obj).shoppingResults));
    }

    public /* synthetic */ ShoppingResultsPresentationData(int i, ShoppingResultsPresentation shoppingResultsPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingResultsPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shoppingResults = shoppingResultsPresentation;
    }

    public static /* synthetic */ ShoppingResultsPresentationData copy$default(ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingResultsPresentation shoppingResultsPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultsPresentation = shoppingResultsPresentationData.shoppingResults;
        }
        C7384Etj.A0Y(shoppingResultsPresentation, 0);
        return new ShoppingResultsPresentationData(shoppingResultsPresentation);
    }

    public final ShoppingResultsPresentation component1() {
        return this.shoppingResults;
    }

    public final ShoppingResultsPresentation getShoppingResults() {
        return this.shoppingResults;
    }

    public int hashCode() {
        return this.shoppingResults.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingResultsPresentationData(ShoppingResultsPresentation shoppingResultsPresentation) {
        C7384Etj.A0Y(shoppingResultsPresentation, 0);
        this.shoppingResults = shoppingResultsPresentation;
    }
}
