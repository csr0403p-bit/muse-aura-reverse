package androidx.compose.material3.internal;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3Sn;
import X.C3T8;
import X.C3T9;
import X.C3TM;
import X.C3TN;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2<T> extends AbstractC07127nr implements G0W<C3TN, C3Sn<T>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0V<C3TM, HtJ<? super Unit>, Object> $block;
    public int label;
    public final /* synthetic */ C3T8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3T8;LX/G0V<-LX/3TM;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Landroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$drag$2;>;)V */
    public AnchoredDraggableState$draggableState$1$drag$2(C3T8 c3t8, HtJ htJ, G0V g0v) {
        super(3, htJ);
        this.this$0 = c3t8;
        this.$block = g0v;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C3TN c3tn, Object obj, HtJ<? super Unit> htJ) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, htJ, this.$block).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3T9 c3t9 = this.this$0.A00;
            G0V<C3TM, HtJ<? super Unit>, Object> g0v = this.$block;
            this.label = 1;
            if (g0v.invoke(c3t9, this) == enumC10460Hji) {
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
