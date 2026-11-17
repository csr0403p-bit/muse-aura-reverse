package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BLD;
import X.BO7;
import X.C2307BTh;
import X.C8j3;
import X.C8j5;
import X.EnumC10460Hji;
import X.EnumC1108AYu;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1258Afu;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends AbstractC07127nr implements G0V<InterfaceC1258Afu, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $available;
    public final /* synthetic */ BO7 $result;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/ScrollingLogic;LX/BO7;JLX/HtJ<-Landroidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2;>;)V */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, HtJ htJ, BO7 bo7, long j) {
        super(2, htJ);
        this.this$0 = scrollingLogic;
        this.$result = bo7;
        this.$available = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, htJ, this.$result, this.$available);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        BO7 bo7;
        long j;
        ScrollingLogic scrollingLogic2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            scrollingLogic = this.this$0;
            C2307BTh c2307BTh = new C2307BTh(1, obj2, scrollingLogic);
            bo7 = this.$result;
            long j2 = this.$available;
            BLD bld = scrollingLogic.A02;
            j = bo7.element;
            float fA03 = scrollingLogic.A03 == EnumC1108AYu.A02 ? AnonymousClass003.A03(j2) : AnonymousClass004.A00(j2);
            if (scrollingLogic.A08) {
                fA03 *= -1.0f;
            }
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = bo7;
            this.J$0 = j;
            this.label = 1;
            obj = bld.AXo(c2307BTh, this, fA03);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            j = this.J$0;
            bo7 = (BO7) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            Hwg.A00(obj);
        }
        float fA02 = AnonymousClass001.A02(obj);
        float fA00 = ScrollingLogic.A00(scrollingLogic2, fA02, fA02);
        bo7.element = scrollingLogic.A03 == EnumC1108AYu.A02 ? AnonymousClass007.A0A(fA00, C8j5.A03(j)) : AnonymousClass007.A0A(AnonymousClass003.A03(j), fA00);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1258Afu interfaceC1258Afu, HtJ<? super Unit> htJ) {
        return ((ScrollingLogic$doFlingAnimation$2) C8j3.A1E(htJ, interfaceC1258Afu, this)).invokeSuspend(Unit.INSTANCE);
    }
}
