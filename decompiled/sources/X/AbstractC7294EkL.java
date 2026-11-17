package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.EkL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7294EkL {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable.Callback callback, Drawable drawable, InterfaceC7291EkI interfaceC7291EkI) {
        InterfaceC7293EkK interfaceC7293EkK;
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (!(drawable instanceof InterfaceC7293EkK) || (interfaceC7293EkK = (InterfaceC7293EkK) drawable) == null) {
                return;
            }
            interfaceC7293EkK.Af3(interfaceC7291EkI);
        }
    }

    public static final void A01(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }
}
