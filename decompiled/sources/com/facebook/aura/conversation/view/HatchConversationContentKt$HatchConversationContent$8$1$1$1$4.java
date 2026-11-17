package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.BQI;
import X.BRg;
import X.C1890At8;
import X.C1BN;
import X.C1BO;
import X.C2CK;
import X.C3Hd;
import X.C78N;
import X.EnumC1820Arj;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.composer.view.HatchComposerKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.MessageContext;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelContentKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelOpenGestureKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
    public final /* synthetic */ String $composerHintText;
    public final /* synthetic */ BRg $composerModifier;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isMicAvailable;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ G0U<C3Hd, Unit> $launchVisualMediaPicker;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onFilesClick;
    public final /* synthetic */ Function0<Unit> $onGalleryClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onMicClick;
    public final /* synthetic */ String $replyPreviewImageUrl;
    public final /* synthetic */ String $replyPreviewText;
    public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
    public final /* synthetic */ long $userBubbleColor;
    public final /* synthetic */ long $userTextColor;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4(HatchConversationViewModel hatchConversationViewModel, String str, BRg bRg, HatchSidePanelController hatchSidePanelController, long j, long j2, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super C3Hd, Unit> g0u, C1BO<HatchConversationUiState> c1bo, AuraNavigator auraNavigator, Context context, String str2, String str3, G0U<? super Boolean, Unit> g0u2, boolean z2, String str4, MutableState<String> mutableState, MutableState<G0U<String, Unit>> mutableState2) {
        super(2);
        this.$viewModel = hatchConversationViewModel;
        this.$composerHintText = str;
        this.$composerModifier = bRg;
        this.$sidePanelController = hatchSidePanelController;
        this.$userBubbleColor = j;
        this.$userTextColor = j2;
        this.$isMicAvailable = z;
        this.$onGalleryClick = function0;
        this.$launchCamera = function02;
        this.$onFilesClick = function03;
        this.$launchVisualMediaPicker = g0u;
        this.$uiState$delegate = c1bo;
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$replyPreviewText = str2;
        this.$replyPreviewImageUrl = str3;
        this.$onMicClick = g0u2;
        this.$isPrimaryThread = z2;
        this.$threadId = str4;
        this.$composerAnimatedHint$delegate = mutableState;
        this.$scrollToMessage$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        String str;
        String strA0s;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C1BO c1boA02 = C2CK.A02(bfm, this.$viewModel.dictation.isActive);
            HatchConversationContentKt.DictationBackHandler(C1BO.A0F(c1boA02), bfm, 0);
            bfm.AgE(105813343);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = LiveSessions.INSTANCE.isActive(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C1BO c1boA022 = C2CK.A02(bfm, (C1BN) objAaT);
            HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
            C1890At8 c1890At8 = hatchConversationViewModel.composerTextState;
            int iAGd = hatchConversationViewModel.composerRestores$delegate.AGd();
            boolean z = C1BO.A05(this).isSendEnabled;
            Object obj = this.$viewModel;
            boolean zA67 = bfm.A67(obj);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$1$1(obj);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean z2 = C1BO.A05(this).isAwaitingApproval;
            AHD<String> ahd = C1BO.A05(this).pendingImageUris;
            AHD<String> ahd2 = C1BO.A05(this).pendingFileUris;
            BQI<String> bqi = C1BO.A05(this).uploadingFileUris;
            BQI<String> bqi2 = C1BO.A05(this).failedUploadUris;
            AHD<String> ahd3 = C1BO.A05(this).linkAttachmentUrls;
            Object obj2 = this.$viewModel;
            boolean zA672 = bfm.A67(obj2);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$2$1(obj2);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
            Bitmap bitmap = C1BO.A05(this).pendingDiscussionItemPreview;
            Object obj3 = this.$viewModel;
            boolean zA673 = bfm.A67(obj3);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$3$1(obj3);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT4;
            Object obj4 = this.$viewModel;
            boolean zA674 = bfm.A67(obj4);
            Object objAaT5 = bfm.AaT();
            if (zA674 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$4$1(obj4);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT5;
            MessageContext messageContext = C1BO.A05(this).messageContext;
            String str2 = null;
            if (messageContext != null) {
                str = messageContext.title;
            } else {
                str = null;
            }
            MessageContext messageContext2 = C1BO.A05(this).messageContext;
            if (messageContext2 != null) {
                str2 = messageContext2.eyebrow;
            }
            Object obj5 = this.$viewModel;
            boolean zA675 = bfm.A67(obj5);
            Object objAaT6 = bfm.AaT();
            if (zA675 || objAaT6 == C78N.A00) {
                objAaT6 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$5$1(obj5);
                bfm.Ai0(objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT6;
            WaveformBuffer waveformBuffer = this.$viewModel.dictation.waveformBuffer;
            boolean zA0F = C1BO.A0F(c1boA02);
            Object obj6 = this.$viewModel;
            boolean zA676 = bfm.A67(obj6);
            Object objAaT7 = bfm.AaT();
            if (zA676 || objAaT7 == C78N.A00) {
                objAaT7 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$6$1(obj6);
                bfm.Ai0(objAaT7);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT7;
            Object obj7 = this.$viewModel;
            boolean zA677 = bfm.A67(obj7);
            Object objAaT8 = bfm.AaT();
            if (zA677 || objAaT8 == C78N.A00) {
                objAaT8 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$7$1(obj7);
                bfm.Ai0(objAaT8);
            }
            InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT8;
            Object obj8 = this.$viewModel;
            boolean zA678 = bfm.A67(obj8);
            Object objAaT9 = bfm.AaT();
            if (zA678 || objAaT9 == C78N.A00) {
                objAaT9 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$8$1(obj8);
                bfm.Ai0(objAaT9);
            }
            InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT9;
            boolean z3 = C1BO.A05(this).isCancelableActivity;
            boolean z4 = C1BO.A05(this).isAwaitingFirstResponse;
            boolean zA0F2 = C1BO.A0F(c1boA022);
            Object obj9 = this.$viewModel;
            boolean zA679 = bfm.A67(obj9);
            Object objAaT10 = bfm.AaT();
            if (zA679 || objAaT10 == C78N.A00) {
                objAaT10 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$9$1(obj9);
                bfm.Ai0(objAaT10);
            }
            InterfaceC7353EnQ interfaceC7353EnQ8 = (InterfaceC7353EnQ) objAaT10;
            HatchConversationViewModel hatchConversationViewModel2 = this.$viewModel;
            HatchComposerEntryPoint hatchComposerEntryPoint = hatchConversationViewModel2.pendingEntryPoint;
            String str3 = hatchConversationViewModel2.pendingEntryPointOriginId;
            if (this.$composerHintText != null && C1BO.A05(this).composerHintResId != R.string._name_removed__res_0x7f120719) {
                bfm.AgE(-1009059488);
                BBI.A0R(bbi, false);
                strA0s = this.$composerHintText;
            } else {
                bfm.AgE(-1008979229);
                strA0s = AnonymousClass001.A0s(bfm, bbi, C1BO.A05(this).composerHintResId);
            }
            String strA05 = MutableState.A05(this.$composerAnimatedHint$delegate);
            BRg bRg = this.$composerModifier;
            boolean zA1Y = AnonymousClass002.A1Y(this.$sidePanelController.getContentKey());
            HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
            HatchSidePanelContentKey.ConversationHistory conversationHistory = HatchSidePanelContentKey.ConversationHistory.INSTANCE;
            float fRememberSidePanelWidthPx = SidePanelOpenGestureKt.rememberSidePanelWidthPx(false, bfm, 0, 1);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) bfm.A6v(Am0.A0A);
            Object objAaT11 = bfm.AaT();
            Object obj10 = C78N.A00;
            if (objAaT11 == obj10) {
                objAaT11 = HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$10$1.INSTANCE;
                bfm.Ai0(objAaT11);
            }
            BRg bRgHatchSidePanelOpenGesture = SidePanelOpenGestureKt.hatchSidePanelOpenGesture(bRg, zA1Y, hatchSidePanelController, conversationHistory, fRememberSidePanelWidthPx, enumC1820Arj, (Function0) objAaT11);
            boolean z5 = C1BO.A05(this).shouldFocusComposer;
            Object obj11 = this.$viewModel;
            boolean zA6710 = bfm.A67(obj11);
            Object objAaT12 = bfm.AaT();
            if (zA6710 || objAaT12 == obj10) {
                objAaT12 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$11$1(obj11);
                bfm.Ai0(objAaT12);
            }
            InterfaceC7353EnQ interfaceC7353EnQ9 = (InterfaceC7353EnQ) objAaT12;
            Integer numValueOf = Integer.valueOf(iAGd);
            long j = this.$userBubbleColor;
            long j2 = this.$userTextColor;
            boolean z6 = this.$isMicAvailable;
            Function0<Unit> function02 = this.$onGalleryClick;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$launchCamera, bfm.A67(this.$viewModel));
            HatchConversationViewModel hatchConversationViewModel3 = this.$viewModel;
            Function0<Unit> function03 = this.$launchCamera;
            Object objAaT13 = bfm.AaT();
            if (zA1R || objAaT13 == obj10) {
                objAaT13 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$12$1(hatchConversationViewModel3, function03);
                bfm.Ai0(objAaT13);
            }
            Function0 function04 = (Function0) objAaT13;
            Object objAaT14 = bfm.AaT();
            if (objAaT14 == obj10) {
                objAaT14 = HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$13$1.INSTANCE;
                bfm.Ai0(objAaT14);
            }
            Function0 function05 = (Function0) objAaT14;
            Function0<Unit> function06 = this.$onFilesClick;
            boolean zA652 = bfm.A65(this.$launchVisualMediaPicker);
            G0U<C3Hd, Unit> g0u = this.$launchVisualMediaPicker;
            Object objAaT15 = bfm.AaT();
            if (zA652 || objAaT15 == obj10) {
                objAaT15 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$14$1(g0u);
                bfm.Ai0(objAaT15);
            }
            Function0 function07 = (Function0) objAaT15;
            Function0 function08 = (Function0) interfaceC7353EnQ2;
            boolean zA6711 = bfm.A67(this.$viewModel);
            HatchConversationViewModel hatchConversationViewModel4 = this.$viewModel;
            Object objAaT16 = bfm.AaT();
            if (zA6711 || objAaT16 == obj10) {
                objAaT16 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$15$1(hatchConversationViewModel4);
                bfm.Ai0(objAaT16);
            }
            G0U g0u2 = (G0U) objAaT16;
            boolean zA6712 = bfm.A67(this.$viewModel);
            HatchConversationViewModel hatchConversationViewModel5 = this.$viewModel;
            Object objAaT17 = bfm.AaT();
            if (zA6712 || objAaT17 == obj10) {
                objAaT17 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$16$1(hatchConversationViewModel5);
                bfm.Ai0(objAaT17);
            }
            G0U g0u3 = (G0U) objAaT17;
            boolean zA6713 = bfm.A67(this.$viewModel);
            HatchConversationViewModel hatchConversationViewModel6 = this.$viewModel;
            Object objAaT18 = bfm.AaT();
            if (zA6713 || objAaT18 == obj10) {
                objAaT18 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$17$1(hatchConversationViewModel6);
                bfm.Ai0(objAaT18);
            }
            G0U g0u4 = (G0U) objAaT18;
            boolean zA6714 = bfm.A67(this.$viewModel);
            HatchConversationViewModel hatchConversationViewModel7 = this.$viewModel;
            Object objAaT19 = bfm.AaT();
            if (zA6714 || objAaT19 == obj10) {
                objAaT19 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$18$1(hatchConversationViewModel7);
                bfm.Ai0(objAaT19);
            }
            G0U g0u5 = (G0U) objAaT19;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A65(this.$uiState$delegate)));
            AuraNavigator auraNavigator = this.$navigator;
            Context context = this.$context;
            C1BO<HatchConversationUiState> c1bo = this.$uiState$delegate;
            Object objAaT20 = bfm.AaT();
            if (zA1T || objAaT20 == obj10) {
                objAaT20 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$19$1(auraNavigator, context, c1bo);
                bfm.Ai0(objAaT20);
            }
            G0U g0u6 = (G0U) objAaT20;
            boolean zA6715 = bfm.A67(this.$viewModel);
            HatchConversationViewModel hatchConversationViewModel8 = this.$viewModel;
            Object objAaT21 = bfm.AaT();
            if (zA6715 || objAaT21 == obj10) {
                objAaT21 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$20$1(hatchConversationViewModel8);
                bfm.Ai0(objAaT21);
            }
            Function0 function09 = (Function0) objAaT21;
            String str4 = this.$replyPreviewText;
            boolean zA653 = bfm.A65(this.$uiState$delegate);
            C1BO<HatchConversationUiState> c1bo2 = this.$uiState$delegate;
            MutableState<G0U<String, Unit>> mutableState = this.$scrollToMessage$delegate;
            Object objAaT22 = bfm.AaT();
            if (zA653 || objAaT22 == obj10) {
                objAaT22 = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$21$1(c1bo2, mutableState);
                bfm.Ai0(objAaT22);
            }
            Function0 function010 = (Function0) objAaT22;
            Function0 function011 = (Function0) interfaceC7353EnQ3;
            String str5 = this.$replyPreviewImageUrl;
            Function0 function012 = (Function0) interfaceC7353EnQ4;
            G0U<Boolean, Unit> g0u7 = this.$onMicClick;
            Function0 function013 = (Function0) interfaceC7353EnQ5;
            Function0 function014 = (Function0) interfaceC7353EnQ6;
            Function0 function015 = (Function0) interfaceC7353EnQ7;
            Object objAaT23 = bfm.AaT();
            if (objAaT23 == obj10) {
                objAaT23 = HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$22$1.INSTANCE;
                bfm.Ai0(objAaT23);
            }
            HatchComposerKt.m433HatchComposervUJu4ts(c1890At8, numValueOf, z, function0, z2, j, j2, z6, true, false, false, ahd, ahd2, bqi, bqi2, bitmap, function02, function04, function05, function06, function07, function08, g0u2, g0u3, g0u4, g0u5, g0u6, function09, str4, function010, function011, str5, str, str2, function012, waveformBuffer, zA0F, g0u7, function013, function014, function015, (Function0) objAaT23, z3, z4, zA0F2, (Function0) interfaceC7353EnQ8, this.$isPrimaryThread, this.$threadId, hatchComposerEntryPoint, str3, bRgHatchSidePanelOpenGesture, strA0s, strA05, null, z5, (Function0) interfaceC7353EnQ9, null, false, false, 0.0f, ComposableSingletons$HatchConversationContentKt.lambda$1341356645, ahd3, (G0U) interfaceC7353EnQ, null, bfm, 905969664, 100663302, 0, WaveformBuffer.$stable << 15, 48, 0, 6, 0, 507510784, 2);
            return;
        }
        bfm.Afo();
    }
}
