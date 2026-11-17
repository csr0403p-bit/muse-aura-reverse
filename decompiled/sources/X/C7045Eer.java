package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.Eer, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7045Eer implements InterfaceC7068EfO {
    public final InterfaceC7005EeA<Boolean> A00;
    public final InterfaceC7068EfO A01;
    public final C6987Edn A02;
    public final Map<C7003Ee6, InterfaceC7068EfO> A03;

    public C7045Eer(C6987Edn c6987Edn, Map map) {
        InterfaceC7005EeA<Boolean> interfaceC7005EeA = AbstractC7180Ehp.A00;
        this.A01 = new C7044Eeq(this);
        this.A02 = c6987Edn;
        this.A03 = map;
        this.A00 = interfaceC7005EeA;
    }

    public final C7066EfD A00(C7198EiA c7198EiA, C6988Edo c6988Edo) throws IOException {
        EfF efFA01 = this.A02.A01(c7198EiA.A01, c6988Edo);
        try {
            efFA01.getClass();
            InterfaceC7034Eeg interfaceC7034Eeg = C7070EfR.A03;
            C6988Edo.A03(c6988Edo);
            int i = c6988Edo.A02;
            C6988Edo.A03(c6988Edo);
            C7066EfD c7066EfD = new C7066EfD(efFA01, interfaceC7034Eeg, i, c6988Edo.A00);
            c7066EfD.putExtra("is_rounded", AnonymousClass001.A0h());
            efFA01.close();
            return c7066EfD;
        } catch (Throwable th) {
            if (efFA01 != null) {
                efFA01.close();
            }
            throw th;
        }
    }

    @Override // X.InterfaceC7068EfO
    public final InterfaceC7064EfB decode(C6988Edo c6988Edo, int i, InterfaceC7034Eeg interfaceC7034Eeg, C7198EiA c7198EiA) throws IOException {
        InputStream inputStreamA07;
        InterfaceC7068EfO interfaceC7068EfO = c7198EiA.A02;
        if (interfaceC7068EfO == null) {
            C6988Edo.A03(c6988Edo);
            C7003Ee6 c7003Ee6A00 = c6988Edo.A07;
            if ((c7003Ee6A00 == null || c7003Ee6A00 == C7003Ee6.A02) && (inputStreamA07 = c6988Edo.A07()) != null) {
                c7003Ee6A00 = C6991Eds.A00(inputStreamA07);
                c6988Edo.A07 = c7003Ee6A00;
            }
            Map<C7003Ee6, InterfaceC7068EfO> map = this.A03;
            if (map == null || (interfaceC7068EfO = map.get(c7003Ee6A00)) == null) {
                interfaceC7068EfO = this.A01;
            }
        }
        return interfaceC7068EfO.decode(c6988Edo, i, interfaceC7034Eeg, c7198EiA);
    }
}
