package X;

/* renamed from: X.GjG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9868GjG extends AbstractC9869GjH {
    public static final long serialVersionUID = 1;
    public final AbstractC9870GjI _keyType;
    public final AbstractC9870GjI _valueType;

    public final C9868GjG A0W(AbstractC9870GjI abstractC9870GjI) {
        boolean z = this instanceof C9873GjL;
        AbstractC9870GjI abstractC9870GjI2 = this._keyType;
        if (z) {
            if (abstractC9870GjI == abstractC9870GjI2) {
                return this;
            }
            Class<?> cls = this._class;
            C9861Gj9 c9861Gj9 = this._bindings;
            return new C9873GjL(this._superClass, abstractC9870GjI, this._valueType, c9861Gj9, cls, this._valueHandler, this._typeHandler, this._superInterfaces, this._asStatic);
        }
        if (abstractC9870GjI == abstractC9870GjI2) {
            return this;
        }
        Class<?> cls2 = this._class;
        C9861Gj9 c9861Gj92 = this._bindings;
        return new C9868GjG(this._superClass, abstractC9870GjI, this._valueType, c9861Gj92, cls2, this._valueHandler, this._typeHandler, this._superInterfaces, this._asStatic);
    }

    @Override // X.AbstractC9870GjI
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C9868GjG c9868GjG = (C9868GjG) obj;
                if (this._class != c9868GjG._class || !this._keyType.equals(c9868GjG._keyType) || !this._valueType.equals(c9868GjG._valueType)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C9868GjG A0X(Object obj) {
        boolean z = this instanceof C9873GjL;
        Class<?> cls = this._class;
        C9861Gj9 c9861Gj9 = this._bindings;
        AbstractC9870GjI abstractC9870GjI = this._superClass;
        AbstractC9870GjI[] abstractC9870GjIArr = this._superInterfaces;
        AbstractC9870GjI abstractC9870GjIA0J = this._keyType.A0J(obj);
        AbstractC9870GjI abstractC9870GjI2 = this._valueType;
        Object obj2 = this._valueHandler;
        Object obj3 = this._typeHandler;
        boolean z2 = this._asStatic;
        return z ? new C9873GjL(abstractC9870GjI, abstractC9870GjIA0J, abstractC9870GjI2, c9861Gj9, cls, obj2, obj3, abstractC9870GjIArr, z2) : new C9868GjG(abstractC9870GjI, abstractC9870GjIA0J, abstractC9870GjI2, c9861Gj9, cls, obj2, obj3, abstractC9870GjIArr, z2);
    }

    public C9868GjG(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, AbstractC9869GjH abstractC9869GjH) {
        super(abstractC9869GjH);
        this._keyType = abstractC9870GjI;
        this._valueType = abstractC9870GjI2;
    }

    @Override // X.AbstractC9870GjI
    public final AbstractC9870GjI A0D(AbstractC9870GjI abstractC9870GjI) {
        AbstractC9870GjI abstractC9870GjIA0D;
        AbstractC9870GjI abstractC9870GjIA0D2;
        AbstractC9870GjI abstractC9870GjIA0D3 = super.A0D(abstractC9870GjI);
        AbstractC9870GjI abstractC9870GjIA08 = abstractC9870GjI.A08();
        if ((abstractC9870GjIA0D3 instanceof C9868GjG) && abstractC9870GjIA08 != null && (abstractC9870GjIA0D2 = this._keyType.A0D(abstractC9870GjIA08)) != this._keyType) {
            abstractC9870GjIA0D3 = ((C9868GjG) abstractC9870GjIA0D3).A0W(abstractC9870GjIA0D2);
        }
        AbstractC9870GjI abstractC9870GjIA07 = abstractC9870GjI.A07();
        return (abstractC9870GjIA07 == null || (abstractC9870GjIA0D = this._valueType.A0D(abstractC9870GjIA07)) == this._valueType) ? abstractC9870GjIA0D3 : abstractC9870GjIA0D3.A0C(abstractC9870GjIA0D);
    }

    @Override // X.AbstractC9870GjI
    public final boolean A0O() {
        return super.A0O() || this._valueType.A0O() || this._keyType.A0O();
    }

    @Override // X.AbstractC9870GjI
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", AbstractC9870GjI.A04(this), this._keyType, this._valueType);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;LX/GjI;LX/GjI;Ljava/lang/Object;Ljava/lang/Object;Z)V */
    public C9868GjG(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, AbstractC9870GjI abstractC9870GjI3, C9861Gj9 c9861Gj9, Class cls, Object obj, Object obj2, AbstractC9870GjI[] abstractC9870GjIArr, boolean z) {
        super(abstractC9870GjI, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, AnonymousClass005.A0G(abstractC9870GjI3, AnonymousClass005.A0E(abstractC9870GjI2)), z);
        this._keyType = abstractC9870GjI2;
        this._valueType = abstractC9870GjI3;
    }
}
