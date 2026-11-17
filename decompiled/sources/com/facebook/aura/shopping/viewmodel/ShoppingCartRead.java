package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.shopping.model.CurrentShoppingCart;

/* loaded from: classes4.dex */
public interface ShoppingCartRead {

    public final class Failed extends C06G implements ShoppingCartRead {
        public static final int $stable = 0;
        public final boolean isRetrying;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.isRetrying == ((Failed) obj).isRetrying);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = failed.isRetrying;
            }
            return new Failed(z);
        }

        public final boolean component1() {
            return this.isRetrying;
        }

        public final Failed copy(boolean z) {
            return new Failed(z);
        }

        public int hashCode() {
            return this.isRetrying ? 1231 : 1237;
        }

        public final boolean isRetrying() {
            return this.isRetrying;
        }

        public Failed(boolean z) {
            this.isRetrying = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loaded extends C06G implements ShoppingCartRead {
        public static final int $stable = 0;
        public final CurrentShoppingCart current;
        public final ShoppingCartNavTitle navTitle;

        public Loaded(CurrentShoppingCart currentShoppingCart, ShoppingCartNavTitle shoppingCartNavTitle) {
            C7384Etj.A0Y(currentShoppingCart, 0);
            this.current = currentShoppingCart;
            this.navTitle = shoppingCartNavTitle;
        }

        public final Loaded copy(CurrentShoppingCart currentShoppingCart, ShoppingCartNavTitle shoppingCartNavTitle) {
            C7384Etj.A0Y(currentShoppingCart, 0);
            return new Loaded(currentShoppingCart, shoppingCartNavTitle);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.current, loaded.current) || !C7384Etj.areEqual(this.navTitle, loaded.navTitle)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, CurrentShoppingCart currentShoppingCart, ShoppingCartNavTitle shoppingCartNavTitle, int i, Object obj) {
            if ((i & 1) != 0) {
                currentShoppingCart = loaded.current;
            }
            if ((i & 2) != 0) {
                shoppingCartNavTitle = loaded.navTitle;
            }
            C7384Etj.A0Y(currentShoppingCart, 0);
            return new Loaded(currentShoppingCart, shoppingCartNavTitle);
        }

        public final CurrentShoppingCart component1() {
            return this.current;
        }

        public final ShoppingCartNavTitle component2() {
            return this.navTitle;
        }

        public final CurrentShoppingCart getCurrent() {
            return this.current;
        }

        public final ShoppingCartNavTitle getNavTitle() {
            return this.navTitle;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.current) + AnonymousClass006.A0D(this.navTitle);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements ShoppingCartRead {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -179593492;
        }
    }
}
