package com.facebook.aura.bloks.fonts;

import X.BV4;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F0H;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class AuraTypefaceCreatorKt {
    public static final int DEFAULT_WEIGHT = 400;
    public static final int OPTICAL_SIZE = 17;
    public static final String OPTICAL_SIZE_AXIS = "opsz";
    public static final String WEIGHT_AXIS = "wght";
    public static final ConcurrentHashMap<String, File> cachedFontFiles = C60O.A1C();

    public static final File getOrCreateFontFile(Context context, int i, String str) {
        File fileA0O;
        InputStream inputStreamOpenRawResource;
        ConcurrentHashMap<String, File> concurrentHashMap = cachedFontFiles;
        File file = concurrentHashMap.get(str);
        if (file != null && file.exists()) {
            return file;
        }
        synchronized (concurrentHashMap) {
            File file2 = concurrentHashMap.get(str);
            if (file2 != null && file2.exists()) {
                return file2;
            }
            File file3 = null;
            try {
                fileA0O = C3cG.A0O(context.getCacheDir(), str);
                inputStreamOpenRawResource = context.getResources().openRawResource(i);
            } catch (Exception unused) {
            }
            try {
                FileOutputStream fileOutputStreamA0I = BV4.A0I(fileA0O);
                try {
                    C7384Etj.A0X(inputStreamOpenRawResource);
                    F0H.A00(inputStreamOpenRawResource, fileOutputStreamA0I);
                    fileOutputStreamA0I.close();
                    inputStreamOpenRawResource.close();
                    concurrentHashMap.put(str, fileA0O);
                    file3 = fileA0O;
                    return file3;
                } finally {
                }
            } finally {
            }
        }
    }
}
