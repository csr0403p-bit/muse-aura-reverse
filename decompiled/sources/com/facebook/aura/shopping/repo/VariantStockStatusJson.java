package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VariantStockStatusJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String product_id;
    public final String stock_status;

    public final class Companion {
        public final C9hr<VariantStockStatusJson> serializer() {
            return VariantStockStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VariantStockStatusJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.product_id = str;
        this.stock_status = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(VariantStockStatusJson variantStockStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(variantStockStatusJson.product_id)) {
            c9j5.AAV(variantStockStatusJson.product_id, c9iZ, 0);
        }
        if (zAfR || variantStockStatusJson.stock_status != null) {
            c9j5.AAP(variantStockStatusJson.stock_status, C07779iq.A01, c9iZ, 1);
        }
    }

    public final VariantStockStatusJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new VariantStockStatusJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantStockStatusJson) {
                VariantStockStatusJson variantStockStatusJson = (VariantStockStatusJson) obj;
                if (!C7384Etj.areEqual(this.product_id, variantStockStatusJson.product_id) || !C7384Etj.areEqual(this.stock_status, variantStockStatusJson.stock_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VariantStockStatusJson copy$default(VariantStockStatusJson variantStockStatusJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantStockStatusJson.product_id;
        }
        if ((i & 2) != 0) {
            str2 = variantStockStatusJson.stock_status;
        }
        C7384Etj.A0Y(str, 0);
        return new VariantStockStatusJson(str, str2);
    }

    public final String component1() {
        return this.product_id;
    }

    public final String component2() {
        return this.stock_status;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getStock_status() {
        return this.stock_status;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.product_id) + AnonymousClass006.A0G(this.stock_status);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VariantStockStatusJson(int i, String str, String str2, C2hx c2hx) {
        this.product_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.stock_status = null;
        } else {
            this.stock_status = str2;
        }
    }

    public /* synthetic */ VariantStockStatusJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public VariantStockStatusJson() {
        this("", null);
    }
}
