package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.G0W;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenContent$1$3$3$1 extends AbstractC7559F3s implements G0W<String, String, String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenContent$1$3$3$1(AuraNavigator auraNavigator) {
        super(3);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        AnonymousClass005.A10(str, str2, str3);
        AnonymousClass006.A1C(new ContentItem(str3, ContentTypeDetector.INSTANCE.fromFileName(str3), str, str, null, null, null, null, null, false, null, null, null, null, null), this.$navigator);
    }
}
