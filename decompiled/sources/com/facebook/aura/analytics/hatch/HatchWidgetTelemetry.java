package com.facebook.aura.analytics.hatch;

import X.A6B;
import X.AbstractC06907md;
import X.AbstractC0875AGb;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C3cG;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import android.content.Intent;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.widgets.WidgetInventoryKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchWidgetTelemetry {
    public static final int $stable = 0;
    public static final HatchWidgetTelemetry INSTANCE = new HatchWidgetTelemetry();
    public static final int MAX_CAUSE_DEPTH = 4;
    public static final String SURFACE = "system_widget";
    public static final String WIDGET_KIND = "widget_kind";

    /* renamed from: com.facebook.aura.analytics.hatch.HatchWidgetTelemetry$logInventory$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchWidgetKind, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(HatchWidgetKind hatchWidgetKind) {
            HatchWidgetKind hatchWidgetKind2 = hatchWidgetKind;
            C7384Etj.A0Y(hatchWidgetKind2, 0);
            return hatchWidgetKind2.getValue();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(HatchWidgetKind hatchWidgetKind) {
            C7384Etj.A0Y(hatchWidgetKind, 0);
            return hatchWidgetKind.getValue();
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchWidgetTelemetry$renderFailureReason$1, reason: invalid class name and case insensitive filesystem */
    public final class C109141 extends AbstractC7559F3s implements G0U<Throwable, Throwable> {
        public static final C109141 INSTANCE = new C109141();

        public C109141() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Throwable invoke(Throwable th) {
            Throwable th2 = th;
            C7384Etj.A0Y(th2, 0);
            return th2.getCause();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Throwable invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            return th.getCause();
        }
    }

    public final void logInstalled(HatchWidgetKind hatchWidgetKind) {
        C7384Etj.A0Y(hatchWidgetKind, 0);
        log("widget_installed", AnonymousClass006.A10(WIDGET_KIND, hatchWidgetKind.getValue()));
    }

    public final void logInventory(Set<? extends HatchWidgetKind> set) {
        C7384Etj.A0Y(set, 0);
        log(WidgetInventoryKt.INVENTORY_KEY, AnonymousClass007.A0d("widget_count", String.valueOf(set.size()), C3cG.A0r("widgets", AbstractC06907md.A01(",", set, AnonymousClass1.INSTANCE))));
    }

    public final void logUninstalled(HatchWidgetKind hatchWidgetKind) {
        C7384Etj.A0Y(hatchWidgetKind, 0);
        log("widget_uninstalled", AnonymousClass006.A10(WIDGET_KIND, hatchWidgetKind.getValue()));
    }

    public final void maybeLogWidgetOpen(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        Uri data = intent.getData();
        HatchWidgetKind hatchWidgetKind = null;
        String queryParameter = (data == null || !data.isHierarchical()) ? null : data.getQueryParameter(WIDGET_KIND);
        Iterator<HatchWidgetKind> it = HatchWidgetKind.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HatchWidgetKind next = it.next();
            if (C7384Etj.areEqual(next.getValue(), queryParameter)) {
                hatchWidgetKind = next;
                break;
            }
        }
        HatchWidgetKind hatchWidgetKind2 = hatchWidgetKind;
        if (hatchWidgetKind2 != null) {
            log("widget_open", AnonymousClass006.A10(WIDGET_KIND, hatchWidgetKind2.getValue()));
        }
    }

    private final void log(String str, Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent(str, SURFACE, null, null, null, map, null);
    }

    private final String renderFailureReason(Throwable th) {
        for (Object obj : A6B.A07(AbstractC0875AGb.A0B(th, C109141.INSTANCE), 4)) {
            if (obj instanceof OutOfMemoryError) {
                return "out_of_memory";
            }
            if (obj instanceof TransactionTooLargeException) {
                return "transaction_too_large";
            }
            if (obj instanceof SecurityException) {
                return "security";
            }
            if (obj instanceof IllegalArgumentException) {
                return "illegal_argument";
            }
        }
        return DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public final Uri attribute(Uri uri, HatchWidgetKind hatchWidgetKind) {
        AnonymousClass003.A0u(uri, hatchWidgetKind);
        return C60R.A0B(uri.buildUpon(), WIDGET_KIND, hatchWidgetKind.getValue());
    }

    public final void logRenderFailed(HatchWidgetKind hatchWidgetKind, Throwable th) {
        AnonymousClass003.A0u(hatchWidgetKind, th);
        log("widget_render_failed", AnonymousClass007.A0d(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, renderFailureReason(th), C3cG.A0r(WIDGET_KIND, hatchWidgetKind.getValue())));
    }
}
