package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HzU extends C06G {
    public final InterfaceC10512HoG A00;
    public final List<AbstractC10579HwA> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HzU) {
                HzU hzU = (HzU) obj;
                if (!C7384Etj.areEqual(this.A00, hzU.A00) || !C7384Etj.areEqual(this.A01, hzU.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HzU(InterfaceC10512HoG interfaceC10512HoG, List<? extends AbstractC10579HwA> list) {
        AnonymousClass003.A0u(interfaceC10512HoG, list);
        this.A00 = interfaceC10512HoG;
        this.A01 = list;
    }
}
