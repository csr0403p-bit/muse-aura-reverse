package com.facebook.aura.commands.subscriptions;

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
public final class SubscriptionsUpgradeHandler implements HatchNodeCommandHandler {
    public static final SubscriptionsUpgradeHandler INSTANCE = new SubscriptionsUpgradeHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler", f = "SubscriptionsUpgradeHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler$execute$1, reason: invalid class name */
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
            return SubscriptionsUpgradeHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r5, com.facebook.aura.nodes.registry.HatchNodeCommandContext r6, java.lang.String r7, com.facebook.aura.nodes.core.NodeExecutionContext r8, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler.AnonymousClass1
            if (r0 == 0) goto L5c
            r2 = r9
            com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler$execute$1 r2 = (com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L5c
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r1 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L62
            java.lang.Object r5 = r2.L$4
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5
            X.Hwg.A00(r1)
        L24:
            r6 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r3 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r7 = r6
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.uicontrol.UiControlActionSink$Companion r0 = com.facebook.aura.uicontrol.UiControlActionSink.Companion
            com.facebook.aura.uicontrol.UiControlActionSink r1 = r0.getInstance(r5)
            java.lang.String r0 = "hatch://subscription_hub?page=paywall&entry_point=chat"
            r1.publishNavigation(r0)
            X.2nw r1 = X.C60O.A1K()
            java.lang.String r0 = "ok"
            X.C7qW.A0A(r0, r1, r4)
            kotlinx.serialization.json.JsonObject r5 = r1.A00()
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r0
            r2.L$3 = r0
            r2.L$4 = r5
            r2.label = r4
            java.lang.Object r0 = com.facebook.aura.nodes.core.NodeExecutionKt.sendSuccess(r8, r5, r0, r2)
            if (r0 != r3) goto L24
            return r3
        L5c:
            com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler$execute$1 r2 = new com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler$execute$1
            r2.<init>(r9)
            goto L12
        L62:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.SUBSCRIPTIONS_UPGRADE;
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
        return SubscriptionsCommandSpecs.SUBSCRIPTIONS_UPGRADE;
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
