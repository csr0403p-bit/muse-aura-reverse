package com.facebook.aura.audio.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $confirmText;
    public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

    /* renamed from: com.facebook.aura.audio.view.ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel) {
            super(0);
            this.$viewModel = chatAudioPlaybackViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAudioCallTakeoverKt.logTakeoverClick(HatchComponent.AUDIO_CALL_TAKEOVER_CONFIRM_BUTTON);
            this.$viewModel.onConfirmEndCall();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.view.ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel) {
            super(0);
            this.$viewModel = chatAudioPlaybackViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ChatAudioCallTakeoverKt.logTakeoverClick(HatchComponent.AUDIO_CALL_TAKEOVER_CANCEL_BUTTON);
            this.$viewModel.onCancelEndCall();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$confirmText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelText, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$viewModel), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$4$1$1(String str, String str2, ChatAudioPlaybackViewModel chatAudioPlaybackViewModel) {
        super(1);
        this.$confirmText = str;
        this.$cancelText = str2;
        this.$viewModel = chatAudioPlaybackViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
