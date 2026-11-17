package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* renamed from: X.EYn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6753EYn<T> {
    public final int A00;
    public final Class<? super T> A01;
    public final Type A02;

    public static AbstractC6735EXt A00(EYC eyc, Type type) {
        return eyc.A01(new C6753EYn<>(type));
    }

    public static C6753EYn A01(Type... typeArr) {
        TypeVariable[] typeParameters = List.class.getTypeParameters();
        int length = typeParameters.length;
        if (1 != length) {
            StringBuilder sbA0w = C60O.A0w();
            BV6.A18(List.class, sbA0w);
            sbA0w.append(" requires ");
            sbA0w.append(length);
            throw C60O.A0i(C60P.A1O(" type arguments, but got ", sbA0w, 1));
        }
        if (!Modifier.isStatic(List.class.getModifiers()) && List.class.getDeclaringClass() != null) {
            throw C60Q.A0V("Raw type ", List.class.getName(), " is not supported because it requires specifying an owner type");
        }
        Type type = typeArr[0];
        Hqg.A00(type, "Type argument must not be null");
        Class<?> clsA00 = AbstractC6754EYo.A00(type);
        TypeVariable typeVariable = typeParameters[0];
        for (Type type2 : typeVariable.getBounds()) {
            if (!AbstractC6754EYo.A00(type2).isAssignableFrom(clsA00)) {
                StringBuilder sbA0f = C3cG.A0f(type, "Type argument ");
                sbA0f.append(" does not satisfy bounds for type variable ");
                sbA0f.append(typeVariable);
                throw BV5.A0P(List.class, " declared by ", sbA0f);
            }
        }
        return new C6753EYn(new C6755EYp(List.class, null, typeArr));
    }

    public static void A02(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            StringBuilder sbA0x = C60O.A0x("TypeToken type argument must not contain a type variable; captured type variable ");
            sbA0x.append(typeVariable.getName());
            sbA0x.append(" declared by ");
            sbA0x.append(typeVariable.getGenericDeclaration());
            sbA0x.append("\nSee ");
            throw C8j3.A0w(FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "typetoken-type-variable"), sbA0x);
        }
        if (type instanceof GenericArrayType) {
            A02(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                A02(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                A02(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw C60O.A0i("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            A02(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            A02(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6753EYn) && AbstractC6754EYo.A07(this.A02, ((C6753EYn) obj).A02);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC6754EYo.A01(this.A02);
    }

    public C6753EYn(Type type) {
        type.getClass();
        Type typeA05 = AbstractC6754EYo.A05(type);
        this.A02 = typeA05;
        this.A01 = (Class<? super T>) AbstractC6754EYo.A00(typeA05);
        this.A00 = typeA05.hashCode();
    }

    public C6753EYn() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C6753EYn.class) {
                Type typeA05 = AbstractC6754EYo.A05(parameterizedType.getActualTypeArguments()[0]);
                if (!C6xC.A00(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    A02(typeA05);
                }
                this.A02 = typeA05;
                this.A01 = (Class<? super T>) AbstractC6754EYo.A00(typeA05);
                this.A00 = typeA05.hashCode();
                return;
            }
        } else if (genericSuperclass == C6753EYn.class) {
            throw BV5.A0U("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ", FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", "type-token-raw"));
        }
        throw C3cG.A0Q("Must only create direct subclasses of TypeToken");
    }
}
