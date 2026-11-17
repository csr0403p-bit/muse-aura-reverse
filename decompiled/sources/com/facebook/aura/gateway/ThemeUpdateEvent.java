package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ThemeUpdateEvent extends C06G {
    public static final int $stable = 0;
    public final String selectedThemeId;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThemeUpdateEvent) && C7384Etj.areEqual(this.selectedThemeId, ((ThemeUpdateEvent) obj).selectedThemeId));
    }

    public static /* synthetic */ ThemeUpdateEvent copy$default(ThemeUpdateEvent themeUpdateEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeUpdateEvent.selectedThemeId;
        }
        return new ThemeUpdateEvent(str);
    }

    public final String component1() {
        return this.selectedThemeId;
    }

    public final ThemeUpdateEvent copy(String str) {
        return new ThemeUpdateEvent(str);
    }

    public final String getSelectedThemeId() {
        return this.selectedThemeId;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.selectedThemeId);
    }

    public ThemeUpdateEvent(String str) {
        this.selectedThemeId = str;
    }

    public String toString() {
        return super.toString();
    }
}
