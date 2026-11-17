package com.facebook.aura.confidentialvm.vmswitch;

/* loaded from: classes2.dex */
public interface ConfidentialVmTransferCheckpoint<T> {
    String getDestinationEnvId();

    String getSourceEnvId();

    T withDestinationEnvId(String str);
}
