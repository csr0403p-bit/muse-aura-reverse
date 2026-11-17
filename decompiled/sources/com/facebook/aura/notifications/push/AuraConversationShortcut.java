package com.facebook.aura.notifications.push;

import X.C3cG;
import X.C60N;
import X.C60P;
import X.C7384Etj;
import X.C7Je;
import X.EFo;
import X.EFx;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class AuraConversationShortcut {
    public static final AuraConversationShortcut INSTANCE = new AuraConversationShortcut();
    public static final String SHORTCUT_ID = "hatch_ai_conversation";
    public static EFx publishedPerson;

    public final void invalidate() {
        publishedPerson = null;
    }

    public final void ensureShortcutExists(Context context, EFx eFx) {
        String string;
        Icon iconCreateWithResource;
        Icon iconA00;
        boolean zA1Y = C60P.A1Y(context, eFx);
        if (publishedPerson != eFx) {
            try {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (shortcutManager != null) {
                    CharSequence charSequence = eFx.A01;
                    if (charSequence == null || (string = charSequence.toString()) == null) {
                        string = HatchAppName.value;
                    }
                    IconCompat iconCompat = eFx.A00;
                    if (iconCompat == null || (iconCreateWithResource = EFo.A00(context, iconCompat)) == null) {
                        iconCreateWithResource = Icon.createWithResource(context, R.drawable.hatch_notification_icon);
                        C7384Etj.A0U(iconCreateWithResource);
                    }
                    ShortcutInfo.Builder icon = new ShortcutInfo.Builder(context, SHORTCUT_ID).setLongLived(zA1Y).setShortLabel(string).setIcon(iconCreateWithResource);
                    Intent intentA03 = C60P.A03("android.intent.action.VIEW");
                    Uri uriA01 = null;
                    try {
                        uriA01 = C7Je.A01(C60N.A00(83));
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    intentA03.setData(uriA01);
                    ShortcutInfo.Builder intent = icon.setIntent(intentA03);
                    C7384Etj.A0U(intent);
                    Person.Builder important = new Person.Builder().setName(string).setKey(C60N.A00(84)).setImportant(zA1Y);
                    if (iconCompat != null && (iconA00 = EFo.A00(context, iconCompat)) != null) {
                        important.setIcon(iconA00);
                    }
                    intent.setPerson(important.build());
                    intent.setLocusId(new LocusId(SHORTCUT_ID));
                    if (shortcutManager.addDynamicShortcuts(Collections.singletonList(intent.build()))) {
                        publishedPerson = eFx;
                    } else {
                        C3cG.A1G("Conversation shortcut not published (rate limited), will retry: ", string, AuraConversationShortcutKt.TAG);
                    }
                }
            } catch (Exception e) {
                C3cG.A1G("Failed to publish conversation shortcut: ", e.getMessage(), AuraConversationShortcutKt.TAG);
            }
        }
    }
}
