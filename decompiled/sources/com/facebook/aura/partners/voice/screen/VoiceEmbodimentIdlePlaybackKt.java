package com.facebook.aura.partners.voice.screen;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentIdlePlaybackKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.header.api.AvatarTakeoverIdleMedia rememberMemoryAwareIdleMedia(com.facebook.aura.header.api.AvatarTakeoverIdleMedia r11, X.BFM r12, int r13) {
        /*
            r5 = r11
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$Companion r1 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.Companion
            X.CGz r0 = X.AnonymousClass002.A0h(r12)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r1.getInstance(r0)
            X.1BN<com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression> r0 = r0.embodimentVideoSuppression
            r11 = 0
            X.1BO r4 = X.C2CK.A02(r12, r0)
            java.lang.Object r0 = r4.getValue()
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression r0 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression) r0
            boolean r3 = r0.memoryBlocked
            r0 = r13 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L27
            boolean r0 = r12.A65(r5)
            if (r0 != 0) goto L2c
        L27:
            r0 = r13 & 6
            r1 = 0
            if (r0 != r2) goto L2d
        L2c:
            r1 = 1
        L2d:
            boolean r0 = r12.A66(r3)
            r0 = r0 | r1
            java.lang.Object r1 = r12.AaT()
            if (r0 != 0) goto L3c
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L5b
        L3c:
            if (r5 == 0) goto L57
            java.lang.Object r0 = r4.getValue()
            com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression r0 = (com.facebook.aura.partners.voice.intf.VoiceEmbodimentVideoSuppression) r0
            boolean r0 = r0.memoryBlocked
            if (r0 == 0) goto L57
            java.lang.String r6 = r5.videoUri
            java.lang.String r7 = r5.imageUri
            float r8 = r5.cropTopFraction
            X.AWA r9 = r5.imageSize
            boolean r10 = r5.imageIsVideoPoster
            com.facebook.aura.header.api.AvatarTakeoverIdleMedia r5 = new com.facebook.aura.header.api.AvatarTakeoverIdleMedia
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L57:
            r12.Ai0(r5)
            r1 = r5
        L5b:
            com.facebook.aura.header.api.AvatarTakeoverIdleMedia r1 = (com.facebook.aura.header.api.AvatarTakeoverIdleMedia) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentIdlePlaybackKt.rememberMemoryAwareIdleMedia(com.facebook.aura.header.api.AvatarTakeoverIdleMedia, X.BFM, int):com.facebook.aura.header.api.AvatarTakeoverIdleMedia");
    }
}
