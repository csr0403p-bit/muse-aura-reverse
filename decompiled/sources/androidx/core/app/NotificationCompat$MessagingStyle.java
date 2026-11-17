package androidx.core.app;

import X.C3cG;
import X.C60O;
import X.EFx;
import X.EFz;
import X.EG8;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes5.dex */
public final class NotificationCompat$MessagingStyle extends EG8 {
    public EFx A00;
    public Boolean A01;
    public CharSequence A02;
    public final List<EFz> A04 = C3cG.A0h();
    public final List<EFz> A03 = C3cG.A0h();

    public final void A06(EFz eFz) {
        if (eFz != null) {
            List<EFz> list = this.A04;
            list.add(eFz);
            if (list.size() > 25) {
                list.remove(0);
            }
        }
    }

    public NotificationCompat$MessagingStyle(EFx eFx) {
        if (TextUtils.isEmpty(eFx.A01)) {
            throw C60O.A0i("User's name must not be empty.");
        }
        this.A00 = eFx;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    @Override // X.EG8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A03(android.os.Bundle):void");
    }

    @Override // X.EG8
    public final void A04(Bundle bundle) {
        super.A04(bundle);
        List<EFz> list = this.A04;
        list.clear();
        this.A00 = bundle.containsKey("android.messagingStyleUser") ? EFx.A00(bundle.getBundle("android.messagingStyleUser")) : new EFx(null, bundle.getString("android.selfDisplayName"), null, null, false, false);
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.A02 = charSequence;
        if (charSequence == null) {
            this.A02 = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(EFz.A00(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.A03.addAll(EFz.A00(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.A01 = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public NotificationCompat$MessagingStyle() {
    }
}
