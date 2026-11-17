package com.facebook.aura.spacesharing.impl;

import X.AbstractC7559F3s;
import X.C0fG;
import android.os.Build;
import android.view.View;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceSharingComponentsKt$SpaceSharingCopyLinkButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ String $copiedMessage;
    public final /* synthetic */ String $url;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSharingComponentsKt$SpaceSharingCopyLinkButton$1$1(String str, C0fG c0fG, View view, String str2) {
        super(0);
        this.$url = str;
        this.$clipboardManager = c0fG;
        this.$view = view;
        this.$copiedMessage = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraToast auraToastM3114makeKDArT4I;
        String str = this.$url;
        if (str != null) {
            C0fG c0fG = this.$clipboardManager;
            View view = this.$view;
            String str2 = this.$copiedMessage;
            C0fG.A00(c0fG, str);
            if (Build.VERSION.SDK_INT >= 33 || (auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(view, str2, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null)) == null) {
                return;
            }
            auraToastM3114makeKDArT4I.show();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
