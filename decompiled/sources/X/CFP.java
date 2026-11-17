package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class CFP extends CFR {
    public static final void A05(File file, String str, Charset charset) throws IOException {
        int i;
        C7384Etj.A0Y(str, 1);
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        try {
            int length = str.length();
            if (length < 16384) {
                fileOutputStreamA0I.write(str.getBytes(charset));
            } else {
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
                C7384Etj.A0X(charsetEncoderOnUnmappableCharacter);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
                C7384Etj.A0U(byteBufferAllocate);
                int i2 = 0;
                int i3 = 0;
                do {
                    int iA0F = C8j3.A0F(length, i2, 8192 - i3);
                    i = i2 + iA0F;
                    char[] cArrArray = charBufferAllocate.array();
                    C7384Etj.A0U(cArrArray);
                    str.getChars(i2, i, cArrArray, i3);
                    charBufferAllocate.limit(iA0F + i3);
                    i3 = 1;
                    if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, AnonymousClass002.A1Q(i, length)).isUnderflow()) {
                        throw BV4.A0S();
                    }
                    fileOutputStreamA0I.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
                    if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                        charBufferAllocate.put(0, charBufferAllocate.get());
                    } else {
                        i3 = 0;
                    }
                    charBufferAllocate.clear();
                    byteBufferAllocate.clear();
                    i2 = i;
                } while (i < length);
            }
            fileOutputStreamA0I.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(fileOutputStreamA0I, th);
                throw th2;
            }
        }
    }

    public static final String A04(File file, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(BV4.A0H(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i < 0) {
                    String strA0o = C60O.A0o(stringWriter);
                    inputStreamReader.close();
                    return strA0o;
                }
                stringWriter.write(cArr, 0, i);
            }
        } finally {
        }
    }

    public static final void A06(File file, byte[] bArr) throws IOException {
        AnonymousClass003.A0u(file, bArr);
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        try {
            fileOutputStreamA0I.write(bArr);
            fileOutputStreamA0I.close();
        } finally {
        }
    }

    public static final byte[] A07(File file) throws IOException {
        FileInputStream fileInputStreamA0H = BV4.A0H(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                StringBuilder sbA0f = C3cG.A0f(file, "File ");
                sbA0f.append(" is too big (");
                sbA0f.append(length);
                throw new OutOfMemoryError(AnonymousClass001.A0v(" bytes) to fit in memory.", sbA0f));
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStreamA0H.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                C7384Etj.A0U(bArrCopyOf);
            } else {
                int i5 = fileInputStreamA0H.read();
                if (i5 != -1) {
                    CFQ cfq = new CFQ(8193);
                    cfq.write(i5);
                    F0H.A00(fileInputStreamA0H, cfq);
                    int size = cfq.size() + i;
                    if (size < 0) {
                        StringBuilder sbA0g = C3cG.A0g("File ");
                        sbA0g.append(file);
                        throw new OutOfMemoryError(AnonymousClass001.A0v(" is too big to fit in memory.", sbA0g));
                    }
                    byte[] bArrA00 = cfq.A00();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    C7384Etj.A0U(bArrCopyOf);
                    System.arraycopy(bArrA00, 0, bArrCopyOf, i, cfq.size());
                }
            }
            fileInputStreamA0H.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(fileInputStreamA0H, th);
                throw th2;
            }
        }
    }
}
