package com.facebook.aura.spaces.repo;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SpaceCardType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceCardType[] $VALUES;
    public static final SpaceCardType ARTICLES;
    public static final SpaceCardType BRIEFING;
    public static final Companion Companion;
    public static final SpaceCardType DECISION;
    public static final SpaceCardType FLIGHT_DARK;
    public static final SpaceCardType HERO_ARTICLE;
    public static final SpaceCardType HTML_WEB_VIEW;
    public static final SpaceCardType INSIGHT;
    public static final SpaceCardType MARKETS;
    public static final SpaceCardType META_AI_PULSE;
    public static final SpaceCardType MUSIC;
    public static final SpaceCardType REMINDER;
    public static final SpaceCardType SUGGESTIONS;
    public static final SpaceCardType UNKNOWN;
    public static final SpaceCardType VIDEO;
    public static final SpaceCardType WEATHER;
    public final String value;

    static {
        SpaceCardType spaceCardType = new SpaceCardType("BRIEFING", 0, "briefing");
        BRIEFING = spaceCardType;
        SpaceCardType spaceCardType2 = new SpaceCardType("ARTICLES", 1, "articles");
        ARTICLES = spaceCardType2;
        SpaceCardType spaceCardType3 = new SpaceCardType("HERO_ARTICLE", 2, "hero-article");
        HERO_ARTICLE = spaceCardType3;
        SpaceCardType spaceCardType4 = new SpaceCardType("VIDEO", 3, "video");
        VIDEO = spaceCardType4;
        SpaceCardType spaceCardType5 = new SpaceCardType("MARKETS", 4, "markets");
        MARKETS = spaceCardType5;
        SpaceCardType spaceCardType6 = new SpaceCardType("MUSIC", 5, "music");
        MUSIC = spaceCardType6;
        SpaceCardType spaceCardType7 = new SpaceCardType("WEATHER", 6, "weather");
        WEATHER = spaceCardType7;
        SpaceCardType spaceCardType8 = new SpaceCardType("REMINDER", 7, HatchNodeCardJsonKt.TYPE_REMINDER);
        REMINDER = spaceCardType8;
        SpaceCardType spaceCardType9 = new SpaceCardType("FLIGHT_DARK", 8, "flight-dark");
        FLIGHT_DARK = spaceCardType9;
        SpaceCardType spaceCardType10 = new SpaceCardType("SUGGESTIONS", 9, "suggestions");
        SUGGESTIONS = spaceCardType10;
        SpaceCardType spaceCardType11 = new SpaceCardType("INSIGHT", 10, "insight");
        INSIGHT = spaceCardType11;
        SpaceCardType spaceCardType12 = new SpaceCardType("META_AI_PULSE", 11, "meta-ai-pulse");
        META_AI_PULSE = spaceCardType12;
        SpaceCardType spaceCardType13 = new SpaceCardType("DECISION", 12, "decision");
        DECISION = spaceCardType13;
        SpaceCardType spaceCardType14 = new SpaceCardType("HTML_WEB_VIEW", 13, "html-webview");
        HTML_WEB_VIEW = spaceCardType14;
        SpaceCardType spaceCardType15 = new SpaceCardType("UNKNOWN", 14, "unknown");
        UNKNOWN = spaceCardType15;
        SpaceCardType[] spaceCardTypeArr = {spaceCardType, spaceCardType2, spaceCardType3, spaceCardType4, spaceCardType5, spaceCardType6, spaceCardType7, spaceCardType8, spaceCardType9, spaceCardType10, spaceCardType11, spaceCardType12, spaceCardType13, spaceCardType14, spaceCardType15};
        $VALUES = spaceCardTypeArr;
        $ENTRIES = C3cG.A0w(spaceCardTypeArr);
        Companion = new Companion();
    }

    public static Ey9<SpaceCardType> getEntries() {
        return $ENTRIES;
    }

    public static SpaceCardType valueOf(String str) {
        return (SpaceCardType) Enum.valueOf(SpaceCardType.class, str);
    }

    public static SpaceCardType[] values() {
        return (SpaceCardType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final class Companion {
        public final SpaceCardType fromString(String str) {
            SpaceCardType next;
            C7384Etj.A0Y(str, 0);
            Iterator<SpaceCardType> it = SpaceCardType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getValue())) {
                    break;
                }
            }
            SpaceCardType spaceCardType = next;
            return spaceCardType == null ? SpaceCardType.UNKNOWN : spaceCardType;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceCardType(String str, int i, String str2) {
        this.value = str2;
    }
}
