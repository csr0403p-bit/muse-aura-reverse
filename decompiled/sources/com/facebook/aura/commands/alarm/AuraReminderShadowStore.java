package com.facebook.aura.commands.alarm;

import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C9258GBl;
import X.C9hr;
import X.CFK;
import X.F0C;
import X.FGI;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraReminderShadowStore {
    public static final Companion Companion = new Companion();
    public static final String KEY_REMINDERS = "reminders";
    public static final String PREFS_NAME = "aura_reminder_shadow";
    public static final C9hr<List<ShadowReminder>> SERIALIZER;
    public static final String TAG = "AuraReminderShadowStore";
    public static volatile AuraReminderShadowStore instance;
    public final InterfaceC2261BLa mutex;
    public final SharedPreferences prefs;

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "add", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$add$1, reason: invalid class name */
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
            return AuraReminderShadowStore.this.add(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "addAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$addAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C110771 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110771(HtJ<? super C110771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.addAll(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$clear$1, reason: invalid class name and case insensitive filesystem */
    public final class C110781 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C110781(HtJ<? super C110781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.clear(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "findById", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$findById$1, reason: invalid class name and case insensitive filesystem */
    public final class C110791 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110791(HtJ<? super C110791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.findById(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "findByLabel", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$findByLabel$1, reason: invalid class name and case insensitive filesystem */
    public final class C110801 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110801(HtJ<? super C110801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.findByLabel(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "removeById", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$removeById$1, reason: invalid class name and case insensitive filesystem */
    public final class C110811 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110811(HtJ<? super C110811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.removeById(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AuraReminderShadowStore", f = "AuraReminderShadowStore.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "snapshot", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AuraReminderShadowStore$snapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C110821 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C110821(HtJ<? super C110821> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraReminderShadowStore.this.snapshot(this);
        }
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = ShadowReminder.$childSerializers;
        ShadowReminder$$serializer shadowReminder$$serializer = ShadowReminder$$serializer.INSTANCE;
        C7384Etj.A0Y(shadowReminder$$serializer, 0);
        SERIALIZER = C3cG.A19(shadowReminder$$serializer);
    }

    private final List<ShadowReminder> readUnlocked() {
        String string = this.prefs.getString("reminders", null);
        if (string == null) {
            return C0881AGi.A00;
        }
        try {
            return (List) HatchJsonKt.HatchJson.A00(string, SERIALIZER);
        } catch (Exception e) {
            CFK.A04(TAG, FGI.A0M("Corrupt shadow reminders, resetting: ", e.getMessage()));
            this.prefs.edit().remove("reminders").apply();
            return C0881AGi.A00;
        }
    }

    private final void writeUnlocked(List<ShadowReminder> list) {
        this.prefs.edit().putString("reminders", HatchJsonKt.HatchJson.A02(list, SERIALIZER)).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object add(com.facebook.aura.commands.alarm.ShadowReminder r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.AnonymousClass1
            if (r0 == 0) goto L2a
            r4 = r9
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$add$1 r4 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.AnonymousClass1) r4
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
            com.facebook.aura.commands.alarm.ShadowReminder r8 = (com.facebook.aura.commands.alarm.ShadowReminder) r8
            X.Hwg.A00(r3)
            goto L47
        L2a:
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$add$1 r4 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$add$1
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L75
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.add(com.facebook.aura.commands.alarm.ShadowReminder, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addAll(java.util.List<com.facebook.aura.commands.alarm.ShadowReminder> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110771
            if (r0 == 0) goto L2a
            r6 = r9
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$addAll$1 r6 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110771) r6
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
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$addAll$1 r6 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$addAll$1
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L96
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L96
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.addAll(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowReminder>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110781
            if (r0 == 0) goto L26
            r5 = r7
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$clear$1 r5 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110781) r5
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
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$clear$1 r5 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$clear$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.clear(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findById(java.lang.String r8, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowReminder> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110791
            if (r0 == 0) goto L28
            r6 = r9
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$findById$1 r6 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110791) r6
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
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$findById$1 r6 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$findById$1
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L6b
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L4d
        L62:
            com.facebook.aura.commands.alarm.ShadowReminder r1 = (com.facebook.aura.commands.alarm.ShadowReminder) r1     // Catch: java.lang.Throwable -> L6b
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.findById(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findByLabel(java.lang.String r8, X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowReminder>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110801
            if (r0 == 0) goto L28
            r6 = r9
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$findByLabel$1 r6 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110801) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2e
            java.lang.Object r3 = r6.L$1
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r8 = r6.L$0
            X.Hwg.A00(r2)
            goto L45
        L28:
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$findByLabel$1 r6 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$findByLabel$1
            r6.<init>(r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r2)
            X.BLa r3 = r7.mutex
            r6.L$0 = r8
            r6.L$1 = r3
            r6.label = r0
            java.lang.Object r0 = r3.APs(r4, r6)
            if (r0 != r5) goto L45
            return r5
        L45:
            java.util.List r0 = r7.readUnlocked()     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r5 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6e
        L51:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L6e
            r0 = r1
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.label     // Catch: java.lang.Throwable -> L6e
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L51
            r5.add(r1)     // Catch: java.lang.Throwable -> L6e
            goto L51
        L6a:
            r3.Ahe(r4)
            return r5
        L6e:
            r0 = move-exception
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.findByLabel(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeById(java.lang.String r8, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowReminder> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110811
            if (r0 == 0) goto L28
            r4 = r9
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$removeById$1 r4 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110811) r4
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
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$removeById$1 r4 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$removeById$1
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.id     // Catch: java.lang.Throwable -> L8d
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L4d
        L62:
            com.facebook.aura.commands.alarm.ShadowReminder r4 = (com.facebook.aura.commands.alarm.ShadowReminder) r4     // Catch: java.lang.Throwable -> L8d
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
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0     // Catch: java.lang.Throwable -> L8d
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.removeById(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapshot(X.HtJ<? super java.util.List<com.facebook.aura.commands.alarm.ShadowReminder>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110821
            if (r0 == 0) goto L26
            r5 = r7
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$snapshot$1 r5 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore.C110821) r5
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
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$snapshot$1 r5 = new com.facebook.aura.commands.alarm.AuraReminderShadowStore$snapshot$1
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
            java.util.List r3 = r6.readUnlocked()     // Catch: java.lang.Throwable -> L49
            r1.Ahe(r2)
            return r3
        L49:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AuraReminderShadowStore.snapshot(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final AuraReminderShadowStore getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            AuraReminderShadowStore auraReminderShadowStore = AuraReminderShadowStore.instance;
            if (auraReminderShadowStore == null) {
                synchronized (this) {
                    auraReminderShadowStore = AuraReminderShadowStore.instance;
                    if (auraReminderShadowStore == null) {
                        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(AuraReminderShadowStore.PREFS_NAME, 0);
                        C7384Etj.A0U(sharedPreferences);
                        auraReminderShadowStore = new AuraReminderShadowStore(sharedPreferences);
                        AuraReminderShadowStore.instance = auraReminderShadowStore;
                    }
                }
            }
            return auraReminderShadowStore;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraReminderShadowStore(SharedPreferences sharedPreferences) {
        this.prefs = sharedPreferences;
        this.mutex = new C9258GBl();
    }

    public /* synthetic */ AuraReminderShadowStore(SharedPreferences sharedPreferences, C06H c06h) {
        this(sharedPreferences);
    }
}
