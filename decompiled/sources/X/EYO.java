package X;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EYO implements EYY {
    public final InterfaceC6749EYj A00;
    public final EYQ A01;
    public final EYK A02;
    public final EYD A03;
    public final List A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[PHI: r2 r16
  0x005a: PHI (r2v6 java.lang.reflect.Method) = (r2v3 java.lang.reflect.Method), (r2v2 java.lang.reflect.Method) binds: [B:72:0x015e, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r16v2 boolean) = (r16v0 boolean), (r16v3 boolean) binds: [B:72:0x015e, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.EYW A00(X.EYC r30, X.C6753EYn r31, java.lang.Class r32, boolean r33) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYO.A00(X.EYC, X.EYn, java.lang.Class, boolean):X.EYW");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException; */
    public static void A01(Class cls, String str, Field field, Field field2) {
        StringBuilder sbA0x = C60O.A0x("Class ");
        BV6.A18(cls, sbA0x);
        sbA0x.append(" declares multiple JSON fields named '");
        sbA0x.append(str);
        sbA0x.append("'; conflict is caused by fields ");
        sbA0x.append(FGI.A0U(field.getDeclaringClass().getName(), "#", field.getName()));
        sbA0x.append(" and ");
        sbA0x.append(FGI.A0U(field2.getDeclaringClass().getName(), "#", field2.getName()));
        sbA0x.append("\nSee ");
        throw C8j3.A0w(FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "duplicate-fields"), sbA0x);
    }

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        Class<? super T> cls = c6753EYn.A01;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new F4I(this, 4);
        }
        AbstractC7423Evb.A00(this.A04);
        Ev0 ev0 = EYR.A00;
        if (ev0 instanceof C7404Eui) {
            try {
                if (AnonymousClass001.A1X(((C7404Eui) ev0).A03.invoke(cls, null))) {
                    Map<Class<?>, Object> map = EYP.A03;
                    return new EYP(A00(eyc, c6753EYn, cls, true), cls);
                }
            } catch (ReflectiveOperationException e) {
                throw BV4.A0d("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        }
        return new EYT(this.A01.A01(c6753EYn), A00(eyc, c6753EYn, cls, false));
    }

    public EYO(InterfaceC6749EYj interfaceC6749EYj, EYQ eyq, EYK eyk, EYD eyd, List list) {
        this.A01 = eyq;
        this.A00 = interfaceC6749EYj;
        this.A02 = eyk;
        this.A03 = eyd;
        this.A04 = list;
    }
}
