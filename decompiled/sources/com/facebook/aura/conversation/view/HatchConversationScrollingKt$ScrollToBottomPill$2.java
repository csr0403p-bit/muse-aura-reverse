package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC04540eo;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1Cd;
import X.C1D3;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0W;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScrollingKt$ScrollToBottomPill$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onScrolledToBottom;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScrollingKt$ScrollToBottomPill$2(Function0<Unit> function0, long j, long j2) {
        super(3);
        this.$onScrolledToBottom = function0;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            C1YD c1yd = new C1YD(0);
            boolean zA65 = bfm.A65(this.$onScrolledToBottom);
            Function0<Unit> function0 = this.$onScrolledToBottom;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchConversationScrollingKt$ScrollToBottomPill$2$2$1(function0);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA07 = C10G.A07(C3U4.A09(C0v5.A01(null, interfaceC1072AWd, bs0, c1yd, null, (Function0) objAaT2, true), 6.0f), 36.0f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C1b8.A03(AbstractC04540eo.A00(bRgA07, c1d3, 4.0f, 28, 0L, 0L), c1d3, this.$userMessageBubbleColor);
            Alignment alignment = C2VU.A09;
            long j = this.$userMessageTextColor;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_arrow_down, 0), AuraIconSize.SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12023a), j, null, bfm, AnonymousClass001.A03(), 33);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
