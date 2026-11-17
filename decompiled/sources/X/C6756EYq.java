package X;

import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.EYq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6756EYq implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type lowerBound;
    public final Type upperBound;

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC6754EYo.A07(this, (Type) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC6754EYo.A00;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.upperBound};
    }

    public final int hashCode() {
        Type type = this.lowerBound;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
    }

    public final String toString() {
        String str;
        Type type = this.lowerBound;
        if (type != null) {
            str = "? super ";
        } else {
            type = this.upperBound;
            if (type == Object.class) {
                return HatchOpenGraphRepository.UNKNOWN_HOST;
            }
            str = "? extends ";
        }
        return FGI.A0M(str, AbstractC6754EYo.A01(type));
    }

    public C6756EYq(Type[] typeArr, Type[] typeArr2) {
        Type typeA05;
        int length = typeArr2.length;
        if (length > 1) {
            throw BV4.A0P();
        }
        if (typeArr.length != 1) {
            throw BV4.A0P();
        }
        if (length == 1) {
            typeArr2[0].getClass();
            AbstractC6754EYo.A06(typeArr2[0]);
            typeA05 = Object.class;
            if (typeArr[0] != typeA05) {
                throw BV4.A0P();
            }
            this.lowerBound = AbstractC6754EYo.A05(typeArr2[0]);
        } else {
            typeArr[0].getClass();
            AbstractC6754EYo.A06(typeArr[0]);
            this.lowerBound = null;
            typeA05 = AbstractC6754EYo.A05(typeArr[0]);
        }
        this.upperBound = typeA05;
    }
}
