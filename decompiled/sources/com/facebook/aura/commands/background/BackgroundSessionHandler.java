package com.facebook.aura.commands.background;

import X.C60O;
import X.C7qW;
import X.C9sR;
import X.C9sU;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class BackgroundSessionHandler implements HatchNodeCommandHandler {
    public static final BackgroundSessionHandler INSTANCE = new BackgroundSessionHandler();
    public static final C9sU lenientJson = C9sR.A00(BackgroundSessionHandler$lenientJson$1.INSTANCE, C9sU.A03);

    @DebugMetadata(c = "com.facebook.aura.commands.background.BackgroundSessionHandler", f = "BackgroundSessionHandler.kt", l = {58, 64}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.background.BackgroundSessionHandler$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BackgroundSessionHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, com.facebook.aura.nodes.registry.HatchNodeCommandContext r9, java.lang.String r10, com.facebook.aura.nodes.core.NodeExecutionContext r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.background.BackgroundSessionHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.BACKGROUND_SESSION;
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
        return BackgroundSessionCommandSpecs.BACKGROUND_SESSION;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    private final JsonObject statusPayload(String str) {
        return C7qW.A01(AuraDeeplinkRouteMapper.STATUS_ROUTE, str, C60O.A1K());
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
