package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.CpA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4190CpA implements InterfaceC4395Cv0 {
    public final /* synthetic */ AbstractC4160CoH A00;

    public C4190CpA(AbstractC4160CoH abstractC4160CoH) {
        this.A00 = abstractC4160CoH;
    }

    @Override // X.InterfaceC4395Cv0
    public final void AVL(ConnectionResult connectionResult) {
        boolean zA1M = AnonymousClass002.A1M(connectionResult.A01);
        AbstractC4160CoH abstractC4160CoH = this.A00;
        if (zA1M) {
            abstractC4160CoH.AJV(null, ((AbstractC4162CoM) abstractC4160CoH).A01);
            return;
        }
        InterfaceC4459Cwb interfaceC4459Cwb = abstractC4160CoH.A0D;
        if (interfaceC4459Cwb != null) {
            ((C4368CuN) interfaceC4459Cwb).A00.ASN(connectionResult);
        }
    }
}
