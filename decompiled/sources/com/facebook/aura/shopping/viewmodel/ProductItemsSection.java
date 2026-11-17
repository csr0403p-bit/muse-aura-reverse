package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;

/* loaded from: classes4.dex */
public final class ProductItemsSection extends C06G {
    public static final int $stable = 0;
    public final String kind;
    public final String label;
    public final String presentationEventId;
    public final String presentationId;
    public final AHD<ShoppingResultProductUiModel> products;
    public final String subtitle;
    public final String widgetId;

    public ProductItemsSection(String str, String str2, String str3, String str4, AHD<ShoppingResultProductUiModel> ahd, String str5, String str6) {
        AnonymousClass002.A1E(ahd, 4, str6);
        this.label = str;
        this.subtitle = str2;
        this.presentationId = str3;
        this.presentationEventId = str4;
        this.products = ahd;
        this.widgetId = str5;
        this.kind = str6;
    }

    public final ProductItemsSection copy(String str, String str2, String str3, String str4, AHD<ShoppingResultProductUiModel> ahd, String str5, String str6) {
        AnonymousClass002.A1E(ahd, 4, str6);
        return new ProductItemsSection(str, str2, str3, str4, ahd, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductItemsSection) {
                ProductItemsSection productItemsSection = (ProductItemsSection) obj;
                if (!C7384Etj.areEqual(this.label, productItemsSection.label) || !C7384Etj.areEqual(this.subtitle, productItemsSection.subtitle) || !C7384Etj.areEqual(this.presentationId, productItemsSection.presentationId) || !C7384Etj.areEqual(this.presentationEventId, productItemsSection.presentationEventId) || !C7384Etj.areEqual(this.products, productItemsSection.products) || !C7384Etj.areEqual(this.widgetId, productItemsSection.widgetId) || !C7384Etj.areEqual(this.kind, productItemsSection.kind)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductItemsSection copy$default(ProductItemsSection productItemsSection, String str, String str2, String str3, String str4, AHD ahd, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productItemsSection.label;
        }
        if ((i & 2) != 0) {
            str2 = productItemsSection.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = productItemsSection.presentationId;
        }
        if ((i & 8) != 0) {
            str4 = productItemsSection.presentationEventId;
        }
        if ((i & 16) != 0) {
            ahd = productItemsSection.products;
        }
        if ((i & 32) != 0) {
            str5 = productItemsSection.widgetId;
        }
        if ((i & 64) != 0) {
            str6 = productItemsSection.kind;
        }
        return productItemsSection.copy(str, str2, str3, str4, ahd, str5, str6);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.presentationId;
    }

    public final String component4() {
        return this.presentationEventId;
    }

    public final AHD<ShoppingResultProductUiModel> component5() {
        return this.products;
    }

    public final String component6() {
        return this.widgetId;
    }

    public final String component7() {
        return this.kind;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPresentationEventId() {
        return this.presentationEventId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final AHD<ShoppingResultProductUiModel> getProducts() {
        return this.products;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.kind, (AnonymousClass005.A0F(this.products, ((((((AnonymousClass006.A0G(this.label) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.presentationId)) * 31) + AnonymousClass006.A0G(this.presentationEventId)) * 31) + AnonymousClass005.A0H(this.widgetId)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
