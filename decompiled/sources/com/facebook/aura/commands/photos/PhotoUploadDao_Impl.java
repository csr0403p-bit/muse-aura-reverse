package com.facebook.aura.commands.photos;

import X.C3cG;
import X.EIK;
import X.EIN;
import X.EJ1;
import X.EJV;
import X.EJY;
import X.G0U;
import X.HtJ;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class PhotoUploadDao_Impl implements PhotoUploadDao {
    public final EIN __db;
    public final EJY<PhotoUploadQueueEntity> __insertAdapterOfPhotoUploadQueueEntity = new EJY<PhotoUploadQueueEntity>() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl.1
        @Override // X.EJY
        public void bind(EIK eik, PhotoUploadQueueEntity photoUploadQueueEntity) {
            eik.A5F(1, photoUploadQueueEntity.mediaUri);
            eik.A5F(2, photoUploadQueueEntity.batchId);
            eik.A5F(3, photoUploadQueueEntity.state);
            eik.A5C(4, photoUploadQueueEntity.strikeCount);
            eik.A5C(5, photoUploadQueueEntity.nextRetryAt);
            eik.A5C(6, photoUploadQueueEntity.lastAttemptAt);
            eik.A5C(7, photoUploadQueueEntity.enqueuedAt);
            String str = photoUploadQueueEntity.failureReason;
            if (str == null) {
                eik.A5D(8);
            } else {
                eik.A5F(8, str);
            }
        }

        @Override // X.EJY
        public String createQuery() {
            return "INSERT OR IGNORE INTO `photo_upload_queue` (`media_uri`,`batch_id`,`state`,`strike_count`,`next_retry_at`,`last_attempt_at`,`enqueued_at`,`failure_reason`) VALUES (?,?,?,?,?,?,?,?)";
        }
    };

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List lambda$claimable$0(String str, long j, int i, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM photo_upload_queue WHERE state = ? AND next_retry_at <= ? ORDER BY enqueued_at ASC LIMIT ?");
        try {
            eikAYO.A5F(1, str);
            eikAYO.A5C(2, j);
            eikAYO.A5C(3, i);
            int iA00 = EJ1.A00(eikAYO, "media_uri");
            int iA002 = EJ1.A00(eikAYO, "batch_id");
            int iA003 = EJ1.A00(eikAYO, "state");
            int iA004 = EJ1.A00(eikAYO, "strike_count");
            int iA005 = EJ1.A00(eikAYO, "next_retry_at");
            int iA006 = EJ1.A00(eikAYO, "last_attempt_at");
            int iA007 = EJ1.A00(eikAYO, "enqueued_at");
            int iA008 = EJ1.A00(eikAYO, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON);
            ArrayList arrayListA0h = C3cG.A0h();
            while (eikAYO.AgN()) {
                arrayListA0h.add(new PhotoUploadQueueEntity(eikAYO.ALa(iA00), eikAYO.ALa(iA002), eikAYO.ALa(iA003), EIK.A00(eikAYO, iA004), eikAYO.getLong(iA005), eikAYO.getLong(iA006), eikAYO.getLong(iA007), eikAYO.isNull(iA008) ? null : eikAYO.ALa(iA008)));
            }
            return arrayListA0h;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Integer lambda$countBatch$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT COUNT(*) FROM photo_upload_queue WHERE batch_id = ?");
        try {
            eikAYO.A5F(1, str);
            return eikAYO.AgN() ? EIK.A05(eikAYO, 0) : 0;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Integer lambda$countInBatch$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT COUNT(*) FROM photo_upload_queue WHERE batch_id = ? AND state = ?");
        try {
            EIK.A09(eikAYO, str, str2);
            return eikAYO.AgN() ? EIK.A05(eikAYO, 0) : 0;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Long lambda$earliestRetryAt$0(String str, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT MIN(next_retry_at) FROM photo_upload_queue WHERE state = ?");
        try {
            eikAYO.A5F(1, str);
            Long lValueOf = null;
            if (eikAYO.AgN() && !eikAYO.isNull(0)) {
                lValueOf = Long.valueOf(eikAYO.getLong(0));
            }
            return lValueOf;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ List lambda$failureReasons$0(String str, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT failure_reason FROM photo_upload_queue WHERE batch_id = ? AND state = ? LIMIT 5");
        try {
            EIK.A09(eikAYO, str, str2);
            ArrayList arrayListA0h = C3cG.A0h();
            while (eikAYO.AgN()) {
                arrayListA0h.add(eikAYO.isNull(0) ? null : eikAYO.ALa(0));
            }
            return arrayListA0h;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Unit lambda$requeue$0(String str, long j, String str2, EJV ejv) {
        EIK eikAYO = ejv.AYO("UPDATE photo_upload_queue SET batch_id = ?, state = 'pending', strike_count = 0, next_retry_at = ?, failure_reason = NULL WHERE media_uri = ?");
        try {
            eikAYO.A5F(1, str);
            eikAYO.A5C(2, j);
            eikAYO.A5F(3, str2);
            eikAYO.AgN();
            return Unit.INSTANCE;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ Unit lambda$updateQueued$0(String str, int i, long j, long j2, String str2, String str3, EJV ejv) {
        EIK eikAYO = ejv.AYO("UPDATE photo_upload_queue SET state = ?, strike_count = ?, next_retry_at = ?, last_attempt_at = ?, failure_reason = ? WHERE media_uri = ?");
        try {
            eikAYO.A5F(1, str);
            eikAYO.A5C(2, i);
            eikAYO.A5C(3, j);
            eikAYO.A5C(4, j2);
            if (str2 == null) {
                eikAYO.A5D(5);
            } else {
                eikAYO.A5F(5, str2);
            }
            eikAYO.A5F(6, str3);
            eikAYO.AgN();
            return Unit.INSTANCE;
        } finally {
            eikAYO.close();
        }
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object claimable(final String str, final long j, final int i, HtJ<? super List<PhotoUploadQueueEntity>> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$claimable$0(str, j, i, (EJV) obj);
            }
        }, true, false);
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object countBatch(final String str, HtJ<? super Integer> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda4
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$countBatch$0(str, (EJV) obj);
            }
        }, true, false);
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object countInBatch(final String str, final String str2, HtJ<? super Integer> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$countInBatch$0(str, str2, (EJV) obj);
            }
        }, true, false);
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object earliestRetryAt(final String str, HtJ<? super Long> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda5
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$earliestRetryAt$0(str, (EJV) obj);
            }
        }, true, false);
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object failureReasons(final String str, final String str2, HtJ<? super List<String>> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda7
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$failureReasons$0(str, str2, (EJV) obj);
            }
        }, true, false);
    }

    /* renamed from: lambda$insertQueued$0$com-facebook-aura-commands-photos-PhotoUploadDao_Impl, reason: not valid java name */
    public /* synthetic */ Long m360x3317f65b(PhotoUploadQueueEntity photoUploadQueueEntity, EJV ejv) {
        return Long.valueOf(this.__insertAdapterOfPhotoUploadQueueEntity.insertAndReturnId(ejv, photoUploadQueueEntity));
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object requeue(final String str, final String str2, final long j, HtJ<? super Unit> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda6
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$requeue$0(str2, j, str, (EJV) obj);
            }
        }, false, true);
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object updateQueued(final String str, final String str2, final int i, final long j, final long j2, final String str3, HtJ<? super Unit> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoUploadDao_Impl.lambda$updateQueued$0(str2, i, j, j2, str3, str, (EJV) obj);
            }
        }, false, true);
    }

    public PhotoUploadDao_Impl(EIN ein) {
        this.__db = ein;
    }

    @Override // com.facebook.aura.commands.photos.PhotoUploadDao
    public Object insertQueued(final PhotoUploadQueueEntity photoUploadQueueEntity, HtJ<? super Long> htJ) {
        photoUploadQueueEntity.getClass();
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoUploadDao_Impl$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return this.f$0.m360x3317f65b(photoUploadQueueEntity, (EJV) obj);
            }
        }, false, true);
    }
}
