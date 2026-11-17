package X;

import java.util.Set;

/* loaded from: classes5.dex */
public abstract class F1N extends AbstractC7492Exz {
    public static final String TAG = "LightPrefsSamplingConfigAccessor";
    public final C4oT lightSharedPreferences;

    public F1N(C4oT c4oT) {
        C7384Etj.A0Y(c4oT, 0);
        this.lightSharedPreferences = c4oT;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getEventConfig(java.lang.String r13) throws org.json.JSONException {
        /*
            r12 = this;
            r8 = 0
            X.C7384Etj.A0Y(r13, r8)
            X.4oT r0 = r12.lightSharedPreferences
            java.util.HashMap r0 = r0.ACL()
            java.lang.String r12 = ""
            java.lang.String r9 = ":"
            r11 = 1
            org.json.JSONObject r7 = X.BV4.A18()     // Catch: org.json.JSONException -> Lcf
            java.util.Iterator r10 = X.C3cG.A0i(r0)     // Catch: org.json.JSONException -> Lcf
        L17:
            boolean r0 = r10.hasNext()     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto Lc4
            java.util.Map$Entry r0 = X.C3cH.A0l(r10)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r5 = X.C60O.A0t(r0)     // Catch: org.json.JSONException -> Lcf
            java.lang.Object r4 = r0.getValue()     // Catch: org.json.JSONException -> Lcf
            boolean r3 = r13.equals(r5)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = X.AnonymousClass000.A00(r8)
            java.lang.String r2 = "*"
            if (r3 == 0) goto L40
            X.C7384Etj.A0Z(r4, r1)     // Catch: org.json.JSONException -> Lcf
            int r0 = X.AnonymousClass001.A0F(r4)     // Catch: org.json.JSONException -> Lcf
            r7.put(r2, r0)     // Catch: org.json.JSONException -> Lcf
            goto L17
        L40:
            java.lang.String r0 = X.FGI.A0M(r13, r9)     // Catch: org.json.JSONException -> Lcf
            boolean r0 = X.AnonymousClass005.A1a(r5, r0)     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto L17
            X.C7384Etj.A0Z(r4, r1)     // Catch: org.json.JSONException -> Lcf
            int r6 = X.AnonymousClass001.A0F(r4)     // Catch: org.json.JSONException -> Lcf
            int r0 = r13.length()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = X.BV4.A0g(r0, r5)     // Catch: org.json.JSONException -> Lcf
            boolean r0 = X.C7BY.A0q(r1, r9, r8)     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto L70
            org.json.JSONObject r0 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto L6c
            org.json.JSONObject r0 = X.BV4.A18()     // Catch: org.json.JSONException -> Lcf
            r7.put(r1, r0)     // Catch: org.json.JSONException -> Lcf
        L6c:
            r0.put(r2, r6)     // Catch: org.json.JSONException -> Lcf
            goto L17
        L70:
            java.util.List r2 = X.BV7.A14(r1, r9)     // Catch: org.json.JSONException -> Lcf
            boolean r0 = r2.isEmpty()     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto L97
            java.util.ListIterator r1 = X.C3cG.A0n(r2)     // Catch: org.json.JSONException -> Lcf
        L7e:
            boolean r0 = r1.hasPrevious()     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto L97
            int r0 = X.BV7.A0M(r1)     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto L7e
            java.util.List r0 = X.BV8.A1A(r2, r1)     // Catch: org.json.JSONException -> Lcf
        L8e:
            java.lang.String[] r5 = X.BV4.A1b(r0)     // Catch: org.json.JSONException -> Lcf
            int r4 = r5.length     // Catch: org.json.JSONException -> Lcf
            int r4 = r4 - r11
            r3 = r7
            r2 = 0
            goto L9a
        L97:
            X.AGi r0 = X.C0881AGi.A00     // Catch: org.json.JSONException -> Lcf
            goto L8e
        L9a:
            if (r2 >= r4) goto Lbb
            if (r3 == 0) goto Lb0
            r0 = r5[r2]     // Catch: org.json.JSONException -> Lcf
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto Lb0
            r1 = r5[r2]     // Catch: org.json.JSONException -> Lcf
            org.json.JSONObject r0 = X.BV4.A18()     // Catch: org.json.JSONException -> Lcf
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch: org.json.JSONException -> Lcf
        Lb0:
            if (r3 == 0) goto Lb8
            r0 = r5[r2]     // Catch: org.json.JSONException -> Lcf
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch: org.json.JSONException -> Lcf
        Lb8:
            int r2 = r2 + 1
            goto L9a
        Lbb:
            if (r3 == 0) goto L17
            r0 = r5[r4]     // Catch: org.json.JSONException -> Lcf
            r3.put(r0, r6)     // Catch: org.json.JSONException -> Lcf
            goto L17
        Lc4:
            int r0 = r7.length()     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto Ldb
            java.lang.String r12 = X.C60O.A0o(r7)     // Catch: org.json.JSONException -> Lcf
            return r12
        Lcf:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "LightPrefsSamplingConfigAccessor"
            java.lang.String r0 = "Failed to build event config JSON"
            X.BzX.A00(r1, r0, r2)
        Ldb:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F1N.getEventConfig(java.lang.String):java.lang.String");
    }

    @Override // X.AbstractC7492Exz
    public int getInt(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return this.lightSharedPreferences.getInt(str, i);
    }

    @Override // X.AbstractC7492Exz
    public String getString(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return this.lightSharedPreferences.getString(str, str2);
    }

    @Override // X.AbstractC7492Exz
    public Set<String> getStringSet(String str, Set<String> set) {
        AnonymousClass003.A0u(str, set);
        Set<String> stringSet = this.lightSharedPreferences.getStringSet(str, set);
        C7384Etj.A0U(stringSet);
        return stringSet;
    }
}
