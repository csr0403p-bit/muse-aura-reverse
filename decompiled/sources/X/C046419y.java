package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.19y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C046419y extends AbstractC7559F3s implements G0U<AWA, Unit> {
    public final /* synthetic */ float $labelProgressValue;
    public final /* synthetic */ MutableState<AWA> $labelSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C046419y(float f, MutableState<AWA> mutableState) {
        super(1);
        this.$labelProgressValue = f;
        this.$labelSize = mutableState;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AWA awa) {
        long j = awa.A00;
        float fA00 = AnonymousClass001.A00(j);
        float f = this.$labelProgressValue;
        float f2 = fA00 * f;
        float fA002 = AWA.A00(j) * f;
        if (AnonymousClass001.A00(this.$labelSize.getValue().A00) != f2 || AWA.A00(this.$labelSize.getValue().A00) != fA002) {
            this.$labelSize.Af8(new AWA(C1Wv.A00(f2, fA002)));
        }
        return Unit.INSTANCE;
    }
}
