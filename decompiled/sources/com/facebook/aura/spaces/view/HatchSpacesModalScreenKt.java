package com.facebook.aura.spaces.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1BO;
import X.C1DG;
import X.C2VU;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2k;
import X.HxE;
import X.HxS;
import X.InterfaceC05151eP;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSpacesModalScreenKt {
    public static final OwnedSpacePageLogging DefaultOwnedSpacePageLogging = new OwnedSpacePageLogging(null);
    public static final int SPACE_SLUG_LOG_LIMIT = 10;
    public static final String TAG = "HatchSpacesModalScreen";

    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpaceTabScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<InterfaceC05151eP, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ boolean $isModal;
        public final /* synthetic */ boolean $isShared;
        public final /* synthetic */ ArtifactPlacementRequest $moveToLibraryRequest;
        public final /* synthetic */ ArtifactPlacementRequest $moveToSpacesRequest;
        public final /* synthetic */ Function0<Unit> $onDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRenamed;
        public final /* synthetic */ SpaceRenderState $renderState;
        public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $title;
        public final /* synthetic */ boolean $useNavigationArtifact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SpaceRenderState spaceRenderState, String str, String str2, String str3, Function0<Unit> function0, boolean z, boolean z2, boolean z3, SpaceConstructionStatus spaceConstructionStatus, String str4, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState) {
            super(4);
            this.$renderState = spaceRenderState;
            this.$slug = str;
            this.$spaceId = str2;
            this.$title = str3;
            this.$onDeleted = function0;
            this.$isModal = z;
            this.$useNavigationArtifact = z2;
            this.$isShared = z3;
            this.$constructionStatus = spaceConstructionStatus;
            this.$imageUrl = str4;
            this.$moveToLibraryRequest = artifactPlacementRequest;
            this.$moveToSpacesRequest = artifactPlacementRequest2;
            this.$onRenamed = g0u;
            this.$showMenu$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, C1DG c1dg, BFM bfm, Integer num) {
            m2197invokeziNgDLE(interfaceC05151eP, c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ziNgDLE, reason: not valid java name */
        public final void m2197invokeziNgDLE(InterfaceC05151eP interfaceC05151eP, float f, BFM bfm, int i) {
            C7384Etj.A0Y(interfaceC05151eP, 0);
            int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, interfaceC05151eP) : i;
            if ((i & 48) == 0) {
                iA0d |= AnonymousClass004.A05(bfm, f);
            }
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            if (this.$renderState == SpaceRenderState.MISSING || HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
                bfm.AgE(815740861);
            } else {
                bfm.AgE(814931699);
                String str = this.$slug;
                String str2 = this.$spaceId;
                String str3 = this.$title;
                boolean zA0A = MutableState.A0A((MutableState) this.$showMenu$delegate);
                MutableState<Boolean> mutableState = this.$showMenu$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new HatchSpacesModalScreenKt$HatchSpaceTabScreen$2$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                Function0<Unit> function02 = this.$onDeleted;
                if (this.$isModal && !this.$useNavigationArtifact) {
                    z = true;
                }
                HatchSpacesModalScreenKt.m2192SpaceOverflowMenuWHI4liM(str, str2, str3, zA0A, function0, function02, z, this.$isShared, this.$constructionStatus, this.$imageUrl, this.$moveToLibraryRequest, this.$moveToSpacesRequest, this.$onRenamed, interfaceC05151eP.A4C(C2VU.A0D, BRg.A00), AnonymousClass005.A0K(C06G.A00(bfm), f + 8.0f), bfm, RuntimeInternals.IOPRIO_BACKGROUND, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpaceTabScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2k<C1DG, G0V<? super Boolean, ? super Function0<? extends Unit>, ? extends Unit>, G0U<? super B6A, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $impressionReady;
        public final /* synthetic */ boolean $isModal;
        public final /* synthetic */ OwnedSpacePageLogging $logging;
        public final /* synthetic */ SpaceRenderState $renderState;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ SpaceCard $spaceCard;
        public final /* synthetic */ String $spaceId;

        /* renamed from: invoke--orJrPs, reason: not valid java name */
        public final void m2198invokeorJrPs(float f, G0V<? super Boolean, ? super Function0<Unit>, Unit> g0v, G0U<? super B6A, Unit> g0u, BFM bfm, int i) {
            C7384Etj.A0Y(g0u, 2);
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A0U(bfm, g0v);
            }
            if ((i & 384) == 0) {
                iA04 |= AnonymousClass004.A0V(bfm, g0u);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1L(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            SpaceRenderState spaceRenderState = this.$renderState;
            SpaceCard spaceCard = this.$spaceCard;
            String str = this.$spaceId;
            boolean z = this.$isModal;
            String str2 = this.$slug;
            HatchSpacesModalScreenKt.m2193SpaceScreenContent7SJwSw(spaceRenderState, spaceCard, str, FGI.A0M(z ? HtmlSpacesWebViewKt.SPACE_MODAL_CACHE_KEY_PREFIX : HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX, str2), f, null, this.$impressionReady, g0v, g0u, null, this.$logging, bfm, AnonymousClass005.A03(iA04 << 18, (iA04 << 12) & 57344), 0, 544);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SpaceRenderState spaceRenderState, SpaceCard spaceCard, String str, boolean z, String str2, boolean z2, OwnedSpacePageLogging ownedSpacePageLogging) {
            super(5);
            this.$renderState = spaceRenderState;
            this.$spaceCard = spaceCard;
            this.$spaceId = str;
            this.$isModal = z;
            this.$slug = str2;
            this.$impressionReady = z2;
            this.$logging = ownedSpacePageLogging;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, G0V<? super Boolean, ? super Function0<? extends Unit>, ? extends Unit> g0v, G0U<? super B6A, ? extends Unit> g0u, BFM bfm, Integer num) {
            m2198invokeorJrPs(c1dg.A00, g0v, g0u, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpaceTabScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ boolean $impressionReady;
        public final /* synthetic */ boolean $isModal;
        public final /* synthetic */ boolean $isShared;
        public final /* synthetic */ String $menuParentContentKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ArtifactPlacementRequest $moveToLibraryRequest;
        public final /* synthetic */ ArtifactPlacementRequest $moveToSpacesRequest;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ Function0<Unit> $onDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRenamed;
        public final /* synthetic */ SpaceRenderState $renderState;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ SpaceCard $spaceCard;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $title;
        public final /* synthetic */ boolean $useNavigationArtifact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, String str3, SpaceRenderState spaceRenderState, SpaceCard spaceCard, String str4, boolean z, SpaceConstructionStatus spaceConstructionStatus, String str5, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$slug = str;
            this.$menuParentContentKey = str2;
            this.$title = str3;
            this.$renderState = spaceRenderState;
            this.$spaceCard = spaceCard;
            this.$spaceId = str4;
            this.$isShared = z;
            this.$constructionStatus = spaceConstructionStatus;
            this.$imageUrl = str5;
            this.$moveToLibraryRequest = artifactPlacementRequest;
            this.$moveToSpacesRequest = artifactPlacementRequest2;
            this.$useNavigationArtifact = z2;
            this.$impressionReady = z3;
            this.$isModal = z4;
            this.$onBackClick = function0;
            this.$onDeleted = function02;
            this.$onRenamed = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpacesModalScreenKt.HatchSpaceTabScreen(this.$slug, this.$menuParentContentKey, this.$title, this.$renderState, this.$spaceCard, this.$spaceId, this.$isShared, this.$constructionStatus, this.$imageUrl, this.$moveToLibraryRequest, this.$moveToSpacesRequest, this.$useNavigationArtifact, this.$impressionReady, this.$isModal, this.$onBackClick, this.$onDeleted, this.$onRenamed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpacesModalScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C139684 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isTab;
        public final /* synthetic */ String $menuParentContentKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ Function0<Unit> $onSpaceRemoved;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $tabId;
        public final /* synthetic */ boolean $useNavigationArtifact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139684(String str, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, String str2, String str3, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$onBackClick = function0;
            this.$modifier = bRg;
            this.$onSpaceRemoved = function02;
            this.$tabId = str2;
            this.$menuParentContentKey = str3;
            this.$isTab = z;
            this.$useNavigationArtifact = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpacesModalScreenKt.HatchSpacesModalScreen(this.$slug, this.$onBackClick, this.$modifier, this.$onSpaceRemoved, this.$tabId, this.$menuParentContentKey, this.$isTab, this.$useNavigationArtifact, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceScreenFrame$2, reason: invalid class name and case insensitive filesystem */
    public final class C139692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $adaptsHeaderMode;
        public final /* synthetic */ G2k<C1DG, G0V<? super Boolean, ? super Function0<Unit>, Unit>, G0U<? super B6A, Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isModal;
        public final /* synthetic */ SpacePageLogging $logging;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ Function0<Unit> $onMoreClick;
        public final /* synthetic */ G2j<InterfaceC05151eP, C1DG, BFM, Integer, Unit> $overlay;
        public final /* synthetic */ boolean $showsBackCaret;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ SpaceTabScreenKey $tabRoot;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C139692(SpaceTabScreenKey spaceTabScreenKey, String str, boolean z, boolean z2, boolean z3, String str2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, String str3, SpacePageLogging spacePageLogging, G2j<? super InterfaceC05151eP, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, G2k<? super C1DG, ? super G0V<? super Boolean, ? super Function0<Unit>, Unit>, ? super G0U<? super B6A, Unit>, ? super BFM, ? super Integer, Unit> g2k, int i, int i2, int i3) {
            super(2);
            this.$tabRoot = spaceTabScreenKey;
            this.$title = str;
            this.$showsBackCaret = z;
            this.$isModal = z2;
            this.$adaptsHeaderMode = z3;
            this.$spaceId = str2;
            this.$onBackClick = function0;
            this.$onMoreClick = function02;
            this.$modifier = bRg;
            this.$subtitle = str3;
            this.$logging = spacePageLogging;
            this.$overlay = g2j;
            this.$content = g2k;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpacesModalScreenKt.SpaceScreenFrame(this.$tabRoot, this.$title, this.$showsBackCaret, this.$isModal, this.$adaptsHeaderMode, this.$spaceId, this.$onBackClick, this.$onMoreClick, this.$modifier, this.$subtitle, this.$logging, this.$overlay, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final void SpaceOverflowMenu_WHI4liM$renameSpace(C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, ArtifactsDataSource artifactsDataSource, G0U<? super String, Unit> g0u, View view, String str2, String str3, MutableState<Boolean> mutableState, String str4) {
        AnonymousClass001.A1J(new HatchSpacesModalScreenKt$SpaceOverflowMenu$renameSpace$1(unifiedArtifactsRepository, str, str4, artifactsDataSource, g0u, view, str2, str3, mutableState, null), c3ux);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceRenderState.values().length];
            try {
                AnonymousClass002.A13(SpaceRenderState.MISSING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SpaceRenderState.BUILDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SpaceRenderState.READY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SpaceOverflowMenu_WHI4liM$moveSpace(Function0<Unit> function0, UnifiedArtifactsRepository unifiedArtifactsRepository, C3UX c3ux, PinnedItemsRepository pinnedItemsRepository, View view, String str, String str2, ArtifactPlacementRequest artifactPlacementRequest) {
        SpacesSidebarAnalytics.INSTANCE.logMoveFromSpaceMenu(artifactPlacementRequest);
        if (artifactPlacementRequest.placement != ArtifactPlacement.LIBRARY) {
            AnonymousClass001.A1J(new HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$2(unifiedArtifactsRepository, artifactPlacementRequest, pinnedItemsRepository, view, str, str2, null), c3ux);
        } else {
            function0.invoke();
            unifiedArtifactsRepository.setArtifactPlacementDetached(artifactPlacementRequest, new HatchSpacesModalScreenKt$SpaceOverflowMenu$moveSpace$1(pinnedItemsRepository, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* renamed from: SpaceScreenContent-7SJ-wSw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2193SpaceScreenContent7SJwSw(com.facebook.aura.spaces.view.SpaceRenderState r44, com.facebook.aura.spaces.repo.SpaceCard r45, java.lang.String r46, java.lang.String r47, float r48, X.BRg r49, boolean r50, X.G0V<? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> r51, X.G0U<? super X.B6A, kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, com.facebook.aura.spaces.view.SpacePageLogging r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.m2193SpaceScreenContent7SJwSw(com.facebook.aura.spaces.view.SpaceRenderState, com.facebook.aura.spaces.repo.SpaceCard, java.lang.String, java.lang.String, float, X.BRg, boolean, X.G0V, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.spaces.view.SpacePageLogging, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceScreenFrame(com.facebook.aura.navigation.key.SpaceTabScreenKey r55, java.lang.String r56, boolean r57, boolean r58, boolean r59, java.lang.String r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.BRg r63, java.lang.String r64, com.facebook.aura.spaces.view.SpacePageLogging r65, X.G2j<? super X.InterfaceC05151eP, ? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r66, X.G2k<? super X.C1DG, ? super X.G0V<? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>, ? super X.G0U<? super X.B6A, kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r67, X.BFM r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.SpaceScreenFrame(com.facebook.aura.navigation.key.SpaceTabScreenKey, java.lang.String, boolean, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, com.facebook.aura.spaces.view.SpacePageLogging, X.G2j, X.G2k, X.BFM, int, int, int):void");
    }

    public static final void logSpacePageClick(HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.NAV_BAR, HatchSubsurface.TAB_SPACE, HatchScreen.NAV_BAR_EXPANDED, hatchComponent, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.SPACE_ID, str) : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: rememberSpaceHeaderScrim-ek8zF_U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.header.view.ScrimConfig m2196rememberSpaceHeaderScrimek8zF_U(long r3, X.BFM r5, int r6) {
        /*
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r5.A64(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r5.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L34
        L1d:
            r0 = 0
            X.HxE r1 = X.AnonymousClass007.A0g(r0, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.HxE r0 = X.AnonymousClass007.A0g(r0, r3)
            X.HxE[] r0 = new X.HxE[]{r1, r0}
            com.facebook.aura.header.view.ScrimConfig$CustomStops r1 = new com.facebook.aura.header.view.ScrimConfig$CustomStops
            r1.<init>(r0)
            r5.Ai0(r1)
        L34:
            com.facebook.aura.header.view.ScrimConfig$CustomStops r1 = (com.facebook.aura.header.view.ScrimConfig.CustomStops) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.m2196rememberSpaceHeaderScrimek8zF_U(long, X.BFM, int):com.facebook.aura.header.view.ScrimConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.spaces.view.SpaceRenderState spaceRenderState(com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult r3, com.facebook.aura.library.repo.ArtifactItem r4, boolean r5) {
        /*
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Missing r1 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Missing.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r1)
            if (r0 == 0) goto Ld
            if (r5 != 0) goto Ld
        La:
            com.facebook.aura.spaces.view.SpaceRenderState r0 = com.facebook.aura.spaces.view.SpaceRenderState.BUILDING
            return r0
        Ld:
            boolean r0 = X.C7384Etj.areEqual(r3, r1)
            if (r0 == 0) goto L1a
            if (r5 == 0) goto L1a
            if (r4 != 0) goto L1a
            com.facebook.aura.spaces.view.SpaceRenderState r0 = com.facebook.aura.spaces.view.SpaceRenderState.MISSING
            return r0
        L1a:
            boolean r0 = X.C7384Etj.areEqual(r3, r1)
            r1 = 0
            if (r0 == 0) goto L2c
            if (r4 == 0) goto L2a
            com.facebook.aura.model.SpaceConstructionStatus r2 = r4.constructionStatus
        L25:
            com.facebook.aura.model.SpaceConstructionStatus r0 = com.facebook.aura.model.SpaceConstructionStatus.CONSTRUCTING
            if (r2 != r0) goto L2c
            goto La
        L2a:
            r2 = r1
            goto L25
        L2c:
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found
            if (r0 == 0) goto L3a
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Found r3 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found) r3
            if (r3 == 0) goto L3a
            com.facebook.aura.library.repo.UnifiedArtifact r0 = r3.artifact
            if (r0 == 0) goto L3a
            com.facebook.aura.model.SpaceConstructionStatus r1 = r0.constructionStatus
        L3a:
            com.facebook.aura.model.SpaceConstructionStatus r0 = com.facebook.aura.model.SpaceConstructionStatus.CONSTRUCTING
            if (r1 == r0) goto La
            com.facebook.aura.spaces.view.SpaceRenderState r0 = com.facebook.aura.spaces.view.SpaceRenderState.READY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.spaceRenderState(com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult, com.facebook.aura.library.repo.ArtifactItem, boolean):com.facebook.aura.spaces.view.SpaceRenderState");
    }

    public static final String spaceSlugsForLogging(List<ArtifactItem> list) {
        ArrayList arrayList = new ArrayList();
        for (ArtifactItem artifactItem : list) {
            ArtifactSource artifactSource = artifactItem.source;
            if (artifactSource == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE) {
                arrayList.add(artifactItem);
            }
        }
        return FGI.A0M(AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0a(arrayList, 10), HatchSpacesModalScreenKt$spaceSlugsForLogging$2$1.INSTANCE), arrayList.size() > 10 ? FGI.A0H(",+", arrayList.size() - 10) : "");
    }

    public static final /* synthetic */ UnifiedArtifactsRepository.SpaceLookupResult access$HatchSpacesModalScreen$lambda$6(C1BO c1bo) {
        return (UnifiedArtifactsRepository.SpaceLookupResult) c1bo.getValue();
    }

    public static final /* synthetic */ HxE access$SpaceScreenFrame$lambda$1(MutableState mutableState) {
        return (HxE) mutableState.getValue();
    }

    /* renamed from: headerModeForBackground-8_81llA, reason: not valid java name */
    public static final AuraThemeMode m2195headerModeForBackground8_81llA(long j) {
        float fA00 = HxS.A00(j) + 0.05f;
        return 1.05f / fA00 >= fA00 / 0.05f ? AuraThemeMode.DARK : AuraThemeMode.LIGHT;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSpaceTabScreen(java.lang.String r59, java.lang.String r60, java.lang.String r61, com.facebook.aura.spaces.view.SpaceRenderState r62, com.facebook.aura.spaces.repo.SpaceCard r63, java.lang.String r64, boolean r65, com.facebook.aura.model.SpaceConstructionStatus r66, java.lang.String r67, com.facebook.aura.library.repo.ArtifactPlacementRequest r68, com.facebook.aura.library.repo.ArtifactPlacementRequest r69, boolean r70, boolean r71, boolean r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, X.G0U<? super java.lang.String, kotlin.Unit> r75, X.BRg r76, X.BFM r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.HatchSpaceTabScreen(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.spaces.view.SpaceRenderState, com.facebook.aura.spaces.repo.SpaceCard, java.lang.String, boolean, com.facebook.aura.model.SpaceConstructionStatus, java.lang.String, com.facebook.aura.library.repo.ArtifactPlacementRequest, com.facebook.aura.library.repo.ArtifactPlacementRequest, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c9, code lost:
    
        if (r9 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0601, code lost:
    
        if (r9 != null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1 A[PHI: r33
  0x01d1: PHI (r33v5 com.facebook.aura.model.SpaceConstructionStatus) = 
  (r33v3 com.facebook.aura.model.SpaceConstructionStatus)
  (r33v3 com.facebook.aura.model.SpaceConstructionStatus)
  (r33v6 com.facebook.aura.model.SpaceConstructionStatus)
 binds: [B:275:0x0605, B:277:0x060b, B:113:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f9 A[PHI: r0
  0x04f9: PHI (r0v109 java.lang.String) = (r0v169 java.lang.String), (r0v170 java.lang.String) binds: [B:219:0x04f7, B:216:0x04f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05eb A[PHI: r96 r103
  0x05eb: PHI (r96v1 java.lang.String) = (r96v0 java.lang.String), (r96v4 java.lang.String), (r96v4 java.lang.String) binds: [B:262:0x05e7, B:122:0x01f4, B:123:0x01f6] A[DONT_GENERATE, DONT_INLINE]
  0x05eb: PHI (r103v2 boolean) = (r103v1 boolean), (r103v5 boolean), (r103v5 boolean) binds: [B:262:0x05e7, B:122:0x01f4, B:123:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0605 A[PHI: r33
  0x0605: PHI (r33v3 com.facebook.aura.model.SpaceConstructionStatus) = (r33v1 com.facebook.aura.model.SpaceConstructionStatus), (r33v6 com.facebook.aura.model.SpaceConstructionStatus) binds: [B:273:0x0601, B:113:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSpacesModalScreen(java.lang.String r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, X.BRg r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, java.lang.String r107, java.lang.String r108, boolean r109, boolean r110, X.BFM r111, int r112, int r113) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.HatchSpacesModalScreen(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, boolean, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* renamed from: SpaceOverflowMenu-WHI4liM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2192SpaceOverflowMenuWHI4liM(java.lang.String r76, java.lang.String r77, java.lang.String r78, boolean r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, boolean r82, boolean r83, com.facebook.aura.model.SpaceConstructionStatus r84, java.lang.String r85, com.facebook.aura.library.repo.ArtifactPlacementRequest r86, com.facebook.aura.library.repo.ArtifactPlacementRequest r87, X.G0U<? super java.lang.String, kotlin.Unit> r88, X.BRg r89, long r90, X.BFM r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt.m2192SpaceOverflowMenuWHI4liM(java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, com.facebook.aura.model.SpaceConstructionStatus, java.lang.String, com.facebook.aura.library.repo.ArtifactPlacementRequest, com.facebook.aura.library.repo.ArtifactPlacementRequest, X.G0U, X.BRg, long, X.BFM, int, int, int):void");
    }
}
