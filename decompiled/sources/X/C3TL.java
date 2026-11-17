package X;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
/* renamed from: X.3TL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TL<I> extends HzP {
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.A01(this, null, null);
    }

    public C3TL(HtJ<? super C3TL> htJ) {
        super(htJ);
    }
}
