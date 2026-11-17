package com.facebook.aura.conversation.offline;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchOfflineConversationDao {
    public abstract void clearAllDataKeys();

    public abstract void clearAllMessages();

    public abstract void clearAllThreads();

    public abstract void deleteMessagesBySeq(String str, String str2, List<Long> list);

    public abstract void deleteMessagesExceptVm(String str);

    public abstract void deleteMessagesForEvictedThreads(String str, String str2, int i);

    public abstract void deleteMessagesForSession(String str, String str2);

    public abstract void deleteThread(String str, String str2);

    public abstract void deleteThreadsBeyondLru(String str, int i);

    public abstract void deleteThreadsExceptVm(String str);

    public abstract HatchOfflineThreadEntity getThread(String str, String str2);

    public abstract HatchOfflineKeyEntity loadDataKey(int i);

    public abstract List<HatchOfflineMessageEntity> loadLatestMessages(String str, String str2, int i);

    public abstract HatchOfflineMessageEntity loadMessage(String str, String str2, long j);

    public abstract List<HatchOfflineMessageEntity> loadMessagesBefore(String str, String str2, long j, int i);

    public abstract List<HatchOfflineThreadEntity> loadThreads(String str);

    public abstract String oldestEvictableThread(String str, String str2);

    public abstract long totalJsonBytes(String str);

    public abstract void trimMessagesToCap(String str, String str2, int i);

    public abstract void upsertDataKey(HatchOfflineKeyEntity hatchOfflineKeyEntity);

    public abstract void upsertMessages(List<HatchOfflineMessageEntity> list);

    public abstract void upsertThread(HatchOfflineThreadEntity hatchOfflineThreadEntity);
}
