package com.facebook.aura.commands.app;

import X.C4JM;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class AppUpdateCheckHandler implements HatchNodeCommandHandler {
    public static final AppUpdateCheckHandler INSTANCE = new AppUpdateCheckHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.app.AppUpdateCheckHandler", f = "AppUpdateCheckHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, 44, 60}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.app.AppUpdateCheckHandler$execute$1, reason: invalid class name */
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
            return AppUpdateCheckHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r12, com.facebook.aura.nodes.registry.HatchNodeCommandContext r13, java.lang.String r14, com.facebook.aura.nodes.core.NodeExecutionContext r15, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r16) {
        /*
            r11 = this;
            r3 = r15
            r5 = r16
            boolean r0 = r5 instanceof com.facebook.aura.commands.app.AppUpdateCheckHandler.AnonymousClass1
            if (r0 == 0) goto L2b
            r2 = r5
            com.facebook.aura.commands.app.AppUpdateCheckHandler$execute$1 r2 = (com.facebook.aura.commands.app.AppUpdateCheckHandler.AnonymousClass1) r2
            int r4 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L2b
            int r4 = r4 - r1
            r2.label = r4
        L15:
            java.lang.Object r1 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r7 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L31
            if (r0 == r6) goto L48
            if (r0 == r5) goto Lb9
            if (r0 == r7) goto Lb9
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            com.facebook.aura.commands.app.AppUpdateCheckHandler$execute$1 r2 = new com.facebook.aura.commands.app.AppUpdateCheckHandler$execute$1
            r2.<init>(r5)
            goto L15
        L31:
            X.Hwg.A00(r1)
            com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion r1 = com.facebook.aura.appupdate.AuraPlayUpdateStatus.Companion
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r0
            r2.L$3 = r15
            r2.label = r6
            java.lang.Object r1 = r1.read(r2)
            if (r1 != r4) goto L4f
            return r4
        L48:
            java.lang.Object r3 = r2.L$3
            com.facebook.aura.nodes.core.NodeExecutionContext r3 = (com.facebook.aura.nodes.core.NodeExecutionContext) r3
            X.Hwg.A00(r1)
        L4f:
            com.facebook.aura.appupdate.AuraPlayUpdateStatus r1 = (com.facebook.aura.appupdate.AuraPlayUpdateStatus) r1
            if (r1 != 0) goto L6f
            r10 = 0
            java.lang.String r11 = "Could not reach Google Play to check for updates."
            r9 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r8 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r12 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13)
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.label = r5
        L68:
            java.lang.Object r1 = com.facebook.aura.nodes.core.NodeExecutionKt.deliver(r3, r8, r2)
            if (r1 != r4) goto Lbc
            return r4
        L6f:
            java.lang.String r10 = "16.0.0.11.159"
            int r11 = com.facebook.common.build.BuildConstants.A00()
            boolean r12 = r1.updateAvailable
            int r0 = r1.availableVersionCode
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            r5 = 0
            r13 = r5
            if (r12 == 0) goto L82
            r13 = r0
        L82:
            java.lang.Integer r0 = r1.stalenessDays
            r14 = r5
            if (r12 == 0) goto L88
            r14 = r0
        L88:
            com.facebook.aura.appupdate.AuraPlayInstallState r0 = r1.installState
            java.lang.String r15 = X.AnonymousClass006.A0x(r0)
            boolean r0 = r1.flexibleUpdateAllowed
            java.lang.String r9 = "google_play"
            com.facebook.aura.commands.app.AppUpdateJson r8 = new com.facebook.aura.commands.app.AppUpdateJson
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.commands.app.AppUpdateJson$$serializer r0 = com.facebook.aura.commands.app.AppUpdateJson$$serializer.INSTANCE
            kotlinx.serialization.json.JsonElement r10 = r1.A03(r8, r0)
            com.facebook.aura.nodes.core.NodeCommandResponse r8 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r11 = r5
            r12 = r5
            r13 = r5
            r9 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r2.L$0 = r5
            r2.L$1 = r5
            r2.L$2 = r5
            r2.L$3 = r5
            r2.L$4 = r5
            r2.L$5 = r5
            r2.label = r7
            goto L68
        Lb9:
            X.Hwg.A00(r1)
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.AppUpdateCheckHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.APP_UPDATE_CHECK;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return AppCommandSpecs.APP_UPDATE_CHECK;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public boolean isEnabled() {
        return AuraInstallSourceDetector.INSTANCE.isPlayStoreInstall(C4JM.A00());
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
