package com.facebook.aura.commands.photos;

import X.HtJ;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface PhotoUploadDao {
    Object claimable(String str, long j, int i, HtJ<? super List<PhotoUploadQueueEntity>> htJ);

    Object countBatch(String str, HtJ<? super Integer> htJ);

    Object countInBatch(String str, String str2, HtJ<? super Integer> htJ);

    Object earliestRetryAt(String str, HtJ<? super Long> htJ);

    Object failureReasons(String str, String str2, HtJ<? super List<String>> htJ);

    Object insertQueued(PhotoUploadQueueEntity photoUploadQueueEntity, HtJ<? super Long> htJ);

    Object requeue(String str, String str2, long j, HtJ<? super Unit> htJ);

    Object updateQueued(String str, String str2, int i, long j, long j2, String str3, HtJ<? super Unit> htJ);
}
