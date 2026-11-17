package com.facebook.aura.assist;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.F2X;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.HuJ;
import X.Hwg;
import X.HzR;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSendButtonOrigin;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.composer.dictation.DictationStartTrigger;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.conversation.api.ConversationInputBlocks;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.microphone.api.MicrophonePriority;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistOverlayViewModel extends AEs {
    public static final int $stable = 8;
    public final HzR<Unit> _micFocusRequests;
    public final BLG<AssistOverlayState> _overlayState;
    public final Context context;
    public final HatchConversationViewModel conversationViewModel;
    public boolean hasInitializedSession;
    public final C20Q<Unit> micFocusRequests;
    public final C1BN<AssistOverlayState> overlayState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayViewModel$1", f = "HatchAssistOverlayViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAssistOverlayViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20qObserve = ConversationInputBlocks.INSTANCE.observe(HatchAssistOverlayViewModel.this.userSession);
                final HatchAssistOverlayViewModel hatchAssistOverlayViewModel = HatchAssistOverlayViewModel.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.assist.HatchAssistOverlayViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z) {
                            hatchAssistOverlayViewModel.conversationViewModel.dictation.cancel(false);
                            while (!C3cJ.A12(hatchAssistOverlayViewModel._overlayState)) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qObserve.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchAssistOverlayViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayViewModel$2", f = "HatchAssistOverlayViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAssistOverlayViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchAssistOverlayViewModel hatchAssistOverlayViewModel = HatchAssistOverlayViewModel.this;
                C1BN<HatchConversationUiState> c1bn = hatchAssistOverlayViewModel.conversationViewModel.uiState;
                C20Z<? super HatchConversationUiState> c20z = new C20Z() { // from class: com.facebook.aura.assist.HatchAssistOverlayViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchConversationUiState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[PHI: r5
  0x002c: PHI (r5v3 com.facebook.aura.assist.AssistOverlayPhase) = (r5v1 com.facebook.aura.assist.AssistOverlayPhase), (r5v5 com.facebook.aura.assist.AssistOverlayPhase) binds: [B:15:0x002a, B:32:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.conversation.viewmodel.HatchConversationUiState r7, X.HtJ<? super kotlin.Unit> r8) {
                        /*
                            r6 = this;
                            com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = r1
                            X.BLG<com.facebook.aura.assist.AssistOverlayState> r2 = r0._overlayState
                        L4:
                            java.lang.Object r3 = r2.getValue()
                            r4 = r3
                            com.facebook.aura.assist.AssistOverlayState r4 = (com.facebook.aura.assist.AssistOverlayState) r4
                            com.facebook.aura.assist.AssistOverlayPhase r1 = r4.phase
                            com.facebook.aura.assist.AssistOverlayPhase r0 = com.facebook.aura.assist.AssistOverlayPhase.LISTENING
                            if (r1 == r0) goto L48
                            com.facebook.aura.assist.AssistOverlayPhase r0 = r4.phase
                            com.facebook.aura.assist.AssistOverlayPhase r6 = com.facebook.aura.assist.AssistOverlayPhase.ERROR
                            if (r0 == r6) goto L5a
                            boolean r0 = r7.isAwaitingResponse
                            com.facebook.aura.assist.AssistOverlayPhase r1 = r4.phase
                            if (r0 == 0) goto L4b
                            com.facebook.aura.assist.AssistOverlayPhase r0 = com.facebook.aura.assist.AssistOverlayPhase.SUBMITTING
                            if (r1 == r0) goto L27
                            com.facebook.aura.assist.AssistOverlayPhase r1 = r4.phase
                            com.facebook.aura.assist.AssistOverlayPhase r0 = com.facebook.aura.assist.AssistOverlayPhase.RESPONDING
                            if (r1 != r0) goto L52
                        L27:
                            com.facebook.aura.assist.AssistOverlayPhase r5 = com.facebook.aura.assist.AssistOverlayPhase.RESPONDING
                        L29:
                            r1 = 0
                            if (r5 != r6) goto L3c
                        L2c:
                            com.facebook.aura.gateway.HatchGatewayConnectionState r1 = r7.connectionState
                            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
                            if (r0 == 0) goto L3a
                            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r1 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r1
                            if (r1 == 0) goto L3a
                            java.lang.String r1 = r1.message
                            if (r1 != 0) goto L3c
                        L3a:
                            java.lang.String r1 = r4.errorMessage
                        L3c:
                            com.facebook.aura.assist.AssistOverlayMode r0 = r4.mode
                            com.facebook.aura.assist.AssistOverlayState r0 = r4.copy(r0, r5, r1)
                            boolean r0 = r2.A6e(r3, r0)
                            if (r0 == 0) goto L4
                        L48:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L4b:
                            com.facebook.aura.assist.AssistOverlayPhase r0 = com.facebook.aura.assist.AssistOverlayPhase.RESPONDING
                            if (r1 != r0) goto L52
                            com.facebook.aura.assist.AssistOverlayPhase r5 = com.facebook.aura.assist.AssistOverlayPhase.IDLE
                            goto L29
                        L52:
                            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r7.connectionState
                            boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
                            if (r0 == 0) goto L5a
                            r5 = r6
                            goto L2c
                        L5a:
                            com.facebook.aura.assist.AssistOverlayPhase r5 = r4.phase
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayViewModel.AnonymousClass2.AnonymousClass1.emit(com.facebook.aura.conversation.viewmodel.HatchConversationUiState, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchAssistOverlayViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchAssistOverlayViewModel> {
        public static final int $stable = 8;
        public final Context context;
        public final HatchConversationViewModel conversationViewModel;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchAssistOverlayViewModel create() {
            return new HatchAssistOverlayViewModel(this.context, this.userSession, this.conversationViewModel);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz, HatchConversationViewModel hatchConversationViewModel) {
            AnonymousClass005.A0x(context, abstractC3358CGz, hatchConversationViewModel);
            this.context = context;
            this.userSession = abstractC3358CGz;
            this.conversationViewModel = hatchConversationViewModel;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$bargeInToVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C109601 extends AbstractC7559F3s implements Function0<Unit> {
        public C109601() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchAssistOverlayViewModel.this.endVoiceDictationAndSend();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$bargeInToVoice$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C109612 extends F2X implements G0U<DictationOutcome, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DictationOutcome dictationOutcome) {
            C7384Etj.A0Y(dictationOutcome, 0);
            HatchAssistOverlayViewModel.onDictationStopped$default((HatchAssistOverlayViewModel) this.receiver, dictationOutcome, false, 2, null);
        }

        public C109612(Object obj) {
            super(1, obj, HatchAssistOverlayViewModel.class, "onDictationStopped", "onDictationStopped(Lcom/facebook/aura/composer/dictation/engine/DictationOutcome;Z)V", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome) {
            invoke2(dictationOutcome);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$endVoiceDictationAndSend$1, reason: invalid class name and case insensitive filesystem */
    public final class C109621 extends AbstractC7559F3s implements G0V<DictationOutcome, Boolean, Unit> {
        public C109621() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome, Boolean bool) {
            invoke(dictationOutcome, AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(com.facebook.aura.composer.dictation.engine.DictationOutcome r4, boolean r5) {
            /*
                r3 = this;
                r0 = 0
                X.C7384Etj.A0Y(r4, r0)
                if (r5 == 0) goto L22
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                X.BLG<com.facebook.aura.assist.AssistOverlayState> r5 = r0._overlayState
            La:
                java.lang.Object r4 = r5.getValue()
                r3 = r4
                com.facebook.aura.assist.AssistOverlayState r3 = (com.facebook.aura.assist.AssistOverlayState) r3
                com.facebook.aura.assist.AssistOverlayPhase r2 = com.facebook.aura.assist.AssistOverlayPhase.SUBMITTING
                com.facebook.aura.assist.AssistOverlayMode r1 = r3.mode
                java.lang.String r0 = r3.errorMessage
                com.facebook.aura.assist.AssistOverlayState r0 = r3.copy(r1, r2, r0)
                boolean r0 = r5.A6e(r4, r0)
                if (r0 == 0) goto La
                return
            L22:
                com.facebook.aura.composer.dictation.engine.DictationOutcome r1 = com.facebook.aura.composer.dictation.engine.DictationOutcome.COMPLETED
                if (r4 != r1) goto L4c
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r0.conversationViewModel
                boolean r0 = r0.hasComposerText()
                if (r0 != 0) goto L4c
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                android.content.Context r0 = r0.context
                boolean r0 = X.HuJ.A00(r0)
                if (r0 != 0) goto L4c
                X.BLG<java.lang.Boolean> r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager._isAssistOverlayActive
                boolean r0 = X.AnonymousClass003.A1Z(r0)
                if (r0 == 0) goto L4c
                com.facebook.aura.assist.HatchAssistOverlayViewModel r2 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                android.content.Context r1 = r2.context
                com.facebook.aura.composer.dictation.DictationStartTrigger r0 = com.facebook.aura.composer.dictation.DictationStartTrigger.RELISTEN
                com.facebook.aura.assist.HatchAssistOverlayViewModel.access$startVoiceWithPermission(r2, r1, r0)
                return
            L4c:
                com.facebook.aura.assist.HatchAssistOverlayViewModel r2 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                if (r4 != r1) goto L59
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r2.conversationViewModel
                boolean r1 = r0.hasComposerText()
                r0 = 1
                if (r1 != 0) goto L5a
            L59:
                r0 = 0
            L5a:
                com.facebook.aura.assist.HatchAssistOverlayViewModel.access$onDictationStopped(r2, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayViewModel.C109621.invoke(com.facebook.aura.composer.dictation.engine.DictationOutcome, boolean):void");
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$startVoiceWithPermission$1, reason: invalid class name and case insensitive filesystem */
    public final class C109631 extends AbstractC7559F3s implements Function0<Unit> {
        public C109631() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchAssistOverlayViewModel.this.endVoiceDictationAndSend();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$startVoiceWithPermission$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C109642 extends F2X implements G0U<DictationOutcome, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DictationOutcome dictationOutcome) {
            C7384Etj.A0Y(dictationOutcome, 0);
            HatchAssistOverlayViewModel.onDictationStopped$default((HatchAssistOverlayViewModel) this.receiver, dictationOutcome, false, 2, null);
        }

        public C109642(Object obj) {
            super(1, obj, HatchAssistOverlayViewModel.class, "onDictationStopped", "onDictationStopped(Lcom/facebook/aura/composer/dictation/engine/DictationOutcome;Z)V", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome) {
            invoke2(dictationOutcome);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3", f = "HatchAssistOverlayViewModel.kt", l = {369, 385}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSendButtonOrigin $sendButtonOrigin;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$2", f = "HatchAssistOverlayViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchSendButtonOrigin $sendButtonOrigin;
            public int label;
            public final /* synthetic */ HatchAssistOverlayViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, HatchSendButtonOrigin hatchSendButtonOrigin, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchAssistOverlayViewModel;
                this.$sendButtonOrigin = hatchSendButtonOrigin;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, this.$sendButtonOrigin, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0.conversationViewModel.sendMessage(false, this.$sendButtonOrigin);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchSendButtonOrigin hatchSendButtonOrigin, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$sendButtonOrigin = hatchSendButtonOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAssistOverlayViewModel.this.new AnonymousClass3(this.$sendButtonOrigin, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r6 = 0
                r4 = 2
                r2 = 1
                if (r0 == 0) goto L13
                if (r0 == r2) goto L3a
                if (r0 != r4) goto L88
                X.Hwg.A00(r8)
            L10:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L13:
                X.Hwg.A00(r8)
                com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                X.CGz r0 = r0.userSession
                com.facebook.aura.gateway.HatchGatewayConnection r1 = r1.getGateway(r0)
                X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r0 = r1.connectionState
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
                if (r0 != 0) goto L72
                com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$result$1 r0 = new com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$result$1
                r0.<init>(r1, r6)
                r7.L$0 = r6
                r7.label = r2
                java.lang.Object r8 = X.C3cI.A0S(r0, r7)
                if (r8 != r5) goto L3d
                return r5
            L3a:
                X.Hwg.A00(r8)
            L3d:
                com.facebook.aura.gateway.HatchGatewayConnectionState r8 = (com.facebook.aura.gateway.HatchGatewayConnectionState) r8
                if (r8 == 0) goto L45
                boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
                if (r0 == 0) goto L72
            L45:
                com.facebook.aura.gateway.HatchGatewayConnectionState$Error r8 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r8
                if (r8 == 0) goto L4d
                java.lang.String r5 = r8.message
                if (r5 != 0) goto L58
            L4d:
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                android.content.Context r1 = r0.context
                r0 = 2131886449(0x7f120171, float:1.9407477E38)
                java.lang.String r5 = r1.getString(r0)
            L58:
                com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                X.BLG<com.facebook.aura.assist.AssistOverlayState> r4 = r0._overlayState
            L5c:
                java.lang.Object r3 = r4.getValue()
                r2 = r3
                com.facebook.aura.assist.AssistOverlayState r2 = (com.facebook.aura.assist.AssistOverlayState) r2
                com.facebook.aura.assist.AssistOverlayPhase r1 = com.facebook.aura.assist.AssistOverlayPhase.ERROR
                com.facebook.aura.assist.AssistOverlayMode r0 = r2.mode
                com.facebook.aura.assist.AssistOverlayState r0 = r2.copy(r0, r1, r5)
                boolean r0 = r4.A6e(r3, r0)
                if (r0 == 0) goto L5c
                goto L10
            L72:
                X.GBK r3 = com.facebook.aura.executors.AuraDispatchers.mainImmediate
                com.facebook.aura.assist.HatchAssistOverlayViewModel r2 = com.facebook.aura.assist.HatchAssistOverlayViewModel.this
                com.facebook.aura.analytics.hatch.HatchSendButtonOrigin r1 = r7.$sendButtonOrigin
                com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$2 r0 = new com.facebook.aura.assist.HatchAssistOverlayViewModel$submitCurrentInput$3$2
                r0.<init>(r2, r1, r6)
                r7.L$0 = r6
                r7.label = r4
                java.lang.Object r0 = X.GAo.A00(r7, r3, r0)
                if (r0 != r5) goto L10
                return r5
            L88:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onMicClick(Context context) {
        C7384Etj.A0Y(context, 0);
        if (!C3cH.A1R(this.conversationViewModel.dictation.isActive)) {
            startVoiceWithPermission(context, DictationStartTrigger.MIC);
            return;
        }
        this.conversationViewModel.dictation.end();
        while (!C3cJ.A10(this._overlayState)) {
        }
    }

    public final void onPrimaryVoiceAction(Context context) {
        C7384Etj.A0Y(context, 0);
        int iOrdinal = this._overlayState.getValue().phase.ordinal();
        if (iOrdinal == 0) {
            endVoiceDictationAndSend();
            return;
        }
        if (iOrdinal == 2) {
            bargeInToVoice(context);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 3 && iOrdinal != 4) {
                throw C3cG.A0q();
            }
            startVoiceWithPermission(context, DictationStartTrigger.MIC);
        }
    }

    public final void onVoiceModeSelected(Context context) {
        C7384Etj.A0Y(context, 0);
        if (this._overlayState.getValue().phase == AssistOverlayPhase.RESPONDING) {
            bargeInToVoice(context);
        } else {
            startVoiceWithPermission(context, DictationStartTrigger.MIC);
        }
    }

    public final void submitWidgetMessage(HatchSendMessage hatchSendMessage) {
        AssistOverlayState value;
        AssistOverlayState assistOverlayState;
        C7384Etj.A0Y(hatchSendMessage, 0);
        this.conversationViewModel.dictation.cancel(false);
        BLG<AssistOverlayState> blg = this._overlayState;
        do {
            value = blg.getValue();
            assistOverlayState = value;
        } while (!blg.A6e(value, assistOverlayState.copy(assistOverlayState.mode, AssistOverlayPhase.SUBMITTING, null)));
        this.conversationViewModel.onWidgetSendMessage(hatchSendMessage);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistOverlayPhase.values().length];
            try {
                AnonymousClass002.A13(AssistOverlayPhase.LISTENING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AssistOverlayPhase.RESPONDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AssistOverlayPhase.SUBMITTING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AssistOverlayPhase.IDLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AssistOverlayPhase.ERROR, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isScreenReaderEnabled() {
        return HuJ.A00(this.context);
    }

    private final boolean isVoiceDictationAvailable() {
        return this.conversationViewModel.dictation.isAvailable(DictationMode.AUTO_SUBMIT) && !ConversationInputBlocks.INSTANCE.isBlocked(this.userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDictationStopped(DictationOutcome dictationOutcome, boolean z) {
        AssistOverlayState value;
        AssistOverlayState assistOverlayState;
        if (dictationOutcome == DictationOutcome.FAILED) {
            this.conversationViewModel.requestComposerFocus();
        }
        BLG<AssistOverlayState> blg = this._overlayState;
        do {
            value = blg.getValue();
            assistOverlayState = value;
        } while (!blg.A6e(value, assistOverlayState.copy((dictationOutcome == DictationOutcome.FAILED || z) ? AssistOverlayMode.KEYBOARD : assistOverlayState.mode, assistOverlayState.phase == AssistOverlayPhase.LISTENING ? AssistOverlayPhase.IDLE : assistOverlayState.phase, assistOverlayState.errorMessage)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startVoiceWithPermission(Context context, DictationStartTrigger dictationStartTrigger) {
        AssistOverlayState value;
        if (!HatchPermissionUtils.INSTANCE.hasPermission(context, "android.permission.RECORD_AUDIO") || !isVoiceDictationAvailable()) {
            while (!C3cJ.A12(this._overlayState)) {
            }
        } else {
            this.conversationViewModel.dictation.start(context, dictationStartTrigger, DictationMode.AUTO_SUBMIT, new C109631(), new C109642(this));
            BLG<AssistOverlayState> blg = this._overlayState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, new AssistOverlayState(AssistOverlayMode.VOICE, AssistOverlayPhase.LISTENING, value.errorMessage)));
        }
    }

    private final void submitCurrentInput(HatchSendButtonOrigin hatchSendButtonOrigin) {
        AssistOverlayState value;
        AssistOverlayState assistOverlayState;
        HatchConversationUiState value2 = this.conversationViewModel.uiState.getValue();
        String strA0l = AnonymousClass002.A0l(this.conversationViewModel.composerTextState.A07().toString());
        boolean zIsEmpty = value2.pendingImageUris.isEmpty();
        if (C7BY.A0j(strA0l) && zIsEmpty) {
            while (!C3cJ.A10(this._overlayState)) {
            }
            return;
        }
        BLG<AssistOverlayState> blg = this._overlayState;
        do {
            value = blg.getValue();
            assistOverlayState = value;
        } while (!blg.A6e(value, assistOverlayState.copy(assistOverlayState.mode, AssistOverlayPhase.SUBMITTING, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass3(hatchSendButtonOrigin, null), AEu.A00(this));
    }

    public final void cancelVoiceDictation() {
        this.conversationViewModel.dictation.cancel(true);
        while (!C3cJ.A10(this._overlayState)) {
        }
    }

    public final void endVoiceDictation() {
        AssistOverlayState value;
        AssistOverlayState assistOverlayStateCopy;
        if (this.conversationViewModel.dictation.isFinalizing()) {
            return;
        }
        this.conversationViewModel.dictation.end();
        BLG<AssistOverlayState> blg = this._overlayState;
        do {
            value = blg.getValue();
            assistOverlayStateCopy = value;
            if (assistOverlayStateCopy.phase == AssistOverlayPhase.LISTENING) {
                assistOverlayStateCopy = assistOverlayStateCopy.copy(assistOverlayStateCopy.mode, AssistOverlayPhase.IDLE, assistOverlayStateCopy.errorMessage);
            }
        } while (!blg.A6e(value, assistOverlayStateCopy));
    }

    public final void endVoiceDictationAndSend() {
        this.conversationViewModel.dictation.endAndSend(new C109621());
    }

    public final HatchConversationViewModel getConversationViewModel() {
        return this.conversationViewModel;
    }

    public final C20Q<Unit> getMicFocusRequests() {
        return this.micFocusRequests;
    }

    public final C1BN<AssistOverlayState> getOverlayState() {
        return this.overlayState;
    }

    @Override // X.AEs
    public void onCleared() {
        this.conversationViewModel.dictation.cancel(true);
    }

    public final void onInvokedAgain() {
        AssistOverlayPhase assistOverlayPhase;
        if (HuJ.A00(this.context) || (assistOverlayPhase = this._overlayState.getValue().phase) == AssistOverlayPhase.LISTENING || assistOverlayPhase == AssistOverlayPhase.SUBMITTING || this.conversationViewModel.dictation.isFinalizing() || this.conversationViewModel.hasComposerText() || C3cH.A1R(LiveSessions.INSTANCE.isActive(this.userSession)) || DeviceCallStateTracker.INSTANCE.isInCallNow() || !HatchPermissionUtils.INSTANCE.hasPermission(this.context, "android.permission.RECORD_AUDIO") || !isVoiceDictationAvailable()) {
            return;
        }
        if (assistOverlayPhase == AssistOverlayPhase.RESPONDING) {
            stopGeneration();
        }
        startVoiceWithPermission(this.context, DictationStartTrigger.ASSIST_AGAIN);
    }

    public final void onKeyboardModeSelected() {
        this.conversationViewModel.dictation.end();
        if (this._overlayState.getValue().phase == AssistOverlayPhase.RESPONDING) {
            this.conversationViewModel.stopGeneration();
        }
        while (!C3cJ.A12(this._overlayState)) {
        }
    }

    public final void onSessionHidden() {
        HatchGatewayServiceManager.INSTANCE.onAssistOverlayDismissed();
        this.conversationViewModel.dictation.cancel(true);
        this.conversationViewModel.dictation.waveformBuffer.reset();
        this.conversationViewModel.setComposerText("");
        this.hasInitializedSession = false;
        BLG<AssistOverlayState> blg = this._overlayState;
        while (!blg.A6e(blg.getValue(), new AssistOverlayState(AssistOverlayMode.VOICE, AssistOverlayPhase.IDLE, null))) {
        }
    }

    public final void onSessionShown(boolean z) {
        HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession).setAssistOverlayActive(true);
        if (this.hasInitializedSession) {
            return;
        }
        this.hasInitializedSession = true;
        if (!z || C3cH.A1R(LiveSessions.INSTANCE.isActive(this.userSession)) || DeviceCallStateTracker.INSTANCE.isInCallNow()) {
            while (!C3cJ.A12(this._overlayState)) {
            }
        } else if (!HuJ.A00(this.context)) {
            startVoiceWithPermission(this.context, DictationStartTrigger.ASSIST_OPEN);
        } else {
            Microphone.INSTANCE.preempt(this.userSession, MicrophonePriority.TRANSIENT);
            this._micFocusRequests.AhZ(Unit.INSTANCE);
        }
    }

    public final void prepareForVoiceCall() {
        this.conversationViewModel.dictation.cancel(false);
        while (!C3cJ.A12(this._overlayState)) {
        }
    }

    public final void stopGeneration() {
        this.conversationViewModel.stopGeneration();
        while (!C3cJ.A10(this._overlayState)) {
        }
    }

    public HatchAssistOverlayViewModel(Context context, AbstractC3358CGz abstractC3358CGz, HatchConversationViewModel hatchConversationViewModel) {
        AnonymousClass005.A0x(context, abstractC3358CGz, hatchConversationViewModel);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.conversationViewModel = hatchConversationViewModel;
        C9286GCn c9286GCnA14 = C3cG.A14(new AssistOverlayState(AssistOverlayMode.VOICE, AssistOverlayPhase.IDLE, null));
        this._overlayState = c9286GCnA14;
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -1);
        this._micFocusRequests = gcvA00;
        this.overlayState = C3cG.A11(c9286GCnA14);
        this.micFocusRequests = Hu1.A01(gcvA00);
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    private final void bargeInToVoice(Context context) {
        AssistOverlayState value;
        if (!isVoiceDictationAvailable()) {
            onKeyboardModeSelected();
            return;
        }
        this.conversationViewModel.stopGeneration();
        this.conversationViewModel.dictation.start(context, DictationStartTrigger.MIC, DictationMode.AUTO_SUBMIT, new C109601(), new C109612(this));
        BLG<AssistOverlayState> blg = this._overlayState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, new AssistOverlayState(AssistOverlayMode.VOICE, AssistOverlayPhase.LISTENING, value.errorMessage)));
    }

    public static /* synthetic */ void onDictationStopped$default(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, DictationOutcome dictationOutcome, boolean z, int i, Object obj) {
        hatchAssistOverlayViewModel.onDictationStopped(dictationOutcome, AnonymousClass001.A1Q(i, z));
    }

    public final void submitKeyboardTurn(String str) {
        submitCurrentInput(new HatchSendButtonOrigin(AnonymousClass002.A1Y(str), str, HatchComposerEntryPoint.ASSIST, null));
    }
}
