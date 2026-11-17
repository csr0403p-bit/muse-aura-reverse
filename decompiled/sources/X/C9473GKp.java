package X;

import java.util.Map;

/* renamed from: X.GKp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9473GKp {
    public static final C9473GKp A01 = new C9473GKp();
    public final Map<Class<? extends GKQ>, InterfaceC9474GKq<? extends GKQ>> A00 = BV4.A0u();

    public final synchronized <ParametersT extends GKQ> void A00(InterfaceC9474GKq<ParametersT> creator, Class<ParametersT> parametersClass) {
        Map<Class<? extends GKQ>, InterfaceC9474GKq<? extends GKQ>> map = this.A00;
        InterfaceC9474GKq<? extends GKQ> interfaceC9474GKq = map.get(parametersClass);
        if (interfaceC9474GKq != null && !interfaceC9474GKq.equals(creator)) {
            throw BV6.A0u("Different key creator for parameters class already inserted");
        }
        map.put(parametersClass, creator);
    }
}
