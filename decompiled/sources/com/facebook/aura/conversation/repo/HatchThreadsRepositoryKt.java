package com.facebook.aura.conversation.repo;

import X.AbstractC7536F0j;
import X.C60Q;
import com.facebook.aura.gateway.HatchSessionItem;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class HatchThreadsRepositoryKt {
    public static final long[] DELETE_ACTIVE_MESSAGE_RETRY_DELAYS_MS = {250, 500, 1000, 2000, 2000, 2000, 2000};
    public static final int HTTP_NOT_FOUND = 404;
    public static final Comparator<HatchSessionItem> HatchArchivedSessionListComparator;
    public static final Comparator<HatchSessionItem> HatchSessionListComparator;
    public static final int PAGE_SIZE = 20;
    public static final String TITLE_TOO_LONG_MESSAGE = "must be at most 120 characters";
    public static final String VOICE_CALL_ACTIVE_ERROR_CODE = "voice_call_active";

    static {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Boolean.valueOf(((HatchSessionItem) t2).isPinned).compareTo(Boolean.valueOf(((HatchSessionItem) t).isPinned));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? C60Q.A01(Long.valueOf(((HatchSessionItem) t2).updatedAt), ((HatchSessionItem) t).updatedAt) : iCompare;
            }
        };
        final Comparator comparator3 = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$thenByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? Long.valueOf(((HatchSessionItem) t2).createdAt).compareTo(Long.valueOf(((HatchSessionItem) t).createdAt)) : iCompare;
            }
        };
        HatchSessionListComparator = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$thenByDescending$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator3.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((HatchSessionItem) t2).sessionId, ((HatchSessionItem) t).sessionId) : iCompare;
            }
        };
        final Comparator comparator4 = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$compareByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C60Q.A01(Long.valueOf(((HatchSessionItem) t2).updatedAt), ((HatchSessionItem) t).updatedAt);
            }
        };
        final Comparator comparator5 = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$thenByDescending$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator4.compare(t, t2);
                return iCompare == 0 ? Long.valueOf(((HatchSessionItem) t2).createdAt).compareTo(Long.valueOf(((HatchSessionItem) t).createdAt)) : iCompare;
            }
        };
        HatchArchivedSessionListComparator = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt$special$$inlined$thenByDescending$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator5.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((HatchSessionItem) t2).sessionId, ((HatchSessionItem) t).sessionId) : iCompare;
            }
        };
    }

    public static final Comparator<HatchSessionItem> getHatchSessionListComparator() {
        return HatchSessionListComparator;
    }
}
