package X;

import kotlin.Unit;

/* renamed from: X.1A7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C1DM $shape;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1A9.A00.A02(this.$interactionSource, this.$colors, bfm2, null, this.$shape, 0.0f, 0.0f, 100663296, 200, this.$enabled, this.$isError);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A7(InterfaceC1072AWd interfaceC1072AWd, C046319x c046319x, C1DM c1dm, boolean z, boolean z2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interfaceC1072AWd;
        this.$colors = c046319x;
        this.$shape = c1dm;
    }
}
