package X;

import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* renamed from: X.GjI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9870GjI extends AbstractC9859Gj7 implements Serializable, Type {
    public static final long serialVersionUID = 1;
    public final boolean _asStatic;
    public final Class<?> _class;
    public final int _hash;
    public final Object _typeHandler;
    public final Object _valueHandler;

    public final AbstractC9870GjI A0A() {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            if (!(c9868GjG instanceof C9873GjL)) {
                if (c9868GjG._asStatic) {
                    return c9868GjG;
                }
                Class<?> cls = c9868GjG._class;
                return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, c9868GjG._valueType.A0A(), c9868GjG._bindings, cls, c9868GjG._valueHandler, c9868GjG._typeHandler, c9868GjG._superInterfaces, true);
            }
            C9873GjL c9873GjL = (C9873GjL) c9868GjG;
            C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
            if (c9873GjL._asStatic) {
                return c9873GjL;
            }
            Class<?> cls2 = c9873GjL._class;
            return new C9873GjL(c9873GjL._superClass, c9873GjL._keyType.A0A(), c9873GjL._valueType.A0A(), c9873GjL._bindings, cls2, c9873GjL._valueHandler, c9873GjL._typeHandler, c9873GjL._superInterfaces, true);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                C9872GjK c9872GjK = (C9872GjK) this;
                return !c9872GjK._asStatic ? new C9872GjK(c9872GjK._componentType.A0A(), c9872GjK._bindings, c9872GjK._emptyArray, c9872GjK._valueHandler, c9872GjK._typeHandler, true) : c9872GjK;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            if (abstractC9865GjD._asStatic) {
                return abstractC9865GjD;
            }
            Class<?> cls3 = abstractC9865GjD._class;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9865GjD._elementType.A0A(), abstractC9865GjD._bindings, cls3, abstractC9865GjD._valueHandler, abstractC9865GjD._typeHandler, abstractC9865GjD._superInterfaces, true);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
            if (c9871GjJ._asStatic) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            return new C9871GjJ(c9871GjJ._superClass, c9871GjJ._referencedType.A0A(), c9871GjJ._anchorType, c9871GjJ._bindings, cls4, c9871GjJ._valueHandler, c9871GjJ._typeHandler, c9871GjJ._superInterfaces, true);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            if (c9866GjE._asStatic) {
                return c9866GjE;
            }
            Class<?> cls5 = c9866GjE._class;
            return new C9866GjE(c9866GjE._superClass, c9866GjE._bindings, cls5, c9866GjE._valueHandler, c9866GjE._typeHandler, c9866GjE._superInterfaces, true);
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        C9861Gj9 c9861Gj93 = AbstractC9869GjH.A00;
        if (c9867GjF._asStatic) {
            return c9867GjF;
        }
        Class<?> cls6 = c9867GjF._class;
        return new C9867GjF(c9867GjF._superClass, c9867GjF._iteratedType.A0A(), c9867GjF._bindings, cls6, c9867GjF._valueHandler, c9867GjF._typeHandler, c9867GjF._superInterfaces, true);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;)LX/GjI; */
    public final AbstractC9870GjI A0E(AbstractC9870GjI abstractC9870GjI, C9861Gj9 c9861Gj9, Class cls, AbstractC9870GjI[] abstractC9870GjIArr) {
        if (this instanceof C9836Gia) {
            return null;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            boolean z = c9868GjG instanceof C9873GjL;
            AbstractC9870GjI abstractC9870GjI2 = c9868GjG._keyType;
            AbstractC9870GjI abstractC9870GjI3 = c9868GjG._valueType;
            Object obj = c9868GjG._valueHandler;
            Object obj2 = c9868GjG._typeHandler;
            boolean z2 = c9868GjG._asStatic;
            return z ? new C9873GjL(abstractC9870GjI, abstractC9870GjI2, abstractC9870GjI3, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, z2) : new C9868GjG(abstractC9870GjI, abstractC9870GjI2, abstractC9870GjI3, c9861Gj9, cls, obj, obj2, abstractC9870GjIArr, z2);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                return null;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            return new C9874GjM(abstractC9870GjI, abstractC9865GjD._elementType, c9861Gj9, cls, abstractC9865GjD._valueHandler, abstractC9865GjD._typeHandler, abstractC9870GjIArr, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            return new C9871GjJ(abstractC9870GjI, c9871GjJ._referencedType, c9871GjJ._anchorType, c9871GjJ._bindings, cls, c9871GjJ._valueHandler, c9871GjJ._typeHandler, abstractC9870GjIArr, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            return null;
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        return new C9867GjF(abstractC9870GjI, c9867GjF._iteratedType, c9867GjF._bindings, cls, c9867GjF._valueHandler, c9867GjF._typeHandler, abstractC9870GjIArr, c9867GjF._asStatic);
    }

    public final AbstractC9870GjI A0G(Object obj) {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            if (!(c9868GjG instanceof C9873GjL)) {
                Class<?> cls = c9868GjG._class;
                return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, c9868GjG._valueType.A0I(obj), c9868GjG._bindings, cls, c9868GjG._valueHandler, c9868GjG._typeHandler, c9868GjG._superInterfaces, c9868GjG._asStatic);
            }
            C9873GjL c9873GjL = (C9873GjL) c9868GjG;
            C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
            Class<?> cls2 = c9873GjL._class;
            return new C9873GjL(c9873GjL._superClass, c9873GjL._keyType, c9873GjL._valueType.A0I(obj), c9873GjL._bindings, cls2, c9873GjL._valueHandler, c9873GjL._typeHandler, c9873GjL._superInterfaces, c9873GjL._asStatic);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                C9872GjK c9872GjK = (C9872GjK) this;
                AbstractC9870GjI abstractC9870GjI = c9872GjK._componentType;
                return obj != abstractC9870GjI._typeHandler ? new C9872GjK(abstractC9870GjI.A0I(obj), c9872GjK._bindings, c9872GjK._emptyArray, c9872GjK._valueHandler, c9872GjK._typeHandler, c9872GjK._asStatic) : c9872GjK;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            Class<?> cls3 = abstractC9865GjD._class;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9865GjD._elementType.A0I(obj), abstractC9865GjD._bindings, cls3, abstractC9865GjD._valueHandler, abstractC9865GjD._typeHandler, abstractC9865GjD._superInterfaces, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            AbstractC9870GjI abstractC9870GjI2 = c9871GjJ._referencedType;
            if (obj == abstractC9870GjI2._typeHandler) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            return new C9871GjJ(c9871GjJ._superClass, abstractC9870GjI2.A0I(obj), c9871GjJ._anchorType, c9871GjJ._bindings, cls4, c9871GjJ._valueHandler, c9871GjJ._typeHandler, c9871GjJ._superInterfaces, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            throw C60O.A0i("Simple types have no content types; cannot call withContenTypeHandler()");
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        AbstractC9870GjI abstractC9870GjI3 = c9867GjF._iteratedType;
        if (obj == abstractC9870GjI3._typeHandler) {
            return c9867GjF;
        }
        Class<?> cls5 = c9867GjF._class;
        return new C9867GjF(c9867GjF._superClass, abstractC9870GjI3.A0I(obj), c9867GjF._bindings, cls5, c9867GjF._valueHandler, c9867GjF._typeHandler, c9867GjF._superInterfaces, c9867GjF._asStatic);
    }

    public final AbstractC9870GjI A0H(Object obj) {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            if (!(c9868GjG instanceof C9873GjL)) {
                Class<?> cls = c9868GjG._class;
                return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, c9868GjG._valueType.A0J(obj), c9868GjG._bindings, cls, c9868GjG._valueHandler, c9868GjG._typeHandler, c9868GjG._superInterfaces, c9868GjG._asStatic);
            }
            C9873GjL c9873GjL = (C9873GjL) c9868GjG;
            C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
            Class<?> cls2 = c9873GjL._class;
            return new C9873GjL(c9873GjL._superClass, c9873GjL._keyType, c9873GjL._valueType.A0J(obj), c9873GjL._bindings, cls2, c9873GjL._valueHandler, c9873GjL._typeHandler, c9873GjL._superInterfaces, c9873GjL._asStatic);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                C9872GjK c9872GjK = (C9872GjK) this;
                AbstractC9870GjI abstractC9870GjI = c9872GjK._componentType;
                return obj != abstractC9870GjI._valueHandler ? new C9872GjK(abstractC9870GjI.A0J(obj), c9872GjK._bindings, c9872GjK._emptyArray, c9872GjK._valueHandler, c9872GjK._typeHandler, c9872GjK._asStatic) : c9872GjK;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            Class<?> cls3 = abstractC9865GjD._class;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9865GjD._elementType.A0J(obj), abstractC9865GjD._bindings, cls3, abstractC9865GjD._valueHandler, abstractC9865GjD._typeHandler, abstractC9865GjD._superInterfaces, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
            AbstractC9870GjI abstractC9870GjI2 = c9871GjJ._referencedType;
            if (obj == abstractC9870GjI2._valueHandler) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            return new C9871GjJ(c9871GjJ._superClass, abstractC9870GjI2.A0J(obj), c9871GjJ._anchorType, c9871GjJ._bindings, cls4, c9871GjJ._valueHandler, c9871GjJ._typeHandler, c9871GjJ._superInterfaces, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            throw C60O.A0i("Simple types have no content types; cannot call withContenValueHandler()");
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        C9861Gj9 c9861Gj93 = AbstractC9869GjH.A00;
        AbstractC9870GjI abstractC9870GjI3 = c9867GjF._iteratedType;
        if (obj == abstractC9870GjI3._valueHandler) {
            return c9867GjF;
        }
        Class<?> cls5 = c9867GjF._class;
        return new C9867GjF(c9867GjF._superClass, abstractC9870GjI3.A0J(obj), c9867GjF._bindings, cls5, c9867GjF._valueHandler, c9867GjF._typeHandler, c9867GjF._superInterfaces, c9867GjF._asStatic);
    }

    public final AbstractC9870GjI A0I(Object obj) {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            if (!(c9868GjG instanceof C9873GjL)) {
                Class<?> cls = c9868GjG._class;
                return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, c9868GjG._valueType, c9868GjG._bindings, cls, c9868GjG._valueHandler, obj, c9868GjG._superInterfaces, c9868GjG._asStatic);
            }
            C9873GjL c9873GjL = (C9873GjL) c9868GjG;
            Class<?> cls2 = c9873GjL._class;
            return new C9873GjL(c9873GjL._superClass, c9873GjL._keyType, c9873GjL._valueType, c9873GjL._bindings, cls2, c9873GjL._valueHandler, obj, c9873GjL._superInterfaces, c9873GjL._asStatic);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                C9872GjK c9872GjK = (C9872GjK) this;
                return obj != c9872GjK._typeHandler ? new C9872GjK(c9872GjK._componentType, c9872GjK._bindings, c9872GjK._emptyArray, c9872GjK._valueHandler, obj, c9872GjK._asStatic) : c9872GjK;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            Class<?> cls3 = abstractC9865GjD._class;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9865GjD._elementType, abstractC9865GjD._bindings, cls3, abstractC9865GjD._valueHandler, obj, abstractC9865GjD._superInterfaces, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
            if (obj == c9871GjJ._typeHandler) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            return new C9871GjJ(c9871GjJ._superClass, c9871GjJ._referencedType, c9871GjJ._anchorType, c9871GjJ._bindings, cls4, c9871GjJ._valueHandler, obj, c9871GjJ._superInterfaces, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            if (c9866GjE._typeHandler == obj) {
                return c9866GjE;
            }
            Class<?> cls5 = c9866GjE._class;
            return new C9866GjE(c9866GjE._superClass, c9866GjE._bindings, cls5, c9866GjE._valueHandler, obj, c9866GjE._superInterfaces, c9866GjE._asStatic);
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
        if (obj == c9867GjF._typeHandler) {
            return c9867GjF;
        }
        Class<?> cls6 = c9867GjF._class;
        return new C9867GjF(c9867GjF._superClass, c9867GjF._iteratedType, c9867GjF._bindings, cls6, c9867GjF._valueHandler, obj, c9867GjF._superInterfaces, c9867GjF._asStatic);
    }

    public final AbstractC9870GjI A0J(Object obj) {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            if (!(c9868GjG instanceof C9873GjL)) {
                Class<?> cls = c9868GjG._class;
                return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, c9868GjG._valueType, c9868GjG._bindings, cls, obj, c9868GjG._typeHandler, c9868GjG._superInterfaces, c9868GjG._asStatic);
            }
            C9873GjL c9873GjL = (C9873GjL) c9868GjG;
            Class<?> cls2 = c9873GjL._class;
            return new C9873GjL(c9873GjL._superClass, c9873GjL._keyType, c9873GjL._valueType, c9873GjL._bindings, cls2, obj, c9873GjL._typeHandler, c9873GjL._superInterfaces, c9873GjL._asStatic);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                C9872GjK c9872GjK = (C9872GjK) this;
                return obj != c9872GjK._valueHandler ? new C9872GjK(c9872GjK._componentType, c9872GjK._bindings, c9872GjK._emptyArray, obj, c9872GjK._typeHandler, c9872GjK._asStatic) : c9872GjK;
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            Class<?> cls3 = abstractC9865GjD._class;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9865GjD._elementType, abstractC9865GjD._bindings, cls3, obj, abstractC9865GjD._typeHandler, abstractC9865GjD._superInterfaces, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
            if (obj == c9871GjJ._valueHandler) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            return new C9871GjJ(c9871GjJ._superClass, c9871GjJ._referencedType, c9871GjJ._anchorType, c9871GjJ._bindings, cls4, obj, c9871GjJ._typeHandler, c9871GjJ._superInterfaces, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            if (obj == c9866GjE._valueHandler) {
                return c9866GjE;
            }
            Class<?> cls5 = c9866GjE._class;
            return new C9866GjE(c9866GjE._superClass, c9866GjE._bindings, cls5, obj, c9866GjE._typeHandler, c9866GjE._superInterfaces, c9866GjE._asStatic);
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
        if (obj == c9867GjF._valueHandler) {
            return c9867GjF;
        }
        Class<?> cls6 = c9867GjF._class;
        return new C9867GjF(c9867GjF._superClass, c9867GjF._iteratedType, c9867GjF._bindings, cls6, obj, c9867GjF._typeHandler, c9867GjF._superInterfaces, c9867GjF._asStatic);
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public static String A04(AbstractC9870GjI abstractC9870GjI) {
        return abstractC9870GjI._class.getName();
    }

    public static void A05(AbstractC9870GjI abstractC9870GjI, StringBuilder sb) {
        AbstractC9869GjH.A01(abstractC9870GjI._class, sb, false);
        sb.append('<');
    }

    public final AbstractC9870GjI A07() {
        if (this instanceof C9868GjG) {
            return ((C9868GjG) this)._valueType;
        }
        if (this instanceof C9871GjJ) {
            return ((C9871GjJ) this)._referencedType;
        }
        if (this instanceof C9867GjF) {
            return ((C9867GjF) this)._iteratedType;
        }
        if (this instanceof AbstractC9865GjD) {
            return ((AbstractC9865GjD) this)._elementType;
        }
        if (this instanceof C9872GjK) {
            return ((C9872GjK) this)._componentType;
        }
        return null;
    }

    public final AbstractC9870GjI A08() {
        if (this instanceof C9868GjG) {
            return ((C9868GjG) this)._keyType;
        }
        return null;
    }

    public final AbstractC9870GjI A09() {
        AbstractC9869GjH abstractC9869GjH = (AbstractC9869GjH) this;
        boolean z = abstractC9869GjH instanceof C9836Gia;
        AbstractC9869GjH abstractC9869GjH2 = abstractC9869GjH;
        if (z) {
            C9836Gia c9836Gia = (C9836Gia) abstractC9869GjH;
            AbstractC9870GjI abstractC9870GjI = c9836Gia._referencedType;
            abstractC9869GjH2 = c9836Gia;
            if (abstractC9870GjI != null) {
                return abstractC9870GjI.A09();
            }
        }
        return abstractC9869GjH2._superClass;
    }

    public final AbstractC9870GjI A0B(int i) {
        C9861Gj9 c9861Gj9 = ((AbstractC9869GjH) this)._bindings;
        if (i < 0) {
            return null;
        }
        AbstractC9870GjI[] abstractC9870GjIArr = c9861Gj9._types;
        if (i >= abstractC9870GjIArr.length) {
            return null;
        }
        AbstractC9870GjI abstractC9870GjI = abstractC9870GjIArr[i];
        return abstractC9870GjI == null ? C9860Gj8.A05 : abstractC9870GjI;
    }

    public final AbstractC9870GjI A0C(AbstractC9870GjI abstractC9870GjI) throws NegativeArraySizeException {
        if (this instanceof C9836Gia) {
            return this;
        }
        if (this instanceof C9800GhI) {
            C9800GhI.A00((C9800GhI) this);
            throw F60.createAndThrow();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            boolean z = c9868GjG instanceof C9873GjL;
            AbstractC9870GjI abstractC9870GjI2 = c9868GjG._valueType;
            if (z) {
                if (abstractC9870GjI2 == abstractC9870GjI) {
                    return c9868GjG;
                }
                Class<?> cls = c9868GjG._class;
                C9861Gj9 c9861Gj9 = c9868GjG._bindings;
                return new C9873GjL(c9868GjG._superClass, c9868GjG._keyType, abstractC9870GjI, c9861Gj9, cls, c9868GjG._valueHandler, c9868GjG._typeHandler, c9868GjG._superInterfaces, c9868GjG._asStatic);
            }
            if (abstractC9870GjI2 == abstractC9870GjI) {
                return c9868GjG;
            }
            Class<?> cls2 = c9868GjG._class;
            C9861Gj9 c9861Gj92 = c9868GjG._bindings;
            return new C9868GjG(c9868GjG._superClass, c9868GjG._keyType, abstractC9870GjI, c9861Gj92, cls2, c9868GjG._valueHandler, c9868GjG._typeHandler, c9868GjG._superInterfaces, c9868GjG._asStatic);
        }
        if (!(this instanceof C9866GjE)) {
            if (!(this instanceof C9874GjM)) {
                AbstractC9869GjH abstractC9869GjH = (AbstractC9869GjH) this;
                return new C9872GjK(abstractC9870GjI, abstractC9869GjH._bindings, Array.newInstance(abstractC9870GjI._class, 0), abstractC9869GjH._valueHandler, abstractC9869GjH._typeHandler, abstractC9869GjH._asStatic);
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            if (abstractC9865GjD._elementType == abstractC9870GjI) {
                return abstractC9865GjD;
            }
            Class<?> cls3 = abstractC9865GjD._class;
            C9861Gj9 c9861Gj93 = abstractC9865GjD._bindings;
            return new C9874GjM(abstractC9865GjD._superClass, abstractC9870GjI, c9861Gj93, cls3, abstractC9865GjD._valueHandler, abstractC9865GjD._typeHandler, abstractC9865GjD._superInterfaces, abstractC9865GjD._asStatic);
        }
        C9866GjE c9866GjE = (C9866GjE) this;
        if (c9866GjE instanceof C9871GjJ) {
            C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
            if (c9871GjJ._referencedType == abstractC9870GjI) {
                return c9871GjJ;
            }
            Class<?> cls4 = c9871GjJ._class;
            C9861Gj9 c9861Gj94 = c9871GjJ._bindings;
            return new C9871GjJ(c9871GjJ._superClass, abstractC9870GjI, c9871GjJ._anchorType, c9861Gj94, cls4, c9871GjJ._valueHandler, c9871GjJ._typeHandler, c9871GjJ._superInterfaces, c9871GjJ._asStatic);
        }
        if (!(c9866GjE instanceof C9867GjF)) {
            throw C60O.A0i("Simple types have no content types; cannot call withContentType()");
        }
        C9867GjF c9867GjF = (C9867GjF) c9866GjE;
        if (c9867GjF._iteratedType == abstractC9870GjI) {
            return c9867GjF;
        }
        Class<?> cls5 = c9867GjF._class;
        C9861Gj9 c9861Gj95 = c9867GjF._bindings;
        return new C9867GjF(c9867GjF._superClass, abstractC9870GjI, c9861Gj95, cls5, c9867GjF._valueHandler, c9867GjF._typeHandler, c9867GjF._superInterfaces, c9867GjF._asStatic);
    }

    public AbstractC9870GjI A0D(AbstractC9870GjI abstractC9870GjI) {
        Object obj = abstractC9870GjI._typeHandler;
        AbstractC9870GjI abstractC9870GjIA0I = obj != this._typeHandler ? A0I(obj) : this;
        Object obj2 = abstractC9870GjI._valueHandler;
        return obj2 != this._valueHandler ? abstractC9870GjIA0I.A0J(obj2) : abstractC9870GjIA0I;
    }

    public final AbstractC9870GjI A0F(Class<?> cls) {
        AbstractC9870GjI abstractC9870GjIA0F;
        AbstractC9870GjI[] abstractC9870GjIArr;
        AbstractC9869GjH abstractC9869GjH = (AbstractC9869GjH) this;
        if (cls == abstractC9869GjH._class) {
            return abstractC9869GjH;
        }
        if (cls.isInterface() && (abstractC9870GjIArr = abstractC9869GjH._superInterfaces) != null) {
            int length = abstractC9870GjIArr.length;
            for (int i = 0; i < length; i++) {
                AbstractC9870GjI abstractC9870GjIA0F2 = abstractC9869GjH._superInterfaces[i].A0F(cls);
                if (abstractC9870GjIA0F2 != null) {
                    return abstractC9870GjIA0F2;
                }
            }
        }
        AbstractC9870GjI abstractC9870GjI = abstractC9869GjH._superClass;
        if (abstractC9870GjI == null || (abstractC9870GjIA0F = abstractC9870GjI.A0F(cls)) == null) {
            return null;
        }
        return abstractC9870GjIA0F;
    }

    public final C9861Gj9 A0K() {
        AbstractC9869GjH abstractC9869GjH = (AbstractC9869GjH) this;
        boolean z = abstractC9869GjH instanceof C9836Gia;
        AbstractC9869GjH abstractC9869GjH2 = abstractC9869GjH;
        if (z) {
            C9836Gia c9836Gia = (C9836Gia) abstractC9869GjH;
            AbstractC9870GjI abstractC9870GjI = c9836Gia._referencedType;
            abstractC9869GjH2 = c9836Gia;
            if (abstractC9870GjI != null) {
                return abstractC9870GjI.A0K();
            }
        }
        return abstractC9869GjH2._bindings;
    }

    public final StringBuilder A0L(StringBuilder sb) {
        AbstractC9870GjI abstractC9870GjI;
        if (!(this instanceof C9866GjE)) {
            if (this instanceof C9836Gia) {
                abstractC9870GjI = ((C9836Gia) this)._referencedType;
                if (abstractC9870GjI == null) {
                    return sb;
                }
            } else {
                if (this instanceof C9800GhI) {
                    sb.append('$');
                    sb.append(((C9800GhI) this)._ordinal + 1);
                    return sb;
                }
                if (!(this instanceof C9868GjG) && !(this instanceof AbstractC9865GjD)) {
                    sb.append('[');
                    abstractC9870GjI = ((C9872GjK) this)._componentType;
                }
            }
            return abstractC9870GjI.A0L(sb);
        }
        AbstractC9869GjH.A01(this._class, sb, true);
        return sb;
    }

    public final StringBuilder A0M(StringBuilder sb) {
        AbstractC9870GjI abstractC9870GjI;
        AbstractC9870GjI abstractC9870GjI2;
        String str;
        if (!(this instanceof C9836Gia)) {
            if (this instanceof C9800GhI) {
                A0L(sb);
                return sb;
            }
            if (this instanceof C9868GjG) {
                C9868GjG c9868GjG = (C9868GjG) this;
                A05(c9868GjG, sb);
                c9868GjG._keyType.A0M(sb);
                abstractC9870GjI = c9868GjG._valueType;
            } else if (this instanceof C9866GjE) {
                C9866GjE c9866GjE = (C9866GjE) this;
                if (c9866GjE instanceof C9871GjJ) {
                    C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
                    A05(c9871GjJ, sb);
                    abstractC9870GjI2 = c9871GjJ._referencedType;
                } else {
                    if (!(c9866GjE instanceof C9867GjF)) {
                        int i = 0;
                        AbstractC9869GjH.A01(c9866GjE._class, sb, false);
                        int length = c9866GjE._bindings._types.length;
                        if (length > 0) {
                            sb.append('<');
                            do {
                                sb = c9866GjE.A0B(i).A0M(sb);
                                i++;
                            } while (i < length);
                            sb.append('>');
                        }
                        sb.append(';');
                        return sb;
                    }
                    C9867GjF c9867GjF = (C9867GjF) c9866GjE;
                    A05(c9867GjF, sb);
                    abstractC9870GjI2 = c9867GjF._iteratedType;
                }
                sb = abstractC9870GjI2.A0M(sb);
                str = ">;";
            } else {
                if (!(this instanceof AbstractC9865GjD)) {
                    sb.append('[');
                    return ((C9872GjK) this)._componentType.A0M(sb);
                }
                AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
                A05(abstractC9865GjD, sb);
                abstractC9870GjI = abstractC9865GjD._elementType;
            }
            abstractC9870GjI.A0M(sb);
            sb.append(">;");
            return sb;
        }
        AbstractC9870GjI abstractC9870GjI3 = ((C9836Gia) this)._referencedType;
        if (abstractC9870GjI3 != null) {
            return abstractC9870GjI3.A0L(sb);
        }
        str = HatchOpenGraphRepository.UNKNOWN_HOST;
        sb.append(str);
        return sb;
    }

    public final boolean A0N() {
        return this instanceof C9872GjK ? ((C9872GjK) this)._componentType.A0N() : AnonymousClass002.A1N(((AbstractC9869GjH) this)._bindings._types.length);
    }

    public boolean A0O() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    public final boolean A0P() {
        if (this instanceof C9872GjK) {
            return false;
        }
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public final boolean A0Q() {
        if ((this instanceof C9872GjK) || (this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    public final boolean A0R() {
        return ((this instanceof C9866GjE) || (this instanceof C9836Gia) || (this instanceof C9800GhI)) ? false : true;
    }

    public final boolean A0S() {
        Class<?> cls = this._class;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        return Enum.class.isAssignableFrom(cls);
    }

    public final boolean A0T() {
        Class<?> cls = this._class;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        Class<? super Object> superclass = cls.getSuperclass();
        return superclass != null && "java.lang.Record".equals(superclass.getName());
    }

    public final boolean A0U(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public int hashCode() {
        return this._hash;
    }

    public AbstractC9870GjI(AbstractC9870GjI abstractC9870GjI) {
        this._class = abstractC9870GjI._class;
        this._hash = abstractC9870GjI._hash;
        this._valueHandler = abstractC9870GjI._valueHandler;
        this._typeHandler = abstractC9870GjI._typeHandler;
        this._asStatic = abstractC9870GjI._asStatic;
    }

    public static AbstractC9870GjI A03(AbstractC9870GjI abstractC9870GjI, int i) {
        AbstractC9870GjI abstractC9870GjIA0B = abstractC9870GjI.A0B(i);
        return abstractC9870GjIA0B == null ? C9860Gj8.A05 : abstractC9870GjIA0B;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;ILjava/lang/Object;Ljava/lang/Object;Z)V */
    public AbstractC9870GjI(Class cls, Object obj, Object obj2, int i, boolean z) {
        this._class = cls;
        this._hash = AnonymousClass005.A0G(cls, i * 31);
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }
}
