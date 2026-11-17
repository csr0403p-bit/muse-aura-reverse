package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3UX;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$10$1", f = "HatchConversationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$10$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchDeeplinkIdResolutionViewModel $idResolutionViewModel;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$10$1(boolean z, HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel, HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$10$1> htJ) {
        super(2, htJ);
        this.$isMainTab = z;
        this.$idResolutionViewModel = hatchDeeplinkIdResolutionViewModel;
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$HatchConversationScreen$10$1(this.$isMainTab, this.$idResolutionViewModel, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$isMainTab) {
            HatchPendingMessage.PendingComposerPromptId pendingComposerPromptId = HatchPendingMessage.pendingComposerPromptId;
            HatchPendingMessage.pendingComposerPromptId = null;
            if (pendingComposerPromptId != null) {
                this.$idResolutionViewModel.resolvePromptId(pendingComposerPromptId, AnonymousClass003.A0h(this.$viewModel));
            }
            HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
            List<String> list = HatchPendingMessage.pendingImageUris;
            C0881AGi c0881AGi = C0881AGi.A00;
            HatchPendingMessage.pendingImageUris = c0881AGi;
            HoC hoC = null;
            HoC hoCAddPendingImageUris = !list.isEmpty() ? this.$viewModel.attachments.addPendingImageUris(list) : null;
            List<String> list2 = HatchPendingMessage.pendingLinkImageUris;
            HatchPendingMessage.pendingLinkImageUris = null;
            HoC hoCReplaceLinkImageUris = list2 != null ? this.$viewModel.attachments.replaceLinkImageUris(list2) : null;
            List<HxE<String, String>> list3 = HatchPendingMessage.pendingComposerFileUris;
            HatchPendingMessage.pendingComposerFileUris = c0881AGi;
            if (!list3.isEmpty()) {
                this.$viewModel.addPendingFileUris(list3);
            }
            HatchPendingMessage.PendingPayload pendingPayloadConsumePendingMessage = hatchPendingMessage.consumePendingMessage();
            if (pendingPayloadConsumePendingMessage != null) {
                this.$idResolutionViewModel.cancelPromptIdResolution();
                Map<String, ? extends Object> map = pendingPayloadConsumePendingMessage.extraParams;
                if (map != null) {
                    this.$viewModel.setPendingExtraParams(map);
                }
                this.$viewModel.setComposerText(pendingPayloadConsumePendingMessage.text);
                HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
                if (hoCAddPendingImageUris != null) {
                    hoC = hoCAddPendingImageUris;
                } else if (hoCReplaceLinkImageUris != null && HatchConversationScreenKt.isCardAutoSend(pendingPayloadConsumePendingMessage)) {
                    hoC = hoCReplaceLinkImageUris;
                }
                hatchConversationViewModel.sendMessageAfterAttachments(hoC, HatchConversationScreenKt.getSendButtonEntryPoint(pendingPayloadConsumePendingMessage));
            }
            String str = HatchPendingMessage.pendingComposerText;
            HatchPendingMessage.pendingComposerText = null;
            if (str != null) {
                this.$idResolutionViewModel.cancelPromptIdResolution();
                this.$viewModel.setComposerText(str);
                this.$viewModel.requestComposerFocus();
            }
            List<String> list4 = HatchPendingMessage.pendingLinkAttachmentUrls;
            HatchPendingMessage.pendingLinkAttachmentUrls = null;
            if (list4 != null) {
                this.$viewModel.replaceLinkAttachmentUrls(list4);
            }
            HxE<HatchComposerEntryPoint, String> hxEConsumePendingComposerOrigin = hatchPendingMessage.consumePendingComposerOrigin();
            if (hxEConsumePendingComposerOrigin != null) {
                this.$viewModel.setPendingEntryPoint(hxEConsumePendingComposerOrigin.first, hxEConsumePendingComposerOrigin.second);
            }
            HatchPendingMessage.shareDataPendingForMainChat = false;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$HatchConversationScreen$10$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
