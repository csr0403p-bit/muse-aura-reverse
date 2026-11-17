package X;

import kotlin.Unit;

/* renamed from: X.1A8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0dy $interactionSource;
    public final /* synthetic */ boolean $isError;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1A9 c1a9 = C1A9.A00;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            c1a9.A02(this.$interactionSource, this.$colors, bfm2, BRg.A00, C1AH.A00(bfm2, C1AA.A01), 2.0f, 1.0f, 114822144, 0, z, z2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A8(C0dy c0dy, C046319x c046319x, boolean z, boolean z2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = c0dy;
        this.$colors = c046319x;
    }
}
