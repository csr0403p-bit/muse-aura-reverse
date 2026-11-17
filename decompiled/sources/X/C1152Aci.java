package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1414}, m = "animateToWithDecay", v = 1)
/* renamed from: X.Aci, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1152Aci<T> extends HzP {
    public float F$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.A00(null, null, null, null, this, 0.0f);
    }

    public C1152Aci(HtJ<? super C1152Aci> htJ) {
        super(htJ);
    }
}
