package com.facebook.aura.commands.app;

import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class AssistantSetDefaultHandler implements HatchNodeCommandHandler {
    public static final AssistantSetDefaultHandler INSTANCE = new AssistantSetDefaultHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.app.AssistantSetDefaultHandler", f = "AssistantSetDefaultHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, 50}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.app.AssistantSetDefaultHandler$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return AssistantSetDefaultHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, com.facebook.aura.nodes.registry.HatchNodeCommandContext r9, java.lang.String r10, com.facebook.aura.nodes.core.NodeExecutionContext r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r12) {
        /*
            r7 = this;
            r4 = r12
            r3 = r11
            boolean r0 = r12 instanceof com.facebook.aura.commands.app.AssistantSetDefaultHandler.AnonymousClass1
            if (r0 == 0) goto L26
            r12 = r4
            com.facebook.aura.commands.app.AssistantSetDefaultHandler$execute$1 r12 = (com.facebook.aura.commands.app.AssistantSetDefaultHandler.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r12.label = r2
        L14:
            java.lang.Object r1 = r12.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L31
            if (r0 == r6) goto L7b
            if (r0 != r5) goto L2c
            X.Hwg.A00(r1)
            return r1
        L26:
            com.facebook.aura.commands.app.AssistantSetDefaultHandler$execute$1 r12 = new com.facebook.aura.commands.app.AssistantSetDefaultHandler$execute$1
            r12.<init>(r4)
            goto L14
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r1)
            android.content.Context r2 = r9.context
            com.facebook.aura.assist.status.HatchDefaultAssistantStatus r1 = com.facebook.aura.assist.status.HatchDefaultAssistantStatus.INSTANCE
            boolean r0 = r1.isDefaultAssistant(r2)
            if (r0 == 0) goto L56
            com.facebook.aura.commands.app.AppActionOutcome r1 = com.facebook.aura.commands.app.AppActionOutcome.ALREADY_DONE
        L40:
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r0
            r12.L$4 = r0
            r12.L$5 = r0
            r12.label = r5
            java.lang.Object r0 = com.facebook.aura.commands.app.AppActionsKt.deliverAppAction(r3, r1, r12)
            if (r0 == r4) goto L89
            return r0
        L56:
            boolean r0 = r1.isAssistantRoleAvailable(r2)
            if (r0 != 0) goto L5f
            com.facebook.aura.commands.app.AppActionOutcome r1 = com.facebook.aura.commands.app.AppActionOutcome.UNSUPPORTED
            goto L40
        L5f:
            com.facebook.aura.nudge.ConversationNudges r7 = com.facebook.aura.nudge.ConversationNudges.INSTANCE
            long r10 = com.facebook.aura.commands.app.AppActionsKt.appActionCardDeadlineElapsedMs()
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r3
            r12.L$4 = r0
            r12.label = r6
            java.lang.String r9 = "default_assistant"
            java.lang.Object r1 = r7.awaitOnDemand(r8, r9, r10, r12)
            if (r1 != r4) goto L82
            return r4
        L7b:
            java.lang.Object r3 = r12.L$3
            com.facebook.aura.nodes.core.NodeExecutionContext r3 = (com.facebook.aura.nodes.core.NodeExecutionContext) r3
            X.Hwg.A00(r1)
        L82:
            com.facebook.aura.conversation.api.ConversationCardOutcome r1 = (com.facebook.aura.conversation.api.ConversationCardOutcome) r1
            com.facebook.aura.commands.app.AppActionOutcome r1 = com.facebook.aura.commands.app.AppActionsKt.toAppActionOutcome(r1)
            goto L40
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.AssistantSetDefaultHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.ASSISTANT_SET_DEFAULT;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return AppCommandSpecs.ASSISTANT_SET_DEFAULT;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
