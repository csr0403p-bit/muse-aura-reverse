package com.facebook.aura.explore.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.explore.view.cards.IdeaIconCache;
import com.facebook.aura.memory.AuraMemoryBudget;

/* loaded from: classes.dex */
public final class IdeaIconCache$cache$1 extends AbstractC7559F3s implements G0V<String, IdeaIconCache.CacheEntry, Long> {
    public static final IdeaIconCache$cache$1 INSTANCE = new IdeaIconCache$cache$1();

    public IdeaIconCache$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, IdeaIconCache.CacheEntry cacheEntry) {
        String str2;
        AnonymousClass003.A0u(str, cacheEntry);
        AuraMemoryBudget auraMemoryBudget = AuraMemoryBudget.INSTANCE;
        long length = (str.length() * 2) + 128;
        IdeaIcon ideaIcon = cacheEntry.icon;
        if (ideaIcon != null) {
            str2 = ideaIcon.url;
        } else {
            str2 = null;
        }
        return Long.valueOf(length + auraMemoryBudget.stringBytes(str2));
    }
}
