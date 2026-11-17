package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.C8j3;
import X.G0U;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes4.dex */
public interface LinkEncryptedSetupBleTransport {

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ Object writeEncryptedProvisionRecord$default(LinkEncryptedSetupBleTransport linkEncryptedSetupBleTransport, LinkEncryptedRecordJson linkEncryptedRecordJson, boolean z, HtJ htJ, int i, Object obj) {
            if (obj == null) {
                return linkEncryptedSetupBleTransport.writeEncryptedProvisionRecord(linkEncryptedRecordJson, AnonymousClass001.A1Q(i, z), htJ);
            }
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: writeEncryptedProvisionRecord");
        }
    }

    Object awaitPairingConfirmation(HtJ<? super LinkPairingConfirmationResult> htJ);

    void clearEncryptedPairingSession();

    void clearPendingDeviceInfoCallback();

    void clearPendingDeviceInfoCallback(G0U<? super LinkDeviceInfo, Unit> g0u);

    void clearPendingPairingReadyCallback();

    void clearPendingPairingReadyCallback(G0U<? super LinkPairingReady, Unit> g0u);

    boolean hasEncryptedPairingSession(LinkEncryptedPairingSession linkEncryptedPairingSession);

    void installEncryptedPairingSession(LinkEncryptedPairingSession linkEncryptedPairingSession);

    void requestLinkDeviceInfo(G0U<? super LinkDeviceInfo, Unit> g0u);

    void requestWiFiScan();

    void sendPairingClientHello(LinkPairingClientHello linkPairingClientHello, G0U<? super LinkPairingReady, Unit> g0u);

    boolean startPairingConfirmation(LinkEncryptedPairingSession linkEncryptedPairingSession);

    Object writeEncryptedProvisionRecord(LinkEncryptedRecordJson linkEncryptedRecordJson, boolean z, HtJ<? super Boolean> htJ);

    public abstract class DefaultImpls {
    }
}
