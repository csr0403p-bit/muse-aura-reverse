package com.facebook.aura.settings;

import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BO7;
import X.C0924AIa;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.CFK;
import X.EnumC10460Hji;
import X.F1F;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.transport.HatchAttachmentFileNameKt;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.settings.HatchDataExportResult;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchDataExportRepository {
    public static final int $stable = 0;
    public static final HatchDataExportRepository INSTANCE = new HatchDataExportRepository();

    @DebugMetadata(c = "com.facebook.aura.settings.HatchDataExportRepository$exportToDownloads$2", f = "HatchDataExportRepository.kt", l = {105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchDataExportRepository$exportToDownloads$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchDataExportResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchAppEventLoggingContext $loggingContext;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HatchAppEventLoggingContext hatchAppEventLoggingContext, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$loggingContext = hatchAppEventLoggingContext;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$loggingContext, this.$userSession, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v40, types: [T] */
        /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r0v56 */
        /* JADX WARN: Type inference failed for: r0v57 */
        /* JADX WARN: Type inference failed for: r2v19, types: [java.io.Closeable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            int i;
            long jElapsedRealtime;
            ContentResolver contentResolver;
            String strA0Y;
            Uri uriInsert;
            F1F f1f;
            F1F f1f2;
            C10543Hqv c10543HqvA0z;
            BO7 bo7;
            C10543Hqv c10543HqvA0z2;
            CountingOutputStream countingOutputStream;
            C10543Hqv c10543Hqv;
            OutputStream outputStream;
            ?? r0;
            String strAttachmentFileName;
            Object obj2 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    i = 0;
                    Hwg.A00(obj2);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    contentResolver = this.$context.getContentResolver();
                    try {
                        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_display_name", HatchDataExportRepositoryKt.FALLBACK_FILE_NAME);
                        contentValues.put(PhotosSearchHandlerKt.PARAM_MIME_TYPE, HatchDataExportRepositoryKt.ZIP_MIME_TYPE);
                        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                        AbstractC07127nr.A0A(contentValues, "is_pending", 1);
                        uriInsert = contentResolver.insert(uri, contentValues);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        CFK.A0A(HatchDataExportRepositoryKt.TAG, "Failed to create Downloads entry", e2);
                    }
                    if (uriInsert != null) {
                        F1F f1f3 = new F1F();
                        f1f = new F1F();
                        f1f2 = new F1F();
                        try {
                            c10543HqvA0z = C3cG.A0z();
                            bo7 = new BO7();
                            c10543HqvA0z2 = C3cG.A0z();
                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream == null) {
                                HatchDataExportRepository.INSTANCE.discard(contentResolver, uriInsert);
                                HatchDataExportLogging.INSTANCE.logSaveFailed(this.$loggingContext, "mediastore:open_output_failed");
                                return new HatchDataExportResult.Failure("open_output_failed");
                            }
                            HatchAppEventLoggingContext hatchAppEventLoggingContext = this.$loggingContext;
                            AbstractC3358CGz abstractC3358CGz = this.$userSession;
                            countingOutputStream = new CountingOutputStream(outputStreamOpenOutputStream);
                            HatchDataExportLogging.INSTANCE.logDownloadStarted(hatchAppEventLoggingContext);
                            f1f3.element = true;
                            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                            JarvisPath.DyiExport dyiExport = JarvisPath.DyiExport.INSTANCE;
                            Long lA0S = C3cG.A0S(0L);
                            Long lA0S2 = C3cG.A0S(HatchDataExportRepositoryKt.IDLE_TIMEOUT_MS);
                            this.L$0 = contentResolver;
                            this.L$1 = uriInsert;
                            this.L$2 = f1f3;
                            this.L$3 = f1f;
                            this.L$4 = f1f2;
                            this.L$5 = c10543HqvA0z;
                            this.L$6 = bo7;
                            this.L$7 = c10543HqvA0z2;
                            this.L$8 = outputStreamOpenOutputStream;
                            this.L$9 = null;
                            this.L$10 = countingOutputStream;
                            this.L$11 = c10543HqvA0z;
                            this.J$0 = jElapsedRealtime;
                            this.label = 1;
                            Object objMakeJarvisHttpStreamingPost = hatchHttpApi.makeJarvisHttpStreamingPost(dyiExport, countingOutputStream, abstractC3358CGz, HatchDataExportRepositoryKt.ZIP_MIME_TYPE, lA0S, lA0S2, this);
                            if (objMakeJarvisHttpStreamingPost == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            c10543Hqv = c10543HqvA0z;
                            r0 = objMakeJarvisHttpStreamingPost;
                            outputStream = outputStreamOpenOutputStream;
                        } catch (CancellationException e3) {
                            HatchDataExportRepository hatchDataExportRepository = HatchDataExportRepository.INSTANCE;
                            C7384Etj.A0X(contentResolver);
                            hatchDataExportRepository.discard(contentResolver, uriInsert);
                            if (f1f3.element && !f1f2.element) {
                                HatchDataExportLogging.INSTANCE.logDownloadCancelled(this.$loggingContext);
                            }
                            throw e3;
                        } catch (Exception e4) {
                            CFK.A0A(HatchDataExportRepositoryKt.TAG, "DYI export failed", e4);
                            HatchDataExportRepository hatchDataExportRepository2 = HatchDataExportRepository.INSTANCE;
                            C7384Etj.A0X(contentResolver);
                            hatchDataExportRepository2.discard(contentResolver, uriInsert);
                            if (!f1f2.element) {
                                if (!f1f3.element || f1f.element) {
                                    HatchDataExportLogging.INSTANCE.logSaveFailed(this.$loggingContext, FGI.A0M("mediastore:", hatchDataExportRepository2.errorCategory(e4)));
                                } else {
                                    HatchDataExportLogging.INSTANCE.logDownloadFailed(this.$loggingContext, C3cH.A0m(HatchMetadataKey.DURATION_MS.getValue(), String.valueOf(C3cG.A04(jElapsedRealtime)), C3cG.A0r(HatchMetadataKey.FAILURE_REASON.getValue(), HatchDataExportRepositoryKt.FAILURE_TRANSPORT), C3cG.A0r(HatchMetadataKey.ERROR_TYPE.getValue(), hatchDataExportRepository2.errorCategory(e4))));
                                }
                            }
                            strA0Y = C3cI.A0Y(e4);
                        }
                    } else {
                        HatchDataExportLogging.INSTANCE.logSaveFailed(this.$loggingContext, "mediastore:insert_failed");
                        strA0Y = "mediastore_insert_failed";
                    }
                    return new HatchDataExportResult.Failure(strA0Y);
                }
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                jElapsedRealtime = this.J$0;
                c10543HqvA0z = (C10543Hqv) this.L$11;
                countingOutputStream = (CountingOutputStream) this.L$10;
                ?? r2 = (Closeable) this.L$8;
                c10543HqvA0z2 = (C10543Hqv) this.L$7;
                i = 0;
                bo7 = (BO7) this.L$6;
                c10543Hqv = (C10543Hqv) this.L$5;
                f1f2 = (F1F) this.L$4;
                f1f = (F1F) this.L$3;
                uriInsert = (Uri) this.L$1;
                contentResolver = (ContentResolver) this.L$0;
                Hwg.A00(obj2);
                r0 = obj2;
                outputStream = r2;
                c10543HqvA0z.element = r0;
                bo7.element = countingOutputStream.bytesWritten;
                c10543HqvA0z2.element = countingOutputStream.writeError;
                f1f.element = true;
                if (outputStream != null) {
                    outputStream.close();
                }
                Exception exc = (Exception) c10543HqvA0z2.element;
                if (exc != null) {
                    HatchAppEventLoggingContext hatchAppEventLoggingContext2 = this.$loggingContext;
                    HatchDataExportRepository hatchDataExportRepository3 = HatchDataExportRepository.INSTANCE;
                    C7384Etj.A0X(contentResolver);
                    hatchDataExportRepository3.discard(contentResolver, uriInsert);
                    HatchDataExportLogging.INSTANCE.logSaveFailed(hatchAppEventLoggingContext2, FGI.A0M("mediastore:", hatchDataExportRepository3.errorCategory(exc)));
                    f1f2.element = true;
                    return new HatchDataExportResult.Failure("write_failed");
                }
                HatchDataExportRepository hatchDataExportRepository4 = HatchDataExportRepository.INSTANCE;
                String strFailureReason = hatchDataExportRepository4.failureReason((HatchHttpResponse) c10543Hqv.element, bo7.element);
                if (strFailureReason != null) {
                    C7384Etj.A0X(contentResolver);
                    hatchDataExportRepository4.discard(contentResolver, uriInsert);
                    HatchDataExportLogging.INSTANCE.logDownloadFailed(this.$loggingContext, hatchDataExportRepository4.failureDetails(strFailureReason, (HatchHttpResponse) c10543Hqv.element, bo7.element, jElapsedRealtime));
                    f1f2.element = true;
                    return new HatchDataExportResult.Failure(strFailureReason);
                }
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) c10543Hqv.element;
                if (hatchHttpResponse == null || (strAttachmentFileName = HatchAttachmentFileNameKt.attachmentFileName(hatchHttpResponse)) == null) {
                    strAttachmentFileName = HatchDataExportRepositoryKt.FALLBACK_FILE_NAME;
                }
                ContentValues contentValues2 = new ContentValues();
                AbstractC07127nr.A0A(contentValues2, "is_pending", i);
                contentValues2.put("_display_name", strAttachmentFileName);
                contentResolver.update(uriInsert, contentValues2, null, null);
                HatchDataExportLogging.INSTANCE.logDownloadSucceeded(this.$loggingContext);
                f1f2.element = true;
                return new HatchDataExportResult.Success(uriInsert, strAttachmentFileName, HatchDataExportRepositoryKt.ZIP_MIME_TYPE);
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchDataExportResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discard(ContentResolver contentResolver, Uri uri) {
        try {
            contentResolver.delete(uri, null, null);
        } catch (Exception e) {
            CFK.A0A(HatchDataExportRepositoryKt.TAG, "Failed to remove partial export", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorCategory(Exception exc) {
        return exc instanceof SecurityException ? "security" : exc instanceof FileNotFoundException ? "file_not_found" : exc instanceof IOException ? "io" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String failureReason(HatchHttpResponse hatchHttpResponse, long j) {
        Long lA0s;
        if (hatchHttpResponse == null || hatchHttpResponse.statusCode == -1 || hatchHttpResponse.cause != null) {
            return HatchDataExportRepositoryKt.FAILURE_TRANSPORT;
        }
        if (!hatchHttpResponse.isSuccessful) {
            return HatchDataExportRepositoryKt.FAILURE_SERVER;
        }
        String strHeader = hatchHttpResponse.header("Content-Type");
        if (strHeader == null) {
            strHeader = "";
        }
        String strA0l = AnonymousClass002.A0l(C7BY.A0S(strHeader, strHeader, ';'));
        if (strA0l == null || !strA0l.equalsIgnoreCase(HatchDataExportRepositoryKt.ZIP_MIME_TYPE)) {
            return "bad_content_type";
        }
        if (j <= 0) {
            return "empty_file";
        }
        String strHeader2 = hatchHttpResponse.header("Content-Length");
        if (strHeader2 == null || (lA0s = C9tI.A0s(strHeader2)) == null || lA0s.longValue() == j) {
            return null;
        }
        return "content_length_mismatch";
    }

    private final String elapsedSince(long j) {
        return String.valueOf(C3cG.A04(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> failureDetails(String str, HatchHttpResponse hatchHttpResponse, long j, long j2) {
        String value;
        String strValueOf;
        String strHeader;
        Long lA0s;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.FAILURE_REASON, str, c0924AIaA0u);
        Integer num = null;
        if (hatchHttpResponse != null) {
            int i = hatchHttpResponse.statusCode;
            Integer numValueOf = Integer.valueOf(i);
            if (i > 0) {
                num = numValueOf;
            }
        }
        if (HatchDataExportRepositoryKt.FAILURE_SERVER.equals(str)) {
            if (num != null) {
                int iIntValue = num.intValue();
                value = HatchMetadataKey.HTTP_STATUS.getValue();
                strValueOf = String.valueOf(iIntValue);
                c0924AIaA0u.put(value, strValueOf);
            }
        } else if (HatchDataExportRepositoryKt.FAILURE_TRANSPORT.equals(str)) {
            if (num != null) {
                AnonymousClass006.A1B(HatchMetadataKey.HTTP_STATUS, c0924AIaA0u, num.intValue());
            }
            if (hatchHttpResponse != null && (strHeader = hatchHttpResponse.header("Content-Length")) != null && (lA0s = C9tI.A0s(strHeader)) != null) {
                C3cH.A1A(HatchMetadataKey.EXPECTED_BYTES.getValue(), c0924AIaA0u, lA0s.longValue());
            }
            C3cH.A1A(HatchMetadataKey.RECEIVED_BYTES.getValue(), c0924AIaA0u, j);
            value = HatchMetadataKey.DURATION_MS.getValue();
            strValueOf = String.valueOf(C3cG.A04(j2));
            c0924AIaA0u.put(value, strValueOf);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    public final Object exportToDownloads(Context context, AbstractC3358CGz abstractC3358CGz, HatchAppEventLoggingContext hatchAppEventLoggingContext, HtJ<? super HatchDataExportResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, hatchAppEventLoggingContext, abstractC3358CGz, null));
    }
}
