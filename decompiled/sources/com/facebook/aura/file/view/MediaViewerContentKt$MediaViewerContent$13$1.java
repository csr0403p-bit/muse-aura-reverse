package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC04661Bq;
import X.AbstractC0878AGe;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BL4;
import X.BRg;
import X.C01r;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C1BO;
import X.C1Cd;
import X.C1D3;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.HatchDragDismissState;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$1 extends AbstractC7559F3s implements G2j<C01r, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<BL4> $containerSize$delegate;
    public final /* synthetic */ HatchDragDismissState $dragDismissState;
    public final /* synthetic */ MutableState<Boolean> $isCurrentPageZoomed$delegate;
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ MutableState<Boolean> $isPagerSettled$delegate;
    public final /* synthetic */ boolean $isPlaybackEnabled;
    public final /* synthetic */ boolean $isUserPaused;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ boolean $lockFullscreen;
    public final /* synthetic */ C1D3 $mediaShape;
    public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
    public final /* synthetic */ G0U<Boolean, Unit> $onUserPausedChanged;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ MutableState<Boolean> $showFullscreenVideoControls$delegate;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$13$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<BL4> $containerSize$delegate;
        public final /* synthetic */ HatchDragDismissState $dragDismissState;
        public final /* synthetic */ boolean $isCurrentPage;
        public final /* synthetic */ boolean $isFullscreen;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ MutableState<Boolean> $isPagerSettled$delegate;
        public final /* synthetic */ boolean $isPlaybackEnabled;
        public final /* synthetic */ boolean $isUserPaused;
        public final /* synthetic */ boolean $isVideo;
        public final /* synthetic */ ContentItem $item;
        public final /* synthetic */ boolean $lockFullscreen;
        public final /* synthetic */ C1D3 $mediaShape;
        public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
        public final /* synthetic */ G0U<Boolean, Unit> $onUserPausedChanged;
        public final /* synthetic */ MutableState<Boolean> $showFullscreenVideoControls$delegate;
        public final /* synthetic */ ZoomState $zoomState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ContentItem contentItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, G0U<? super Boolean, Unit> g0u, HatchDragDismissState hatchDragDismissState, G0U<? super Boolean, Unit> g0u2, boolean z7, G0U<? super Boolean, Unit> g0u3, C1D3 c1d3, ZoomState zoomState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<BL4> mutableState3) {
            super(3);
            this.$item = contentItem;
            this.$isCurrentPage = z;
            this.$isPlaybackEnabled = z2;
            this.$isVideo = z3;
            this.$isUserPaused = z4;
            this.$isFullscreen = z5;
            this.$isMuted = z6;
            this.$onMutedChanged = g0u;
            this.$dragDismissState = hatchDragDismissState;
            this.$onFullscreenChanged = g0u2;
            this.$lockFullscreen = z7;
            this.$onUserPausedChanged = g0u3;
            this.$mediaShape = c1d3;
            this.$zoomState = zoomState;
            this.$isPagerSettled$delegate = mutableState;
            this.$showFullscreenVideoControls$delegate = mutableState2;
            this.$containerSize$delegate = mutableState3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            C7384Etj.A0Y(c1Cd, 0);
            boolean z = false;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                ContentItem contentItem = this.$item;
                boolean z2 = this.$isCurrentPage;
                if (z2) {
                    MutableState<Boolean> mutableState = this.$isPagerSettled$delegate;
                    float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                    if (MutableState.A0A((MutableState) mutableState) && this.$isPlaybackEnabled && (!this.$isVideo || !this.$isUserPaused)) {
                        z = true;
                    }
                }
                boolean z3 = this.$isFullscreen;
                boolean z4 = this.$isMuted;
                G0U<Boolean, Unit> g0u = this.$onMutedChanged;
                MutableState<Boolean> mutableState2 = this.$showFullscreenVideoControls$delegate;
                float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                boolean zA0A = MutableState.A0A((MutableState) mutableState2);
                HatchDragDismissState hatchDragDismissState = this.$dragDismissState;
                if (!this.$isCurrentPage) {
                    hatchDragDismissState = null;
                }
                MutableState<Boolean> mutableState3 = this.$showFullscreenVideoControls$delegate;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = new MediaViewerContentKt$MediaViewerContent$13$1$3$2$1(mutableState3);
                    bfm.Ai0(objAaT);
                }
                G0U g0u2 = (G0U) objAaT;
                boolean zA1U = AnonymousClass001.A1U(bfm, this.$lockFullscreen, AnonymousClass001.A1R(bfm, this.$onFullscreenChanged, AnonymousClass001.A1U(bfm, this.$isFullscreen, bfm.A66(this.$isVideo))));
                boolean z5 = this.$isVideo;
                boolean z6 = this.$isFullscreen;
                G0U<Boolean, Unit> g0u3 = this.$onFullscreenChanged;
                boolean z7 = this.$lockFullscreen;
                Object objAaT2 = bfm.AaT();
                if (zA1U || objAaT2 == obj) {
                    objAaT2 = new MediaViewerContentKt$MediaViewerContent$13$1$3$3$1(z5, z6, g0u3, z7);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean zA65 = bfm.A65(this.$onUserPausedChanged);
                G0U<Boolean, Unit> g0u4 = this.$onUserPausedChanged;
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new MediaViewerContentKt$MediaViewerContent$13$1$3$4$1(g0u4);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                boolean zA652 = bfm.A65(this.$onUserPausedChanged);
                G0U<Boolean, Unit> g0u5 = this.$onUserPausedChanged;
                Object objAaT4 = bfm.AaT();
                if (zA652 || objAaT4 == obj) {
                    objAaT4 = new MediaViewerContentKt$MediaViewerContent$13$1$3$5$1(g0u5);
                    bfm.Ai0(objAaT4);
                }
                MediaViewerContentKt.m903MediaPageLUJyAio(contentItem, z2, z, z3, z4, g0u, zA0A, hatchDragDismissState, g0u2, function0, function02, (Function0) objAaT4, this.$mediaShape, this.$zoomState, MediaViewerContentKt.MediaViewerContent_WJFJby4$lambda$35(this.$containerSize$delegate), null, bfm, 100663296, 0, 32768);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$13$1(AHD<ContentItem> ahd, PagerState pagerState, HatchDragDismissState hatchDragDismissState, MutableState<Boolean> mutableState, boolean z, boolean z2, boolean z3, boolean z4, G0U<? super Boolean, Unit> g0u, G0U<? super Boolean, Unit> g0u2, boolean z5, G0U<? super Boolean, Unit> g0u3, C1D3 c1d3, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<BL4> mutableState4) {
        super(4);
        this.$items = ahd;
        this.$pagerState = pagerState;
        this.$dragDismissState = hatchDragDismissState;
        this.$isCurrentPageZoomed$delegate = mutableState;
        this.$isPlaybackEnabled = z;
        this.$isUserPaused = z2;
        this.$isFullscreen = z3;
        this.$isMuted = z4;
        this.$onMutedChanged = g0u;
        this.$onFullscreenChanged = g0u2;
        this.$lockFullscreen = z5;
        this.$onUserPausedChanged = g0u3;
        this.$mediaShape = c1d3;
        this.$isPagerSettled$delegate = mutableState2;
        this.$showFullscreenVideoControls$delegate = mutableState3;
        this.$containerSize$delegate = mutableState4;
    }

    public final void invoke(C01r c01r, int i, BFM bfm, int i2) {
        int iA0E = i2;
        C7384Etj.A0Y(c01r, 0);
        if ((i2 & 48) == 0) {
            iA0E = i2 | AnonymousClass004.A0E(bfm, i);
        }
        boolean z = false;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
            bfm.Afo();
            return;
        }
        ContentItem contentItem = (ContentItem) AbstractC0878AGe.A0A(i, this.$items);
        if (contentItem != null) {
            bfm.AgE(82482371);
            boolean zA1Q = AnonymousClass002.A1Q(i, this.$pagerState.A07());
            boolean z2 = contentItem.type instanceof ContentType.Video;
            ZoomState zoomStateRememberZoomState = FileViewerZoomKt.rememberZoomState(null, bfm, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(zoomStateRememberZoomState.isZoomed$delegate));
            Boolean boolValueOf2 = Boolean.valueOf(zA1Q);
            boolean zA1S = AnonymousClass003.A1S(bfm, zoomStateRememberZoomState, zA1Q);
            MutableState<Boolean> mutableState = this.$isCurrentPageZoomed$delegate;
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new MediaViewerContentKt$MediaViewerContent$13$1$1$1(zA1Q, zoomStateRememberZoomState, mutableState);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, boolValueOf, boolValueOf2);
            boolean zA1S2 = AnonymousClass003.A1S(bfm, zoomStateRememberZoomState, zA1Q);
            Object objAaT2 = bfm.AaT();
            if (zA1S2 || objAaT2 == C78N.A00) {
                objAaT2 = new MediaViewerContentKt$MediaViewerContent$13$1$2$1(zA1Q, zoomStateRememberZoomState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, boolValueOf2);
            if (!zA1Q) {
                MutableState<Boolean> mutableState2 = this.$isCurrentPageZoomed$delegate;
                float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                if (MutableState.A0A((MutableState) mutableState2)) {
                    z = true;
                }
            }
            BRg bRgMediaViewerDragDismissFade = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            if (!zA1Q) {
                bRgMediaViewerDragDismissFade = MediaViewerDragDismissStateKt.mediaViewerDragDismissFade(bRgMediaViewerDragDismissFade, this.$dragDismissState);
            }
            AbstractC04661Bq.A08(AbstractC1011APs.A03(0.0f, 3), AbstractC1011APs.A0E(C1003AOr.A00(null)), bfm, c1062ATq.then(bRgMediaViewerDragDismissFade), null, B1V.A00(bfm, new AnonymousClass3(contentItem, zA1Q, this.$isPlaybackEnabled, z2, this.$isUserPaused, this.$isFullscreen, this.$isMuted, this.$onMutedChanged, this.$dragDismissState, this.$onFullscreenChanged, this.$lockFullscreen, this.$onUserPausedChanged, this.$mediaShape, zoomStateRememberZoomState, this.$isPagerSettled$delegate, this.$showFullscreenVideoControls$delegate, this.$containerSize$delegate), 434243348), 200064, 16, !z);
        } else {
            bfm.AgE(85580635);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C01r c01r, Integer num, BFM bfm, Integer num2) {
        invoke(c01r, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
