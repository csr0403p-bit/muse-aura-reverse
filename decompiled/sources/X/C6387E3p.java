package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E3p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6387E3p implements InterfaceC5458Dit {
    public InterfaceC6413E4p A04;
    public InterfaceC5563Dkg A05;
    public E50 A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A04 = interfaceC6413E4p;
        this.A05 = interfaceC6413E4p.AhC(0, 1);
        interfaceC6413E4p.AAe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        if (r3 != 65534) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r14, X.C5542DkK r15) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6387E3p.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        E50 e50 = this.A06;
        if (e50 != null) {
            e50.AbK(j2);
        }
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return AbstractC6396E3y.A01(e2k);
    }
}
