package androidx.compose.animation.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1$1$3 extends AbstractC07127nr implements G0V<Float, HtJ<? super Boolean>, Object> {
    public /* synthetic */ float F$0;
    public int label;

    public InfiniteTransition$run$1$1$3(HtJ<? super InfiniteTransition$run$1$1$3> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(htJ);
        infiniteTransition$run$1$1$3.F$0 = AnonymousClass001.A02(obj);
        return infiniteTransition$run$1$1$3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(AnonymousClass002.A1N((this.F$0 > 0.0f ? 1 : (this.F$0 == 0.0f ? 0 : -1))));
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Boolean> htJ) {
        return ((InfiniteTransition$run$1$1$3) create(Float.valueOf(AnonymousClass001.A02(f)), htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
