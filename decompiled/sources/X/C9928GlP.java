package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GlP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9928GlP {
    public static final InterfaceC10076Gox A08 = AbstractC10095GpJ.A01;
    public final AbstractC9910Gks A00;
    public final AbstractC9870GjI A01;
    public final AbstractC9901Gkh<?> A02;
    public final InterfaceC10159GqS A03;
    public final C9861Gj9 A04;
    public final Class<?> A05;
    public final Class<?> A06;
    public final boolean A07;

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/GqS;)LX/Gkr; */
    public static C9909Gkr A00(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, InterfaceC10159GqS interfaceC10159GqS) {
        if (abstractC9870GjI instanceof C9872GjK) {
            Class<?> cls = abstractC9870GjI._class;
            if (abstractC9901Gkh == null || abstractC9901Gkh.ABU(cls) == null) {
                return new C9909Gkr(abstractC9870GjI._class);
            }
        }
        C9928GlP c9928GlP = new C9928GlP(abstractC9870GjI, abstractC9901Gkh, interfaceC10159GqS);
        ArrayList arrayListA11 = C60O.A11(8);
        AbstractC9870GjI abstractC9870GjI2 = c9928GlP.A01;
        Class<?> cls2 = abstractC9870GjI2._class;
        if (cls2 != Object.class) {
            if (cls2.isInterface()) {
                A07(abstractC9870GjI2, arrayListA11, false);
            } else {
                A08(abstractC9870GjI2, arrayListA11, false);
            }
        }
        Class<?> cls3 = c9928GlP.A05;
        Class<?> cls4 = c9928GlP.A06;
        InterfaceC10076Gox interfaceC10076GoxA06 = c9928GlP.A06(arrayListA11);
        return new C9909Gkr(c9928GlP.A00, abstractC9870GjI2, c9928GlP.A03, c9928GlP.A04, c9928GlP.A02._base._typeFactory, interfaceC10076GoxA06, cls3, cls4, arrayListA11, c9928GlP.A07);
    }

    public static final C9909Gkr A02(C9928GlP c9928GlP) {
        List<AbstractC9870GjI> list = Collections.EMPTY_LIST;
        Class<?> cls = c9928GlP.A05;
        Class<?> cls2 = c9928GlP.A06;
        InterfaceC10076Gox interfaceC10076GoxA06 = c9928GlP.A06(list);
        return new C9909Gkr(c9928GlP.A00, null, c9928GlP.A03, c9928GlP.A04, c9928GlP.A02._base._typeFactory, interfaceC10076GoxA06, cls, cls2, list, c9928GlP.A07);
    }

    private AbstractC10095GpJ A03(AbstractC10095GpJ abstractC10095GpJ, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            abstractC10095GpJ = A05(abstractC10095GpJ, AbstractC9855Gj3.A0M(cls2));
            ArrayList arrayListA11 = C60O.A11(8);
            if (cls2 != cls) {
                while (true) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null || cls2 == cls) {
                        break;
                    }
                    arrayListA11.add(cls2);
                }
            }
            Iterator it = arrayListA11.iterator();
            while (it.hasNext()) {
                abstractC10095GpJ = A05(abstractC10095GpJ, AbstractC9855Gj3.A0M((Class) it.next()));
            }
        }
        return abstractC10095GpJ;
    }

    private AbstractC10095GpJ A05(AbstractC10095GpJ abstractC10095GpJ, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!abstractC10095GpJ.A02(annotation)) {
                    abstractC10095GpJ = abstractC10095GpJ.A00(annotation);
                    if (this.A00.A0g(annotation)) {
                        abstractC10095GpJ = A04(abstractC10095GpJ, annotation);
                    }
                }
            }
        }
        return abstractC10095GpJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8.A07 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.InterfaceC10076Gox A06(java.util.List<X.AbstractC9870GjI> r9) {
        /*
            r8 = this;
            X.Gks r0 = r8.A00
            if (r0 == 0) goto L5e
            X.GqS r6 = r8.A03
            if (r6 == 0) goto L59
            boolean r0 = r6 instanceof X.C10053GoX
            if (r0 == 0) goto L15
            r0 = r6
            X.GoX r0 = (X.C10053GoX) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L59
        L15:
            r7 = 1
        L16:
            X.Gp1 r4 = X.C10080Gp1.A00
            java.lang.Class<?> r1 = r8.A06
            if (r1 == 0) goto L22
            java.lang.Class<?> r0 = r8.A05
            X.GpJ r4 = r8.A03(r4, r0, r1)
        L22:
            boolean r5 = r8.A07
            if (r5 == 0) goto L30
            java.lang.Class<?> r0 = r8.A05
            java.lang.annotation.Annotation[] r0 = X.AbstractC9855Gj3.A0M(r0)
            X.GpJ r4 = r8.A05(r4, r0)
        L30:
            java.util.Iterator r3 = r9.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r2 = r3.next()
            X.GjI r2 = (X.AbstractC9870GjI) r2
            if (r7 == 0) goto L4c
            java.lang.Class<?> r1 = r2._class
            java.lang.Class r0 = r6.ABU(r1)
            X.GpJ r4 = r8.A03(r4, r1, r0)
        L4c:
            if (r5 == 0) goto L34
            java.lang.Class<?> r0 = r2._class
            java.lang.annotation.Annotation[] r0 = X.AbstractC9855Gj3.A0M(r0)
            X.GpJ r4 = r8.A05(r4, r0)
            goto L34
        L59:
            r7 = 0
            boolean r0 = r8.A07
            if (r0 != 0) goto L16
        L5e:
            X.Gox r0 = X.C9928GlP.A08
            return r0
        L61:
            if (r7 == 0) goto L6d
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Class r0 = r6.ABU(r1)
            X.GpJ r4 = r8.A03(r4, r1, r0)
        L6d:
            boolean r0 = r4 instanceof X.C10070Gor
            if (r0 == 0) goto L7d
            X.Gor r4 = (X.C10070Gor) r4
            java.lang.Class<?> r2 = r4.A00
            java.lang.annotation.Annotation r1 = r4.A01
            X.Gos r0 = new X.Gos
            r0.<init>(r2, r1)
            return r0
        L7d:
            boolean r0 = r4 instanceof X.C9990GnH
            if (r0 == 0) goto Lbe
            X.GnH r4 = (X.C9990GnH) r4
            java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> r2 = r4.A00
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto Lb6
            java.util.Iterator r0 = X.C3cG.A0i(r2)
            java.util.Map$Entry r1 = X.C3cH.A0l(r0)
            java.util.Map$Entry r0 = X.C3cH.A0l(r0)
            java.lang.Object r4 = r1.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r3 = r1.getValue()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            java.lang.Object r2 = r0.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            X.Gog r0 = new X.Gog
            r0.<init>(r4, r2, r3, r1)
            return r0
        Lb6:
            X.Gmk r0 = new X.Gmk
            r0.<init>()
            r0.A00 = r2
            return r0
        Lbe:
            X.Gox r0 = X.AbstractC10095GpJ.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9928GlP.A06(java.util.List):X.Gox");
    }

    public static void A07(AbstractC9870GjI abstractC9870GjI, List<AbstractC9870GjI> list, boolean z) {
        int length;
        Class<?> cls = abstractC9870GjI._class;
        if (z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i)._class == cls) {
                    return;
                }
            }
            list.add(abstractC9870GjI);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        AbstractC9870GjI[] abstractC9870GjIArr = ((AbstractC9869GjH) abstractC9870GjI)._superInterfaces;
        Iterator it = ((abstractC9870GjIArr == null || (length = abstractC9870GjIArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(abstractC9870GjIArr) : Collections.singletonList(abstractC9870GjIArr[0])).iterator();
        while (it.hasNext()) {
            A07((AbstractC9870GjI) it.next(), list, true);
        }
    }

    public static void A08(AbstractC9870GjI abstractC9870GjI, List<AbstractC9870GjI> list, boolean z) {
        int length;
        Class<?> cls = abstractC9870GjI._class;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i)._class == cls) {
                    return;
                }
            }
            list.add(abstractC9870GjI);
        }
        AbstractC9870GjI[] abstractC9870GjIArr = ((AbstractC9869GjH) abstractC9870GjI)._superInterfaces;
        Iterator it = ((abstractC9870GjIArr == null || (length = abstractC9870GjIArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(abstractC9870GjIArr) : Collections.singletonList(abstractC9870GjIArr[0])).iterator();
        while (it.hasNext()) {
            A07((AbstractC9870GjI) it.next(), list, true);
        }
        AbstractC9870GjI abstractC9870GjIA09 = abstractC9870GjI.A09();
        if (abstractC9870GjIA09 != null) {
            A08(abstractC9870GjIA09, list, true);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/GqS;)V */
    public C9928GlP(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, InterfaceC10159GqS interfaceC10159GqS) {
        this.A02 = abstractC9901Gkh;
        this.A01 = abstractC9870GjI;
        Class<?> cls = abstractC9870GjI._class;
        this.A05 = cls;
        this.A03 = interfaceC10159GqS;
        this.A04 = abstractC9870GjI.A0K();
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A08() ? abstractC9901Gkh.A02() : null;
        this.A00 = abstractC9910GksA02;
        this.A06 = interfaceC10159GqS != null ? interfaceC10159GqS.ABU(cls) : null;
        this.A07 = (abstractC9910GksA02 == null || (AbstractC9855Gj3.A0J(cls) && abstractC9870GjI.A0R())) ? false : true;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;Ljava/lang/Class<*>;LX/GqS;)LX/Gkr; */
    public static C9909Gkr A01(AbstractC9901Gkh abstractC9901Gkh, InterfaceC10159GqS interfaceC10159GqS, Class cls) {
        return (cls.isArray() && abstractC9901Gkh.ABU(cls) == null) ? new C9909Gkr(cls) : A02(new C9928GlP(abstractC9901Gkh, interfaceC10159GqS, cls));
    }

    private AbstractC10095GpJ A04(AbstractC10095GpJ abstractC10095GpJ, Annotation annotation) {
        for (Annotation annotation2 : AbstractC9855Gj3.A0M(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !abstractC10095GpJ.A02(annotation2)) {
                abstractC10095GpJ = abstractC10095GpJ.A00(annotation2);
                if (this.A00.A0g(annotation2)) {
                    abstractC10095GpJ = A04(abstractC10095GpJ, annotation2);
                }
            }
        }
        return abstractC10095GpJ;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;Ljava/lang/Class<*>;LX/GqS;)V */
    public C9928GlP(AbstractC9901Gkh abstractC9901Gkh, InterfaceC10159GqS interfaceC10159GqS, Class cls) {
        this.A02 = abstractC9901Gkh;
        this.A01 = null;
        this.A05 = cls;
        this.A03 = interfaceC10159GqS;
        this.A04 = C9861Gj9.A00;
        this.A00 = abstractC9901Gkh.A08() ? abstractC9901Gkh.A02() : null;
        this.A06 = interfaceC10159GqS.ABU(cls);
        this.A07 = AnonymousClass002.A1X(this.A00);
    }
}
