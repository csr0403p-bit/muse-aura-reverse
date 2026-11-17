package com.facebook.aura.composer.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BQI;
import X.BRg;
import X.C1518AkS;
import X.C1890At8;
import X.C20Q;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.InterfaceC05151eP;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Boolean> $allowsFileAttachments;
    public final /* synthetic */ boolean $animatesInput;
    public final /* synthetic */ C1518AkS $attachButtonFocusRequester;
    public final /* synthetic */ boolean $attachmentsAboveInput;
    public final /* synthetic */ Function0<Boolean> $canAppendDictation;
    public final /* synthetic */ boolean $captureActionsInPlusMenu;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ ComposerMode $composerMode;
    public final /* synthetic */ String $contextChipEyebrow;
    public final /* synthetic */ String $contextChipTitle;
    public final /* synthetic */ String $effectiveHintText;
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ BQI<String> $failedUploadUris;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $hasAttachments;
    public final /* synthetic */ boolean $isAwaitingResponse;
    public final /* synthetic */ boolean $isCancelableActivity;
    public final /* synthetic */ MutableState<Boolean> $isInputLayoutSettled$delegate;
    public final /* synthetic */ boolean $isInputRowStacked;
    public final /* synthetic */ MutableState<Boolean> $isInputStacked$delegate;
    public final /* synthetic */ boolean $isLiveSessionActive;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendBlocked;
    public final /* synthetic */ boolean $isSendEnabled;
    public final /* synthetic */ AHD<String> $linkAttachmentUrls;
    public final /* synthetic */ G2k<String, Function0<Unit>, BRg, BFM, Integer, Unit> $linkPreview;
    public final /* synthetic */ ComposerLinkPreviewState $linkPreviews;
    public final /* synthetic */ C20Q<Unit> $micFocusRequests;
    public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAddImageUris;
    public final /* synthetic */ G0U<String, Unit> $onAttachmentClick;
    public final /* synthetic */ Function0<Unit> $onCameraClick;
    public final /* synthetic */ Function0<Unit> $onCancelDictation;
    public final /* synthetic */ Function0<Unit> $onClearContextChip;
    public final /* synthetic */ G0U<Integer, Unit> $onClearFileClick;
    public final /* synthetic */ G0U<Integer, Unit> $onClearImageClick;
    public final /* synthetic */ Function0<Unit> $onClearReply;
    public final /* synthetic */ Function0<Unit> $onDictationSend;
    public final /* synthetic */ Function0<Unit> $onDictationStop;
    public final /* synthetic */ Function0<Unit> $onFilesClick;
    public final /* synthetic */ Function0<Unit> $onGalleryClick;
    public final /* synthetic */ Function0<Unit> $onMicHold;
    public final /* synthetic */ Function0<Unit> $onMicTap;
    public final /* synthetic */ G0U<String, Unit> $onRemoveLinkAttachment;
    public final /* synthetic */ Function0<Unit> $onReplyPreviewClick;
    public final /* synthetic */ G0U<String, Unit> $onRetryUpload;
    public final /* synthetic */ Function0<Unit> $onScreenshotClick;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ Function0<Unit> $onStopClick;
    public final /* synthetic */ Function0<Unit> $onVideoClick;
    public final /* synthetic */ AHD<String> $pendingFileUris;
    public final /* synthetic */ AHD<String> $pendingImageUris;
    public final /* synthetic */ String $prefixText;
    public final /* synthetic */ String $replyPreview;
    public final /* synthetic */ String $replyPreviewImageUrl;
    public final /* synthetic */ boolean $showAttachmentButton;
    public final /* synthetic */ MutableState<Boolean> $showAttachmentMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showCaptureMenu$delegate;
    public final /* synthetic */ boolean $showMicButton;
    public final /* synthetic */ MutableState<Boolean> $showNameHint$delegate;
    public final /* synthetic */ boolean $showOnlyCameraIcon;
    public final /* synthetic */ boolean $showScreenshotButton;
    public final /* synthetic */ C1890At8 $state;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingAction;
    public final /* synthetic */ AuraTypography $typography;
    public final /* synthetic */ BQI<String> $uploadingFileUris;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;
    public final /* synthetic */ MutableState<Boolean> $wasComposerFocused$delegate;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1(String str, String str2, AuraColors auraColors, boolean z, boolean z2, AHD<String> ahd, AHD<String> ahd2, BQI<String> bqi, BQI<String> bqi2, G0U<? super String, Unit> g0u, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3, G0U<? super String, Unit> g0u4, boolean z3, String str3, HatchComposerEntryPoint hatchComposerEntryPoint, G2k<? super String, ? super Function0<Unit>, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, C1890At8 c1890At8, ComposerLinkPreviewState composerLinkPreviewState, AHD<String> ahd3, G0U<? super String, Unit> g0u5, C1518AkS c1518AkS, boolean z4, boolean z5, ComposerMode composerMode, String str4, Function0<Unit> function0, Function0<Unit> function02, AuraTypography auraTypography, Function0<Unit> function03, String str5, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Function0<Unit> function04, boolean z6, boolean z7, Function0<Unit> function05, boolean z8, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Boolean> function09, Function0<Unit> function010, C1518AkS c1518AkS2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, boolean z9, boolean z10, Function0<Boolean> function011, boolean z11, boolean z12, Function0<Unit> function012, Function0<Unit> function013, Function0<Unit> function014, C20Q<Unit> c20q, long j, long j2, boolean z13, Function0<Unit> function015, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Unit> function016, Function0<Unit> function017, WaveformBuffer waveformBuffer, MutableState<Boolean> mutableState5, boolean z14, boolean z15, String str6, String str7, G0U<? super List<? extends Uri>, Unit> g0u6, MutableState<Boolean> mutableState6) {
        super(3);
        this.$replyPreview = str;
        this.$contextChipTitle = str2;
        this.$colors = auraColors;
        this.$attachmentsAboveInput = z;
        this.$hasAttachments = z2;
        this.$pendingImageUris = ahd;
        this.$pendingFileUris = ahd2;
        this.$uploadingFileUris = bqi;
        this.$failedUploadUris = bqi2;
        this.$onRetryUpload = g0u;
        this.$onClearImageClick = g0u2;
        this.$onClearFileClick = g0u3;
        this.$onAttachmentClick = g0u4;
        this.$isPrimaryThread = z3;
        this.$threadId = str3;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$linkPreview = g2k;
        this.$state = c1890At8;
        this.$linkPreviews = composerLinkPreviewState;
        this.$linkAttachmentUrls = ahd3;
        this.$onRemoveLinkAttachment = g0u5;
        this.$focusRequester = c1518AkS;
        this.$showAttachmentButton = z4;
        this.$showOnlyCameraIcon = z5;
        this.$composerMode = composerMode;
        this.$replyPreviewImageUrl = str4;
        this.$onReplyPreviewClick = function0;
        this.$onClearReply = function02;
        this.$typography = auraTypography;
        this.$onClearContextChip = function03;
        this.$contextChipEyebrow = str5;
        this.$wasComposerFocused$delegate = mutableState;
        this.$showNameHint$delegate = mutableState2;
        this.$onCameraClick = function04;
        this.$isSendEnabled = z6;
        this.$showScreenshotButton = z7;
        this.$onScreenshotClick = function05;
        this.$captureActionsInPlusMenu = z8;
        this.$onGalleryClick = function06;
        this.$onVideoClick = function07;
        this.$onFilesClick = function08;
        this.$allowsFileAttachments = function09;
        this.$onCancelDictation = function010;
        this.$attachButtonFocusRequester = c1518AkS2;
        this.$showCaptureMenu$delegate = mutableState3;
        this.$showAttachmentMenu$delegate = mutableState4;
        this.$showMicButton = z9;
        this.$isLiveSessionActive = z10;
        this.$canAppendDictation = function011;
        this.$isCancelableActivity = z11;
        this.$isAwaitingResponse = z12;
        this.$onMicTap = function012;
        this.$onMicHold = function013;
        this.$onDictationStop = function014;
        this.$micFocusRequests = c20q;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
        this.$isSendBlocked = z13;
        this.$onDictationSend = function015;
        this.$trailingAction = g0v;
        this.$onSendClick = function016;
        this.$onStopClick = function017;
        this.$waveformBuffer = waveformBuffer;
        this.$isInputLayoutSettled$delegate = mutableState5;
        this.$isInputRowStacked = z14;
        this.$animatesInput = z15;
        this.$effectiveHintText = str6;
        this.$prefixText = str7;
        this.$onAddImageUris = g0u6;
        this.$isInputStacked$delegate = mutableState6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.InterfaceC05151eP r107, X.BFM r108, int r109) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$TextInputComposer$mainRow$1$3$1.invoke(X.1eP, X.BFM, int):void");
    }
}
