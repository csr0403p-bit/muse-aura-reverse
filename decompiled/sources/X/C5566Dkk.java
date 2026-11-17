package X;

import android.net.Uri;
import androidx.media3.common.Timeline;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;

@Deprecated
/* renamed from: X.Dkk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5566Dkk extends AbstractC6011Dtu {
    public CXB A00;
    public final long A01;
    public final C6154Dwx A02;
    public final C5704Dnm A03;
    public final Timeline A04;
    public final CXN A05;
    public final C1O A06;
    public final InterfaceC5334DgV A07;
    public final Supplier<InterfaceExecutorC5232Ddq> A08;

    public C5566Dkk(C5567Dkl c5567Dkl, CXN cxn, InterfaceC5334DgV interfaceC5334DgV, Supplier supplier, long j) {
        this.A05 = cxn;
        this.A01 = j;
        this.A07 = interfaceC5334DgV;
        C5608Dln c5608Dln = new C5608Dln();
        c5608Dln.A00 = Uri.EMPTY;
        Uri uri = c5567Dkl.A02;
        String string = uri.toString();
        string.getClass();
        c5608Dln.A05 = string;
        c5608Dln.A03 = ImmutableList.copyOf((Collection) ImmutableList.of(c5567Dkl));
        c5608Dln.A04 = null;
        C5704Dnm c5704DnmA00 = c5608Dln.A00();
        this.A03 = c5704DnmA00;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        String str = c5567Dkl.A06;
        c6162Dx5A00.A06(str == null ? "text/x-unknown" : str);
        c6162Dx5A00.A0Y = c5567Dkl.A05;
        c6162Dx5A00.A0K = c5567Dkl.A01;
        c6162Dx5A00.A0H = c5567Dkl.A00;
        c6162Dx5A00.A0X = c5567Dkl.A04;
        String str2 = c5567Dkl.A03;
        c6162Dx5A00.A0W = str2 != null ? str2 : null;
        this.A02 = BV6.A0U(c6162Dx5A00);
        this.A06 = new C1O(uri, null, null, Collections.EMPTY_MAP, null, 1, 1, 0L, 0L, -1L);
        this.A04 = new C5587DlE(c5704DnmA00, j, true, false);
        this.A08 = supplier;
    }

    @Override // X.AbstractC6011Dtu
    public final void A0B() {
    }

    @Override // X.InterfaceC6009Dts
    public final void AQS() {
    }

    @Override // X.AbstractC6011Dtu
    public final void A0C(CXB cxb) {
        this.A00 = cxb;
        A0A(this.A04);
    }

    @Override // X.InterfaceC6009Dts
    public final InterfaceC6006Dtp A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        C1O c1o = this.A06;
        CXN cxn = this.A05;
        CXB cxb = this.A00;
        C6154Dwx c6154Dwx = this.A02;
        long j2 = this.A01;
        InterfaceC5334DgV interfaceC5334DgV = this.A07;
        C6013Dtw c6013Dtw = new C6013Dtw(dy6, super.A04.A02, 0);
        Supplier<InterfaceExecutorC5232Ddq> supplier = this.A08;
        return new C5362DhE(c6154Dwx, cxn, c1o, cxb, c6013Dtw, interfaceC5334DgV, supplier != null ? supplier.get() : null, j2);
    }

    @Override // X.InterfaceC6009Dts
    public final C5704Dnm AHb() {
        return this.A03;
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        ((C5362DhE) interfaceC6006Dtp).A08.A01(null);
    }
}
