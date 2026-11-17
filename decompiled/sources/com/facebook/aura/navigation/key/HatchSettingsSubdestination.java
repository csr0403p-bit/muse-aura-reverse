package com.facebook.aura.navigation.key;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchSettingsSubdestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSettingsSubdestination[] $VALUES;
    public static final Companion Companion;
    public static final HatchSettingsSubdestination SUBSCRIPTIONS;
    public static final HatchSettingsSubdestination VOICE;
    public final String wireValue;

    static {
        HatchSettingsSubdestination hatchSettingsSubdestination = new HatchSettingsSubdestination("SUBSCRIPTIONS", 0, "subscriptions");
        SUBSCRIPTIONS = hatchSettingsSubdestination;
        HatchSettingsSubdestination hatchSettingsSubdestination2 = new HatchSettingsSubdestination("VOICE", 1, "voice");
        VOICE = hatchSettingsSubdestination2;
        HatchSettingsSubdestination[] hatchSettingsSubdestinationArr = {hatchSettingsSubdestination, hatchSettingsSubdestination2};
        $VALUES = hatchSettingsSubdestinationArr;
        $ENTRIES = C3cG.A0w(hatchSettingsSubdestinationArr);
        Companion = new Companion();
    }

    public static Ey9<HatchSettingsSubdestination> getEntries() {
        return $ENTRIES;
    }

    public static HatchSettingsSubdestination valueOf(String str) {
        return (HatchSettingsSubdestination) Enum.valueOf(HatchSettingsSubdestination.class, str);
    }

    public static HatchSettingsSubdestination[] values() {
        return (HatchSettingsSubdestination[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final HatchSettingsSubdestination fromWire(String str) {
            HatchSettingsSubdestination hatchSettingsSubdestination = null;
            if (str == null) {
                return null;
            }
            Iterator<HatchSettingsSubdestination> it = HatchSettingsSubdestination.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchSettingsSubdestination next = it.next();
                if (str.equals(next.getWireValue())) {
                    hatchSettingsSubdestination = next;
                    break;
                }
            }
            return hatchSettingsSubdestination;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSettingsSubdestination(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
