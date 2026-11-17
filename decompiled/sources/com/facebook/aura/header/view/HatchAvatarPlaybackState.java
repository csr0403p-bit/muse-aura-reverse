package com.facebook.aura.header.view;

import X.AnonymousClass005;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchAvatarPlaybackState {
    public static final int $stable = 0;
    public final Set<Object> pauseOwners = new LinkedHashSet();
    public final MutableState isPaused$delegate = AnonymousClass005.A0Q();

    public final void setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        Set<Object> set = this.pauseOwners;
        if (z) {
            set.add(obj);
        } else {
            set.remove(obj);
        }
        setPaused(!this.pauseOwners.isEmpty());
    }

    private final void setPaused(boolean z) {
        MutableState.A09(z, this.isPaused$delegate);
    }

    public final boolean isPaused() {
        return MutableState.A0A(this.isPaused$delegate);
    }
}
