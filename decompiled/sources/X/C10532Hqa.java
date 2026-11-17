package X;

import java.nio.charset.Charset;

/* renamed from: X.Hqa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10532Hqa implements Cloneable {
    public GtM A01 = GtM.base;
    public Charset A00 = AbstractC10501Hne.A00;
    public boolean A02 = true;

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C10532Hqa clone() {
        try {
            C10532Hqa c10532Hqa = (C10532Hqa) super.clone();
            c10532Hqa.A00 = Charset.forName(this.A00.name());
            c10532Hqa.A01 = GtM.valueOf(this.A01.name());
            return c10532Hqa;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }
}
