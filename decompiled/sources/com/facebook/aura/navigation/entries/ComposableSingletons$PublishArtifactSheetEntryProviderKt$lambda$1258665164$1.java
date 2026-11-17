package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.file.view.HatchPublishArtifactSheetKt;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PublishArtifactSheetEntryProviderKt$lambda$-1258665164$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PublishArtifactSheetEntryProviderKt$lambda$1258665164$1 extends AbstractC7559F3s implements G0W<PublishArtifactSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PublishArtifactSheetEntryProviderKt$lambda$1258665164$1 INSTANCE = new ComposableSingletons$PublishArtifactSheetEntryProviderKt$lambda$1258665164$1();

    public ComposableSingletons$PublishArtifactSheetEntryProviderKt$lambda$1258665164$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PublishArtifactSheetKey publishArtifactSheetKey, BFM bfm, Integer num) {
        invoke(publishArtifactSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PublishArtifactSheetKey publishArtifactSheetKey, BFM bfm, int i) {
        HatchPublishArtifactSheetKt.HatchPublishArtifactSheet(publishArtifactSheetKey, bfm, AnonymousClass006.A0E(publishArtifactSheetKey, i));
    }
}
