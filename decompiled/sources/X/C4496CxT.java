package X;

import androidx.profileinstaller.ProfileInstallReceiver;

/* renamed from: X.CxT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4496CxT implements InterfaceC4498CxV {
    public final /* synthetic */ ProfileInstallReceiver A00;

    public C4496CxT(ProfileInstallReceiver profileInstallReceiver) {
        this.A00 = profileInstallReceiver;
    }

    @Override // X.InterfaceC4498CxV
    public final void ASX(int i, Object obj) {
        AbstractC4857D9c.A01.ASX(i, obj);
    }

    @Override // X.InterfaceC4498CxV
    public final void AVZ(int i, Object obj) {
        AbstractC4857D9c.A01.AVZ(i, obj);
        this.A00.setResultCode(i);
    }
}
