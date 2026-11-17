package com.facebook.aura.devices.token;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkDeviceKeySessionEnvironment implements LinkDeviceKeyEnvironment {
    public final LinkDeviceKeyRevocationQueue revocations;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment", f = "LinkDeviceKeyOwnerSession.kt", l = {99}, m = "awaitGatewayConnected", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$awaitGatewayConnected$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeySessionEnvironment.this.awaitGatewayConnected(0L, this);
        }
    }

    public LinkDeviceKeySessionEnvironment(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.revocations = LinkDeviceKeyRevocationQueue.Companion.forSession(abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.facebook.aura.devices.token.LinkDeviceKeyEnvironment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitGatewayConnected(long r6, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.AnonymousClass1
            if (r0 == 0) goto L39
            r4 = r8
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$awaitGatewayConnected$1 r4 = (com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r5.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r1.getGateway(r0)
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r0 = r0.awaitConnected(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L39:
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$awaitGatewayConnected$1 r4 = new com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$awaitGatewayConnected$1
            r4.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.awaitGatewayConnected(long, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.devices.token.LinkDeviceKeyEnvironment
    public LinkDeviceKeyRevocationQueue getRevocations() {
        return this.revocations;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    @Override // com.facebook.aura.devices.token.LinkDeviceKeyEnvironment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.devices.token.LinkDeviceKeyOwnerState ownerState() {
        /*
            r17 = this;
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            r2 = r17
            X.CGz r0 = r2.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r4 = r1.getInstance(r0)
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r1 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            X.CGz r0 = r2.userSession
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r5 = r1.getInstance(r0)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r2.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r1 = r1.getGateway(r0)
            X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r0 = r1.gatewayState
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r2 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r2
            java.lang.String r1 = r1.currentWsUrl
            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r2.connection
            boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            r13 = 0
            r14 = r13
            if (r0 == 0) goto L2d
            r14 = r1
        L2d:
            java.lang.String r6 = r4.getGatewayUrl()
            java.lang.String r0 = r4.getGatewayUrl()
            java.lang.String r7 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            if (r7 == 0) goto La6
            java.lang.String r0 = r4.getCachedVmListJson()
            java.util.List r0 = com.facebook.aura.gateway.store.VmEntryV2JsonKt.decodeCachedVmList(r0)
            java.util.Iterator r1 = r0.iterator()
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r3 = r1.next()
            r0 = r3
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            java.lang.String r0 = r0.vm_ws_url
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L47
        L60:
            com.facebook.aura.gateway.store.VmEntryV2Json r3 = (com.facebook.aura.gateway.store.VmEntryV2Json) r3
        L62:
            boolean r8 = r5.isConfidentialVm()
            boolean r9 = r5.isStandardVm()
            boolean r0 = r4.isHandshakeProvenCvm(r7)
            if (r0 != 0) goto L7d
            com.facebook.aura.gateway.store.HatchCvmHandshakeProofs r1 = com.facebook.aura.gateway.store.HatchCvmHandshakeProofs.INSTANCE
            if (r3 == 0) goto La2
            java.lang.String r0 = r3.vm_id
        L76:
            boolean r0 = r1.isProven(r0)
            r10 = 0
            if (r0 == 0) goto L7e
        L7d:
            r10 = 1
        L7e:
            if (r3 == 0) goto L9f
            r11 = 1
            java.lang.String r12 = r3.vm_id
            java.lang.String r13 = r3.vm_ws_url
        L85:
            com.facebook.aura.gateway.HatchCvmAuthenticationState r1 = r2.authentication
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Ready r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Ready.INSTANCE
            boolean r15 = X.C7384Etj.areEqual(r1, r0)
            com.facebook.aura.gateway.HatchCvmAuthenticationState r1 = r2.authentication
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Disabled r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Disabled.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            r16 = r0 ^ 1
            boolean r17 = com.facebook.aura.network.noise.AuraNoiseVmTransport.httpRoutingEnabled
            com.facebook.aura.devices.token.LinkDeviceKeyOwnerState r5 = new com.facebook.aura.devices.token.LinkDeviceKeyOwnerState
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L9f:
            r11 = 0
            r12 = r13
            goto L85
        La2:
            r0 = r13
            goto L76
        La4:
            r3 = r13
            goto L60
        La6:
            r3 = r13
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.ownerState():com.facebook.aura.devices.token.LinkDeviceKeyOwnerState");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // com.facebook.aura.devices.token.LinkDeviceKeyEnvironment
    /* renamed from: register-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo731register0E7RQCE(java.lang.String r27, com.facebook.aura.devices.token.LinkDeviceKeyRegisterRequestJson r28, X.HtJ<? super X.HsJ<com.facebook.aura.devices.token.LinkDeviceKeyRegisterResponseJson>> r29) {
        /*
            r26 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register$1
            r5 = r26
            if (r0 == 0) goto L8e
            r3 = r4
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register$1 r3 = (com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L94
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L25:
            return r2
        L26:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.devices.token.DeviceTokenJarvisPath$DeviceKeysRegister r10 = com.facebook.aura.devices.token.DeviceTokenJarvisPath.DeviceKeysRegister.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r4 = 15
            java.lang.Long r14 = X.C3cG.A0S(r4)
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.L$9 = r15
            r3.L$10 = r15
            r3.L$11 = r15
            java.lang.String r26 = "X-Hatch-Auth-Error-Code"
            r3.L$12 = r15
            r3.I$0 = r9
            r3.I$1 = r9
            r3.I$2 = r1
            r3.I$3 = r9
            r3.I$4 = r1
            r3.I$5 = r1
            r3.I$6 = r1
            r3.label = r1
            r21 = r27
            r11 = r28
            r18 = r9
            r19 = r9
            r22 = r1
            r23 = r9
            r24 = r1
            r25 = r1
            r27 = r1
            r28 = r3
            r16 = r0
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == r2) goto L25
            return r0
        L8e:
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register$1 r3 = new com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$register$1
            r3.<init>(r5, r4)
            goto L16
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.mo731register0E7RQCE(java.lang.String, com.facebook.aura.devices.token.LinkDeviceKeyRegisterRequestJson, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    @Override // com.facebook.aura.devices.token.LinkDeviceKeyEnvironment
    /* renamed from: revoke-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo732revoke0E7RQCE(java.lang.String r27, com.facebook.aura.devices.token.LinkDeviceKeyRevokeRequestJson r28, X.HtJ<? super X.HsJ<com.facebook.aura.devices.token.LinkDeviceKeyRevokeResponseJson>> r29) {
        /*
            r26 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke$1
            r5 = r26
            if (r0 == 0) goto L8c
            r3 = r4
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke$1 r3 = (com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L92
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L25:
            return r2
        L26:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.devices.token.DeviceTokenJarvisPath$DeviceKeysRevoke r10 = com.facebook.aura.devices.token.DeviceTokenJarvisPath.DeviceKeysRevoke.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r4 = 15
            java.lang.Long r14 = X.C3cG.A0S(r4)
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set<java.lang.Integer> r17 = com.facebook.aura.devices.token.LinkDeviceKeyOwnerSessionKt.LINK_DEVICE_KEY_SUCCESS_CODES
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.L$9 = r15
            r3.L$10 = r15
            r3.L$11 = r15
            java.lang.String r26 = "X-Hatch-Auth-Error-Code"
            r3.L$12 = r15
            r3.I$0 = r9
            r3.I$1 = r1
            r3.I$2 = r1
            r3.I$3 = r9
            r3.I$4 = r1
            r3.I$5 = r1
            r3.I$6 = r9
            r3.label = r1
            r21 = r27
            r11 = r28
            r18 = r9
            r19 = r1
            r22 = r1
            r23 = r9
            r24 = r1
            r25 = r1
            r27 = r9
            r28 = r3
            r16 = r0
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == r2) goto L25
            return r0
        L8c:
            com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke$1 r3 = new com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment$revoke$1
            r3.<init>(r5, r4)
            goto L16
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment.mo732revoke0E7RQCE(java.lang.String, com.facebook.aura.devices.token.LinkDeviceKeyRevokeRequestJson, X.HtJ):java.lang.Object");
    }
}
