package com.facebook.aura.agentpermission;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1 implements C20Q<HatchAgentPermissionsRepository.CheckoutApprovalPayload> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ CheckoutWalletSheetViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1", f = "CheckoutWalletSheetViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$1, reason: invalid class name */
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
            return CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ CheckoutWalletSheetViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2", f = "CheckoutWalletSheetViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, CheckoutWalletSheetViewModel checkoutWalletSheetViewModel) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = checkoutWalletSheetViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload] */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, X.HtJ r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L69
                r6 = r11
                com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2$1 r6 = (com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L69
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r7 = 1
                if (r0 == 0) goto L23
                if (r0 != r7) goto L6f
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L23:
                X.Hwg.A00(r1)
                X.20Z r4 = r9.$this_unsafeFlow
                java.util.List r10 = (java.util.List) r10
                java.util.Iterator r8 = r10.iterator()
            L2e:
                boolean r0 = r8.hasNext()
                r3 = 0
                if (r0 == 0) goto L67
                java.lang.Object r2 = r8.next()
                r0 = r2
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
                java.lang.String r1 = r0.approvalId
                com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel r0 = r9.this$0
                java.lang.String r0 = r0.approvalId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2e
            L48:
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r2
                if (r2 == 0) goto L65
                com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload r1 = r2.richPayload
            L4e:
                boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload
                if (r0 == 0) goto L53
                r3 = r1
            L53:
                r0 = 0
                r6.L$0 = r0
                r6.L$1 = r0
                r6.L$2 = r0
                r6.L$3 = r0
                r6.label = r7
                java.lang.Object r0 = r4.emit(r3, r6)
                if (r0 != r5) goto L20
                return r5
            L65:
                r1 = r3
                goto L4e
            L67:
                r2 = r3
                goto L48
            L69:
                com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2$1 r6 = new com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2$1
                r6.<init>(r11)
                goto L12
            L6f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1(C20Q c20q, CheckoutWalletSheetViewModel checkoutWalletSheetViewModel) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = checkoutWalletSheetViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutApprovalPayload> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$1 r5 = (com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.AnonymousClass1) r5
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
            com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel r0 = r6.this$0
            com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2 r1 = new com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$2
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
            com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$1 r5 = new com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
