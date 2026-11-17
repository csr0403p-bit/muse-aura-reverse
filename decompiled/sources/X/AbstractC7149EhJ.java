package X;

import android.graphics.Bitmap;

/* renamed from: X.EhJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7149EhJ {
    public final InterfaceC7153EhO A00;
    public final AbstractC7151EhM A01;
    public final boolean A02;
    public final boolean A03;

    public AbstractC7149EhJ(AbstractC7151EhM abstractC7151EhM, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(abstractC7151EhM, 0);
        this.A01 = abstractC7151EhM;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = new C7148EhI(z);
    }

    public final AbstractC7046Ees A01(Bitmap.Config config, InterfaceC7173Ehi interfaceC7173Ehi, C7198EiA c7198EiA, String str) {
        if (!c7198EiA.A03) {
            System.nanoTime();
            C7150EhL c7150EhL = new C7150EhL(new EhK(interfaceC7173Ehi, str), this.A03);
            System.nanoTime();
            return c7150EhL;
        }
        EfF efFA00 = this.A01.A00(config, interfaceC7173Ehi.getWidth(), interfaceC7173Ehi.getHeight());
        BV6.A0M(efFA00).eraseColor(0);
        BV6.A0M(efFA00).setHasAlpha(true);
        new C7271Ejw(this.A00.AC4(null, new EhK(interfaceC7173Ehi)), new C7152EhN(), this.A02).A03(0, BV6.A0M(efFA00));
        return new C7066EfD(efFA00, C7070EfR.A03, 0, 0);
    }
}
