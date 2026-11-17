package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinMeasurementBatch {
    public final List<FancyPinBlueprint> blueprints;
    public final List<PinMeasurement> measurements;
    public final List<FancyPin> pins;
    public final Map<String, Long> registrationRevisions;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinMeasurementBatch) {
                FancyPinMeasurementBatch fancyPinMeasurementBatch = (FancyPinMeasurementBatch) obj;
                if (!C7384Etj.areEqual(this.pins, fancyPinMeasurementBatch.pins) || !C7384Etj.areEqual(this.blueprints, fancyPinMeasurementBatch.blueprints) || !C7384Etj.areEqual(this.measurements, fancyPinMeasurementBatch.measurements) || !C7384Etj.areEqual(this.registrationRevisions, fancyPinMeasurementBatch.registrationRevisions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinMeasurementBatch copy$default(FancyPinMeasurementBatch fancyPinMeasurementBatch, List list, List list2, List list3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fancyPinMeasurementBatch.pins;
        }
        if ((i & 2) != 0) {
            list2 = fancyPinMeasurementBatch.blueprints;
        }
        if ((i & 4) != 0) {
            list3 = fancyPinMeasurementBatch.measurements;
        }
        if ((i & 8) != 0) {
            map = fancyPinMeasurementBatch.registrationRevisions;
        }
        return fancyPinMeasurementBatch.copy(list, list2, list3, map);
    }

    public final List<FancyPin> component1() {
        return this.pins;
    }

    public final List<FancyPinBlueprint> component2() {
        return this.blueprints;
    }

    public final List<PinMeasurement> component3() {
        return this.measurements;
    }

    public final Map<String, Long> component4() {
        return this.registrationRevisions;
    }

    public final List<FancyPinBlueprint> getBlueprints() {
        return this.blueprints;
    }

    public final List<PinMeasurement> getMeasurements() {
        return this.measurements;
    }

    public final List<FancyPin> getPins() {
        return this.pins;
    }

    public final Map<String, Long> getRegistrationRevisions() {
        return this.registrationRevisions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.registrationRevisions, AnonymousClass005.A0F(this.measurements, AnonymousClass005.A0F(this.blueprints, AnonymousClass005.A0E(this.pins))));
    }

    public String toString() {
        List<FancyPin> list = this.pins;
        List<FancyPinBlueprint> list2 = this.blueprints;
        List<PinMeasurement> list3 = this.measurements;
        Map<String, Long> map = this.registrationRevisions;
        StringBuilder sbA0f = C3cG.A0f(list, "FancyPinMeasurementBatch(pins=");
        sbA0f.append(", blueprints=");
        sbA0f.append(list2);
        sbA0f.append(", measurements=");
        sbA0f.append(list3);
        return C3cJ.A0L(map, ", registrationRevisions=", sbA0f);
    }

    public FancyPinMeasurementBatch(List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, Map<String, Long> map) {
        AnonymousClass005.A14(list, list2, list3, map);
        this.pins = list;
        this.blueprints = list2;
        this.measurements = list3;
        this.registrationRevisions = map;
    }

    public final FancyPinMeasurementBatch copy(List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, Map<String, Long> map) {
        AnonymousClass005.A14(list, list2, list3, map);
        return new FancyPinMeasurementBatch(list, list2, list3, map);
    }
}
