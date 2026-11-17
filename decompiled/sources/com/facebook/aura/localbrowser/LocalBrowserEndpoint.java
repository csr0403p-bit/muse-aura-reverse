package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C0881AGi;
import X.C0924AIa;
import X.C10543Hqv;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C7qW;
import X.C8j2;
import X.C9jH;
import X.C9sU;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GAt;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.os.SystemClock;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.pairs.ConnectionsResourceKt;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.BindingId;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.BrowserTaskId;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LocalBrowserEndpoint {
    public static final int $stable = 8;
    public static final String COMMAND = "browser.endpoint.v1";
    public static final String HARNESS_KIND = "core_sdk";
    public static final int HARNESS_VERSION = 2;
    public static final long LAUNCH_REPLY_MARGIN_MS = 1500;
    public static final int MAX_OPERATIONS = 256;
    public static final int MAX_TASKS = 64;
    public static final int REVISION = 2;
    public final LocalBrowserBlockedPolicy blockedPolicy;
    public volatile boolean closed;
    public boolean closing;
    public volatile long generation;
    public final LocalBrowserHeaderPolicy headerPolicy;
    public Journal journal;
    public boolean mutationPending;
    public volatile boolean navigationConsentSupported;
    public long navigationOutcomeSequence;
    public NavigationPolicy navigationPolicy;
    public final LocalBrowserTaskRegistry registry;
    public final LocalBrowserRuntime runtime;
    public final String runtimeId;
    public final C3UX scope;
    public final LinkedHashMap<String, LocalBrowserTask> tasks;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<String> MUTATIONS = BFI.A0H(new String[]{"browser.task.register", "browser.task.create_target", "browser.task.retire", "browser.task.control", "browser.task.policy", "browser.task.blocked_policy", "browser.task.header_policy", "browser.task.site_access"});

    public final class Journal {
        public final long generation;
        public long operationSequence;
        public final LinkedHashMap<String, Mutation> operations = C3cG.A0j();

        public final long getGeneration() {
            return this.generation;
        }

        public final long getOperationSequence() {
            return this.operationSequence;
        }

        public final LinkedHashMap<String, Mutation> getOperations() {
            return this.operations;
        }

        public final void setOperationSequence(long j) {
            this.operationSequence = j;
        }

        public Journal(long j) {
            this.generation = j;
        }
    }

    public final class Mutation {
        public final String method;
        public final JsonObject params;
        public final InterfaceC10560Hsz<JsonObject> result;

        public final String getMethod() {
            return this.method;
        }

        public final JsonObject getParams() {
            return this.params;
        }

        public final InterfaceC10560Hsz<JsonObject> getResult() {
            return this.result;
        }

        public Mutation(String str, JsonObject jsonObject, InterfaceC10560Hsz<JsonObject> interfaceC10560Hsz) {
            AnonymousClass005.A0x(str, jsonObject, interfaceC10560Hsz);
            this.method = str;
            this.params = jsonObject;
            this.result = interfaceC10560Hsz;
        }
    }

    public final class NavigationPolicy {
        public final Set<String> domains;
        public final JsonObject params;
        public final long revision;

        public final Set<String> getDomains() {
            return this.domains;
        }

        public final JsonObject getParams() {
            return this.params;
        }

        public final long getRevision() {
            return this.revision;
        }

        public NavigationPolicy(JsonObject jsonObject, long j, Set<String> set) {
            AnonymousClass003.A0v(jsonObject, set);
            this.params = jsonObject;
            this.revision = j;
            this.domains = set;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$close$1", f = "LocalBrowserEndpoint.kt", l = {667}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$close$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$close$1$1", f = "LocalBrowserEndpoint.kt", l = {670, 678}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$close$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01991 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public int label;
            public final /* synthetic */ LocalBrowserEndpoint this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01991(LocalBrowserEndpoint localBrowserEndpoint, HtJ<? super C01991> htJ) {
                super(2, htJ);
                this.this$0 = localBrowserEndpoint;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01991(this.this$0, htJ);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x004e
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // X.AbstractC8884Fsp
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r7.label
                    r4 = 2
                    r6 = 1
                    if (r0 == 0) goto L1a
                    if (r0 == r6) goto L12
                    if (r0 != r4) goto L72
                    X.Hwg.A00(r8)
                Lf:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L12:
                    java.lang.Object r5 = r7.L$1
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    goto L2b
                L1a:
                    X.Hwg.A00(r8)
                    com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r7.this$0
                    java.util.Collection r0 = X.C3cH.A0j(r0)
                    java.util.List r0 = X.AbstractC0878AGe.A0X(r0)
                    java.util.Iterator r5 = r0.iterator()
                L2b:
                    boolean r0 = r5.hasNext()
                    r2 = 0
                    if (r0 == 0) goto L56
                    java.lang.Object r1 = r5.next()
                    com.facebook.aura.localbrowser.LocalBrowserTask r1 = (com.facebook.aura.localbrowser.LocalBrowserTask) r1
                    X.C7384Etj.A0X(r1)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    r7.L$0 = r2     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    r7.L$1 = r5     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    r7.L$2 = r2     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    r7.L$3 = r2     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    r7.label = r6     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    com.facebook.aura.localbrowser.LocalBrowserTaskOutcome r0 = com.facebook.aura.localbrowser.LocalBrowserTaskOutcome.STOPPED     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    java.lang.Object r0 = r1.retire(r0, r7)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L78
                    if (r0 != r3) goto L2b
                    goto L77
                L4e:
                    java.lang.String r1 = "LocalBrowserEndpoint"
                    java.lang.String r0 = "Browser task cleanup failed"
                    X.CFK.A06(r1, r0)
                    goto L2b
                L56:
                    com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r7.this$0
                    com.facebook.aura.localbrowser.LocalBrowserHeaderPolicy r0 = r0.headerPolicy
                    r0.close()
                    com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r7.this$0
                    com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy r0 = r0.blockedPolicy
                    r7.L$0 = r2
                    r7.L$1 = r2
                    r7.L$2 = r2
                    r7.L$3 = r2
                    r7.label = r4
                    java.lang.Object r0 = r0.close(r7)
                    if (r0 != r3) goto Lf
                    return r3
                L72:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L77:
                    return r3
                L78:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.AnonymousClass1.C01991.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C01991(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserEndpoint.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HwK hwK = HwK.A00;
                    C01991 c01991 = new C01991(LocalBrowserEndpoint.this, null);
                    this.label = 1;
                    if (GAo.A00(this, hwK, c01991) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                Hxb.A03(null, LocalBrowserEndpoint.this.scope);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Hxb.A03(null, LocalBrowserEndpoint.this.scope);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserEndpoint.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint", f = "LocalBrowserEndpoint.kt", l = {440}, m = "createTarget", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$createTarget$1, reason: invalid class name and case insensitive filesystem */
    public final class C124201 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124201(HtJ<? super C124201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpoint.this.createTarget(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint", f = "LocalBrowserEndpoint.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__}, m = "installPolicy", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$1, reason: invalid class name and case insensitive filesystem */
    public final class C124211 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124211(HtJ<? super C124211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpoint.this.installPolicy(null, null, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$2", f = "LocalBrowserEndpoint.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super BrowserEngine>, Object> {
        public final /* synthetic */ long $deadline;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$deadline = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LocalBrowserEndpoint.this.new AnonymousClass2(this.$deadline, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserRuntime localBrowserRuntime = LocalBrowserEndpoint.this.runtime;
                long j = this.$deadline;
                this.label = 1;
                obj = localBrowserRuntime.createPolicyEngine(j, this);
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
        public final Object invoke(HtJ<? super BrowserEngine> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint", f = "LocalBrowserEndpoint.kt", l = {155}, m = "inventory", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$inventory$1, reason: invalid class name and case insensitive filesystem */
    public final class C124221 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124221(HtJ<? super C124221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpoint.this.inventory(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$inventory$2", f = "LocalBrowserEndpoint.kt", l = {155}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$inventory$2, reason: invalid class name and case insensitive filesystem */
    public final class C124232 extends AbstractC07127nr implements G0U<HtJ<? super BrowserEngine>, Object> {
        public final /* synthetic */ long $deadline;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124232(long j, HtJ<? super C124232> htJ) {
            super(1, htJ);
            this.$deadline = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LocalBrowserEndpoint.this.new C124232(this.$deadline, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserRuntime localBrowserRuntime = LocalBrowserEndpoint.this.runtime;
                long j = this.$deadline;
                this.label = 1;
                obj = localBrowserRuntime.createPolicyEngine(j, this);
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
        public final Object invoke(HtJ<? super BrowserEngine> htJ) {
            return ((C124232) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3", f = "LocalBrowserEndpoint.kt", l = {245}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$mutate$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $deadline;
        public final /* synthetic */ String $id;
        public final /* synthetic */ HatchNodeInvocation $invocation;
        public final /* synthetic */ Journal $journal;
        public final /* synthetic */ String $method;
        public final /* synthetic */ JsonObject $params;
        public final /* synthetic */ InterfaceC10560Hsz<JsonObject> $result;
        public final /* synthetic */ long $sequence;
        public int label;
        public final /* synthetic */ LocalBrowserEndpoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, Journal journal, long j, InterfaceC10560Hsz<JsonObject> interfaceC10560Hsz, LocalBrowserEndpoint localBrowserEndpoint, long j2, HatchNodeInvocation hatchNodeInvocation, JsonObject jsonObject, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$method = str;
            this.$id = str2;
            this.$journal = journal;
            this.$sequence = j;
            this.$result = interfaceC10560Hsz;
            this.this$0 = localBrowserEndpoint;
            this.$deadline = j2;
            this.$invocation = hatchNodeInvocation;
            this.$params = jsonObject;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$method, this.$id, this.$journal, this.$sequence, this.$result, this.this$0, this.$deadline, this.$invocation, this.$params, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objOperation = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(objOperation);
                        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
                        String str = this.$method;
                        String str2 = this.$id;
                        LocalBrowserEndpoint$mutate$3$value$1 localBrowserEndpoint$mutate$3$value$1 = new LocalBrowserEndpoint$mutate$3$value$1(this.$deadline, this.$invocation, this.this$0, this.$journal, str, this.$params, null);
                        this.label = 1;
                        objOperation = localBrowserTelemetry.operation(str, str2, null, localBrowserEndpoint$mutate$3$value$1, this);
                        if (objOperation == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objOperation);
                    }
                    this.$journal.operationSequence = this.$sequence;
                    ((GAt) this.$result).A0R((JsonObject) objOperation);
                } catch (LocalBrowserEndpointFailure e) {
                    this.$result.A6f(e);
                } catch (CancellationException e2) {
                    InterfaceC10560Hsz<JsonObject> interfaceC10560Hsz = this.$result;
                    C9jH c9jHA0E = AGH.A0E();
                    interfaceC10560Hsz.A6f(new LocalBrowserEndpointFailure("deadline_exceeded", true, null, null, c9jHA0E, c9jHA0E));
                    throw e2;
                } catch (Exception unused) {
                    this.$journal.operationSequence = this.$sequence;
                    InterfaceC10560Hsz<JsonObject> interfaceC10560Hsz2 = this.$result;
                    C9jH c9jHA0E2 = AGH.A0E();
                    interfaceC10560Hsz2.A6f(new LocalBrowserEndpointFailure("native_failed", true, null, null, c9jHA0E2, c9jHA0E2));
                }
                this.this$0.mutationPending = false;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.mutationPending = false;
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint", f = "LocalBrowserEndpoint.kt", l = {319, 331, 359, 367, 376, 425, 425}, m = "register", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$register$1, reason: invalid class name and case insensitive filesystem */
    public final class C124241 extends HzP {
        public int I$0;
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
        public int label;
        public /* synthetic */ Object result;

        public C124241(HtJ<? super C124241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpoint.this.register(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$register$10", f = "LocalBrowserEndpoint.kt", l = {425}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$register$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C10543Hqv<BrowserEngine> $engine;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(C10543Hqv<BrowserEngine> c10543Hqv, HtJ<? super AnonymousClass10> htJ) {
            super(2, htJ);
            this.$engine = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass10(this.$engine, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine.element;
                if (browserEngine == null) {
                    return null;
                }
                this.label = 1;
                obj = browserEngine.shutdown(this);
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
            return new AnonymousClass10(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint", f = "LocalBrowserEndpoint.kt", l = {470}, m = "retire", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$retire$1, reason: invalid class name and case insensitive filesystem */
    public final class C124251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124251(HtJ<? super C124251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpoint.this.retire(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpoint$updateConnection$1", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpoint$updateConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C124261 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $next;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124261(long j, HtJ<? super C124261> htJ) {
            super(2, htJ);
            this.$next = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserEndpoint.this.new C124261(this.$next, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (LocalBrowserEndpoint.this.isCurrent(this.$next)) {
                Collection collectionA0j = C3cH.A0j(LocalBrowserEndpoint.this);
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj2 : collectionA0j) {
                    if (!((LocalBrowserTask) obj2).retired) {
                        arrayListA0h.add(obj2);
                    }
                }
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    ((LocalBrowserTask) it.next()).viewer.retryPendingRelease();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124261) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void acceptConnection(HatchNodeInvocation hatchNodeInvocation) {
        C7384Etj.A0Y(hatchNodeInvocation, 0);
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (!AnonymousClass003.A1Y(hatchNodeInvocation.isConnectionCurrent) || !isCurrent(hatchNodeInvocation.connectionGeneration)) {
            throw C3cJ.A08(false);
        }
        Collection collectionA0j = C3cH.A0j(this);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = collectionA0j.iterator();
        while (it.hasNext()) {
            C3cJ.A0q(arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            ((LocalBrowserTask) it2.next()).acceptConnection(hatchNodeInvocation);
        }
    }

    public final void stopOwnedTasks(LocalBrowserTaskOutcome localBrowserTaskOutcome) {
        C7384Etj.A0Y(localBrowserTaskOutcome, 0);
        Collection collectionA0j = C3cH.A0j(this);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = collectionA0j.iterator();
        while (it.hasNext()) {
            C3cJ.A0q(arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            ((LocalBrowserTask) it2.next()).interrupt(localBrowserTaskOutcome);
        }
    }

    public final LocalBrowserTask task(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        LocalBrowserTask localBrowserTask = this.tasks.get(browserTaskBinding.browserTaskId.value);
        if (localBrowserTask == null || !C7384Etj.areEqual(localBrowserTask.bindingId, browserTaskBinding.bindingId.value)) {
            localBrowserTask = null;
        } else if (localBrowserTask.isCurrent()) {
            localBrowserTask.recordContact();
            return localBrowserTask;
        }
        LocalBrowserEndpointFailure localBrowserEndpointFailureLostToRestart = lostToRestart(browserTaskBinding);
        if (localBrowserEndpointFailureLostToRestart == null) {
            throw unusable(localBrowserTask);
        }
        throw localBrowserEndpointFailureLostToRestart;
    }

    public final JsonObject taskState(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        String str;
        LocalBrowserSession session;
        LocalBrowserSession session2;
        C7384Etj.A0Y(jsonObject, 0);
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (!LocalBrowserEndpointKt.requiredId(jsonObject, "expected_browser_instance_id").equals(this.runtimeId)) {
            throw C3cJ.A08(false);
        }
        LocalBrowserTask localBrowserTaskBindingTask = bindingTask(jsonObject);
        String strRequiredId = LocalBrowserEndpointKt.requiredId(jsonObject, "state");
        int iHashCode = strRequiredId.hashCode();
        if (iHashCode == -1402931637) {
            str = "completed";
        } else {
            if (iHashCode != -1281977283) {
                if (iHashCode == 1525164849 && strRequiredId.equals("working") && (session2 = localBrowserTaskBindingTask.getSession()) != null) {
                    session2.wake(LocalBrowserParkTrigger.TASK_STATE);
                }
                C2nw c2nw = new C2nw();
                identity(c2nw);
                C3cJ.A0h(localBrowserTaskBindingTask, c2nw);
                C7qW.A06("state", strRequiredId, c2nw);
                return c2nw.A00();
            }
            str = "failed";
        }
        if (strRequiredId.equals(str) && (session = localBrowserTaskBindingTask.getSession()) != null) {
            session.park(LocalBrowserParkTrigger.TASK_STATE);
        }
        C2nw c2nw2 = new C2nw();
        identity(c2nw2);
        C3cJ.A0h(localBrowserTaskBindingTask, c2nw2);
        C7qW.A06("state", strRequiredId, c2nw2);
        return c2nw2.A00();
    }

    public final synchronized void updateConnection(long j, boolean z) {
        if (j > this.generation) {
            this.navigationConsentSupported = z;
            this.generation = j;
            AnonymousClass001.A1J(new C124261(j, null), this.scope);
        }
    }

    public final void validateIdentity(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        if (LocalBrowserEndpointKt.requiredLong(jsonObject, "expected_websocket_generation") != this.generation || !LocalBrowserEndpointKt.requiredId(jsonObject, "expected_browser_instance_id").equals(this.runtimeId)) {
            throw C3cJ.A08(false);
        }
    }

    private final LocalBrowserTask bindingTask(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        String strRequiredId = LocalBrowserEndpointKt.requiredId(jsonObject, "binding_id");
        Iterator it = C3cH.A0j(this).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (C7384Etj.areEqual(((LocalBrowserTask) next).bindingId, strRequiredId)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        LocalBrowserTask localBrowserTask = (LocalBrowserTask) obj;
        if (localBrowserTask == null || !localBrowserTask.isCurrent()) {
            throw unusable(localBrowserTask);
        }
        localBrowserTask.recordContact();
        return localBrowserTask;
    }

    private final JsonObject consentMutation(String str, Function0<JsonObject> function0) throws LocalBrowserEndpointFailure {
        if (!this.navigationConsentSupported) {
            throw C3cI.A0E("unsupported_operation");
        }
        try {
            return function0.invoke();
        } catch (ApiException e) {
            if (e instanceof ApiException.Malformed) {
                str = "invalid_arguments";
            } else if (!(e instanceof ApiException.LifecycleConflict)) {
                str = e instanceof ApiException.LimitExceeded ? "capacity" : "sdk_refused";
            }
            throw C3cI.A0E(str);
        } catch (CharacterCodingException unused) {
            throw C3cJ.A07();
        } catch (SerializationException unused2) {
            throw C3cJ.A07();
        }
    }

    private final JsonObject consentObject(byte[] bArr) {
        JsonObject jsonObject;
        JsonElement jsonElementA04 = HatchJsonKt.HatchJson.A04(AbstractC2159Azp.A10(bArr, bArr.length));
        if (!(jsonElementA04 instanceof JsonObject) || (jsonObject = (JsonObject) jsonElementA04) == null) {
            throw new SerializationException("Invalid navigation consent object");
        }
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createTarget(com.facebook.aura.nodes.api.HatchNodeInvocation r13, kotlinx.serialization.json.JsonObject r14, long r15, X.HtJ<? super kotlinx.serialization.json.JsonObject> r17) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.createTarget(com.facebook.aura.nodes.api.HatchNodeInvocation, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }

    private final void identity(C2nw c2nw) {
        C7qW.A06("browser_instance_id", this.runtimeId, c2nw);
        C7qW.A05(Long.valueOf(this.generation), "websocket_generation", c2nw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installPolicy(com.facebook.aura.nodes.api.HatchNodeInvocation r7, kotlinx.serialization.json.JsonObject r8, long r9, X.G0U<? super kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject> r11, X.HtJ<? super kotlinx.serialization.json.JsonObject> r12) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            r6 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.LocalBrowserEndpoint.C124211
            if (r0 == 0) goto L5c
            r5 = r12
            com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserEndpoint.C124211) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 != r3) goto L9a
            java.lang.Object r11 = r5.L$2
            X.G0U r11 = (X.G0U) r11
            java.lang.Object r8 = r5.L$1
            kotlinx.serialization.json.JsonObject r8 = (kotlinx.serialization.json.JsonObject) r8
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.nodes.api.HatchNodeInvocation r7 = (com.facebook.aura.nodes.api.HatchNodeInvocation) r7
            X.Hwg.A00(r1)
        L2c:
            r6.validateIdentity(r8)
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r7.isConnectionCurrent
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto L93
            long r0 = r7.connectionGeneration
            boolean r0 = r6.isCurrent(r0)
            if (r0 == 0) goto L93
            goto L62
        L40:
            X.Hwg.A00(r1)
            com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy r2 = r6.blockedPolicy
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$2
            r0.<init>(r9, r1)
            r5.L$0 = r7
            r5.L$1 = r8
            r5.L$2 = r11
            r5.J$0 = r9
            r5.label = r3
            java.lang.Object r0 = r2.initialize(r0, r5)
            if (r0 != r4) goto L2c
            return r4
        L5c:
            com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserEndpoint$installPolicy$1
            r5.<init>(r12)
            goto L12
        L62:
            java.lang.Object r1 = r11.invoke(r8)     // Catch: com.hatch.browser.protocol.ApiException -> L76
            java.util.Map r1 = (java.util.Map) r1     // Catch: com.hatch.browser.protocol.ApiException -> L76
            kotlinx.serialization.json.JsonObject r0 = r6.identity()     // Catch: com.hatch.browser.protocol.ApiException -> L76
            java.util.LinkedHashMap r0 = X.AGH.A02(r1, r0)     // Catch: com.hatch.browser.protocol.ApiException -> L76
            kotlinx.serialization.json.JsonObject r4 = new kotlinx.serialization.json.JsonObject     // Catch: com.hatch.browser.protocol.ApiException -> L76
            r4.<init>(r0)     // Catch: com.hatch.browser.protocol.ApiException -> L76
            return r4
        L76:
            r1 = move-exception
            boolean r0 = r1 instanceof com.hatch.browser.protocol.ApiException.Malformed
            if (r0 != 0) goto L90
            boolean r0 = r1 instanceof com.hatch.browser.protocol.ApiException.LifecycleConflict
            if (r0 != 0) goto L8d
            boolean r0 = r1 instanceof com.hatch.browser.protocol.ApiException.LimitExceeded
            if (r0 == 0) goto L8a
            java.lang.String r0 = "capacity"
        L85:
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r0 = X.C3cI.A0E(r0)
            throw r0
        L8a:
            java.lang.String r0 = "sdk_refused"
            goto L85
        L8d:
            java.lang.String r0 = "stale_policy"
            goto L85
        L90:
            java.lang.String r0 = "invalid_arguments"
            goto L85
        L93:
            java.lang.String r0 = "stale_connection"
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r0 = X.C3cI.A0E(r0)
            throw r0
        L9a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.installPolicy(com.facebook.aura.nodes.api.HatchNodeInvocation, kotlinx.serialization.json.JsonObject, long, X.G0U, X.HtJ):java.lang.Object");
    }

    private final LocalBrowserEndpointFailure lostToRestart(BrowserTaskBinding browserTaskBinding) {
        Object objPrevious;
        String strLogicalBrowserTaskId = BrowserTaskIdKt.logicalBrowserTaskId(browserTaskBinding.browserTaskId.value);
        Set<String> setKeySet = this.tasks.keySet();
        C7384Etj.A0U(setKeySet);
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                C7384Etj.A0X(strA0j);
                if (BrowserTaskIdKt.logicalBrowserTaskId(strA0j).equals(strLogicalBrowserTaskId)) {
                    return null;
                }
            }
        }
        ListIterator listIteratorA0n = C3cG.A0n(this.registry.records.getValue());
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIteratorA0n.previous();
            LocalBrowserTaskRecordJson localBrowserTaskRecordJson = (LocalBrowserTaskRecordJson) objPrevious;
            if (C7384Etj.areEqual(localBrowserTaskRecordJson.taskId, browserTaskBinding.browserTaskId.value) && C7384Etj.areEqual(localBrowserTaskRecordJson.bindingId, browserTaskBinding.bindingId.value) && localBrowserTaskRecordJson.outcome == LocalBrowserTaskOutcome.INTERRUPTED) {
                break;
            }
        }
        LocalBrowserTaskRecordJson localBrowserTaskRecordJson2 = (LocalBrowserTaskRecordJson) objPrevious;
        if (localBrowserTaskRecordJson2 != null) {
            return C3cI.A0F("engine_unavailable", localBrowserTaskRecordJson2.taskId, "process_restarted");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r7.equals(r0) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.serialization.json.JsonObject policy(kotlinx.serialization.json.JsonObject r11) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.policy(kotlinx.serialization.json.JsonObject):kotlinx.serialization.json.JsonObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retire(kotlinx.serialization.json.JsonObject r16, X.HtJ<? super kotlinx.serialization.json.JsonObject> r17) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserEndpoint.C124251
            if (r0 == 0) goto La8
            r8 = r3
            com.facebook.aura.localbrowser.LocalBrowserEndpoint$retire$1 r8 = (com.facebook.aura.localbrowser.LocalBrowserEndpoint.C124251) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r8.label = r2
        L14:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r6 = "binding_id"
            r9 = 1
            if (r0 == 0) goto L53
            if (r0 != r9) goto Laf
            java.lang.Object r5 = r8.L$2
            com.facebook.aura.localbrowser.LocalBrowserTask r5 = (com.facebook.aura.localbrowser.LocalBrowserTask) r5
            X.Hwg.A00(r1)
        L28:
            X.2nw r2 = new X.2nw
            r2.<init>()
            r15.identity(r2)
            java.lang.String r1 = "browser_task_id"
            java.lang.String r0 = r5.id
            X.C7qW.A06(r1, r0, r2)
            java.lang.String r0 = r5.bindingId
            X.C7qW.A06(r6, r0, r2)
            java.lang.String r1 = "state"
            java.lang.String r0 = "retired"
            X.C7qW.A06(r1, r0, r2)
            boolean r0 = r5.cleanupComplete
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "cleanup_complete"
            X.C7qW.A04(r1, r0, r2)
            kotlinx.serialization.json.JsonObject r0 = r2.A00()
            return r0
        L53:
            X.Hwg.A00(r1)
            r0 = r16
            java.lang.String r10 = com.facebook.aura.localbrowser.LocalBrowserEndpointKt.requiredId(r0, r6)
            java.util.Collection r0 = X.C3cH.A0j(r15)
            java.util.Iterator r14 = r0.iterator()
            r13 = 0
            r12 = 0
            r5 = r13
        L67:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r11 = r14.next()
            r1 = r11
            com.facebook.aura.localbrowser.LocalBrowserTask r1 = (com.facebook.aura.localbrowser.LocalBrowserTask) r1
            java.lang.String r0 = r1.bindingId
            boolean r0 = X.C7384Etj.areEqual(r0, r10)
            if (r0 == 0) goto L67
            boolean r0 = r1.retired
            if (r0 != 0) goto L8a
            com.facebook.aura.localbrowser.TaskConnection r0 = r1.connection
            long r3 = r0.generation
            long r1 = r15.generation
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
        L8a:
            if (r12 != 0) goto L91
            r5 = r11
            r12 = 1
            goto L67
        L8f:
            if (r12 != 0) goto L92
        L91:
            r5 = r13
        L92:
            com.facebook.aura.localbrowser.LocalBrowserTask r5 = (com.facebook.aura.localbrowser.LocalBrowserTask) r5
            if (r5 == 0) goto Lb4
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.L$2 = r5
            r8.label = r9
            com.facebook.aura.localbrowser.LocalBrowserTaskOutcome r0 = com.facebook.aura.localbrowser.LocalBrowserTaskOutcome.STOPPED
            java.lang.Object r0 = r5.retire(r0, r8)
            if (r0 != r7) goto L28
            return r7
        La8:
            com.facebook.aura.localbrowser.LocalBrowserEndpoint$retire$1 r8 = new com.facebook.aura.localbrowser.LocalBrowserEndpoint$retire$1
            r8.<init>(r3)
            goto L14
        Laf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb4:
            java.lang.String r0 = "stale_task"
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r0 = X.C3cI.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.retire(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject siteAccess(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        if (!this.navigationConsentSupported) {
            throw C3cI.A0E("unsupported_operation");
        }
        try {
            return new JsonObject(AGH.A02(consentObject(bindingTask(jsonObject).group.decideSiteAccess(C3cJ.A15(jsonObject))), identity()));
        } catch (ApiException e) {
            throw C3cI.A0E(!(e instanceof ApiException.Malformed) ? !(e instanceof ApiException.LifecycleConflict) ? e instanceof ApiException.LimitExceeded ? "capacity" : "sdk_refused" : "stale_navigation" : "invalid_arguments");
        } catch (CharacterCodingException unused) {
            throw C3cJ.A07();
        } catch (SerializationException unused2) {
            throw C3cJ.A07();
        }
    }

    public static /* synthetic */ void stopOwnedTasks$default(LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserTaskOutcome localBrowserTaskOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            localBrowserTaskOutcome = LocalBrowserTaskOutcome.STOPPED;
        }
        localBrowserEndpoint.stopOwnedTasks(localBrowserTaskOutcome);
    }

    private final LocalBrowserEndpointFailure unusable(LocalBrowserTask localBrowserTask) {
        return (localBrowserTask == null || !localBrowserTask.leftToJarvis) ? C3cI.A0E("stale_task") : C3cI.A0F("engine_unavailable", localBrowserTask.id, "task_lost");
    }

    public final void close() {
        if (this.closing) {
            return;
        }
        this.closing = true;
        this.closed = true;
        AnonymousClass001.A1J(new AnonymousClass1(null), this.scope);
    }

    public final LocalBrowserBlockedPolicy getBlockedPolicy() {
        return this.blockedPolicy;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final boolean getHasActiveTasks() {
        if (this.mutationPending) {
            return true;
        }
        Collection collectionA0j = C3cH.A0j(this);
        if (collectionA0j.isEmpty()) {
            return false;
        }
        Iterator it = collectionA0j.iterator();
        while (it.hasNext()) {
            if (!((LocalBrowserTask) it.next()).retired) {
                return true;
            }
        }
        return false;
    }

    public final boolean getHasUnfinishedTasks() {
        List<LocalBrowserTaskRecordJson> value = this.registry.records.getValue();
        if (!(value instanceof Collection) || !C3cG.A1N(value)) {
            for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : value) {
                if (localBrowserTaskRecordJson.outcome == null && C7384Etj.areEqual(localBrowserTaskRecordJson.runtimeId, this.runtimeId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final LocalBrowserHeaderPolicy getHeaderPolicy() {
        return this.headerPolicy;
    }

    public final boolean getNavigationConsentSupported() {
        return this.navigationConsentSupported;
    }

    public final String getRuntimeId() {
        return this.runtimeId;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inventory(com.facebook.aura.nodes.api.HatchNodeInvocation r16, long r17, X.HtJ<? super kotlinx.serialization.json.JsonObject> r19) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.inventory(com.facebook.aura.nodes.api.HatchNodeInvocation, long, X.HtJ):java.lang.Object");
    }

    public final boolean isCurrent(long j) {
        return !this.closed && this.runtime.isEnabled() && this.generation == j;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserEndpoint(LocalBrowserRuntime localBrowserRuntime, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(localBrowserRuntime, abstractC3358CGz);
        this.runtime = localBrowserRuntime;
        this.userSession = abstractC3358CGz;
        String strA0k = AnonymousClass002.A0k();
        this.runtimeId = strA0k;
        this.blockedPolicy = new LocalBrowserBlockedPolicy(strA0k, new LocalBrowserEndpoint$blockedPolicy$1(localBrowserRuntime));
        this.headerPolicy = new LocalBrowserHeaderPolicy(strA0k, new LocalBrowserEndpoint$headerPolicy$1(localBrowserRuntime));
        this.scope = C3cH.A0y(C3cH.A0u(), new LocalBrowserEndpoint$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
        this.tasks = C3cG.A0j();
        this.registry = LocalBrowserTaskRegistry.Companion.getInstance(abstractC3358CGz);
        this.journal = new Journal(0L);
    }

    private final LocalBrowserEndpointFailure capacityRefusal(String str) {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Collection collectionA0j = C3cH.A0j(this);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : collectionA0j) {
            if (!((LocalBrowserTask) obj).cleanupComplete) {
                arrayListA0h.add(obj);
            }
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("capacity_reason", str);
        c0924AIaA0u.put("capacity_limit", String.valueOf(this.runtime.getCapacity()));
        boolean z = arrayListA0h instanceof Collection;
        int i2 = 0;
        if (!z || !arrayListA0h.isEmpty()) {
            Iterator it = arrayListA0h.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((LocalBrowserTask) it.next()).retired && (i = i + 1) < 0) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        c0924AIaA0u.put("tasks_live", String.valueOf(i));
        if (!z || !arrayListA0h.isEmpty()) {
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                if (((LocalBrowserTask) it2.next()).retired && (i2 = i2 + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        c0924AIaA0u.put("tasks_cleanup_pending", String.valueOf(i2));
        Iterator it3 = arrayListA0h.iterator();
        if (it3.hasNext()) {
            Long lValueOf = Long.valueOf(jElapsedRealtime - ((LocalBrowserTask) it3.next()).lastContactMs);
            while (it3.hasNext()) {
                Long lValueOf2 = Long.valueOf(jElapsedRealtime - ((LocalBrowserTask) it3.next()).lastContactMs);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            C3cH.A1A("oldest_task_idle_ms", c0924AIaA0u, lValueOf.longValue());
        }
        return new LocalBrowserEndpointFailure("capacity", false, null, null, AGH.A0E(), AIW.A0K(c0924AIaA0u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject control(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        LocalBrowserControl localBrowserControl;
        LocalBrowserTask localBrowserTaskBindingTask = bindingTask(jsonObject);
        if (LocalBrowserEndpointKt.requiredLong(jsonObject, "expected_control_epoch") != localBrowserTaskBindingTask.getControlEpoch()) {
            throw C3cI.A0E("stale_control");
        }
        String strOptionalString = LocalBrowserEndpointKt.optionalString(jsonObject, "control_mode");
        if ("agent".equals(strOptionalString)) {
            localBrowserControl = LocalBrowserControl.AGENT;
        } else {
            if (!ConnectionsResourceKt.HUMAN_PARTICIPANT.equals(strOptionalString)) {
                throw C3cI.A0E("invalid_control");
            }
            localBrowserControl = LocalBrowserControl.USER;
        }
        if (!AbstractC0878AGe.A0k(BFI.A0H(new String[]{"takeover", "explicit", HatchCcvLoggingKt.FIELD_EXPIRY, C8j2.A00(21)}), LocalBrowserEndpointKt.optionalString(jsonObject, "reason"))) {
            throw C3cI.A0E("invalid_control");
        }
        TakeoverJournalJson control = localBrowserTaskBindingTask.setControl(localBrowserControl);
        C2nw c2nw = new C2nw();
        identity(c2nw);
        C3cJ.A0h(localBrowserTaskBindingTask, c2nw);
        C7qW.A06("control_mode", localBrowserControl != LocalBrowserControl.AGENT ? ConnectionsResourceKt.HUMAN_PARTICIPANT : "agent", c2nw);
        if (control != null) {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = TakeoverJournalJson.$stable;
            c2nw.A01("takeover_journal", c9sU.A03(control, TakeoverJournalJson$$serializer.INSTANCE));
        }
        C7qW.A05(Long.valueOf(localBrowserTaskBindingTask.getControlEpoch()), C8j2.A00(5), c2nw);
        C7qW.A06("operation_id", LocalBrowserEndpointKt.requiredId(jsonObject, "operation_id"), c2nw);
        C7qW.A05(Long.valueOf(LocalBrowserEndpointKt.requiredLong(jsonObject, "operation_sequence")), "operation_sequence", c2nw);
        C7qW.A05(Long.valueOf(this.generation), "operation_generation", c2nw);
        C0881AGi c0881AGi = C0881AGi.A00;
        c2nw.A01("site_access", new JsonArray(c0881AGi));
        c2nw.A01("settled_pending_ids", new JsonArray(c0881AGi));
        return c2nw.A00();
    }

    public final List<String> browserTaskIds() {
        Collection collectionA0j = C3cH.A0j(this);
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionA0j);
        Iterator it = collectionA0j.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C3cH.A0b((LocalBrowserTask) it.next()));
        }
        return arrayListA0i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        throw X.C3cI.A0E("busy");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutate(com.facebook.aura.nodes.api.HatchNodeInvocation r15, java.lang.String r16, kotlinx.serialization.json.JsonObject r17, long r18, X.HtJ<? super kotlinx.serialization.json.JsonObject> r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.mutate(com.facebook.aura.nodes.api.HatchNodeInvocation, java.lang.String, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [X.Hqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object register(com.facebook.aura.nodes.api.HatchNodeInvocation r30, kotlinx.serialization.json.JsonObject r31, long r32, X.HtJ<? super kotlinx.serialization.json.JsonObject> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpoint.register(com.facebook.aura.nodes.api.HatchNodeInvocation, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }

    public final JsonObject identity() {
        C2nw c2nw = new C2nw();
        identity(c2nw);
        return c2nw.A00();
    }

    public final LocalBrowserTask task(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return task(new BrowserTaskBinding(new BrowserTaskId(str), new BindingId(str2)));
    }
}
