package com.meta.maps.display.camera;

import X.C06H;
import X.C3cG;
import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.meta.maps.NativeBase;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.SDKAlignment;
import com.meta.maps.display.SDKInsets;
import java.util.List;

/* loaded from: classes4.dex */
public final class DefaultTrackingController extends CameraTrackingController {
    public static final Companion Companion = new Companion();
    public double followLookAheadDistance;
    public double followZoomLevel;
    public NavigationState navigationState;
    public SDKAlignment onRoutePuckAlignment;
    public SDKInsets routeModeInsets;
    public TrackingMode trackingMode;
    public SDKAlignment usualPuckAlignment;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public final class NavigationState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ NavigationState[] $VALUES;
        public static final NavigationState ON_ROUTE;
        public static final NavigationState STARTED;
        public static final NavigationState STOPPED;
        public final int value;

        static {
            NavigationState navigationState = new NavigationState("STOPPED", 0, 0);
            STOPPED = navigationState;
            NavigationState navigationState2 = new NavigationState(CvmMigrationStatusJson.STAGE_STARTED, 1, 1);
            STARTED = navigationState2;
            NavigationState navigationState3 = new NavigationState("ON_ROUTE", 2, 2);
            ON_ROUTE = navigationState3;
            NavigationState[] navigationStateArr = {navigationState, navigationState2, navigationState3};
            $VALUES = navigationStateArr;
            $ENTRIES = C3cG.A0w(navigationStateArr);
        }

        public static Ey9<NavigationState> getEntries() {
            return $ENTRIES;
        }

        public static NavigationState valueOf(String str) {
            return (NavigationState) Enum.valueOf(NavigationState.class, str);
        }

        public static NavigationState[] values() {
            return (NavigationState[]) $VALUES.clone();
        }

        public NavigationState(String str, int i, int i2) {
            this.value = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class TrackingMode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ TrackingMode[] $VALUES;
        public static final TrackingMode FOLLOW;
        public static final TrackingMode ROUTE;
        public final int value;

        static {
            TrackingMode trackingMode = new TrackingMode("FOLLOW", 0, 0);
            FOLLOW = trackingMode;
            TrackingMode trackingMode2 = new TrackingMode("ROUTE", 1, 1);
            ROUTE = trackingMode2;
            TrackingMode[] trackingModeArr = {trackingMode, trackingMode2};
            $VALUES = trackingModeArr;
            $ENTRIES = new F3w(trackingModeArr);
        }

        public static Ey9<TrackingMode> getEntries() {
            return $ENTRIES;
        }

        public static TrackingMode valueOf(String str) {
            return (TrackingMode) Enum.valueOf(TrackingMode.class, str);
        }

        public static TrackingMode[] values() {
            return (TrackingMode[]) $VALUES.clone();
        }

        public TrackingMode(String str, int i, int i2) {
            this.value = i2;
        }
    }

    private final native void cacheThisInstance();

    public static final native long create();

    public final native double getFollowLookAheadDistance();

    public final native double getFollowZoomLevel();

    public final native NavigationState getNavigationState();

    public final native SDKAlignment getOnRoutePuckAlignment();

    public final native SDKInsets getRouteModeInsets();

    public final native TrackingMode getTrackingMode();

    public final native SDKAlignment getUsualPuckAlignment();

    public final native void setFollowLookAheadDistance(double d);

    public final native void setFollowZoomLevel(double d);

    public final native void setNavigationState(NavigationState navigationState);

    public final native void setOnRoutePuckAlignment(SDKAlignment sDKAlignment);

    public final native void setRouteModeInsets(SDKInsets sDKInsets);

    public final native void setTrackingMode(TrackingMode trackingMode);

    public final native void setUsualPuckAlignment(SDKAlignment sDKAlignment);

    public final native void updateProgress(int i, GeoCoordinates geoCoordinates);

    public final native void updateRoute(List<GeoCoordinates> list, GeoCoordinates geoCoordinates);

    public final class Companion {
        public final long create() {
            return DefaultTrackingController.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DefaultTrackingController(long j, Object obj) {
        super(j, (NativeBase.Disposer) CameraTrackingController.Companion);
    }

    public DefaultTrackingController() {
        super(create(), (NativeBase.Disposer) CameraTrackingController.Companion);
        cacheThisInstance();
    }
}
