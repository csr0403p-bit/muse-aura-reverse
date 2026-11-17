package X;

import java.util.List;

/* renamed from: X.9uF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9uF implements C9uE {
    public final C9uE A00;

    public C9uF(C9uE c9uE) {
        C7384Etj.A0Y(c9uE, 0);
        this.A00 = c9uE;
    }

    public final boolean equals(Object obj) {
        C9uE c9uE;
        BO5 bo5ADh;
        C9uF c9uF;
        if (obj == null) {
            return false;
        }
        C9uE c9uE2 = this.A00;
        C9uE c9uE3 = null;
        if ((obj instanceof C9uF) && (c9uF = (C9uF) obj) != null) {
            c9uE3 = c9uF.A00;
        }
        if (!c9uE2.equals(c9uE3)) {
            return false;
        }
        BO5 bo5ADh2 = c9uE2.ADh();
        if ((bo5ADh2 instanceof C9uG) && (obj instanceof C9uE) && (c9uE = (C9uE) obj) != null && (bo5ADh = c9uE.ADh()) != null && (bo5ADh instanceof C9uG)) {
            return C9uT.A01((C9uG) bo5ADh2).equals(C9uT.A01((C9uG) bo5ADh));
        }
        return false;
    }

    @Override // X.C9uE
    public final List<C07107nn> ACU() {
        return this.A00.ACU();
    }

    @Override // X.C9uE
    public final BO5 ADh() {
        return this.A00.ADh();
    }

    @Override // X.C9uE
    public final boolean AOi() {
        return this.A00.AOi();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C8j3.A14(this.A00, C60O.A0x("KTypeWrapper: "));
    }

    @Override // X.InterfaceC7518Eyt
    public final List getAnnotations() {
        throw F60.createAndThrow();
    }
}
