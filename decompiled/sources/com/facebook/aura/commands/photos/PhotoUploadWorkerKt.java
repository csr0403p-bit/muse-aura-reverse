package com.facebook.aura.commands.photos;

/* loaded from: classes3.dex */
public abstract class PhotoUploadWorkerKt {
    public static final int DRAIN_LIMIT = 32;
    public static final long QUARANTINE_BACKOFF_MS = 82800000;
    public static final long SHORT_BACKOFF_MS = 18000000;
    public static final int STRIKES_BEFORE_BACKOFF = 3;
    public static final int STRIKES_BEFORE_QUARANTINE = 6;
    public static final String TAG = "PhotoUploadWorker";
    public static final String WORK_NAME = "hatch_photo_upload";
}
