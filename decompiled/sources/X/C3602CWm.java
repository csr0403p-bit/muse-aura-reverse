package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.CWm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3602CWm extends CX9 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C3602CWm(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    @Override // X.C1J
    public final void close() throws Throwable {
        boolean z;
        this.A02 = null;
        try {
            try {
                FileInputStream fileInputStream = this.A03;
                if (fileInputStream != null) {
                    fileInputStream.close();
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
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            } catch (IOException e2) {
                throw new ContentDataSource$ContentDataSourceException(e2, 2000);
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
                    throw new ContentDataSource$ContentDataSourceException(e3, 2000);
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
        return this.A02;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            Uri uriNormalizeScheme = c1o.A06.normalizeScheme();
            this.A02 = uriNormalizeScheme;
            transferInitializing(c1o);
            if (C6xC.A00(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundleA0N = BV6.A0N();
                bundleA0N.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundleA0N);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.A05.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.A01 = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSource$ContentDataSourceException(BV8.A0j(uriNormalizeScheme, "Could not open file descriptor for: "), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.A03 = fileInputStream;
            if (length != -1 && c1o.A04 > length) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long j = c1o.A04;
            long jSkip = fileInputStream.skip(j + startOffset) - startOffset;
            if (jSkip != j) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.A00 = -1L;
                    jPosition = -1;
                } else {
                    jPosition = size - channel.position();
                    this.A00 = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                jPosition = length - jSkip;
                this.A00 = jPosition;
                if (jPosition < 0) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
            }
            long jMin = c1o.A03;
            if (jMin != -1) {
                if (jPosition != -1) {
                    jMin = Math.min(jPosition, jMin);
                }
                this.A00 = jMin;
            }
            this.A04 = true;
            transferStarted(c1o);
            return jMin == -1 ? this.A00 : jMin;
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
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
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            }
            int i3 = this.A03.read(bArr, i, i2);
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
