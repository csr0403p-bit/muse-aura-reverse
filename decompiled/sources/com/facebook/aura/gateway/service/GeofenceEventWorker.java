package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BzB;
import X.C066677k;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C77S;
import X.C77i;
import X.C77j;
import X.C7yC;
import X.CFK;
import X.EnumC10460Hji;
import X.F1d;
import X.F3R;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.commands.location.LocationDataSource;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class GeofenceEventWorker extends AuraBackgroundCoroutineWorker {
    public static final Companion Companion = new Companion();
    public static final String KEY_ACCURACY_METERS = "accuracy_meters";
    public static final String KEY_FIX_TIMESTAMP_MS = "fix_timestamp_ms";
    public static final String KEY_GEOFENCE_ID = "geofence_id";
    public static final String KEY_GEOFENCE_LABEL = "geofence_label";
    public static final String KEY_LATITUDE = "latitude";
    public static final String KEY_LONGITUDE = "longitude";
    public static final String KEY_TRIGGER_TYPE = "trigger_type";

    @DebugMetadata(c = "com.facebook.aura.gateway.service.GeofenceEventWorker", f = "GeofenceEventWorker.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "doBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.GeofenceEventWorker$doBackgroundWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public double D$0;
        public double D$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GeofenceEventWorker.this.doBackgroundWork(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.GeofenceEventWorker$doBackgroundWork$2", f = "GeofenceEventWorker.kt", l = {54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.GeofenceEventWorker$doBackgroundWork$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C77S>, Object> {
        public final /* synthetic */ Float $accuracyMeters;
        public final /* synthetic */ Long $fixTimestampMs;
        public final /* synthetic */ String $geofenceId;
        public final /* synthetic */ String $geofenceName;
        public final /* synthetic */ double $latitude;
        public final /* synthetic */ double $longitude;
        public final /* synthetic */ String $triggerType;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, double d, double d2, String str, String str2, Long l, Float f, String str3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$latitude = d;
            this.$longitude = d2;
            this.$geofenceName = str;
            this.$triggerType = str2;
            this.$fixTimestampMs = l;
            this.$accuracyMeters = f;
            this.$geofenceId = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$latitude, this.$longitude, this.$geofenceName, this.$triggerType, this.$fixTimestampMs, this.$accuracyMeters, this.$geofenceId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objPublishNow = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objPublishNow);
                    LocationDataSource locationDataSource = LocationDataSource.INSTANCE;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    double d = this.$latitude;
                    double d2 = this.$longitude;
                    String str = this.$geofenceName;
                    String str2 = this.$triggerType;
                    Long l = this.$fixTimestampMs;
                    Float f = this.$accuracyMeters;
                    this.label = 1;
                    objPublishNow = locationDataSource.publishNow(abstractC3358CGz, d, d2, str, str2, l, f, false, this);
                    if (objPublishNow == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objPublishNow);
                }
                if (!AnonymousClass001.A1X(objPublishNow)) {
                    return new C066677k();
                }
                C60Q.A1I("Geofence trigger sent: geofenceId=", this.$geofenceId, GeofenceEventWorkerKt.TAG);
                return new C77i();
            } catch (Exception e) {
                C60O.A1P("Failed to send geofence trigger: ", e.getMessage(), GeofenceEventWorkerKt.TAG);
                return new C77j();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super C77S> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final void enqueue(Context context, String str, String str2, String str3, double d, double d2, Long l, Float f) {
            AnonymousClass005.A14(context, str, str2, str3);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_GEOFENCE_ID, str);
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_GEOFENCE_LABEL, str2);
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_TRIGGER_TYPE, str3);
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_LATITUDE, Double.valueOf(d));
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_LONGITUDE, Double.valueOf(d2));
            linkedHashMapA0j.put(GeofenceEventWorker.KEY_FIX_TIMESTAMP_MS, Long.valueOf(C60P.A01(l)));
            BzB bzBA0J = C60R.A0J(GeofenceEventWorker.KEY_ACCURACY_METERS, Float.valueOf(f != null ? f.floatValue() : -1.0f), linkedHashMapA0j);
            F1d f1d = new F1d(GeofenceEventWorker.class);
            f1d.A03(bzBA0J);
            F3R.A02(context).A04(C7yC.A05, f1d.A01(), FGI.A0M("geofence_", str));
            CFK.A05(GeofenceEventWorkerKt.TAG, FGI.A0M("Geofence trigger enqueued: geofenceId=", str));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doBackgroundWork(X.HtJ<? super X.C77S> r20) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.GeofenceEventWorker.doBackgroundWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceEventWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
