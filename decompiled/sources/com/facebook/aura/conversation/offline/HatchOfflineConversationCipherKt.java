package com.facebook.aura.conversation.offline;

/* loaded from: classes5.dex */
public abstract class HatchOfflineConversationCipherKt {
    public static final int GCM_IV_LENGTH_BYTES = 12;
    public static final int GCM_TAG_LENGTH_BITS = 128;
    public static final String KEYSTORE = "AndroidKeyStore";
    public static final String KEY_ALIAS = "hatch_offline_conversation";
    public static final int KEY_SIZE_BITS = 256;
    public static final int KEY_SIZE_BYTES = 32;
    public static final String TAG = "HatchOfflineConversationCipher";
    public static final String TRANSFORMATION = "AES/GCM/NoPadding";
}
