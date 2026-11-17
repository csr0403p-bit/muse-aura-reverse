package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.DqN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5832DqN implements InterfaceC5458Dit {
    public final C6154Dwx A00;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(0, 3);
        E2A.A00(interfaceC6413E4p, -9223372036854775807L);
        interfaceC6413E4p.AAe();
        C6154Dwx c6154Dwx = this.A00;
        C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
        c6162Dx5A01.A06("text/x-unknown");
        c6162Dx5A01.A0U = c6154Dwx.A0b;
        InterfaceC5563Dkg.A00(c6162Dx5A01, interfaceC5563DkgAhC);
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    public C5832DqN(C6154Dwx c6154Dwx) {
        this.A00 = c6154Dwx;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        return e2k.Afj(Integer.MAX_VALUE) != -1 ? 0 : -1;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return true;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
    }
}
