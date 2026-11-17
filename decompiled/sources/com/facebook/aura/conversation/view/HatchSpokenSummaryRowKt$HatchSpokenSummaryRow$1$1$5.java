package com.facebook.aura.conversation.view;

import X.AbstractC1913AtY;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import X.G2j;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$5 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $summaryText;

    /* renamed from: com.facebook.aura.conversation.view.HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$5$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $summaryText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$summaryText = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass001.A1G(BRg.A00, bfm, this.$summaryText, 54);
            } else {
                bfm.Afo();
            }
        }
    }

    public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        if (z) {
            bfm.AgE(-1306489117);
            AbstractC1913AtY.A01(bRg, B1V.A00(bfm, new AnonymousClass1(this.$summaryText), -1314773831), bfm, (iA0d & 14) | 48, 0);
        } else {
            bfm.AgE(-1306381361);
            AnonymousClass001.A1G(bRg, bfm, this.$summaryText, (iA0d & 14) | 48);
        }
        AnonymousClass001.A1D(bfm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$5(G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
        super(4);
        this.$summaryText = g0w;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
