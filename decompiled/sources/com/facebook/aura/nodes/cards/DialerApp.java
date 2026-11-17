package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class DialerApp extends C06G {
    public static final int $stable = 8;
    public final Drawable icon;
    public final String label;

    public DialerApp(String str, Drawable drawable) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.icon = drawable;
    }

    public final DialerApp copy(String str, Drawable drawable) {
        C7384Etj.A0Y(str, 0);
        return new DialerApp(str, drawable);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DialerApp) {
                DialerApp dialerApp = (DialerApp) obj;
                if (!C7384Etj.areEqual(this.label, dialerApp.label) || !C7384Etj.areEqual(this.icon, dialerApp.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DialerApp copy$default(DialerApp dialerApp, String str, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialerApp.label;
        }
        if ((i & 2) != 0) {
            drawable = dialerApp.icon;
        }
        C7384Etj.A0Y(str, 0);
        return new DialerApp(str, drawable);
    }

    public final String component1() {
        return this.label;
    }

    public final Drawable component2() {
        return this.icon;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.label) + AnonymousClass006.A0D(this.icon);
    }

    public String toString() {
        return super.toString();
    }
}
