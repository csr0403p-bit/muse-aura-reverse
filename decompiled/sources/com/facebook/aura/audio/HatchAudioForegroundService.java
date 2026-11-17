package com.facebook.aura.audio;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.C7502EyJ;
import X.EG6;
import X.EGD;
import X.EGG;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.facebook.aura.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class HatchAudioForegroundService extends Service {
    public static final int $stable = 8;
    public static final int ACTION_INDEX_PLAY_PAUSE = 0;
    public static final int ACTION_INDEX_STOP = 1;
    public static final String ACTION_PAUSE = "com.facebook.aura.audio.PAUSE";
    public static final String ACTION_PLAY = "com.facebook.aura.audio.PLAY";
    public static final String ACTION_STOP = "com.facebook.aura.audio.STOP";
    public static final String CHANNEL_ID = "aura_audio_playback";
    public static final Companion Companion = new Companion();
    public static final String EXTRA_ARTIST = "artist";
    public static final String EXTRA_TITLE = "title";
    public static final int NOTIFICATION_ID = 9002;

    public final class Companion {
        public final void start(Context context, String str, String str2) {
            C7384Etj.A0Y(context, 0);
            C7384Etj.A0Y(str, 1);
            C7384Etj.A0Y(str2, 2);
            Intent intent = new Intent(context, (Class<?>) HatchAudioForegroundService.class);
            intent.putExtra("title", str);
            intent.putExtra(HatchAudioForegroundService.EXTRA_ARTIST, str2);
            try {
                context.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException unused) {
            }
        }

        public final void stop(Context context) {
            C7384Etj.A0Y(context, 0);
            context.stopService(new Intent(context, (Class<?>) HatchAudioForegroundService.class));
        }

        public static /* synthetic */ Notification buildNotification$default(Companion companion, Context context, String str, String str2, boolean z, MediaSessionCompat$Token mediaSessionCompat$Token, Bitmap bitmap, int i, Object obj) {
            if ((i & 32) != 0) {
                bitmap = null;
            }
            return companion.buildNotification(context, str, str2, z, mediaSessionCompat$Token, bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ensureChannel(Context context) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager == null || notificationManager.getNotificationChannel(HatchAudioForegroundService.CHANNEL_ID) != null) {
                return;
            }
            notificationManager.createNotificationChannel(new NotificationChannel(HatchAudioForegroundService.CHANNEL_ID, context.getString(R.string._name_removed__res_0x7f1201be), 2));
        }

        public static /* synthetic */ void updateNotification$default(Companion companion, Context context, String str, String str2, boolean z, MediaSessionCompat$Token mediaSessionCompat$Token, Bitmap bitmap, int i, Object obj) {
            if ((i & 32) != 0) {
                bitmap = null;
            }
            companion.updateNotification(context, str, str2, z, mediaSessionCompat$Token, bitmap);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final Notification buildNotification(Context context, String str, String str2, boolean z, MediaSessionCompat$Token mediaSessionCompat$Token, Bitmap bitmap) {
            int i;
            String string;
            String str3;
            ensureChannel(context);
            if (z) {
                i = R.drawable.ic_playback_pause;
                string = context.getString(R.string._name_removed__res_0x7f120db0);
                str3 = HatchAudioForegroundService.ACTION_PAUSE;
            } else {
                i = R.drawable.ic_playback_play;
                string = context.getString(R.string._name_removed__res_0x7f120e6c);
                str3 = HatchAudioForegroundService.ACTION_PLAY;
            }
            EGD egdA00 = new C7502EyJ(mediaActionIntent(context, str3), string, i).A00();
            EGD egdA002 = new C7502EyJ(mediaActionIntent(context, HatchAudioForegroundService.ACTION_STOP), context.getString(R.string._name_removed__res_0x7f1201c7), R.drawable.aura_nav_close_20).A00();
            EG6 eg6 = new EG6(context, HatchAudioForegroundService.CHANNEL_ID);
            eg6.A08(str);
            eg6.A07(str2);
            eg6.A03(R.drawable.audio_outline_24_wght400);
            eg6.A05(bitmap);
            eg6.A09 = launchAppIntent(context);
            eg6.A07.flags |= 2;
            EGG egg = new EGG();
            egg.A00 = mediaSessionCompat$Token;
            egg.A01 = new int[]{0, 1};
            eg6.A06(egg);
            ArrayList<EGD> arrayList = eg6.A0M;
            arrayList.add(egdA00);
            arrayList.add(egdA002);
            eg6.A0T = true;
            Notification notificationA01 = eg6.A01();
            C7384Etj.A0U(notificationA01);
            return notificationA01;
        }

        private final PendingIntent launchAppIntent(Context context) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return null;
            }
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
        }

        private final PendingIntent mediaActionIntent(Context context, String str) {
            PendingIntent service = PendingIntent.getService(context, str.hashCode(), new Intent(context, (Class<?>) HatchAudioForegroundService.class).setAction(str), 201326592);
            C7384Etj.A0U(service);
            return service;
        }

        public final void updateNotification(Context context, String str, String str2, boolean z, MediaSessionCompat$Token mediaSessionCompat$Token, Bitmap bitmap) {
            AnonymousClass005.A0x(context, str, str2);
            C7384Etj.A0Y(mediaSessionCompat$Token, 4);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify(HatchAudioForegroundService.NOTIFICATION_ID, buildNotification(context, str, str2, z, mediaSessionCompat$Token, bitmap));
            }
        }

        public Companion() {
        }
    }

    private final HatchAudioPlayerRepository getPlayerRepository() {
        return HatchAudioPlayerRepository.activeInstance;
    }

    private final void startForegroundPlaceholder() {
        Companion.ensureChannel(this);
        EG6 eg6 = new EG6(this, CHANNEL_ID);
        eg6.A03(R.drawable.audio_outline_24_wght400);
        eg6.A0T = true;
        startForeground(NOTIFICATION_ID, eg6.A01());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r14, int r15, int r16) {
        /*
            r13 = this;
            com.facebook.aura.audio.HatchAudioPlayerRepository r1 = com.facebook.aura.audio.HatchAudioPlayerRepository.activeInstance
            r11 = 0
            if (r1 == 0) goto L5e
            android.support.v4.media.session.MediaSessionCompat$Token r10 = r1.getSessionToken()
            X.1BN<com.facebook.aura.audio.HatchAudioPlaybackState> r0 = r1.playbackState
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.audio.HatchAudioPlaybackState r2 = (com.facebook.aura.audio.HatchAudioPlaybackState) r2
        L13:
            r4 = 2
            r6 = r13
            if (r1 == 0) goto L79
            if (r10 == 0) goto L79
            if (r2 == 0) goto L79
            com.facebook.aura.audio.HatchAudioForegroundService$Companion r5 = com.facebook.aura.audio.HatchAudioForegroundService.Companion
            com.facebook.aura.audio.HatchAudioItem r0 = r2.item
            java.lang.String r7 = r0.title
            java.lang.String r8 = r0.artist
            com.facebook.aura.audio.AudioStatus r2 = r2.status
            com.facebook.aura.audio.AudioStatus r0 = com.facebook.aura.audio.AudioStatus.PLAYING
            boolean r9 = X.AnonymousClass002.A1Z(r2, r0)
            r12 = 32
            r13 = r11
            android.app.Notification r2 = com.facebook.aura.audio.HatchAudioForegroundService.Companion.buildNotification$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 9002(0x232a, float:1.2614E-41)
            r6.startForeground(r0, r2)
            if (r14 == 0) goto L5d
            java.lang.String r3 = r14.getAction()
            if (r3 == 0) goto L5d
            int r2 = r3.hashCode()
            r0 = -603806290(0xffffffffdc02a5ae, float:-1.47095655E17)
            if (r2 == r0) goto L6d
            r0 = -573656996(0xffffffffddceb05c, float:-1.86168814E18)
            if (r2 == r0) goto L61
            r0 = -573559510(0xffffffffddd02d2a, float:-1.87508651E18)
            if (r2 != r0) goto L7c
            java.lang.String r0 = "com.facebook.aura.audio.STOP"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7c
            r1.stop()
        L5d:
            return r4
        L5e:
            r10 = r11
        L5f:
            r2 = r11
            goto L13
        L61:
            java.lang.String r0 = "com.facebook.aura.audio.PLAY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7c
            r1.resume()
            return r4
        L6d:
            java.lang.String r0 = "com.facebook.aura.audio.PAUSE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7c
            r1.pause()
            return r4
        L79:
            r13.startForegroundPlaceholder()
        L7c:
            r6.stopSelf()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.HatchAudioForegroundService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
