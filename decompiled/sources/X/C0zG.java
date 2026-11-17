package X;

import kotlin.Unit;

/* renamed from: X.0zG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0zG extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $thickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0zG(float f, long j) {
        super(1);
        this.$thickness = f;
        this.$color = j;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        AT3 at32 = at3;
        at32.A9X(null, null, at32.Ah4(this.$thickness), 1.0f, 0, 3, this.$color, AnonymousClass005.A0J(0.0f, at32.Ah4(this.$thickness) / 2.0f), AnonymousClass005.A0J(AnonymousClass003.A03(at32.AKb()), at32.Ah4(this.$thickness) / 2.0f));
        return Unit.INSTANCE;
    }
}
