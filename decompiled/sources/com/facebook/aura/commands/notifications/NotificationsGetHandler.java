package com.facebook.aura.commands.notifications;

import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class NotificationsGetHandler implements HatchNodeCommandHandler {
    public static final NotificationsGetHandler INSTANCE = new NotificationsGetHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NotificationsGetHandler", f = "NotificationsGetHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 53}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$1, reason: invalid class name */
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
            return NotificationsGetHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r10, com.facebook.aura.nodes.registry.HatchNodeCommandContext r11, java.lang.String r12, com.facebook.aura.nodes.core.NodeExecutionContext r13, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.facebook.aura.commands.notifications.NotificationsGetHandler.AnonymousClass1
            if (r0 == 0) goto L28
            r4 = r14
            com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$1 r4 = (com.facebook.aura.commands.notifications.NotificationsGetHandler.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r9 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 3
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L2e
            if (r0 == r8) goto L49
            if (r0 == r3) goto L85
            if (r0 == r5) goto L85
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$1 r4 = new com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$1
            r4.<init>(r14)
            goto L12
        L2e:
            X.78T r2 = X.AnonymousClass002.A0s(r9)
            r1 = 0
            com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$payload$1 r0 = new com.facebook.aura.commands.notifications.NotificationsGetHandler$execute$payload$1
            r0.<init>(r11, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r1
            r4.L$3 = r13
            r4.label = r8
            java.lang.Object r9 = X.GAo.A00(r4, r2, r0)
            if (r9 != r6) goto L50
            return r6
        L49:
            java.lang.Object r13 = r4.L$3
            com.facebook.aura.nodes.core.NodeExecutionContext r13 = (com.facebook.aura.nodes.core.NodeExecutionContext) r13
            X.Hwg.A00(r9)
        L50:
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9
            if (r9 != 0) goto L70
            r9 = 0
            java.lang.String r10 = "Notification listener service is not available."
            r8 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r7 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r11 = r9
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            r4.L$0 = r9
            r4.L$1 = r9
            r4.L$2 = r9
            r4.L$3 = r9
            r4.label = r3
        L69:
            java.lang.Object r9 = com.facebook.aura.nodes.core.NodeExecutionKt.deliver(r13, r7, r4)
            if (r9 != r6) goto L88
            return r6
        L70:
            r10 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r7 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r11 = r10
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.L$3 = r10
            r4.L$4 = r10
            r4.label = r5
            goto L69
        L85:
            X.Hwg.A00(r9)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationsGetHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.NOTIFICATIONS_GET;
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
        return NotificationsCommandSpecs.NOTIFICATIONS_GET;
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
