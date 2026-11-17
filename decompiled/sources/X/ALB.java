package X;

import com.meta.maps.display.SDKInsets;
import com.meta.maps.display.camera.CameraAnimationPlugin;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.OnMapReadyCallback;

/* loaded from: classes4.dex */
public final class ALB implements OnMapReadyCallback {
    public final /* synthetic */ ALE A00;
    public final /* synthetic */ AL9 A01;
    public final /* synthetic */ MapView A02;

    public final void onMapReady(MapLibreMap mapLibreMap) {
        C7384Etj.A0Y(mapLibreMap, 0);
        AL9 al9 = this.A01;
        if (!al9.A0b) {
            MapView mapView = al9.A0V;
            MapView mapView2 = this.A02;
            if (mapView == mapView2) {
                al9.A0T = mapLibreMap;
                al9.setupFeatureTapListener(mapLibreMap);
                CameraAnimationPlugin cameraAnimationPlugin = al9.A0B;
                if (cameraAnimationPlugin == null) {
                    C7384Etj.A0b("cameraPlugin");
                    throw F60.createAndThrow();
                }
                cameraAnimationPlugin.setMapContentInset(new SDKInsets());
                CameraAnimationPlugin cameraAnimationPlugin2 = al9.A0B;
                if (cameraAnimationPlugin2 == null) {
                    C7384Etj.A0b("cameraPlugin");
                    throw F60.createAndThrow();
                }
                cameraAnimationPlugin2.setMapContentPadding(new SDKInsets());
                ALE ale = this.A00;
                AL9.A07(ale, mapLibreMap);
                al9.A0C = ale.A05;
                ALL all = al9.A06;
                if (all != null) {
                    AL9.A09(all, mapLibreMap);
                }
                ALJ alj = al9.A0A;
                if (alj == null) {
                    alj = ale.A04;
                }
                ALI.A00(alj, mapLibreMap, mapView2);
                HxE<C9V6, Boolean> hxEA0q = al9.A0F;
                if (hxEA0q == null) {
                    hxEA0q = AnonymousClass002.A0q(ale.A02, ale.A09);
                }
                C9V6 c9v6 = hxEA0q.first;
                boolean zA1X = AnonymousClass001.A1X(hxEA0q.second);
                al9.A0F = null;
                al9.A0D(c9v6, mapLibreMap, zA1X);
                return;
            }
        }
        CFK.A06("BaseMapView", "getMapAsync fired after teardown; skipping");
    }

    public ALB(ALE ale, AL9 al9, MapView mapView) {
        this.A01 = al9;
        this.A02 = mapView;
        this.A00 = ale;
    }
}
