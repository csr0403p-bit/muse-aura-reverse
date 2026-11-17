package com.facebook.aura.commands.geofence;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.Location;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchGeofenceBroadcastReceiver extends BroadcastReceiver {
    public static final float ACCURACY_FLOOR_M = 100.0f;
    public static final String ACTION_GEOFENCE_TRANSITION = "com.facebook.aura.GEOFENCE_TRANSITION";
    public static final Companion Companion = new Companion();
    public static final String TAG = "NodeGeofenceReceiver";

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.HatchGeofenceBroadcastReceiver$onReceive$3", f = "HatchGeofenceBroadcastReceiver.kt", l = {96}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.HatchGeofenceBroadcastReceiver$onReceive$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<String> $oneTimeIds;
        public final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<String> list, Context context, BroadcastReceiver.PendingResult pendingResult, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$oneTimeIds = list;
            this.$context = context;
            this.$pendingResult = pendingResult;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$oneTimeIds, this.$context, this.$pendingResult, htJ);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003c -> B:11:0x001f). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Iterator<String> it;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    it = this.$oneTimeIds.iterator();
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    it = (Iterator) this.L$0;
                    try {
                        Hwg.A00(obj);
                    } catch (Exception e) {
                        C3cG.A1G("Failed to unregister one-time geofence: ", e.getMessage(), HatchGeofenceBroadcastReceiver.TAG);
                    }
                }
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    HatchGeofenceManager hatchGeofenceManager = HatchGeofenceManager.INSTANCE;
                    Context context = this.$context;
                    this.L$0 = it;
                    this.L$1 = null;
                    this.label = 1;
                    if (hatchGeofenceManager.unregisterGeofence(context, strA0j, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                this.$pendingResult.finish();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$pendingResult.finish();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final float distanceToCenter(Location location, NodeGeofence nodeGeofence) {
        float[] fArr = new float[1];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), nodeGeofence.latitude, nodeGeofence.longitude, fArr);
        return fArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r30, android.content.Intent r31) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldDeliver(int r8, java.lang.String r9, com.facebook.aura.commands.geofence.NodeGeofence r10, android.location.Location r11, com.facebook.aura.commands.geofence.GeofenceStore r12) {
        /*
            r7 = this;
            java.lang.String r3 = "NodeGeofenceReceiver"
            r6 = 0
            r2 = 1
            if (r8 == r2) goto Ld
            r0 = 2
            if (r8 == r0) goto L2c
            r0 = 4
            if (r8 == r0) goto Ld
        Lc:
            return r6
        Ld:
            float r5 = r7.distanceToCenter(r11, r10)
            float r4 = r10.radiusMeters
            float r1 = r11.getAccuracy()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = java.lang.Math.max(r1, r0)
            float r4 = r4 + r0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 > 0) goto L3e
            r12.markInside(r9)
            com.facebook.aura.commands.geofence.GeofenceTriggerType r1 = r10.trigger
            com.facebook.aura.commands.geofence.GeofenceTriggerType r0 = com.facebook.aura.commands.geofence.GeofenceTriggerType.EXIT
            if (r1 == r0) goto Lc
            return r2
        L2c:
            boolean r2 = r12.isInside(r9)
            if (r2 == 0) goto L36
            r12.markOutside(r9)
            return r2
        L36:
            java.lang.String r1 = "Suppressed phantom exit id="
            java.lang.String r0 = ": no prior enter recorded"
            X.C60Q.A1J(r1, r9, r0, r3)
            return r2
        L3e:
            float r2 = r10.radiusMeters
            java.lang.String r0 = "Suppressed phantom enter id="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r9)
            java.lang.String r0 = " dist="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "m radius="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "m"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
            X.CFK.A06(r3, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceBroadcastReceiver.shouldDeliver(int, java.lang.String, com.facebook.aura.commands.geofence.NodeGeofence, android.location.Location, com.facebook.aura.commands.geofence.GeofenceStore):boolean");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
