package X;

import java.util.Map;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializationException;

/* renamed from: X.9hu, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9hu<T> implements C9hr<T> {
    /* JADX WARN: Incorrect types in method signature: (LX/9j4;Ljava/lang/String;)LX/9jG<TT;>; */
    public C9jG A01(String str, C9j4 c9j4) {
        G0U<String, C9jG<?>> g0u;
        C9hr<?> c9hr;
        C7384Etj.A0Y(c9j4, 0);
        C07959pz c07959pzAKT = c9j4.AKT();
        C9uG<T> c9uGA00 = A00();
        C7384Etj.A0Y(c9uGA00, 0);
        Map<String, C9hr<?>> map = c07959pzAKT.A03.get(c9uGA00);
        if (map != null && (c9hr = map.get(str)) != null) {
            return c9hr;
        }
        G0U<String, C9jG<?>> g0u2 = c07959pzAKT.A01.get(c9uGA00);
        if (!C0862A6j.A04(1, g0u2) || (g0u = g0u2) == null) {
            return null;
        }
        return g0u.invoke(str);
    }

    @Override // X.C9jG
    public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ descriptor = getDescriptor();
        C9j4 c9j4A55 = interfaceC07829iw.A55(descriptor);
        String strA8f = null;
        T t = null;
        while (true) {
            int iA8N = c9j4A55.A8N(getDescriptor());
            if (iA8N == -1) {
                if (t == null) {
                    throw C60Q.A0U("Polymorphic value has not been read for class ", strA8f);
                }
                c9j4A55.AAd(descriptor);
                return t;
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(getDescriptor(), iA8N);
            } else {
                if (iA8N != 1) {
                    if (strA8f == null) {
                        strA8f = "unknown class";
                    }
                    throw new SerializationException(FGI.A0V("Invalid index in polymorphic deserialization of ", strA8f, "\n Expected 0, 1 or DECODE_DONE(-1), but found ", iA8N));
                }
                if (strA8f == null) {
                    throw C60O.A0i("Cannot read polymorphic value before its type token");
                }
                C9jG c9jGA01 = A01(strA8f, c9j4A55);
                if (c9jGA01 == null) {
                    BHX.A00(strA8f, A00());
                    throw F60.createAndThrow();
                }
                t = (T) c9j4A55.A8a(c9jGA01, getDescriptor(), 1);
            }
        }
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, t);
        C9hv c9hvA00 = C9ht.A00(t, interfaceC07789is, this);
        C9iZ descriptor = getDescriptor();
        C9j5 c9j5A56 = interfaceC07789is.A56(descriptor);
        c9j5A56.AAV(c9hvA00.getDescriptor().AKP(), getDescriptor(), 0);
        c9j5A56.AAQ(t, c9hvA00, getDescriptor(), zA1a ? 1 : 0);
        c9j5A56.AAd(descriptor);
    }

    public final C9uG<T> A00() {
        return this instanceof C9hq ? ((C9hq) this).A04 : ((PolymorphicSerializer) this).A01;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9is;TT;)LX/9hv<TT;>; */
    public C9hv A02(Object obj, InterfaceC07789is interfaceC07789is) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        return interfaceC07789is.AKT().A01(obj, A00());
    }
}
