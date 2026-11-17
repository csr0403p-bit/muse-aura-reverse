package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.C00x;
import X.C01N;
import X.C0v5;
import X.C1515AkP;
import X.C1BO;
import X.C1YD;
import X.C3cG;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetStateKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vmbrowser.VmBrowserViewer;
import com.facebook.aura.vmbrowser.VmBrowserViewerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionOpenBrowserLinkKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOpenBrowserLinkKt$OpenBrowserLink$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$browserTaskId = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionOpenBrowserLinkKt.OpenBrowserLink(this.$browserTaskId, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void OpenBrowserLink(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(-907755208);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = BrowserTaskActions.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            BrowserTaskActions browserTaskActions = (BrowserTaskActions) objAaT;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).link;
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass001.A1T(bfm, browserTaskActions, AnonymousClass003.A1C(iA0d)), (iA0d & 14) == 4);
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionOpenBrowserLinkKt$OpenBrowserLink$1$1(function0, browserTaskActions, str, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA04 = C0v5.A04(bRg2, c1ydA0A, null, (Function0) objAaT2, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0D);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120114), null, j, auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A09(bfm, BRg.A00, AuraDimensKt.SpacingXsmall);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.arrow_diagonal_right_up_20, 0), AuraIconSize.TINY, null, j, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, function0, bRg2, i, i2);
        }
    }

    public static final boolean isLiveBrowserPreviewBehindSheet(BFM bfm, int i) {
        bfm.AgE(228439319);
        if (bfm.A6v(AuraSheetStateKt.LocalAuraSheetState) == null) {
            AnonymousClass002.A19(bfm);
            return false;
        }
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = VmBrowserViewer.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        boolean z = ((VmBrowserViewerState) C1BO.A07(bfm, ((VmBrowserViewer) objAaT).state)).isPreviewVisible;
        AnonymousClass001.A1D(bfm);
        return z;
    }
}
