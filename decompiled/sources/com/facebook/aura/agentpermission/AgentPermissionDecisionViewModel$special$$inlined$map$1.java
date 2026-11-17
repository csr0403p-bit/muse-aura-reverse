package com.facebook.aura.agentpermission;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class AgentPermissionDecisionViewModel$special$$inlined$map$1 implements C20Q<HatchAgentPermissionsRepository.AgentPermissionApproval> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ AgentPermissionDecisionViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1", f = "AgentPermissionDecisionViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$1, reason: invalid class name */
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
            return AgentPermissionDecisionViewModel$special$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ AgentPermissionDecisionViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2", f = "AgentPermissionDecisionViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, AgentPermissionDecisionViewModel agentPermissionDecisionViewModel) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = agentPermissionDecisionViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, X.HtJ r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L59
                r7 = r10
                com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2$1 r7 = (com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L59
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L23
                if (r0 != r5) goto L5f
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r4 = r8.$this_unsafeFlow
                java.util.Iterator r3 = X.AbstractC7607F5u.A13(r9)
            L2c:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L57
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
                java.lang.String r1 = r0.approvalId
                com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel r0 = r8.this$0
                java.lang.String r0 = r0.approvalId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2c
            L45:
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r5
                java.lang.Object r0 = r4.emit(r2, r7)
                if (r0 != r6) goto L20
                return r6
            L57:
                r2 = 0
                goto L45
            L59:
                com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2$1 r7 = new com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2$1
                r7.<init>(r10)
                goto L12
            L5f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public AgentPermissionDecisionViewModel$special$$inlined$map$1(C20Q c20q, AgentPermissionDecisionViewModel agentPermissionDecisionViewModel) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = agentPermissionDecisionViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$1 r5 = (com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel r0 = r6.this$0
            com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2 r1 = new com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$2
            r1.<init>(r7, r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$1 r5 = new com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$special$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
