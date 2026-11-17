package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class BfH implements BgD {
    public final Bb2 A00;

    public BfH(Context context) {
        this.A00 = Bb2.A01(context);
    }

    @Override // X.BgD
    public final InterfaceC2585Beh ADs(EnumC2489BcG enumC2489BcG, int i) {
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        BgX bgX = new BgX();
        int iOrdinal = enumC2489BcG.ordinal();
        int i2 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 3) {
                i2 = 3;
            }
        } else if (i == 2) {
            i2 = 5;
        }
        bgX.A04.A00 = i2;
        c2582BeeA00.ANl(BfN.A03, bgX.A01());
        c2582BeeA00.ANl(BfN.A06, C2642BgR.A00);
        C2645Bgc c2645Bgc = new C2645Bgc();
        int i3 = 2;
        if (iOrdinal != 0) {
            i3 = iOrdinal != 3 ? 1 : 3;
        } else if (i == 2) {
            i3 = 5;
        }
        c2645Bgc.A00 = i3;
        c2582BeeA00.ANl(BfN.A02, c2645Bgc.A01());
        c2582BeeA00.ANl(BfN.A00, enumC2489BcG == EnumC2489BcG.IMAGE_CAPTURE ? BgV.A01 : BgW.A00);
        if (enumC2489BcG == EnumC2489BcG.PREVIEW) {
            Bb2 bb2 = this.A00;
            if (bb2.A03 == null) {
                bb2.A03 = Bb2.A00(bb2);
            }
            c2582BeeA00.ANl(InterfaceC2551Bdc.A03, bb2.A03);
        }
        BV6.A11(InterfaceC2551Bdc.A09, c2582BeeA00, this.A00.A02(true).getRotation());
        if (enumC2489BcG == EnumC2489BcG.VIDEO_CAPTURE || enumC2489BcG == EnumC2489BcG.STREAM_SHARING) {
            c2582BeeA00.ANl(BfN.A0A, true);
        }
        return C2584Beg.A02(c2582BeeA00);
    }
}
