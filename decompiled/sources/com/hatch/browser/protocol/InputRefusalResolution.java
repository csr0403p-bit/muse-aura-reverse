package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InputRefusalResolution {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InputRefusalResolution[] $VALUES;
    public static final Companion Companion;
    public static final InputRefusalResolution HEALED;
    public static final InputRefusalResolution STALE;
    public static final InputRefusalResolution UNCHANGED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        InputRefusalResolution inputRefusalResolution = new InputRefusalResolution("UNCHANGED", 0);
        UNCHANGED = inputRefusalResolution;
        InputRefusalResolution inputRefusalResolution2 = new InputRefusalResolution("HEALED", 1);
        HEALED = inputRefusalResolution2;
        InputRefusalResolution inputRefusalResolution3 = new InputRefusalResolution("STALE", 2);
        STALE = inputRefusalResolution3;
        InputRefusalResolution[] inputRefusalResolutionArr = {inputRefusalResolution, inputRefusalResolution2, inputRefusalResolution3};
        $VALUES = inputRefusalResolutionArr;
        $ENTRIES = C3cG.A0w(inputRefusalResolutionArr);
        Companion = new Companion();
    }

    public static Ey9<InputRefusalResolution> getEntries() {
        return $ENTRIES;
    }

    public static InputRefusalResolution valueOf(String str) {
        return (InputRefusalResolution) Enum.valueOf(InputRefusalResolution.class, str);
    }

    public static InputRefusalResolution[] values() {
        return (InputRefusalResolution[]) $VALUES.clone();
    }

    public InputRefusalResolution(String str, int i) {
    }
}
