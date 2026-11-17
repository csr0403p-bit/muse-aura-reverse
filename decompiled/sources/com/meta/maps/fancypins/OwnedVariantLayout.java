package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import com.meta.maps.fancypins.OwnedPartLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class OwnedVariantLayout {
    public static final Companion Companion = new Companion();
    public final OwnedRect boundingBox;
    public final String id;
    public final List<OwnedPartLayout> layout;

    public final class Companion {
        public final OwnedVariantLayout from(VariantLayout variantLayout) {
            C7384Etj.A0Y(variantLayout, 0);
            String str = variantLayout.id;
            List<PartLayout> list = variantLayout.layout;
            OwnedPartLayout.Companion companion = OwnedPartLayout.Companion;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<PartLayout> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(companion.from(it.next()));
            }
            return new OwnedVariantLayout(str, arrayListA0i, OwnedRect.Companion.from(variantLayout.boundingBox));
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final VariantLayout materialize() {
        String str = this.id;
        List<OwnedPartLayout> list = this.layout;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<OwnedPartLayout> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().materialize());
        }
        return new VariantLayout(str, arrayListA0i, this.boundingBox.materialize());
    }

    public OwnedVariantLayout(String str, List<OwnedPartLayout> list, OwnedRect ownedRect) {
        AnonymousClass005.A0x(str, list, ownedRect);
        this.id = str;
        this.layout = list;
        this.boundingBox = ownedRect;
    }
}
