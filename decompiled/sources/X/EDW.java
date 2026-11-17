package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class EDW {
    public BXe A00;
    public final String A01;
    public final Map<String, EE9> A02;

    public EDW(String str) {
        if (C7BY.A0j(str)) {
            throw C60O.A0i("feature should not be blank");
        }
        this.A01 = str;
        this.A02 = BV4.A0u();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EDW(X.C6537EDs r9, X.InterfaceC6544EDz r10, int r11) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = X.AbstractC6540EDv.A01(r11)
            X.EDp r5 = X.AbstractC6540EDv.A00(r11)
            if (r0 == 0) goto L9a
            if (r5 == 0) goto L9a
            r8.A01 = r0
            java.util.HashMap r3 = X.BV4.A0u()
            r8.A02 = r3
            if (r9 != 0) goto L39
            X.9jH r0 = X.AGH.A0E()
        L1d:
            java.util.HashMap r4 = X.BV4.A0w(r0)
            java.lang.String r0 = "user_scope"
            java.lang.Object r2 = r4.remove(r0)
            X.EDp r2 = (X.C6534EDp) r2
            if (r2 == 0) goto L3c
            boolean r1 = r2.A00
            boolean r0 = r5.A00
            if (r1 == r0) goto L98
            java.lang.String r0 = "UserScope override isn't compatible: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0Q(r0, r11)
            throw r0
        L39:
            java.util.Map<java.lang.String, X.EE9> r0 = r9.A01
            goto L1d
        L3c:
            boolean r0 = r5.A01
            if (r0 == 0) goto L98
        L40:
            java.lang.String r0 = "max_size"
            java.lang.Object r7 = r4.remove(r0)
            X.EDd r7 = (X.C6531EDd) r7
            r6 = 0
            if (r7 != 0) goto L52
            X.EDd r7 = r10.AKe(r11)
            if (r7 != 0) goto L52
            r7 = r6
        L52:
            java.lang.String r0 = "stale_removal"
            java.lang.Object r2 = r4.remove(r0)
            X.EDj r2 = (X.C6533EDj) r2
            if (r2 != 0) goto L65
            X.EDj r0 = r10.AKs(r11)
            r2 = r6
            if (r0 == 0) goto L65
            r2 = r0
        L65:
            if (r7 == 0) goto L92
            r1 = r6
            if (r2 == 0) goto L6b
        L6a:
            r1 = r2
        L6b:
            java.lang.String r0 = "file"
            X.EDt r2 = new X.EDt
            r2.<init>(r7, r1, r0, r6)
        L72:
            java.lang.String r0 = "version"
            r4.remove(r0)
            if (r5 == 0) goto L83
            java.util.Map<java.lang.String, X.EE9> r1 = r8.A02
            java.lang.String r0 = r5.getIdentifier()
            r1.put(r0, r5)
        L83:
            if (r2 == 0) goto L8e
            java.util.Map<java.lang.String, X.EE9> r1 = r8.A02
            java.lang.String r0 = r2.getIdentifier()
            r1.put(r0, r2)
        L8e:
            r3.putAll(r4)
            return
        L92:
            if (r2 == 0) goto L96
            r7 = r6
            goto L6a
        L96:
            r2 = r6
            goto L72
        L98:
            r5 = r2
            goto L40
        L9a:
            java.lang.String r0 = "Unknown storage config: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0Q(r0, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDW.<init>(X.EDs, X.EDz, int):void");
    }
}
