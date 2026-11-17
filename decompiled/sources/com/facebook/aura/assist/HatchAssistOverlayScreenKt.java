package com.facebook.aura.assist;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10571Hud;
import X.C1890At8;
import X.C1DG;
import X.C20Q;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.Hwg;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAssistOverlayScreenKt {
    public static final String ASSIST_SCREENSHOT_ENABLED_SETTING = "assist_screenshot_enabled";
    public static final float MAX_PANEL_FRACTION = 0.85f;

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$EnableScreenshotDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ String $openSettingsText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$openSettingsText = str;
            this.$onOpenSettings = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onOpenSettings, bfm.A65(this.$openSettingsText))));
                String str = this.$openSettingsText;
                Function0<Unit> function0 = this.$onOpenSettings;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchAssistOverlayScreenKt$EnableScreenshotDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$EnableScreenshotDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onOpenSettings = function0;
            this.$onDismiss = function02;
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
            HatchAssistOverlayScreenKt.EnableScreenshotDialog(this.$onOpenSettings, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$18, reason: invalid class name */
    public final class AnonymousClass18 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C20Q<HatchConversationAnnouncement> $announcement;
        public final /* synthetic */ C1890At8 $composerTextState;
        public final /* synthetic */ HatchConversationUiState $convState;
        public final /* synthetic */ AHD<HatchConversationListItem> $conversationListItems;
        public final /* synthetic */ boolean $isDictating;
        public final /* synthetic */ C20Q<Unit> $micFocusRequests;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancelDictation;
        public final /* synthetic */ G0U<Integer, Unit> $onClearImageClick;
        public final /* synthetic */ Function0<Unit> $onCollapseVoice;
        public final /* synthetic */ Function0<Unit> $onComposerFocusRequested;
        public final /* synthetic */ Function0<Unit> $onDictationSend;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onEndDictation;
        public final /* synthetic */ G0U<String, Unit> $onImageAttached;
        public final /* synthetic */ Function0<Unit> $onMicClick;
        public final /* synthetic */ Function0<Unit> $onOpenFullApp;
        public final /* synthetic */ Function0<Unit> $onSendClick;
        public final /* synthetic */ Function0<Unit> $onStopGeneration;
        public final /* synthetic */ Function0<Unit> $onVoiceCallClick;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ AssistOverlayState $overlayState;
        public final /* synthetic */ Bitmap $screenScreenshot;
        public final /* synthetic */ boolean $showMicButton;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ WaveformBuffer $waveformBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(AssistOverlayState assistOverlayState, HatchConversationUiState hatchConversationUiState, AHD<? extends HatchConversationListItem> ahd, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, C1890At8 c1890At8, Function0<Unit> function04, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z, C20Q<? extends HatchConversationAnnouncement> c20q, C20Q<Unit> c20q2, BRg bRg, Bitmap bitmap, WaveformBuffer waveformBuffer, boolean z2, Function0<Unit> function05, G0U<? super String, Unit> g0u2, G0U<? super Integer, Unit> g0u3, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function0<Unit> function011, int i, int i2, int i3, int i4) {
            super(2);
            this.$overlayState = assistOverlayState;
            this.$convState = hatchConversationUiState;
            this.$conversationListItems = ahd;
            this.$threadId = str;
            this.$onDismissRequest = function0;
            this.$onCollapseVoice = function02;
            this.$onOpenFullApp = function03;
            this.$composerTextState = c1890At8;
            this.$onSendClick = function04;
            this.$onWidgetSendMessage = g0u;
            this.$onWidgetSetState = g0w;
            this.$showMicButton = z;
            this.$announcement = c20q;
            this.$micFocusRequests = c20q2;
            this.$modifier = bRg;
            this.$screenScreenshot = bitmap;
            this.$waveformBuffer = waveformBuffer;
            this.$isDictating = z2;
            this.$onMicClick = function05;
            this.$onImageAttached = g0u2;
            this.$onClearImageClick = g0u3;
            this.$onCancelDictation = function06;
            this.$onDictationSend = function07;
            this.$onEndDictation = function08;
            this.$onStopGeneration = function09;
            this.$onVoiceCallClick = function010;
            this.$onComposerFocusRequested = function011;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAssistOverlayScreenKt.HatchAssistOverlayScreen(this.$overlayState, this.$convState, this.$conversationListItems, this.$threadId, this.$onDismissRequest, this.$onCollapseVoice, this.$onOpenFullApp, this.$composerTextState, this.$onSendClick, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$showMicButton, this.$announcement, this.$micFocusRequests, this.$modifier, this.$screenScreenshot, this.$waveformBuffer, this.$isDictating, this.$onMicClick, this.$onImageAttached, this.$onClearImageClick, this.$onCancelDictation, this.$onDictationSend, this.$onEndDictation, this.$onStopGeneration, this.$onVoiceCallClick, this.$onComposerFocusRequested, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    public static final void EnableScreenshotDialog(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1600350014);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
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
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120176), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120175), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120177), function0, AnonymousClass001.A0r(bfm), function02), 25300557), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A04((iA0T >> 6) & 14, 196608, iA0T), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, i, i2);
        }
    }

    public static final void openAssistSettings(Context context) {
        Object c10571Hud;
        try {
            context.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS").addFlags(268435456));
            c10571Hud = Unit.INSTANCE;
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        if (!(c10571Hud instanceof C10571Hud)) {
            return;
        }
        try {
            context.startActivity(new Intent("android.settings.SETTINGS").addFlags(268435456));
        } catch (Throwable th2) {
            Hwg.A01(th2);
        }
    }

    public static final float HatchAssistOverlayScreen$lambda$37$3$3(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final boolean isAssistScreenshotEnabled(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), ASSIST_SCREENSHOT_ENABLED_SETTING, 1) == 1;
    }

    public static final void logAssistVoiceCallClick(String str) {
        boolean zA1Y = AnonymousClass002.A1Y(str);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.COMPOSER, HatchInteractionEnumsKt.chatScreen(zA1Y), HatchComponent.VOICE_CALL_BUTTON, null, HatchInteractionEnumsKt.chatThreadLogMetadata(zA1Y, str, null, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), HatchComposerEntryPoint.ASSIST.getValue())), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAssistOverlayScreen(com.facebook.aura.assist.AssistOverlayState r130, com.facebook.aura.conversation.viewmodel.HatchConversationUiState r131, X.AHD<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r132, java.lang.String r133, kotlin.jvm.functions.Function0<kotlin.Unit> r134, kotlin.jvm.functions.Function0<kotlin.Unit> r135, kotlin.jvm.functions.Function0<kotlin.Unit> r136, X.C1890At8 r137, kotlin.jvm.functions.Function0<kotlin.Unit> r138, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r139, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r140, boolean r141, X.C20Q<? extends com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement> r142, X.C20Q<kotlin.Unit> r143, X.BRg r144, android.graphics.Bitmap r145, com.facebook.aura.composer.dictation.WaveformBuffer r146, boolean r147, kotlin.jvm.functions.Function0<kotlin.Unit> r148, X.G0U<? super java.lang.String, kotlin.Unit> r149, X.G0U<? super java.lang.Integer, kotlin.Unit> r150, kotlin.jvm.functions.Function0<kotlin.Unit> r151, kotlin.jvm.functions.Function0<kotlin.Unit> r152, kotlin.jvm.functions.Function0<kotlin.Unit> r153, kotlin.jvm.functions.Function0<kotlin.Unit> r154, kotlin.jvm.functions.Function0<kotlin.Unit> r155, kotlin.jvm.functions.Function0<kotlin.Unit> r156, X.BFM r157, int r158, int r159, int r160, int r161) {
        /*
            Method dump skipped, instructions count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayScreenKt.HatchAssistOverlayScreen(com.facebook.aura.assist.AssistOverlayState, com.facebook.aura.conversation.viewmodel.HatchConversationUiState, X.AHD, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.At8, kotlin.jvm.functions.Function0, X.G0U, X.G0W, boolean, X.20Q, X.20Q, X.BRg, android.graphics.Bitmap, com.facebook.aura.composer.dictation.WaveformBuffer, boolean, kotlin.jvm.functions.Function0, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int, int, int):void");
    }
}
