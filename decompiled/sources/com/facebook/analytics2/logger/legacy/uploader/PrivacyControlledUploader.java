package com.facebook.analytics2.logger.legacy.uploader;

import X.BV4;
import X.C4010Cjo;
import X.C4015Cjv;
import X.InterfaceC4012Cjq;
import X.InterfaceC4013Cjt;
import X.InterfaceC4014Cju;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PrivacyControlledUploader implements InterfaceC4012Cjq {
    public static final IOException A02 = BV4.A0K("Upload is skipped due to privacy control.");
    public C4015Cjv A00;
    public InterfaceC4012Cjq A01;

    @Override // X.InterfaceC4012Cjq
    public final void upload(C4010Cjo c4010Cjo, InterfaceC4013Cjt interfaceC4013Cjt, InterfaceC4014Cju interfaceC4014Cju) {
        this.A01.upload(c4010Cjo, interfaceC4013Cjt, interfaceC4014Cju);
    }
}
