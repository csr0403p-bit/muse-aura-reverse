package X;

import androidx.compose.foundation.pager.PagerState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {663, 670}, m = "animateScrollToPage", v = 1)
/* renamed from: X.Abp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1137Abp extends HzP {
    public float F$0;
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137Abp(PagerState pagerState, HtJ<? super C1137Abp> htJ) {
        super(htJ);
        this.this$0 = pagerState;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A09(null, this, 0);
    }
}
