package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C7BY;
import X.CFK;
import X.FGI;
import X.HxE;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt;

/* loaded from: classes.dex */
public final class HatchPariscopeLauncher {
    public static final int $stable = 0;
    public static final HatchPariscopeLauncher INSTANCE = new HatchPariscopeLauncher();
    public static final String TAG = "HatchPariscopeLauncher";

    private final String hostOrNull(String str) {
        Object c10571Hud;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        try {
            c10571Hud = Uri.parse(str);
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        if (c10571Hud instanceof C10571Hud) {
            c10571Hud = null;
        }
        Uri uri = (Uri) c10571Hud;
        if (uri == null || "about".equals(uri.getScheme())) {
            return null;
        }
        return uri.getHost();
    }

    private final HxE<String, String> currentHatchEnvironmentContext(AbstractC3358CGz abstractC3358CGz) {
        String strA0M;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        HatchGatewayPrefsStore companion2 = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
        String str = companion.currentWsUrl;
        String strHatchEnvironmentName = hatchEnvironmentName(str);
        if (strHatchEnvironmentName != null) {
            String strHostOrNull = INSTANCE.hostOrNull(str);
            if (strHostOrNull == null) {
                strHostOrNull = "<nil>";
            }
            strA0M = FGI.A0M("live_gateway:", strHostOrNull);
        } else {
            strHatchEnvironmentName = hatchEnvironmentName(companion2.getGatewayUrl());
            if (strHatchEnvironmentName != null) {
                strA0M = "stored_gateway";
            } else {
                strHatchEnvironmentName = companion2.getHatcheryVMId();
                if (strHatchEnvironmentName == null || C7BY.A0j(strHatchEnvironmentName)) {
                    return null;
                }
                strA0M = "stored_hatchery_vm_id";
            }
        }
        return new HxE<>(strHatchEnvironmentName, strA0M);
    }

    public final void copyLinkToClipboard(AbstractC3358CGz abstractC3358CGz, String str, Context context) {
        ClipboardManager clipboardManager;
        AnonymousClass005.A0x(abstractC3358CGz, str, context);
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        HatchGatewayPrefsStore companion2 = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
        String strHostOrNull = hostOrNull(companion.currentWsUrl);
        if (strHostOrNull == null) {
            strHostOrNull = "<nil>";
        }
        String gatewayUrl = companion2.getGatewayUrl();
        if (C7BY.A0j(gatewayUrl)) {
            gatewayUrl = null;
        }
        String hatcheryVMId = companion2.getHatcheryVMId();
        if (hatcheryVMId == null || C7BY.A0j(hatcheryVMId)) {
            hatcheryVMId = null;
        }
        String str2 = gatewayUrl;
        if (gatewayUrl == null) {
            str2 = "<nil>";
        }
        String str3 = hatcheryVMId;
        if (hatcheryVMId == null) {
            str3 = "<nil>";
        }
        CFK.A05(TAG, FGI.A0l("Pariscope copy requested messageId=", str, " liveGatewayHost=", strHostOrNull, " storedGatewayUrl=", str2, " storedHatcheryVMId=", str3));
        HxE<String, String> hxECurrentHatchEnvironmentContext = currentHatchEnvironmentContext(abstractC3358CGz);
        if (hxECurrentHatchEnvironmentContext == null) {
            if (gatewayUrl == null) {
                gatewayUrl = "<nil>";
            }
            CFK.A06(TAG, FGI.A0j("Pariscope copy failed: missing gateway environment liveGatewayHost=", strHostOrNull, " storedGatewayUrl=", gatewayUrl, " storedHatcheryVMId=", hatcheryVMId != null ? hatcheryVMId : "<nil>"));
            return;
        }
        Uri uriBuild = Uri.parse("https://www.pariscope.dev/hatchery").buildUpon().appendQueryParameter("hatch", hxECurrentHatchEnvironmentContext.first).appendQueryParameter("message_id", str).appendQueryParameter("view", UnifiedArtifactsRepositoryKt.COLLECTION_ALL).appendQueryParameter(PhotosSearchHandlerKt.PARAM_SOURCE, "inference").build();
        String str4 = hxECurrentHatchEnvironmentContext.second;
        StringBuilder sb = new StringBuilder("Pariscope copying url=");
        sb.append(uriBuild);
        CFK.A05(TAG, AnonymousClass006.A0y(str4, " envSource=", sb));
        Object systemService = context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Pariscope", uriBuild.toString()));
    }

    private final String hatchEnvironmentName(String str) {
        String strHostOrNull = hostOrNull(str);
        if (strHostOrNull != null) {
            String strA0S = C7BY.A0S(strHostOrNull, strHostOrNull, '.');
            if (!C7BY.A0j(strA0S)) {
                return strA0S;
            }
        }
        return null;
    }
}
