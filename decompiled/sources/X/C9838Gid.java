package X;

import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: X.Gid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9838Gid extends AbstractC9840Gif implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC9841Gig _subTypeValidator;

    public AbstractC9870GjI A01(AbstractC9849Git abstractC9849Git, String str) throws InvalidTypeIdException {
        AbstractC9870GjI abstractC9870GjIA06;
        Class<?> clsA0D;
        Class<?> cls;
        AbstractC9870GjI abstractC9870GjI = this._baseType;
        AbstractC9841Gig abstractC9841Gig = this._subTypeValidator;
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            AbstractC9901Gkh<?> abstractC9901GkhA09 = abstractC9849Git.A09();
            str.substring(0, iIndexOf);
            abstractC9870GjIA06 = abstractC9849Git.A0B().A08(str);
            if (abstractC9870GjIA06.A0U(abstractC9870GjI._class)) {
                int length = ((AbstractC9869GjH) abstractC9870GjIA06)._bindings._types.length;
                for (int i = 0; i < length; i++) {
                    AbstractC9849Git.A06(abstractC9849Git, abstractC9870GjI, abstractC9870GjIA06.A0B(i), abstractC9901GkhA09, abstractC9841Gig);
                }
                if (abstractC9870GjIA06 instanceof C9872GjK) {
                    AbstractC9849Git.A06(abstractC9849Git, abstractC9870GjI, abstractC9870GjIA06.A07(), abstractC9901GkhA09, abstractC9841Gig);
                    return abstractC9870GjIA06;
                }
                return abstractC9870GjIA06;
            }
            throw abstractC9849Git.A0A(abstractC9870GjI, str, "Not a subtype");
        }
        AbstractC9901Gkh<?> abstractC9901GkhA092 = abstractC9849Git.A09();
        try {
            clsA0D = abstractC9849Git.A0B().A0D(str);
            cls = abstractC9870GjI._class;
        } catch (ClassNotFoundException unused) {
            abstractC9870GjIA06 = null;
        } catch (Exception e) {
            throw abstractC9849Git.A0A(abstractC9870GjI, str, String.format("problem: (%s) %s", C60Q.A0e(e), AbstractC9855Gj3.A0A(e)));
        }
        if (cls == clsA0D || cls.isAssignableFrom(clsA0D)) {
            abstractC9870GjIA06 = abstractC9901GkhA092._base._typeFactory.A06(abstractC9870GjI, clsA0D, false);
            if (abstractC9870GjIA06 == null) {
                if (abstractC9849Git instanceof AbstractC9904Gkk) {
                    AbstractC9904Gkk abstractC9904Gkk = (AbstractC9904Gkk) abstractC9849Git;
                    AbstractC9870GjI abstractC9870GjI2 = this._baseType;
                    abstractC9870GjIA06 = null;
                    if (abstractC9904Gkk._config._problemHandlers != null) {
                        throw BV4.A0a("handleUnknownTypeId");
                    }
                    EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A07;
                    if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                        throw abstractC9904Gkk.A0A(abstractC9870GjI2, str, "no such class found");
                    }
                }
            }
            return abstractC9870GjIA06;
        }
        throw abstractC9849Git.A0A(abstractC9870GjI, str, "Not a subtype");
    }

    @Override // X.InterfaceC9853Gix
    public final String AEn() {
        return "class name used as type id";
    }

    @Override // X.InterfaceC9853Gix
    public final String ANQ(Object obj) {
        if (this instanceof C9839Gie) {
            return ANR(obj.getClass(), obj);
        }
        return A00(this._typeFactory, obj.getClass(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9853Gix
    public final String ANR(Object obj, Class<?> cls) {
        if (!(this instanceof C9839Gie)) {
            return A00(this._typeFactory, obj, cls);
        }
        String name = AbstractC9840Gif.A01(obj).getName();
        return name.startsWith(((C9839Gie) this)._basePackagePrefix) ? name.substring(r1.length() - 1) : name;
    }

    public C9838Gid(AbstractC9870GjI abstractC9870GjI, AbstractC9841Gig abstractC9841Gig, C9860Gj8 c9860Gj8) {
        super(abstractC9870GjI, c9860Gj8);
        this._subTypeValidator = abstractC9841Gig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String A00(Object obj, Class<?> cls, C9860Gj8 c9860Gj8) {
        Class declaringClass;
        AbstractC9869GjH abstractC9869GjHA0B;
        Class declaringClass2;
        Class<?> clsA01 = AbstractC9840Gif.A01(cls);
        String name = clsA01.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || AbstractC9855Gj3.A00(clsA01) == null || AbstractC9855Gj3.A00(this._baseType._class) != null) ? name : AbstractC9870GjI.A04(this._baseType);
        }
        if (c9860Gj8 instanceof EnumSet) {
            AbstractCollection abstractCollection = (AbstractCollection) c9860Gj8;
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            if (abstractCollection.isEmpty()) {
                C9432GIw c9432GIw = C9432GIw.A04;
                Field field = c9432GIw.A03;
                if (field == null) {
                    throw BV5.A0U("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: ", c9432GIw.A01);
                }
                try {
                    declaringClass2 = (Class) field.get(abstractCollection);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            } else {
                declaringClass2 = ((Enum) abstractCollection.iterator().next()).getDeclaringClass();
            }
            abstractC9869GjHA0B = obj.A0A(obj.A07(null, C9860Gj8.A07, declaringClass2), EnumSet.class);
        } else {
            if (!(c9860Gj8 instanceof EnumMap)) {
                return name;
            }
            AbstractMap abstractMap = (AbstractMap) c9860Gj8;
            C10104GpS[] c10104GpSArr2 = AbstractC9855Gj3.A01;
            if (abstractMap.isEmpty()) {
                C9432GIw c9432GIw2 = C9432GIw.A04;
                Field field2 = c9432GIw2.A02;
                if (field2 == null) {
                    throw BV5.A0U("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: ", c9432GIw2.A00);
                }
                try {
                    declaringClass = (Class) field2.get(abstractMap);
                } catch (Exception e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                declaringClass = ((Enum) BV5.A0y(abstractMap).next()).getDeclaringClass();
            }
            C9861Gj9 c9861Gj9 = C9860Gj8.A07;
            abstractC9869GjHA0B = obj.A0B(obj.A07(null, c9861Gj9, declaringClass), obj.A07(null, c9861Gj9, Object.class), EnumMap.class);
        }
        return abstractC9869GjHA0B.A0V();
    }

    @Override // X.InterfaceC9853Gix
    public final AbstractC9870GjI Aha(AbstractC9849Git abstractC9849Git, String str) {
        return A01(abstractC9849Git, str);
    }
}
