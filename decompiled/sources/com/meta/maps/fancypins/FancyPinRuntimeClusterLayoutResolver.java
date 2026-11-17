package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterLayoutResolver {
    public final FancyPinLayoutDataSink layoutEngine;
    public FancyPinRuntimeClusterCatalog registeredCatalog;

    public FancyPinRuntimeClusterLayoutResolver(FancyPinLayoutDataSink fancyPinLayoutDataSink) {
        C7384Etj.A0Y(fancyPinLayoutDataSink, 0);
        this.layoutEngine = fancyPinLayoutDataSink;
    }

    private final void registerCatalogIfNeeded(FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog) {
        if (this.registeredCatalog != fancyPinRuntimeClusterCatalog) {
            this.registeredCatalog = null;
            for (FancyPinClusterBlueprint fancyPinClusterBlueprint : fancyPinRuntimeClusterCatalog.blueprints) {
                this.layoutEngine.registerBlueprint(fancyPinClusterBlueprint.id, fancyPinClusterBlueprint.toJson());
            }
            this.registeredCatalog = fancyPinRuntimeClusterCatalog;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinRuntimeClusterLayoutSnapshot resolve$default(FancyPinRuntimeClusterLayoutResolver fancyPinRuntimeClusterLayoutResolver, FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = C0881AGi.A00;
        }
        return fancyPinRuntimeClusterLayoutResolver.resolve(fancyPinRuntimeClusterCatalog, list, list2);
    }

    public final FancyPinRuntimeClusterLayoutSnapshot resolve(FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog, List<FancyPinRuntimeClusterPresentation> list, List<PinMeasurement> list2) {
        AnonymousClass005.A0x(fancyPinRuntimeClusterCatalog, list, list2);
        registerCatalogIfNeeded(fancyPinRuntimeClusterCatalog);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation : list) {
            linkedHashMapA0j.put(fancyPinRuntimeClusterPresentation.pin.id, fancyPinRuntimeClusterPresentation.blueprint.id);
        }
        this.layoutEngine.updatePins(linkedHashMapA0j);
        if (!list2.isEmpty()) {
            this.layoutEngine.updateMeasurements(list2);
        }
        List<FancyPinClusterBlueprint> list3 = fancyPinRuntimeClusterCatalog.blueprints;
        HashSet hashSetA13 = C60O.A13();
        for (FancyPinClusterBlueprint fancyPinClusterBlueprint : list3) {
            String str = fancyPinClusterBlueprint.id;
            if (FancyPinRuntimeClusterLayoutResolverKt.hasAutoSizedPart(fancyPinClusterBlueprint) && str != null) {
                hashSetA13.add(str);
            }
        }
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation2 : list) {
            String str2 = fancyPinRuntimeClusterPresentation2.blueprint.id;
            if (hashSetA13.contains(str2) || linkedHashMapA0j2.putIfAbsent(str2, fancyPinRuntimeClusterPresentation2.pin.id) == null) {
                arrayListA0h.add(fancyPinRuntimeClusterPresentation2.state);
            }
        }
        List<PinLayout> listSolveLayouts = this.layoutEngine.solveLayouts(arrayListA0h);
        LinkedHashMap linkedHashMapA0j3 = C3cG.A0j();
        for (PinLayout pinLayout : listSolveLayouts) {
            linkedHashMapA0j3.put(pinLayout.id, pinLayout);
        }
        LinkedHashMap linkedHashMapA0j4 = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j2);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            Object obj = linkedHashMapA0j3.get(entryA0l.getValue());
            if (obj != null) {
                linkedHashMapA0j4.put(key, obj);
            }
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation3 : list) {
            String str3 = fancyPinRuntimeClusterPresentation3.blueprint.id;
            if (hashSetA13.contains(str3)) {
                Object obj2 = linkedHashMapA0j3.get(fancyPinRuntimeClusterPresentation3.pin.id);
                if (obj2 != null) {
                    arrayListA0t.add(obj2);
                    arrayListA0h2.add(obj2);
                }
            } else {
                PinLayout pinLayout2 = (PinLayout) linkedHashMapA0j4.get(str3);
                if (pinLayout2 != null) {
                    arrayListA0t.add(FancyPinRuntimeClusterLayoutResolverKt.copyForPin(pinLayout2, fancyPinRuntimeClusterPresentation3.pin.id));
                }
            }
        }
        return new FancyPinRuntimeClusterLayoutSnapshot(arrayListA0t, arrayListA0h2);
    }
}
