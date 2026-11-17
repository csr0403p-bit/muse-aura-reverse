package com.facebook.aura.startup.sessioninit;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.Hy1;
import android.content.Context;
import com.facebook.aura.agentpermission.AgentPermissionNotificationRepository;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.notification.model.HatchChatNotificationManager;
import com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler;
import com.facebook.aura.status.repo.ActivityDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchSessionInitRepo {
    public final C3UX scope = Hxb.A02(C78W.A02(new Hy1(AuraExecutors.INSTANCE.getBackgroundThreadExecutor()), new C8eO(null)));

    @DebugMetadata(c = "com.facebook.aura.startup.sessioninit.HatchSessionInitRepo$awaitGatewayAndRun$1", f = "HatchSessionInitRepo.kt", l = {59, 61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.sessioninit.HatchSessionInitRepo$awaitGatewayAndRun$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchSessionInitRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, HatchSessionInitRepo hatchSessionInitRepo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.this$0 = hatchSessionInitRepo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                e.getMessage();
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.$userSession);
                this.L$0 = null;
                this.label = 1;
                if (gateway.awaitConnected(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass002.A1X(AuraSessionManager.INSTANCE.getCurrentSession())) {
                HatchSessionInitRepo hatchSessionInitRepo = this.this$0;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.label = 2;
                if (hatchSessionInitRepo.onGatewayConnected(abstractC3358CGz, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void initialize(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (!AnonymousClass002.A1X(AuraSessionManager.INSTANCE.getCurrentSession())) {
            throw C3cG.A0Q("HatchSessionInitRepo.initialize() called without an authenticated session");
        }
        awaitGatewayAndRun(abstractC3358CGz);
    }

    private final void awaitGatewayAndRun(AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass001.A1J(new AnonymousClass1(abstractC3358CGz, this, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGatewayConnected(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Context contextA06 = C3cG.A06();
        HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz).start();
        AgentPermissionNotificationRepository.Companion.getInstance(abstractC3358CGz).start();
        HatchChatNotificationManager.Companion.getInstance(contextA06, abstractC3358CGz).initialize();
        HatchChatNotificationReconciler.Companion.getInstance(contextA06, abstractC3358CGz).start();
        Object objLoadActions = ActivityDataSource.Companion.getInstance(abstractC3358CGz).loadActions(15, false, false, htJ);
        return objLoadActions != EnumC10460Hji.A02 ? Unit.INSTANCE : objLoadActions;
    }
}
