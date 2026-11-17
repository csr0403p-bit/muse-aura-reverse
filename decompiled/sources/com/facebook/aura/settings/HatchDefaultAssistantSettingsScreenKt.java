package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1YL;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.utils.HatchDefaultAssistantUtils;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDefaultAssistantSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchDefaultAssistantSettingsScreenKt$DefaultAssistantRoleCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
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
            HatchDefaultAssistantSettingsScreenKt.DefaultAssistantRoleCard(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDefaultAssistantSettingsScreenKt$DefaultAssistantSideChatToggle$2, reason: invalid class name and case insensitive filesystem */
    public final class C135232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135232(BRg bRg, int i, int i2) {
            super(2);
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
            HatchDefaultAssistantSettingsScreenKt.DefaultAssistantSideChatToggle(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(4);
            this.$onSetDefaultAssistantClick = function0;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1949invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1949invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = C06G.A0O(bfm, AnonymousClass006.A0M(bfm));
            Function0<Unit> function0 = this.$onSetDefaultAssistantClick;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            boolean zA65 = bfm.A65(function0);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$1$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDefaultAssistantSettingsScreenKt$HatchDefaultAssistantSettingsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135242(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onSetDefaultAssistantClick = function02;
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
            HatchDefaultAssistantSettingsScreenKt.HatchDefaultAssistantSettingsScreen(this.$onBack, this.$onSetDefaultAssistantClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void DefaultAssistantRoleCard(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1539664133);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120eeb), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            boolean zA1M = AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchDefaultAssistantSettingsScreenKt$DefaultAssistantRoleCard$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0T >> 3) & 14) | 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void DefaultAssistantSideChatToggle(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1718530092);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            if (objAaT == obj) {
                objAaT = AnonymousClass005.A0S(bfm, HatchDefaultAssistantUtils.INSTANCE.isSideChatForDefaultAssistantEnabled());
            }
            MutableState mutableState = (MutableState) objAaT;
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eea);
            C0881AGi c0881AGi = C0881AGi.A00;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(new ApQ(strA01, c0881AGi), auraIconAndHeadlineStyle, bo6, (B6A) (objArr15 == true ? 1 : 0), AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120ee9), (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097132, (C06H) (objArr5 == true ? 1 : 0));
            Boolean boolValueOf = Boolean.valueOf(MutableState.A0A(mutableState));
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new HatchDefaultAssistantSettingsScreenKt$DefaultAssistantSideChatToggle$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT2, null, false, false, null, null, 0L, false, null, null, bfm, (iA0d & 14) | 100666368, 0, 261744);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135232(bRg2, i, i2);
        }
    }

    public static final void HatchDefaultAssistantSettingsScreen(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(60750348);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee8), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass1(function02), 1472910737), bfm, AnonymousClass007.A03(iA0T >> 3, iA0T), zA1b ? 1 : 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135242(function0, function02, bRg2, i, i2);
        }
    }
}
