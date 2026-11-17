package com.facebook.aura.confidentialvm.view;

import X.AGI;
import X.AHH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmOverflowMenuKt {
    public static final int LOG_OUT_MENU_ITEM_ID = 1;
    public static final int REPORT_ISSUE_MENU_ITEM_ID = 0;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ Function0<Unit> $onMenuClick;
        public final /* synthetic */ Function0<Unit> $onReportIssueClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$onMenuClick = function0;
            this.$onReportIssueClick = function02;
            this.$onLogOutClick = function03;
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
            ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(this.$onMenuClick, this.$onReportIssueClick, this.$onLogOutClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmOverflowMenu(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(function0, function02, function03);
        bfm.AgG(-46579295);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c21);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, strA012);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                BS0 bs0 = BRg.A00;
                objAaT2 = AGI.A0E(new AuraContextMenuItem(0, strA01, null, null, null, null, false, false, false, zA1Z, false, bs0, zA1Z ? 1 : 0, zA1Z ? 1 : 0), new AuraContextMenuItem(zA1Z ? 1 : 0, strA012, null, null, null, null, false, false, false, zA1Z, false, bs0, zA1Z ? 1 : 0, zA1Z ? 1 : 0));
                bfm.Ai0(objAaT2);
            }
            AHH ahh = (AHH) objAaT2;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i4);
            C0z7 c0z7 = C0z7.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA0i = AnonymousClass005.A0i(bfm);
            boolean zA1F = AnonymousClass004.A1F(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA1F || objAaT3 == obj) {
                objAaT3 = new ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA0i, (Function0) objAaT3, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2040);
            BRg bRgAQJ = c0z7.AQJ(BRg.A00);
            boolean zA0A = MutableState.A0A(mutableState);
            long jA0B = AnonymousClass007.A0B(0.0f, AuraDimensKt.SpacingSmall);
            boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, AnonymousClass001.A1O(iA0T)) | ((iA0T & 896) == 256);
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$2$1(function02, auraNavigatorA0b, function03, mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u, (Function0) objAaT5, zA0A, null, jA0B, null, false, new ConfidentialVmOverflowMenuKt$ConfidentialVmOverflowMenu$1$4(ahh), false, null, null, null, false, bfm, 384, 0, 16080);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, function03, bRg2, i, i2);
        }
    }
}
