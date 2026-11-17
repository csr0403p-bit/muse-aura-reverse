package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.Apo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1751Apo implements C1Ny {
    public final MutableState A00;
    public final String A01;

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        return ((C1753Apq) this.A00.getValue()).A00;
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        return ((C1753Apq) this.A00.getValue()).A01;
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        return ((C1753Apq) this.A00.getValue()).A02;
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        return ((C1753Apq) this.A00.getValue()).A03;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1751Apo) {
            return C7384Etj.areEqual(this.A00.getValue(), ((C1751Apo) obj).A00.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C1751Apo(C1753Apq c1753Apq, String str) {
        this.A01 = str;
        this.A00 = AbstractC1798ArH.A06(c1753Apq);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append("(left=");
        MutableState mutableState = this.A00;
        sbA0w.append(((C1753Apq) mutableState.getValue()).A01);
        sbA0w.append(", top=");
        sbA0w.append(((C1753Apq) mutableState.getValue()).A03);
        sbA0w.append(", right=");
        sbA0w.append(((C1753Apq) mutableState.getValue()).A02);
        sbA0w.append(", bottom=");
        return C8j5.A0X(sbA0w, ((C1753Apq) mutableState.getValue()).A00);
    }
}
