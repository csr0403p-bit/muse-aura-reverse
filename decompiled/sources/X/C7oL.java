package X;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7oL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oL {
    public static final C7oL[] A04 = new C7oL[0];
    public final C7oM A00;
    public final C7oM A01;
    public final C7oO A02;
    public final Pattern A03;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x001f, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.content.Intent r10) {
        /*
            r9 = this;
            r8 = 0
            if (r10 == 0) goto L9b
            X.7m5 r1 = new X.7m5     // Catch: org.json.JSONException -> L9a
            r1.<init>()     // Catch: org.json.JSONException -> L9a
            r0 = 1
            X.7m6 r0 = X.C7m5.A00(r10, r1, r0)     // Catch: org.json.JSONException -> L9a
            org.json.JSONObject r3 = r0.A01     // Catch: org.json.JSONException -> L9a
            java.util.List<android.net.Uri> r1 = r0.A00     // Catch: org.json.JSONException -> L9a
            X.7oO r2 = r9.A02     // Catch: org.json.JSONException -> L9a
            if (r2 == 0) goto L89
            boolean r0 = r1.isEmpty()     // Catch: org.json.JSONException -> L9a
            if (r0 != 0) goto L9b
            java.util.Iterator r7 = r1.iterator()     // Catch: org.json.JSONException -> L9a
        L1f:
            boolean r0 = r7.hasNext()     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L9b
            java.lang.Object r6 = r7.next()     // Catch: org.json.JSONException -> L9a
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: org.json.JSONException -> L9a
            java.util.Map<java.lang.String, X.7oP> r0 = r2.A00     // Catch: org.json.JSONException -> L9a
            java.util.Iterator r5 = X.AnonymousClass002.A0n(r0)     // Catch: org.json.JSONException -> L9a
        L31:
            boolean r0 = r5.hasNext()     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L89
            java.util.Map$Entry r4 = X.C3cH.A0l(r5)     // Catch: org.json.JSONException -> L9a
            java.lang.String r1 = X.C60O.A0t(r4)     // Catch: org.json.JSONException -> L9a
            int r0 = r1.hashCode()     // Catch: org.json.JSONException -> L9a
            switch(r0) {
                case -907987547: goto L6e;
                case 3433509: goto L61;
                case 107944136: goto L54;
                case 1475610435: goto L47;
                default: goto L46;
            }     // Catch: org.json.JSONException -> L9a
        L46:
            goto L1f
        L47:
            java.lang.String r0 = "authority"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L1f
            java.lang.String r1 = r6.getAuthority()     // Catch: org.json.JSONException -> L9a
            goto L7a
        L54:
            java.lang.String r0 = "query"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L1f
            java.lang.String r1 = r6.getQuery()     // Catch: org.json.JSONException -> L9a
            goto L7a
        L61:
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L1f
            java.lang.String r1 = r6.getPath()     // Catch: org.json.JSONException -> L9a
            goto L7a
        L6e:
            java.lang.String r0 = "scheme"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L1f
            java.lang.String r1 = r6.getScheme()     // Catch: org.json.JSONException -> L9a
        L7a:
            if (r1 == 0) goto L1f
            java.lang.Object r0 = r4.getValue()     // Catch: org.json.JSONException -> L9a
            X.7oP r0 = (X.C7oP) r0     // Catch: org.json.JSONException -> L9a
            boolean r0 = X.C7oP.A01(r0, r1)     // Catch: org.json.JSONException -> L9a
            if (r0 != 0) goto L31
            goto L1f
        L89:
            android.content.Intent r1 = r10.getSelector()     // Catch: org.json.JSONException -> L9a
            X.7oM r0 = r9.A01     // Catch: org.json.JSONException -> L9a
            if (r0 == 0) goto L98
            boolean r0 = r0.A01(r1, r3)     // Catch: org.json.JSONException -> L9a
            if (r0 != 0) goto L98
            return r8
        L98:
            r8 = 1
            return r8
        L9a:
            return r8
        L9b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7oL.A01(android.content.Intent):boolean");
    }

    public static C7oL[] A00(String str) {
        if (str == null) {
            return A04;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                C7oL[] c7oLArr = new C7oL[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C7oM c7oMA00 = null;
                    String string = jSONObject.has("endpoint_name") ? jSONObject.getString("endpoint_name") : null;
                    C7oM c7oMA002 = jSONObject.has("caller_info") ? C7oM.A00(jSONObject.getJSONObject("caller_info")) : null;
                    C7oO c7oOA00 = jSONObject.has("uri_component") ? C7oO.A00(jSONObject.getJSONObject("uri_component")) : null;
                    if (jSONObject.has("intent_field")) {
                        c7oMA00 = C7oM.A00(jSONObject.getJSONObject("intent_field"));
                    }
                    c7oLArr[i] = new C7oL(c7oMA002, c7oMA00, c7oOA00, string);
                }
                return c7oLArr;
            }
        } catch (JSONException unused) {
        }
        return A04;
    }

    public C7oL(C7oM c7oM, C7oM c7oM2, C7oO c7oO, String str) {
        this.A03 = str == null ? null : Pattern.compile(str, 32);
        this.A01 = c7oM2;
        this.A00 = c7oM;
        this.A02 = c7oO;
    }
}
