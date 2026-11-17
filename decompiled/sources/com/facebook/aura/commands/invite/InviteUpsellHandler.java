package com.facebook.aura.commands.invite;

import X.C10571Hud;
import X.C3cG;
import X.C9oY;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.utils.HatchUtil;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class InviteUpsellHandler implements HatchNodeCommandHandler {
    public static final InviteUpsellHandler INSTANCE = new InviteUpsellHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.invite.InviteUpsellHandler", f = "InviteUpsellHandler.kt", l = {75}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.invite.InviteUpsellHandler$execute$1, reason: invalid class name */
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
            return InviteUpsellHandler.this.execute(null, null, null, null, this);
        }
    }

    private final String parseSrc(String str) {
        Object objA0s;
        JsonElement jsonElement;
        String strA04;
        if (str != null) {
            try {
                objA0s = HatchJsonKt.HatchJson.A04(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            jsonElement = (JsonElement) objA0s;
        } else {
            jsonElement = null;
        }
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            Object obj = jsonObject.get(InviteUpsellHandlerKt.SRC_PARAM);
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive != null && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
                String str2 = InviteUpsellHandlerKt.SRC_REGEX.A08(strA04) ? strA04 : null;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return InviteUpsellHandlerKt.DEFAULT_SRC;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r10, com.facebook.aura.nodes.registry.HatchNodeCommandContext r11, java.lang.String r12, com.facebook.aura.nodes.core.NodeExecutionContext r13, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.facebook.aura.commands.invite.InviteUpsellHandler.AnonymousClass1
            if (r0 == 0) goto L75
            r3 = r14
            com.facebook.aura.commands.invite.InviteUpsellHandler$execute$1 r3 = (com.facebook.aura.commands.invite.InviteUpsellHandler.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r8 = 1
            if (r0 == 0) goto L2d
            if (r0 != r8) goto L7b
            java.lang.Object r9 = r3.L$5
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9
            X.Hwg.A00(r1)
        L24:
            r10 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r7 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r11 = r10
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L2d:
            X.Hwg.A00(r1)
            java.lang.String r6 = r9.parseSrc(r12)
            com.facebook.aura.analytics.hatch.HatchInteractionLogger r5 = com.facebook.aura.analytics.hatch.HatchInteractionLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r4 = com.facebook.aura.analytics.hatch.HatchSurface.ONBOARDING
            com.facebook.aura.analytics.hatch.HatchScreen r1 = com.facebook.aura.analytics.hatch.HatchScreen.ONBOARDING_INVITE_FRIENDS
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.ENTRY_POINT
            java.util.Map r0 = X.AnonymousClass007.A0c(r0, r6)
            r2 = 0
            r5.logDeepLink(r4, r2, r1, r0)
            com.facebook.aura.uicontrol.UiControlActionSink$Companion r0 = com.facebook.aura.uicontrol.UiControlActionSink.Companion
            com.facebook.aura.uicontrol.UiControlActionSink r1 = r0.getInstance(r10)
            java.lang.String r0 = "hatch://invite_friends?src="
            java.lang.String r0 = X.FGI.A0M(r0, r6)
            r1.publishNavigation(r0)
            X.2nw r1 = X.C60O.A1K()
            java.lang.String r0 = "ok"
            X.C7qW.A0A(r0, r1, r8)
            kotlinx.serialization.json.JsonObject r9 = r1.A00()
            r3.L$0 = r2
            r3.L$1 = r2
            r3.L$2 = r2
            r3.L$3 = r2
            r3.L$4 = r2
            r3.L$5 = r9
            r3.label = r8
            java.lang.Object r0 = com.facebook.aura.nodes.core.NodeExecutionKt.sendSuccess(r13, r9, r2, r3)
            if (r0 != r7) goto L24
            return r7
        L75:
            com.facebook.aura.commands.invite.InviteUpsellHandler$execute$1 r3 = new com.facebook.aura.commands.invite.InviteUpsellHandler$execute$1
            r3.<init>(r14)
            goto L12
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.invite.InviteUpsellHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.INVITE_UPSELL;
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
        return InviteCommandSpecs.INVITE_UPSELL;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public boolean isEnabled() {
        return HatchUtil.INSTANCE.isInviteFriendsEnabled();
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
