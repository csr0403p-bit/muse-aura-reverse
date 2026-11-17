package X;

import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.DhE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5362DhE implements InterfaceC6006Dtp, InterfaceC5229Ddn<DF5> {
    public int A00;
    public boolean A01;
    public byte[] A02;
    public final long A03;
    public final C6154Dwx A04;
    public final C6013Dtw A05;
    public final C5414DiA A06;
    public final InterfaceC5334DgV A07;
    public final C5342Dgl A08;
    public final CXN A09;
    public final C1O A0A;
    public final CXB A0B;
    public final ArrayList<C5363DhF> A0C;

    @Override // X.InterfaceC6006Dtp
    public final void AQR() {
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        DF5 df5 = (DF5) interfaceC5231Ddp;
        DF4 df4 = df5.A03;
        this.A00 = (int) df4.A00;
        byte[] bArr = df5.A00;
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = true;
        long j3 = df5.A01;
        this.A05.A04(this.A04, new C5072DTn(df4.A01, df5.A02, df4.A02, j3, j), null, 1, -1, 0, 0L, this.A03);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcP(long j) {
        int i = 0;
        while (true) {
            ArrayList<C5363DhF> arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return j;
            }
            C5363DhF c5363DhF = arrayList.get(i);
            if (c5363DhF.A00 == 2) {
                c5363DhF.A00 = 1;
            }
            i++;
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcS(InterfaceC6022DuF[] interfaceC6022DuFArr, InterfaceC5441Dic[] interfaceC5441DicArr, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC5441DicArr.length; i++) {
            InterfaceC6022DuF interfaceC6022DuF = interfaceC6022DuFArr[i];
            if (interfaceC6022DuF != null && (interfaceC5441DicArr[i] == null || !zArr[i])) {
                this.A0C.remove(interfaceC6022DuF);
                interfaceC6022DuFArr[i] = null;
            }
            if (interfaceC6022DuFArr[i] == null && interfaceC5441DicArr[i] != null) {
                C5363DhF c5363DhF = new C5363DhF(this);
                this.A0C.add(c5363DhF);
                interfaceC6022DuFArr[i] = c5363DhF;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        if (this.A01) {
            return false;
        }
        C5342Dgl c5342Dgl = this.A08;
        if (c5342Dgl.A00 != null || c5342Dgl.A01 != null) {
            return false;
        }
        C1J c1jCreateDataSource = this.A09.createDataSource();
        CXB cxb = this.A0B;
        if (cxb != null) {
            c1jCreateDataSource.addTransferListener(cxb);
        }
        C1O c1o = this.A0A;
        DF5 df5 = new DF5(c1jCreateDataSource, c1o);
        long jA00 = c5342Dgl.A00(this, df5, this.A07.AHm(1));
        C6013Dtw c6013Dtw = this.A05;
        c6013Dtw.A06(new Du6(new C5072DTn(c1o, df5.A01, jA00), new C5893Dra(this.A04, null, 1, -1, 0, 0L, Util.A0B(this.A03)), c6013Dtw, 0));
        return true;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A01 ? Long.MIN_VALUE : 0L;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        return this.A01 ? Long.MIN_VALUE : 0L;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        return (this.A01 || this.A08.A00 != null) ? Long.MIN_VALUE : 0L;
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        return this.A06;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return AnonymousClass002.A1X(this.A08.A00);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
        DF5 df5 = (DF5) interfaceC5231Ddp;
        DF4 df4 = df5.A03;
        long j2 = df5.A01;
        this.A05.A03(null, new C5072DTn(df4.A01, df5.A02, df4.A02, j2, j), null, 1, -1, 0, 0L, this.A03);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ C5230Ddo ATv(InterfaceC5231Ddp interfaceC5231Ddp, IOException iOException, int i, long j, long j2) {
        C5230Ddo c5230Ddo;
        DF5 df5 = (DF5) interfaceC5231Ddp;
        DF4 df4 = df5.A03;
        C5072DTn c5072DTn = new C5072DTn(df4.A01, df5.A02, df4.A02, df5.A01, j);
        C6154Dwx c6154Dwx = this.A04;
        long j3 = this.A03;
        C5893Dra c5893Dra = new C5893Dra(c6154Dwx, null, 1, -1, 0, 0L, Util.A0B(j3));
        InterfaceC5334DgV interfaceC5334DgV = this.A07;
        long jAJn = interfaceC5334DgV.AJn(new C5335DgW(c5072DTn, c5893Dra, iOException, i));
        if (jAJn == -9223372036854775807L || i >= interfaceC5334DgV.AHm(1)) {
            CNC.A06("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.A01 = true;
            c5230Ddo = C5342Dgl.A03;
        } else {
            c5230Ddo = new C5230Ddo(0, jAJn);
        }
        this.A05.A01(c6154Dwx, c5072DTn, iOException, null, 1, -1, 0, 0L, j3, !(c5230Ddo.A00 == 0));
        return c5230Ddo;
    }

    public C5362DhE(C6154Dwx c6154Dwx, CXN cxn, C1O c1o, CXB cxb, C6013Dtw c6013Dtw, InterfaceC5334DgV interfaceC5334DgV, InterfaceExecutorC5232Ddq interfaceExecutorC5232Ddq, long j) {
        this.A0A = c1o;
        this.A09 = cxn;
        this.A0B = cxb;
        this.A04 = c6154Dwx;
        this.A03 = j;
        this.A07 = interfaceC5334DgV;
        this.A05 = c6013Dtw;
        C5414DiA c5414DiA = C5414DiA.A03;
        this.A06 = new C5414DiA(new C5382DhZ("", c6154Dwx));
        this.A0C = C3cG.A0h();
        this.A08 = interfaceExecutorC5232Ddq != null ? new C5342Dgl(interfaceExecutorC5232Ddq) : new C5342Dgl("SingleSampleMediaPeriod");
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
    }

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        return j;
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        interfaceC5503Djf.AUv(this);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        return -9223372036854775807L;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
    }
}
