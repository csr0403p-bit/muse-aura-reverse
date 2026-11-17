package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06H;
import X.C10543Hqv;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7qW;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.localbrowser.core.BrowserEngineResult;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class LocalBrowserNodeHandler implements HatchNodeInvocationHandler {
    public static final int $stable = 8;

    @Deprecated
    public static final String AVAILABLE = "available";

    @Deprecated
    public static final String CLOSED = "closed";

    @Deprecated
    public static final String CONTROL = "control";
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_RESULT_BYTES = 1048576;

    @Deprecated
    public static final String REPORT = "report";

    @Deprecated
    public static final int RESULT_FRAMING_BYTES = 4096;

    @Deprecated
    public static final long RESULT_MARGIN_MS = 1000;

    @Deprecated
    public static final String SITE = "site";
    public final Set<String> commands;
    public final AbstractC3358CGz userSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NodeFailure {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ NodeFailure[] $VALUES;
        public static final NodeFailure BUSY;
        public static final NodeFailure HOST_UNAVAILABLE;
        public static final NodeFailure INVALID_ARGUMENTS;
        public static final NodeFailure NATIVE_PICKER_BLOCKED;
        public static final NodeFailure NO_SESSION;
        public static final NodeFailure OPEN_FAILED;
        public static final NodeFailure SESSION_CLOSED;
        public static final NodeFailure SESSION_IN_USE;
        public static final NodeFailure STALE_CONNECTION;
        public static final NodeFailure STALE_SESSION;
        public static final NodeFailure UNAVAILABLE;
        public static final NodeFailure URL_UNSUPPORTED;
        public static final NodeFailure USER_ACTION_REQUIRED;
        public static final NodeFailure USER_IN_CONTROL;
        public final String code;

        static {
            NodeFailure nodeFailure = new NodeFailure("UNAVAILABLE", 0, "unavailable");
            UNAVAILABLE = nodeFailure;
            NodeFailure nodeFailure2 = new NodeFailure("STALE_CONNECTION", 1, "stale_connection");
            STALE_CONNECTION = nodeFailure2;
            NodeFailure nodeFailure3 = new NodeFailure("INVALID_ARGUMENTS", 2, "invalid_arguments");
            INVALID_ARGUMENTS = nodeFailure3;
            NodeFailure nodeFailure4 = new NodeFailure("URL_UNSUPPORTED", 3, "url_unsupported");
            URL_UNSUPPORTED = nodeFailure4;
            NodeFailure nodeFailure5 = new NodeFailure("SESSION_IN_USE", 4, "session_in_use");
            SESSION_IN_USE = nodeFailure5;
            NodeFailure nodeFailure6 = new NodeFailure("OPEN_FAILED", 5, "open_failed");
            OPEN_FAILED = nodeFailure6;
            NodeFailure nodeFailure7 = new NodeFailure("HOST_UNAVAILABLE", 6, "host_unavailable");
            HOST_UNAVAILABLE = nodeFailure7;
            NodeFailure nodeFailure8 = new NodeFailure("NO_SESSION", 7, "no_session");
            NO_SESSION = nodeFailure8;
            NodeFailure nodeFailure9 = new NodeFailure("STALE_SESSION", 8, "stale_session");
            STALE_SESSION = nodeFailure9;
            NodeFailure nodeFailure10 = new NodeFailure("SESSION_CLOSED", 9, "session_closed");
            SESSION_CLOSED = nodeFailure10;
            NodeFailure nodeFailure11 = new NodeFailure("USER_IN_CONTROL", 10, "user_in_control");
            USER_IN_CONTROL = nodeFailure11;
            NodeFailure nodeFailure12 = new NodeFailure("USER_ACTION_REQUIRED", 11, "user_action_required");
            USER_ACTION_REQUIRED = nodeFailure12;
            NodeFailure nodeFailure13 = new NodeFailure("NATIVE_PICKER_BLOCKED", 12, "native_picker_blocked");
            NATIVE_PICKER_BLOCKED = nodeFailure13;
            NodeFailure nodeFailure14 = new NodeFailure("BUSY", 13, "busy");
            BUSY = nodeFailure14;
            NodeFailure[] nodeFailureArr = {nodeFailure, nodeFailure2, nodeFailure3, nodeFailure4, nodeFailure5, nodeFailure6, nodeFailure7, nodeFailure8, nodeFailure9, nodeFailure10, nodeFailure11, nodeFailure12, nodeFailure13, nodeFailure14};
            $VALUES = nodeFailureArr;
            $ENTRIES = C3cG.A0w(nodeFailureArr);
        }

        public static Ey9<NodeFailure> getEntries() {
            return $ENTRIES;
        }

        public static NodeFailure valueOf(String str) {
            return (NodeFailure) Enum.valueOf(NodeFailure.class, str);
        }

        public static NodeFailure[] values() {
            return (NodeFailure[]) $VALUES.clone();
        }

        public final String getCode() {
            return this.code;
        }

        public NodeFailure(String str, int i, String str2) {
            this.code = str2;
        }
    }

    public interface SessionLookup {

        public final class Closed implements SessionLookup {
            public static final int $stable = 0;
            public final LocalBrowserCloseReason reason;

            public Closed(LocalBrowserCloseReason localBrowserCloseReason) {
                C7384Etj.A0Y(localBrowserCloseReason, 0);
                this.reason = localBrowserCloseReason;
            }

            public final LocalBrowserCloseReason getReason() {
                return this.reason;
            }
        }

        public final class None implements SessionLookup {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 1599986074;
            }
        }

        public final class Open implements SessionLookup {
            public static final int $stable = LocalBrowserSession.$stable;
            public final LocalBrowserSession session;

            public Open(LocalBrowserSession localBrowserSession) {
                C7384Etj.A0Y(localBrowserSession, 0);
                this.session = localBrowserSession;
            }

            public final LocalBrowserSession getSession() {
                return this.session;
            }
        }

        public final class Stale implements SessionLookup {
            public static final int $stable = 0;
            public static final Stale INSTANCE = new Stale();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Stale);
            }

            public String toString() {
                return "Stale";
            }

            public int hashCode() {
                return -1935284873;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler", f = "LocalBrowserNodeHandler.kt", l = {281}, m = "closeResult", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$closeResult$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNodeHandler.this.closeResult(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler", f = "LocalBrowserNodeHandler.kt", l = {32}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C124311 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124311(HtJ<? super C124311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNodeHandler.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2", f = "LocalBrowserNodeHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, R.styleable.maplibre_MapView_maplibre_uiRotateGestures, 52, 54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchNodeInvocationResult>, Object> {
        public final /* synthetic */ HatchNodeInvocation $invocation;
        public final /* synthetic */ C10543Hqv<HatchNodeInvocationResult> $ownedResult;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2$1", f = "LocalBrowserNodeHandler.kt", l = {50}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HatchNodeInvocationResult>, Object> {
            public final /* synthetic */ JsonObject $args;
            public final /* synthetic */ long $deadline;
            public final /* synthetic */ HatchNodeInvocation $invocation;
            public final /* synthetic */ LocalBrowserRuntime $runtime;
            public int label;
            public final /* synthetic */ LocalBrowserNodeHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LocalBrowserNodeHandler localBrowserNodeHandler, LocalBrowserRuntime localBrowserRuntime, HatchNodeInvocation hatchNodeInvocation, JsonObject jsonObject, long j, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = localBrowserNodeHandler;
                this.$runtime = localBrowserRuntime;
                this.$invocation = hatchNodeInvocation;
                this.$args = jsonObject;
                this.$deadline = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$runtime, this.$invocation, this.$args, this.$deadline, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    LocalBrowserNodeHandler localBrowserNodeHandler = this.this$0;
                    LocalBrowserRuntime localBrowserRuntime = this.$runtime;
                    HatchNodeInvocation hatchNodeInvocation = this.$invocation;
                    JsonObject jsonObject = this.$args;
                    long j = this.$deadline;
                    this.label = 1;
                    obj = localBrowserNodeHandler.open(localBrowserRuntime, hatchNodeInvocation, jsonObject, j, this);
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
            public final Object invoke(HtJ<? super HatchNodeInvocationResult> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[RETURN] */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v8, types: [com.facebook.aura.nodes.api.HatchNodeInvocationResult] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeInvocation hatchNodeInvocation, C10543Hqv<HatchNodeInvocationResult> c10543Hqv, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$invocation = hatchNodeInvocation;
            this.$ownedResult = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserNodeHandler.this.new AnonymousClass2(this.$invocation, this.$ownedResult, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchNodeInvocationResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler", f = "LocalBrowserNodeHandler.kt", l = {128, 153}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$3, reason: invalid class name */
    public final class AnonymousClass3 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNodeHandler.this.execute(null, null, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler", f = "LocalBrowserNodeHandler.kt", l = {83, 89}, m = "open", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$open$1, reason: invalid class name and case insensitive filesystem */
    public final class C124321 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C124321(HtJ<? super C124321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNodeHandler.this.open(null, null, null, 0L, this);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$reported$1, reason: invalid class name and case insensitive filesystem */
    public final class C124331 extends HatchNodeInvocationResult.Deferred {
        public final /* synthetic */ HatchNodeInvocation $invocation;
        public final /* synthetic */ BrowserEngineResult.Reported $result;
        public final /* synthetic */ LocalBrowserSession $session;

        public C124331(HatchNodeInvocation hatchNodeInvocation, BrowserEngineResult.Reported reported, LocalBrowserSession localBrowserSession) {
            this.$invocation = hatchNodeInvocation;
            this.$result = reported;
            this.$session = localBrowserSession;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.$result.close();
        }

        @Override // com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred
        public Object encode(HtJ<? super JsonObject> htJ) {
            return GAo.A00(htJ, C3cG.A0v(), new LocalBrowserNodeHandler$reported$1$encode$2(LocalBrowserNodeHandler.this, this.$invocation, this.$result, this.$session, null));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserNodeHandler", f = "LocalBrowserNodeHandler.kt", l = {323}, m = "serialized", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserNodeHandler$serialized$1, reason: invalid class name and case insensitive filesystem */
    public final class C124341 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124341(HtJ<? super C124341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserNodeHandler.this.serialized(null, null, null, this);
        }
    }

    public LocalBrowserNodeHandler(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.commands = LocalBrowserCommands.specs.keySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00fc: INVOKE 
  (r8v0 ?? I:com.facebook.aura.localbrowser.LocalBrowserRuntime)
  (r10 I:com.facebook.aura.localbrowser.LocalBrowserSession)
  (r0 I:com.facebook.aura.localbrowser.LocalBrowserCloseReason)
 VIRTUAL call: com.facebook.aura.localbrowser.LocalBrowserRuntime.closeSession(com.facebook.aura.localbrowser.LocalBrowserSession, com.facebook.aura.localbrowser.LocalBrowserCloseReason):boolean A[MD:(com.facebook.aura.localbrowser.LocalBrowserSession, com.facebook.aura.localbrowser.LocalBrowserCloseReason):boolean (m)] (LINE:252), block:B:46:0x00fa */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(com.facebook.aura.localbrowser.LocalBrowserRuntime r15, com.facebook.aura.nodes.api.HatchNodeInvocation r16, kotlinx.serialization.json.JsonObject r17, long r18, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r20) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.open(com.facebook.aura.localbrowser.LocalBrowserRuntime, com.facebook.aura.nodes.api.HatchNodeInvocation, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object page(com.facebook.aura.localbrowser.LocalBrowserRuntime r7, com.facebook.aura.nodes.api.HatchNodeInvocation r8, kotlinx.serialization.json.JsonObject r9, long r10, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r12) {
        /*
            r6 = this;
            r3 = r6
            r4 = r7
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup r1 = r6.lookup(r7, r9)
            boolean r0 = r1 instanceof com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup.Open
            r5 = r8
            if (r0 == 0) goto L53
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Open r1 = (com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup.Open) r1
            com.facebook.aura.localbrowser.LocalBrowserSession r6 = r1.session
            java.lang.String r2 = "url"
            java.lang.String r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandlerKt.string(r9, r2)
            if (r1 == 0) goto L34
            com.facebook.aura.localbrowser.LocalBrowserUrlPolicy r0 = com.facebook.aura.localbrowser.LocalBrowserUrlPolicy.INSTANCE
            java.lang.String r1 = r0.navigationUrl(r1)
            if (r1 == 0) goto L49
            java.lang.String r0 = "about:blank"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            kotlinx.serialization.json.JsonPrimitive r0 = X.C9oY.A07(r1)
            java.util.Map r0 = X.AnonymousClass006.A11(r2, r0, r9)
            kotlinx.serialization.json.JsonObject r9 = new kotlinx.serialization.json.JsonObject
            r9.<init>(r0)
        L34:
            com.facebook.aura.localbrowser.LocalBrowserCommands r1 = com.facebook.aura.localbrowser.LocalBrowserCommands.INSTANCE
            java.lang.String r0 = r8.command
            com.facebook.aura.localbrowser.core.BrowserOperation r7 = r1.operation(r0, r9)
            if (r7 != 0) goto L4c
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$NodeFailure r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.NodeFailure.INVALID_ARGUMENTS
        L40:
            java.lang.String r0 = r1.getCode()
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r0 = r3.failure(r8, r1, r0)
            return r0
        L49:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$NodeFailure r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.NodeFailure.URL_UNSUPPORTED
            goto L40
        L4c:
            r8 = r10
            r10 = r12
            java.lang.Object r0 = r3.execute(r4, r5, r6, r7, r8, r10)
            return r0
        L53:
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r0 = r6.lookupFailure(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.page(com.facebook.aura.localbrowser.LocalBrowserRuntime, com.facebook.aura.nodes.api.HatchNodeInvocation, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeFailure.values().length];
            try {
                AnonymousClass002.A13(NodeFailure.SESSION_IN_USE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeFailure.NO_SESSION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeFailure.NATIVE_PICKER_BLOCKED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeFailure.USER_ACTION_REQUIRED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeFailure.USER_IN_CONTROL, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(NodeFailure.HOST_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(NodeFailure.SESSION_CLOSED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object close(LocalBrowserRuntime localBrowserRuntime, HatchNodeInvocation hatchNodeInvocation, JsonObject jsonObject, long j, HtJ<? super HatchNodeInvocationResult> htJ) {
        NodeFailure nodeFailure;
        String strString = LocalBrowserNodeHandlerKt.string(jsonObject, "session_id");
        if (strString != null) {
            LocalBrowserCloseAttempt localBrowserCloseAttemptCloseAttempt = localBrowserRuntime.closeAttempt(strString, hatchNodeInvocation.id);
            if (localBrowserCloseAttemptCloseAttempt == null) {
                SessionLookup sessionLookupLookup = lookup(localBrowserRuntime, jsonObject);
                if (!(sessionLookupLookup instanceof SessionLookup.Open)) {
                    return lookupFailure(hatchNodeInvocation, sessionLookupLookup);
                }
                LocalBrowserSession localBrowserSession = ((SessionLookup.Open) sessionLookupLookup).session;
                if (localBrowserSession.getControl() == LocalBrowserControl.USER) {
                    nodeFailure = NodeFailure.USER_IN_CONTROL;
                } else {
                    localBrowserCloseAttemptCloseAttempt = localBrowserRuntime.beginClose(localBrowserSession, hatchNodeInvocation.id, j, null);
                    if (localBrowserCloseAttemptCloseAttempt == null) {
                        nodeFailure = NodeFailure.UNAVAILABLE;
                    }
                }
            }
            return closeResult(hatchNodeInvocation, localBrowserCloseAttemptCloseAttempt, htJ);
        }
        nodeFailure = NodeFailure.INVALID_ARGUMENTS;
        return failure(hatchNodeInvocation, nodeFailure, nodeFailure.getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object closeResult(com.facebook.aura.nodes.api.HatchNodeInvocation r6, com.facebook.aura.localbrowser.LocalBrowserCloseAttempt r7, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserNodeHandler.AnonymousClass1
            if (r0 == 0) goto L49
            r4 = r8
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$closeResult$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserNodeHandler.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L77
            java.lang.Object r7 = r4.L$1
            com.facebook.aura.localbrowser.LocalBrowserCloseAttempt r7 = (com.facebook.aura.localbrowser.LocalBrowserCloseAttempt) r7
            java.lang.Object r6 = r4.L$0
            com.facebook.aura.nodes.api.HatchNodeInvocation r6 = (com.facebook.aura.nodes.api.HatchNodeInvocation) r6
            X.Hwg.A00(r3)
        L28:
            com.facebook.aura.localbrowser.core.BrowserEngineCloseReceipt r3 = (com.facebook.aura.localbrowser.core.BrowserEngineCloseReceipt) r3
            if (r3 != 0) goto L4f
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$NodeFailure r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.NodeFailure.UNAVAILABLE
            java.lang.String r0 = r1.getCode()
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r2 = r5.failure(r6, r1, r0)
            return r2
        L37:
            X.Hwg.A00(r3)
            com.facebook.aura.localbrowser.core.BrowserEngineClosure r0 = r7.closure
            r4.L$0 = r6
            r4.L$1 = r7
            r4.label = r1
            java.lang.Object r3 = r0.inspect(r4)
            if (r3 != r2) goto L28
            return r2
        L49:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$closeResult$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$closeResult$1
            r4.<init>(r8)
            goto L12
        L4f:
            X.2nw r2 = new X.2nw
            r2.<init>()
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r7.sessionId
            X.C7qW.A06(r1, r0, r2)
            boolean r0 = r3.closed
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "closed"
            X.C7qW.A04(r1, r0, r2)
            kotlinx.serialization.json.JsonObject r1 = r3.payload
            java.lang.String r0 = "receipt"
            r2.A01(r0, r1)
            kotlinx.serialization.json.JsonObject r0 = r2.A00()
            com.facebook.aura.nodes.api.HatchNodeInvocationResult$Success r2 = new com.facebook.aura.nodes.api.HatchNodeInvocationResult$Success
            r2.<init>(r0)
            return r2
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.closeResult(com.facebook.aura.nodes.api.HatchNodeInvocation, com.facebook.aura.localbrowser.LocalBrowserCloseAttempt, X.HtJ):java.lang.Object");
    }

    private final String closedReason(LocalBrowserSession localBrowserSession) {
        LocalBrowserCloseReason localBrowserCloseReason = localBrowserSession.closeReason;
        if (localBrowserCloseReason == null) {
            localBrowserCloseReason = LocalBrowserCloseReason.AGENT;
        }
        return AnonymousClass006.A0x(localBrowserCloseReason);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    private final HatchNodeInvocationResult failure(HatchNodeInvocation hatchNodeInvocation, NodeFailure nodeFailure, String str) {
        int i;
        String string;
        int i2;
        Context context = hatchNodeInvocation.context;
        switch (nodeFailure.ordinal()) {
            case 4:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c93;
                string = context.getString(i);
                break;
            case 5:
            case 8:
            default:
                i2 = com.facebook.aura.R.string._name_removed__res_0x7f120c8e;
                string = context.getString(i2, str);
                break;
            case 6:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c8f;
                string = context.getString(i);
                break;
            case 7:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c91;
                string = context.getString(i);
                break;
            case 9:
                i2 = com.facebook.aura.R.string._name_removed__res_0x7f120c92;
                string = context.getString(i2, str);
                break;
            case 10:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c95;
                string = context.getString(i);
                break;
            case 11:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c94;
                string = context.getString(i);
                break;
            case 12:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120c90;
                string = context.getString(i);
                break;
        }
        return new HatchNodeInvocationResult.Failure(nodeFailure.getCode(), string);
    }

    public static /* synthetic */ HatchNodeInvocationResult failure$default(LocalBrowserNodeHandler localBrowserNodeHandler, HatchNodeInvocation hatchNodeInvocation, NodeFailure nodeFailure, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = nodeFailure.getCode();
        }
        return localBrowserNodeHandler.failure(hatchNodeInvocation, nodeFailure, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[PHI: r3
  0x004d: PHI (r3v2 com.facebook.aura.localbrowser.LocalBrowserSession) = (r3v1 com.facebook.aura.localbrowser.LocalBrowserSession), (r3v6 com.facebook.aura.localbrowser.LocalBrowserSession) binds: [B:17:0x003f, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup lookup(com.facebook.aura.localbrowser.LocalBrowserRuntime r4, kotlinx.serialization.json.JsonObject r5) {
        /*
            r3 = this;
            java.lang.String r0 = "session_id"
            java.lang.String r0 = com.facebook.aura.localbrowser.LocalBrowserNodeHandlerKt.string(r5, r0)
            if (r0 != 0) goto L3b
            X.1BN<java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserSession>> r0 = r4.activeSessions
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
            r2 = 0
            r5 = r3
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r1 = r4.next()
            r0 = r1
            com.facebook.aura.localbrowser.LocalBrowserSession r0 = (com.facebook.aura.localbrowser.LocalBrowserSession) r0
            com.facebook.aura.localbrowser.LocalBrowserTask r0 = r0.task
            if (r0 != 0) goto L1b
            if (r2 != 0) goto L34
            r2 = 1
            r5 = r1
            goto L1b
        L31:
            if (r2 == 0) goto L34
            r3 = r5
        L34:
            com.facebook.aura.localbrowser.LocalBrowserSession r3 = (com.facebook.aura.localbrowser.LocalBrowserSession) r3
            if (r3 != 0) goto L4d
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$None r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup.None.INSTANCE
            goto L55
        L3b:
            com.facebook.aura.localbrowser.LocalBrowserSession r3 = r4.session(r0)
            if (r3 != 0) goto L4d
            com.facebook.aura.localbrowser.LocalBrowserCloseReason r0 = r4.closedReason(r0)
            if (r0 == 0) goto L53
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Closed r1 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Closed
            r1.<init>(r0)
            return r1
        L4d:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Open r1 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Open
            r1.<init>(r3)
            goto L55
        L53:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup$Stale r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup.Stale.INSTANCE
        L55:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup r1 = (com.facebook.aura.localbrowser.LocalBrowserNodeHandler.SessionLookup) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.lookup(com.facebook.aura.localbrowser.LocalBrowserRuntime, kotlinx.serialization.json.JsonObject):com.facebook.aura.localbrowser.LocalBrowserNodeHandler$SessionLookup");
    }

    private final HatchNodeInvocationResult lookupFailure(HatchNodeInvocation hatchNodeInvocation, SessionLookup sessionLookup) {
        NodeFailure nodeFailure;
        String code;
        if ((sessionLookup instanceof SessionLookup.Open) || C7384Etj.areEqual(sessionLookup, SessionLookup.None.INSTANCE)) {
            nodeFailure = NodeFailure.NO_SESSION;
        } else {
            if (!C7384Etj.areEqual(sessionLookup, SessionLookup.Stale.INSTANCE)) {
                if (!(sessionLookup instanceof SessionLookup.Closed)) {
                    throw C3cG.A0q();
                }
                nodeFailure = NodeFailure.SESSION_CLOSED;
                code = AnonymousClass006.A0x(((SessionLookup.Closed) sessionLookup).reason);
                return failure(hatchNodeInvocation, nodeFailure, code);
            }
            nodeFailure = NodeFailure.STALE_SESSION;
        }
        code = nodeFailure.getCode();
        return failure(hatchNodeInvocation, nodeFailure, code);
    }

    private final HatchNodeInvocationResult reported(HatchNodeInvocation hatchNodeInvocation, LocalBrowserSession localBrowserSession, BrowserEngineResult.Reported reported) {
        return new C124331(hatchNodeInvocation, reported, localBrowserSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object serialized(com.facebook.aura.localbrowser.LocalBrowserRuntime r7, com.facebook.aura.nodes.api.HatchNodeInvocation r8, X.G0U<? super X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult>, ? extends java.lang.Object> r9, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.localbrowser.LocalBrowserNodeHandler.C124341
            if (r0 == 0) goto L23
            r5 = r10
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$serialized$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserNodeHandler.C124341) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L29
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.localbrowser.LocalBrowserRuntime r7 = (com.facebook.aura.localbrowser.LocalBrowserRuntime) r7
            goto L53
        L23:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$serialized$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$serialized$1
            r5.<init>(r10)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r4)
            X.BLa r0 = r7.lifecycle
            boolean r0 = r0.AhW(r2)
            if (r0 != 0) goto L44
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$NodeFailure r1 = com.facebook.aura.localbrowser.LocalBrowserNodeHandler.NodeFailure.BUSY
            java.lang.String r0 = r1.getCode()
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r0 = r6.failure(r8, r1, r0)
            return r0
        L44:
            r5.L$0 = r7     // Catch: java.lang.Throwable -> L5e
            r5.L$1 = r2     // Catch: java.lang.Throwable -> L5e
            r5.L$2 = r2     // Catch: java.lang.Throwable -> L5e
            r5.label = r1     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r4 = r9.invoke(r5)     // Catch: java.lang.Throwable -> L5e
            if (r4 != r3) goto L56
            return r3
        L53:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L5e
        L56:
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r4 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult) r4     // Catch: java.lang.Throwable -> L5e
            X.BLa r0 = r7.lifecycle
            r0.Ahe(r2)
            return r4
        L5e:
            r1 = move-exception
            X.BLa r0 = r7.lifecycle
            r0.Ahe(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.serialized(com.facebook.aura.localbrowser.LocalBrowserRuntime, com.facebook.aura.nodes.api.HatchNodeInvocation, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.nodes.api.HatchNodeInvocation r8, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.localbrowser.LocalBrowserNodeHandler.C124311
            if (r0 == 0) goto L23
            r6 = r9
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserNodeHandler.C124311) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L59
            java.lang.Object r3 = r6.L$1
            X.Hqv r3 = (X.C10543Hqv) r3
            goto L29
        L23:
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$1
            r6.<init>(r9)
            goto L12
        L29:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L2d
            goto L2f
        L2d:
            r2 = move-exception
            goto L4a
        L2f:
            return r1
        L30:
            X.Hqv r3 = X.C3cG.A10(r1)
            X.GBK r1 = com.facebook.aura.executors.AuraDispatchers.mainImmediate     // Catch: java.util.concurrent.CancellationException -> L49
            com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserNodeHandler$execute$2     // Catch: java.util.concurrent.CancellationException -> L49
            r0.<init>(r8, r3, r4)     // Catch: java.util.concurrent.CancellationException -> L49
            r6.L$0 = r4     // Catch: java.util.concurrent.CancellationException -> L49
            r6.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> L49
            r6.label = r2     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r1 = X.GAo.A00(r6, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r1 != r5) goto L48
            return r5
        L48:
            return r1
        L49:
            r2 = move-exception
        L4a:
            T r1 = r3.element
            boolean r0 = r1 instanceof com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred
            if (r0 == 0) goto L53
            r4 = r1
            com.facebook.aura.nodes.api.HatchNodeInvocationResult$Deferred r4 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred) r4
        L53:
            if (r4 == 0) goto L5d
            r4.close()
            throw r2
        L59:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L5d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.execute(com.facebook.aura.nodes.api.HatchNodeInvocation, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public Set<String> getCommands() {
        return this.commands;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public /* bridge */ int getMaxArgumentBytes() {
        return 65536;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public /* bridge */ int getMaxResultBytes() {
        return 1048576;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public /* bridge */ long getMaxTimeoutMs() {
        return 30000L;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public /* bridge */ boolean getPreservesArgumentEnvelope() {
        return false;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public /* bridge */ boolean getRequiresAuthenticatedReply() {
        return false;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchNodeInvocationResult status(LocalBrowserRuntime localBrowserRuntime, HatchNodeInvocation hatchNodeInvocation, JsonObject jsonObject) {
        SessionLookup sessionLookupLookup = lookup(localBrowserRuntime, jsonObject);
        return sessionLookupLookup instanceof SessionLookup.Open ? statusResult(((SessionLookup.Open) sessionLookupLookup).session) : lookupFailure(hatchNodeInvocation, sessionLookupLookup);
    }

    private final HatchNodeInvocationResult statusResult(LocalBrowserSession localBrowserSession) {
        LocalBrowserFacts localBrowserFactsA0G = C3cI.A0G(localBrowserSession);
        String host = Uri.parse(localBrowserSession.target.page.state.getValue().url).getHost();
        C2nw c2nw = new C2nw();
        C7qW.A06("session_id", localBrowserSession.id, c2nw);
        C7qW.A06(CONTROL, AnonymousClass006.A0x(localBrowserFactsA0G.control), c2nw);
        C7qW.A04(Boolean.valueOf(localBrowserFactsA0G.available), "available", c2nw);
        String str = localBrowserFactsA0G.userActionRequired;
        if (str != null) {
            C7qW.A06("user_action_required", str, c2nw);
        }
        if (host != null && host.length() != 0) {
            C7qW.A06(SITE, host, c2nw);
        }
        return new HatchNodeInvocationResult.Success(c2nw.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.facebook.aura.localbrowser.LocalBrowserRuntime r15, com.facebook.aura.nodes.api.HatchNodeInvocation r16, com.facebook.aura.localbrowser.LocalBrowserSession r17, com.facebook.aura.localbrowser.core.BrowserOperation r18, long r19, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserNodeHandler.execute(com.facebook.aura.localbrowser.LocalBrowserRuntime, com.facebook.aura.nodes.api.HatchNodeInvocation, com.facebook.aura.localbrowser.LocalBrowserSession, com.facebook.aura.localbrowser.core.BrowserOperation, long, X.HtJ):java.lang.Object");
    }
}
