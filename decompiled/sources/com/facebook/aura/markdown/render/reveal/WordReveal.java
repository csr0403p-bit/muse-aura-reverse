package com.facebook.aura.markdown.render.reveal;

import X.AnonymousClass005;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import java.util.Map;

/* loaded from: classes4.dex */
public final class WordReveal {
    public static final int $stable = WordRevealController.$stable;
    public final WordRevealController controller;
    public final Map<AuraBlock, Integer> startOrdinals;
    public final Map<AuraBlock, Integer> wordCounts;

    public final WordRevealController getController() {
        return this.controller;
    }

    public final Map<AuraBlock, Integer> getStartOrdinals() {
        return this.startOrdinals;
    }

    public final Map<AuraBlock, Integer> getWordCounts() {
        return this.wordCounts;
    }

    public WordReveal(WordRevealController wordRevealController, Map<AuraBlock, Integer> map, Map<AuraBlock, Integer> map2) {
        AnonymousClass005.A0x(wordRevealController, map, map2);
        this.controller = wordRevealController;
        this.startOrdinals = map;
        this.wordCounts = map2;
    }
}
