package X;

import com.meta.maps.display.MapController;
import com.meta.maps.display.camera.CameraAnimationPlugin;
import com.meta.maps.display.routeline.RouteLinePlugin;

/* renamed from: X.9n4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9n4 {
    public final C8832Fpe A00;
    public final MapController A01;
    public final CameraAnimationPlugin A02;
    public final RouteLinePlugin A03;
    public volatile boolean A04;

    public C9n4(C8832Fpe c8832Fpe, MapController mapController, CameraAnimationPlugin cameraAnimationPlugin, RouteLinePlugin routeLinePlugin) {
        C7384Etj.A0Y(mapController, 0);
        this.A01 = mapController;
        this.A02 = cameraAnimationPlugin;
        this.A03 = routeLinePlugin;
        this.A00 = c8832Fpe;
        this.A04 = true;
    }

    public final MapController A00() {
        MapController mapController = this.A01;
        if (this.A04) {
            return mapController;
        }
        throw C3cG.A0Q("BaseMapSession is no longer valid");
    }

    public final CameraAnimationPlugin A01() {
        CameraAnimationPlugin cameraAnimationPlugin = this.A02;
        if (this.A04) {
            return cameraAnimationPlugin;
        }
        throw C3cG.A0Q("BaseMapSession is no longer valid");
    }
}
