package com.facebook.aura.status.viewmodel;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC05633ui;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3pS;
import X.C7384Etj;
import X.C9uG;
import X.GDB;
import X.InterfaceC08439ui;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.status.repo.HatchBotStatusMuteStore;
import com.facebook.aura.status.repo.HatchStatusRepository;

/* loaded from: classes4.dex */
public final class HatchStatusPillViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public final HatchBotStatusMuteStore botStatusMuteStore;
    public final C1BN<Boolean> isWithinForegroundGrace;
    public final HatchStatusRepository repository;
    public final String subthreadSessionId;
    public final C1BN<HatchStatusPillUiState> uiState;

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.status.viewmodel.HatchStatusPillUiState derivePillState(com.facebook.aura.gateway.HatchGatewayConnectionState r13, com.facebook.aura.status.repo.AgentActivityInfo r14, com.facebook.aura.model.AiIdentity r15, boolean r16, boolean r17) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.HatchStatusPillViewModel.Companion.derivePillState(com.facebook.aura.gateway.HatchGatewayConnectionState, com.facebook.aura.status.repo.AgentActivityInfo, com.facebook.aura.model.AiIdentity, boolean, boolean):com.facebook.aura.status.viewmodel.HatchStatusPillUiState");
        }

        /* loaded from: classes6.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AgentActivityStatus.values().length];
                try {
                    AnonymousClass002.A13(AgentActivityStatus.ONLINE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AgentActivityStatus.OUT_OF_CREDITS, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Factory implements InterfaceC08439ui {
        public final String subthreadSessionId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.subthreadSessionId = str;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchStatusPillViewModel(this.userSession, this.subthreadSessionId);
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
            this(abstractC3358CGz, AnonymousClass006.A0s(i, str));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    public HatchStatusPillViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.subthreadSessionId = str;
        HatchStatusRepository hatchStatusRepository = new HatchStatusRepository(abstractC3358CGz, str);
        this.repository = hatchStatusRepository;
        this.botStatusMuteStore = HatchBotStatusMuteStore.Companion.getInstance(abstractC3358CGz);
        C3pS c3pSA00 = AbstractC05633ui.A00(new HatchStatusPillViewModel$special$$inlined$flatMapLatest$1(null, this), GDB.A01(AuraAppLifecycleManager.isAppInForegroundFlow));
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        C3Pi c3PiA00 = AnonymousClass441.A00(false, bllA00, c3pSA00, c3Ej);
        this.isWithinForegroundGrace = c3PiA00;
        HatchStatusPillViewModel$special$$inlined$combine$1 hatchStatusPillViewModel$special$$inlined$combine$1 = new HatchStatusPillViewModel$special$$inlined$combine$1(new C20Q[]{hatchStatusRepository.connectionState, hatchStatusRepository.agentActivity, hatchStatusRepository.aiIdentity, hatchStatusRepository.milestoneVideoUrl, c3PiA00, hatchStatusRepository.isVmStarting, hatchStatusRepository.avatarMedia, LiveSessions.INSTANCE.statusOverride(abstractC3358CGz, str)}, this);
        BLL bllA002 = AEu.A00(this);
        AiIdentity value = hatchStatusRepository.aiIdentity.getValue();
        this.uiState = AnonymousClass441.A00(new HatchStatusPillUiState(HatchPillState.IDLE, null, null, null, value != null ? value.name : null, hatchStatusRepository.avatarMedia.getValue(), null), bllA002, hatchStatusPillViewModel$special$$inlined$combine$1, c3Ej);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if ((r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Reconnecting) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (((com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r2).retriesExhausted != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchGatewayConnectionState coerceWithinForegroundGrace(com.facebook.aura.gateway.HatchGatewayConnectionState r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto Ld
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            if (r0 == 0) goto Le
            r0 = r2
            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r0 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r0
            boolean r0 = r0.retriesExhausted
            if (r0 == 0) goto L24
        Ld:
            return r2
        Le:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected
            if (r0 == 0) goto L1c
            r0 = r2
            com.facebook.aura.gateway.HatchGatewayConnectionState$Disconnected r0 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected) r0
            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r1 = r0.reason
            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Reason.OFFLINE
            if (r1 != r0) goto L24
            return r2
        L1c:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connecting
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Reconnecting
            if (r0 == 0) goto Ld
        L24:
            com.facebook.aura.gateway.HatchGatewayConnectionState$Connected r2 = com.facebook.aura.gateway.HatchGatewayConnectionState.Connected.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.HatchStatusPillViewModel.coerceWithinForegroundGrace(com.facebook.aura.gateway.HatchGatewayConnectionState, boolean):com.facebook.aura.gateway.HatchGatewayConnectionState");
    }

    public static /* synthetic */ void isWithinForegroundGrace$annotations() {
    }

    public final void clearMilestoneVideo() {
        this.repository.clearMilestoneVideo();
    }

    public final C1BN<HatchStatusPillUiState> getUiState() {
        return this.uiState;
    }

    @Override // X.AEs
    public void onCleared() {
        this.repository.dispose();
    }

    public /* synthetic */ HatchStatusPillViewModel(AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
        this(abstractC3358CGz, AnonymousClass006.A0s(i, str));
    }
}
