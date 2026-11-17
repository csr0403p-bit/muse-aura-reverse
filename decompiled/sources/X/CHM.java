package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CHM implements InterfaceC3882CgJ {
    public static final InterfaceC3288C9m A03 = CHL.A00;
    public final Map A01 = BV4.A0u();
    public final Map A02 = BV4.A0u();
    public final InterfaceC3288C9m A00 = A03;

    @Override // X.InterfaceC3882CgJ
    public final /* bridge */ /* synthetic */ void Aa0(InterfaceC3288C9m interfaceC3288C9m, Class cls) {
        this.A01.put(cls, interfaceC3288C9m);
        this.A02.remove(cls);
    }
}
