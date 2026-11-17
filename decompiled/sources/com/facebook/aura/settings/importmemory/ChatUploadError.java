package com.facebook.aura.settings.importmemory;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ChatUploadError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ChatUploadError[] $VALUES;
    public static final ChatUploadError PICKER_UNAVAILABLE;
    public static final ChatUploadError READ_FAILED;
    public static final ChatUploadError TOO_LARGE;
    public static final ChatUploadError UPLOAD_FAILED;

    static {
        ChatUploadError chatUploadError = new ChatUploadError("PICKER_UNAVAILABLE", 0);
        PICKER_UNAVAILABLE = chatUploadError;
        ChatUploadError chatUploadError2 = new ChatUploadError("READ_FAILED", 1);
        READ_FAILED = chatUploadError2;
        ChatUploadError chatUploadError3 = new ChatUploadError("TOO_LARGE", 2);
        TOO_LARGE = chatUploadError3;
        ChatUploadError chatUploadError4 = new ChatUploadError("UPLOAD_FAILED", 3);
        UPLOAD_FAILED = chatUploadError4;
        ChatUploadError[] chatUploadErrorArr = {chatUploadError, chatUploadError2, chatUploadError3, chatUploadError4};
        $VALUES = chatUploadErrorArr;
        $ENTRIES = C3cG.A0w(chatUploadErrorArr);
    }

    public static Ey9<ChatUploadError> getEntries() {
        return $ENTRIES;
    }

    public static ChatUploadError valueOf(String str) {
        return (ChatUploadError) Enum.valueOf(ChatUploadError.class, str);
    }

    public static ChatUploadError[] values() {
        return (ChatUploadError[]) $VALUES.clone();
    }

    public ChatUploadError(String str, int i) {
    }
}
