package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.EYp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6755EYp implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type ownerType;
    public final Type rawType;
    public final Type[] typeArguments;

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC6754EYo.A07(this, (Type) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.typeArguments.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.rawType;
    }

    public final int hashCode() {
        return BV6.A09(this.rawType, Arrays.hashCode(this.typeArguments)) ^ C60R.A01(this.ownerType);
    }

    public final String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC6754EYo.A01(this.rawType);
        }
        StringBuilder sbA0p = BV4.A0p((length + 1) * 30);
        sbA0p.append(AbstractC6754EYo.A01(this.rawType));
        sbA0p.append("<");
        sbA0p.append(AbstractC6754EYo.A01(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            C8j3.A1K(sbA0p);
            sbA0p.append(AbstractC6754EYo.A01(this.typeArguments[i]));
        }
        return AnonymousClass001.A0v(">", sbA0p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6755EYp(Type type, Class<?> cls, Type... typeArr) {
        Type typeA05;
        type.getClass();
        if (cls != null) {
            typeA05 = AbstractC6754EYo.A05(cls);
        } else {
            if (!Modifier.isStatic(type.getModifiers()) && type.getDeclaringClass() != null) {
                throw BV5.A0O(type, "Must specify owner type for ");
            }
            typeA05 = null;
        }
        this.ownerType = typeA05;
        this.rawType = AbstractC6754EYo.A05(type);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            this.typeArguments[i].getClass();
            AbstractC6754EYo.A06(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC6754EYo.A05(typeArr3[i]);
        }
    }
}
