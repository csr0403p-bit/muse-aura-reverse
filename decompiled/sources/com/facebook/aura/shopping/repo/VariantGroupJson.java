package com.facebook.aura.shopping.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
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
import com.facebook.aura.shopping.model.PdpVariantGroup;
import com.facebook.aura.shopping.model.PdpVariantOption;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VariantGroupJson extends C06G {
    public final String dimension;
    public final String display_name;
    public final List<VariantOptionJson> options;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, VariantGroupJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<VariantGroupJson> serializer() {
            return VariantGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantGroupJson) {
                VariantGroupJson variantGroupJson = (VariantGroupJson) obj;
                if (!C7384Etj.areEqual(this.dimension, variantGroupJson.dimension) || !C7384Etj.areEqual(this.display_name, variantGroupJson.display_name) || !C7384Etj.areEqual(this.options, variantGroupJson.options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariantGroupJson copy$default(VariantGroupJson variantGroupJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantGroupJson.dimension;
        }
        if ((i & 2) != 0) {
            str2 = variantGroupJson.display_name;
        }
        if ((i & 4) != 0) {
            list = variantGroupJson.options;
        }
        return variantGroupJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(VariantGroupJson variantGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(variantGroupJson.dimension)) {
            c9j5.AAV(variantGroupJson.dimension, c9iZ, 0);
        }
        if (zAfR || !"".equals(variantGroupJson.display_name)) {
            c9j5.AAV(variantGroupJson.display_name, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(variantGroupJson.options)) {
            c9j5.AAQ(variantGroupJson.options, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.dimension;
    }

    public final String component2() {
        return this.display_name;
    }

    public final List<VariantOptionJson> component3() {
        return this.options;
    }

    public final String getDimension() {
        return this.dimension;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final List<VariantOptionJson> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.options, AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.dimension)));
    }

    public VariantGroupJson(String str, String str2, List<VariantOptionJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.dimension = str;
        this.display_name = str2;
        this.options = list;
    }

    public final VariantGroupJson copy(String str, String str2, List<VariantOptionJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new VariantGroupJson(str, str2, list);
    }

    public final PdpVariantGroup toDomain() {
        Object next;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        List<VariantOptionJson> list = this.options;
        ArrayList arrayListA0h = C3cG.A0h();
        for (VariantOptionJson variantOptionJson : list) {
            List listAsList = Arrays.asList(variantOptionJson.value, variantOptionJson.label, (String) AbstractC0878AGe.A0G(variantOptionJson.product_ids));
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(AnonymousClass005.A0j(it));
                if (strTrimToNonEmpty != null) {
                    arrayListA0h2.add(strTrimToNonEmpty);
                }
            }
            Iterator it2 = arrayListA0h2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (!linkedHashSetA0k.contains(next)) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                linkedHashSetA0k.add(str);
                PdpVariantOption domain = variantOptionJson.toDomain(str);
                if (domain != null) {
                    arrayListA0h.add(domain);
                }
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new PdpVariantGroup(this.dimension, this.display_name, arrayListA0h);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VariantGroupJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.dimension = "";
        } else {
            this.dimension = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.options = C0881AGi.A00;
        } else {
            this.options = list;
        }
    }

    public /* synthetic */ VariantGroupJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i));
    }

    public VariantGroupJson() {
        this("", "", C0881AGi.A00);
    }
}
