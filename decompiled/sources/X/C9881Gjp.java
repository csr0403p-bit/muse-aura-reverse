package X;

import java.io.Serializable;

/* renamed from: X.Gjp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9881Gjp implements Serializable {
    public static final long serialVersionUID = 1;
    public transient GQ5<C8887Fss, C10009Gnh> A00 = new GQ5<>(20, 200);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gkh<*>;)LX/Gnh; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10009Gnh A00(X.AbstractC9901Gkh r6, java.lang.Class r7) {
        /*
            r5 = this;
            X.Fss r4 = new X.Fss
            r4.<init>(r7)
            X.GQ5<X.Fss, X.Gnh> r0 = r5.A00
            X.DTL<K, V> r5 = r0.A00
            java.lang.Object r1 = r5.get(r4)
            X.Gnh r1 = (X.C10009Gnh) r1
            if (r1 != 0) goto L53
            X.Gl4 r1 = r6.A05(r7)
            X.Gks r0 = r6.A02()
            X.Gkr r1 = r1.A07
            boolean r0 = r0 instanceof X.C9888GkO
            if (r0 == 0) goto L48
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRootName> r0 = com.fasterxml.jackson.annotation.JsonRootName.class
            java.lang.annotation.Annotation r3 = r1.A0A(r0)
            com.fasterxml.jackson.annotation.JsonRootName r3 = (com.fasterxml.jackson.annotation.JsonRootName) r3
            r2 = 0
            if (r3 == 0) goto L48
            java.lang.String r1 = r3.namespace()
            if (r1 == 0) goto L54
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L54
        L36:
            java.lang.String r0 = r3.value()
            X.Gnh r1 = X.C10009Gnh.A01(r0, r2)
            java.lang.String r0 = r1._simpleName
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L50
        L48:
            java.lang.String r0 = r7.getSimpleName()
            X.Gnh r1 = X.C10009Gnh.A00(r0)
        L50:
            r5.put(r4, r1)
        L53:
            return r1
        L54:
            r2 = r1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9881Gjp.A00(X.Gkh, java.lang.Class):X.Gnh");
    }

    public Object readResolve() {
        return new C9881Gjp();
    }
}
