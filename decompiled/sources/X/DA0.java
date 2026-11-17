package X;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DA0 {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public final byte[] A00(DYO dyo) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.A01;
            dataOutputStream.writeBytes(dyo.A03);
            dataOutputStream.writeByte(0);
            String str = dyo.A04;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(dyo.A01);
            dataOutputStream.writeLong(dyo.A02);
            dataOutputStream.write(dyo.A05);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public DA0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }
}
