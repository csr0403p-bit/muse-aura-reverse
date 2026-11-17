package X;

import kotlin.Unit;

/* renamed from: X.3cE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3cE extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3cE(String str, int i) {
        super(1);
        this.$t = i;
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        String str;
        C0920AHw<String> c0920AHw;
        InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
        switch (this.$t) {
            case 0:
            case 3:
                str = this.A00;
                c0920AHw = AbstractC1671Anw.A0S;
                interfaceC0857A6e.Aca(c0920AHw, str);
                break;
            case 1:
                AbstractC1564Ale.A08(interfaceC0857A6e, this.A00);
                break;
            case 2:
            case 5:
                AbstractC1564Ale.A04(interfaceC0857A6e);
                AbstractC1564Ale.A08(interfaceC0857A6e, this.A00);
                break;
            case 4:
            case 6:
            default:
                String str2 = this.A00;
                C0881AGi c0881AGi = C0881AGi.A00;
                AbstractC1564Ale.A07(interfaceC0857A6e, new ApQ(str2, c0881AGi, c0881AGi));
                i = 0;
                AbstractC1564Ale.A06(interfaceC0857A6e, i);
                break;
            case 7:
                AbstractC1564Ale.A08(interfaceC0857A6e, this.A00);
                i = 5;
                AbstractC1564Ale.A06(interfaceC0857A6e, i);
                break;
            case 8:
                interfaceC0857A6e.Aca(AbstractC1671Anw.A0S, this.A00);
                interfaceC0857A6e.Aca(AbstractC1671Anw.A0h, Float.valueOf(0.0f));
                break;
            case 9:
                str = this.A00;
                c0920AHw = AbstractC1671Anw.A07;
                interfaceC0857A6e.Aca(c0920AHw, str);
                break;
            case 10:
                C7384Etj.A0Y(interfaceC0857A6e, 0);
                AbstractC1564Ale.A08(interfaceC0857A6e, this.A00);
                i = 5;
                AbstractC1564Ale.A06(interfaceC0857A6e, i);
                break;
        }
        return Unit.INSTANCE;
    }
}
