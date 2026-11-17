package X;

import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class BHX {
    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;LX/9uG<*>;)Ljava/lang/Void; */
    public static final void A00(String str, C9uG c9uG) {
        StringBuilder sbA0x;
        C7384Etj.A0Y(c9uG, 1);
        Class<?> cls = ((C0861A6i) c9uG).A00;
        String strA0N = FGI.A0N("in the polymorphic scope of '", C0861A6i.A01(cls), '\'');
        if (str == null) {
            sbA0x = C3cI.A0x("Class discriminator was missing and no default serializers were registered ", strA0N);
            sbA0x.append('.');
        } else {
            sbA0x = C3cI.A0x("Serializer for subclass '", str);
            sbA0x.append("' is not found ");
            sbA0x.append(strA0N);
            sbA0x.append(".\nCheck if class with serial name '");
            sbA0x.append(str);
            sbA0x.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sbA0x.append(str);
            sbA0x.append("' has to be '@Serializable', and the base class '");
            sbA0x.append(C0861A6i.A01(cls));
            sbA0x.append("' has to be sealed and '@Serializable'.");
        }
        throw new SerializationException(sbA0x.toString());
    }
}
