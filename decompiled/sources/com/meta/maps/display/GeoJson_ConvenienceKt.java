package com.meta.maps.display;

import X.ADq;
import X.AGH;
import X.ATD;
import X.Ab3;
import X.AbstractC0875AGb;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BNt;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C8154FWw;
import X.DCl;
import X.F60;
import X.FGI;
import android.util.Log;
import com.meta.maps.core.GeoCoordinates;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class GeoJson_ConvenienceKt {
    public static final String TAG = "GeoJson";

    public static final GeoJsonFeature geoJsonFeature(Geometry geometry, Map<String, ? extends Object> map, String str) {
        C7384Etj.A0Y(map, 1);
        GeoJsonFeature geoJsonFeature = new GeoJsonFeature(C3cG.A1S(C60O.A0o(propertiesJson(map))));
        geoJsonFeature.geometry = geometry;
        geoJsonFeature.id = str;
        return geoJsonFeature;
    }

    public static final GeoJsonObject geoJsonObject(List<GeoJsonFeature> list) {
        C7384Etj.A0Y(list, 0);
        GeoJsonObject geoJsonObject = new GeoJsonObject(GeoJsonObjectType.FEATURE_COLLECTION);
        geoJsonObject.featureCollection = new GeoJsonFeatureCollection(list);
        return geoJsonObject;
    }

    public static final Geometry geoJsonPoint(GeoCoordinates geoCoordinates) {
        C7384Etj.A0Y(geoCoordinates, 0);
        Geometry geometry = new Geometry(GeometryType.POINT);
        geometry.point = new Point(geoCoordinates);
        return geometry;
    }

    public static final Map<String, Object> getProperties(GeoJsonFeature geoJsonFeature) {
        C7384Etj.A0Y(geoJsonFeature, 0);
        try {
            JSONObject jSONObject = new JSONObject(new String(geoJsonFeature.propertiesBlob, DCl.A05));
            Iterator<String> itKeys = jSONObject.keys();
            C7384Etj.A0U(itKeys);
            C8154FWw c8154FWwA09 = AbstractC0875AGb.A09(itKeys);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator it = c8154FWwA09.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMapA0j.put(next, decodeProperty(jSONObject.get((String) next)));
            }
            return linkedHashMapA0j;
        } catch (Exception e) {
            Log.w(TAG, "Failed to read GeoJSON properties", e);
            return AGH.A0E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public static final Object decodeProperty(Object obj) {
        Object objA0i;
        if (C7384Etj.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            C7384Etj.A0U(itKeys);
            C8154FWw c8154FWwA09 = AbstractC0875AGb.A09(itKeys);
            objA0i = C3cG.A0j();
            Iterator it = c8154FWwA09.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                objA0i.put(next, decodeProperty(jSONObject.get((String) next)));
            }
        } else {
            if (!(obj instanceof JSONArray)) {
                return obj;
            }
            JSONArray jSONArray = (JSONArray) obj;
            ADq aDqA0C = ATD.A0C(0, jSONArray.length());
            objA0i = AnonymousClass003.A0i(aDqA0C);
            Iterator<Integer> it2 = aDqA0C.iterator();
            while (it2.hasNext()) {
                objA0i.add(decodeProperty(jSONArray.get(((BNt) it2).A00())));
            }
        }
        return objA0i;
    }

    public static final Void dropProperty(String str, Object obj) {
        Log.w(TAG, AnonymousClass006.A0y(obj, "': unsupported value ", C3cI.A0x("Dropping GeoJSON property '", str)));
        return null;
    }

    public static final Object encodeProperty(String str, Object obj) throws JSONException {
        int i;
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof SDKColor) {
            return toStyleColorString((SDKColor) obj);
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Double) {
            i = (Math.abs(((Number) obj).doubleValue()) > Double.MAX_VALUE ? 1 : (Math.abs(((Number) obj).doubleValue()) == Double.MAX_VALUE ? 0 : -1));
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof Map) {
                    JSONObject jSONObject = new JSONObject();
                    Iterator itA0n = AnonymousClass002.A0n((Map) obj);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        Object key = entryA0l.getKey();
                        Object objEncodeProperty = encodeProperty(String.valueOf(key), entryA0l.getValue());
                        if (objEncodeProperty != null) {
                            jSONObject.put(String.valueOf(key), objEncodeProperty);
                        }
                    }
                    return jSONObject;
                }
                if (!(obj instanceof Iterable)) {
                    Log.w(TAG, FGI.A0d("Dropping GeoJSON property '", str, "': unsupported type ", C60Q.A0e(obj)));
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                int i2 = 0;
                for (Object obj2 : (Iterable) obj) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    Object objEncodeProperty2 = encodeProperty(FGI.A0X(str, "[", "]", i2), obj2);
                    if (objEncodeProperty2 != null) {
                        jSONArray.put(objEncodeProperty2);
                    }
                    i2 = i3;
                }
                return jSONArray;
            }
            i = (Math.abs(AnonymousClass001.A02(obj)) > Float.MAX_VALUE ? 1 : (Math.abs(AnonymousClass001.A02(obj)) == Float.MAX_VALUE ? 0 : -1));
        }
        if (i <= 0) {
            return obj;
        }
        dropProperty(str, obj);
        return null;
    }

    public static final JSONObject propertiesJson(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Object objEncodeProperty = encodeProperty(strA0t, entryA0l.getValue());
            if (objEncodeProperty != null) {
                jSONObject.put(strA0t, objEncodeProperty);
            }
        }
        return jSONObject;
    }

    public static final String toStyleColorString(SDKColor sDKColor) {
        int iA01 = Ab3.A01(sDKColor.red * 255.0f);
        if (iA01 < 0) {
            iA01 = 0;
        } else if (iA01 > 255) {
            iA01 = 255;
        }
        Integer numValueOf = Integer.valueOf(iA01);
        int iA012 = Ab3.A01(sDKColor.green * 255.0f);
        if (iA012 < 0) {
            iA012 = 0;
        } else if (iA012 > 255) {
            iA012 = 255;
        }
        Integer numValueOf2 = Integer.valueOf(iA012);
        int iA013 = Ab3.A01(sDKColor.blue * 255.0f);
        if (iA013 < 0) {
            iA013 = 0;
        } else if (iA013 > 255) {
            iA013 = 255;
        }
        return String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, Integer.valueOf(iA013)}, 3));
    }

    public static final GeoJsonFeature geoJsonFeature(Geometry geometry) {
        return geoJsonFeature(geometry, AGH.A0E(), null);
    }

    public static final GeoJsonObject geoJsonObject(GeoJsonFeature geoJsonFeature) {
        C7384Etj.A0Y(geoJsonFeature, 0);
        GeoJsonObject geoJsonObject = new GeoJsonObject(GeoJsonObjectType.FEATURE);
        geoJsonObject.feature = geoJsonFeature;
        return geoJsonObject;
    }

    public static final GeoJsonFeature geoJsonFeature(Geometry geometry, Map<String, ? extends Object> map) {
        C7384Etj.A0Y(map, 1);
        return geoJsonFeature(geometry, map, null);
    }

    public static final GeoJsonObject geoJsonObject(Geometry geometry) {
        C7384Etj.A0Y(geometry, 0);
        GeoJsonObject geoJsonObject = new GeoJsonObject(GeoJsonObjectType.GEOMETRY);
        geoJsonObject.geometry = geometry;
        return geoJsonObject;
    }
}
