package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CFF<Record> {
    public final CMX<Record> A00;
    public final CMX<Record> A01;
    public final AtomicReference<CMX<Record>> A02;

    public CFF() {
        CMX<Record> cmx = new CMX<>(800);
        this.A00 = cmx;
        this.A01 = new CMX<>(800);
        this.A02 = BV4.A16(cmx);
    }

    public final void A00(Record record) {
        this.A02.get().A00(record);
    }
}
