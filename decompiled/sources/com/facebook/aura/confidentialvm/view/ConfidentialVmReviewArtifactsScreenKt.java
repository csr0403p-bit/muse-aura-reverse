package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0953AJg;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmArtifact;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmReviewArtifactsScreenKt {
    public static final float ArtifactIconSize = 32.0f;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ArtifactIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
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
            ConfidentialVmReviewArtifactsScreenKt.ArtifactIcon(this.$iconUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ArtifactRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmArtifact $artifact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmArtifact confidentialVmArtifact) {
            super(2);
            this.$artifact = confidentialVmArtifact;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ConfidentialVmReviewArtifactsScreenKt.ArtifactIcon(this.$artifact.iconUrl, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ArtifactRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmArtifact $artifact;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmArtifact confidentialVmArtifact, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$artifact = confidentialVmArtifact;
            this.$selected = z;
            this.$onToggle = function0;
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
            ConfidentialVmReviewArtifactsScreenKt.ArtifactRow(this.$artifact, this.$selected, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ArtifactsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C112742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ boolean $hasSelection;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggleAllClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112742(int i, boolean z, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$hasSelection = z;
            this.$onToggleAllClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmReviewArtifactsScreenKt.ArtifactsHeader(this.$count, this.$hasSelection, this.$onToggleAllClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C112752 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112752(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo) {
            super(4);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m473invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m473invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
            C1BO<ConfidentialVmSwitchUiState> c1bo = this.$uiState$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, AnonymousClass001.A0N(c90l, bs0, true));
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA0T, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(AuraHeadlineAndBodyStyle.TITLE2_MEDIUM_SUBHEADLINE_REGULAR, C3U4.A0B(C10G.A02, AuraDimensKt.SpacingLargePlusMicro, 0.0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120753), null, null, AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120752), null, null, 0, null, null, null, null, null, AnonymousClass002.A0f(bfm).title1Medium, null, bfm, 6, 0, 49112);
            C01N.A08(bfm, bs0, f3);
            int size = c1bo.getValue().artifacts.size();
            boolean z = !c1bo.getValue().selectedArtifactIds.isEmpty();
            boolean zA67 = bfm.A67(confidentialVmSwitchViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$1$1(confidentialVmSwitchViewModel);
                bfm.Ai0(objAaT);
            }
            ConfidentialVmReviewArtifactsScreenKt.ArtifactsHeader(size, z, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 8);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1bo, confidentialVmSwitchViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$1$2$1(c1bo, confidentialVmSwitchViewModel);
                bfm.Ai0(objAaT2);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
            if (c1bo.getValue().hasError) {
                bfm.AgE(2000928775);
                ConfidentialVmDataChoiceScreenKt.ConfidentialVmSwitchErrorText(C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingSmall, 0.0f, 0.0f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(2001024875);
                BBI.A0R(bbi, false);
            }
            C01N.A04(bfm, bbi, bs0, f3, true);
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f2);
            boolean zA1J2 = AnonymousClass003.A1J(bfm, c1bo, confidentialVmSwitchViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA1J2 || objAaT3 == C78N.A00) {
                objAaT3 = new ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$2$1$2$1(confidentialVmSwitchViewModel, c1bo);
                bfm.Ai0(objAaT3);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0C, null, null, null, null, null, null, false, (G0U) objAaT3, bfm, 0, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt$ConfidentialVmReviewArtifactsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C112763 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112763(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmReviewArtifactsScreenKt.ConfidentialVmReviewArtifactsScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ArtifactIcon(java.lang.String r30, X.BRg r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt.ArtifactIcon(java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void ArtifactRow(ConfidentialVmArtifact confidentialVmArtifact, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-6829592);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, confidentialVmArtifact) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
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
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7);
            C1DM c1dm = AnonymousClass002.A0e(bfm).none;
            AuraCardType.Checkbox checkbox = new AuraCardType.Checkbox(null);
            String str = confidentialVmArtifact.title;
            ApQ apQA0X = AnonymousClass005.A0X(confidentialVmArtifact.subtitle);
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(confidentialVmArtifact), 1801671876);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (iA0T & 896) == 256;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmReviewArtifactsScreenKt$ArtifactRow$2$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleM2500listoAWOtXo, auraCardContent, checkbox, b1uA00, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, c1dm, 0L, false, null, null, bfm, AnonymousClass001.A0C(iA0T << 18, ((iA0T >> 9) & 14) | 27648), 0, 253536);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(confidentialVmArtifact, z, function0, bRg2, i, i2);
        }
    }

    public static final void ArtifactsHeader(int i, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-2081029680);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA03 = C3U4.A03(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA0Y = AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f10001f);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0C = C06G.A0C(bfm);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmReviewArtifactsScreenKt$ArtifactsHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0Y, AnonymousClass001.A0Y(bRgA0O, objAaT, false), jA0C, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            int i5 = R.string._name_removed__res_0x7f120751;
            if (z) {
                i5 = R.string._name_removed__res_0x7f120750;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, i5), null, null, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 1, false, 0, bfm, 196608, (iA0D << 6) & 57344, RuntimeInternals.IOPRIO_BACKGROUND, 117424077);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112742(i, z, function0, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmReviewArtifactsScreen(X.BRg r44, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmReviewArtifactsScreenKt.ConfidentialVmReviewArtifactsScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialVmReviewArtifactsScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }

    public static final boolean isHttpsUrl(String str) {
        String host;
        Uri uri = Uri.parse(str);
        return (!"https".equals(uri.getScheme()) || (host = uri.getHost()) == null || host.length() == 0) ? false : true;
    }
}
