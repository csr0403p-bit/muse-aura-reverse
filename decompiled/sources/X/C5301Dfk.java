package X;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.Dfk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5301Dfk {
    public final int A00;
    public final Method A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5301Dfk) {
                C5301Dfk c5301Dfk = (C5301Dfk) obj;
                if (this.A00 != c5301Dfk.A00 || !this.A01.getName().equals(c5301Dfk.A01.getName())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01.getName(), this.A00 * 31);
    }

    public C5301Dfk(Method method, int i) throws SecurityException {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
