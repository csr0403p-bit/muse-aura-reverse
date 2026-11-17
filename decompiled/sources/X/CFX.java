package X;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes5.dex */
public final class CFX {
    public char A00;
    public boolean A01;
    public final InputStream A02;
    public final ByteBuffer A03;
    public final CharsetDecoder A04;
    public final Charset A05;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        r6.reset();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CFX.A00(char[], int, int):int");
    }

    public CFX(InputStream inputStream, Charset charset) {
        this.A02 = inputStream;
        this.A05 = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        C7384Etj.A0U(charsetDecoderOnUnmappableCharacter);
        this.A04 = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C0908AHk.A00.A01(8196));
        C7384Etj.A0U(byteBufferWrap);
        this.A03 = byteBufferWrap;
        byteBufferWrap.flip();
    }
}
