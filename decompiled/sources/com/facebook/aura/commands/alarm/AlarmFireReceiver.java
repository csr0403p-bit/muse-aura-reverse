package com.facebook.aura.commands.alarm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class AlarmFireReceiver extends BroadcastReceiver {
    public static final String ACTION_ALARM_DISMISS = "com.facebook.aura.ALARM_DISMISS";
    public static final String ACTION_ALARM_FIRE = "com.facebook.aura.ALARM_FIRE";
    public static final Companion Companion = new Companion();
    public static final String EXTRA_ALARM_ID = "alarm_id";
    public static final String TAG = "AlarmFireReceiver";

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmFireReceiver$onReceive$1", f = "AlarmFireReceiver.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, 72, 75}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmFireReceiver$onReceive$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $alarmId;
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, BroadcastReceiver.PendingResult pendingResult, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$alarmId = str;
            this.$pendingResult = pendingResult;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$appContext, this.$alarmId, this.$pendingResult, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x010a A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmFireReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AnonymousClass003.A0u(context, intent);
        String action = intent.getAction();
        if (ACTION_ALARM_FIRE.equals(action) || ACTION_ALARM_DISMISS.equals(action)) {
            String stringExtra = intent.getStringExtra(EXTRA_ALARM_ID);
            if (stringExtra == null || stringExtra.length() == 0) {
                CFK.A06(TAG, FGI.A0U("Alarm ", action, " with no id"));
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (!ACTION_ALARM_DISMISS.equals(action)) {
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                AnonymousClass001.A1J(new AnonymousClass1(applicationContext, stringExtra, pendingResultGoAsync, null), C78T.A01(AnonymousClass001.A0y(), null));
            } else {
                HatchAlarmRinger.INSTANCE.stop();
                HatchAlarmNotifier hatchAlarmNotifier = HatchAlarmNotifier.INSTANCE;
                C7384Etj.A0X(applicationContext);
                hatchAlarmNotifier.cancel$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(applicationContext, stringExtra);
            }
        }
    }
}
