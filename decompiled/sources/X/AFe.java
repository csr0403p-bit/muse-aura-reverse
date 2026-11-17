package X;

/* loaded from: classes4.dex */
public final class AFe extends AbstractC1439Aj8 implements InterfaceC1332AhJ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C0dy A03;

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        long j;
        C1423Ais c1423Ais;
        float f;
        c16z.A9O();
        if (this.A02) {
            j = B6A.A01;
            c1423Ais = null;
            f = 0.3f;
        } else {
            if (!this.A01 && !this.A00) {
                return;
            }
            j = B6A.A01;
            c1423Ais = null;
            f = 0.1f;
        }
        ART.A03(c1423Ais, c16z, 0.0f, 122, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f), 0L, c16z.AKb());
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public AFe(C0dy c0dy) {
        this.A03 = c0dy;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        BU2.A0P(this, getCoroutineScope(), 7);
    }
}
