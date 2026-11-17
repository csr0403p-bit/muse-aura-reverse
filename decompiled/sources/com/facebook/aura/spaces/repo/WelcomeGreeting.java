package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class WelcomeGreeting extends C06G {
    public final String message;
    public final String time;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WelcomeGreeting) {
                WelcomeGreeting welcomeGreeting = (WelcomeGreeting) obj;
                if (!C7384Etj.areEqual(this.time, welcomeGreeting.time) || !C7384Etj.areEqual(this.message, welcomeGreeting.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WelcomeGreeting copy$default(WelcomeGreeting welcomeGreeting, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = welcomeGreeting.time;
        }
        if ((i & 2) != 0) {
            str2 = welcomeGreeting.message;
        }
        AnonymousClass003.A0u(str, str2);
        return new WelcomeGreeting(str, str2);
    }

    public final String component1() {
        return this.time;
    }

    public final String component2() {
        return this.message;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.message, AnonymousClass001.A0G(this.time));
    }

    public WelcomeGreeting(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.time = str;
        this.message = str2;
    }

    public final WelcomeGreeting copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new WelcomeGreeting(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WelcomeGreeting(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public WelcomeGreeting() {
        this("", "");
    }
}
