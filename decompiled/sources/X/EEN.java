package X;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class EEN extends EEM {
    public final OutputStream A00;
    public final String A01;
    public final /* synthetic */ EEF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EEN(EEF eef, OutputStream outputStream, String str) {
        super(outputStream);
        C7384Etj.A0Y(outputStream, 2);
        this.A02 = eef;
        this.A01 = str;
        this.A00 = outputStream;
    }

    @Override // X.EEM, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
        this.A02.A02.add(this.A01);
    }
}
