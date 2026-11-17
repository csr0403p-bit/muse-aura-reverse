package X;

import org.maplibre.android.maps.MapView;

/* loaded from: classes4.dex */
public final class ALH implements Dg3 {
    public final /* synthetic */ AL9 A00;
    public final /* synthetic */ MapView A01;

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        boolean z = true;
        C7384Etj.A0Y(enumC3085Bxl, 1);
        AL9 al9 = this.A00;
        if (al9.A0b) {
            return;
        }
        MapView mapView = al9.A0V;
        MapView mapView2 = this.A01;
        if (mapView == mapView2) {
            switch (enumC3085Bxl.ordinal()) {
                case 0:
                    if (al9.A0K) {
                        return;
                    }
                    al9.A0K = true;
                    return;
                case 1:
                    if (al9.A0M) {
                        return;
                    }
                    mapView2.onStart();
                    al9.A0M = true;
                    return;
                case 2:
                    if (al9.A0L) {
                        return;
                    }
                    break;
                case 3:
                    if (al9.A0L) {
                        z = false;
                        break;
                    } else {
                        return;
                    }
                case 4:
                    if (al9.A0M) {
                        mapView2.onStop();
                        al9.A0M = false;
                        return;
                    }
                    return;
                case 5:
                    al9.A0L();
                    return;
                default:
                    return;
            }
            al9.A0L = z;
        }
    }

    public ALH(AL9 al9, MapView mapView) {
        this.A00 = al9;
        this.A01 = mapView;
    }
}
