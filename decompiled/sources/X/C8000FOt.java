package X;

/* renamed from: X.FOt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8000FOt implements FPH {
    public final /* synthetic */ FOX A00;

    public C8000FOt(FOX fox) {
        this.A00 = fox;
    }

    @Override // X.FPH
    public final void ASw() {
        FS7 fs7 = this.A00.A0A;
        if (fs7.A0D) {
            fs7.A0D = false;
        }
    }

    @Override // X.FPH
    public final void AUs() {
    }

    @Override // X.FPH
    public final void AV8() {
    }

    @Override // X.FPH
    public final void AW6() {
        FOX fox = this.A00;
        C8005FOz c8005FOz = fox.A0B;
        if (c8005FOz == null || c8005FOz.A02 != EnumC7946FMb.A03) {
            return;
        }
        fox.A0A.A0D = true;
    }
}
