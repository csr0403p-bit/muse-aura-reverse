package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes5.dex */
public final class BqV {
    public final long A00;
    public final long A01;

    public BqV(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1L;
        } else {
            this.A01 = j;
            this.A00 = j2;
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        return BV4.A0m(sbA0w, this.A00);
    }
}
