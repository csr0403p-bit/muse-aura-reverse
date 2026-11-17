package X;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes5.dex */
public final class EZR implements PrivilegedAction {
    public final /* synthetic */ String A00;

    public EZR(String str) {
        this.A00 = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Security.getProperty(this.A00);
    }
}
