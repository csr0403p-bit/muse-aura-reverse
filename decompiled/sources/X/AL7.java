package X;

import android.graphics.PointF;
import com.meta.maps.display.GestureInteraction;
import com.meta.maps.display.GestureInteractionHandler;
import com.meta.maps.display.GestureType;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes4.dex */
public final class AL7 implements MapLibreMap.OnMapClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AL9 A01;
    public final /* synthetic */ MapLibreMap A02;

    public final boolean onMapClick(LatLng latLng) {
        C7384Etj.A0Y(latLng, 0);
        AL9 al9 = this.A01;
        boolean zHandleGesture = false;
        if (!al9.A0b) {
            MapLibreMap mapLibreMap = al9.A0T;
            MapLibreMap mapLibreMap2 = this.A02;
            if (mapLibreMap == mapLibreMap2) {
                PointF screenLocation = mapLibreMap2.getProjection().toScreenLocation(latLng);
                C7384Etj.A0U(screenLocation);
                ALF alf = al9.A09;
                if (alf != null) {
                    String strInvoke = alf.A0C.invoke(Float.valueOf(screenLocation.x), Float.valueOf(screenLocation.y));
                    if (strInvoke != null && alf.A03.A04(strInvoke)) {
                        return true;
                    }
                }
                GestureType gestureType = GestureType.TAP;
                float f = screenLocation.x;
                float f2 = this.A00;
                GestureInteraction gestureInteraction = new GestureInteraction(gestureType, f / f2, screenLocation.y / f2);
                GestureInteractionHandler gestureInteractionHandler = al9.getMapController().getGestureInteractionHandler();
                if ((gestureInteractionHandler == null || !(zHandleGesture = gestureInteractionHandler.handleGesture(gestureInteraction))) && !al9.A0b && al9.A0T == mapLibreMap2 && al9.A09 == alf && alf != null) {
                    C8832Fpe.A00(alf.A03);
                }
            }
        }
        return zHandleGesture;
    }

    public AL7(AL9 al9, MapLibreMap mapLibreMap, float f) {
        this.A01 = al9;
        this.A02 = mapLibreMap;
        this.A00 = f;
    }
}
