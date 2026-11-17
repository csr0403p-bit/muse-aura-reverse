package com.facebook.aura.notifications.attention;

import X.Ab3;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C10571Hud;
import X.C3cG;
import X.C7380Etd;
import X.C7384Etj;
import X.EG6;
import X.FGI;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.facebook.aura.R;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class AttentionNotifications {
    public static final String ACTION_REQUIRED_CHANNEL = "aura_action_required";
    public static final String APPROVAL_TAG = "aura_approval";
    public static final String EXTRA_OPENED_APPROVAL_NOTIFICATION_ID = "aura_opened_approval_notification_id";
    public static final int GLYPH_COLOR = -1728052215;
    public static final String LEGACY_APPROVALS_CHANNEL = "aura_approvals";
    public static final int MAX_ALERTED_APPROVALS = 100;
    public static final int NEEDS_YOU_COLOR = -1535732;
    public static final String SUGGESTIONS_CHANNEL = "aura_approval_suggestions";
    public static final float TILE_CORNER_FRACTION = 0.27272728f;
    public static final float TILE_GLYPH_FRACTION = 0.6363636f;
    public static final AttentionNotifications INSTANCE = new AttentionNotifications();
    public static final LinkedHashSet<String> alertedApprovalIds = C3cG.A0k();

    public final int approvalNotificationId(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("aura_approval:", str).hashCode();
    }

    public final EG6 builder(Context context, boolean z, String str, String str2, String str3, PendingIntent pendingIntent, String str4, int i, Bitmap bitmap) {
        AnonymousClass005.A11(context, str, str2, 0);
        ensureChannels(context);
        EG6 eg6 = new EG6(context, z ? ACTION_REQUIRED_CHANNEL : SUGGESTIONS_CHANNEL);
        eg6.A03(i);
        eg6.A08(str2);
        eg6.A0I = z ? HatchNodeCardJsonKt.TYPE_REMINDER : "recommendation";
        eg6.A04 = z ? 1 : 0;
        eg6.A0K = str;
        eg6.A07.flags |= 8;
        eg6.A02();
        if (bitmap != null) {
            eg6.A05(bitmap);
        }
        if (str3 != null) {
            eg6.A07(str3);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A00 = EG6.A00(str3);
            eg6.A06(notificationCompat$BigTextStyle);
        }
        if (pendingIntent != null) {
            eg6.A09 = pendingIntent;
            if (str4 != null) {
                eg6.A04(pendingIntent, str4, 0);
            }
        }
        return eg6;
    }

    public final Intent cancelApprovalOnOpen(Intent intent, int i) {
        C7384Etj.A0Y(intent, 0);
        Intent intentPutExtra = intent.putExtra(EXTRA_OPENED_APPROVAL_NOTIFICATION_ID, i);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    public final boolean claimApprovalAlert(String str) {
        C7384Etj.A0Y(str, 0);
        LinkedHashSet<String> linkedHashSet = alertedApprovalIds;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.add(str)) {
                return false;
            }
            if (linkedHashSet.size() > 100) {
                linkedHashSet.remove(AbstractC0878AGe.A0B(linkedHashSet));
            }
            return true;
        }
    }

    public final void ensureChannels(Context context) {
        C7384Etj.A0Y(context, 0);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            if (notificationManager.getNotificationChannel(ACTION_REQUIRED_CHANNEL) == null) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(LEGACY_APPROVALS_CHANNEL);
                int importance = notificationChannel != null ? notificationChannel.getImportance() : 4;
                notificationManager.deleteNotificationChannel(LEGACY_APPROVALS_CHANNEL);
                String string = context.getString(R.string._name_removed__res_0x7f120d2a);
                if (importance > 4) {
                    importance = 4;
                }
                NotificationChannel notificationChannel2 = new NotificationChannel(ACTION_REQUIRED_CHANNEL, string, importance);
                notificationChannel2.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel2);
            }
            if (notificationManager.getNotificationChannel(SUGGESTIONS_CHANNEL) == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(SUGGESTIONS_CHANNEL, context.getString(R.string._name_removed__res_0x7f120d2f), 3));
            }
        }
    }

    public final boolean isActionRequiredChannelEnabled(Context context) {
        NotificationChannel notificationChannel;
        C7384Etj.A0Y(context, 0);
        ensureChannels(context);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        boolean z = false;
        if (notificationManager != null && (notificationChannel = notificationManager.getNotificationChannel(ACTION_REQUIRED_CHANNEL)) != null && notificationChannel.getImportance() == 0) {
            z = true;
        }
        return !z;
    }

    public final void releaseApprovalAlert(String str) {
        C7384Etj.A0Y(str, 0);
        LinkedHashSet<String> linkedHashSet = alertedApprovalIds;
        synchronized (linkedHashSet) {
            linkedHashSet.remove(str);
        }
    }

    public static /* synthetic */ EG6 builder$default(AttentionNotifications attentionNotifications, Context context, boolean z, String str, String str2, String str3, PendingIntent pendingIntent, String str4, int i, Bitmap bitmap, int i2, Object obj) {
        if ((i2 & 128) != 0) {
            i = R.drawable.hatch_notification_icon;
        }
        if ((i2 & 256) != 0) {
            bitmap = null;
        }
        return attentionNotifications.builder(context, z, str, str2, str3, pendingIntent, str4, i, bitmap);
    }

    public static /* synthetic */ Bitmap iconTile$default(AttentionNotifications attentionNotifications, Context context, int i, Integer num, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            f = 0.6363636f;
        }
        return attentionNotifications.iconTile(context, i, num, f);
    }

    public final void forgetApprovalAlerts() {
        LinkedHashSet<String> linkedHashSet = alertedApprovalIds;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    private final Bitmap iconTile(Context context, Drawable drawable, float f) throws Resources.NotFoundException {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f2 = dimensionPixelSize;
        float f3 = 0.27272728f * f2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        Path path = new Path();
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(-1);
        int iA01 = Ab3.A01((f2 * (1.0f - f)) / 2.0f);
        int i = dimensionPixelSize - iA01;
        drawable.setBounds(iA01, iA01, i, i);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void cancelOpenedApproval(Context context, Intent intent) {
        boolean zA1b = AnonymousClass004.A1b(context, intent);
        if (intent.hasExtra(EXTRA_OPENED_APPROVAL_NOTIFICATION_ID)) {
            C7380Etd c7380Etd = new C7380Etd(context);
            c7380Etd.A00.cancel(APPROVAL_TAG, intent.getIntExtra(EXTRA_OPENED_APPROVAL_NOTIFICATION_ID, zA1b ? 1 : 0));
            intent.removeExtra(EXTRA_OPENED_APPROVAL_NOTIFICATION_ID);
        }
    }

    public final boolean isShowing(Context context, String str, int i) {
        Object objA0s;
        AnonymousClass003.A0u(context, str);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return false;
        }
        try {
            objA0s = notificationManager.getActiveNotifications();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objA0s;
        if (statusBarNotificationArr == null) {
            return false;
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if (str.equals(statusBarNotification.getTag()) && statusBarNotification.getId() == i) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap iconTile(Context context, Bitmap bitmap) {
        AnonymousClass003.A0u(context, bitmap);
        return iconTile(context, new BitmapDrawable(context.getResources(), bitmap), 1.0f);
    }

    public final Bitmap iconTile(Context context, int i, Integer num, float f) {
        Drawable drawableMutate;
        C7384Etj.A0Y(context, 0);
        Drawable drawable = context.getDrawable(i);
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            if (num != null) {
                drawableMutate.setTint(num.intValue());
            }
            return iconTile(context, drawableMutate, f);
        }
        return null;
    }
}
