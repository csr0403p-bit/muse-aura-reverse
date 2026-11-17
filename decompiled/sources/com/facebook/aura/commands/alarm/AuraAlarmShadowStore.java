package com.facebook.aura.commands.alarm;

import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C9258GBl;
import X.C9hr;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraAlarmShadowStore {
    public static final Companion Companion = new Companion();
    public static final String KEY_ALARMS = "alarms";
    public static final String PREFS_NAME = "aura_alarm_shadow";
    public static final C9hr<List<ShadowAlarm>> SERIALIZER;
    public static final String TAG = "AuraAlarmShadowStore";
    public static volatile AuraAlarmShadowStore instance;
    public final InterfaceC2261BLa mutex;
    public final SharedPreferences prefs;

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "add", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$add$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.add(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "addAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$addAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C110711 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110711(HtJ<? super C110711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.addAll(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$clear$1, reason: invalid class name and case insensitive filesystem */
    public final class C110721 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C110721(HtJ<? super C110721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.clear(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "findById", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$findById$1, reason: invalid class name and case insensitive filesystem */
    public final class C110731 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110731(HtJ<? super C110731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.findById(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "removeById", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeById$1, reason: invalid class name and case insensitive filesystem */
    public final class C110741 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110741(HtJ<? super C110741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.removeById(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "removeByLabel", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeByLabel$1, reason: invalid class name and case insensitive filesystem */
    public final class C110751 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110751(HtJ<? super C110751> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.removeByLabel(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraAlarmShadowStore", f = "AuraAlarmShadowStore.kt", l = {143}, m = "snapshot", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraAlarmShadowStore$snapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C110761 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C110761(HtJ<? super C110761> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAlarmShadowStore.this.snapshot(this);
        }
    }

    static {
        ShadowAlarm$$serializer shadowAlarm$$serializer = ShadowAlarm$$serializer.INSTANCE;
        C7384Etj.A0Y(shadowAlarm$$serializer, 0);
        SERIALIZER = C3cG.A19(shadowAlarm$$serializer);
    }

    private final List<ShadowAlarm> readUnlocked() {
        String string = this.prefs.getString("alarms", null);
        if (string == null) {
            return C0881AGi.A00;
        }
        try {
            return (List) HatchJsonKt.HatchJson.A00(string, SERIALIZER);
        } catch (Exception e) {
            CFK.A04(TAG, FGI.A0M("Corrupt shadow alarms, resetting: ", e.getMessage()));
            this.prefs.edit().remove("alarms").apply();
            return C0881AGi.A00;
        }
    }

    private final void writeUnlocked(List<ShadowAlarm> list) {
        this.prefs.edit().putString("alarms", HatchJsonKt.HatchJson.A02(list, SERIALIZER)).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object add(com.facebook.aura.commands.alarm.ShadowAlarm r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.AnonymousClass1
            if (r0 == 0) goto L2a
            r4 = r9
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$add$1 r4 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            java.lang.Object r5 = r4.L$1
            X.BLa r5 = (X.InterfaceC2261BLa) r5
            java.lang.Object r8 = r4.L$0
            com.facebook.aura.commands.alarm.ShadowAlarm r8 = (com.facebook.aura.commands.alarm.ShadowAlarm) r8
            X.Hwg.A00(r3)
            goto L47
        L2a:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$add$1 r4 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$add$1
            r4.<init>(r9)
            goto L12
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r3)
            X.BLa r5 = r7.mutex
            r4.L$0 = r8
            r4.L$1 = r5
            r4.label = r0
            java.lang.Object r0 = r5.APs(r6, r4)
            if (r0 != r2) goto L47
            return r2
        L47:
            java.util.List r0 = r7.readUnlocked()     // Catch: java.lang.Throwable -> L75
            java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L75
        L53:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L68
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L75
            r0 = r2
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r0.id     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r8.id     // Catch: java.lang.Throwable -> L75
            X.AnonymousClass006.A1O(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L75
            goto L53
        L68:
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0Q(r8, r4)     // Catch: java.lang.Throwable -> L75
            r7.writeUnlocked(r0)     // Catch: java.lang.Throwable -> L75
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L75
            r5.Ahe(r6)
            return r2
        L75:
            r0 = move-exception
            r5.Ahe(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.add(com.facebook.aura.commands.alarm.ShadowAlarm, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addAll(java.util.List<com.facebook.aura.commands.alarm.ShadowAlarm> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110711
            if (r0 == 0) goto L2a
            r6 = r9
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$addAll$1 r6 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110711) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L30
            java.lang.Object r4 = r6.L$1
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r8 = r6.L$0
            java.util.List r8 = (java.util.List) r8
            X.Hwg.A00(r3)
            goto L50
        L2a:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$addAll$1 r6 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$addAll$1
            r6.<init>(r9)
            goto L12
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r3)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L41
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L41:
            X.BLa r4 = r7.mutex
            r6.L$0 = r8
            r6.L$1 = r4
            r6.label = r1
            java.lang.Object r0 = r4.APs(r5, r6)
            if (r0 != r2) goto L50
            return r2
        L50:
            java.util.HashSet r6 = X.C60O.A13()     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L96
        L58:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L96
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L96
            r6.add(r0)     // Catch: java.lang.Throwable -> L96
            goto L58
        L6a:
            java.util.List r0 = r7.readUnlocked()     // Catch: java.lang.Throwable -> L96
            java.util.ArrayList r3 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L96
        L76:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L96
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L96
            X.C60R.A1I(r0, r1, r6, r3)     // Catch: java.lang.Throwable -> L96
            goto L76
        L89:
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r8, r3)     // Catch: java.lang.Throwable -> L96
            r7.writeUnlocked(r0)     // Catch: java.lang.Throwable -> L96
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L96
            r4.Ahe(r5)
            return r2
        L96:
            r0 = move-exception
            r4.Ahe(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.addAll(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowAlarm>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110721
            if (r0 == 0) goto L26
            r5 = r7
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$clear$1 r5 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110721) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L2c
            java.lang.Object r1 = r5.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r4)
            goto L41
        L26:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$clear$1 r5 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$clear$1
            r5.<init>(r7)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r4)
            X.BLa r1 = r6.mutex
            r5.L$0 = r1
            r5.label = r0
            java.lang.Object r0 = r1.APs(r2, r5)
            if (r0 != r3) goto L41
            return r3
        L41:
            java.util.List r3 = r6.readUnlocked()     // Catch: java.lang.Throwable -> L4e
            X.AGi r0 = X.C0881AGi.A00     // Catch: java.lang.Throwable -> L4e
            r6.writeUnlocked(r0)     // Catch: java.lang.Throwable -> L4e
            r1.Ahe(r2)
            return r3
        L4e:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.clear(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findById(java.lang.String r8, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowAlarm> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110731
            if (r0 == 0) goto L28
            r6 = r9
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$findById$1 r6 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110731) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r6.label
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r0) goto L2e
            java.lang.Object r3 = r6.L$1
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r8 = r6.L$0
            X.Hwg.A00(r5)
            goto L45
        L28:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$findById$1 r6 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$findById$1
            r6.<init>(r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r5)
            X.BLa r3 = r7.mutex
            r6.L$0 = r8
            r6.L$1 = r3
            r6.label = r0
            java.lang.Object r0 = r3.APs(r4, r6)
            if (r0 != r1) goto L45
            return r1
        L45:
            java.util.List r0 = r7.readUnlocked()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        L4d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L65
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L6b
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L6b
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L4d
        L62:
            com.facebook.aura.commands.alarm.ShadowAlarm r1 = (com.facebook.aura.commands.alarm.ShadowAlarm) r1     // Catch: java.lang.Throwable -> L6b
            goto L67
        L65:
            r1 = r4
            goto L62
        L67:
            r3.Ahe(r4)
            return r1
        L6b:
            r0 = move-exception
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.findById(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeById(java.lang.String r8, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowAlarm> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110741
            if (r0 == 0) goto L28
            r4 = r9
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeById$1 r4 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110741) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2e
            java.lang.Object r5 = r4.L$1
            X.BLa r5 = (X.InterfaceC2261BLa) r5
            java.lang.Object r8 = r4.L$0
            X.Hwg.A00(r3)
            goto L45
        L28:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeById$1 r4 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeById$1
            r4.<init>(r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r3)
            X.BLa r5 = r7.mutex
            r4.L$0 = r8
            r4.L$1 = r5
            r4.label = r0
            java.lang.Object r0 = r5.APs(r6, r4)
            if (r0 != r2) goto L45
            return r2
        L45:
            java.util.List r2 = r7.readUnlocked()     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L8d
        L4d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L67
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L8d
            r0 = r4
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L8d
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L4d
        L62:
            com.facebook.aura.commands.alarm.ShadowAlarm r4 = (com.facebook.aura.commands.alarm.ShadowAlarm) r4     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L69
            goto L88
        L67:
            r4 = r6
            goto L62
        L69:
            java.util.ArrayList r3 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8d
        L71:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L84
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L8d
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L8d
            X.AnonymousClass006.A1O(r0, r8, r1, r3)     // Catch: java.lang.Throwable -> L8d
            goto L71
        L84:
            r7.writeUnlocked(r3)     // Catch: java.lang.Throwable -> L8d
            goto L89
        L88:
            r4 = r6
        L89:
            r5.Ahe(r6)
            return r4
        L8d:
            r0 = move-exception
            r5.Ahe(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.removeById(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeByLabel(java.lang.String r9, X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowAlarm>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110751
            if (r0 == 0) goto L28
            r3 = r10
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeByLabel$1 r3 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110751) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2e
            java.lang.Object r4 = r3.L$1
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r9 = r3.L$0
            X.Hwg.A00(r2)
            goto L45
        L28:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeByLabel$1 r3 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$removeByLabel$1
            r3.<init>(r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r2)
            X.BLa r4 = r8.mutex
            r3.L$0 = r9
            r3.L$1 = r4
            r3.label = r0
            java.lang.Object r0 = r4.APs(r5, r3)
            if (r0 != r6) goto L45
            return r6
        L45:
            java.util.List r7 = r8.readUnlocked()     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r6 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L92
        L51:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L92
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.label     // Catch: java.lang.Throwable -> L92
            boolean r0 = X.C7384Etj.areEqual(r0, r9)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L51
            r6.add(r1)     // Catch: java.lang.Throwable -> L92
            goto L51
        L6a:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L8e
            java.util.ArrayList r3 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L92
        L78:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L92
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.label     // Catch: java.lang.Throwable -> L92
            X.AnonymousClass006.A1O(r0, r9, r1, r3)     // Catch: java.lang.Throwable -> L92
            goto L78
        L8b:
            r8.writeUnlocked(r3)     // Catch: java.lang.Throwable -> L92
        L8e:
            r4.Ahe(r5)
            return r6
        L92:
            r0 = move-exception
            r4.Ahe(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.removeByLabel(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapshot(X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowAlarm>> r30) {
        /*
            r29 = this;
            r3 = r30
            boolean r0 = r3 instanceof com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110761
            r4 = r29
            if (r0 == 0) goto L2a
            r5 = r3
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$snapshot$1 r5 = (com.facebook.aura.commands.alarm.AuraAlarmShadowStore.C110761) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r3 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L35
            if (r0 != r2) goto L30
            java.lang.Object r0 = r5.L$0
            X.BLa r0 = (X.InterfaceC2261BLa) r0
            X.Hwg.A00(r3)
            goto L45
        L2a:
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$snapshot$1 r5 = new com.facebook.aura.commands.alarm.AuraAlarmShadowStore$snapshot$1
            r5.<init>(r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r3)
            X.BLa r0 = r4.mutex
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r2 = r0.APs(r10, r5)
            if (r2 != r1) goto L45
            return r1
        L45:
            long r26 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb7
            java.util.List r5 = r4.readUnlocked()     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r1 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> Lb7
            java.util.Iterator r8 = r5.iterator()     // Catch: java.lang.Throwable -> Lb7
        L55:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto Laa
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Lb7
            com.facebook.aura.commands.alarm.ShadowAlarm r9 = (com.facebook.aura.commands.alarm.ShadowAlarm) r9     // Catch: java.lang.Throwable -> Lb7
            com.facebook.aura.commands.alarm.Recurrence r25 = r9.effectiveRecurrence()     // Catch: java.lang.Throwable -> Lb7
            long r2 = r9.triggerTimeMs     // Catch: java.lang.Throwable -> Lb7
            int r6 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r6 > 0) goto La4
            if (r25 == 0) goto La3
            com.facebook.aura.commands.alarm.AlarmTimeUtil r22 = com.facebook.aura.commands.alarm.AlarmTimeUtil.INSTANCE     // Catch: java.lang.Throwable -> Lb7
            int r7 = r9.hour     // Catch: java.lang.Throwable -> Lb7
            int r6 = r9.minute     // Catch: java.lang.Throwable -> Lb7
            long r2 = r9.anchorMs     // Catch: java.lang.Throwable -> Lb7
            java.time.ZoneId r30 = r9.zoneId()     // Catch: java.lang.Throwable -> Lb7
            r28 = r2
            r23 = r7
            r24 = r6
            long r14 = r22.computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(r23, r24, r25, r26, r28, r30)     // Catch: java.lang.Throwable -> Lb7
            r6 = -1
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 == 0) goto La3
            r24 = 4079(0xfef, float:5.716E-42)
            r12 = 0
            r20 = 0
            r11 = r10
            r13 = r12
            r16 = r10
            r17 = r12
            r18 = r12
            r19 = r10
            r22 = r12
            r23 = r10
            r25 = r10
            com.facebook.aura.commands.alarm.ShadowAlarm r9 = com.facebook.aura.commands.alarm.ShadowAlarm.copy$default(r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> Lb7
            goto La4
        La3:
            r9 = r10
        La4:
            if (r9 == 0) goto L55
            r1.add(r9)     // Catch: java.lang.Throwable -> Lb7
            goto L55
        Laa:
            boolean r2 = r1.equals(r5)     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lb3
            r4.writeUnlocked(r1)     // Catch: java.lang.Throwable -> Lb7
        Lb3:
            r0.Ahe(r10)
            return r1
        Lb7:
            r1 = move-exception
            r0.Ahe(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraAlarmShadowStore.snapshot(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final AuraAlarmShadowStore getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            AuraAlarmShadowStore auraAlarmShadowStore = AuraAlarmShadowStore.instance;
            if (auraAlarmShadowStore == null) {
                synchronized (this) {
                    auraAlarmShadowStore = AuraAlarmShadowStore.instance;
                    if (auraAlarmShadowStore == null) {
                        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(AuraAlarmShadowStore.PREFS_NAME, 0);
                        C7384Etj.A0U(sharedPreferences);
                        auraAlarmShadowStore = new AuraAlarmShadowStore(sharedPreferences);
                        AuraAlarmShadowStore.instance = auraAlarmShadowStore;
                    }
                }
            }
            return auraAlarmShadowStore;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraAlarmShadowStore(SharedPreferences sharedPreferences) {
        this.prefs = sharedPreferences;
        this.mutex = new C9258GBl();
    }

    public /* synthetic */ AuraAlarmShadowStore(SharedPreferences sharedPreferences, C06H c06h) {
        this(sharedPreferences);
    }
}
