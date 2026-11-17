package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FlightCheckoutDetailRowKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FlightCheckoutDetailRowKind[] $VALUES;
    public static final Companion Companion;
    public static final FlightCheckoutDetailRowKind EXCLUDED;
    public static final FlightCheckoutDetailRowKind FARE_RULES;
    public static final FlightCheckoutDetailRowKind INCLUDED;
    public static final FlightCheckoutDetailRowKind UNKNOWN;
    public final String wireValue;

    static {
        FlightCheckoutDetailRowKind flightCheckoutDetailRowKind = new FlightCheckoutDetailRowKind("FARE_RULES", 0, "fare_rules");
        FARE_RULES = flightCheckoutDetailRowKind;
        FlightCheckoutDetailRowKind flightCheckoutDetailRowKind2 = new FlightCheckoutDetailRowKind("INCLUDED", 1, "included");
        INCLUDED = flightCheckoutDetailRowKind2;
        FlightCheckoutDetailRowKind flightCheckoutDetailRowKind3 = new FlightCheckoutDetailRowKind("EXCLUDED", 2, "excluded");
        EXCLUDED = flightCheckoutDetailRowKind3;
        FlightCheckoutDetailRowKind flightCheckoutDetailRowKind4 = new FlightCheckoutDetailRowKind("UNKNOWN", 3, null);
        UNKNOWN = flightCheckoutDetailRowKind4;
        FlightCheckoutDetailRowKind[] flightCheckoutDetailRowKindArr = {flightCheckoutDetailRowKind, flightCheckoutDetailRowKind2, flightCheckoutDetailRowKind3, flightCheckoutDetailRowKind4};
        $VALUES = flightCheckoutDetailRowKindArr;
        $ENTRIES = C3cG.A0w(flightCheckoutDetailRowKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final FlightCheckoutDetailRowKind fromWire(String str) {
            for (FlightCheckoutDetailRowKind flightCheckoutDetailRowKind : FlightCheckoutDetailRowKind.values()) {
                if (flightCheckoutDetailRowKind != FlightCheckoutDetailRowKind.UNKNOWN && C7384Etj.areEqual(flightCheckoutDetailRowKind.getWireValue(), str)) {
                    return flightCheckoutDetailRowKind;
                }
            }
            return FlightCheckoutDetailRowKind.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<FlightCheckoutDetailRowKind> getEntries() {
        return $ENTRIES;
    }

    public static FlightCheckoutDetailRowKind valueOf(String str) {
        return (FlightCheckoutDetailRowKind) Enum.valueOf(FlightCheckoutDetailRowKind.class, str);
    }

    public static FlightCheckoutDetailRowKind[] values() {
        return (FlightCheckoutDetailRowKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public FlightCheckoutDetailRowKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
