package X;

import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes5.dex */
public final class CFT extends Writer {
    public ByteBuffer A00;
    public CharsetEncoder A01;
    public final OutputStream A02;

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        A01(true);
    }

    private void A00(CharBuffer charBuffer) throws CharacterCodingException {
        CoderResult coderResultEncode;
        if (this.A01 == null) {
            return;
        }
        while (true) {
            coderResultEncode = this.A01.encode(charBuffer, this.A00, false);
            if (!coderResultEncode.isOverflow()) {
                break;
            } else {
                A01(false);
            }
        }
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
    }

    private void A01(boolean z) {
        synchronized (((Writer) this).lock) {
            if (this.A01 == null) {
                throw BV4.A0K("OutputStreamWriter is closed");
            }
            ByteBuffer byteBuffer = this.A00;
            if (byteBuffer != null) {
                int iPosition = byteBuffer.position();
                if (iPosition > 0) {
                    this.A00.flip();
                    this.A02.write(this.A00.array(), this.A00.arrayOffset(), iPosition);
                    this.A00.clear();
                }
                if (z) {
                    this.A02.flush();
                }
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (((Writer) this).lock) {
            if (this.A01 != null) {
                CharBuffer charBufferAllocate = CharBuffer.allocate(0);
                while (true) {
                    CoderResult coderResultEncode = this.A01.encode(charBufferAllocate, this.A00, true);
                    if (!coderResultEncode.isError()) {
                        if (!coderResultEncode.isOverflow()) {
                            break;
                        } else {
                            A01(false);
                        }
                    } else {
                        coderResultEncode.throwException();
                        break;
                    }
                }
                loop1: while (true) {
                    CoderResult coderResultFlush = this.A01.flush(this.A00);
                    while (!coderResultFlush.isUnderflow()) {
                        if (coderResultFlush.isOverflow()) {
                            break;
                        } else {
                            coderResultFlush.throwException();
                        }
                    }
                    A01(false);
                }
                A01(false);
                this.A02.close();
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        synchronized (((Writer) this).lock) {
            if (this.A01 == null) {
                throw BV4.A0K("OutputStreamWriter is closed");
            }
            A00(CharBuffer.wrap(new char[]{(char) i}));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFT(OutputStream outputStream, ByteBuffer byteBuffer) {
        super(outputStream);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        this.A02 = outputStream;
        this.A00 = byteBuffer;
        CharsetEncoder charsetEncoderNewEncoder = charsetDefaultCharset.newEncoder();
        this.A01 = charsetEncoderNewEncoder;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
        this.A01.onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((Writer) this).lock) {
            if (i2 >= 0) {
                if (str != null) {
                    if ((i | i2) >= 0 && i <= str.length() - i2) {
                        if (this.A01 != null) {
                            A00(CharBuffer.wrap(str, i, i2 + i));
                        } else {
                            throw BV4.A0K("OutputStreamWriter is closed");
                        }
                    } else {
                        throw CFV.A00(str, i, i2);
                    }
                } else {
                    throw BV4.A0a("str == null");
                }
            } else {
                throw CFV.A00(str, i, i2);
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            if (this.A01 != null) {
                CFV.A01(cArr.length, i, i2);
                A00(CharBuffer.wrap(cArr, i, i2));
            } else {
                throw BV4.A0K("OutputStreamWriter is closed");
            }
        }
    }
}
