package X;

/* renamed from: X.GjD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9865GjD extends AbstractC9869GjH {
    public static final long serialVersionUID = 1;
    public final AbstractC9870GjI _elementType;

    @Override // X.AbstractC9870GjI
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) obj;
                if (this._class != abstractC9865GjD._class || !this._elementType.equals(abstractC9865GjD._elementType)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;LX/GjI;Ljava/lang/Object;Ljava/lang/Object;Z)V */
    public AbstractC9865GjD(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, C9861Gj9 c9861Gj9, Class cls, Object obj, Object obj2, AbstractC9870GjI[] abstractC9870GjIArr, boolean z) {
        super(abstractC9870GjI, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, abstractC9870GjI2.hashCode(), z);
        this._elementType = abstractC9870GjI2;
    }

    @Override // X.AbstractC9870GjI
    public final AbstractC9870GjI A0D(AbstractC9870GjI abstractC9870GjI) {
        AbstractC9870GjI abstractC9870GjIA0D;
        AbstractC9870GjI abstractC9870GjIA0D2 = super.A0D(abstractC9870GjI);
        AbstractC9870GjI abstractC9870GjIA07 = abstractC9870GjI.A07();
        return (abstractC9870GjIA07 == null || (abstractC9870GjIA0D = this._elementType.A0D(abstractC9870GjIA07)) == this._elementType) ? abstractC9870GjIA0D2 : abstractC9870GjIA0D2.A0C(abstractC9870GjIA0D);
    }

    @Override // X.AbstractC9870GjI
    public final boolean A0O() {
        return super.A0O() || this._elementType.A0O();
    }
}
