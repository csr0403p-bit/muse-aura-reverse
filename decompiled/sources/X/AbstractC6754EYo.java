package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: X.EYo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6754EYo {
    public static final Type[] A00 = new Type[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[PHI: r1
  0x008c: PHI (r1v15 java.lang.reflect.Type) = (r1v14 java.lang.reflect.Type), (r1v16 java.lang.reflect.Type) binds: [B:43:0x0089, B:35:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0071 A[EDGE_INSN: B:88:0x0071->B:37:0x0071 BREAK  A[LOOP:0: B:3:0x0001->B:91:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[LOOP:0: B:3:0x0001->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.EYq] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.EYq] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.EYp] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.EYr] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Class, java.lang.reflect.Type] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type A04(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6754EYo.A04(java.lang.Class, java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static boolean A07(Type type, Type type2) {
        boolean zEquals;
        Type[] lowerBounds;
        Type[] lowerBounds2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (C6xC.A00(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
                    lowerBounds = parameterizedType.getActualTypeArguments();
                    lowerBounds2 = parameterizedType2.getActualTypeArguments();
                    zEquals = Arrays.equals(lowerBounds, lowerBounds2);
                }
            }
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return A07(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds())) {
                    lowerBounds = wildcardType.getLowerBounds();
                    lowerBounds2 = wildcardType2.getLowerBounds();
                    zEquals = Arrays.equals(lowerBounds, lowerBounds2);
                }
            }
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (C6xC.A00(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration())) {
                zEquals = typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return zEquals;
    }

    public static Class<?> A00(Type type) {
        if (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                if (type instanceof GenericArrayType) {
                    return Array.newInstance(A00(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                }
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    return A00(((WildcardType) type).getUpperBounds()[0]);
                }
                String strA0e = type == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : C60Q.A0e(type);
                StringBuilder sbA0f = C3cG.A0f(type, "Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sbA0f.append("> is of type ");
                throw C8j3.A0w(strA0e, sbA0f);
            }
            type = ((ParameterizedType) type).getRawType();
            if (!(type instanceof Class)) {
                throw BV4.A0P();
            }
        }
        return (Class) type;
    }

    public static String A01(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Type A02(Type type, Class<?> cls, Class<?> cls2) {
        boolean z = cls2 instanceof WildcardType;
        Type type2 = cls2;
        if (z) {
            type2 = ((WildcardType) cls2).getUpperBounds()[0];
        }
        if (cls.isAssignableFrom(type)) {
            return A04(type, type2, A03(type, cls, type2), BV4.A0u());
        }
        throw BV4.A0P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[LOOP:1: B:17:0x0033->B:28:0x0051, LOOP_START, PHI: r4
  0x0033: PHI (r4v1 java.lang.Class<?>) = (r4v3 java.lang.Class<?>), (r4v2 java.lang.Class<?>) binds: [B:16:0x0031, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type A03(java.lang.reflect.Type r4, java.lang.Class<?> r5, java.lang.Class<?> r6) {
        /*
            if (r5 == r4) goto L1a
            boolean r0 = r5.isInterface()
            if (r0 == 0) goto L2d
            java.lang.Class[] r3 = r4.getInterfaces()
            int r2 = r3.length
            r1 = 0
        Le:
            if (r1 >= r2) goto L2d
            r0 = r3[r1]
            if (r0 != r5) goto L1b
            java.lang.reflect.Type[] r0 = r4.getGenericInterfaces()
            r6 = r0[r1]
        L1a:
            return r6
        L1b:
            boolean r0 = r5.isAssignableFrom(r0)
            if (r0 == 0) goto L2a
            java.lang.reflect.Type[] r0 = r4.getGenericInterfaces()
            r0 = r0[r1]
            r1 = r3[r1]
            goto L4c
        L2a:
            int r1 = r1 + 1
            goto Le
        L2d:
            boolean r0 = r4.isInterface()
            if (r0 != 0) goto L53
        L33:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 == r0) goto L53
            java.lang.Class r1 = r4.getSuperclass()
            if (r1 != r5) goto L42
            java.lang.reflect.Type r6 = r4.getGenericSuperclass()
            return r6
        L42:
            boolean r0 = r5.isAssignableFrom(r1)
            if (r0 == 0) goto L51
            java.lang.reflect.Type r0 = r4.getGenericSuperclass()
        L4c:
            java.lang.reflect.Type r6 = A03(r1, r5, r0)
            return r6
        L51:
            r4 = r1
            goto L33
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6754EYo.A03(java.lang.Class, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static Type A05(Type type) {
        Type genericComponentType;
        Type type2;
        if (type instanceof Class) {
            Class cls = (Class) type;
            boolean zIsArray = cls.isArray();
            type2 = cls;
            if (zIsArray) {
                genericComponentType = A05(cls.getComponentType());
                return new C6757EYr(genericComponentType);
            }
            return type2;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C6755EYp((Class) parameterizedType.getRawType(), parameterizedType.getOwnerType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            return new C6757EYr(genericComponentType);
        }
        boolean z = type instanceof WildcardType;
        type2 = type;
        if (z) {
            WildcardType wildcardType = (WildcardType) type;
            return new C6756EYq(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type2;
    }

    public static void A06(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw BV4.A0P();
        }
    }
}
