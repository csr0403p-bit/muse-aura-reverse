package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.CWl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3601CWl extends CX9 {
    public long A00;
    public AssetFileDescriptor A01;
    public C1O A02;
    public InputStream A03;
    public boolean A04;
    public final Context A05;

    public C3601CWl(Context context) {
        super(false);
        this.A05 = context.getApplicationContext();
    }

    @Override // X.C1J
    public final void close() throws Throwable {
        boolean z;
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        if (z) {
                            this.A04 = false;
                            transferEnded();
                        }
                    } finally {
                        th = th;
                        this.A01 = null;
                        if (!this.A04) {
                        }
                        this.A04 = false;
                        transferEnded();
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e);
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e2);
            }
        } catch (Throwable th) {
            th = th;
            this.A03 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A01;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A01 = null;
                    if (!this.A04) {
                        throw th;
                    }
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e3);
                }
            } finally {
                th = th;
                this.A01 = null;
                if (!this.A04) {
                }
                this.A04 = false;
                transferEnded();
                throw th;
            }
        }
    }

    @Override // X.C1J
    public final Uri getUri() {
        C1O c1o = this.A02;
        if (c1o != null) {
            return c1o.A06;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C1O r17) throws androidx.media3.datasource.DataSourceException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3601CWl.open(X.C1O):long");
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = BV4.A01(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e);
                }
            }
            int i3 = this.A03.read(bArr, i, i2);
            long j2 = this.A00;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.A00 = j2 - i3;
                }
                bytesTransferred(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
            }
        }
        return -1;
    }
}
