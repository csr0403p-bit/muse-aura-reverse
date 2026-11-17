package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C6t6;
import X.C7384Etj;
import X.G2j;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchShareSheetMCKt;
import com.facebook.aura.spaces.preload.SpacesShareBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SpacesShareBridge $shareBridge;
    public final /* synthetic */ C6t6 $webView;

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator, C6t6 c6t6) {
            super(0);
            this.$navigator = auraNavigator;
            this.$webView = c6t6;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z = false;
            AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(true);
            if (AuraAppLifecycleManager.INSTANCE.isAppInForeground() && this.$webView.isAttachedToWindow() && this.$webView.isShown() && this.$webView.hasWindowFocus() && auraNavKeyCurrentKey != null && !(auraNavKeyCurrentKey instanceof AuraBottomSheetNavKey) && !(auraNavKeyCurrentKey instanceof AuraOverlayNavKey)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<Uri, String, String, String, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AuraNavigator $navigator;

        /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $name;
            public final /* synthetic */ Uri $uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Context context, Uri uri, String str) {
                super(0);
                this.$context = context;
                this.$uri = uri;
                this.$name = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HatchFileActions.INSTANCE.shareLocal(this.$context, new HatchFileRef.Local(this.$uri, this.$name), null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Uri uri, String str, String str2, String str3) {
            AnonymousClass005.A14(uri, str, str2, str3);
            String string = uri.toString();
            C7384Etj.A0U(string);
            HatchShareSheetMCKt.openHatchShareSheetOrElse(this.$navigator, str.startsWith("video/") ? ShareType.VIDEO : ShareType.IMAGE, string, str3, string, null, new HatchShareDownloadTarget.Media(string), null, null, null, null, null, new AnonymousClass1(this.$context, uri, str2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator, Context context) {
            super(4);
            this.$navigator = auraNavigator;
            this.$context = context;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri, String str, String str2, String str3) {
            invoke2(uri, str, str2, str3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1(SpacesShareBridge spacesShareBridge, AuraNavigator auraNavigator, C6t6 c6t6, Context context) {
        super(0);
        this.$shareBridge = spacesShareBridge;
        this.$navigator = auraNavigator;
        this.$webView = c6t6;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpacesShareBridge spacesShareBridge = this.$shareBridge;
        AuraNavigator auraNavigator = this.$navigator;
        spacesShareBridge.canShare = new AnonymousClass1(auraNavigator, this.$webView);
        spacesShareBridge.onShare = new AnonymousClass2(auraNavigator, this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
