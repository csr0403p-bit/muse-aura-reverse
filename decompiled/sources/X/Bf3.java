package X;

import android.util.Size;

/* loaded from: classes5.dex */
public final class Bf3 implements BgN, Bg5 {
    public final C2582Bee A00;

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    @Override // X.BgN
    public final /* bridge */ /* synthetic */ BfN AMK() {
        return new Bf7(C2584Beg.A02(this.A00));
    }

    @Override // X.Bg5
    @Deprecated
    public final /* bridge */ /* synthetic */ void Aew(Size size) {
        this.A00.ANl(InterfaceC2551Bdc.A08, size);
    }

    @Override // X.Bg5
    public final /* bridge */ /* synthetic */ void Aex(int i) {
        BV6.A11(InterfaceC2551Bdc.A09, this.A00, i);
    }

    public Bf3(C2582Bee c2582Bee) {
        this.A00 = c2582Bee;
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582Bee.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(BfL.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.A00.ANl(BfN.A01, EnumC2489BcG.IMAGE_ANALYSIS);
        C2582Bee c2582Bee2 = this.A00;
        c2582Bee2.ANl(abstractC2531BdI, BfL.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        try {
            if (c2582Bee2.Abk(abstractC2531BdI2) != null) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        BV8.A1F(abstractC2531BdI2, c2582Bee2, BfL.class);
    }

    public Bf3() {
        this(C2582Bee.A00());
    }
}
