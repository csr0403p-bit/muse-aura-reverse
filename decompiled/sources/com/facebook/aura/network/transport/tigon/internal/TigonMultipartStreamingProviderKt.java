package com.facebook.aura.network.transport.tigon.internal;

import X.AbstractC7531Ezs;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F1F;
import X.FGI;
import com.facebook.aura.network.transport.HatchMultipartFilePart;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes5.dex */
public abstract class TigonMultipartStreamingProviderKt {
    public static final long DEFAULT_UPLOAD_NO_PROGRESS_TIMEOUT_MS = 120000;
    public static final byte[] EMPTY_EOM_PROBE = new byte[0];
    public static final int ERROR_CODE_IO = 3;
    public static final int ERROR_CODE_LENGTH_MISMATCH = 2;
    public static final int ERROR_CODE_NO_PROGRESS_TIMEOUT = 4;
    public static final int ERROR_CODE_OVERFLOW = 1;
    public static final String MULTIPART_ERROR_DOMAIN = "AuraHatchMultipartStreaming";
    public static final long NO_UPLOAD_PROGRESS_TIMEOUT_MS = 0;
    public static final long UPLOAD_NO_PROGRESS_TIMEOUT_POLL_MS = 250;

    public static final boolean awaitResume(NoisePauseGate noisePauseGate, long j) {
        C7384Etj.A0Y(noisePauseGate, 0);
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = null;
        if (lValueOf.longValue() > 0) {
            lValueOf2 = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(lValueOf.longValue()));
        }
        long jNanoTime = System.nanoTime();
        boolean z = false;
        while (noisePauseGate.paused.get()) {
            if (lValueOf2 == null) {
                LockSupport.park();
            } else {
                long jLongValue = lValueOf2.longValue() - (System.nanoTime() - jNanoTime);
                if (jLongValue <= 0) {
                    throw new UploadNoProgressTimeoutException(j);
                }
                LockSupport.parkNanos(Math.min(jLongValue, 250000000L));
            }
            z = true;
        }
        return z;
    }

    public static final MultipartStreamPlan buildMultipartStreamPlan(HatchRequestBody.Multipart multipart) {
        C7384Etj.A0Y(multipart, 0);
        return buildMultipartStreamPlan(multipart, TigonMultipartBody.INSTANCE.generateBoundary());
    }

    public static final boolean writeChunked(TigonBodyStream tigonBodyStream, NoisePauseGate noisePauseGate, byte[] bArr, long j) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return true;
            }
            int iMin = Math.min(61440, length - i);
            awaitResume(noisePauseGate, j);
            if (1 == tigonBodyStream.transferBytes(bArr, i, iMin)) {
                return false;
            }
            i += iMin;
        }
    }

    public static final void writeMultipartStream(TigonBodyStream tigonBodyStream, MultipartStreamPlan multipartStreamPlan, NoisePauseGate noisePauseGate, long j) {
        TigonError tigonErrorIoError;
        boolean zA1a = AnonymousClass002.A1a(tigonBodyStream, multipartStreamPlan);
        C7384Etj.A0Y(noisePauseGate, 2);
        noisePauseGate.captureWriterThread();
        F1F f1f = new F1F();
        try {
            long j2 = multipartStreamPlan.declaredTotalLength;
            if (j2 > 2147483647L) {
                writeMultipartStream$report(f1f, tigonBodyStream, overflowError(j2));
                return;
            }
            for (MultipartSegment multipartSegment : multipartStreamPlan.segments) {
                if (multipartSegment instanceof FileSegment) {
                    FileSegment fileSegment = (FileSegment) multipartSegment;
                    if (!fileSegment.file.exists() || fileSegment.file.length() != fileSegment.capturedLength) {
                        writeMultipartStream$report(f1f, tigonBodyStream, lengthMismatchError(fileSegment.capturedLength));
                        return;
                    }
                }
            }
            tigonBodyStream.reportBodyLength((int) multipartStreamPlan.declaredTotalLength);
            for (MultipartSegment multipartSegment2 : multipartStreamPlan.segments) {
                if (!writeChunked(tigonBodyStream, noisePauseGate, multipartSegment2.getHeaderBytes(), j)) {
                    return;
                }
                if (!(multipartSegment2 instanceof ByteSegment)) {
                    if (!(multipartSegment2 instanceof FileSegment)) {
                        throw C3cG.A0q();
                    }
                    FileSegment fileSegment2 = (FileSegment) multipartSegment2;
                    int iOrdinal = streamFile(tigonBodyStream, noisePauseGate, fileSegment2, j).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != zA1a) {
                            if (iOrdinal != 2) {
                                throw C3cG.A0q();
                            }
                            writeMultipartStream$report(f1f, tigonBodyStream, lengthMismatchError(fileSegment2.capturedLength));
                            return;
                        }
                        return;
                    }
                } else if (!writeChunked(tigonBodyStream, noisePauseGate, ((ByteSegment) multipartSegment2).body, j)) {
                    return;
                }
                if (!writeChunked(tigonBodyStream, noisePauseGate, TigonMultipartBody.PART_TRAILER, j)) {
                    return;
                }
            }
            if (writeChunked(tigonBodyStream, noisePauseGate, multipartStreamPlan.closingBoundary, j)) {
                if (awaitResume(noisePauseGate, j) && zA1a == tigonBodyStream.transferBytes(EMPTY_EOM_PROBE, 0, 0)) {
                    return;
                }
                tigonBodyStream.writeEOM();
            }
        } catch (UploadNoProgressTimeoutException e) {
            tigonErrorIoError = noProgressTimeoutError(e.timeoutMs);
            writeMultipartStream$report(f1f, tigonBodyStream, tigonErrorIoError);
        } catch (Throwable unused) {
            tigonErrorIoError = ioError();
            writeMultipartStream$report(f1f, tigonBodyStream, tigonErrorIoError);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentResult.values().length];
            try {
                AnonymousClass002.A13(SegmentResult.OK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SegmentResult.CANCELED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SegmentResult.LENGTH_MISMATCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ boolean awaitResume$default(NoisePauseGate noisePauseGate, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return awaitResume(noisePauseGate, j);
    }

    public static final TigonError ioError() {
        return new TigonError(TigonErrorCode.A05, MULTIPART_ERROR_DOMAIN, "multipart streaming I/O failure", 3);
    }

    public static final TigonError lengthMismatchError(long j) {
        return new TigonError(TigonErrorCode.A05, MULTIPART_ERROR_DOMAIN, FGI.A0J("multipart file length changed since plan construction (captured ", j, ")"), 2);
    }

    public static final TigonError noProgressTimeoutError(long j) {
        return new TigonError(TigonErrorCode.A08, MULTIPART_ERROR_DOMAIN, FGI.A0J("multipart streaming no upload progress for ", j, "ms"), 4);
    }

    public static final TigonError overflowError(long j) {
        return new TigonError(TigonErrorCode.A05, MULTIPART_ERROR_DOMAIN, FGI.A0J("multipart body declared length ", j, " exceeds Int.MAX_VALUE"), 1);
    }

    public static final SegmentResult streamFile(TigonBodyStream tigonBodyStream, NoisePauseGate noisePauseGate, FileSegment fileSegment, long j) throws IOException {
        SegmentResult segmentResult;
        long j2 = fileSegment.capturedLength;
        FileInputStream fileInputStreamA0H = BV4.A0H(fileSegment.file);
        try {
            byte[] bArr = new byte[61440];
            while (j2 > 0) {
                int i = fileInputStreamA0H.read(bArr, 0, BV4.A01(61440L, j2));
                if (i < 0) {
                    segmentResult = SegmentResult.LENGTH_MISMATCH;
                } else {
                    awaitResume(noisePauseGate, j);
                    if (1 == tigonBodyStream.transferBytes(bArr, 0, i)) {
                        segmentResult = SegmentResult.CANCELED;
                    } else {
                        j2 -= i;
                    }
                }
                fileInputStreamA0H.close();
                return segmentResult;
            }
            fileInputStreamA0H.close();
            return SegmentResult.OK;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(fileInputStreamA0H, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeMultipartStream$default(TigonBodyStream tigonBodyStream, MultipartStreamPlan multipartStreamPlan, NoisePauseGate noisePauseGate, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 0;
        }
        writeMultipartStream(tigonBodyStream, multipartStreamPlan, noisePauseGate, j);
    }

    public static final void writeMultipartStream$report(F1F f1f, TigonBodyStream tigonBodyStream, TigonError tigonError) {
        if (f1f.element) {
            return;
        }
        f1f.element = true;
        tigonBodyStream.reportError(tigonError);
    }

    public static final MultipartStreamPlan buildMultipartStreamPlan(HatchRequestBody.Multipart multipart, String str) {
        AnonymousClass003.A0u(multipart, str);
        ArrayList arrayListA11 = C60O.A11(multipart.parts.size() + multipart.fileParts.size());
        long length = TigonMultipartBody.PART_TRAILER.length;
        long length2 = 0;
        for (HatchMultipartPart hatchMultipartPart : multipart.parts) {
            arrayListA11.add(new ByteSegment(TigonMultipartBody.INSTANCE.partHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(str, hatchMultipartPart.name, hatchMultipartPart.filename, hatchMultipartPart.contentType), hatchMultipartPart.bytes));
            length2 += r4.length + hatchMultipartPart.bytes.length + length;
        }
        for (HatchMultipartFilePart hatchMultipartFilePart : multipart.fileParts) {
            byte[] bArrPartHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal = TigonMultipartBody.INSTANCE.partHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(str, hatchMultipartFilePart.name, hatchMultipartFilePart.filename, hatchMultipartFilePart.contentType);
            long length3 = hatchMultipartFilePart.file.length();
            arrayListA11.add(new FileSegment(bArrPartHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal, hatchMultipartFilePart.file, length3));
            length2 += bArrPartHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal.length + length3 + length;
        }
        return new MultipartStreamPlan(FGI.A0M("multipart/form-data; boundary=", str), length2 + r12.length, arrayListA11, TigonMultipartBody.INSTANCE.closingBoundaryAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(str));
    }
}
