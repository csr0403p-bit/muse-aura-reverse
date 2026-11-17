package X;

import java.lang.annotation.Annotation;
import kotlinx.serialization.json.JsonClassDiscriminator;

/* renamed from: X.9r9, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9r9 {
    public static final String A00(C9iZ c9iZ, C9sU c9sU) {
        C7384Etj.A0Y(c9iZ, 0);
        for (Annotation annotation : c9iZ.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return c9sU.A00.A01;
    }

    public static final void A02(BL8 bl8) {
        C7384Etj.A0Y(bl8, 0);
        if (bl8 instanceof C9i9) {
            throw C3cG.A0Q("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (bl8 instanceof AbstractC07679ic) {
            throw C3cG.A0Q("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (bl8 instanceof C9hz) {
            throw C3cG.A0Q("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9hv<*>;LX/9hv<*>;Ljava/lang/String;)V */
    public static final void A01(String str, C9hv c9hv, C9hv c9hv2) {
        if (c9hv instanceof C9hq) {
            C9iZ descriptor = c9hv2.getDescriptor();
            C7384Etj.A0Y(descriptor, 0);
            if (C9iG.A00(descriptor).contains(str)) {
                throw C3cG.A0Q(FGI.A0k("Sealed class '", c9hv2.getDescriptor().AKP(), "' cannot be serialized as base class '", ((C9hq) c9hv).getDescriptor().AKP(), "' because it has property name that conflicts with JSON class discriminator '", str, "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"));
            }
        }
    }
}
