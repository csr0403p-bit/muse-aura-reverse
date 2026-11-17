package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* renamed from: X.Gm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9946Gm0 extends AbstractC10023Gnw {
    public C9937Glg A00;
    public final InterfaceC10166Gqb A01;
    public final boolean A02;

    public static final C9937Glg A00(C9946Gm0 c9946Gm0, C10104GpS c10104GpS, C10104GpS c10104GpS2) {
        C9971Gmk[] c9971GmkArrA03;
        int i;
        Annotation[][] annotationArr;
        int i2;
        InterfaceC10166Gqb interfaceC10166Gqb;
        Constructor<?> constructor;
        C9971Gmk c9971GmkA02;
        C9971Gmk[] c9971GmkArr;
        int length = c10104GpS.A00;
        if (length < 0) {
            length = c10104GpS.A01.getParameterTypes().length;
            c10104GpS.A00 = length;
        }
        if (((AbstractC10023Gnw) c9946Gm0).A00 == null) {
            interfaceC10166Gqb = c9946Gm0.A01;
            constructor = c10104GpS.A01;
            c9971GmkA02 = new C9971Gmk();
            if (length != 0) {
                c9971GmkArr = new C9971Gmk[length];
                for (int i3 = 0; i3 < length; i3++) {
                    c9971GmkArr[i3] = new C9971Gmk();
                }
            }
            return new C9937Glg(c9971GmkA02, interfaceC10166Gqb, constructor, c9971GmkArr);
        }
        if (length != 0) {
            Annotation[][] parameterAnnotations = c10104GpS.A03;
            if (parameterAnnotations == null) {
                parameterAnnotations = c10104GpS.A01.getParameterAnnotations();
                c10104GpS.A03 = parameterAnnotations;
            }
            int length2 = parameterAnnotations.length;
            Annotation[][] parameterAnnotations2 = null;
            if (length != length2) {
                Constructor<?> constructor2 = c10104GpS.A01;
                Class<?> declaringClass = constructor2.getDeclaringClass();
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                if (Enum.class.isAssignableFrom(declaringClass) && length == (i2 = length2 + 2)) {
                    annotationArr = new Annotation[i2][];
                    System.arraycopy(parameterAnnotations, 0, annotationArr, 2, length2);
                } else {
                    if (!declaringClass.isMemberClass() || length != (i = length2 + 1)) {
                        throw BV5.A0W("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", BV8.A1b(constructor2.getDeclaringClass().getName(), length, length2));
                    }
                    annotationArr = new Annotation[i][];
                    System.arraycopy(parameterAnnotations, 0, annotationArr, 1, length2);
                    annotationArr[0] = AbstractC10023Gnw.A02;
                }
                c9971GmkArrA03 = c9946Gm0.A03(annotationArr, null);
            } else {
                if (c10104GpS2 != null && (parameterAnnotations2 = c10104GpS2.A03) == null) {
                    parameterAnnotations2 = c10104GpS2.A01.getParameterAnnotations();
                    c10104GpS2.A03 = parameterAnnotations2;
                }
                c9971GmkArrA03 = c9946Gm0.A03(parameterAnnotations, parameterAnnotations2);
            }
            return new C9937Glg(A02(c9946Gm0, c10104GpS, c10104GpS2), c9946Gm0.A01, c10104GpS.A01, c9971GmkArrA03);
        }
        interfaceC10166Gqb = c9946Gm0.A01;
        constructor = c10104GpS.A01;
        c9971GmkA02 = A02(c9946Gm0, c10104GpS, c10104GpS2);
        c9971GmkArr = AbstractC10023Gnw.A01;
        return new C9937Glg(c9971GmkA02, interfaceC10166Gqb, constructor, c9971GmkArr);
    }

    public static C9971Gmk A02(C9946Gm0 c9946Gm0, C10104GpS c10104GpS, C10104GpS c10104GpS2) {
        if (!c9946Gm0.A02) {
            return new C9971Gmk();
        }
        Annotation[] declaredAnnotations = c10104GpS.A02;
        if (declaredAnnotations == null) {
            declaredAnnotations = c10104GpS.A01.getDeclaredAnnotations();
            c10104GpS.A02 = declaredAnnotations;
        }
        AbstractC10095GpJ abstractC10095GpJA07 = c9946Gm0.A07(declaredAnnotations);
        if (c10104GpS2 != null) {
            Annotation[] declaredAnnotations2 = c10104GpS2.A02;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = c10104GpS2.A01.getDeclaredAnnotations();
                c10104GpS2.A02 = declaredAnnotations2;
            }
            abstractC10095GpJA07 = c9946Gm0.A05(abstractC10095GpJA07, declaredAnnotations2);
        }
        return abstractC10095GpJA07.A01();
    }

    private C9971Gmk[] A03(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.A02) {
            return AbstractC10023Gnw.A01;
        }
        int length = annotationArr.length;
        C9971Gmk[] c9971GmkArr = new C9971Gmk[length];
        for (int i = 0; i < length; i++) {
            AbstractC10095GpJ abstractC10095GpJA05 = A05(C10080Gp1.A00, annotationArr[i]);
            if (annotationArr2 != null) {
                abstractC10095GpJA05 = A05(abstractC10095GpJA05, annotationArr2[i]);
            }
            c9971GmkArr[i] = abstractC10095GpJA05.A01();
        }
        return c9971GmkArr;
    }

    public C9946Gm0(AbstractC9910Gks abstractC9910Gks, InterfaceC10166Gqb interfaceC10166Gqb, boolean z) {
        super(abstractC9910Gks);
        this.A01 = interfaceC10166Gqb;
        this.A02 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[PHI: r2
  0x004d: PHI (r2v1 X.Gmk) = (r2v0 X.Gmk), (r2v3 X.Gmk) binds: [B:14:0x0035, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9934Glc A01(X.C9946Gm0 r5, X.InterfaceC10166Gqb r6, java.lang.reflect.Method r7, java.lang.reflect.Method r8) {
        /*
            java.lang.Class[] r0 = r7.getParameterTypes()
            int r4 = r0.length
            X.Gks r0 = r5.A00
            if (r0 != 0) goto L1f
            X.Gmk r2 = new X.Gmk
            r2.<init>()
            if (r4 == 0) goto L4d
            X.Gmk[] r3 = new X.C9971Gmk[r4]
            r1 = 0
        L13:
            X.Gmk r0 = new X.Gmk
            r0.<init>()
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 >= r4) goto L42
            goto L13
        L1f:
            java.lang.annotation.Annotation[] r0 = r7.getDeclaredAnnotations()
            X.GpJ r1 = r5.A07(r0)
            if (r8 == 0) goto L31
            java.lang.annotation.Annotation[] r0 = r8.getDeclaredAnnotations()
            X.GpJ r1 = r5.A05(r1, r0)
        L31:
            X.Gmk r2 = r1.A01()
            if (r4 == 0) goto L4d
            java.lang.annotation.Annotation[][] r1 = r7.getParameterAnnotations()
            if (r8 != 0) goto L48
            r0 = 0
        L3e:
            X.Gmk[] r3 = r5.A03(r1, r0)
        L42:
            X.Glc r0 = new X.Glc
            r0.<init>(r2, r6, r7, r3)
            return r0
        L48:
            java.lang.annotation.Annotation[][] r0 = r8.getParameterAnnotations()
            goto L3e
        L4d:
            X.Gmk[] r3 = X.AbstractC10023Gnw.A01
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9946Gm0.A01(X.Gm0, X.Gqb, java.lang.reflect.Method, java.lang.reflect.Method):X.Glc");
    }
}
