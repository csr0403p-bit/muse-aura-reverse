package X;

/* renamed from: X.GjK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9872GjK extends AbstractC9869GjH {
    public static final long serialVersionUID = 1;
    public final AbstractC9870GjI _componentType;
    public final Object _emptyArray;

    @Override // X.AbstractC9870GjI
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._componentType.equals(((C9872GjK) obj)._componentType);
    }

    @Override // X.AbstractC9870GjI
    public final String toString() {
        return BV8.A0u(this._componentType, C60O.A0x("[array type, component type: "));
    }

    public C9872GjK(AbstractC9870GjI abstractC9870GjI, C9861Gj9 c9861Gj9, Object obj, Object obj2, Object obj3, boolean z) {
        super(null, c9861Gj9, obj.getClass(), obj2, obj3, null, abstractC9870GjI.hashCode(), z);
        this._componentType = abstractC9870GjI;
        this._emptyArray = obj;
    }

    @Override // X.AbstractC9870GjI
    public final boolean A0O() {
        return super.A0O() || this._componentType.A0O();
    }
}
