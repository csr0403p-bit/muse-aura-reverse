package com.facebook.aura.commands.alarm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchAlarmRinger {
    public static final HatchAlarmRinger INSTANCE = new HatchAlarmRinger();
    public static Ringtone ringtone;
    public static HoC timeoutJob;

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.HatchAlarmRinger$start$2", f = "HatchAlarmRinger.kt", l = {60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.HatchAlarmRinger$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(120000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchAlarmRinger.INSTANCE.stop();
            return Unit.INSTANCE;
        }
    }

    public final synchronized void stop() {
        stopInternal();
    }

    private final void stopInternal() {
        HoC hoC = timeoutJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        timeoutJob = null;
        Ringtone ringtone2 = ringtone;
        if (ringtone2 != null) {
            try {
                ringtone2.stop();
            } catch (Exception e) {
                CFK.A06(HatchAlarmRingerKt.TAG, FGI.A0M("Failed to stop ringtone: ", e.getMessage()));
            }
        }
        ringtone = null;
    }

    public final synchronized void start(Context context) {
        C7384Etj.A0Y(context, 0);
        stopInternal();
        Uri defaultUri = RingtoneManager.getDefaultUri(4);
        if (defaultUri == null && (defaultUri = RingtoneManager.getDefaultUri(2)) == null) {
            CFK.A06(HatchAlarmRingerKt.TAG, "No alarm/notification ringtone available");
        } else {
            try {
                Ringtone ringtone2 = RingtoneManager.getRingtone(context.getApplicationContext(), defaultUri);
                if (ringtone2 != null) {
                    ringtone2.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(4).build());
                    ringtone2.setLooping(true);
                    ringtone2.play();
                } else {
                    ringtone2 = null;
                }
                ringtone = ringtone2;
                CFK.A05(HatchAlarmRingerKt.TAG, "Alarm ringing started");
                timeoutJob = AnonymousClass001.A11(new AnonymousClass2(null), Hxb.A02(AuraDispatchers.INSTANCE.m764default()));
            } catch (Exception e) {
                C60O.A1P("Failed to start alarm ringing: ", e.getMessage(), HatchAlarmRingerKt.TAG);
            }
        }
    }
}
