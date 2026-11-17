package com.facebook.aura.composer.view;

import X.AGH;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AXN;
import X.AY5;
import X.AYD;
import X.Ab8;
import X.AbstractC1103AYp;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BQI;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C05121Yx;
import X.C06G;
import X.C0A8;
import X.C0Hi;
import X.C0nh;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11S;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1518AkS;
import X.C1736ApY;
import X.C1768AqL;
import X.C1822Arm;
import X.C1870Ask;
import X.C1890At8;
import X.C1958Aux;
import X.C1C3;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1Dt;
import X.C1EQ;
import X.C1HY;
import X.C1Hj;
import X.C1O0;
import X.C1YD;
import X.C1b8;
import X.C20Q;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C3Ue;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.F2N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC2056AxT;
import X.InterfaceC2143AzF;
import X.InterfaceC2161Azr;
import X.InterfaceC8647Fhz;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.composer.upload.AttachmentFilenamesKt;
import com.facebook.aura.composer.util.ThumbnailResult;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceBitmap;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsIconTint;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchComposerKt {
    public static final float ATTACHMENT_TILE_SIZE = 88.0f;
    public static final int CAPTURE_MENU_CAMERA = 0;
    public static final int CAPTURE_MENU_SCREENSHOT = 1;
    public static final float COMPOSER_INLINE_BUTTON_SIZE = 36.0f;
    public static final float COMPOSER_INLINE_ICON_SIZE = 24.0f;
    public static final float COMPOSER_MIC_ICON_PADDING = 8.0f;
    public static final float DICTATION_CANCEL_THRESHOLD = 60.0f;
    public static final float DISABLED_ACTION_BUTTON_ALPHA = 0.4f;

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$AttachmentDismissButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            HatchComposerKt.AttachmentDismissButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$AttachmentUploadStatusOverlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isFailed;
        public final /* synthetic */ boolean $isUploading;
        public final /* synthetic */ InterfaceC05151eP $this_AttachmentUploadStatusOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC05151eP interfaceC05151eP, boolean z, boolean z2, int i) {
            super(2);
            this.$this_AttachmentUploadStatusOverlay = interfaceC05151eP;
            this.$isUploading = z;
            this.$isFailed = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerKt.AttachmentUploadStatusOverlay(this.$this_AttachmentUploadStatusOverlay, this.$isUploading, this.$isFailed, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ClearablePendingDiscussionItemPreview$3, reason: invalid class name and case insensitive filesystem */
    public final class C111813 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C1518AkS $attachButtonFocusRequester;
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClearClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111813(Bitmap bitmap, Function0<Unit> function0, C1518AkS c1518AkS, BRg bRg, int i, int i2) {
            super(2);
            this.$bitmap = bitmap;
            this.$onClearClick = function0;
            this.$attachButtonFocusRequester = c1518AkS;
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
            HatchComposerKt.ClearablePendingDiscussionItemPreview(this.$bitmap, this.$onClearClick, this.$attachButtonFocusRequester, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerAttachmentPreviews$2, reason: invalid class name and case insensitive filesystem */
    public final class C111822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
        public final /* synthetic */ BQI<String> $failedUploadUris;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onAttachmentClick;
        public final /* synthetic */ G0U<Integer, Unit> $onClearFileClick;
        public final /* synthetic */ G0U<Integer, Unit> $onClearImageClick;
        public final /* synthetic */ G0U<String, Unit> $onRetryUpload;
        public final /* synthetic */ AHD<String> $pendingFileUris;
        public final /* synthetic */ AHD<String> $pendingImageUris;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ BQI<String> $uploadingFileUris;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111822(AHD<String> ahd, AHD<String> ahd2, BQI<String> bqi, BQI<String> bqi2, G0U<? super String, Unit> g0u, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3, G0U<? super String, Unit> g0u4, boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint, BRg bRg, C3TQ c3tq, int i, int i2, int i3) {
            super(2);
            this.$pendingImageUris = ahd;
            this.$pendingFileUris = ahd2;
            this.$uploadingFileUris = bqi;
            this.$failedUploadUris = bqi2;
            this.$onRetryUpload = g0u;
            this.$onClearImageClick = g0u2;
            this.$onClearFileClick = g0u3;
            this.$onAttachmentClick = g0u4;
            this.$isPrimaryThread = z;
            this.$threadId = str;
            this.$entryPoint = hatchComposerEntryPoint;
            this.$modifier = bRg;
            this.$contentPadding = c3tq;
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
            HatchComposerKt.ComposerAttachmentPreviews(this.$pendingImageUris, this.$pendingFileUris, this.$uploadingFileUris, this.$failedUploadUris, this.$onRetryUpload, this.$onClearImageClick, this.$onClearFileClick, this.$onAttachmentClick, this.$isPrimaryThread, this.$threadId, this.$entryPoint, this.$modifier, this.$contentPadding, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerCaptureMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C111832 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111832(AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$menuItems = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(1924385929);
            AHD<AuraContextMenuItem> ahd = this.$menuItems;
            AnonymousClass002.A19(bfm);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerCaptureMenu$3, reason: invalid class name and case insensitive filesystem */
    public final class C111843 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCameraClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onScreenshotClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111843(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onCameraClick = function02;
            this.$onScreenshotClick = function03;
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
            HatchComposerKt.ComposerCaptureMenu(this.$expanded, this.$onDismiss, this.$onCameraClick, this.$onScreenshotClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C111852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ boolean $isDictating;
        public final /* synthetic */ Function0<Unit> $onFocusRequested;
        public final /* synthetic */ boolean $requested;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111852(boolean z, boolean z2, C1518AkS c1518AkS, Function0<Unit> function0, int i) {
            super(2);
            this.$requested = z;
            this.$isDictating = z2;
            this.$focusRequester = c1518AkS;
            this.$onFocusRequested = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerKt.ComposerFocusEffect(this.$requested, this.$isDictating, this.$focusRequester, this.$onFocusRequested, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerInputDecoration$2, reason: invalid class name and case insensitive filesystem */
    public final class C111862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hintText;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $innerTextField;
        public final /* synthetic */ boolean $isEmpty;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $prefixText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111862(boolean z, String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$isEmpty = z;
            this.$hintText = str;
            this.$prefixText = str2;
            this.$innerTextField = g0v;
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
            HatchComposerKt.ComposerInputDecoration(this.$isEmpty, this.$hintText, this.$prefixText, this.$innerTextField, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isProminent;
        public final /* synthetic */ C20Q<Unit> $micFocusRequests;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Boolean> $movesFocusOnClick;
        public final /* synthetic */ boolean $offersHold;
        public final /* synthetic */ Function0<Unit> $onMicHold;
        public final /* synthetic */ Function0<Unit> $onMicTap;
        public final /* synthetic */ DictationSendStandIn $sendStandIn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, Function0<Boolean> function03, C20Q<Unit> c20q, DictationSendStandIn dictationSendStandIn, BRg bRg, int i, int i2) {
            super(2);
            this.$onMicTap = function0;
            this.$onMicHold = function02;
            this.$isProminent = z;
            this.$offersHold = z2;
            this.$movesFocusOnClick = function03;
            this.$micFocusRequests = c20q;
            this.$sendStandIn = dictationSendStandIn;
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
            HatchComposerKt.ComposerMicButton(this.$onMicTap, this.$onMicHold, this.$isProminent, this.$offersHold, this.$movesFocusOnClick, this.$micFocusRequests, this.$sendStandIn, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$3, reason: invalid class name and case insensitive filesystem */
    public final class C111873 implements C1Hj {
        public final /* synthetic */ String $hintText;
        public final /* synthetic */ String $prefixText;
        public final /* synthetic */ C1890At8 $state;

        @Override // X.C1Hj
        public final void Decoration(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
            C7384Etj.A0Y(g0v, 0);
            bfm.AgG(1125717612);
            int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
            if ((i & 48) == 0) {
                iA0T |= AnonymousClass004.A0e(bfm, this);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                HatchComposerKt.ComposerInputDecoration(AnonymousClass002.A1M(this.$state.A07().length()), this.$hintText, this.$prefixText, g0v, null, bfm, (iA0T << 9) & 7168, 16);
            } else {
                bfm.Afo();
            }
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new HatchComposerKt$ComposerRichContentInput$3$Decoration$1(this, g0v, i);
            }
        }

        public C111873(C1890At8 c1890At8, String str, String str2) {
            this.$state = c1890At8;
            this.$hintText = str;
            this.$prefixText = str2;
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hintText;
        public final /* synthetic */ InterfaceC2143AzF $inputTransformation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAddImageUris;
        public final /* synthetic */ G0V<AXN, C1958Aux, Unit> $onTextLayout;
        public final /* synthetic */ String $prefixText;
        public final /* synthetic */ C1890At8 $state;
        public final /* synthetic */ boolean $swipeDownDismissesKeyboard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(C1890At8 c1890At8, InterfaceC2143AzF interfaceC2143AzF, String str, String str2, G0U<? super List<? extends Uri>, Unit> g0u, boolean z, G0V<? super AXN, ? super C1958Aux, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$state = c1890At8;
            this.$inputTransformation = interfaceC2143AzF;
            this.$hintText = str;
            this.$prefixText = str2;
            this.$onAddImageUris = g0u;
            this.$swipeDownDismissesKeyboard = z;
            this.$onTextLayout = g0v;
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
            HatchComposerKt.ComposerRichContentInput(this.$state, this.$inputTransformation, this.$hintText, this.$prefixText, this.$onAddImageUris, this.$swipeDownDismissesKeyboard, this.$onTextLayout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$HatchComposerPill$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerKt.HatchComposerPill(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$PendingDiscussionItemPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C111882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClearClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111882(Bitmap bitmap, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$bitmap = bitmap;
            this.$onClearClick = function0;
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
            HatchComposerKt.PendingDiscussionItemPreview(this.$bitmap, this.$onClearClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$PendingFilePreview$6, reason: invalid class name and case insensitive filesystem */
    public final class C111896 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $fileUri;
        public final /* synthetic */ boolean $isFailed;
        public final /* synthetic */ boolean $isUploading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClearClick;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111896(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$fileUri = str;
            this.$onClearClick = function0;
            this.$onClick = function02;
            this.$modifier = bRg;
            this.$isUploading = z;
            this.$isFailed = z2;
            this.$onRetry = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerKt.PendingFilePreview(this.$fileUri, this.$onClearClick, this.$onClick, this.$modifier, this.$isUploading, this.$isFailed, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$PendingImageThumbnail$5, reason: invalid class name and case insensitive filesystem */
    public final class C111905 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isFailed;
        public final /* synthetic */ boolean $isUploading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClearClick;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111905(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$imageUri = str;
            this.$onClearClick = function0;
            this.$onClick = function02;
            this.$modifier = bRg;
            this.$isUploading = z;
            this.$isFailed = z2;
            this.$onRetry = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerKt.PendingImageThumbnail(this.$imageUri, this.$onClearClick, this.$onClick, this.$modifier, this.$isUploading, this.$isFailed, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchComposerPill(BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0w, 1);
        bfm.AgG(-1027398683);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(AnonymousClass003.A0U(bRg), 24.0f), AnonymousClass002.A0c(bfm).bubble);
            int i4 = (iA0d << 6) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AnonymousClass001.A1G(C0z7.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, g0w, i, i2);
        }
    }

    /* renamed from: ActionButton-gI4cVvE, reason: not valid java name */
    public static final void m430ActionButtongI4cVvE(int i, Function0<Unit> function0, long j, long j2, BRg bRg, String str, float f, float f2, boolean z, BFM bfm, int i2, int i3) {
        String str2 = str;
        float f3 = f;
        float f4 = f2;
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-259683892);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0P(bfm, j2);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i5 = i3 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str2);
            iA0D |= iA0i;
        }
        int i6 = i3 & 64;
        int iA0A = 1572864;
        if (i6 != 0) {
            iA0D |= iA0A;
        } else if ((1572864 & i2) == 0) {
            iA0A = AnonymousClass004.A0A(bfm, f3);
            iA0D |= iA0A;
        }
        int i7 = i3 & 128;
        int iA0B = 12582912;
        if (i7 != 0) {
            iA0D |= iA0B;
        } else if ((12582912 & i2) == 0) {
            iA0B = AnonymousClass004.A0B(bfm, f4);
            iA0D |= iA0B;
        }
        int i8 = i3 & 256;
        int iA0v = 100663296;
        if (i8 != 0) {
            iA0D |= iA0v;
        } else if ((100663296 & i2) == 0) {
            i8 = 0;
            iA0v = AnonymousClass004.A0v(bfm, z2);
            iA0D |= iA0v;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                str2 = null;
            }
            if (i6 != 0) {
                f3 = 8.0f;
            }
            if (i7 != 0) {
                f4 = 48.0f;
            }
            if (i8 != 0) {
                z2 = true;
            }
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            boolean z3 = (458752 & iA0D) == 131072;
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$ActionButton$1$1(str2);
                bfm.Ai0(objAaT);
            }
            C0nh.A00(bfm, C3U4.A09(C1b8.A03(C10G.A07(C11S.A00(ARD.A01(bRg2, (G0U) objAaT, false).then(z2 ? C0v5.A01(new C05121Yx(), null, BRg.A00, new C1YD(0), null, function0, true) : BRg.A00), z2 ? 1.0f : 0.4f), f4), C1D8.A00, j2), f3), aVyA00, null, null, AVy.$stable | 48 | ((iA0D << 3) & 7168), 48, j, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchComposerKt$ActionButton$2(i, function0, j, j2, bRg2, str2, f3, f4, z2, i2, i3);
        }
    }

    public static final void AttachmentDismissButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1035547055);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12071f);
            BRg bRgA04 = C0v5.A04(C1b8.A00(C11U.A01(AnonymousClass001.A0S(bRg2), 12.0f), 0.45f, B6A.A01), new C1YD(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$AttachmentDismissButton$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.nav_close, 0), AuraIconSize.X_TINY, null, B6A.A08, null, bfm, (AVy.$stable << 3) | 28032, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, i, i2);
        }
    }

    public static final void ClearablePendingDiscussionItemPreview(Bitmap bitmap, Function0<Unit> function0, C1518AkS c1518AkS, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1945178094);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, bitmap) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, c1518AkS);
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            if (bitmap != null) {
                bfm.AgE(-1101556729);
                Context contextA0H = AnonymousClass002.A0H(bfm);
                boolean zA1S = AnonymousClass001.A1S(bfm, contextA0H, AnonymousClass001.A1N(iA0T));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == obj) {
                    objAaT2 = new HatchComposerKt$ClearablePendingDiscussionItemPreview$1$1(function0, contextA0H, mutableState);
                    bfm.Ai0(objAaT2);
                }
                PendingDiscussionItemPreview(bitmap, (Function0) objAaT2, bRg2, bfm, (iA0T & 14) | ((iA0T >> 3) & 896), 0);
            } else if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1101225866);
                Unit unit = Unit.INSTANCE;
                boolean z = (iA0T & 896) == 256;
                Object objAaT3 = bfm.AaT();
                if (z || objAaT3 == obj) {
                    objAaT3 = new HatchComposerKt$ClearablePendingDiscussionItemPreview$2$1(c1518AkS, mutableState, null);
                    bfm.Ai0(objAaT3);
                }
                AnonymousClass001.A18(bfm, objAaT3, unit);
            } else {
                bfm.AgE(-1101077872);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111813(bitmap, function0, c1518AkS, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ComposerAttachmentPreviews(X.AHD<java.lang.String> r45, X.AHD<java.lang.String> r46, X.BQI<java.lang.String> r47, X.BQI<java.lang.String> r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, X.G0U<? super java.lang.Integer, kotlin.Unit> r50, X.G0U<? super java.lang.Integer, kotlin.Unit> r51, X.G0U<? super java.lang.String, kotlin.Unit> r52, boolean r53, java.lang.String r54, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r55, X.BRg r56, X.C3TQ r57, X.BFM r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt.ComposerAttachmentPreviews(X.AHD, X.AHD, X.BQI, X.BQI, X.G0U, X.G0U, X.G0U, X.G0U, boolean, java.lang.String, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint, X.BRg, X.3TQ, X.BFM, int, int, int):void");
    }

    public static final void ComposerCaptureMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-259049007);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120728);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120724);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.camera_outline, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.screenshot_outline, 0);
            boolean zRememberIsCameraCaptureAvailable = ComposerCameraAvailabilityKt.rememberIsCameraCaptureAvailable(bfm, 0);
            boolean zA1R = AnonymousClass001.A1R(bfm, aVyA002, AnonymousClass005.A1T(bfm, strA01, strA012, aVyA00, bfm.A66(zRememberIsCameraCaptureAvailable)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                BS0 bs0 = BRg.A00;
                AuraContextMenuItem auraContextMenuItem = new AuraContextMenuItem(0, strA01, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1);
                if (!zRememberIsCameraCaptureAvailable) {
                    auraContextMenuItem = null;
                }
                objAaT = AnonymousClass001.A0z(bfm, BFI.A0F(new AuraContextMenuItem[]{auraContextMenuItem, new AuraContextMenuItem(1, strA012, null, aVyA002, null, null, false, false, false, true, false, bs0, 1, 1)}));
            }
            AHD ahd = (AHD) objAaT;
            long jA0B = AnonymousClass007.A0B(0.0f, 8.0f);
            boolean zA1C = AnonymousClass003.A1C(iA0n) | AnonymousClass004.A1K(iA0n) | AnonymousClass006.A1X(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new HatchComposerKt$ComposerCaptureMenu$1$1(function0, function02, function03);
                bfm.Ai0(objAaT2);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRg2, (G0U) objAaT2, function0, z, null, jA0B, null, false, new C111832(ahd), false, null, null, null, false, bfm, AnonymousClass003.A09(iA0n << 3, ((iA0n >> 12) & 14) | 196608, iA0n), 0, 16080);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111843(z, function0, function02, function03, bRg2, i, i2);
        }
    }

    /* renamed from: ComposerInlineIconButton-HYR8e34, reason: not valid java name */
    public static final void m431ComposerInlineIconButtonHYR8e34(int i, String str, Function0<Unit> function0, BRg bRg, boolean z, float f, BFM bfm, int i2, int i3) {
        BRg bRgA01;
        BRg bRg2;
        BRg bRg3 = bRg;
        boolean z2 = z;
        float f2 = f;
        AnonymousClass002.A1A(str, 1, function0);
        bfm.AgG(1997070896);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg3);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0r(bfm, z2);
        }
        int i6 = i3 & 32;
        int iA09 = 196608;
        if (i6 != 0) {
            iA0D |= iA09;
        } else if ((196608 & i2) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f2);
            iA0D |= iA09;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0D, 74898), bfm, iA0D)) {
            if (i4 != 0) {
                bRg3 = BRg.A00;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (i6 != 0) {
                f2 = COMPOSER_INLINE_ICON_SIZE;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            boolean zA1I = AnonymousClass004.A1I(iA0D);
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$ComposerInlineIconButton$1$1(str);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg3, objAaT, false);
            if (z2) {
                bRg2 = BRg.A00;
                bRgA01 = C0v5.A01(new C05121Yx(), null, bRg2, new C1YD(0), null, function0, true);
            } else {
                bRgA01 = BRg.A00;
                bRg2 = bRgA01;
            }
            BRg bRgThen = bRgA0Y.then(bRgA01);
            float f3 = COMPOSER_INLINE_BUTTON_SIZE;
            BRg bRgA08 = C10G.A08(C10G.A04(bRgThen, f3), f3);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA08);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            BRg bRgA07 = C10G.A07(bRg2, f2);
            AuraColorsIconTint auraColorsIconTint = auraColorsA0c.primaryIcon;
            C0nh.A00(bfm, bRgA07, aVyA00, null, null, AVy.$stable | 48, 48, z2 ? auraColorsIconTint.enabled : auraColorsIconTint.disabled, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchComposerKt$ComposerInlineIconButton$3(i, str, function0, bRg3, z2, f2, i2, i3);
        }
    }

    public static final void ComposerInputDecoration(boolean z, String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1014555871);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, g0v);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRgA0Q), 8.0f, 13.0f, 0.0f, 13.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
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
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (z && str2 == null) {
                bfm.AgE(-1324506249);
                C1Dt.A01(null, bfm, null, str, "composerHintCrossfade", B1V.A00(bfm, new HatchComposerKt$ComposerInputDecoration$1$1(auraColorsA0c, auraTypographyA0f), -31953536), ((iA0n >> 3) & 14) | 27648, 6);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1324164133);
                BBI.A0R(bbi, false);
                if (str2 != null) {
                    bfm.AgE(-1324092523);
                    BS0 bs0 = BRg.A00;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bs0);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v2);
                    BPg.A02(bfm, akqA042, g0v3);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.primaryText, C1822Arm.A00(null, auraTypographyA0f.bodyRegular, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0n >> 6) & 14, 0, 16370);
                    AnonymousClass004.A1C(bbi, bfm, g0v, iA0n >> 9, true);
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            bfm.AgE(-1324134435);
            AnonymousClass003.A13(bfm, g0v, iA0n >> 9);
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111862(z, str, str2, g0v, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158  */
    /* JADX WARN: Type inference failed for: r33v1, types: [X.ARL] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r41v0, types: [X.BFM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ComposerMicButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, boolean r35, boolean r36, kotlin.jvm.functions.Function0<java.lang.Boolean> r37, X.C20Q<kotlin.Unit> r38, com.facebook.aura.composer.view.DictationSendStandIn r39, X.BRg r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt.ComposerMicButton(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, X.20Q, com.facebook.aura.composer.view.DictationSendStandIn, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* renamed from: ComposerPrimaryActionSlot-m9bfrB0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m432ComposerPrimaryActionSlotm9bfrB0(boolean r50, boolean r51, boolean r52, boolean r53, long r54, long r56, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, boolean r60, java.lang.String r61, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r62, boolean r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, X.BFM r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt.m432ComposerPrimaryActionSlotm9bfrB0(boolean, boolean, boolean, boolean, long, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }

    public static final void ComposerRichContentInput(C1890At8 c1890At8, InterfaceC2143AzF interfaceC2143AzF, String str, String str2, final G0U<? super List<? extends Uri>, Unit> g0u, boolean z, G0V<? super AXN, ? super C1958Aux, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgThen;
        BRg bRg2 = bRg;
        bfm.AgG(-1225799643);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1890At8) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, interfaceC2143AzF);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0v);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            final Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA1R = AnonymousClass001.A1R(bfm, contextA0H, AnonymousClass002.A1Q(iA0d & 57344, 16384));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new InterfaceC2056AxT() { // from class: com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1
                    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[PHI: r4
  0x00aa: PHI (r4v3 X.Ax7) = (r4v0 X.Ax7), (r4v0 X.Ax7), (r4v2 X.Ax7), (r4v0 X.Ax7) binds: [B:20:0x0063, B:22:0x0069, B:28:0x0097, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC2056AxT
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C2040Ax7 onReceive(X.C2040Ax7 r12) {
                        /*
                            r11 = this;
                            r1 = 0
                            X.C7384Etj.A0Y(r12, r1)
                            X.Ayz r0 = r12.A03
                            android.content.ClipDescription r8 = r0.A00
                            java.lang.String r0 = "image/*"
                            boolean r0 = r8.hasMimeType(r0)
                            if (r0 == 0) goto L41
                            java.util.ArrayList r5 = X.C3cG.A0h()
                            android.content.Context r0 = r2
                            com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1$remaining$1 r10 = new com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1$remaining$1
                            r10.<init>(r0, r5)
                            X.AsY r0 = r12.A02
                            android.content.ClipData r9 = r0.A00
                            int r0 = r9.getItemCount()
                            r7 = 0
                            r4 = 0
                            r6 = 1
                            if (r0 != r6) goto L42
                            android.content.ClipData$Item r0 = r9.getItemAt(r1)
                            java.lang.Boolean r0 = r10.invoke(r0)
                            boolean r0 = r0.booleanValue()
                            if (r0 != 0) goto Laa
                        L36:
                            boolean r0 = r5.isEmpty()
                            if (r0 != 0) goto L41
                            X.G0U<java.util.List<? extends android.net.Uri>, kotlin.Unit> r0 = r1
                            r0.invoke(r5)
                        L41:
                            return r12
                        L42:
                            int r2 = r9.getItemCount()
                            r3 = r4
                        L47:
                            if (r7 >= r2) goto L63
                            android.content.ClipData$Item r1 = r9.getItemAt(r7)
                            java.lang.Boolean r0 = r10.invoke(r1)
                            boolean r0 = r0.booleanValue()
                            if (r0 != 0) goto L60
                            if (r3 != 0) goto L5d
                            java.util.ArrayList r3 = X.C3cG.A0h()
                        L5d:
                            r3.add(r1)
                        L60:
                            int r7 = r7 + 1
                            goto L47
                        L63:
                            if (r3 == 0) goto Laa
                            boolean r0 = r3.isEmpty()
                            if (r0 != 0) goto Laa
                            int r1 = r3.size()
                            int r0 = r9.getItemCount()
                            if (r1 == r0) goto L36
                            android.content.ClipDescription r4 = new android.content.ClipDescription
                            r4.<init>(r8)
                            java.lang.Object r0 = X.AbstractC0878AGe.A0F(r3)
                            android.content.ClipData$Item r0 = (android.content.ClipData.Item) r0
                            android.content.ClipData r2 = new android.content.ClipData
                            r2.<init>(r4, r0)
                            int r1 = r3.size()
                        L89:
                            if (r6 >= r1) goto L97
                            java.lang.Object r0 = r3.get(r6)
                            android.content.ClipData$Item r0 = (android.content.ClipData.Item) r0
                            r2.addItem(r0)
                            int r6 = r6 + 1
                            goto L89
                        L97:
                            X.AsY r3 = new X.AsY
                            r3.<init>(r2)
                            X.Ayz r2 = new X.Ayz
                            r2.<init>(r4)
                            int r1 = r12.A00
                            X.BLT r0 = r12.A01
                            X.Ax7 r4 = new X.Ax7
                            r4.<init>(r0, r3, r2, r1)
                        Laa:
                            r12 = r4
                            goto L36
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1.onReceive(X.Ax7):X.Ax7");
                    }

                    @Override // X.InterfaceC2056AxT
                    public /* bridge */ void onDragEnd() {
                    }

                    @Override // X.InterfaceC2056AxT
                    public /* bridge */ void onDragEnter() {
                    }

                    @Override // X.InterfaceC2056AxT
                    public /* bridge */ void onDragExit() {
                    }

                    @Override // X.InterfaceC2056AxT
                    public /* bridge */ void onDragStart() {
                    }
                };
                bfm.Ai0(objAaT);
            }
            final InterfaceC2056AxT interfaceC2056AxT = (InterfaceC2056AxT) objAaT;
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new AY5(AutofillValue.forText(""));
                bfm.Ai0(objAaT2);
            }
            InterfaceC2161Azr interfaceC2161Azr = (InterfaceC2161Azr) objAaT2;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTypographyA0f.bodyRegular, null, null, null, null, null, null, null, null, 0, 3, 0, 16711678, auraColorsA0c.primaryText, 0L, 0L, 0L);
            C1326AhD c1326AhD = new C1326AhD(auraColorsA0c.link);
            C1O0 c1o0 = new C1O0(4);
            AuJ auJ = new AuJ(null, 3, 0, -1);
            bfm.AgE(-1172352040);
            if (z) {
                BS0 bs0 = BRg.A00;
                boolean zA67 = bfm.A67(c0HiA0Z);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == obj) {
                    objAaT3 = new HatchComposerKt$ComposerRichContentInput$1$1$1(c0HiA0Z);
                    bfm.Ai0(objAaT3);
                }
                bRgThen = bRg2.then(ComposerSwipeDismissKt.dismissKeyboardOnSwipeDown(bs0, c1110AYwA00, (Function0) objAaT3));
            } else {
                bRgThen = bRg2;
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgThen2 = bRgThen.then(new Ab8<C1768AqL>(interfaceC2056AxT) { // from class: X.1Z6
                public final InterfaceC2056AxT A00;

                @Override // X.Ab8
                public final boolean equals(Object obj2) {
                    return this == obj2 || ((obj2 instanceof C1Z6) && C7384Etj.areEqual(this.A00, ((C1Z6) obj2).A00));
                }

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                    return new C1768AqL(this.A00);
                }

                @Override // X.Ab8
                public final int hashCode() {
                    return this.A00.hashCode();
                }

                @Override // X.Ab8
                public final void inspectableProperties(ASF asf) {
                    asf.A01 = "receiveContent";
                }

                public final String toString() {
                    return AnonymousClass007.A0Z(this.A00, new StringBuilder("ReceiveContentElement(receiveContentListener="));
                }

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                    ((C1768AqL) abstractC1439Aj8).A00 = this.A00;
                }

                {
                    this.A00 = interfaceC2056AxT;
                }
            });
            boolean zA672 = bfm.A67(interfaceC2161Azr);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new HatchComposerKt$ComposerRichContentInput$2$1(interfaceC2161Azr);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA01 = ARD.A01(bRgThen2, (G0U) objAaT4, false);
            C111873 c111873 = new C111873(c1890At8, str, str2);
            boolean z2 = (iA0d & 3670016) == 1048576;
            Object objAaT5 = bfm.AaT();
            if (z2 || objAaT5 == obj) {
                objAaT5 = new HatchComposerKt$ComposerRichContentInput$4$1(g0v);
                bfm.Ai0(objAaT5);
            }
            AbstractC1874Aso.A01(c1110AYwA00, null, auJ, interfaceC2143AzF, c111873, c1o0, c1890At8, bfm, bRgA01, c1326AhD, c1822ArmA00, (G0V) objAaT5, (iA0d & 14) | 102236160 | ((iA0d << 9) & 57344), 0, 5260, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(c1890At8, interfaceC2143AzF, str, str2, g0u, z, g0v, bRg2, i, i2);
        }
    }

    public static final void PendingDiscussionItemPreview(Bitmap bitmap, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1979602955);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, bitmap) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12071f);
            Alignment alignment = C2VU.A0D;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(AcQ.A00, bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0Q, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            AuraDrawableSourceBitmap auraDrawableSourceBitmap = new AuraDrawableSourceBitmap(bitmap);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12070a);
            BRg bRgA014 = C11U.A01(C10G.A0A(bs0, Float.NaN, 100.0f), 12.0f);
            C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
            c7196Ei8.A00(InterfaceC8647Fhz.A06);
            AuraImageKt.AuraImage(auraDrawableSourceBitmap, bRgA014, strA012, new C7197Ei9(c7196Ei8), false, false, null, false, null, bfm, 0, 496);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchComposerKt$PendingDiscussionItemPreview$1$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0S = AnonymousClass001.A0S(AYD.A03(bs0, (G0U) objAaT));
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C1b8.A03(bRgA0S, C1D8.A00, C06G.A0L(bfm, akh));
            Alignment alignment2 = C2VU.A09;
            BRg bRgA05 = C0v5.A05(C10G.A06(C10G.A02(alignment2, bRgA03, true), 48.0f), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchComposerKt$PendingDiscussionItemPreview$1$1$1$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA4C = c0z7.A4C(alignment, AnonymousClass001.A0Y(bRgA05, objAaT2, false));
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment2, false);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bRgA4C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA015, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.nav_close, 0), AuraIconSize.X_TINY, null, C06G.A0K(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111882(bitmap, function0, bRg2, i, i2);
        }
    }

    public static final void PendingFilePreview(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, Function0<Unit> function03, BFM bfm, int i, int i2) {
        boolean z3;
        BBI bbiA0M;
        BRg bRgA02;
        BRg bRg2;
        BRg bRgA0N;
        boolean z4;
        BRg bRgA0Y;
        boolean z5 = z;
        boolean z6 = z2;
        Function0<Unit> function04 = function03;
        BRg bRg3 = bRg;
        bfm.AgG(1668470336);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg3);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z5);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z6);
            iA0d |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function04);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                z5 = false;
            }
            if (i5 != 0) {
                z6 = false;
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchComposerKt$PendingFilePreview$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function04 = (Function0) objAaT;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12070b);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12072a);
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == C78N.A00) {
                objAaT2 = Uri.parse(str);
                bfm.Ai0(objAaT2);
            }
            Uri uri = (Uri) objAaT2;
            boolean zA65 = bfm.A65(uri);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = AttachmentFilenamesKt.queryDisplayName(contextA0H, uri);
                if (objAaT3 == null) {
                    objAaT3 = contextA0H.getString(R.string._name_removed__res_0x7f120716);
                }
                bfm.Ai0(objAaT3);
            }
            String str2 = (String) objAaT3;
            boolean zA652 = bfm.A65(str2);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                objAaT4 = C7BY.A0R(str2, "", '.').toUpperCase(Locale.ROOT);
                bfm.Ai0(objAaT4);
            }
            String str3 = (String) objAaT4;
            boolean zA653 = bfm.A65(str2);
            Object objAaT5 = bfm.AaT();
            if (zA653 || objAaT5 == C78N.A00) {
                objAaT5 = C7BY.A0T(str2, str2, '.');
                bfm.Ai0(objAaT5);
            }
            String str4 = (String) objAaT5;
            Object objAaT6 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT6 == obj) {
                objAaT6 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT6;
            boolean zA1T = AnonymousClass004.A1T(bfm, contextA0H, uri, bfm.A65(axnA0Y));
            Object objAaT7 = bfm.AaT();
            if (zA1T || objAaT7 == obj) {
                objAaT7 = new HatchComposerKt$PendingFilePreview$2$1(axnA0Y, contextA0H, uri, mutableState, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, uri);
            boolean zA1X = AnonymousClass002.A1X(mutableState.getValue());
            ThumbnailResult thumbnailResult = (ThumbnailResult) mutableState.getValue();
            boolean z7 = thumbnailResult != null ? thumbnailResult.isLight : true;
            C1D3 c1d3A00 = C1D8.A00(zA1X ? 12 : 16);
            BRg bRgA07 = C10G.A07(bRg3, ATTACHMENT_TILE_SIZE);
            if (zA1X) {
                bfm.AgE(1377237232);
                bRg2 = BRg.A00;
                z3 = true;
                bRgA02 = C1DI.A02(bRg2, c1d3A00, 1.0f, AnonymousClass002.A0c(bfm).border);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                z3 = false;
                bbiA0M = AnonymousClass002.A0M(bfm, 1377239496);
                bRgA02 = BRg.A00;
                bRg2 = bRgA02;
            }
            BRg bRgA03 = C11U.A03(bRgA07.then(bRgA02), c1d3A00);
            if (z3) {
                bfm.AgE(1377244904);
                BBI.A0R(bbiA0M, false);
                bRgA0N = bRg2;
            } else {
                bfm.AgE(1377243495);
                bRgA0N = C06G.A0N(bfm, bRg2);
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgThen = bRgA03.then(bRgA0N);
            if (z6) {
                bfm.AgE(1377250082);
                z4 = true;
                BRg bRgA04 = C0v5.A04(bRg2, new C1YD(0), null, function04, true);
                boolean zA654 = bfm.A65(strA01);
                Object objAaT8 = bfm.AaT();
                if (zA654 || objAaT8 == obj) {
                    objAaT8 = new HatchComposerKt$PendingFilePreview$3$1(strA01);
                    bfm.Ai0(objAaT8);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT8, false);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(1377256544);
                z4 = true;
                BRg bRgA042 = C0v5.A04(bRg2, new C1YD(0), null, function02, true);
                boolean zA655 = bfm.A65(strA012);
                Object objAaT9 = bfm.AaT();
                if (zA655 || objAaT9 == obj) {
                    objAaT9 = new HatchComposerKt$PendingFilePreview$4$1(strA012);
                    bfm.Ai0(objAaT9);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA042, objAaT9, false);
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgThen2 = bRgThen.then(bRgA0Y);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen2);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            C1Dt.A01(null, bfm, null, mutableState.getValue(), "fileThumbnail", B1V.A00(bfm, new HatchComposerKt$PendingFilePreview$5$1(str2, str4), 393494918), 27648, 6);
            if (str3.length() > 0) {
                bfm.AgE(1360551516);
                if (z3) {
                    bfm.AgE(1360568473);
                    long j = z7 ? B6A.A08 : B6A.A01;
                    C1b8.A05(bfm, C10G.A04(AnonymousClass001.A0R(c0z7.A4C(alignment, bRg2)), 33.0f), C1EQ.A00(AnonymousClass004.A17(new B6A(j), HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)), 0.0f, Float.POSITIVE_INFINITY));
                    BBI.A0R(bbiA0M, false);
                } else {
                    bfm.AgE(1361155644);
                    BBI.A0R(bbiA0M, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str3, C3U4.A0C(c0z7.A4C(alignment, bRg2), 8.0f, 8.0f, 0.0f, 0.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(1361412572);
            }
            BBI.A0R(bbiA0M, false);
            int i7 = iA0d >> 9;
            AttachmentUploadStatusOverlay(c0z7, z5, z6, bfm, (i7 & 896) | (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            AttachmentDismissButton(function0, C3U4.A09(c0z7.A4C(C2VU.A0D, bRg2), 4.0f), bfm, (iA0d >> 3) & 14, 0);
            BBI.A0R(bbiA0M, z4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111896(str, function0, function02, bRg3, z5, z6, function04, i, i2);
        }
    }

    public static final void PendingImageThumbnail(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, Function0<Unit> function03, BFM bfm, int i, int i2) {
        BS0 bs0;
        boolean z3;
        BRg bRgA0Y;
        BBI bbi;
        BRg bRg2 = bRg;
        boolean z4 = z;
        boolean z5 = z2;
        Function0<Unit> function04 = function03;
        bfm.AgG(844232713);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z4);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z5);
            iA0d |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function04);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i5 != 0) {
                z5 = false;
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchComposerKt$PendingImageThumbnail$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function04 = (Function0) objAaT;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12070b);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120729);
            BRg bRgA01 = C11U.A01(C10G.A07(bRg2, ATTACHMENT_TILE_SIZE), 12.0f);
            if (z5) {
                bfm.AgE(-441160213);
                bs0 = BRg.A00;
                z3 = true;
                BRg bRgA04 = C0v5.A04(bs0, new C1YD(0), null, function04, true);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchComposerKt$PendingImageThumbnail$2$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT2, false);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-441153751);
                bs0 = BRg.A00;
                z3 = true;
                BRg bRgA042 = C0v5.A04(bs0, new C1YD(0), null, function02, true);
                boolean zA652 = bfm.A65(strA012);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchComposerKt$PendingImageThumbnail$3$1(strA012);
                    bfm.Ai0(objAaT3);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA042, objAaT3, false);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            }
            BRg bRgThen = bRgA01.then(bRgA0Y);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            AuraImageKt.AuraImage(str, c0z7.AQJ(bs0), AnonymousClass005.A0Z(C7197Ei9.A0P), null, null, false, null, null, false, null, bfm, iA0d & 14, 1016);
            int i7 = iA0d >> 9;
            AttachmentUploadStatusOverlay(c0z7, z4, z5, bfm, (i7 & 896) | (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            AttachmentDismissButton(function0, C3U4.A09(c0z7.A4C(C2VU.A0D, bs0), 4.0f), bfm, (iA0d >> 3) & 14, 0);
            BBI.A0R(bbi, z3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111905(str, function0, function02, bRg2, z4, z5, function04, i, i2);
        }
    }

    public static final void logComposerClick(HatchComponent hatchComponent, boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
        Map mapA0E;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(z);
        if (hatchComposerEntryPoint == null || (mapA0E = AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), hatchComposerEntryPoint.getValue())) == null) {
            mapA0E = AGH.A0E();
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreenChatScreen, hatchComponent, null, HatchInteractionEnumsKt.chatThreadLogMetadata(z, str, null, mapA0E), null);
    }

    public static final boolean stacksComposerInput(AXN axn, C1958Aux c1958Aux, boolean z) {
        C1870Ask c1870Ask = c1958Aux.A04;
        return c1870Ask.A03.length() > 0 && (z || c1958Aux.A03.A02 > 1 || c1958Aux.A01(0) - c1958Aux.A00(0) > ((float) Constraints.A01(c1870Ask.A02)) - axn.Ah4(20.0f));
    }

    public static final void AttachmentUploadStatusOverlay(InterfaceC05151eP interfaceC05151eP, boolean z, boolean z2, BFM bfm, int i) {
        bfm.AgG(2105043546);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (z) {
                bfm.AgE(534918239);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12070c);
                BS0 bs0 = BRg.A00;
                BRg bRgA00 = C1b8.A00(C10G.A01, 0.6f, C06G.A0B(bfm));
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchComposerKt$AttachmentUploadStatusOverlay$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                C01N.A07(bfm, AnonymousClass001.A0Y(bRgA00, objAaT, false));
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(interfaceC05151eP.A4C(C2VU.A09, bs0), null, 0L, bfm, 0, 6);
            } else if (z2) {
                bfm.AgE(535420408);
                BS0 bs02 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                C01N.A07(bfm, C1b8.A00(c1062ATq, 0.6f, C06G.A0K(bfm, akh)));
                AuraIconKt.m2567AuraIconFHprtrg(interfaceC05151eP.A4C(C2VU.A09, bs02), BOf.A00(bfm, R.drawable.ic_info, 0), AuraIconSize.SMALL, null, C06G.A0I(bfm, akh), null, bfm, AnonymousClass001.A04(), 32);
            } else {
                bfm.AgE(535901032);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(interfaceC05151eP, z, z2, i);
        }
    }

    public static final void ComposerFocusEffect(boolean z, boolean z2, C1518AkS c1518AkS, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-389402060);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, c1518AkS);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            F2N f2nA00 = C1HY.A00(bfm);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1c3, AnonymousClass002.A1V(bfm, f2nA00, AnonymousClass003.A1B(iA0n), AnonymousClass003.A1C(iA0n)), AnonymousClass003.A1D(iA0n)) | AnonymousClass003.A1E(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$ComposerFocusEffect$1$1(z, z2, f2nA00, c1518AkS, c1c3, function0, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, boolValueOf, boolValueOf2, f2nA00, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111852(z, z2, c1518AkS, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x044e  */
    /* renamed from: HatchComposer-vUJu4ts, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m433HatchComposervUJu4ts(X.C1890At8 r131, java.lang.Object r132, boolean r133, kotlin.jvm.functions.Function0<kotlin.Unit> r134, boolean r135, long r136, long r138, boolean r140, boolean r141, boolean r142, boolean r143, X.AHD<java.lang.String> r144, X.AHD<java.lang.String> r145, X.BQI<java.lang.String> r146, X.BQI<java.lang.String> r147, android.graphics.Bitmap r148, kotlin.jvm.functions.Function0<kotlin.Unit> r149, kotlin.jvm.functions.Function0<kotlin.Unit> r150, kotlin.jvm.functions.Function0<kotlin.Unit> r151, kotlin.jvm.functions.Function0<kotlin.Unit> r152, kotlin.jvm.functions.Function0<kotlin.Unit> r153, kotlin.jvm.functions.Function0<java.lang.Boolean> r154, X.G0U<? super java.util.List<? extends android.net.Uri>, kotlin.Unit> r155, X.G0U<? super java.lang.Integer, kotlin.Unit> r156, X.G0U<? super java.lang.Integer, kotlin.Unit> r157, X.G0U<? super java.lang.String, kotlin.Unit> r158, X.G0U<? super java.lang.String, kotlin.Unit> r159, kotlin.jvm.functions.Function0<kotlin.Unit> r160, java.lang.String r161, kotlin.jvm.functions.Function0<kotlin.Unit> r162, kotlin.jvm.functions.Function0<kotlin.Unit> r163, java.lang.String r164, java.lang.String r165, java.lang.String r166, kotlin.jvm.functions.Function0<kotlin.Unit> r167, com.facebook.aura.composer.dictation.WaveformBuffer r168, boolean r169, X.G0U<? super java.lang.Boolean, kotlin.Unit> r170, kotlin.jvm.functions.Function0<kotlin.Unit> r171, kotlin.jvm.functions.Function0<kotlin.Unit> r172, kotlin.jvm.functions.Function0<kotlin.Unit> r173, kotlin.jvm.functions.Function0<java.lang.Boolean> r174, boolean r175, boolean r176, boolean r177, kotlin.jvm.functions.Function0<kotlin.Unit> r178, boolean r179, java.lang.String r180, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r181, java.lang.String r182, X.BRg r183, java.lang.String r184, java.lang.String r185, java.lang.String r186, boolean r187, kotlin.jvm.functions.Function0<kotlin.Unit> r188, X.C20Q<kotlin.Unit> r189, boolean r190, boolean r191, float r192, X.G2k<? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r193, X.AHD<java.lang.String> r194, X.G0U<? super java.lang.String, kotlin.Unit> r195, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r196, X.BFM r197, int r198, int r199, int r200, int r201, int r202, int r203, int r204, int r205, int r206, int r207) {
        /*
            Method dump skipped, instructions count: 3024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt.m433HatchComposervUJu4ts(X.At8, java.lang.Object, boolean, kotlin.jvm.functions.Function0, boolean, long, long, boolean, boolean, boolean, boolean, X.AHD, X.AHD, X.BQI, X.BQI, android.graphics.Bitmap, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, com.facebook.aura.composer.dictation.WaveformBuffer, boolean, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, java.lang.String, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint, java.lang.String, X.BRg, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, X.20Q, boolean, boolean, float, X.G2k, X.AHD, X.G0U, X.G0V, X.BFM, int, int, int, int, int, int, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04bc  */
    /* renamed from: TextInputComposer-zeFyvcw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m434TextInputComposerzeFyvcw(X.C1890At8 r155, java.lang.Object r156, com.facebook.aura.composer.view.ComposerMode r157, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r158, com.facebook.aura.composer.dictation.WaveformBuffer r159, boolean r160, boolean r161, long r162, long r164, X.AHD<java.lang.String> r166, X.AHD<java.lang.String> r167, X.BQI<java.lang.String> r168, X.BQI<java.lang.String> r169, X.AHD<java.lang.String> r170, X.G0U<? super java.lang.String, kotlin.Unit> r171, kotlin.jvm.functions.Function0<kotlin.Unit> r172, kotlin.jvm.functions.Function0<kotlin.Unit> r173, kotlin.jvm.functions.Function0<kotlin.Unit> r174, kotlin.jvm.functions.Function0<kotlin.Unit> r175, kotlin.jvm.functions.Function0<kotlin.Unit> r176, kotlin.jvm.functions.Function0<kotlin.Unit> r177, kotlin.jvm.functions.Function0<kotlin.Unit> r178, kotlin.jvm.functions.Function0<kotlin.Unit> r179, kotlin.jvm.functions.Function0<java.lang.Boolean> r180, X.G0U<? super java.util.List<? extends android.net.Uri>, kotlin.Unit> r181, X.G0U<? super java.lang.Integer, kotlin.Unit> r182, X.G0U<? super java.lang.Integer, kotlin.Unit> r183, X.G0U<? super java.lang.String, kotlin.Unit> r184, X.G0U<? super java.lang.String, kotlin.Unit> r185, kotlin.jvm.functions.Function0<kotlin.Unit> r186, kotlin.jvm.functions.Function0<kotlin.Unit> r187, boolean r188, kotlin.jvm.functions.Function0<java.lang.Boolean> r189, X.C20Q<kotlin.Unit> r190, java.lang.String r191, java.lang.String r192, android.graphics.Bitmap r193, X.C1518AkS r194, X.C1518AkS r195, java.lang.String r196, java.lang.String r197, kotlin.jvm.functions.Function0<kotlin.Unit> r198, kotlin.jvm.functions.Function0<kotlin.Unit> r199, java.lang.String r200, java.lang.String r201, kotlin.jvm.functions.Function0<kotlin.Unit> r202, boolean r203, boolean r204, boolean r205, kotlin.jvm.functions.Function0<kotlin.Unit> r206, boolean r207, java.lang.String r208, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint r209, X.BRg r210, boolean r211, boolean r212, boolean r213, kotlin.jvm.functions.Function0<kotlin.Unit> r214, java.lang.String r215, boolean r216, boolean r217, float r218, X.G2k<? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r219, X.BFM r220, int r221, int r222, int r223, int r224, int r225, int r226, int r227, int r228, int r229, int r230) {
        /*
            Method dump skipped, instructions count: 1745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt.m434TextInputComposerzeFyvcw(X.At8, java.lang.Object, com.facebook.aura.composer.view.ComposerMode, X.G0V, com.facebook.aura.composer.dictation.WaveformBuffer, boolean, boolean, long, long, X.AHD, X.AHD, X.BQI, X.BQI, X.AHD, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.20Q, java.lang.String, java.lang.String, android.graphics.Bitmap, X.AkS, X.AkS, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, java.lang.String, com.facebook.aura.analytics.hatch.HatchComposerEntryPoint, X.BRg, boolean, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.String, boolean, boolean, float, X.G2k, X.BFM, int, int, int, int, int, int, int, int, int, int):void");
    }
}
