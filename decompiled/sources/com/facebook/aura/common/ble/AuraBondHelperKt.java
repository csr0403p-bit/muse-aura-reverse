package com.facebook.aura.common.ble;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C7Bm;
import X.EnumC10460Hji;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes3.dex */
public abstract class AuraBondHelperKt {
    public static final long BOND_TIMEOUT_MS = 30000;

    @DebugMetadata(c = "com.facebook.aura.common.ble.AuraBondHelperKt", f = "AuraBondHelper.kt", l = {44}, m = "ensureBonded", v = 2)
    /* renamed from: com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBondHelperKt.ensureBonded(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2", f = "AuraBondHelper.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ BluetoothDevice $device;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, BluetoothDevice bluetoothDevice, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$device = bluetoothDevice;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$device, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.content.BroadcastReceiver, com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2$1$receiver$1] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws DispatchException {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final Context context = this.$context;
                final BluetoothDevice bluetoothDevice = this.$device;
                this.L$0 = context;
                this.L$1 = bluetoothDevice;
                this.label = 1;
                final GBL gblA04 = C7Bm.A04(this);
                ?? r3 = new BroadcastReceiver() { // from class: com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        C7384Etj.A0Y(intent, 1);
                        if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            if (C7384Etj.areEqual(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null, bluetoothDevice.getAddress())) {
                                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                                if (intExtra == 10) {
                                    try {
                                        context.unregisterReceiver(this);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    if (gblA04.isActive()) {
                                        gblA04.Abf(null, AnonymousClass001.A0h());
                                        return;
                                    }
                                    return;
                                }
                                if (intExtra == 12) {
                                    try {
                                        context.unregisterReceiver(this);
                                    } catch (IllegalArgumentException unused2) {
                                    }
                                    if (gblA04.isActive()) {
                                        gblA04.Abf(null, true);
                                    }
                                }
                            }
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(r3, intentFilter, 2);
                } else {
                    context.registerReceiver(r3, intentFilter);
                }
                gblA04.AO2(new AuraBondHelperKt$ensureBonded$2$1$1(context, r3));
                if (bluetoothDevice.getBondState() == 12) {
                    try {
                        context.unregisterReceiver(r3);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (gblA04.isActive()) {
                        gblA04.Abf(null, true);
                    }
                }
                obj = gblA04.A0F();
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ensureBonded(android.content.Context r7, android.bluetooth.BluetoothDevice r8, com.facebook.aura.common.ble.AuraBleLogger r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.common.ble.AuraBondHelperKt.AnonymousClass1
            if (r0 == 0) goto L77
            r4 = r10
            com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$1 r4 = (com.facebook.aura.common.ble.AuraBondHelperKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L7d
            X.Hwg.A00(r1)
        L20:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2d
            boolean r0 = r1.booleanValue()
        L28:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L2d:
            r0 = 0
            goto L28
        L2f:
            X.Hwg.A00(r1)
            int r6 = r8.getBondState()
            r0 = 11
            if (r6 == r0) goto L67
            r0 = 12
            java.lang.String r2 = ")"
            java.lang.String r1 = r8.getAddress()
            if (r6 == r0) goto L82
            java.lang.String r0 = "ensureBonded: initiating bond ("
            java.lang.String r0 = X.FGI.A0U(r0, r1, r2)
            r9.log(r0)
            r8.createBond()
        L50:
            r0 = 0
            com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2 r2 = new com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$2
            r2.<init>(r7, r8, r0)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.label = r3
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = X.GAX.A01(r4, r2, r0)
            if (r1 != r5) goto L20
            return r5
        L67:
            java.lang.String r2 = r8.getAddress()
            java.lang.String r1 = "ensureBonded: bonding in progress ("
            java.lang.String r0 = "), waiting\u2026"
            java.lang.String r0 = X.FGI.A0U(r1, r2, r0)
            r9.log(r0)
            goto L50
        L77:
            com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$1 r4 = new com.facebook.aura.common.ble.AuraBondHelperKt$ensureBonded$1
            r4.<init>(r10)
            goto L12
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L82:
            java.lang.String r0 = "ensureBonded: already bonded ("
            java.lang.String r0 = X.FGI.A0U(r0, r1, r2)
            r9.debug(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBondHelperKt.ensureBonded(android.content.Context, android.bluetooth.BluetoothDevice, com.facebook.aura.common.ble.AuraBleLogger, X.HtJ):java.lang.Object");
    }

    public static final void safeUnregister(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }
}
