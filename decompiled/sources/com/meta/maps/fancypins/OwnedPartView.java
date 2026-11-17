package com.meta.maps.fancypins;

import X.AnonymousClass003;
import android.view.View;

/* loaded from: classes6.dex */
public final class OwnedPartView implements FancyPinErasedPartView {
    public final Object owner;
    public final View view;

    public final Object getOwner() {
        return this.owner;
    }

    @Override // com.meta.maps.fancypins.FancyPinErasedPartView
    public View getView() {
        return this.view;
    }

    public OwnedPartView(Object obj, View view) {
        AnonymousClass003.A0u(obj, view);
        this.owner = obj;
        this.view = view;
    }
}
