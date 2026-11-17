package com.facebook.aura.agentpermission;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentComputerApprovalBannerViewModel$special$$inlined$map$1 implements C20Q<HatchAgentPermissionsRepository.AgentPermissionApproval> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1", f = "AgentComputerApprovalBannerViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentComputerApprovalBannerViewModel$special$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2", f = "AgentComputerApprovalBannerViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(HtJ htJ) {
                super(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(C20Z c20z) {
            this.$this_unsafeFlow = c20z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, X.HtJ r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L8b
                r8 = r12
                com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2$1 r8 = (com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                int r2 = r8.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L8b
                int r2 = r2 - r1
                r8.label = r2
            L12:
                java.lang.Object r1 = r8.result
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r9 = 1
                if (r0 == 0) goto L23
                if (r0 != r9) goto L91
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L23:
                X.Hwg.A00(r1)
                X.20Z r10 = r10.$this_unsafeFlow
                java.util.List r11 = (java.util.List) r11
                java.util.ArrayList r3 = X.C3cG.A0h()
                java.util.Iterator r2 = r11.iterator()
            L32:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L49
                java.lang.Object r1 = r2.next()
                r0 = r1
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
                boolean r0 = com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModelKt.blocksItsOwnConversation(r0)
                if (r0 == 0) goto L32
                r3.add(r1)
                goto L32
            L49:
                java.util.Iterator r11 = r3.iterator()
                boolean r0 = r11.hasNext()
                if (r0 != 0) goto L66
                r6 = 0
            L54:
                r0 = 0
                r8.L$0 = r0
                r8.L$1 = r0
                r8.L$2 = r0
                r8.L$3 = r0
                r8.label = r9
                java.lang.Object r0 = r10.emit(r6, r8)
                if (r0 != r7) goto L20
                return r7
            L66:
                java.lang.Object r6 = r11.next()
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L54
                r0 = r6
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
                long r4 = r0.requestedAtMs
            L75:
                java.lang.Object r3 = r11.next()
                r0 = r3
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
                long r1 = r0.requestedAtMs
                int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r0 >= 0) goto L84
                r6 = r3
                r4 = r1
            L84:
                boolean r0 = r11.hasNext()
                if (r0 != 0) goto L75
                goto L54
            L8b:
                com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2$1 r8 = new com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2$1
                r8.<init>(r12)
                goto L12
            L91:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public AgentComputerApprovalBannerViewModel$special$$inlined$map$1(C20Q c20q) {
        this.$this_unsafeTransform$inlined = c20q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3d
            r5 = r8
            com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$1 r5 = (com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L43
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2 r1 = new com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$2
            r1.<init>(r7)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3d:
            com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$1 r5 = new com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel$special$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
