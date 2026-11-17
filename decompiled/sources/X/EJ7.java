package X;

import androidx.room.TriggerBasedInvalidationTracker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
/* loaded from: classes5.dex */
public final class EJ7 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EJ7(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ<? super EJ7> htJ) {
        super(htJ);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TriggerBasedInvalidationTracker.A01(null, this.this$0, this, 0);
    }
}
