package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.11X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11X extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $alpha$delegate;
    public final /* synthetic */ AOI<Boolean> $expandedState;
    public final /* synthetic */ boolean $isInspecting;
    public final /* synthetic */ C1BO<Float> $scale$delegate;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLX/AOI<Ljava/lang/Boolean;>;Landroidx/compose/runtime/MutableState<LX/15k;>;LX/1BO<Ljava/lang/Float;>;LX/1BO<Ljava/lang/Float;>;)V */
    public C11X(AOI aoi, MutableState mutableState, C1BO c1bo, C1BO c1bo2, boolean z) {
        super(1);
        this.$isInspecting = z;
        this.$expandedState = aoi;
        this.$transformOriginState = mutableState;
        this.$scale$delegate = c1bo;
        this.$alpha$delegate = c1bo2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        float fA01;
        C2av c2av2 = c2av;
        float fA012 = 0.8f;
        float fA013 = 1.0f;
        if (this.$isInspecting) {
            fA01 = 0.8f;
            if (AnonymousClass001.A1X(this.$expandedState.A0A())) {
                fA01 = 1.0f;
            }
        } else {
            fA01 = C1BO.A01(this.$scale$delegate);
        }
        c2av2.AeX(fA01);
        if (!this.$isInspecting) {
            fA012 = C1BO.A01(this.$scale$delegate);
        } else if (AnonymousClass001.A1X(this.$expandedState.A0A())) {
            fA012 = 1.0f;
        }
        c2av2.AeY(fA012);
        if (!this.$isInspecting) {
            fA013 = C1BO.A01(this.$alpha$delegate);
        } else if (!AnonymousClass001.A1X(this.$expandedState.A0A())) {
            fA013 = 0.0f;
        }
        c2av2.Acj(fA013);
        c2av2.Af4(this.$transformOriginState.getValue().A00);
        return Unit.INSTANCE;
    }
}
