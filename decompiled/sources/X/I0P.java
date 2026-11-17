package X;

/* loaded from: classes6.dex */
public final class I0P implements InterfaceC10512HoG {
    public final int $t;
    public final Object A00;

    public I0P(int i) {
        EnumC9706GeK enumC9706GeK;
        this.$t = i;
        switch (i) {
            case 0:
                enumC9706GeK = EnumC9706GeK.A0K;
                break;
            case 1:
                enumC9706GeK = EnumC9706GeK.A0J;
                break;
            case 2:
                enumC9706GeK = EnumC9706GeK.A07;
                break;
            case 3:
                enumC9706GeK = EnumC9706GeK.A08;
                break;
            case 4:
                enumC9706GeK = EnumC9706GeK.A0H;
                break;
            default:
                enumC9706GeK = EnumC9706GeK.A04;
                break;
        }
        this.A00 = enumC9706GeK;
    }

    @Override // X.InterfaceC10512HoG
    public final String AEf() {
        switch (this.$t) {
            case 0:
                return "Play Billing did not answer the connection within 30 seconds";
            case 1:
                return "Billing scope closed before the operation ran";
            case 2:
                return "No catalog IDs were provided in the fetch request";
            case 3:
                return "Catalog fetch failed with an internal exception";
            case 4:
            case 5:
            case 6:
                return "";
            default:
                return null;
        }
    }

    @Override // X.InterfaceC10512HoG
    public final /* synthetic */ C9581GPs AJJ() {
        return null;
    }

    @Override // X.InterfaceC10512HoG
    public final EnumC9706GeK AJk() {
        return (EnumC9706GeK) this.A00;
    }

    public I0P(EnumC9706GeK enumC9706GeK) {
        this.$t = 6;
        this.A00 = enumC9706GeK;
    }
}
