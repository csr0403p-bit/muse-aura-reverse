package com.facebook.aura.commands.notifications;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFI;
import X.C06H;
import X.C0881AGi;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.commands.notifications.intf.NotificationListenerObserver;
import com.facebook.aura.startup.readiness.BackgroundReadyState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class NodeNotificationListenerService extends NotificationListenerService {
    public static final Companion Companion = new Companion();
    public static final long DEBOUNCE_MS = 500;
    public HoC connectJob;
    public volatile HatchNotificationFilterManager filterManager;
    public volatile HoC pendingPublish;
    public final C3UX scope = C78T.A00();
    public List<? extends NotificationListenerObserver> observers = C0881AGi.A00;

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NodeNotificationListenerService$maybePublish$1", f = "NodeNotificationListenerService.kt", l = {156, 158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NodeNotificationListenerService$maybePublish$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$session, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                CFK.A0A(NodeNotificationListenerServiceKt.TAG, FGI.A0M("publishNow failed: ", e.getMessage()), e);
            }
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(500L, this) == enumC10460Hji) {
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
            NotificationsDataSource notificationsDataSource = NotificationsDataSource.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$session;
            this.label = 2;
            if (notificationsDataSource.publishNow(abstractC3358CGz, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NodeNotificationListenerService$onListenerConnected$2", f = "NodeNotificationListenerService.kt", l = {73}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NodeNotificationListenerService$onListenerConnected$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.commands.notifications.NodeNotificationListenerService$onListenerConnected$2$2, reason: invalid class name and collision with other inner class name */
        public final class C00642 extends AbstractC7559F3s implements G0U<String, Unit> {
            public final /* synthetic */ NodeNotificationListenerService this$0;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                C7384Etj.A0Y(str, 0);
                this.this$0.cancelNotification(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00642(NodeNotificationListenerService nodeNotificationListenerService) {
                super(1);
                this.this$0 = nodeNotificationListenerService;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NodeNotificationListenerService.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NodeNotificationListenerService.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BackgroundReadyState backgroundReadyState = BackgroundReadyState.INSTANCE;
                this.label = 1;
                obj = backgroundReadyState.awaitReadyOrTimeout(30000L, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (!AnonymousClass001.A1X(obj)) {
                CFK.A06(NodeNotificationListenerServiceKt.TAG, "BackgroundReadyState not ready within timeout; proceeding best-effort");
            }
            final HatchNotificationFilterManager hatchNotificationFilterManager = new HatchNotificationFilterManager(AnonymousClass001.A0I(NodeNotificationListenerService.this));
            NodeNotificationListenerService.this.filterManager = hatchNotificationFilterManager;
            final NodeNotificationListenerService nodeNotificationListenerService = NodeNotificationListenerService.this;
            NotificationRepoHolder.repo = new NotificationRepoImpl(new NotificationRepoOps() { // from class: com.facebook.aura.commands.notifications.NodeNotificationListenerService.onListenerConnected.2.1
                @Override // com.facebook.aura.commands.notifications.NotificationRepoOps
                public final List<StatusBarNotification> getActiveNotifications() {
                    List<? extends StatusBarNotification> listA0G;
                    HatchNotificationFilterManager hatchNotificationFilterManager2 = hatchNotificationFilterManager;
                    StatusBarNotification[] activeNotifications = nodeNotificationListenerService.getActiveNotifications();
                    if (activeNotifications == null || (listA0G = BFI.A0G(activeNotifications)) == null) {
                        listA0G = C0881AGi.A00;
                    }
                    return hatchNotificationFilterManager2.filter(listA0G);
                }
            }, new C00642(nodeNotificationListenerService));
            NodeNotificationListenerService.this.maybePublish();
            return Unit.INSTANCE;
        }
    }

    private final void closeObservers() {
        Iterator<? extends NotificationListenerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.observers = C0881AGi.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybePublish() {
        AbstractC3358CGz currentSessionForWorkManagerWorker = AuraUserSessionStore.INSTANCE.getCurrentSessionForWorkManagerWorker();
        if (currentSessionForWorkManagerWorker != null) {
            HtJ htJA13 = AnonymousClass006.A13(this.pendingPublish);
            this.pendingPublish = AnonymousClass001.A11(new AnonymousClass1(currentSessionForWorkManagerWorker, htJA13), this.scope);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        closeObservers();
        Hxb.A03(null, this.scope);
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        closeObservers();
        this.observers = C60O.A11(0);
        HtJ htJA13 = AnonymousClass006.A13(this.connectJob);
        this.connectJob = AnonymousClass001.A11(new AnonymousClass2(htJA13), this.scope);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        HoC hoC = this.connectJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.connectJob = null;
        this.filterManager = null;
        closeObservers();
        NotificationRepoHolder.repo = null;
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        AbstractC3358CGz currentSessionForWorkManagerWorker;
        super.onNotificationPosted(statusBarNotification);
        if (statusBarNotification != null) {
            if (getApplicationContext().getPackageName().equals(statusBarNotification.getPackageName())) {
                return;
            }
            HatchNotificationFilterManager hatchNotificationFilterManager = this.filterManager;
            if (hatchNotificationFilterManager != null && hatchNotificationFilterManager.shouldBlock(statusBarNotification)) {
                statusBarNotification.getPackageName();
                return;
            }
            if (!this.observers.isEmpty() && this.filterManager != null && (currentSessionForWorkManagerWorker = AuraUserSessionStore.INSTANCE.getCurrentSessionForWorkManagerWorker()) != null) {
                Iterator<? extends NotificationListenerObserver> it = this.observers.iterator();
                while (it.hasNext()) {
                    it.next().onNotificationPosted(statusBarNotification, currentSessionForWorkManagerWorker);
                }
            }
            statusBarNotification.getPackageName();
            maybePublish();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        super.onNotificationRemoved(statusBarNotification);
        if (statusBarNotification != null) {
            if (getApplicationContext().getPackageName().equals(statusBarNotification.getPackageName())) {
                return;
            }
            Iterator<? extends NotificationListenerObserver> it = this.observers.iterator();
            while (it.hasNext()) {
                it.next().onNotificationRemoved(statusBarNotification);
            }
            HatchNotificationFilterManager hatchNotificationFilterManager = this.filterManager;
            if (hatchNotificationFilterManager == null || !hatchNotificationFilterManager.shouldBlock(statusBarNotification)) {
                statusBarNotification.getPackageName();
                maybePublish();
            }
        }
    }
}
