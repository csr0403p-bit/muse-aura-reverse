package X;

/* loaded from: classes5.dex */
public final class F2B {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("TosFlow{shouldAcceptTos=");
        sbA0x.append(this.A01);
        sbA0x.append(", shouldShowExplicitTos=");
        sbA0x.append(this.A02);
        sbA0x.append(C3cF.A00(0));
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLICIT_COMPONENT_STATE";
                break;
            case 2:
                str = "DEFAULT_COMPONENT_STATE";
                break;
            case 3:
            default:
                str = "FALLBACK_V13_OUTSIDE_EU_CANADA";
                break;
            case 4:
                str = "APPMANAGER_NOT_INSTALLED";
                break;
            case 5:
                str = "FALLBACK_V13_NO_SIM";
                break;
            case 6:
                str = "FALLBACK_V13_EU_CANADA";
                break;
        }
        sbA0x.append(str);
        return C8j3.A15(sbA0x);
    }

    public F2B(Integer num, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }
}
