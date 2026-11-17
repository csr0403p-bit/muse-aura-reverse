package X;

import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class B0E extends CM9 {
    public final /* synthetic */ B09 A00;
    public final /* synthetic */ Hm1<Typeface> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/Hm1<-Landroid/graphics/Typeface;>;LX/B09;)V */
    public B0E(B09 b09, Hm1 hm1) {
        this.A01 = hm1;
        this.A00 = b09;
    }

    @Override // X.CM9
    public final void A01(int i) {
        Hm1<Typeface> hm1 = this.A01;
        StringBuilder sbA0x = C60O.A0x("Unable to load font ");
        sbA0x.append(this.A00);
        sbA0x.append(" (reason=");
        hm1.A5x(C3cG.A0Q(C8j5.A0X(sbA0x, i)));
    }

    @Override // X.CM9
    public final void A02(Typeface typeface) {
        this.A01.resumeWith(typeface);
    }
}
