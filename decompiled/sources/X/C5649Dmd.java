package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dmd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5649Dmd {
    public final Map<C6154Dwx, C5581Dkz> A00;

    public static final C5997Dte A00(Context context) {
        AudioManager audioManager;
        boolean z = false;
        C7384Etj.A0Y(context, 0);
        boolean z2 = false;
        Object systemService = context.getSystemService("audio");
        if (!(systemService instanceof AudioManager) || (audioManager = (AudioManager) systemService) == null) {
            return new C5997Dte(false, false);
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        C7384Etj.A0U(devices);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 8 || type == 22 || type == 26) {
                z = true;
                if (Build.VERSION.SDK_INT >= 32) {
                    Spatializer spatializer = audioManager.getSpatializer();
                    C7384Etj.A0U(spatializer);
                    if (spatializer.getImmersiveAudioLevel() != 0 && spatializer.isAvailable() && spatializer.isEnabled() && spatializer.canBeSpatialized(new AudioAttributes.Builder().setUsage(1).setContentType(3).build(), new AudioFormat.Builder().setEncoding(18).setSampleRate(48000).setChannelMask(252).build())) {
                        z2 = true;
                    }
                }
                return new C5997Dte(z, z2);
            }
        }
        return new C5997Dte(z, z2);
    }

    public static final boolean A02(C5581Dkz c5581Dkz, long j) {
        if (c5581Dkz != null) {
            List<AbstractC5553DkW> list = c5581Dkz.A0E;
            C7384Etj.A0T(list);
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<AbstractC5553DkW> it = list.iterator();
            while (it.hasNext()) {
                C60Q.A1P(arrayListA0i, BV6.A0d(it).A03.A05);
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : arrayListA0i) {
                if (AnonymousClass001.A0F(obj) > 0) {
                    arrayListA0h.add(obj);
                }
            }
            if (((Number) AbstractC0878AGe.A09(arrayListA0h)) != null && j >= r0.intValue()) {
                return true;
            }
        }
        return false;
    }

    public C5649Dmd(C5580Dky c5580Dky) {
        C0924AIa c0924AIa = new C0924AIa();
        int iA00 = C5580Dky.A00(c5580Dky);
        for (int i = 0; i < iA00; i++) {
            Iterator itA05 = C5580Dky.A05(c5580Dky, i);
            while (itA05.hasNext()) {
                Dl9 dl9A0b = BV6.A0b(itA05);
                if (dl9A0b instanceof C5581Dkz) {
                    Iterator itA02 = Dl9.A02(dl9A0b);
                    while (itA02.hasNext()) {
                        c0924AIa.put(BV6.A0d(itA02).A03, dl9A0b);
                    }
                }
            }
        }
        this.A00 = AIW.A0K(c0924AIa);
    }

    public static final C5581Dkz A01(Integer num, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C5581Dkz) next).A00 == num) {
                break;
            }
        }
        return (C5581Dkz) next;
    }
}
