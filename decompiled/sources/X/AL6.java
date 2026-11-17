package X;

import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;

/* loaded from: classes4.dex */
public final class AL6 implements MapView.OnDidFailLoadingMapListener {
    public final /* synthetic */ AL9 A00;
    public final /* synthetic */ MapView A01;

    public AL6(AL9 al9, MapView mapView) {
        this.A00 = al9;
        this.A01 = mapView;
    }

    public final void onDidFailLoadingMap(String str) {
        MapLibreMap mapLibreMap;
        AL9 al9 = this.A00;
        if (al9.A0b || al9.A0V != this.A01 || al9.A0E == null) {
            return;
        }
        boolean z = al9.A0I;
        al9.A0E = null;
        al9.A0D = null;
        CFK.A06("BaseMapView", FGI.A0M("Map style failed to load: ", str));
        if (!z) {
            AnonymousClass001.A1E(al9.A0Z, null, new AL5(new AL4(C79.A0C, C3cG.A0Q(str))));
        }
        HxE<C9V6, Boolean> hxE = al9.A0F;
        al9.A0F = null;
        if (hxE == null || (mapLibreMap = al9.A0T) == null) {
            return;
        }
        al9.A0D(hxE.first, mapLibreMap, AnonymousClass001.A1X(hxE.second));
    }
}
