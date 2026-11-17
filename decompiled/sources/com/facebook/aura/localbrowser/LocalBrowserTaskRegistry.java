package com.facebook.aura.localbrowser;

import X.A64;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pU;
import X.C4oT;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9258GBl;
import X.C9sU;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.localbrowser.LocalBrowserTelemetry;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskExecutionKind;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationData;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserTaskRegistry implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String KEY = "local_browser_owned_tasks";
    public static final int MAX_RECORDS = 128;
    public static final String TAG = "LocalBrowserTaskRegistry";
    public boolean cleared;
    public final String deviceId;
    public final Object lock;
    public final BLG<List<LocalBrowserTaskRecordJson>> mutableRecords;
    public final LinkedHashMap<String, LocalBrowserTelemetry.Task> observedTasks;
    public final C4oT prefs;
    public final C1BN<List<LocalBrowserTaskRecordJson>> records;
    public final InterfaceC2261BLa reporting;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$3", f = "LocalBrowserTaskRegistry.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ LocalBrowserTaskRegistry this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchGatewayConnection hatchGatewayConnection, LocalBrowserTaskRegistry localBrowserTaskRegistry, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = localBrowserTaskRegistry;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskRegistry$3$invokeSuspend$$inlined$filterIsInstance$1 localBrowserTaskRegistry$3$invokeSuspend$$inlined$filterIsInstance$1 = new LocalBrowserTaskRegistry$3$invokeSuspend$$inlined$filterIsInstance$1(this.$gateway.getChatEvents());
                final LocalBrowserTaskRegistry localBrowserTaskRegistry = this.this$0;
                C20Z<? super Object> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchChatEvent.Presentation) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchChatEvent.Presentation presentation, HtJ<? super Unit> htJ) {
                        BrowserTaskPresentationData browserTaskPresentationData;
                        BrowserTaskPresentation browserTaskPresentation;
                        Unit unit;
                        LocalBrowserTelemetry.Task task;
                        HatchPresentationData hatchPresentationData = presentation.presentation.data;
                        Object obj2 = null;
                        if ((hatchPresentationData instanceof BrowserTaskPresentationData) && (browserTaskPresentationData = (BrowserTaskPresentationData) hatchPresentationData) != null && (browserTaskPresentation = browserTaskPresentationData.browserTask) != null) {
                            BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
                            if (browserTaskExecution.kind == BrowserTaskExecutionKind.LOCAL_DEVICE && C7384Etj.areEqual(browserTaskExecution.deviceId, localBrowserTaskRegistry.deviceId)) {
                                LocalBrowserTaskRegistry localBrowserTaskRegistry2 = localBrowserTaskRegistry;
                                synchronized (localBrowserTaskRegistry2.lock) {
                                    ListIterator listIteratorA0n = C3cG.A0n(localBrowserTaskRegistry2.mutableRecords.getValue());
                                    while (true) {
                                        if (!listIteratorA0n.hasPrevious()) {
                                            break;
                                        }
                                        Object objPrevious = listIteratorA0n.previous();
                                        if (BrowserTaskIdKt.logicalBrowserTaskId(((LocalBrowserTaskRecordJson) objPrevious).taskId).equals(browserTaskPresentation.browserTaskId)) {
                                            obj2 = objPrevious;
                                            break;
                                        }
                                    }
                                    LocalBrowserTaskRecordJson localBrowserTaskRecordJson = (LocalBrowserTaskRecordJson) obj2;
                                    if (localBrowserTaskRecordJson != null && (task = localBrowserTaskRegistry2.observedTasks.get(localBrowserTaskRecordJson.taskId)) != null) {
                                        task.state(AnonymousClass006.A0x(browserTaskPresentation.getDisplayState()), browserTaskPresentation.status, browserTaskPresentation.terminalReason);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                                return unit;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (localBrowserTaskRegistry$3$invokeSuspend$$inlined$filterIsInstance$1.collect(c20z, this) == enumC10460Hji) {
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
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$4", f = "LocalBrowserTaskRegistry.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ LocalBrowserTaskRegistry this$0;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$4$2", f = "LocalBrowserTaskRegistry.kt", l = {106}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$4$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ LocalBrowserTaskRegistry this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LocalBrowserTaskRegistry localBrowserTaskRegistry, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = localBrowserTaskRegistry;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (z) {
                        final LocalBrowserTaskRegistry localBrowserTaskRegistry = this.this$0;
                        C20Q c20qA01 = GDB.A01(new LocalBrowserTaskRegistry$4$2$invokeSuspend$$inlined$map$1(localBrowserTaskRegistry.records));
                        C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.4.2.2
                            @Override // X.C20Z
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                                return emit((List<LocalBrowserTaskRecordJson>) obj2, (HtJ<? super Unit>) htJ);
                            }

                            public final Object emit(List<LocalBrowserTaskRecordJson> list, HtJ<? super Unit> htJ) {
                                return C3cG.A0U(localBrowserTaskRegistry.reportPending(htJ));
                            }
                        };
                        this.Z$0 = z;
                        this.label = 1;
                        if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
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
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchGatewayConnection hatchGatewayConnection, LocalBrowserTaskRegistry localBrowserTaskRegistry, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = localBrowserTaskRegistry;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(new LocalBrowserTaskRegistry$4$invokeSuspend$$inlined$map$1(this.$gateway.connectionState));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
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
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final LocalBrowserTaskRegistry getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalBrowserTaskRegistry) abstractC3358CGz.A03(LocalBrowserTaskRegistry.class, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LocalBrowserTaskRegistry(abstractC3358CGz);
                }
            });
        }

        public static final LocalBrowserTaskRegistry getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new LocalBrowserTaskRegistry(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$finish$2", f = "LocalBrowserTaskRegistry.kt", l = {185}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$finish$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskRegistry.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskRegistry localBrowserTaskRegistry = LocalBrowserTaskRegistry.this;
                this.label = 1;
                if (localBrowserTaskRegistry.persist(this) == enumC10460Hji) {
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
            return LocalBrowserTaskRegistry.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$logProcessDeaths$1", f = "LocalBrowserTaskRegistry.kt", l = {262}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$logProcessDeaths$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<LocalBrowserTaskRecordJson> $interrupted;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<LocalBrowserTaskRecordJson> list, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$interrupted = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskRegistry.this.new AnonymousClass1(this.$interrupted, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskRegistry localBrowserTaskRegistry = LocalBrowserTaskRegistry.this;
                this.label = 1;
                obj = localBrowserTaskRegistry.persist(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                Context contextA06 = C3cG.A06();
                for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : this.$interrupted) {
                    LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
                    localBrowserTelemetry.event("local_browser_task_retired", "outcome", AGH.A02(AnonymousClass007.A0d("reason", AnonymousClass001.A0u("INTERRUPTED"), C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, localBrowserTaskRecordJson.taskId)), localBrowserTelemetry.processExit(contextA06, localBrowserTaskRecordJson.pid)), null);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$persist$2", f = "LocalBrowserTaskRegistry.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$persist$2, reason: invalid class name and case insensitive filesystem */
    public final class C124762 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C124762(HtJ<? super C124762> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskRegistry.this.new C124762(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zCommit;
            Boolean boolValueOf;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            LocalBrowserTaskRegistry localBrowserTaskRegistry = LocalBrowserTaskRegistry.this;
            synchronized (localBrowserTaskRegistry.lock) {
                if (localBrowserTaskRegistry.cleared) {
                    zCommit = false;
                } else {
                    BzK bzKA9q = localBrowserTaskRegistry.prefs.A9q();
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    int i = LocalBrowserTaskRecordJson.$stable;
                    LocalBrowserTaskRecordJson$$serializer localBrowserTaskRecordJson$$serializer = LocalBrowserTaskRecordJson$$serializer.INSTANCE;
                    C7384Etj.A0Y(localBrowserTaskRecordJson$$serializer, 0);
                    bzKA9q.AYr(LocalBrowserTaskRegistry.KEY, c9sU.A02(localBrowserTaskRegistry.mutableRecords.getValue(), C3cG.A19(localBrowserTaskRecordJson$$serializer)));
                    zCommit = bzKA9q.commit();
                }
                boolValueOf = Boolean.valueOf(zCommit);
            }
            return boolValueOf;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return LocalBrowserTaskRegistry.this.new C124762(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry", f = "LocalBrowserTaskRegistry.kt", l = {162}, m = "register", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$register$1, reason: invalid class name and case insensitive filesystem */
    public final class C124771 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124771(HtJ<? super C124771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskRegistry.this.register(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry", f = "LocalBrowserTaskRegistry.kt", l = {122, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "reportPending", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$reportPending$1, reason: invalid class name and case insensitive filesystem */
    public final class C124781 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124781(HtJ<? super C124781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskRegistry.this.reportPending(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry", f = "LocalBrowserTaskRegistry.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, HatchMessageShareDocumentRenderer.CONTENT_TOP_PX, 211, 220, 226, 229}, m = "settle", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$settle$1, reason: invalid class name and case insensitive filesystem */
    public final class C124791 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C124791(HtJ<? super C124791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskRegistry.this.settle(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry", f = "LocalBrowserTaskRegistry.kt", l = {245}, m = "update", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$1, reason: invalid class name and case insensitive filesystem */
    public final class C124801 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124801(HtJ<? super C124801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskRegistry.this.update(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$3", f = "LocalBrowserTaskRegistry.kt", l = {245}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$3, reason: invalid class name and case insensitive filesystem */
    public final class C124813 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C124813(HtJ<? super C124813> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskRegistry.this.new C124813(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskRegistry localBrowserTaskRegistry = LocalBrowserTaskRegistry.this;
                this.label = 1;
                obj = localBrowserTaskRegistry.persist(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return LocalBrowserTaskRegistry.this.new C124813(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:116:0x01ed, B:71:0x0185], limit reached: 142 */
    /* JADX WARN: Path cross not found for [B:41:0x00ea, B:38:0x00de], limit reached: 142 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[Catch: all -> 0x0233, TryCatch #1 {all -> 0x0233, blocks: (B:27:0x00a5, B:29:0x00ab, B:32:0x00c3), top: B:114:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:34:0x00d0, B:36:0x00d6, B:38:0x00de, B:44:0x00f6, B:46:0x0104, B:48:0x0116, B:50:0x011c, B:51:0x0123, B:53:0x0129, B:69:0x0181, B:71:0x0185, B:73:0x0189, B:75:0x018f, B:77:0x0199, B:79:0x01a0, B:82:0x01c4, B:85:0x01cb, B:57:0x013d, B:58:0x0141, B:60:0x0147, B:62:0x0151, B:64:0x015d, B:41:0x00ea), top: B:118:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x021c -> B:118:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settle(java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson> r14, boolean r15, X.HtJ<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.settle(java.util.List, boolean, X.HtJ):java.lang.Object");
    }

    public static final LocalBrowserTaskRecordJson settle$lambda$0$1(LocalBrowserTaskRecordJson localBrowserTaskRecordJson) {
        C7384Etj.A0Y(localBrowserTaskRecordJson, 0);
        int i = LocalBrowserTaskRecordJson.$stable;
        String str = localBrowserTaskRecordJson.taskId;
        String str2 = localBrowserTaskRecordJson.bindingId;
        String str3 = localBrowserTaskRecordJson.deviceId;
        LocalBrowserTaskOutcome localBrowserTaskOutcome = localBrowserTaskRecordJson.outcome;
        String str4 = localBrowserTaskRecordJson.runtimeId;
        Integer num = localBrowserTaskRecordJson.pid;
        AnonymousClass005.A0x(str, str2, str3);
        return new LocalBrowserTaskRecordJson(str, str2, str3, localBrowserTaskOutcome, false, str4, num);
    }

    public static final LocalBrowserTaskRecordJson settle$lambda$0$5(LocalBrowserTaskRecordJson localBrowserTaskRecordJson) {
        C7384Etj.A0Y(localBrowserTaskRecordJson, 0);
        int i = LocalBrowserTaskRecordJson.$stable;
        String str = localBrowserTaskRecordJson.taskId;
        String str2 = localBrowserTaskRecordJson.bindingId;
        String str3 = localBrowserTaskRecordJson.deviceId;
        LocalBrowserTaskOutcome localBrowserTaskOutcome = localBrowserTaskRecordJson.outcome;
        String str4 = localBrowserTaskRecordJson.runtimeId;
        Integer num = localBrowserTaskRecordJson.pid;
        AnonymousClass005.A0x(str, str2, str3);
        return new LocalBrowserTaskRecordJson(str, str2, str3, localBrowserTaskOutcome, false, str4, num);
    }

    public final void recordSdkReport(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            LocalBrowserTelemetry.Task task = this.observedTasks.get(str);
            if (task != null) {
                task.sdkReport(str2);
            }
        }
    }

    public static /* synthetic */ LocalBrowserTaskRecordJson $r8$lambda$oYL52LwP8tD2XoI8Jc15Xggen9M(LocalBrowserTaskRecordJson localBrowserTaskRecordJson) {
        return null;
    }

    public static /* synthetic */ void finish$default(LocalBrowserTaskRegistry localBrowserTaskRegistry, String str, String str2, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        localBrowserTaskRegistry.finish(str, str2, localBrowserTaskOutcome, z);
    }

    private final List<LocalBrowserTaskRecordJson> readRecords() {
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = LocalBrowserTaskRecordJson.$stable;
            LocalBrowserTaskRecordJson$$serializer localBrowserTaskRecordJson$$serializer = LocalBrowserTaskRecordJson$$serializer.INSTANCE;
            C7384Etj.A0Y(localBrowserTaskRecordJson$$serializer, 0);
            A64 a64A19 = C3cG.A19(localBrowserTaskRecordJson$$serializer);
            String string = this.prefs.getString(KEY, "[]");
            Iterable iterable = (Iterable) c9sU.A00(string != null ? string : "[]", a64A19);
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : iterable) {
                if (C7384Etj.areEqual(((LocalBrowserTaskRecordJson) obj).deviceId, this.deviceId)) {
                    arrayListA0h.add(obj);
                }
            }
            return arrayListA0h;
        } catch (Exception unused) {
            return C0881AGi.A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bb -> B:12:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportPending(X.HtJ<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.C124781
            if (r0 == 0) goto Lc5
            r5 = r11
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$reportPending$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.C124781) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r7 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            r3 = 2
            if (r0 == 0) goto Lbe
            if (r0 == r4) goto L77
            if (r0 != r3) goto Lcd
            long r1 = r5.J$0
            X.Hwg.A00(r7)
        L25:
            r7 = 2
            long r1 = r1 * r7
            r7 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L32
            r1 = 60000(0xea60, double:2.9644E-319)
        L32:
            com.facebook.aura.auth.AuraSessionManager r7 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            X.CGz r0 = r10.userSession
            boolean r0 = r7.isCurrentSession(r0)
            if (r0 == 0) goto L99
            X.1BN<java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson>> r0 = r10.records
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r0.iterator()
        L4d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r7 = r8.next()
            r0 = r7
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r0 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r0
            boolean r0 = r0.stopPending
            if (r0 == 0) goto L4d
            r9.add(r7)
            goto L4d
        L62:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L99
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> Ld2
            r5.J$0 = r1     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> Ld2
            r5.label = r4     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> Ld2
            r0 = 0
            java.lang.Object r0 = r10.settle(r9, r0, r5)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> Ld2
            if (r0 != r6) goto L84
            goto Lcc
        L77:
            long r1 = r5.J$0
            X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> Ld2
            goto L84
        L7d:
            java.lang.String r7 = "LocalBrowserTaskRegistry"
            java.lang.String r0 = "Browser interruption reporting failed"
            X.CFK.A06(r7, r0)
        L84:
            X.1BN<java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson>> r0 = r10.records
            java.lang.Object r7 = r0.getValue()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L9c
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9c
        L99:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L9c:
            java.util.Iterator r7 = r7.iterator()
        La0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r7.next()
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r0 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r0
            boolean r0 = r0.stopPending
            if (r0 == 0) goto La0
            r0 = 0
            r5.L$0 = r0
            r5.J$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.C7Bq.A01(r1, r5)
            if (r0 != r6) goto L25
            return r6
        Lbe:
            X.Hwg.A00(r7)
            r1 = 1000(0x3e8, double:4.94E-321)
            goto L32
        Lc5:
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$reportPending$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$reportPending$1
            r5.<init>(r11)
            goto L12
        Lcc:
            return r6
        Lcd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Ld2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.reportPending(X.HtJ):java.lang.Object");
    }

    public static final LocalBrowserTaskRecordJson settle$lambda$0$4(LocalBrowserTaskRecordJson localBrowserTaskRecordJson) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object update(com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r10, X.G0U<? super com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson, com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson> r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.C124801
            if (r0 == 0) goto L77
            r6 = r12
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.C124801) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L23
            if (r0 != r7) goto L7d
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L23:
            X.Hwg.A00(r1)
            java.lang.Object r8 = r9.lock
            monitor-enter(r8)
            boolean r0 = r9.cleared     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L84
            goto L82
        L30:
            X.BLG<java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson>> r4 = r9.mutableRecords     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r4.getValue()     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r3 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L40:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r1 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r1     // Catch: java.lang.Throwable -> L84
            boolean r0 = X.C7384Etj.areEqual(r1, r10)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L58
            java.lang.Object r1 = r11.invoke(r1)     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r1 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r1     // Catch: java.lang.Throwable -> L84
        L58:
            if (r1 == 0) goto L40
            r3.add(r1)     // Catch: java.lang.Throwable -> L84
            goto L40
        L5e:
            X.HtJ r2 = X.C3cI.A14(r4, r3)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r8)
            X.HwK r1 = X.HwK.A00
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$3 r0 = new com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$3
            r0.<init>(r2)
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r7
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)
            if (r0 != r5) goto L20
            return r5
        L77:
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$update$1
            r6.<init>(r12)
            goto L12
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L82:
            monitor-exit(r8)
            return r0
        L84:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.update(com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson, X.G0U, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.cleared = true;
            Hxb.A03(null, this.scope);
            this.mutableRecords.Af8(C0881AGi.A00);
            this.observedTasks.clear();
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.Aae(KEY);
            bzKA9q.apply();
        }
    }

    public final void finish(String str, String str2, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(localBrowserTaskOutcome, 2);
        synchronized (this.lock) {
            if (this.cleared) {
                return;
            }
            BLG<List<LocalBrowserTaskRecordJson>> blg = this.mutableRecords;
            List<LocalBrowserTaskRecordJson> value = blg.getValue();
            ArrayList arrayListA0i = AnonymousClass003.A0i(value);
            for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : value) {
                if (str.equals(localBrowserTaskRecordJson.taskId) && str2.equals(localBrowserTaskRecordJson.bindingId) && localBrowserTaskRecordJson.outcome == null) {
                    LocalBrowserTelemetry.INSTANCE.event("local_browser_task_retired", "outcome", AGH.A0D(C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, str), C3cG.A0r("reason", AnonymousClass006.A0x(localBrowserTaskOutcome))), null);
                    String str3 = localBrowserTaskRecordJson.taskId;
                    String str4 = localBrowserTaskRecordJson.bindingId;
                    String str5 = localBrowserTaskRecordJson.deviceId;
                    String str6 = localBrowserTaskRecordJson.runtimeId;
                    Integer num = localBrowserTaskRecordJson.pid;
                    AnonymousClass005.A0x(str3, str4, str5);
                    localBrowserTaskRecordJson = new LocalBrowserTaskRecordJson(str3, str4, str5, localBrowserTaskOutcome, z, str6, num);
                }
                arrayListA0i.add(localBrowserTaskRecordJson);
            }
            HtJ htJA14 = C3cI.A14(blg, arrayListA0i);
            AnonymousClass001.A1J(new AnonymousClass2(htJA14), this.scope);
        }
    }

    public final C1BN<List<LocalBrowserTaskRecordJson>> getRecords() {
        return this.records;
    }

    public final Object prepareSignOut(HtJ<? super Unit> htJ) {
        List<LocalBrowserTaskRecordJson> value = this.records.getValue();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : value) {
            if (((LocalBrowserTaskRecordJson) obj).stopPending) {
                arrayListA0h.add(obj);
            }
        }
        return C3cG.A0U(settle(arrayListA0h, true, htJ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r8 < 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        r15.observedTasks.remove(((com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r7.remove(r8)).taskId);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object register(java.lang.String r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super kotlin.Unit> r19) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.register(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public LocalBrowserTaskRegistry(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.prefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.deviceId = AuraDeviceId.INSTANCE.getNodeId();
        this.scope = C3cH.A0y(C3cH.A0u(), new LocalBrowserTaskRegistry$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.lock = C3cG.A0T();
        this.reporting = new C9258GBl();
        this.observedTasks = C3cG.A0j();
        List<LocalBrowserTaskRecordJson> records = readRecords();
        ArrayList arrayListA0i = AnonymousClass003.A0i(records);
        for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : records) {
            if (localBrowserTaskRecordJson.outcome == null) {
                LocalBrowserTaskOutcome localBrowserTaskOutcome = LocalBrowserTaskOutcome.INTERRUPTED;
                String str = localBrowserTaskRecordJson.taskId;
                String str2 = localBrowserTaskRecordJson.bindingId;
                String str3 = localBrowserTaskRecordJson.deviceId;
                String str4 = localBrowserTaskRecordJson.runtimeId;
                Integer num = localBrowserTaskRecordJson.pid;
                AnonymousClass005.A0x(str, str2, str3);
                localBrowserTaskRecordJson = new LocalBrowserTaskRecordJson(str, str2, str3, localBrowserTaskOutcome, false, str4, num);
            }
            arrayListA0i.add(localBrowserTaskRecordJson);
        }
        this.mutableRecords = C3cG.A14(arrayListA0i);
        ArrayList arrayListA0h = C3cG.A0h();
        for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson2 : records) {
            if (localBrowserTaskRecordJson2.outcome == null) {
                arrayListA0h.add(localBrowserTaskRecordJson2);
            }
        }
        logProcessDeaths(arrayListA0h);
        this.records = C3cG.A11(this.mutableRecords);
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
        C3UX c3ux = this.scope;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(gateway, this, null);
        C6ys c6ys = C6ys.A00;
        Integer num2 = C79.A00;
        GAo.A02(num2, c6ys, anonymousClass3, c3ux);
        GAo.A02(num2, c6ys, new AnonymousClass4(gateway, this, null), this.scope);
    }

    private final void logProcessDeaths(List<LocalBrowserTaskRecordJson> list) {
        if (list.isEmpty()) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(list, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object persist(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C124762(null));
    }

    public /* synthetic */ LocalBrowserTaskRegistry(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
