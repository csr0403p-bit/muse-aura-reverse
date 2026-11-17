package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.channels.ChannelApp;
import com.facebook.aura.channels.ChannelAppLauncherKt;
import com.facebook.aura.common.url.PlayStoreListingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppUpdateNoteKt$WhatsAppUpdateNote$text$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppUpdateNoteKt$WhatsAppUpdateNote$text$1$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchClientCvmEventLogger.INSTANCE.logWhatsAppUpdateClick();
        Context context = this.$context;
        ChannelApp channelApp = ChannelApp.WHATSAPP;
        String strInstalledChannelPackage = ChannelAppLauncherKt.installedChannelPackage(context, channelApp);
        if (strInstalledChannelPackage == null) {
            strInstalledChannelPackage = (String) AbstractC0878AGe.A0F(channelApp.getPackageNames());
        }
        if (PlayStoreListingKt.openPlayStoreListing(context, strInstalledChannelPackage)) {
            return;
        }
        AuraBrowserLauncherKt.openBrowser(channelApp.getWebUrl(), this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
