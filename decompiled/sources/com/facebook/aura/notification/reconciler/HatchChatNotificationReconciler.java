package com.facebook.aura.notification.reconciler;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC10627Hzt;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C6ys;
import X.C79;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.notifications.push.AuraNotificationChannels;
import com.facebook.aura.notifications.push.ConversationNotificationState;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchChatNotificationReconciler implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final Context appContext;
    public volatile HoC job;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1", f = "HatchChatNotificationReconciler.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchThreadsRepository $repository;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1", f = "HatchChatNotificationReconciler.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchThreadsRepository $repository;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ HatchChatNotificationReconciler this$0;

            @DebugMetadata(c = "com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1", f = "HatchChatNotificationReconciler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ HatchThreadsRepository $repository;
                public int label;
                public final /* synthetic */ HatchChatNotificationReconciler this$0;

                /* renamed from: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements C20Z {
                    public final /* synthetic */ HatchThreadsRepository $repository;
                    public final /* synthetic */ HatchChatNotificationReconciler this$0;

                    public AnonymousClass2(HatchChatNotificationReconciler hatchChatNotificationReconciler, HatchThreadsRepository hatchThreadsRepository) {
                        this.this$0 = hatchChatNotificationReconciler;
                        this.$repository = hatchThreadsRepository;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj), (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(boolean r7, X.HtJ<? super kotlin.Unit> r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2$emit$1
                            if (r0 == 0) goto L42
                            r5 = r8
                            com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2$emit$1 r5 = (com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2$emit$1) r5
                            int r2 = r5.label
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r2 & r1
                            if (r0 == 0) goto L42
                            int r2 = r2 - r1
                            r5.label = r2
                        L12:
                            java.lang.Object r4 = r5.result
                            X.Hji r3 = X.EnumC10460Hji.A02
                            int r0 = r5.label
                            r2 = 1
                            if (r0 == 0) goto L2e
                            if (r0 != r2) goto L48
                            java.lang.Object r1 = r5.L$0
                            com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler r1 = (com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler) r1
                            X.Hwg.A00(r4)
                        L24:
                            java.util.Set r4 = (java.util.Set) r4
                            java.lang.String r0 = "foreground"
                            com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler.access$cancelReadThreadNotifications(r1, r4, r0)
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L2e:
                            X.Hwg.A00(r4)
                            com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler r1 = r6.this$0
                            com.facebook.aura.conversation.repo.HatchThreadsRepository r0 = r6.$repository
                            r5.L$0 = r1
                            r5.Z$0 = r7
                            r5.label = r2
                            java.lang.Object r4 = r0.fetchReadSessionIds(r5)
                            if (r4 != r3) goto L24
                            return r3
                        L42:
                            com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2$emit$1 r5 = new com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$1$2$emit$1
                            r5.<init>(r6, r8)
                            goto L12
                        L48:
                            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler.AnonymousClass1.C02521.C02531.AnonymousClass2.emit(boolean, X.HtJ):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02531(HatchChatNotificationReconciler hatchChatNotificationReconciler, HatchThreadsRepository hatchThreadsRepository, HtJ<? super C02531> htJ) {
                    super(2, htJ);
                    this.this$0 = hatchChatNotificationReconciler;
                    this.$repository = hatchThreadsRepository;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C02531(this.this$0, this.$repository, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchChatNotificationReconciler$start$1$1$1$invokeSuspend$$inlined$filter$1 hatchChatNotificationReconciler$start$1$1$1$invokeSuspend$$inlined$filter$1 = new HatchChatNotificationReconciler$start$1$1$1$invokeSuspend$$inlined$filter$1(AuraAppLifecycleManager.isAppInForegroundImmediateFlow);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$repository);
                        this.label = 1;
                        if (hatchChatNotificationReconciler$start$1$1$1$invokeSuspend$$inlined$filter$1.collect(anonymousClass2, this) == enumC10460Hji) {
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
                    return ((C02531) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @DebugMetadata(c = "com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$2", f = "HatchChatNotificationReconciler.kt", l = {54}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler$start$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ HatchThreadsRepository $repository;
                public int label;
                public final /* synthetic */ HatchChatNotificationReconciler this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(HatchThreadsRepository hatchThreadsRepository, HatchChatNotificationReconciler hatchChatNotificationReconciler, HtJ<? super AnonymousClass2> htJ) {
                    super(2, htJ);
                    this.$repository = hatchThreadsRepository;
                    this.this$0 = hatchChatNotificationReconciler;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass2(this.$repository, this.this$0, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        C1BN<AHD<HatchSessionItem>> c1bnSessions = this.$repository.sessions(ThreadsView.ACTIVE);
                        final HatchChatNotificationReconciler hatchChatNotificationReconciler = this.this$0;
                        C20Z<? super AHD<HatchSessionItem>> c20z = new C20Z() { // from class: com.facebook.aura.notification.reconciler.HatchChatNotificationReconciler.start.1.1.2.1
                            @Override // X.C20Z
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                                return emit((AHD<HatchSessionItem>) obj2, (HtJ<? super Unit>) htJ);
                            }

                            public final Object emit(AHD<HatchSessionItem> ahd, HtJ<? super Unit> htJ) {
                                HatchChatNotificationReconciler hatchChatNotificationReconciler2 = hatchChatNotificationReconciler;
                                ArrayList arrayListA0h = C3cG.A0h();
                                for (Object obj2 : ahd) {
                                    if (((HatchSessionItem) obj2).unreadCount == 0) {
                                        arrayListA0h.add(obj2);
                                    }
                                }
                                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                                Iterator it = arrayListA0h.iterator();
                                while (it.hasNext()) {
                                    linkedHashSetA0k.add(((HatchSessionItem) it.next()).sessionId);
                                }
                                hatchChatNotificationReconciler2.cancelReadThreadNotifications(linkedHashSetA0k, HatchChatNotificationReconcilerKt.TRIGGER_THREADS_LIST);
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (c1bnSessions.collect(c20z, this) == enumC10460Hji) {
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
                    return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02521(HatchChatNotificationReconciler hatchChatNotificationReconciler, HatchThreadsRepository hatchThreadsRepository, HtJ<? super C02521> htJ) {
                super(2, htJ);
                this.this$0 = hatchChatNotificationReconciler;
                this.$repository = hatchThreadsRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02521 c02521 = new C02521(this.this$0, this.$repository, htJ);
                c02521.L$0 = obj;
                return c02521;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C3UX c3ux = (C3UX) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C02531 c02531 = new C02531(this.this$0, this.$repository, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                GAo.A02(num, c6ys, c02531, c3ux);
                GAo.A02(num, c6ys, new AnonymousClass2(this.$repository, this.this$0, null), c3ux);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C02521) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = hatchThreadsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchChatNotificationReconciler.this.new AnonymousClass1(this.$repository, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C02521 c02521 = new C02521(HatchChatNotificationReconciler.this, this.$repository, null);
                this.label = 1;
                if (AbstractC10627Hzt.A00(c02521, this) == enumC10460Hji) {
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

    public final class Companion {
        public final HatchChatNotificationReconciler getInstance(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            return (HatchChatNotificationReconciler) abstractC3358CGz.A03(HatchChatNotificationReconciler.class, new HatchChatNotificationReconciler$Companion$getInstance$1(context, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.job = null;
        Hxb.A03(null, this.scope);
    }

    public final void start() {
        HoC hoC = this.job;
        if (hoC == null || !hoC.isActive()) {
            HatchThreadsRepository companion = HatchThreadsRepository.Companion.getInstance(this.userSession);
            this.job = AnonymousClass001.A11(new AnonymousClass1(companion, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelReadThreadNotifications(Set<String> set, String str) {
        Object objA0s;
        if (set.isEmpty()) {
            CFK.A03(str, HatchChatNotificationReconcilerKt.TAG, "reconcile(%s): server reported no read threads");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.appContext.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            try {
                objA0s = notificationManager.getActiveNotifications();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objA0s;
            int i = 0;
            if (statusBarNotificationArr == null) {
                CFK.A0H(HatchChatNotificationReconcilerKt.TAG, "reconcile(%s): could not read active notifications", str);
                return;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                if (AuraNotificationChannels.CONVERSATIONS.equals(statusBarNotification.getNotification().getChannelId())) {
                    arrayListA0h.add(statusBarNotification);
                }
            }
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                linkedHashSetA0k.add(Integer.valueOf(((StatusBarNotification) it.next()).getId()));
            }
            ConversationNotificationState companion = ConversationNotificationState.Companion.getInstance(this.userSession);
            for (String str2 : set) {
                int iChatNotificationId = HatchChatNotificationIds.INSTANCE.chatNotificationId(str2);
                if (linkedHashSetA0k.contains(Integer.valueOf(iChatNotificationId))) {
                    notificationManager.cancel(iChatNotificationId);
                    companion.clear(str2);
                    i++;
                }
            }
            CFK.A00(str, Integer.valueOf(set.size()), Integer.valueOf(linkedHashSetA0k.size()), Integer.valueOf(i), HatchChatNotificationReconcilerKt.TAG, "reconcile(%s): readThreads=%d posted=%d cancelled=%d");
        }
    }

    public /* synthetic */ HatchChatNotificationReconciler(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }

    public HatchChatNotificationReconciler(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0x(C3cG.A0v());
    }
}
