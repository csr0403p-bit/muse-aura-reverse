package com.facebook.aura.commands.photos;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C7yC;
import X.F1d;
import X.F3R;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class PhotoUploadWorker extends AuraBackgroundCoroutineWorker {
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final void enqueue(Context context) {
            C7384Etj.A0Y(context, 0);
            scheduleAt(context, 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleAt(Context context, long j) {
            F1d f1d = new F1d(PhotoUploadWorker.class);
            C60P.A1U(f1d);
            if (j < 0) {
                j = 0;
            }
            f1d.A02(j, TimeUnit.MILLISECONDS);
            F3R.A02(context).A04(C7yC.A03, f1d.A01(), PhotoUploadWorkerKt.WORK_NAME);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotoUploadWorker", f = "PhotoUploadWorker.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, 61, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 71, 73, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 84, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 98, 100, 105, 109}, m = "doBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotoUploadWorker$doBackgroundWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoUploadWorker.this.doBackgroundWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retry(PhotoUploadDao photoUploadDao, PhotoUploadQueueEntity photoUploadQueueEntity, String str, HtJ<? super Unit> htJ) {
        int i = photoUploadQueueEntity.strikeCount + 1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        return C3cG.A0U(photoUploadDao.updateQueued(photoUploadQueueEntity.mediaUri, PhotoUploadState.PENDING.getWireValue(), i, jCurrentTimeMillis + (i < 3 ? 0L : i < 6 ? PhotoUploadWorkerKt.SHORT_BACKOFF_MS : PhotoUploadWorkerKt.QUARANTINE_BACKOFF_MS), jCurrentTimeMillis, str, htJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x011b -> B:25:0x00da). Please report as a decompilation issue!!! */
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doBackgroundWork(X.HtJ<? super X.C77S> r24) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotoUploadWorker.doBackgroundWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finish(PhotoUploadDao photoUploadDao, String str, PhotoUploadState photoUploadState, int i, String str2, HtJ<? super Unit> htJ) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return C3cG.A0U(photoUploadDao.updateQueued(str, photoUploadState.getWireValue(), i, jCurrentTimeMillis, jCurrentTimeMillis, str2, htJ));
    }
}
