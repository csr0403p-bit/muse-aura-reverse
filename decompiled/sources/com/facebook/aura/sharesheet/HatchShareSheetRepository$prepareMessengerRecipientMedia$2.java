package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMessengerRecipientMedia$2", f = "HatchShareSheetRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$prepareMessengerRecipientMedia$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchPreparedShareMedia>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchPreparedShareMedia $media;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$prepareMessengerRecipientMedia$2(Context context, HatchPreparedShareMedia hatchPreparedShareMedia, HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$prepareMessengerRecipientMedia$2> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$media = hatchPreparedShareMedia;
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetRepository$prepareMessengerRecipientMedia$2(this.$context, this.$media, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateBitmap;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        try {
            HatchShareMediaCache hatchShareMediaCache = new HatchShareMediaCache(this.$context);
            String strKeyFor = HatchShareMediaCache.Companion.keyFor(AnonymousClass007.A0a("messenger-recipient:", this.$media.uri));
            HatchPreparedShareMedia hatchPreparedShareMediaFindCachedMedia = this.this$0.findCachedMedia(this.$context, hatchShareMediaCache, strKeyFor);
            if (hatchPreparedShareMediaFindCachedMedia != null) {
                return hatchPreparedShareMediaFindCachedMedia;
            }
            Bitmap bitmapDecodeBounded = ImageCompressor.INSTANCE.decodeBounded(this.$context, this.$media.uri, 2048);
            if (bitmapDecodeBounded == null) {
                return null;
            }
            if (bitmapDecodeBounded.hasAlpha()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeBounded.getWidth(), bitmapDecodeBounded.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(bitmapDecodeBounded, 0.0f, 0.0f, (Paint) null);
            } else {
                bitmapCreateBitmap = bitmapDecodeBounded;
            }
            C7384Etj.A0X(bitmapCreateBitmap);
            try {
                return new HatchPreparedShareMedia(HatchFileProviderUtil.INSTANCE.getUriForFile(this.$context, hatchShareMediaCache.storeNamed(FGI.A0M(strKeyFor, AuraBugReportSender.DEFAULT_IMAGE_EXTENSION), new HatchShareSheetRepository$prepareMessengerRecipientMedia$2$file$1(bitmapCreateBitmap))), MediaDeviceSyncClientKt.FALLBACK_MIME);
            } finally {
                if (bitmapCreateBitmap != bitmapDecodeBounded) {
                    bitmapCreateBitmap.recycle();
                }
                bitmapDecodeBounded.recycle();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0K(HatchShareSheetRepository.TAG, e2, "Failed to prepare Messenger recipient media");
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchPreparedShareMedia> htJ) {
        return ((HatchShareSheetRepository$prepareMessengerRecipientMedia$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
