package com.facebook.aura.nodes.core;

import X.AbstractC7607F5u;
import X.F60;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public interface NodeCommandExecutor {

    /* renamed from: com.facebook.aura.nodes.core.NodeCommandExecutor$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object execute$suspendImpl(com.facebook.aura.nodes.core.NodeCommandExecutor r6, com.facebook.aura.nodes.core.NodeCommandRequest r7, com.facebook.aura.nodes.core.NodeExecutionContext r8, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r9) {
            /*
                boolean r0 = r9 instanceof com.facebook.aura.nodes.core.NodeCommandExecutor.AnonymousClass1
                if (r0 == 0) goto L24
                r5 = r9
                com.facebook.aura.nodes.core.NodeCommandExecutor$execute$1 r5 = (com.facebook.aura.nodes.core.NodeCommandExecutor.AnonymousClass1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L24
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r4 = r5.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L2f
                if (r0 == r1) goto L44
                if (r0 != r2) goto L2a
                X.Hwg.A00(r4)
                return r4
            L24:
                com.facebook.aura.nodes.core.NodeCommandExecutor$execute$1 r5 = new com.facebook.aura.nodes.core.NodeCommandExecutor$execute$1
                r5.<init>(r9)
                goto L12
            L2a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2f:
                X.Hwg.A00(r4)
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r8
                r5.label = r1
                java.lang.Object r4 = r6.computeResponse(r7, r5)
                if (r4 != r3) goto L4b
            L43:
                return r3
            L44:
                java.lang.Object r8 = r5.L$3
                com.facebook.aura.nodes.core.NodeExecutionContext r8 = (com.facebook.aura.nodes.core.NodeExecutionContext) r8
                X.Hwg.A00(r4)
            L4b:
                com.facebook.aura.nodes.core.NodeCommandResponse r4 = (com.facebook.aura.nodes.core.NodeCommandResponse) r4
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r0
                r5.label = r2
                java.lang.Object r0 = com.facebook.aura.nodes.core.NodeExecutionKt.deliver(r8, r4, r5)
                if (r0 == r3) goto L43
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.core.NodeCommandExecutor.CC.execute$suspendImpl(com.facebook.aura.nodes.core.NodeCommandExecutor, com.facebook.aura.nodes.core.NodeCommandRequest, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
        }

        public static Object $default$computeResponse(NodeCommandExecutor nodeCommandExecutor, NodeCommandRequest nodeCommandRequest, HtJ htJ) {
            computeResponse$suspendImpl(nodeCommandExecutor, nodeCommandRequest, htJ);
            throw F60.createAndThrow();
        }

        public static /* synthetic */ Object access$computeResponse$jd(NodeCommandExecutor nodeCommandExecutor, NodeCommandRequest nodeCommandRequest, HtJ htJ) {
            $default$computeResponse(nodeCommandExecutor, nodeCommandRequest, htJ);
            throw F60.createAndThrow();
        }

        public static /* synthetic */ Object computeResponse$suspendImpl(NodeCommandExecutor nodeCommandExecutor, NodeCommandRequest nodeCommandRequest, HtJ<? super NodeCommandResponse> htJ) {
            throw AbstractC7607F5u.A10(nodeCommandExecutor.getClass(), "Override either execute() or computeResponse() in ");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.core.NodeCommandExecutor", f = "NodeExecution.kt", l = {87, 87}, m = "execute$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.nodes.core.NodeCommandExecutor$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return CC.execute$suspendImpl(NodeCommandExecutor.this, null, null, this);
        }
    }

    Object computeResponse(NodeCommandRequest nodeCommandRequest, HtJ<? super NodeCommandResponse> htJ);

    Object execute(NodeCommandRequest nodeCommandRequest, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ);

    public abstract class DefaultImpls {
        @Deprecated
        public static Object computeResponse(NodeCommandExecutor nodeCommandExecutor, NodeCommandRequest nodeCommandRequest, HtJ<? super NodeCommandResponse> htJ) {
            CC.access$computeResponse$jd(nodeCommandExecutor, nodeCommandRequest, htJ);
            throw F60.createAndThrow();
        }

        @Deprecated
        public static Object execute(NodeCommandExecutor nodeCommandExecutor, NodeCommandRequest nodeCommandRequest, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
            return CC.execute$suspendImpl(nodeCommandExecutor, nodeCommandRequest, nodeExecutionContext, htJ);
        }
    }
}
