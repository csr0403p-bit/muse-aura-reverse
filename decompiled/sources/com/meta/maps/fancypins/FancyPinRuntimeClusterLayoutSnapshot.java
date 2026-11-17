package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterLayoutSnapshot {
    public final List<PinLayout> layouts;
    public final List<PinLayout> measuredLayouts;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinRuntimeClusterLayoutSnapshot) {
                FancyPinRuntimeClusterLayoutSnapshot fancyPinRuntimeClusterLayoutSnapshot = (FancyPinRuntimeClusterLayoutSnapshot) obj;
                if (!C7384Etj.areEqual(this.layouts, fancyPinRuntimeClusterLayoutSnapshot.layouts) || !C7384Etj.areEqual(this.measuredLayouts, fancyPinRuntimeClusterLayoutSnapshot.measuredLayouts)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinRuntimeClusterLayoutSnapshot copy$default(FancyPinRuntimeClusterLayoutSnapshot fancyPinRuntimeClusterLayoutSnapshot, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fancyPinRuntimeClusterLayoutSnapshot.layouts;
        }
        if ((i & 2) != 0) {
            list2 = fancyPinRuntimeClusterLayoutSnapshot.measuredLayouts;
        }
        AnonymousClass003.A0u(list, list2);
        return new FancyPinRuntimeClusterLayoutSnapshot(list, list2);
    }

    public final List<PinLayout> component1() {
        return this.layouts;
    }

    public final List<PinLayout> component2() {
        return this.measuredLayouts;
    }

    public final List<PinLayout> getLayouts() {
        return this.layouts;
    }

    public final List<PinLayout> getMeasuredLayouts() {
        return this.measuredLayouts;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.measuredLayouts, AnonymousClass005.A0E(this.layouts));
    }

    public String toString() {
        return C3cJ.A0L(this.measuredLayouts, ", measuredLayouts=", C3cG.A0f(this.layouts, "FancyPinRuntimeClusterLayoutSnapshot(layouts="));
    }

    public FancyPinRuntimeClusterLayoutSnapshot(List<PinLayout> list, List<PinLayout> list2) {
        AnonymousClass003.A0u(list, list2);
        this.layouts = list;
        this.measuredLayouts = list2;
    }

    public final FancyPinRuntimeClusterLayoutSnapshot copy(List<PinLayout> list, List<PinLayout> list2) {
        AnonymousClass003.A0u(list, list2);
        return new FancyPinRuntimeClusterLayoutSnapshot(list, list2);
    }
}
