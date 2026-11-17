package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class I0Q implements InterfaceC10512HoG {
    public final int $t;
    public final Object A00;
    public final String A01;

    public I0Q(Exception exc) {
        this.$t = 0;
        this.A00 = EnumC9706GeK.A0A;
        this.A01 = exc.toString();
    }

    @Override // X.InterfaceC10512HoG
    public final String AEf() {
        return this.A01;
    }

    @Override // X.InterfaceC10512HoG
    public final /* synthetic */ C9581GPs AJJ() {
        return null;
    }

    @Override // X.InterfaceC10512HoG
    public final EnumC9706GeK AJk() {
        return (EnumC9706GeK) this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I0Q(C9691Gdw c9691Gdw, List<GPR> list, C9691Gdw c9691Gdw2) {
        String str;
        this.$t = c9691Gdw2;
        this.A00 = EnumC9706GeK.A0A;
        int size = list.size();
        EnumC10621Hzf enumC10621Hzf = c9691Gdw.A02;
        StringBuilder sbA0x = C60O.A0x("getDCPProducts returned ");
        if (3 - c9691Gdw2 != 0) {
            sbA0x.append(size);
            str = " product(s) with an unrecognized external_billing_type (catalogType=";
        } else {
            sbA0x.append(size);
            str = " product(s) with an invalid META_SET price (catalogType=";
        }
        this.A01 = C3cJ.A0L(enumC10621Hzf, str, sbA0x);
    }

    public I0Q(C9691Gdw c9691Gdw, String str) {
        this.$t = 2;
        this.A00 = EnumC9706GeK.A06;
        EnumC10621Hzf enumC10621Hzf = c9691Gdw.A02;
        int size = c9691Gdw.A05.size();
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(" (catalogType=");
        sbA0g.append(enumC10621Hzf);
        this.A01 = AbstractC7610F5x.A0x(", requestedIds=", sbA0g, size);
    }

    public I0Q(String str) {
        this.$t = 1;
        this.A00 = EnumC9706GeK.A05;
        this.A01 = str;
    }
}
