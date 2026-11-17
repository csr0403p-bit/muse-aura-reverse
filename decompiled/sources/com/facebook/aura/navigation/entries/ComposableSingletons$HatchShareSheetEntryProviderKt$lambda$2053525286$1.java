package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.key.HatchShareSheetKey;
import com.facebook.aura.sharesheet.HatchShareSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$HatchShareSheetEntryProviderKt$lambda$-2053525286$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HatchShareSheetEntryProviderKt$lambda$2053525286$1 extends AbstractC7559F3s implements G0W<HatchShareSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchShareSheetEntryProviderKt$lambda$2053525286$1 INSTANCE = new ComposableSingletons$HatchShareSheetEntryProviderKt$lambda$2053525286$1();

    public ComposableSingletons$HatchShareSheetEntryProviderKt$lambda$2053525286$1() {
        super(3);
    }

    public final void invoke(HatchShareSheetKey hatchShareSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchShareSheetKey, 0);
        HatchShareSheetKt.HatchShareSheet(hatchShareSheetKey.shareType, hatchShareSheetKey.previewUri, hatchShareSheetKey.mediaUri, hatchShareSheetKey.shareText, hatchShareSheetKey.downloadTarget, hatchShareSheetKey.instagramStoriesStickerUri, hatchShareSheetKey.contentId, null, hatchShareSheetKey.messageId, hatchShareSheetKey.threadId, hatchShareSheetKey.previewTitle, hatchShareSheetKey.dance, bfm, 0, HatchDanceShare.$stable << 3, 128);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchShareSheetKey hatchShareSheetKey, BFM bfm, Integer num) {
        invoke(hatchShareSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
