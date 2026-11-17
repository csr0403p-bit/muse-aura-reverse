package X;

import com.facebook.thrift.transport.TTransportException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.DVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5090DVl {
    public static final C5091DVm A02;
    public InputStream A00;
    public OutputStream A01;

    public final void A00(byte[] bArr, int i) throws IOException {
        int i2;
        TTransportException tTransportException;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i - i3;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                try {
                    int i5 = inputStream.read(bArr, i3, i4);
                    if (i5 < 0) {
                        i2 = 4;
                        tTransportException = new TTransportException();
                    } else if (i5 > 0) {
                        i3 += i5;
                    } else {
                        tTransportException = new TTransportException(FGI.A0Y("Cannot read. Remote side has closed. Tried to read ", " bytes, but only got ", " bytes.", i, i3));
                        i2 = 0;
                    }
                } catch (IOException e) {
                    TTransportException tTransportException2 = new TTransportException(e);
                    tTransportException2.type_ = 0;
                    throw tTransportException2;
                }
            } else {
                i2 = 1;
                tTransportException = new TTransportException("Cannot read from null inputStream");
            }
            tTransportException.type_ = i2;
            throw tTransportException;
        }
    }

    public final void A01(byte[] bArr, int i) throws IOException {
        OutputStream outputStream = this.A01;
        if (outputStream == null) {
            TTransportException tTransportException = new TTransportException("Cannot write to null outputStream");
            tTransportException.type_ = 1;
            throw tTransportException;
        }
        try {
            outputStream.write(bArr, 0, i);
        } catch (IOException e) {
            TTransportException tTransportException2 = new TTransportException(e);
            tTransportException2.type_ = 0;
            throw tTransportException2;
        }
    }

    static {
        DWj f5q;
        DWj f5q2;
        try {
            Object objInvoke = C5091DVm.A02.invoke(null, C5090DVl.class.getName());
            Class<?> cls = objInvoke.getClass();
            Method declaredMethod = cls.getDeclaredMethod("error", String.class);
            Method declaredMethod2 = cls.getDeclaredMethod("warn", String.class);
            f5q = new F5R(objInvoke, declaredMethod, 0);
            f5q2 = new F5R(objInvoke, declaredMethod2, 1);
        } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            f5q = new F5Q(0);
            f5q2 = new F5Q(1);
        }
        A02 = new C5091DVm(f5q, f5q2);
    }

    public C5090DVl(int i) {
    }

    public C5090DVl() {
        this.A00 = null;
        this.A01 = null;
    }
}
