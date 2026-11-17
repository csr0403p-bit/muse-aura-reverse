package com.facebook.aura.partners.voice.screen;

import X.C06G;
import X.C06H;
import X.C3cI;

/* loaded from: classes2.dex */
public final class HatchPipWindowMeasurement extends C06G {
    public static final int $stable = 0;
    public final long appWindowSize;
    public final int pipWindowSide;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPipWindowMeasurement) {
                HatchPipWindowMeasurement hatchPipWindowMeasurement = (HatchPipWindowMeasurement) obj;
                if (this.appWindowSize != hatchPipWindowMeasurement.appWindowSize || this.pipWindowSide != hatchPipWindowMeasurement.pipWindowSide) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-viCIZxY$default, reason: not valid java name */
    public static /* synthetic */ HatchPipWindowMeasurement m1727copyviCIZxY$default(HatchPipWindowMeasurement hatchPipWindowMeasurement, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hatchPipWindowMeasurement.appWindowSize;
        }
        if ((i2 & 2) != 0) {
            i = hatchPipWindowMeasurement.pipWindowSide;
        }
        return new HatchPipWindowMeasurement(j, i);
    }

    /* renamed from: component1-YbymL2g, reason: not valid java name */
    public final long m1728component1YbymL2g() {
        return this.appWindowSize;
    }

    public final int component2() {
        return this.pipWindowSide;
    }

    /* renamed from: copy-viCIZxY, reason: not valid java name */
    public final HatchPipWindowMeasurement m1729copyviCIZxY(long j, int i) {
        return new HatchPipWindowMeasurement(j, i);
    }

    /* renamed from: getAppWindowSize-YbymL2g, reason: not valid java name */
    public final long m1730getAppWindowSizeYbymL2g() {
        return this.appWindowSize;
    }

    public final int getPipWindowSide() {
        return this.pipWindowSide;
    }

    public int hashCode() {
        return C3cI.A01(this.appWindowSize) + this.pipWindowSide;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPipWindowMeasurement(long j, int i, C06H c06h) {
        this(j, i);
    }

    public HatchPipWindowMeasurement(long j, int i) {
        this.appWindowSize = j;
        this.pipWindowSide = i;
    }
}
