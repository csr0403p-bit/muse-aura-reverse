package com.facebook.aura.status.repo;

import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.json.HatchEnvelopeMissingResultException;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.model.HatchTaskEntry;
import com.facebook.aura.model.HatchTaskRunEntry;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class TasksDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<TasksData> _data;
    public final C1BN<TasksData> data;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.status.repo.TasksDataSource$fetchRuns$2", f = "TasksDataSource.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.TasksDataSource$fetchRuns$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchTaskRunEntry>>, Object> {
        public final /* synthetic */ String $jobId;
        public final /* synthetic */ int $limit;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$limit = i;
            this.$jobId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksDataSource.this.new AnonymousClass2(this.$limit, this.$jobId, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchTaskRunEntry>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchTaskRunEntry>>) htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.Hji] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            Object objA0i = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                int i2 = this.$limit;
                String str = this.$jobId;
                AII aiiA17 = AIM.A17();
                AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_LIMIT, C3cG.A0R(i2), aiiA17);
                if (str != null) {
                    AnonymousClass002.A1J("job_id", str, aiiA17);
                }
                HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                JarvisPath.TasksRuns tasksRuns = JarvisPath.TasksRuns.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = TasksDataSource.this.userSession;
                HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                TasksDataSource$fetchRuns$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 tasksDataSource$fetchRuns$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = TasksDataSource$fetchRuns$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(tasksDataSource$fetchRuns$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, tasksRuns, requestType, abstractC3358CGz, null, hxEArr2, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY != objA0i) {
                }
                return objA0i;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 == null) {
                List<TaskRunResponseEntry> list = ((TaskRunsResponsePayload) objM1595executeBodylessJarvisRequestWithp3iPjrY).runs;
                if (list != null) {
                    objA0i = AnonymousClass003.A0i(list);
                    Iterator<TaskRunResponseEntry> it = list.iterator();
                    while (it.hasNext()) {
                        objA0i.add(it.next().toModel());
                    }
                    return objA0i;
                }
            } else if (!(thA00 instanceof HatchEnvelopeMissingResultException)) {
                return null;
            }
            return C0881AGi.A00;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchTaskRunEntry>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.TasksDataSource$fetchTasks$2", f = "TasksDataSource.kt", l = {201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.TasksDataSource$fetchTasks$2, reason: invalid class name and case insensitive filesystem */
    public final class C140252 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchTaskEntry>>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public C140252(HtJ<? super C140252> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksDataSource.this.new C140252(htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchTaskEntry>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchTaskEntry>>) htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.Hji] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            Object objA0i = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                TasksDataSource$fetchTasks$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 tasksDataSource$fetchTasks$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = TasksDataSource$fetchTasks$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(tasksDataSource$fetchTasks$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.Tasks.INSTANCE, RequestType.GET, TasksDataSource.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY != objA0i) {
                }
                return objA0i;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 == null) {
                List<TaskResponseEntry> list = ((TasksResponsePayload) objM1595executeBodylessJarvisRequestWithp3iPjrY).schedules;
                if (list != null) {
                    objA0i = AnonymousClass003.A0i(list);
                    Iterator<TaskResponseEntry> it = list.iterator();
                    while (it.hasNext()) {
                        objA0i.add(it.next().toModel());
                    }
                    return objA0i;
                }
            } else if (!(thA00 instanceof HatchEnvelopeMissingResultException)) {
                return null;
            }
            return C0881AGi.A00;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchTaskEntry>> htJ) {
            return TasksDataSource.this.new C140252(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.TasksDataSource", f = "TasksDataSource.kt", l = {73, 74}, m = "loadTasks", v = 2)
    /* renamed from: com.facebook.aura.status.repo.TasksDataSource$loadTasks$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
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
            return TasksDataSource.this.loadTasks(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.TasksDataSource$removeTask$2", f = "TasksDataSource.kt", l = {201, 117, 125}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.TasksDataSource$removeTask$2, reason: invalid class name and case insensitive filesystem */
    public final class C140262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super TaskRemovalResult>, Object> {
        public final /* synthetic */ String $id;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public final /* synthetic */ TasksDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140262(String str, TasksDataSource tasksDataSource, HtJ<? super C140262> htJ) {
            super(2, htJ);
            this.$id = str;
            this.this$0 = tasksDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140262(this.$id, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                TasksDataSource$removeTask$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 tasksDataSource$removeTask$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = TasksDataSource$removeTask$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(tasksDataSource$removeTask$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, true, new JarvisPath.Task(this.$id), RequestType.DELETE, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return TaskRemovalResult.SUCCESS;
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            TasksDataSource tasksDataSource = this.this$0;
            Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
            if (thA00 != null) {
                if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null) {
                    int iIntValue = C3cG.A0R(networkException.httpResponseCode).intValue();
                    if (iIntValue == 403) {
                        return TaskRemovalResult.FORBIDDEN;
                    }
                    if (iIntValue == 404) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 3;
                    }
                }
                return TaskRemovalResult.FAILED;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 2;
            if (tasksDataSource.loadTasks(true, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return TaskRemovalResult.SUCCESS;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super TaskRemovalResult> htJ) {
            return ((C140262) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.TasksDataSource$setupTasksSubscription$1", f = "TasksDataSource.kt", l = {170}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.repo.TasksDataSource$setupTasksSubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C140271 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ TasksDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140271(HatchGatewayConnection hatchGatewayConnection, TasksDataSource tasksDataSource, HtJ<? super C140271> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = tasksDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140271(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Unit> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().tasksUpdateEvents;
                final TasksDataSource tasksDataSource = this.this$0;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.status.repo.TasksDataSource.setupTasksSubscription.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(tasksDataSource.loadTasks(true, htJ));
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
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
            return ((C140271) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ Object loadRuns$default(TasksDataSource tasksDataSource, String str, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return tasksDataSource.fetchRuns(str, i, htJ);
    }

    private final void setupTasksSubscription() {
        try {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
            AnonymousClass001.A1J(new C140271(gateway, this, null), this.scope);
        } catch (Exception e) {
            CFK.A06(TasksDataSourceKt.TAG, FGI.A0M("Failed to setup tasks subscription: ", e.getMessage()));
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        BLG<TasksData> blg = this._data;
        C0881AGi c0881AGi = C0881AGi.A00;
        AnonymousClass001.A1E(blg, null, new TasksData(c0881AGi, c0881AGi, false));
    }

    public final C1BN<TasksData> getData() {
        return this.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadTasks(boolean r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.status.repo.TasksDataSource.AnonymousClass1
            if (r0 == 0) goto L8b
            r8 = r13
            com.facebook.aura.status.repo.TasksDataSource$loadTasks$1 r8 = (com.facebook.aura.status.repo.TasksDataSource.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r10 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L4c
            if (r0 == r5) goto L73
            if (r0 != r7) goto L91
            java.lang.Object r6 = r8.L$0
            java.util.List r6 = (java.util.List) r6
            X.Hwg.A00(r10)
        L27:
            java.util.List r10 = (java.util.List) r10
            X.BLG<com.facebook.aura.status.repo.TasksData> r5 = r11._data
        L2b:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            com.facebook.aura.status.repo.TasksData r3 = (com.facebook.aura.status.repo.TasksData) r3
            if (r6 != 0) goto L4a
            java.util.List<com.facebook.aura.model.HatchTaskEntry> r2 = r3.tasks
        L36:
            if (r10 != 0) goto L48
            java.util.List<com.facebook.aura.model.HatchTaskRunEntry> r1 = r3.runs
        L3a:
            r0 = 0
            com.facebook.aura.status.repo.TasksData r0 = r3.copy(r2, r1, r0)
            boolean r0 = r5.A6e(r4, r0)
            if (r0 == 0) goto L2b
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L48:
            r1 = r10
            goto L3a
        L4a:
            r2 = r6
            goto L36
        L4c:
            X.Hwg.A00(r10)
            if (r12 != 0) goto L68
            X.BLG<com.facebook.aura.status.repo.TasksData> r4 = r11._data
        L53:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            com.facebook.aura.status.repo.TasksData r2 = (com.facebook.aura.status.repo.TasksData) r2
            java.util.List<com.facebook.aura.model.HatchTaskEntry> r1 = r2.tasks
            java.util.List<com.facebook.aura.model.HatchTaskRunEntry> r0 = r2.runs
            com.facebook.aura.status.repo.TasksData r0 = r2.copy(r1, r0, r5)
            boolean r0 = r4.A6e(r3, r0)
            if (r0 == 0) goto L53
        L68:
            r8.Z$0 = r12
            r8.label = r5
            java.lang.Object r10 = r11.fetchTasks(r8)
            if (r10 != r9) goto L78
            return r9
        L73:
            boolean r12 = r8.Z$0
            X.Hwg.A00(r10)
        L78:
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            r8.L$0 = r6
            r8.Z$0 = r12
            r8.label = r7
            r1 = 0
            r0 = 100
            java.lang.Object r10 = r11.fetchRuns(r1, r0, r8)
            if (r10 != r9) goto L27
            return r9
        L8b:
            com.facebook.aura.status.repo.TasksDataSource$loadTasks$1 r8 = new com.facebook.aura.status.repo.TasksDataSource$loadTasks$1
            r8.<init>(r13)
            goto L12
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.TasksDataSource.loadTasks(boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final TasksDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (TasksDataSource) abstractC3358CGz.A03(TasksDataSource.class, new TasksDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TasksDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0x(AnonymousClass001.A0y());
        C0881AGi c0881AGi = C0881AGi.A00;
        C9286GCn c9286GCnA14 = C3cG.A14(new TasksData(c0881AGi, c0881AGi, false));
        this._data = c9286GCnA14;
        this.data = C3cG.A11(c9286GCnA14);
        setupTasksSubscription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchRuns(String str, int i, HtJ<? super List<HatchTaskRunEntry>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(i, str, null));
    }

    public static /* synthetic */ Object fetchRuns$default(TasksDataSource tasksDataSource, String str, int i, HtJ htJ, int i2, Object obj) {
        String strA0r = AnonymousClass006.A0r(i2, str);
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return tasksDataSource.fetchRuns(strA0r, i, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchTasks(HtJ<? super List<HatchTaskEntry>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C140252(null));
    }

    public final Object loadRuns(String str, int i, HtJ<? super List<HatchTaskRunEntry>> htJ) {
        return fetchRuns(str, i, htJ);
    }

    public final Object removeTask(String str, HtJ<? super TaskRemovalResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C140262(str, this, null));
    }

    public /* synthetic */ TasksDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
