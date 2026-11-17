package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* renamed from: X.Bpr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2954Bpr {
    public final long A00;
    public final long A01;

    public C2954Bpr(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        return BV4.A0m(sbA0w, this.A00);
    }
}
