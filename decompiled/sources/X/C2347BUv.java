package X;

import kotlin.Unit;

/* renamed from: X.BUv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2347BUv extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2347BUv(String str, int i) {
        super(1);
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
        if (this.$t != 0) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
        }
        AbstractC1564Ale.A08(interfaceC0857A6e, this.A00);
        return Unit.INSTANCE;
    }
}
