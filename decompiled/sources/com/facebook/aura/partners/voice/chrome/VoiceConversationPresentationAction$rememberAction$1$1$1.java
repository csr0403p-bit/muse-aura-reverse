package com.facebook.aura.partners.voice.chrome;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C5303Dfm;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$1$1$1", f = "VoiceConversationPresentationAction.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceConversationPresentationAction$rememberAction$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<VoiceCallStart, Unit>> $currentCallStarter$delegate;
    public final /* synthetic */ C1BO<ConversationPresentationActionContext> $currentContext$delegate;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ PendingCallStart $pending;
    public final /* synthetic */ MutableState<PendingCallStart> $pendingCallStart$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceConversationPresentationAction$rememberAction$1$1$1(PendingCallStart pendingCallStart, F2N f2n, AbstractC3358CGz abstractC3358CGz, C1BO<ConversationPresentationActionContext> c1bo, MutableState<PendingCallStart> mutableState, C1BO<? extends G0U<? super VoiceCallStart, Unit>> c1bo2, HtJ<? super VoiceConversationPresentationAction$rememberAction$1$1$1> htJ) {
        super(2, htJ);
        this.$pending = pendingCallStart;
        this.$lifecycle = f2n;
        this.$userSession = abstractC3358CGz;
        this.$currentContext$delegate = c1bo;
        this.$pendingCallStart$delegate = mutableState;
        this.$currentCallStarter$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceConversationPresentationAction$rememberAction$1$1$1(this.$pending, this.$lifecycle, this.$userSession, this.$currentContext$delegate, this.$pendingCallStart$delegate, this.$currentCallStarter$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1 voiceConversationPresentationAction$rememberAction$1$1$1$connected$1 = new VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1(this.$currentContext$delegate, null);
            this.label = 1;
            obj = GAX.A01(this, voiceConversationPresentationAction$rememberAction$1$1$1$connected$1, 15000L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$pendingCallStart$delegate.Af8(null);
        if (C7384Etj.areEqual(this.$currentContext$delegate.getValue().threadId, this.$pending.threadId) && ((C5303Dfm) this.$lifecycle).A01.A00(EnumC10573Huf.A05) && !C3cH.A1P(C3cG.A0K(this.$userSession))) {
            if (obj == null || !VoiceConversationPresentationActionKt.canStartCall(this.$currentContext$delegate.getValue(), this.$userSession)) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120651);
            } else {
                C1BO.A0B(this.$currentCallStarter$delegate).invoke(this.$pending.start);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceConversationPresentationAction$rememberAction$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
