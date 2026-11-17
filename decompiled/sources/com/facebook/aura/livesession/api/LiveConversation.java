package com.facebook.aura.livesession.api;

import X.C20Q;
import java.util.Set;

/* loaded from: classes6.dex */
public interface LiveConversation {
    void appendStreamingUserMessage(String str, String str2);

    void finishStreamingUserMessage(String str);

    C20Q<LiveConversationReplies> getReplies();

    String getThreadId();

    void onLiveSessionConnected();

    void removeProvisionalUserMessages(Set<String> set);

    void sendUserMessage(String str, String str2);

    void showProvisionalUserMessage(String str, String str2);

    void startStreamingUserMessage(String str, Long l);
}
