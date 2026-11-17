package X;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Edk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6984Edk extends OutputStream {
    public int A00;
    public EfF<EC0> A01;
    public final AbstractC6525EBz A02;

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final C6986Edm A00() {
        if (!EfF.A01(this.A01)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        EfF<EC0> efF = this.A01;
        if (efF != null) {
            return new C6986Edm(efF, this.A00);
        }
        throw BV4.A0U();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EfF<EC0> efF = this.A01;
        if (efF != null) {
            efF.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public C6984Edk() {
    }

    public C6984Edk(AbstractC6525EBz abstractC6525EBz, int i) {
        if (i > 0) {
            this.A02 = abstractC6525EBz;
            this.A00 = 0;
            EC0 ec0 = abstractC6525EBz.get(i);
            this.A01 = ec0 != null ? new EfF<>(EfF.A04, abstractC6525EBz, ec0) : null;
            return;
        }
        throw BV4.A0S();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (EfF.A01(this.A01)) {
                int i3 = this.A00 + i2;
                if (EfF.A01(this.A01)) {
                    EfF<EC0> efF = this.A01;
                    if (efF != null) {
                        if (i3 > efF.A04().getSize()) {
                            AbstractC6525EBz abstractC6525EBz = this.A02;
                            EC0 ec0 = abstractC6525EBz.get(i3);
                            EfF<EC0> efF2 = this.A01;
                            if (efF2 != null) {
                                EC0 ec0A04 = efF2.A04();
                                C7384Etj.A0X(ec0);
                                ec0A04.copy(0, ec0, 0, this.A00);
                                EfF<EC0> efF3 = this.A01;
                                C7384Etj.A0X(efF3);
                                efF3.close();
                                this.A01 = new EfF<>(EfF.A04, abstractC6525EBz, ec0);
                            } else {
                                throw C3cG.A0Q("Required value was null.");
                            }
                        }
                        EfF<EC0> efF4 = this.A01;
                        if (efF4 != null) {
                            efF4.A04().write(this.A00, bArr, i, i2);
                            this.A00 += i2;
                            return;
                        }
                        throw C3cG.A0Q("Required value was null.");
                    }
                    throw C3cG.A0Q("Required value was null.");
                }
                throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        throw new ArrayIndexOutOfBoundsException(FGI.A0Z("length=", "; regionStart=", "; regionLength=", bArr.length, i, i2));
    }
}
