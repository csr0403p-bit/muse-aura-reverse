package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.spaces.share.PublishSpaceSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PublishSpaceSheetEntryProviderKt$lambda$-1466870366$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PublishSpaceSheetEntryProviderKt$lambda$1466870366$1 extends AbstractC7559F3s implements G0W<PublishSpaceSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PublishSpaceSheetEntryProviderKt$lambda$1466870366$1 INSTANCE = new ComposableSingletons$PublishSpaceSheetEntryProviderKt$lambda$1466870366$1();

    public ComposableSingletons$PublishSpaceSheetEntryProviderKt$lambda$1466870366$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PublishSpaceSheetKey publishSpaceSheetKey, BFM bfm, Integer num) {
        invoke(publishSpaceSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PublishSpaceSheetKey publishSpaceSheetKey, BFM bfm, int i) {
        PublishSpaceSheetKt.PublishSpaceSheet(publishSpaceSheetKey, bfm, AnonymousClass006.A0E(publishSpaceSheetKey, i));
    }
}
