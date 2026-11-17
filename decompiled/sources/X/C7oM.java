package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7oM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oM {
    public final Map<String, C7oP> A00;
    public final C7oO A01;
    public final C7oL[] A02;

    public static C7oM A00(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        C7oL[] c7oLArrA00 = new C7oL[0];
        try {
            Iterator<String> itKeys = jSONObject.keys();
            C7oO c7oOA00 = null;
            while (itKeys.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itKeys);
                if (!strA0j.equals("selector_config")) {
                    if (strA0j.equals("clip_data")) {
                        c7oOA00 = C7oO.A00(jSONObject.getJSONObject("clip_data"));
                    } else if (jSONObject.has(strA0j)) {
                        map.put(strA0j, C7oP.A00(jSONObject.get(strA0j)));
                    }
                }
            }
            if (jSONObject.has("selector_config") && (string = jSONObject.getString("selector_config")) != null) {
                c7oLArrA00 = C7oL.A00(string);
            }
            if (map.isEmpty()) {
                return null;
            }
            return c7oLArrA00.length > 0 ? new C7oM(c7oOA00, map, c7oLArrA00) : new C7oM(c7oOA00, map, null);
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
    
        r6 = r13.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (r6 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0106, code lost:
    
        if (r15.has("clip_data") == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
    
        r7 = r15.getJSONArray("clip_data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010c, code lost:
    
        if (r7 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010e, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0113, code lost:
    
        if (r5 >= r7.length()) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r4 = r7.getJSONObject(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r3 = X.AnonymousClass002.A0n(r6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0123, code lost:
    
        if (r3.hasNext() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0125, code lost:
    
        r0 = X.C3cH.A0l(r3);
        r2 = X.C60O.A0t(r0);
        r1 = (X.C7oP) r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0137, code lost:
    
        if (r4.has(r2) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0141, code lost:
    
        if (X.C7oP.A01(r1, r4.getString(r2)) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0146, code lost:
    
        r3 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        if (r3 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014a, code lost:
    
        r2 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        if (r2 <= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014d, code lost:
    
        if (r14 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0156, code lost:
    
        if (r3[r1].A01(r14) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
    
        if (r1 >= r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0160, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.content.Intent r14, org.json.JSONObject r15) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7oM.A01(android.content.Intent, org.json.JSONObject):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;LX/7oP;>;[LX/7oL;LX/7oO;)V */
    public C7oM(C7oO c7oO, Map map, C7oL[] c7oLArr) {
        this.A00 = map;
        this.A02 = c7oLArr;
        this.A01 = c7oO;
    }
}
