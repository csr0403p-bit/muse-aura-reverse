package com.facebook.aura.conversation.viewmodel;

import X.C7384Etj;
import com.facebook.aura.model.HatchSendMessage;

/* loaded from: classes.dex */
public abstract class HatchConversationAttachmentsKt {
    public static final int DEFAULT_MAX_UPLOAD_SIZE_MB = 25;
    public static final String TAG = "HatchConversationVM";

    public static final int attachmentCount(HatchSendMessage hatchSendMessage) {
        C7384Etj.A0Y(hatchSendMessage, 0);
        return hatchSendMessage.imageUris.size() + hatchSendMessage.fileUris.size();
    }
}
