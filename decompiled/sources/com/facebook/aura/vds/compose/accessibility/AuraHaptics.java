package com.facebook.aura.vds.compose.accessibility;

/* loaded from: classes.dex */
public final class AuraHaptics {
    public static final int $stable = 0;
    public static final int LONG_PRESS = 0;
    public static final AuraHaptics INSTANCE = new AuraHaptics();
    public static final int BUTTON_TAP = 1;
    public static final int CONTEXT_TAP = 6;
    public static final int SEGMENT_SWITCH = 26;
    public static final int SUCCESS = 16;
    public static final int FAILURE = 17;
    public static final int GESTURE_THRESHOLD = 23;
    public static final int GESTURE_COMPLETE = 13;
    public static final int TOGGLE_ON = 21;
    public static final int TOGGLE_OFF = 22;

    /* renamed from: getBUTTON_TAP-5zf0vsI, reason: not valid java name */
    public final int m2380getBUTTON_TAP5zf0vsI() {
        return BUTTON_TAP;
    }

    /* renamed from: getCONTEXT_TAP-5zf0vsI, reason: not valid java name */
    public final int m2381getCONTEXT_TAP5zf0vsI() {
        return CONTEXT_TAP;
    }

    /* renamed from: getFAILURE-5zf0vsI, reason: not valid java name */
    public final int m2382getFAILURE5zf0vsI() {
        return FAILURE;
    }

    /* renamed from: getGESTURE_COMPLETE-5zf0vsI, reason: not valid java name */
    public final int m2383getGESTURE_COMPLETE5zf0vsI() {
        return GESTURE_COMPLETE;
    }

    /* renamed from: getGESTURE_THRESHOLD-5zf0vsI, reason: not valid java name */
    public final int m2384getGESTURE_THRESHOLD5zf0vsI() {
        return GESTURE_THRESHOLD;
    }

    /* renamed from: getLONG_PRESS-5zf0vsI, reason: not valid java name */
    public final int m2385getLONG_PRESS5zf0vsI() {
        return LONG_PRESS;
    }

    /* renamed from: getSEGMENT_SWITCH-5zf0vsI, reason: not valid java name */
    public final int m2386getSEGMENT_SWITCH5zf0vsI() {
        return SEGMENT_SWITCH;
    }

    /* renamed from: getSUCCESS-5zf0vsI, reason: not valid java name */
    public final int m2387getSUCCESS5zf0vsI() {
        return SUCCESS;
    }

    /* renamed from: getTOGGLE_OFF-5zf0vsI, reason: not valid java name */
    public final int m2388getTOGGLE_OFF5zf0vsI() {
        return TOGGLE_OFF;
    }

    /* renamed from: getTOGGLE_ON-5zf0vsI, reason: not valid java name */
    public final int m2389getTOGGLE_ON5zf0vsI() {
        return TOGGLE_ON;
    }

    /* renamed from: toggle-OhMXMIo, reason: not valid java name */
    public final int m2390toggleOhMXMIo(boolean z) {
        return z ? TOGGLE_ON : TOGGLE_OFF;
    }
}
