package com.facebook.aura.nodes.cards;

import X.C7384Etj;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class NodeCardAppInfo {
    public static final int $stable = 8;
    public final Drawable icon;
    public final String label;

    public NodeCardAppInfo(String str, Drawable drawable) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.icon = drawable;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }
}
