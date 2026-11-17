package androidx.compose.material3;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC1064ATs;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.window.BackEvent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {410}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BackEvent $backEvent;
    public final /* synthetic */ AT5<Float, AOW> $predictiveBackProgress;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AT5<Ljava/lang/Float;LX/AOW;>;Landroid/window/BackEvent;LX/HtJ<-Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1;>;)V */
    public ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(BackEvent backEvent, AT5 at5, HtJ htJ) {
        super(2, htJ);
        this.$predictiveBackProgress = at5;
        this.$backEvent = backEvent;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(this.$backEvent, this.$predictiveBackProgress, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$predictiveBackProgress;
            Float fA0u = C8j3.A0u(AbstractC1064ATs.A00.transform(this.$backEvent.getProgress()));
            this.label = 1;
            if (at5.A04(fA0u, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
