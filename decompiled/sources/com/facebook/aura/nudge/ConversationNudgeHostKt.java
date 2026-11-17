package com.facebook.aura.nudge;

/* loaded from: classes2.dex */
public abstract class ConversationNudgeHostKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.nudge.NudgeControls rememberNudgeControls(com.facebook.aura.nudge.ConversationNudge r9, boolean r10, X.BFM r11, int r12) {
        /*
            int r0 = X.AnonymousClass006.A0E(r9, r12)
            r6 = r0 ^ 6
            r8 = 0
            r4 = 4
            if (r6 <= r4) goto L10
            boolean r0 = r11.A67(r9)
            if (r0 != 0) goto L15
        L10:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r4) goto L16
        L15:
            r0 = 1
        L16:
            java.lang.Object r1 = r11.AaT()
            if (r0 != 0) goto L20
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L28
        L20:
            com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$action$1$1 r1 = new com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$action$1$1
            r1.<init>(r9)
            r11.Ai0(r1)
        L28:
            X.G0U r1 = (X.G0U) r1
            int r0 = r12 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            kotlin.jvm.functions.Function0 r5 = r9.rememberAction(r1, r11, r0)
            java.lang.String r7 = r9.getId()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L48
            boolean r0 = r11.A66(r10)
            if (r0 != 0) goto L4d
        L48:
            r0 = r12 & 48
            r2 = 0
            if (r0 != r1) goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r6 <= r4) goto L56
            boolean r0 = r11.A67(r9)
            if (r0 != 0) goto L5b
        L56:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r4) goto L5c
        L5b:
            r0 = 1
        L5c:
            r2 = r2 | r0
            java.lang.Object r0 = r11.AaT()
            if (r2 != 0) goto L67
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L6f
        L67:
            com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$1$1 r0 = new com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$1$1
            r0.<init>(r10, r9)
            r11.Ai0(r0)
        L6f:
            X.AnonymousClass001.A19(r11, r0, r7, r3)
            X.1BN<com.facebook.aura.nudge.NudgeState> r0 = com.facebook.aura.nudge.ConversationNudgeCoordinator.state
            X.1BO r0 = X.C2CK.A02(r11, r0)
            if (r10 == 0) goto L83
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.nudge.NudgeState.Visible
            r3 = 1
            if (r0 != 0) goto L84
        L83:
            r3 = 0
        L84:
            if (r6 <= r4) goto L8c
            boolean r0 = r11.A67(r9)
            if (r0 != 0) goto L91
        L8c:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r4) goto L92
        L91:
            r0 = 1
        L92:
            boolean r0 = X.AnonymousClass001.A1R(r11, r5, r0)
            java.lang.Object r2 = r11.AaT()
            if (r0 != 0) goto La0
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto La8
        La0:
            com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$2$1 r2 = new com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$2$1
            r2.<init>(r9, r5)
            r11.Ai0(r2)
        La8:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            if (r6 <= r4) goto Lb2
            boolean r0 = r11.A67(r9)
            if (r0 != 0) goto Lb6
        Lb2:
            r0 = r12 & 6
            if (r0 != r4) goto Lb7
        Lb6:
            r8 = 1
        Lb7:
            java.lang.Object r1 = r11.AaT()
            if (r8 != 0) goto Lc1
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lc9
        Lc1:
            com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$3$1 r1 = new com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$3$1
            r1.<init>(r9)
            r11.Ai0(r1)
        Lc9:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            com.facebook.aura.nudge.NudgeControls r0 = new com.facebook.aura.nudge.NudgeControls
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationNudgeHostKt.rememberNudgeControls(com.facebook.aura.nudge.ConversationNudge, boolean, X.BFM, int):com.facebook.aura.nudge.NudgeControls");
    }
}
