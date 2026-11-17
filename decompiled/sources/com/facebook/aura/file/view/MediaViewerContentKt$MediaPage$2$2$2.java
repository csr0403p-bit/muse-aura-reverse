package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BIj;
import X.BL4;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.C7Je;
import X.CFK;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.HatchDragDismissState;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceBitmap;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.image.AuraRetryViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaPage$2$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ long $containerSize;
    public final /* synthetic */ HatchDragDismissState $dragDismissState;
    public final /* synthetic */ boolean $fillSharedElementBounds;
    public final /* synthetic */ Bitmap $imageBitmap;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $isLowRamDevice;
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ ContentItem $item;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
    public final /* synthetic */ Function0<Unit> $onPauseClick;
    public final /* synthetic */ Function0<Unit> $onPlayClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onShowVideoControlsChanged;
    public final /* synthetic */ boolean $showVideoControls;
    public final /* synthetic */ String $workspacePath;
    public final /* synthetic */ ZoomState $zoomState;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaPage$2$2$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<HatchVideoPlayer, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDragDismissState $dragDismissState;
        public final /* synthetic */ boolean $isFullscreen;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ ContentItem $item;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onPlayClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onShowVideoControlsChanged;
        public final /* synthetic */ boolean $showVideoControls;
        public final /* synthetic */ ZoomState $zoomState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchDragDismissState hatchDragDismissState, boolean z, boolean z2, boolean z3, G0U<? super Boolean, Unit> g0u, ZoomState zoomState, boolean z4, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, ContentItem contentItem) {
            super(3);
            this.$dragDismissState = hatchDragDismissState;
            this.$isPlaying = z;
            this.$isFullscreen = z2;
            this.$showVideoControls = z3;
            this.$onShowVideoControlsChanged = g0u;
            this.$zoomState = zoomState;
            this.$isMuted = z4;
            this.$onMutedChanged = g0u2;
            this.$onPauseClick = function0;
            this.$onPlayClick = function02;
            this.$item = contentItem;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(HatchVideoPlayer hatchVideoPlayer, BFM bfm, Integer num) {
            invoke(hatchVideoPlayer, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(HatchVideoPlayer hatchVideoPlayer, BFM bfm, int i) {
            int iA05 = i;
            C7384Etj.A0Y(hatchVideoPlayer, 0);
            if ((i & 6) == 0) {
                iA05 = i | AnonymousClass002.A05(AnonymousClass004.A1X(hatchVideoPlayer, bfm, iA05) ? 1 : 0);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
                BRg bRgMediaViewerDragDismissFade = BRg.A00;
                HatchDragDismissState hatchDragDismissState = this.$dragDismissState;
                if (hatchDragDismissState != null) {
                    bRgMediaViewerDragDismissFade = MediaViewerDragDismissStateKt.mediaViewerDragDismissFade(bRgMediaViewerDragDismissFade, hatchDragDismissState);
                }
                C1062ATq c1062ATq = C10G.A01;
                boolean z = this.$isPlaying;
                boolean z2 = this.$isFullscreen;
                boolean z3 = this.$showVideoControls;
                G0U<Boolean, Unit> g0u = this.$onShowVideoControlsChanged;
                ZoomState zoomState = this.$zoomState;
                boolean z4 = this.$isMuted;
                G0U<Boolean, Unit> g0u2 = this.$onMutedChanged;
                Function0<Unit> function0 = this.$onPauseClick;
                Function0<Unit> function02 = this.$onPlayClick;
                ContentItem contentItem = this.$item;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                MediaViewerContentKt.VideoPlaybackControls(hatchVideoPlayer, z, z2, z3, g0u, C1BO.A0F(zoomState.isZoomed$delegate), z4, g0u2, function0, function02, c1062ATq.then(bRgMediaViewerDragDismissFade), bfm, iA05 & 14, 0, 0);
                MusicAttribution musicAttribution = contentItem.music;
                if (musicAttribution != null && !z2) {
                    bfm.AgE(-220088816);
                    MediaViewerContentKt.MediaMusicHeader(musicAttribution, bRgMediaViewerDragDismissFade, bfm, 0, 0);
                } else {
                    bfm.AgE(-219991755);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaPage$2$2$2(ContentItem contentItem, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ZoomState zoomState, long j, boolean z6, Bitmap bitmap, String str2, HatchDragDismissState hatchDragDismissState, boolean z7, boolean z8, G0U<? super Boolean, Unit> g0u, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$item = contentItem;
        this.$imageUri = str;
        this.$isCurrentPage = z;
        this.$isVideo = z2;
        this.$isPlaying = z3;
        this.$isMuted = z4;
        this.$fillSharedElementBounds = z5;
        this.$zoomState = zoomState;
        this.$containerSize = j;
        this.$isLowRamDevice = z6;
        this.$imageBitmap = bitmap;
        this.$workspacePath = str2;
        this.$dragDismissState = hatchDragDismissState;
        this.$isFullscreen = z7;
        this.$showVideoControls = z8;
        this.$onShowVideoControlsChanged = g0u;
        this.$onMutedChanged = g0u2;
        this.$onPauseClick = function0;
        this.$onPlayClick = function02;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            if ((this.$item.type instanceof ContentType.Audio) && this.$imageUri != null) {
                bfm.AgE(1712099295);
                MediaViewerContentKt.ContentAudioPlayer(this.$imageUri, this.$item.name, null, this.$isCurrentPage, bfm, 0, 4);
            } else if (this.$isVideo && this.$imageUri != null) {
                bfm.AgE(1712431150);
                boolean zA65 = bfm.A65(this.$imageUri);
                String str = this.$imageUri;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = null;
                    try {
                        objAaT = C7Je.A01(str);
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    bfm.Ai0(objAaT);
                }
                Uri uri = (Uri) objAaT;
                if (uri != null) {
                    bfm.AgE(1712565225);
                    ContentItem contentItem = this.$item;
                    boolean z = this.$isCurrentPage;
                    boolean z2 = this.$isPlaying;
                    boolean z3 = this.$isMuted;
                    boolean z4 = this.$fillSharedElementBounds;
                    ZoomState zoomState = this.$zoomState;
                    MediaViewerContentKt.m905MediaViewerVideolXbYAwQ(contentItem, uri, z, z2, z3, z4, zoomState, this.$containerSize, null, B1V.A00(bfm, new AnonymousClass1(this.$dragDismissState, z2, this.$isFullscreen, this.$showVideoControls, this.$onShowVideoControlsChanged, zoomState, z3, this.$onMutedChanged, this.$onPauseClick, this.$onPlayClick, contentItem), 1339126259), bfm, 805306368, 256);
                } else {
                    bfm.AgE(1714072166);
                    CFK.A06(MediaViewerContentKt.TAG, FGI.A0M("MediaPage: failed to parse video URI for ", this.$item.name));
                    AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.ic_error_exclamation_unfilled, 0), AuraIconSize.SMALL, C06G.A08(bfm));
                }
                AnonymousClass001.A1D(bfm);
            } else if (this.$imageUri != null) {
                bfm.AgE(1714589122);
                String str2 = this.$imageUri;
                ContentItem contentItem2 = this.$item;
                String str3 = contentItem2.thumbnailUri;
                if (str3 == null) {
                    str3 = str2;
                }
                BL4 bl4 = contentItem2.sourceDecodeSizePx;
                Float f = HatchMediaAspectRatios.INSTANCE.get(contentItem2.sharedElementKey);
                C1062ATq c1062ATq = C10G.A02;
                boolean zA652 = bfm.A65(this.$zoomState);
                ZoomState zoomState2 = this.$zoomState;
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new MediaViewerContentKt$MediaPage$2$2$2$2$1(zoomState2);
                    bfm.Ai0(objAaT2);
                }
                MediaViewerContentKt.m906ProgressiveViewerImage7RoMKGQ(str2, str3, bl4, this.$containerSize, this.$isLowRamDevice, this.$fillSharedElementBounds, BIj.A00(c1062ATq, (G0U) objAaT2), f, bfm, 0, 0);
            } else if (this.$imageBitmap != null) {
                bfm.AgE(1715201434);
                AuraDrawableSourceBitmap auraDrawableSourceBitmap = new AuraDrawableSourceBitmap(this.$imageBitmap);
                String str4 = this.$item.name;
                C1062ATq c1062ATq2 = C10G.A02;
                boolean zA653 = bfm.A65(this.$zoomState);
                ZoomState zoomState3 = this.$zoomState;
                Object objAaT3 = bfm.AaT();
                if (zA653 || objAaT3 == C78N.A00) {
                    objAaT3 = new MediaViewerContentKt$MediaPage$2$2$2$3$1(zoomState3);
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA00 = BIj.A00(c1062ATq2, (G0U) objAaT3);
                boolean z5 = this.$fillSharedElementBounds;
                AuraImageKt.AuraImage(auraDrawableSourceBitmap, bRgA00, str4, MediaViewerContentKt.viewerScaleOptions(z5), false, false, null, !z5, null, bfm, 0, 368);
            } else if (this.$workspacePath != null) {
                bfm.AgE(1715663117);
                CFK.A06(MediaViewerContentKt.TAG, "MediaPage: workspacePath provided without imageUri, media won't load");
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_error_exclamation_unfilled, 0), AuraIconSize.SMALL, null, C06G.A08(bfm), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(1716123684);
                ContentItem contentItem3 = this.$item;
                String str5 = contentItem3.name;
                ContentType contentType = contentItem3.type;
                StringBuilder sb = new StringBuilder("MediaPage: no renderable source for ");
                sb.append(str5);
                CFK.A06(MediaViewerContentKt.TAG, AnonymousClass006.A0y(contentType, ", type=", sb));
                AuraRetryViewKt.AuraImageDefaultError(null, bfm, 0, 1);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
