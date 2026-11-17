package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public abstract class Violation extends RuntimeException {
    public final Fragment fragment;

    public Violation(Fragment fragment, String str) {
        super(str);
        this.fragment = fragment;
    }
}
