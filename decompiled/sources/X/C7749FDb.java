package X;

import java.util.Map;

/* renamed from: X.FDb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7749FDb {
    public C0918AHu<Object, Object> A00;
    public final C7765FDs A01;
    public final Map<Object, Object> A02;

    public C7749FDb() {
        this(null);
    }

    public final <T> T A00(Object obj) {
        T t;
        C7384Etj.A0Y(obj, 0);
        C7765FDs c7765FDs = this.A01;
        if (c7765FDs == null || (t = (T) c7765FDs.A01.get(obj)) == null) {
            return null;
        }
        return t;
    }

    public C7749FDb(C7765FDs c7765FDs) {
        this.A01 = c7765FDs;
        this.A02 = BV4.A0u();
    }
}
