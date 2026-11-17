package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C0924AIa;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7Bq;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAt;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.localbrowser.connector.DevToolsBridge;
import com.facebook.aura.localbrowser.connector.DevToolsClient;
import com.facebook.aura.localbrowser.connector.DevToolsIdentity;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.localbrowser.core.BrowserEngineBudget;
import com.facebook.aura.localbrowser.core.BrowserEngineClosure;
import com.facebook.aura.localbrowser.core.BrowserEngineGroup;
import com.facebook.aura.localbrowser.core.BrowserEnginePage;
import com.facebook.aura.localbrowser.core.BrowserEngineResult;
import com.facebook.aura.localbrowser.core.BrowserEngineSettlement;
import com.facebook.aura.localbrowser.core.BrowserOperation;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.hatch.browser.protocol.PageCloseRequest;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class LocalBrowserConnection {
    public static final int $stable = 8;

    @Deprecated
    public static final long ATTACH_TIMEOUT_MS = 5000;

    @Deprecated
    public static final long DISCOVERY_TIMEOUT_MS = 5000;

    @Deprecated
    public static final long RECOVERY_TIMEOUT_MS = 60000;

    @Deprecated
    public static final String TAG = "LocalBrowserConnection";
    public long appliedControlRevision;
    public long appliedPageRevision;
    public int attachFailures;
    public HoC attachRetry;
    public boolean attaching;
    public DevToolsBridge bridge;
    public int bridgeGeneration;
    public final InterfaceC10560Hsz<Boolean> cleanup;
    public LocalBrowserCloseAttempt closeAttempt;
    public final Function0<Boolean> closeNative;
    public final BLG<Boolean> connected;
    public final BrowserEngine engine;
    public boolean fenced;
    public BrowserEngineGroup group;
    public long initialAcceptDeadline;
    public DevToolsBridge initialBridge;
    public final AutoCloseable lease;
    public final Handler mainHandler;
    public final Function0<Unit> onLost;
    public BrowserEnginePage page;
    public long recoveryDeadline;
    public BrowserEngineSettlement removal;
    public BrowserEngineSettlement retirement;
    public final LocalBrowserSession session;
    public String targetId;
    public static final Companion Companion = new Companion();
    public static final String BROWSER_INSTANCE_ID = AnonymousClass002.A0k();

    public final class Companion {
        public final String getBROWSER_INSTANCE_ID() {
            return LocalBrowserConnection.BROWSER_INSTANCE_ID;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {318, 322, 328}, m = BrowserSessionControllerKt.WEBSOCKIFY_MODE_ATTACH, v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$attach$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.attach(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {84, 86}, m = "awaitConnection", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C124091 extends HzP {
        public long J$0;
        public long J$1;
        public int label;
        public /* synthetic */ Object result;

        public C124091(HtJ<? super C124091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.awaitConnection(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2", f = "LocalBrowserConnection.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2$1", f = "LocalBrowserConnection.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserConnection.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserConnection localBrowserConnection = LocalBrowserConnection.this;
                int i2 = LocalBrowserConnection.$stable;
                BLG<Boolean> blg = localBrowserConnection.connected;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, blg);
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
            return LocalBrowserConnection.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {79}, m = "awaitPage", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$awaitPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C124101 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C124101(HtJ<? super C124101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.awaitPage(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {201, HatchWidgetWebViewKt.HTTP_NO_CONTENT, 208}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C124111 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124111(HtJ<? super C124111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.execute(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$execute$2", f = "LocalBrowserConnection.kt", l = {205}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$execute$2, reason: invalid class name and case insensitive filesystem */
    public final class C124122 extends AbstractC07127nr implements G0U<HtJ<? super BrowserEngineResult>, Object> {
        public final /* synthetic */ long $deadlineElapsedMs;
        public final /* synthetic */ BrowserOperation $operation;
        public final /* synthetic */ String $operationId;
        public final /* synthetic */ BrowserEnginePage $page;
        public int label;
        public final /* synthetic */ LocalBrowserConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124122(BrowserEnginePage browserEnginePage, String str, BrowserOperation browserOperation, LocalBrowserConnection localBrowserConnection, long j, HtJ<? super C124122> htJ) {
            super(1, htJ);
            this.$page = browserEnginePage;
            this.$operationId = str;
            this.$operation = browserOperation;
            this.this$0 = localBrowserConnection;
            this.$deadlineElapsedMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C124122(this.$page, this.$operationId, this.$operation, this.this$0, this.$deadlineElapsedMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEnginePage browserEnginePage = this.$page;
                String str = this.$operationId;
                BrowserOperation browserOperation = this.$operation;
                BrowserEngineBudget browserEngineBudgetBudget = this.this$0.budget(this.$deadlineElapsedMs);
                this.label = 1;
                obj = browserEnginePage.execute(str, browserOperation, browserEngineBudgetBudget, this);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super BrowserEngineResult> htJ) {
            return ((C124122) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {404}, m = "openBridge", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$1, reason: invalid class name and case insensitive filesystem */
    public final class C124131 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124131(HtJ<? super C124131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.openBridge(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$2", f = "LocalBrowserConnection.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$2, reason: invalid class name and case insensitive filesystem */
    public final class C124142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DevToolsBridge>, Object> {
        public final /* synthetic */ long $deadlineElapsedMs;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ C10543Hqv<DevToolsBridge> $opened;
        public final /* synthetic */ String $target;
        public int label;
        public final /* synthetic */ LocalBrowserConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124142(String str, long j, LocalBrowserConnection localBrowserConnection, int i, C10543Hqv<DevToolsBridge> c10543Hqv, HtJ<? super C124142> htJ) {
            super(2, htJ);
            this.$target = str;
            this.$deadlineElapsedMs = j;
            this.this$0 = localBrowserConnection;
            this.$generation = i;
            this.$opened = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124142(this.$target, this.$deadlineElapsedMs, this.this$0, this.$generation, this.$opened, htJ);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, com.facebook.aura.localbrowser.connector.DevToolsBridge, java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                DevToolsBridge.Companion companion = DevToolsBridge.Companion;
                String str = this.$target;
                long j = this.$deadlineElapsedMs;
                final LocalBrowserConnection localBrowserConnection = this.this$0;
                final int i = this.$generation;
                ?? Open = companion.open(str, j, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        localBrowserConnection.onBridgeClosed(i);
                        return Unit.INSTANCE;
                    }
                }, new DevToolsClient());
                this.$opened.element = Open;
                return Open;
            } catch (IOException e) {
                LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
                LocalBrowserConnection localBrowserConnection2 = this.this$0;
                C0924AIa c0924AIaA0u = C3cG.A0u();
                int i2 = LocalBrowserConnection.$stable;
                c0924AIaA0u.put("operation_id", localBrowserConnection2.session.id);
                C3cI.A1E(localBrowserConnection2.session, c0924AIaA0u);
                c0924AIaA0u.put("outcome_scope", "bridge_attempt");
                c0924AIaA0u.put("failure_stage", "bridge_open");
                c0924AIaA0u.put("exception_class", localBrowserTelemetry.exceptionClass(e));
                localBrowserTelemetry.event("local_browser_connection", "error", AIW.A0K(c0924AIaA0u), null);
                return null;
            }
        }

        public static final Unit invokeSuspend$lambda$0(LocalBrowserConnection localBrowserConnection, int i) {
            localBrowserConnection.onBridgeClosed(i);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DevToolsBridge> htJ) {
            return ((C124142) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {96, 116, 162}, m = "prepare", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$1, reason: invalid class name and case insensitive filesystem */
    public final class C124151 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C124151(HtJ<? super C124151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.prepare(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$7", f = "LocalBrowserConnection.kt", l = {161}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass7(HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserConnection.this.new AnonymousClass7(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final LocalBrowserConnection localBrowserConnection = LocalBrowserConnection.this;
                int i2 = LocalBrowserConnection.$stable;
                C1BN<LocalBrowserFacts> c1bn = localBrowserConnection.session.facts;
                C20Z<? super LocalBrowserFacts> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserConnection.prepare.7.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((LocalBrowserFacts) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(LocalBrowserFacts localBrowserFacts, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(LocalBrowserConnection.attach$default(localBrowserConnection, 0L, htJ, 1, null));
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
            return LocalBrowserConnection.this.new AnonymousClass7(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$8", f = "LocalBrowserConnection.kt", l = {164}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DevToolsIdentity $identity;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$8$1", f = "LocalBrowserConnection.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$prepare$8$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<LocalBrowserPageState, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ DevToolsIdentity $identity;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DevToolsIdentity devToolsIdentity, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$identity = devToolsIdentity;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$identity, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r2 = r3.L$0
                    com.facebook.aura.localbrowser.LocalBrowserPageState r2 = (com.facebook.aura.localbrowser.LocalBrowserPageState) r2
                    int r0 = r3.label
                    if (r0 != 0) goto L24
                    X.Hwg.A00(r4)
                    com.facebook.aura.localbrowser.LocalBrowserPagePhase r1 = r2.phase
                    com.facebook.aura.localbrowser.LocalBrowserPagePhase r0 = com.facebook.aura.localbrowser.LocalBrowserPagePhase.READY
                    if (r1 != r0) goto L1e
                    java.lang.String r1 = r2.url
                    com.facebook.aura.localbrowser.connector.DevToolsIdentity r0 = r3.$identity
                    java.lang.String r0 = r0.url
                    boolean r1 = X.C7384Etj.areEqual(r1, r0)
                    r0 = 1
                    if (r1 == 0) goto L1f
                L1e:
                    r0 = 0
                L1f:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L24:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.AnonymousClass8.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(LocalBrowserPageState localBrowserPageState, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(localBrowserPageState, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(DevToolsIdentity devToolsIdentity, HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
            this.$identity = devToolsIdentity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserConnection.this.new AnonymousClass8(this.$identity, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserConnection localBrowserConnection = LocalBrowserConnection.this;
                int i2 = LocalBrowserConnection.$stable;
                C1BN<LocalBrowserPageState> c1bn = localBrowserConnection.session.target.page.state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$identity, null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            LocalBrowserConnection localBrowserConnection2 = LocalBrowserConnection.this;
            int i3 = LocalBrowserConnection.$stable;
            localBrowserConnection2.session.target.clearHistory();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass8) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection$retryAttach$1", f = "LocalBrowserConnection.kt", l = {393, 395}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$retryAttach$1, reason: invalid class name and case insensitive filesystem */
    public final class C124161 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $remaining;
        public final /* synthetic */ long $retryDelayMs;
        public int label;
        public final /* synthetic */ LocalBrowserConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124161(long j, long j2, LocalBrowserConnection localBrowserConnection, HtJ<? super C124161> htJ) {
            super(2, htJ);
            this.$retryDelayMs = j;
            this.$remaining = j2;
            this.this$0 = localBrowserConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124161(this.$retryDelayMs, this.$remaining, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long jMin = Math.min(this.$retryDelayMs, this.$remaining);
                this.label = 1;
                if (C7Bq.A01(jMin, this) == enumC10460Hji) {
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
            LocalBrowserConnection localBrowserConnection = this.this$0;
            localBrowserConnection.attachRetry = null;
            this.label = 2;
            if (LocalBrowserConnection.attach$default(localBrowserConnection, 0L, this, 1, null) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124161) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {249}, m = "settle", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$settle$1, reason: invalid class name and case insensitive filesystem */
    public final class C124171 extends HzP {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public C124171(HtJ<? super C124171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.settle(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserConnection", f = "LocalBrowserConnection.kt", l = {260, 264, 265, 266, 269, 269, 280}, m = "settleResources", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserConnection$settleResources$1, reason: invalid class name and case insensitive filesystem */
    public final class C124181 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124181(HtJ<? super C124181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserConnection.this.settleResources(this);
        }
    }

    public LocalBrowserConnection(LocalBrowserSession localBrowserSession, BrowserEngine browserEngine, AutoCloseable autoCloseable, Function0<Unit> function0, Function0<Boolean> function02) {
        C7384Etj.A0Y(localBrowserSession, 0);
        AnonymousClass005.A11(browserEngine, autoCloseable, function0, 1);
        C7384Etj.A0Y(function02, 4);
        this.session = localBrowserSession;
        this.engine = browserEngine;
        this.lease = autoCloseable;
        this.onLost = function0;
        this.closeNative = function02;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.connected = AnonymousClass002.A0v(false);
        this.cleanup = new GAt(null);
    }

    public static final WebResourceResponse prepare$lambda$3(LocalBrowserBlocklist localBrowserBlocklist, LocalBrowserConnection localBrowserConnection, String str) {
        C7384Etj.A0Y(str, 2);
        return localBrowserBlocklist.screenPopup(localBrowserConnection.engine, str);
    }

    private final void retryAttach(boolean z) {
        String str;
        if (this.fenced || AnonymousClass003.A1Z(this.connected)) {
            return;
        }
        this.session.target.setBrowsingEnabled(false);
        this.bridgeGeneration++;
        DevToolsBridge devToolsBridge = this.bridge;
        if (devToolsBridge != null) {
            devToolsBridge.close();
        }
        this.bridge = null;
        LocalBrowserFacts localBrowserFactsA0G = C3cI.A0G(this.session);
        if (!localBrowserFactsA0G.available || localBrowserFactsA0G.control != LocalBrowserControl.AGENT) {
            this.recoveryDeadline = 0L;
            return;
        }
        if (z) {
            str = HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED;
        } else {
            this.attachFailures++;
            str = "failed";
        }
        CFK.A06(TAG, FGI.A0V("attach ", str, ": failures=", this.attachFailures));
        long jA04 = C3cH.A04(this.recoveryDeadline);
        if (jA04 <= 0) {
            this.onLost.invoke();
        } else {
            this.attachRetry = AnonymousClass001.A11(new C124161(z ? 500L : Math.min(this.attachFailures * 500, 2000L), jA04, this, null), this.session.scope);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void apply(com.facebook.aura.localbrowser.LocalBrowserFacts r7) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r6.checkMainThread()
            boolean r0 = r6.fenced
            if (r0 != 0) goto L3c
            com.facebook.aura.localbrowser.LocalBrowserCloseAttempt r0 = r6.closeAttempt
            if (r0 != 0) goto L3c
            com.facebook.aura.localbrowser.core.BrowserEngineGroup r5 = r6.group
            if (r5 == 0) goto L3c
            long r1 = r7.controlRevision
            long r3 = r6.appliedControlRevision
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L41
            com.facebook.aura.localbrowser.LocalBrowserSession r0 = r6.session
            com.facebook.aura.localbrowser.LocalBrowserTask r0 = r0.task
            if (r0 != 0) goto L3d
            com.facebook.aura.localbrowser.LocalBrowserControl r0 = r7.control
            com.facebook.aura.localbrowser.core.BrowserEngineControl r0 = com.facebook.aura.localbrowser.LocalBrowserConnectionKt.toEngineControl(r0)
            boolean r0 = r5.updateControl(r1, r0)
            if (r0 != 0) goto L3d
        L2d:
            com.facebook.aura.localbrowser.LocalBrowserSession r0 = r6.session
            com.facebook.aura.localbrowser.LocalBrowserCloseReason r0 = r0.closeReason
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            if (r0 == 0) goto L3c
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.onLost
            r0.invoke()
        L3c:
            return
        L3d:
            long r0 = r7.controlRevision
            r6.appliedControlRevision = r0
        L41:
            com.facebook.aura.localbrowser.core.BrowserEnginePage r5 = r6.page
            if (r5 == 0) goto L3c
            long r1 = r7.pageRevision
            long r3 = r6.appliedPageRevision
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
            boolean r0 = r7.available
            boolean r0 = r5.updateState(r1, r0)
            if (r0 == 0) goto L2d
            long r0 = r7.pageRevision
            r6.appliedPageRevision = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.apply(com.facebook.aura.localbrowser.LocalBrowserFacts):void");
    }

    public final LocalBrowserCloseAttempt beginClose(String str, long j, PageCloseRequest pageCloseRequest) {
        BrowserEngineClosure browserEngineClosureBeginClose;
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        LocalBrowserCloseAttempt localBrowserCloseAttempt = this.closeAttempt;
        if (localBrowserCloseAttempt == null) {
            if (pageCloseRequest != null) {
                browserEngineClosureBeginClose = this.engine.beginClose(pageCloseRequest);
            } else {
                BrowserEnginePage browserEnginePage = this.page;
                if (browserEnginePage != null) {
                    browserEngineClosureBeginClose = browserEnginePage.beginClose(str, budget(j));
                }
            }
            if (browserEngineClosureBeginClose != null) {
                LocalBrowserCloseAttempt localBrowserCloseAttempt2 = new LocalBrowserCloseAttempt(this.session.id, str, browserEngineClosureBeginClose);
                this.closeAttempt = localBrowserCloseAttempt2;
                return localBrowserCloseAttempt2;
            }
        } else if (str.equals(localBrowserCloseAttempt.operationId)) {
            return localBrowserCloseAttempt;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r13, com.facebook.aura.localbrowser.core.BrowserOperation r14, long r15, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngineResult> r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r7 = r13
            r10 = r15
            r4 = r17
            r8 = r14
            boolean r0 = r4 instanceof com.facebook.aura.localbrowser.LocalBrowserConnection.C124111
            r9 = r12
            if (r0 == 0) goto L2e
            r2 = r4
            com.facebook.aura.localbrowser.LocalBrowserConnection$execute$1 r2 = (com.facebook.aura.localbrowser.LocalBrowserConnection.C124111) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L2e
            int r3 = r3 - r1
            r2.label = r3
        L18:
            java.lang.Object r6 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r5 = r2.label
            r4 = 3
            r3 = 2
            r0 = 1
            if (r5 == 0) goto L38
            if (r5 == r0) goto L4a
            if (r5 == r3) goto L34
            if (r5 == r4) goto L34
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            com.facebook.aura.localbrowser.LocalBrowserConnection$execute$1 r2 = new com.facebook.aura.localbrowser.LocalBrowserConnection$execute$1
            r2.<init>(r4)
            goto L18
        L34:
            X.Hwg.A00(r6)
            return r6
        L38:
            X.Hwg.A00(r6)
            r2.L$0 = r13
            r2.L$1 = r14
            r2.J$0 = r15
            r2.label = r0
            java.lang.Object r6 = r12.awaitConnection(r10, r2)
            if (r6 != r1) goto L56
            return r1
        L4a:
            long r10 = r2.J$0
            java.lang.Object r8 = r2.L$1
            com.facebook.aura.localbrowser.core.BrowserOperation r8 = (com.facebook.aura.localbrowser.core.BrowserOperation) r8
            java.lang.Object r0 = r2.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r6)
        L56:
            boolean r0 = X.AnonymousClass001.A1X(r6)
            r12 = 0
            if (r0 != 0) goto L5e
            return r12
        L5e:
            com.facebook.aura.localbrowser.core.BrowserEnginePage r6 = r9.page
            if (r6 == 0) goto L99
            boolean r0 = r9.fenced
            if (r0 != 0) goto L99
            boolean r0 = r8.getCapturesImage()
            if (r0 == 0) goto L86
            com.facebook.aura.localbrowser.LocalBrowserSession r0 = r9.session
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r0.target
            com.facebook.aura.localbrowser.LocalBrowserConnection$execute$2 r5 = new com.facebook.aura.localbrowser.LocalBrowserConnection$execute$2
            r5.<init>(r6, r7, r8, r9, r10, r12)
            r2.L$0 = r12
            r2.L$1 = r12
            r2.L$2 = r12
            r2.J$0 = r10
            r2.label = r3
            java.lang.Object r0 = r0.withCaptureFrames(r5, r2)
        L83:
            if (r0 != r1) goto L9b
            return r1
        L86:
            com.facebook.aura.localbrowser.core.BrowserEngineBudget r0 = r9.budget(r10)
            r2.L$0 = r12
            r2.L$1 = r12
            r2.L$2 = r12
            r2.J$0 = r10
            r2.label = r4
            java.lang.Object r0 = r6.execute(r7, r8, r0, r2)
            goto L83
        L99:
            com.facebook.aura.localbrowser.core.BrowserEngineResult$Refused r0 = com.facebook.aura.localbrowser.core.BrowserEngineResult.Refused.INSTANCE
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.execute(java.lang.String, com.facebook.aura.localbrowser.core.BrowserOperation, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158 A[Catch: CancellationException -> 0x0250, all -> 0x0255, TryCatch #0 {CancellationException -> 0x0250, blocks: (B:16:0x0040, B:71:0x01a0, B:60:0x014f, B:61:0x0152, B:63:0x0158, B:64:0x015b, B:66:0x015f, B:68:0x0163, B:54:0x011e, B:55:0x0121, B:47:0x00e1, B:49:0x00e9, B:51:0x00f3, B:56:0x0127, B:57:0x012a), top: B:111:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attach(long r21, X.HtJ<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.attach(long, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object attach$default(LocalBrowserConnection localBrowserConnection, long j, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.elapsedRealtime() + 5000;
        }
        return localBrowserConnection.attach(j, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitConnection(long r11, X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.localbrowser.LocalBrowserConnection.C124091
            if (r0 == 0) goto L5d
            r8 = r13
            com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$1 r8 = (com.facebook.aura.localbrowser.LocalBrowserConnection.C124091) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 == r6) goto L39
            if (r0 != r7) goto L63
            X.Hwg.A00(r1)
        L23:
            if (r1 != 0) goto L26
            r6 = 0
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L2b:
            X.Hwg.A00(r1)
            r8.J$0 = r11
            r8.label = r6
            java.lang.Object r0 = r10.attach(r11, r8)
            if (r0 != r9) goto L3e
            return r9
        L39:
            long r11 = r8.J$0
            X.Hwg.A00(r1)
        L3e:
            long r2 = X.C3cH.A04(r11)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4a
            r2 = 0
        L4a:
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$2
            r0.<init>(r1)
            r8.J$0 = r11
            r8.J$1 = r2
            r8.label = r7
            java.lang.Object r1 = X.GAX.A01(r8, r0, r2)
            if (r1 != r9) goto L23
            return r9
        L5d:
            com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$1 r8 = new com.facebook.aura.localbrowser.LocalBrowserConnection$awaitConnection$1
            r8.<init>(r13)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.awaitConnection(long, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ LocalBrowserCloseAttempt beginClose$default(LocalBrowserConnection localBrowserConnection, String str, long j, PageCloseRequest pageCloseRequest, int i, Object obj) {
        if ((i & 4) != 0) {
            pageCloseRequest = null;
        }
        return localBrowserConnection.beginClose(str, j, pageCloseRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BrowserEngineBudget budget(long j) {
        return BrowserEngineBudget.Companion.capture(C3cH.A04(j));
    }

    private final String getBrowserInstanceId() {
        String str;
        LocalBrowserTask localBrowserTask = this.session.task;
        return (localBrowserTask == null || (str = localBrowserTask.endpoint.runtimeId) == null) ? BROWSER_INSTANCE_ID : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBridgeClosed(final int i) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserConnection$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LocalBrowserConnection.onBridgeClosed$lambda$0(this.f$0, i);
            }
        });
    }

    public static final void onBridgeClosed$lambda$0(LocalBrowserConnection localBrowserConnection, int i) {
        if (localBrowserConnection.fenced || i != localBrowserConnection.bridgeGeneration) {
            return;
        }
        C9286GCn.A00(null, false, (C9286GCn) localBrowserConnection.connected);
        localBrowserConnection.session.target.setBrowsingEnabled(false);
        localBrowserConnection.bridge = null;
        AnonymousClass001.A1J(new LocalBrowserConnection$onBridgeClosed$1$1(localBrowserConnection, null), localBrowserConnection.session.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x005b: IGET (r0 I:T) = (r11 I:X.Hqv) (LINE:91) X.Hqv.element java.lang.Object, block:B:20:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.Hqv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openBridge(java.lang.String r13, long r14, X.HtJ<? super com.facebook.aura.localbrowser.connector.DevToolsBridge> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserConnection.C124131
            r9 = r12
            if (r0 == 0) goto L25
            r4 = r3
            com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserConnection.C124131) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L2f
            if (r2 != r1) goto L65
            java.lang.Object r11 = r4.L$1
            X.Hqv r11 = (X.C10543Hqv) r11
            goto L2b
        L25:
            com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$1
            r4.<init>(r3)
            goto L15
        L2b:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L5a
            return r0
        L2f:
            X.Hwg.A00(r0)
            int r0 = r12.bridgeGeneration
            int r10 = r0 + 1
            r12.bridgeGeneration = r10
            X.Hqv r11 = X.C3cG.A0z()
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.util.concurrent.CancellationException -> L5a
            r12 = 0
            com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$2 r5 = new com.facebook.aura.localbrowser.LocalBrowserConnection$openBridge$2     // Catch: java.util.concurrent.CancellationException -> L5a
            r6 = r13
            r7 = r14
            r5.<init>(r6, r7, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L5a
            r4.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L5a
            r4.L$1 = r11     // Catch: java.util.concurrent.CancellationException -> L5a
            r4.J$0 = r14     // Catch: java.util.concurrent.CancellationException -> L5a
            r4.I$0 = r10     // Catch: java.util.concurrent.CancellationException -> L5a
            r4.label = r1     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r0 = X.GAo.A00(r4, r0, r5)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r0 != r3) goto L59
            return r3
        L59:
            return r0
        L5a:
            r1 = move-exception
            T r0 = r11.element
            com.facebook.aura.localbrowser.connector.DevToolsBridge r0 = (com.facebook.aura.localbrowser.connector.DevToolsBridge) r0
            if (r0 == 0) goto L69
            r0.close()
            throw r1
        L65:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.openBridge(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    public static final boolean prepare$lambda$0(LocalBrowserConnection localBrowserConnection) {
        return !localBrowserConnection.fenced;
    }

    public static final boolean prepare$lambda$1(LocalBrowserConnection localBrowserConnection) {
        if (!localBrowserConnection.fenced) {
            LocalBrowserSession localBrowserSession = localBrowserConnection.session;
            if (AnonymousClass002.A1Y(localBrowserSession.closeReason)) {
                LocalBrowserTask localBrowserTask = localBrowserSession.task;
                if (localBrowserTask != null ? localBrowserTask.isCurrent() : AuraSessionManager.INSTANCE.isCurrentSession(localBrowserSession.userSession)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean prepare$lambda$2(LocalBrowserConnection localBrowserConnection) {
        BrowserEnginePage browserEnginePage;
        return (localBrowserConnection.fenced || (browserEnginePage = localBrowserConnection.page) == null || !browserEnginePage.isFileStageActive()) ? false : true;
    }

    private final boolean prepareFailed(String str) {
        CFK.A06(TAG, FGI.A0M("prepare failed: ", str));
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        Map<String, String> mapDiagnostics = this.session.diagnostics();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("operation_id", this.session.id);
        C3cI.A1E(this.session, c0924AIaA0u);
        c0924AIaA0u.put("outcome_scope", "connection_prepare");
        c0924AIaA0u.put("failure_stage", str);
        localBrowserTelemetry.event("local_browser_connection", "error", AGH.A02(mapDiagnostics, AIW.A0K(c0924AIaA0u)), null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:52:0x00ad, B:53:0x00b0, B:45:0x008e, B:46:0x0091, B:47:0x0095, B:49:0x009b, B:14:0x002f, B:16:0x0033, B:20:0x0042, B:22:0x0046, B:23:0x004a, B:26:0x0055, B:28:0x0059, B:29:0x005d, B:30:0x005f, B:32:0x0063, B:38:0x0076, B:39:0x007a, B:41:0x007e, B:19:0x003f, B:37:0x0073), top: B:91:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:52:0x00ad, B:53:0x00b0, B:45:0x008e, B:46:0x0091, B:47:0x0095, B:49:0x009b, B:14:0x002f, B:16:0x0033, B:20:0x0042, B:22:0x0046, B:23:0x004a, B:26:0x0055, B:28:0x0059, B:29:0x005d, B:30:0x005f, B:32:0x0063, B:38:0x0076, B:39:0x007a, B:41:0x007e, B:19:0x003f, B:37:0x0073), top: B:91:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:52:0x00ad, B:53:0x00b0, B:45:0x008e, B:46:0x0091, B:47:0x0095, B:49:0x009b, B:14:0x002f, B:16:0x0033, B:20:0x0042, B:22:0x0046, B:23:0x004a, B:26:0x0055, B:28:0x0059, B:29:0x005d, B:30:0x005f, B:32:0x0063, B:38:0x0076, B:39:0x007a, B:41:0x007e, B:19:0x003f, B:37:0x0073), top: B:91:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:52:0x00ad, B:53:0x00b0, B:45:0x008e, B:46:0x0091, B:47:0x0095, B:49:0x009b, B:14:0x002f, B:16:0x0033, B:20:0x0042, B:22:0x0046, B:23:0x004a, B:26:0x0055, B:28:0x0059, B:29:0x005d, B:30:0x005f, B:32:0x0063, B:38:0x0076, B:39:0x007a, B:41:0x007e, B:19:0x003f, B:37:0x0073), top: B:91:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settleResources(X.HtJ<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.settleResources(X.HtJ):java.lang.Object");
    }

    public final Object awaitCleanup(HtJ<? super Boolean> htJ) {
        return C3cG.A0W(this.cleanup, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitPage(long r6, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEnginePage> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserConnection.C124101
            if (r0 == 0) goto L3e
            r4 = r8
            com.facebook.aura.localbrowser.LocalBrowserConnection$awaitPage$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserConnection.C124101) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L45
            X.Hwg.A00(r3)
        L20:
            boolean r0 = X.AnonymousClass001.A1X(r3)
            r1 = 0
            if (r0 == 0) goto L44
            com.facebook.aura.localbrowser.core.BrowserEnginePage r2 = r5.page
            if (r2 == 0) goto L44
            boolean r0 = r5.fenced
            if (r0 != 0) goto L44
            return r2
        L30:
            X.Hwg.A00(r3)
            r4.J$0 = r6
            r4.label = r0
            java.lang.Object r3 = r5.awaitConnection(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L3e:
            com.facebook.aura.localbrowser.LocalBrowserConnection$awaitPage$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserConnection$awaitPage$1
            r4.<init>(r8)
            goto L12
        L44:
            return r1
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.awaitPage(long, X.HtJ):java.lang.Object");
    }

    public final BrowserEnginePage getPage() {
        return this.page;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final boolean isReady() {
        return AnonymousClass003.A1Z(this.connected) && !this.fenced;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepare(long r23, X.HtJ<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.prepare(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settle(X.HtJ<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.localbrowser.LocalBrowserConnection.C124171
            if (r0 == 0) goto L21
            r5 = r7
            com.facebook.aura.localbrowser.LocalBrowserConnection$settle$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserConnection.C124171) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L27
            int r0 = r5.I$0
            goto L3c
        L21:
            com.facebook.aura.localbrowser.LocalBrowserConnection$settle$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserConnection$settle$1
            r5.<init>(r7)
            goto L12
        L27:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L2c:
            X.Hwg.A00(r4)
            r5.I$0 = r3     // Catch: java.lang.Throwable -> L49
            r5.label = r0     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r6.settleResources(r5)     // Catch: java.lang.Throwable -> L49
            if (r4 != r2) goto L3a
            return r2
        L3a:
            r0 = 0
            goto L3f
        L3c:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L47
        L3f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L47
            X.Hsz<java.lang.Boolean> r0 = r6.cleanup
            X.C3cG.A1F(r0, r4)
            return r4
        L47:
            r2 = move-exception
            goto L4b
        L49:
            r2 = move-exception
            r0 = 0
        L4b:
            X.Hsz<java.lang.Boolean> r1 = r6.cleanup
            if (r0 == 0) goto L50
            r3 = 1
        L50:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C3cG.A1F(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserConnection.settle(X.HtJ):java.lang.Object");
    }

    private final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    public final void destroyed() {
        checkMainThread();
        BrowserEnginePage browserEnginePage = this.page;
        if (browserEnginePage != null) {
            browserEnginePage.destroyed(this.appliedPageRevision + 1);
        }
    }

    public final void fence() {
        BrowserEngineGroup browserEngineGroup;
        checkMainThread();
        if (this.fenced) {
            return;
        }
        this.fenced = true;
        this.session.target.setBrowsingEnabled(false);
        HoC hoC = this.attachRetry;
        BrowserEngineSettlement browserEngineSettlementRetire = null;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.attachRetry = null;
        AnonymousClass003.A14(this.connected, false);
        if (this.closeAttempt == null) {
            BrowserEnginePage browserEnginePage = this.page;
            this.removal = browserEnginePage != null ? browserEnginePage.remove() : null;
            if (this.session.task == null && (browserEngineGroup = this.group) != null) {
                browserEngineSettlementRetire = browserEngineGroup.retire();
            }
            this.retirement = browserEngineSettlementRetire;
        }
    }
}
