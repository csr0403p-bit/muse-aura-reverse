package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DKa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4983DKa implements DKb {
    public static final C4985DKd A01 = new C4985DKd();
    public static volatile C4983DKa A02;
    public final Set<DKb> A00 = C3cG.A0k();

    @Override // X.DKb
    public final void AU0(int i, int i2, String str, double d) {
        C7384Etj.A0Y(str, 2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU0(i, i2, str, d);
            }
        }
    }

    @Override // X.DKb
    public final void AU1(int i, int i2, String str, int i3) {
        C7384Etj.A0Y(str, 2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU1(i, i2, str, i3);
            }
        }
    }

    @Override // X.DKb
    public final void AU2(int i, int i2, String str, long j) {
        C7384Etj.A0Y(str, 2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU2(i, i2, str, j);
            }
        }
    }

    @Override // X.DKb
    public final void AU3(int i, int i2, String str, String str2) {
        AnonymousClass002.A1B(str, 2, str2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU3(i, i2, str, str2);
            }
        }
    }

    @Override // X.DKb
    public final void AU4(int i, int i2, String str, boolean z) {
        C7384Etj.A0Y(str, 2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU4(i, i2, str, z);
            }
        }
    }

    @Override // X.DKb
    public final void AU5(int i, int i2, String str, String[] strArr) {
        C7384Etj.A0Y(strArr, 3);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU5(i, i2, str, strArr);
            }
        }
    }

    @Override // X.DKb
    public final void AU7(String str, int i, int i2, String str2, long j) {
        C7384Etj.A0Y(str, 2);
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU7(str, i, i2, str2, j);
            }
        }
    }

    private final Set<DKb> A00() {
        Set<DKb> set = this.A00;
        synchronized (set) {
            if (set.isEmpty()) {
                return null;
            }
            return AbstractC0878AGe.A0g(set);
        }
    }

    @Override // X.DKb
    public final void AU6(int i, int i2, long j, long j2, short s) {
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU6(i, i2, j, j2, s);
            }
        }
    }

    @Override // X.DKb
    public final void AU8(int i, int i2, long j) {
        Set<DKb> setA00 = A00();
        if (setA00 != null) {
            Iterator<DKb> it = setA00.iterator();
            while (it.hasNext()) {
                it.next().AU8(i, i2, j);
            }
        }
    }
}
