package X;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DKK implements Closeable {
    public boolean A00;
    public String[] A01;
    public final DataInputStream A02;
    public final Map<String, C4987DKg> A03;

    public static C5084DVd A00(DKK dkk) throws IOException {
        C5084DVd c5084DVdA00;
        C5084DVd c5084DVdA002;
        DataInputStream dataInputStream = dkk.A02;
        byte b = dataInputStream.readByte();
        String str = null;
        switch (b) {
            case 12:
                c5084DVdA002 = null;
                str = dkk.A01[dataInputStream.readShort()];
                c5084DVdA00 = null;
                break;
            case 13:
            case 14:
            case 15:
                c5084DVdA00 = A00(dkk);
                if (b != 13) {
                    c5084DVdA002 = null;
                    break;
                } else {
                    c5084DVdA002 = A00(dkk);
                    break;
                }
            default:
                c5084DVdA00 = null;
                c5084DVdA002 = null;
                break;
        }
        return new C5084DVd(c5084DVdA00, c5084DVdA002, str, b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    public DKK(DataInputStream dataInputStream, Map<String, C4987DKg> map) {
        this.A02 = dataInputStream;
        this.A03 = map;
    }
}
