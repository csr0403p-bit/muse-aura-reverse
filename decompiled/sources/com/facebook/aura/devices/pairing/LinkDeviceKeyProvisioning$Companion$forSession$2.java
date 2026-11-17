package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.token.LinkDeviceKeyTargetResult;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$Companion$forSession$2", f = "LinkDeviceKeyProvisioning.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeyProvisioning$Companion$forSession$2 extends AbstractC07127nr implements G0U<HtJ<? super LinkDeviceKeyTargetResult>, Object> {
    public final /* synthetic */ LinkDeviceKeys $deviceKeys;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeyProvisioning$Companion$forSession$2(LinkDeviceKeys linkDeviceKeys, HtJ<? super LinkDeviceKeyProvisioning$Companion$forSession$2> htJ) {
        super(1, htJ);
        this.$deviceKeys = linkDeviceKeys;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkDeviceKeyProvisioning$Companion$forSession$2(this.$deviceKeys, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkDeviceKeyTargetResult> htJ) {
        return new LinkDeviceKeyProvisioning$Companion$forSession$2(this.$deviceKeys, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkDeviceKeys linkDeviceKeys = this.$deviceKeys;
            this.label = 1;
            obj = linkDeviceKeys.resolveTarget(15000L, this);
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
}
