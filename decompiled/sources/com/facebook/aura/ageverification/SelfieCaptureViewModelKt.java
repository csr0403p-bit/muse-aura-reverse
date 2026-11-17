package com.facebook.aura.ageverification;

/* loaded from: classes3.dex */
public abstract class SelfieCaptureViewModelKt {
    public static final float FACE_ANGLE_THRESHOLD_SIDE = 0.07f;
    public static final float FACE_ANGLE_THRESHOLD_UP = 0.08f;
    public static final float FACE_ANGLE_THRESHOLD_UP_FROM_BASE = 0.065f;
    public static final long FACE_LOST_TIMEOUT_MS = 2000;
    public static final long FINISHING_MS = 750;
    public static final long FRONTAL_HOLD_MS = 200;
    public static final long HINT_HOLD_MS = 100;
    public static final long HINT_MIN_SHOWN_MS = 400;
    public static final float LOW_LIGHT_LUMA = 0.2f;
    public static final long LOW_LIGHT_MS = 5000;
    public static final long MAX_TICK_MS = 64;
    public static final long MOVEMENT_HOLD_MS = 500;
    public static final long NOT_SINCE = -1;
    public static final long PROGRESS_TICK_MS = 16;
    public static final long STATE_CAPTURE_DURATION_MS = 300;
    public static final String TAG = "SelfieCaptureViewModel";

    public static final /* synthetic */ long access$orNow(long j, long j2) {
        return j == -1 ? j2 : j;
    }

    public static final boolean heldFor(long j, long j2, long j3) {
        return j != -1 && j2 - j >= j3;
    }

    public static final long orNow(long j, long j2) {
        return j == -1 ? j2 : j;
    }
}
