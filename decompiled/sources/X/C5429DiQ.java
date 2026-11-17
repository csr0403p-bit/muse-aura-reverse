package X;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.Timeline;
import com.google.common.base.Supplier;
import java.util.Map;

/* renamed from: X.DiQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5429DiQ extends AbstractC6011Dtu implements InterfaceC5539DkG {
    public long A00;
    public CXB A01;
    public Supplier<InterfaceExecutorC5232Ddq> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C5568Dkm A07;
    public final C5704Dnm A08;
    public final CXN A09;
    public final InterfaceC5460Div A0A;
    public final InterfaceC5530Dk7 A0B;
    public final InterfaceC5334DgV A0C;

    @Override // X.AbstractC6011Dtu
    public final void A0B() {
    }

    @Override // X.InterfaceC6009Dts
    public final InterfaceC6006Dtp A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        C1J c1jCreateDataSource = this.A09.createDataSource();
        CXB cxb = this.A01;
        if (cxb != null) {
            c1jCreateDataSource.addTransferListener(cxb);
        }
        Map<String, String> map = C5427DiO.A0e;
        C5568Dkm c5568Dkm = this.A07;
        Uri uri = c5568Dkm.A01;
        C5494DjW c5494DjWA7y = this.A0B.A7y();
        InterfaceC5460Div interfaceC5460Div = this.A0A;
        C6014Dtx c6014Dtx = new C6014Dtx(dy6, super.A03.A02, 0);
        InterfaceC5334DgV interfaceC5334DgV = this.A0C;
        C6013Dtw c6013Dtw = new C6013Dtw(dy6, super.A04.A02, 0);
        String str = c5568Dkm.A05;
        int i = this.A06;
        Supplier<InterfaceExecutorC5232Ddq> supplier = this.A02;
        return new C5427DiO(uri, c1jCreateDataSource, c6014Dtx, interfaceC5460Div, c6013Dtw, c5494DjWA7y, this, interfaceC5538DkF, interfaceC5334DgV, supplier != null ? supplier.get() : null, str, i);
    }

    @Override // X.InterfaceC6009Dts
    public final void AQS() {
    }

    private void A00() {
        Timeline c5587DlE = new C5587DlE(this.A08, this.A00, this.A05, this.A03);
        if (this.A04) {
            c5587DlE = new Du2(c5587DlE, this);
        }
        A0A(c5587DlE);
    }

    @Override // X.AbstractC6011Dtu
    public final void A0C(CXB cxb) {
        this.A01 = cxb;
        InterfaceC5460Div interfaceC5460Div = this.A0A;
        interfaceC5460Div.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        E6Y e6y = super.A00;
        C1G.A05(e6y);
        interfaceC5460Div.Ae4(looperMyLooper, e6y);
        A00();
    }

    @Override // X.InterfaceC6009Dts
    public final C5704Dnm AHb() {
        return this.A08;
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        C5427DiO c5427DiO = (C5427DiO) interfaceC6006Dtp;
        if (c5427DiO.A0E) {
            for (C5426DiN c5426DiN : c5427DiO.A0H) {
                c5426DiN.A09();
            }
        }
        c5427DiO.A0T.A01(c5427DiO);
        c5427DiO.A0M.removeCallbacksAndMessages(null);
        c5427DiO.A05 = null;
        c5427DiO.A0F = true;
    }

    public C5429DiQ(C5704Dnm c5704Dnm, CXN cxn, InterfaceC5530Dk7 interfaceC5530Dk7, InterfaceC5334DgV interfaceC5334DgV, Supplier supplier, int i) {
        C5568Dkm c5568Dkm = c5704Dnm.A03;
        c5568Dkm.getClass();
        this.A07 = c5568Dkm;
        this.A08 = c5704Dnm;
        this.A09 = cxn;
        this.A0B = interfaceC5530Dk7;
        this.A0A = InterfaceC5460Div.A00;
        this.A0C = interfaceC5334DgV;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = supplier;
    }

    @Override // X.InterfaceC5539DkG
    public final void AW0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }
}
