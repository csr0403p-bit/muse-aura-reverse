package X;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;

/* renamed from: X.3bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05373bj extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05373bj(Object obj, AnchoredDraggableState<T> anchoredDraggableState, G0W<? super C3TN, ? super C3Sn<T>, ? super HtJ<? super Unit>, ? extends Object> g0w, HtJ<? super C05373bj> htJ) {
        super(1, g0w);
        this.$t = htJ;
        this.A02 = obj;
        this.A01 = anchoredDraggableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        if (this.$t == 0) {
            return new C05373bj(this.A02, this.A01, htJ, 0);
        }
        return new C05373bj(this.A02, this.A01, htJ, 1);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C05373bj) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                C20Z c20z = (C20Z) this.A01;
                HrH hrH = HwN.A01;
                Object obj2 = ((C10543Hqv) this.A02).element;
                if (obj2 == hrH) {
                    obj2 = null;
                }
                this.A00 = 1;
                if (c20z.emit(obj2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            ((C10543Hqv) this.A02).element = null;
        } else if (i2 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            Object obj3 = this.A02;
            C05453br c05453br = new C05453br(obj3, 10);
            C05393bl c05393bl = new C05393bl(obj3, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (C3TI) this.A01, (HtJ<? super C05393bl>) 8);
            this.A00 = 1;
            if (AnchoredDraggableKt.A01(this, c05453br, c05393bl) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }
}
