package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class OwnedVariantMeasurement {
    public static final Companion Companion = new Companion();
    public final String id;
    public final LinkedHashMap<String, OwnedPartMeasurement> parts;

    public final class Companion {
        public final OwnedVariantMeasurement from(VariantMeasurement variantMeasurement) {
            C7384Etj.A0Y(variantMeasurement, 0);
            String str = variantMeasurement.id;
            Map<String, PartMeasurement> map = variantMeasurement.parts;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                linkedHashMapA0j.put(entryA0l.getKey(), OwnedPartMeasurement.Companion.from((PartMeasurement) entryA0l.getValue()));
            }
            return new OwnedVariantMeasurement(str, linkedHashMapA0j);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final VariantMeasurement materialize() {
        String str = this.id;
        LinkedHashMap<String, OwnedPartMeasurement> linkedHashMap = this.parts;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMap);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            linkedHashMapA0j.put(entryA0l.getKey(), ((OwnedPartMeasurement) entryA0l.getValue()).materialize());
        }
        return new VariantMeasurement(str, linkedHashMapA0j);
    }

    public OwnedVariantMeasurement(String str, LinkedHashMap<String, OwnedPartMeasurement> linkedHashMap) {
        AnonymousClass003.A0u(str, linkedHashMap);
        this.id = str;
        this.parts = linkedHashMap;
    }
}
