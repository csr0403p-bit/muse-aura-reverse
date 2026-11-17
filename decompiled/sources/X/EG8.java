package X;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import androidx.core.app.NotificationCompat$InboxStyle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.app.NotificationCompat$ProgressStyle;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class EG8 {
    public EG6 A00;
    public CharSequence A01;
    public CharSequence A02;
    public boolean A03 = false;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EG8 A01(android.app.Notification r4) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EG8.A01(android.app.Notification):X.EG8");
    }

    public void A03(Bundle bundle) {
        String str;
        if (this.A03) {
            bundle.putCharSequence("android.summaryText", this.A02);
        }
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        if (this instanceof NotificationCompat$ProgressStyle) {
            str = "androidx.core.app.NotificationCompat$ProgressStyle";
        } else if (this instanceof NotificationCompat$MessagingStyle) {
            str = "androidx.core.app.NotificationCompat$MessagingStyle";
        } else if (this instanceof NotificationCompat$InboxStyle) {
            str = "androidx.core.app.NotificationCompat$InboxStyle";
        } else if (this instanceof NotificationCompat$DecoratedCustomViewStyle) {
            str = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        } else if (this instanceof NotificationCompat$CallStyle) {
            str = "androidx.core.app.NotificationCompat$CallStyle";
        } else if (this instanceof NotificationCompat$BigTextStyle) {
            str = "androidx.core.app.NotificationCompat$BigTextStyle";
        } else if (!(this instanceof NotificationCompat$BigPictureStyle)) {
            return;
        } else {
            str = "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
    }

    public void A04(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.A02 = bundle.getCharSequence("android.summaryText");
            this.A03 = true;
        }
        this.A01 = bundle.getCharSequence("android.title.big");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Notification$DecoratedCustomViewStyle] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.app.Notification$Style] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.app.Notification$MediaStyle] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.app.Notification$Builder] */
    public void A05(EG2 eg2) {
        ?? r3;
        ?? decoratedCustomViewStyle;
        if (this instanceof EGG) {
            EGG egg = (EGG) this;
            r3 = ((EG5) eg2).A01;
            decoratedCustomViewStyle = new Notification.MediaStyle();
            int[] iArr = egg.A01;
            MediaSessionCompat$Token mediaSessionCompat$Token = egg.A00;
            if (iArr != null) {
                decoratedCustomViewStyle.setShowActionsInCompactView(iArr);
            }
            if (mediaSessionCompat$Token != null) {
                decoratedCustomViewStyle.setMediaSession((MediaSession.Token) mediaSessionCompat$Token.A02);
            }
        } else {
            if (this instanceof NotificationCompat$MessagingStyle) {
                NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = (NotificationCompat$MessagingStyle) this;
                EG6 eg6 = ((EG8) notificationCompat$MessagingStyle).A00;
                boolean zBooleanValue = false;
                if (eg6 == null || eg6.A0A.getApplicationInfo().targetSdkVersion >= 28 || notificationCompat$MessagingStyle.A01 != null) {
                    Boolean bool = notificationCompat$MessagingStyle.A01;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                } else if (notificationCompat$MessagingStyle.A02 != null) {
                    zBooleanValue = true;
                }
                notificationCompat$MessagingStyle.A01 = Boolean.valueOf(zBooleanValue);
                Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(EFw.A00(notificationCompat$MessagingStyle.A00));
                for (EFz eFz : notificationCompat$MessagingStyle.A04) {
                    EFx eFx = eFz.A04;
                    Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(eFz.A05, eFz.A03, eFx != null ? EFw.A00(eFx) : null);
                    String str = eFz.A02;
                    if (str != null) {
                        message.setData(str, eFz.A00);
                    }
                    messagingStyle.addMessage(message);
                }
                for (EFz eFz2 : notificationCompat$MessagingStyle.A03) {
                    EFx eFx2 = eFz2.A04;
                    Notification.MessagingStyle.Message message2 = new Notification.MessagingStyle.Message(eFz2.A05, eFz2.A03, eFx2 != null ? EFw.A00(eFx2) : null);
                    String str2 = eFz2.A02;
                    if (str2 != null) {
                        message2.setData(str2, eFz2.A00);
                    }
                    messagingStyle.addHistoricMessage(message2);
                }
                messagingStyle.setConversationTitle(notificationCompat$MessagingStyle.A02);
                messagingStyle.setGroupConversation(notificationCompat$MessagingStyle.A01.booleanValue());
                messagingStyle.setBuilder(((EG5) eg2).A01);
                return;
            }
            if (this instanceof NotificationCompat$InboxStyle) {
                NotificationCompat$InboxStyle notificationCompat$InboxStyle = (NotificationCompat$InboxStyle) this;
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((EG5) eg2).A01).setBigContentTitle(notificationCompat$InboxStyle.A01);
                if (notificationCompat$InboxStyle.A03) {
                    bigContentTitle.setSummaryText(notificationCompat$InboxStyle.A02);
                }
                Iterator<CharSequence> it = notificationCompat$InboxStyle.A00.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
                return;
            }
            if (!(this instanceof NotificationCompat$DecoratedCustomViewStyle)) {
                NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = (NotificationCompat$BigTextStyle) this;
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((EG5) eg2).A01).setBigContentTitle(notificationCompat$BigTextStyle.A01).bigText(notificationCompat$BigTextStyle.A00);
                if (notificationCompat$BigTextStyle.A03) {
                    bigTextStyleBigText.setSummaryText(notificationCompat$BigTextStyle.A02);
                    return;
                }
                return;
            }
            r3 = ((EG5) eg2).A01;
            decoratedCustomViewStyle = new Notification.DecoratedCustomViewStyle();
        }
        r3.setStyle(decoratedCustomViewStyle);
    }
}
