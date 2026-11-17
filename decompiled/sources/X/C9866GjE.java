package X;

/* renamed from: X.GjE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9866GjE extends AbstractC9869GjH {
    public static final long serialVersionUID = 1;

    public static C9866GjE A00(Class<?> cls) {
        return new C9866GjE(null, null, cls, null, null, null, false);
    }

    public C9866GjE(Class<?> cls) {
        this(null, C9861Gj9.A00, cls, null, null, null, false);
    }

    @Override // X.AbstractC9870GjI
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            AbstractC9869GjH abstractC9869GjH = (AbstractC9869GjH) obj;
            if (abstractC9869GjH._class == this._class) {
                return this._bindings.equals(abstractC9869GjH._bindings);
            }
        }
        return false;
    }

    @Override // X.AbstractC9870GjI
    public String toString() {
        StringBuilder sbA0p = BV4.A0p(40);
        sbA0p.append("[simple type, class ");
        sbA0p.append(A0V());
        return BV5.A0o(sbA0p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;Ljava/lang/Object;Ljava/lang/Object;Z)V */
    public C9866GjE(AbstractC9870GjI abstractC9870GjI, C9861Gj9 c9861Gj9, Class cls, Object obj, Object obj2, AbstractC9870GjI[] abstractC9870GjIArr, boolean z) {
        C9861Gj9 c9861Gj92;
        if (c9861Gj9 == null) {
            c9861Gj92 = C9861Gj9.A00;
        } else {
            c9861Gj92 = c9861Gj9;
        }
        super(abstractC9870GjI, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, c9861Gj92.hashCode(), z);
    }
}
