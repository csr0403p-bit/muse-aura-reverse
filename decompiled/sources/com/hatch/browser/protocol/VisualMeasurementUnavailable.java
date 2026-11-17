package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class VisualMeasurementUnavailable {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VisualMeasurementUnavailable[] $VALUES;
    public static final Companion Companion;
    public static final VisualMeasurementUnavailable GEOMETRY_CHANGED;
    public static final VisualMeasurementUnavailable INSUFFICIENT_MATCHES;
    public static final VisualMeasurementUnavailable NO_CONSISTENT_TRANSFORM;
    public static final VisualMeasurementUnavailable REGION_OUTSIDE_FRAME;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        VisualMeasurementUnavailable visualMeasurementUnavailable = new VisualMeasurementUnavailable("GEOMETRY_CHANGED", 0);
        GEOMETRY_CHANGED = visualMeasurementUnavailable;
        VisualMeasurementUnavailable visualMeasurementUnavailable2 = new VisualMeasurementUnavailable("REGION_OUTSIDE_FRAME", 1);
        REGION_OUTSIDE_FRAME = visualMeasurementUnavailable2;
        VisualMeasurementUnavailable visualMeasurementUnavailable3 = new VisualMeasurementUnavailable("INSUFFICIENT_MATCHES", 2);
        INSUFFICIENT_MATCHES = visualMeasurementUnavailable3;
        VisualMeasurementUnavailable visualMeasurementUnavailable4 = new VisualMeasurementUnavailable("NO_CONSISTENT_TRANSFORM", 3);
        NO_CONSISTENT_TRANSFORM = visualMeasurementUnavailable4;
        VisualMeasurementUnavailable[] visualMeasurementUnavailableArr = {visualMeasurementUnavailable, visualMeasurementUnavailable2, visualMeasurementUnavailable3, visualMeasurementUnavailable4};
        $VALUES = visualMeasurementUnavailableArr;
        $ENTRIES = C3cG.A0w(visualMeasurementUnavailableArr);
        Companion = new Companion();
    }

    public static Ey9<VisualMeasurementUnavailable> getEntries() {
        return $ENTRIES;
    }

    public static VisualMeasurementUnavailable valueOf(String str) {
        return (VisualMeasurementUnavailable) Enum.valueOf(VisualMeasurementUnavailable.class, str);
    }

    public static VisualMeasurementUnavailable[] values() {
        return (VisualMeasurementUnavailable[]) $VALUES.clone();
    }

    public VisualMeasurementUnavailable(String str, int i) {
    }
}
