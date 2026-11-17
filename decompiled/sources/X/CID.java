package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* loaded from: classes5.dex */
public final class CID implements HttpEntity {
    public final CG5 A00;
    public final CYB A01;

    @Override // org.apache.http.HttpEntity
    public final void consumeContent() {
    }

    @Override // org.apache.http.HttpEntity
    public final InputStream getContent() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public final Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return -1L;
    }

    @Override // org.apache.http.HttpEntity
    public final Header getContentType() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isChunked() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) {
        String str;
        String str2;
        try {
            this.A00.writeTo(outputStream);
        } catch (ArrayIndexOutOfBoundsException e) {
            e = e;
            str = this.A01.A05;
            str2 = "ArrayIndexOutOfBoundsException when writing to output stream. Request URL: ";
            CFK.A0B("TigonHttpEntity", FGI.A0M(str2, str), e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            str = this.A01.A05;
            str2 = "IndexOutOfBoundsException when writing to output stream. Request URL: ";
            CFK.A0B("TigonHttpEntity", FGI.A0M(str2, str), e);
        }
    }

    public CID(CG5 cg5, CYB cyb) {
        this.A00 = cg5;
        this.A01 = cyb;
    }
}
