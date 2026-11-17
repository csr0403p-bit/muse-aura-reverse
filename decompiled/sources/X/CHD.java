package X;

import com.google.firebase.encoders.EncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CHD implements InterfaceC3882CgJ<CHD> {
    public InterfaceC3288C9m<Object> A00;
    public boolean A01;
    public final Map<Class<?>, InterfaceC3288C9m<?>> A02 = BV4.A0u();
    public final Map<Class<?>, InterfaceC3289C9n<?>> A03;
    public static final InterfaceC3288C9m<Object> A04 = new InterfaceC3288C9m() { // from class: X.CHE
        @Override // X.C9k
        public final void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
            InterfaceC3289C9n<Boolean> interfaceC3289C9n = CHD.A05;
            throw new EncodingException(FGI.A0M("Couldn't find encoder for type ", C60Q.A0f(obj)));
        }
    };
    public static final InterfaceC3289C9n<String> A06 = new InterfaceC3289C9n() { // from class: X.CHG
        @Override // X.C9k
        public final void AA4(Object obj, CHI chi) {
            InterfaceC3289C9n<Boolean> interfaceC3289C9n = CHD.A05;
            chi.A3G((String) obj);
        }
    };
    public static final InterfaceC3289C9n<Boolean> A05 = new InterfaceC3289C9n() { // from class: X.CHF
        @Override // X.C9k
        public final void AA4(Object obj, CHI chi) {
            InterfaceC3289C9n<Boolean> interfaceC3289C9n = CHD.A05;
            chi.A3H(((Boolean) obj).booleanValue());
        }
    };
    public static final CHH A07 = new CHH();

    @Override // X.InterfaceC3882CgJ
    public final /* bridge */ /* synthetic */ void Aa0(InterfaceC3288C9m interfaceC3288C9m, Class cls) {
        this.A02.put(cls, interfaceC3288C9m);
        this.A03.remove(cls);
    }

    public CHD() {
        HashMap mapA0u = BV4.A0u();
        this.A03 = mapA0u;
        this.A00 = A04;
        this.A01 = false;
        mapA0u.put(String.class, A06);
        this.A02.remove(String.class);
        this.A03.put(Boolean.class, A05);
        this.A02.remove(Boolean.class);
        this.A03.put(Date.class, A07);
        this.A02.remove(Date.class);
    }
}
