package androidx.compose.foundation.pager;

import X.AbstractC07117nq;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1$1$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ PagerState $state;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1$1(PagerState pagerState, HtJ<? super LazyLayoutPagerKt$dragDirectionDetector$1$1$1> htJ) {
        super(2, htJ);
        this.$state = pagerState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        LazyLayoutPagerKt$dragDirectionDetector$1$1$1 lazyLayoutPagerKt$dragDirectionDetector$1$1$1 = new LazyLayoutPagerKt$dragDirectionDetector$1$1$1(this.$state, htJ);
        lazyLayoutPagerKt$dragDirectionDetector$1$1$1.L$0 = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1$1$1;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1$1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0090 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r6 = 2
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 == r1) goto L69
            if (r0 != r6) goto L93
            java.lang.Object r0 = r10.L$2
            X.Agk r0 = (X.C1299Agk) r0
            java.lang.Object r8 = r10.L$1
            X.Agk r8 = (X.C1299Agk) r8
            java.lang.Object r4 = r10.L$0
            X.AXb r4 = (X.InterfaceC1074AXb) r4
            X.Hwg.A00(r11)
        L1c:
            X.Afe r11 = (X.C1247Afe) r11
            java.util.List<X.Agk> r9 = r11.A05
            int r3 = r9.size()
            r2 = 0
        L25:
            if (r2 >= r3) goto L36
            java.lang.Object r1 = r9.get(r2)
            X.Agk r1 = (X.C1299Agk) r1
            boolean r1 = X.AbstractC1078AXh.A02(r1)
            if (r1 == 0) goto L3c
            int r2 = r2 + 1
            goto L25
        L36:
            java.lang.Object r0 = r9.get(r5)
            X.Agk r0 = (X.C1299Agk) r0
        L3c:
            if (r0 == 0) goto L82
            androidx.compose.foundation.pager.PagerState r4 = r10.$state
            long r2 = r0.A0A
            long r0 = r8.A0A
            long r2 = X.AWx.A04(r2, r0)
            androidx.compose.runtime.MutableState r1 = r4.A0V
            X.AWx r0 = new X.AWx
            r0.<init>(r2)
            r1.Af8(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L55:
            X.Hwg.A00(r11)
            java.lang.Object r4 = r10.L$0
            X.AXb r4 = (X.InterfaceC1074AXb) r4
            X.AXj r0 = X.EnumC1080AXj.A03
            r10.L$0 = r4
            r10.label = r1
            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r4, r0, r10, r5)
            if (r11 != r7) goto L70
            return r7
        L69:
            java.lang.Object r4 = r10.L$0
            X.AXb r4 = (X.InterfaceC1074AXb) r4
            X.Hwg.A00(r11)
        L70:
            X.Agk r11 = (X.C1299Agk) r11
            androidx.compose.foundation.pager.PagerState r0 = r10.$state
            r2 = 0
            androidx.compose.runtime.MutableState r1 = r0.A0V
            X.AWx r0 = new X.AWx
            r0.<init>(r2)
            r1.Af8(r0)
            r0 = 0
            r8 = r11
        L82:
            X.AXj r1 = X.EnumC1080AXj.A03
            r10.L$0 = r4
            r10.L$1 = r8
            r10.L$2 = r0
            r10.label = r6
            java.lang.Object r11 = r4.A4z(r1, r10)
            if (r11 != r7) goto L1c
            return r7
        L93:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
