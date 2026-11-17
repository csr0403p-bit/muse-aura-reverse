package androidx.activity.compose;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C2194B9z;
import X.F1F;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ComposePredictiveBackHandler$launchNewGesture$1$1 extends AbstractC07127nr implements G0W<C20Z<? super C2194B9z>, Throwable, HtJ<? super Unit>, Object> {
    public final /* synthetic */ F1F $completed;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/F1F;LX/HtJ<-Landroidx/activity/compose/ComposePredictiveBackHandler$launchNewGesture$1$1;>;)V */
    public ComposePredictiveBackHandler$launchNewGesture$1$1(HtJ htJ, F1F f1f) {
        super(3, htJ);
        this.$completed = f1f;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C20Z<? super C2194B9z> c20z, Throwable th, HtJ<? super Unit> htJ) {
        return new ComposePredictiveBackHandler$launchNewGesture$1$1(htJ, this.$completed).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$completed.element = true;
        return Unit.INSTANCE;
    }
}
