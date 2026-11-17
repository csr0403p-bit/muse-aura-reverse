package com.facebook.aura.agentpermission;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass603;
import X.C06H;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0V;
import X.G2l;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchBackgroundSession;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.NodeForegroundServiceState;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentPermissionNotificationRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public volatile HoC job;
    public Set<String> knownApprovalIds;
    public final C3UX scope;
    public boolean serverSnapshotLoaded;
    public final AbstractC3358CGz userSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ApprovalSurface {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ApprovalSurface[] $VALUES;
        public static final ApprovalSurface IN_APP;
        public static final ApprovalSurface NONE;
        public static final ApprovalSurface NOTIFICATION;

        static {
            ApprovalSurface approvalSurface = new ApprovalSurface("IN_APP", 0);
            IN_APP = approvalSurface;
            ApprovalSurface approvalSurface2 = new ApprovalSurface("NOTIFICATION", 1);
            NOTIFICATION = approvalSurface2;
            ApprovalSurface approvalSurface3 = new ApprovalSurface(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2);
            NONE = approvalSurface3;
            ApprovalSurface[] approvalSurfaceArr = {approvalSurface, approvalSurface2, approvalSurface3};
            $VALUES = approvalSurfaceArr;
            $ENTRIES = C3cG.A0w(approvalSurfaceArr);
        }

        public static Ey9<ApprovalSurface> getEntries() {
            return $ENTRIES;
        }

        public static ApprovalSurface valueOf(String str) {
            return (ApprovalSurface) Enum.valueOf(ApprovalSurface.class, str);
        }

        public static ApprovalSurface[] values() {
            return (ApprovalSurface[]) $VALUES.clone();
        }

        public ApprovalSurface(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionNotificationRepository", f = "AgentPermissionNotificationRepository.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "reconcileSystemNotifications", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$reconcileSystemNotifications$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentPermissionNotificationRepository.this.reconcileSystemNotifications(null, false, null, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$1", f = "AgentPermissionNotificationRepository.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C107551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAgentPermissionsRepository $repository;
        public final /* synthetic */ long $startedAtMs;
        public final /* synthetic */ C20Q<ApprovalSurface> $surface;
        public int label;
        public final /* synthetic */ AgentPermissionNotificationRepository this$0;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$1$1", f = "AgentPermissionNotificationRepository.kt", l = {75}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00211 extends AbstractC07127nr implements G2l<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, Boolean, ApprovalSurface, String, AiIdentity, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchAgentPermissionsRepository $repository;
            public final /* synthetic */ long $startedAtMs;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ AgentPermissionNotificationRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(AgentPermissionNotificationRepository agentPermissionNotificationRepository, HatchAgentPermissionsRepository hatchAgentPermissionsRepository, long j, HtJ<? super C00211> htJ) {
                super(6, htJ);
                this.this$0 = agentPermissionNotificationRepository;
                this.$repository = hatchAgentPermissionsRepository;
                this.$startedAtMs = j;
            }

            @Override // X.G2l
            public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, Boolean bool, ApprovalSurface approvalSurface, String str, AiIdentity aiIdentity, HtJ<? super Unit> htJ) {
                return invoke((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, AnonymousClass001.A1X(bool), approvalSurface, str, aiIdentity, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                ApprovalSurface approvalSurface = (ApprovalSurface) this.L$0;
                String str = (String) this.L$1;
                AiIdentity aiIdentity = (AiIdentity) this.L$2;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AgentPermissionNotificationRepository agentPermissionNotificationRepository = this.this$0;
                    List<HatchAgentPermissionsRepository.AgentPermissionApproval> listCurrentPendingApprovals = this.$repository.currentPendingApprovals();
                    long j = this.$startedAtMs;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.Z$0 = z;
                    this.label = 1;
                    if (agentPermissionNotificationRepository.reconcileSystemNotifications(listCurrentPendingApprovals, z, approvalSurface, str, aiIdentity, j, this) == enumC10460Hji) {
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

            public final Object invoke(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, boolean z, ApprovalSurface approvalSurface, String str, AiIdentity aiIdentity, HtJ<? super Unit> htJ) {
                C00211 c00211 = new C00211(this.this$0, this.$repository, this.$startedAtMs, htJ);
                c00211.Z$0 = z;
                c00211.L$0 = approvalSurface;
                c00211.L$1 = str;
                c00211.L$2 = aiIdentity;
                return c00211.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107551(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, C20Q<? extends ApprovalSurface> c20q, AgentPermissionNotificationRepository agentPermissionNotificationRepository, long j, HtJ<? super C107551> htJ) {
            super(2, htJ);
            this.$repository = hatchAgentPermissionsRepository;
            this.$surface = c20q;
            this.this$0 = agentPermissionNotificationRepository;
            this.$startedAtMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C107551(this.$repository, this.$surface, this.this$0, this.$startedAtMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.$repository;
                AnonymousClass603 anonymousClass603 = new AnonymousClass603(3, new C00211(this.this$0, this.$repository, this.$startedAtMs, null), new C20Q[]{hatchAgentPermissionsRepository.pendingApprovals, hatchAgentPermissionsRepository.hasLoadedServerApprovals, this.$surface, HatchPrimarySessionRepository.Companion.getInstance(this.this$0.userSession).primarySessionId, HatchGatewayConnection.Companion.getInstance(this.this$0.userSession).getAiIdentity()});
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository.start.1.2
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603.collect(c20z, this) == enumC10460Hji) {
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
            return ((C107551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcileSystemNotifications(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r13, boolean r14, com.facebook.aura.agentpermission.AgentPermissionNotificationRepository.ApprovalSurface r15, java.lang.String r16, com.facebook.aura.model.AiIdentity r17, long r18, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository.reconcileSystemNotifications(java.util.List, boolean, com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$ApprovalSurface, java.lang.String, com.facebook.aura.model.AiIdentity, long, X.HtJ):java.lang.Object");
    }

    public final void start() {
        HoC hoC = this.job;
        if (hoC == null || !hoC.isActive()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(this.userSession);
            AnonymousClass603 anonymousClass603A00 = C3rb.A00(new AgentPermissionNotificationRepository$start$keptAlive$1(null), NodeForegroundServiceState.isForegroundFlow, HatchNodeServiceState.isForeground, HatchBackgroundSession.isActiveFlow);
            C60I c60iA03 = C3rb.A03(new AgentPermissionNotificationRepository$start$surface$1(null), AuraAppLifecycleManager.isAppInForegroundImmediateFlow, anonymousClass603A00);
            this.job = AnonymousClass001.A11(new C107551(companion, c60iA03, this, jCurrentTimeMillis, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String browserTaskSiteDomain(String str) {
        Object next;
        Iterator itA0z = C3cI.A0z(BrowserTaskRepository.Companion.getInstance(this.userSession).activeTasks);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            }
            next = itA0z.next();
            if (C7384Etj.areEqual(((BrowserTaskPresentation) next).browserTaskId, str)) {
                break;
            }
        }
        BrowserTaskPresentation browserTaskPresentationA0G = (BrowserTaskPresentation) next;
        if (browserTaskPresentationA0G != null || ((browserTaskPresentationA0G = C3cG.A0G(BrowserTaskPresentationStore.Companion.getInstance(this.userSession).currentTask)) != null && C7384Etj.areEqual(browserTaskPresentationA0G.browserTaskId, str))) {
            return browserTaskPresentationA0G.siteDomain;
        }
        return null;
    }

    private final String sideChatId(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
        String strResolveThreadId = ApprovalConversationIdentity.INSTANCE.resolveThreadId(agentPermissionApproval.threadId, str);
        if (strResolveThreadId == null || strResolveThreadId.equals(str)) {
            return null;
        }
        return strResolveThreadId;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.job = null;
        AgentApprovalNotifier.INSTANCE.cancelStale(C3cG.A06(), A3q.A00, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        AttentionNotifications.INSTANCE.forgetApprovalAlerts();
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public final AgentPermissionNotificationRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AgentPermissionNotificationRepository) abstractC3358CGz.A03(AgentPermissionNotificationRepository.class, new AgentPermissionNotificationRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AgentPermissionNotificationRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0x(C3cG.A0v());
        this.knownApprovalIds = A3q.A00;
    }

    public /* synthetic */ AgentPermissionNotificationRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
