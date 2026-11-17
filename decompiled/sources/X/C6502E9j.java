package X;

import android.text.Editable;

/* renamed from: X.E9j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6502E9j extends Editable.Factory {
    public static Class<?> A00;
    public static final Object A01 = C3cG.A0T();
    public static volatile Editable.Factory A02;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = A00;
        return cls != null ? new C6332E1h(charSequence, cls) : super.newEditable(charSequence);
    }

    public C6502E9j() {
        try {
            A00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
