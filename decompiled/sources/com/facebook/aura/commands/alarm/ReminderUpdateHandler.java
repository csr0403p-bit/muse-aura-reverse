package com.facebook.aura.commands.alarm;

import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ReminderUpdateHandler implements HatchNodeCommandHandler {
    public static final ReminderUpdateHandler INSTANCE = new ReminderUpdateHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderUpdateHandler", f = "ReminderHandlers.kt", l = {143, 143}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderUpdateHandler$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderUpdateHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r5, com.facebook.aura.nodes.registry.HatchNodeCommandContext r6, java.lang.String r7, com.facebook.aura.nodes.core.NodeExecutionContext r8, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.ReminderUpdateHandler.AnonymousClass1
            if (r0 == 0) goto L24
            r5 = r9
            com.facebook.aura.commands.alarm.ReminderUpdateHandler$execute$1 r5 = (com.facebook.aura.commands.alarm.ReminderUpdateHandler.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L46
            if (r0 != r3) goto L2a
            X.Hwg.A00(r1)
            return r1
        L24:
            com.facebook.aura.commands.alarm.ReminderUpdateHandler$execute$1 r5 = new com.facebook.aura.commands.alarm.ReminderUpdateHandler$execute$1
            r5.<init>(r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r1)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r8
            r5.label = r2
            java.lang.Object r1 = com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderUpdate(r6, r7, r5)
            if (r1 != r4) goto L4d
        L45:
            return r4
        L46:
            java.lang.Object r8 = r5.L$4
            com.facebook.aura.nodes.core.NodeExecutionContext r8 = (com.facebook.aura.nodes.core.NodeExecutionContext) r8
            X.Hwg.A00(r1)
        L4d:
            com.facebook.aura.nodes.core.NodeCommandResponse r1 = (com.facebook.aura.nodes.core.NodeCommandResponse) r1
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.label = r3
            java.lang.Object r0 = com.facebook.aura.nodes.core.NodeExecutionKt.deliver(r8, r1, r5)
            if (r0 == r4) goto L45
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderUpdateHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.REMINDER_UPDATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return AlarmCommandSpecs.REMINDER_UPDATE;
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
