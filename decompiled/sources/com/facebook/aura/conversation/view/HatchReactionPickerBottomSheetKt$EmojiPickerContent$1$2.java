package com.facebook.aura.conversation.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$2 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $searchQuery$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchReactionPickerBottomSheetKt$EmojiPickerContent$1$2(MutableState<String> mutableState) {
        super(3);
        this.$searchQuery$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        int iA0T = i;
        C7384Etj.A0Y(g0v, 0);
        if ((i & 6) == 0) {
            iA0T = i | AnonymousClass004.A0T(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA0B = C3U4.A0B(C1b8.A03(c1062ATq, C1D8.A00(10.0f), C06G.A0K(bfm, akh)), 10.0f, 8.0f);
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            MutableState<String> mutableState = this.$searchQuery$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0b, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_magnifying_glass, 0), AuraIconSize.TINY, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, null, bfm, AnonymousClass001.A04(), 33);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (MutableState.A01((MutableState) mutableState) == 0) {
                bfm.AgE(-1698480434);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120878), null, C06G.A09(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-1698232961);
            }
            BBI.A0R(bbi, false);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0T, true);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
