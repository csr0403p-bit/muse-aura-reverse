package X;

import android.util.Size;

/* renamed from: X.Bex, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2599Bex implements BgN, Bg5 {
    public final C2582Bee A00;

    public final BfA A00() {
        C2593Beq c2593Beq = new C2593Beq(C2584Beg.A02(this.A00));
        AbstractC2552Bdd.A00(c2593Beq);
        BfA bfA = new BfA(c2593Beq);
        bfA.A06 = BfA.A07;
        return bfA;
    }

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    @Override // X.BgN
    public final /* bridge */ /* synthetic */ BfN AMK() {
        return new C2593Beq(C2584Beg.A02(this.A00));
    }

    @Override // X.Bg5
    @Deprecated
    public final /* bridge */ /* synthetic */ void Aew(Size size) {
        this.A00.ANl(InterfaceC2551Bdc.A08, size);
    }

    @Override // X.Bg5
    public final /* bridge */ /* synthetic */ void Aex(int i) {
        C2582Bee c2582Bee = this.A00;
        AbstractC2531BdI<Integer> abstractC2531BdI = InterfaceC2551Bdc.A09;
        Integer numValueOf = Integer.valueOf(i);
        c2582Bee.ANl(abstractC2531BdI, numValueOf);
        c2582Bee.ANl(InterfaceC2551Bdc.A00, numValueOf);
    }

    public C2599Bex(C2582Bee c2582Bee) {
        this.A00 = c2582Bee;
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582Bee.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(BfA.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.A00.ANl(BfN.A01, EnumC2489BcG.PREVIEW);
        C2582Bee c2582Bee2 = this.A00;
        c2582Bee2.ANl(abstractC2531BdI, BfA.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        if (c2582Bee2.Abk(abstractC2531BdI2) == null) {
            BV8.A1F(abstractC2531BdI2, c2582Bee2, BfA.class);
        }
        AbstractC2531BdI<Integer> abstractC2531BdI3 = InterfaceC2551Bdc.A04;
        Object objAbk2 = -1;
        try {
            objAbk2 = c2582Bee.Abk(abstractC2531BdI3);
        } catch (IllegalArgumentException unused2) {
        }
        if (AnonymousClass001.A0F(objAbk2) == -1) {
            BV6.A11(abstractC2531BdI3, c2582Bee, 2);
        }
    }

    public C2599Bex() {
        this(C2582Bee.A00());
    }
}
