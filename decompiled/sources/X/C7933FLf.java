package X;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.bloks.BloksParseResult;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FLf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7933FLf implements FOI {
    public final int A00;
    public final SparseArray<Object> A01;
    public final FHL A02;
    public final BloksParseResult A03;
    public final Boolean A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List<Integer> A09;
    public final Map<String, Object> A0A;
    public final Map<String, Object> A0B;

    /* JADX WARN: Incorrect types in method signature: (Lcom/instagram/common/bloks/BloksParseResult;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/lang/Boolean;LX/FHL;Ljava/util/List<Ljava/lang/Integer;>;ZZ)V */
    public C7933FLf(FHL fhl, BloksParseResult bloksParseResult, Boolean bool, String str, List list, Map map, Map map2, boolean z, boolean z2) {
        LinkedHashMap linkedHashMapA14;
        String str2;
        C7384Etj.A0Y(list, 6);
        this.A03 = bloksParseResult;
        this.A0A = map2;
        this.A04 = bool;
        this.A02 = fhl;
        this.A09 = list;
        map.get("__infra__app_id");
        if (!z || z2) {
            linkedHashMapA14 = AbstractC7607F5u.A14(map);
            linkedHashMapA14.put("__infra__ttrc_instance_id", String.valueOf(new SecureRandom().nextInt()));
            linkedHashMapA14.put("__infra__ttrc_timestamp", Long.valueOf(AwakeTimeSinceBootClock.INSTANCE.now()));
        } else {
            linkedHashMapA14 = AbstractC7607F5u.A14(map);
        }
        this.A0B = linkedHashMapA14;
        Object obj = linkedHashMapA14.get("__infra__app_id");
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj;
        this.A07 = str3;
        this.A06 = str == null ? str3 : str;
        Object obj2 = linkedHashMapA14.get("__infra__screen_id");
        C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A08 = (String) obj2;
        Object obj3 = linkedHashMapA14.get("__infra__ttrc_marker_id");
        C7384Etj.A0Z(obj3, AnonymousClass000.A00(0));
        this.A00 = AnonymousClass001.A0F(obj3);
        Object obj4 = linkedHashMapA14.get("__infra__ttrc_instance_id");
        Integer numA0r = null;
        if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
            numA0r = C9tI.A0r(str2);
        }
        this.A05 = numA0r;
        C7384Etj.A0Z(linkedHashMapA14.get("__infra__cache_ttl"), "null cannot be cast to non-null type kotlin.Long");
        this.A01 = (SparseArray) linkedHashMapA14.get("__key_additional_object_set");
    }

    public final void A00(Bundle bundle) {
        bundle.putString("__nav_data_type", "screen_query");
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putBoolean("key_from_config_change", false);
        bundleA0N.putString("key_app_id", this.A07);
        bundleA0N.putInt("key_content_parse_result", Hi4.A00(this.A03));
        bundleA0N.putInt("key_tree_params", Hi4.A00(this.A0B));
        bundleA0N.putInt("key_analytics_extras", Hi4.A00(this.A0A));
        bundleA0N.putString("key_analytics_module", this.A06);
        Boolean bool = this.A04;
        bundleA0N.putBoolean("key_animate_on_navigation", bool != null ? bool.booleanValue() : true);
        bundleA0N.putInt("key_container_config", Hi4.A00(this.A02));
        bundle.putBundle("key_screen_container_props_bundle", bundleA0N);
    }

    @Override // X.FOI
    public final String AHv() {
        return "screen_query";
    }
}
