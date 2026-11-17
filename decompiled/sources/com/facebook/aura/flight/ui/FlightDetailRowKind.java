package com.facebook.aura.flight.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FlightDetailRowKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FlightDetailRowKind[] $VALUES;
    public static final FlightDetailRowKind EXCLUDED;
    public static final FlightDetailRowKind FARE_RULES;
    public static final FlightDetailRowKind INCLUDED;
    public static final FlightDetailRowKind UNKNOWN;

    static {
        FlightDetailRowKind flightDetailRowKind = new FlightDetailRowKind("FARE_RULES", 0);
        FARE_RULES = flightDetailRowKind;
        FlightDetailRowKind flightDetailRowKind2 = new FlightDetailRowKind("INCLUDED", 1);
        INCLUDED = flightDetailRowKind2;
        FlightDetailRowKind flightDetailRowKind3 = new FlightDetailRowKind("EXCLUDED", 2);
        EXCLUDED = flightDetailRowKind3;
        FlightDetailRowKind flightDetailRowKind4 = new FlightDetailRowKind("UNKNOWN", 3);
        UNKNOWN = flightDetailRowKind4;
        FlightDetailRowKind[] flightDetailRowKindArr = {flightDetailRowKind, flightDetailRowKind2, flightDetailRowKind3, flightDetailRowKind4};
        $VALUES = flightDetailRowKindArr;
        $ENTRIES = C3cG.A0w(flightDetailRowKindArr);
    }

    public static Ey9<FlightDetailRowKind> getEntries() {
        return $ENTRIES;
    }

    public static FlightDetailRowKind valueOf(String str) {
        return (FlightDetailRowKind) Enum.valueOf(FlightDetailRowKind.class, str);
    }

    public static FlightDetailRowKind[] values() {
        return (FlightDetailRowKind[]) $VALUES.clone();
    }

    public FlightDetailRowKind(String str, int i) {
    }
}
