package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class CH0 extends AbstractC3358CGz implements CH8 {
    public final C3626Ca9 A00;
    public final String A01;
    public final /* synthetic */ CH4 A02 = new CH4();

    public static final C3357CGy A01(CH0 ch0) {
        CH7 ch7 = (CH7) ch0.A00.A00.AMN();
        C3357CGy c3357CGy = ch7.A00.get(ch0.A01);
        if (c3357CGy != null) {
            return c3357CGy;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.CH8
    public final ConcurrentHashMap<Integer, Object> AML() {
        return this.A02.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CH0) {
            return this.A01.equals(((CH0) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return FGI.A0d("UserSessionImpl(userId=", this.A01, ", username=", A01(this).A00);
    }

    public CH0(String str) {
        this.A01 = str;
        CHA.A01 = this;
        this.A00 = new C3626Ca9(new F0f(65539));
    }
}
