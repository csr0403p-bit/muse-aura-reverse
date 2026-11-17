package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ASs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1048ASs extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ AaJ $stroke;
    public final /* synthetic */ long $unfilledColor;
    public final /* synthetic */ boolean $unfilledColorEnabled;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        AT3 at32 = at3;
        C7384Etj.A0Y(at32, 0);
        float fA04 = AnonymousClass003.A04(this.$progress) * 360.0f;
        if (this.$unfilledColorEnabled) {
            AbstractC1045ASp.A02(at32, this.$stroke, 270.0f, 360.0f, this.$unfilledColor);
        }
        AbstractC1045ASp.A02(at32, this.$stroke, 270.0f, fA04, this.$color);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;ZJLX/AaJ;J)V */
    public C1048ASs(AaJ aaJ, Function0 function0, long j, long j2, boolean z) {
        super(1);
        this.$progress = function0;
        this.$unfilledColorEnabled = z;
        this.$unfilledColor = j;
        this.$stroke = aaJ;
        this.$color = j2;
    }
}
