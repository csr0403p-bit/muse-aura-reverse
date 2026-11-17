package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Availability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Availability[] $VALUES;
    public static final Availability AVAILABLE;
    public static final Companion Companion;
    public static final Availability UNAVAILABLE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        Availability availability = new Availability("AVAILABLE", 0);
        AVAILABLE = availability;
        Availability availability2 = new Availability("UNAVAILABLE", 1);
        UNAVAILABLE = availability2;
        Availability[] availabilityArr = {availability, availability2};
        $VALUES = availabilityArr;
        $ENTRIES = C3cG.A0w(availabilityArr);
        Companion = new Companion();
    }

    public static Ey9<Availability> getEntries() {
        return $ENTRIES;
    }

    public static Availability valueOf(String str) {
        return (Availability) Enum.valueOf(Availability.class, str);
    }

    public static Availability[] values() {
        return (Availability[]) $VALUES.clone();
    }

    public Availability(String str, int i) {
    }
}
