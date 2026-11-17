package X;

import java.lang.annotation.Annotation;
import java.util.Map;

/* renamed from: X.BeF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2580BeF {
    public final String A00;
    public final Map<Class<?>, Object> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2580BeF) {
                C2580BeF c2580BeF = (C2580BeF) obj;
                if (!this.A00.equals(c2580BeF.A00) || !this.A01.equals(c2580BeF.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static C2580BeF A00(String str, Map map) {
        return new C2580BeF(str, map);
    }

    public static Annotation A01(C2580BeF c2580BeF, Object obj) {
        return (Annotation) c2580BeF.A01.get(obj);
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FieldDescriptor{name=");
        sbA0x.append(this.A00);
        sbA0x.append(", properties=");
        return BV8.A0v(this.A01.values(), sbA0x);
    }

    public C2580BeF(String str, Map<Class<?>, Object> map) {
        this.A00 = str;
        this.A01 = map;
    }
}
