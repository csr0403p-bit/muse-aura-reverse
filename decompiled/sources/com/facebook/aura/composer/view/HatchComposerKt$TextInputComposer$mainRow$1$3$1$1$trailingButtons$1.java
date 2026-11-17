package com.facebook.aura.composer.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BQI;
import X.C1890At8;
import X.C20Q;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Boolean> $canAppendDictation;
    public final /* synthetic */ ComposerMode $composerMode;
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ BQI<String> $failedUploadUris;
    public final /* synthetic */ boolean $isAwaitingResponse;
    public final /* synthetic */ boolean $isCancelableActivity;
    public final /* synthetic */ boolean $isDictating;
    public final /* synthetic */ boolean $isLiveSessionActive;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendBlocked;
    public final /* synthetic */ boolean $isSendEnabled;
    public final /* synthetic */ AHD<String> $linkAttachmentUrls;
    public final /* synthetic */ C20Q<Unit> $micFocusRequests;
    public final /* synthetic */ Function0<Unit> $onDictationSend;
    public final /* synthetic */ Function0<Unit> $onDictationStop;
    public final /* synthetic */ Function0<Unit> $onMicHold;
    public final /* synthetic */ Function0<Unit> $onMicTap;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ Function0<Unit> $onStopClick;
    public final /* synthetic */ AHD<String> $pendingFileUris;
    public final /* synthetic */ AHD<String> $pendingImageUris;
    public final /* synthetic */ boolean $showMicButton;
    public final /* synthetic */ MutableState<Boolean> $showNameHint$delegate;
    public final /* synthetic */ C1890At8 $state;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingAction;
    public final /* synthetic */ BQI<String> $uploadingFileUris;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;
    public final /* synthetic */ MutableState<Boolean> $wasComposerFocused$delegate;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1(C1890At8 c1890At8, AHD<String> ahd, AHD<String> ahd2, AHD<String> ahd3, BQI<String> bqi, boolean z, boolean z2, boolean z3, boolean z4, Function0<Boolean> function0, boolean z5, boolean z6, ComposerMode composerMode, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, C20Q<Unit> c20q, long j, long j2, boolean z7, boolean z8, String str, HatchComposerEntryPoint hatchComposerEntryPoint, Function0<Unit> function05, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Unit> function06, Function0<Unit> function07, BQI<String> bqi2, WaveformBuffer waveformBuffer, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(2);
        this.$state = c1890At8;
        this.$linkAttachmentUrls = ahd;
        this.$pendingImageUris = ahd2;
        this.$pendingFileUris = ahd3;
        this.$uploadingFileUris = bqi;
        this.$showMicButton = z;
        this.$isSendEnabled = z2;
        this.$isLiveSessionActive = z3;
        this.$isDictating = z4;
        this.$canAppendDictation = function0;
        this.$isCancelableActivity = z5;
        this.$isAwaitingResponse = z6;
        this.$composerMode = composerMode;
        this.$onMicTap = function02;
        this.$onMicHold = function03;
        this.$onDictationStop = function04;
        this.$micFocusRequests = c20q;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
        this.$isSendBlocked = z7;
        this.$isPrimaryThread = z8;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$onDictationSend = function05;
        this.$trailingAction = g0v;
        this.$onSendClick = function06;
        this.$onStopClick = function07;
        this.$failedUploadUris = bqi2;
        this.$waveformBuffer = waveformBuffer;
        this.$wasComposerFocused$delegate = mutableState;
        this.$showNameHint$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185 A[PHI: r17
  0x0185: PHI (r17v3 boolean) = (r17v1 boolean), (r17v4 boolean) binds: [B:60:0x0183, B:58:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r50, int r51) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1.invoke(X.BFM, int):void");
    }
}
