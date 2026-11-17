package X;

/* renamed from: X.GpW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10106GpW {
    public static void A00(Object obj, boolean z) {
        if (obj != null) {
            if (!(obj instanceof Class)) {
                throw BV5.A0T("AnnotationIntrospector returned EnumNamingStrategy definition of type %s; expected type `Class<EnumNamingStrategy>` instead", new Object[]{AbstractC9855Gj3.A07(obj)});
            }
            Class cls = (Class) obj;
            if (cls != InterfaceC10204GrQ.class) {
                if (!InterfaceC10204GrQ.class.isAssignableFrom(cls)) {
                    throw BV5.A0T("Problem with AnnotationIntrospector returned Class %s; expected `Class<EnumNamingStrategy>`", new Object[]{AbstractC9855Gj3.A07(cls)});
                }
                AbstractC9855Gj3.A03(cls, z);
            }
        }
    }
}
