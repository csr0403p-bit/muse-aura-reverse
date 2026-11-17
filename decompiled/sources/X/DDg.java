package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DDg implements DDj {
    public List<? extends DDj> A00 = C3cG.A0h();
    public final CXO A01 = new C4894DDn(this);
    public final boolean A02;

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
        C7384Etj.A0Y(dek, 0);
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).ATL(dek, j, j2, j3);
        }
    }

    @Override // X.DDj
    public final void AWi(IOException iOException) {
        C7384Etj.A0Y(iOException, 0);
        if (this.A02) {
            Iterator itA00 = A00(this);
            while (itA00.hasNext()) {
                ((DDj) itA00.next()).AWi(iOException);
            }
        } else {
            synchronized (this) {
                Iterator itA002 = A00(this);
                while (itA002.hasNext()) {
                    ((DDj) itA002.next()).AWi(iOException);
                }
            }
        }
    }

    @Override // X.DDj
    public final void AdN(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AdN(str);
        }
    }

    public static Iterator A00(DDg dDg) {
        return dDg.A00.iterator();
    }

    public DDg(boolean z) {
        this.A02 = z;
    }

    public final void A01(List<? extends DDj> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (DDj dDj : list) {
            if (dDj != null) {
                arrayListA0h.add(dDj);
            }
        }
        this.A00 = arrayListA0h;
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        AnonymousClass003.A0u(c1j, c1o);
        if (this.A02) {
            Iterator itA00 = A00(this);
            while (itA00.hasNext()) {
                ((CXB) itA00.next()).AS2(c1j, c1o, i, z);
            }
        } else {
            synchronized (this) {
                Iterator itA002 = A00(this);
                while (itA002.hasNext()) {
                    ((DDj) itA002.next()).AS2(c1j, c1o, i, z);
                }
            }
        }
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).ATM(j, j2);
        }
    }

    @Override // X.DDj
    public final void AVB() {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AVB();
        }
    }

    @Override // X.DDj
    public final void AWg() {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AWg();
        }
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        AnonymousClass003.A0u(c1j, c1o);
        if (this.A02) {
            Iterator itA00 = A00(this);
            while (itA00.hasNext()) {
                ((CXB) itA00.next()).AWh(c1j, c1o, z);
            }
        } else {
            synchronized (this) {
                Iterator itA002 = A00(this);
                while (itA002.hasNext()) {
                    ((DDj) itA002.next()).AWh(c1j, c1o, z);
                }
            }
        }
    }

    @Override // X.InterfaceC4897DDq
    public final void AWj(String str, Object obj) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((InterfaceC4897DDq) itA00.next()).AWj(str, obj);
        }
    }

    @Override // X.DDj
    public final void AWl(C1O c1o, DEK dek) {
        AnonymousClass003.A0u(c1o, dek);
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AWl(c1o, dek);
        }
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
        AnonymousClass003.A0u(c1j, c1o);
        if (this.A02) {
            Iterator itA00 = A00(this);
            while (itA00.hasNext()) {
                ((CXB) itA00.next()).AWm(c1j, c1o, z);
            }
        } else {
            synchronized (this) {
                Iterator itA002 = A00(this);
                while (itA002.hasNext()) {
                    ((DDj) itA002.next()).AWm(c1j, c1o, z);
                }
            }
        }
    }

    @Override // X.DDj
    public final void AdA(long j) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AdA(j);
        }
    }

    @Override // X.DDj
    public final void AdZ(boolean z) {
        Iterator itA00 = A00(this);
        while (itA00.hasNext()) {
            ((DDj) itA00.next()).AdZ(z);
        }
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}
