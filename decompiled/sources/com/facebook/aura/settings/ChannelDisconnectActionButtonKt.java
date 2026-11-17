package com.facebook.aura.settings;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ChannelDisconnectActionButtonKt {

    /* renamed from: com.facebook.aura.settings.ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDisconnectClick;
        public final /* synthetic */ Function0<Unit> $onDismissContextMenu;
        public final /* synthetic */ Function0<Unit> $onShowContextMenu;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ boolean $showContextMenu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchScreen hatchScreen, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$screen = hatchScreen;
            this.$showContextMenu = z;
            this.$onShowContextMenu = function0;
            this.$onDismissContextMenu = function02;
            this.$onDisconnectClick = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ChannelDisconnectActionButtonKt.ChannelDisconnectActionButton(this.$screen, this.$showContextMenu, this.$onShowContextMenu, this.$onDismissContextMenu, this.$onDisconnectClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void ChannelDisconnectActionButton(HatchScreen hatchScreen, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        AnonymousClass005.A11(hatchScreen, function0, function02, 0);
        C7384Etj.A0Y(function03, 4);
        bfm.AgG(-1892282971);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchScreen) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0), AnonymousClass005.A0i(bfm), function0, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable | (iA08 & 896), 0, 2040);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206cd);
            boolean zA1B = AnonymousClass003.A1B(iA08) | ((iA08 & 7168) == 2048) | ((57344 & iA08) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$1$1(function02, hatchScreen, function03);
                bfm.Ai0(objAaT);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, (G0U) objAaT, function02, z, null, 0L, null, false, new ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$2(strA01), false, null, null, null, false, bfm, ((iA08 >> 3) & 896) | ((iA08 << 6) & 7168), 0, 16113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchScreen, z, function0, function02, function03, i);
        }
    }
}
