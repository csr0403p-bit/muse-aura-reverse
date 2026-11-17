package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AcX;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1153Acj;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$snapTo$2<T> extends AbstractC07127nr implements G2j<AcX, InterfaceC1153Acj<T>, T, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public AnchoredDraggableKt$snapTo$2(HtJ<? super AnchoredDraggableKt$snapTo$2> htJ) {
        super(4, htJ);
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(AcX acX, Object obj, Object obj2, HtJ<? super Unit> htJ) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(htJ);
        anchoredDraggableKt$snapTo$2.L$0 = acX;
        anchoredDraggableKt$snapTo$2.L$1 = obj;
        anchoredDraggableKt$snapTo$2.L$2 = obj2;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AcX acX = (AcX) this.L$0;
        float fAYD = ((InterfaceC1153Acj) this.L$1).AYD(this.L$2);
        if (!Float.isNaN(fAYD)) {
            acX.A9C(fAYD, 0.0f);
        }
        return Unit.INSTANCE;
    }
}
