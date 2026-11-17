package com.facebook.aura.shopping.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.shopping.model.PdpImage;
import com.facebook.aura.shopping.model.PdpVariantImages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VariantImagesJson extends C06G {
    public final List<ImageJson> images;
    public final String product_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, VariantImagesJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<VariantImagesJson> serializer() {
            return VariantImagesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantImagesJson) {
                VariantImagesJson variantImagesJson = (VariantImagesJson) obj;
                if (!C7384Etj.areEqual(this.product_id, variantImagesJson.product_id) || !C7384Etj.areEqual(this.images, variantImagesJson.images)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VariantImagesJson copy$default(VariantImagesJson variantImagesJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantImagesJson.product_id;
        }
        if ((i & 2) != 0) {
            list = variantImagesJson.images;
        }
        AnonymousClass003.A0u(str, list);
        return new VariantImagesJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(VariantImagesJson variantImagesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(variantImagesJson.product_id)) {
            c9j5.AAV(variantImagesJson.product_id, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(variantImagesJson.images)) {
            c9j5.AAQ(variantImagesJson.images, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.product_id;
    }

    public final List<ImageJson> component2() {
        return this.images;
    }

    public final List<ImageJson> getImages() {
        return this.images;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.images, AnonymousClass001.A0G(this.product_id));
    }

    public final PdpVariantImages toDomain() {
        String str = this.product_id;
        List listA0a = AbstractC0878AGe.A0a(this.images, 1);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0a);
        Iterator it = listA0a.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(new PdpImage(((ImageJson) it.next()).url));
        }
        return new PdpVariantImages(str, arrayListA0i);
    }

    public VariantImagesJson(String str, List<ImageJson> list) {
        AnonymousClass003.A0u(str, list);
        this.product_id = str;
        this.images = list;
    }

    public final VariantImagesJson copy(String str, List<ImageJson> list) {
        AnonymousClass003.A0u(str, list);
        return new VariantImagesJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VariantImagesJson(int i, String str, List list, C2hx c2hx) {
        this.product_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.images = C0881AGi.A00;
        } else {
            this.images = list;
        }
    }

    public /* synthetic */ VariantImagesJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public VariantImagesJson() {
        this("", C0881AGi.A00);
    }
}
