package X;

/* loaded from: classes4.dex */
public final class AQ1<S> extends AQX {
    public long A00;
    public C0995ANh<S> A01;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<TS;>.DeferredAnimation<LX/BL4;LX/ARY;>; */
    public AOS A02;
    public C1BO<? extends InterfaceC2264BNd> A03;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        long jA0R;
        AZE azeAQW = c3tg.AQW(j);
        if (axy.AOh()) {
            jA0R = C8j3.A0R(azeAQW.A01, azeAQW.A00);
        } else {
            AOS aos = this.A02;
            long jA0R2 = C8j3.A0R(azeAQW.A01, azeAQW.A00);
            jA0R = jA0R2;
            if (aos != null) {
                AOT aotA00 = aos.A00(new C2329BUd(this, jA0R2, 0), new C2329BUd(this, jA0R2, 1));
                this.A01.A00 = aotA00;
                jA0R = ((BL4) aotA00.getValue()).A00;
                jA0R2 = ((BL4) aotA00.getValue()).A00;
            }
            this.A00 = jA0R2;
        }
        return AXY.A01(axy, new C2337BUl(this, azeAQW, 0, jA0R), (int) (jA0R >> 32), (int) (jA0R & 4294967295L));
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A00 = ANR.A00;
    }
}
