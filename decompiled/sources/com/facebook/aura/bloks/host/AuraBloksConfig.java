package com.facebook.aura.bloks.host;

import X.AnonymousClass002;
import X.C60P;
import X.C7637F8b;
import X.F8A;
import X.F8T;
import X.FS5;
import android.content.Context;

/* loaded from: classes6.dex */
public class AuraBloksConfig implements F8T {
    public F8A getAnimationPerfLogger() {
        return null;
    }

    public /* synthetic */ C7637F8b getBloksExperiments() {
        return new C7637F8b(this);
    }

    public /* synthetic */ Integer getDefaultTextColor(Context context) {
        return null;
    }

    public /* synthetic */ CharSequence getPullToRefreshAccessibilityLabel(Context context) {
        return null;
    }

    public FS5 getScrollPerfLogger() {
        return null;
    }

    @Override // X.F8T
    public boolean calculateDarkMode(Context context) {
        return AnonymousClass002.A1Q(C60P.A00(context), 32);
    }
}
