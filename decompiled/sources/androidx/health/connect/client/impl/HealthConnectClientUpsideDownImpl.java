package androidx.health.connect.client.impl;

import X.AIW;
import X.AIX;
import X.AIY;
import X.AbstractC0882AGj;
import X.AbstractC7611F5y;
import X.AbstractC8804FlF;
import X.AbstractC8873Frm;
import X.AbstractC9043FxP;
import X.AbstractC9047FxV;
import X.AbstractC9053Fxb;
import X.AbstractC9055Fxd;
import X.AbstractC9142FzB;
import X.AbstractC9266GBt;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV5;
import X.C0924AIa;
import X.C10457Hje;
import X.C3cH;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C8803FlE;
import X.C8866Frf;
import X.C8867Frg;
import X.C8869Fri;
import X.C8870Frj;
import X.C8872Frl;
import X.C8874Frn;
import X.C8875Fro;
import X.C8876Frp;
import X.C8877Frq;
import X.C8878Frr;
import X.C8879Frs;
import X.C8880Frt;
import X.C8951FuQ;
import X.C8952FuR;
import X.C8985FwN;
import X.C8986FwO;
import X.C8987FwP;
import X.C8990FwS;
import X.C8993FwW;
import X.C8997Fwa;
import X.C8998Fwb;
import X.C8999Fwc;
import X.C9000Fwd;
import X.C9001Fwe;
import X.C9002Fwf;
import X.C9003Fwg;
import X.C9004Fwh;
import X.C9005Fwi;
import X.C9006Fwj;
import X.C9007Fwk;
import X.C9012Fwp;
import X.C9028Fx8;
import X.C9034FxG;
import X.C9039FxL;
import X.C9040FxM;
import X.C9046FxU;
import X.C9048FxW;
import X.C9052Fxa;
import X.C9056Fxe;
import X.C9057Fxf;
import X.C9059Fxh;
import X.C9060Fxi;
import X.C9061Fxj;
import X.C9062Fxk;
import X.C9063Fxl;
import X.C9064Fxm;
import X.C9065Fxn;
import X.C9066Fxo;
import X.C9067Fxp;
import X.C9068Fxq;
import X.C9069Fxr;
import X.C9070Fxs;
import X.C9071Fxx;
import X.C9072Fxy;
import X.C9073Fxz;
import X.C9074Fy0;
import X.C9075Fy2;
import X.C9076Fy3;
import X.C9077Fy4;
import X.C9078Fy5;
import X.C9079Fy6;
import X.C9080Fy7;
import X.C9081Fy8;
import X.C9082Fy9;
import X.C9084FyB;
import X.C9085FyC;
import X.C9086FyD;
import X.C9087FyE;
import X.C9088FyF;
import X.C9095FyM;
import X.C9098FyP;
import X.C9099FyQ;
import X.C9100FyR;
import X.C9101FyS;
import X.C9102FyT;
import X.C9103FyU;
import X.C9104FyV;
import X.C9108FyZ;
import X.C9113Fye;
import X.C9114Fyf;
import X.C9119Fyk;
import X.C9120Fyl;
import X.C9137Fz3;
import X.C9138Fz6;
import X.C9139Fz7;
import X.C9140Fz8;
import X.C9143FzC;
import X.C9144FzD;
import X.C9147FzG;
import X.C9148FzH;
import X.EnumC9090FyH;
import X.EnumC9091FyI;
import X.EnumC9092FyJ;
import X.EnumC9093FyK;
import X.EnumC9094FyL;
import X.EnumC9110Fyb;
import X.EnumC9112Fyd;
import X.EnumC9152FzL;
import X.EnumC9160FzT;
import X.Fy1;
import X.Fz4;
import X.Fz5;
import X.G0U;
import X.HiS;
import X.Hj8;
import X.HmN;
import X.Hr7;
import X.Hrc;
import X.HsY;
import X.HtJ;
import X.Hu0;
import X.HuT;
import X.InterfaceC9011Fwo;
import X.InterfaceC9037FxJ;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import com.facebook.aura.commands.health.HealthSyncManagerKt;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HealthConnectClientUpsideDownImpl implements InterfaceC9037FxJ, Hrc {
    public final Context A00;
    public final HealthConnectManager A01;
    public final HsY A02;
    public final Executor A03;
    public final G0U<Collection<String>, Unit> A04;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A48(X.C9031FxC r10, X.HtJ<? super X.C8990FwS> r11) throws java.lang.Exception {
        /*
            r9 = this;
            r4 = 1
            boolean r0 = r11 instanceof X.C8912FtU
            if (r0 == 0) goto L98
            r6 = r11
            X.FtU r6 = (X.C8912FtU) r6
            int r0 = r6.$t
            if (r0 != r4) goto L98
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r5 = r6.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r7 = 2
            if (r0 == 0) goto L48
            if (r0 == r4) goto L5e
            if (r0 != r7) goto L9f
            java.lang.Object r8 = r6.A02
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r2 = r6.A01
            X.FwS r2 = (X.C8990FwS) r2
            X.Hwg.A00(r5)
        L2f:
            X.C7384Etj.A0W(r5)
            X.C7384Etj.A0Y(r8, r4)
            X.FyW r1 = new X.FyW
            r1.<init>(r5)
            X.FyO r0 = new X.FyO
            r0.<init>(r5)
            X.FwS r0 = A01(r8, r1, r0)
            X.FwS r0 = r0.A00(r2)
            return r0
        L48:
            X.Hwg.A00(r5)
            java.util.Set<X.FwW<?>> r0 = r10.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            r6.A01 = r10
            r6.A00 = r4
            java.lang.Object r5 = androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt.A03(r9, r10, r6)
            if (r5 != r3) goto L65
        L5d:
            return r3
        L5e:
            java.lang.Object r10 = r6.A01
            X.FxC r10 = (X.C9031FxC) r10
            X.Hwg.A00(r5)
        L65:
            X.FwS r5 = (X.C8990FwS) r5
            java.util.Set<X.FwW<?>> r0 = r10.A02
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            X.AbstractC7610F5x.A1P(r2, r1)
            goto L71
        L7b:
            java.util.Set r8 = X.AbstractC0878AGe.A0g(r2)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L86
            return r5
        L86:
            r1 = 0
            androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 r0 = new androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1
            r0.<init>(r9, r10, r1)
            X.C8912FtU.A00(r5, r8, r6, r7)
            java.lang.Object r0 = r9.A08(r0, r6)
            if (r0 == r3) goto L5d
            r2 = r5
            r5 = r0
            goto L2f
        L98:
            X.FtU r6 = new X.FtU
            r6.<init>(r9, r11, r4)
            goto L17
        L9f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La4:
            java.lang.String r0 = "At least one of the aggregation types must be set"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.A48(X.FxC, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A49(X.C9029FxA r12, X.HtJ<? super java.util.List<X.C9030FxB>> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.A49(X.FxA, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ADV(java.lang.String r10, X.HtJ<? super X.C8973FvT> r11) throws java.lang.Exception {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = r11 instanceof X.C8913FtV
            if (r0 == 0) goto L24
            r8 = r11
            X.FtV r8 = (X.C8913FtV) r8
            int r0 = r8.$t
            if (r0 != r5) goto L24
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r8.A00 = r2
        L17:
            java.lang.Object r6 = r8.A02
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L2a
            goto L55
        L24:
            X.FtV r8 = new X.FtV
            r8.<init>(r9, r11, r5)
            goto L17
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r6)
            r8.A01 = r10     // Catch: android.health.connect.HealthConnectException -> Lc1
            r8.A00 = r3     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.GBL r8 = X.C7Bm.A04(r8)     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.health.connect.HealthConnectManager r6 = r9.A01     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.health.connect.changelog.ChangeLogsRequest$Builder r0 = new android.health.connect.changelog.ChangeLogsRequest$Builder     // Catch: android.health.connect.HealthConnectException -> Lc1
            r0.<init>(r10)     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.health.connect.changelog.ChangeLogsRequest r2 = r0.build()     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.util.concurrent.Executor r1 = r9.A03     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.os.OutcomeReceiver r0 = X.AbstractC4472Cwo.A00(r8)     // Catch: android.health.connect.HealthConnectException -> Lc1
            r6.getChangeLogs(r2, r1, r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.lang.Object r6 = r8.A0F()     // Catch: android.health.connect.HealthConnectException -> Lc1
            if (r6 != r7) goto L58
            return r7
        L55:
            X.Hwg.A00(r6)     // Catch: android.health.connect.HealthConnectException -> Lc1
        L58:
            android.health.connect.changelog.ChangeLogsResponse r6 = (android.health.connect.changelog.ChangeLogsResponse) r6     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.AII r7 = X.AIM.A17()     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.util.List r0 = r6.getUpsertedRecords()     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.C7384Etj.A0U(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.util.Iterator r2 = r0.iterator()     // Catch: android.health.connect.HealthConnectException -> Lc1
        L69:
            boolean r0 = r2.hasNext()     // Catch: android.health.connect.HealthConnectException -> Lc1
            if (r0 == 0) goto L85
            java.lang.Object r0 = r2.next()     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.health.connect.datatypes.Record r0 = (android.health.connect.datatypes.Record) r0     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.C7384Etj.A0X(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.Fwo r1 = A02(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.FvS r0 = new X.FvS     // Catch: android.health.connect.HealthConnectException -> Lc1
            r0.<init>(r1)     // Catch: android.health.connect.HealthConnectException -> Lc1
            r7.add(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            goto L69
        L85:
            java.util.List r0 = r6.getDeletedLogs()     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.C7384Etj.A0U(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.util.Iterator r2 = r0.iterator()     // Catch: android.health.connect.HealthConnectException -> Lc1
        L90:
            boolean r0 = r2.hasNext()     // Catch: android.health.connect.HealthConnectException -> Lc1
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r2.next()     // Catch: android.health.connect.HealthConnectException -> Lc1
            android.health.connect.changelog.ChangeLogsResponse$DeletedLog r0 = (android.health.connect.changelog.ChangeLogsResponse.DeletedLog) r0     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.lang.String r1 = r0.getDeletedRecordId()     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.C7384Etj.A0U(r1)     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.FvR r0 = new X.FvR     // Catch: android.health.connect.HealthConnectException -> Lc1
            r0.<init>(r1)     // Catch: android.health.connect.HealthConnectException -> Lc1
            r7.add(r0)     // Catch: android.health.connect.HealthConnectException -> Lc1
            goto L90
        Lac:
            X.AII r2 = X.AIM.A18(r7)     // Catch: android.health.connect.HealthConnectException -> Lc1
            java.lang.String r1 = r6.getNextChangesToken()     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.C7384Etj.A0U(r1)     // Catch: android.health.connect.HealthConnectException -> Lc1
            boolean r0 = r6.hasMorePages()     // Catch: android.health.connect.HealthConnectException -> Lc1
            X.FvT r7 = new X.FvT     // Catch: android.health.connect.HealthConnectException -> Lc1
            r7.<init>(r2, r1, r0, r4)     // Catch: android.health.connect.HealthConnectException -> Lc1
            return r7
        Lc1:
            r1 = move-exception
            int r0 = r1.getErrorCode()
            if (r0 != r5) goto Ld2
            X.AGi r1 = X.C0881AGi.A00
            java.lang.String r0 = ""
            X.FvT r7 = new X.FvT
            r7.<init>(r1, r0, r4, r3)
            return r7
        Ld2:
            java.lang.Exception r0 = A06(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.ADV(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ADW(X.FvW r6, X.HtJ<? super java.lang.String> r7) throws java.lang.Exception {
        /*
            r5 = this;
            r3 = 6
            boolean r0 = r7 instanceof X.C8914FtW
            if (r0 == 0) goto L41
            r4 = r7
            X.FtW r4 = (X.C8914FtW) r4
            int r0 = r4.$t
            if (r0 != r3) goto L41
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L47
            X.Hwg.A00(r1)
        L25:
            android.health.connect.changelog.ChangeLogTokenResponse r1 = (android.health.connect.changelog.ChangeLogTokenResponse) r1
            java.lang.String r0 = r1.getToken()
            X.C7384Etj.A0U(r0)
            return r0
        L2f:
            X.Hwg.A00(r1)
            r1 = 0
            androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2 r0 = new androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2
            r0.<init>(r5, r6, r1)
            r4.A00 = r2
            java.lang.Object r1 = r5.A08(r0, r4)
            if (r1 != r3) goto L25
            return r3
        L41:
            X.FtW r4 = new X.FtW
            r4.<init>(r5, r7, r3)
            goto L17
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.ADW(X.FvW, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.InterfaceC9011Fwo> java.lang.Object AZS(X.C9042FxO<T> r8, X.HtJ<? super X.C9041FxN<T>> r9) throws java.lang.Exception {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = r9 instanceof X.C8914FtW
            if (r0 == 0) goto L68
            r4 = r9
            X.FtW r4 = (X.C8914FtW) r4
            int r0 = r4.$t
            if (r0 != r3) goto L68
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L53
            if (r0 != r1) goto L8a
            X.Hwg.A00(r3)
        L26:
            android.health.connect.ReadRecordsResponse r3 = (android.health.connect.ReadRecordsResponse) r3
            java.util.List r0 = r3.getRecords()
            X.C7384Etj.A0U(r0)
            java.util.ArrayList r7 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r2 = r0.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r2.next()
            android.health.connect.datatypes.Record r0 = (android.health.connect.datatypes.Record) r0
            X.C7384Etj.A0X(r0)
            X.Fwo r1 = A02(r0)
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.readRecords"
            X.C7384Etj.A0Z(r1, r0)
            r7.add(r1)
            goto L37
        L53:
            X.Hwg.A00(r3)
            int r0 = r8.A00
            if (r0 != 0) goto L8f
            androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$response$1 r0 = new androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$response$1
            r0.<init>(r7, r8, r6)
            r4.A00 = r1
            java.lang.Object r3 = r7.A08(r0, r4)
            if (r3 != r2) goto L26
            return r2
        L68:
            X.FtW r4 = new X.FtW
            r4.<init>(r7, r9, r3)
            goto L17
        L6e:
            long r0 = r3.getNextPageToken()
            java.lang.Long r5 = X.C3cG.A0S(r0)
            long r3 = r5.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L84
            java.lang.String r6 = r5.toString()
        L84:
            X.FxN r2 = new X.FxN
            r2.<init>(r7, r6)
            return r2
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L8f:
            java.lang.String r1 = "An operation is not implemented: Not yet implemented"
            X.EyF r0 = new X.EyF
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.AZS(X.FxO, X.HtJ):java.lang.Object");
    }

    public HealthConnectClientUpsideDownImpl(Context context) {
        HmN hmN = new HmN(context);
        this.A03 = Hu0.A00(AbstractC9266GBt.A00);
        this.A02 = new HuT();
        this.A00 = context;
        Object systemService = context.getSystemService(HealthSyncManagerKt.DEFAULT_PROVIDER_ID);
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.health.connect.HealthConnectManager");
        this.A01 = (HealthConnectManager) systemService;
        this.A04 = hmN;
    }

    public static final C8990FwS A01(Set<? extends C8993FwW<? extends Object>> set, G0U<? super AggregationType<Object>, ? extends Object> g0u, G0U<? super AggregationType<Object>, ? extends Set<DataOrigin>> g0u2) {
        String strA03;
        double dA00;
        C0924AIa c0924AIa = new C0924AIa();
        for (C8993FwW<? extends Object> c8993FwW : set) {
            Object objInvoke = g0u.invoke(AbstractC9053Fxb.A05(c8993FwW));
            if (objInvoke != null) {
                c0924AIa.put(c8993FwW, objInvoke);
            }
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        C0924AIa c0924AIa2 = new C0924AIa();
        Iterator it = c0924AIaA0K.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            C8993FwW c8993FwW2 = (C8993FwW) entryA0l.getKey();
            Object value = entryA0l.getValue();
            if (AbstractC9047FxV.A01.containsKey(c8993FwW2) || AbstractC9047FxV.A06.containsKey(c8993FwW2)) {
                String strA032 = c8993FwW2.A03();
                C7384Etj.A0Z(value, "null cannot be cast to non-null type kotlin.Long");
                c0924AIa2.put(strA032, value);
            }
        }
        C0924AIa c0924AIaA0K2 = AIW.A0K(c0924AIa2);
        C0924AIa c0924AIa3 = new C0924AIa();
        Iterator it2 = c0924AIaA0K.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(it2);
            C8993FwW c8993FwW3 = (C8993FwW) entryA0l2.getKey();
            Object value2 = entryA0l2.getValue();
            if (AbstractC9047FxV.A00.containsKey(c8993FwW3)) {
                strA03 = c8993FwW3.A03();
                C7384Etj.A0Z(value2, "null cannot be cast to non-null type kotlin.Double");
            } else {
                if (AbstractC9047FxV.A02.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C9143FzC c9143FzC = C9076Fy3.A02;
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Energy");
                    dA00 = new C9076Fy3(EnumC9090FyH.A02, ((Energy) value2).getInCalories()).A00();
                } else if (AbstractC9047FxV.A03.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Mass");
                    dA00 = ((Mass) value2).getInGrams();
                } else if (AbstractC9047FxV.A05.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Length");
                    dA00 = ((Length) value2).getInMeters();
                } else if (AbstractC9047FxV.A04.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C9120Fyl c9120Fyl = C9072Fxy.A02;
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Mass");
                    dA00 = new C9072Fxy(EnumC9160FzT.A02, ((Mass) value2).getInGrams()).A00();
                } else if (AbstractC9047FxV.A08.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Pressure");
                    dA00 = ((Pressure) value2).getInMillimetersOfMercury();
                } else if (AbstractC9047FxV.A07.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Power");
                    dA00 = ((Power) value2).getInWatts();
                } else if (AbstractC9047FxV.A09.containsKey(c8993FwW3)) {
                    if (SdkExtensions.getExtensionVersion(34) < 13) {
                        throw C60O.A0i("Failed requirement.");
                    }
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.TemperatureDelta");
                    dA00 = ((TemperatureDelta) value2).getInCelsius();
                } else if (AbstractC9047FxV.A0A.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Velocity");
                    dA00 = ((Velocity) value2).getInMetersPerSecond();
                } else if (AbstractC9047FxV.A0B.containsKey(c8993FwW3)) {
                    strA03 = c8993FwW3.A03();
                    C7384Etj.A0Z(value2, "null cannot be cast to non-null type android.health.connect.datatypes.units.Volume");
                    dA00 = ((Volume) value2).getInLiters();
                }
                value2 = Double.valueOf(dA00);
            }
            c0924AIa3.put(strA03, value2);
        }
        C0924AIa c0924AIaA0K3 = AIW.A0K(c0924AIa3);
        HashSet hashSetA13 = C60O.A13();
        Iterator<? extends C8993FwW<? extends Object>> it3 = set.iterator();
        while (it3.hasNext()) {
            Set<DataOrigin> setInvoke = g0u2.invoke(AbstractC9053Fxb.A05(it3.next()));
            ArrayList arrayListA0i = AnonymousClass003.A0i(setInvoke);
            for (DataOrigin dataOrigin : setInvoke) {
                C7384Etj.A0Y(dataOrigin, 0);
                String packageName = dataOrigin.getPackageName();
                C7384Etj.A0U(packageName);
                arrayListA0i.add(new C9012Fwp(packageName));
            }
            AbstractC0882AGj.A0r(arrayListA0i, hashSetA13);
        }
        return new C8990FwS(c0924AIaA0K2, c0924AIaA0K3, hashSetA13);
    }

    public static final Fy1 A04(Length length) {
        C9119Fyk c9119Fyk = Fy1.A02;
        return new Fy1(EnumC9152FzL.A02, length.getInMeters());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object A08(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r6, X.HtJ<? super T> r7) throws java.lang.Exception {
        /*
            r5 = this;
            r3 = 8
            boolean r0 = r7 instanceof X.C8914FtW
            if (r0 == 0) goto Le
            r0 = r7
            X.FtW r0 = (X.C8914FtW) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L2b
            r4 = r7
            X.FtW r4 = (X.C8914FtW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.A00 = r2
        L1f:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L35
            goto L31
        L2b:
            X.FtW r4 = new X.FtW
            r4.<init>(r5, r7, r3)
            goto L1f
        L31:
            X.Hwg.A00(r3)     // Catch: android.health.connect.HealthConnectException -> L47
            return r3
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r3)
            r4.A00 = r0     // Catch: android.health.connect.HealthConnectException -> L47
            java.lang.Object r0 = r6.invoke(r4)     // Catch: android.health.connect.HealthConnectException -> L47
            if (r0 != r2) goto L46
            return r2
        L46:
            return r0
        L47:
            r0 = move-exception
            java.lang.Exception r0 = A06(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.A08(X.G0U, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC9037FxJ
    public final HsY AFa() {
        return this.A02;
    }

    @Override // X.Hrc
    public final Object AG0(HtJ<? super Set<String>> htJ) throws PackageManager.NameNotFoundException {
        Context context = this.A00;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        AIY aiy = new AIY();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            C7384Etj.A0R(str);
            if (str.startsWith(C60N.A00(62))) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                C7384Etj.A0X(iArr);
                if ((iArr[i] & 2) > 0) {
                    String str2 = strArr[i];
                    C7384Etj.A0R(str2);
                    aiy.add(str2);
                }
            }
        }
        return AIX.A00(aiy);
    }

    public static final C9086FyD A03(Metadata metadata) {
        C10457Hje c10457Hje;
        String id = metadata.getId();
        C7384Etj.A0U(id);
        DataOrigin dataOrigin = metadata.getDataOrigin();
        C7384Etj.A0U(dataOrigin);
        String packageName = dataOrigin.getPackageName();
        C7384Etj.A0U(packageName);
        C9012Fwp c9012Fwp = new C9012Fwp(packageName);
        Instant lastModifiedTime = metadata.getLastModifiedTime();
        C7384Etj.A0U(lastModifiedTime);
        String clientRecordId = metadata.getClientRecordId();
        long clientRecordVersion = metadata.getClientRecordVersion();
        int iA0D = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0F, metadata.getRecordingMethod());
        Device device = metadata.getDevice();
        C7384Etj.A0U(device);
        if (device.equals(new Device.Builder().build())) {
            c10457Hje = null;
        } else {
            c10457Hje = new C10457Hje(AbstractC7611F5y.A0D(AbstractC9055Fxd.A06, device.getType()), device.getManufacturer(), device.getModel());
        }
        return new C9086FyD(c9012Fwp, c10457Hje, id, clientRecordId, lastModifiedTime, iA0D, clientRecordVersion);
    }

    public static final C9072Fxy A05(Mass mass) {
        if (mass.getInGrams() == Double.MIN_VALUE) {
            return null;
        }
        C9120Fyl c9120Fyl = C9072Fxy.A02;
        return new C9072Fxy(EnumC9160FzT.A02, mass.getInGrams());
    }

    public static final Exception A06(HealthConnectException healthConnectException) {
        int errorCode = healthConnectException.getErrorCode();
        return errorCode != 3 ? errorCode != 4 ? errorCode != 5 ? errorCode != 6 ? new IllegalStateException(healthConnectException) : new RemoteException(healthConnectException.getMessage()) : new SecurityException(healthConnectException) : new IOException(healthConnectException) : new IllegalArgumentException(healthConnectException);
    }

    public static final InterfaceC9011Fwo A02(Record record) {
        InterfaceC9011Fwo c8998Fwb;
        C9076Fy3 c9076Fy3;
        C9076Fy3 c9076Fy32;
        AbstractC9043FxP c9140Fz8;
        C9087FyE c9087FyE;
        InterfaceC9011Fwo c9052Fxa;
        AbstractC8804FlF c9102FyT;
        AbstractC9142FzB c9108FyZ;
        if (AbstractC8873Frm.A06() && (record instanceof ActivityIntensityRecord)) {
            ActivityIntensityRecord activityIntensityRecord = (ActivityIntensityRecord) record;
            Map<Integer, String> map = C8997Fwa.A0A;
            Instant startTime = activityIntensityRecord.getStartTime();
            C7384Etj.A0U(startTime);
            ZoneOffset startZoneOffset = activityIntensityRecord.getStartZoneOffset();
            Instant endTime = activityIntensityRecord.getEndTime();
            C7384Etj.A0U(endTime);
            ZoneOffset endZoneOffset = activityIntensityRecord.getEndZoneOffset();
            Metadata metadata = activityIntensityRecord.getMetadata();
            C7384Etj.A0U(metadata);
            return new C8997Fwa(A03(metadata), startTime, endTime, startZoneOffset, endZoneOffset, activityIntensityRecord.getActivityIntensityType());
        }
        if (AbstractC8873Frm.A05() && (record instanceof MindfulnessSessionRecord)) {
            MindfulnessSessionRecord mindfulnessSessionRecord = (MindfulnessSessionRecord) record;
            Map<Integer, String> map2 = C9002Fwf.A09;
            Instant startTime2 = mindfulnessSessionRecord.getStartTime();
            C7384Etj.A0U(startTime2);
            ZoneOffset startZoneOffset2 = mindfulnessSessionRecord.getStartZoneOffset();
            Instant endTime2 = mindfulnessSessionRecord.getEndTime();
            C7384Etj.A0U(endTime2);
            ZoneOffset endZoneOffset2 = mindfulnessSessionRecord.getEndZoneOffset();
            Metadata metadata2 = mindfulnessSessionRecord.getMetadata();
            C7384Etj.A0U(metadata2);
            return new C9002Fwf(A03(metadata2), String.valueOf(mindfulnessSessionRecord.getTitle()), String.valueOf(mindfulnessSessionRecord.getNotes()), startTime2, endTime2, startZoneOffset2, endZoneOffset2, AbstractC7611F5y.A0D(AbstractC9055Fxd.A0D, mindfulnessSessionRecord.getMindfulnessSessionType()));
        }
        if (AbstractC8873Frm.A04()) {
            if (record instanceof PlannedExerciseSessionRecord) {
                PlannedExerciseSessionRecord plannedExerciseSessionRecord = (PlannedExerciseSessionRecord) record;
                C7384Etj.A0Y(plannedExerciseSessionRecord, 0);
                Instant startTime3 = plannedExerciseSessionRecord.getStartTime();
                C7384Etj.A0U(startTime3);
                ZoneOffset startZoneOffset3 = plannedExerciseSessionRecord.getStartZoneOffset();
                Instant endTime3 = plannedExerciseSessionRecord.getEndTime();
                C7384Etj.A0U(endTime3);
                ZoneOffset endZoneOffset3 = plannedExerciseSessionRecord.getEndZoneOffset();
                Metadata metadata3 = plannedExerciseSessionRecord.getMetadata();
                C7384Etj.A0U(metadata3);
                C9086FyD c9086FyDA03 = A03(metadata3);
                boolean zHasExplicitTime = plannedExerciseSessionRecord.hasExplicitTime();
                int iA0D = AbstractC7611F5y.A0D(AbstractC9055Fxd.A09, plannedExerciseSessionRecord.getExerciseType());
                String completedExerciseSessionId = plannedExerciseSessionRecord.getCompletedExerciseSessionId();
                List<PlannedExerciseBlock> blocks = plannedExerciseSessionRecord.getBlocks();
                C7384Etj.A0U(blocks);
                ArrayList arrayListA0m = AnonymousClass002.A0m(blocks);
                for (PlannedExerciseBlock plannedExerciseBlock : blocks) {
                    C7384Etj.A0X(plannedExerciseBlock);
                    int repetitions = plannedExerciseBlock.getRepetitions();
                    CharSequence description = plannedExerciseBlock.getDescription();
                    String string = description != null ? description.toString() : null;
                    List<PlannedExerciseStep> steps = plannedExerciseBlock.getSteps();
                    C7384Etj.A0U(steps);
                    ArrayList arrayListA0m2 = AnonymousClass002.A0m(steps);
                    for (PlannedExerciseStep plannedExerciseStep : steps) {
                        C7384Etj.A0X(plannedExerciseStep);
                        CharSequence description2 = plannedExerciseStep.getDescription();
                        String string2 = description2 != null ? description2.toString() : null;
                        int iA0D2 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A08, plannedExerciseStep.getExerciseType());
                        int iA0D3 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A07, plannedExerciseStep.getExerciseCategory());
                        ExerciseCompletionGoal.DistanceGoal completionGoal = plannedExerciseStep.getCompletionGoal();
                        C7384Etj.A0U(completionGoal);
                        if (completionGoal instanceof ExerciseCompletionGoal.DistanceGoal) {
                            Length distance = completionGoal.getDistance();
                            C7384Etj.A0U(distance);
                            c9102FyT = new C8987FwP(A04(distance));
                        } else if (completionGoal instanceof ExerciseCompletionGoal.DistanceWithVariableRestGoal) {
                            ExerciseCompletionGoal.DistanceWithVariableRestGoal distanceWithVariableRestGoal = (ExerciseCompletionGoal.DistanceWithVariableRestGoal) completionGoal;
                            Length distance2 = distanceWithVariableRestGoal.getDistance();
                            C7384Etj.A0U(distance2);
                            Fy1 fy1A04 = A04(distance2);
                            Duration duration = distanceWithVariableRestGoal.getDuration();
                            C7384Etj.A0U(duration);
                            c9102FyT = new C8986FwO(fy1A04, duration);
                        } else if (completionGoal instanceof ExerciseCompletionGoal.StepsGoal) {
                            c9102FyT = new C9114Fyf(((ExerciseCompletionGoal.StepsGoal) completionGoal).getSteps());
                        } else if (completionGoal instanceof ExerciseCompletionGoal.DurationGoal) {
                            Duration duration2 = ((ExerciseCompletionGoal.DurationGoal) completionGoal).getDuration();
                            C7384Etj.A0U(duration2);
                            c9102FyT = new C8985FwN(duration2);
                        } else if (completionGoal instanceof ExerciseCompletionGoal.RepetitionsGoal) {
                            c9102FyT = new C9113Fye(((ExerciseCompletionGoal.RepetitionsGoal) completionGoal).getRepetitions());
                        } else if (completionGoal instanceof ExerciseCompletionGoal.TotalCaloriesBurnedGoal) {
                            Energy totalCalories = ((ExerciseCompletionGoal.TotalCaloriesBurnedGoal) completionGoal).getTotalCalories();
                            C7384Etj.A0U(totalCalories);
                            C9143FzC c9143FzC = C9076Fy3.A02;
                            c9102FyT = new C9103FyU(new C9076Fy3(EnumC9090FyH.A02, totalCalories.getInCalories()));
                        } else if (completionGoal instanceof ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) {
                            Energy activeCalories = ((ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) completionGoal).getActiveCalories();
                            C7384Etj.A0U(activeCalories);
                            C9143FzC c9143FzC2 = C9076Fy3.A02;
                            c9102FyT = new C9102FyT(new C9076Fy3(EnumC9090FyH.A02, activeCalories.getInCalories()));
                        } else if (completionGoal instanceof ExerciseCompletionGoal.UnknownGoal) {
                            c9102FyT = Fz4.A00;
                        } else {
                            if (!(completionGoal instanceof ExerciseCompletionGoal.UnspecifiedGoal)) {
                                throw BV5.A0O(completionGoal, "Unsupported exercise completion goal ");
                            }
                            c9102FyT = C9137Fz3.A00;
                        }
                        List<ExercisePerformanceGoal.PowerGoal> performanceGoals = plannedExerciseStep.getPerformanceGoals();
                        C7384Etj.A0U(performanceGoals);
                        ArrayList arrayListA0m3 = AnonymousClass002.A0m(performanceGoals);
                        for (ExercisePerformanceGoal.PowerGoal powerGoal : performanceGoals) {
                            C7384Etj.A0X(powerGoal);
                            if (powerGoal instanceof ExercisePerformanceGoal.PowerGoal) {
                                ExercisePerformanceGoal.PowerGoal powerGoal2 = powerGoal;
                                Power minPower = powerGoal2.getMinPower();
                                C7384Etj.A0U(minPower);
                                C9144FzD c9144FzD = C9077Fy4.A02;
                                double inWatts = minPower.getInWatts();
                                EnumC9091FyI enumC9091FyI = EnumC9091FyI.A03;
                                C9077Fy4 c9077Fy4 = new C9077Fy4(enumC9091FyI, inWatts);
                                Power maxPower = powerGoal2.getMaxPower();
                                C7384Etj.A0U(maxPower);
                                c9108FyZ = new C9100FyR(c9077Fy4, new C9077Fy4(enumC9091FyI, maxPower.getInWatts()));
                            } else if (powerGoal instanceof ExercisePerformanceGoal.SpeedGoal) {
                                ExercisePerformanceGoal.SpeedGoal speedGoal = (ExercisePerformanceGoal.SpeedGoal) powerGoal;
                                Velocity minSpeed = speedGoal.getMinSpeed();
                                C7384Etj.A0U(minSpeed);
                                C9147FzG c9147FzG = C9078Fy5.A02;
                                double inMetersPerSecond = minSpeed.getInMetersPerSecond();
                                EnumC9094FyL enumC9094FyL = EnumC9094FyL.A02;
                                C9078Fy5 c9078Fy5 = new C9078Fy5(enumC9094FyL, inMetersPerSecond);
                                Velocity maxSpeed = speedGoal.getMaxSpeed();
                                C7384Etj.A0U(maxSpeed);
                                c9108FyZ = new C9101FyS(c9078Fy5, new C9078Fy5(enumC9094FyL, maxSpeed.getInMetersPerSecond()));
                            } else if (powerGoal instanceof ExercisePerformanceGoal.CadenceGoal) {
                                ExercisePerformanceGoal.CadenceGoal cadenceGoal = (ExercisePerformanceGoal.CadenceGoal) powerGoal;
                                c9108FyZ = new C9098FyP(cadenceGoal.getMinRpm(), cadenceGoal.getMaxRpm());
                            } else if (powerGoal instanceof ExercisePerformanceGoal.HeartRateGoal) {
                                ExercisePerformanceGoal.HeartRateGoal heartRateGoal = (ExercisePerformanceGoal.HeartRateGoal) powerGoal;
                                c9108FyZ = new C9099FyQ(heartRateGoal.getMinBpm(), heartRateGoal.getMaxBpm());
                            } else if (powerGoal instanceof ExercisePerformanceGoal.WeightGoal) {
                                Mass mass = ((ExercisePerformanceGoal.WeightGoal) powerGoal).getMass();
                                C7384Etj.A0U(mass);
                                C9120Fyl c9120Fyl = C9072Fxy.A02;
                                c9108FyZ = new C9104FyV(new C9072Fxy(EnumC9160FzT.A02, mass.getInGrams()));
                            } else if (powerGoal instanceof ExercisePerformanceGoal.RateOfPerceivedExertionGoal) {
                                c9108FyZ = new C9108FyZ(((ExercisePerformanceGoal.RateOfPerceivedExertionGoal) powerGoal).getRpe());
                            } else if (powerGoal instanceof ExercisePerformanceGoal.AmrapGoal) {
                                c9108FyZ = Fz5.A00;
                            } else {
                                if (!(powerGoal instanceof ExercisePerformanceGoal.UnknownGoal)) {
                                    throw BV5.A0O(powerGoal, "Unsupported exercise performance target ");
                                }
                                c9108FyZ = C9138Fz6.A00;
                            }
                            arrayListA0m3.add(c9108FyZ);
                        }
                        arrayListA0m2.add(new C8803FlE(c9102FyT, string2, arrayListA0m3, iA0D2, iA0D3));
                    }
                    arrayListA0m.add(new HiS(repetitions, arrayListA0m2, string));
                }
                CharSequence title = plannedExerciseSessionRecord.getTitle();
                String string3 = title != null ? title.toString() : null;
                CharSequence notes = plannedExerciseSessionRecord.getNotes();
                c9052Fxa = new C9070Fxs(c9086FyDA03, completedExerciseSessionId, string3, notes != null ? notes.toString() : null, startTime3, endTime3, startZoneOffset3, endZoneOffset3, arrayListA0m, iA0D, zHasExplicitTime);
            } else if (record instanceof SkinTemperatureRecord) {
                SkinTemperatureRecord skinTemperatureRecord = (SkinTemperatureRecord) record;
                Instant startTime4 = skinTemperatureRecord.getStartTime();
                C7384Etj.A0U(startTime4);
                ZoneOffset startZoneOffset4 = skinTemperatureRecord.getStartZoneOffset();
                Instant endTime4 = skinTemperatureRecord.getEndTime();
                C7384Etj.A0U(endTime4);
                ZoneOffset endZoneOffset4 = skinTemperatureRecord.getEndZoneOffset();
                Metadata metadata4 = skinTemperatureRecord.getMetadata();
                C7384Etj.A0U(metadata4);
                C9086FyD c9086FyDA032 = A03(metadata4);
                int iA0D4 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0H, skinTemperatureRecord.getMeasurementLocation());
                List<SkinTemperatureRecord.Delta> deltas = skinTemperatureRecord.getDeltas();
                C7384Etj.A0U(deltas);
                ArrayList arrayListA0i = AnonymousClass003.A0i(deltas);
                for (SkinTemperatureRecord.Delta delta : deltas) {
                    C7384Etj.A0X(delta);
                    C9082Fy9 c9082Fy9 = C9085FyC.A03;
                    Instant time = delta.getTime();
                    C7384Etj.A0U(time);
                    TemperatureDelta delta2 = delta.getDelta();
                    C7384Etj.A0U(delta2);
                    arrayListA0i.add(new C9085FyC(new C9082Fy9(EnumC9112Fyd.A02, delta2.getInCelsius()), time));
                }
                Temperature baseline = skinTemperatureRecord.getBaseline();
                if (baseline != null) {
                    c9087FyE = new C9087FyE(EnumC9110Fyb.A02, baseline.getInCelsius());
                } else {
                    c9087FyE = null;
                }
                c9052Fxa = new C9052Fxa(c9086FyDA032, c9087FyE, startTime4, endTime4, startZoneOffset4, endZoneOffset4, arrayListA0i, iA0D4);
            }
            InterfaceC9011Fwo interfaceC9011Fwo = c9052Fxa;
            if (interfaceC9011Fwo != null) {
                return interfaceC9011Fwo;
            }
        }
        if (record instanceof ActiveCaloriesBurnedRecord) {
            ActiveCaloriesBurnedRecord activeCaloriesBurnedRecord = (ActiveCaloriesBurnedRecord) record;
            C8993FwW<C9076Fy3> c8993FwW = C9064Fxm.A06;
            Instant startTime5 = activeCaloriesBurnedRecord.getStartTime();
            C7384Etj.A0U(startTime5);
            ZoneOffset startZoneOffset5 = activeCaloriesBurnedRecord.getStartZoneOffset();
            Instant endTime5 = activeCaloriesBurnedRecord.getEndTime();
            C7384Etj.A0U(endTime5);
            ZoneOffset endZoneOffset5 = activeCaloriesBurnedRecord.getEndZoneOffset();
            Energy energy = activeCaloriesBurnedRecord.getEnergy();
            C7384Etj.A0U(energy);
            C9143FzC c9143FzC3 = C9076Fy3.A02;
            C9076Fy3 c9076Fy33 = new C9076Fy3(EnumC9090FyH.A02, energy.getInCalories());
            Metadata metadata5 = activeCaloriesBurnedRecord.getMetadata();
            C7384Etj.A0U(metadata5);
            c8998Fwb = new C9064Fxm(A03(metadata5), c9076Fy33, startTime5, endTime5, startZoneOffset5, endZoneOffset5);
        } else if (record instanceof BasalBodyTemperatureRecord) {
            BasalBodyTemperatureRecord basalBodyTemperatureRecord = (BasalBodyTemperatureRecord) record;
            Instant time2 = basalBodyTemperatureRecord.getTime();
            C7384Etj.A0U(time2);
            ZoneOffset zoneOffset = basalBodyTemperatureRecord.getZoneOffset();
            Temperature temperature = basalBodyTemperatureRecord.getTemperature();
            C7384Etj.A0U(temperature);
            C9087FyE c9087FyE2 = new C9087FyE(EnumC9110Fyb.A02, temperature.getInCelsius());
            int measurementLocation = basalBodyTemperatureRecord.getMeasurementLocation();
            Metadata metadata6 = basalBodyTemperatureRecord.getMetadata();
            C7384Etj.A0U(metadata6);
            c8998Fwb = new C9075Fy2(A03(metadata6), c9087FyE2, time2, zoneOffset, measurementLocation);
        } else if (record instanceof BasalMetabolicRateRecord) {
            BasalMetabolicRateRecord basalMetabolicRateRecord = (BasalMetabolicRateRecord) record;
            C8993FwW<C9076Fy3> c8993FwW2 = C9069Fxr.A04;
            Instant time3 = basalMetabolicRateRecord.getTime();
            C7384Etj.A0U(time3);
            ZoneOffset zoneOffset2 = basalMetabolicRateRecord.getZoneOffset();
            Power basalMetabolicRate = basalMetabolicRateRecord.getBasalMetabolicRate();
            C7384Etj.A0U(basalMetabolicRate);
            C9144FzD c9144FzD2 = C9077Fy4.A02;
            C9077Fy4 c9077Fy42 = new C9077Fy4(EnumC9091FyI.A03, basalMetabolicRate.getInWatts());
            Metadata metadata7 = basalMetabolicRateRecord.getMetadata();
            C7384Etj.A0U(metadata7);
            c8998Fwb = new C9069Fxr(A03(metadata7), c9077Fy42, time3, zoneOffset2);
        } else if (record instanceof BloodGlucoseRecord) {
            BloodGlucoseRecord bloodGlucoseRecord = (BloodGlucoseRecord) record;
            Instant time4 = bloodGlucoseRecord.getTime();
            C7384Etj.A0U(time4);
            ZoneOffset zoneOffset3 = bloodGlucoseRecord.getZoneOffset();
            BloodGlucose level = bloodGlucoseRecord.getLevel();
            C7384Etj.A0U(level);
            Map<EnumC9093FyK, C9080Fy7> map3 = C9080Fy7.A02;
            C9080Fy7 c9080Fy7 = new C9080Fy7(EnumC9093FyK.A02, level.getInMillimolesPerLiter());
            int iA0D5 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0A, bloodGlucoseRecord.getSpecimenSource());
            int iA0D6 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0B, bloodGlucoseRecord.getMealType());
            int iA0D7 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A00, bloodGlucoseRecord.getRelationToMeal());
            Metadata metadata8 = bloodGlucoseRecord.getMetadata();
            C7384Etj.A0U(metadata8);
            c8998Fwb = new C9065Fxn(A03(metadata8), c9080Fy7, time4, zoneOffset3, iA0D5, iA0D6, iA0D7);
        } else if (record instanceof BloodPressureRecord) {
            BloodPressureRecord bloodPressureRecord = (BloodPressureRecord) record;
            Instant time5 = bloodPressureRecord.getTime();
            C7384Etj.A0U(time5);
            ZoneOffset zoneOffset4 = bloodPressureRecord.getZoneOffset();
            Pressure systolic = bloodPressureRecord.getSystolic();
            C7384Etj.A0U(systolic);
            C9095FyM c9095FyM = new C9095FyM(systolic.getInMillimetersOfMercury());
            Pressure diastolic = bloodPressureRecord.getDiastolic();
            C7384Etj.A0U(diastolic);
            C9095FyM c9095FyM2 = new C9095FyM(diastolic.getInMillimetersOfMercury());
            int iA0D8 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A01, bloodPressureRecord.getBodyPosition());
            int iA0D9 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A02, bloodPressureRecord.getMeasurementLocation());
            Metadata metadata9 = bloodPressureRecord.getMetadata();
            C7384Etj.A0U(metadata9);
            c8998Fwb = new C9056Fxe(A03(metadata9), c9095FyM, c9095FyM2, time5, zoneOffset4, iA0D8, iA0D9);
        } else if (record instanceof BodyFatRecord) {
            BodyFatRecord bodyFatRecord = (BodyFatRecord) record;
            Instant time6 = bodyFatRecord.getTime();
            C7384Etj.A0U(time6);
            ZoneOffset zoneOffset5 = bodyFatRecord.getZoneOffset();
            Percentage percentage = bodyFatRecord.getPercentage();
            C7384Etj.A0U(percentage);
            Hj8 hj8 = new Hj8(percentage.getValue());
            Metadata metadata10 = bodyFatRecord.getMetadata();
            C7384Etj.A0U(metadata10);
            c8998Fwb = new C8952FuR(A03(metadata10), hj8, time6, zoneOffset5);
        } else if (record instanceof BodyTemperatureRecord) {
            BodyTemperatureRecord bodyTemperatureRecord = (BodyTemperatureRecord) record;
            Instant time7 = bodyTemperatureRecord.getTime();
            C7384Etj.A0U(time7);
            ZoneOffset zoneOffset6 = bodyTemperatureRecord.getZoneOffset();
            Temperature temperature2 = bodyTemperatureRecord.getTemperature();
            C7384Etj.A0U(temperature2);
            C9087FyE c9087FyE3 = new C9087FyE(EnumC9110Fyb.A02, temperature2.getInCelsius());
            int iA0D10 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A03, bodyTemperatureRecord.getMeasurementLocation());
            Metadata metadata11 = bodyTemperatureRecord.getMetadata();
            C7384Etj.A0U(metadata11);
            c8998Fwb = new C9084FyB(A03(metadata11), c9087FyE3, time7, zoneOffset6, iA0D10);
        } else if (record instanceof BodyWaterMassRecord) {
            BodyWaterMassRecord bodyWaterMassRecord = (BodyWaterMassRecord) record;
            C9072Fxy c9072Fxy = C9073Fxz.A04;
            Instant time8 = bodyWaterMassRecord.getTime();
            C7384Etj.A0U(time8);
            ZoneOffset zoneOffset7 = bodyWaterMassRecord.getZoneOffset();
            Mass bodyWaterMass = bodyWaterMassRecord.getBodyWaterMass();
            C7384Etj.A0U(bodyWaterMass);
            C9120Fyl c9120Fyl2 = C9072Fxy.A02;
            C9072Fxy c9072Fxy2 = new C9072Fxy(EnumC9160FzT.A02, bodyWaterMass.getInGrams());
            Metadata metadata12 = bodyWaterMassRecord.getMetadata();
            C7384Etj.A0U(metadata12);
            c8998Fwb = new C9073Fxz(A03(metadata12), c9072Fxy2, time8, zoneOffset7);
        } else if (record instanceof BoneMassRecord) {
            BoneMassRecord boneMassRecord = (BoneMassRecord) record;
            C9072Fxy c9072Fxy3 = C9074Fy0.A04;
            Instant time9 = boneMassRecord.getTime();
            C7384Etj.A0U(time9);
            ZoneOffset zoneOffset8 = boneMassRecord.getZoneOffset();
            Mass mass2 = boneMassRecord.getMass();
            C7384Etj.A0U(mass2);
            C9120Fyl c9120Fyl3 = C9072Fxy.A02;
            C9072Fxy c9072Fxy4 = new C9072Fxy(EnumC9160FzT.A02, mass2.getInGrams());
            Metadata metadata13 = boneMassRecord.getMetadata();
            C7384Etj.A0U(metadata13);
            c8998Fwb = new C9074Fy0(A03(metadata13), c9072Fxy4, time9, zoneOffset8);
        } else if (record instanceof CervicalMucusRecord) {
            CervicalMucusRecord cervicalMucusRecord = (CervicalMucusRecord) record;
            Instant time10 = cervicalMucusRecord.getTime();
            C7384Etj.A0U(time10);
            ZoneOffset zoneOffset9 = cervicalMucusRecord.getZoneOffset();
            int iA0D11 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A04, cervicalMucusRecord.getAppearance());
            int iA0D12 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A05, cervicalMucusRecord.getSensation());
            Metadata metadata14 = cervicalMucusRecord.getMetadata();
            C7384Etj.A0U(metadata14);
            c8998Fwb = new C8867Frg(A03(metadata14), time10, zoneOffset9, iA0D11, iA0D12);
        } else if (record instanceof CyclingPedalingCadenceRecord) {
            CyclingPedalingCadenceRecord cyclingPedalingCadenceRecord = (CyclingPedalingCadenceRecord) record;
            Instant startTime6 = cyclingPedalingCadenceRecord.getStartTime();
            C7384Etj.A0U(startTime6);
            ZoneOffset startZoneOffset6 = cyclingPedalingCadenceRecord.getStartZoneOffset();
            Instant endTime6 = cyclingPedalingCadenceRecord.getEndTime();
            C7384Etj.A0U(endTime6);
            ZoneOffset endZoneOffset6 = cyclingPedalingCadenceRecord.getEndZoneOffset();
            List<CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample> samples = cyclingPedalingCadenceRecord.getSamples();
            C7384Etj.A0U(samples);
            ArrayList arrayListA0i2 = AnonymousClass003.A0i(samples);
            for (CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample cyclingPedalingCadenceRecordSample : samples) {
                C7384Etj.A0X(cyclingPedalingCadenceRecordSample);
                Instant time11 = cyclingPedalingCadenceRecordSample.getTime();
                C7384Etj.A0U(time11);
                arrayListA0i2.add(new C8874Frn(cyclingPedalingCadenceRecordSample.getRevolutionsPerMinute(), time11));
            }
            List listA1I = Hr7.A1I(arrayListA0i2, 2);
            Metadata metadata15 = cyclingPedalingCadenceRecord.getMetadata();
            C7384Etj.A0U(metadata15);
            c8998Fwb = new C9007Fwk(A03(metadata15), startTime6, endTime6, startZoneOffset6, endZoneOffset6, listA1I);
        } else if (record instanceof DistanceRecord) {
            DistanceRecord distanceRecord = (DistanceRecord) record;
            Fy1 fy1 = C9061Fxj.A07;
            Instant startTime7 = distanceRecord.getStartTime();
            C7384Etj.A0U(startTime7);
            ZoneOffset startZoneOffset7 = distanceRecord.getStartZoneOffset();
            Instant endTime7 = distanceRecord.getEndTime();
            C7384Etj.A0U(endTime7);
            ZoneOffset endZoneOffset7 = distanceRecord.getEndZoneOffset();
            Length distance3 = distanceRecord.getDistance();
            C7384Etj.A0U(distance3);
            Fy1 fy1A042 = A04(distance3);
            Metadata metadata16 = distanceRecord.getMetadata();
            C7384Etj.A0U(metadata16);
            c8998Fwb = new C9061Fxj(A03(metadata16), fy1A042, startTime7, endTime7, startZoneOffset7, endZoneOffset7);
        } else if (record instanceof ElevationGainedRecord) {
            ElevationGainedRecord elevationGainedRecord = (ElevationGainedRecord) record;
            Fy1 fy12 = C9066Fxo.A08;
            Instant startTime8 = elevationGainedRecord.getStartTime();
            C7384Etj.A0U(startTime8);
            ZoneOffset startZoneOffset8 = elevationGainedRecord.getStartZoneOffset();
            Instant endTime8 = elevationGainedRecord.getEndTime();
            C7384Etj.A0U(endTime8);
            ZoneOffset endZoneOffset8 = elevationGainedRecord.getEndZoneOffset();
            Length elevation = elevationGainedRecord.getElevation();
            C7384Etj.A0U(elevation);
            Fy1 fy1A043 = A04(elevation);
            Metadata metadata17 = elevationGainedRecord.getMetadata();
            C7384Etj.A0U(metadata17);
            c8998Fwb = new C9066Fxo(A03(metadata17), fy1A043, startTime8, endTime8, startZoneOffset8, endZoneOffset8);
        } else if (record instanceof ExerciseSessionRecord) {
            ExerciseSessionRecord exerciseSessionRecord = (ExerciseSessionRecord) record;
            Instant startTime9 = exerciseSessionRecord.getStartTime();
            C7384Etj.A0U(startTime9);
            ZoneOffset startZoneOffset9 = exerciseSessionRecord.getStartZoneOffset();
            Instant endTime9 = exerciseSessionRecord.getEndTime();
            C7384Etj.A0U(endTime9);
            ZoneOffset endZoneOffset9 = exerciseSessionRecord.getEndZoneOffset();
            int iA0D13 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A09, exerciseSessionRecord.getExerciseType());
            CharSequence title2 = exerciseSessionRecord.getTitle();
            String string4 = title2 != null ? title2.toString() : null;
            CharSequence notes2 = exerciseSessionRecord.getNotes();
            String string5 = notes2 != null ? notes2.toString() : null;
            List<ExerciseLap> laps = exerciseSessionRecord.getLaps();
            C7384Etj.A0U(laps);
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(laps);
            for (ExerciseLap exerciseLap : laps) {
                C7384Etj.A0X(exerciseLap);
                Instant startTime10 = exerciseLap.getStartTime();
                C7384Etj.A0U(startTime10);
                Instant endTime10 = exerciseLap.getEndTime();
                C7384Etj.A0U(endTime10);
                Length length = exerciseLap.getLength();
                arrayListA0m4.add(new C9088FyF(length != null ? A04(length) : null, startTime10, endTime10));
            }
            List listA1I2 = Hr7.A1I(arrayListA0m4, 3);
            List<ExerciseSegment> segments = exerciseSessionRecord.getSegments();
            C7384Etj.A0U(segments);
            ArrayList arrayListA0m5 = AnonymousClass002.A0m(segments);
            for (ExerciseSegment exerciseSegment : segments) {
                C7384Etj.A0X(exerciseSegment);
                Set<Integer> set = C9068Fxq.A07;
                Instant startTime11 = exerciseSegment.getStartTime();
                C7384Etj.A0U(startTime11);
                Instant endTime11 = exerciseSegment.getEndTime();
                C7384Etj.A0U(endTime11);
                arrayListA0m5.add(new C9068Fxq(startTime11, endTime11, AbstractC7611F5y.A0D(AbstractC9055Fxd.A08, exerciseSegment.getSegmentType()), exerciseSegment.getRepetitionsCount()));
            }
            List listA1I3 = Hr7.A1I(arrayListA0m5, 4);
            Metadata metadata18 = exerciseSessionRecord.getMetadata();
            C7384Etj.A0U(metadata18);
            C9086FyD c9086FyDA033 = A03(metadata18);
            ExerciseRoute route = exerciseSessionRecord.getRoute();
            if (route != null) {
                List<ExerciseRoute.Location> routeLocations = route.getRouteLocations();
                C7384Etj.A0U(routeLocations);
                ArrayList arrayListA0m6 = AnonymousClass002.A0m(routeLocations);
                for (ExerciseRoute.Location location : routeLocations) {
                    Instant time12 = location.getTime();
                    C7384Etj.A0U(time12);
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    Length horizontalAccuracy = location.getHorizontalAccuracy();
                    Fy1 fy1A044 = null;
                    Fy1 fy1A045 = horizontalAccuracy != null ? A04(horizontalAccuracy) : null;
                    Length verticalAccuracy = location.getVerticalAccuracy();
                    Fy1 fy1A046 = verticalAccuracy != null ? A04(verticalAccuracy) : null;
                    Length altitude = location.getAltitude();
                    if (altitude != null) {
                        fy1A044 = A04(altitude);
                    }
                    arrayListA0m6.add(new C9034FxG(fy1A045, fy1A046, fy1A044, time12, latitude, longitude));
                }
                c9140Fz8 = new C9039FxL(new C9040FxM(arrayListA0m6));
            } else if (exerciseSessionRecord.hasRoute()) {
                c9140Fz8 = new C9139Fz7();
            } else {
                c9140Fz8 = new C9140Fz8();
            }
            c8998Fwb = new C9048FxW(c9140Fz8, c9086FyDA033, string4, string5, AbstractC8873Frm.A04() ? exerciseSessionRecord.getPlannedExerciseSessionId() : null, startTime9, endTime9, startZoneOffset9, endZoneOffset9, listA1I3, listA1I2, iA0D13);
        } else if (record instanceof FloorsClimbedRecord) {
            FloorsClimbedRecord floorsClimbedRecord = (FloorsClimbedRecord) record;
            Instant startTime12 = floorsClimbedRecord.getStartTime();
            C7384Etj.A0U(startTime12);
            ZoneOffset startZoneOffset10 = floorsClimbedRecord.getStartZoneOffset();
            Instant endTime12 = floorsClimbedRecord.getEndTime();
            C7384Etj.A0U(endTime12);
            ZoneOffset endZoneOffset10 = floorsClimbedRecord.getEndZoneOffset();
            double floors = floorsClimbedRecord.getFloors();
            Metadata metadata19 = floorsClimbedRecord.getMetadata();
            C7384Etj.A0U(metadata19);
            c8998Fwb = new C9001Fwe(A03(metadata19), startTime12, endTime12, startZoneOffset10, endZoneOffset10, floors);
        } else if (record instanceof HeartRateRecord) {
            HeartRateRecord heartRateRecord = (HeartRateRecord) record;
            Instant startTime13 = heartRateRecord.getStartTime();
            C7384Etj.A0U(startTime13);
            ZoneOffset startZoneOffset11 = heartRateRecord.getStartZoneOffset();
            Instant endTime13 = heartRateRecord.getEndTime();
            C7384Etj.A0U(endTime13);
            ZoneOffset endZoneOffset11 = heartRateRecord.getEndZoneOffset();
            List<HeartRateRecord.HeartRateSample> samples2 = heartRateRecord.getSamples();
            C7384Etj.A0U(samples2);
            ArrayList arrayListA0i3 = AnonymousClass003.A0i(samples2);
            for (HeartRateRecord.HeartRateSample heartRateSample : samples2) {
                C7384Etj.A0X(heartRateSample);
                Instant time13 = heartRateSample.getTime();
                C7384Etj.A0U(time13);
                arrayListA0i3.add(new C8879Frs(heartRateSample.getBeatsPerMinute(), time13));
            }
            List listA1I4 = Hr7.A1I(arrayListA0i3, 5);
            Metadata metadata20 = heartRateRecord.getMetadata();
            C7384Etj.A0U(metadata20);
            c8998Fwb = new C9005Fwi(A03(metadata20), startTime13, endTime13, startZoneOffset11, endZoneOffset11, listA1I4);
        } else if (record instanceof HeartRateVariabilityRmssdRecord) {
            HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecord = (HeartRateVariabilityRmssdRecord) record;
            Instant time14 = heartRateVariabilityRmssdRecord.getTime();
            C7384Etj.A0U(time14);
            ZoneOffset zoneOffset10 = heartRateVariabilityRmssdRecord.getZoneOffset();
            double heartRateVariabilityMillis = heartRateVariabilityRmssdRecord.getHeartRateVariabilityMillis();
            Metadata metadata21 = heartRateVariabilityRmssdRecord.getMetadata();
            C7384Etj.A0U(metadata21);
            c8998Fwb = new C8877Frq(A03(metadata21), time14, zoneOffset10, heartRateVariabilityMillis);
        } else if (record instanceof HeightRecord) {
            HeightRecord heightRecord = (HeightRecord) record;
            C8993FwW<Fy1> c8993FwW3 = C9063Fxl.A06;
            Instant time15 = heightRecord.getTime();
            C7384Etj.A0U(time15);
            ZoneOffset zoneOffset11 = heightRecord.getZoneOffset();
            Length height = heightRecord.getHeight();
            C7384Etj.A0U(height);
            Fy1 fy1A047 = A04(height);
            Metadata metadata22 = heightRecord.getMetadata();
            C7384Etj.A0U(metadata22);
            c8998Fwb = new C9063Fxl(A03(metadata22), fy1A047, time15, zoneOffset11);
        } else if (record instanceof HydrationRecord) {
            HydrationRecord hydrationRecord = (HydrationRecord) record;
            C8993FwW<C9079Fy6> c8993FwW4 = C9059Fxh.A06;
            Instant startTime14 = hydrationRecord.getStartTime();
            C7384Etj.A0U(startTime14);
            ZoneOffset startZoneOffset12 = hydrationRecord.getStartZoneOffset();
            Instant endTime14 = hydrationRecord.getEndTime();
            C7384Etj.A0U(endTime14);
            ZoneOffset endZoneOffset12 = hydrationRecord.getEndZoneOffset();
            Volume volume = hydrationRecord.getVolume();
            C7384Etj.A0U(volume);
            C9148FzH c9148FzH = C9079Fy6.A02;
            C9079Fy6 c9079Fy6 = new C9079Fy6(EnumC9092FyJ.A02, volume.getInLiters());
            Metadata metadata23 = hydrationRecord.getMetadata();
            C7384Etj.A0U(metadata23);
            c8998Fwb = new C9059Fxh(A03(metadata23), c9079Fy6, startTime14, endTime14, startZoneOffset12, endZoneOffset12);
        } else if (record instanceof IntermenstrualBleedingRecord) {
            IntermenstrualBleedingRecord intermenstrualBleedingRecord = (IntermenstrualBleedingRecord) record;
            Instant time16 = intermenstrualBleedingRecord.getTime();
            C7384Etj.A0U(time16);
            ZoneOffset zoneOffset12 = intermenstrualBleedingRecord.getZoneOffset();
            Metadata metadata24 = intermenstrualBleedingRecord.getMetadata();
            C7384Etj.A0U(metadata24);
            c8998Fwb = new C8872Frl(A03(metadata24), time16, zoneOffset12);
        } else if (record instanceof LeanBodyMassRecord) {
            LeanBodyMassRecord leanBodyMassRecord = (LeanBodyMassRecord) record;
            C9072Fxy c9072Fxy5 = C9071Fxx.A04;
            Instant time17 = leanBodyMassRecord.getTime();
            C7384Etj.A0U(time17);
            ZoneOffset zoneOffset13 = leanBodyMassRecord.getZoneOffset();
            Mass mass3 = leanBodyMassRecord.getMass();
            C7384Etj.A0U(mass3);
            C9120Fyl c9120Fyl4 = C9072Fxy.A02;
            C9072Fxy c9072Fxy6 = new C9072Fxy(EnumC9160FzT.A02, mass3.getInGrams());
            Metadata metadata25 = leanBodyMassRecord.getMetadata();
            C7384Etj.A0U(metadata25);
            c8998Fwb = new C9071Fxx(A03(metadata25), c9072Fxy6, time17, zoneOffset13);
        } else if (record instanceof MenstruationFlowRecord) {
            MenstruationFlowRecord menstruationFlowRecord = (MenstruationFlowRecord) record;
            Instant time18 = menstruationFlowRecord.getTime();
            C7384Etj.A0U(time18);
            ZoneOffset zoneOffset14 = menstruationFlowRecord.getZoneOffset();
            int iA0D14 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0C, menstruationFlowRecord.getFlow());
            Metadata metadata26 = menstruationFlowRecord.getMetadata();
            C7384Etj.A0U(metadata26);
            c8998Fwb = new C8866Frf(A03(metadata26), time18, zoneOffset14, iA0D14);
        } else if (record instanceof MenstruationPeriodRecord) {
            MenstruationPeriodRecord menstruationPeriodRecord = (MenstruationPeriodRecord) record;
            Duration duration3 = C9000Fwd.A05;
            Instant startTime15 = menstruationPeriodRecord.getStartTime();
            C7384Etj.A0U(startTime15);
            ZoneOffset startZoneOffset13 = menstruationPeriodRecord.getStartZoneOffset();
            Instant endTime15 = menstruationPeriodRecord.getEndTime();
            C7384Etj.A0U(endTime15);
            ZoneOffset endZoneOffset13 = menstruationPeriodRecord.getEndZoneOffset();
            Metadata metadata27 = menstruationPeriodRecord.getMetadata();
            C7384Etj.A0U(metadata27);
            c8998Fwb = new C9000Fwd(A03(metadata27), startTime15, endTime15, startZoneOffset13, endZoneOffset13);
        } else if (record instanceof NutritionRecord) {
            NutritionRecord nutritionRecord = (NutritionRecord) record;
            Instant startTime16 = nutritionRecord.getStartTime();
            C7384Etj.A0U(startTime16);
            ZoneOffset startZoneOffset14 = nutritionRecord.getStartZoneOffset();
            Instant endTime16 = nutritionRecord.getEndTime();
            C7384Etj.A0U(endTime16);
            ZoneOffset endZoneOffset14 = nutritionRecord.getEndZoneOffset();
            String mealName = nutritionRecord.getMealName();
            int iA0D15 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0B, nutritionRecord.getMealType());
            Metadata metadata28 = nutritionRecord.getMetadata();
            C7384Etj.A0U(metadata28);
            C9086FyD c9086FyDA034 = A03(metadata28);
            Mass biotin = nutritionRecord.getBiotin();
            C9072Fxy c9072FxyA05 = biotin != null ? A05(biotin) : null;
            Mass caffeine = nutritionRecord.getCaffeine();
            C9072Fxy c9072FxyA052 = caffeine != null ? A05(caffeine) : null;
            Mass calcium = nutritionRecord.getCalcium();
            C9072Fxy c9072FxyA053 = calcium != null ? A05(calcium) : null;
            Energy energy2 = nutritionRecord.getEnergy();
            if (energy2 == null) {
                c9076Fy3 = null;
            } else if (energy2.getInCalories() == Double.MIN_VALUE) {
                c9076Fy3 = null;
            } else {
                C9143FzC c9143FzC4 = C9076Fy3.A02;
                c9076Fy3 = new C9076Fy3(EnumC9090FyH.A02, energy2.getInCalories());
            }
            Energy energyFromFat = nutritionRecord.getEnergyFromFat();
            if (energyFromFat == null) {
                c9076Fy32 = null;
            } else if (energyFromFat.getInCalories() == Double.MIN_VALUE) {
                c9076Fy32 = null;
            } else {
                C9143FzC c9143FzC5 = C9076Fy3.A02;
                c9076Fy32 = new C9076Fy3(EnumC9090FyH.A02, energyFromFat.getInCalories());
            }
            Mass chloride = nutritionRecord.getChloride();
            C9072Fxy c9072FxyA054 = chloride != null ? A05(chloride) : null;
            Mass cholesterol = nutritionRecord.getCholesterol();
            C9072Fxy c9072FxyA055 = cholesterol != null ? A05(cholesterol) : null;
            Mass chromium = nutritionRecord.getChromium();
            C9072Fxy c9072FxyA056 = chromium != null ? A05(chromium) : null;
            Mass copper = nutritionRecord.getCopper();
            C9072Fxy c9072FxyA057 = copper != null ? A05(copper) : null;
            Mass dietaryFiber = nutritionRecord.getDietaryFiber();
            C9072Fxy c9072FxyA058 = dietaryFiber != null ? A05(dietaryFiber) : null;
            Mass folate = nutritionRecord.getFolate();
            C9072Fxy c9072FxyA059 = folate != null ? A05(folate) : null;
            Mass folicAcid = nutritionRecord.getFolicAcid();
            C9072Fxy c9072FxyA0510 = folicAcid != null ? A05(folicAcid) : null;
            Mass iodine = nutritionRecord.getIodine();
            C9072Fxy c9072FxyA0511 = iodine != null ? A05(iodine) : null;
            Mass iron = nutritionRecord.getIron();
            C9072Fxy c9072FxyA0512 = iron != null ? A05(iron) : null;
            Mass magnesium = nutritionRecord.getMagnesium();
            C9072Fxy c9072FxyA0513 = magnesium != null ? A05(magnesium) : null;
            Mass manganese = nutritionRecord.getManganese();
            C9072Fxy c9072FxyA0514 = manganese != null ? A05(manganese) : null;
            Mass molybdenum = nutritionRecord.getMolybdenum();
            C9072Fxy c9072FxyA0515 = molybdenum != null ? A05(molybdenum) : null;
            Mass monounsaturatedFat = nutritionRecord.getMonounsaturatedFat();
            C9072Fxy c9072FxyA0516 = monounsaturatedFat != null ? A05(monounsaturatedFat) : null;
            Mass niacin = nutritionRecord.getNiacin();
            C9072Fxy c9072FxyA0517 = niacin != null ? A05(niacin) : null;
            Mass pantothenicAcid = nutritionRecord.getPantothenicAcid();
            C9072Fxy c9072FxyA0518 = pantothenicAcid != null ? A05(pantothenicAcid) : null;
            Mass phosphorus = nutritionRecord.getPhosphorus();
            C9072Fxy c9072FxyA0519 = phosphorus != null ? A05(phosphorus) : null;
            Mass polyunsaturatedFat = nutritionRecord.getPolyunsaturatedFat();
            C9072Fxy c9072FxyA0520 = polyunsaturatedFat != null ? A05(polyunsaturatedFat) : null;
            Mass potassium = nutritionRecord.getPotassium();
            C9072Fxy c9072FxyA0521 = potassium != null ? A05(potassium) : null;
            Mass protein = nutritionRecord.getProtein();
            C9072Fxy c9072FxyA0522 = protein != null ? A05(protein) : null;
            Mass riboflavin = nutritionRecord.getRiboflavin();
            C9072Fxy c9072FxyA0523 = riboflavin != null ? A05(riboflavin) : null;
            Mass saturatedFat = nutritionRecord.getSaturatedFat();
            C9072Fxy c9072FxyA0524 = saturatedFat != null ? A05(saturatedFat) : null;
            Mass selenium = nutritionRecord.getSelenium();
            C9072Fxy c9072FxyA0525 = selenium != null ? A05(selenium) : null;
            Mass sodium = nutritionRecord.getSodium();
            C9072Fxy c9072FxyA0526 = sodium != null ? A05(sodium) : null;
            Mass sugar = nutritionRecord.getSugar();
            C9072Fxy c9072FxyA0527 = sugar != null ? A05(sugar) : null;
            Mass thiamin = nutritionRecord.getThiamin();
            C9072Fxy c9072FxyA0528 = thiamin != null ? A05(thiamin) : null;
            Mass totalCarbohydrate = nutritionRecord.getTotalCarbohydrate();
            C9072Fxy c9072FxyA0529 = totalCarbohydrate != null ? A05(totalCarbohydrate) : null;
            Mass totalFat = nutritionRecord.getTotalFat();
            C9072Fxy c9072FxyA0530 = totalFat != null ? A05(totalFat) : null;
            Mass transFat = nutritionRecord.getTransFat();
            C9072Fxy c9072FxyA0531 = transFat != null ? A05(transFat) : null;
            Mass unsaturatedFat = nutritionRecord.getUnsaturatedFat();
            C9072Fxy c9072FxyA0532 = unsaturatedFat != null ? A05(unsaturatedFat) : null;
            Mass vitaminA = nutritionRecord.getVitaminA();
            C9072Fxy c9072FxyA0533 = vitaminA != null ? A05(vitaminA) : null;
            Mass vitaminB12 = nutritionRecord.getVitaminB12();
            C9072Fxy c9072FxyA0534 = vitaminB12 != null ? A05(vitaminB12) : null;
            Mass vitaminB6 = nutritionRecord.getVitaminB6();
            C9072Fxy c9072FxyA0535 = vitaminB6 != null ? A05(vitaminB6) : null;
            Mass vitaminC = nutritionRecord.getVitaminC();
            C9072Fxy c9072FxyA0536 = vitaminC != null ? A05(vitaminC) : null;
            Mass vitaminD = nutritionRecord.getVitaminD();
            C9072Fxy c9072FxyA0537 = vitaminD != null ? A05(vitaminD) : null;
            Mass vitaminE = nutritionRecord.getVitaminE();
            C9072Fxy c9072FxyA0538 = vitaminE != null ? A05(vitaminE) : null;
            Mass vitaminK = nutritionRecord.getVitaminK();
            C9072Fxy c9072FxyA0539 = vitaminK != null ? A05(vitaminK) : null;
            Mass zinc = nutritionRecord.getZinc();
            c8998Fwb = new C9046FxU(c9086FyDA034, c9076Fy3, c9076Fy32, c9072FxyA05, c9072FxyA052, c9072FxyA053, c9072FxyA054, c9072FxyA055, c9072FxyA056, c9072FxyA057, c9072FxyA058, c9072FxyA059, c9072FxyA0510, c9072FxyA0511, c9072FxyA0512, c9072FxyA0513, c9072FxyA0514, c9072FxyA0515, c9072FxyA0516, c9072FxyA0517, c9072FxyA0518, c9072FxyA0519, c9072FxyA0520, c9072FxyA0521, c9072FxyA0522, c9072FxyA0523, c9072FxyA0524, c9072FxyA0525, c9072FxyA0526, c9072FxyA0527, c9072FxyA0528, c9072FxyA0529, c9072FxyA0530, c9072FxyA0531, c9072FxyA0532, c9072FxyA0533, c9072FxyA0534, c9072FxyA0535, c9072FxyA0536, c9072FxyA0537, c9072FxyA0538, c9072FxyA0539, zinc != null ? A05(zinc) : null, mealName, startTime16, endTime16, startZoneOffset14, endZoneOffset14, iA0D15);
        } else if (record instanceof OvulationTestRecord) {
            OvulationTestRecord ovulationTestRecord = (OvulationTestRecord) record;
            Map<Integer, String> map4 = C8869Fri.A04;
            Instant time19 = ovulationTestRecord.getTime();
            C7384Etj.A0U(time19);
            ZoneOffset zoneOffset15 = ovulationTestRecord.getZoneOffset();
            int iA0D16 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0E, ovulationTestRecord.getResult());
            Metadata metadata29 = ovulationTestRecord.getMetadata();
            C7384Etj.A0U(metadata29);
            c8998Fwb = new C8869Fri(A03(metadata29), time19, zoneOffset15, iA0D16);
        } else if (record instanceof OxygenSaturationRecord) {
            OxygenSaturationRecord oxygenSaturationRecord = (OxygenSaturationRecord) record;
            Instant time20 = oxygenSaturationRecord.getTime();
            C7384Etj.A0U(time20);
            ZoneOffset zoneOffset16 = oxygenSaturationRecord.getZoneOffset();
            Percentage percentage2 = oxygenSaturationRecord.getPercentage();
            C7384Etj.A0U(percentage2);
            Hj8 hj82 = new Hj8(percentage2.getValue());
            Metadata metadata30 = oxygenSaturationRecord.getMetadata();
            C7384Etj.A0U(metadata30);
            c8998Fwb = new C8951FuQ(A03(metadata30), hj82, time20, zoneOffset16);
        } else if (record instanceof PowerRecord) {
            PowerRecord powerRecord = (PowerRecord) record;
            Instant startTime17 = powerRecord.getStartTime();
            C7384Etj.A0U(startTime17);
            ZoneOffset startZoneOffset15 = powerRecord.getStartZoneOffset();
            Instant endTime17 = powerRecord.getEndTime();
            C7384Etj.A0U(endTime17);
            ZoneOffset endZoneOffset15 = powerRecord.getEndZoneOffset();
            List<PowerRecord.PowerRecordSample> samples3 = powerRecord.getSamples();
            C7384Etj.A0U(samples3);
            ArrayList arrayListA0i4 = AnonymousClass003.A0i(samples3);
            for (PowerRecord.PowerRecordSample powerRecordSample : samples3) {
                C7384Etj.A0X(powerRecordSample);
                Instant time21 = powerRecordSample.getTime();
                C7384Etj.A0U(time21);
                Power power = powerRecordSample.getPower();
                C7384Etj.A0U(power);
                C9144FzD c9144FzD3 = C9077Fy4.A02;
                arrayListA0i4.add(new C9081Fy8(new C9077Fy4(EnumC9091FyI.A03, power.getInWatts()), time21));
            }
            List listA1I5 = Hr7.A1I(arrayListA0i4, 6);
            Metadata metadata31 = powerRecord.getMetadata();
            C7384Etj.A0U(metadata31);
            c8998Fwb = new C9062Fxk(A03(metadata31), startTime17, endTime17, startZoneOffset15, endZoneOffset15, listA1I5);
        } else if (record instanceof RespiratoryRateRecord) {
            RespiratoryRateRecord respiratoryRateRecord = (RespiratoryRateRecord) record;
            Instant time22 = respiratoryRateRecord.getTime();
            C7384Etj.A0U(time22);
            ZoneOffset zoneOffset17 = respiratoryRateRecord.getZoneOffset();
            double rate = respiratoryRateRecord.getRate();
            Metadata metadata32 = respiratoryRateRecord.getMetadata();
            C7384Etj.A0U(metadata32);
            c8998Fwb = new C8876Frp(A03(metadata32), time22, zoneOffset17, rate);
        } else if (record instanceof RestingHeartRateRecord) {
            RestingHeartRateRecord restingHeartRateRecord = (RestingHeartRateRecord) record;
            Instant time23 = restingHeartRateRecord.getTime();
            C7384Etj.A0U(time23);
            ZoneOffset zoneOffset18 = restingHeartRateRecord.getZoneOffset();
            long beatsPerMinute = restingHeartRateRecord.getBeatsPerMinute();
            Metadata metadata33 = restingHeartRateRecord.getMetadata();
            C7384Etj.A0U(metadata33);
            c8998Fwb = new C8880Frt(A03(metadata33), time23, zoneOffset18, beatsPerMinute);
        } else if (record instanceof SexualActivityRecord) {
            SexualActivityRecord sexualActivityRecord = (SexualActivityRecord) record;
            Instant time24 = sexualActivityRecord.getTime();
            C7384Etj.A0U(time24);
            ZoneOffset zoneOffset19 = sexualActivityRecord.getZoneOffset();
            int iA0D17 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0G, sexualActivityRecord.getProtectionUsed());
            Metadata metadata34 = sexualActivityRecord.getMetadata();
            C7384Etj.A0U(metadata34);
            c8998Fwb = new C8870Frj(A03(metadata34), time24, zoneOffset19, iA0D17);
        } else if (record instanceof SleepSessionRecord) {
            SleepSessionRecord sleepSessionRecord = (SleepSessionRecord) record;
            Instant startTime18 = sleepSessionRecord.getStartTime();
            C7384Etj.A0U(startTime18);
            ZoneOffset startZoneOffset16 = sleepSessionRecord.getStartZoneOffset();
            Instant endTime18 = sleepSessionRecord.getEndTime();
            C7384Etj.A0U(endTime18);
            ZoneOffset endZoneOffset16 = sleepSessionRecord.getEndZoneOffset();
            Metadata metadata35 = sleepSessionRecord.getMetadata();
            C7384Etj.A0U(metadata35);
            C9086FyD c9086FyDA035 = A03(metadata35);
            CharSequence title3 = sleepSessionRecord.getTitle();
            String string6 = title3 != null ? title3.toString() : null;
            CharSequence notes3 = sleepSessionRecord.getNotes();
            String string7 = notes3 != null ? notes3.toString() : null;
            List<SleepSessionRecord.Stage> stages = sleepSessionRecord.getStages();
            C7384Etj.A0U(stages);
            ArrayList arrayListA0i5 = AnonymousClass003.A0i(stages);
            for (SleepSessionRecord.Stage stage : stages) {
                C7384Etj.A0X(stage);
                Instant startTime19 = stage.getStartTime();
                C7384Etj.A0U(startTime19);
                Instant endTime19 = stage.getEndTime();
                C7384Etj.A0U(endTime19);
                arrayListA0i5.add(new C9004Fwh(startTime19, endTime19, AbstractC7611F5y.A0D(AbstractC9055Fxd.A0I, stage.getType())));
            }
            c8998Fwb = new C9003Fwg(c9086FyDA035, string6, string7, startTime18, endTime18, startZoneOffset16, endZoneOffset16, Hr7.A1I(arrayListA0i5, 7));
        } else if (record instanceof SpeedRecord) {
            SpeedRecord speedRecord = (SpeedRecord) record;
            Instant startTime20 = speedRecord.getStartTime();
            C7384Etj.A0U(startTime20);
            ZoneOffset startZoneOffset17 = speedRecord.getStartZoneOffset();
            Instant endTime20 = speedRecord.getEndTime();
            C7384Etj.A0U(endTime20);
            ZoneOffset endZoneOffset17 = speedRecord.getEndZoneOffset();
            List<SpeedRecord.SpeedRecordSample> samples4 = speedRecord.getSamples();
            C7384Etj.A0U(samples4);
            ArrayList arrayListA0i6 = AnonymousClass003.A0i(samples4);
            for (SpeedRecord.SpeedRecordSample speedRecordSample : samples4) {
                C7384Etj.A0X(speedRecordSample);
                Instant time25 = speedRecordSample.getTime();
                C7384Etj.A0U(time25);
                Velocity speed = speedRecordSample.getSpeed();
                C7384Etj.A0U(speed);
                C9147FzG c9147FzG2 = C9078Fy5.A02;
                arrayListA0i6.add(new C9028Fx8(new C9078Fy5(EnumC9094FyL.A02, speed.getInMetersPerSecond()), time25));
            }
            List listA1I6 = Hr7.A1I(arrayListA0i6, 8);
            Metadata metadata36 = speedRecord.getMetadata();
            C7384Etj.A0U(metadata36);
            c8998Fwb = new C9060Fxi(A03(metadata36), startTime20, endTime20, startZoneOffset17, endZoneOffset17, listA1I6);
        } else if (record instanceof StepsCadenceRecord) {
            StepsCadenceRecord stepsCadenceRecord = (StepsCadenceRecord) record;
            Instant startTime21 = stepsCadenceRecord.getStartTime();
            C7384Etj.A0U(startTime21);
            ZoneOffset startZoneOffset18 = stepsCadenceRecord.getStartZoneOffset();
            Instant endTime21 = stepsCadenceRecord.getEndTime();
            C7384Etj.A0U(endTime21);
            ZoneOffset endZoneOffset18 = stepsCadenceRecord.getEndZoneOffset();
            List<StepsCadenceRecord.StepsCadenceRecordSample> samples5 = stepsCadenceRecord.getSamples();
            C7384Etj.A0U(samples5);
            ArrayList arrayListA0i7 = AnonymousClass003.A0i(samples5);
            for (StepsCadenceRecord.StepsCadenceRecordSample stepsCadenceRecordSample : samples5) {
                C7384Etj.A0X(stepsCadenceRecordSample);
                Instant time26 = stepsCadenceRecordSample.getTime();
                C7384Etj.A0U(time26);
                arrayListA0i7.add(new C8875Fro(stepsCadenceRecordSample.getRate(), time26));
            }
            List listA1I7 = Hr7.A1I(arrayListA0i7, 9);
            Metadata metadata37 = stepsCadenceRecord.getMetadata();
            C7384Etj.A0U(metadata37);
            c8998Fwb = new C9006Fwj(A03(metadata37), startTime21, endTime21, startZoneOffset18, endZoneOffset18, listA1I7);
        } else if (record instanceof StepsRecord) {
            StepsRecord stepsRecord = (StepsRecord) record;
            Instant startTime22 = stepsRecord.getStartTime();
            C7384Etj.A0U(startTime22);
            ZoneOffset startZoneOffset19 = stepsRecord.getStartZoneOffset();
            Instant endTime22 = stepsRecord.getEndTime();
            C7384Etj.A0U(endTime22);
            ZoneOffset endZoneOffset19 = stepsRecord.getEndZoneOffset();
            long count = stepsRecord.getCount();
            Metadata metadata38 = stepsRecord.getMetadata();
            C7384Etj.A0U(metadata38);
            c8998Fwb = new C8999Fwc(A03(metadata38), startTime22, endTime22, startZoneOffset19, endZoneOffset19, count);
        } else if (record instanceof TotalCaloriesBurnedRecord) {
            TotalCaloriesBurnedRecord totalCaloriesBurnedRecord = (TotalCaloriesBurnedRecord) record;
            C9076Fy3 c9076Fy34 = C9057Fxf.A07;
            Instant startTime23 = totalCaloriesBurnedRecord.getStartTime();
            C7384Etj.A0U(startTime23);
            ZoneOffset startZoneOffset20 = totalCaloriesBurnedRecord.getStartZoneOffset();
            Instant endTime23 = totalCaloriesBurnedRecord.getEndTime();
            C7384Etj.A0U(endTime23);
            ZoneOffset endZoneOffset20 = totalCaloriesBurnedRecord.getEndZoneOffset();
            Energy energy3 = totalCaloriesBurnedRecord.getEnergy();
            C7384Etj.A0U(energy3);
            C9143FzC c9143FzC6 = C9076Fy3.A02;
            C9076Fy3 c9076Fy35 = new C9076Fy3(EnumC9090FyH.A02, energy3.getInCalories());
            Metadata metadata39 = totalCaloriesBurnedRecord.getMetadata();
            C7384Etj.A0U(metadata39);
            c8998Fwb = new C9057Fxf(A03(metadata39), c9076Fy35, startTime23, endTime23, startZoneOffset20, endZoneOffset20);
        } else if (record instanceof Vo2MaxRecord) {
            Vo2MaxRecord vo2MaxRecord = (Vo2MaxRecord) record;
            Instant time27 = vo2MaxRecord.getTime();
            C7384Etj.A0U(time27);
            ZoneOffset zoneOffset20 = vo2MaxRecord.getZoneOffset();
            double vo2MillilitersPerMinuteKilogram = vo2MaxRecord.getVo2MillilitersPerMinuteKilogram();
            int iA0D18 = AbstractC7611F5y.A0D(AbstractC9055Fxd.A0J, vo2MaxRecord.getMeasurementMethod());
            Metadata metadata40 = vo2MaxRecord.getMetadata();
            C7384Etj.A0U(metadata40);
            c8998Fwb = new C8878Frr(A03(metadata40), time27, zoneOffset20, vo2MillilitersPerMinuteKilogram, iA0D18);
        } else if (record instanceof WeightRecord) {
            WeightRecord weightRecord = (WeightRecord) record;
            C8993FwW<C9072Fxy> c8993FwW5 = C9067Fxp.A05;
            Instant time28 = weightRecord.getTime();
            C7384Etj.A0U(time28);
            ZoneOffset zoneOffset21 = weightRecord.getZoneOffset();
            Mass weight = weightRecord.getWeight();
            C7384Etj.A0U(weight);
            C9120Fyl c9120Fyl5 = C9072Fxy.A02;
            C9072Fxy c9072Fxy7 = new C9072Fxy(EnumC9160FzT.A02, weight.getInGrams());
            Metadata metadata41 = weightRecord.getMetadata();
            C7384Etj.A0U(metadata41);
            c8998Fwb = new C9067Fxp(A03(metadata41), c9072Fxy7, time28, zoneOffset21);
        } else if (record instanceof WheelchairPushesRecord) {
            WheelchairPushesRecord wheelchairPushesRecord = (WheelchairPushesRecord) record;
            Instant startTime24 = wheelchairPushesRecord.getStartTime();
            C7384Etj.A0U(startTime24);
            ZoneOffset startZoneOffset21 = wheelchairPushesRecord.getStartZoneOffset();
            Instant endTime24 = wheelchairPushesRecord.getEndTime();
            C7384Etj.A0U(endTime24);
            ZoneOffset endZoneOffset21 = wheelchairPushesRecord.getEndZoneOffset();
            long count2 = wheelchairPushesRecord.getCount();
            Metadata metadata42 = wheelchairPushesRecord.getMetadata();
            C7384Etj.A0U(metadata42);
            c8998Fwb = new C8998Fwb(A03(metadata42), startTime24, endTime24, startZoneOffset21, endZoneOffset21, count2);
        } else {
            throw BV5.A0O(record, "Unsupported record ");
        }
        return c8998Fwb;
    }
}
