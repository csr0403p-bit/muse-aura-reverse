package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.Abr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1139Abr implements C1BO<ADq> {
    public int A00;
    public final MutableState A01;
    public final int A02;
    public final int A03;

    public final void A00(int i) {
        if (i != this.A00) {
            this.A00 = i;
            int i2 = this.A03;
            int i3 = this.A02;
            int i4 = (i / i2) * i2;
            this.A01.Af8(ATD.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.ADq, java.lang.Object] */
    @Override // X.C1BO
    public final /* bridge */ /* synthetic */ ADq getValue() {
        return this.A01.getValue();
    }

    public C1139Abr(int i, int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
        int i4 = (i / i2) * i2;
        this.A01 = AbstractC1798ArH.A06(ATD.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3));
        this.A00 = i;
    }
}
