package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C3cG;
import X.C3cH;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FancyPinRuntimeClusterLayoutResolverKt {
    public static final PinLayout copyForPin(PinLayout pinLayout, String str) {
        Map<String, VariantLayout> map = pinLayout.variants;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            VariantLayout variantLayout = (VariantLayout) entryA0l.getValue();
            linkedHashMapA0j.put(key, new VariantLayout(variantLayout.id, AbstractC0878AGe.A0X(variantLayout.layout), variantLayout.boundingBox));
        }
        return new PinLayout(str, linkedHashMapA0j);
    }

    public static final boolean hasAutoSizedPart(FancyPinClusterBlueprint fancyPinClusterBlueprint) {
        List<FancyPinVariant> list = fancyPinClusterBlueprint.variants;
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
}
