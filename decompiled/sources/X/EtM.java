package X;

import android.graphics.Path;

/* loaded from: classes5.dex */
public final class EtM extends C06G implements InterfaceC7430Evn {
    public final C7376EtK A00;
    public final C3054BtW A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtM) {
                EtM etM = (EtM) obj;
                if (!C7384Etj.areEqual(this.A00, etM.A00) || !C7384Etj.areEqual(this.A01, etM.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public EtM(C7376EtK c7376EtK, C3054BtW c3054BtW) {
        this.A00 = c7376EtK;
        this.A01 = c3054BtW;
    }

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        AnonymousClass003.A0u(path, c7377EtL);
        c7377EtL.A01(this.A01, new FZG(15, path, c7377EtL.A00(this.A00)));
    }
}
