package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class EmojiCategory extends C06G {
    public static final int $stable = 8;
    public final List<String> emojis;
    public final String id;
    public final String symbol;
    public final int titleRes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmojiCategory) {
                EmojiCategory emojiCategory = (EmojiCategory) obj;
                if (!C7384Etj.areEqual(this.id, emojiCategory.id) || !C7384Etj.areEqual(this.symbol, emojiCategory.symbol) || this.titleRes != emojiCategory.titleRes || !C7384Etj.areEqual(this.emojis, emojiCategory.emojis)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmojiCategory copy$default(EmojiCategory emojiCategory, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emojiCategory.id;
        }
        if ((i2 & 2) != 0) {
            str2 = emojiCategory.symbol;
        }
        if ((i2 & 4) != 0) {
            i = emojiCategory.titleRes;
        }
        if ((i2 & 8) != 0) {
            list = emojiCategory.emojis;
        }
        AnonymousClass005.A0y(str, str2, list);
        return new EmojiCategory(str, str2, i, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.symbol;
    }

    public final int component3() {
        return this.titleRes;
    }

    public final List<String> component4() {
        return this.emojis;
    }

    public final List<String> getEmojis() {
        return this.emojis;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.emojis, (AnonymousClass005.A0I(this.symbol, AnonymousClass001.A0G(this.id)) + this.titleRes) * 31);
    }

    public EmojiCategory(String str, String str2, int i, List<String> list) {
        AnonymousClass005.A0y(str, str2, list);
        this.id = str;
        this.symbol = str2;
        this.titleRes = i;
        this.emojis = list;
    }

    public final EmojiCategory copy(String str, String str2, int i, List<String> list) {
        AnonymousClass005.A0y(str, str2, list);
        return new EmojiCategory(str, str2, i, list);
    }

    public String toString() {
        return super.toString();
    }
}
