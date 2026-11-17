package com.facebook.aura.file.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.ANR;
import X.ARD;
import X.ATD;
import X.AVy;
import X.AaM;
import X.AbstractC07117nq;
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
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BL4;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C0yq;
import X.C0z7;
import X.C0zJ;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C19U;
import X.C1BO;
import X.C1Cd;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7481Exe;
import X.C78N;
import X.C90m;
import X.CFK;
import X.CH0;
import X.Ej6;
import X.F13;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.HzP;
import X.InterfaceC1072AWd;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.components.musicattribution.AuraMusicAttributionKt;
import com.facebook.aura.components.musicattribution.AuraTopScrimKt;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentPrimaryAction;
import com.facebook.aura.file.view.api.ContentSocialSource;
import com.facebook.aura.file.view.api.ContentViewerPageAccessory;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MediaViewerContentKt {
    public static final String ADJACENT_PREFETCH_CALLER_CONTEXT = "MediaViewerContent-adjacent";
    public static final float CONTROLS_SCRIM_ALPHA = 0.2f;
    public static final int DEFAULT_IMAGE_DECODE_SIZE_PX = 1024;
    public static final int DETAIL_IMAGE_MAX_DIMENSION_PX = 2560;
    public static final long DETAIL_IMAGE_MAX_PIXEL_COUNT = 4000000;
    public static final long LOW_RAM_IMAGE_MAX_PIXEL_COUNT = 2000000;
    public static final int MEDIA_MENU_COPY = 2;
    public static final int MEDIA_MENU_DELETE = 3;
    public static final int MEDIA_MENU_DOWNLOAD = 4;
    public static final int MEDIA_MENU_REPLY = 0;
    public static final int MEDIA_MENU_SHARE = 1;
    public static final long MEDIA_VIEWER_VIDEO_LOAD_TIMEOUT_MS = 20000;
    public static final long PROGRESS_POLL_INTERVAL_MS = 250;
    public static final C06827l3 SocialHandleWhitespace;
    public static final String TAG = "MediaViewerContent";
    public static final C7197Ei9 VIEWER_CENTER_CROP_OPTIONS;
    public static final C7197Ei9 VIEWER_FIT_CENTER_OPTIONS;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $audioUrl;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isCurrentPage;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, String str2, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$audioUrl = str;
            this.$fileName = str2;
            this.$modifier = bRg;
            this.$isCurrentPage = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaViewerContentKt.ContentAudioPlayer(this.$audioUrl, this.$fileName, this.$modifier, this.$isCurrentPage, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaMusicHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ MusicAttribution $music;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MusicAttribution musicAttribution, BRg bRg, int i, int i2) {
            super(2);
            this.$music = musicAttribution;
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
            MediaViewerContentKt.MediaMusicHeader(this.$music, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerControls$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ContentItem $currentItem;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onCopyClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ Function0<Unit> $onReplyClick;
        public final /* synthetic */ Function0<Unit> $onShareClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ContentItem contentItem, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, BRg bRg, int i, int i2) {
            super(2);
            this.$currentItem = contentItem;
            this.$onClose = function0;
            this.$onDownloadClick = function02;
            this.$onReplyClick = function03;
            this.$onShareClick = function04;
            this.$onCopyClick = function05;
            this.$onDeleteClick = function06;
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
            MediaViewerContentKt.MediaViewerControls(this.$currentItem, this.$onClose, this.$onDownloadClick, this.$onReplyClick, this.$onShareClick, this.$onCopyClick, this.$onDeleteClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerItemActions$2, reason: invalid class name and case insensitive filesystem */
    public final class C119782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canDownload;
        public final /* synthetic */ ContentItem $currentItem;
        public final /* synthetic */ AVy $downloadIcon;
        public final /* synthetic */ String $downloadLabel;
        public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;
        public final /* synthetic */ Function0<Unit> $onCopyClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ Function0<Unit> $onReplyClick;
        public final /* synthetic */ Function0<Unit> $onShareClick;
        public final /* synthetic */ ContentPrimaryAction $primaryAction;
        public final /* synthetic */ G0U<Boolean, Unit> $setMenuExpanded;
        public final /* synthetic */ AVy $shareIcon;
        public final /* synthetic */ String $shareLabel;
        public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

        /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerItemActions$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ContentPrimaryAction.values().length];
                try {
                    AnonymousClass002.A13(ContentPrimaryAction.Download, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ContentPrimaryAction.Share, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119782(ContentPrimaryAction contentPrimaryAction, boolean z, AVy aVy, String str, Function0<Unit> function0, AVy aVy2, String str2, Function0<Unit> function02, ContentItem contentItem, G0U<? super Boolean, Unit> g0u, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, MutableState<Boolean> mutableState, AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$primaryAction = contentPrimaryAction;
            this.$canDownload = z;
            this.$downloadIcon = aVy;
            this.$downloadLabel = str;
            this.$onDownloadClick = function0;
            this.$shareIcon = aVy2;
            this.$shareLabel = str2;
            this.$onShareClick = function02;
            this.$currentItem = contentItem;
            this.$setMenuExpanded = g0u;
            this.$onReplyClick = function03;
            this.$onCopyClick = function04;
            this.$onDeleteClick = function05;
            this.$showContextMenu$delegate = mutableState;
            this.$menuItems = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                int iOrdinal = this.$primaryAction.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        bfm.AgE(852918075);
                        MediaViewerContentKt.MediaViewerPrimaryButton(this.$shareIcon, this.$shareLabel, this.$onShareClick, null, bfm, AVy.$stable, 8);
                    } else {
                        throw AnonymousClass005.A0k(bfm, 852911199);
                    }
                } else {
                    bfm.AgE(852913327);
                    if (this.$canDownload) {
                        bfm.AgE(670525700);
                        MediaViewerContentKt.MediaViewerPrimaryButton(this.$downloadIcon, this.$downloadLabel, this.$onDownloadClick, null, bfm, AVy.$stable, 8);
                    } else {
                        bfm.AgE(670617956);
                    }
                    AnonymousClass001.A1D(bfm);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                Alignment alignment = C2VU.A0D;
                ContentItem contentItem = this.$currentItem;
                G0U<Boolean, Unit> g0u = this.$setMenuExpanded;
                Function0<Unit> function0 = this.$onReplyClick;
                Function0<Unit> function02 = this.$onShareClick;
                Function0<Unit> function03 = this.$onDownloadClick;
                Function0<Unit> function04 = this.$onCopyClick;
                Function0<Unit> function05 = this.$onDeleteClick;
                MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
                AHD<AuraContextMenuItem> ahd = this.$menuItems;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function06 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function06);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, i2);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.meta_ai_icons_ellipsis_regular_cropped, 0);
                String strA0i = AnonymousClass005.A0i(bfm);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                long jA0A = C06G.A0A(bfm);
                boolean zA1K = AnonymousClass003.A1K(bfm, contentItem, g0u);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new MediaViewerContentKt$MediaViewerItemActions$2$1$1$1(contentItem, g0u);
                    bfm.Ai0(objAaT);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0i, (Function0) objAaT, null, false, new B6A(jA0A), null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 15137);
                boolean zA1R = AnonymousClass001.A1R(bfm, function05, AnonymousClass001.A1R(bfm, function04, AnonymousClass005.A1T(bfm, function0, function02, function03, bfm.A65(g0u))));
                Object objAaT2 = bfm.AaT();
                if (zA1R || objAaT2 == C78N.A00) {
                    objAaT2 = new MediaViewerContentKt$MediaViewerItemActions$2$1$2$1(g0u, function0, function02, function03, function04, function05);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u2 = (G0U) objAaT2;
                boolean zA1K2 = AnonymousClass003.A1K(bfm, contentItem, g0u);
                Object objAaT3 = bfm.AaT();
                if (zA1K2 || objAaT3 == C78N.A00) {
                    objAaT3 = new MediaViewerContentKt$MediaViewerItemActions$2$1$3$1(contentItem, g0u, mutableState);
                    bfm.Ai0(objAaT3);
                }
                float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT3, MutableState.A0A((MutableState) mutableState), null, AnonymousClass005.A0K(0.0f, 52.0f), null, false, new MediaViewerContentKt$MediaViewerItemActions$2$1$4(ahd), false, null, null, null, false, bfm, 196608, 0, 16081);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerItemActions$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ContentItem $currentItem;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCopyClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onMenuExpandedChanged;
        public final /* synthetic */ Function0<Unit> $onReplyClick;
        public final /* synthetic */ Function0<Unit> $onShareClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ContentItem contentItem, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, G0U<? super Boolean, Unit> g0u, int i, int i2) {
            super(2);
            this.$currentItem = contentItem;
            this.$onDownloadClick = function0;
            this.$onReplyClick = function02;
            this.$onShareClick = function03;
            this.$onCopyClick = function04;
            this.$onDeleteClick = function05;
            this.$modifier = bRg;
            this.$onMenuExpandedChanged = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaViewerContentKt.MediaViewerItemActions(this.$currentItem, this.$onDownloadClick, this.$onReplyClick, this.$onShareClick, this.$onCopyClick, this.$onDeleteClick, this.$modifier, this.$onMenuExpandedChanged, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerPageAccessory$2, reason: invalid class name and case insensitive filesystem */
    public final class C119792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ContentViewerPageAccessory $accessory;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119792(ContentViewerPageAccessory contentViewerPageAccessory, BRg bRg, int i, int i2) {
            super(2);
            this.$accessory = contentViewerPageAccessory;
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
            MediaViewerContentKt.MediaViewerPageAccessory(this.$accessory, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerPrimaryButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C119801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ AVy $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119801(AVy aVy, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$icon = aVy;
            this.$contentDescription = str;
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
            MediaViewerContentKt.MediaViewerPrimaryButton(this.$icon, this.$contentDescription, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerSocialAttribution$2, reason: invalid class name and case insensitive filesystem */
    public final class C119812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ContentSocialSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119812(ContentSocialSource contentSocialSource, BRg bRg, int i, int i2) {
            super(2);
            this.$source = contentSocialSource;
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
            MediaViewerContentKt.MediaViewerSocialAttribution(this.$source, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoMuteButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$isMuted = z;
            this.$onMutedChanged = g0u;
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
            MediaViewerContentKt.VideoMuteButton(this.$isMuted, this.$onMutedChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoPlayPauseButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C119823 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119823(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isPlaying = z;
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
            MediaViewerContentKt.VideoPlayPauseButton(this.$isPlaying, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoPlaybackControls$3, reason: invalid class name and case insensitive filesystem */
    public final class C119833 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFullscreen;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $isZoomed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onPlayClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onShowControlsChanged;
        public final /* synthetic */ HatchVideoPlayer $player;
        public final /* synthetic */ boolean $showControls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119833(HatchVideoPlayer hatchVideoPlayer, boolean z, boolean z2, boolean z3, G0U<? super Boolean, Unit> g0u, boolean z4, boolean z5, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$player = hatchVideoPlayer;
            this.$isPlaying = z;
            this.$isFullscreen = z2;
            this.$showControls = z3;
            this.$onShowControlsChanged = g0u;
            this.$isZoomed = z4;
            this.$isMuted = z5;
            this.$onMutedChanged = g0u2;
            this.$onPauseClick = function0;
            this.$onPlayClick = function02;
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
            MediaViewerContentKt.VideoPlaybackControls(this.$player, this.$isPlaying, this.$isFullscreen, this.$showControls, this.$onShowControlsChanged, this.$isZoomed, this.$isMuted, this.$onMutedChanged, this.$onPauseClick, this.$onPlayClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoPlaybackControls$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Float> $controlsAlpha$delegate;
        public final /* synthetic */ String $displayedPositionLabel;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $isZoomed;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onPlayClick;
        public final /* synthetic */ G0U<Float, Unit> $onProgressChanged;
        public final /* synthetic */ Function0<Unit> $onSeekCancelled;
        public final /* synthetic */ G0U<Float, Unit> $onSeekFinished;
        public final /* synthetic */ float $progress;
        public final /* synthetic */ boolean $showProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, C1BO<Float> c1bo, boolean z3, String str, float f, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, Function0<Unit> function03, boolean z4, G0U<? super Boolean, Unit> g0u3) {
            super(3);
            this.$isPlaying = z;
            this.$onPauseClick = function0;
            this.$onPlayClick = function02;
            this.$isZoomed = z2;
            this.$controlsAlpha$delegate = c1bo;
            this.$showProgress = z3;
            this.$displayedPositionLabel = str;
            this.$progress = f;
            this.$onProgressChanged = g0u;
            this.$onSeekFinished = g0u2;
            this.$onSeekCancelled = function03;
            this.$isMuted = z4;
            this.$onMutedChanged = g0u3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            boolean z;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                boolean z2 = this.$isPlaying;
                Function0<Unit> function0 = this.$onPauseClick;
                Function0<Unit> function02 = this.$onPlayClick;
                boolean z3 = this.$isZoomed;
                C1BO<Float> c1bo = this.$controlsAlpha$delegate;
                boolean z4 = this.$showProgress;
                String str = this.$displayedPositionLabel;
                float f = this.$progress;
                G0U<Float, Unit> g0u = this.$onProgressChanged;
                G0U<Float, Unit> g0u2 = this.$onSeekFinished;
                Function0<Unit> function03 = this.$onSeekCancelled;
                boolean z5 = this.$isMuted;
                G0U<Boolean, Unit> g0u3 = this.$onMutedChanged;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function04);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u4 = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u4);
                C0z7 c0z7 = C0z7.A00;
                boolean zA1P = AnonymousClass003.A1P(bfm, function0, function02, bfm.A66(z2));
                Object objAaT = bfm.AaT();
                if (zA1P || objAaT == C78N.A00) {
                    objAaT = new MediaViewerContentKt$VideoPlaybackControls$5$1$1$1(z2, function0, function02);
                    bfm.Ai0(objAaT);
                }
                MediaViewerContentKt.VideoPlayPauseButton(z2, (Function0) objAaT, c0z7.A4C(C2VU.A09, bs0), bfm, 0, 0);
                if (!z3) {
                    bfm.AgE(-1881311460);
                    BRg bRgA04 = C10G.A04(AnonymousClass007.A0G(c0z7, bs0), 80.0f);
                    B6A b6a = new B6A(B6A.A06);
                    long j2 = B6A.A01;
                    C01N.A07(bfm, C1b8.A02(bRgA04, C1EQ.A01(AnonymousClass004.A17(b6a, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.5f)), 0.0f, Float.POSITIVE_INFINITY), C1OM.A00));
                } else {
                    bfm.AgE(-1880916489);
                }
                BBI.A0R(bbi, false);
                BRg bRgA0C = C3U4.A0C(C1b8.A02(AnonymousClass007.A0G(c0z7, bs0), MediaViewerContentKt.controlsScrimBrush(C1BO.A01(c1bo)), C1OM.A00), 16.0f, 20.0f, 16.0f, 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function04);
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u4, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                if (z4) {
                    bfm.AgE(-1906502915);
                    long j3 = B6A.A08;
                    long jA03 = C19U.A03(13);
                    boolean zA65 = bfm.A65(c1bo);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new MediaViewerContentKt$VideoPlaybackControls$5$1$2$1$1(c1bo);
                        bfm.Ai0(objAaT2);
                    }
                    C0yq.A00(bfm, AnonymousClass001.A0W(bs0, objAaT2), null, null, null, null, null, null, str, null, 0, 0, 0, 3456, 0, 131056, j3, jA03, 0L, 0L, false);
                    C01N.A09(bfm, bs0, 8.0f);
                    long jA04 = HxS.A04(HDi.A0O[(int) (j3 & 63)], B6A.A03(j3), B6A.A02(j3), B6A.A01(j3), 0.5f);
                    z = true;
                    BRg bRgA042 = C10G.A04(c90m.AiP(bs0, 1.0f, true), 48.0f);
                    boolean zA652 = bfm.A65(c1bo);
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new MediaViewerContentKt$VideoPlaybackControls$5$1$2$2$1(c1bo);
                        bfm.Ai0(objAaT3);
                    }
                    MediaViewerContentKt.m907VideoProgressSlider8Ml9mos(f, g0u, g0u2, function03, 4.0f, 16.0f, jA04, AnonymousClass001.A0W(bRgA042, objAaT3), bfm, 1794048, 0);
                    C01N.A09(bfm, bs0, 8.0f);
                } else {
                    bfm.AgE(-1905735913);
                    z = true;
                    C01N.A07(bfm, c90m.AiP(bs0, 1.0f, true));
                }
                BBI.A0R(bbi, false);
                MediaViewerContentKt.VideoMuteButton(z5, g0u3, null, bfm, 0, 4);
                BBI.A0R(bbi, z);
                BBI.A0R(bbi, z);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoPlaybackControls$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFullscreen;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $isZoomed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onPlayClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onShowControlsChanged;
        public final /* synthetic */ HatchVideoPlayer $player;
        public final /* synthetic */ boolean $showControls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchVideoPlayer hatchVideoPlayer, boolean z, boolean z2, boolean z3, G0U<? super Boolean, Unit> g0u, boolean z4, boolean z5, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$player = hatchVideoPlayer;
            this.$isPlaying = z;
            this.$isFullscreen = z2;
            this.$showControls = z3;
            this.$onShowControlsChanged = g0u;
            this.$isZoomed = z4;
            this.$isMuted = z5;
            this.$onMutedChanged = g0u2;
            this.$onPauseClick = function0;
            this.$onPlayClick = function02;
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
            MediaViewerContentKt.VideoPlaybackControls(this.$player, this.$isPlaying, this.$isFullscreen, this.$showControls, this.$onShowControlsChanged, this.$isZoomed, this.$isMuted, this.$onMutedChanged, this.$onPauseClick, this.$onPlayClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt", f = "MediaViewerContent.kt", l = {923}, m = "awaitReady", v = 2)
    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C119841 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaViewerContentKt.awaitReady(null, this);
        }

        public C119841(HtJ<? super C119841> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$finalImageListener$1, reason: invalid class name and case insensitive filesystem */
    public final class C119851 extends F13 {
        public final /* synthetic */ G0U<Float, Unit> $onLoaded;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[PHI: r4
  0x0041: PHI (r4v3 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v5 java.lang.Integer) binds: [B:18:0x003c, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r4
  0x000d: PHI (r4v5 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v6 java.lang.Integer) binds: [B:18:0x003c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.F13, X.Ej6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFinalImageSet(long r3, int r5, X.C2eL r6, android.graphics.drawable.Drawable r7) {
            /*
                r2 = this;
                r5 = 0
                if (r6 == 0) goto L32
                int r0 = r6.getWidth()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                if (r0 <= 0) goto L32
            Ld:
                int r1 = r6.getHeight()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                if (r1 <= 0) goto L41
            L17:
                X.G0U<java.lang.Float, kotlin.Unit> r3 = r2.$onLoaded
                if (r4 == 0) goto L2e
                if (r0 == 0) goto L2e
                int r2 = r0.intValue()
                if (r2 <= 0) goto L2e
                int r0 = r4.intValue()
                float r1 = (float) r0
                float r0 = (float) r2
                float r1 = r1 / r0
                java.lang.Float r5 = java.lang.Float.valueOf(r1)
            L2e:
                r3.invoke(r5)
                return
            L32:
                if (r7 == 0) goto L3f
                int r0 = r7.getIntrinsicWidth()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            L3c:
                if (r6 == 0) goto L41
                goto Ld
            L3f:
                r4 = r5
                goto L3c
            L41:
                if (r7 == 0) goto L4c
                int r0 = r7.getIntrinsicHeight()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L17
            L4c:
                r0 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.C119851.onFinalImageSet(long, int, X.2eL, android.graphics.drawable.Drawable):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C119851(G0U<? super Float, Unit> g0u) {
            this.$onLoaded = g0u;
        }
    }

    public static final void MediaViewerPageAccessory(ContentViewerPageAccessory contentViewerPageAccessory, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2127322668);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, contentViewerPageAccessory) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = MediaViewerContentKt$MediaViewerPageAccessory$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            ANR.A02(bfm, null, bRg2, contentViewerPageAccessory, "pageAccessory", (G0U) objAaT, null, ComposableSingletons$MediaViewerContentKt.f60lambda$2039807717, (iA0d & 14) | 1597824 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119792(contentViewerPageAccessory, bRg2, i, i2);
        }
    }

    /* renamed from: boundedDecodeSize-CJJAR-o, reason: not valid java name */
    public static final long m912boundedDecodeSizeCJJARo(long j, int i, long j2, int i2) {
        int i3 = (int) (j >> 32);
        if (i3 < 1) {
            i3 = 1;
        }
        long j3 = i2;
        long j4 = i3 * j3;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        int i4 = (int) (j & 4294967295L);
        if (i4 < 1) {
            i4 = 1;
        }
        long j5 = i4 * j3;
        if (j5 > 2147483647L) {
            j5 = 2147483647L;
        }
        long jMax = Math.max(j4, j5);
        double d = jMax > ((long) i) ? i / jMax : 1.0d;
        long j6 = (long) (j4 * d);
        if (j6 < 1) {
            j6 = 1;
        }
        long j7 = (long) (j5 * d);
        if (j7 < 1) {
            j7 = 1;
        }
        long j8 = j6 * j7;
        if (j8 > j2) {
            double dSqrt = Math.sqrt(j2 / j8);
            j6 = (long) (j6 * dSqrt);
            if (j6 < 1) {
                j6 = 1;
            }
            j7 = (long) (j7 * dSqrt);
            if (j7 < 1) {
                j7 = 1;
            }
        }
        return (((int) j7) & 4294967295L) | (((int) j6) << 32);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentPrimaryAction.values().length];
            try {
                AnonymousClass002.A13(ContentPrimaryAction.Download, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ContentPrimaryAction.Share, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C7197Ei9 c7197Ei9 = C7197Ei9.A0P;
        C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei9);
        c7196Ei8.A00(InterfaceC8647Fhz.A05);
        VIEWER_FIT_CENTER_OPTIONS = new C7197Ei9(c7196Ei8);
        VIEWER_CENTER_CROP_OPTIONS = AnonymousClass005.A0Z(c7197Ei9);
        SocialHandleWhitespace = new C06827l3("\\s+");
    }

    public static final void ContentAudioPlayer(String str, String str2, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(700982973);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String str3 = CH0.A01((CH0) AnonymousClass002.A0h(bfm)).A04;
            int i5 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            boolean zA1Q3 = AnonymousClass002.A1Q(i5, 4);
            Object objAaT3 = bfm.AaT();
            if (zA1Q3 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState3 = (MutableState) objAaT3;
            boolean zA17 = AnonymousClass003.A17(i5);
            Object objAaT4 = bfm.AaT();
            if (zA17 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT4;
            boolean zA172 = AnonymousClass003.A17(i5);
            Object objAaT5 = bfm.AaT();
            if (zA172 || objAaT5 == C78N.A00) {
                objAaT5 = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r2 = (C00r) objAaT5;
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == C78N.A00) {
                objAaT6 = new ContentAudioFocus(contextA0H);
                bfm.Ai0(objAaT6);
            }
            ContentAudioFocus contentAudioFocus = (ContentAudioFocus) objAaT6;
            boolean zA652 = bfm.A65(mutableState2);
            Object objAaT7 = bfm.AaT();
            if (zA652 || objAaT7 == C78N.A00) {
                objAaT7 = new MediaViewerContentKt$ContentAudioPlayer$1$1(mutableState2);
                bfm.Ai0(objAaT7);
            }
            contentAudioFocus.setPlaying((Function0) objAaT7);
            boolean zA1K = AnonymousClass003.A1K(bfm, mutableState, mutableState2);
            Object objAaT8 = bfm.AaT();
            if (zA1K || objAaT8 == C78N.A00) {
                objAaT8 = new MediaViewerContentKt$ContentAudioPlayer$2$1(mutableState, mutableState2);
                bfm.Ai0(objAaT8);
            }
            contentAudioFocus.setOnPause((Function0) objAaT8);
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableState2, contentAudioFocus, bfm.A65(mutableState));
            Object objAaT9 = bfm.AaT();
            if (zA1S || objAaT9 == C78N.A00) {
                objAaT9 = new MediaViewerContentKt$ContentAudioPlayer$3$1(contentAudioFocus, mutableState, mutableState2);
                bfm.Ai0(objAaT9);
            }
            contentAudioFocus.setOnResume((Function0) objAaT9);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1X = AnonymousClass005.A1X(bfm, mutableState, contentAudioFocus, AnonymousClass004.A1M(iA0d), bfm.A65(mutableState2));
            Object objAaT10 = bfm.AaT();
            if (zA1X || objAaT10 == C78N.A00) {
                objAaT10 = new MediaViewerContentKt$ContentAudioPlayer$4$1(z2, mutableState2, mutableState, contentAudioFocus, null);
                bfm.Ai0(objAaT10);
            }
            AnonymousClass001.A18(bfm, objAaT10, boolValueOf);
            boolean zA1O = AnonymousClass003.A1O(bfm, contextA0H, str3, AnonymousClass004.A1S(bfm, c00r, contentAudioFocus, AnonymousClass005.A1T(bfm, c00r2, mutableState3, mutableState2, bfm.A65(mutableState))) | AnonymousClass003.A17(i5));
            Object objAaT11 = bfm.AaT();
            if (zA1O || objAaT11 == C78N.A00) {
                objAaT11 = new MediaViewerContentKt$ContentAudioPlayer$5$1(str, contextA0H, str3, mutableState, c00r2, mutableState3, contentAudioFocus, mutableState2, c00r);
                bfm.Ai0(objAaT11);
            }
            AnonymousClass001.A17(bfm, objAaT11, str);
            Boolean boolValueOf2 = Boolean.valueOf(MutableState.A0A(mutableState2));
            boolean zA1R = AnonymousClass005.A1R(bfm, mutableState2, mutableState, c00r);
            Object objAaT12 = bfm.AaT();
            if (zA1R || objAaT12 == C78N.A00) {
                objAaT12 = new MediaViewerContentKt$ContentAudioPlayer$6$1(mutableState2, mutableState, c00r, null);
                bfm.Ai0(objAaT12);
            }
            AnonymousClass001.A18(bfm, objAaT12, boolValueOf2);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(bRg2.then(c1062ATq), 16.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).bodyEmphasized, null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d >> 3), 6, 14834);
            BS0 bs0 = BRg.A00;
            BRg bRgA012 = C11U.A01(C3U4.A0C(c1062ATq, 0.0f, 12.0f, 0.0f, 0.0f), 12.0f);
            long j2 = auraColorsA0c.background;
            C1DM c1dm = C1OM.A00;
            BRg bRgA0B2 = C3U4.A0B(C1b8.A03(bRgA012, c1dm, j2), 12.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            if (MutableState.A0A(mutableState3)) {
                bfm.AgE(1338925583);
                boolean zA0A = MutableState.A0A(mutableState2);
                int i7 = R.drawable.ic_playback_play;
                if (zA0A) {
                    i7 = R.drawable.ic_playback_pause;
                }
                AVy aVyA00 = BOf.A00(bfm, i7, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
                long j3 = auraColorsA0c.primaryIcon.enabled;
                boolean zA1S2 = AnonymousClass004.A1S(bfm, mutableState2, contentAudioFocus, bfm.A65(mutableState));
                Object objAaT13 = bfm.AaT();
                if (zA1S2 || objAaT13 == C78N.A00) {
                    objAaT13 = new MediaViewerContentKt$ContentAudioPlayer$7$1$1$1(mutableState, contentAudioFocus, mutableState2);
                    bfm.Ai0(objAaT13);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, str2, (Function0) objAaT13, null, false, new B6A(j3), null, null, null, bfm, AnonymousClass001.A05(iA0d << 15, (AVy.$stable << 3) | 28032), 0, 15137);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1338836396);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, false);
            }
            BRg bRgA014 = C11U.A01(C10G.A04(C3U4.A0B(c90m.AiP(bs0, 1.0f, true), 10.0f, 0.0f), 4.0f), 2.0f);
            long j4 = auraColorsA0c.tertiaryText;
            BRg bRgA03 = C1b8.A03(bRgA014, c1dm, HxS.A04(HDi.A0O[(int) (j4 & 63)], B6A.A03(j4), B6A.A02(j4), B6A.A01(j4), 0.3f));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA015, g0vA0u);
            C3Ue.A04(C1b8.A03(C11U.A01(C10G.A04(C10G.A03(bs0, ATD.A03(c00r2.AGd() > 0 ? c00r.AGd() / c00r2.AGd() : 0.0f, 0.0f, 1.0f)), 4.0f), 2.0f), c1dm, auraColorsA0c.primaryIcon.enabled), bfm, 0);
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(MutableState.A0A(mutableState3) ? FGI.A0U(AnonymousClass007.A0X(c00r.AGd() / 1000), " / ", AnonymousClass007.A0X(c00r2.AGd() / 1000)) : "0:00", null, auraColorsA0c.secondaryText, AnonymousClass001.A0g(bfm, akh).caption1Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass8(str, str2, bRg2, z2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* renamed from: MediaPage-LUJyAio, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m903MediaPageLUJyAio(com.facebook.aura.file.view.api.ContentItem r51, boolean r52, final boolean r53, final boolean r54, boolean r55, X.G0U<? super java.lang.Boolean, kotlin.Unit> r56, final boolean r57, com.facebook.aura.navigation.HatchDragDismissState r58, final X.G0U<? super java.lang.Boolean, kotlin.Unit> r59, final kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, final kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.C1DM r63, final com.facebook.aura.file.view.ZoomState r64, long r65, X.BRg r67, X.BFM r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.m903MediaPageLUJyAio(com.facebook.aura.file.view.api.ContentItem, boolean, boolean, boolean, boolean, X.G0U, boolean, com.facebook.aura.navigation.HatchDragDismissState, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.1DM, com.facebook.aura.file.view.ZoomState, long, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void MediaViewerContent_WJFJby4$lambda$36(MutableState<BL4> mutableState, long j) {
        mutableState.Af8(new BL4(j));
    }

    public static final void MediaViewerControls(ContentItem contentItem, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, BRg bRg, BFM bfm, int i, int i2) {
        ContentSocialSource contentSocialSource;
        BRg bRg2 = bRg;
        bfm.AgG(-288579801);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, contentItem) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function04);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function05);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function06);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function07 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function07);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, function0, null, HatchHeaderTitleAlignment.HIDDEN, false, R.drawable.x_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed), null, false, null, null, null, B1V.A00(bfm, new MediaViewerContentKt$MediaViewerControls$1$1(contentItem, function02, function03, function04, function05, function06), 719058026), 0L, 0L, null, null, 0, null, null, false, bfm, ((iA0d << 3) & 896) | RuntimeInternals.IOPRIO_BACKGROUND, 3072, 0, 4185899);
            if (contentItem == null || (contentSocialSource = contentItem.socialSource) == null || !contentSocialSource.getHasAttribution()) {
                bfm.AgE(53676961);
            } else {
                bfm.AgE(53537616);
                MediaViewerSocialAttribution(contentSocialSource, c0z7.A4C(C2VU.A06, BRg.A00), bfm, 0, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(contentItem, function0, function02, function03, function04, function05, function06, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediaViewerItemActions(com.facebook.aura.file.view.api.ContentItem r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, X.BRg r78, X.G0U<? super java.lang.Boolean, kotlin.Unit> r79, X.BFM r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.MediaViewerItemActions(com.facebook.aura.file.view.api.ContentItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.G0U, X.BFM, int, int):void");
    }

    public static final void MediaViewerPrimaryButton(AVy aVy, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1424517527);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aVy, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRg2, aVy, AuraIconButtonSizeV2.LARGE, AuraIconButtonStyle.SECONDARY, AuraIconButtonBackground.NO_BACKGROUND, null, str, function0, null, false, new B6A(C06G.A0A(bfm)), null, null, null, bfm, AnonymousClass005.A05(iA05 << 15, ((iA05 >> 9) & 14) | 28032 | (AVy.$stable << 3) | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0, 15136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119801(aVy, str, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediaViewerSocialAttribution(com.facebook.aura.file.view.api.ContentSocialSource r39, X.BRg r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.MediaViewerSocialAttribution(com.facebook.aura.file.view.api.ContentSocialSource, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x022c A[PHI: r33
  0x022c: PHI (r33v4 boolean) = (r33v1 boolean), (r33v1 boolean), (r33v0 boolean) binds: [B:148:0x03dd, B:151:0x03e5, B:94:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: MediaViewerVideo-lXbYAwQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m905MediaViewerVideolXbYAwQ(com.facebook.aura.file.view.api.ContentItem r63, android.net.Uri r64, boolean r65, boolean r66, boolean r67, boolean r68, com.facebook.aura.file.view.ZoomState r69, long r70, X.BRg r72, X.G0W<? super com.facebook.aura.common.video.HatchVideoPlayer, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r73, X.BFM r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.m905MediaViewerVideolXbYAwQ(com.facebook.aura.file.view.api.ContentItem, android.net.Uri, boolean, boolean, boolean, boolean, com.facebook.aura.file.view.ZoomState, long, X.BRg, X.G0W, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* renamed from: ProgressiveViewerImage-7RoMKGQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m906ProgressiveViewerImage7RoMKGQ(java.lang.String r38, java.lang.String r39, X.BL4 r40, long r41, boolean r43, boolean r44, X.BRg r45, java.lang.Float r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.m906ProgressiveViewerImage7RoMKGQ(java.lang.String, java.lang.String, X.BL4, long, boolean, boolean, X.BRg, java.lang.Float, X.BFM, int, int):void");
    }

    public static final void VideoMuteButton(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2045484460);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, 36.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            boolean zA1C = AnonymousClass003.A1C(iA0n) | AnonymousClass001.A1L(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new MediaViewerContentKt$VideoMuteButton$2$1(g0u, z);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA01 = C0v5.A01(null, interfaceC1072AWd, bRgA07, null, null, (Function0) objAaT2, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0D);
            int i4 = R.drawable.speaker_mid_wght400_filled_24;
            if (z) {
                i4 = R.drawable.speaker_off_wght400_outline_24;
            }
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            int i5 = R.string._name_removed__res_0x7f120466;
            if (z) {
                i5 = R.string._name_removed__res_0x7f12046b;
            }
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, AuraIconSize.SMALL, AbstractC2271BQs.A01(bfm, i5), B6A.A08, null, bfm, (AVy.$stable << 3) | 24960, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(z, g0u, bRg2, i, i2);
        }
    }

    public static final void VideoPlayPauseButton(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1676543390);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, 56.0f);
            long j = B6A.A01;
            BRg bRgA01 = C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass005.A0d(bfm), C1b8.A03(bRgA07, C1D8.A00, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.4f)), null, null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            int i4 = R.drawable.ic_playback_play;
            if (z) {
                i4 = R.drawable.ic_playback_pause;
            }
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            int i5 = R.string._name_removed__res_0x7f120469;
            if (z) {
                i5 = R.string._name_removed__res_0x7f120468;
            }
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, AuraIconSize.MEDIUM, AbstractC2271BQs.A01(bfm, i5), B6A.A08, null, bfm, (AVy.$stable << 3) | 24960, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119823(z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VideoPlaybackControls(com.facebook.aura.common.video.HatchVideoPlayer r81, boolean r82, boolean r83, boolean r84, X.G0U<? super java.lang.Boolean, kotlin.Unit> r85, boolean r86, boolean r87, X.G0U<? super java.lang.Boolean, kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, X.BRg r91, X.BFM r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.VideoPlaybackControls(com.facebook.aura.common.video.HatchVideoPlayer, boolean, boolean, boolean, X.G0U, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* renamed from: VideoProgressSlider-8Ml9mos, reason: not valid java name */
    public static final void m907VideoProgressSlider8Ml9mos(float f, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, Function0<Unit> function0, float f2, final float f3, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1060741339);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A08(bfm, f2);
        }
        if ((196608 & i) == 0) {
            iA04 |= AnonymousClass004.A09(bfm, f3);
        }
        if ((1572864 & i) == 0) {
            iA04 |= AnonymousClass002.A01(bfm.A64(j) ? 1 : 0);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA04 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA04 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA04), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            final MutableState mutableStateA002 = C1er.A00(bfm, g0u2);
            final MutableState mutableStateA003 = C1er.A00(bfm, function0);
            int i4 = iA04 & 14;
            boolean zA17 = AnonymousClass003.A17(i4) | AnonymousClass004.A1I(iA04) | AnonymousClass004.A1K(iA04);
            Object objAaT = bfm.AaT();
            if (zA17 || objAaT == C78N.A00) {
                objAaT = new MediaViewerContentKt$VideoProgressSlider$1$1(f, g0u, g0u2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRg2, (G0U) objAaT, false);
            C1DG c1dg = new C1DG(f3);
            int i5 = 458752 & iA04;
            boolean zA1T = AnonymousClass005.A1T(bfm, mutableStateA00, mutableStateA002, mutableStateA003, AnonymousClass002.A1Q(i5, 131072));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$VideoProgressSlider$2$1

                    @DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$VideoProgressSlider$2$1$1", f = "MediaViewerContent.kt", l = {1861, 1874}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoProgressSlider$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnProgressChanged$delegate;
                        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnSeekCancelled$delegate;
                        public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnSeekFinished$delegate;
                        public final /* synthetic */ float $thumbRadiusPx;
                        public float F$0;
                        public float F$1;
                        public int I$0;
                        public /* synthetic */ Object L$0;
                        public Object L$1;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(float f, C1BO<? extends G0U<? super Float, Unit>> c1bo, C1BO<? extends G0U<? super Float, Unit>> c1bo2, C1BO<? extends Function0<Unit>> c1bo3, HtJ<? super AnonymousClass1> htJ) {
                            super(2, htJ);
                            this.$thumbRadiusPx = f;
                            this.$currentOnProgressChanged$delegate = c1bo;
                            this.$currentOnSeekFinished$delegate = c1bo2;
                            this.$currentOnSeekCancelled$delegate = c1bo3;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$thumbRadiusPx, this.$currentOnProgressChanged$delegate, this.$currentOnSeekFinished$delegate, this.$currentOnSeekCancelled$delegate, htJ);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
                        
                            if (r11.A0F == false) goto L20;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[SYNTHETIC] */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e5 -> B:7:0x001f). Please report as a decompilation issue!!! */
                        @Override // X.AbstractC8884Fsp
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                            /*
                                Method dump skipped, instructions count: 237
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt$VideoProgressSlider$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(bRr.Ah4(f3) / 2.0f, mutableStateA00, mutableStateA002, mutableStateA003, null));
                    }
                };
                bfm.Ai0(objAaT2);
            }
            BRg bRgA00 = AaM.A00(bRgA01, (PointerInputEventHandler) objAaT2, c1dg);
            boolean zA1Q = AnonymousClass002.A1Q(i5, 131072) | AnonymousClass003.A17(i4) | AnonymousClass005.A1M(iA04) | AnonymousClass005.A1C(iA04);
            Object objAaT3 = bfm.AaT();
            if (zA1Q || objAaT3 == C78N.A00) {
                objAaT3 = new MediaViewerContentKt$VideoProgressSlider$3$1(f3, f, f2, j);
                bfm.Ai0(objAaT3);
            }
            C0zJ.A00(bRgA00, (G0U) objAaT3, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new MediaViewerContentKt$VideoProgressSlider$4(f, g0u, g0u2, function0, f2, f3, j, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitReady(com.facebook.aura.common.video.HatchVideoPlayer r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.file.view.MediaViewerContentKt.C119841
            if (r0 == 0) goto L26
            r6 = r8
            com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$1 r6 = (com.facebook.aura.file.view.MediaViewerContentKt.C119841) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L30
            java.lang.Object r3 = r6.L$2
            com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$listener$1 r3 = (com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$listener$1) r3
            java.lang.Object r7 = r6.L$0
            com.facebook.aura.common.video.HatchVideoPlayer r7 = (com.facebook.aura.common.video.HatchVideoPlayer) r7
            goto L2c
        L26:
            com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$1 r6 = new com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$1
            r6.<init>(r8)
            goto L12
        L2c:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L61
            goto L5b
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r1)
            r2 = 0
            X.GAt r1 = new X.GAt
            r1.<init>(r2)
            com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$listener$1 r3 = new com.facebook.aura.file.view.MediaViewerContentKt$awaitReady$listener$1
            r3.<init>()
            r7.addListener(r3)     // Catch: java.lang.Throwable -> L61
            boolean r0 = r7.isReady()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L5b
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L61
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L61
            r6.L$2 = r3     // Catch: java.lang.Throwable -> L61
            r6.label = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r1.A0E(r6)     // Catch: java.lang.Throwable -> L61
            if (r0 != r5) goto L5b
            return r5
        L5b:
            r7.removeListener(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L61:
            r0 = move-exception
            r7.removeListener(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.awaitReady(com.facebook.aura.common.video.HatchVideoPlayer, X.HtJ):java.lang.Object");
    }

    public static final C1EQ controlsScrimBrush(float f) {
        B6A b6a = new B6A(B6A.A06);
        long j = B6A.A01;
        return C1EQ.A01(AnonymousClass004.A17(b6a, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f * 0.2f)), 0.0f, Float.POSITIVE_INFINITY);
    }

    public static final Ej6 finalImageListener(G0U<? super Float, Unit> g0u) {
        return new C119851(g0u);
    }

    public static final String formatAudioTimeMs(int i) {
        return AnonymousClass007.A0X(i / 1000);
    }

    public static final String formatDuration(long j) {
        Object[] objArrCopyOf;
        String str;
        if (j <= 0) {
            return "0:00";
        }
        long j2 = j / 1000;
        long j3 = j2 / TasksViewModel.SECONDS_PER_HOUR;
        long j4 = (j2 % TasksViewModel.SECONDS_PER_HOUR) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            objArrCopyOf = Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)}, 3);
            str = "%d:%02d:%02d";
        } else {
            objArrCopyOf = Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2);
            str = "%d:%02d";
        }
        return String.format(str, objArrCopyOf);
    }

    public static final void logMediaMenuDismiss(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.THREE_DOTS_MENU, null, AnonymousClass007.A0c(HatchMetadataKey.MEDIA_TYPE, str));
    }

    public static final void logVideoRetryClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.RETRY_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.MEDIA_TYPE.getValue(), "video"), null);
    }

    public static final void openExternalUri(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            CFK.A06(TAG, "openExternalUri: no handler for social post link");
        }
    }

    /* renamed from: viewerImageOptions-ozmzZPI, reason: not valid java name */
    public static final C7197Ei9 m913viewerImageOptionsozmzZPI(long j) {
        C7196Ei8 c7196Ei8 = new C7196Ei8(VIEWER_FIT_CENTER_OPTIONS);
        c7196Ei8.A0I = true;
        ((C7195Ei7) c7196Ei8).A06 = new C7481Exe((int) (j >> 32), AnonymousClass002.A09(j));
        return new C7197Ei9(c7196Ei8);
    }

    public static final C7197Ei9 viewerScaleOptions(boolean z) {
        return z ? VIEWER_CENTER_CROP_OPTIONS : VIEWER_FIT_CENTER_OPTIONS;
    }

    /* renamed from: viewerThumbnailOptions-3xf3HDo$default, reason: not valid java name */
    public static /* synthetic */ C7197Ei9 m915viewerThumbnailOptions3xf3HDo$default(boolean z, long j, BL4 bl4, int i, Object obj) {
        if ((i & 4) != 0) {
            bl4 = null;
        }
        return m914viewerThumbnailOptions3xf3HDo(z, j, bl4);
    }

    public static final void MediaMusicHeader(MusicAttribution musicAttribution, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(714090923);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, musicAttribution) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraMusicAttributionKt.AuraMusicAttribution(musicAttribution, C3U4.A09(AuraTopScrimKt.m377auraTopScrim4WTKRHQ(AnonymousClass001.A0R(bRg), AnonymousClass002.A0c(bfm).scrim), AuraDimensKt.SpacingLarge), null, bfm, iA0d & 14, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(musicAttribution, bRg, i, i2);
        }
    }

    public static final long MediaViewerContent_WJFJby4$lambda$35(MutableState<BL4> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final /* synthetic */ MediaPlayer access$ContentAudioPlayer$lambda$1(MutableState mutableState) {
        return (MediaPlayer) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* renamed from: viewerThumbnailOptions-3xf3HDo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7197Ei9 m914viewerThumbnailOptions3xf3HDo(boolean r9, long r10, X.BL4 r12) {
        /*
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 32
            if (r12 == 0) goto L30
            long r3 = r12.A00
            long r1 = r3 >> r6
            int r0 = (int) r1
            if (r0 <= 0) goto L30
            long r1 = r3 & r7
            int r0 = (int) r1
            if (r0 <= 0) goto L30
        L15:
            X.Ei9 r0 = viewerScaleOptions(r9)
            X.Ei8 r5 = new X.Ei8
            r5.<init>(r0)
            long r0 = r3 >> r6
            int r2 = (int) r0
            long r3 = r3 & r7
            int r1 = (int) r3
            X.Exe r0 = new X.Exe
            r0.<init>(r2, r1)
            r5.A06 = r0
            X.Ei9 r0 = new X.Ei9
            r0.<init>(r5)
            return r0
        L30:
            X.BL4 r0 = new X.BL4
            r0.<init>(r10)
            long r3 = r0.A00
            long r1 = r3 >> r6
            int r0 = (int) r1
            if (r0 <= 0) goto L4a
            long r1 = r3 & r7
            int r0 = (int) r1
            if (r0 <= 0) goto L4a
            X.BL4 r0 = com.facebook.aura.vds.compose.image.AuraImageKt.m2575auraDecodeSizeForozmzZPI(r3)
            if (r0 == 0) goto L4a
            long r3 = r0.A00
            goto L15
        L4a:
            r3 = 1024(0x400, double:5.06E-321)
            long r0 = r3 << r6
            long r3 = r3 | r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.m914viewerThumbnailOptions3xf3HDo(boolean, long, X.BL4):X.Ei9");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /* renamed from: MediaViewerContent-WJFJby4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m904MediaViewerContentWJFJby4(com.facebook.aura.navigation.AuraNavKey r98, X.AHD<com.facebook.aura.file.view.api.ContentItem> r99, int r100, long r101, boolean r103, boolean r104, X.G0U<? super java.lang.Boolean, kotlin.Unit> r105, boolean r106, X.G0U<? super java.lang.Boolean, kotlin.Unit> r107, boolean r108, X.G0U<? super java.lang.Boolean, kotlin.Unit> r109, kotlin.jvm.functions.Function0<kotlin.Unit> r110, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r111, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r112, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r113, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r114, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r115, X.BRg r116, X.G0U<? super java.lang.Integer, kotlin.Unit> r117, boolean r118, boolean r119, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r120, X.BFM r121, int r122, int r123, int r124, int r125) {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.MediaViewerContentKt.m904MediaViewerContentWJFJby4(com.facebook.aura.navigation.AuraNavKey, X.AHD, int, long, boolean, boolean, X.G0U, boolean, X.G0U, boolean, X.G0U, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.BRg, X.G0U, boolean, boolean, X.G0W, X.BFM, int, int, int, int):void");
    }
}
