package com.facebook.aura.identity.provider;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchChatThemesState extends C06G {
    public static final int $stable = 8;
    public final boolean hasFetched;
    public final boolean isFetching;
    public final String selectedThemeId;
    public final List<HatchChatThemeOption> themes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemesState) {
                HatchChatThemesState hatchChatThemesState = (HatchChatThemesState) obj;
                if (!C7384Etj.areEqual(this.themes, hatchChatThemesState.themes) || !C7384Etj.areEqual(this.selectedThemeId, hatchChatThemesState.selectedThemeId) || this.hasFetched != hatchChatThemesState.hasFetched || this.isFetching != hatchChatThemesState.isFetching) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChatThemesState copy$default(HatchChatThemesState hatchChatThemesState, List list, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchChatThemesState.themes;
        }
        if ((i & 2) != 0) {
            str = hatchChatThemesState.selectedThemeId;
        }
        if ((i & 4) != 0) {
            z = hatchChatThemesState.hasFetched;
        }
        if ((i & 8) != 0) {
            z2 = hatchChatThemesState.isFetching;
        }
        AnonymousClass003.A0u(list, str);
        return new HatchChatThemesState(list, str, z, z2);
    }

    public final List<HatchChatThemeOption> component1() {
        return this.themes;
    }

    public final String component2() {
        return this.selectedThemeId;
    }

    public final boolean component3() {
        return this.hasFetched;
    }

    public final boolean component4() {
        return this.isFetching;
    }

    public final boolean getHasFetched() {
        return this.hasFetched;
    }

    public final String getSelectedThemeId() {
        return this.selectedThemeId;
    }

    public final List<HatchChatThemeOption> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0I(this.selectedThemeId, AnonymousClass005.A0E(this.themes)), this.hasFetched), this.isFetching);
    }

    public final boolean isFetching() {
        return this.isFetching;
    }

    public HatchChatThemesState(List<HatchChatThemeOption> list, String str, boolean z, boolean z2) {
        AnonymousClass003.A0u(list, str);
        this.themes = list;
        this.selectedThemeId = str;
        this.hasFetched = z;
        this.isFetching = z2;
    }

    public final HatchChatThemesState copy(List<HatchChatThemeOption> list, String str, boolean z, boolean z2) {
        AnonymousClass003.A0u(list, str);
        return new HatchChatThemesState(list, str, z, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchChatThemesState(List list, String str, boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? "default" : str, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2));
    }

    public HatchChatThemesState() {
        this(C0881AGi.A00, "default", false, false);
    }
}
