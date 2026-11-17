package X;

/* renamed from: X.GjJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9871GjJ extends C9866GjE {
    public static final long serialVersionUID = 1;

    @Deprecated
    public final AbstractC9870GjI _anchorType;
    public final AbstractC9870GjI _referencedType;

    @Override // X.C9866GjE, X.AbstractC9870GjI
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C9871GjJ c9871GjJ = (C9871GjJ) obj;
            if (c9871GjJ._class == this._class) {
                return this._referencedType.equals(c9871GjJ._referencedType);
            }
        }
        return false;
    }

    @Override // X.C9866GjE, X.AbstractC9870GjI
    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(40);
        sbA0p.append("[reference type, class ");
        sbA0p.append(A0V());
        sbA0p.append('<');
        sbA0p.append(this._referencedType);
        return AnonymousClass001.A0v(">]", sbA0p);
    }

    public C9871GjJ(AbstractC9870GjI abstractC9870GjI, AbstractC9869GjH abstractC9869GjH) {
        super(abstractC9869GjH);
        this._referencedType = abstractC9870GjI;
        this._anchorType = this;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;LX/GjI;LX/GjI;Ljava/lang/Object;Ljava/lang/Object;Z)V */
    public C9871GjJ(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, AbstractC9870GjI abstractC9870GjI3, C9861Gj9 c9861Gj9, Class cls, Object obj, Object obj2, AbstractC9870GjI[] abstractC9870GjIArr, boolean z) {
        super(abstractC9870GjI, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, AnonymousClass006.A0D(abstractC9870GjI2), z);
        this._referencedType = abstractC9870GjI2;
        this._anchorType = abstractC9870GjI3 == null ? this : abstractC9870GjI3;
    }
}
