package com.facebook.aura.globaleffects.api;

import X.AbstractC7606F5t;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0KA;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import android.view.View;

/* loaded from: classes4.dex */
public final class FloatingWindow {
    public final AppFloatingInsets insets;
    public final boolean isRoot;
    public final View view;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FloatingWindow) {
                FloatingWindow floatingWindow = (FloatingWindow) obj;
                if (this.isRoot != floatingWindow.isRoot || !C7384Etj.areEqual(this.insets, floatingWindow.insets) || !C7384Etj.areEqual(this.view, floatingWindow.view)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FloatingWindow copy$default(FloatingWindow floatingWindow, boolean z, AppFloatingInsets appFloatingInsets, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            z = floatingWindow.isRoot;
        }
        if ((i & 2) != 0) {
            appFloatingInsets = floatingWindow.insets;
        }
        if ((i & 4) != 0) {
            view = floatingWindow.view;
        }
        return floatingWindow.copy(z, appFloatingInsets, view);
    }

    public final boolean component1() {
        return this.isRoot;
    }

    public final AppFloatingInsets component2() {
        return this.insets;
    }

    public final View component3() {
        return this.view;
    }

    public final AppFloatingInsets getInsets() {
        return this.insets;
    }

    public final View getView() {
        return this.view;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.view, AnonymousClass005.A0F(this.insets, C0KA.A02(this.isRoot)));
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public String toString() {
        boolean z = this.isRoot;
        AppFloatingInsets appFloatingInsets = this.insets;
        View view = this.view;
        StringBuilder sbA10 = C60O.A10("FloatingWindow(isRoot=", z);
        sbA10.append(", insets=");
        sbA10.append(appFloatingInsets);
        return C3cJ.A0L(view, AbstractC7606F5t.A00(9), sbA10);
    }

    public FloatingWindow(boolean z, AppFloatingInsets appFloatingInsets, View view) {
        AnonymousClass003.A0x(appFloatingInsets, view);
        this.isRoot = z;
        this.insets = appFloatingInsets;
        this.view = view;
    }

    public final FloatingWindow copy(boolean z, AppFloatingInsets appFloatingInsets, View view) {
        AnonymousClass003.A0x(appFloatingInsets, view);
        return new FloatingWindow(z, appFloatingInsets, view);
    }
}
