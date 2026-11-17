package com.meta.maps.fancypins;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BGK;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7354EnR;
import X.C7384Etj;
import X.C8j4;
import X.FGI;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.settings.MC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FancyPinSourceState {
    public static final Companion Companion = new Companion();
    public static final FancyPinSourceState EMPTY = new FancyPinSourceState(C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), C3cG.A0j(), 0);
    public final LinkedHashMap<String, String> activeVariantsByPinId;
    public final LinkedHashMap<String, FancyPinBlueprint> blueprintsById;
    public final long catalogGeneration;
    public final LinkedHashMap<String, OwnedLayout> layoutsByPinId;
    public final LinkedHashMap<String, OwnedMeasurement> measurementsByPinId;
    public final LinkedHashMap<String, OwnedPin> pinsById;
    public final LinkedHashMap<String, Integer> rankOverridesByPinId;
    public final LinkedHashMap<String, Long> registrationRevisionsByBlueprintId;
    public final LinkedHashMap<String, Float> zOrderOverridesByPinId;

    public final class Companion {
        public final FancyPinSourceState getEMPTY() {
            return FancyPinSourceState.EMPTY;
        }

        public Companion() {
        }

        public final FancyPinSourceState create(long j, List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, List<PinLayout> list4, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, Map<String, Long> map4) {
            C7384Etj.A0Y(list, 1);
            AnonymousClass005.A16(list2, list3, list4, map, 2);
            AnonymousClass005.A13(map2, map3, map4, 6);
            if (j > 0) {
                LinkedHashMap<String, OwnedPin> linkedHashMapOwnedPinsById = FancyPinSourceStateStoreKt.ownedPinsById(list);
                LinkedHashMap linkedHashMapUniqueById = FancyPinSourceStateStoreKt.uniqueById(list2, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinSourceState$Companion$create$blueprintsById$1
                    @Override // X.C7354EnR, X.InterfaceC7356EnT
                    public Object get(Object obj) {
                        return ((FancyPinBlueprint) obj).id;
                    }
                }, "blueprint", FancyPinSourceState$Companion$create$blueprintsById$2.INSTANCE);
                if (linkedHashMapUniqueById.keySet().containsAll(map4.keySet())) {
                    Set setA17 = AbstractC7608F5v.A17(linkedHashMapUniqueById);
                    LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                    for (Object obj : setA17) {
                        linkedHashMapA0j.put(obj, Long.valueOf(C60P.A01(BV4.A0b(obj, map4))));
                    }
                    LinkedHashMap<String, OwnedMeasurement> linkedHashMapOwnedMeasurementsById = FancyPinSourceStateStoreKt.ownedMeasurementsById(list3);
                    LinkedHashMap<String, OwnedLayout> linkedHashMapOwnedLayoutsById = FancyPinSourceStateStoreKt.ownedLayoutsById(list4);
                    Iterator itA0i = C3cG.A0i(linkedHashMapOwnedPinsById);
                    while (itA0i.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0i);
                        String strA0t = C60O.A0t(entryA0l);
                        OwnedPin ownedPin = (OwnedPin) entryA0l.getValue();
                        if (!linkedHashMapUniqueById.containsKey(ownedPin.blueprintId)) {
                            throw FGI.A01("FancyPin '", strA0t, "' references unknown blueprint '", ownedPin.blueprintId, "'");
                        }
                    }
                    Iterator it = BGK.A01(map3.keySet(), BGK.A01(map2.keySet(), BGK.A01(map.keySet(), BGK.A01(AbstractC7608F5v.A17(linkedHashMapOwnedLayoutsById), AbstractC7608F5v.A17(linkedHashMapOwnedMeasurementsById))))).iterator();
                    while (it.hasNext()) {
                        String str = (String) C7384Etj.A0F(it);
                        if (!linkedHashMapOwnedPinsById.containsKey(str)) {
                            throw C60Q.A0V("Source state references unknown FancyPin '", str, "'");
                        }
                    }
                    Iterator itA0n = AnonymousClass002.A0n(map);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l2 = C3cH.A0l(itA0n);
                        String strA0t2 = C60O.A0t(entryA0l2);
                        String str2 = (String) entryA0l2.getValue();
                        OwnedPin ownedPin2 = linkedHashMapOwnedPinsById.get(strA0t2);
                        if (ownedPin2 == null) {
                            throw C3cG.A0Q("Required value was null.");
                        }
                        Object obj2 = linkedHashMapUniqueById.get(ownedPin2.blueprintId);
                        if (obj2 != null) {
                            if (!((FancyPinBlueprint) obj2).variantIds.contains(str2)) {
                                throw FGI.A01("FancyPin '", strA0t2, "' requests unknown variant '", str2, "'");
                            }
                        } else {
                            throw C3cG.A0Q("Required value was null.");
                        }
                    }
                    Collection<Float> collectionValues = map3.values();
                    if (collectionValues == null || !collectionValues.isEmpty()) {
                        Iterator<Float> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            if (Math.abs(AnonymousClass001.A02(it2.next())) > Float.MAX_VALUE) {
                                throw C60O.A0i("FancyPin z-order must be finite");
                            }
                        }
                    }
                    return new FancyPinSourceState(linkedHashMapOwnedPinsById, linkedHashMapUniqueById, linkedHashMapOwnedMeasurementsById, linkedHashMapOwnedLayoutsById, AbstractC7607F5u.A14(map), AbstractC7607F5u.A14(map2), AbstractC7607F5u.A14(map3), linkedHashMapA0j, j);
                }
                throw C60O.A0i("Registration revisions reference an unknown FancyPin blueprint");
            }
            throw C60O.A0i("FancyPin catalog generation must be positive");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ FancyPinSourceState copy$default(FancyPinSourceState fancyPinSourceState, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6, LinkedHashMap linkedHashMap7, LinkedHashMap linkedHashMap8, long j, int i, Object obj) {
        LinkedHashMap linkedHashMap9 = linkedHashMap;
        LinkedHashMap linkedHashMap10 = linkedHashMap2;
        LinkedHashMap linkedHashMap11 = linkedHashMap3;
        LinkedHashMap linkedHashMap12 = linkedHashMap4;
        LinkedHashMap linkedHashMap13 = linkedHashMap5;
        LinkedHashMap linkedHashMap14 = linkedHashMap6;
        LinkedHashMap linkedHashMap15 = linkedHashMap7;
        LinkedHashMap linkedHashMap16 = linkedHashMap8;
        long j2 = j;
        if ((i & 1) != 0) {
            linkedHashMap9 = fancyPinSourceState.pinsById;
        }
        if ((i & 2) != 0) {
            linkedHashMap10 = fancyPinSourceState.blueprintsById;
        }
        if ((i & 4) != 0) {
            linkedHashMap11 = fancyPinSourceState.measurementsByPinId;
        }
        if ((i & 8) != 0) {
            linkedHashMap12 = fancyPinSourceState.layoutsByPinId;
        }
        if ((i & 16) != 0) {
            linkedHashMap13 = fancyPinSourceState.activeVariantsByPinId;
        }
        if ((i & 32) != 0) {
            linkedHashMap14 = fancyPinSourceState.rankOverridesByPinId;
        }
        if ((i & 64) != 0) {
            linkedHashMap15 = fancyPinSourceState.zOrderOverridesByPinId;
        }
        if ((i & 128) != 0) {
            linkedHashMap16 = fancyPinSourceState.registrationRevisionsByBlueprintId;
        }
        if ((i & 256) != 0) {
            j2 = fancyPinSourceState.catalogGeneration;
        }
        return new FancyPinSourceState(linkedHashMap9, linkedHashMap10, linkedHashMap11, linkedHashMap12, linkedHashMap13, linkedHashMap14, linkedHashMap15, linkedHashMap16, j2);
    }

    public final String activeVariant(String str) {
        C7384Etj.A0Y(str, 0);
        return BV4.A0h(str, this.activeVariantsByPinId);
    }

    public final FancyPinSourceState adding(List<FancyPin> list) {
        C7384Etj.A0Y(list, 0);
        LinkedHashMap<String, OwnedPin> linkedHashMapOwnedPinsById = FancyPinSourceStateStoreKt.ownedPinsById(list);
        if (linkedHashMapOwnedPinsById.isEmpty()) {
            return this;
        }
        Iterator itA0i = C3cG.A0i(linkedHashMapOwnedPinsById);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String strA0t = C60O.A0t(entryA0l);
            OwnedPin ownedPin = (OwnedPin) entryA0l.getValue();
            if (this.pinsById.containsKey(strA0t)) {
                throw C60Q.A0V("FancyPin '", strA0t, "' already exists");
            }
            if (!this.blueprintsById.containsKey(ownedPin.blueprintId)) {
                throw FGI.A01("FancyPin '", strA0t, "' references unknown blueprint '", ownedPin.blueprintId, "'");
            }
        }
        return copy$default(this, AbstractC7608F5v.A13(this.pinsById, linkedHashMapOwnedPinsById), null, null, null, null, null, null, null, 0L, 510, null);
    }

    public final FancyPinBlueprint blueprint(String str) {
        C7384Etj.A0Y(str, 0);
        return this.blueprintsById.get(str);
    }

    public final FancyPinSourceState clearingActiveVariant(String str) {
        if (!AbstractC7610F5x.A1W(this, str)) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        if (!this.activeVariantsByPinId.containsKey(str)) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.activeVariantsByPinId);
        linkedHashMapA14.remove(str);
        return copy$default(this, null, null, null, null, linkedHashMapA14, null, null, null, 0L, 495, null);
    }

    public final FancyPinSourceState clearingRank(String str) {
        if (!AbstractC7610F5x.A1W(this, str)) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        if (!this.rankOverridesByPinId.containsKey(str)) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.rankOverridesByPinId);
        linkedHashMapA14.remove(str);
        return copy$default(this, null, null, null, null, null, linkedHashMapA14, null, null, 0L, 479, null);
    }

    public final FancyPinSourceState clearingZOrder(String str) {
        if (!AbstractC7610F5x.A1W(this, str)) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        if (!this.zOrderOverridesByPinId.containsKey(str)) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.zOrderOverridesByPinId);
        linkedHashMapA14.remove(str);
        return copy$default(this, null, null, null, null, null, null, linkedHashMapA14, null, 0L, 447, null);
    }

    public final PinLayout layout(String str) {
        C7384Etj.A0Y(str, 0);
        OwnedLayout ownedLayout = this.layoutsByPinId.get(str);
        if (ownedLayout != null) {
            return ownedLayout.materialize();
        }
        return null;
    }

    public final PinMeasurement measurement(String str) {
        C7384Etj.A0Y(str, 0);
        OwnedMeasurement ownedMeasurement = this.measurementsByPinId.get(str);
        if (ownedMeasurement != null) {
            return ownedMeasurement.materialize();
        }
        return null;
    }

    public final FancyPin pin(String str) {
        C7384Etj.A0Y(str, 0);
        OwnedPin ownedPin = this.pinsById.get(str);
        if (ownedPin != null) {
            return ownedPin.materialize();
        }
        return null;
    }

    public final Integer rankOverride(String str) {
        C7384Etj.A0Y(str, 0);
        return this.rankOverridesByPinId.get(str);
    }

    public final FancyPinSourceState registeringBlueprints(List<FancyPinBlueprint> list) {
        C7384Etj.A0Y(list, 0);
        LinkedHashMap linkedHashMapUniqueById = FancyPinSourceStateStoreKt.uniqueById(list, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinSourceState$registeringBlueprints$additions$1
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((FancyPinBlueprint) obj).id;
            }
        }, "blueprint", FancyPinSourceState$registeringBlueprints$additions$2.INSTANCE);
        if (linkedHashMapUniqueById.isEmpty()) {
            return this;
        }
        Iterator itA0y = BV5.A0y(linkedHashMapUniqueById);
        while (itA0y.hasNext()) {
            String str = (String) C7384Etj.A0F(itA0y);
            if (this.blueprintsById.containsKey(str)) {
                throw C60Q.A0V("FancyPin blueprint '", str, "' is already registered");
            }
        }
        if (this.catalogGeneration == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("FancyPin catalog generation overflow");
        }
        LinkedHashMap linkedHashMapA13 = AbstractC7608F5v.A13(this.blueprintsById, linkedHashMapUniqueById);
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.registrationRevisionsByBlueprintId);
        Iterator it = AbstractC7608F5v.A17(linkedHashMapUniqueById).iterator();
        while (it.hasNext()) {
            linkedHashMapA14.put(it.next(), BV7.A0o());
        }
        return new FancyPinSourceState(this.pinsById, linkedHashMapA13, this.measurementsByPinId, this.layoutsByPinId, this.activeVariantsByPinId, this.rankOverridesByPinId, this.zOrderOverridesByPinId, linkedHashMapA14, this.catalogGeneration + 1);
    }

    public final FancyPinSourceState removing(List<String> list) {
        C7384Etj.A0Y(list, 0);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            FancyPinSourceStateStoreKt.validateSourcePinId(AnonymousClass005.A0j(it));
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        LinkedHashMap<String, OwnedPin> linkedHashMap = this.pinsById;
        for (String str : list) {
            if (linkedHashMap.containsKey(str)) {
                linkedHashSetA0k.add(str);
            }
        }
        if (linkedHashSetA0k.isEmpty()) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.pinsById);
        Iterator it2 = linkedHashSetA0k.iterator();
        while (it2.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA14, it2);
        }
        LinkedHashMap linkedHashMapA142 = AbstractC7607F5u.A14(this.measurementsByPinId);
        Iterator it3 = linkedHashSetA0k.iterator();
        while (it3.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA142, it3);
        }
        LinkedHashMap linkedHashMapA143 = AbstractC7607F5u.A14(this.layoutsByPinId);
        Iterator it4 = linkedHashSetA0k.iterator();
        while (it4.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA143, it4);
        }
        LinkedHashMap linkedHashMapA144 = AbstractC7607F5u.A14(this.activeVariantsByPinId);
        Iterator it5 = linkedHashSetA0k.iterator();
        while (it5.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA144, it5);
        }
        LinkedHashMap linkedHashMapA145 = AbstractC7607F5u.A14(this.rankOverridesByPinId);
        Iterator it6 = linkedHashSetA0k.iterator();
        while (it6.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA145, it6);
        }
        LinkedHashMap linkedHashMapA146 = AbstractC7607F5u.A14(this.zOrderOverridesByPinId);
        Iterator it7 = linkedHashSetA0k.iterator();
        while (it7.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA146, it7);
        }
        return new FancyPinSourceState(linkedHashMapA14, this.blueprintsById, linkedHashMapA142, linkedHashMapA143, linkedHashMapA144, linkedHashMapA145, linkedHashMapA146, this.registrationRevisionsByBlueprintId, this.catalogGeneration);
    }

    public final FancyPinSourceState settingRank(String str, int i) {
        if (!AbstractC7610F5x.A1W(this, str)) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        Number numberA0j = BV6.A0j(str, this.rankOverridesByPinId);
        if (numberA0j != null && numberA0j.intValue() == i) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.rankOverridesByPinId);
        C8j4.A1O(str, linkedHashMapA14, i);
        return copy$default(this, null, null, null, null, null, linkedHashMapA14, null, null, 0L, 479, null);
    }

    public final FancyPinSourceState settingZOrder(String str, float f) {
        if (!AbstractC7610F5x.A1W(this, str)) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw C60O.A0i("FancyPin z-order must be finite");
        }
        Number numberA0j = BV6.A0j(str, this.zOrderOverridesByPinId);
        if (numberA0j != null && numberA0j.floatValue() == f) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.zOrderOverridesByPinId);
        linkedHashMapA14.put(str, Float.valueOf(f));
        return copy$default(this, null, null, null, null, null, null, linkedHashMapA14, null, 0L, 447, null);
    }

    public final boolean sharesLayoutWith(FancyPinSourceState fancyPinSourceState, String str) {
        boolean zA1a = AnonymousClass002.A1a(fancyPinSourceState, str);
        if (this.layoutsByPinId.containsKey(str) && fancyPinSourceState.layoutsByPinId.containsKey(str) && this.layoutsByPinId.get(str) == fancyPinSourceState.layoutsByPinId.get(str)) {
            return zA1a;
        }
        return false;
    }

    public final boolean sharesMeasurementWith(FancyPinSourceState fancyPinSourceState, String str) {
        boolean zA1a = AnonymousClass002.A1a(fancyPinSourceState, str);
        if (this.measurementsByPinId.containsKey(str) && fancyPinSourceState.measurementsByPinId.containsKey(str) && this.measurementsByPinId.get(str) == fancyPinSourceState.measurementsByPinId.get(str)) {
            return zA1a;
        }
        return false;
    }

    public final boolean sharesPinWith(FancyPinSourceState fancyPinSourceState, String str) {
        boolean zA1a = AnonymousClass002.A1a(fancyPinSourceState, str);
        if (this.pinsById.containsKey(str) && fancyPinSourceState.pinsById.containsKey(str) && this.pinsById.get(str) == fancyPinSourceState.pinsById.get(str)) {
            return zA1a;
        }
        return false;
    }

    public final FancyPinSourceState updating(List<FancyPin> list) {
        C7384Etj.A0Y(list, 0);
        LinkedHashMap<String, OwnedPin> linkedHashMapOwnedPinsById = FancyPinSourceStateStoreKt.ownedPinsById(list);
        if (linkedHashMapOwnedPinsById.isEmpty()) {
            return this;
        }
        Iterator itA0i = C3cG.A0i(linkedHashMapOwnedPinsById);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String strA0t = C60O.A0t(entryA0l);
            OwnedPin ownedPin = (OwnedPin) entryA0l.getValue();
            if (!this.pinsById.containsKey(strA0t)) {
                throw C60Q.A0V("FancyPin '", strA0t, "' does not exist");
            }
            FancyPinBlueprint fancyPinBlueprint = this.blueprintsById.get(ownedPin.blueprintId);
            if (fancyPinBlueprint == null) {
                throw FGI.A01("FancyPin '", strA0t, "' references unknown blueprint '", ownedPin.blueprintId, "'");
            }
            FancyPinBlueprint fancyPinBlueprint2 = fancyPinBlueprint;
            String strA0h = BV4.A0h(strA0t, this.activeVariantsByPinId);
            if (strA0h != null && !fancyPinBlueprint2.variantIds.contains(strA0h)) {
                throw C60O.A0i(FGI.A0k("FancyPin '", strA0t, "' retains unknown variant '", strA0h, "' for blueprint '", ownedPin.blueprintId, "'"));
            }
        }
        LinkedHashMap linkedHashMapA13 = AbstractC7608F5v.A13(this.pinsById, linkedHashMapOwnedPinsById);
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.measurementsByPinId);
        Iterator it = AbstractC7608F5v.A17(linkedHashMapOwnedPinsById).iterator();
        while (it.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA14, it);
        }
        LinkedHashMap linkedHashMapA142 = AbstractC7607F5u.A14(this.layoutsByPinId);
        Iterator it2 = AbstractC7608F5v.A17(linkedHashMapOwnedPinsById).iterator();
        while (it2.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA142, it2);
        }
        return new FancyPinSourceState(linkedHashMapA13, this.blueprintsById, linkedHashMapA14, linkedHashMapA142, this.activeVariantsByPinId, this.rankOverridesByPinId, this.zOrderOverridesByPinId, this.registrationRevisionsByBlueprintId, this.catalogGeneration);
    }

    public final FancyPinSourceState withRegistrationRevisions(Map<String, Long> map) {
        C7384Etj.A0Y(map, 0);
        if (!C7384Etj.areEqual(map.keySet(), this.blueprintsById.keySet())) {
            throw C60O.A0i("Registration revisions must exactly match the FancyPin blueprint catalog");
        }
        Set<String> setKeySet = map.keySet();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (String str : setKeySet) {
            if (!C7384Etj.areEqual(this.registrationRevisionsByBlueprintId.get(str), map.get(str))) {
                linkedHashSetA0k.add(str);
            }
        }
        if (linkedHashSetA0k.isEmpty()) {
            return this;
        }
        Collection<OwnedPin> collectionValues = this.pinsById.values();
        ArrayList arrayListA0s = C60Q.A0s(collectionValues);
        for (OwnedPin ownedPin : collectionValues) {
            C60Q.A1G(ownedPin.blueprintId, ownedPin, arrayListA0s, linkedHashSetA0k);
        }
        LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
        Iterator it = arrayListA0s.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k2.add(((OwnedPin) it.next()).id);
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.measurementsByPinId);
        Iterator it2 = linkedHashSetA0k2.iterator();
        while (it2.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA14, it2);
        }
        LinkedHashMap linkedHashMapA142 = AbstractC7607F5u.A14(this.layoutsByPinId);
        Iterator it3 = linkedHashSetA0k2.iterator();
        while (it3.hasNext()) {
            AbstractC7608F5v.A1V(linkedHashMapA142, it3);
        }
        return new FancyPinSourceState(this.pinsById, this.blueprintsById, linkedHashMapA14, linkedHashMapA142, this.activeVariantsByPinId, this.rankOverridesByPinId, this.zOrderOverridesByPinId, AbstractC7607F5u.A14(map), this.catalogGeneration);
    }

    public final Float zOrderOverride(String str) {
        C7384Etj.A0Y(str, 0);
        return this.zOrderOverridesByPinId.get(str);
    }

    private final FancyPinSourceState copy(LinkedHashMap<String, OwnedPin> linkedHashMap, LinkedHashMap<String, FancyPinBlueprint> linkedHashMap2, LinkedHashMap<String, OwnedMeasurement> linkedHashMap3, LinkedHashMap<String, OwnedLayout> linkedHashMap4, LinkedHashMap<String, String> linkedHashMap5, LinkedHashMap<String, Integer> linkedHashMap6, LinkedHashMap<String, Float> linkedHashMap7, LinkedHashMap<String, Long> linkedHashMap8, long j) {
        return new FancyPinSourceState(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinSourceState withCaches$default(FancyPinSourceState fancyPinSourceState, List list, List list2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = AGH.A0A(fancyPinSourceState.registrationRevisionsByBlueprintId);
        }
        return fancyPinSourceState.withCaches(list, list2, map);
    }

    public final Map<String, String> getActiveVariants() {
        return AGH.A0A(this.activeVariantsByPinId);
    }

    public final List<FancyPinBlueprint> getBlueprints() {
        Collection<FancyPinBlueprint> collectionValues = this.blueprintsById.values();
        C7384Etj.A0U(collectionValues);
        return AbstractC0878AGe.A0X(collectionValues);
    }

    public final long getCatalogGeneration() {
        return this.catalogGeneration;
    }

    public final List<PinLayout> getLayouts() {
        Collection<OwnedLayout> collectionValues = this.layoutsByPinId.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        Iterator<OwnedLayout> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().materialize());
        }
        return arrayListA0i;
    }

    public final List<PinMeasurement> getMeasurements() {
        Collection<OwnedMeasurement> collectionValues = this.measurementsByPinId.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        Iterator<OwnedMeasurement> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().materialize());
        }
        return arrayListA0i;
    }

    public final List<String> getPinIds() {
        return AbstractC0878AGe.A0X(AbstractC7608F5v.A17(this.pinsById));
    }

    public final List<FancyPin> getPins() {
        Collection<OwnedPin> collectionValues = this.pinsById.values();
        C7384Etj.A0U(collectionValues);
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        Iterator<OwnedPin> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().materialize());
        }
        return arrayListA0i;
    }

    public final Map<String, Integer> getRankOverrides() {
        return AGH.A0A(this.rankOverridesByPinId);
    }

    public final Map<String, Long> getRegistrationRevisions() {
        return AGH.A0A(this.registrationRevisionsByBlueprintId);
    }

    public final Map<String, Float> getZOrderOverrides() {
        return AGH.A0A(this.zOrderOverridesByPinId);
    }

    public final FancyPinSourceState settingActiveVariant(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        FancyPinSourceStateStoreKt.validateSourcePinId(str);
        OwnedPin ownedPin = this.pinsById.get(str);
        if (ownedPin == null) {
            throw C60Q.A0V("FancyPin '", str, "' does not exist");
        }
        FancyPinBlueprint fancyPinBlueprint = this.blueprintsById.get(ownedPin.blueprintId);
        if (fancyPinBlueprint == null) {
            throw BV4.A0U();
        }
        if (!fancyPinBlueprint.variantIds.contains(str2)) {
            throw FGI.A01("FancyPin '", str, "' requests unknown variant '", str2, "'");
        }
        if (C7384Etj.areEqual(this.activeVariantsByPinId.get(str), str2)) {
            return this;
        }
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.activeVariantsByPinId);
        linkedHashMapA14.put(str, str2);
        return copy$default(this, null, null, null, null, linkedHashMapA14, null, null, null, 0L, 495, null);
    }

    public final FancyPinSourceState withCaches(List<PinMeasurement> list, List<PinLayout> list2, Map<String, Long> map) {
        AnonymousClass005.A0x(list, list2, map);
        if (!this.blueprintsById.keySet().containsAll(map.keySet())) {
            throw C60O.A0i("Cache revisions reference an unknown FancyPin blueprint");
        }
        LinkedHashMap<String, OwnedMeasurement> linkedHashMapOwnedMeasurementsById = FancyPinSourceStateStoreKt.ownedMeasurementsById(list);
        LinkedHashMap<String, OwnedLayout> linkedHashMapOwnedLayoutsById = FancyPinSourceStateStoreKt.ownedLayoutsById(list2);
        Iterator it = BGK.A01(AbstractC7608F5v.A17(linkedHashMapOwnedLayoutsById), AbstractC7608F5v.A17(linkedHashMapOwnedMeasurementsById)).iterator();
        while (it.hasNext()) {
            String str = (String) C7384Etj.A0F(it);
            OwnedPin ownedPin = this.pinsById.get(str);
            if (ownedPin == null) {
                throw C60Q.A0V("Cache references unknown FancyPin '", str, "'");
            }
            OwnedPin ownedPin2 = ownedPin;
            Number numberA0b = BV4.A0b(ownedPin2.blueprintId, map);
            Long l = this.registrationRevisionsByBlueprintId.get(ownedPin2.blueprintId);
            if (l == null) {
                throw BV4.A0U();
            }
            long jA05 = C3cG.A05(l);
            if (numberA0b == null || numberA0b.longValue() != jA05) {
                throw C60Q.A0V("Cache for FancyPin '", str, "' was measured against stale registration revision");
            }
        }
        return copy$default(this, null, null, AbstractC7608F5v.A13(this.measurementsByPinId, linkedHashMapOwnedMeasurementsById), AbstractC7608F5v.A13(this.layoutsByPinId, linkedHashMapOwnedLayoutsById), null, null, null, null, 0L, MC.c50_accounts_center_settings.__CONFIG__, null);
    }

    public /* synthetic */ FancyPinSourceState(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6, LinkedHashMap linkedHashMap7, LinkedHashMap linkedHashMap8, long j, C06H c06h) {
        this(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8, j);
    }

    public FancyPinSourceState(LinkedHashMap<String, OwnedPin> linkedHashMap, LinkedHashMap<String, FancyPinBlueprint> linkedHashMap2, LinkedHashMap<String, OwnedMeasurement> linkedHashMap3, LinkedHashMap<String, OwnedLayout> linkedHashMap4, LinkedHashMap<String, String> linkedHashMap5, LinkedHashMap<String, Integer> linkedHashMap6, LinkedHashMap<String, Float> linkedHashMap7, LinkedHashMap<String, Long> linkedHashMap8, long j) {
        this.pinsById = linkedHashMap;
        this.blueprintsById = linkedHashMap2;
        this.measurementsByPinId = linkedHashMap3;
        this.layoutsByPinId = linkedHashMap4;
        this.activeVariantsByPinId = linkedHashMap5;
        this.rankOverridesByPinId = linkedHashMap6;
        this.zOrderOverridesByPinId = linkedHashMap7;
        this.registrationRevisionsByBlueprintId = linkedHashMap8;
        this.catalogGeneration = j;
    }
}
