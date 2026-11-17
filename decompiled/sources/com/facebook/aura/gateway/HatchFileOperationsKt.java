package com.facebook.aura.gateway;

import X.C60O;
import X.DCl;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class HatchFileOperationsKt {
    public static final long BOUNDED_FILE_READ_MAX_BYTES = 4194304;
    public static final long DOWNLOAD_IDLE_TIMEOUT_SECONDS = 30;
    public static final long DOWNLOAD_OVERALL_TIMEOUT_SECONDS = 0;
    public static final long FILE_READ_CHUNK_MAX_BYTES = 1048576;
    public static final long FILE_UPLOAD_IDLE_TIMEOUT_MS = 0;
    public static final long FILE_UPLOAD_MIN_BYTES_PER_SECOND = 65536;
    public static final long FILE_UPLOAD_MIN_DEADLINE_MS = 180000;
    public static final long FS_EXPORT_TIMEOUT_SECONDS = 60;
    public static final int MIME_SNIFF_BYTES = 32;
    public static final String MIME_TYPE_PDF = "application/pdf";
    public static final Set<String> SPACE_SHARE_POLICY_REFUSAL_CODES = C60O.A1A("artifact_external_storage_unsupported", "artifact_external_storage_policy_denied", "share_content_review_refused");
    public static final String SPACE_SHARE_PRIVACY_ISSUES_MARKER = "\n\nIssues found:";
    public static final String SPACE_SHARE_TYPE_CLOUDFLARE = "cloudflare";
    public static final String TAG = "HatchFileOperations";

    public static final byte[] strictUtf8Bytes(String str) throws CharacterCodingException {
        CharsetEncoder charsetEncoderNewEncoder = DCl.A05.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static final CharsetDecoder strictUtf8Decoder() {
        CharsetDecoder charsetDecoderNewDecoder = DCl.A05.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }
}
