package X;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class CWn extends CX9 {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public CWn() {
        super(false);
    }

    @Override // X.C1J
    public final void close() {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                transferEnded();
            }
        }
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A01;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException {
        Uri uri = c1o.A06;
        this.A01 = uri;
        transferInitializing(c1o);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.A02 = randomAccessFile;
            try {
                long j = c1o.A04;
                randomAccessFile.seek(j);
                long length = c1o.A03;
                if (length == -1) {
                    length = this.A02.length() - j;
                }
                this.A00 = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(2008, null, null);
                }
                this.A03 = true;
                transferStarted(c1o);
                return this.A00;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
            }
            Throwable cause = e2.getCause();
            throw new FileDataSource$FileDataSourceException(e2, ((cause instanceof ErrnoException) && ((ErrnoException) cause).errno == OsConstants.EACCES) ? 2006 : 2005);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int i3 = this.A02.read(bArr, i, BV4.A01(j, i2));
            if (i3 <= 0) {
                return i3;
            }
            this.A00 -= i3;
            bytesTransferred(i3);
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
