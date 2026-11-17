package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC7531Ezs;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C60R;
import X.C7384Etj;
import X.CEV;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WidgetFileStore {
    public static final int $stable = 8;
    public final String directoryName;
    public long generation;
    public final Object lock;

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetFileStore$save$2", f = "WidgetFileStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetFileStore$save$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $expectedGeneration;
        public final /* synthetic */ Bitmap.CompressFormat $format;
        public final /* synthetic */ int $quality;
        public final /* synthetic */ String $relativePath;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Context context, String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$expectedGeneration = j;
            this.$context = context;
            this.$relativePath = str;
            this.$bitmap = bitmap;
            this.$format = compressFormat;
            this.$quality = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WidgetFileStore.this.new AnonymousClass2(this.$expectedGeneration, this.$context, this.$relativePath, this.$bitmap, this.$format, this.$quality, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                if (r0 != 0) goto L2f
                X.Hwg.A00(r12)
                com.facebook.aura.widgets.WidgetFileStore r6 = com.facebook.aura.widgets.WidgetFileStore.this
                java.lang.Object r4 = r6.lock
                long r2 = r11.$expectedGeneration
                android.content.Context r7 = r11.$context
                java.lang.String r8 = r11.$relativePath
                android.graphics.Bitmap r9 = r11.$bitmap
                android.graphics.Bitmap$CompressFormat r10 = r11.$format
                int r11 = r11.$quality
                monitor-enter(r4)
                long r0 = r6.generation     // Catch: java.lang.Throwable -> L2c
                int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r5 != 0) goto L25
                boolean r1 = com.facebook.aura.widgets.WidgetFileStore.access$write(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2c
                r0 = 1
                if (r1 != 0) goto L26
            L25:
                r0 = 0
            L26:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r4)
                return r0
            L2c:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L2f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetFileStore.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public WidgetFileStore(String str) {
        C7384Etj.A0Y(str, 0);
        this.directoryName = str;
        this.lock = C3cG.A0T();
    }

    public final void deleteAll(Context context) {
        C7384Etj.A0Y(context, 0);
        synchronized (this.lock) {
            this.generation++;
            CEV.A03(directory(context));
        }
    }

    public final long generation() {
        long j;
        synchronized (this.lock) {
            j = this.generation;
        }
        return j;
    }

    private final File directory(Context context) {
        return C3cG.A0O(context.getNoBackupFilesDir(), this.directoryName);
    }

    private final File file(Context context, String str) {
        return C3cG.A0O(directory(context), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean write(Context context, String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) throws IOException {
        File fileA0O = C3cG.A0O(directory(context), str);
        File parentFile = fileA0O.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File fileA0O2 = C3cG.A0O(fileA0O.getParentFile(), FGI.A0M(fileA0O.getName(), AuraPrefsStorage.TEMP_FILE_SUFFIX));
        FileOutputStream fileOutputStream = new FileOutputStream(fileA0O2);
        try {
            boolean zCompress = bitmap.compress(compressFormat, i, fileOutputStream);
            fileOutputStream.close();
            return zCompress && fileA0O2.renameTo(fileA0O);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final void delete(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        C3cG.A0O(directory(context), str).delete();
    }

    public final void deleteAllExcept(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        synchronized (this.lock) {
            File[] fileArrListFiles = directory(context).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (File file : fileArrListFiles) {
                    if (!str.equals(file.getName())) {
                        arrayListA0h.add(file);
                    }
                }
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    C60R.A1Q(it);
                }
            }
        }
    }

    public final Bitmap load(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        File fileA0O = C3cG.A0O(directory(context), str);
        if (fileA0O.exists()) {
            return BitmapFactory.decodeFile(fileA0O.getPath());
        }
        return null;
    }

    public final Object save(Context context, String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, long j, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(j, context, str, bitmap, compressFormat, i, null));
    }
}
