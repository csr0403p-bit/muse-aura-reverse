package com.facebook.aura.devices.pairing;

import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.os.ParcelUuid;
import com.facebook.aura.devices.intf.DiscoveryDecision;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public abstract class HatchDeviceBleManagerKt {
    public static final int ATT_HEADER_OVERHEAD = 3;
    public static final long CHUNK_ASSEMBLY_TIMEOUT_MS = 3000;
    public static final int CHUNK_HEADER_SIZE = 3;
    public static final byte CHUNK_MAGIC = -2;
    public static final int DEFAULT_ATT_PAYLOAD = 20;
    public static final UUID HATCH_DEVICE_RX_CHAR_UUID;
    public static final UUID HATCH_DEVICE_SERVICE_UUID;
    public static final UUID HATCH_DEVICE_TX_CHAR_UUID;
    public static final ParcelUuid LINK_SETUP_SERVICE;
    public static final int MAX_ATTRIBUTE_VALUE_SIZE = 512;
    public static final long OTA_PROVISIONING_TIMEOUT_MS = 180000;
    public static final long PROVISIONING_TIMEOUT_MS = 120000;
    public static final int REQUESTED_MTU = 247;
    public static final long SCAN_TIMEOUT_MS = 15000;
    public static final String TAG = "HatchDeviceBleManager";
    public static final long WIFI_SCAN_TIMEOUT_MS = 20000;

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt", f = "HatchDeviceBleManager.kt", l = {121, 123, 126}, m = "retryTransientConnect", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt$retryTransientConnect$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManagerKt.retryTransientConnect(0, 0L, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    static {
        UUID uuidFromString = UUID.fromString("7FDD3D1C-38EA-46CF-8B46-314ECF5F240C");
        HATCH_DEVICE_SERVICE_UUID = uuidFromString;
        HATCH_DEVICE_RX_CHAR_UUID = UUID.fromString("4D593029-28A2-4A6E-A1F0-3C2D5E8F9B01");
        HATCH_DEVICE_TX_CHAR_UUID = UUID.fromString("D75DC4CA-7B2B-4E9C-8F0A-1D2E3F4A5B6C");
        LINK_SETUP_SERVICE = new ParcelUuid(uuidFromString);
    }

    public static final boolean advertisesLinkSetupService(List<ParcelUuid> list) {
        return list.contains(LINK_SETUP_SERVICE);
    }

    public static final String encodeBleAction(String str) {
        return HatchJsonKt.HatchJson.A02(new HatchDeviceBleActionJson(str), HatchDeviceBleActionJson$$serializer.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r1 == r5) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object retryTransientConnect(int r7, long r8, kotlin.jvm.functions.Function0<java.lang.Boolean> r10, X.G0U<? super T, java.lang.Boolean> r11, X.G0V<? super java.lang.Integer, ? super X.HtJ<? super T>, ? extends java.lang.Object> r12, X.HtJ<? super T> r13) {
        /*
            boolean r0 = r13 instanceof com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt.AnonymousClass1
            if (r0 == 0) goto L28
            r4 = r13
            com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt$retryTransientConnect$1 r4 = (com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 3
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 == r6) goto L4a
            if (r0 == r2) goto L84
            if (r0 == r3) goto L4a
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt$retryTransientConnect$1 r4 = new com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt$retryTransientConnect$1
            r4.<init>(r13)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            java.lang.Integer r0 = X.C3cG.A0R(r6)
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r12
            r4.I$0 = r7
            r4.J$0 = r8
            r4.I$1 = r6
            r4.label = r6
            java.lang.Object r1 = r12.invoke(r0, r4)
        L47:
            if (r1 != r5) goto L5f
            return r5
        L4a:
            int r6 = r4.I$1
            long r8 = r4.J$0
            int r7 = r4.I$0
            java.lang.Object r12 = r4.L$2
            X.G0V r12 = (X.G0V) r12
            java.lang.Object r11 = r4.L$1
            X.G0U r11 = (X.G0U) r11
            java.lang.Object r10 = r4.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            X.Hwg.A00(r1)
        L5f:
            if (r6 >= r7) goto Lbe
            boolean r0 = X.AnonymousClass003.A1X(r1, r11)
            if (r0 == 0) goto Lbe
            boolean r0 = X.AnonymousClass003.A1Y(r10)
            if (r0 != 0) goto Lbe
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r12
            r4.L$3 = r1
            r4.I$0 = r7
            r4.J$0 = r8
            r4.I$1 = r6
            r4.label = r2
            java.lang.Object r0 = X.C7Bq.A01(r8, r4)
            if (r0 != r5) goto L9c
            return r5
        L84:
            int r6 = r4.I$1
            long r8 = r4.J$0
            int r7 = r4.I$0
            java.lang.Object r0 = r4.L$3
            java.lang.Object r12 = r4.L$2
            X.G0V r12 = (X.G0V) r12
            java.lang.Object r11 = r4.L$1
            X.G0U r11 = (X.G0U) r11
            java.lang.Object r10 = r4.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            X.Hwg.A00(r1)
            r1 = r0
        L9c:
            boolean r0 = X.AnonymousClass003.A1Y(r10)
            if (r0 != 0) goto Lbe
            int r6 = r6 + 1
            java.lang.Integer r1 = X.C3cG.A0R(r6)
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r12
            r0 = 0
            r4.L$3 = r0
            r4.I$0 = r7
            r4.J$0 = r8
            r4.I$1 = r6
            r4.label = r3
            java.lang.Object r1 = r12.invoke(r1, r4)
            goto L47
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt.retryTransientConnect(int, long, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.HtJ):java.lang.Object");
    }

    public static final boolean showsAsLinkRow(DiscoveryDecision discoveryDecision, boolean z, boolean z2, boolean z3) {
        return C7384Etj.areEqual(discoveryDecision, DiscoveryDecision.LinkSetup.INSTANCE) ? z : C7384Etj.areEqual(discoveryDecision, DiscoveryDecision.Unclaimed.INSTANCE) && z && z3 && z2;
    }
}
