package com.facebook.quicklog.healthcounters.data;

import X.C06G;

/* loaded from: classes.dex */
public final class MarkerHealthCounter extends C06G {
    public final int droppedCount;
    public final int endCount;
    public final int logToFalcoCount;
    public final int markerId;
    public final int sampledCount;
    public final int startCount;

    public static /* synthetic */ MarkerHealthCounter copy$default(MarkerHealthCounter markerHealthCounter, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        if ((i7 & 1) != 0) {
            i8 = markerHealthCounter.markerId;
        }
        if ((i7 & 2) != 0) {
            i9 = markerHealthCounter.startCount;
        }
        if ((i7 & 4) != 0) {
            i10 = markerHealthCounter.sampledCount;
        }
        if ((i7 & 8) != 0) {
            i11 = markerHealthCounter.endCount;
        }
        if ((i7 & 16) != 0) {
            i12 = markerHealthCounter.droppedCount;
        }
        if ((i7 & 32) != 0) {
            i13 = markerHealthCounter.logToFalcoCount;
        }
        return new MarkerHealthCounter(i8, i9, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarkerHealthCounter) {
                MarkerHealthCounter markerHealthCounter = (MarkerHealthCounter) obj;
                if (this.markerId != markerHealthCounter.markerId || this.startCount != markerHealthCounter.startCount || this.sampledCount != markerHealthCounter.sampledCount || this.endCount != markerHealthCounter.endCount || this.droppedCount != markerHealthCounter.droppedCount || this.logToFalcoCount != markerHealthCounter.logToFalcoCount) {
                }
            }
            return false;
        }
        return true;
    }

    public final int component1() {
        return this.markerId;
    }

    public final int component2() {
        return this.startCount;
    }

    public final int component3() {
        return this.sampledCount;
    }

    public final int component4() {
        return this.endCount;
    }

    public final int component5() {
        return this.droppedCount;
    }

    public final int component6() {
        return this.logToFalcoCount;
    }

    public final MarkerHealthCounter copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new MarkerHealthCounter(i, i2, i3, i4, i5, i6);
    }

    public final int getDroppedCount() {
        return this.droppedCount;
    }

    public final int getEndCount() {
        return this.endCount;
    }

    public final int getLogToFalcoCount() {
        return this.logToFalcoCount;
    }

    public final int getMarkerId() {
        return this.markerId;
    }

    public final int getSampledCount() {
        return this.sampledCount;
    }

    public final int getStartCount() {
        return this.startCount;
    }

    public int hashCode() {
        return (((((((((this.markerId * 31) + this.startCount) * 31) + this.sampledCount) * 31) + this.endCount) * 31) + this.droppedCount) * 31) + this.logToFalcoCount;
    }

    public MarkerHealthCounter(int i, int i2, int i3, int i4, int i5, int i6) {
        this.markerId = i;
        this.startCount = i2;
        this.sampledCount = i3;
        this.endCount = i4;
        this.droppedCount = i5;
        this.logToFalcoCount = i6;
    }

    public String toString() {
        return super.toString();
    }
}
