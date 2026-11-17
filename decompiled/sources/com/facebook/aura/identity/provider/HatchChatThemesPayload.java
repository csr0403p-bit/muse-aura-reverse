package com.facebook.aura.identity.provider;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchChatThemesPayload extends C06G {
    public static final int $stable = 8;
    public final String selectedThemeId;
    public final List<HatchChatThemeOption> themes;

    public HatchChatThemesPayload(List<HatchChatThemeOption> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.themes = list;
        this.selectedThemeId = str;
    }

    public final HatchChatThemesPayload copy(List<HatchChatThemeOption> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new HatchChatThemesPayload(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemesPayload) {
                HatchChatThemesPayload hatchChatThemesPayload = (HatchChatThemesPayload) obj;
                if (!C7384Etj.areEqual(this.themes, hatchChatThemesPayload.themes) || !C7384Etj.areEqual(this.selectedThemeId, hatchChatThemesPayload.selectedThemeId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChatThemesPayload copy$default(HatchChatThemesPayload hatchChatThemesPayload, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchChatThemesPayload.themes;
        }
        if ((i & 2) != 0) {
            str = hatchChatThemesPayload.selectedThemeId;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchChatThemesPayload(list, str);
    }

    public final List<HatchChatThemeOption> component1() {
        return this.themes;
    }

    public final String component2() {
        return this.selectedThemeId;
    }

    public final String getSelectedThemeId() {
        return this.selectedThemeId;
    }

    public final List<HatchChatThemeOption> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.themes) + AnonymousClass006.A0G(this.selectedThemeId);
    }

    public String toString() {
        return super.toString();
    }
}
