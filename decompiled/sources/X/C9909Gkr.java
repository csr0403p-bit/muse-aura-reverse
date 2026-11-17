package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gkr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9909Gkr extends AbstractC10031Go7 implements InterfaceC10166Gqb {
    public static final C10131Gpw A0E;
    public C10131Gpw A00;
    public GQ3 A01;
    public List<C9943Glv> A02;
    public final AbstractC9870GjI A03;
    public final InterfaceC10076Gox A04;
    public final Class<?> A05;
    public final AbstractC9910Gks A06;
    public final InterfaceC10159GqS A07;
    public final C9861Gj9 A08;
    public final C9860Gj8 A09;
    public final Class<?> A0A;
    public final List<AbstractC9870GjI> A0B;
    public final boolean A0C;
    public transient Boolean A0D;

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
            if (r5 == r4) goto L1e
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
            if (r0 == 0) goto L1f
            X.Gkr r5 = (X.C9909Gkr) r5
            java.lang.Class<?> r1 = r5.A05
            java.lang.Class<?> r0 = r4.A05
            if (r1 != r0) goto L1f
        L1e:
            return r3
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9909Gkr.equals(java.lang.Object):boolean");
    }

    static {
        List list = Collections.EMPTY_LIST;
        A0E = new C10131Gpw(null, list, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C10131Gpw A00(X.C9909Gkr r25) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9909Gkr.A00(X.Gkr):X.Gpw");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.GQ3 A01(X.C9909Gkr r10) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            X.GQ3 r0 = r10.A01
            if (r0 != 0) goto Led
            X.GjI r8 = r10.A03
            if (r8 == 0) goto Le6
            X.Gks r4 = r10.A06
            X.GqS r3 = r10.A07
            X.Gj8 r5 = r10.A09
            java.util.List<X.GjI> r2 = r10.A0B
            java.lang.Class<?> r1 = r10.A0A
            boolean r0 = r10.A0C
            X.Glp r6 = new X.Glp
            r6.<init>(r4, r3, r0)
            java.util.LinkedHashMap r4 = X.C3cG.A0j()
            java.lang.Class<?> r0 = r8._class
            X.C9940Glp.A00(r6, r10, r0, r1, r4)
            java.util.Iterator r3 = r2.iterator()
        L26:
            boolean r0 = r3.hasNext()
            r7 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r3.next()
            X.GjI r2 = (X.AbstractC9870GjI) r2
            X.GqS r1 = r6.A00
            if (r1 == 0) goto L3d
            java.lang.Class<?> r0 = r2._class
            java.lang.Class r7 = r1.ABU(r0)
        L3d:
            X.Gj9 r0 = r2.A0K()
            X.Gpp r1 = new X.Gpp
            r1.<init>(r0, r5)
            java.lang.Class<?> r0 = r2._class
            X.C9940Glp.A00(r6, r1, r0, r7, r4)
            goto L26
        L4c:
            X.GqS r0 = r6.A00
            if (r0 == 0) goto La3
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class r1 = r0.ABU(r5)
            if (r1 == 0) goto La3
            java.lang.Class<?> r0 = r8._class
            X.C9940Glp.A01(r6, r10, r0, r1, r4)
            X.Gks r0 = r6.A00
            if (r0 == 0) goto La3
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto La3
            java.util.Iterator r9 = X.C3cG.A0i(r4)
        L6b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La3
            java.util.Map$Entry r8 = X.C3cH.A0l(r9)
            java.lang.Object r2 = r8.getKey()
            X.GEv r2 = (X.C9338GEv) r2
            java.lang.String r0 = "hashCode"
            java.lang.String r1 = r2.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            java.lang.Class<?>[] r0 = r2.A01
            int r0 = r0.length
            if (r0 != 0) goto L6b
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r1, r7)     // Catch: java.lang.Exception -> L6b
            java.lang.Object r2 = r8.getValue()     // Catch: java.lang.Exception -> L6b
            X.GqJ r2 = (X.C10152GqJ) r2     // Catch: java.lang.Exception -> L6b
            X.GpJ r1 = r2.A00     // Catch: java.lang.Exception -> L6b
            java.lang.annotation.Annotation[] r0 = r3.getDeclaredAnnotations()     // Catch: java.lang.Exception -> L6b
            X.GpJ r0 = r6.A06(r1, r0)     // Catch: java.lang.Exception -> L6b
            r2.A00 = r0     // Catch: java.lang.Exception -> L6b
            r2.A02 = r3     // Catch: java.lang.Exception -> L6b
            goto L6b
        La3:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Le6
            int r0 = r4.size()
            java.util.LinkedHashMap r6 = X.C60O.A15(r0)
            java.util.Iterator r5 = X.C3cG.A0i(r4)
        Lb5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lde
            java.util.Map$Entry r4 = X.C3cH.A0l(r5)
            java.lang.Object r0 = r4.getValue()
            X.GqJ r0 = (X.C10152GqJ) r0
            java.lang.reflect.Method r3 = r0.A02
            if (r3 == 0) goto Lb5
            X.Gqb r2 = r0.A01
            X.GpJ r0 = r0.A00
            X.Gmk r0 = r0.A01()
            X.Glc r1 = new X.Glc
            r1.<init>(r0, r2, r3, r7)
            java.lang.Object r0 = r4.getKey()
            r6.put(r0, r1)
            goto Lb5
        Lde:
            X.GQ3 r0 = new X.GQ3
            r0.<init>()
            r0.A00 = r6
            goto Leb
        Le6:
            X.GQ3 r0 = new X.GQ3
            r0.<init>()
        Leb:
            r10.A01 = r0
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9909Gkr.A01(X.Gkr):X.GQ3");
    }

    public static ParameterizedType A02(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A02(upperBounds[0]);
                }
            }
        }
        return null;
    }

    public static TypeVariable<?> A03(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A03(upperBounds[0]);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List<X.Glv>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A04(C9909Gkr c9909Gkr) {
        ?? A11;
        Map mapA00;
        List<C9943Glv> list = c9909Gkr.A02;
        List<C9943Glv> list2 = list;
        if (list == null) {
            AbstractC9870GjI abstractC9870GjI = c9909Gkr.A03;
            if (abstractC9870GjI == null || (mapA00 = C9945Glz.A00(abstractC9870GjI, new C9945Glz(c9909Gkr.A06, c9909Gkr.A07, c9909Gkr.A09, c9909Gkr.A0C), c9909Gkr)) == null) {
                A11 = Collections.EMPTY_LIST;
            } else {
                A11 = C60O.A11(mapA00.size());
                Iterator itA10 = BV5.A10(mapA00);
                while (itA10.hasNext()) {
                    C10120Gpl c10120Gpl = (C10120Gpl) itA10.next();
                    A11.add(new C9943Glv(c10120Gpl.A00.A01(), c10120Gpl.A01, c10120Gpl.A02));
                }
            }
            c9909Gkr.A02 = A11;
            list2 = A11;
        }
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A0D
            if (r0 != 0) goto L2a
            java.lang.Class<?> r1 = r2.A05
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L23
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L23
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L23
            java.lang.Class r0 = r1.getEnclosingClass()
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A0D = r0
        L2a:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9909Gkr.A0C():boolean");
    }

    @Override // X.InterfaceC10166Gqb
    public final AbstractC9870GjI Aba(Type type) {
        return C9860Gj8.A02(null, this.A08, this.A09, type);
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return this.A05.hashCode();
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        return FGI.A0U("[AnnotedClass ", this.A05.getName(), "]");
    }

    public C9909Gkr(Class<?> cls) {
        this.A03 = null;
        this.A05 = cls;
        this.A0B = Collections.EMPTY_LIST;
        this.A0A = null;
        this.A04 = AbstractC10095GpJ.A01;
        this.A08 = C9861Gj9.A00;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0C = false;
    }

    public static boolean A05(AbstractC9870GjI abstractC9870GjI, InterfaceC10166Gqb interfaceC10166Gqb, Type type) {
        AbstractC9870GjI abstractC9870GjI2;
        if (!abstractC9870GjI.A0U(interfaceC10166Gqb.Aba(type)._class)) {
            return false;
        }
        ParameterizedType parameterizedTypeA02 = A02(type);
        if (parameterizedTypeA02 != null && C6xC.A00(abstractC9870GjI._class, parameterizedTypeA02.getRawType())) {
            Type[] actualTypeArguments = parameterizedTypeA02.getActualTypeArguments();
            C9861Gj9 c9861Gj9A0K = abstractC9870GjI.A0K();
            if (c9861Gj9A0K._types.length != actualTypeArguments.length) {
                return false;
            }
            int i = 0;
            while (true) {
                AbstractC9870GjI[] abstractC9870GjIArr = c9861Gj9A0K._types;
                int length = abstractC9870GjIArr.length;
                if (i >= length) {
                    break;
                }
                if (i < 0 || i >= length) {
                    abstractC9870GjI2 = null;
                } else {
                    abstractC9870GjI2 = abstractC9870GjIArr[i];
                    if (abstractC9870GjI2 == null) {
                        abstractC9870GjI2 = C9860Gj8.A05;
                    }
                }
                if (!A05(abstractC9870GjI2, interfaceC10166Gqb, actualTypeArguments[i])) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;Ljava/lang/Class<*>;Ljava/util/List<LX/GjI;>;Ljava/lang/Class<*>;LX/Gox;LX/Gj9;LX/Gks;LX/GqS;LX/Gj8;Z)V */
    public C9909Gkr(AbstractC9910Gks abstractC9910Gks, AbstractC9870GjI abstractC9870GjI, InterfaceC10159GqS interfaceC10159GqS, C9861Gj9 c9861Gj9, C9860Gj8 c9860Gj8, InterfaceC10076Gox interfaceC10076Gox, Class cls, Class cls2, List list, boolean z) {
        this.A03 = abstractC9870GjI;
        this.A05 = cls;
        this.A0B = list;
        this.A0A = cls2;
        this.A04 = interfaceC10076Gox;
        this.A08 = c9861Gj9;
        this.A06 = abstractC9910Gks;
        this.A07 = interfaceC10159GqS;
        this.A09 = c9860Gj8;
        this.A0C = z;
    }
}
