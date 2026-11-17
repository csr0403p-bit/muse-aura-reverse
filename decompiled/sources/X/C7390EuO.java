package X;

import android.app.RemoteInput;
import android.os.Bundle;
import com.facebook.aura.notifications.push.NotificationReplyReceiver;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.EuO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7390EuO {
    public final Bundle A00;
    public final CharSequence A01;
    public final Set<String> A02;

    public static RemoteInput[] A00(C7390EuO[] c7390EuOArr) {
        int length = c7390EuOArr.length;
        RemoteInput[] remoteInputArr = new RemoteInput[length];
        for (int i = 0; i < length; i++) {
            C7390EuO c7390EuO = c7390EuOArr[i];
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(NotificationReplyReceiver.KEY_TEXT_REPLY).setLabel(c7390EuO.A01).setChoices(null).setAllowFreeFormInput(true).addExtras(c7390EuO.A00);
            Iterator<String> it = c7390EuO.A02.iterator();
            while (it.hasNext()) {
                builderAddExtras.setAllowDataType(AnonymousClass005.A0j(it), true);
            }
            builderAddExtras.setEditChoicesBeforeSending(0);
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }

    public C7390EuO(Bundle bundle, CharSequence charSequence, Set set) {
        this.A01 = charSequence;
        this.A00 = bundle;
        this.A02 = set;
    }
}
