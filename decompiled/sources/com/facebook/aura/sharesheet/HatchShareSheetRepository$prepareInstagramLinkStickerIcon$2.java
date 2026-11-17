package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2", f = "HatchShareSheetRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2(Context context, HtJ<? super HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2(this.$context, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
        return new HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        try {
            HatchShareMediaCache hatchShareMediaCache = new HatchShareMediaCache(this.$context);
            File fileFindNamed = hatchShareMediaCache.findNamed(HatchShareSheetRepository.LINK_STICKER_ICON_FILE_NAME);
            Context context = this.$context;
            if (fileFindNamed != null) {
                return HatchFileProviderUtil.INSTANCE.getUriForFile(context, fileFindNamed);
            }
            Drawable drawable = context.getDrawable(R.drawable.hatch_logo);
            if (drawable == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
            C7384Etj.A0U(bitmapCreateBitmap);
            try {
                drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                drawable.draw(new Canvas(bitmapCreateBitmap));
                return HatchFileProviderUtil.INSTANCE.getUriForFile(this.$context, hatchShareMediaCache.storeNamed(HatchShareSheetRepository.LINK_STICKER_ICON_FILE_NAME, new HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2$file$1(bitmapCreateBitmap)));
            } finally {
                bitmapCreateBitmap.recycle();
            }
        } catch (Exception e) {
            CFK.A0K(HatchShareSheetRepository.TAG, e, "Failed to prepare Instagram link sticker icon");
            return null;
        }
    }
}
