package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C10649I0t;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import com.facebook.aura.partners.voice.intf.CaptionSpeaker;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.threadvoicecaption.ThreadAssistantCaption;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$connectGeneration$1$2", f = "SessionController.kt", l = {1310}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startCallInternal$connectGeneration$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $callThreadId;
    public final /* synthetic */ int $markerKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SessionController this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$connectGeneration$1$2$1", f = "SessionController.kt", l = {1302}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$connectGeneration$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $callThreadId;
        public final /* synthetic */ int $markerKey;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionController sessionController, String str, int i, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = sessionController;
            this.$callThreadId = str;
            this.$markerKey = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$callThreadId, this.$markerKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SessionController sessionController = this.this$0;
                C10649I0t c10649I0t = new C10649I0t(sessionController.threadCaptionBus.assistantCaption(this.$callThreadId), 2);
                final int i2 = this.$markerKey;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController.startCallInternal.connectGeneration.1.2.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ThreadAssistantCaption) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(ThreadAssistantCaption threadAssistantCaption, HtJ<? super Unit> htJ) {
                        SessionController sessionController2 = sessionController;
                        sessionController2.connectionTracker.onAssistantCaptionReceived(threadAssistantCaption, C3cH.A1R(sessionController2.voiceCallStateHolder.isBotAudioActive), i2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startCallInternal$connectGeneration$1$2(SessionController sessionController, String str, int i, HtJ<? super SessionController$startCallInternal$connectGeneration$1$2> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
        this.$callThreadId = str;
        this.$markerKey = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SessionController$startCallInternal$connectGeneration$1$2 sessionController$startCallInternal$connectGeneration$1$2 = new SessionController$startCallInternal$connectGeneration$1$2(this.this$0, this.$callThreadId, this.$markerKey, htJ);
        sessionController$startCallInternal$connectGeneration$1$2.L$0 = obj;
        return sessionController$startCallInternal$connectGeneration$1$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass001.A1I(C3cG.A0v(), new AnonymousClass1(this.this$0, this.$callThreadId, this.$markerKey, null), c3ux);
            final SessionController sessionController = this.this$0;
            C20Q<ThreadAssistantCaption> c20qAssistantCaption = sessionController.threadCaptionBus.assistantCaption(this.$callThreadId);
            final int i2 = this.$markerKey;
            C20Z<? super ThreadAssistantCaption> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$connectGeneration$1$2.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ThreadAssistantCaption) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ThreadAssistantCaption threadAssistantCaption, HtJ<? super Unit> htJ) {
                    VoiceCallUiState value;
                    VoiceCallUiState voiceCallUiState;
                    CaptionEntry captionEntry;
                    if (threadAssistantCaption != null) {
                        SessionController sessionController2 = sessionController;
                        sessionController2.connectionTracker.onAssistantCaptionOnMainThread(threadAssistantCaption, C3cH.A1R(sessionController2.voiceCallStateHolder.isBotAudioActive), i2);
                    }
                    BLG<VoiceCallUiState> blg = sessionController._callState;
                    do {
                        value = blg.getValue();
                        voiceCallUiState = value;
                        if (threadAssistantCaption != null) {
                            captionEntry = new CaptionEntry(CaptionSpeaker.BOT, threadAssistantCaption.text, threadAssistantCaption.messageId);
                        } else {
                            captionEntry = null;
                        }
                    } while (!blg.A6e(value, VoiceCallUiState.copy$default(voiceCallUiState, null, 0L, null, null, null, null, false, false, false, false, null, null, captionEntry, voiceCallUiState.liveAssistantCaptionRevision + 1, 0, false, null, 118783, null)));
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c20qAssistantCaption.collect(c20z, this) == enumC10460Hji) {
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
        return ((SessionController$startCallInternal$connectGeneration$1$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
