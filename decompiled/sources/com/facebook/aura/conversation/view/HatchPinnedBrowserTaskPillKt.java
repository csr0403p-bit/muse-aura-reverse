package com.facebook.aura.conversation.view;

import X.AHD;
import X.AII;
import X.AIM;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BN;
import X.C1BO;
import X.C1Cd;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1YD;
import X.C1b8;
import X.C1er;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7462Ewq;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.browsertask.view.BrowserTaskCardContentKt;
import com.facebook.aura.conversation.view.MC;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationData;
import com.facebook.aura.model.BrowserTaskScreenshot;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchInlineBannerKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchPinnedBrowserTaskPillKt {
    public static final String PINNED_BROWSER_TASK_DEDUPE_PREFIX = "pinned_browser_task:";
    public static final float PinnedBrowserThumbnailHeight = 44.0f;
    public static final float PinnedBrowserThumbnailWidth = 70.0f;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchPinnedBrowserTaskPillKt.class, "showBrowserBannerAlways", "getShowBrowserBannerAlways()Z", 1)};
    public static final C1D3 PinnedBrowserThumbnailShape = C1D8.A00(10.0f);
    public static final ContextChain THUMBNAIL_CONTEXT_CHAIN = new ContextChain(null, "pi", "HatchPinnedBrowserTaskPill");
    public static final C31u showBrowserBannerAlways$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.show_browser_banner_always);

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
        public final /* synthetic */ C1BO<BrowserTaskPresentation> $currentTask$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ Function0<Unit> $onScrollToCard;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ MutableState<String> $scrollTargetKey$delegate;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ MutableState<BrowserTaskPresentation> $stopTarget$delegate;
        public final /* synthetic */ BrowserTaskPresentation $task;
        public final /* synthetic */ BrowserTaskMessage $taskMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BrowserTaskPresentation browserTaskPresentation, String str, Function0<Unit> function0, BrowserTaskMessage browserTaskMessage, C3UX c3ux, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, LazyListState lazyListState, C1BO<BrowserTaskPresentation> c1bo2, MutableState<BrowserTaskPresentation> mutableState, MutableState<String> mutableState2) {
            super(3);
            this.$task = browserTaskPresentation;
            this.$sideChatSessionId = str;
            this.$onScrollToCard = function0;
            this.$taskMessage = browserTaskMessage;
            this.$scope = c3ux;
            this.$currentItems$delegate = c1bo;
            this.$listState = lazyListState;
            this.$currentTask$delegate = c1bo2;
            this.$stopTarget$delegate = mutableState;
            this.$scrollTargetKey$delegate = mutableState2;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$task != null) {
                bfm.AgE(767687535);
                bfm.Ag8(1133143013, this.$task.browserTaskId);
                BrowserTaskPresentation browserTaskPresentation = this.$task;
                C1BO<BrowserTaskPresentation> c1bo = this.$currentTask$delegate;
                float f = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
                BrowserTaskPresentation browserTaskPresentationA0S = C3cH.A0S(c1bo);
                boolean zAreEqual = C7384Etj.areEqual(browserTaskPresentationA0S != null ? browserTaskPresentationA0S.browserTaskId : null, this.$task.browserTaskId);
                String str = this.$sideChatSessionId;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$sideChatSessionId, bfm.A67(this.$task));
                BrowserTaskPresentation browserTaskPresentation2 = this.$task;
                String str2 = this.$sideChatSessionId;
                MutableState<BrowserTaskPresentation> mutableState = this.$stopTarget$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$1$1(browserTaskPresentation2, str2, mutableState);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$listState, AnonymousClass001.A1R(bfm, this.$currentItems$delegate, AnonymousClass001.A1T(bfm, this.$scope, AnonymousClass001.A1R(bfm, this.$taskMessage, AnonymousClass001.A1R(bfm, this.$onScrollToCard, AnonymousClass001.A1R(bfm, this.$sideChatSessionId, bfm.A67(this.$task)))))));
                BrowserTaskPresentation browserTaskPresentation3 = this.$task;
                String str3 = this.$sideChatSessionId;
                Function0<Unit> function02 = this.$onScrollToCard;
                BrowserTaskMessage browserTaskMessage = this.$taskMessage;
                C3UX c3ux = this.$scope;
                MutableState<String> mutableState2 = this.$scrollTargetKey$delegate;
                LazyListState lazyListState = this.$listState;
                C1BO<AHD<HatchConversationListItem>> c1bo2 = this.$currentItems$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA1R2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$2$1(browserTaskPresentation3, str3, function02, browserTaskMessage, c3ux, mutableState2, lazyListState, c1bo2);
                    bfm.Ai0(objAaT2);
                }
                HatchPinnedBrowserTaskPillKt.PinnedBrowserTaskRow(browserTaskPresentation, zAreEqual, str, function0, (Function0) objAaT2, null, bfm, BrowserTaskPresentation.$stable, 32);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(768916654);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onScrollToCard;
        public final /* synthetic */ G0U<Boolean, Unit> $onVisibilityChanged;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ boolean $suppressed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(LazyListState lazyListState, AHD<? extends HatchConversationListItem> ahd, boolean z, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$listState = lazyListState;
            this.$listItems = ahd;
            this.$suppressed = z;
            this.$onVisibilityChanged = g0u;
            this.$onScrollToCard = function0;
            this.$sideChatSessionId = str;
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
            HatchPinnedBrowserTaskPillKt.HatchPinnedBrowserTaskPill(this.$listState, this.$listItems, this.$suppressed, this.$onVisibilityChanged, this.$onScrollToCard, this.$sideChatSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$PinnedBrowserTaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C115072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BrowserTaskPresentation $browserTask;
        public final /* synthetic */ boolean $canOpen;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ boolean $useLiveThumbnail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115072(boolean z, BrowserTaskPresentation browserTaskPresentation, boolean z2, String str) {
            super(2);
            this.$canOpen = z;
            this.$browserTask = browserTaskPresentation;
            this.$useLiveThumbnail = z2;
            this.$sideChatSessionId = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$canOpen) {
                    bfm.AgE(1708269675);
                    HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnail(this.$browserTask, this.$useLiveThumbnail, this.$sideChatSessionId, null, bfm, BrowserTaskPresentation.$stable, 8);
                } else {
                    bfm.AgE(1708489465);
                    AnonymousClass007.A0z(bfm, BOf.A00(bfm, BrowserTaskCardContentKt.iconRes(this.$browserTask.getDisplayState()), 0), AuraIconSize.SMALL, BrowserTaskCardContentKt.browserTaskIconTint(this.$browserTask.getDisplayState(), bfm, 0));
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$PinnedBrowserTaskRow$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onStop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0) {
            super(2);
            this.$onStop = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201af), null, null, AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.ROUNDED, bfm, 54, 0), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, this.$onStop, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201293);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$PinnedBrowserTaskRow$4, reason: invalid class name and case insensitive filesystem */
    public final class C115084 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BrowserTaskPresentation $browserTask;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onStop;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ boolean $useLiveThumbnail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115084(BrowserTaskPresentation browserTaskPresentation, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$browserTask = browserTaskPresentation;
            this.$useLiveThumbnail = z;
            this.$sideChatSessionId = str;
            this.$onStop = function0;
            this.$onClick = function02;
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
            HatchPinnedBrowserTaskPillKt.PinnedBrowserTaskRow(this.$browserTask, this.$useLiveThumbnail, this.$sideChatSessionId, this.$onStop, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$PinnedBrowserThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C115092 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BrowserTaskPresentation $browserTask;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ boolean $useLiveThumbnail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115092(BrowserTaskPresentation browserTaskPresentation, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$browserTask = browserTaskPresentation;
            this.$useLiveThumbnail = z;
            this.$sideChatSessionId = str;
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
            HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnail(this.$browserTask, this.$useLiveThumbnail, this.$sideChatSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchPinnedBrowserTaskPill(androidx.compose.foundation.lazy.LazyListState r39, X.AHD<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r40, boolean r41, X.G0U<? super java.lang.Boolean, kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, java.lang.String r44, X.BRg r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt.HatchPinnedBrowserTaskPill(androidx.compose.foundation.lazy.LazyListState, X.AHD, boolean, X.G0U, kotlin.jvm.functions.Function0, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void PinnedBrowserTaskRow(BrowserTaskPresentation browserTaskPresentation, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1838223270);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(browserTaskPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new BrowserTaskNavigation(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            boolean zCanOpenTask = ((BrowserTaskNavigation) objAaT).canOpenTask(browserTaskPresentation);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            String str2 = browserTaskPresentation.browserTaskId;
            boolean zA1D = AnonymousClass003.A1D(iA05) | bfm.A65(str2);
            Object objAaT2 = bfm.AaT();
            if (zA1D || objAaT2 == C78N.A00) {
                objAaT2 = pinnedBrowserTaskMetadata(str2, str);
                bfm.Ai0(objAaT2);
            }
            int i4 = BrowserTaskPresentation.$stable;
            int i5 = iA05 & 14;
            String strBrowserTaskHeaderText = BrowserTaskCardContentKt.browserTaskHeaderText(browserTaskPresentation, bfm, i4 | i5);
            String strBrowserTaskSecondaryText = BrowserTaskCardContentKt.browserTaskSecondaryText(browserTaskPresentation, bfm, i5 | i4);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.HEADER, HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(str)), HatchComponent.BROWSER_TASK_ROW, null, (Map) objAaT2, null, 500L, 0.0f, FGI.A0M(PINNED_BROWSER_TASK_DEDUPE_PREFIX, str2), null, null);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass005.A1M(iA05);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPinnedBrowserTaskPillKt$PinnedBrowserTaskRow$1$1(c0dxA0T, function02);
                bfm.Ai0(objAaT3);
            }
            HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(strBrowserTaskHeaderText, B1V.A00(bfm, new C115072(zCanOpenTask, browserTaskPresentation, z, str), -717620723), C0v5.A04(bRgHatchImpression, c1ydA0A, null, (Function0) objAaT3, true), strBrowserTaskSecondaryText, B1V.A00(bfm, new AnonymousClass3(function0), -1157400432), null, 0L, 0.0f, null, 0.0f, 0.0f, null, 0L, 0, null, 0L, 0, bfm, 24624, 0, 131040);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115084(browserTaskPresentation, z, str, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final void PinnedBrowserThumbnail(BrowserTaskPresentation browserTaskPresentation, boolean z, String str, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BBI bbiA0M;
        String str2;
        String str3;
        BRg bRg2 = bRg;
        bfm.AgG(-563238763);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(browserTaskPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = BrowserTaskPresentationStore.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            BrowserTaskPresentationStore browserTaskPresentationStore = (BrowserTaskPresentationStore) objAaT;
            Object objResolveRawAssetUrl = null;
            if (z) {
                bfm.AgE(-106556966);
                C1BN<String> c1bn = browserTaskPresentationStore.thumbnailUri;
                i3 = 0;
                str2 = (String) C1BO.A07(bfm, c1bn);
                bbiA0M = C3cG.A07(bfm);
            } else {
                i3 = 0;
                bbiA0M = AnonymousClass002.A0M(bfm, 991712232);
                str2 = null;
            }
            BrowserTaskScreenshot browserTaskScreenshot = browserTaskPresentation.latestScreenshot;
            boolean zA1K = AnonymousClass003.A1K(bfm, browserTaskScreenshot != null ? browserTaskScreenshot.url : null, abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                BrowserTaskScreenshot browserTaskScreenshot2 = browserTaskPresentation.latestScreenshot;
                if (browserTaskScreenshot2 != null && (str3 = browserTaskScreenshot2.url) != null) {
                    objResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str3, abstractC3358CGzA0h);
                }
                bfm.Ai0(objResolveRawAssetUrl);
                objAaT2 = objResolveRawAssetUrl;
            }
            String str4 = (String) objAaT2;
            if (str2 == null) {
                str2 = str4;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, BrowserTaskCardContentKt.openBrowserLabelRes(browserTaskPresentation));
            boolean zA652 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = new BrowserTaskNavigation(abstractC3358CGzA0h);
                bfm.Ai0(objAaT3);
            }
            BrowserTaskNavigation browserTaskNavigation = (BrowserTaskNavigation) objAaT3;
            MutableState mutableStateA00 = C1er.A00(bfm, browserTaskPresentation);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            boolean zA1T = AnonymousClass005.A1T(bfm, auraNavigatorA0b, browserTaskPresentation.browserTaskId, c0dxA0T, bfm.A65(abstractC3358CGzA0h)) | AnonymousClass004.A1K(iA05);
            Object objAaT4 = bfm.AaT();
            if (zA1T || objAaT4 == C78N.A00) {
                objAaT4 = new HatchPinnedBrowserTaskPillKt$PinnedBrowserThumbnail$openPreview$1$1(c0dxA0T, str, browserTaskNavigation, auraNavigatorA0b, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            float f = PinnedBrowserThumbnailWidth;
            BRg bRgA04 = C0v5.A04(C11U.A03(C10G.A0C(bRg2, f, PinnedBrowserThumbnailHeight), PinnedBrowserThumbnailShape), C3cG.A0A(i3), strA01, (Function0) objAaT4, browserTaskNavigation.canOpenTask(browserTaskPresentation));
            if (str2 != null) {
                bfm.AgE(993076295);
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, bRgA04, B18.A00, strA01, THUMBNAIL_CONTEXT_CHAIN, i3, new C1DG(f), 0L, i3, i3, i3, null, null, null, null, bfm, 1573248, i3, 32672);
            } else {
                bfm.AgE(993350986);
                long jBrowserTaskIconTint = BrowserTaskCardContentKt.browserTaskIconTint(browserTaskPresentation.getDisplayState(), bfm, i3);
                BRg bRgA00 = C1b8.A00(bRgA04, 0.1f, jBrowserTaskIconTint);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRgA00);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA0M.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA0M, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, BrowserTaskCardContentKt.iconRes(browserTaskPresentation.getDisplayState()), i3), AuraIconSize.SMALL, strA01, jBrowserTaskIconTint, null, bfm, AnonymousClass001.A03(), 33);
                BBI.A0R(bbiA0M, true);
            }
            BBI.A0R(bbiA0M, i3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115092(browserTaskPresentation, z, str, bRg2, i, i2);
        }
    }

    public static final boolean getShowBrowserBannerAlways() {
        return AnonymousClass001.A1X(C31u.A00(showBrowserBannerAlways$delegate, $$delegatedProperties));
    }

    public static final void logPinnedBrowserClick(HatchComponent hatchComponent, String str, String str2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(str2)), hatchComponent, null, pinnedBrowserTaskMetadata(str, str2), null);
    }

    public static final void logPinnedStopDialogDismiss(String str, String str2) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(str2)), HatchComponent.CANCEL_BUTTON, null, pinnedBrowserTaskMetadata(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.BrowserTaskMessage rememberPinnedBrowserTaskMessage(androidx.compose.foundation.lazy.LazyListState r5, java.util.List<com.facebook.aura.conversation.view.BrowserTaskMessage> r6, java.lang.String r7, X.BFM r8, int r9) {
        /*
            r0 = r9 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r8.A65(r5)
            if (r0 != 0) goto L12
        Ld:
            r1 = r9 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r4 = r8.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L26
        L1d:
            com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$rememberPinnedBrowserTaskMessage$visibleIndices$2$1 r0 = new com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$rememberPinnedBrowserTaskMessage$visibleIndices$2$1
            r0.<init>(r5)
            X.BBP r4 = X.AnonymousClass003.A0R(r8, r0)
        L26:
            X.1BO r4 = (X.C1BO) r4
            java.util.ListIterator r2 = X.C3cG.A0n(r6)
        L2c:
            boolean r0 = r2.hasPrevious()
            r5 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r2.previous()
            r0 = r1
            com.facebook.aura.conversation.view.BrowserTaskMessage r0 = (com.facebook.aura.conversation.view.BrowserTaskMessage) r0
            java.lang.String r0 = r0.messageKey
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L2c
        L42:
            com.facebook.aura.conversation.view.BrowserTaskMessage r1 = (com.facebook.aura.conversation.view.BrowserTaskMessage) r1
            if (r1 != 0) goto L6d
            java.util.ListIterator r3 = X.C3cG.A0n(r6)
        L4a:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L6a
            java.lang.Object r2 = r3.previous()
            r0 = r2
            com.facebook.aura.conversation.view.BrowserTaskMessage r0 = (com.facebook.aura.conversation.view.BrowserTaskMessage) r0
            java.lang.Object r1 = r4.getValue()
            java.util.Set r1 = (java.util.Set) r1
            int r0 = r0.index
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4a
            r5 = r2
        L6a:
            r1 = r5
            com.facebook.aura.conversation.view.BrowserTaskMessage r1 = (com.facebook.aura.conversation.view.BrowserTaskMessage) r1
        L6d:
            return r1
        L6e:
            r1 = r5
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt.rememberPinnedBrowserTaskMessage(androidx.compose.foundation.lazy.LazyListState, java.util.List, java.lang.String, X.BFM, int):com.facebook.aura.conversation.view.BrowserTaskMessage");
    }

    public static final AHD<HatchConversationListItem> HatchPinnedBrowserTaskPill$lambda$4(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
        return (AHD) c1bo.getValue();
    }

    public static final /* synthetic */ AHD access$HatchPinnedBrowserTaskPill$lambda$4(C1BO c1bo) {
        return (AHD) c1bo.getValue();
    }

    public static final List<BrowserTaskMessage> browserTaskMessages(List<? extends HatchConversationListItem> list, Set<String> set) {
        HatchConversationListItem.Message message;
        AHD<HatchWidgetPresentation> ahd;
        BrowserTaskPresentationData browserTaskPresentationData;
        BrowserTaskPresentation browserTaskPresentation;
        String str;
        AII aiiA17 = AIM.A17();
        int i = 0;
        for (HatchConversationListItem hatchConversationListItem : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchConversationListItem hatchConversationListItem2 = hatchConversationListItem;
            if ((hatchConversationListItem2 instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem2) != null && (ahd = message.message.presentations) != null) {
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    HatchPresentationData hatchPresentationData = ((HatchWidgetPresentation) it.next()).data;
                    if ((hatchPresentationData instanceof BrowserTaskPresentationData) && (browserTaskPresentationData = (BrowserTaskPresentationData) hatchPresentationData) != null && (browserTaskPresentation = browserTaskPresentationData.browserTask) != null && (str = browserTaskPresentation.browserTaskId) != null && set.contains(str)) {
                        aiiA17.add(new BrowserTaskMessage(i, message.key, str));
                    }
                }
            }
            i = i2;
        }
        return AIM.A18(aiiA17);
    }

    public static final Map<String, String> pinnedBrowserTaskMetadata(String str, String str2) {
        return HatchInteractionEnumsKt.chatThreadLogMetadata(AnonymousClass002.A1Y(str2), str2, null, AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str));
    }
}
