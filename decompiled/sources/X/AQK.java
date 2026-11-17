package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AQK extends AbstractC1026AQk {
    public final AQU A00;
    public final MutableState A01;
    public final MutableState A02;

    @Override // X.AbstractC1010APl
    public final AaC A02() {
        return (AaC) this.A01.getValue();
    }

    @Override // X.AbstractC1010APl
    public final boolean A04() {
        return true;
    }

    public AQK(APe aPe, AQU aqu, AaC aaC) {
        this.A00 = aqu;
        AGE age = AGE.A00;
        this.A02 = C3cG.A08(age, aPe);
        this.A01 = C3cG.A08(age, aaC);
    }
}
