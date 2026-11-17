package com.meta.maps.fancypins;

import X.ADq;
import X.AbstractC0885AGm;
import X.AbstractC7611F5y;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BNt;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import com.meta.maps.core.GeoCoordinates;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FancyPinViewRegistryKt {
    public static final boolean hasSameContent(VariantLayout variantLayout, VariantLayout variantLayout2) {
        if (!C7384Etj.areEqual(variantLayout.id, variantLayout2.id) || !hasSameContent(variantLayout.boundingBox, variantLayout2.boundingBox) || variantLayout.layout.size() != variantLayout2.layout.size()) {
            return false;
        }
        ADq aDqA12 = AbstractC0885AGm.A12(variantLayout.layout);
        if ((aDqA12 instanceof Collection) && C3cG.A1N(aDqA12)) {
            return true;
        }
        Iterator<Integer> it = aDqA12.iterator();
        while (it.hasNext()) {
            int iA00 = ((BNt) it).A00();
            if (!hasSameContent(variantLayout.layout.get(iA00), variantLayout2.layout.get(iA00))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean matchesUnchanged(FancyPinPresentation fancyPinPresentation, FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        return hasSameContent(fancyPinPresentation.pin, fancyPin) && fancyPinPresentation.blueprint == fancyPinBlueprint && C7384Etj.areEqual(fancyPinPresentation.activeVariantId, str) && hasSameContent(fancyPinPresentation.layout, pinLayout) && fancyPinPresentation.registrationRevision == j && C7384Etj.areEqual(fancyPinPresentation.runtimeCluster, fancyPinRuntimeClusterContext);
    }

    public static /* synthetic */ boolean matchesUnchanged$default(FancyPinPresentation fancyPinPresentation, FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, Object obj) {
        if ((i & 32) != 0) {
            fancyPinRuntimeClusterContext = null;
        }
        return matchesUnchanged(fancyPinPresentation, fancyPin, fancyPinBlueprint, str, pinLayout, j, fancyPinRuntimeClusterContext);
    }

    public static final PinLayout ownedCopy(PinLayout pinLayout) {
        String str = pinLayout.id;
        Map<String, VariantLayout> map = pinLayout.variants;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            VariantLayout variantLayout = (VariantLayout) entryA0l.getValue();
            String str2 = variantLayout.id;
            List<PartLayout> list = variantLayout.layout;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (PartLayout partLayout : list) {
                String str3 = partLayout.id;
                LayoutRect layoutRect = partLayout.rect;
                arrayListA0i.add(new PartLayout(str3, new LayoutRect(layoutRect.x, layoutRect.y, layoutRect.width, layoutRect.height), partLayout.zIndex, partLayout.alpha, partLayout.placementIndex));
            }
            LayoutRect layoutRect2 = variantLayout.boundingBox;
            linkedHashMapA0j.put(key, new VariantLayout(str2, arrayListA0i, new LayoutRect(layoutRect2.x, layoutRect2.y, layoutRect2.width, layoutRect2.height)));
        }
        return new PinLayout(str, linkedHashMapA0j);
    }

    public static final void validatePresentationLayout(FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, G0U<? super String, Boolean> g0u) {
        List<FancyPinVariant> list = fancyPinBlueprint.variants;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (FancyPinVariant fancyPinVariant : list) {
            linkedHashMapA15.put(fancyPinVariant.id, fancyPinVariant);
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        validatePresentationLayout$addFallbackClosure(linkedHashSetA0k, fancyPinBlueprint, str);
        if (!pinLayout.variants.keySet().containsAll(linkedHashSetA0k)) {
            throw C60O.A0i("Failed requirement.");
        }
        Iterator itA0n = AnonymousClass002.A0n(pinLayout.variants);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            VariantLayout variantLayout = (VariantLayout) entryA0l.getValue();
            if (!C7384Etj.areEqual(variantLayout.id, key)) {
                throw C60O.A0i("Failed requirement.");
            }
            Object obj = linkedHashMapA15.get(key);
            if (obj == null) {
                throw C60O.A0i("Required value was null.");
            }
            FancyPinVariant fancyPinVariant2 = (FancyPinVariant) obj;
            List<FancyPinPart> list2 = fancyPinVariant2.parts;
            LinkedHashMap linkedHashMapA152 = C60O.A15(AnonymousClass005.A0C(list2));
            for (FancyPinPart fancyPinPart : list2) {
                linkedHashMapA152.put(fancyPinPart.id, fancyPinPart);
            }
            if (linkedHashMapA152.size() != fancyPinVariant2.parts.size()) {
                throw C60O.A0i("Failed requirement.");
            }
            for (FancyPinPart fancyPinPart2 : fancyPinVariant2.parts) {
                if (!AnonymousClass003.A1X(fancyPinPart2.id, g0u)) {
                    throw FGI.A01("No typed registration for blueprint '", fancyPinBlueprint.id, "', part '", fancyPinPart2.id, "'");
                }
            }
            HashSet hashSetA13 = C60O.A13();
            for (PartLayout partLayout : variantLayout.layout) {
                Object obj2 = linkedHashMapA152.get(partLayout.id);
                if (obj2 == null) {
                    throw C60O.A0i("Required value was null.");
                }
                int size = ((FancyPinPart) obj2).placements.size();
                int i = partLayout.placementIndex;
                if (i < 0 || i >= size) {
                    throw C60O.A0i("Failed requirement.");
                }
                if (!hashSetA13.add(AnonymousClass002.A0p(partLayout.id, i))) {
                    throw C60O.A0i("Failed requirement.");
                }
            }
        }
    }

    public static final void validatePresentationLayout$addFallbackClosure(LinkedHashSet<String> linkedHashSet, FancyPinBlueprint fancyPinBlueprint, String str) {
        FancyPinFallbackPolicy next;
        List list;
        if (linkedHashSet.add(str)) {
            Iterator<FancyPinFallbackPolicy> it = fancyPinBlueprint.fallbackPolicies.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            } while (!C7384Etj.areEqual(next.targetVariantId, str));
            FancyPinFallbackPolicy fancyPinFallbackPolicy = next;
            if (fancyPinFallbackPolicy == null || (list = fancyPinFallbackPolicy.fallbacks) == null) {
                list = C0881AGi.A00;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                validatePresentationLayout$addFallbackClosure(linkedHashSet, fancyPinBlueprint, AnonymousClass005.A0j(it2));
            }
        }
    }

    public static final boolean hasSameContent(PinLayout pinLayout, PinLayout pinLayout2) {
        if (C7384Etj.areEqual(pinLayout.id, pinLayout2.id) && C7384Etj.areEqual(pinLayout.variants.keySet(), pinLayout2.variants.keySet())) {
            Map<String, VariantLayout> map = pinLayout.variants;
            if (!map.isEmpty()) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    VariantLayout variantLayout = (VariantLayout) entryA0l.getValue();
                    VariantLayout variantLayout2 = pinLayout2.variants.get(key);
                    if (variantLayout2 == null || !hasSameContent(variantLayout, variantLayout2)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final FancyPin ownedCopy(FancyPin fancyPin) {
        return AbstractC7611F5y.A0P(fancyPin);
    }

    public static final boolean hasSameContent(LayoutRect layoutRect, LayoutRect layoutRect2) {
        if (layoutRect.x == layoutRect2.x && layoutRect.y == layoutRect2.y && layoutRect.width == layoutRect2.width && layoutRect.height == layoutRect2.height) {
            return true;
        }
        return false;
    }

    public static final boolean hasSameContent(PartLayout partLayout, PartLayout partLayout2) {
        if (C7384Etj.areEqual(partLayout.id, partLayout2.id) && hasSameContent(partLayout.rect, partLayout2.rect) && partLayout.zIndex == partLayout2.zIndex && partLayout.alpha == partLayout2.alpha && partLayout.placementIndex == partLayout2.placementIndex) {
            return true;
        }
        return false;
    }

    public static final boolean hasSameContent(FancyPin fancyPin, FancyPin fancyPin2) {
        if (C7384Etj.areEqual(fancyPin.id, fancyPin2.id)) {
            GeoCoordinates geoCoordinates = fancyPin.coordinates;
            double d = geoCoordinates.latitude;
            GeoCoordinates geoCoordinates2 = fancyPin2.coordinates;
            if (d == geoCoordinates2.latitude && geoCoordinates.longitude == geoCoordinates2.longitude) {
                Double d2 = geoCoordinates.altitude;
                Double d3 = geoCoordinates2.altitude;
                if (d2 != null ? !(d3 == null || d2.doubleValue() != d3.doubleValue()) : d3 == null) {
                    if (C7384Etj.areEqual(fancyPin.blueprintId, fancyPin2.blueprintId) && Arrays.equals(fancyPin.data, fancyPin2.data) && fancyPin.rank == fancyPin2.rank) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
