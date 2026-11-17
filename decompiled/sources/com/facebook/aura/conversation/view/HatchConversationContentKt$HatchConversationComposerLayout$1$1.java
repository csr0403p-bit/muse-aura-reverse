package com.facebook.aura.conversation.view;

import X.AYU;
import X.AZE;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.C3Su;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationComposerLayout$1$1 extends AbstractC7559F3s implements G0V<C3Su, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $composer;
    public final /* synthetic */ G0W<Integer, BFM, Integer, Unit> $content;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationComposerLayout$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $composerPlaceable;
        public final /* synthetic */ long $constraints;
        public final /* synthetic */ AZE $contentPlaceable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$contentPlaceable, 0, 0);
            AZE aze = this.$composerPlaceable;
            long j = this.$constraints;
            AYU.A04(ayu, aze, (Constraints.A01(j) - aze.A01) / 2, Constraints.A00(j) - aze.A00);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, AZE aze2, long j) {
            super(1);
            this.$contentPlaceable = aze;
            this.$composerPlaceable = aze2;
            this.$constraints = j;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final InterfaceC1134Abi m547invoke0kLqBqw(C3Su c3Su, long j) {
        C7384Etj.A0Y(c3Su, 0);
        C3TG c3tg = (C3TG) AbstractC0878AGe.A0J(c3Su.AgZ(ConversationComposerLayoutSlot.Composer, B1V.A01(new HatchConversationContentKt$HatchConversationComposerLayout$1$1$composerPlaceable$1(this.$composer), -763147550, true)));
        int iA03 = Constraints.A03(j);
        int iA01 = Constraints.A01(j);
        int iA00 = Constraints.A00(j);
        AZE azeAQW = c3tg.AQW(Constraints.A05(iA03, iA01, 0, iA00));
        return AnonymousClass002.A0X(c3Su, new AnonymousClass1(((C3TG) AbstractC0878AGe.A0J(c3Su.AgZ(ConversationComposerLayoutSlot.Content, B1V.A01(new HatchConversationContentKt$HatchConversationComposerLayout$1$1$contentPlaceable$1(this.$content, azeAQW.A00), 626013717, true)))).AQW(j), azeAQW, j), iA01, iA00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationComposerLayout$1$1(G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super Integer, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$composer = g0v;
        this.$content = g0w;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(C3Su c3Su, Constraints constraints) {
        return m547invoke0kLqBqw(c3Su, constraints.A00);
    }
}
