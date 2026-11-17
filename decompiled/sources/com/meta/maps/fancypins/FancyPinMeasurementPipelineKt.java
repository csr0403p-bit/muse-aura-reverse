package com.meta.maps.fancypins;

import X.A3q;
import X.AbstractC7611F5y;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.FGI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class FancyPinMeasurementPipelineKt {
    public static final boolean hasAutoSizedPart(FancyPinBlueprint fancyPinBlueprint) {
        List<FancyPinVariant> list = fancyPinBlueprint.variants;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<FancyPinVariant> it = list.iterator();
            while (it.hasNext()) {
                List<FancyPinPart> list2 = it.next().parts;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<FancyPinPart> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().size.constraint == SizeConstraint.AUTO) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final FancyPin measurementCopy(FancyPin fancyPin) {
        return AbstractC7611F5y.A0P(fancyPin);
    }

    public static final void validateCompleteMeasurements(List<FancyPin> list, Map<String, FancyPinBlueprint> map, List<PinMeasurement> list2) {
        Set<String> setKeySet;
        Map<String, PartMeasurement> map2;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list2));
        for (PinMeasurement pinMeasurement : list2) {
            linkedHashMapA15.put(pinMeasurement.id, pinMeasurement);
        }
        for (FancyPin fancyPin : list) {
            FancyPinBlueprint fancyPinBlueprint = map.get(fancyPin.blueprintId);
            if (fancyPinBlueprint == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            FancyPinBlueprint fancyPinBlueprint2 = fancyPinBlueprint;
            Object obj = linkedHashMapA15.get(fancyPin.id);
            if (obj == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            PinMeasurement pinMeasurement2 = (PinMeasurement) obj;
            for (FancyPinVariant fancyPinVariant : fancyPinBlueprint2.variants) {
                List<FancyPinPart> list3 = fancyPinVariant.parts;
                ArrayList arrayListA0h = C3cG.A0h();
                for (FancyPinPart fancyPinPart : list3) {
                    if (fancyPinPart.size.constraint == SizeConstraint.AUTO) {
                        arrayListA0h.add(fancyPinPart);
                    }
                }
                HashSet hashSetA13 = C60O.A13();
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    hashSetA13.add(((FancyPinPart) it.next()).id);
                }
                VariantMeasurement variantMeasurement = pinMeasurement2.variants.get(fancyPinVariant.id);
                if (variantMeasurement == null || (map2 = variantMeasurement.parts) == null || (setKeySet = map2.keySet()) == null) {
                    setKeySet = A3q.A00;
                }
                if (!setKeySet.containsAll(hashSetA13)) {
                    throw C3cG.A0Q(FGI.A0h("Missing AUTO measurement for pin '", fancyPin.id, "', variant '", fancyPinVariant.id, "'"));
                }
            }
        }
    }
}
