package com.facebook.aura.commands.geofence;

import X.AnonymousClass002;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.commands.core.NodePermissionActivity;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class GeofenceSetHandler implements HatchNodeCommandHandler {
    public static final GeofenceSetHandler INSTANCE = new GeofenceSetHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.GeofenceSetHandler", f = "GeofenceSetHandler.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, ImageCompressor.IMAGE_COMPRESSION_QUALITY, 100, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 120, 133, 147, 148, 161, 174, 203, 224, 227}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.GeofenceSetHandler$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public double D$0;
        public double D$1;
        public double D$2;
        public double D$3;
        public float F$0;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GeofenceSetHandler.this.execute(null, null, null, null, this);
        }
    }

    private final boolean hasBackgroundLocation(Context context) {
        return AnonymousClass002.A1M(context.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestForegroundLocation(Context context, HtJ<? super Boolean> htJ) {
        if (context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return NodePermissionActivity.Companion.requestPermissions(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, null, null, false, false, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0465 A[PHI: r2
  0x0465: PHI (r2v6 java.lang.Object) = (r2v7 java.lang.Object), (r2v0 java.lang.Object), (r2v35 java.lang.Object) binds: [B:49:0x0170, B:141:0x0462, B:139:0x045f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.facebook.aura.commands.geofence.NodeGeofence, int] */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [float] */
    /* JADX WARN: Type inference failed for: r1v16, types: [float] */
    /* JADX WARN: Type inference failed for: r1v24, types: [float] */
    /* JADX WARN: Type inference failed for: r1v29, types: [float] */
    /* JADX WARN: Type inference failed for: r1v7, types: [float] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.facebook.aura.commands.geofence.GeofenceSetHandler] */
    /* JADX WARN: Type inference failed for: r26v1, types: [float] */
    /* JADX WARN: Type inference failed for: r28v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [float] */
    /* JADX WARN: Type inference failed for: r2v27, types: [float] */
    /* JADX WARN: Type inference failed for: r2v32, types: [float] */
    /* JADX WARN: Type inference failed for: r30v6, types: [float] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.facebook.aura.commands.geofence.GeofenceStore, java.lang.String] */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r26, com.facebook.aura.nodes.registry.HatchNodeCommandContext r27, java.lang.String r28, com.facebook.aura.nodes.core.NodeExecutionContext r29, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.GeofenceSetHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.GEOFENCE_SET;
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
        return GeofenceCommandSpecs.GEOFENCE_SET;
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
