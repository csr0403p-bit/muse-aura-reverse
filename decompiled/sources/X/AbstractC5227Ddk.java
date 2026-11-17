package X;

/* renamed from: X.Ddk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5227Ddk {
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: JSONException -> 0x0095, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0095, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0024, B:10:0x002d, B:11:0x003e, B:13:0x0046, B:14:0x0055, B:16:0x005b, B:18:0x0061, B:19:0x0066, B:20:0x006a, B:21:0x006e), top: B:37:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5226Ddj A00(java.lang.String r8) {
        /*
            java.lang.String r5 = "personalization_data"
            r3 = 0
            if (r8 == 0) goto L6e
            int r0 = r8.length()     // Catch: org.json.JSONException -> L95
            if (r0 == 0) goto L6e
            org.json.JSONObject r6 = X.BV4.A19(r8)     // Catch: org.json.JSONException -> L95
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L95
            java.lang.String r0 = "timestamp"
            long r7 = r6.optLong(r0, r1)     // Catch: org.json.JSONException -> L95
            long r1 = r1 - r7
            r7 = 3888000000(0xe7be2c00, double:1.920927231E-314)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L6a
            java.lang.String r0 = "sso_eligibility"
            org.json.JSONObject r4 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L95
            if (r4 == 0) goto L66
            java.lang.String r2 = "3"
            java.lang.Integer r1 = X.C79.A0C     // Catch: org.json.JSONException -> L95
            java.lang.String r0 = "2"
            java.lang.String r0 = r4.optString(r2, r0)     // Catch: org.json.JSONException -> L95
            X.C7384Etj.A0U(r0)     // Catch: org.json.JSONException -> L95
            java.lang.Integer r4 = X.BXo.A00(r0)     // Catch: org.json.JSONException -> L95
        L3e:
            java.lang.String r0 = "nta_eligibility"
            org.json.JSONObject r2 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L95
            if (r2 == 0) goto L55
            java.lang.String r1 = "3"
            java.lang.String r0 = "2"
            java.lang.String r0 = r2.optString(r1, r0)     // Catch: org.json.JSONException -> L95
            X.C7384Etj.A0U(r0)     // Catch: org.json.JSONException -> L95
            java.lang.Integer r1 = X.BXo.A00(r0)     // Catch: org.json.JSONException -> L95
        L55:
            boolean r0 = r6.has(r5)     // Catch: org.json.JSONException -> L95
            if (r0 == 0) goto L71
            boolean r0 = r6.isNull(r5)     // Catch: org.json.JSONException -> L95
            if (r0 != 0) goto L71
            java.lang.String r3 = r6.optString(r5)     // Catch: org.json.JSONException -> L95
            goto L71
        L66:
            java.lang.Integer r4 = X.C79.A0C     // Catch: org.json.JSONException -> L95
            r1 = r4
            goto L3e
        L6a:
            java.lang.Integer r4 = X.C79.A0C     // Catch: org.json.JSONException -> L95
            r1 = r4
            goto L3e
        L6e:
            java.lang.Integer r4 = X.C79.A0C     // Catch: org.json.JSONException -> L95
            r1 = r4
        L71:
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L92;
                default: goto L78;
            }
        L78:
            java.lang.String r2 = "2"
        L7a:
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L89;
                case 1: goto L8c;
                default: goto L81;
            }
        L81:
            java.lang.String r1 = "2"
        L83:
            X.Ddj r0 = new X.Ddj
            r0.<init>(r2, r1, r3)
            return r0
        L89:
            java.lang.String r1 = "0"
            goto L83
        L8c:
            java.lang.String r1 = "1"
            goto L83
        L8f:
            java.lang.String r2 = "0"
            goto L7a
        L92:
            java.lang.String r2 = "1"
            goto L7a
        L95:
            r1 = move-exception
            libraries.access.src.main.base.contentprovider.transformers.TransformerException r0 = new libraries.access.src.main.base.contentprovider.transformers.TransformerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5227Ddk.A00(java.lang.String):X.Ddj");
    }
}
