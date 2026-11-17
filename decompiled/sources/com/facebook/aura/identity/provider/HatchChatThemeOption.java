package com.facebook.aura.identity.provider;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchChatThemeOption extends C06G {
    public static final int $stable = 0;
    public final HatchConversationTheme conversationTheme;
    public final String id;
    public final String name;

    public HatchChatThemeOption(String str, String str2, HatchConversationTheme hatchConversationTheme) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        this.id = str;
        this.name = str2;
        this.conversationTheme = hatchConversationTheme;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemeOption) {
                HatchChatThemeOption hatchChatThemeOption = (HatchChatThemeOption) obj;
                if (!C7384Etj.areEqual(this.id, hatchChatThemeOption.id) || !C7384Etj.areEqual(this.name, hatchChatThemeOption.name) || !C7384Etj.areEqual(this.conversationTheme, hatchChatThemeOption.conversationTheme)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChatThemeOption copy$default(HatchChatThemeOption hatchChatThemeOption, String str, String str2, HatchConversationTheme hatchConversationTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatThemeOption.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchChatThemeOption.name;
        }
        if ((i & 4) != 0) {
            hatchConversationTheme = hatchChatThemeOption.conversationTheme;
        }
        return hatchChatThemeOption.copy(str, str2, hatchConversationTheme);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final HatchConversationTheme component3() {
        return this.conversationTheme;
    }

    public final HatchConversationTheme getConversationTheme() {
        return this.conversationTheme;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.conversationTheme);
    }

    public final boolean isAvatarTheme() {
        return HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID.equals(this.id);
    }

    /* renamed from: swatchColor-ijrfgN4, reason: not valid java name */
    public final B6A m1102swatchColorijrfgN4(boolean z) {
        HatchConversationTheme hatchConversationTheme = this.conversationTheme;
        if (hatchConversationTheme == null) {
            return null;
        }
        return new B6A(z ? hatchConversationTheme.userBubbleColorDark : hatchConversationTheme.userBubbleColorLight);
    }

    public final HatchChatThemeOption copy(String str, String str2, HatchConversationTheme hatchConversationTheme) {
        AnonymousClass003.A0u(str, str2);
        return new HatchChatThemeOption(str, str2, hatchConversationTheme);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchChatThemeOption(String str, String str2, HatchConversationTheme hatchConversationTheme, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : hatchConversationTheme);
    }
}
