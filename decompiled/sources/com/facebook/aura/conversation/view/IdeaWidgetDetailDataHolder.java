package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.memory.AuraMemoryBudget;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.IdeaWidgetItemData;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class IdeaWidgetDetailDataHolder {
    public static final int $stable = 0;
    public static final long ENTRY_OVERHEAD_BYTES = 1024;
    public static final int MAX_ENTRIES = 16;
    public static final long MAX_WEIGHT_BYTES = 2097152;
    public static final IdeaWidgetDetailDataHolder INSTANCE = new IdeaWidgetDetailDataHolder();
    public static final AuraByteLruCache<String, IdeaWidgetData> cache = new AuraByteLruCache<>(16, 2097152, 0, true, 0, IdeaWidgetDetailDataHolder$cache$1.INSTANCE, 20, null);

    public final IdeaWidgetData get(String str) {
        C7384Etj.A0Y(str, 0);
        return cache.get(str);
    }

    public final void put(IdeaWidgetData ideaWidgetData) {
        C7384Etj.A0Y(ideaWidgetData, 0);
        cache.put(ideaWidgetData.ideaId, ideaWidgetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long estimatedWeightBytes(IdeaWidgetData ideaWidgetData) {
        Iterator it = Arrays.asList(ideaWidgetData.ideaId, ideaWidgetData.id, ideaWidgetData.kind, ideaWidgetData.title, ideaWidgetData.summary, ideaWidgetData.rationale, ideaWidgetData.categoryLabel, ideaWidgetData.dateLabel, ideaWidgetData.lane, ideaWidgetData.previewImageUrl, ideaWidgetData.installMarkdown, ideaWidgetData.createdAt, ideaWidgetData.updatedAt, ideaWidgetData.sharing.targetIdeaId).iterator();
        long jStringBytes = 0;
        while (it.hasNext()) {
            jStringBytes += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it));
        }
        long j = 1024 + jStringBytes;
        Iterator<String> it2 = ideaWidgetData.tags.iterator();
        long jStringBytes2 = 0;
        while (it2.hasNext()) {
            jStringBytes2 += AuraMemoryBudget.INSTANCE.stringBytes(it2.next());
        }
        long j2 = j + jStringBytes2;
        long j3 = 0;
        for (IdeaWidgetItemData ideaWidgetItemData : ideaWidgetData.items) {
            Iterator it3 = Arrays.asList(ideaWidgetItemData.id, ideaWidgetItemData.kind, ideaWidgetItemData.title, ideaWidgetItemData.summary, ideaWidgetItemData.buildSummary, ideaWidgetItemData.detailDescription, ideaWidgetItemData.previewImageUrl, ideaWidgetItemData.status).iterator();
            long jStringBytes3 = 0;
            while (it3.hasNext()) {
                jStringBytes3 += AuraMemoryBudget.INSTANCE.stringBytes(AnonymousClass005.A0j(it3));
            }
            j3 += jStringBytes3;
        }
        return j2 + j3;
    }

    public final void clear() {
        cache.clear();
    }
}
