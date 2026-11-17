package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.CnR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4125CnR implements InterfaceC4374CuU {
    public final /* synthetic */ CSE A00;

    public C4125CnR(CSE cse) {
        this.A00 = cse;
    }

    @Override // X.InterfaceC4374CuU
    public final /* bridge */ /* synthetic */ void AeT(Object obj) {
        C4126CnS c4126CnS = (C4126CnS) obj;
        Status status = c4126CnS.A00;
        boolean zA1R = BV7.A1R(status.A00);
        CSE cse = this.A00;
        if (zA1R) {
            cse.A02(c4126CnS.A01);
        } else {
            cse.A00.A0F(AbstractC4118CnB.A00(status));
        }
    }
}
