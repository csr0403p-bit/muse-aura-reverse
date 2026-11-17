package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class Hkf extends C06G {
    public final InterfaceC10512HoG A00;
    public final List<GOU> A01;
    public final List<G4X> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hkf) {
                Hkf hkf = (Hkf) obj;
                if (!C7384Etj.areEqual(this.A00, hkf.A00) || !C7384Etj.areEqual(this.A01, hkf.A01) || !C7384Etj.areEqual(this.A02, hkf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Hkf(InterfaceC10512HoG interfaceC10512HoG, List<? extends GOU> list, List<G4X> list2) {
        AnonymousClass005.A0x(interfaceC10512HoG, list, list2);
        this.A00 = interfaceC10512HoG;
        this.A01 = list;
        this.A02 = list2;
    }
}
