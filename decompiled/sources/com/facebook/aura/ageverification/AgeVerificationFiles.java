package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.CEV;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class AgeVerificationFiles {
    public static final int $stable = 0;
    public static final AgeVerificationFiles INSTANCE = new AgeVerificationFiles();

    public final void clearAll(Context context) {
        C7384Etj.A0Y(context, 0);
        CEV.A03(root(context));
    }

    public final CapturedVideo readVideo(File file) throws IOException {
        C7384Etj.A0Y(file, 0);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            return new CapturedVideo(file);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public final CapturedPhoto writeJpeg(Bitmap bitmap, File file, int i) throws IOException {
        AnonymousClass003.A0u(bitmap, file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream)) {
                throw new IOException("Could not encode capture");
            }
            fileOutputStream.close();
            return new CapturedPhoto(file, bitmap.getWidth(), bitmap.getHeight(), file.length());
        } finally {
        }
    }

    public static /* synthetic */ CapturedPhoto writeJpeg$default(AgeVerificationFiles ageVerificationFiles, Bitmap bitmap, File file, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 90;
        }
        return ageVerificationFiles.writeJpeg(bitmap, file, i);
    }

    private final File root(Context context) {
        return C3cG.A0O(context.getCacheDir(), "age_verification");
    }

    public final void clear(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        CEV.A03(directory(context, str));
    }

    public final File create(Context context, String str, String str2, String str3) throws IOException {
        AnonymousClass005.A14(context, str, str2, str3);
        File fileDirectory = directory(context, str);
        if (!fileDirectory.isDirectory() && !fileDirectory.mkdirs()) {
            throw new IOException("Could not create capture directory");
        }
        File fileCreateTempFile = File.createTempFile(str2, str3, fileDirectory);
        C7384Etj.A0U(fileCreateTempFile);
        return fileCreateTempFile;
    }

    public final File directory(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return C3cG.A0O(root(context), str);
    }
}
