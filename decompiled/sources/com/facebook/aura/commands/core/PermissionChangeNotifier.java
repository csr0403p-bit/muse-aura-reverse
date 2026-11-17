package com.facebook.aura.commands.core;

import X.C22I;
import X.C3Em;
import X.C3pd;
import X.C79;
import X.C9290GCr;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PermissionChangeNotifier {
    public static final int $stable = 0;
    public static final PermissionChangeNotifier INSTANCE = new PermissionChangeNotifier();
    public static final C3Em<Unit> _events;
    public static final C22I<Unit> events;

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 16);
        _events = c9290GCr;
        events = new C3pd(c9290GCr);
    }

    public final C22I<Unit> getEvents() {
        return events;
    }

    public final void notifyChanged() {
        _events.AhV(Unit.INSTANCE);
    }
}
