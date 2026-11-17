package com.facebook.aura.memory;

import X.C06G;
import X.C0KA;
import X.C3cI;

/* loaded from: classes2.dex */
public final class AuraMemoryState extends C06G {
    public final long availableMemoryBytes;
    public final boolean isLowRamDevice;
    public final boolean isSystemUnderMemoryPressure;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMemoryState) {
                AuraMemoryState auraMemoryState = (AuraMemoryState) obj;
                if (this.availableMemoryBytes != auraMemoryState.availableMemoryBytes || this.isLowRamDevice != auraMemoryState.isLowRamDevice || this.isSystemUnderMemoryPressure != auraMemoryState.isSystemUnderMemoryPressure) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraMemoryState copy$default(AuraMemoryState auraMemoryState, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = auraMemoryState.availableMemoryBytes;
        }
        if ((i & 2) != 0) {
            z = auraMemoryState.isLowRamDevice;
        }
        if ((i & 4) != 0) {
            z2 = auraMemoryState.isSystemUnderMemoryPressure;
        }
        return new AuraMemoryState(j, z, z2);
    }

    public static /* synthetic */ boolean isPressureBlocked$default(AuraMemoryState auraMemoryState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = AuraMemory.DEFAULT_MIN_AVAILABLE_MEMORY_BYTES;
        }
        return auraMemoryState.isPressureBlocked(j);
    }

    public final long component1() {
        return this.availableMemoryBytes;
    }

    public final boolean component2() {
        return this.isLowRamDevice;
    }

    public final boolean component3() {
        return this.isSystemUnderMemoryPressure;
    }

    public final AuraMemoryState copy(long j, boolean z, boolean z2) {
        return new AuraMemoryState(j, z, z2);
    }

    public final long getAvailableMemoryBytes() {
        return this.availableMemoryBytes;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C3cI.A01(this.availableMemoryBytes), this.isLowRamDevice), this.isSystemUnderMemoryPressure);
    }

    public final boolean isLowRamDevice() {
        return this.isLowRamDevice;
    }

    public final boolean isPressureBlocked(long j) {
        return this.isSystemUnderMemoryPressure || this.availableMemoryBytes <= j;
    }

    public final boolean isSystemUnderMemoryPressure() {
        return this.isSystemUnderMemoryPressure;
    }

    public AuraMemoryState(long j, boolean z, boolean z2) {
        this.availableMemoryBytes = j;
        this.isLowRamDevice = z;
        this.isSystemUnderMemoryPressure = z2;
    }

    public String toString() {
        return super.toString();
    }
}
