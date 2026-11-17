package androidx.compose.ui.scrollcapture;

import X.AWx;
import X.AbstractC07127nr;
import X.AbstractC1578Alt;
import X.AbstractC1671Anw;
import X.AlP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Ao7;
import X.C3cG;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends AbstractC07127nr implements G0V<Float, HtJ<? super Float>, Object> {
    public /* synthetic */ float F$0;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, HtJ<? super ComposeScrollCaptureCallback$scrollTracker$1> htJ) {
        super(2, htJ);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, htJ);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = AnonymousClass001.A02(obj);
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            float f = this.F$0;
            G0V g0v = (G0V) AlP.A01(this.this$0.A04.A04, AbstractC1578Alt.A0M);
            if (g0v == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            z = ((Ao7) this.this$0.A04.A04.A01(AbstractC1671Anw.A0i)).A02;
            if (z) {
                f = -f;
            }
            AWx aWxA0C = AWx.A0C(AnonymousClass002.A0F() << 32, C8j3.A0P(f) & 4294967295L);
            this.Z$0 = z;
            this.label = 1;
            obj = g0v.invoke(aWxA0C, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            z = this.Z$0;
            Hwg.A00(obj);
        }
        float fA01 = AnonymousClass001.A01(((AWx) obj).A00, 4294967295L);
        if (z) {
            fA01 = -fA01;
        }
        return C8j3.A0u(fA01);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Float> htJ) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(AnonymousClass001.A02(f)), htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
