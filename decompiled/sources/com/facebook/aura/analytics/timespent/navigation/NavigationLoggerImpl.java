package com.facebook.aura.analytics.timespent.navigation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C2F;
import X.C3339CFj;
import X.C3341CFl;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.CFK;
import X.DFW;
import X.DFX;
import X.DL1;
import X.DL6;
import X.DLA;
import X.DLB;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class NavigationLoggerImpl implements NavigationLogger {
    public static final String CLICK_POINT_CONTEXT = "click_point_context";
    public static final String CLICK_POINT_KEY = "click_point";
    public static final Companion Companion = new Companion();
    public static final String DEVICE_TYPE_KEY = "device_type";
    public static final String EVENT_SUBTYPE_KEY = "event_subtype";
    public static final String MODULE_NAME = "aura";
    public static final String NAVIGATION_EVENT_NAME = "navigation";
    public static final String PIGEON_MODULE_KEYWORD = "pigeon_reserved_keyword_module";
    public static final String URL_PARAM = "url";
    public final AuraAnalyticsDecoratorInterface analyticsDecorator;
    public DL1 currNavEventData;
    public int navigationsSinceForegrounding;
    public DL1 prevNavEventData;

    @DebugMetadata(c = "com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl$reportNavigationEvent$1", f = "NavigationLogger.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl$reportNavigationEvent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DL1 $currentNavEventDataCopy;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DL1 dl1, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$currentNavEventDataCopy = dl1;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NavigationLoggerImpl.this.new AnonymousClass1(this.$currentNavEventDataCopy, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            NavigationLoggerImpl navigationLoggerImpl = NavigationLoggerImpl.this;
            navigationLoggerImpl.reportNavigationEvent(this.$currentNavEventDataCopy, navigationLoggerImpl.navigationsSinceForegrounding);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForActivity(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        String strA00 = C2F.A00(activity);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        this.currNavEventData.A00(BV5.A0X(activity), "dest_fragment_hash_value");
        this.currNavEventData.A00(BV4.A0q(activity), "dest_object_ref");
        linkedHashMapA0j.put("dest_module_uri", activity.getIntent().getData());
        reportNavigationEvent(null, strA00, linkedHashMapA0j);
        activity.getIntent().setData(null);
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForFragment(Fragment fragment, String str) {
        String strTryGetAnalyticsName;
        Intent intent;
        Intent intent2;
        C7384Etj.A0Y(fragment, 0);
        String strA00 = C2F.A00(fragment);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        this.currNavEventData.A00(BV5.A0X(fragment), "dest_fragment_hash_value");
        this.currNavEventData.A00(BV4.A0q(fragment), "dest_object_ref");
        DLB dlbFindNearestAnalyticsActivityAncestor = findNearestAnalyticsActivityAncestor(fragment);
        if (dlbFindNearestAnalyticsActivityAncestor != null) {
            strTryGetAnalyticsName = tryGetAnalyticsName(dlbFindNearestAnalyticsActivityAncestor, strA00);
            if (!dlbFindNearestAnalyticsActivityAncestor.equals(fragment)) {
                LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
                linkedHashMapA0j2.putAll(linkedHashMapA0j);
                linkedHashMapA0j2.put("use_inherited_metadata", AnonymousClass001.A0i());
                linkedHashMapA0j = linkedHashMapA0j2;
            }
        } else {
            strTryGetAnalyticsName = null;
        }
        if (str != null) {
            linkedHashMapA0j.put("manual_logging_reason", str);
        }
        FragmentActivity activity = fragment.getActivity();
        linkedHashMapA0j.put("dest_module_uri", (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getData());
        reportNavigationEvent(strTryGetAnalyticsName, strA00, linkedHashMapA0j);
        FragmentActivity activity2 = fragment.getActivity();
        if (activity2 == null || (intent = activity2.getIntent()) == null) {
            return;
        }
        intent.setData(null);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void appendDestModuleUri(Map<String, Object> map, Uri uri) {
        map.put("dest_module_uri", uri);
    }

    private final DLB findNearestAnalyticsActivityAncestor(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 != null) {
            return findNearestAnalyticsActivityAncestor(fragment2);
        }
        return null;
    }

    private final String getModuleClass(Object obj) {
        if (obj != null) {
            return C2F.A00(obj);
        }
        return null;
    }

    private final void prepareForNextEvent() {
        this.prevNavEventData = this.currNavEventData;
        DL1 dl1 = new DL1();
        this.currNavEventData = dl1;
        DL1 prevNavEventData = getPrevNavEventData();
        dl1.A05 = prevNavEventData.A03;
        dl1.A04 = prevNavEventData.A02;
        this.navigationsSinceForegrounding++;
        Map<String, Object> map = prevNavEventData.A06;
        dl1.A00(map == null ? null : map.get("dest_fragment_hash_value"), "source_fragment_hash_value");
    }

    private final String tryGetAnalyticsName(DLB dlb, String str) {
        try {
            throw BV4.A0a("getAnalyticsName");
        } catch (Exception e) {
            if (str == null) {
                str = "";
            }
            CFK.A0E(AuraNavigationLogger.TAG, "getting analyticsName has an unexpected implementation", e, str);
            return null;
        }
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public DL1 getCurrentNavEventData() {
        return this.currNavEventData;
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public DL1 getPrevNavEventData() {
        return this.prevNavEventData;
    }

    public NavigationLoggerImpl() {
        AuraAnalyticsDecoratorInterface auraAnalyticsDecoratorInterfaceBuild = new AuraAnalyticsDecoratorInterface.BuilderImpl("AuraAnalyticsDecorator").build();
        C7384Etj.A0U(auraAnalyticsDecoratorInterfaceBuild);
        this.analyticsDecorator = auraAnalyticsDecoratorInterfaceBuild;
        this.currNavEventData = new DL1();
        this.prevNavEventData = new DL1();
    }

    private final void addInstallerName(Map<String, String> map) {
        String installerPackageName;
        Context contextA06 = C3cG.A06();
        try {
            installerPackageName = contextA06.getPackageManager().getInstallerPackageName(contextA06.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = "";
            }
        } catch (IllegalArgumentException e) {
            CFK.A0K("PackageUtil", e, "Failed to get installer package name due to invalid package name");
            installerPackageName = "unknown";
        }
        if (C7BY.A0j(installerPackageName)) {
            return;
        }
        map.put("installer_name", installerPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportNavigationEvent(DL1 dl1, int i) {
        Object obj;
        Map mapA15;
        Map mapA152;
        Map mapA153;
        Map mapA154;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Map<String, Object> map = dl1.A06;
        if (map != null && (mapA154 = BV5.A15(map)) != null) {
            BV5.A1I(DEVICE_TYPE_KEY, linkedHashMapA0j, mapA154);
        }
        Map<String, Object> map2 = dl1.A06;
        if (map2 != null && (mapA153 = BV5.A15(map2)) != null) {
            BV5.A1I("manual_logging_reason", linkedHashMapA0j, mapA153);
        }
        Map<String, Object> map3 = dl1.A06;
        if (map3 != null && (mapA152 = BV5.A15(map3)) != null) {
            BV5.A1I(CLICK_POINT_KEY, linkedHashMapA0j, mapA152);
        }
        Map<String, Object> map4 = dl1.A06;
        if (map4 != null && (mapA15 = BV5.A15(map4)) != null) {
            BV5.A1I(EVENT_SUBTYPE_KEY, linkedHashMapA0j, mapA15);
        }
        Map<String, Object> map5 = dl1.A06;
        Map mapA155 = map5 != null ? BV5.A15(map5) : null;
        Object obj2 = mapA155 != null ? mapA155.get("device_locale") : null;
        if ((obj2 instanceof String) && obj2 != null) {
            linkedHashMapA0j.put("device_locale", obj2);
        }
        String str = dl1.A05;
        if (str == null) {
            str = "unknown";
        }
        linkedHashMapA0j.put(PIGEON_MODULE_KEYWORD, str);
        String str2 = dl1.A05;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMapA0j.put("source_module", str2);
        String str3 = dl1.A04;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMapA0j.put("source_module_class", str3);
        String str4 = dl1.A03;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMapA0j.put("dest_module", str4);
        String str5 = dl1.A02;
        linkedHashMapA0j.put("dest_module_class", str5 != null ? str5 : "");
        linkedHashMapA0j.put(AgeCheckFunnelLogging.KEY_SEQ, String.valueOf(i));
        linkedHashMapA0j.put("from_ant", "true");
        addInstallerName(linkedHashMapA0j);
        this.analyticsDecorator.onTimeSpentNavigation();
        DFX dfxA0C = BV4.A0C();
        String str6 = dl1.A05;
        if (str6 == null) {
            str6 = "aura";
        }
        DFW dfwA01 = DFX.A01(dfxA0C, C79.A00, str6, "navigation", true);
        C7384Etj.A0U(dfwA01);
        if (dfwA01.A0A()) {
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            while (itA0i.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0i.next();
                C3341CFl.A00(dfwA01.A04(), entry.getValue(), (String) entry.getKey());
            }
            Map<String, Object> map6 = dl1.A06;
            if (map6 != null && (obj = map6.get("dest_module_uri")) != null) {
                C3341CFl c3341CFlA03 = new C3339CFj().A03();
                C3341CFl.A00(c3341CFlA03, obj.toString(), "url");
                dfwA01.A04().A0E(c3341CFlA03, CLICK_POINT_CONTEXT);
            }
            this.analyticsDecorator.decorateTimeSpentNavigationEvent(dfwA01);
            Long l = dl1.A01;
            if (l != null) {
                dfwA01.A06(l.longValue());
            }
            dfwA01.A05();
        }
        CFK.A00(dl1.A04, dl1.A05, dl1.A02, dl1.A03, AuraNavigationLogger.TAG, "Navigation from '%s:%s' to '%s:%s'.");
    }

    private final Map<String, Object> tryGetAnalyticsExtraData(DLA dla, String str) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        try {
            throw BV4.A0a("getAnalyticsExtraData");
        } catch (Exception e) {
            if (str == null) {
                str = "";
            }
            CFK.A0E(AuraNavigationLogger.TAG, "getting analyticsExtraData has an unexpected implementation", e, str);
            return linkedHashMapA0j;
        }
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public String getModuleInfo() {
        DL1 prevNavEventData = getPrevNavEventData();
        return FGI.A0U(prevNavEventData.A02, ":", prevNavEventData.A03);
    }

    @Override // com.facebook.aura.analytics.timespent.navigation.NavigationLogger
    public void reportNavigationEventForComposable(String str, String str2, int i, Map<String, ? extends Object> map) {
        AnonymousClass003.A0w(str, map);
        this.currNavEventData.A00(Integer.valueOf(i), "dest_fragment_hash_value");
        this.currNavEventData.A00(BV4.A0q(str2), "dest_object_ref");
        reportNavigationEvent(str, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void reportNavigationEvent(String str, String str2, Map<String, ? extends Object> map) {
        HashMap mapA0u;
        Object obj;
        Map<String, Object> mapA15;
        DL1 dl1 = this.currNavEventData;
        dl1.A03 = str;
        dl1.A02 = str2;
        dl1.A01 = C60O.A0k();
        if (map != null) {
            if (dl1.A06 == null) {
                dl1.A06 = BV4.A0u();
            }
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                if (dl1.A06.get(entry.getKey()) == null) {
                    dl1.A06.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Map<String, DL6> map2 = dl1.A07;
        if (map2 == null) {
            mapA0u = null;
        } else {
            mapA0u = BV4.A0u();
            Iterator itA0n2 = AnonymousClass002.A0n(map2);
            while (itA0n2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itA0n2.next();
                DL6 dl6 = (DL6) entry2.getValue();
                if (System.currentTimeMillis() - dl6.A00 < 10000 && (obj = dl6.A01) != null) {
                    mapA0u.put(entry2.getKey(), obj);
                }
            }
        }
        Map<String, Object> map3 = dl1.A06;
        if (map3 == null) {
            dl1.A06 = mapA0u;
        } else if (mapA0u != null) {
            map3.putAll(mapA0u);
        }
        Map<String, DL6> mapA152 = null;
        dl1.A07 = null;
        DL1 dl12 = this.currNavEventData;
        String str3 = dl12.A05;
        String str4 = dl12.A04;
        String str5 = dl12.A03;
        String str6 = dl12.A02;
        Long l = dl12.A01;
        Map<String, Object> map4 = dl12.A06;
        if (map4 != null) {
            mapA15 = BV5.A15(map4);
        } else {
            mapA15 = null;
        }
        Map<String, DL6> map5 = dl12.A07;
        if (map5 != null) {
            mapA152 = BV5.A15(map5);
        }
        ZonedValue<DL1> zonedValue = dl12.A00;
        DL1 dl13 = new DL1();
        dl13.A05 = str3;
        dl13.A04 = str4;
        dl13.A03 = str5;
        dl13.A02 = str6;
        dl13.A01 = l;
        dl13.A06 = mapA15;
        dl13.A07 = mapA152;
        dl13.A00 = zonedValue;
        AnonymousClass001.A1J(new AnonymousClass1(dl13, null), Hxb.A02(AnonymousClass001.A0y()));
        prepareForNextEvent();
    }
}
