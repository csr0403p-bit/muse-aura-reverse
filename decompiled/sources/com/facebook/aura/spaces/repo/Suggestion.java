package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class Suggestion extends C06G {
    public final String icon;
    public final String id;
    public final String text;
    public final String timestamp;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Suggestion) {
                Suggestion suggestion = (Suggestion) obj;
                if (!C7384Etj.areEqual(this.id, suggestion.id) || !C7384Etj.areEqual(this.text, suggestion.text) || !C7384Etj.areEqual(this.icon, suggestion.icon) || !C7384Etj.areEqual(this.timestamp, suggestion.timestamp)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestion.id;
        }
        if ((i & 2) != 0) {
            str2 = suggestion.text;
        }
        if ((i & 4) != 0) {
            str3 = suggestion.icon;
        }
        if ((i & 8) != 0) {
            str4 = suggestion.timestamp;
        }
        AnonymousClass005.A0y(str, str2, str4);
        return new Suggestion(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.timestamp;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.timestamp, (AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.icon)) * 31);
    }

    public Suggestion(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str4);
        this.id = str;
        this.text = str2;
        this.icon = str3;
        this.timestamp = str4;
    }

    public final Suggestion copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str4);
        return new Suggestion(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Suggestion(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass002.A0k() : str, str2, AnonymousClass006.A0t(i, str3), (i & 8) != 0 ? "" : str4);
    }
}
