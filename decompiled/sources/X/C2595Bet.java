package X;

import android.util.Size;

/* renamed from: X.Bet, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2595Bet implements BgN, Bg5 {
    public final C2582Bee A00;

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    @Override // X.BgN
    public final /* bridge */ /* synthetic */ BfN AMK() {
        return new C2594Bes(C2584Beg.A02(this.A00));
    }

    @Override // X.Bg5
    public final /* bridge */ /* synthetic */ void Aex(int i) {
        BV6.A11(InterfaceC2551Bdc.A09, this.A00, i);
    }

    public C2595Bet(C2582Bee c2582Bee) {
        this.A00 = c2582Bee;
        if (!c2582Bee.A00.containsKey(C2594Bes.A03)) {
            throw C60O.A0i("VideoOutput is required");
        }
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582Bee.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(Bf9.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.A00.ANl(BfN.A01, EnumC2489BcG.VIDEO_CAPTURE);
        C2582Bee c2582Bee2 = this.A00;
        c2582Bee2.ANl(abstractC2531BdI, Bf9.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        try {
            if (c2582Bee2.Abk(abstractC2531BdI2) != null) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        BV8.A1F(abstractC2531BdI2, c2582Bee2, Bf9.class);
    }

    @Override // X.Bg5
    public final /* bridge */ /* synthetic */ void Aew(Size size) {
        throw C8j3.A18("setTargetResolution is not supported.");
    }
}
