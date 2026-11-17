package com.facebook.aura.devices.token;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BzK;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter$recordUnknownRevoke$2$1", f = "LinkDeviceTokenMinter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceTokenMinter$recordUnknownRevoke$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ Set<String> $next;
    public final /* synthetic */ AbstractC3358CGz $session;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceTokenMinter$recordUnknownRevoke$2$1(AbstractC3358CGz abstractC3358CGz, Set<String> set, HtJ<? super LinkDeviceTokenMinter$recordUnknownRevoke$2$1> htJ) {
        super(2, htJ);
        this.$session = abstractC3358CGz;
        this.$next = set;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LinkDeviceTokenMinter$recordUnknownRevoke$2$1(this.$session, this.$next, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        BzK bzKA9q = LinkDeviceTokenMinter.INSTANCE.unknownRevokesPrefs(this.$session).A9q();
        Set<String> set = this.$next;
        if (set.isEmpty()) {
            bzKA9q.Aae(LinkDeviceTokenMinterKt.UNKNOWN_REVOKES_KEY);
        } else {
            bzKA9q.A09(LinkDeviceTokenMinterKt.UNKNOWN_REVOKES_KEY, set);
        }
        return Boolean.valueOf(bzKA9q.A0B(0));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((LinkDeviceTokenMinter$recordUnknownRevoke$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
