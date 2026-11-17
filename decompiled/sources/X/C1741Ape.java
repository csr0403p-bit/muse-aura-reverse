package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.Ape, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1741Ape implements C1Ny {
    public final MutableState A00;
    public final MutableState A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1741Ape) && this.A02 == ((C1741Ape) obj).A02);
    }

    public final void A01(C8497Ff4 c8497Ff4) {
        int i = this.A02;
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        this.A00.Af8(c8496Ff3.A04(i));
        A00(this, c8496Ff3, i);
    }

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        return ((C8345FcJ) this.A00.getValue()).A00;
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        return ((C8345FcJ) this.A00.getValue()).A01;
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        return ((C8345FcJ) this.A00.getValue()).A02;
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        return ((C8345FcJ) this.A00.getValue()).A03;
    }

    public final int hashCode() {
        return this.A02;
    }

    public C1741Ape(int i, String str) {
        this.A02 = i;
        this.A03 = str;
        C8345FcJ c8345FcJ = C8345FcJ.A04;
        AGE age = AGE.A00;
        this.A00 = C3cG.A08(age, c8345FcJ);
        this.A01 = C3cG.A08(age, AnonymousClass001.A0i());
    }

    public static void A00(C1741Ape c1741Ape, C8496Ff3 c8496Ff3, int i) {
        c1741Ape.A01.Af8(Boolean.valueOf(c8496Ff3.A0C(i)));
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A03);
        sbA0w.append('(');
        MutableState mutableState = this.A00;
        sbA0w.append(((C8345FcJ) mutableState.getValue()).A01);
        sbA0w.append(", ");
        sbA0w.append(((C8345FcJ) mutableState.getValue()).A03);
        sbA0w.append(", ");
        sbA0w.append(((C8345FcJ) mutableState.getValue()).A02);
        sbA0w.append(", ");
        return C8j5.A0X(sbA0w, ((C8345FcJ) mutableState.getValue()).A00);
    }
}
