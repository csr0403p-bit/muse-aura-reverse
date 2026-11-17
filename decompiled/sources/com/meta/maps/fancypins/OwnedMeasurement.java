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
public final class OwnedMeasurement {
    public static final Companion Companion = new Companion();
    public final String id;
    public final LinkedHashMap<String, OwnedVariantMeasurement> variants;

    public final class Companion {
        public final OwnedMeasurement from(PinMeasurement pinMeasurement) {
            C7384Etj.A0Y(pinMeasurement, 0);
            String str = pinMeasurement.id;
            Map<String, VariantMeasurement> map = pinMeasurement.variants;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                linkedHashMapA0j.put(entryA0l.getKey(), OwnedVariantMeasurement.Companion.from((VariantMeasurement) entryA0l.getValue()));
            }
            return new OwnedMeasurement(str, linkedHashMapA0j);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final String getId() {
        return this.id;
    }

    public final PinMeasurement materialize() {
        String str = this.id;
        LinkedHashMap<String, OwnedVariantMeasurement> linkedHashMap = this.variants;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMap);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            linkedHashMapA0j.put(entryA0l.getKey(), ((OwnedVariantMeasurement) entryA0l.getValue()).materialize());
        }
        return new PinMeasurement(str, linkedHashMapA0j);
    }

    public OwnedMeasurement(String str, LinkedHashMap<String, OwnedVariantMeasurement> linkedHashMap) {
        AnonymousClass003.A0u(str, linkedHashMap);
        this.id = str;
        this.variants = linkedHashMap;
    }
}
