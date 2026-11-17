package com.facebook.aura.audio;

import com.facebook.aura.executors.AuraExecutors;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class HatchAudioCacheKt {
    public static final String AUDIO_CACHE_DIR = "audio_cache";

    public static final void deleteChildrenInBackground(final File file) {
        AuraExecutors.INSTANCE.getIoExecutor().execute(new Runnable() { // from class: com.facebook.aura.audio.HatchAudioCacheKt.deleteChildrenInBackground.1
            @Override // java.lang.Runnable
            public final void run() {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
            }
        });
    }
}
