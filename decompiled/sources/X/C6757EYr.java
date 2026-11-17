package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.EYr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6757EYr implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type componentType;

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC6754EYo.A07(this, (Type) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.componentType;
    }

    public final int hashCode() {
        return this.componentType.hashCode();
    }

    public final String toString() {
        return FGI.A0M(AbstractC6754EYo.A01(this.componentType), "[]");
    }

    public C6757EYr(Type type) {
        type.getClass();
        this.componentType = AbstractC6754EYo.A05(type);
    }
}
