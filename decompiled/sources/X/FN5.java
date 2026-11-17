package X;

/* loaded from: classes6.dex */
public final class FN5 implements FOH {
    public final /* synthetic */ C7968FMz A00;
    public final /* synthetic */ FOH A01;
    public final /* synthetic */ FNA A02;

    public FN5(C7968FMz c7968FMz, FOH foh, FNA fna) {
        this.A01 = foh;
        this.A02 = fna;
        this.A00 = c7968FMz;
    }

    @Override // X.FOH
    public final void onRenderSurface(int i) {
        FNA fna;
        String strA00;
        FNA fna2;
        String strA002;
        FNA fna3;
        String strA003;
        FNA fna4;
        String strA004;
        String strA005 = C60N.A00(97);
        try {
            this.A01.onRenderSurface(i);
            C7968FMz c7968FMz = this.A00;
            HoB hoB = c7968FMz.A0E.get();
            if (hoB == null) {
                throw C60O.A0i("Fetch summary is missing.");
            }
            HoB hoB2 = hoB;
            int i2 = hoB2.A00;
            switch (i) {
                case 1:
                    fna3 = this.A02;
                    strA003 = C7968FMz.A00("initial_render_start", i2);
                    fna3.markerPoint(strA003);
                    return;
                case 2:
                    fna4 = this.A02;
                    strA004 = C7968FMz.A00("initial_render_end", i2);
                    fna4.markerPoint(strA004);
                    C7968FMz.A01(c7968FMz);
                    return;
                case 3:
                    FNA fna5 = this.A02;
                    fna5.markerPoint(C7968FMz.A00("initial_render_data_end", i2));
                    if (c7968FMz.A00 == null) {
                        fna5.A5f(0L, "bloks_query", true, c7968FMz.A0A.now());
                        return;
                    }
                    return;
                case 4:
                case 8:
                case 10:
                default:
                    return;
                case 5:
                    Huk huk = c7968FMz.A0F.get();
                    this.A02.fail(huk instanceof Hw6 ? ((Hw6) huk).A00.getMessage() : "Bloks Request Error.");
                    return;
                case 6:
                    fna3 = this.A02;
                    strA003 = C7968FMz.A00(strA005, i2);
                    fna3.markerPoint(strA003);
                    return;
                case 7:
                    fna4 = this.A02;
                    strA004 = C7968FMz.A00("render_end", i2);
                    fna4.markerPoint(strA004);
                    C7968FMz.A01(c7968FMz);
                    return;
                case 9:
                    FNA fna6 = this.A02;
                    fna6.markerPoint(C7968FMz.A00("render_data_end", i2));
                    C7968FMz.A02(c7968FMz, fna6, hoB2);
                    return;
                case 11:
                    fna3 = this.A02;
                    strA003 = C7968FMz.A00("render_load_action_start", i2);
                    fna3.markerPoint(strA003);
                    return;
                case 12:
                    fna3 = this.A02;
                    strA003 = C7968FMz.A00("stream_on_load_actions_start", i2);
                    fna3.markerPoint(strA003);
                    return;
                case 13:
                    fna3 = this.A02;
                    strA003 = C7968FMz.A00("stream_on_load_actions_end", i2);
                    fna3.markerPoint(strA003);
                    return;
            }
        } catch (Throwable th) {
            C7968FMz c7968FMz2 = this.A00;
            HoB hoB3 = c7968FMz2.A0E.get();
            if (hoB3 == null) {
                throw C60O.A0i("Fetch summary is missing.");
            }
            HoB hoB4 = hoB3;
            int i3 = hoB4.A00;
            switch (i) {
                case 1:
                    fna = this.A02;
                    strA00 = C7968FMz.A00("initial_render_start", i3);
                    fna.markerPoint(strA00);
                    throw th;
                case 2:
                    fna2 = this.A02;
                    strA002 = C7968FMz.A00("initial_render_end", i3);
                    fna2.markerPoint(strA002);
                    C7968FMz.A01(c7968FMz2);
                    throw th;
                case 3:
                    FNA fna7 = this.A02;
                    fna7.markerPoint(C7968FMz.A00("initial_render_data_end", i3));
                    if (c7968FMz2.A00 == null) {
                        fna7.A5f(0L, "bloks_query", true, c7968FMz2.A0A.now());
                        throw th;
                    }
                case 4:
                case 8:
                case 10:
                default:
                    throw th;
                case 5:
                    Huk huk2 = c7968FMz2.A0F.get();
                    this.A02.fail(huk2 instanceof Hw6 ? ((Hw6) huk2).A00.getMessage() : "Bloks Request Error.");
                    throw th;
                case 6:
                    fna = this.A02;
                    strA00 = C7968FMz.A00(strA005, i3);
                    fna.markerPoint(strA00);
                    throw th;
                case 7:
                    fna2 = this.A02;
                    strA002 = C7968FMz.A00("render_end", i3);
                    fna2.markerPoint(strA002);
                    C7968FMz.A01(c7968FMz2);
                    throw th;
                case 9:
                    FNA fna8 = this.A02;
                    fna8.markerPoint(C7968FMz.A00("render_data_end", i3));
                    C7968FMz.A02(c7968FMz2, fna8, hoB4);
                    throw th;
                case 11:
                    fna = this.A02;
                    strA00 = C7968FMz.A00("render_load_action_start", i3);
                    fna.markerPoint(strA00);
                    throw th;
                case 12:
                    fna = this.A02;
                    strA00 = C7968FMz.A00("stream_on_load_actions_start", i3);
                    fna.markerPoint(strA00);
                    throw th;
                case 13:
                    fna = this.A02;
                    strA00 = C7968FMz.A00("stream_on_load_actions_end", i3);
                    fna.markerPoint(strA00);
                    throw th;
            }
        }
    }
}
