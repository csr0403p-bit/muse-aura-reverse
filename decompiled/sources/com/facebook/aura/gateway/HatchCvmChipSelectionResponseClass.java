package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCvmChipSelectionResponseClass {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmChipSelectionResponseClass[] $VALUES;
    public static final HatchCvmChipSelectionResponseClass ACCEPTED;
    public static final Companion Companion;
    public static final HatchCvmChipSelectionResponseClass FATAL;
    public static final HatchCvmChipSelectionResponseClass RETRY;
    public static final HatchCvmChipSelectionResponseClass STAND_DOWN;
    public static final HatchCvmChipSelectionResponseClass UNKNOWN;

    public final class Companion {
        public final HatchCvmChipSelectionResponseClass fromWire(String str) {
            HatchCvmChipSelectionResponseClass next;
            Iterator<HatchCvmChipSelectionResponseClass> it = HatchCvmChipSelectionResponseClass.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equals(str)) {
                    break;
                }
            }
            HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass = next;
            return hatchCvmChipSelectionResponseClass == null ? HatchCvmChipSelectionResponseClass.UNKNOWN : hatchCvmChipSelectionResponseClass;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass = new HatchCvmChipSelectionResponseClass("UNKNOWN", 0);
        UNKNOWN = hatchCvmChipSelectionResponseClass;
        HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass2 = new HatchCvmChipSelectionResponseClass("ACCEPTED", 1);
        ACCEPTED = hatchCvmChipSelectionResponseClass2;
        HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass3 = new HatchCvmChipSelectionResponseClass("STAND_DOWN", 2);
        STAND_DOWN = hatchCvmChipSelectionResponseClass3;
        HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass4 = new HatchCvmChipSelectionResponseClass("RETRY", 3);
        RETRY = hatchCvmChipSelectionResponseClass4;
        HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass5 = new HatchCvmChipSelectionResponseClass("FATAL", 4);
        FATAL = hatchCvmChipSelectionResponseClass5;
        HatchCvmChipSelectionResponseClass[] hatchCvmChipSelectionResponseClassArr = {hatchCvmChipSelectionResponseClass, hatchCvmChipSelectionResponseClass2, hatchCvmChipSelectionResponseClass3, hatchCvmChipSelectionResponseClass4, hatchCvmChipSelectionResponseClass5};
        $VALUES = hatchCvmChipSelectionResponseClassArr;
        $ENTRIES = C3cG.A0w(hatchCvmChipSelectionResponseClassArr);
        Companion = new Companion();
    }

    public static Ey9<HatchCvmChipSelectionResponseClass> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmChipSelectionResponseClass valueOf(String str) {
        return (HatchCvmChipSelectionResponseClass) Enum.valueOf(HatchCvmChipSelectionResponseClass.class, str);
    }

    public static HatchCvmChipSelectionResponseClass[] values() {
        return (HatchCvmChipSelectionResponseClass[]) $VALUES.clone();
    }

    public HatchCvmChipSelectionResponseClass(String str, int i) {
    }
}
