package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C3cG;
import X.C4JM;
import X.C60Q;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import android.app.Application;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeHitlGate;
import com.facebook.aura.nodes.core.NodeHitlMode;
import com.facebook.aura.nodes.core.NodeHitlRequest;
import com.facebook.aura.nodes.core.NodeHitlResult;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.permissions.defaults.PermissionSettingsRepository;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchNodeHitlGate implements NodeHitlGate, InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final Set<NodeCommandId> LOCAL_COPY_ONLY_COMMANDS = BFI.A0H(new NodeCommandId[]{NodeCommandId.APP_LIST, NodeCommandId.APP_OPEN, NodeCommandId.BUG_REPORT_CREATE});
    public final HatchAgentPermissionsRepository approvalsRepository;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public final PermissionSettingsRepository permissionSettings;
    public final NodeHitlRecentDecisions recentDecisions;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeHitlGate", f = "HatchNodeHitlGate.kt", l = {169, 176}, m = "ask", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchNodeHitlGate$ask$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeHitlGate.this.ask(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeHitlGate", f = "HatchNodeHitlGate.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 99}, m = "check", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchNodeHitlGate$check$1, reason: invalid class name and case insensitive filesystem */
    public final class C121261 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121261(HtJ<? super C121261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeHitlGate.this.check(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeHitlGate", f = "HatchNodeHitlGate.kt", l = {114}, m = "resolveConnectorBaseline", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchNodeHitlGate$resolveConnectorBaseline$1, reason: invalid class name and case insensitive filesystem */
    public final class C121271 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C121271(HtJ<? super C121271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeHitlGate.this.resolveConnectorBaseline(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeHitlGate", f = "HatchNodeHitlGate.kt", l = {210}, m = "withServerCopy", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchNodeHitlGate$withServerCopy$1, reason: invalid class name and case insensitive filesystem */
    public final class C121281 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C121281(HtJ<? super C121281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeHitlGate.this.withServerCopy(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r0.booleanValue() != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ask(com.facebook.aura.nodes.core.NodeHitlSpec r13, com.facebook.aura.nodes.core.NodeHitlRequest r14, long r15, X.HtJ<? super com.facebook.aura.nodes.core.NodeHitlResult> r17) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchNodeHitlGate.ask(com.facebook.aura.nodes.core.NodeHitlSpec, com.facebook.aura.nodes.core.NodeHitlRequest, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object withServerCopy(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r12, com.facebook.aura.nodes.core.NodeHitlSpec r13, com.facebook.aura.nodes.core.NodeHitlRequest r14, X.HtJ<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r15) {
        /*
            r11 = this;
            r1 = r12
            r2 = r13
            r5 = r15
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchNodeHitlGate.C121281
            if (r0 == 0) goto L8e
            r15 = r5
            com.facebook.aura.gateway.HatchNodeHitlGate$withServerCopy$1 r15 = (com.facebook.aura.gateway.HatchNodeHitlGate.C121281) r15
            int r4 = r15.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L8e
            int r4 = r4 - r3
            r15.label = r4
        L15:
            java.lang.Object r5 = r15.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L94
            java.lang.Object r2 = r15.L$1
            com.facebook.aura.nodes.core.NodeHitlSpec r2 = (com.facebook.aura.nodes.core.NodeHitlSpec) r2
            java.lang.Object r1 = r15.L$0
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r1 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r1
            X.Hwg.A00(r5)
        L2b:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$DeviceApprovalCopy r5 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.DeviceApprovalCopy) r5
            if (r5 == 0) goto L3a
            com.facebook.aura.nodes.core.NodeHitlAccess r2 = r2.access
            com.facebook.aura.nodes.core.NodeHitlAccess r0 = com.facebook.aura.nodes.core.NodeHitlAccess.WRITE
            if (r2 == r0) goto L36
            r3 = 0
        L36:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r1 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt.withDeviceCopy(r1, r5, r3)
        L3a:
            return r1
        L3b:
            X.Hwg.A00(r5)
            com.facebook.aura.nodes.core.NodeHitlRequestKind r5 = r14.kind
            com.facebook.aura.nodes.core.NodeHitlRequestKind r0 = com.facebook.aura.nodes.core.NodeHitlRequestKind.COMMAND
            if (r5 != r0) goto L3a
            java.util.Set<com.facebook.aura.nodes.core.NodeCommandId> r7 = com.facebook.aura.gateway.HatchNodeHitlGate.LOCAL_COPY_ONLY_COMMANDS
            com.facebook.aura.nodes.core.NodeCommandId$Companion r5 = com.facebook.aura.nodes.core.NodeCommandId.Companion
            java.lang.String r0 = r14.subjectId
            com.facebook.aura.nodes.core.NodeCommandId r0 = r5.fromId(r0)
            boolean r0 = X.AbstractC0878AGe.A0k(r7, r0)
            if (r0 != 0) goto L3a
            com.facebook.aura.nodes.hitldisplay.NodeHitlCapability$Companion r5 = com.facebook.aura.nodes.hitldisplay.NodeHitlCapability.Companion
            com.facebook.aura.nodes.core.NodeHitlGroup r0 = r13.group
            com.facebook.aura.nodes.hitldisplay.NodeHitlCapability r0 = r5.forGroup(r0)
            com.facebook.aura.gateway.HatchAgentPermissionsRepository r7 = r11.approvalsRepository
            java.lang.String r10 = r14.subjectId
            if (r0 == 0) goto L8c
            android.app.Application r5 = X.C4JM.A00()
            int r0 = r0.getDisplayTitleRes()
            java.lang.String r11 = r5.getString(r0)
        L6e:
            java.lang.String r0 = r14.subjectId
            java.lang.String r12 = com.facebook.aura.gateway.HatchNodeHitlGateKt.serverActionDescription(r0, r13)
            java.lang.String r14 = r14.payloadJson
            r15.L$0 = r1
            r15.L$1 = r13
            r0 = 0
            r15.L$2 = r0
            r15.L$3 = r0
            r15.label = r3
            r8 = 8000(0x1f40, double:3.9525E-320)
            java.lang.String r13 = "device policy: ask"
            java.lang.Object r5 = r7.fetchDeviceApprovalCopyWithin(r8, r10, r11, r12, r13, r14, r15)
            if (r5 != r4) goto L2b
            return r4
        L8c:
            r11 = 0
            goto L6e
        L8e:
            com.facebook.aura.gateway.HatchNodeHitlGate$withServerCopy$1 r15 = new com.facebook.aura.gateway.HatchNodeHitlGate$withServerCopy$1
            r15.<init>(r5)
            goto L15
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchNodeHitlGate.withServerCopy(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, com.facebook.aura.nodes.core.NodeHitlSpec, com.facebook.aura.nodes.core.NodeHitlRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // com.facebook.aura.nodes.core.NodeHitlGate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object check(com.facebook.aura.nodes.core.NodeHitlSpec r10, com.facebook.aura.nodes.core.NodeHitlRequest r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeHitlResult> r12) {
        /*
            r9 = this;
            r8 = r11
            r7 = r10
            boolean r0 = r12 instanceof com.facebook.aura.gateway.HatchNodeHitlGate.C121261
            r6 = r9
            if (r0 == 0) goto L28
            r11 = r12
            com.facebook.aura.gateway.HatchNodeHitlGate$check$1 r11 = (com.facebook.aura.gateway.HatchNodeHitlGate.C121261) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r11.label = r2
        L15:
            java.lang.Object r5 = r11.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r3 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L33
            if (r0 == r3) goto L4c
            if (r0 != r1) goto L2e
            X.Hwg.A00(r5)
            return r5
        L28:
            com.facebook.aura.gateway.HatchNodeHitlGate$check$1 r11 = new com.facebook.aura.gateway.HatchNodeHitlGate$check$1
            r11.<init>(r12)
            goto L15
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r5)
            long r9 = android.os.SystemClock.elapsedRealtime()
            r11.L$0 = r7
            r11.L$1 = r8
            r11.L$2 = r6
            r11.J$0 = r9
            r11.label = r3
            java.lang.Object r5 = r6.resolveConnectorBaseline(r8, r11)
            r0 = r6
            if (r5 != r4) goto L5d
            return r4
        L4c:
            long r9 = r11.J$0
            java.lang.Object r0 = r11.L$2
            com.facebook.aura.gateway.HatchNodeHitlGate r0 = (com.facebook.aura.gateway.HatchNodeHitlGate) r0
            java.lang.Object r8 = r11.L$1
            com.facebook.aura.nodes.core.NodeHitlRequest r8 = (com.facebook.aura.nodes.core.NodeHitlRequest) r8
            java.lang.Object r7 = r11.L$0
            com.facebook.aura.nodes.core.NodeHitlSpec r7 = (com.facebook.aura.nodes.core.NodeHitlSpec) r7
            X.Hwg.A00(r5)
        L5d:
            com.facebook.aura.permissions.defaults.PermissionDefaultMode r5 = (com.facebook.aura.permissions.defaults.PermissionDefaultMode) r5
            com.facebook.aura.gateway.NodeHitlPermissionStore r0 = r0.storeWithBaseline(r5)
            com.facebook.aura.nodes.core.NodeHitlMode r0 = r0.getMode(r7)
            int r0 = r0.ordinal()
            if (r0 == r2) goto L8d
            if (r0 == r1) goto L88
            if (r0 != r3) goto L83
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.J$0 = r9
            r11.label = r1
            java.lang.Object r0 = r6.ask(r7, r8, r9, r11)
            if (r0 != r4) goto L8c
            return r4
        L83:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L88:
            com.facebook.aura.nodes.core.NodeHitlResult r0 = r6.denied(r8, r2)
        L8c:
            return r0
        L8d:
            com.facebook.aura.nodes.core.NodeHitlResult$Allowed r0 = com.facebook.aura.nodes.core.NodeHitlResult.Allowed.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchNodeHitlGate.check(com.facebook.aura.nodes.core.NodeHitlSpec, com.facebook.aura.nodes.core.NodeHitlRequest, X.HtJ):java.lang.Object");
    }

    public final void clearOverride(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        getPermissionStore().clearOverride(nodeHitlSpec);
    }

    public final NodeHitlMode getMode(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        return getPermissionStore().getMode(nodeHitlSpec);
    }

    public final boolean hasOverride(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        return getPermissionStore().hasOverride(nodeHitlSpec);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NodeHitlMode.values().length];
            try {
                AnonymousClass005.A0v(NodeHitlMode.ALLOW, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlMode.DENY, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlMode.ASK, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AgentPermissionDecision.values().length];
            try {
                AnonymousClass005.A0v(AgentPermissionDecision.ALLOW_ONCE, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionDecision.ALLOW_ALWAYS, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionDecision.DENY, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final PermissionDefaultMode cachedConnectorBaseline() {
        return this.permissionSettings.cachedConnectorDefault();
    }

    private final NodeHitlPermissionStore getPermissionStore() {
        PermissionDefaultMode permissionDefaultModeCachedConnectorDefault = this.permissionSettings.cachedConnectorDefault();
        if (permissionDefaultModeCachedConnectorDefault == null) {
            permissionDefaultModeCachedConnectorDefault = PermissionDefaultMode.ALWAYS_ASK;
        }
        return storeWithBaseline(permissionDefaultModeCachedConnectorDefault);
    }

    private final String resolveAssistantName() {
        String str;
        String strA0l;
        AiIdentity value = HatchGatewayConnection.Companion.getInstance(this.userSession).getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().aiIdentity.getValue();
        return (value == null || (str = value.name) == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) ? HatchAppName.value : strA0l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveConnectorBaseline(com.facebook.aura.nodes.core.NodeHitlRequest r8, X.HtJ<? super com.facebook.aura.permissions.defaults.PermissionDefaultMode> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchNodeHitlGate.C121271
            if (r0 == 0) goto L5d
            r4 = r9
            com.facebook.aura.gateway.HatchNodeHitlGate$resolveConnectorBaseline$1 r4 = (com.facebook.aura.gateway.HatchNodeHitlGate.C121271) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            java.lang.String r3 = "HatchNodeHitlGate"
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 != r6) goto L63
            X.Hwg.A00(r0)
        L22:
            if (r0 != 0) goto L68
            java.lang.String r0 = "Connector baseline fetch failed; failing closed"
            X.CFK.A06(r3, r0)
        L29:
            com.facebook.aura.permissions.defaults.PermissionDefaultMode r5 = com.facebook.aura.permissions.defaults.PermissionDefaultMode.ALWAYS_ASK
            return r5
        L2c:
            X.Hwg.A00(r0)
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository r0 = r7.permissionSettings
            com.facebook.aura.permissions.defaults.PermissionDefaultMode r0 = r0.cachedConnectorDefault()
            if (r0 != 0) goto L68
            com.facebook.aura.nodes.core.NodeHitlRequestKind r1 = r8.kind
            com.facebook.aura.nodes.core.NodeHitlRequestKind r0 = com.facebook.aura.nodes.core.NodeHitlRequestKind.PROACTIVE_SYNC
            if (r1 == r0) goto L29
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r1 = com.facebook.aura.gateway.HatchGatewayConnection.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r1.getInstance(r0)
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L29
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository r2 = r7.permissionSettings
            r0 = 0
            r4.L$0 = r0
            r4.I$0 = r6
            r4.label = r6
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r2.fetchConnectorDefault(r0, r4)
            if (r0 != r5) goto L22
            return r5
        L5d:
            com.facebook.aura.gateway.HatchNodeHitlGate$resolveConnectorBaseline$1 r4 = new com.facebook.aura.gateway.HatchNodeHitlGate$resolveConnectorBaseline$1
            r4.<init>(r9)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchNodeHitlGate.resolveConnectorBaseline(com.facebook.aura.nodes.core.NodeHitlRequest, X.HtJ):java.lang.Object");
    }

    private final NodeHitlPermissionStore storeWithBaseline(PermissionDefaultMode permissionDefaultMode) {
        return new NodeHitlPermissionStore(C3cG.A0a(this.gatewayPrefs), permissionDefaultMode, false);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.recentDecisions.clear();
    }

    public final class Companion {
        public final HatchNodeHitlGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchNodeHitlGate) abstractC3358CGz.A03(HatchNodeHitlGate.class, new HatchNodeHitlGate$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchNodeHitlGate(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.gatewayPrefs = C3cG.A0D(abstractC3358CGz);
        this.approvalsRepository = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.permissionSettings = PermissionSettingsRepository.Companion.getInstance(abstractC3358CGz);
        this.recentDecisions = new NodeHitlRecentDecisions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeHitlResult denied(NodeHitlRequest nodeHitlRequest, boolean z) {
        Application applicationA00 = C4JM.A00();
        String strActionPhrase = NodeHitlApprovalDetailsProvider.INSTANCE.actionPhrase(nodeHitlRequest);
        int i = R.string._name_removed__res_0x7f1202d0;
        if (z) {
            i = R.string._name_removed__res_0x7f120320;
        }
        return new NodeHitlResult.Denied(C60Q.A0b(applicationA00, strActionPhrase, i), z);
    }

    public final void clearAllOverrides() {
        getPermissionStore().clearAllOverrides();
        this.recentDecisions.clear();
    }

    public final void setMode(NodeHitlSpec nodeHitlSpec, NodeHitlMode nodeHitlMode) {
        AnonymousClass003.A0u(nodeHitlSpec, nodeHitlMode);
        getPermissionStore().setMode(nodeHitlSpec, nodeHitlMode);
    }

    public /* synthetic */ HatchNodeHitlGate(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
