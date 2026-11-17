package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.glance.session.GlobalSnapshotManagerKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;

/* renamed from: X.BTs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2318BTs extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A05 = obj;
                A00(this);
                return SuspendAnimationKt.A01(null, null, this, null, 0L);
            case 1:
                this.A04 = obj;
                A00(this);
                return PagerState.A01(null, (PagerState) this.A05, this, null);
            case 2:
                this.A04 = obj;
                A00(this);
                return TextFieldSelectionState.A05((TextFieldSelectionState) this.A05, null, this, false);
            case 3:
                this.A04 = obj;
                A00(this);
                return ((BSR) this.A05).emit(null, this);
            case 4:
                this.A05 = obj;
                A00(this);
                return GlobalSnapshotManagerKt.A00(this);
            default:
                this.A05 = obj;
                A00(this);
                return RememberLottieCompositionKt.A02(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2318BTs(Object obj, PagerState pagerState, HtJ<? super C2318BTs> htJ) {
        super(pagerState);
        this.$t = htJ;
        this.A05 = obj;
    }

    public static void A00(C2318BTs c2318BTs) {
        c2318BTs.A00 |= Integer.MIN_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2318BTs(int i, HtJ<? super C2318BTs> htJ) {
        super(htJ);
        this.$t = i;
    }
}
