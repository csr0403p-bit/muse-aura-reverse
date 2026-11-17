package X;

import android.os.PowerManager;

/* renamed from: X.Cl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4058Cl1 implements InterfaceC4069ClG {
    public final AbstractC4063Cl8 A00;
    public final /* synthetic */ C4054Ckx A01;

    public C4058Cl1(AbstractC4063Cl8 abstractC4063Cl8, C4054Ckx c4054Ckx) {
        this.A01 = c4054Ckx;
        this.A00 = abstractC4063Cl8;
    }

    @Override // X.InterfaceC4069ClG
    public final void ATB() {
        PowerManager.WakeLock wakeLock = this.A01.A00;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // X.InterfaceC4069ClG
    public final void AXM(boolean z) {
        C4054Ckx c4054Ckx;
        Cl7 cl7;
        if (!z || (cl7 = (c4054Ckx = this.A01).A07) == null) {
            return;
        }
        this.A00.A02(c4054Ckx.A06, cl7.A02, c4054Ckx.A02, cl7.A01, cl7.A00);
    }
}
