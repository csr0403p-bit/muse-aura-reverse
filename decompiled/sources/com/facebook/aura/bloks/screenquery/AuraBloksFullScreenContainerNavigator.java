package com.facebook.aura.bloks.screenquery;

import X.AnonymousClass003;
import X.BV4;
import X.BV6;
import X.C1mB;
import X.C7384Etj;
import X.C7727FCd;
import X.C77m;
import X.C7933FLf;
import X.FDD;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.aura.bloks.activity.AuraCDSBloksActivity;

/* loaded from: classes6.dex */
public final class AuraBloksFullScreenContainerNavigator {
    public static final String BLOKS_SCREEN_QUERY_PROPS_BUNDLE = "screen_query_props_bundle";
    public static final AuraBloksFullScreenContainerNavigator INSTANCE = new AuraBloksFullScreenContainerNavigator();

    public final void close(Context context, FDD fdd, C7727FCd c7727FCd) {
        C7384Etj.A0Y(context, 0);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public final boolean supportsCustomScreenTransitions(C1mB c1mB) {
        return false;
    }

    public final C7727FCd createObjectSetForNavigation(Context context, C7727FCd c7727FCd) {
        return new C7727FCd(BV4.A0B());
    }

    public final void openScreen(Context context, C7933FLf c7933FLf, C7727FCd c7727FCd, boolean z) {
        AnonymousClass003.A0u(context, c7933FLf);
        Intent intent = new Intent(context, (Class<?>) AuraCDSBloksActivity.class);
        intent.putExtra("cds_platform", "Bloks");
        Bundle bundleA0N = BV6.A0N();
        c7933FLf.A00(bundleA0N);
        intent.putExtra("screen_query_props_bundle", bundleA0N);
        C77m.A00(context, intent);
    }

    public final void onStaticTemplateFetchStatus(Context context, boolean z) {
    }
}
