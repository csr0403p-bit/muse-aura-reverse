package com.facebook.aura.shortcut;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10573Huf;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2", f = "HomeScreenShortcutNudge.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
    public int label;

    public HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2(HtJ<? super HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AnonymousClass001.A0h();
    }

    @Override // X.G0V
    public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
        return new HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1$1$2(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
