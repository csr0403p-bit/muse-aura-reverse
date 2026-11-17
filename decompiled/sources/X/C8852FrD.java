package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.FrD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8852FrD {
    public final C8845Fr2 A00;
    public final InterfaceC8858FrW A01;
    public final ArrayList A02 = C3cG.A0h();

    public C8852FrD(Context context) {
        PendingIntent broadcast = null;
        if (context == null) {
            throw C60O.A0i("context must not be null");
        }
        if (TextUtils.isEmpty("HatchAudioPlayer")) {
            throw C60O.A0i("tag must not be null or empty");
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            ComponentName componentName = new ComponentName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name);
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        this.A01 = new C8857FrU(context);
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        C8855FrO c8855FrO = new C8855FrO(this);
        C8853FrI c8853FrI = (C8853FrI) this.A01;
        synchronized (c8853FrI.A08) {
            c8853FrI.A01 = c8855FrO;
            c8853FrI.A04.setCallback(c8855FrO.mCallbackFwk, handler);
            c8855FrO.setSessionImpl(c8853FrI, handler);
        }
        ((C8853FrI) this.A01).A04.setMediaButtonReceiver(broadcast);
        this.A00 = new C8845Fr2(context, ((C8853FrI) this.A01).A07);
    }

    public static void A00(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C8852FrD.class.getClassLoader());
        }
    }

    public final void A01(MediaMetadataCompat mediaMetadataCompat) {
        long jA05;
        CharSequence charSequence;
        Object parcelable;
        C8853FrI c8853FrI = (C8853FrI) this.A01;
        c8853FrI.A00 = mediaMetadataCompat;
        MediaSession mediaSession = c8853FrI.A04;
        MediaMetadata mediaMetadataBuild = mediaMetadataCompat.A00;
        if (mediaMetadataBuild == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = mediaMetadataCompat.A01;
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                Integer num = MediaMetadataCompat.A02.get(strA0j);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue != 0) {
                    if (iIntValue != 1) {
                        if (iIntValue != 2) {
                            if (iIntValue != 3) {
                                parcelable = bundle.get(strA0j);
                                if (parcelable == null || (parcelable instanceof CharSequence)) {
                                    charSequence = (CharSequence) parcelable;
                                } else if (parcelable instanceof Long) {
                                    jA05 = C3cG.A05(parcelable);
                                } else if (!(parcelable instanceof Bitmap)) {
                                    if (parcelable instanceof Rating) {
                                    }
                                }
                            } else {
                                parcelable = bundle.getParcelable(strA0j);
                            }
                            builder.putRating(strA0j, (Rating) parcelable);
                        } else {
                            parcelable = bundle.getParcelable(strA0j);
                        }
                        builder.putBitmap(strA0j, (Bitmap) parcelable);
                    } else {
                        charSequence = bundle.getCharSequence(strA0j);
                    }
                    builder.putText(strA0j, charSequence);
                } else {
                    jA05 = bundle.getLong(strA0j, 0L);
                }
                builder.putLong(strA0j, jA05);
            }
            mediaMetadataBuild = builder.build();
            mediaMetadataCompat.A00 = mediaMetadataBuild;
        }
        mediaSession.setMetadata(mediaMetadataBuild);
    }

    public final void A02(boolean z) {
        ((C8853FrI) this.A01).A04.setActive(z);
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onActiveChanged");
        }
    }
}
