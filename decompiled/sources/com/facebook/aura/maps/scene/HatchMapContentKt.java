package com.facebook.aura.maps.scene;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C6tn;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapMarker;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.Color_SDKColorKt;
import com.meta.maps.display.GeoJsonObject;
import com.meta.maps.display.GeoJson_ConvenienceKt;
import com.meta.maps.display.Geometry;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class HatchMapContentKt {
    public static final String CONTENT_LAYER_ID_TOKEN = "{content_layer_id}";
    public static final String HATCH_MAP_PIN_LAYER_ID = "hatch_map_pins";
    public static final float SELECTED_LABEL_FONT_SIZE_POINTS = 15.0f;
    public static final float SELECTED_LABEL_MAX_WIDTH_EM = 9.0f;
    public static final float SELECTED_LABEL_MAX_WIDTH_POINTS = 135.0f;
    public static final String SOURCE_ID_TOKEN = "{source_id}";

    public static final String pinLayerDefinition(HatchMapTheme hatchMapTheme, boolean z, boolean z2, float f, float f2, float f3, float f4) {
        String str;
        int i;
        C7384Etj.A0Y(hatchMapTheme, 0);
        if (Math.abs(f) > Float.MAX_VALUE || Math.abs(f2) > Float.MAX_VALUE || Math.abs(f3) > Float.MAX_VALUE || Math.abs(f4) > Float.MAX_VALUE) {
            throw C60O.A0i("Pin icon offsets must be finite");
        }
        if (z2) {
            str = "selected_fullscreen";
            i = 300;
        } else {
            str = "selected_inline";
            i = 0;
        }
        String str2 = z ? "dark" : AvatarMediaMapperKt.LIGHT;
        boolean z3 = !z2;
        String styleColorString = Color_SDKColorKt.toStyleColorString(HatchMapThemeKt.pinLabelColor(hatchMapTheme, z));
        String styleColorString2 = Color_SDKColorKt.toStyleColorString(HatchMapThemeKt.backgroundColor(hatchMapTheme, z));
        StringBuilder sbA0x = C3cI.A0x("\n    [\n      {\n        \"id\": \"{content_layer_id}_symbol\",\n        \"type\": \"symbol\",\n        \"source\": \"{source_id}\",\n        \"minzoom\": 1,\n        \"maxzoom\": 25,\n        \"layout\": {\n          \"icon-image\": \"hatch-pin:{image_key}:", str2);
        sbA0x.append(":#if_proxy ");
        sbA0x.append(str);
        sbA0x.append(" #else unselected #endif\",\n          \"icon-anchor\": \"center\",\n          \"icon-offset\": [\n            #if_proxy ");
        sbA0x.append(f3);
        sbA0x.append(" #else ");
        sbA0x.append(f);
        sbA0x.append(" #endif,\n            #if_proxy ");
        sbA0x.append(f4);
        sbA0x.append(" #else ");
        sbA0x.append(f2);
        sbA0x.append(" #endif\n          ],\n          \"icon-allow-overlap\": true,\n          \"icon-ignore-placement\": #if_proxy true #else false #endif,\n          \"text-field\": \"{title}\",\n          \"text-font\": [\"Optimistic-SemiBold-95\", \"NotoSans-Kurrent-Regular\"],\n          \"text-size\": #if_proxy 15.0 #else 12 #endif,\n          \"text-max-width\": 9.0,\n          \"text-anchor\": \"top\",\n          \"text-offset\": [0, 0.35],\n          \"text-optional\": #if_proxy false #else true #endif,\n          \"text-allow-overlap\": #if_proxy true #else false #endif,\n          \"text-ignore-placement\": #if_proxy false #else ");
        sbA0x.append(z3);
        sbA0x.append(" #endif\n        },\n        \"paint\": {\n          \"text-opacity\": #if_proxy 1 #else ");
        sbA0x.append(z2 ? 1 : 0);
        sbA0x.append(" #endif,\n          \"text-opacity-transition\": { \"duration\": ");
        sbA0x.append(i);
        sbA0x.append(", \"delay\": 0 },\n          \"text-color\": \"");
        sbA0x.append(styleColorString);
        sbA0x.append("\",\n          \"text-halo-color\": \"");
        sbA0x.append(styleColorString2);
        return C6tn.A05(AnonymousClass001.A0v("\",\n          \"text-halo-width\": 1.5\n        }\n      }\n    ]\n    ", sbA0x));
    }

    public static final GeoJsonObject toGeoJsonObject(HatchMapScene hatchMapScene) {
        String artifactId;
        String str;
        C7384Etj.A0Y(hatchMapScene, 0);
        List<HatchMapElement> list = hatchMapScene.elements;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchMapElement hatchMapElement : list) {
            Geometry geometryGeoJsonPoint = GeoJson_ConvenienceKt.geoJsonPoint(new GeoCoordinates(hatchMapElement.getCoordinate().latitude, hatchMapElement.getCoordinate().longitude));
            HxE hxEA0r = C3cG.A0r("id", hatchMapElement.getArtifactId());
            HxE hxEA0r2 = C3cG.A0r("kind", hatchMapElement.getKind());
            boolean z = hatchMapElement instanceof HatchMapPlace;
            if (z) {
                artifactId = ((HatchMapPlace) hatchMapElement).placeId;
            } else {
                if (!(hatchMapElement instanceof HatchMapMarker)) {
                    throw C3cG.A0q();
                }
                artifactId = hatchMapElement.getArtifactId();
            }
            HxE hxEA0r3 = C3cG.A0r("image_key", artifactId);
            if (z) {
                str = ((HatchMapPlace) hatchMapElement).name;
            } else {
                if (!(hatchMapElement instanceof HatchMapMarker)) {
                    throw C3cG.A0q();
                }
                str = ((HatchMapMarker) hatchMapElement).title;
                if (str == null) {
                    str = "";
                }
            }
            arrayListA0i.add(GeoJson_ConvenienceKt.geoJsonFeature(geometryGeoJsonPoint, C3cH.A0n("title", str, hxEA0r, hxEA0r2, hxEA0r3), hatchMapElement.getArtifactId()));
        }
        return GeoJson_ConvenienceKt.geoJsonObject(arrayListA0i);
    }

    public static /* synthetic */ String pinLayerDefinition$default(HatchMapTheme hatchMapTheme, boolean z, boolean z2, float f, float f2, float f3, float f4, int i, Object obj) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        boolean zA1Q = AnonymousClass001.A1Q(i, z2);
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        if ((i & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i & 32) != 0) {
            f4 = 0.0f;
        }
        return pinLayerDefinition(hatchMapTheme, zA1P, zA1Q, f, f2, f3, f4);
    }
}
