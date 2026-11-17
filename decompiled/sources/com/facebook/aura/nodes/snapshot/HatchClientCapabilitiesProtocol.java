package com.facebook.aura.nodes.snapshot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.C9oY;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import com.facebook.aura.nodes.transport.HatchNodeTransport;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class HatchClientCapabilitiesProtocol {
    public final HatchNodeTransport transport;

    @DebugMetadata(c = "com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol", f = "HatchClientCapabilitiesProtocol.kt", l = {68}, m = "sendDataSourcePublish", v = 2)
    /* renamed from: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendDataSourcePublish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchClientCapabilitiesProtocol.this.sendDataSourcePublish(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$2", f = "HatchClientCapabilitiesProtocol.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super ClientInvokeResultParamsJson>, Object> {
        public final /* synthetic */ ClientInvokeResultParamsJson $params;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClientInvokeResultParamsJson clientInvokeResultParamsJson, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$params = clientInvokeResultParamsJson;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$params, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ClientInvokeResultParamsJson> htJ) {
            ClientInvokeResultParamsJson clientInvokeResultParamsJson = this.$params;
            if (htJ != null) {
                htJ.getContext();
            }
            Hwg.A00(Unit.INSTANCE);
            return clientInvokeResultParamsJson;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return this.$params;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol", f = "HatchClientCapabilitiesProtocol.kt", l = {57}, m = "sendInvokeResult", v = 2)
    /* renamed from: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$3, reason: invalid class name */
    public final class AnonymousClass3 extends HzP {
        public Object L$0;
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
            return HatchClientCapabilitiesProtocol.this.sendInvokeResult(false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol", f = "HatchClientCapabilitiesProtocol.kt", l = {33}, m = "sendRegisterCapabilities", v = 2)
    /* renamed from: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendRegisterCapabilities$1, reason: invalid class name and case insensitive filesystem */
    public final class C127741 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C127741(HtJ<? super C127741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchClientCapabilitiesProtocol.this.sendRegisterCapabilities(null, this);
        }
    }

    public HatchClientCapabilitiesProtocol(HatchNodeTransport hatchNodeTransport) {
        C7384Etj.A0Y(hatchNodeTransport, 0);
        this.transport = hatchNodeTransport;
    }

    private final boolean isOk(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        if (jsonObject != null) {
            Object obj = jsonObject.get(PairsInviteMailboxKt.OUTCOME_OK);
            String strA04 = null;
            JsonPrimitive jsonPrimitive2 = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive2 == null || !AnonymousClass002.A1b(C9oY.A01(jsonPrimitive2), true)) {
                Object obj2 = jsonObject.get(AuraDeeplinkRouteMapper.STATUS_ROUTE);
                if ((obj2 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj2) != null) {
                    strA04 = C9oY.A04(jsonPrimitive);
                }
                if (PairsInviteMailboxKt.OUTCOME_OK.equals(strA04)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendDataSourcePublish(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.AnonymousClass1
            if (r0 == 0) goto L6e
            r6 = r9
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendDataSourcePublish$1 r6 = (com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto L74
            X.Hwg.A00(r1)
        L20:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            r4 = 0
            if (r0 == 0) goto L51
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
        L27:
            boolean r3 = r7.isOk(r1)
            if (r3 != 0) goto L4c
            com.facebook.aura.network.api.RpcMethod$ClientDataSourcePublish r0 = com.facebook.aura.network.api.RpcMethod.ClientDataSourcePublish.INSTANCE
            java.lang.String r2 = r0.getValue()
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L41
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r4 = X.BQG.A17(r1, r0)
        L41:
            java.lang.String r0 = " failed response="
            java.lang.String r1 = X.FGI.A0U(r2, r0, r4)
            java.lang.String r0 = "HatchClientCapabilitiesProtocol"
            X.CFK.A06(r0, r1)
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L51:
            r1 = r4
            goto L27
        L53:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.transport.HatchNodeTransport r3 = r7.transport
            com.facebook.aura.network.api.RpcMethod$ClientDataSourcePublish r2 = com.facebook.aura.network.api.RpcMethod.ClientDataSourcePublish.INSTANCE
            X.9sU r1 = com.facebook.aura.nodes.core.NodeWireJsonKt.NodeJson
            com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson$$serializer r0 = com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson$$serializer.INSTANCE
            kotlinx.serialization.json.JsonElement r1 = r1.A03(r8, r0)
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r1 = r3.sendRequestAndWait(r2, r1, r6)
            if (r1 != r5) goto L20
            return r5
        L6e:
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendDataSourcePublish$1 r6 = new com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendDataSourcePublish$1
            r6.<init>(r9)
            goto L12
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.sendDataSourcePublish(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendInvokeResult(boolean r9, X.G0U<? super X.HtJ<? super com.facebook.aura.nodes.json.ClientInvokeResultParamsJson>, ? extends java.lang.Object> r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.AnonymousClass3
            if (r0 == 0) goto L80
            r7 = r11
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$3 r7 = (com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.AnonymousClass3) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L66
            if (r0 != r5) goto L86
            boolean r9 = r7.Z$0
            X.Hwg.A00(r2)
        L23:
            boolean r0 = r2 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L63
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2
            if (r2 == 0) goto L64
            java.lang.String r0 = "payload"
            kotlinx.serialization.json.JsonElement r1 = X.C60O.A1F(r0, r2)
        L31:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L39
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            if (r1 != 0) goto L3a
        L39:
            r1 = r2
        L3a:
            boolean r0 = r8.isOk(r2)
            if (r0 == 0) goto L61
            if (r9 == 0) goto L5c
            if (r1 == 0) goto L4a
            java.lang.String r0 = "resolved"
            kotlinx.serialization.json.JsonElement r4 = X.C60O.A1F(r0, r1)
        L4a:
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L61
            kotlinx.serialization.json.JsonPrimitive r4 = (kotlinx.serialization.json.JsonPrimitive) r4
            if (r4 == 0) goto L61
            java.lang.Boolean r0 = X.C9oY.A01(r4)
            boolean r0 = X.AnonymousClass002.A1b(r0, r5)
            if (r0 == 0) goto L61
        L5c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L61:
            r5 = 0
            goto L5c
        L63:
            r2 = r4
        L64:
            r1 = r4
            goto L31
        L66:
            X.Hwg.A00(r2)
            com.facebook.aura.nodes.transport.HatchNodeTransport r3 = r8.transport
            com.facebook.aura.network.api.RpcMethod$ClientInvokeResult r2 = com.facebook.aura.network.api.RpcMethod.ClientInvokeResult.INSTANCE
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$response$1 r1 = new com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$response$1
            r1.<init>(r10, r4)
            r0 = 0
            r7.L$0 = r0
            r7.Z$0 = r9
            r7.label = r5
            java.lang.Object r2 = r3.sendRequestAndWaitDeferred(r2, r1, r7)
            if (r2 != r6) goto L23
            return r6
        L80:
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$3 r7 = new com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendInvokeResult$3
            r7.<init>(r11)
            goto L12
        L86:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.sendInvokeResult(boolean, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendRegisterCapabilities(com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.C127741
            if (r0 == 0) goto L70
            r6 = r9
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendRegisterCapabilities$1 r6 = (com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.C127741) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto L76
            X.Hwg.A00(r1)
        L20:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            r4 = 0
            if (r0 == 0) goto L51
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
        L27:
            boolean r3 = r7.isOk(r1)
            if (r3 != 0) goto L4c
            com.facebook.aura.network.api.RpcMethod$ClientRegisterCapabilities r0 = com.facebook.aura.network.api.RpcMethod.ClientRegisterCapabilities.INSTANCE
            java.lang.String r2 = r0.getValue()
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L41
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r4 = X.BQG.A17(r1, r0)
        L41:
            java.lang.String r0 = " failed response="
            java.lang.String r1 = X.FGI.A0U(r2, r0, r4)
            java.lang.String r0 = "HatchClientCapabilitiesProtocol"
            X.CFK.A06(r0, r1)
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L51:
            r1 = r4
            goto L27
        L53:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.transport.HatchNodeTransport r3 = r7.transport
            com.facebook.aura.network.api.RpcMethod$ClientRegisterCapabilities r2 = com.facebook.aura.network.api.RpcMethod.ClientRegisterCapabilities.INSTANCE
            X.9sU r1 = com.facebook.aura.nodes.core.NodeWireJsonKt.NodeJson
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson.$childSerializers
            com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson$$serializer r0 = com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson$$serializer.INSTANCE
            kotlinx.serialization.json.JsonElement r1 = r1.A03(r8, r0)
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r1 = r3.sendRequestAndWait(r2, r1, r6)
            if (r1 != r5) goto L20
            return r5
        L70:
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendRegisterCapabilities$1 r6 = new com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol$sendRegisterCapabilities$1
            r6.<init>(r9)
            goto L12
        L76:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol.sendRegisterCapabilities(com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson, X.HtJ):java.lang.Object");
    }

    public final Object sendInvokeResult(ClientInvokeResultParamsJson clientInvokeResultParamsJson, HtJ<? super Boolean> htJ) {
        return sendInvokeResult(false, new AnonymousClass2(clientInvokeResultParamsJson, null), htJ);
    }
}
