package com.facebook.aura.notifications.push;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.notifications.push.AuraCvmPushDecryptor;

/* loaded from: classes4.dex */
public final class AuraPushHandler$processEncryptedPush$result$1$1 extends AbstractC7559F3s implements G0U<byte[], AuraCvmPushDecryptResult> {
    public final /* synthetic */ AuraCvmPushEnvelope $envelope;
    public final /* synthetic */ AuraPushNotificationData $outer;
    public final /* synthetic */ String $vmId;

    @Override // X.G0U
    public final AuraCvmPushDecryptResult invoke(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return new AuraCvmPushDecryptor(AuraCvmPushDecryptor.AnonymousClass1.INSTANCE).decrypt(this.$outer, this.$envelope, this.$vmId, AuraDeviceId.INSTANCE.get(), bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraPushHandler$processEncryptedPush$result$1$1(AuraPushNotificationData auraPushNotificationData, AuraCvmPushEnvelope auraCvmPushEnvelope, String str) {
        super(1);
        this.$outer = auraPushNotificationData;
        this.$envelope = auraCvmPushEnvelope;
        this.$vmId = str;
    }
}
