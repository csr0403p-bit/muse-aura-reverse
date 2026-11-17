package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$11$1", f = "HatchConversationScreen.kt", l = {463}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$11$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchDeeplinkIdResolutionViewModel $idResolutionViewModel;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$11$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$11$1(HatchConversationViewModel hatchConversationViewModel, HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$11$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConversationViewModel;
        this.$idResolutionViewModel = hatchDeeplinkIdResolutionViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$HatchConversationScreen$11$1(this.$viewModel, this.$idResolutionViewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if ("primary_session_id".equals(this.$viewModel.sessionId)) {
                HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
                if (hatchPendingMessage.consumeMainChatAssistLaunch()) {
                    this.$idResolutionViewModel.cancelPromptIdResolution();
                    String str = HatchPendingMessage.pendingComposerText;
                    HatchPendingMessage.pendingComposerText = null;
                    if (str != null) {
                        HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
                        hatchConversationViewModel.setComposerText(str);
                        hatchConversationViewModel.requestComposerFocus();
                    }
                    HxE<HatchComposerEntryPoint, String> hxEConsumePendingComposerOrigin = hatchPendingMessage.consumePendingComposerOrigin();
                    if (hxEConsumePendingComposerOrigin != null) {
                        this.$viewModel.setPendingEntryPoint(hxEConsumePendingComposerOrigin.first, hxEConsumePendingComposerOrigin.second);
                    }
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
                    this.label = 1;
                    if (AvW.A01(anonymousClass3, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$viewModel.requestScrollToBottom();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$HatchConversationScreen$11$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
