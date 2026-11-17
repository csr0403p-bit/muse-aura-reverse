package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9sR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sR {
    /* JADX WARN: Incorrect types in method signature: (LX/9sU;LX/G0U<-LX/9sm;Lkotlin/Unit;>;)LX/9sU; */
    public static final C6s3 A00(G0U g0u, C9sU c9sU) {
        C7384Etj.A0Y(g0u, 1);
        C08039sm c08039sm = new C08039sm();
        C9sa c9sa = c9sU.A00;
        c08039sm.A0A = c9sa.A09;
        c08039sm.A0B = c9sa.A0A;
        c08039sm.A0C = c9sa.A0B;
        c08039sm.A0D = c9sa.A0C;
        c08039sm.A0E = c9sa.A0D;
        c08039sm.A02 = c9sa.A02;
        c08039sm.A08 = c9sa.A07;
        c08039sm.A01 = c9sa.A01;
        c08039sm.A00 = c9sa.A00;
        c08039sm.A0F = c9sa.A0E;
        c08039sm.A09 = c9sa.A08;
        c08039sm.A07 = c9sa.A06;
        c08039sm.A04 = c9sa.A03;
        c08039sm.A05 = c9sa.A04;
        c08039sm.A06 = c9sa.A05;
        c08039sm.A0G = c9sa.A0F;
        c08039sm.A03 = c9sU.A02;
        g0u.invoke(c08039sm);
        boolean z = c08039sm.A0G;
        if (z) {
            if (!"type".equals(c08039sm.A01)) {
                throw C60O.A0i("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (c08039sm.A00 != C79.A0C) {
                throw C60O.A0i("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        boolean z2 = c08039sm.A0E;
        String str = c08039sm.A02;
        boolean zEquals = "    ".equals(str);
        if (z2) {
            if (!zEquals) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw C60Q.A0U("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ", c08039sm.A02);
                    }
                }
            }
        } else if (!zEquals) {
            throw C60O.A0i("Indent should not be specified when default printing mode is used");
        }
        boolean z3 = c08039sm.A0A;
        boolean z4 = c08039sm.A0C;
        boolean z5 = c08039sm.A0D;
        boolean z6 = c08039sm.A06;
        boolean z7 = c08039sm.A0E;
        boolean z8 = c08039sm.A0B;
        String str2 = c08039sm.A02;
        boolean z9 = c08039sm.A08;
        C9sa c9sa2 = new C9sa(c08039sm.A00, str2, c08039sm.A01, z3, z4, z5, z6, z7, z8, z9, z, c08039sm.A05, c08039sm.A0F, c08039sm.A09, c08039sm.A07, c08039sm.A04);
        C07959pz c07959pz = c08039sm.A03;
        C7384Etj.A0Y(c07959pz, 1);
        C6s3 c6s3 = new C6s3(c9sa2, c07959pz);
        C07959pz c07959pz2 = c6s3.A02;
        if (!c07959pz2.equals(AbstractC2260BKq.A00)) {
            C9sa c9sa3 = c6s3.A00;
            String str3 = c9sa3.A01;
            boolean z10 = c9sa3.A0F;
            boolean zA1Z = AnonymousClass006.A1Z(c9sa3.A00, C79.A00);
            Iterator itA0n = AnonymousClass002.A0n(c07959pz2.A00);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                Object key = entry.getKey();
                C9q2 c9q2 = (C9q2) entry.getValue();
                if (c9q2 instanceof C9q1) {
                    C7384Etj.A0Z(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C7384Etj.A0Z(((C9q1) c9q2).A00, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                } else if (!(c9q2 instanceof C9q0)) {
                    throw C3cG.A0q();
                }
            }
            Iterator itA0n2 = AnonymousClass002.A0n(c07959pz2.A04);
            while (itA0n2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itA0n2.next();
                Object key2 = entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    C9uG c9uG = (C9uG) entry3.getKey();
                    C9hr c9hr = (C9hr) entry3.getValue();
                    C7384Etj.A0Z(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C7384Etj.A0Z(c9uG, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C7384Etj.A0Z(c9hr, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    C9iZ descriptor = c9hr.getDescriptor();
                    BL8 bl8AGs = descriptor.AGs();
                    if ((bl8AGs instanceof C9hz) || C7384Etj.areEqual(bl8AGs, C9hs.A00)) {
                        StringBuilder sbA0x = C60O.A0x("Serializer for ");
                        sbA0x.append(C8j3.A12(c9uG));
                        sbA0x.append(" can't be registered as a subclass for polymorphic serialization because its kind ");
                        sbA0x.append(bl8AGs);
                        throw C8j3.A0w(" is not concrete. To work with multiple hierarchies, register it as a base class.", sbA0x);
                    }
                    if (!z10 && zA1Z) {
                        if (C7384Etj.areEqual(bl8AGs, C9tD.A00) || C7384Etj.areEqual(bl8AGs, C9tE.A00) || (bl8AGs instanceof AbstractC07679ic) || (bl8AGs instanceof C9i9)) {
                            StringBuilder sbA0x2 = C60O.A0x("Serializer for ");
                            sbA0x2.append(C8j3.A12(c9uG));
                            sbA0x2.append(" of kind ");
                            sbA0x2.append(bl8AGs);
                            throw C8j3.A0w(" cannot be serialized polymorphically with class discriminator.", sbA0x2);
                        }
                        int iAF6 = descriptor.AF6();
                        for (int i2 = 0; i2 < iAF6; i2++) {
                            String strAF5 = descriptor.AF5(i2);
                            if (C7384Etj.areEqual(strAF5, str3)) {
                                StringBuilder sbA0f = C3cG.A0f(c9uG, "Polymorphic serializer for ");
                                sbA0f.append(" has property '");
                                sbA0f.append(strAF5);
                                throw C8j3.A0w("' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism", sbA0f);
                            }
                        }
                    }
                }
            }
            Iterator itA0n3 = AnonymousClass002.A0n(c07959pz2.A02);
            while (itA0n3.hasNext()) {
                Map.Entry entry4 = (Map.Entry) itA0n3.next();
                Object key3 = entry4.getKey();
                Object value = entry4.getValue();
                C7384Etj.A0Z(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C7384Etj.A0Z(value, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                C0862A6j.A02(value, 1);
            }
            Iterator itA0n4 = AnonymousClass002.A0n(c07959pz2.A01);
            while (itA0n4.hasNext()) {
                Map.Entry entry5 = (Map.Entry) itA0n4.next();
                Object key4 = entry5.getKey();
                Object value2 = entry5.getValue();
                C7384Etj.A0Z(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C7384Etj.A0Z(value2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                C0862A6j.A02(value2, 1);
            }
        }
        return c6s3;
    }
}
