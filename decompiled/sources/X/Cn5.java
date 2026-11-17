package X;

import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
public final class Cn5 implements InterfaceC4374CuU {
    public final /* synthetic */ CSE A00;

    public Cn5(CSE cse) {
        this.A00 = cse;
    }

    @Override // X.InterfaceC4374CuU
    public final /* bridge */ /* synthetic */ void AeT(Object obj) {
        Cn6 cn6 = (Cn6) obj;
        Status status = cn6.A00;
        boolean zA1R = BV7.A1R(status.A00);
        CSE cse = this.A00;
        if (zA1R) {
            cse.A02(cn6.A01);
        } else {
            cse.A00.A0F(AbstractC4118CnB.A00(status));
        }
    }
}
