package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BackgroundCallAvailability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BackgroundCallAvailability[] $VALUES;
    public static final BackgroundCallAvailability AVAILABLE;
    public static final BackgroundCallAvailability BUSY;
    public static final BackgroundCallAvailability MIC_PERMISSION_REQUIRED;
    public static final BackgroundCallAvailability OUT_OF_CREDITS;
    public static final BackgroundCallAvailability SETUP_REQUIRED;
    public static final BackgroundCallAvailability UNSUPPORTED;

    static {
        BackgroundCallAvailability backgroundCallAvailability = new BackgroundCallAvailability("AVAILABLE", 0);
        AVAILABLE = backgroundCallAvailability;
        BackgroundCallAvailability backgroundCallAvailability2 = new BackgroundCallAvailability("UNSUPPORTED", 1);
        UNSUPPORTED = backgroundCallAvailability2;
        BackgroundCallAvailability backgroundCallAvailability3 = new BackgroundCallAvailability("BUSY", 2);
        BUSY = backgroundCallAvailability3;
        BackgroundCallAvailability backgroundCallAvailability4 = new BackgroundCallAvailability("MIC_PERMISSION_REQUIRED", 3);
        MIC_PERMISSION_REQUIRED = backgroundCallAvailability4;
        BackgroundCallAvailability backgroundCallAvailability5 = new BackgroundCallAvailability("SETUP_REQUIRED", 4);
        SETUP_REQUIRED = backgroundCallAvailability5;
        BackgroundCallAvailability backgroundCallAvailability6 = new BackgroundCallAvailability("OUT_OF_CREDITS", 5);
        OUT_OF_CREDITS = backgroundCallAvailability6;
        BackgroundCallAvailability[] backgroundCallAvailabilityArr = {backgroundCallAvailability, backgroundCallAvailability2, backgroundCallAvailability3, backgroundCallAvailability4, backgroundCallAvailability5, backgroundCallAvailability6};
        $VALUES = backgroundCallAvailabilityArr;
        $ENTRIES = C3cG.A0w(backgroundCallAvailabilityArr);
    }

    public static Ey9<BackgroundCallAvailability> getEntries() {
        return $ENTRIES;
    }

    public static BackgroundCallAvailability valueOf(String str) {
        return (BackgroundCallAvailability) Enum.valueOf(BackgroundCallAvailability.class, str);
    }

    public static BackgroundCallAvailability[] values() {
        return (BackgroundCallAvailability[]) $VALUES.clone();
    }

    public BackgroundCallAvailability(String str, int i) {
    }
}
