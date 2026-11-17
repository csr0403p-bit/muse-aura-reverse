package X;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;

/* renamed from: X.Cac, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC3630Cac extends Handler {
    public final ComponentName A00;
    public final /* synthetic */ Cad A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3630Cac(ComponentName componentName, Looper looper, Cad cad) {
        super(looper);
        this.A01 = cad;
        this.A00 = componentName;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null) {
            Cad cad = this.A01;
            Object systemService = cad.getApplicationContext().getSystemService("appops");
            try {
                systemService.getClass();
                ((AppOpsManager) systemService).checkPackage(message.sendingUid, AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
                int i = message.what;
                if (i != 1) {
                    if (i == 2 || i == 4) {
                        return;
                    }
                    CFK.A0F("GcmTaskService", "Unrecognized message received: %s", message);
                    return;
                }
                Bundle data = message.getData();
                Messenger messenger = message.replyTo;
                String string = data.getString("tag");
                if (messenger == null || string == null) {
                    return;
                }
                Cae caeA00 = Cad.A00(data.getBundle("extras"), cad, new CZh(this.A00, messenger, string), string);
                if (caeA00 != null) {
                    caeA00.A01();
                }
            } catch (SecurityException e) {
                CFK.A08("GcmTaskService", "Message was not sent from GCM.", e);
            }
        }
    }
}
