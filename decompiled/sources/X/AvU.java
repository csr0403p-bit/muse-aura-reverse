package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class AvU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewParent] */
    public static final ViewGroup A00(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw C8j3.A0w(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", C3cG.A0f(view, "Couldn't find a valid parent for "));
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
