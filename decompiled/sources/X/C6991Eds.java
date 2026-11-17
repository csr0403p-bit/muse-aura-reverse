package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eds, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6991Eds {
    public static final F0C<C6991Eds> A03 = AbstractC5321DgF.A00(C79.A00, 10);
    public int A00;
    public List<? extends InterfaceC7004Ee9> A01;
    public final C6990Edr A02 = new C6990Edr();

    public static final C7003Ee6 A00(InputStream inputStream) {
        int i;
        C7384Etj.A0Y(inputStream, 0);
        try {
            C6991Eds value = A03.getValue();
            int i2 = value.A00;
            byte[] bArr = new byte[i2];
            if (i2 < i2) {
                throw BV4.A0S();
            }
            if (inputStream.markSupported()) {
                try {
                    inputStream.mark(i2);
                    if (i2 < 0) {
                        throw BV6.A0g("len is negative");
                    }
                    i = 0;
                    while (i < i2) {
                        int i3 = inputStream.read(bArr, i, i2 - i);
                        if (i3 == -1) {
                            break;
                        }
                        i += i3;
                    }
                    inputStream.reset();
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            } else {
                if (i2 < 0) {
                    throw BV6.A0g("len is negative");
                }
                i = 0;
                while (i < i2) {
                    int i4 = inputStream.read(bArr, i, i2 - i);
                    if (i4 == -1) {
                        break;
                    }
                    i += i4;
                }
            }
            C7003Ee6 c7003Ee6DetermineFormat = value.A02.determineFormat(bArr, i);
            if (C7384Etj.areEqual(c7003Ee6DetermineFormat, AbstractC6994Edv.A01)) {
                c7003Ee6DetermineFormat = C7003Ee6.A02;
            }
            C7003Ee6 c7003Ee6 = C7003Ee6.A02;
            if (c7003Ee6DetermineFormat != c7003Ee6) {
                return c7003Ee6DetermineFormat;
            }
            List<? extends InterfaceC7004Ee9> list = value.A01;
            if (list != null) {
                Iterator<? extends InterfaceC7004Ee9> it = list.iterator();
                while (it.hasNext()) {
                    C7003Ee6 c7003Ee6DetermineFormat2 = it.next().determineFormat(bArr, i);
                    if (c7003Ee6DetermineFormat2 != c7003Ee6) {
                        return c7003Ee6DetermineFormat2;
                    }
                }
            }
            return c7003Ee6;
        } catch (IOException e) {
            C8U.A00(e);
            throw F60.createAndThrow();
        }
    }

    public static final void A01(C6991Eds c6991Eds) {
        c6991Eds.A00 = c6991Eds.A02.A00;
        List<? extends InterfaceC7004Ee9> list = c6991Eds.A01;
        if (list != null) {
            Iterator<? extends InterfaceC7004Ee9> it = list.iterator();
            while (it.hasNext()) {
                c6991Eds.A00 = Math.max(c6991Eds.A00, it.next().getHeaderSize());
            }
        }
    }

    public C6991Eds() {
        A01(this);
    }
}
