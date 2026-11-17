package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.Cob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4172Cob implements Cv1, InterfaceC4395Cv0 {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final InterfaceC4191CpP A03;
    public final C4247CrJ A04;
    public final /* synthetic */ C4163CoN A05;

    public C4172Cob(InterfaceC4191CpP interfaceC4191CpP, C4247CrJ c4247CrJ, C4163CoN c4163CoN) {
        this.A05 = c4163CoN;
        this.A03 = interfaceC4191CpP;
        this.A04 = c4247CrJ;
    }

    @Override // X.InterfaceC4395Cv0
    public final void AVL(ConnectionResult connectionResult) {
        this.A05.A05.post(new RunnableC4168CoU(connectionResult, this));
    }

    @Override // X.Cv1
    public final void Aj9(ConnectionResult connectionResult) {
        C4164CoO c4164CoO = (C4164CoO) this.A05.A08.get(this.A04);
        if (c4164CoO != null) {
            c4164CoO.A0A(connectionResult);
        }
    }
}
