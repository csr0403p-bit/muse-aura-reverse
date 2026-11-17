package X;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class CI3 {
    public boolean A00;
    public boolean A01;
    public final Writer A02;

    public static void A00(CI3 ci3) throws IOException {
        Writer writer;
        int i;
        if (ci3.A00) {
            writer = ci3.A02;
            i = 44;
        } else {
            ci3.A00 = true;
            writer = ci3.A02;
            i = 123;
        }
        writer.write(i);
    }

    public final void A01(AbstractC3342CFm abstractC3342CFm) throws IOException {
        Writer writer;
        if (this.A01) {
            writer = this.A02;
            writer.write(44);
        } else {
            A00(this);
            writer = this.A02;
            writer.write("\"data\":[");
            this.A01 = true;
        }
        abstractC3342CFm.A0B(writer);
    }

    public CI3(Writer writer) {
        this.A02 = writer;
    }
}
