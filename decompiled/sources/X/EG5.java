package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.aura.R;
import com.facebook.aura.notifications.push.NotificationReplyReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EG5 implements EG2 {
    public int A00;
    public final Notification.Builder A01;
    public final Context A02;
    public final EG6 A03;
    public final Bundle A04 = BV6.A0N();

    public EG5(EG6 eg6) {
        Bundle[] bundleArr;
        int i;
        EGD egdA00;
        this.A03 = eg6;
        Context context = eg6.A0A;
        this.A02 = context;
        Notification.Builder builder = new Notification.Builder(context, eg6.A0J);
        this.A01 = builder;
        Notification notification = eg6.A07;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing(AnonymousClass002.A1L(notification.flags & 2)).setOnlyAlertOnce(AnonymousClass002.A1L(notification.flags & 8)).setAutoCancel(AnonymousClass002.A1L(notification.flags & 16)).setDefaults(notification.defaults).setContentTitle(eg6.A0G).setContentText(eg6.A0F).setContentInfo(eg6.A0E).setContentIntent(eg6.A09).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, AnonymousClass002.A1L(notification.flags & 128)).setNumber(eg6.A03).setProgress(0, 0, false);
        Notification.Builder builder2 = this.A01;
        IconCompat iconCompat = eg6.A0D;
        builder2.setLargeIcon(iconCompat == null ? null : EFo.A00(context, iconCompat));
        this.A01.setSubText(eg6.A0H).setUsesChronometer(eg6.A0U).setPriority(eg6.A04);
        EG8 eg8 = eg6.A0C;
        if (eg8 instanceof NotificationCompat$CallStyle) {
            NotificationCompat$CallStyle notificationCompat$CallStyle = (NotificationCompat$CallStyle) eg8;
            PendingIntent pendingIntent = notificationCompat$CallStyle.A02;
            EGD egdA002 = pendingIntent == null ? NotificationCompat$CallStyle.A00(notificationCompat$CallStyle.A03, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, R.string._name_removed__res_0x7f1206c7, R.color._name_removed__res_0x7f06001b) : NotificationCompat$CallStyle.A00(pendingIntent, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, R.string._name_removed__res_0x7f1206c6, R.color._name_removed__res_0x7f06001b);
            PendingIntent pendingIntent2 = notificationCompat$CallStyle.A01;
            if (pendingIntent2 == null) {
                egdA00 = null;
            } else {
                boolean z = notificationCompat$CallStyle.A07;
                int i2 = R.drawable.ic_call_answer;
                int i3 = R.string._name_removed__res_0x7f1206c4;
                if (z) {
                    i2 = R.drawable.ic_call_answer_video;
                    i3 = R.string._name_removed__res_0x7f1206c5;
                }
                egdA00 = NotificationCompat$CallStyle.A00(pendingIntent2, notificationCompat$CallStyle, notificationCompat$CallStyle.A05, i2, i3, R.color._name_removed__res_0x7f06001a);
            }
            ArrayList arrayListA11 = C60O.A11(3);
            arrayListA11.add(egdA002);
            int i4 = 2;
            Iterator<EGD> it = ((EG8) notificationCompat$CallStyle).A00.A0M.iterator();
            while (it.hasNext()) {
                EGD next = it.next();
                if (!next.A04.getBoolean("key_action_priority")) {
                    arrayListA11.add(next);
                    i4--;
                }
                if (egdA00 != null && i4 == 1) {
                    arrayListA11.add(egdA00);
                    i4 = 0;
                }
            }
            if (egdA00 != null && i4 >= 1) {
                arrayListA11.add(egdA00);
            }
            Iterator it2 = arrayListA11.iterator();
            while (it2.hasNext()) {
                A00((EGD) it2.next());
            }
        } else {
            Iterator<EGD> it3 = eg6.A0M.iterator();
            while (it3.hasNext()) {
                A00(it3.next());
            }
        }
        Bundle bundle = eg6.A0B;
        if (bundle != null) {
            this.A04.putAll(bundle);
        }
        this.A01.setShowWhen(eg6.A0S);
        this.A01.setLocalOnly(eg6.A0R);
        this.A01.setGroup(eg6.A0K);
        this.A01.setSortKey(null);
        this.A01.setGroupSummary(eg6.A0Q);
        this.A00 = eg6.A02;
        this.A01.setCategory(eg6.A0I);
        this.A01.setColor(eg6.A00);
        this.A01.setVisibility(eg6.A05);
        this.A01.setPublicVersion(eg6.A08);
        this.A01.setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = eg6.A0O;
        if (!arrayList.isEmpty()) {
            Iterator<String> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                this.A01.addPerson(AnonymousClass005.A0j(it4));
            }
        }
        ArrayList<EGD> arrayList2 = eg6.A0N;
        if (arrayList2.size() > 0) {
            Bundle bundleA0N = eg6.A0B;
            if (bundleA0N == null) {
                bundleA0N = BV6.A0N();
                eg6.A0B = bundleA0N;
            }
            Bundle bundle2 = bundleA0N.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? BV6.A0N() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundleA0N2 = BV6.A0N();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                String string = Integer.toString(i5);
                EGD egd = arrayList2.get(i5);
                Bundle bundleA0N3 = BV6.A0N();
                IconCompat iconCompatA00 = egd.A02;
                if (iconCompatA00 == null && (i = egd.A00) != 0) {
                    iconCompatA00 = IconCompat.A00(null, "", i);
                    egd.A02 = iconCompatA00;
                }
                bundleA0N3.putInt("icon", iconCompatA00 != null ? iconCompatA00.A02() : 0);
                bundleA0N3.putCharSequence("title", egd.A03);
                bundleA0N3.putParcelable("actionIntent", egd.A01);
                Bundle bundle4 = new Bundle(egd.A04);
                bundle4.putBoolean("android.support.allowGeneratedReplies", true);
                bundleA0N3.putBundle("extras", bundle4);
                C7390EuO[] c7390EuOArr = egd.A05;
                if (c7390EuOArr == null) {
                    bundleArr = null;
                } else {
                    int length = c7390EuOArr.length;
                    bundleArr = new Bundle[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        C7390EuO c7390EuO = c7390EuOArr[i6];
                        Bundle bundleA0N4 = BV6.A0N();
                        bundleA0N4.putString("resultKey", NotificationReplyReceiver.KEY_TEXT_REPLY);
                        bundleA0N4.putCharSequence("label", c7390EuO.A01);
                        bundleA0N4.putCharSequenceArray("choices", null);
                        bundleA0N4.putBoolean("allowFreeFormInput", true);
                        bundleA0N4.putBundle("extras", c7390EuO.A00);
                        Set<String> set = c7390EuO.A02;
                        if (!set.isEmpty()) {
                            ArrayList<String> arrayListA112 = C60O.A11(set.size());
                            Iterator<String> it5 = set.iterator();
                            while (it5.hasNext()) {
                                BV6.A1S(arrayListA112, it5);
                            }
                            bundleA0N4.putStringArrayList("allowedDataTypes", arrayListA112);
                        }
                        bundleArr[i6] = bundleA0N4;
                    }
                }
                bundleA0N3.putParcelableArray("remoteInputs", bundleArr);
                bundleA0N3.putBoolean("showsUserInterface", true);
                bundleA0N3.putInt("semanticAction", 0);
                bundleA0N2.putBundle(string, bundleA0N3);
            }
            bundle2.putBundle("invisible_actions", bundleA0N2);
            bundle3.putBundle("invisible_actions", bundleA0N2);
            Bundle bundleA0N5 = eg6.A0B;
            if (bundleA0N5 == null) {
                bundleA0N5 = BV6.A0N();
                eg6.A0B = bundleA0N5;
            }
            bundleA0N5.putBundle("android.car.EXTENSIONS", bundle2);
            this.A04.putBundle("android.car.EXTENSIONS", bundle3);
        }
        this.A01.setExtras(eg6.A0B);
        this.A01.setRemoteInputHistory(null);
        this.A01.setBadgeIconType(0);
        this.A01.setSettingsText(null);
        this.A01.setShortcutId(eg6.A0L);
        this.A01.setTimeoutAfter(eg6.A06);
        this.A01.setGroupAlertBehavior(eg6.A02);
        if (!TextUtils.isEmpty(eg6.A0J)) {
            this.A01.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<EFx> it6 = eg6.A0P.iterator();
        while (it6.hasNext()) {
            this.A01.addPerson(EFw.A00(it6.next()));
        }
        this.A01.setAllowSystemGeneratedContextualActions(true);
        this.A01.setBubbleMetadata(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            if (eg6.A01 != 0) {
                EGJ.A01(this.A01);
            }
            if (i7 >= 36) {
                AbstractC7490Exu.A00(this.A01);
            }
        }
        if (eg6.A0T) {
            if (this.A03.A0Q) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A01.setVibrate(null);
            this.A01.setSound(null);
            int i8 = notification.defaults & (-2);
            notification.defaults = i8;
            int i9 = i8 & (-3);
            notification.defaults = i9;
            this.A01.setDefaults(i9);
            if (TextUtils.isEmpty(this.A03.A0K)) {
                this.A01.setGroup("silent");
            }
            this.A01.setGroupAlertBehavior(this.A00);
        }
    }

    private void A00(EGD egd) {
        int i;
        IconCompat iconCompatA00 = egd.A02;
        if (iconCompatA00 == null && (i = egd.A00) != 0) {
            iconCompatA00 = IconCompat.A00(null, "", i);
            egd.A02 = iconCompatA00;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA00 != null ? EFo.A00(null, iconCompatA00) : null, egd.A03, egd.A01);
        C7390EuO[] c7390EuOArr = egd.A05;
        if (c7390EuOArr != null) {
            for (RemoteInput remoteInput : C7390EuO.A00(c7390EuOArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = new Bundle(egd.A04);
        bundle.putBoolean("android.support.allowGeneratedReplies", true);
        builder.setAllowGeneratedReplies(true);
        bundle.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        builder.setContextual(false);
        if (Build.VERSION.SDK_INT >= 31) {
            EGJ.A00(builder);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", true);
        builder.addExtras(bundle);
        this.A01.addAction(builder.build());
    }
}
