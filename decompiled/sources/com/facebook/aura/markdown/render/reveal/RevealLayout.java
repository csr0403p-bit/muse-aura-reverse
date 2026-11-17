package com.facebook.aura.markdown.render.reveal;

import X.AnonymousClass003;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RevealLayout {
    public static final int $stable = 0;
    public final Map<AuraBlock, Integer> startOrdinals;
    public final int totalWords;
    public final Map<AuraBlock, Integer> wordCounts;

    public final Map<AuraBlock, Integer> getStartOrdinals() {
        return this.startOrdinals;
    }

    public final int getTotalWords() {
        return this.totalWords;
    }

    public final Map<AuraBlock, Integer> getWordCounts() {
        return this.wordCounts;
    }

    public RevealLayout(Map<AuraBlock, Integer> map, Map<AuraBlock, Integer> map2, int i) {
        AnonymousClass003.A0u(map, map2);
        this.startOrdinals = map;
        this.wordCounts = map2;
        this.totalWords = i;
    }
}
