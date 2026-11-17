package com.facebook.aura.commands.app;

import X.BFI;
import X.C4JM;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.appupdate.AuraPlayInstallState;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class AppUpdateStartHandler implements HatchNodeCommandHandler {
    public static final AppUpdateStartHandler INSTANCE = new AppUpdateStartHandler();
    public static final Set<AuraPlayInstallState> IN_PROGRESS_STATES = BFI.A0H(new AuraPlayInstallState[]{AuraPlayInstallState.PENDING, AuraPlayInstallState.DOWNLOADING, AuraPlayInstallState.DOWNLOADED, AuraPlayInstallState.INSTALLING});

    @DebugMetadata(c = "com.facebook.aura.commands.app.AppUpdateStartHandler", f = "AppUpdateStartHandler.kt", l = {42, R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 58}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.app.AppUpdateStartHandler$execute$1, reason: invalid class name */
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
            return AppUpdateStartHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r7 == r4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, com.facebook.aura.nodes.registry.HatchNodeCommandContext r9, java.lang.String r10, com.facebook.aura.nodes.core.NodeExecutionContext r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r12) {
        /*
            r7 = this;
            r4 = r12
            r2 = r11
            boolean r0 = r12 instanceof com.facebook.aura.commands.app.AppUpdateStartHandler.AnonymousClass1
            if (r0 == 0) goto L29
            r12 = r4
            com.facebook.aura.commands.app.AppUpdateStartHandler$execute$1 r12 = (com.facebook.aura.commands.app.AppUpdateStartHandler.AnonymousClass1) r12
            int r3 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L29
            int r3 = r3 - r1
            r12.label = r3
        L14:
            java.lang.Object r7 = r12.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r3 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L34
            if (r0 == r6) goto L4b
            if (r0 == r5) goto Lac
            if (r0 != r3) goto L2f
            X.Hwg.A00(r7)
            return r7
        L29:
            com.facebook.aura.commands.app.AppUpdateStartHandler$execute$1 r12 = new com.facebook.aura.commands.app.AppUpdateStartHandler$execute$1
            r12.<init>(r4)
            goto L14
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r7)
            com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion r1 = com.facebook.aura.appupdate.AuraPlayUpdateStatus.Companion
            r12.L$0 = r8
            r0 = 0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r11
            r12.label = r6
            java.lang.Object r7 = r1.read(r12)
            if (r7 != r4) goto L56
        L4a:
            return r4
        L4b:
            java.lang.Object r2 = r12.L$3
            com.facebook.aura.nodes.core.NodeExecutionContext r2 = (com.facebook.aura.nodes.core.NodeExecutionContext) r2
            java.lang.Object r8 = r12.L$0
            X.CGz r8 = (X.AbstractC3358CGz) r8
            X.Hwg.A00(r7)
        L56:
            com.facebook.aura.appupdate.AuraPlayUpdateStatus r7 = (com.facebook.aura.appupdate.AuraPlayUpdateStatus) r7
            if (r7 != 0) goto L72
            com.facebook.aura.commands.app.AppActionOutcome r0 = com.facebook.aura.commands.app.AppActionOutcome.FAILED
        L5c:
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.L$2 = r1
            r12.L$3 = r1
            r12.L$4 = r1
            r12.L$5 = r1
            r12.label = r3
            java.lang.Object r0 = com.facebook.aura.commands.app.AppActionsKt.deliverAppAction(r2, r0, r12)
            if (r0 == r4) goto L4a
            return r0
        L72:
            java.util.Set<com.facebook.aura.appupdate.AuraPlayInstallState> r1 = com.facebook.aura.commands.app.AppUpdateStartHandler.IN_PROGRESS_STATES
            com.facebook.aura.appupdate.AuraPlayInstallState r0 = r7.installState
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7f
            com.facebook.aura.commands.app.AppActionOutcome r0 = com.facebook.aura.commands.app.AppActionOutcome.IN_PROGRESS
            goto L5c
        L7f:
            boolean r0 = r7.updateAvailable
            if (r0 != 0) goto L86
            com.facebook.aura.commands.app.AppActionOutcome r0 = com.facebook.aura.commands.app.AppActionOutcome.ALREADY_DONE
            goto L5c
        L86:
            com.facebook.aura.appupdate.AuraPlayInstallState r1 = r7.installState
            com.facebook.aura.appupdate.AuraPlayInstallState r0 = com.facebook.aura.appupdate.AuraPlayInstallState.NONE
            if (r1 != r0) goto Lba
            boolean r0 = r7.flexibleUpdateAllowed
            if (r0 == 0) goto Lba
            com.facebook.aura.nudge.ConversationNudges r7 = com.facebook.aura.nudge.ConversationNudges.INSTANCE
            long r10 = com.facebook.aura.commands.app.AppActionsKt.appActionCardDeadlineElapsedMs()
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r2
            r12.L$4 = r0
            r12.label = r5
            java.lang.String r9 = "app_update"
            java.lang.Object r7 = r7.awaitOnDemand(r8, r9, r10, r12)
            if (r7 != r4) goto Lb3
            return r4
        Lac:
            java.lang.Object r2 = r12.L$3
            com.facebook.aura.nodes.core.NodeExecutionContext r2 = (com.facebook.aura.nodes.core.NodeExecutionContext) r2
            X.Hwg.A00(r7)
        Lb3:
            com.facebook.aura.conversation.api.ConversationCardOutcome r7 = (com.facebook.aura.conversation.api.ConversationCardOutcome) r7
            com.facebook.aura.commands.app.AppActionOutcome r0 = com.facebook.aura.commands.app.AppActionsKt.toAppActionOutcome(r7)
            goto L5c
        Lba:
            com.facebook.aura.commands.app.AppActionOutcome r0 = com.facebook.aura.commands.app.AppActionOutcome.USE_PLAY_STORE
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.AppUpdateStartHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.APP_UPDATE_START;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return AppCommandSpecs.APP_UPDATE_START;
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
