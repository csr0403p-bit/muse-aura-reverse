package com.facebook.aura.commands.photos;

import X.HtJ;
import kotlin.Unit;

/* loaded from: classes5.dex */
public interface PhotoLabelDao {
    Object clear(HtJ<? super Unit> htJ);

    Object find(String str, long j, long j2, HtJ<? super PhotoLabelEntity> htJ);

    Object upsert(PhotoLabelEntity photoLabelEntity, HtJ<? super Unit> htJ);
}
