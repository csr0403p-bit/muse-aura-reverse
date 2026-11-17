package androidx.compose.foundation.gestures;

import X.AWx;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3TI;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {332}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableNode$onDragStarted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $startedPosition;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C3TI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3TI;JLX/HtJ<-Landroidx/compose/foundation/gestures/DraggableNode$onDragStarted$1;>;)V */
    public DraggableNode$onDragStarted$1(C3TI c3ti, HtJ htJ, long j) {
        super(2, htJ);
        this.this$0 = c3ti;
        this.$startedPosition = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, htJ, this.$startedPosition);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((DraggableNode$onDragStarted$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            G0W<? super C3UX, ? super AWx, ? super HtJ<? super Unit>, ? extends Object> g0w = this.this$0.A02;
            AWx aWx = new AWx(this.$startedPosition);
            this.label = 1;
            if (g0w.invoke(obj2, aWx, this) == enumC10460Hji) {
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
}
