package X;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EYQ {
    public final List A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.InterfaceC6739EXx<T> A01(X.C6753EYn<T> r5) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            r4 = this;
            java.lang.reflect.Type r1 = r5.A02
            java.lang.Class<? super T> r2 = r5.A01
            java.util.Map r0 = r4.A01
            r0.get(r1)
            r0.get(r2)
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L1b
            r0 = 1
        L15:
            X.F5W r3 = new X.F5W
            r3.<init>(r1, r0)
            return r3
        L1b:
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r2 != r0) goto L21
            r0 = 2
            goto L15
        L21:
            java.util.List r0 = r4.A00
            X.AbstractC7423Evb.A00(r0)
            int r0 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r0)
            r0 = 0
            if (r3 != 0) goto L56
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L56
            r5 = 1
            r1.setAccessible(r5)     // Catch: java.lang.Exception -> L3b
            r0 = 3
            goto L15
        L3b:
            r0 = move-exception
            java.lang.String r4 = "Failed making constructor '"
            java.lang.String r3 = X.EYR.A02(r1)
            java.lang.String r2 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = X.EYR.A00(r0)
            java.lang.String r0 = X.FGI.A0h(r4, r3, r2, r1, r0)
            X.F5X r3 = new X.F5X
            r3.<init>(r0, r5)
            return r3
        L56:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L82
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L6d
            r1 = 1
        L67:
            X.F5V r3 = new X.F5V
            r3.<init>(r1)
            return r3
        L6d:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L77
            r1 = 2
            goto L67
        L77:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r2)
            r1 = 4
            if (r0 == 0) goto L67
            r1 = 3
            goto L67
        L82:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Lc8
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r0 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L94
            r1 = 5
            goto L67
        L94:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L9e
            r1 = 6
            goto L67
        L9e:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto La8
            r1 = 7
            goto L67
        La8:
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lc6
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r0 = 0
            r1 = r1[r0]
            X.EYn r0 = new X.EYn
            r0.<init>(r1)
            java.lang.Class<? super T> r0 = r0.A01
            boolean r0 = r2.isAssignableFrom(r0)
            r1 = 8
            if (r0 == 0) goto L67
        Lc6:
            r1 = 0
            goto L67
        Lc8:
            java.lang.String r1 = A00(r2)
            r0 = 0
            if (r1 == 0) goto Ld5
            X.F5X r3 = new X.F5X
            r3.<init>(r1, r0)
            return r3
        Ld5:
            X.F5W r3 = new X.F5W
            r3.<init>(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYQ.A01(X.EYn):X.EXx");
    }

    public final String toString() {
        return this.A01.toString();
    }

    public EYQ(List list, Map map) {
        this.A01 = map;
        this.A00 = list;
    }

    public static String A00(Class<?> cls) {
        StringBuilder sbA0x;
        String strA0M;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            sbA0x = C60O.A0x("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            strA0M = cls.getName();
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            sbA0x = C60O.A0x("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ");
            BV6.A18(cls, sbA0x);
            sbA0x.append("\nSee ");
            strA0M = FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "r8-abstract-class");
        }
        return AnonymousClass001.A0v(strA0M, sbA0x);
    }
}
