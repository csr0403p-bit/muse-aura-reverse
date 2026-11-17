package com.facebook.aura.appupdate;

import X.AnonymousClass005;
import X.C7384Etj;
import X.C7438Evz;
import android.content.Context;
import android.view.View;
import com.facebook.aura.common.url.PlayStoreListingKt;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraPlayUpdatePrompts {
    public static final int $stable = 8;
    public final Context context;
    public final String fallbackButton;
    public final String fallbackTitle;
    public final String readyTitle;
    public final String restartButton;

    /* renamed from: com.facebook.aura.appupdate.AuraPlayUpdatePrompts$showPlayStore$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, AuraPlayUpdatePrompts.class, "openPlayStore", "openPlayStore()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuraPlayUpdatePrompts) this.receiver).openPlayStore();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final void showUpdateReady(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        showToast(this.readyTitle, this.restartButton, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStore() {
        PlayStoreListingKt.openPlayStoreListing(this.context, "com.facebook.aura");
    }

    private final void showToast(String str, String str2, final Function0<Unit> function0) {
        ToastApi.INSTANCE.showToast(new AuraToast.ToastArgs(str, null, AuraToast.Duration.CUSTOMIZED, null, new AuraToastOption.Button(str2, null, false, true), new View.OnClickListener() { // from class: com.facebook.aura.appupdate.AuraPlayUpdatePrompts.showToast.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function0.invoke();
            }
        }, true, null, AuraThemeMode.DEFAULT, 15000, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
    }

    public final void showPlayStore() {
        showToast(this.fallbackTitle, this.fallbackButton, new AnonymousClass1(this));
    }

    public AuraPlayUpdatePrompts(Context context, String str, String str2, String str3, String str4) {
        AnonymousClass005.A17(context, str, str2, str3, str4);
        this.context = context;
        this.readyTitle = str;
        this.restartButton = str2;
        this.fallbackTitle = str3;
        this.fallbackButton = str4;
    }
}
