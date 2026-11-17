package com.facebook.aura.bugreport.screenshot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.CFK;
import X.CFP;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraBugReportScreenshotUtil {
    public static final AuraBugReportScreenshotUtil INSTANCE = new AuraBugReportScreenshotUtil();
    public static final List<Integer> JPEG_QUALITIES = Arrays.asList(80, 65, 50);
    public static final int MAX_FILE_BYTES = 1048576;
    public static final int MAX_SHORT_EDGE_PX = 1080;
    public static final long PIXEL_COPY_TIMEOUT_MS = 1500;
    public static final String SCREENSHOTS_DIR = "bug_report_screenshots";
    public static final String TAG = "AuraBugReportScreenshotUtil";

    @DebugMetadata(c = "com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil", f = "AuraBugReportScreenshotUtil.kt", l = {131}, m = "copyWindowPixels", v = 2)
    /* renamed from: com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportScreenshotUtil.this.copyWindowPixels(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil", f = "AuraBugReportScreenshotUtil.kt", l = {61, 72, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "createScreenshotFile", v = 2)
    /* renamed from: com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$createScreenshotFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C110141 extends HzP {
        public float F$0;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C110141(HtJ<? super C110141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBugReportScreenshotUtil.this.createScreenshotFile(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$createScreenshotFile$2", f = "AuraBugReportScreenshotUtil.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$createScreenshotFile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ String $submissionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, String str, byte[] bArr, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$activity = activity;
            this.$submissionId = str;
            this.$bytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$activity, this.$submissionId, this.$bytes, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File fileScreenshotFile = AuraBugReportScreenshotUtil.INSTANCE.screenshotFile(this.$activity, this.$submissionId);
            byte[] bArr = this.$bytes;
            File parentFile = fileScreenshotFile.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            CFP.A06(fileScreenshotFile, bArr);
            return fileScreenshotFile;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a A[Catch: Exception -> 0x017a, CancellationException -> 0x018a, all -> 0x018c, TRY_LEAVE, TryCatch #1 {Exception -> 0x017a, blocks: (B:42:0x0133, B:43:0x0136, B:45:0x013a, B:48:0x0149), top: B:71:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149 A[Catch: Exception -> 0x017a, CancellationException -> 0x018a, all -> 0x018c, TRY_ENTER, TryCatch #1 {Exception -> 0x017a, blocks: (B:42:0x0133, B:43:0x0136, B:45:0x013a, B:48:0x0149), top: B:71:0x0133 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createScreenshotFile(android.app.Activity r15, java.lang.String r16, X.HtJ<? super java.io.File> r17) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil.createScreenshotFile(android.app.Activity, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyWindowPixels(android.view.Window r7, final android.graphics.Bitmap r8, X.HtJ<? super java.lang.Integer> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil.AnonymousClass1
            if (r0 == 0) goto L1e
            r5 = r9
            com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$1 r5 = (com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L24
            goto L4b
        L1e:
            com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$1 r5 = new com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$1
            r5.<init>(r9)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            r5.L$0 = r7     // Catch: java.lang.IllegalArgumentException -> L55
            r5.L$1 = r8     // Catch: java.lang.IllegalArgumentException -> L55
            r5.label = r3     // Catch: java.lang.IllegalArgumentException -> L55
            X.GBL r2 = X.C7Bm.A04(r5)     // Catch: java.lang.IllegalArgumentException -> L55
            com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$2$1 r1 = new com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$copyWindowPixels$2$1     // Catch: java.lang.IllegalArgumentException -> L55
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> L55
            com.facebook.aura.executors.AuraExecutors r0 = com.facebook.aura.executors.AuraExecutors.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L55
            android.os.Handler r0 = r0.getUiThreadHandler()     // Catch: java.lang.IllegalArgumentException -> L55
            android.view.PixelCopy.request(r7, r8, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L55
            java.lang.Object r1 = r2.A0F()     // Catch: java.lang.IllegalArgumentException -> L55
            if (r1 != r4) goto L4e
            return r4
        L4b:
            X.Hwg.A00(r1)     // Catch: java.lang.IllegalArgumentException -> L55
        L4e:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.IllegalArgumentException -> L55
            int r3 = r1.intValue()     // Catch: java.lang.IllegalArgumentException -> L55
            goto L5d
        L55:
            r2 = move-exception
            java.lang.String r1 = "Failed to copy window"
            java.lang.String r0 = "AuraBugReportScreenshotUtil"
            X.CFK.A0K(r0, r2, r1)
        L5d:
            java.lang.Integer r4 = X.C3cG.A0R(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil.copyWindowPixels(android.view.Window, android.graphics.Bitmap, X.HtJ):java.lang.Object");
    }

    private final boolean drawView(View view, Bitmap bitmap, float f) {
        try {
            Canvas canvas = new Canvas(bitmap);
            canvas.scale(f, f);
            view.draw(canvas);
            return true;
        } catch (Exception e) {
            CFK.A04(TAG, FGI.A0M("Failed to draw screenshot: ", e.getMessage()));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encodeJpeg(Bitmap bitmap) {
        byte[] byteArray;
        Iterator<Integer> it = JPEG_QUALITIES.iterator();
        do {
            byteArray = null;
            if (!it.hasNext()) {
                break;
            }
            int iA03 = C60Q.A03(it);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, iA03, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        } while (byteArray.length > 1048576);
        return byteArray;
    }

    public final File screenshotFile(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return C3cG.A0O(context.getCacheDir(), FGI.A0U("bug_report_screenshots/", str, AuraBugReportSender.DEFAULT_IMAGE_EXTENSION));
    }
}
