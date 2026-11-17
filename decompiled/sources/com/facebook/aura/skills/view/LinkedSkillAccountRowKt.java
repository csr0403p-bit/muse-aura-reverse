package com.facebook.aura.skills.view;

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
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LinkedSkillAccountRowKt {

    /* renamed from: com.facebook.aura.skills.view.LinkedSkillAccountRowKt$LinkedSkillAccountAvatar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkillLinkedAccountUiModel skillLinkedAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$account = skillLinkedAccountUiModel;
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
            LinkedSkillAccountRowKt.LinkedSkillAccountAvatar(this.$account, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.LinkedSkillAccountRowKt$LinkedSkillAccountMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C138702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDisconnect;
        public final /* synthetic */ Function0<Unit> $onMenuOpened;
        public final /* synthetic */ Function0<Unit> $onReconnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138702(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$account = skillLinkedAccountUiModel;
            this.$enabled = z;
            this.$onDisconnect = function0;
            this.$onReconnect = function02;
            this.$onMenuOpened = function03;
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
            LinkedSkillAccountRowKt.LinkedSkillAccountMenu(this.$account, this.$enabled, this.$onDisconnect, this.$onReconnect, this.$onMenuOpened, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.LinkedSkillAccountRowKt$LinkedSkillAccountRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMenuOpened;
        public final /* synthetic */ Function0<Unit> $onReconnect;
        public final /* synthetic */ G0U<SkillLinkedAccountUiModel, Unit> $onRemoveAccountClick;
        public final /* synthetic */ boolean $showOptionsMenu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138712(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, boolean z2, G0U<? super SkillLinkedAccountUiModel, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$account = skillLinkedAccountUiModel;
            this.$showOptionsMenu = z;
            this.$enabled = z2;
            this.$onRemoveAccountClick = g0u;
            this.$onReconnect = function0;
            this.$onMenuOpened = function02;
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
            LinkedSkillAccountRowKt.LinkedSkillAccountRow(this.$account, this.$showOptionsMenu, this.$enabled, this.$onRemoveAccountClick, this.$onReconnect, this.$onMenuOpened, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LinkedSkillAccountAvatar(SkillLinkedAccountUiModel skillLinkedAccountUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-574379243);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillLinkedAccountUiModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new AuraProfilePictureStyle(44.0f);
                bfm.Ai0(objAaT);
            }
            float f = ((AuraProfilePictureStyle) objAaT).size;
            String str = skillLinkedAccountUiModel.profilePictureUrl;
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(-181898076);
                BRg bRgA0P = C06G.A0P(bfm, C10G.A07(bRg2, 44.0f), C1D8.A00);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0P);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AuraTextKt.m2639AuraTextUY9GdpU(BQG.A17(skillLinkedAccountUiModel.displayName, 1).toUpperCase(Locale.ROOT), null, C06G.A08(bfm), C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-182043993);
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, f, bRg2, null, null, null, null, null, null, null, 0.0f, bfm, ((iA0T << 3) & 896) | 48, 0, 2040);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(skillLinkedAccountUiModel, bRg2, i, i2);
        }
    }

    public static final void LinkedSkillAccountMenu(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(676317915);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillLinkedAccountUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function03);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0P);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            boolean zA65 = bfm.A65(skillLinkedAccountUiModel.accountId);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA0i = AnonymousClass005.A0i(bfm);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableState, AnonymousClass005.A1L(iA0T));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$1$1(function03, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0i, (Function0) objAaT2, null, z, null, null, null, null, bfm, AnonymousClass001.A06(iA0T << 24, (AVy.$stable << 3) | 28032), 0, 15649);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA652 = bfm.A65(mutableState) | AnonymousClass004.A1M(iA0T) | ((iA0T & 896) == 256);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = new LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$2$1(function02, function0, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            boolean zA653 = bfm.A65(mutableState);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = new LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$4(skillLinkedAccountUiModel, z), false, null, null, null, false, bfm, 0, 0, 16113);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138702(skillLinkedAccountUiModel, z, function0, function02, function03, bRgA0P, i, i2);
        }
    }

    public static final void LinkedSkillAccountRow(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, boolean z2, G0U<? super SkillLinkedAccountUiModel, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A16(skillLinkedAccountUiModel, g0u, function0, function02, 0);
        bfm.AgG(-1247498483);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillLinkedAccountUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 61.0f), 20.0f, 14.0f, 12.0f, 14.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            int i5 = iA0T & 14;
            LinkedSkillAccountAvatar(skillLinkedAccountUiModel, null, bfm, i5, 2);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C2 = C3U4.A0C(c90m.AiP(bs0, 1.0f, true), 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(skillLinkedAccountUiModel.displayName, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (skillLinkedAccountUiModel.needsReauth) {
                bfm.AgE(417469191);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f9f);
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                long j2 = AnonymousClass002.A0c(bfm).errorText;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = LinkedSkillAccountRowKt$LinkedSkillAccountRow$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), j2, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(417742363);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(-766637054);
                boolean zA1S = AnonymousClass001.A1S(bfm, skillLinkedAccountUiModel, AnonymousClass004.A1M(iA0T));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new LinkedSkillAccountRowKt$LinkedSkillAccountRow$1$2$1(g0u, skillLinkedAccountUiModel);
                    bfm.Ai0(objAaT2);
                }
                int i6 = iA0T >> 3;
                LinkedSkillAccountMenu(skillLinkedAccountUiModel, z2, (Function0) objAaT2, function0, function02, null, bfm, AnonymousClass003.A07(i6, i5 | (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 32);
            } else {
                bfm.AgE(-766407375);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138712(skillLinkedAccountUiModel, z, z2, g0u, function0, function02, bRg2, i, i2);
        }
    }
}
