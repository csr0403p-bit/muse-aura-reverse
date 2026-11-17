package X;

import kotlin.Unit;

/* renamed from: X.BUw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2348BUw extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2348BUw(String str, Object obj, int i) {
        super(1);
        this.$t = i;
        this.A01 = str;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            C7384Etj.A0Y(obj, 0);
            ((G0U) this.A00).invoke(this.A01);
            return new BL5(new BUV(7));
        }
        InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        String str = this.A01;
        if (!C7BY.A0j(str)) {
            AbstractC1564Ale.A08(interfaceC0857A6e, str);
        }
        C8nh c8nh = (C8nh) ((C8ni) this.A00);
        AbstractC1564Ale.A0E(interfaceC0857A6e, c8nh.A03);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A01, new AnonymousClass906(c8nh.A00));
        return Unit.INSTANCE;
    }
}
