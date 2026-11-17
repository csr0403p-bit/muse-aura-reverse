package X;

import android.util.CloseGuard;

/* renamed from: X.Bmn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2844Bmn implements InterfaceC2839Bmi {
    public final CloseGuard A00 = new CloseGuard();

    @Override // X.InterfaceC2839Bmi
    public final void AXU(String str) {
        this.A00.open(str);
    }

    @Override // X.InterfaceC2839Bmi
    public final void AiO() {
        this.A00.warnIfOpen();
    }

    @Override // X.InterfaceC2839Bmi
    public final void close() {
        this.A00.close();
    }
}
