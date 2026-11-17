package com.facebook.aura.flights;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FlightSelectionStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FlightSelectionStage[] $VALUES;
    public static final FlightSelectionStage COMPLETE;
    public static final FlightSelectionStage DEPARTING;
    public static final FlightSelectionStage RETURNING;

    static {
        FlightSelectionStage flightSelectionStage = new FlightSelectionStage("DEPARTING", 0);
        DEPARTING = flightSelectionStage;
        FlightSelectionStage flightSelectionStage2 = new FlightSelectionStage("RETURNING", 1);
        RETURNING = flightSelectionStage2;
        FlightSelectionStage flightSelectionStage3 = new FlightSelectionStage("COMPLETE", 2);
        COMPLETE = flightSelectionStage3;
        FlightSelectionStage[] flightSelectionStageArr = {flightSelectionStage, flightSelectionStage2, flightSelectionStage3};
        $VALUES = flightSelectionStageArr;
        $ENTRIES = C3cG.A0w(flightSelectionStageArr);
    }

    public static Ey9<FlightSelectionStage> getEntries() {
        return $ENTRIES;
    }

    public static FlightSelectionStage valueOf(String str) {
        return (FlightSelectionStage) Enum.valueOf(FlightSelectionStage.class, str);
    }

    public static FlightSelectionStage[] values() {
        return (FlightSelectionStage[]) $VALUES.clone();
    }

    public FlightSelectionStage(String str, int i) {
    }
}
