package X;

import kotlin.Unit;

/* renamed from: X.08S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08S extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $height;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08S(float f, float f2) {
        super(2);
        this.$width = f;
        this.$height = f2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C3Ue.A04(C10G.A0C(BRg.A00, this.$width, this.$height), bfm2, 0);
        }
        return Unit.INSTANCE;
    }
}
