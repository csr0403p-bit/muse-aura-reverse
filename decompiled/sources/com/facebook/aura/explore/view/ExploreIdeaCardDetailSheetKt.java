package com.facebook.aura.explore.view;

import X.AHD;
import X.AHI;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AYD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BQI;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0v2;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1EQ;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.model.IdeaCardDetailViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardDetail;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.explore.repo.IdeaCardItem;
import com.facebook.aura.explore.repo.IdeaCardLayout;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.sharesheet.HatchIdeaShareAction;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ExploreIdeaCardDetailSheetKt {
    public static final float ScrollFadeGradientHeight = 32.0f;

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchSubsurface $analyticsFeedbackSubsurface;
        public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
        public final /* synthetic */ HatchSurface $analyticsSurface;
        public final /* synthetic */ boolean $canExecute;
        public final /* synthetic */ C1BO<Boolean> $canScrollDown$delegate;
        public final /* synthetic */ String $displayActionLabel;
        public final /* synthetic */ String $displayTitle;
        public final /* synthetic */ Function0<Unit> $executeIdea;
        public final /* synthetic */ IdeaCardExecutionState $executionState;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ Map<String, String> $impressionMetadata;
        public final /* synthetic */ boolean $isBuilt;
        public final /* synthetic */ MutableState<Boolean> $menuOpen$delegate;
        public final /* synthetic */ HatchIdeaShareAction $shareAction;
        public final /* synthetic */ G0U<IdeaFeedback, Unit> $submitIdeaFeedback;

        /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ HatchSubsurface $analyticsFeedbackSubsurface;
            public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
            public final /* synthetic */ HatchSurface $analyticsSurface;
            public final /* synthetic */ boolean $canExecute;
            public final /* synthetic */ String $displayActionLabel;
            public final /* synthetic */ String $displayTitle;
            public final /* synthetic */ Function0<Unit> $executeIdea;
            public final /* synthetic */ IdeaCardExecutionState $executionState;
            public final /* synthetic */ String $ideaCardId;
            public final /* synthetic */ Map<String, String> $impressionMetadata;
            public final /* synthetic */ boolean $isBuilt;
            public final /* synthetic */ MutableState<Boolean> $menuOpen$delegate;
            public final /* synthetic */ HatchIdeaShareAction $shareAction;
            public final /* synthetic */ G0U<IdeaFeedback, Unit> $submitIdeaFeedback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z, String str, IdeaCardExecutionState ideaCardExecutionState, boolean z2, Function0<Unit> function0, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map, HatchIdeaShareAction hatchIdeaShareAction, String str2, String str3, HatchSubsurface hatchSubsurface2, G0U<? super IdeaFeedback, Unit> g0u, MutableState<Boolean> mutableState) {
                super(2);
                this.$isBuilt = z;
                this.$displayActionLabel = str;
                this.$executionState = ideaCardExecutionState;
                this.$canExecute = z2;
                this.$executeIdea = function0;
                this.$analyticsSurface = hatchSurface;
                this.$analyticsSubsurface = hatchSubsurface;
                this.$impressionMetadata = map;
                this.$shareAction = hatchIdeaShareAction;
                this.$ideaCardId = str2;
                this.$displayTitle = str3;
                this.$analyticsFeedbackSubsurface = hatchSubsurface2;
                this.$submitIdeaFeedback = g0u;
                this.$menuOpen$delegate = mutableState;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0163  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.BFM r41, int r42) {
                /*
                    Method dump skipped, instructions count: 477
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt.AnonymousClass4.AnonymousClass1.invoke(X.BFM, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C1BO<Boolean> c1bo, boolean z, String str, IdeaCardExecutionState ideaCardExecutionState, boolean z2, Function0<Unit> function0, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map, HatchIdeaShareAction hatchIdeaShareAction, String str2, String str3, HatchSubsurface hatchSubsurface2, G0U<? super IdeaFeedback, Unit> g0u, MutableState<Boolean> mutableState) {
            super(2);
            this.$canScrollDown$delegate = c1bo;
            this.$isBuilt = z;
            this.$displayActionLabel = str;
            this.$executionState = ideaCardExecutionState;
            this.$canExecute = z2;
            this.$executeIdea = function0;
            this.$analyticsSurface = hatchSurface;
            this.$analyticsSubsurface = hatchSubsurface;
            this.$impressionMetadata = map;
            this.$shareAction = hatchIdeaShareAction;
            this.$ideaCardId = str2;
            this.$displayTitle = str3;
            this.$analyticsFeedbackSubsurface = hatchSubsurface2;
            this.$submitIdeaFeedback = g0u;
            this.$menuOpen$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ExploreIdeaCardDetailSheetKt.FooterWithScrollFade(C1BO.A0F(this.$canScrollDown$delegate), B1V.A00(bfm, new AnonymousClass1(this.$isBuilt, this.$displayActionLabel, this.$executionState, this.$canExecute, this.$executeIdea, this.$analyticsSurface, this.$analyticsSubsurface, this.$impressionMetadata, this.$shareAction, this.$ideaCardId, this.$displayTitle, this.$analyticsFeedbackSubsurface, this.$submitIdeaFeedback, this.$menuOpen$delegate), 1099458146), bfm, 48);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
        public final /* synthetic */ HatchSurface $analyticsSurface;
        public final /* synthetic */ IdeaCardDetail $detail;
        public final /* synthetic */ IdeaCardDetailViewModel $detailViewModel;
        public final /* synthetic */ AHD<IdeaCardItem> $displayItems;
        public final /* synthetic */ String $displaySummary;
        public final /* synthetic */ String $displayTitle;
        public final /* synthetic */ boolean $hasContent;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ boolean $isBuilt;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ IdeaCard $preloadedCard;
        public final /* synthetic */ BQI<String> $selectedItemIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(boolean z, String str, String str2, IdeaCardDetail ideaCardDetail, IdeaCard ideaCard, boolean z2, AHD<IdeaCardItem> ahd, BQI<String> bqi, boolean z3, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str3, IdeaCardDetailViewModel ideaCardDetailViewModel, String str4) {
            super(3);
            this.$hasContent = z;
            this.$displayTitle = str;
            this.$displaySummary = str2;
            this.$detail = ideaCardDetail;
            this.$preloadedCard = ideaCard;
            this.$isLoading = z2;
            this.$displayItems = ahd;
            this.$selectedItemIds = bqi;
            this.$isBuilt = z3;
            this.$analyticsSurface = hatchSurface;
            this.$analyticsSubsurface = hatchSubsurface;
            this.$ideaCardId = str3;
            this.$detailViewModel = ideaCardDetailViewModel;
            this.$loadingDescription = str4;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            BBI bbi;
            AHD ahd;
            AHD ahd2;
            C7384Etj.A0Y(c07c, 0);
            boolean z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                int iOrdinal = -1;
                if (this.$hasContent) {
                    bfm.AgE(-526566746);
                    String str = this.$displayTitle;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.$displaySummary;
                    IdeaCardDetail ideaCardDetail = this.$detail;
                    if (ideaCardDetail == null || (ahd = ideaCardDetail.connectionIds) == null) {
                        IdeaCard ideaCard = this.$preloadedCard;
                        if (ideaCard != null) {
                            ahd = ideaCard.connectionIds;
                        } else {
                            ahd = AHI.A01;
                        }
                    }
                    if (this.$isLoading && ideaCardDetail == null) {
                        ahd2 = AHI.A01;
                    } else {
                        ahd2 = this.$displayItems;
                    }
                    BQI<String> bqi = this.$selectedItemIds;
                    boolean z2 = !this.$isBuilt;
                    boolean zA1U = AnonymousClass002.A1U(bfm, this.$analyticsSurface);
                    HatchSubsurface hatchSubsurface = this.$analyticsSubsurface;
                    if (hatchSubsurface != null) {
                        iOrdinal = hatchSubsurface.ordinal();
                    }
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$detailViewModel, AnonymousClass001.A1R(bfm, this.$ideaCardId, AnonymousClass001.A1a(zA1U, bfm, iOrdinal)));
                    HatchSurface hatchSurface = this.$analyticsSurface;
                    HatchSubsurface hatchSubsurface2 = this.$analyticsSubsurface;
                    String str3 = this.$ideaCardId;
                    IdeaCardDetailViewModel ideaCardDetailViewModel = this.$detailViewModel;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6$1$1(hatchSurface, hatchSubsurface2, str3, ideaCardDetailViewModel);
                        bfm.Ai0(objAaT);
                    }
                    G0V g0v = (G0V) objAaT;
                    if (!this.$isLoading || this.$detail != null) {
                        z = false;
                    }
                    ExploreIdeaCardDetailSheetKt.IdeaCardDetailBody(str, str2, ahd, ahd2, bqi, z2, g0v, z, null, bfm, 0, 256);
                } else {
                    if (this.$isLoading) {
                        bfm.AgE(-526528001);
                        BRg bRgA04 = C10G.A04(C10G.A02, 200.0f);
                        boolean zA65 = bfm.A65(this.$loadingDescription);
                        String str4 = this.$loadingDescription;
                        Object objAaT2 = bfm.AaT();
                        if (zA65 || objAaT2 == C78N.A00) {
                            objAaT2 = new ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6$2$1(str4);
                            bfm.Ai0(objAaT2);
                        }
                        BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT2, false);
                        InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                        bbi = (BBI) bfm;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbi.A0V != null) {
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                            BBI.A0R(bbi, true);
                        }
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    bfm.AgE(-526516278);
                    BS0 bs0 = BRg.A00;
                    BRg bRgA042 = C10G.A04(C10G.A02, 200.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0a2 = AnonymousClass001.A0a();
                    bbi = (BBI) bfm;
                    int iA0J2 = AnonymousClass003.A0J(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA042);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbi.A0V != null) {
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a2, akqA042, bRgA012, iA0J2);
                        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025d);
                        C1822Arm c1822ArmA0W = C06G.A0W(bfm);
                        long jA08 = C06G.A08(bfm);
                        Object objAaT3 = bfm.AaT();
                        if (objAaT3 == C78N.A00) {
                            objAaT3 = ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6$4$1$1.INSTANCE;
                            bfm.Ai0(objAaT3);
                        }
                        AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT3, false), jA08, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                        BBI.A0R(bbi, true);
                    }
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IdeaCardDetailViewModel $detailViewModel;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ boolean $isExecutable;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ IdeaCardDetailOrigin $origin;
        public final /* synthetic */ IdeaCardDetail $seededDetail;
        public final /* synthetic */ HatchExploreViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, HatchExploreViewModel hatchExploreViewModel, IdeaCardDetailViewModel ideaCardDetailViewModel, BRg bRg, IdeaCardDetailOrigin ideaCardDetailOrigin, IdeaCardDetail ideaCardDetail, boolean z, int i, int i2) {
            super(2);
            this.$ideaCardId = str;
            this.$viewModel = hatchExploreViewModel;
            this.$detailViewModel = ideaCardDetailViewModel;
            this.$modifier = bRg;
            this.$origin = ideaCardDetailOrigin;
            this.$seededDetail = ideaCardDetail;
            this.$isExecutable = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ExploreIdeaCardDetailSheetKt.ExploreIdeaCardDetailSheet(this.$ideaCardId, this.$viewModel, this.$detailViewModel, this.$modifier, this.$origin, this.$seededDetail, this.$isExecutable, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$FooterWithScrollFade$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $canScrollDown;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$canScrollDown = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ExploreIdeaCardDetailSheetKt.FooterWithScrollFade(this.$canScrollDown, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$IdeaCardDetailBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C118552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $connectionIds;
        public final /* synthetic */ AHD<IdeaCardItem> $items;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, Boolean, Unit> $onItemSelectionChanged;
        public final /* synthetic */ Set<String> $selectedItemIds;
        public final /* synthetic */ boolean $selectionEnabled;
        public final /* synthetic */ boolean $showInlineLoading;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118552(String str, String str2, AHD<String> ahd, AHD<IdeaCardItem> ahd2, Set<String> set, boolean z, G0V<? super String, ? super Boolean, Unit> g0v, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$connectionIds = ahd;
            this.$items = ahd2;
            this.$selectedItemIds = set;
            this.$selectionEnabled = z;
            this.$onItemSelectionChanged = g0v;
            this.$showInlineLoading = z2;
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
            ExploreIdeaCardDetailSheetKt.IdeaCardDetailBody(this.$title, this.$summary, this.$connectionIds, this.$items, this.$selectedItemIds, this.$selectionEnabled, this.$onItemSelectionChanged, this.$showInlineLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$IdeaDetailCta$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $actionLabel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ IdeaCardExecutionState $executionState;
        public final /* synthetic */ boolean $isBuilt;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExecute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, String str, IdeaCardExecutionState ideaCardExecutionState, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isBuilt = z;
            this.$actionLabel = str;
            this.$executionState = ideaCardExecutionState;
            this.$enabled = z2;
            this.$onExecute = function0;
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
            ExploreIdeaCardDetailSheetKt.IdeaDetailCta(this.$isBuilt, this.$actionLabel, this.$executionState, this.$enabled, this.$onExecute, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$IdeaIncludedToggleRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C118563 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ IdeaCardItem $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118563(IdeaCardItem ideaCardItem, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$item = ideaCardItem;
            this.$selected = z;
            this.$enabled = z2;
            this.$onToggle = g0u;
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
            ExploreIdeaCardDetailSheetKt.IdeaIncludedToggleRow(this.$item, this.$selected, this.$enabled, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExploreIdeaCardDetailSheet(java.lang.String r93, com.facebook.aura.explore.model.HatchExploreViewModel r94, com.facebook.aura.explore.model.IdeaCardDetailViewModel r95, X.BRg r96, com.facebook.aura.explore.repo.IdeaCardDetailOrigin r97, com.facebook.aura.explore.repo.IdeaCardDetail r98, boolean r99, X.BFM r100, int r101, int r102) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt.ExploreIdeaCardDetailSheet(java.lang.String, com.facebook.aura.explore.model.HatchExploreViewModel, com.facebook.aura.explore.model.IdeaCardDetailViewModel, X.BRg, com.facebook.aura.explore.repo.IdeaCardDetailOrigin, com.facebook.aura.explore.repo.IdeaCardDetail, boolean, X.BFM, int, int):void");
    }

    public static final void IdeaCardDetailBody(String str, String str2, AHD<String> ahd, AHD<IdeaCardItem> ahd2, Set<String> set, boolean z, G0V<? super String, ? super Boolean, Unit> g0v, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-77737157);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, ahd2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, set, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0v);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0u(bfm, z2);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(bRg2.then(c1062ATq), 0.0f, 0.0f, 0.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C2 = C3U4.A0C(bs0, 20.0f, 0.0f, 20.0f, 10.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ExploreIdeaCardDetailSheetKt$IdeaCardDetailBody$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0C2, objAaT, false), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            IdeaConnectionContextKt.IdeaConnectionContext(ahd, C3U4.A0C(bs0, 20.0f, 0.0f, 20.0f, 10.0f), bfm, ((iA0d >> 6) & 14) | 48, 0);
            if (str2 == null || str2.length() == 0) {
                bfm.AgE(1182633597);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0C(bs0, 20.0f, 0.0f, 20.0f, 20.0f), C06G.A0C(bfm), AnonymousClass006.A0k(bfm, 1182410459).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0d >> 3) & 14) | 48, 0, 16368);
                BBI.A0R(bbi, false);
            }
            if (!ahd2.isEmpty() || z2) {
                bfm.AgE(1182685088);
                AuraDividerKt.AuraDivider(null, AuraDividerStyle.Secondary.INSTANCE, false, bfm, 48, 5);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1182743709);
                BBI.A0R(bbi, false);
            }
            if (ahd2.isEmpty()) {
                bfm.AgE(1183910301);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1182808995);
                BRg bRgA0C3 = C3U4.A0C(c1062ATq, 20.0f, 20.0f, 20.0f, 10.0f);
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 8.0f);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C3);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0V, g0v2);
                BPg.A02(bfm, akqA042, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025f);
                C1822Arm c1822ArmA0X = C06G.A0X(bfm);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, c90m.AiP(bs0, 1.0f, true), C06G.A0L(bfm, akh), c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A04(bs0, 24.0f), BOf.A00(bfm, R.drawable.aura_clipboard_16, 0), AuraIconSize.SMALL, null, C06G.A0G(bfm, akh), null, bfm, (AVy.$stable << 3) | 3462, 32);
                BBI.A0R(bbi, true);
                for (IdeaCardItem ideaCardItem : ahd2) {
                    boolean zContains = set.contains(ideaCardItem.itemId);
                    boolean zA1T = AnonymousClass001.A1T(bfm, ideaCardItem, AnonymousClass005.A1C(iA0d));
                    Object objAaT2 = bfm.AaT();
                    if (zA1T || objAaT2 == obj) {
                        objAaT2 = new ExploreIdeaCardDetailSheetKt$IdeaCardDetailBody$1$3$1$1(g0v, ideaCardItem);
                        bfm.Ai0(objAaT2);
                    }
                    IdeaIncludedToggleRow(ideaCardItem, zContains, z, (G0U) objAaT2, null, bfm, (iA0d >> 9) & 896, 16);
                }
                BBI.A0R(bbi, false);
            }
            if (z2) {
                bfm.AgE(1183944215);
                BRg bRgA04 = C10G.A04(c1062ATq, 120.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v2);
                BPg.A02(bfm, akqA043, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(1184103741);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118552(str, str2, ahd, ahd2, set, z, g0v, z2, bRg2, i, i2);
        }
    }

    public static final void IdeaDetailCta(boolean z, String str, IdeaCardExecutionState ideaCardExecutionState, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(1208490716);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass005.A0A(bfm, ideaCardExecutionState);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0n |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0n, 74898), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(1731278654);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120252);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$ExploreIdeaCardDetailSheetKt.lambda$1556007039;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ExploreIdeaCardDetailSheetKt$IdeaDetailCta$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA0R, auraLabelButtonStylePrimary, auraButtonSize, g0w, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 807075840, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134200709);
            } else {
                bfm.AgE(1731782497);
                if (str == null || str.length() == 0) {
                    bfm.AgE(1718434196);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120253);
                } else {
                    strA01 = str;
                    bfm.AgE(1718432677);
                }
                AnonymousClass001.A1D(bfm);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, AnonymousClass001.A0R(bRg2), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.LARGE, ComposableSingletons$ExploreIdeaCardDetailSheetKt.f49lambda$1562717752, false, false, z2, AnonymousClass002.A1Z(ideaCardExecutionState, IdeaCardExecutionState.EXECUTING), false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0n << 18) & 1879048192) | 1769472, iA0n & 57344, 0, 134199685);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, str, ideaCardExecutionState, z2, function0, bRg2, i, i2);
        }
    }

    public static final void IdeaIncludedToggleRow(IdeaCardItem ideaCardItem, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2088600659);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ideaCardItem) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1YD c1yd = new C1YD(1);
            boolean zA1E = AnonymousClass003.A1E(iA0T) | AnonymousClass001.A1N(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1E || objAaT == C78N.A00) {
                objAaT = new ExploreIdeaCardDetailSheetKt$IdeaIncludedToggleRow$1$1(g0u, z);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0B = C3U4.A0B(C0v2.A01(bRgA0R, c1yd, (G0U) objAaT, z, z2), 20.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = ideaCardItem.title;
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).subheadlineEmphasized;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0L(bfm, akh), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String str2 = ideaCardItem.summary;
            if (str2.length() > 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A04(bs0, 2.0f), C06G.A0I(bfm, akh), AnonymousClass006.A0k(bfm, 31768249).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(31981839);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            int i4 = R.drawable.aura_circle_outline;
            if (z) {
                i4 = R.drawable.circle_check_wght400_filled_24;
            }
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long j = z ? AnonymousClass006.A0i(bfm, akh, -1483129043).link : AnonymousClass006.A0i(bfm, akh, -1483127728).secondaryIcon.enabled;
            BBI.A0R(bbi, false);
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A04(bs0, 24.0f), aVyA00, auraIconSize, null, j, null, bfm, (AVy.$stable << 3) | 3462, 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118563(ideaCardItem, z, z2, g0u, bRg2, i, i2);
        }
    }

    public static final void logIdeaDetailClick(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(hatchSurface, hatchSubsurface, HatchScreen.IDEA_DETAIL, hatchComponent, null, map, null);
    }

    public static final void logIdeaDetailCloseClick(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map) {
        logIdeaDetailClick(hatchSurface, hatchSubsurface, HatchComponent.CLOSE_BUTTON, map);
    }

    public static final void FooterWithScrollFade(boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-2023424617);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            C1062ATq c1062ATq = C10G.A02;
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
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
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (z) {
                bfm.AgE(-2011923854);
                float f = ScrollFadeGradientHeight;
                C1b8.A05(bfm, AYD.A01(C10G.A04(c1062ATq, f), 0.0f, -f), C1EQ.A01(AnonymousClass004.A17(new B6A(B6A.A06), AnonymousClass002.A0c(bfm).modal), 0.0f, Float.POSITIVE_INFINITY));
            } else {
                bfm.AgE(-2011536571);
            }
            BBI.A0R(bbi, false);
            BRg bRgA09 = C3U4.A09(c1062ATq, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0n >> 3, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, g0v, i);
        }
    }

    public static final String toCardType(IdeaCardLayout ideaCardLayout) {
        return AnonymousClass006.A0x(ideaCardLayout);
    }
}
