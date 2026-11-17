package com.facebook.aura.common.ble;

import X.C22I;
import X.C3cG;
import X.C8j3;
import X.HsJ;
import X.HtJ;
import java.util.UUID;
import kotlin.Unit;

/* loaded from: classes4.dex */
public interface AuraBleConnection {

    /* renamed from: com.facebook.aura.common.ble.AuraBleConnection$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: openGatt-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m366openGattBWLJW6A$default(AuraBleConnection auraBleConnection, String str, boolean z, boolean z2, HtJ htJ, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: openGatt-BWLJW6A");
            }
            boolean zA1J = C3cG.A1J(i, z);
            if ((i & 4) != 0) {
                z2 = true;
            }
            return auraBleConnection.mo361openGattBWLJW6A(str, zA1J, z2, htJ);
        }

        /* renamed from: writeCharacteristic-yxL6bBk$default, reason: not valid java name */
        public static /* synthetic */ Object m367writeCharacteristicyxL6bBk$default(AuraBleConnection auraBleConnection, UUID uuid, UUID uuid2, byte[] bArr, boolean z, HtJ htJ, int i, Object obj) {
            if (obj == null) {
                return auraBleConnection.mo365writeCharacteristicyxL6bBk(uuid, uuid2, bArr, C3cG.A1K(i & 8, z), htJ);
            }
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: writeCharacteristic-yxL6bBk");
        }
    }

    Object closeGatt(HtJ<? super Unit> htJ);

    int getConnectionState(String str);

    C22I<AuraGattEvent> getGattEvents();

    C22I<AuraBleData> getIncomingData();

    int getNegotiatedMtu();

    boolean hasCharacteristic(UUID uuid, UUID uuid2);

    boolean hasService(UUID uuid);

    /* renamed from: openGatt-BWLJW6A, reason: not valid java name */
    Object mo361openGattBWLJW6A(String str, boolean z, boolean z2, HtJ<? super HsJ<Unit>> htJ);

    /* renamed from: readCharacteristic-0E7RQCE, reason: not valid java name */
    Object mo362readCharacteristic0E7RQCE(UUID uuid, UUID uuid2, HtJ<? super HsJ<Unit>> htJ);

    void requestBalancedConnectionPriority();

    void requestHighConnectionPriority();

    Object requestMtu(int i, HtJ<? super Integer> htJ);

    /* renamed from: setNotificationsEnabled-BWLJW6A, reason: not valid java name */
    Object mo363setNotificationsEnabledBWLJW6A(UUID uuid, UUID uuid2, boolean z, HtJ<? super HsJ<Unit>> htJ);

    /* renamed from: triggerServiceDiscovery-IoAF18A, reason: not valid java name */
    Object mo364triggerServiceDiscoveryIoAF18A(HtJ<? super HsJ<Unit>> htJ);

    /* renamed from: writeCharacteristic-yxL6bBk, reason: not valid java name */
    Object mo365writeCharacteristicyxL6bBk(UUID uuid, UUID uuid2, byte[] bArr, boolean z, HtJ<? super HsJ<Unit>> htJ);

    public abstract class DefaultImpls {
    }
}
