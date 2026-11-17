package com.facebook.aura.mobileconfig.session;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C06H;
import X.C60P;
import X.C7384Etj;
import X.C79;
import X.DFW;
import X.DFX;
import X.G0U;
import com.facebook.aura.analytics.AuraEarlyAnalytics;
import com.facebook.mobileconfig.MobileConfigCxxLogger;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraMobileConfigLogger implements MobileConfigCxxLogger {
    public static final Companion Companion = new Companion();
    public static final AuraMobileConfigLogger instance = new AuraMobileConfigLogger();

    public final class Companion {
        public final AuraMobileConfigLogger getInstance() {
            return AuraMobileConfigLogger.instance;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.mobileconfig.session.AuraMobileConfigLogger$logEventInternal$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<DFX, Unit> {
        public final /* synthetic */ Map<String, String> $eventData;
        public final /* synthetic */ String $eventName;
        public final /* synthetic */ boolean $shouldDeliverImmediately;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DFX dfx) {
            C7384Etj.A0Y(dfx, 0);
            DFW dfwA01 = DFX.A01(dfx, C79.A00, null, this.$eventName, this.$shouldDeliverImmediately);
            C7384Etj.A0U(dfwA01);
            if (dfwA01.A0A()) {
                Iterator itA0n = AnonymousClass002.A0n(this.$eventData);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    dfwA01.A09((String) entry.getKey(), (String) entry.getValue());
                }
                dfwA01.A05();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, Map<String, String> map) {
            super(1);
            this.$eventName = str;
            this.$shouldDeliverImmediately = z;
            this.$eventData = map;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DFX dfx) {
            invoke2(dfx);
            return Unit.INSTANCE;
        }
    }

    private final void logEventInternal(String str, Map<String, String> map, boolean z) {
        AuraEarlyAnalytics.INSTANCE.whenInitialized(new AnonymousClass1(str, z, map));
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logEvent(String str, Map<String, String> map) {
        logEventInternal(str, map, AnonymousClass004.A1b(str, map));
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logEventImmediately(String str, Map<String, String> map) {
        logEventInternal(str, map, C60P.A1Y(str, map));
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logCounter(String str, int i) {
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logGeneralCasesEvent(String str, Map<String, String> map, Map<String, Long> map2) {
    }
}
