package X;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CHP implements InterfaceC3882CgJ<CHP> {
    public static final InterfaceC3288C9m<Object> A03 = new InterfaceC3288C9m() { // from class: X.CHO
        @Override // X.C9k
        public final void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
            throw new EncodingException(FGI.A0M("Couldn't find encoder for type ", C60Q.A0f(obj)));
        }
    };
    public final Map<Class<?>, InterfaceC3288C9m<?>> A01 = BV4.A0u();
    public final Map<Class<?>, InterfaceC3289C9n<?>> A02 = BV4.A0u();
    public InterfaceC3288C9m<Object> A00 = A03;

    @Override // X.InterfaceC3882CgJ
    public final /* bridge */ /* synthetic */ void Aa0(InterfaceC3288C9m interfaceC3288C9m, Class cls) {
        this.A01.put(cls, interfaceC3288C9m);
        this.A02.remove(cls);
    }
}
