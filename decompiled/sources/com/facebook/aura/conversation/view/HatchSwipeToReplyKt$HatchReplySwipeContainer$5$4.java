package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BLU;
import X.BRg;
import X.BS0;
import X.C00q;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<BLU> $bubbleBounds$delegate;
    public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $content;
    public final /* synthetic */ float $towardsReply;
    public final /* synthetic */ C00q $translationPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4(G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, float f, C00q c00q, MutableState<BLU> mutableState) {
        super(2);
        this.$content = g2j;
        this.$towardsReply = f;
        this.$translationPx = c00q;
        this.$bubbleBounds$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> g2j = this.$content;
            BS0 bs0 = BRg.A00;
            boolean zA62 = bfm.A62(this.$towardsReply);
            C00q c00q = this.$translationPx;
            float f = this.$towardsReply;
            Object objAaT = bfm.AaT();
            if (zA62 || objAaT == C78N.A00) {
                objAaT = new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$1$1(c00q, f);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bs0, objAaT);
            C00q c00q2 = this.$translationPx;
            MutableState<BLU> mutableState = this.$bubbleBounds$delegate;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$2$1(c00q2, mutableState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1F(bRgA0W, objAaT2, bfm, g2j, 48);
            return;
        }
        bfm.Afo();
    }
}
