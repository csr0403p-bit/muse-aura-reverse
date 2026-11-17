package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.file.core.HatchMimeResolver;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1$remaining$1 extends AbstractC7559F3s implements G0U<ClipData.Item, Boolean> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List<Uri> $imageUris;

    @Override // X.G0U
    public final Boolean invoke(ClipData.Item item) {
        C7384Etj.A0Y(item, 0);
        Uri uri = item.getUri();
        boolean z = false;
        if (uri != null && AnonymousClass005.A1a(HatchMimeResolver.INSTANCE.mimeForContentUri(this.$context, uri), "image/")) {
            this.$imageUris.add(uri);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerRichContentInput$imagePasteReceiver$1$1$remaining$1(Context context, List<Uri> list) {
        super(1);
        this.$context = context;
        this.$imageUris = list;
    }
}
