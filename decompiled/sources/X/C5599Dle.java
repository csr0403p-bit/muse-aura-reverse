package X;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.List;

/* renamed from: X.Dle, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5599Dle implements InterfaceC5910Drt {

    @Deprecated
    public long A00;
    public InterfaceC5460Div A01;
    public Dw9 A02;
    public InterfaceC3126Byr<? extends C5580Dky> A05;
    public boolean A07;
    public final CXN A08;
    public final C5353Dgw A09;
    public final DEY A0A;
    public final C5423DiJ A0B;
    public final C5527Dk3 A0C;
    public final DhC A0D;
    public C5092DXa A06 = null;
    public InterfaceC5334DgV A04 = new C5330DgR(-1);
    public InterfaceC5512Djo A03 = new C5502Dje();

    @Override // X.InterfaceC5791Dpa
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5358Dh3 A7u(C5704Dnm c5704Dnm) {
        C5568Dkm c5568Dkm = c5704Dnm.A03;
        c5568Dkm.getClass();
        InterfaceC3126Byr c5571Dkp = this.A05;
        if (c5571Dkp == null) {
            c5571Dkp = new C5571Dkp();
        }
        List<StreamKey> list = c5568Dkm.A07;
        InterfaceC3126Byr c5579Dkx = !list.isEmpty() ? new C5579Dkx(c5571Dkp, list) : c5571Dkp;
        CXN cxn = this.A08;
        DhC dhC = this.A0D;
        InterfaceC5512Djo interfaceC5512Djo = this.A03;
        InterfaceC5460Div interfaceC5460Div = this.A01;
        InterfaceC5334DgV interfaceC5334DgV = this.A04;
        long j = this.A00;
        return new C5358Dh3(c5704Dnm, cxn, interfaceC5460Div, interfaceC5512Djo, interfaceC5334DgV, c5579Dkx, this.A09, this.A06, this.A0A, this.A0B, this.A0C, dhC, null, j, this.A07);
    }

    public final C5358Dh3 A01(C5704Dnm c5704Dnm, C5580Dky c5580Dky) {
        C1G.A07(!c5580Dky.A0S);
        C5608Dln c5608Dln = new C5608Dln(c5704Dnm);
        c5608Dln.A06 = "application/dash+xml";
        if (c5704Dnm.A03 == null) {
            c5608Dln.A00 = Uri.EMPTY;
        }
        C5704Dnm c5704DnmA00 = c5608Dln.A00();
        DhC dhC = this.A0D;
        InterfaceC5512Djo interfaceC5512Djo = this.A03;
        InterfaceC5460Div interfaceC5460Div = this.A01;
        InterfaceC5334DgV interfaceC5334DgV = this.A04;
        long j = this.A00;
        return new C5358Dh3(c5704DnmA00, null, interfaceC5460Div, interfaceC5512Djo, interfaceC5334DgV, null, this.A09, this.A06, this.A0A, this.A0B, this.A0C, dhC, c5580Dky, j, this.A07);
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void AdL(Dw9 dw9) {
        if (dw9 == null) {
            throw BV5.A0Y("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.A02 = dw9;
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void Adg(InterfaceC5334DgV interfaceC5334DgV) {
        if (interfaceC5334DgV == null) {
            throw BV5.A0Y("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.A04 = interfaceC5334DgV;
    }

    public C5599Dle(CXN cxn, InterfaceC5460Div interfaceC5460Div, C5353Dgw c5353Dgw, DEY dey, C5423DiJ c5423DiJ, C5527Dk3 c5527Dk3, DhC dhC) {
        this.A0D = dhC;
        this.A08 = cxn;
        this.A0B = c5423DiJ;
        this.A09 = c5353Dgw;
        this.A0A = dey;
        this.A0C = c5527Dk3;
        this.A01 = interfaceC5460Div == null ? InterfaceC5460Div.A00 : interfaceC5460Div;
        this.A00 = -1L;
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void ABD(boolean z) {
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void ABF(int i) {
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void Aer(InterfaceC5885DrL interfaceC5885DrL) {
    }
}
