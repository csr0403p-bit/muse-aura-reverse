package com.meta.maps.fancypins;

import X.AbstractC0875AGb;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8154FWw;
import X.C9jH;
import X.DCl;
import X.FGI;
import X.HsJ;
import android.util.Log;
import android.util.SizeF;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FancyPinMeasurerKt {
    public static final String PROPERTIES_TAG = "FancyPinProperties";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Hud] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public static final Map<String, Object> decodeProperties(FancyPin fancyPin) {
        Object objA0s;
        C7384Etj.A0Y(fancyPin, 0);
        byte[] bArr = fancyPin.data;
        if (bArr.length == 0) {
            return C9jH.A00;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, DCl.A05));
            Iterator<String> itKeys = jSONObject.keys();
            C7384Etj.A0U(itKeys);
            C8154FWw c8154FWwA09 = AbstractC0875AGb.A09(itKeys);
            objA0s = C3cG.A0j();
            Iterator it = c8154FWwA09.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = jSONObject.get((String) next);
                C7384Etj.A0U(obj);
                objA0s.put(next, toPlatformValue(obj));
            }
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        C9jH c9jH = objA0s;
        if (thA00 != null) {
            Log.e(PROPERTIES_TAG, FGI.A0U("FancyPins: Pin '", fancyPin.id, "' properties are not a JSON object"), thA00);
            c9jH = C9jH.A00;
        }
        return c9jH;
    }

    public static final float toConstraint(double d) {
        if (d < 0.0d || Double.isNaN(d)) {
            throw C60O.A0i("AUTO size constraint must be nonnegative");
        }
        if (d == 0.0d || d >= 3.4028234663852886E38d || Double.isInfinite(d)) {
            return Float.MAX_VALUE;
        }
        return (float) d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public static final Object toPlatformValue(Object obj) throws JSONException {
        Object objA11;
        if (C7384Etj.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            C7384Etj.A0U(itKeys);
            C8154FWw c8154FWwA09 = AbstractC0875AGb.A09(itKeys);
            objA11 = C3cG.A0j();
            Iterator it = c8154FWwA09.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj2 = jSONObject.get((String) next);
                C7384Etj.A0U(obj2);
                objA11.put(next, toPlatformValue(obj2));
            }
        } else {
            if (!(obj instanceof JSONArray)) {
                return obj;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            objA11 = C60O.A11(length);
            for (int i = 0; i < length; i++) {
                Object obj3 = jSONArray.get(i);
                C7384Etj.A0U(obj3);
                objA11.add(toPlatformValue(obj3));
            }
        }
        return objA11;
    }

    public static final boolean isValidWithin(SizeF sizeF, SizeF sizeF2) {
        return Math.abs(sizeF.getWidth()) <= Float.MAX_VALUE && Math.abs(sizeF.getHeight()) <= Float.MAX_VALUE && sizeF.getWidth() >= 0.0f && sizeF.getHeight() >= 0.0f && sizeF.getWidth() <= sizeF2.getWidth() && sizeF.getHeight() <= sizeF2.getHeight();
    }
}
