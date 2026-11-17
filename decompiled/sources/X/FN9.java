package X;

/* loaded from: classes6.dex */
public final class FN9 implements FOG {
    public final /* synthetic */ C7968FMz A00;
    public final /* synthetic */ FOG A01;

    public FN9(C7968FMz c7968FMz, FOG fog) {
        this.A01 = fog;
        this.A00 = c7968FMz;
    }

    @Override // X.FOG
    public final void onResponse(Huk huk) {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz.A0F.getAndSet(huk) != huk) {
            try {
                c7968FMz.A0E.set(huk.A00);
                c7968FMz.A0D.set(c7968FMz.A0A.now());
            } finally {
                this.A01.onResponse(huk);
            }
        }
    }
}
