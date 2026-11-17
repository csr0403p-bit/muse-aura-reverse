package com.facebook.aura.commands.photos;

import X.EIK;
import X.EIN;
import X.EJ1;
import X.EJV;
import X.EJY;
import X.G0U;
import X.HtJ;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class PhotoLabelDao_Impl implements PhotoLabelDao {
    public final EIN __db;
    public final EJY<PhotoLabelEntity> __insertAdapterOfPhotoLabelEntity = new EJY<PhotoLabelEntity>() { // from class: com.facebook.aura.commands.photos.PhotoLabelDao_Impl.1
        @Override // X.EJY
        public void bind(EIK eik, PhotoLabelEntity photoLabelEntity) {
            eik.A5F(1, photoLabelEntity.mediaUri);
            eik.A5C(2, photoLabelEntity.sizeBytes);
            eik.A5C(3, photoLabelEntity.dateModifiedSeconds);
            eik.A5F(4, photoLabelEntity.labels);
            eik.A5C(5, photoLabelEntity.labeledAt);
        }

        @Override // X.EJY
        public String createQuery() {
            return "INSERT OR REPLACE INTO `photo_labels` (`media_uri`,`size_bytes`,`date_modified_s`,`labels`,`labeled_at`) VALUES (?,?,?,?,?)";
        }
    };

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Unit lambda$clear$0(EJV ejv) {
        EIK eikAYO = ejv.AYO("DELETE FROM photo_labels");
        try {
            eikAYO.AgN();
            return Unit.INSTANCE;
        } finally {
            eikAYO.close();
        }
    }

    public static /* synthetic */ PhotoLabelEntity lambda$find$0(String str, long j, long j2, EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT * FROM photo_labels WHERE media_uri = ? AND size_bytes = ? AND date_modified_s = ? LIMIT 1");
        try {
            eikAYO.A5F(1, str);
            eikAYO.A5C(2, j);
            eikAYO.A5C(3, j2);
            return eikAYO.AgN() ? new PhotoLabelEntity(eikAYO.ALa(EJ1.A00(eikAYO, "media_uri")), eikAYO.getLong(EJ1.A00(eikAYO, "size_bytes")), eikAYO.getLong(EJ1.A00(eikAYO, "date_modified_s")), eikAYO.ALa(EJ1.A00(eikAYO, PhotosSearchHandlerKt.PARAM_LABELS)), eikAYO.getLong(EJ1.A00(eikAYO, "labeled_at"))) : null;
        } finally {
            eikAYO.close();
        }
    }

    @Override // com.facebook.aura.commands.photos.PhotoLabelDao
    public Object clear(HtJ<? super Unit> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoLabelDao_Impl$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoLabelDao_Impl.lambda$clear$0((EJV) obj);
            }
        }, false, true);
    }

    @Override // com.facebook.aura.commands.photos.PhotoLabelDao
    public Object find(final String str, final long j, final long j2, HtJ<? super PhotoLabelEntity> htJ) {
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoLabelDao_Impl$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return PhotoLabelDao_Impl.lambda$find$0(str, j, j2, (EJV) obj);
            }
        }, true, false);
    }

    /* renamed from: lambda$upsert$0$com-facebook-aura-commands-photos-PhotoLabelDao_Impl, reason: not valid java name */
    public /* synthetic */ Unit m352x6d011111(PhotoLabelEntity photoLabelEntity, EJV ejv) {
        this.__insertAdapterOfPhotoLabelEntity.insert(ejv, (EJV) photoLabelEntity);
        return Unit.INSTANCE;
    }

    public PhotoLabelDao_Impl(EIN ein) {
        this.__db = ein;
    }

    @Override // com.facebook.aura.commands.photos.PhotoLabelDao
    public Object upsert(final PhotoLabelEntity photoLabelEntity, HtJ<? super Unit> htJ) {
        photoLabelEntity.getClass();
        return DBUtil__DBUtil_androidKt.A00(this.__db, htJ, new G0U() { // from class: com.facebook.aura.commands.photos.PhotoLabelDao_Impl$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                PhotoLabelDao_Impl photoLabelDao_Impl = this.f$0;
                PhotoLabelEntity photoLabelEntity2 = photoLabelEntity;
                photoLabelDao_Impl.__insertAdapterOfPhotoLabelEntity.insert((EJV) obj, (EJV) photoLabelEntity2);
                return Unit.INSTANCE;
            }
        }, false, true);
    }
}
