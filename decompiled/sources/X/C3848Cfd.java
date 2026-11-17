package X;

import android.content.Context;

/* renamed from: X.Cfd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3848Cfd {
    public final InterfaceC3723CdM A00;
    public final boolean A01;

    public final void A00(GNU gnu) {
        boolean z = this.A01;
        String strA00 = AbstractC7606F5t.A00(26);
        if (z) {
            GNN.A06(strA00, "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.A00.AcV(new Ce4(Ce5.DEFAULT, gnu));
        } catch (Throwable unused) {
            GNN.A06(strA00, "logging failed.");
        }
    }

    public C3848Cfd(Context context) {
        try {
            C3847Cfc.A01(context);
            this.A00 = C3847Cfc.A00().A02(CfH.A01).AM1(new Ce6("proto"), new InterfaceC3914Cgs() { // from class: X.CgS
                @Override // X.InterfaceC3914Cgs
                public final Object apply(Object obj) {
                    return ((GIF) obj).A0C();
                }
            }, "PLAY_BILLING_LIBRARY");
        } catch (Throwable unused) {
            this.A01 = true;
        }
    }
}
