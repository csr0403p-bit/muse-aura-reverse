package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterPresentation {
    public final FancyPinBlueprint blueprint;
    public final FancyPinClusterBlueprint clusterBlueprint;
    public final long flags;
    public final FancyPin pin;
    public final FancyPinRuntimeClusterContext runtimeCluster;
    public final int slotIndex;
    public final FancyPinFrameState state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinRuntimeClusterPresentation) {
                FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation = (FancyPinRuntimeClusterPresentation) obj;
                if (!C7384Etj.areEqual(this.pin, fancyPinRuntimeClusterPresentation.pin) || !C7384Etj.areEqual(this.clusterBlueprint, fancyPinRuntimeClusterPresentation.clusterBlueprint) || !C7384Etj.areEqual(this.blueprint, fancyPinRuntimeClusterPresentation.blueprint) || !C7384Etj.areEqual(this.state, fancyPinRuntimeClusterPresentation.state) || this.slotIndex != fancyPinRuntimeClusterPresentation.slotIndex || !C7384Etj.areEqual(this.runtimeCluster, fancyPinRuntimeClusterPresentation.runtimeCluster) || this.flags != fancyPinRuntimeClusterPresentation.flags) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinRuntimeClusterPresentation copy$default(FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation, FancyPin fancyPin, FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint, FancyPinFrameState fancyPinFrameState, int i, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fancyPin = fancyPinRuntimeClusterPresentation.pin;
        }
        if ((i2 & 2) != 0) {
            fancyPinClusterBlueprint = fancyPinRuntimeClusterPresentation.clusterBlueprint;
        }
        if ((i2 & 4) != 0) {
            fancyPinBlueprint = fancyPinRuntimeClusterPresentation.blueprint;
        }
        if ((i2 & 8) != 0) {
            fancyPinFrameState = fancyPinRuntimeClusterPresentation.state;
        }
        if ((i2 & 16) != 0) {
            i = fancyPinRuntimeClusterPresentation.slotIndex;
        }
        if ((i2 & 32) != 0) {
            fancyPinRuntimeClusterContext = fancyPinRuntimeClusterPresentation.runtimeCluster;
        }
        if ((i2 & 64) != 0) {
            j = fancyPinRuntimeClusterPresentation.flags;
        }
        return fancyPinRuntimeClusterPresentation.copy(fancyPin, fancyPinClusterBlueprint, fancyPinBlueprint, fancyPinFrameState, i, fancyPinRuntimeClusterContext, j);
    }

    public final FancyPin component1() {
        return this.pin;
    }

    public final FancyPinClusterBlueprint component2() {
        return this.clusterBlueprint;
    }

    public final FancyPinBlueprint component3() {
        return this.blueprint;
    }

    public final FancyPinFrameState component4() {
        return this.state;
    }

    public final int component5() {
        return this.slotIndex;
    }

    public final FancyPinRuntimeClusterContext component6() {
        return this.runtimeCluster;
    }

    public final long component7() {
        return this.flags;
    }

    public final FancyPinBlueprint getBlueprint() {
        return this.blueprint;
    }

    public final FancyPinClusterBlueprint getClusterBlueprint() {
        return this.clusterBlueprint;
    }

    public final long getFlags() {
        return this.flags;
    }

    public final long getMemberCount() {
        return this.runtimeCluster.memberCount;
    }

    public final FancyPin getPin() {
        return this.pin;
    }

    public final FancyPinRuntimeClusterContext getRuntimeCluster() {
        return this.runtimeCluster;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final FancyPinFrameState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.flags, AnonymousClass005.A0F(this.runtimeCluster, (AnonymousClass005.A0F(this.state, AnonymousClass005.A0F(this.blueprint, AnonymousClass005.A0F(this.clusterBlueprint, AnonymousClass005.A0E(this.pin)))) + this.slotIndex) * 31));
    }

    public String toString() {
        FancyPin fancyPin = this.pin;
        FancyPinClusterBlueprint fancyPinClusterBlueprint = this.clusterBlueprint;
        FancyPinBlueprint fancyPinBlueprint = this.blueprint;
        FancyPinFrameState fancyPinFrameState = this.state;
        int i = this.slotIndex;
        FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext = this.runtimeCluster;
        long j = this.flags;
        StringBuilder sbA0f = C3cG.A0f(fancyPin, "FancyPinRuntimeClusterPresentation(pin=");
        sbA0f.append(", clusterBlueprint=");
        sbA0f.append(fancyPinClusterBlueprint);
        sbA0f.append(", blueprint=");
        sbA0f.append(fancyPinBlueprint);
        sbA0f.append(", state=");
        sbA0f.append(fancyPinFrameState);
        sbA0f.append(", slotIndex=");
        sbA0f.append(i);
        sbA0f.append(", runtimeCluster=");
        sbA0f.append(fancyPinRuntimeClusterContext);
        sbA0f.append(", flags=");
        sbA0f.append(j);
        return BV7.A10(sbA0f);
    }

    public FancyPinRuntimeClusterPresentation(FancyPin fancyPin, FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint, FancyPinFrameState fancyPinFrameState, int i, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, long j) {
        AnonymousClass005.A14(fancyPin, fancyPinClusterBlueprint, fancyPinBlueprint, fancyPinFrameState);
        C7384Etj.A0Y(fancyPinRuntimeClusterContext, 5);
        this.pin = fancyPin;
        this.clusterBlueprint = fancyPinClusterBlueprint;
        this.blueprint = fancyPinBlueprint;
        this.state = fancyPinFrameState;
        this.slotIndex = i;
        this.runtimeCluster = fancyPinRuntimeClusterContext;
        this.flags = j;
    }

    public final FancyPinRuntimeClusterPresentation copy(FancyPin fancyPin, FancyPinClusterBlueprint fancyPinClusterBlueprint, FancyPinBlueprint fancyPinBlueprint, FancyPinFrameState fancyPinFrameState, int i, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, long j) {
        AnonymousClass005.A14(fancyPin, fancyPinClusterBlueprint, fancyPinBlueprint, fancyPinFrameState);
        C7384Etj.A0Y(fancyPinRuntimeClusterContext, 5);
        return new FancyPinRuntimeClusterPresentation(fancyPin, fancyPinClusterBlueprint, fancyPinBlueprint, fancyPinFrameState, i, fancyPinRuntimeClusterContext, j);
    }
}
