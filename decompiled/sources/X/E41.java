package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E41 implements InterfaceC5458Dit {
    public final E1P A00 = BV6.A0Y(4);
    public final C6390E3s A01 = new C6390E3s(-1, -1, "image/heif");

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        e2k.A47(4);
        E1P e1p = this.A00;
        E2K.A03(e1p, e2k, 4);
        if (e1p.A0H() == 1718909296) {
            E2K.A02(e1p, e2k, 4);
            if (e1p.A0H() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A01.ANb(interfaceC6413E4p);
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        return this.A01.AZ4(e2k, c5542DkK);
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A01.AcL(j, j2);
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }
}
