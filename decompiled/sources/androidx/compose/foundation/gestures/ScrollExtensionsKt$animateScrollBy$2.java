package androidx.compose.foundation.gestures;

import X.AOc;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BTC;
import X.C1051ASv;
import X.C3Q0;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends AbstractC07127nr implements G0V<C3Q0, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AOc<Float> $animationSpec;
    public final /* synthetic */ C1051ASv $previousValue;
    public final /* synthetic */ float $value;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (FLX/AOc<Ljava/lang/Float;>;LX/ASv;LX/HtJ<-Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$2;>;)V */
    public ScrollExtensionsKt$animateScrollBy$2(AOc aOc, HtJ htJ, C1051ASv c1051ASv, float f) {
        super(2, htJ);
        this.$value = f;
        this.$animationSpec = aOc;
        this.$previousValue = c1051ASv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$animationSpec, htJ, this.$previousValue, this.$value);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            float f = this.$value;
            AOc<Float> aOc = this.$animationSpec;
            BTC btc = new BTC(1, this.$previousValue, obj2);
            this.label = 1;
            if (SuspendAnimationKt.A03(aOc, this, btc, 0.0f, f, 0.0f) == enumC10460Hji) {
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

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3Q0 c3q0, HtJ<? super Unit> htJ) {
        return ((ScrollExtensionsKt$animateScrollBy$2) C8j3.A1E(htJ, c3q0, this)).invokeSuspend(Unit.INSTANCE);
    }
}
