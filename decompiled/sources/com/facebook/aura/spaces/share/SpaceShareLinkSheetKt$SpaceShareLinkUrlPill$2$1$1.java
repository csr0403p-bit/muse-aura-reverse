package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.C0fG;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ MutableState<Boolean> $copied$delegate;
    public final /* synthetic */ String $copiedMessage;
    public final /* synthetic */ String $url;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$2$1$1(C0fG c0fG, String str, View view, String str2, MutableState<Boolean> mutableState) {
        super(0);
        this.$clipboardManager = c0fG;
        this.$url = str;
        this.$view = view;
        this.$copiedMessage = str2;
        this.$copied$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraToast auraToastM3114makeKDArT4I;
        C0fG.A00(this.$clipboardManager, this.$url);
        MutableState<Boolean> mutableState = this.$copied$delegate;
        long j = SpaceShareLinkSheetKt.COPIED_CHECK_MS;
        MutableState.A09(true, mutableState);
        if (Build.VERSION.SDK_INT >= 33 || (auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$view, this.$copiedMessage, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null)) == null) {
            return;
        }
        auraToastM3114makeKDArT4I.show();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
