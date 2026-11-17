package com.facebook.aura.channels;

/* loaded from: classes.dex */
public final class HatchMessengerAgentThread {
    public static final HatchMessengerAgentThread INSTANCE = new HatchMessengerAgentThread();
    public static final String MUSE_CHAT_DEEPLINK = "fb-messenger://hatch?in_app_flow=true";

    public final String deeplinkFor(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return MUSE_CHAT_DEEPLINK;
    }
}
