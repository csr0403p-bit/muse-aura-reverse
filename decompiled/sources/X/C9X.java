package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C9X {
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static volatile Map<String, JSONObject> A08;
    public static volatile boolean A0A;
    public static volatile boolean A0B;
    public static volatile JSONObject A09 = BV4.A18();
    public static String A00 = "";

    public static String A01(String str, boolean z, boolean z2) {
        if (!z2 && !A04()) {
            return null;
        }
        String property = System.getProperty(str);
        if (property == null || property.equals("")) {
            String property2 = System.getProperty(FGI.A0M("fb.e2e.", str));
            if (property2 != null && !property2.equals("")) {
                return property2;
            }
            if (z) {
                try {
                    property = AbstractC3459COf.A02(str);
                    if (property.equals("")) {
                        String strA02 = AbstractC3459COf.A02(FGI.A0M("fb.e2e.", str));
                        if (!strA02.equals("")) {
                            return strA02;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }
        return property;
    }

    public static C5198DdA A00() {
        JSONObject jSONObjectOptJSONObject;
        if (A04() && A09 != null && (jSONObjectOptJSONObject = A09.optJSONObject("auth_data")) != null) {
            try {
                CFK.A06("EndToEnd-Test", AnonymousClass007.A0a("Using auth data: ", jSONObjectOptJSONObject));
                return new C5198DdA(jSONObjectOptJSONObject);
            } catch (JSONException e) {
                CFK.A08("EndToEnd-Test", "Failed to parse auth data", e);
            }
        }
        return null;
    }

    public static JSONObject A02(String str) {
        Map<String, JSONObject> map = A08;
        Map<String, JSONObject> map2 = map;
        if (map == null) {
            HashMap map3 = new HashMap();
            try {
                String strA01 = A01("sharedprefs", false, false);
                JSONObject jSONObject = (strA01 == null || strA01.length() <= 0) ? A09.has("sharedprefs") ? A09.getJSONObject("sharedprefs") : new JSONObject() : new JSONObject(strA01);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map3.put(next, jSONObject.getJSONObject(next));
                }
                if (!map3.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Use E2E shared preferences overrides: ");
                    sb.append(map3);
                    CFK.A06("EndToEnd-Test", sb.toString());
                }
                A08 = map3;
                map2 = map3;
            } catch (JSONException e) {
                throw new RuntimeException("Malformed json for shared preferences", e);
            }
        }
        return map2.get(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:15|77|16|(1:18)|19|(1:21)(2:23|(1:25)(13:78|26|(2:27|(1:29)(1:90))|30|35|(4:80|39|(2:42|40)|89)|45|85|46|(1:51)(1:50)|84|54|(1:95)(2:58|(2:67|68)(3:82|62|63))))|22|35|(5:37|80|39|(1:40)|89)|45|85|46|(3:48|51|84)(0)|54|(2:56|95)(1:94)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0155, code lost:
    
        X.CFK.A08("EndToEnd-Test", "Failed to set QPL file", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e A[Catch: Exception -> 0x011c, LOOP:0: B:40:0x0108->B:42:0x010e, LOOP_END, TRY_LEAVE, TryCatch #3 {Exception -> 0x011c, blocks: (B:39:0x00f7, B:40:0x0108, B:42:0x010e), top: B:80:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140 A[Catch: Exception -> 0x0154, TRY_LEAVE, TryCatch #7 {Exception -> 0x0154, blocks: (B:46:0x0124, B:48:0x0134, B:50:0x013a, B:51:0x0140), top: B:85:0x0124 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.content.Context r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9X.A03(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04() {
        /*
            boolean r0 = X.C9X.A0A
            if (r0 != 0) goto L26
            java.lang.String r0 = "fb.running_e2e"
            boolean r0 = A07(r0)
            r2 = 1
            if (r0 != 0) goto L16
            java.lang.String r0 = "persist.fb.running_e2e"
            boolean r1 = A07(r0)
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            X.C9X.A0B = r0
            boolean r0 = X.C9X.A0B
            if (r0 == 0) goto L24
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            X.CFK.A06(r1, r0)
        L24:
            X.C9X.A0A = r2
        L26:
            boolean r0 = X.C9X.A0B
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9X.A04():boolean");
    }

    public static synchronized boolean A05() {
        if (!A03) {
            boolean zEquals = "true".equals(AbstractC3459COf.A02("fb.running_mobilelab"));
            A06 = zEquals;
            if (zEquals) {
                CFK.A06("Mobilelab", "Is running Mobilelab test");
            }
            A03 = true;
        }
        return A06;
    }

    public static synchronized boolean A06() {
        if (!A04) {
            if (A07("fb.running_sapienz")) {
                CFK.A06("Sapienz", "Is running Sapienz test");
                A07 = true;
            }
            A04 = true;
        }
        return A07;
    }

    static {
        try {
            A03(C4JM.A00());
            A05 = true;
        } catch (IllegalStateException unused) {
        }
    }

    public static boolean A07(String str) {
        return "true".equals(AbstractC3459COf.A02(str)) || "true".equals(System.getProperty(str));
    }
}
