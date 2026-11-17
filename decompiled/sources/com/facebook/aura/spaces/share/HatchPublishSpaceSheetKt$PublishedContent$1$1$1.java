package com.facebook.aura.spaces.share;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C0fG;
import android.view.View;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPublishSpaceSheetKt$PublishedContent$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ String $copiedMessage;
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ String $url;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$PublishedContent$1$1$1(C0fG c0fG, String str, View view, String str2, String str3) {
        super(0);
        this.$clipboardManager = c0fG;
        this.$url = str;
        this.$view = view;
        this.$copiedMessage = str2;
        this.$spaceId = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SPACES, HatchSubsurface.PUBLISH_SHEET, HatchScreen.PUBLISH_SUCCESS, HatchComponent.PUBLISH_COPY_URL_BUTTON, null, AIW.A0K(AnonymousClass007.A0i(this.$spaceId)), null);
        C0fG.A00(this.$clipboardManager, this.$url);
        AuraToast auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$view, this.$copiedMessage, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        if (auraToastM3114makeKDArT4I != null) {
            auraToastM3114makeKDArT4I.show();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
