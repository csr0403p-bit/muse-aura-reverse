package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.C1DG;
import X.G0V;
import X.G2j;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$5$5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AHD<ConversationPresentationAction> $presentationActions;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ConversationScreenDecoration$5$5$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f, float f2) {
            super(2);
            this.$content = g2j;
            this.$topPadding = f;
            this.$bottomPadding = f2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1F(new C1DG(this.$topPadding), new C1DG(this.$bottomPadding), bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScreenKt$ConversationScreenDecoration$5$5(AHD<? extends ConversationPresentationAction> ahd, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j) {
        super(4);
        this.$presentationActions = ahd;
        this.$content = g2j;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m570invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m570invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
            AKT.A01(bfm, ConversationPresentationActionsKt.LocalConversationPresentationActions.A04(this.$presentationActions), B1V.A00(bfm, new AnonymousClass1(this.$content, f, f2), 31096260), 48);
        } else {
            bfm.Afo();
        }
    }
}
