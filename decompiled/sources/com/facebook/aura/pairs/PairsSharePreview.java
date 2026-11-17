package com.facebook.aura.pairs;

import X.C3cG;
import X.C7384Etj;
import X.Hy2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class PairsSharePreview {
    public static final int $stable = 0;
    public static final String FILE_NAME = "pairs_share_preview.png";
    public static final int ICON_SIZE_PX = 192;
    public static final PairsSharePreview INSTANCE = new PairsSharePreview();
    public static final String SHARED_DIR = "shared";

    public final Uri imageUri(Context context) throws IOException {
        C7384Etj.A0Y(context, 0);
        try {
            File fileA0O = C3cG.A0O(C3cG.A0O(context.getCacheDir(), "shared"), FILE_NAME);
            if (!fileA0O.exists()) {
                File parentFile = fileA0O.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
                C7384Etj.A0U(applicationIcon);
                Bitmap bitmapA00 = Hy2.A00(applicationIcon, 192, 192);
                FileOutputStream fileOutputStream = new FileOutputStream(fileA0O);
                try {
                    bitmapA00.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            }
            return HatchFileProviderUtil.INSTANCE.getUriForFile(context, fileA0O);
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }
}
