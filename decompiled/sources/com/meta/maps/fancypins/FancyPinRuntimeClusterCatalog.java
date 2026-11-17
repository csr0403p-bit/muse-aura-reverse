package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.HxE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterCatalog {
    public final List<FancyPinClusterBlueprint> blueprints;
    public final Map<Long, Entry> entriesByIndex;
    public final long generation;

    public final class Entry {
        public final FancyPinClusterBlueprint clusterBlueprint;
        public final FancyPinBlueprint presentationBlueprint;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (!C7384Etj.areEqual(this.clusterBlueprint, entry.clusterBlueprint) || !C7384Etj.areEqual(this.presentationBlueprint, entry.presentationBlueprint)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Entry copy$default(Entry entry, FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint, int i, Object obj) {
            if ((i & 1) != 0) {
                fancyPinClusterBlueprint = entry.clusterBlueprint;
            }
            if ((i & 2) != 0) {
                fancyPinBlueprint = entry.presentationBlueprint;
            }
            AnonymousClass003.A0u(fancyPinClusterBlueprint, fancyPinBlueprint);
            return new Entry(fancyPinClusterBlueprint, fancyPinBlueprint);
        }

        public final FancyPinClusterBlueprint component1() {
            return this.clusterBlueprint;
        }

        public final FancyPinBlueprint component2() {
            return this.presentationBlueprint;
        }

        public final FancyPinClusterBlueprint getClusterBlueprint() {
            return this.clusterBlueprint;
        }

        public final FancyPinBlueprint getPresentationBlueprint() {
            return this.presentationBlueprint;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.presentationBlueprint, AnonymousClass005.A0E(this.clusterBlueprint));
        }

        public String toString() {
            return C3cJ.A0L(this.presentationBlueprint, ", presentationBlueprint=", C3cG.A0f(this.clusterBlueprint, "Entry(clusterBlueprint="));
        }

        public Entry(FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint) {
            AnonymousClass003.A0u(fancyPinClusterBlueprint, fancyPinBlueprint);
            this.clusterBlueprint = fancyPinClusterBlueprint;
            this.presentationBlueprint = fancyPinBlueprint;
        }

        public final Entry copy(FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint) {
            AnonymousClass003.A0u(fancyPinClusterBlueprint, fancyPinBlueprint);
            return new Entry(fancyPinClusterBlueprint, fancyPinBlueprint);
        }
    }

    public final Entry entryAt(long j) {
        return this.entriesByIndex.get(Long.valueOf(j));
    }

    public final List<FancyPinClusterBlueprint> getBlueprints() {
        return this.blueprints;
    }

    public final long getGeneration() {
        return this.generation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinRuntimeClusterCatalog(List<FancyPinClusterBlueprint> list, List<Integer> list2, long j) throws JSONException {
        AnonymousClass003.A0u(list, list2);
        this.generation = j;
        List<FancyPinClusterBlueprint> listA0X = AbstractC0878AGe.A0X(list);
        this.blueprints = listA0X;
        if (j < 0) {
            throw C60O.A0i("Runtime cluster catalog generation must be non-negative");
        }
        if (listA0X.size() != list2.size()) {
            throw C60O.A0i("Runtime cluster blueprints and stable indices must have equal size");
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinClusterBlueprint> it = listA0X.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().id);
        }
        if (hashSetA13.size() != this.blueprints.size()) {
            throw C60O.A0i("Runtime cluster blueprint ids must be unique");
        }
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (C60Q.A03(it2) < 0) {
                    throw C60O.A0i("Runtime cluster blueprint indices must be non-negative");
                }
            }
        }
        if (AbstractC0878AGe.A0g(list2).size() != list2.size()) {
            throw C60O.A0i("Runtime cluster blueprint indices must be unique");
        }
        ArrayList arrayListA0O = AbstractC0878AGe.A0O(this.blueprints, list2);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator it3 = arrayListA0O.iterator();
        while (it3.hasNext()) {
            HxE hxEA10 = C60Q.A10(it3);
            FancyPinClusterBlueprint fancyPinClusterBlueprint = (FancyPinClusterBlueprint) hxEA10.first;
            int iA0F = AnonymousClass001.A0F(hxEA10.second);
            fancyPinClusterBlueprint.toJson();
            linkedHashMapA0j.put(Long.valueOf(iA0F), new Entry(fancyPinClusterBlueprint, new FancyPinBlueprint(fancyPinClusterBlueprint.id, fancyPinClusterBlueprint.variants, fancyPinClusterBlueprint.fallbackPolicies, fancyPinClusterBlueprint.defaultVariantId)));
        }
        this.entriesByIndex = linkedHashMapA0j;
    }
}
