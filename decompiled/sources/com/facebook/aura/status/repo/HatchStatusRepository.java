package com.facebook.aura.status.repo;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0862A6j;
import X.C0881AGi;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C2297BSx;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C4o7;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.Hy1;
import X.HzC;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.AgentStatusCta;
import com.facebook.aura.gateway.AgentStatusPayload;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchVmStateStore;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.HatchSubAgent;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchStatusRepository {
    public final BLG<AgentActivityInfo> _agentActivity;
    public final BLG<HatchModelInfo> _modelInfo;
    public final BLG<List<HatchAction>> _pendingActions;
    public final BLG<String> _simulatedWorkMessage;
    public final BLG<List<HatchUpcomingTask>> _upcomingTasks;
    public final C1BN<Integer> activeSubAgentCount;
    public final C1BN<List<HatchSubAgent>> activeSubAgents;
    public final C1BN<AgentActivityInfo> agentActivity;
    public final C1BN<AiIdentity> aiIdentity;
    public final C1BN<AvatarMedia> avatarMedia;
    public final C20Q<HatchGatewayConnectionState> connectionState;
    public final HatchGatewayConnection gateway;
    public final C20Q<Boolean> isVmStarting;
    public final C1BN<String> milestoneVideoUrl;
    public final C1BN<HatchModelInfo> modelInfo;
    public final C1BN<List<HatchAction>> pendingActions;
    public final C3UX scope;
    public final C1BN<String> simulatedWorkMessage;
    public final String subthreadSessionId;
    public final C1BN<List<HatchUpcomingTask>> upcomingTasks;

    @DebugMetadata(c = "com.facebook.aura.status.repo.HatchStatusRepository$1", f = "HatchStatusRepository.kt", l = {113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.HatchStatusRepository$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchStatusRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchStatusRepository hatchStatusRepository = HatchStatusRepository.this;
                C1BN<HatchGatewayConnectionState> c1bn = hatchStatusRepository.gateway.connectionState;
                C20Z<? super HatchGatewayConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.status.repo.HatchStatusRepository.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) {
                            AnonymousClass001.A1E(hatchStatusRepository._agentActivity, null, new AgentActivityInfo(AgentActivityStatus.ONLINE, null, null, null, null));
                        }
                        return Unit.INSTANCE;
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
            return HatchStatusRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.HatchStatusRepository$2", f = "HatchStatusRepository.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.HatchStatusRepository$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchStatusRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<AgentStatusPayload> agentStatusEvents = HatchStatusRepository.this.gateway.getAgentStatusEvents();
                final HatchStatusRepository hatchStatusRepository = HatchStatusRepository.this;
                C20Z<? super AgentStatusPayload> c20z = new C20Z() { // from class: com.facebook.aura.status.repo.HatchStatusRepository.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AgentStatusPayload) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(AgentStatusPayload agentStatusPayload, HtJ<? super Unit> htJ) {
                        if (C7384Etj.areEqual(agentStatusPayload.sessionId, hatchStatusRepository.subthreadSessionId)) {
                            AgentActivityStatus agentActivityStatusActivityStatusForCurrentSubscription = agentStatusPayload.activityStatusForCurrentSubscription();
                            BLG<AgentActivityInfo> blg = hatchStatusRepository._agentActivity;
                            String str = agentStatusPayload.activityText;
                            if (str.length() == 0) {
                                str = null;
                            }
                            String str2 = agentStatusPayload.activityEmoji;
                            String str3 = agentStatusPayload.sessionId;
                            AgentStatusCta agentStatusCta = agentStatusPayload.cta;
                            AgentStatusCta agentStatusCta2 = null;
                            if (agentActivityStatusActivityStatusForCurrentSubscription == AgentActivityStatus.OUT_OF_CREDITS) {
                                agentStatusCta2 = agentStatusCta;
                            }
                            AnonymousClass001.A1E(blg, null, new AgentActivityInfo(agentActivityStatusActivityStatusForCurrentSubscription, str, str2, str3, agentStatusCta2));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (agentStatusEvents.collect(c20z, this) == enumC10460Hji) {
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
            return HatchStatusRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.HatchStatusRepository$checkConnection$1", f = "HatchStatusRepository.kt", l = {178}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.HatchStatusRepository$checkConnection$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C140231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C140231(HtJ<? super C140231> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchStatusRepository.this.new C140231(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection hatchGatewayConnection = HatchStatusRepository.this.gateway;
                    this.label = 1;
                    if (hatchGatewayConnection.fetchAndConnect(false, false, null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A04(HatchStatusRepositoryKt.TAG, FGI.A0M("Jarvis connection fetch failed: ", e.getMessage()));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchStatusRepository.this.new C140231(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchStatusRepository(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.subthreadSessionId = str;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gateway = companion;
        HzC hzCA05 = C78W.A05(new Hy1(AuraExecutors.INSTANCE.getBackgroundThreadExecutor()), new C8eO(null));
        this.scope = hzCA05;
        C1BN<HatchGatewayConnectionState> c1bn = companion.connectionState;
        HatchStatusRepository$connectionState$1 hatchStatusRepository$connectionState$1 = HatchStatusRepository$connectionState$1.INSTANCE;
        G0U<Object, Object> g0u = GDB.A00;
        C7384Etj.A0Z(hatchStatusRepository$connectionState$1, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        C0862A6j.A02(hatchStatusRepository$connectionState$1, 2);
        this.connectionState = C4o7.A00(new C2297BSx((G0U) HatchStatusRepository$connectionState$2.INSTANCE, 46), GDB.A00(g0u, hatchStatusRepository$connectionState$1, c1bn));
        this.activeSubAgents = companion.getActiveSubAgents();
        this.isVmStarting = HatchVmStateStore.Companion.getInstance(abstractC3358CGz).isStarting;
        this.activeSubAgentCount = companion.getActiveSubAgentCount();
        C9286GCn c9286GCnA14 = C3cG.A14(new AgentActivityInfo(AgentActivityStatus.ONLINE, null, null, null, null));
        this._agentActivity = c9286GCnA14;
        this.agentActivity = C3cG.A11(c9286GCnA14);
        HatchIdentityProvider.Companion companion2 = HatchIdentityProvider.Companion;
        this.aiIdentity = companion2.getInstance(abstractC3358CGz).aiIdentity;
        this.avatarMedia = companion2.getInstance(abstractC3358CGz).avatarMedia;
        this.milestoneVideoUrl = companion.getMilestoneVideoUrl();
        C0881AGi c0881AGi = C0881AGi.A00;
        C9286GCn c9286GCnA01 = HnJ.A01(c0881AGi);
        this._pendingActions = c9286GCnA01;
        this.pendingActions = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(c0881AGi);
        this._upcomingTasks = c9286GCnA012;
        this.upcomingTasks = C3cG.A11(c9286GCnA012);
        C9286GCn c9286GCnA013 = HnJ.A01(null);
        this._simulatedWorkMessage = c9286GCnA013;
        this.simulatedWorkMessage = C3cG.A11(c9286GCnA013);
        C9286GCn c9286GCnA014 = HnJ.A01(null);
        this._modelInfo = c9286GCnA014;
        this.modelInfo = C3cG.A11(c9286GCnA014);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA05);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA05);
    }

    public final void acceptAction(String str) {
        Object next;
        List<HatchAction> value;
        ArrayList arrayListA0h;
        C7384Etj.A0Y(str, 0);
        Iterator<T> it = this._pendingActions.getValue().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (str.equals(((HatchAction) next).id)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        HatchAction hatchAction = (HatchAction) next;
        if (hatchAction != null) {
            BLG<List<HatchAction>> blg = this._pendingActions;
            do {
                value = blg.getValue();
                arrayListA0h = C3cG.A0h();
                for (HatchAction hatchAction2 : value) {
                    if (!str.equals(hatchAction2.id)) {
                        arrayListA0h.add(hatchAction2);
                    }
                }
            } while (!blg.A6e(value, arrayListA0h));
            this._simulatedWorkMessage.Af8(hatchAction.workMessage);
        }
    }

    public final void dismissAction(String str) {
        List<HatchAction> value;
        ArrayList arrayListA0h;
        C7384Etj.A0Y(str, 0);
        BLG<List<HatchAction>> blg = this._pendingActions;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (HatchAction hatchAction : value) {
                if (!str.equals(hatchAction.id)) {
                    arrayListA0h.add(hatchAction);
                }
            }
        } while (!blg.A6e(value, arrayListA0h));
    }

    public final void removeUpcomingTask(String str) {
        List<HatchUpcomingTask> value;
        ArrayList arrayListA0h;
        C7384Etj.A0Y(str, 0);
        BLG<List<HatchUpcomingTask>> blg = this._upcomingTasks;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (HatchUpcomingTask hatchUpcomingTask : value) {
                if (!str.equals(hatchUpcomingTask.id)) {
                    arrayListA0h.add(hatchUpcomingTask);
                }
            }
        } while (!blg.A6e(value, arrayListA0h));
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass002.A13(AgentActivityStatus.RESPONDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentActivityStatus.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.COMPOSING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.COMPACTING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.ONLINE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getConnectionState$annotations() {
    }

    public final void checkConnection() {
        if (HatchUtil.INSTANCE.isAuraApp()) {
            HatchGatewayConnectionState value = this.gateway.connectionState.getValue();
            if ((value instanceof HatchGatewayConnectionState.Disconnected) || (value instanceof HatchGatewayConnectionState.Error)) {
                AnonymousClass001.A1J(new C140231(null), this.scope);
            }
        }
    }

    public final void clearBusyActivity() {
        AgentActivityInfo value;
        AgentActivityInfo agentActivityInfo;
        BLG<AgentActivityInfo> blg = this._agentActivity;
        do {
            value = blg.getValue();
            agentActivityInfo = value;
            switch (agentActivityInfo.status.ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    agentActivityInfo = new AgentActivityInfo(AgentActivityStatus.ONLINE, null, null, null, null);
                    break;
                default:
                    throw C3cG.A0q();
            }
        } while (!blg.A6e(value, agentActivityInfo));
    }

    public final void clearMilestoneVideo() {
        this.gateway.clearMilestoneVideo();
    }

    public final void dispose() {
        Hxb.A03(null, this.scope);
    }

    public final C1BN<Integer> getActiveSubAgentCount() {
        return this.activeSubAgentCount;
    }

    public final C1BN<List<HatchSubAgent>> getActiveSubAgents() {
        return this.activeSubAgents;
    }

    public final C1BN<AgentActivityInfo> getAgentActivity() {
        return this.agentActivity;
    }

    public final C1BN<AiIdentity> getAiIdentity() {
        return this.aiIdentity;
    }

    public final C1BN<AvatarMedia> getAvatarMedia() {
        return this.avatarMedia;
    }

    public final C20Q<HatchGatewayConnectionState> getConnectionState() {
        return this.connectionState;
    }

    public final C1BN<String> getMilestoneVideoUrl() {
        return this.milestoneVideoUrl;
    }

    public final C1BN<HatchModelInfo> getModelInfo() {
        return this.modelInfo;
    }

    public final C1BN<List<HatchAction>> getPendingActions() {
        return this.pendingActions;
    }

    public final C1BN<String> getSimulatedWorkMessage() {
        return this.simulatedWorkMessage;
    }

    public final C1BN<List<HatchUpcomingTask>> getUpcomingTasks() {
        return this.upcomingTasks;
    }

    public final C20Q<Boolean> isVmStarting() {
        return this.isVmStarting;
    }

    public final void refreshIdentity() {
        this.gateway.refreshIdentity();
    }

    public /* synthetic */ HatchStatusRepository(AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
        this(abstractC3358CGz, AnonymousClass006.A0s(i, str));
    }
}
