package X;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.7oN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oN<T> {
    public final InterfaceC07167oS A00;

    public C7oN(InterfaceC07167oS interfaceC07167oS) {
        this.A00 = interfaceC07167oS;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;TT;Landroid/content/Intent;)Z */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0076 A[EDGE_INSN: B:57:0x0076->B:31:0x0076 BREAK  A[LOOP:0: B:9:0x001a->B:58:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:0: B:9:0x001a->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(android.content.Context r12, android.content.Intent r13, java.lang.Object r14) throws org.json.JSONException, java.security.NoSuchAlgorithmException {
        /*
            r11 = this;
            X.C7oV.A03(r12)
            r6 = 0
            X.C7oV.A03(r12)
            X.7oS r7 = r11.A00
            boolean r0 = r7.AfN()
            if (r0 == 0) goto Lb4
            X.7oL[] r5 = r7.AEY()
            r11 = 0
            if (r5 == 0) goto L76
            int r4 = r5.length
            if (r4 <= 0) goto L76
            r3 = 0
        L1a:
            r8 = r5[r3]
            java.util.regex.Pattern r1 = r8.A03
            if (r1 == 0) goto L2e
            java.lang.String r0 = X.C60Q.A0e(r14)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lae
        L2e:
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            X.7mj r10 = X.AbstractC06887mb.A00(r12, r13, r6, r0)     // Catch: org.json.JSONException -> Lae
            X.7oM r9 = r8.A00     // Catch: org.json.JSONException -> Lae
            if (r9 == 0) goto L6f
            if (r10 == 0) goto Lae
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lae
            r2.<init>()     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "caller_uid"
            int r0 = r10.A00     // Catch: org.json.JSONException -> Lae
            r2.put(r1, r0)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = r10.A05()     // Catch: org.json.JSONException -> Lae
            if (r1 == 0) goto L56
            r0 = 53
            java.lang.String r0 = X.BV3.A00(r0)     // Catch: org.json.JSONException -> Lae
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Lae
        L56:
            java.lang.String r1 = r10.A02     // Catch: org.json.JSONException -> Lae
            if (r1 == 0) goto L5f
            java.lang.String r0 = "caller_version_name"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Lae
        L5f:
            java.lang.String r1 = r10.A01     // Catch: org.json.JSONException -> Lae
            if (r1 == 0) goto L68
            java.lang.String r0 = "caller_domain"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> Lae
        L68:
            boolean r0 = r9.A01(r6, r2)     // Catch: org.json.JSONException -> Lae
            if (r0 != 0) goto L6f
            goto Lae
        L6f:
            boolean r0 = r8.A01(r13)
            if (r0 == 0) goto Lae
            r11 = 1
        L76:
            r8 = 0
            if (r11 != 0) goto La7
            X.7oQ[] r6 = r7.AGe()
            int r5 = r6.length
            r4 = 0
        L7f:
            if (r4 >= r5) goto Lb4
            r3 = r6[r4]
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L91
            java.lang.String r0 = X.C60Q.A0e(r14)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lab
        L91:
            android.content.IntentFilter r2 = r3.A01
            if (r2 == 0) goto La7
            android.content.ContentResolver r1 = r3.A00
            java.lang.String r0 = "TAG"
            int r0 = r2.match(r1, r13, r8, r0)
            boolean r1 = X.AnonymousClass002.A1N(r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto La8
            if (r1 != 0) goto Lab
        La7:
            return r8
        La8:
            if (r1 == 0) goto Lab
            return r8
        Lab:
            int r4 = r4 + 1
            goto L7f
        Lae:
            int r3 = r3 + 1
            if (r3 >= r4) goto L76
            goto L1a
        Lb4:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7oN.A00(android.content.Context, android.content.Intent, java.lang.Object):boolean");
    }
}
