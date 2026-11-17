package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class WhatsAppConnectDisclosureRun extends C06G {
    public static final int $stable = 0;
    public final String text;
    public final String url;

    public WhatsAppConnectDisclosureRun(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.url = str2;
    }

    public final WhatsAppConnectDisclosureRun copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new WhatsAppConnectDisclosureRun(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppConnectDisclosureRun) {
                WhatsAppConnectDisclosureRun whatsAppConnectDisclosureRun = (WhatsAppConnectDisclosureRun) obj;
                if (!C7384Etj.areEqual(this.text, whatsAppConnectDisclosureRun.text) || !C7384Etj.areEqual(this.url, whatsAppConnectDisclosureRun.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppConnectDisclosureRun copy$default(WhatsAppConnectDisclosureRun whatsAppConnectDisclosureRun, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whatsAppConnectDisclosureRun.text;
        }
        if ((i & 2) != 0) {
            str2 = whatsAppConnectDisclosureRun.url;
        }
        C7384Etj.A0Y(str, 0);
        return new WhatsAppConnectDisclosureRun(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.url);
    }

    public String toString() {
        return super.toString();
    }
}
