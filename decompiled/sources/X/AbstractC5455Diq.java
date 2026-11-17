package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.Diq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5455Diq implements InterfaceC5458Dit {
    public final InterfaceC5458Dit A00;

    @Override // X.InterfaceC5458Dit
    public final List<DQC> AKl() {
        return this.A00.AKl();
    }

    @Override // X.InterfaceC5458Dit
    public final InterfaceC5458Dit AMF() {
        return this.A00.AMF();
    }

    @Override // X.InterfaceC5458Dit
    public void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A00.ANb(interfaceC6413E4p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Diq] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        boolean z = this instanceof C5454Dip;
        ?? r2 = this;
        if (z) {
            C5454Dip c5454Dip = (C5454Dip) this;
            C5375DhR c5375DhR = c5454Dip.A00;
            r2 = c5454Dip;
            if (c5375DhR != null) {
                r2 = c5454Dip;
                if (e2k instanceof C5336DgX) {
                    Uri uri = ((C1J) ((C5336DgX) e2k).A04).getUri();
                    r2 = c5454Dip;
                    if (uri != null) {
                        c5375DhR.A01 = uri;
                        r2 = c5454Dip;
                    }
                }
            }
        }
        return r2.A00.AZ4(e2k, c5542DkK);
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A00.AcL(j, j2);
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return this.A00.Afs(e2k);
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
        this.A00.release();
    }

    public AbstractC5455Diq(InterfaceC5458Dit interfaceC5458Dit) {
        this.A00 = interfaceC5458Dit;
    }
}
