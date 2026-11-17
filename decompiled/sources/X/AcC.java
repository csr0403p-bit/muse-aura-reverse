package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {308}, m = "animateDecay", v = 1)
/* loaded from: classes4.dex */
public final class AcC extends HzP {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.A01(null, null, null, this, null, 0.0f);
    }

    public AcC(HtJ<? super AcC> htJ) {
        super(htJ);
    }
}
