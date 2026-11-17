package X;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.Ex5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7469Ex5 extends ContextWrapper {
    public final Application A00;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.A00.registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        this.A00.unregisterComponentCallbacks(componentCallbacks);
    }

    public C7469Ex5(Application application) {
        super(application);
        this.A00 = application;
    }
}
