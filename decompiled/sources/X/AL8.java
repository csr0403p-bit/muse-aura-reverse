package X;

import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Style;

/* loaded from: classes4.dex */
public final class AL8 implements Style.OnStyleLoaded {
    public final /* synthetic */ AL9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ MapLibreMap A02;
    public final /* synthetic */ MapView A03;
    public final /* synthetic */ boolean A04;

    public AL8(AL9 al9, String str, MapLibreMap mapLibreMap, MapView mapView, boolean z) {
        this.A00 = al9;
        this.A03 = mapView;
        this.A01 = str;
        this.A04 = z;
        this.A02 = mapLibreMap;
    }

    public final void onStyleLoaded(Style style) {
        C9n4 c9n4;
        AL9 al9 = this.A00;
        if (al9.A0b || al9.A0V != this.A03) {
            return;
        }
        String str = al9.A0E;
        String str2 = this.A01;
        if (C7384Etj.areEqual(str, str2)) {
            al9.A0E = null;
            al9.A0D = str2;
            al9.getMapController().onStyleLoaded();
            al9.A0J = true;
            ALF alf = al9.A09;
            if (alf != null) {
                if (alf.A00) {
                    throw C3cG.A0Q("FancyPins runtime is closed");
                }
                if (!alf.A01) {
                    alf.A07.invoke();
                    alf.A01 = true;
                }
            }
            al9.A0I = true;
            if (this.A04 && !al9.A0b && (c9n4 = al9.A08) != null) {
                if (al9.getWidth() > 0 && al9.getHeight() > 0) {
                    AL9.A0B(c9n4, al9);
                } else if (al9.A01 == null) {
                    ALO alo = new ALO(c9n4, al9);
                    al9.A01 = alo;
                    al9.addOnLayoutChangeListener(alo);
                }
            }
            HxE<C9V6, Boolean> hxE = al9.A0F;
            al9.A0F = null;
            if (hxE != null) {
                al9.A0D(hxE.first, this.A02, AnonymousClass001.A1X(hxE.second));
            }
        }
    }
}
