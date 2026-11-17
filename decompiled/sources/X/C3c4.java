package X;

import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3c4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c4 extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3c4(Object obj, C3UX c3ux, C1Pn c1Pn, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.A01 = c1Pn;
        this.A02 = obj;
        this.A00 = c3ux;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                C2av c2av = (C2av) obj;
                C1BO c1bo = (C1BO) this.A00;
                c2av.Acj(c1bo != null ? C1BO.A01(c1bo) : 1.0f);
                C1BO c1bo2 = (C1BO) this.A01;
                c2av.AeX(c1bo2 != null ? C1BO.A01(c1bo2) : 1.0f);
                c2av.AeY(c1bo2 != null ? C1BO.A01(c1bo2) : 1.0f);
                C1BO c1bo3 = (C1BO) this.A02;
                c2av.Af4(c1bo3 != null ? ((C15k) c1bo3.getValue()).A00 : C15k.A01);
                break;
            case 1:
                float fA02 = AnonymousClass001.A02(obj);
                C3UX c3ux = (C3UX) this.A01;
                C1Pn c1Pn = (C1Pn) this.A02;
                AnonymousClass001.A11(new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(c1Pn, null, fA02), c3ux).AO5(new C05513bx(2, this.A00, c1Pn));
                break;
            default:
                AYU ayu = (AYU) obj;
                boolean zAOh = ((C3TF) this.A01).AOh();
                C3Sp c3Sp = (C3Sp) this.A02;
                AnchoredDraggableState<T> anchoredDraggableState = c3Sp.A01;
                float fAYD = zAOh ? ((C3Sn) anchoredDraggableState.A06.getValue()).AYD(c3Sp.A01.A0A.getValue()) : anchoredDraggableState.A02();
                EnumC1108AYu enumC1108AYu = c3Sp.A00;
                float f = enumC1108AYu == EnumC1108AYu.A02 ? fAYD : 0.0f;
                if (enumC1108AYu != EnumC1108AYu.A03) {
                    fAYD = 0.0f;
                }
                ayu.A0A((AZE) this.A00, 0.0f, Ab3.A01(f), Ab3.A01(fAYD));
                break;
        }
        return Unit.INSTANCE;
    }
}
