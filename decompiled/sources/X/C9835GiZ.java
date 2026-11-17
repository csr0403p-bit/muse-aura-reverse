package X;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.GiZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9835GiZ implements InterfaceC9854Giz {
    public static final C9835GiZ A00 = new C9835GiZ();

    @Override // X.InterfaceC9854Giz
    public final /* bridge */ /* synthetic */ Object A7E(Object obj) {
        return obj;
    }

    public C9835GiZ() {
    }

    private final AbstractC9870GjI A00(C9860Gj8 c9860Gj8) {
        Class<?> cls = getClass();
        AbstractC9870GjI abstractC9870GjIA0F = c9860Gj8.A09(cls).A0F(InterfaceC9854Giz.class);
        if (abstractC9870GjIA0F == null || ((AbstractC9869GjH) abstractC9870GjIA0F)._bindings._types.length < 2) {
            throw BV5.A0U("Cannot find OUT type parameter for Converter of type ", cls.getName());
        }
        return abstractC9870GjIA0F;
    }

    @Override // X.InterfaceC9854Giz
    public final AbstractC9870GjI AGY(C9860Gj8 c9860Gj8) {
        return A00(c9860Gj8).A0B(0);
    }

    @Override // X.InterfaceC9854Giz
    public final AbstractC9870GjI AIN(C9860Gj8 c9860Gj8) {
        return A00(c9860Gj8).A0B(1);
    }

    public C9835GiZ(int i) {
    }
}
