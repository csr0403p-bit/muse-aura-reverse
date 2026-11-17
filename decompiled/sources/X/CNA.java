package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.provider.Settings;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CNA implements CNB {
    public final Context A00;

    public CNA(Context context) {
        this.A00 = context;
    }

    @Override // X.CNB
    public final InterfaceC6068Dv6[] A7z(Handler handler, InterfaceC6239Dyh interfaceC6239Dyh, InterfaceC5408Di1 interfaceC5408Di1, InterfaceC5318DgC interfaceC5318DgC, InterfaceC6243Dym interfaceC6243Dym) {
        DMX dmx;
        ArrayList arrayListA0h = C3cG.A0h();
        Context context = this.A00;
        C6175DxI c6175DxI = C6175DxI.A0i;
        C2386BYm c2386BYm = C2386BYm.A02;
        BVV bvv = new BVV(null, c2386BYm, false);
        InterfaceC2356BVg interfaceC2356BVg = InterfaceC2356BVg.A00;
        arrayListA0h.add(new C6150Dws(context, handler, null, null, interfaceC6243Dym, bvv, c6175DxI, null, interfaceC2356BVg, 30.0f, 50, 5, 0, 0, 0, 5000L, -1L, false, false, false, false));
        EAX[] eaxArr = new EAX[0];
        BVV bvv2 = new BVV(null, c2386BYm, false);
        ImmutableMap<Integer, Integer> immutableMap = DMX.A02;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        String str = Util.A03;
        if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            dmx = DMX.A04;
        } else if (Util.A0P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            AudioAttributes audioAttributes = AbstractC3550CTm.A00;
            ImmutableList.Builder builder = ImmutableList.builder();
            AbstractC7489Ext<Integer> it = DMX.A02.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(next.intValue()).setSampleRate(48000).build(), AbstractC3550CTm.A00)) {
                    builder.add((ImmutableList.Builder) next);
                }
            }
            builder.add((ImmutableList.Builder) BV4.A0X());
            Object[] array = builder.build().toArray();
            int length = array.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = AnonymousClass001.A0F(BV6.A0n(array, i));
            }
            dmx = new DMX(iArr, 8);
        } else {
            dmx = (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? DMX.A03 : new DMX(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        arrayListA0h.add(new C6157Dx0(context, handler, interfaceC6239Dyh, null, bvv2, c6175DxI, null, new EA4(new EA1(new EAQ(eaxArr), dmx, BVI.A00)), interfaceC2356BVg, 0, false, false, false));
        arrayListA0h.add(new E0H(handler.getLooper(), E0V.A00, interfaceC5318DgC));
        arrayListA0h.add(new C5401Dhu(handler.getLooper(), InterfaceC5404Dhx.A00, interfaceC5408Di1));
        return (InterfaceC6068Dv6[]) arrayListA0h.toArray(new InterfaceC6068Dv6[arrayListA0h.size()]);
    }
}
