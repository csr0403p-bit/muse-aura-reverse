package com.facebook.aura.sharedcontent;

import X.AGH;
import X.AHI;
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
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.common.url.SharedContentIabSignalKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharedcontent.SharedContentUiState;
import com.facebook.aura.sharedcontent.SharedContentViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.CardMetadata;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.spaces.repo.SpaceCardPriority;
import com.facebook.aura.spaces.repo.SpaceCardType;
import com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.utils.HatchStringUtils;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchSharedContentScreenKt {

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$HatchSharedContentScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SharedContentUiState> $uiState$delegate;
        public final /* synthetic */ SharedContentViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C1BO<? extends SharedContentUiState> c1bo, SharedContentViewModel sharedContentViewModel) {
            super(2);
            this.$uiState$delegate = c1bo;
            this.$viewModel = sharedContentViewModel;
        }

        public final void invoke(BFM bfm, int i) {
            SharedContentUiState.Loaded loaded;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            SharedContentUiState value = this.$uiState$delegate.getValue();
            if (!(value instanceof SharedContentUiState.Loaded) || (loaded = (SharedContentUiState.Loaded) value) == null) {
                bfm.AgE(564459974);
            } else {
                bfm.AgE(564459975);
                SharedContentViewModel sharedContentViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(sharedContentViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchSharedContentScreenKt$HatchSharedContentScreen$2$1$1$1(sharedContentViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                boolean zA672 = bfm.A67(sharedContentViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSharedContentScreenKt$HatchSharedContentScreen$2$1$2$1(sharedContentViewModel);
                    bfm.Ai0(objAaT2);
                }
                HatchSharedContentScreenKt.SharedContentOverflowAction(loaded, function0, (Function0) ((InterfaceC7353EnQ) objAaT2), bfm, SharedContentUiState.Loaded.$stable);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$HatchSharedContentScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ C1BO<SharedContentUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, C1BO<? extends SharedContentUiState> c1bo) {
            super(4);
            this.$shareKey = str;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1994invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1994invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            C1062ATq c1062ATq = C10G.A01;
            String str = this.$shareKey;
            C1BO<SharedContentUiState> c1bo = this.$uiState$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            BRg bRgA0C = C3U4.A0C(C90l.A00.AiP(C10G.A02, 1.0f, true), 0.0f, f, 0.0f, 0.0f);
            SharedContentUiState value = c1bo.getValue();
            if (C7384Etj.areEqual(value, SharedContentUiState.Loading.INSTANCE)) {
                bfm.AgE(-1969964369);
                HatchSharedContentScreenKt.SharedContentLoadingView(C3U4.A0C(bRgA0C, 0.0f, 0.0f, 0.0f, f2), bfm, 0, 0);
            } else if (value instanceof SharedContentUiState.Error) {
                bfm.AgE(-1969959956);
                HatchSharedContentScreenKt.SharedContentErrorView(AbstractC2271BQs.A01(bfm, ((SharedContentUiState.Error) value).messageRes), C3U4.A0C(bRgA0C, 0.0f, 0.0f, 0.0f, f2), bfm, 0, 0);
            } else {
                if (!(value instanceof SharedContentUiState.Loaded)) {
                    throw AnonymousClass003.A0k(bfm, bbi, -1969966093);
                }
                bfm.AgE(-938990872);
                SharedContentUiState.Loaded loaded = (SharedContentUiState.Loaded) value;
                boolean zA66 = bfm.A66(loaded.injectIabHeader);
                Object objAaT = bfm.AaT();
                if (zA66 || objAaT == C78N.A00) {
                    objAaT = loaded.injectIabHeader ? AnonymousClass006.A10(SharedContentIabSignalKt.IAB_HEADER, "AuraForAndroid") : AGH.A0E();
                    bfm.Ai0(objAaT);
                }
                HatchSharedContentScreenKt.SharedContentWebView(loaded.slug, str, loaded.webViewUrl, loaded.injectIabHeader, bRgA0C, (Map) objAaT, bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            if (c1bo.getValue() instanceof SharedContentUiState.Loaded) {
                bfm.AgE(-938441738);
                HatchSharedContentScreenKt.m1992SharedContentDisclaimerBannerorJrPs(f2, null, bfm, (iA04 >> 3) & 14, 2);
            } else {
                bfm.AgE(-938366780);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$HatchSharedContentScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$shareKey = str2;
            this.$onBackClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedContentScreenKt.HatchSharedContentScreen(this.$slug, this.$shareKey, this.$onBackClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$SharedContentErrorView$2, reason: invalid class name and case insensitive filesystem */
    public final class C136452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136452(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedContentScreenKt.SharedContentErrorView(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$SharedContentLoadingView$2, reason: invalid class name and case insensitive filesystem */
    public final class C136462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136462(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedContentScreenKt.SharedContentLoadingView(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$SharedContentOverflowAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C136472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SharedContentUiState.Loaded $loaded;
        public final /* synthetic */ Function0<Unit> $onSave;
        public final /* synthetic */ Function0<Unit> $onShare;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136472(SharedContentUiState.Loaded loaded, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$loaded = loaded;
            this.$onShare = function0;
            this.$onSave = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedContentScreenKt.SharedContentOverflowAction(this.$loaded, this.$onShare, this.$onSave, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$SharedContentWebView$3, reason: invalid class name and case insensitive filesystem */
    public final class C136483 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $extraRequestHeaders;
        public final /* synthetic */ boolean $isSharedSpace;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $webViewUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136483(String str, String str2, String str3, boolean z, BRg bRg, Map<String, String> map, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$shareKey = str2;
            this.$webViewUrl = str3;
            this.$isSharedSpace = z;
            this.$modifier = bRg;
            this.$extraRequestHeaders = map;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedContentScreenKt.SharedContentWebView(this.$slug, this.$shareKey, this.$webViewUrl, this.$isSharedSpace, this.$modifier, this.$extraRequestHeaders, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchSharedContentScreen(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String str3;
        SharedContentUiState.Loaded loaded;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(1050796889);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            SharedContentViewModel.Factory factory = new SharedContentViewModel.Factory(str, str2);
            String strA0U = FGI.A0U("shared-content:", str, str2 != null ? FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2) : "");
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            SharedContentViewModel sharedContentViewModel = (SharedContentViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), SharedContentViewModel.class, strA0U);
            C1BO c1boA02 = C2CK.A02(bfm, sharedContentViewModel.uiState);
            SharedContentUiState sharedContentUiState = (SharedContentUiState) c1boA02.getValue();
            if (!(sharedContentUiState instanceof SharedContentUiState.Loaded) || (loaded = (SharedContentUiState.Loaded) sharedContentUiState) == null || (str3 = loaded.displayName) == null) {
                bfm.AgE(-1725953844);
                boolean zA1B = AnonymousClass003.A1B(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1B || objAaT == C78N.A00) {
                    objAaT = HatchStringUtils.INSTANCE.artifactDisplayName(str);
                    bfm.Ai0(objAaT);
                }
                str3 = (String) objAaT;
            } else {
                bfm.AgE(498511290);
            }
            AnonymousClass001.A1D(bfm);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f6c);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f6b);
            Unit unit = Unit.INSTANCE;
            boolean zA1W = AnonymousClass005.A1W(bfm, contextA0H, strA0v, strA01, bfm.A67(sharedContentViewModel));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSharedContentScreenKt$HatchSharedContentScreen$1$1(sharedContentViewModel, contextA0H, strA0v, strA01, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, AuraContentRole.Immersive, 0L, str3, null, function0, HatchHeaderTitleAlignment.CENTER, false, false, R.drawable.x_wght400_outline_24, null, null, null, null, null, B1V.A00(bfm, new AnonymousClass2(c1boA02, sharedContentViewModel), -1751069396), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass3(str2, c1boA02), 564048820), bfm, AnonymousClass001.A05(iA0d << 12, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 12583302), 1572864, 805306374, 535755560);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, function0, bRg2, i, i2);
        }
    }

    /* renamed from: SharedContentDisclaimerBanner--orJrPs, reason: not valid java name */
    public static final void m1992SharedContentDisclaimerBannerorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1320679632);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA01 = C60O.A01(bfm, auraTheme);
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgThen, c1dm, jA01);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C3Ue.A04(C1b8.A03(C10G.A04(c1062ATq, 0.0f), c1dm, auraTheme.getColors(bfm, 6).fillDivider), bfm, 0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f5), C3U4.A0C(C3U4.A0B(c1062ATq, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall), 0.0f, 0.0f, 0.0f, f), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption2Regular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSharedContentScreenKt$SharedContentDisclaimerBanner$2(f, bRg2, i, i2);
        }
    }

    public static final void SharedContentErrorView(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-980931579);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA02 = C10G.A02(C2VU.A09, C3U4.A09(AnonymousClass001.A0T(bRg2), 24.0f), false);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchSharedContentScreenKt$SharedContentErrorView$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA02, objAaT, false), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16380);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136452(str, bRg2, i, i2);
        }
    }

    public static final void SharedContentWebView(String str, String str2, String str3, boolean z, BRg bRg, Map<String, String> map, BFM bfm, int i, int i2) {
        Map<String, String> mapA0o = map;
        BRg bRg2 = bRg;
        bfm.AgG(-1011054811);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA02 = 196608;
        if (i4 != 0) {
            iA0d |= iA02;
        } else if ((i & 196608) == 0) {
            iA02 = AnonymousClass002.A02(AnonymousClass004.A1R(bfm, mapA0o, i, 262144) ? 1 : 0);
            iA0d |= iA02;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            mapA0o = C3cH.A0o(mapA0o, i4);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                SpaceCardType spaceCardType = SpaceCardType.HTML_WEB_VIEW;
                String str4 = null;
                String str5 = null;
                CardMetadata cardMetadata = new CardMetadata(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, null, null);
                if (z) {
                    str4 = str;
                    str5 = str2;
                }
                objAaT = new SpaceCard(str, spaceCardType, str, null, null, null, SpaceCardPriority.MEDIUM, null, null, null, null, null, null, null, null, null, AHI.A01, cardMetadata, null, z, str4, str4, str5, null, null);
                bfm.Ai0(objAaT);
            }
            SpaceCard spaceCard = (SpaceCard) objAaT;
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA0M = FGI.A0M("shared-content:", str);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSharedContentScreenKt$SharedContentWebView$1$1(contextA0H);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA672 = bfm.A67(contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSharedContentScreenKt$SharedContentWebView$2$1(contextA0H);
                bfm.Ai0(objAaT3);
            }
            HtmlSpacesWebViewKt.m2202HtmlSpacesWebViewKAcDUPU(strA0M, spaceCard, bRgA0T, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, mapA0o, g0u, (G0U) objAaT3, null, null, null, null, null, null, null, bfm, ((iA0d << 12) & 1879048192) | 114846720, 0, 520224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136483(str, str2, str3, z, bRg2, mapA0o, i, i2);
        }
    }

    public static final void SharedContentLoadingView(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-544179688);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f4);
            BRg bRgA02 = C10G.A02(C2VU.A09, AnonymousClass001.A0T(bRg), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSharedContentScreenKt$SharedContentLoadingView$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136462(bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SharedContentOverflowAction(com.facebook.aura.sharedcontent.SharedContentUiState.Loaded r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BFM r36, int r37) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt.SharedContentOverflowAction(com.facebook.aura.sharedcontent.SharedContentUiState$Loaded, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int):void");
    }

    public static final /* synthetic */ SharedContentUiState access$HatchSharedContentScreen$lambda$1(C1BO c1bo) {
        return (SharedContentUiState) c1bo.getValue();
    }
}
