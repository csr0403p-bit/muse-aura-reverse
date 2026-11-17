package X;

import kotlin.Unit;

/* renamed from: X.ASr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1047ASr extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ C1BO<Float> $baseRotation$delegate;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1BO<Integer> $currentRotation$delegate;
    public final /* synthetic */ C1BO<Float> $endAngle$delegate;
    public final /* synthetic */ C1BO<Float> $startAngle$delegate;
    public final /* synthetic */ AaJ $stroke;
    public final /* synthetic */ float $strokeWidth;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        AT3 at32 = at3;
        C7384Etj.A0Y(at32, 0);
        C1BO<Integer> c1bo = this.$currentRotation$delegate;
        HnV hnV = AbstractC1045ASp.A04;
        float fA01 = C8j3.A01(C1BO.A01(this.$endAngle$delegate), C1BO.A01(this.$startAngle$delegate));
        AbstractC1045ASp.A02(at32, this.$stroke, C1BO.A01(this.$startAngle$delegate) + (((C1BO.A02(c1bo) * 216.0f) % 360.0f) - 90.0f) + C1BO.A01(this.$baseRotation$delegate) + (((this.$strokeWidth / (40.0f / 2.0f)) * 57.29578f) / 2.0f), Math.max(fA01, 0.1f), this.$color);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (FJLX/AaJ;LX/1BO<Ljava/lang/Integer;>;LX/1BO<Ljava/lang/Float;>;LX/1BO<Ljava/lang/Float;>;LX/1BO<Ljava/lang/Float;>;)V */
    public C1047ASr(C1BO c1bo, C1BO c1bo2, C1BO c1bo3, C1BO c1bo4, AaJ aaJ, float f, long j) {
        super(1);
        this.$strokeWidth = f;
        this.$color = j;
        this.$stroke = aaJ;
        this.$currentRotation$delegate = c1bo;
        this.$endAngle$delegate = c1bo2;
        this.$startAngle$delegate = c1bo3;
        this.$baseRotation$delegate = c1bo4;
    }
}
