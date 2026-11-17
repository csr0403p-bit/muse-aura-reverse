package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1eF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1eF extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $circleDiameter;
    public final /* synthetic */ long $color;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $unfilledColor;
    public final /* synthetic */ boolean $unfilledColorEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;LX/BRg;JZJFFII)V */
    public C1eF(BRg bRg, Function0 function0, float f, float f2, int i, int i2, long j, long j2, boolean z) {
        super(2);
        this.$progress = function0;
        this.$modifier = bRg;
        this.$color = j;
        this.$unfilledColorEnabled = z;
        this.$unfilledColor = j2;
        this.$strokeWidth = f;
        this.$circleDiameter = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Function0<Float> function0 = this.$progress;
        BRg bRg = this.$modifier;
        long j = this.$color;
        boolean z = this.$unfilledColorEnabled;
        AbstractC1045ASp.A01(bfmA0P, bRg, function0, this.$strokeWidth, this.$circleDiameter, AnonymousClass011.A00(this.$$changed), this.$$default, j, this.$unfilledColor, z);
        return Unit.INSTANCE;
    }
}
