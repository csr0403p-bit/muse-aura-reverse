package com.facebook.aura.localbrowser.core;

import X.AbstractC7607F5u;
import X.C60O;
import X.C7384Etj;
import X.C9iZ;
import X.C9oY;
import X.C9tJ;
import com.hatch.browser.protocol.CoordinateScope;
import com.hatch.browser.protocol.DocumentKey;
import com.hatch.browser.protocol.Point;
import com.hatch.browser.protocol.ViewportScope;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes6.dex */
public abstract class BrowserVisualOperationsKt {
    public static final List<BrowserArg> captureArgs;
    public static final BrowserArg coordinateScopeArg;
    public static final List<BrowserArg> observationArgs;

    public static final BrowserArg required(String str, BrowserArgType browserArgType, String str2) {
        return AbstractC7607F5u.A0w(str, browserArgType, str2, true);
    }

    static {
        BrowserArgType browserArgType = BrowserArgType.INTEGER;
        captureArgs = Arrays.asList(AbstractC7607F5u.A0w("max_width", browserArgType, "Maximum image width, 1\u20134096 pixels.", false), AbstractC7607F5u.A0w("max_height", browserArgType, "Maximum image height, 1\u20134096 pixels.", false), AbstractC7607F5u.A0w("image_format", BrowserArgType.STRING, "jpeg (default) or png. The response includes its MIME type.", false));
        coordinateScopeArg = AbstractC7607F5u.A0w("coordinate_scope", BrowserArgType.OBJECT, "Unchanged scope from capture: {document: string, viewport: string}.", true);
        observationArgs = Arrays.asList(AbstractC7607F5u.A0w(BrowserOperationCatalogKt.OBSERVE_AFTER, BrowserArgType.BOOLEAN, "Observe afterwards; default true.", false), AbstractC7607F5u.A0w("failure_context", BrowserArgType.STRING, "Opaque failure context from the preceding SDK report.", false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r3 < 4097) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.hatch.browser.protocol.CaptureOptions captureOptions(com.facebook.aura.localbrowser.core.BrowserArgs r10) {
        /*
            java.lang.String r0 = "max_width"
            java.lang.Long r9 = r10.m1244long(r0)
            java.lang.String r0 = "max_height"
            java.lang.Long r1 = r10.m1244long(r0)
            r7 = 4097(0x1001, double:2.024E-320)
            r5 = 1
            r2 = 0
            if (r9 == 0) goto L1f
            long r3 = r9.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L4c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L4c
        L1f:
            if (r1 == 0) goto L2d
            long r3 = r1.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L4c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L4c
        L2d:
            if (r9 == 0) goto L4a
            long r3 = r9.longValue()
            int r0 = (int) r3
            X.FKC r3 = X.FKC.A01(r0)
        L38:
            if (r1 == 0) goto L43
            long r1 = r1.longValue()
            int r0 = (int) r1
            X.FKC r2 = X.FKC.A01(r0)
        L43:
            r1 = 0
            com.hatch.browser.protocol.CaptureOptions r0 = new com.hatch.browser.protocol.CaptureOptions
            r0.<init>(r3, r2, r1)
            return r0
        L4a:
            r3 = r2
            goto L38
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserVisualOperationsKt.captureOptions(com.facebook.aura.localbrowser.core.BrowserArgs):com.hatch.browser.protocol.CaptureOptions");
    }

    public static final Double number(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && !jsonPrimitive.A01()) {
            C9iZ c9iZ = C9oY.A00;
            Double dA0v = C9tJ.A0v(jsonPrimitive.A00());
            if (dA0v != null && Math.abs(dA0v.doubleValue()) <= Double.MAX_VALUE) {
                return dA0v;
            }
        }
        return null;
    }

    public static final Point point(JsonObject jsonObject) {
        Double dNumber;
        if (!C7384Etj.areEqual(jsonObject.keySet(), C60O.A19("x", "y")) || (dNumber = number(jsonObject, "x")) == null) {
            return null;
        }
        double dDoubleValue = dNumber.doubleValue();
        Double dNumber2 = number(jsonObject, "y");
        if (dNumber2 != null) {
            return new Point(dDoubleValue, dNumber2.doubleValue());
        }
        return null;
    }

    public static final CoordinateScope scope(JsonObject jsonObject) {
        String strString;
        if (!C7384Etj.areEqual(jsonObject.keySet(), C60O.A19("document", "viewport")) || (strString = string(jsonObject, "document")) == null) {
            return null;
        }
        DocumentKey documentKey = new DocumentKey(strString);
        String strString2 = string(jsonObject, "viewport");
        if (strString2 != null) {
            return new CoordinateScope(documentKey, new ViewportScope(strString2));
        }
        return null;
    }

    public static final String string(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }
}
