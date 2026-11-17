package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$pillSessionId$2$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<AuraNavKey> $topNonOverlay$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$pillSessionId$2$1(AuraNavigator auraNavigator, C1BO<? extends AuraNavKey> c1bo) {
        super(0);
        this.$navigator = auraNavigator;
        this.$topNonOverlay$delegate = c1bo;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012 A[PHI: r1
  0x0012: PHI (r1v10 java.lang.String) = (r1v9 java.lang.String), (r1v11 java.lang.String) binds: [B:14:0x002d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String invoke() {
        /*
            r3 = this;
            com.facebook.aura.navigation.AuraNavigator r1 = r3.$navigator
            r2 = 0
            r0 = 1
            com.facebook.aura.navigation.AuraNavKey r1 = r1.currentKey(r0)
            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.HatchStatusScreenKey
            if (r0 == 0) goto L1b
            com.facebook.aura.navigation.key.HatchStatusScreenKey r1 = (com.facebook.aura.navigation.key.HatchStatusScreenKey) r1
            java.lang.String r1 = r1.sessionId
        L10:
            if (r1 == 0) goto L42
        L12:
            java.lang.String r0 = "primary_session_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L42
            return r1
        L1b:
            X.1BO<com.facebook.aura.navigation.AuraNavKey> r0 = r3.$topNonOverlay$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.navigation.AuraNavKey r1 = (com.facebook.aura.navigation.AuraNavKey) r1
            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.HatchStatusScreenKey
            if (r0 == 0) goto L2f
            com.facebook.aura.navigation.key.HatchStatusScreenKey r1 = (com.facebook.aura.navigation.key.HatchStatusScreenKey) r1
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.sessionId
            if (r1 != 0) goto L12
        L2f:
            X.1BO<com.facebook.aura.navigation.AuraNavKey> r0 = r3.$topNonOverlay$delegate
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.navigation.AuraNavKey r1 = (com.facebook.aura.navigation.AuraNavKey) r1
            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.ConversationScreenKey
            if (r0 == 0) goto L42
            com.facebook.aura.navigation.key.ConversationScreenKey r1 = (com.facebook.aura.navigation.key.ConversationScreenKey) r1
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.sessionId
            goto L10
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$pillSessionId$2$1.invoke():java.lang.String");
    }
}
