package com.facebook.aura.composer.view;

import X.AnonymousClass002;
import X.C0881AGi;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* loaded from: classes.dex */
public final class ComposerLinkPreviewState {
    public static final int $stable = 0;
    public final MutableState urls$delegate = AnonymousClass002.A0P(C0881AGi.A00);

    public final void setUrls(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.urls$delegate.Af8(list);
    }

    public final List<String> getUrls() {
        return (List) this.urls$delegate.getValue();
    }
}
