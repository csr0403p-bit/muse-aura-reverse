package com.meta.maps.display.routeline;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.MapContent;
import com.meta.maps.time.Duration;
import java.util.List;

/* loaded from: classes4.dex */
public final class RouteLine extends NativeBase {
    public static final Companion Companion = new Companion();
    public final MapContent content;
    public final String identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLine(String str) {
        super(create(str), Companion);
        C7384Etj.A0Y(str, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create(String str);

    public static final native void disposeNativeHandle(long j);

    public final native MapContent getContent();

    public final native String getIdentifier();

    public final native void updateDottedGeometry(List<GeoCoordinates> list);

    public final native void updateGeometry(String str);

    public final native void updateGeometry(List<GeoCoordinates> list);

    public final native void updateGeometryAnimated(List<GeoCoordinates> list, Duration duration);

    public final native void updatePercentComplete(double d);

    public final native void updatePercentCompleteAnimated(double d, Duration duration);

    public final native void updateSegmentProgress(int i, double d);

    public final native void updateSegmentProgressAnimated(int i, double d, Duration duration);

    public final native void updateSegments(List<RouteSegment> list);

    public final native void updateStyle(RouteLineStyle routeLineStyle);

    public final class Companion implements NativeBase.Disposer {
        public final long create(String str) {
            return RouteLine.create(str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            RouteLine.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            RouteLine.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }

    public RouteLine(long j, Object obj) {
        super(j, Companion);
    }
}
