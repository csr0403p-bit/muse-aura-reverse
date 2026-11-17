package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmUpgradePushRedirect;
import com.facebook.aura.notifications.push.api.VmLockedPushOutcome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$outcomes$1", f = "VmLockedPushHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class VmLockedPushHandler$Companion$redirect$outcomes$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends VmLockedPushOutcome>>, Object> {
    public final /* synthetic */ Map<String, String> $params;
    public final /* synthetic */ String $pushVmId;
    public final /* synthetic */ int[] $redirects;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmLockedPushHandler$Companion$redirect$outcomes$1(AbstractC3358CGz abstractC3358CGz, int[] iArr, String str, Map<String, String> map, HtJ<? super VmLockedPushHandler$Companion$redirect$outcomes$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$redirects = iArr;
        this.$pushVmId = str;
        this.$params = map;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmLockedPushHandler$Companion$redirect$outcomes$1(this.$userSession, this.$redirects, this.$pushVmId, this.$params, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        VmLockedPushOutcome vmLockedPushOutcomeRedirect;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!VmLockedPushHandler.Companion.isLiveSession(this.$userSession)) {
            return Collections.singletonList(new VmLockedPushOutcome.Dropped("session_changed"));
        }
        int[] iArr = this.$redirects;
        C7384Etj.A0X(iArr);
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        String str = this.$pushVmId;
        Map<String, String> map = this.$params;
        ArrayList arrayListA11 = C60O.A11(iArr.length);
        for (int i : iArr) {
            if (i != 0) {
                throw C60O.A0i(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
            try {
                vmLockedPushOutcomeRedirect = ConfidentialVmUpgradePushRedirect.INSTANCE.redirect(abstractC3358CGz, str, map);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0L(VmLockedPushHandlerKt.TAG, e2, FGI.A0I("VM push redirect ", i, " failed"));
                vmLockedPushOutcomeRedirect = VmLockedPushOutcome.NotHandled.INSTANCE;
            }
            arrayListA11.add(vmLockedPushOutcomeRedirect);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj2 : arrayListA11) {
            if (!C7384Etj.areEqual(obj2, VmLockedPushOutcome.NotHandled.INSTANCE)) {
                arrayListA0h.add(obj2);
            }
        }
        return arrayListA0h;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super List<? extends VmLockedPushOutcome>> htJ) {
        return ((VmLockedPushHandler$Companion$redirect$outcomes$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
