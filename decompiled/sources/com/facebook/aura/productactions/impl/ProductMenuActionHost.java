package com.facebook.aura.productactions.impl;

import X.AnonymousClass005;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.ResultEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductMenuActionHost {
    public static final int $stable = 8;
    public final Context androidContext;
    public final Function0<Unit> dismiss;
    public final AuraNavigator navigator;
    public final ResultEventBus resultBus;
    public final G0U<Integer, Unit> showToast;

    public final Context getAndroidContext() {
        return this.androidContext;
    }

    public final Function0<Unit> getDismiss() {
        return this.dismiss;
    }

    public final AuraNavigator getNavigator() {
        return this.navigator;
    }

    public final ResultEventBus getResultBus() {
        return this.resultBus;
    }

    public final G0U<Integer, Unit> getShowToast() {
        return this.showToast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductMenuActionHost(AuraNavigator auraNavigator, ResultEventBus resultEventBus, Context context, Function0<Unit> function0, G0U<? super Integer, Unit> g0u) {
        AnonymousClass005.A17(auraNavigator, resultEventBus, context, function0, g0u);
        this.navigator = auraNavigator;
        this.resultBus = resultEventBus;
        this.androidContext = context;
        this.dismiss = function0;
        this.showToast = g0u;
    }
}
