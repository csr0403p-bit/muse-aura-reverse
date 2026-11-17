package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.C1251Afj;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends AbstractC07127nr implements G0V<C1251Afj, HtJ<? super C1251Afj>, Object> {
    public /* synthetic */ long J$0;
    public long J$1;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, HtJ<? super ScrollingLogic$onScrollStopped$performFling$1> htJ) {
        super(2, htJ);
        this.this$0 = scrollingLogic;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, htJ);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((C1251Afj) obj).A00;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C1251Afj c1251Afj, HtJ<? super C1251Afj> htJ) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(new C1251Afj(c1251Afj.A00), htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r5 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3c
            if (r0 == r7) goto L58
            if (r0 != r5) goto L78
            long r10 = r12.J$1
            long r0 = r12.J$0
            X.Hwg.A00(r13)
        L16:
            X.Afj r13 = (X.C1251Afj) r13
            long r2 = r13.A00
            long r2 = X.C1251Afj.A01(r10, r2)
            long r0 = X.C1251Afj.A01(r0, r2)
            X.Afj r6 = new X.Afj
            r6.<init>(r0)
            return r6
        L28:
            X.Hwg.A00(r13)
            long r0 = r12.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r12.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A06
            r12.J$0 = r0
            r12.label = r3
            java.lang.Object r13 = r2.A01(r0, r12)
            if (r13 != r6) goto L41
            return r6
        L3c:
            long r0 = r12.J$0
            X.Hwg.A00(r13)
        L41:
            X.Afj r13 = (X.C1251Afj) r13
            long r2 = r13.A00
            long r2 = X.C1251Afj.A01(r0, r2)
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r12.this$0
            r12.J$0 = r0
            r12.J$1 = r2
            r12.label = r7
            java.lang.Object r13 = r4.A99(r2, r12)
            if (r13 != r6) goto L5f
            return r6
        L58:
            long r2 = r12.J$1
            long r0 = r12.J$0
            X.Hwg.A00(r13)
        L5f:
            X.Afj r13 = (X.C1251Afj) r13
            long r10 = r13.A00
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r12.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r7 = r4.A06
            long r8 = X.C1251Afj.A01(r2, r10)
            r12.J$0 = r0
            r12.J$1 = r10
            r12.label = r5
            java.lang.Object r13 = r7.A00(r8, r10, r12)
            if (r13 != r6) goto L16
            return r6
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
