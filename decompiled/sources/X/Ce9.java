package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class Ce9 extends AbstractC3769CeC {
    public final InterfaceC3770CeD A00;
    public final Map<Ce5, AbstractC3771CeE> A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3769CeC) {
                Ce9 ce9 = (Ce9) ((AbstractC3769CeC) obj);
                if (!this.A00.equals(ce9.A00) || !this.A01.equals(ce9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0A(this.A00) ^ this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SchedulerConfig{clock=");
        sbA0x.append(this.A00);
        sbA0x.append(", values=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public Ce9(InterfaceC3770CeD interfaceC3770CeD, Map<Ce5, AbstractC3771CeE> map) {
        this.A00 = interfaceC3770CeD;
        this.A01 = map;
    }
}
