package com.meta.maps.display.camera;

import X.C06H;
import X.Ey9;
import X.F3w;
import com.meta.maps.NativeBase;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes4.dex */
public class CameraTrackingController extends NativeBase {
    public static final Companion Companion = new Companion();
    public final TrackingState trackingState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class TrackingState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ TrackingState[] $VALUES;
        public static final TrackingState ACTIVE;
        public static final TrackingState PAUSED;
        public static final TrackingState STOPPED;
        public final int value;

        static {
            TrackingState trackingState = new TrackingState("ACTIVE", 0, 0);
            ACTIVE = trackingState;
            TrackingState trackingState2 = new TrackingState("STOPPED", 1, 1);
            STOPPED = trackingState2;
            TrackingState trackingState3 = new TrackingState("PAUSED", 2, 2);
            PAUSED = trackingState3;
            TrackingState[] trackingStateArr = {trackingState, trackingState2, trackingState3};
            $VALUES = trackingStateArr;
            $ENTRIES = new F3w(trackingStateArr);
        }

        public static Ey9<TrackingState> getEntries() {
            return $ENTRIES;
        }

        public static TrackingState valueOf(String str) {
            return (TrackingState) Enum.valueOf(TrackingState.class, str);
        }

        public static TrackingState[] values() {
            return (TrackingState[]) $VALUES.clone();
        }

        public TrackingState(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public static final native void disposeNativeHandle(long j);

    public final native TrackingState getTrackingState();

    public final native void updateLocationCoordinates(GeoCoordinates geoCoordinates);

    public final native void updateTrackingState(TrackingState trackingState, boolean z);

    public CameraTrackingController(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            CameraTrackingController.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            CameraTrackingController.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
