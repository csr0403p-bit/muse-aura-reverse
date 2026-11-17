package X;

import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public final class EZQ implements PrivilegedAction {
    public final /* synthetic */ String A00;

    public EZQ(String str) {
        this.A00 = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty(this.A00);
    }
}
