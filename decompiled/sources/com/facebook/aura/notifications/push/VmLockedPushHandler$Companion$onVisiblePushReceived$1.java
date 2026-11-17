package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.notifications.push.VmLockedPushHandler;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$onVisiblePushReceived$1", f = "VmLockedPushHandler.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class VmLockedPushHandler$Companion$onVisiblePushReceived$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraPushNotificationData $data;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmLockedPushHandler$Companion$onVisiblePushReceived$1(AuraPushNotificationData auraPushNotificationData, HtJ<? super VmLockedPushHandler$Companion$onVisiblePushReceived$1> htJ) {
        super(2, htJ);
        this.$data = auraPushNotificationData;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmLockedPushHandler$Companion$onVisiblePushReceived$1(this.$data, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new VmLockedPushHandler$Companion$onVisiblePushReceived$1(this.$data, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VmLockedPushHandler.Companion companion = VmLockedPushHandler.Companion;
            AuraPushNotificationData auraPushNotificationData = this.$data;
            String str = auraPushNotificationData.vmId;
            Map<String, String> map = auraPushNotificationData.params;
            String str2 = auraPushNotificationData.ndid;
            this.label = 1;
            obj = companion.refreshVmAccessOrDropReason(str, map, str2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (obj != null) {
            CFK.A02(obj, this.$data.ndid, VmLockedPushHandlerKt.TAG, "Visible VM push skipped refresh: reason=%s ndid=%s");
        }
        return Unit.INSTANCE;
    }
}
