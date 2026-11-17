package X;

import android.content.Context;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.UiSettings;
import org.maplibre.android.utils.ColorUtils;

/* loaded from: classes4.dex */
public abstract class ALI {
    public static final void A00(ALJ alj, MapLibreMap mapLibreMap, MapView mapView) {
        C7384Etj.A0Y(alj, 2);
        UiSettings uiSettings = mapLibreMap.getUiSettings();
        C7384Etj.A0U(uiSettings);
        uiSettings.setAttributionEnabled(true);
        uiSettings.setAttributionGravity(alj.A00);
        uiSettings.setAttributionMargins(alj.A01, alj.A02, 0, 0);
        Integer num = alj.A03;
        uiSettings.setAttributionTintColor(num != null ? num.intValue() : ColorUtils.getPrimaryColor(mapView.getContext()));
        uiSettings.setLogoEnabled(false);
        Context context = mapView.getContext();
        C7384Etj.A0U(context);
        uiSettings.setAttributionDialogManager(new BE4(context, alj, mapLibreMap));
    }
}
