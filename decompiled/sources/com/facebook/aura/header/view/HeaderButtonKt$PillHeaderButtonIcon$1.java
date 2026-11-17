package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$PillHeaderButtonIcon$1 extends AbstractC7559F3s implements G0W<Function0<? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ HeaderButton $button;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$PillHeaderButtonIcon$1(HeaderButton headerButton, G0U<? super HeaderButton, Unit> g0u, B6A b6a, BRg bRg, boolean z) {
        super(3);
        this.$button = headerButton;
        this.$onHeaderButtonClick = g0u;
        this.$tint = b6a;
        this.$modifier = bRg;
        this.$showBadge = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0, BFM bfm, Integer num) {
        invoke((Function0<Unit>) function0, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(Function0<Unit> function0, BFM bfm, int i) {
        int iA0T;
        C7384Etj.A0Y(function0, 0);
        if ((i & 6) == 0) {
            iA0T = AnonymousClass004.A0T(bfm, function0) | i;
        } else {
            iA0T = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            HeaderButton headerButton = this.$button;
            boolean zA65 = bfm.A65(this.$onHeaderButtonClick) | AnonymousClass001.A1M(iA0T);
            G0U<HeaderButton, Unit> g0u = this.$onHeaderButtonClick;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HeaderButtonKt$PillHeaderButtonIcon$1$1$1(function0, g0u);
                bfm.Ai0(objAaT);
            }
            HeaderButtonKt.m1031PillHeaderButtonIconContentet4HrQ(headerButton, (G0U) objAaT, this.$tint, this.$modifier, this.$showBadge, bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
