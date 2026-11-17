package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AcX;
import X.AnonymousClass001;
import X.BTA;
import X.C1257Aft;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1153Acj;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {412}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AnchoredDraggableNode$drag$2<T> extends AbstractC07127nr implements G0W<AcX, InterfaceC1153Acj<T>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0V<G0U<? super C1257Aft, Unit>, HtJ<? super Unit>, Object> $forEachDelta;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/G0U<-LX/Aft;Lkotlin/Unit;>;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;Landroidx/compose/foundation/gestures/AnchoredDraggableNode<TT;>;LX/HtJ<-Landroidx/compose/foundation/gestures/AnchoredDraggableNode$drag$2;>;)V */
    public AnchoredDraggableNode$drag$2(AnchoredDraggableNode anchoredDraggableNode, HtJ htJ, G0V g0v) {
        super(3, htJ);
        this.$forEachDelta = g0v;
        this.this$0 = anchoredDraggableNode;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(AcX acX, Object obj, HtJ<? super Unit> htJ) {
        G0V<G0U<? super C1257Aft, Unit>, HtJ<? super Unit>, Object> g0v = this.$forEachDelta;
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.this$0, htJ, g0v);
        anchoredDraggableNode$drag$2.L$0 = acX;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            G0V<G0U<? super C1257Aft, Unit>, HtJ<? super Unit>, Object> g0v = this.$forEachDelta;
            BTA btaA01 = BTA.A01(obj2, this.this$0, 16);
            this.label = 1;
            if (g0v.invoke(btaA01, this) == enumC10460Hji) {
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
