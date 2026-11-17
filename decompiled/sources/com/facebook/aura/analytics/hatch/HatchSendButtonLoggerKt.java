package com.facebook.aura.analytics.hatch;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class HatchSendButtonLoggerKt {
    public static final void logSendButtonClick(int i, boolean z, boolean z2, HatchSendButtonOrigin hatchSendButtonOrigin, String str) {
        String str2;
        C7384Etj.A0Y(hatchSendButtonOrigin, 3);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(hatchSendButtonOrigin.isPrimaryThread);
        HatchComponent hatchComponent = HatchComponent.SEND_BUTTON;
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass006.A1B(HatchMetadataKey.FILE_COUNT, c0924AIa, i);
        AnonymousClass003.A0s(HatchMetadataKey.IS_DICTATION_USED, c0924AIa, z);
        AnonymousClass003.A0s(HatchMetadataKey.IS_REPLY, c0924AIa, z2);
        c0924AIa.put(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), String.valueOf(hatchSendButtonOrigin.isPrimaryThread));
        if (!hatchSendButtonOrigin.isPrimaryThread && (str2 = hatchSendButtonOrigin.threadId) != null) {
            AnonymousClass001.A1C(HatchMetadataKey.THREAD_ID, str2, c0924AIa);
        }
        HatchComposerEntryPoint hatchComposerEntryPoint = hatchSendButtonOrigin.entryPoint;
        if (hatchComposerEntryPoint != null) {
            c0924AIa.put(HatchMetadataKey.ENTRY_POINT.getValue(), hatchComposerEntryPoint.getValue());
            HatchMetadataKey originIdMetadataKey = HatchInteractionEnumsKt.getOriginIdMetadataKey(hatchComposerEntryPoint);
            String str3 = hatchSendButtonOrigin.originId;
            if (str3 != null && originIdMetadataKey != null) {
                AnonymousClass001.A1C(originIdMetadataKey, str3, c0924AIa);
            }
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreenChatScreen, hatchComponent, null, AIW.A0K(c0924AIa), str);
    }

    public static /* synthetic */ void logSendButtonClick$default(int i, boolean z, boolean z2, HatchSendButtonOrigin hatchSendButtonOrigin, String str, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str = null;
        }
        logSendButtonClick(i, z, z2, hatchSendButtonOrigin, str);
    }
}
