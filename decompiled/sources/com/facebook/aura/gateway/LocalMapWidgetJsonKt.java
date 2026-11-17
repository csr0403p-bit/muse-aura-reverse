package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C06G;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapMarker;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class LocalMapWidgetJsonKt {
    public static final int LOCAL_MAP_SUPPORTED_SCHEMA_VERSION = 1;

    public static final HatchMapScene toDomain(LocalMapTypedDataJson localMapTypedDataJson) {
        String strA0l;
        C06G place;
        C7384Etj.A0Y(localMapTypedDataJson, 0);
        Integer num = localMapTypedDataJson.schema_version;
        String str = null;
        if (num != null && num.intValue() == 1) {
            ArrayList arrayListA0t = C60Q.A0t(localMapTypedDataJson.elements);
            Iterator<LocalMapElementJson> it = localMapTypedDataJson.elements.iterator();
            while (true) {
                if (it.hasNext()) {
                    LocalMapElementJson next = it.next();
                    String str2 = next.kind;
                    if ("rich_place".equals(str2)) {
                        place = toPlace(next);
                    } else if ("marker".equals(str2)) {
                        place = toMarker(next);
                    } else {
                        continue;
                    }
                    if (place == null) {
                        break;
                    }
                    arrayListA0t.add(place);
                } else if (!arrayListA0t.isEmpty()) {
                    List listA0X = AbstractC0878AGe.A0X(arrayListA0t);
                    String str3 = localMapTypedDataJson.motivation;
                    if (str3 != null && (strA0l = AnonymousClass002.A0l(str3)) != null && strA0l.length() > 0) {
                        str = strA0l;
                    }
                    return new HatchMapScene(listA0X, str);
                }
            }
        }
        return null;
    }

    public static final HatchMapMarker toMarker(LocalMapElementJson localMapElementJson) {
        LocalMapCoordinateJson localMapCoordinateJson;
        HatchMapCoordinate domain;
        String strA0l;
        String strA0l2;
        String str = localMapElementJson.id;
        if (str.length() == 0 || (localMapCoordinateJson = localMapElementJson.coordinate) == null || (domain = toDomain(localMapCoordinateJson)) == null) {
            return null;
        }
        String str2 = localMapElementJson.title;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str3 = localMapElementJson.subtitle;
        if (str3 == null || (strA0l2 = AnonymousClass002.A0l(str3)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        String str4 = localMapElementJson.background_image_url;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        return new HatchMapMarker(str, domain, strA0l, strA0l2, str4);
    }

    public static final HatchMapPlace toPlace(LocalMapElementJson localMapElementJson) {
        LocalMapCoordinateJson localMapCoordinateJson;
        HatchMapCoordinate domain;
        String strA0l;
        String str = localMapElementJson.id;
        if (str.length() == 0) {
            return null;
        }
        String str2 = localMapElementJson.place_id;
        if (str2.length() == 0) {
            return null;
        }
        String str3 = localMapElementJson.name;
        if (str3.length() == 0 || (localMapCoordinateJson = localMapElementJson.coordinate) == null || (domain = toDomain(localMapCoordinateJson)) == null) {
            return null;
        }
        String str4 = localMapElementJson.category;
        if (str4 == null || (strA0l = AnonymousClass002.A0l(str4)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str5 = localMapElementJson.photo_url;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        return new HatchMapPlace(str, str2, str3, domain, strA0l, str5);
    }

    public static final HatchMapCoordinate toDomain(LocalMapCoordinateJson localMapCoordinateJson) {
        Double d = localMapCoordinateJson.latitude;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = localMapCoordinateJson.longitude;
            if (d2 != null) {
                return new HatchMapCoordinate(dDoubleValue, d2.doubleValue());
            }
        }
        return null;
    }
}
