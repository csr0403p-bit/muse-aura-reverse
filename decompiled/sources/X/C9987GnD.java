package X;

import java.io.Serializable;

/* renamed from: X.GnD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9987GnD extends AbstractC9970Gmj implements Serializable {
    public static final long serialVersionUID = 1;
    public final Class<?> _declaringClass;
    public final String _name;
    public final AbstractC9870GjI _type;

    /* JADX WARN: Incorrect types in method signature: (LX/Gqb;Ljava/lang/Class<*>;Ljava/lang/String;LX/GjI;)V */
    public C9987GnD(AbstractC9870GjI abstractC9870GjI, InterfaceC10166Gqb interfaceC10166Gqb, Class cls, String str) {
        super(null, interfaceC10166Gqb);
        this._declaringClass = cls;
        this._type = abstractC9870GjI;
        this._name = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @Override // X.AbstractC10031Go7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L28
            java.lang.Class r2 = r4.getClass()
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            if (r5 == 0) goto L12
            java.lang.Class r1 = r5.getClass()
            r0 = 1
            if (r1 == r2) goto L13
        L12:
            r0 = 0
        L13:
            r2 = 0
            if (r0 == 0) goto L29
            X.GnD r5 = (X.C9987GnD) r5
            java.lang.Class<?> r1 = r5._declaringClass
            java.lang.Class<?> r0 = r4._declaringClass
            if (r1 != r0) goto L29
            java.lang.String r1 = r5._name
            java.lang.String r0 = r4._name
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
        L28:
            return r3
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9987GnD.equals(java.lang.Object):boolean");
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return this._name.hashCode();
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        return FGI.A0U("[virtual ", A0E(), "]");
    }
}
