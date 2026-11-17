package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.CWw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3606CWw extends CX9 {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public C3606CWw(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    @Override // X.C1J
    public final void close() {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
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
        try {
            Uri uri = c1o.A06;
            this.A01 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
                path = path.substring(1);
            }
            transferInitializing(c1o);
            InputStream inputStreamOpen = this.A04.open(path, 1);
            this.A02 = inputStreamOpen;
            long j = c1o.A04;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = c1o.A03;
            if (j2 != -1) {
                this.A00 = j2;
            } else {
                long jAvailable = this.A02.available();
                this.A00 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.A00 = -1L;
                }
            }
            this.A03 = true;
            transferStarted(c1o);
            return this.A00;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
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
                    throw new AssetDataSource$AssetDataSourceException(e, 2000);
                }
            }
            int i3 = this.A02.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - i3;
                }
                bytesTransferred(i3);
                return i3;
            }
        }
        return -1;
    }
}
