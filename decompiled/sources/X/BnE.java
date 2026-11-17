package X;

import android.hardware.camera2.CaptureResult;

/* loaded from: classes5.dex */
public final class BnE implements InterfaceC2861BnK {
    public final long A00;
    public final InterfaceC2861BnK A01;
    public final BhZ A02;

    public BnE(InterfaceC2861BnK interfaceC2861BnK, BhZ bhZ) {
        this.A01 = interfaceC2861BnK;
        this.A02 = bhZ;
        this.A00 = -1L;
    }

    @Override // X.InterfaceC2861BnK
    public final BnG ACG() {
        InterfaceC2861BnK interfaceC2861BnK = this.A01;
        return interfaceC2861BnK != null ? interfaceC2861BnK.ACG() : BnG.UNKNOWN;
    }

    @Override // X.InterfaceC2861BnK
    public final EnumC2859BnF ACH() {
        InterfaceC2861BnK interfaceC2861BnK = this.A01;
        return interfaceC2861BnK != null ? interfaceC2861BnK.ACH() : EnumC2859BnF.UNKNOWN;
    }

    @Override // X.InterfaceC2861BnK
    public final EnumC2860BnH ACg() {
        InterfaceC2861BnK interfaceC2861BnK = this.A01;
        return interfaceC2861BnK != null ? interfaceC2861BnK.ACg() : EnumC2860BnH.UNKNOWN;
    }

    @Override // X.InterfaceC2861BnK
    public final /* synthetic */ CaptureResult ADS() {
        return null;
    }

    @Override // X.InterfaceC2861BnK
    public final Integer AFm() {
        InterfaceC2861BnK interfaceC2861BnK = this.A01;
        return interfaceC2861BnK != null ? interfaceC2861BnK.AFm() : C79.A00;
    }

    @Override // X.InterfaceC2861BnK
    public final BhZ ALU() {
        return this.A02;
    }

    @Override // X.InterfaceC2861BnK
    public final long getTimestamp() {
        InterfaceC2861BnK interfaceC2861BnK = this.A01;
        if (interfaceC2861BnK != null) {
            return interfaceC2861BnK.getTimestamp();
        }
        long j = this.A00;
        if (j == -1) {
            throw C3cG.A0Q("No timestamp is available.");
        }
        return j;
    }

    @Override // X.InterfaceC2861BnK
    public final /* synthetic */ void AY5(C2963BqE c2963BqE) {
        BnJ.A00(this, c2963BqE);
    }

    public BnE(BhZ bhZ, long j) {
        this.A01 = null;
        this.A02 = bhZ;
        this.A00 = j;
    }
}
