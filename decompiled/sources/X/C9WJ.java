package X;

import kotlin.Unit;

/* renamed from: X.9WJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WJ extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ String $unavailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WJ(boolean z, String str) {
        super(1);
        this.$isAvailable = z;
        this.$unavailable = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        InterfaceC0857A6e interfaceC0857A6e2 = interfaceC0857A6e;
        C7384Etj.A0Y(interfaceC0857A6e2, 0);
        InterfaceC0857A6e.A01(C9WG.A00, interfaceC0857A6e2, this.$isAvailable);
        String str = this.$unavailable;
        if (str != null) {
            AbstractC1564Ale.A09(interfaceC0857A6e2, str);
        }
        return Unit.INSTANCE;
    }
}
