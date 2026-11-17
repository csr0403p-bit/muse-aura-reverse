package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.navigation.HatchDragDismissState;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$8 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $dismissFromClose;
    public final /* synthetic */ HatchDragDismissState $dragDismissState;
    public final /* synthetic */ MutableState<Boolean> $isFullscreenMenuExpanded$delegate;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ boolean $lockFullscreen;
    public final /* synthetic */ G0U<ContentItem, Unit> $onCopyClick;
    public final /* synthetic */ G0U<ContentItem, Unit> $onDeleteClick;
    public final /* synthetic */ G0U<ContentItem, Unit> $onDownloadClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;
    public final /* synthetic */ G0U<ContentItem, Unit> $onReplyClick;
    public final /* synthetic */ G0U<ContentItem, Unit> $onShareClick;
    public final /* synthetic */ PagerState $pagerState;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$13$8$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $isFullscreenMenuExpanded$delegate;
        public final /* synthetic */ AHD<ContentItem> $items;
        public final /* synthetic */ G0U<ContentItem, Unit> $onCopyClick;
        public final /* synthetic */ G0U<ContentItem, Unit> $onDeleteClick;
        public final /* synthetic */ G0U<ContentItem, Unit> $onDownloadClick;
        public final /* synthetic */ G0U<ContentItem, Unit> $onReplyClick;
        public final /* synthetic */ G0U<ContentItem, Unit> $onShareClick;
        public final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<ContentItem> ahd, PagerState pagerState, G0U<? super ContentItem, Unit> g0u, G0U<? super ContentItem, Unit> g0u2, G0U<? super ContentItem, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super ContentItem, Unit> g0u5, MutableState<Boolean> mutableState) {
            super(2);
            this.$items = ahd;
            this.$pagerState = pagerState;
            this.$onDownloadClick = g0u;
            this.$onReplyClick = g0u2;
            this.$onShareClick = g0u3;
            this.$onCopyClick = g0u4;
            this.$onDeleteClick = g0u5;
            this.$isFullscreenMenuExpanded$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ContentItem contentItem = (ContentItem) AbstractC0878AGe.A0A(this.$pagerState.A07(), this.$items);
                if (contentItem != null) {
                    bfm.AgE(1864710628);
                    boolean zA1K = AnonymousClass003.A1K(bfm, this.$onDownloadClick, contentItem);
                    G0U<ContentItem, Unit> g0u = this.$onDownloadClick;
                    Object objAaT = bfm.AaT();
                    if (zA1K || objAaT == C78N.A00) {
                        objAaT = new MediaViewerContentKt$MediaViewerContent$13$8$2$1$1(g0u, contentItem);
                        bfm.Ai0(objAaT);
                    }
                    Function0 function0 = (Function0) objAaT;
                    boolean zA1K2 = AnonymousClass003.A1K(bfm, this.$onReplyClick, contentItem);
                    G0U<ContentItem, Unit> g0u2 = this.$onReplyClick;
                    Object objAaT2 = bfm.AaT();
                    if (zA1K2 || objAaT2 == C78N.A00) {
                        objAaT2 = new MediaViewerContentKt$MediaViewerContent$13$8$2$2$1(g0u2, contentItem);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function02 = (Function0) objAaT2;
                    boolean zA1K3 = AnonymousClass003.A1K(bfm, this.$onShareClick, contentItem);
                    G0U<ContentItem, Unit> g0u3 = this.$onShareClick;
                    Object objAaT3 = bfm.AaT();
                    if (zA1K3 || objAaT3 == C78N.A00) {
                        objAaT3 = new MediaViewerContentKt$MediaViewerContent$13$8$2$3$1(g0u3, contentItem);
                        bfm.Ai0(objAaT3);
                    }
                    Function0 function03 = (Function0) objAaT3;
                    boolean zA1K4 = AnonymousClass003.A1K(bfm, this.$onCopyClick, contentItem);
                    G0U<ContentItem, Unit> g0u4 = this.$onCopyClick;
                    Object objAaT4 = bfm.AaT();
                    if (zA1K4 || objAaT4 == C78N.A00) {
                        objAaT4 = new MediaViewerContentKt$MediaViewerContent$13$8$2$4$1(g0u4, contentItem);
                        bfm.Ai0(objAaT4);
                    }
                    Function0 function04 = (Function0) objAaT4;
                    boolean zA1K5 = AnonymousClass003.A1K(bfm, this.$onDeleteClick, contentItem);
                    G0U<ContentItem, Unit> g0u5 = this.$onDeleteClick;
                    Object objAaT5 = bfm.AaT();
                    if (zA1K5 || objAaT5 == C78N.A00) {
                        objAaT5 = new MediaViewerContentKt$MediaViewerContent$13$8$2$5$1(g0u5, contentItem);
                        bfm.Ai0(objAaT5);
                    }
                    Function0 function05 = (Function0) objAaT5;
                    MutableState<Boolean> mutableState = this.$isFullscreenMenuExpanded$delegate;
                    Object objAaT6 = bfm.AaT();
                    if (objAaT6 == C78N.A00) {
                        objAaT6 = new MediaViewerContentKt$MediaViewerContent$13$8$2$6$1(mutableState);
                        bfm.Ai0(objAaT6);
                    }
                    MediaViewerContentKt.MediaViewerItemActions(contentItem, function0, function02, function03, function04, function05, null, (G0U) objAaT6, bfm, 12582912, 64);
                } else {
                    bfm.AgE(1865226685);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$13$8(boolean z, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, HatchDragDismissState hatchDragDismissState, AHD<ContentItem> ahd, PagerState pagerState, G0U<? super ContentItem, Unit> g0u2, G0U<? super ContentItem, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super ContentItem, Unit> g0u5, G0U<? super ContentItem, Unit> g0u6, MutableState<Boolean> mutableState) {
        super(3);
        this.$lockFullscreen = z;
        this.$dismissFromClose = function0;
        this.$onFullscreenChanged = g0u;
        this.$dragDismissState = hatchDragDismissState;
        this.$items = ahd;
        this.$pagerState = pagerState;
        this.$onDownloadClick = g0u2;
        this.$onReplyClick = g0u3;
        this.$onShareClick = g0u4;
        this.$onCopyClick = g0u5;
        this.$onDeleteClick = g0u6;
        this.$isFullscreenMenuExpanded$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        Function0<Unit> function0;
        BBI bbiA0M;
        int i2;
        String strA0s;
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
            if (this.$lockFullscreen) {
                bbiA0M = AnonymousClass002.A0M(bfm, 172997964);
                function0 = this.$dismissFromClose;
            } else {
                bfm.AgE(1067992840);
                boolean zA65 = bfm.A65(this.$onFullscreenChanged);
                G0U<Boolean, Unit> g0u = this.$onFullscreenChanged;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new MediaViewerContentKt$MediaViewerContent$13$8$1$1(g0u);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            if (this.$lockFullscreen) {
                i2 = R.drawable.x_wght400_outline_24;
                bfm.AgE(173008330);
                strA0s = AnonymousClass001.A0s(bfm, bbiA0M, R.string._name_removed__res_0x7f1206ed);
            } else {
                i2 = R.drawable.caret_left;
                bfm.AgE(1068341217);
                BBI.A0R(bbiA0M, false);
                strA0s = null;
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, function0, MediaViewerDragDismissStateKt.mediaViewerDragDismissFade(BRg.A00, this.$dragDismissState), hatchHeaderTitleAlignment, false, i2, strA0s, null, false, null, null, null, B1V.A00(bfm, new AnonymousClass2(this.$items, this.$pagerState, this.$onDownloadClick, this.$onReplyClick, this.$onShareClick, this.$onCopyClick, this.$onDeleteClick, this.$isFullscreenMenuExpanded$delegate), 1294276325), 0L, 0L, null, null, 0, null, null, false, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 3072, 0, 4185891);
            return;
        }
        bfm.Afo();
    }
}
