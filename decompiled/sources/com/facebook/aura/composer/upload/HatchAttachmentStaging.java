package com.facebook.aura.composer.upload;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV5;
import X.BV7;
import X.C06827l3;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import X.CFP;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.io.File;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchAttachmentStaging {
    public static final int COPY_BUFFER_BYTES = 65536;
    public static final String GATEWAY_UPLOAD_PATH_PREFIX = "workspace/user/files";
    public static final String UPLOAD_DIR = "uploads";
    public static final HatchAttachmentStaging INSTANCE = new HatchAttachmentStaging();
    public static final AtomicLong uploadSeq = BV5.A19();
    public static final Random random = new Random();

    @DebugMetadata(c = "com.facebook.aura.composer.upload.HatchAttachmentStaging$stage$2", f = "HatchAttachmentStaging.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.upload.HatchAttachmentStaging$stage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $maxSizeBytes;
        public final /* synthetic */ Uri $sourceUri;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$sourceUri = uri;
            this.$maxSizeBytes = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$sourceUri, this.$maxSizeBytes, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            throw new com.facebook.aura.composer.upload.AttachmentTooLargeException(r2);
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r2 = "Failed to open input stream for "
                java.lang.Object r10 = r12.L$0
                X.3UX r10 = (X.C3UX) r10
                int r0 = r12.label
                if (r0 != 0) goto L83
                X.Hwg.A00(r13)
                android.content.Context r0 = r12.$context
                java.io.File r1 = r0.getCacheDir()
                java.lang.String r0 = "uploads"
                java.io.File r1 = X.C3cG.A0O(r1, r0)
                r1.mkdirs()
                java.lang.String r0 = X.AnonymousClass002.A0k()
                java.io.File r11 = X.C3cG.A0O(r1, r0)
                android.content.Context r0 = r12.$context     // Catch: java.lang.Throwable -> L79
                android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L79
                android.net.Uri r0 = r12.$sourceUri     // Catch: java.lang.Throwable -> L79
                java.io.InputStream r5 = r1.openInputStream(r0)     // Catch: java.lang.Throwable -> L79
                if (r5 == 0) goto L72
                long r2 = r12.$maxSizeBytes     // Catch: java.lang.Throwable -> L79
                java.io.FileOutputStream r9 = X.BV4.A0I(r11)     // Catch: java.lang.Throwable -> L6b
                r0 = 65536(0x10000, float:9.18355E-41)
                byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L64
                r6 = 0
            L3f:
                X.78T r0 = r10.AEA()     // Catch: java.lang.Throwable -> L64
                X.HzS.A05(r0)     // Catch: java.lang.Throwable -> L64
                int r4 = r5.read(r8)     // Catch: java.lang.Throwable -> L64
                if (r4 < 0) goto L5d
                long r0 = (long) r4     // Catch: java.lang.Throwable -> L64
                long r6 = r6 + r0
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 > 0) goto L57
                r0 = 0
                r9.write(r8, r0, r4)     // Catch: java.lang.Throwable -> L64
                goto L3f
            L57:
                com.facebook.aura.composer.upload.AttachmentTooLargeException r0 = new com.facebook.aura.composer.upload.AttachmentTooLargeException     // Catch: java.lang.Throwable -> L64
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L64
                throw r0     // Catch: java.lang.Throwable -> L64
            L5d:
                r9.close()     // Catch: java.lang.Throwable -> L6b
                r5.close()     // Catch: java.lang.Throwable -> L79
                return r11
            L64:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> L66
            L66:
                r0 = move-exception
                X.AbstractC7531Ezs.A00(r9, r1)     // Catch: java.lang.Throwable -> L6b
                throw r0     // Catch: java.lang.Throwable -> L6b
            L6b:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> L6d
            L6d:
                r0 = move-exception
                X.AbstractC7531Ezs.A00(r5, r1)     // Catch: java.lang.Throwable -> L79
                goto L78
            L72:
                android.net.Uri r0 = r12.$sourceUri     // Catch: java.lang.Throwable -> L79
                java.io.IOException r0 = X.BV8.A0j(r0, r2)     // Catch: java.lang.Throwable -> L79
            L78:
                throw r0     // Catch: java.lang.Throwable -> L79
            L79:
                r1 = move-exception
                r11.delete()     // Catch: java.lang.Throwable -> L7e
                throw r1
            L7e:
                r0 = move-exception
                X.C3cG.A0s(r0)
                throw r1
            L83:
                java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.upload.HatchAttachmentStaging.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.upload.HatchAttachmentStaging$stageBytes$2", f = "HatchAttachmentStaging.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.upload.HatchAttachmentStaging$stageBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C111802 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111802(Context context, byte[] bArr, HtJ<? super C111802> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$bytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C111802 c111802 = new C111802(this.$context, this.$bytes, htJ);
            c111802.L$0 = obj;
            return c111802;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File fileA0O = C3cG.A0O(this.$context.getCacheDir(), HatchAttachmentStaging.UPLOAD_DIR);
            fileA0O.mkdirs();
            File fileA0O2 = C3cG.A0O(fileA0O, AnonymousClass002.A0k());
            try {
                CFP.A06(fileA0O2, this.$bytes);
                return fileA0O2;
            } catch (Throwable th) {
                try {
                    fileA0O2.delete();
                    throw th;
                } catch (Throwable th2) {
                    C3cG.A0s(th2);
                    throw th;
                }
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
            return ((C111802) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final String makeUploadPath(String str) {
        String strSubstring;
        String strSubstring2;
        C7384Etj.A0Y(str, 0);
        String strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload = sanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload(str);
        int iA09 = C7BY.A09(strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload, '.', C8j3.A0J(strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload, 0) - 1);
        if (iA09 > 0) {
            strSubstring = strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload.substring(0, iA09);
            strSubstring2 = strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload.substring(iA09);
        } else {
            strSubstring = strSanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload;
            strSubstring2 = "";
        }
        long andIncrement = uploadSeq.getAndIncrement();
        String string = Long.toString(random.nextInt(HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES), 36);
        C7384Etj.A0U(string);
        String strA0P = C7BY.A0P(string, 4);
        int iA0J = C8j3.A0J(strA0P, 0);
        String strSubstring3 = strA0P.substring(iA0J - (4 > iA0J ? iA0J : 4));
        StringBuilder sbA0x = C3cI.A0x("workspace/user/files/", strSubstring);
        BV7.A1H("_", sbA0x, andIncrement);
        return C60P.A1M(strSubstring3, strSubstring2, sbA0x);
    }

    public final String sanitizeUploadFilename$fbandroid_express_aura_java_com_facebook_aura_composer_upload_upload(String str) {
        String strSubstring;
        String strSubstring2;
        C7384Etj.A0Y(str, 0);
        int iA09 = C7BY.A09(str, '.', str.length() - 1);
        if (iA09 > 0) {
            strSubstring = str.substring(0, iA09);
            strSubstring2 = str.substring(iA09);
        } else {
            strSubstring = str;
            strSubstring2 = "";
        }
        return FGI.A0M(C06827l3.A02("[^a-zA-Z0-9._-]").A03(strSubstring, "_"), strSubstring2);
    }

    public final void wipeStagingDir(Context context) {
        File[] fileArrListFiles;
        C7384Etj.A0Y(context, 0);
        File fileA0O = C3cG.A0O(context.getCacheDir(), UPLOAD_DIR);
        if (!fileA0O.isDirectory() || (fileArrListFiles = fileA0O.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                file.delete();
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }
    }

    public static /* synthetic */ Object stage$default(HatchAttachmentStaging hatchAttachmentStaging, Context context, Uri uri, long j, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        return hatchAttachmentStaging.stage(context, uri, j, htJ);
    }

    public final Object stage(Context context, Uri uri, long j, HtJ<? super File> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, uri, j, null));
    }

    public final Object stageBytes(Context context, byte[] bArr, HtJ<? super File> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111802(context, bArr, null));
    }
}
