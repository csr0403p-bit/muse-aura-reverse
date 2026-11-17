package X;

import com.facebook.aura.bugreport.AuraBugReportReviewViewModelKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.C0j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3161C0j implements C1N {
    public long A00;
    public long A01;
    public long A02;
    public C1O A03;
    public C3129Byu A04;
    public File A05;
    public OutputStream A06;
    public final InterfaceC3158C0g A07;

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            try {
                outputStream.flush();
                OutputStream outputStream2 = this.A06;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                this.A06 = null;
                File file = this.A05;
                this.A05 = null;
                this.A07.A6a(file, this.A02);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.A06;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A06 = null;
                File file2 = this.A05;
                this.A05 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01(C1O c1o) {
        long j = c1o.A03;
        File fileAg0 = this.A07.Ag0(c1o.A08, c1o.A04 + this.A00, j != -1 ? Math.min(j - this.A00, this.A01) : -1L);
        this.A05 = fileAg0;
        FileOutputStream fileOutputStreamA0I = BV4.A0I(fileAg0);
        C3129Byu c3129Byu = this.A04;
        if (c3129Byu == null) {
            c3129Byu = new C3129Byu(fileOutputStreamA0I, 20480);
            this.A04 = c3129Byu;
        } else {
            c3129Byu.A00(fileOutputStreamA0I);
        }
        this.A06 = c3129Byu;
        this.A02 = 0L;
    }

    @Override // X.C1N
    public final void AXT(C1O c1o) throws CacheDataSink$CacheDataSinkException {
        c1o.A08.getClass();
        if (c1o.A03 == -1 && (c1o.A00 & 2) == 2) {
            this.A03 = null;
            return;
        }
        this.A03 = c1o;
        this.A01 = (c1o.A00 & 4) == 4 ? AuraBugReportReviewViewModelKt.MAX_PREVIEW_BYTES : LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        this.A00 = 0L;
        try {
            A01(c1o);
        } catch (IOException e) {
            throw new CacheDataSink$CacheDataSinkException(e);
        }
    }

    @Override // X.C1N
    public final void close() throws CacheDataSink$CacheDataSinkException {
        if (this.A03 != null) {
            try {
                A00();
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
    }

    @Override // X.C1N
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C1O c1o = this.A03;
        if (c1o != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.A02 == this.A01) {
                        A00();
                        A01(c1o);
                    }
                    int iA01 = BV4.A01(i2 - i3, this.A01 - this.A02);
                    this.A06.write(bArr, i + i3, iA01);
                    i3 += iA01;
                    long j = iA01;
                    this.A02 += j;
                    this.A00 += j;
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        }
    }

    public C3161C0j(InterfaceC3158C0g interfaceC3158C0g) {
        this.A07 = interfaceC3158C0g;
    }
}
