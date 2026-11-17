package androidx.compose.material3;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0U;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends AbstractC07127nr implements G0W<C3UX, Float, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<Float, Unit> $settleToDismiss;
    public /* synthetic */ float F$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(G0U<? super Float, Unit> g0u, HtJ<? super ModalBottomSheetKt$ModalBottomSheetContent$4$1> htJ) {
        super(3, htJ);
        this.$settleToDismiss = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$settleToDismiss.invoke(new Float(this.F$0));
        return Unit.INSTANCE;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, Float f, HtJ<? super Unit> htJ) {
        float fA02 = AnonymousClass001.A02(f);
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.$settleToDismiss, htJ);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.F$0 = fA02;
        return modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(Unit.INSTANCE);
    }
}
