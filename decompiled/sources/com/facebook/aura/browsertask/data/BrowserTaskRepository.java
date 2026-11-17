package com.facebook.aura.browsertask.data;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BGK;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Ek;
import X.C3UX;
import X.C3b6;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationData;
import com.facebook.aura.model.BrowserTaskScreenshot;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserTaskRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<List<BrowserTaskPresentation>> _activeTasks;
    public final BLG<String> _presentedTaskId;
    public final BLG<Set<String>> _previewRevokedTaskIds;
    public final BLG<BrowserTaskPresentation> _terminalTask;
    public final C1BN<List<BrowserTaskPresentation>> activeTasks;
    public final C1BN<BrowserTaskPresentation> currentTask;
    public final Set<String> dismissedTaskIds;
    public volatile HoC observationJob;
    public final HatchGatewayPrefsStore prefsStore;
    public final C1BN<String> presentedTaskId;
    public final C1BN<Set<String>> previewRevokedTaskIds;
    public final C3UX scope;
    public final Object stateLock;
    public final C1BN<BrowserTaskPresentation> terminalTask;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        public final BrowserTaskRepository getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (BrowserTaskRepository) abstractC3358CGz.A03(BrowserTaskRepository.class, new Function0() { // from class: com.facebook.aura.browsertask.data.BrowserTaskRepository$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new BrowserTaskRepository(abstractC3358CGz);
                }
            });
        }

        public static final BrowserTaskRepository getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new BrowserTaskRepository(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository$presentationUpdates$1", f = "BrowserTaskRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.data.BrowserTaskRepository$presentationUpdates$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<List<? extends BrowserTaskPresentation>, BrowserTaskPresentation, HtJ<? super BrowserTaskPresentation>, Object> {
        public final /* synthetic */ String $taskId;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
            this.$taskId = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<BrowserTaskPresentation> list, BrowserTaskPresentation browserTaskPresentation, HtJ<? super BrowserTaskPresentation> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$taskId, htJ);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = browserTaskPresentation;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (browserTaskPresentation != null) {
                if (C7384Etj.areEqual(browserTaskPresentation.browserTaskId, this.$taskId)) {
                    return browserTaskPresentation;
                }
            }
            String str = this.$taskId;
            for (Object obj2 : list) {
                if (C7384Etj.areEqual(((BrowserTaskPresentation) obj2).browserTaskId, str)) {
                    return obj2;
                }
            }
            return null;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(List<? extends BrowserTaskPresentation> list, BrowserTaskPresentation browserTaskPresentation, HtJ<? super BrowserTaskPresentation> htJ) {
            return invoke2((List<BrowserTaskPresentation>) list, browserTaskPresentation, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository", f = "BrowserTaskRepository.kt", l = {154}, m = "seedFromHistory", v = 2)
    /* renamed from: com.facebook.aura.browsertask.data.BrowserTaskRepository$seedFromHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C109941 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C109941(HtJ<? super C109941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserTaskRepository.this.seedFromHistory(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1", f = "BrowserTaskRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C109951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1$1", f = "BrowserTaskRepository.kt", l = {103}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00511 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public int label;
            public final /* synthetic */ BrowserTaskRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00511(BrowserTaskRepository browserTaskRepository, HatchGatewayConnection hatchGatewayConnection, HtJ<? super C00511> htJ) {
                super(2, htJ);
                this.this$0 = browserTaskRepository;
                this.$gateway = hatchGatewayConnection;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00511(this.this$0, this.$gateway, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        BrowserTaskRepository browserTaskRepository = this.this$0;
                        HatchGatewayConnection hatchGatewayConnection = this.$gateway;
                        this.label = 1;
                        if (browserTaskRepository.seedFromHistory(hatchGatewayConnection, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A(BrowserTaskRepositoryKt.TAG, "seedFromHistory failed", e2);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C00511) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1$2", f = "BrowserTaskRepository.kt", l = {116}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.browsertask.data.BrowserTaskRepository$start$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public int label;
            public final /* synthetic */ BrowserTaskRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, BrowserTaskRepository browserTaskRepository, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$gateway = hatchGatewayConnection;
                this.this$0 = browserTaskRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$gateway, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        BrowserTaskRepository$start$1$2$invokeSuspend$$inlined$filter$1 browserTaskRepository$start$1$2$invokeSuspend$$inlined$filter$1 = new BrowserTaskRepository$start$1$2$invokeSuspend$$inlined$filter$1(new BrowserTaskRepository$start$1$2$invokeSuspend$$inlined$filterIsInstance$1(this.$gateway.getChatEvents()));
                        final BrowserTaskRepository browserTaskRepository = this.this$0;
                        C20Z<? super HatchChatEvent.Presentation> c20z = new C20Z() { // from class: com.facebook.aura.browsertask.data.BrowserTaskRepository.start.1.2.2
                            @Override // X.C20Z
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                                return emit((HatchChatEvent.Presentation) obj2, (HtJ<? super Unit>) htJ);
                            }

                            public final Object emit(HatchChatEvent.Presentation presentation, HtJ<? super Unit> htJ) {
                                BrowserTaskPresentationData browserTaskPresentationData;
                                BrowserTaskPresentation browserTaskPresentation;
                                HatchPresentationData hatchPresentationData = presentation.presentation.data;
                                if ((hatchPresentationData instanceof BrowserTaskPresentationData) && (browserTaskPresentationData = (BrowserTaskPresentationData) hatchPresentationData) != null && (browserTaskPresentation = browserTaskPresentationData.browserTask) != null) {
                                    browserTaskRepository.upsertTask(browserTaskPresentation);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (browserTaskRepository$start$1$2$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A(BrowserTaskRepositoryKt.TAG, "browser_task discovery collector failed", e2);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109951(HatchGatewayConnection hatchGatewayConnection, HtJ<? super C109951> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C109951 c109951 = BrowserTaskRepository.this.new C109951(this.$gateway, htJ);
            c109951.L$0 = obj;
            return c109951;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C00511 c00511 = new C00511(BrowserTaskRepository.this, this.$gateway, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, c00511, c3ux);
            GAo.A02(num, c6ys, new AnonymousClass2(this.$gateway, BrowserTaskRepository.this, null), c3ux);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109951) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final C3b6 seedFromHistory$lambda$0(HatchMessage hatchMessage) {
        C7384Etj.A0Y(hatchMessage, 0);
        Iterable iterable = hatchMessage.presentations;
        if (iterable == null) {
            iterable = C0881AGi.A00;
        }
        return AbstractC0878AGe.A06(iterable);
    }

    public static final boolean seedFromHistory$lambda$1(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        return HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK.equals(hatchWidgetPresentation.kind);
    }

    public static final HxE seedFromHistory$lambda$2(HatchWidgetPresentation hatchWidgetPresentation) {
        BrowserTaskPresentationData browserTaskPresentationData;
        BrowserTaskPresentation browserTaskPresentation;
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
        if (!(hatchPresentationData instanceof BrowserTaskPresentationData) || (browserTaskPresentationData = (BrowserTaskPresentationData) hatchPresentationData) == null || (browserTaskPresentation = browserTaskPresentationData.browserTask) == null) {
            return null;
        }
        return C3cG.A0r(hatchWidgetPresentation.seq, browserTaskPresentation);
    }

    public final void dismiss(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 0) {
            synchronized (this.stateLock) {
                BrowserTaskPresentation value = this._terminalTask.getValue();
                if (strA0l.equals(value != null ? value.browserTaskId : null)) {
                    this._terminalTask.Af8(null);
                }
                dismissTaskLocked(strA0l);
            }
        }
    }

    public final void restore(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.stateLock) {
            if (this.dismissedTaskIds.remove(str)) {
                this.prefsStore.setDismissedBrowserTaskIds(AbstractC0878AGe.A0g(this.dismissedTaskIds));
            }
            BLG<Set<String>> blg = this._previewRevokedTaskIds;
            blg.Af8(BGK.A04(str, blg.getValue()));
        }
    }

    public final void revokePreview(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 0) {
            synchronized (this.stateLock) {
                if (AnonymousClass006.A1a(strA0l, this._previewRevokedTaskIds)) {
                    return;
                }
                BLG<Set<String>> blg = this._previewRevokedTaskIds;
                blg.Af8(BGK.A02(strA0l, blg.getValue()));
                CFK.A06(BrowserTaskRepositoryKt.TAG, "browser task preview revoked");
            }
        }
    }

    private final void dismissTaskLocked(String str) {
        List<BrowserTaskPresentation> value;
        ArrayList arrayListA0h;
        this.dismissedTaskIds.add(str);
        this.prefsStore.setDismissedBrowserTaskIds(AbstractC0878AGe.A0g(this.dismissedTaskIds));
        BLG<List<BrowserTaskPresentation>> blg = this._activeTasks;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (BrowserTaskPresentation browserTaskPresentation : value) {
                AnonymousClass006.A1O(browserTaskPresentation.browserTaskId, str, browserTaskPresentation, arrayListA0h);
            }
        } while (!blg.A6e(value, arrayListA0h));
        if (C7384Etj.areEqual(this._presentedTaskId.getValue(), str)) {
            this._presentedTaskId.Af8(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object seedFromHistory(com.facebook.aura.gateway.HatchGatewayConnection r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.browsertask.data.BrowserTaskRepository.C109941
            if (r0 == 0) goto L7e
            r4 = r8
            com.facebook.aura.browsertask.data.BrowserTaskRepository$seedFromHistory$1 r4 = (com.facebook.aura.browsertask.data.BrowserTaskRepository.C109941) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L5d
            if (r0 != r1) goto Lc4
            X.Hwg.A00(r2)
        L20:
            boolean r0 = r2 instanceof com.facebook.aura.conversation.data.ChatHistoryFetchSuccess
            if (r0 == 0) goto Lc9
            com.facebook.aura.conversation.data.ChatHistoryFetchSuccess r2 = (com.facebook.aura.conversation.data.ChatHistoryFetchSuccess) r2
            if (r2 == 0) goto Lc9
            com.facebook.aura.conversation.data.ChatHistoryResult r0 = r2.result
            if (r0 == 0) goto Lc9
            java.util.List<com.facebook.aura.model.HatchMessage> r0 = r0.history
            X.8iN r1 = X.AbstractC0878AGe.A06(r0)
            com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda0 r0 = new com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda0
            r0.<init>()
            X.AGX r1 = X.A6B.A05(r0, r1)
            com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda1 r0 = new com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda1
            r0.<init>()
            X.B3i r1 = X.A6B.A03(r0, r1)
            com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda2 r0 = new com.facebook.aura.browsertask.data.BrowserTaskRepository$$ExternalSyntheticLambda2
            r0.<init>()
            X.B3i r1 = X.A6B.A04(r0, r1)
            java.util.Set<java.lang.String> r0 = r6.dismissedTaskIds
            java.util.List r1 = com.facebook.aura.browsertask.data.BrowserTaskStateKt.selectActiveBrowserTasksFromHistory(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc9
            java.lang.Object r5 = r6.stateLock
            monitor-enter(r5)
            goto L84
        L5d:
            X.Hwg.A00(r2)
            X.BLG<java.util.List<com.facebook.aura.model.BrowserTaskPresentation>> r0 = r6._activeTasks
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.C3cG.A1N(r0)
            if (r0 == 0) goto Lc9
            r2 = 0
            r4.L$0 = r2
            r4.label = r1
            r1 = 50
            com.facebook.aura.gateway.HatchGatewayEventsHandler r0 = r7.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
            java.lang.Object r2 = r0.fetchChatHistory(r1, r2, r2, r4)
            if (r2 != r3) goto L20
            return r3
        L7e:
            com.facebook.aura.browsertask.data.BrowserTaskRepository$seedFromHistory$1 r4 = new com.facebook.aura.browsertask.data.BrowserTaskRepository$seedFromHistory$1
            r4.<init>(r8)
            goto L12
        L84:
            java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> Lc1
        L8c:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto La7
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lc1
            r0 = r2
            com.facebook.aura.model.BrowserTaskPresentation r0 = (com.facebook.aura.model.BrowserTaskPresentation) r0     // Catch: java.lang.Throwable -> Lc1
            java.util.Set<java.lang.String> r1 = r6.dismissedTaskIds     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r0.browserTaskId     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L8c
            r4.add(r2)     // Catch: java.lang.Throwable -> Lc1
            goto L8c
        La7:
            X.BLG<java.util.List<com.facebook.aura.model.BrowserTaskPresentation>> r3 = r6._activeTasks     // Catch: java.lang.Throwable -> Lc1
        La9:
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> Lc1
            r1 = r2
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb7
            r1 = r4
        Lb7:
            boolean r0 = r3.A6e(r2, r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto La9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r5)
            return r0
        Lc1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        Lc4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.data.BrowserTaskRepository.seedFromHistory(com.facebook.aura.gateway.HatchGatewayConnection, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upsertTask(BrowserTaskPresentation browserTaskPresentation) {
        synchronized (this.stateLock) {
            if (!this.dismissedTaskIds.contains(browserTaskPresentation.browserTaskId)) {
                int i = BrowserTaskRepositoryState.$stable;
                BrowserTaskRepositoryState browserTaskRepositoryStateReduceBrowserTaskUpdate = BrowserTaskStateKt.reduceBrowserTaskUpdate(new BrowserTaskRepositoryState(this._activeTasks.getValue(), this._presentedTaskId.getValue(), this._terminalTask.getValue()), browserTaskPresentation);
                this._presentedTaskId.Af8(browserTaskRepositoryStateReduceBrowserTaskUpdate.presentedTaskId);
                this._terminalTask.Af8(browserTaskRepositoryStateReduceBrowserTaskUpdate.terminalTask);
                this._activeTasks.Af8(browserTaskRepositoryStateReduceBrowserTaskUpdate.activeTasks);
            }
        }
    }

    public final void clearTerminalTask() {
        synchronized (this.stateLock) {
            BrowserTaskPresentation value = this._terminalTask.getValue();
            String str = value != null ? value.browserTaskId : null;
            this._terminalTask.Af8(null);
            if (str != null && C7384Etj.areEqual(this._presentedTaskId.getValue(), str)) {
                this._presentedTaskId.Af8(null);
            }
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HoC hoCA15 = C3cI.A15(this.observationJob);
        this.observationJob = hoCA15;
        synchronized (this.stateLock) {
            this._activeTasks.Af8(C0881AGi.A00);
            this._presentedTaskId.Af8(hoCA15);
            this._terminalTask.Af8(hoCA15);
            this._previewRevokedTaskIds.Af8(A3q.A00);
        }
    }

    public final void focusTask(BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskPresentation browserTaskPresentationCopy$default = browserTaskPresentation;
        C7384Etj.A0Y(browserTaskPresentationCopy$default, 0);
        String strA0l = AnonymousClass002.A0l(browserTaskPresentationCopy$default.browserTaskId);
        if (strA0l.length() > 0) {
            if (!strA0l.equals(browserTaskPresentationCopy$default.browserTaskId)) {
                browserTaskPresentationCopy$default = BrowserTaskPresentation.copy$default(browserTaskPresentationCopy$default, strA0l, null, null, null, null, 0, null, false, 0, null, null, null, null, false, null, null, null, null, 262142, null);
            }
            synchronized (this.stateLock) {
                if (this.dismissedTaskIds.remove(strA0l)) {
                    this.prefsStore.setDismissedBrowserTaskIds(AbstractC0878AGe.A0g(this.dismissedTaskIds));
                }
                int i = BrowserTaskRepositoryState.$stable;
                BrowserTaskRepositoryState browserTaskRepositoryStateFocusBrowserTask = BrowserTaskStateKt.focusBrowserTask(new BrowserTaskRepositoryState(this._activeTasks.getValue(), this._presentedTaskId.getValue(), this._terminalTask.getValue()), browserTaskPresentationCopy$default);
                this._terminalTask.Af8(browserTaskRepositoryStateFocusBrowserTask.terminalTask);
                this._activeTasks.Af8(browserTaskRepositoryStateFocusBrowserTask.activeTasks);
                this._presentedTaskId.Af8(browserTaskRepositoryStateFocusBrowserTask.presentedTaskId);
            }
        }
    }

    public final C1BN<List<BrowserTaskPresentation>> getActiveTasks() {
        return this.activeTasks;
    }

    public final C1BN<BrowserTaskPresentation> getCurrentTask() {
        return this.currentTask;
    }

    public final C1BN<String> getPresentedTaskId() {
        return this.presentedTaskId;
    }

    public final C1BN<Set<String>> getPreviewRevokedTaskIds() {
        return this.previewRevokedTaskIds;
    }

    public final C1BN<BrowserTaskPresentation> getTerminalTask() {
        return this.terminalTask;
    }

    public final BrowserTaskPresentation presentation(String str) {
        BrowserTaskPresentation value = this._terminalTask.getValue();
        Object obj = null;
        if (value != null && C7384Etj.areEqual(value.browserTaskId, str)) {
            return value;
        }
        Iterator<T> it = this._activeTasks.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C7384Etj.areEqual(((BrowserTaskPresentation) next).browserTaskId, str)) {
                obj = next;
                break;
            }
        }
        return (BrowserTaskPresentation) obj;
    }

    public final C20Q<BrowserTaskPresentation> presentationUpdates(String str) {
        return C3rb.A03(new AnonymousClass1(str, null), this._activeTasks, this._terminalTask);
    }

    public final void start() {
        HoC hoC = this.observationJob;
        if (hoC == null || !hoC.isActive()) {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
            this.observationJob = AnonymousClass001.A11(new C109951(gateway, null), this.scope);
        }
    }

    public BrowserTaskRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA0x = C3cH.A0x(C3cG.A0v());
        this.scope = hzCA0x;
        this.stateLock = C3cG.A0T();
        C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
        this._activeTasks = c9286GCnA01;
        this.activeTasks = C3cG.A11(c9286GCnA01);
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._presentedTaskId = c9286GCnA14;
        this.presentedTaskId = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this._terminalTask = c9286GCnA142;
        this.terminalTask = C3cG.A11(c9286GCnA142);
        this.currentTask = AnonymousClass441.A00(null, hzCA0x, C3rb.A03(new BrowserTaskRepository$currentTask$1(null), c9286GCnA01, c9286GCnA14), C3Ek.A00);
        C9286GCn c9286GCnA012 = HnJ.A01(A3q.A00);
        this._previewRevokedTaskIds = c9286GCnA012;
        this.previewRevokedTaskIds = C3cG.A11(c9286GCnA012);
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGz);
        this.prefsStore = hatchGatewayPrefsStoreA0D;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.addAll(hatchGatewayPrefsStoreA0D.getDismissedBrowserTaskIds());
        this.dismissedTaskIds = keySetViewNewKeySet;
    }

    public /* synthetic */ BrowserTaskRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void dismiss() {
        String str;
        synchronized (this.stateLock) {
            this._terminalTask.Af8(null);
            BrowserTaskPresentation browserTaskPresentationSelectCurrentBrowserTask = BrowserTaskStateKt.selectCurrentBrowserTask(this._activeTasks.getValue(), this._presentedTaskId.getValue());
            if (browserTaskPresentationSelectCurrentBrowserTask != null && (str = browserTaskPresentationSelectCurrentBrowserTask.browserTaskId) != null) {
                dismissTaskLocked(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void focusTask(String str) {
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 0) {
            Object[] objArr4 = objArr3 == true ? 1 : 0;
            Object[] objArr5 = objArr2 == true ? 1 : 0;
            Object[] objArr6 = objArr == true ? 1 : 0;
            focusTask(new BrowserTaskPresentation(strA0l, (String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i, (Integer) (0 == true ? 1 : 0), (boolean) objArr4, (int) objArr5, (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (BrowserTaskScreenshot) (0 == true ? 1 : 0), (boolean) objArr6, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (BrowserTaskExecution) (0 == true ? 1 : 0), 262142, (C06H) (0 == true ? 1 : 0)));
        }
    }
}
