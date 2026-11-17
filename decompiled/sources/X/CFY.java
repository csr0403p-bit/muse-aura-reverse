package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes5.dex */
public final class CFY extends Reader {
    public InputStream A00;
    public CharsetDecoder A01;
    public boolean A02;
    public final ByteBuffer A03;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (((Reader) this).lock) {
            CharsetDecoder charsetDecoder = this.A01;
            if (charsetDecoder != null) {
                charsetDecoder.reset();
            }
            this.A01 = null;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                inputStream.close();
                this.A00 = null;
            }
        }
    }

    @Override // java.io.Reader
    public final int read() {
        char c;
        synchronized (((Reader) this).lock) {
            if (this.A00 == null) {
                throw BV4.A0K("InputStreamReader is closed");
            }
            char[] cArr = new char[1];
            c = read(cArr, 0, 1) != -1 ? cArr[0] : '\uffff';
        }
        return c;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        InputStream inputStream;
        boolean z;
        synchronized (((Reader) this).lock) {
            synchronized (((Reader) this).lock) {
                inputStream = this.A00;
                if (inputStream == null) {
                    throw BV4.A0K("InputStreamReader is closed");
                }
            }
            z = true;
            try {
                if (!this.A03.hasRemaining()) {
                    if (inputStream.available() <= 0) {
                        z = false;
                    }
                }
            } catch (IOException e) {
                BzX.A00("PoolFriendlyInputStreamReader", "Failed to check input stream availability in ready()", e);
                return false;
            }
        }
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFY(InputStream inputStream, ByteBuffer byteBuffer) {
        super(inputStream);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        this.A02 = false;
        this.A03 = byteBuffer;
        this.A00 = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charsetDefaultCharset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.A01 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        byteBuffer.limit(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x00d5, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0005, B:9:0x000b, B:11:0x0012, B:13:0x0014, B:14:0x0023, B:17:0x002c, B:19:0x0032, B:24:0x0045, B:26:0x0061, B:33:0x0074, B:34:0x007c, B:36:0x0088, B:38:0x0092, B:23:0x003a, B:27:0x0063, B:29:0x0067, B:31:0x006b, B:41:0x00a3, B:42:0x00a9, B:43:0x00ae, B:45:0x00b4, B:48:0x00bd, B:50:0x00c4, B:51:0x00c9, B:47:0x00ba, B:57:0x00d4, B:6:0x0006, B:8:0x000a, B:53:0x00cb, B:54:0x00d1), top: B:64:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0063 A[EDGE_INSN: B:66:0x0063->B:27:0x0063 BREAK  A[LOOP:0: B:14:0x0023->B:39:0x009f], SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(char[] r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r2 = r11.lock
            monitor-enter(r2)
            java.lang.Object r1 = r11.lock     // Catch: java.lang.Throwable -> Ld5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld5
            java.io.InputStream r6 = r11.A00     // Catch: java.lang.Throwable -> Ld2
            if (r6 == 0) goto Lcb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld2
            int r0 = r12.length     // Catch: java.lang.Throwable -> Ld5
            X.CFV.A01(r0, r13, r14)     // Catch: java.lang.Throwable -> Ld5
            r5 = 0
            if (r14 != 0) goto L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld5
            return r5
        L14:
            java.nio.CharBuffer r3 = java.nio.CharBuffer.wrap(r12, r13, r14)     // Catch: java.lang.Throwable -> Ld5
            java.nio.charset.CoderResult r7 = java.nio.charset.CoderResult.UNDERFLOW     // Catch: java.lang.Throwable -> Ld5
            java.nio.ByteBuffer r8 = r11.A03     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = r8.hasRemaining()     // Catch: java.lang.Throwable -> Ld5
            r4 = 1
            r9 = r0 ^ 1
        L23:
            boolean r1 = r3.hasRemaining()     // Catch: java.lang.Throwable -> Ld5
            r0 = -1
            if (r1 == 0) goto L63
            if (r9 == 0) goto L7c
            int r1 = r6.available()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> Ld5
            if (r1 != 0) goto L45
            int r1 = r3.position()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> Ld5
            if (r1 <= r13) goto L45
            goto L63
        L39:
            r1 = move-exception
            java.lang.String r10 = "PoolFriendlyInputStreamReader"
            java.lang.String r9 = "Failed to check input stream availability"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Ld5
            X.BzX.A00(r10, r9, r1)     // Catch: java.lang.Throwable -> Ld5
        L45:
            int r10 = r8.capacity()     // Catch: java.lang.Throwable -> Ld5
            int r1 = r8.limit()     // Catch: java.lang.Throwable -> Ld5
            int r10 = r10 - r1
            int r9 = r8.arrayOffset()     // Catch: java.lang.Throwable -> Ld5
            int r1 = r8.limit()     // Catch: java.lang.Throwable -> Ld5
            int r9 = r9 + r1
            byte[] r1 = r8.array()     // Catch: java.lang.Throwable -> Ld5
            int r9 = r6.read(r1, r9, r10)     // Catch: java.lang.Throwable -> Ld5
            if (r9 != r0) goto L72
            r11.A02 = r4     // Catch: java.lang.Throwable -> Ld5
        L63:
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.UNDERFLOW     // Catch: java.lang.Throwable -> Ld5
            if (r7 != r5) goto Lae
            boolean r1 = r11.A02     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lae
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch: java.lang.Throwable -> Ld5
            java.nio.charset.CoderResult r7 = r1.decode(r8, r3, r4)     // Catch: java.lang.Throwable -> Ld5
            goto La1
        L72:
            if (r9 == 0) goto L63
            int r1 = r8.limit()     // Catch: java.lang.Throwable -> Ld5
            int r1 = r1 + r9
            r8.limit(r1)     // Catch: java.lang.Throwable -> Ld5
        L7c:
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch: java.lang.Throwable -> Ld5
            java.nio.charset.CoderResult r7 = r1.decode(r8, r3, r5)     // Catch: java.lang.Throwable -> Ld5
            boolean r1 = r7.isUnderflow()     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto L63
            int r1 = r8.limit()     // Catch: java.lang.Throwable -> Ld5
            int r0 = r8.capacity()     // Catch: java.lang.Throwable -> Ld5
            if (r1 != r0) goto L9f
            r8.compact()     // Catch: java.lang.Throwable -> Ld5
            int r0 = r8.position()     // Catch: java.lang.Throwable -> Ld5
            r8.limit(r0)     // Catch: java.lang.Throwable -> Ld5
            r8.position(r5)     // Catch: java.lang.Throwable -> Ld5
        L9f:
            r9 = 1
            goto L23
        La1:
            if (r7 != r5) goto La9
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch: java.lang.Throwable -> Ld5
            java.nio.charset.CoderResult r7 = r1.flush(r3)     // Catch: java.lang.Throwable -> Ld5
        La9:
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch: java.lang.Throwable -> Ld5
            r1.reset()     // Catch: java.lang.Throwable -> Ld5
        Lae:
            boolean r1 = r7.isMalformed()     // Catch: java.lang.Throwable -> Ld5
            if (r1 != 0) goto Lba
            boolean r1 = r7.isUnmappable()     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lbd
        Lba:
            r7.throwException()     // Catch: java.lang.Throwable -> Ld5
        Lbd:
            int r1 = r3.position()     // Catch: java.lang.Throwable -> Ld5
            int r1 = r1 - r13
            if (r1 == 0) goto Lc9
            int r0 = r3.position()     // Catch: java.lang.Throwable -> Ld5
            int r0 = r0 - r13
        Lc9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld5
            return r0
        Lcb:
            java.lang.String r0 = "InputStreamReader is closed"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.Throwable -> Ld2
            throw r0     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld2
            throw r0     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CFY.read(char[], int, int):int");
    }
}
