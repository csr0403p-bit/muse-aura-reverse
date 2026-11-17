package com.facebook.aura.shopping.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchShoppingSeedStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public volatile SeededCollection pendingCollection;
    public volatile ShoppingResultProduct pendingProduct;
    public volatile SeededResults pendingResults;

    public final class SeededCollection extends C06G {
        public final String collectionId;
        public final int initialIndex;
        public final List<ShoppingResultProduct> products;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SeededCollection) {
                    SeededCollection seededCollection = (SeededCollection) obj;
                    if (!C7384Etj.areEqual(this.collectionId, seededCollection.collectionId) || !C7384Etj.areEqual(this.products, seededCollection.products) || this.initialIndex != seededCollection.initialIndex) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SeededCollection copy$default(SeededCollection seededCollection, String str, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = seededCollection.collectionId;
            }
            if ((i2 & 2) != 0) {
                list = seededCollection.products;
            }
            if ((i2 & 4) != 0) {
                i = seededCollection.initialIndex;
            }
            return seededCollection.copy(str, list, i);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final List<ShoppingResultProduct> component2() {
            return this.products;
        }

        public final int component3() {
            return this.initialIndex;
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final int getInitialIndex() {
            return this.initialIndex;
        }

        public final List<ShoppingResultProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.products, AnonymousClass001.A0G(this.collectionId)) + this.initialIndex;
        }

        public SeededCollection(String str, List<ShoppingResultProduct> list, int i) {
            AnonymousClass003.A0u(str, list);
            this.collectionId = str;
            this.products = list;
            this.initialIndex = i;
        }

        public final SeededCollection copy(String str, List<ShoppingResultProduct> list, int i) {
            AnonymousClass003.A0u(str, list);
            return new SeededCollection(str, list, i);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SeededResults extends C06G {
        public final String messageId;
        public final String presentationId;
        public final ShoppingResultsPresentation results;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SeededResults) {
                    SeededResults seededResults = (SeededResults) obj;
                    if (!C7384Etj.areEqual(this.messageId, seededResults.messageId) || !C7384Etj.areEqual(this.presentationId, seededResults.presentationId) || !C7384Etj.areEqual(this.results, seededResults.results)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SeededResults copy$default(SeededResults seededResults, String str, String str2, ShoppingResultsPresentation shoppingResultsPresentation, int i, Object obj) {
            if ((i & 1) != 0) {
                str = seededResults.messageId;
            }
            if ((i & 2) != 0) {
                str2 = seededResults.presentationId;
            }
            if ((i & 4) != 0) {
                shoppingResultsPresentation = seededResults.results;
            }
            return seededResults.copy(str, str2, shoppingResultsPresentation);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.presentationId;
        }

        public final ShoppingResultsPresentation component3() {
            return this.results;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getPresentationId() {
            return this.presentationId;
        }

        public final ShoppingResultsPresentation getResults() {
            return this.results;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.results, (AnonymousClass001.A0G(this.messageId) + AnonymousClass006.A0G(this.presentationId)) * 31);
        }

        public SeededResults(String str, String str2, ShoppingResultsPresentation shoppingResultsPresentation) {
            AnonymousClass003.A0v(str, shoppingResultsPresentation);
            this.messageId = str;
            this.presentationId = str2;
            this.results = shoppingResultsPresentation;
        }

        public final SeededResults copy(String str, String str2, ShoppingResultsPresentation shoppingResultsPresentation) {
            AnonymousClass003.A0v(str, shoppingResultsPresentation);
            return new SeededResults(str, str2, shoppingResultsPresentation);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.pendingProduct = null;
        this.pendingResults = null;
        this.pendingCollection = null;
    }

    public final synchronized SeededCollection consumeCollection(String str) {
        SeededCollection seededCollection;
        C7384Etj.A0Y(str, 0);
        SeededCollection seededCollection2 = this.pendingCollection;
        seededCollection = null;
        if (seededCollection2 != null && str.equals(seededCollection2.collectionId)) {
            this.pendingCollection = null;
            seededCollection = seededCollection2;
        }
        return seededCollection;
    }

    public final synchronized ShoppingResultProduct consumeProduct(String str) {
        ShoppingResultProduct shoppingResultProduct;
        C7384Etj.A0Y(str, 0);
        ShoppingResultProduct shoppingResultProduct2 = this.pendingProduct;
        shoppingResultProduct = null;
        if (shoppingResultProduct2 != null && str.equals(ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct2))) {
            this.pendingProduct = null;
            shoppingResultProduct = shoppingResultProduct2;
        }
        return shoppingResultProduct;
    }

    public final synchronized ShoppingResultsPresentation consumeResults(String str, String str2) {
        ShoppingResultsPresentation shoppingResultsPresentation;
        C7384Etj.A0Y(str, 0);
        SeededResults seededResults = this.pendingResults;
        shoppingResultsPresentation = null;
        if (seededResults != null && str.equals(seededResults.messageId) && C7384Etj.areEqual(seededResults.presentationId, str2)) {
            this.pendingResults = null;
            shoppingResultsPresentation = seededResults.results;
        }
        return shoppingResultsPresentation;
    }

    public final void rememberProduct(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        this.pendingProduct = shoppingResultProduct;
    }

    public final class Companion {
        public final HatchShoppingSeedStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchShoppingSeedStore) abstractC3358CGz.A03(HatchShoppingSeedStore.class, HatchShoppingSeedStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void rememberCollection(String str, List<ShoppingResultProduct> list, int i) {
        AnonymousClass003.A0u(str, list);
        this.pendingCollection = new SeededCollection(str, list, i);
    }

    public final void rememberResults(String str, String str2, ShoppingResultsPresentation shoppingResultsPresentation) {
        AnonymousClass003.A0v(str, shoppingResultsPresentation);
        this.pendingResults = new SeededResults(str, str2, shoppingResultsPresentation);
    }

    public /* synthetic */ HatchShoppingSeedStore(C06H c06h) {
    }

    public HatchShoppingSeedStore() {
    }
}
