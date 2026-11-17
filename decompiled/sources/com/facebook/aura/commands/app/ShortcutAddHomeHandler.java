package com.facebook.aura.commands.app;

import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.shortcut.HomeScreenShortcutSyncKt;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class ShortcutAddHomeHandler implements HatchNodeCommandHandler {
    public static final ShortcutAddHomeHandler INSTANCE = new ShortcutAddHomeHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.app.ShortcutAddHomeHandler", f = "ShortcutAddHomeHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 54}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.app.ShortcutAddHomeHandler$execute$1, reason: invalid class name */
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
            return ShortcutAddHomeHandler.this.execute(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[PHI: r0
  0x002b: PHI (r0v16 java.lang.Object) = (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:23:0x0071, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r9, com.facebook.aura.nodes.registry.HatchNodeCommandContext r10, java.lang.String r11, com.facebook.aura.nodes.core.NodeExecutionContext r12, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.ShortcutAddHomeHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.SHORTCUT_ADD_HOME;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return AppCommandSpecs.SHORTCUT_ADD_HOME;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public boolean isEnabled() {
        return HomeScreenShortcutSyncKt.getAddToHomeShortcutEnabled();
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
