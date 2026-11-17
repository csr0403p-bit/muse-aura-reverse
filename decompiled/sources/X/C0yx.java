package X;

import kotlin.Unit;

/* renamed from: X.0yx, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0yx extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1822Arm $bodyLarge;
    public final /* synthetic */ C1822Arm $bodySmall;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $it;
    public final /* synthetic */ C1BO<B6A> $labelContentColor;
    public final /* synthetic */ float $labelProgressValue;
    public final /* synthetic */ C1BO<B6A> $labelTextStyleColor;
    public final /* synthetic */ boolean $overrideLabelTextStyleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Arm;LX/Arm;FLX/1BO<LX/B6A;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/1BO<LX/B6A;>;)V */
    public C0yx(C1BO c1bo, C1BO c1bo2, C1822Arm c1822Arm, C1822Arm c1822Arm2, G0V g0v, float f, boolean z) {
        super(2);
        this.$bodyLarge = c1822Arm;
        this.$bodySmall = c1822Arm2;
        this.$labelProgressValue = f;
        this.$labelContentColor = c1bo;
        this.$it = g0v;
        this.$overrideLabelTextStyleColor = z;
        this.$labelTextStyleColor = c1bo2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1822Arm c1822ArmA00 = AbstractC1823Arn.A00(this.$bodyLarge, this.$bodySmall, this.$labelProgressValue);
            boolean z = this.$overrideLabelTextStyleColor;
            C1BO<B6A> c1bo = this.$labelTextStyleColor;
            if (z) {
                c1822ArmA00 = C1822Arm.A00(null, c1822ArmA00, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C1BO.A03(c1bo), 0L, 0L, 0L);
            }
            C1822Arm c1822Arm = c1822ArmA00;
            AbstractC046219w.A03(bfm2, c1822Arm, this.$it, 0, C1BO.A03(this.$labelContentColor));
        }
        return Unit.INSTANCE;
    }
}
