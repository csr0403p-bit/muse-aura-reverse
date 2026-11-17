package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.google.common.base.Optional;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* renamed from: X.Gj8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9860Gj8 implements Serializable {
    public static final C9866GjE A00;
    public static final C9866GjE A01;
    public static final C9866GjE A02;
    public static final C9866GjE A03;
    public static final C9866GjE A04;
    public static final C9866GjE A05;
    public static final C9866GjE A06;
    public static final Class<?> A0A;
    public static final Class<?> A0B;
    public static final Class<?> A0C;
    public static final Class<?> A0D;
    public static final C9866GjE A0E;
    public static final C9866GjE A0F;
    public static final long serialVersionUID = 1;
    public final ClassLoader _classLoader;
    public final AbstractC10207GrT[] _modifiers;
    public final C9862GjA _parser;
    public final InterfaceC9510GMb<Object, AbstractC9870GjI> _typeCache;
    public static final AbstractC9870GjI[] A09 = new AbstractC9870GjI[0];
    public static final C9860Gj8 A08 = new C9860Gj8();
    public static final C9861Gj9 A07 = C9861Gj9.A00;

    static {
        Class<?> cls = Boolean.TYPE;
        A0A = cls;
        Class<?> cls2 = Double.TYPE;
        A0B = cls2;
        Class<?> cls3 = Integer.TYPE;
        A0C = cls3;
        Class<?> cls4 = Long.TYPE;
        A0D = cls4;
        A0E = new C9866GjE(cls);
        A01 = new C9866GjE(cls2);
        A03 = new C9866GjE(cls3);
        A04 = new C9866GjE(cls4);
        A06 = new C9866GjE(String.class);
        A05 = new C9866GjE(Object.class);
        A00 = new C9866GjE(Comparable.class);
        A02 = new C9866GjE(Enum.class);
        A0F = new C9866GjE(AbstractC9804GhQ.class);
    }

    public final AbstractC9870GjI A09(Type type) {
        return A02(null, A07, this, type);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<+Ljava/util/Map;>;LX/GjI;LX/GjI;)LX/GjL; */
    public final C9873GjL A0B(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, Class cls) {
        C9861Gj9 c9861Gj9;
        int length;
        AbstractC9870GjI[] abstractC9870GjIArr = {abstractC9870GjI, abstractC9870GjI2};
        C9861Gj9 c9861Gj92 = C9861Gj9.A00;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            c9861Gj9 = C9861Gj9.A00;
        } else {
            String[] strArr = new String[length];
            int i = 0;
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
            if (length != 2) {
                StringBuilder sbA0x = C60O.A0x("Cannot create TypeBindings for class ");
                BV6.A18(cls, sbA0x);
                sbA0x.append(" with ");
                sbA0x.append(2);
                sbA0x.append(" type parameter");
                sbA0x.append("s");
                throw C60O.A0i(C60P.A1O(": class expects ", sbA0x, length));
            }
            c9861Gj9 = new C9861Gj9(abstractC9870GjIArr, strArr, null);
        }
        C9873GjL c9873GjL = (C9873GjL) A07(null, c9861Gj9, cls);
        if (c9861Gj9._types.length == 0) {
            AbstractC9870GjI abstractC9870GjIA0F = c9873GjL.A0F(Map.class);
            AbstractC9870GjI abstractC9870GjIA08 = abstractC9870GjIA0F.A08();
            if (!abstractC9870GjIA08.equals(abstractC9870GjI)) {
                throw BV5.A0T("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{AbstractC9855Gj3.A06(cls), abstractC9870GjI, abstractC9870GjIA08});
            }
            AbstractC9870GjI abstractC9870GjIA07 = abstractC9870GjIA0F.A07();
            if (!abstractC9870GjIA07.equals(abstractC9870GjI2)) {
                throw BV5.A0T("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{AbstractC9855Gj3.A06(cls), abstractC9870GjI2, abstractC9870GjIA07});
            }
        }
        return c9873GjL;
    }

    public C9860Gj8() {
        this._typeCache = new GQ5(16, 200);
        this._parser = new C9862GjA(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    public static final AbstractC9870GjI A00(AbstractC9870GjI abstractC9870GjI, C9860Gj8 c9860Gj8) {
        AbstractC9870GjI c9868GjG;
        AbstractC10207GrT[] abstractC10207GrTArr = c9860Gj8._modifiers;
        if (abstractC10207GrTArr != null) {
            int length = abstractC10207GrTArr.length;
            for (int i = 0; i < length; i++) {
                if (!abstractC9870GjI.A06() && !abstractC9870GjI.A0R()) {
                    Class<?> cls = abstractC9870GjI._class;
                    if (cls == InterfaceC5023DOs.class || cls == HsZ.class) {
                        AbstractC9870GjI abstractC9870GjIA03 = AbstractC9870GjI.A03(abstractC9870GjI, 0);
                        AbstractC9870GjI abstractC9870GjIA032 = AbstractC9870GjI.A03(abstractC9870GjI, 1);
                        C9861Gj9 c9861Gj9 = AbstractC9869GjH.A00;
                        if (!(abstractC9870GjI instanceof AbstractC9869GjH)) {
                            throw C60O.A0i(BV8.A0x("Cannot upgrade from an instance of ", abstractC9870GjI));
                        }
                        c9868GjG = new C9868GjG(abstractC9870GjIA03, abstractC9870GjIA032, (AbstractC9869GjH) abstractC9870GjI);
                    } else if (cls == Optional.class) {
                        AbstractC9870GjI abstractC9870GjIA033 = AbstractC9870GjI.A03(abstractC9870GjI, 0);
                        C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
                        if (!(abstractC9870GjI instanceof AbstractC9869GjH)) {
                            throw C60O.A0i(BV8.A0x("Cannot upgrade from an instance of ", abstractC9870GjI));
                        }
                        c9868GjG = new C9871GjJ(abstractC9870GjIA033, (AbstractC9869GjH) abstractC9870GjI);
                    } else {
                        continue;
                    }
                    abstractC9870GjI = c9868GjG;
                }
            }
        }
        return abstractC9870GjI;
    }

    public static final AbstractC9870GjI A01(AbstractC9870GjI abstractC9870GjI, Class<?> cls) {
        Class<?> cls2 = abstractC9870GjI._class;
        if (cls2 == cls) {
            return abstractC9870GjI;
        }
        AbstractC9870GjI abstractC9870GjIA0F = abstractC9870GjI.A0F(cls);
        if (abstractC9870GjIA0F != null) {
            return abstractC9870GjIA0F;
        }
        boolean zIsAssignableFrom = cls.isAssignableFrom(cls2);
        Object[] objArr = {cls.getName(), abstractC9870GjI};
        if (zIsAssignableFrom) {
            throw BV5.A0T("Internal error: class %s not included as super-type for %s", objArr);
        }
        throw BV5.A0T("Class %s not a super-type of %s", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC9870GjI A02(X.Hi9 r10, X.C9861Gj9 r11, X.C9860Gj8 r12, java.lang.reflect.Type r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9860Gj8.A02(X.Hi9, X.Gj9, X.Gj8, java.lang.reflect.Type):X.GjI");
    }

    private boolean A04(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2) {
        if (!(abstractC9870GjI2 instanceof C9800GhI)) {
            if (abstractC9870GjI._class == abstractC9870GjI2._class) {
                List<AbstractC9870GjI> listA03 = abstractC9870GjI.A0K().A03();
                List<AbstractC9870GjI> listA032 = abstractC9870GjI2.A0K().A03();
                int size = listA03.size();
                for (int i = 0; i < size; i++) {
                    if (A04(listA03.get(i), listA032.get(i))) {
                    }
                }
            }
            return false;
        }
        ((C9800GhI) abstractC9870GjI2)._actualType = abstractC9870GjI;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9870GjI A06(X.AbstractC9870GjI r16, java.lang.Class<?> r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9860Gj8.A06(X.GjI, java.lang.Class, boolean):X.GjI");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hi9;Ljava/lang/Class<*>;LX/Gj9;)LX/GjI; */
    public final AbstractC9870GjI A07(Hi9 hi9, C9861Gj9 c9861Gj9, Class cls) {
        Object c9673GdV;
        Hi9 hi92;
        AbstractC9870GjI[] abstractC9870GjIArr;
        int length;
        AbstractC9870GjI abstractC9870GjI;
        AbstractC9870GjI c9867GjF;
        AbstractC9870GjI abstractC9870GjI2;
        AbstractC9870GjI abstractC9870GjI3;
        AbstractC9870GjI abstractC9870GjI4;
        AbstractC9870GjI abstractC9870GjI5;
        int length2;
        AbstractC9870GjI[] abstractC9870GjIArr2;
        int length3;
        Hi9 hi93 = hi9;
        AbstractC9870GjI abstractC9870GjIA03 = A03(cls);
        if (abstractC9870GjIA03 == null) {
            if (c9861Gj9 != null && (length3 = (abstractC9870GjIArr2 = c9861Gj9._types).length) != 0) {
                int i = 0;
                while (true) {
                    if (abstractC9870GjIArr2[i] instanceof AbstractC9793Gh8) {
                        c9673GdV = null;
                        break;
                    }
                    i++;
                    if (i >= length3) {
                        c9673GdV = new C9673GdV(cls, abstractC9870GjIArr2, c9861Gj9._hashCode);
                        break;
                    }
                }
            } else {
                c9673GdV = cls;
            }
            if (c9673GdV == null || (abstractC9870GjIA03 = (AbstractC9870GjI) ((GQ5) this._typeCache).A00.get(c9673GdV)) == null) {
                if (hi9 != null) {
                    if (hi93.A02 != cls) {
                        for (Hi9 hi94 = hi93.A01; hi94 != null; hi94 = hi94.A01) {
                            if (hi94.A02 == cls) {
                                hi93 = hi94;
                            }
                        }
                        hi92 = new Hi9(hi93, cls);
                    }
                    C9861Gj9 c9861Gj92 = AbstractC9869GjH.A00;
                    C9836Gia c9836Gia = new C9836Gia(null, A07, cls, null, null, null, 0, false);
                    ArrayList<C9836Gia> arrayListA0h = hi93.A00;
                    if (arrayListA0h == null) {
                        arrayListA0h = C3cG.A0h();
                        hi93.A00 = arrayListA0h;
                    }
                    arrayListA0h.add(c9836Gia);
                    return c9836Gia;
                }
                hi92 = new Hi9(null, cls);
                if (cls.isArray()) {
                    AbstractC9870GjI abstractC9870GjIA02 = A02(hi92, c9861Gj9, this, cls.getComponentType());
                    C9861Gj9 c9861Gj93 = AbstractC9869GjH.A00;
                    c9867GjF = new C9872GjK(abstractC9870GjIA02, c9861Gj9, Array.newInstance(abstractC9870GjIA02._class, 0), null, null, false);
                } else {
                    boolean zIsInterface = cls.isInterface();
                    C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                    if (zIsInterface) {
                        Type[] genericInterfaces = cls.getGenericInterfaces();
                        if (genericInterfaces == null || (length2 = genericInterfaces.length) == 0) {
                            abstractC9870GjIArr = A09;
                        } else {
                            abstractC9870GjIArr = new AbstractC9870GjI[length2];
                            int i2 = 0;
                            do {
                                abstractC9870GjIArr[i2] = A02(hi92, c9861Gj9, this, genericInterfaces[i2]);
                                i2++;
                            } while (i2 < length2);
                        }
                    } else {
                        Type genericSuperclass = cls.getGenericSuperclass();
                        abstractC9870GjIA02 = genericSuperclass != null ? A02(hi92, c9861Gj9, this, genericSuperclass) : null;
                        Type[] genericInterfaces2 = cls.getGenericInterfaces();
                        if (genericInterfaces2 == null || (length = genericInterfaces2.length) == 0) {
                            abstractC9870GjIArr = A09;
                        } else {
                            abstractC9870GjIArr = new AbstractC9870GjI[length];
                            int i3 = 0;
                            do {
                                abstractC9870GjIArr[i3] = A02(hi92, c9861Gj9, this, genericInterfaces2[i3]);
                                i3++;
                            } while (i3 < length);
                        }
                    }
                    if (cls == Properties.class) {
                        C9866GjE c9866GjE = A06;
                        c9867GjF = new C9873GjL(abstractC9870GjIA02, c9866GjE, c9866GjE, c9861Gj9, cls, null, null, abstractC9870GjIArr, false);
                    } else if (abstractC9870GjIA02 == null || (c9867GjF = abstractC9870GjIA02.A0E(abstractC9870GjIA02, c9861Gj9, cls, abstractC9870GjIArr)) == null) {
                        C9861Gj9 c9861Gj94 = c9861Gj9;
                        if (c9861Gj9 == null) {
                            c9861Gj94 = A07;
                        }
                        if (cls == Map.class) {
                            List<AbstractC9870GjI> listA03 = c9861Gj94.A03();
                            int size = listA03.size();
                            if (size == 0) {
                                abstractC9870GjI4 = A05;
                                abstractC9870GjI5 = abstractC9870GjI4;
                            } else {
                                if (size != 2) {
                                    throw BV5.A0T("Strange Map type %s with %d type parameter%s (%s), can not resolve", new Object[]{AbstractC9855Gj3.A06(cls), Integer.valueOf(size), size == 1 ? "" : "s", c9861Gj94});
                                }
                                abstractC9870GjI4 = listA03.get(0);
                                abstractC9870GjI5 = listA03.get(1);
                            }
                            c9867GjF = new C9873GjL(abstractC9870GjIA02, abstractC9870GjI4, abstractC9870GjI5, c9861Gj94, cls, null, null, abstractC9870GjIArr, false);
                        } else if (cls == Collection.class) {
                            List<AbstractC9870GjI> listA032 = c9861Gj94.A03();
                            if (listA032.isEmpty()) {
                                abstractC9870GjI3 = A05;
                            } else {
                                if (listA032.size() != 1) {
                                    throw C60Q.A0V("Strange Collection type ", cls.getName(), ": cannot determine type parameters");
                                }
                                abstractC9870GjI3 = (AbstractC9870GjI) C8j4.A0p(listA032);
                            }
                            c9867GjF = new C9874GjM(abstractC9870GjIA02, abstractC9870GjI3, c9861Gj94, cls, null, null, abstractC9870GjIArr, false);
                        } else if (cls == AtomicReference.class) {
                            List<AbstractC9870GjI> listA033 = c9861Gj94.A03();
                            if (listA033.isEmpty()) {
                                abstractC9870GjI2 = A05;
                            } else {
                                if (listA033.size() != 1) {
                                    throw C60Q.A0V("Strange Reference type ", cls.getName(), ": cannot determine type parameters");
                                }
                                abstractC9870GjI2 = (AbstractC9870GjI) C8j4.A0p(listA033);
                            }
                            c9867GjF = new C9871GjJ(abstractC9870GjIA02, abstractC9870GjI2, null, c9861Gj94, cls, null, null, abstractC9870GjIArr, false);
                        } else {
                            if (cls != Iterator.class && cls != Stream.class) {
                                if (BaseStream.class.isAssignableFrom(cls)) {
                                    if (DoubleStream.class.isAssignableFrom(cls)) {
                                        abstractC9870GjI = A01;
                                    } else if (IntStream.class.isAssignableFrom(cls)) {
                                        abstractC9870GjI = A03;
                                    } else if (LongStream.class.isAssignableFrom(cls)) {
                                        abstractC9870GjI = A04;
                                    }
                                }
                                int length4 = abstractC9870GjIArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length4) {
                                        c9867GjF = new C9866GjE(abstractC9870GjIA02, c9861Gj9, cls, null, null, abstractC9870GjIArr, false);
                                        break;
                                    }
                                    c9867GjF = abstractC9870GjIArr[i4].A0E(abstractC9870GjIA02, c9861Gj9, cls, abstractC9870GjIArr);
                                    if (c9867GjF != null) {
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                List<AbstractC9870GjI> listA034 = c9861Gj94.A03();
                                if (listA034.isEmpty()) {
                                    abstractC9870GjI = A05;
                                } else {
                                    if (listA034.size() != 1) {
                                        throw C60Q.A0V("Strange Iteration type ", cls.getName(), ": cannot determine type parameters");
                                    }
                                    abstractC9870GjI = (AbstractC9870GjI) C8j4.A0p(listA034);
                                }
                            }
                            c9867GjF = new C9867GjF(abstractC9870GjIA02, abstractC9870GjI, c9861Gj94, cls, null, null, abstractC9870GjIArr, false);
                        }
                    }
                }
                ArrayList<C9836Gia> arrayList = hi92.A00;
                if (arrayList != null) {
                    Iterator<C9836Gia> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C9836Gia next = it.next();
                        AbstractC9870GjI abstractC9870GjI6 = next._referencedType;
                        if (abstractC9870GjI6 != null) {
                            throw C3cG.A0Q(AnonymousClass006.A0y(c9867GjF, ", new = ", C3cG.A0f(abstractC9870GjI6, "Trying to re-set self reference; old value = ")));
                        }
                        next._referencedType = c9867GjF;
                    }
                }
                if (c9673GdV != null && !c9867GjF.A0O()) {
                    ((GQ5) this._typeCache).A00.putIfAbsent(c9673GdV, c9867GjF);
                }
                return c9867GjF;
            }
        }
        return abstractC9870GjIA03;
    }

    public final AbstractC9870GjI A08(String str) {
        C9862GjA c9862GjA = this._parser;
        int length = str.length();
        if (length > 64000) {
            throw BV5.A0T("Failed to parse type %s: too long (%d characters), maximum length allowed: %d", BV8.A1b(C9862GjA.A02(str), length, 64000));
        }
        C9864GjC c9864GjC = new C9864GjC(str.trim());
        AbstractC9870GjI abstractC9870GjIA00 = C9862GjA.A00(c9864GjC, c9862GjA, 1000);
        if (c9864GjC.hasMoreTokens()) {
            throw C9862GjA.A01(c9864GjC, "Unexpected tokens after complete type");
        }
        return abstractC9870GjIA00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<+Ljava/util/Collection;>;LX/GjI;)LX/GjM; */
    public final C9874GjM A0A(AbstractC9870GjI abstractC9870GjI, Class cls) {
        C9861Gj9 c9861Gj9;
        int length;
        C9861Gj9 c9861Gj92 = C9861Gj9.A00;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            c9861Gj9 = C9861Gj9.A00;
        } else {
            if (length != 1) {
                throw C60O.A0i(FGI.A0V("Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects ", length));
            }
            c9861Gj9 = new C9861Gj9(new AbstractC9870GjI[]{abstractC9870GjI}, new String[]{typeParameters[0].getName()}, null);
        }
        C9874GjM c9874GjM = (C9874GjM) A07(null, c9861Gj9, cls);
        if (c9861Gj9._types.length == 0 && abstractC9870GjI != null) {
            AbstractC9870GjI abstractC9870GjIA07 = c9874GjM.A0F(Collection.class).A07();
            if (!abstractC9870GjIA07.equals(abstractC9870GjI)) {
                throw BV5.A0T("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{AbstractC9855Gj3.A06(cls), abstractC9870GjI, abstractC9870GjIA07});
            }
        }
        return c9874GjM;
    }

    @Deprecated
    public final AbstractC9870GjI A0C(Class<?> cls) {
        C9866GjE c9866GjEA03;
        C9861Gj9 c9861Gj9 = A07;
        return (c9861Gj9._types.length != 0 || (c9866GjEA03 = A03(cls)) == null) ? new C9866GjE(null, c9861Gj9, cls, null, null, null, false) : c9866GjEA03;
    }

    public final Class<?> A0D(String str) throws ClassNotFoundException {
        Throwable e;
        if (str.indexOf(46) < 0) {
            Class<?> cls = "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : BrowserOperationCatalogKt.DOUBLE.equals(str) ? Double.TYPE : "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = this._classLoader;
        if (contextClassLoader == null) {
            contextClassLoader = Thread.currentThread().getContextClassLoader();
        }
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, false, contextClassLoader);
            } catch (Exception e2) {
                e = e2;
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
            }
        } else {
            e = null;
        }
        try {
            return Class.forName(str, false, C9860Gj8.class.getClassLoader());
        } catch (Exception e3) {
            e = e3;
            if (e == null) {
                C10104GpS[] c10104GpSArr2 = AbstractC9855Gj3.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                e = e;
            }
            AbstractC9855Gj3.A0F(e);
            throw new ClassNotFoundException(e.getMessage(), e);
        }
    }

    public static final AbstractC9870GjI A03(Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls == String.class) {
                return A06;
            }
            if (cls == Object.class) {
                return A05;
            }
            if (cls == AbstractC9804GhQ.class) {
                return A0F;
            }
            return null;
        }
        if (cls == A0A) {
            return A0E;
        }
        if (cls == A0C) {
            return A03;
        }
        if (cls == A0D) {
            return A04;
        }
        if (cls == A0B) {
            return A01;
        }
        return null;
    }

    public static final AbstractC9870GjI[] A05(AbstractC9870GjI abstractC9870GjI, Class<?> cls) {
        AbstractC9870GjI abstractC9870GjIA0F = abstractC9870GjI.A0F(cls);
        return abstractC9870GjIA0F == null ? A09 : abstractC9870GjIA0F.A0K()._types;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GMb<Ljava/lang/Object;LX/GjI;>;LX/GjA;[LX/GrT;Ljava/lang/ClassLoader;)V */
    public C9860Gj8(C9862GjA c9862GjA, InterfaceC9510GMb interfaceC9510GMb, ClassLoader classLoader, AbstractC10207GrT[] abstractC10207GrTArr) {
        this._typeCache = interfaceC9510GMb == null ? new GQ5(16, 200) : interfaceC9510GMb;
        this._parser = this != c9862GjA._factory ? new C9862GjA(this) : c9862GjA;
        this._modifiers = abstractC10207GrTArr;
        this._classLoader = classLoader;
    }
}
