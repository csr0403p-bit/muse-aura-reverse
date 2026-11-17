package com.facebook.aura.partners.voice.screen;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass602;
import X.BLG;
import X.BLL;
import X.C10649I0t;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.api.ConversationCardRequests;
import com.facebook.aura.conversation.api.ConversationComposers;
import com.facebook.aura.conversation.api.ConversationInputBlocks;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.microphone.api.MicrophonePriority;
import com.facebook.aura.partners.voice.gating.VoiceAnnouncementCopy;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository;
import com.facebook.aura.partners.voice.infra.VoiceNuxRepository;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAnnouncementViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<VoiceCallStart> _callStarts;
    public final C3Em<Unit> _closeSheet;
    public final C3Em<Unit> _showSheet;
    public final BLG<VoiceAnnouncementStep> _step;
    public final VoiceCallStart announcementStart;
    public final HatchAgentPermissionsRepository approvals;
    public final C22I<VoiceCallStart> callStarts;
    public final VoiceCallStateHolder callState;
    public final ConversationCardRequests cardRequests;
    public HoC check;
    public final C22I<Unit> closeSheet;
    public final ConversationComposers composers;
    public final VoiceAnnouncementRepository repository;
    public boolean sheetHiding;
    public final C22I<Unit> showSheet;
    public boolean startWanted;
    public final C1BN<VoiceAnnouncementStep> step;
    public Boolean talkSkipsVoiceNux;
    public final AbstractC3358CGz userSession;
    public final VoiceNuxRepository voiceNux;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$1", f = "VoiceAnnouncementViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceAnnouncementViewModel$1$invokeSuspend$$inlined$filter$1 voiceAnnouncementViewModel$1$invokeSuspend$$inlined$filter$1 = new VoiceAnnouncementViewModel$1$invokeSuspend$$inlined$filter$1(AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundFlow));
                final VoiceAnnouncementViewModel voiceAnnouncementViewModel = VoiceAnnouncementViewModel.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel.1.2
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        AnonymousClass002.A1K(voiceAnnouncementViewModel.check);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        AnonymousClass002.A1K(voiceAnnouncementViewModel.check);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (voiceAnnouncementViewModel$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
            return VoiceAnnouncementViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$2", f = "VoiceAnnouncementViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final VoiceAnnouncementViewModel voiceAnnouncementViewModel = VoiceAnnouncementViewModel.this;
                C10649I0t c10649I0t = new C10649I0t(voiceAnnouncementViewModel.callState.pendingCallStart, 2);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(C3cG.A05(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(long j, HtJ<? super Unit> htJ) {
                        VoiceAnnouncementViewModel voiceAnnouncementViewModel2 = voiceAnnouncementViewModel;
                        voiceAnnouncementViewModel2.startWanted = false;
                        voiceAnnouncementViewModel2.close();
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
            return VoiceAnnouncementViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<VoiceAnnouncementViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new VoiceAnnouncementViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceAnnouncementViewModel create() {
            return new VoiceAnnouncementViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$onMainChatForeground$1", f = "VoiceAnnouncementViewModel.kt", l = {MinidumpReader.MODULE_FULL_SIZE, 109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel$onMainChatForeground$1, reason: invalid class name and case insensitive filesystem */
    public final class C131801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C131801(HtJ<? super C131801> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceAnnouncementViewModel.this.new C131801(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (VoiceAnnouncementViewModel.this.isChatIdle()) {
                    VoiceAnnouncementRepository voiceAnnouncementRepository = VoiceAnnouncementViewModel.this.repository;
                    this.label = 1;
                    obj = voiceAnnouncementRepository.isDue(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                VoiceAnnouncementViewModel.this.repository.isForegroundFresh = false;
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                if (VoiceAnnouncementViewModel.this.isChatIdle() && C3cH.A1R(VoiceAnnouncementViewModel.this.approvals.hasLoadedServerApprovals)) {
                    C3Em<Unit> c3Em = VoiceAnnouncementViewModel.this._showSheet;
                    Unit unit = Unit.INSTANCE;
                    c3Em.AhV(unit);
                    return unit;
                }
                VoiceAnnouncementViewModel.this.repository.isForegroundFresh = false;
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            if (AnonymousClass001.A1X(obj)) {
                this.label = 2;
                if (C7Bq.A01(1000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                if (VoiceAnnouncementViewModel.this.isChatIdle()) {
                    C3Em<Unit> c3Em2 = VoiceAnnouncementViewModel.this._showSheet;
                    Unit unit2 = Unit.INSTANCE;
                    c3Em2.AhV(unit2);
                    return unit2;
                }
            }
            VoiceAnnouncementViewModel.this.repository.isForegroundFresh = false;
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceAnnouncementViewModel.this.new C131801(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VoiceAnnouncementViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.repository = VoiceAnnouncementRepository.Companion.getInstance(abstractC3358CGz);
        this.callState = C3cG.A0K(abstractC3358CGz);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._showSheet = c9290GCrA12;
        this.showSheet = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 1);
        this._callStarts = c9290GCrA122;
        this.callStarts = C3pd.A00(c9290GCrA122);
        C9286GCn c9286GCnA14 = C3cG.A14(VoiceAnnouncementStep.CLOSED);
        this._step = c9286GCnA14;
        this.step = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, 1);
        this._closeSheet = c9290GCrA123;
        this.closeSheet = C3pd.A00(c9290GCrA123);
        this.announcementStart = new VoiceCallStart(VoiceCallEntryPoint.VOICE_ANNOUNCEMENT, AGH.A0E());
        this.cardRequests = ConversationCardRequests.Companion.getInstance(abstractC3358CGz);
        this.composers = ConversationComposers.Companion.getInstance(abstractC3358CGz);
        this.approvals = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.voiceNux = VoiceNuxRepository.Companion.getInstance(abstractC3358CGz);
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    public final boolean onForeground(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        if (this.repository.isFreshForeground()) {
            if (!AnonymousClass003.A1Y(function0)) {
                return true;
            }
            this.repository.isForegroundFresh = false;
        }
        return false;
    }

    public final void onNotNow() {
        this.startWanted = false;
        close();
    }

    public final boolean onSheetDue(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && isChatIdle()) {
            z2 = true;
            if (!AnonymousClass002.A1X(VoiceGating.INSTANCE.getVoiceAnnouncementCopy())) {
            }
            this.repository.isForegroundFresh = false;
            return z3;
        }
        z2 = false;
        z3 = false;
        if (z2) {
            this.repository.onControlExposed();
        }
        this.repository.isForegroundFresh = false;
        return z3;
    }

    public final void onVoiceNuxNotNow() {
        this.startWanted = false;
        this.voiceNux.markSeen();
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        AnonymousClass002.A1I(this._step, VoiceAnnouncementStep.CLOSED);
        C3cG.A1I(this._closeSheet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isChatIdle() {
        return (C3cH.A1P(this.callState) || this.callState.pendingCallStart.getValue() != null || this.voiceNux.isCheckingBeforeCall() || Microphone.INSTANCE.holder(this.userSession).getValue() == MicrophonePriority.TRANSIENT || !this.approvals.pendingApprovals.getValue().isEmpty() || this.cardRequests.activeConversationId() != null || C3cH.A1R(this.cardRequests.hasPendingCards) || this.composers.conversationsWithContent.containsValue("primary_session_id") || ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) ? false : true;
    }

    public final C22I<VoiceCallStart> getCallStarts() {
        return this.callStarts;
    }

    public final C22I<Unit> getCloseSheet() {
        return this.closeSheet;
    }

    public final VoiceAnnouncementCopy getCopy() {
        return VoiceGating.INSTANCE.getVoiceAnnouncementCopy();
    }

    public final Map<String, String> getNuxLogMetadata() {
        return VoiceNuxSheetViewModelKt.voiceNuxLogMetadata(this.userSession, this.announcementStart);
    }

    public final boolean getReplacesVoiceNux() {
        return VoiceGating.INSTANCE.getSkipsVoiceNuxAfterAnnouncement();
    }

    public final C22I<Unit> getShowSheet() {
        return this.showSheet;
    }

    public final C1BN<VoiceAnnouncementStep> getStep() {
        return this.step;
    }

    public final boolean isEnabled() {
        return AnonymousClass002.A1X(VoiceGating.INSTANCE.getVoiceAnnouncementCopy());
    }

    public final boolean isStartWanted() {
        if (this.startWanted) {
            return (this.sheetHiding && this._step.getValue() == VoiceAnnouncementStep.PROMO) ? false : true;
        }
        return false;
    }

    public final boolean isVoiceNuxShown() {
        return AnonymousClass002.A1Z(this._step.getValue(), VoiceAnnouncementStep.VOICE_NUX_SHOWN);
    }

    public final void onMainChatForeground() {
        HoC hoC = this.check;
        if (hoC == null || !hoC.isActive()) {
            this.check = AnonymousClass001.A11(new C131801(null), AEu.A00(this));
        }
    }

    public final void onSheetGone() {
        boolean zA1Z = AnonymousClass002.A1Z(this._step.getValue(), VoiceAnnouncementStep.VOICE_NUX_SHOWN);
        this.startWanted = false;
        this.sheetHiding = false;
        AnonymousClass002.A1I(this._step, VoiceAnnouncementStep.CLOSED);
        if (zA1Z) {
            this.voiceNux.markSeen();
        }
    }

    public final void onSheetHiding(boolean z) {
        this.sheetHiding = z;
    }

    public final void onSheetOpened() {
        AnonymousClass001.A1E(this._step, VoiceAnnouncementStep.CLOSED, VoiceAnnouncementStep.PROMO);
    }

    public final void onSheetShown() {
        VoiceAnnouncementRepository voiceAnnouncementRepository = this.repository;
        voiceAnnouncementRepository.isForegroundFresh = false;
        voiceAnnouncementRepository.markSeen();
    }

    public final boolean onTalk(boolean z) {
        if (ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            close();
            return false;
        }
        this.talkSkipsVoiceNux = Boolean.valueOf(z);
        this.startWanted = true;
        if (z) {
            close();
        }
        this._callStarts.AhV(this.announcementStart);
        return true;
    }

    public final void onVoiceNuxBack() {
        AnonymousClass002.A1I(this._step, VoiceAnnouncementStep.PROMO);
    }

    public final boolean onVoiceNuxDue() {
        if (this._step.getValue() == VoiceAnnouncementStep.CLOSED) {
            return false;
        }
        AnonymousClass001.A1E(this._step, VoiceAnnouncementStep.PROMO, VoiceAnnouncementStep.VOICE_NUX);
        return true;
    }

    public final void onVoiceNuxShown() {
        AnonymousClass001.A1E(this._step, VoiceAnnouncementStep.VOICE_NUX, VoiceAnnouncementStep.VOICE_NUX_SHOWN);
    }

    public final boolean skipsVoiceNux() {
        Boolean bool = this.talkSkipsVoiceNux;
        return bool != null ? bool.booleanValue() : VoiceGating.INSTANCE.getSkipsVoiceNuxAfterAnnouncement();
    }

    public final void onVoiceNuxContinue() {
        close();
        VoiceCallStarterKt.startVoiceCall(this.userSession, null, this.announcementStart);
    }
}
