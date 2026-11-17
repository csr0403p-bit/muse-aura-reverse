package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class SessionController$startPreConnectCaptionLocked$caption$2 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ long $callAttemptGeneration;
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ String $turnId;
    public final /* synthetic */ SessionController this$0;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(this.this$0.publishPreConnectCaption(this.$turnId, str, this.$callAttemptGeneration, this.$markerKey));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startPreConnectCaptionLocked$caption$2(SessionController sessionController, String str, long j, int i) {
        super(1);
        this.this$0 = sessionController;
        this.$turnId = str;
        this.$callAttemptGeneration = j;
        this.$markerKey = i;
    }
}
