package X;

import android.database.Cursor;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EhA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7144EhA extends HashMap {
    public final int $t;

    public static void A01(AbstractMap abstractMap) {
        abstractMap.put(1, "FLAG_GRANT_READ_URI_PERMISSION");
        abstractMap.put(2, "FLAG_GRANT_WRITE_URI_PERMISSION");
        abstractMap.put(4, "FLAG_FROM_BACKGROUND");
        abstractMap.put(8, "FLAG_DEBUG_LOG_RESOLUTION");
        abstractMap.put(16, "FLAG_EXCLUDE_STOPPED_PACKAGES");
        abstractMap.put(32, "FLAG_INCLUDE_STOPPED_PACKAGES");
        abstractMap.put(64, "FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
        abstractMap.put(128, "FLAG_GRANT_PREFIX_URI_PERMISSION");
        abstractMap.put(256, "FLAG_DIRECT_BOOT_AUTO");
    }

    public C7144EhA(int i) {
        Object obj;
        String str;
        Object obj2;
        EPL epl;
        Object obj3;
        this.$t = i;
        switch (i) {
            case 0:
                put("31", "build.version.extensions.r");
                put("32", "build.version.extensions.s");
                obj = "33";
                str = "build.version.extensions.tiramisu";
                put(obj, str);
                break;
            case 1:
                BV6.A1D(50, this, 0.0f);
                BV6.A1D(51, this, 0.03f);
                BV6.A1D(52, this, 0.06f);
                BV6.A1D(53, this, 0.08f);
                BV6.A1D(54, this, 0.1f);
                BV6.A1D(55, this, 0.13f);
                BV6.A1D(56, this, 0.16f);
                BV6.A1D(57, this, 0.18f);
                BV6.A1D(58, this, 0.2f);
                BV6.A1D(59, this, 0.23f);
                BV6.A1D(60, this, 0.26f);
                BV6.A1D(61, this, 0.28f);
                BV6.A1D(62, this, 0.31f);
                BV6.A1D(63, this, 0.33f);
                BV6.A1D(64, this, 0.36f);
                BV6.A1D(65, this, 0.39f);
                BV6.A1D(66, this, 0.42f);
                BV6.A1D(67, this, 0.44f);
                BV6.A1D(68, this, 0.47f);
                BV6.A1D(69, this, 0.5f);
                BV6.A1D(70, this, 0.53f);
                BV6.A1D(71, this, 0.56f);
                BV6.A1D(72, this, 0.59f);
                BV6.A1D(73, this, 0.62f);
                BV6.A1D(74, this, 0.65f);
                BV6.A1D(75, this, 0.68f);
                BV6.A1D(76, this, 0.71f);
                BV6.A1D(77, this, 0.74f);
                BV6.A1D(78, this, 0.78f);
                BV6.A1D(79, this, 0.81f);
                BV6.A1D(80, this, 0.85f);
                BV6.A1D(81, this, 0.88f);
                BV6.A1D(82, this, 0.92f);
                BV6.A1D(83, this, 0.96f);
                BV6.A1D(84, this, 1.0f);
                BV6.A1D(85, this, 1.04f);
                BV6.A1D(86, this, 1.08f);
                BV6.A1D(87, this, 1.13f);
                BV6.A1D(88, this, 1.18f);
                BV6.A1D(89, this, 1.23f);
                BV6.A1D(90, this, 1.28f);
                BV6.A1D(91, this, 1.34f);
                BV6.A1D(92, this, 1.41f);
                BV6.A1D(93, this, 1.48f);
                BV6.A1D(94, this, 1.56f);
                BV6.A1D(95, this, 1.65f);
                BV6.A1D(96, this, 1.76f);
                BV6.A1D(97, this, 1.89f);
                BV6.A1D(98, this, 2.06f);
                BV6.A1D(99, this, 2.33f);
                break;
            case 2:
                A01(this);
                put(1073741824, "FLAG_ACTIVITY_NO_HISTORY");
                put(536870912, "FLAG_ACTIVITY_SINGLE_TOP");
                put(268435456, "FLAG_ACTIVITY_NEW_TASK");
                put(134217728, "FLAG_ACTIVITY_MULTIPLE_TASK");
                put(67108864, "FLAG_ACTIVITY_CLEAR_TOP");
                put(33554432, "FLAG_ACTIVITY_FORWARD_RESULT");
                put(Integer.valueOf(HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES), "FLAG_ACTIVITY_PREVIOUS_IS_TOP");
                put(8388608, "FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS");
                put(4194304, "FLAG_ACTIVITY_BROUGHT_TO_FRONT");
                put(2097152, "FLAG_ACTIVITY_RESET_TASK_IF_NEEDED");
                put(1048576, "FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY");
                put(524288, "FLAG_ACTIVITY_NEW_DOCUMENT");
                put(262144, "FLAG_ACTIVITY_NO_USER_ACTION");
                put(131072, "FLAG_ACTIVITY_REORDER_TO_FRONT");
                put(65536, "FLAG_ACTIVITY_NO_ANIMATION");
                put(32768, "FLAG_ACTIVITY_CLEAR_TASK");
                put(16384, "FLAG_ACTIVITY_TASK_ON_HOME");
                put(8192, "FLAG_ACTIVITY_RETAIN_IN_RECENTS");
                put(4096, "FLAG_ACTIVITY_LAUNCH_ADJACENT");
                put(2048, "FLAG_ACTIVITY_MATCH_EXTERNAL");
                put(1024, "FLAG_ACTIVITY_REQUIRE_NON_BROWSER");
                obj = 512;
                str = "FLAG_ACTIVITY_REQUIRE_DEFAULT";
                put(obj, str);
                break;
            case 3:
                A01(this);
                put(1073741824, "FLAG_RECEIVER_REGISTERED_ONLY");
                put(536870912, "FLAG_RECEIVER_REPLACE_PENDING");
                put(268435456, "FLAG_RECEIVER_FOREGROUND");
                put(Integer.MIN_VALUE, "FLAG_RECEIVER_OFFLOAD");
                put(134217728, "FLAG_RECEIVER_NO_ABORT");
                put(67108864, "FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT");
                put(33554432, "FLAG_RECEIVER_BOOT_UPGRADE");
                put(Integer.valueOf(HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES), "FLAG_RECEIVER_INCLUDE_BACKGROUND");
                put(8388608, "FLAG_RECEIVER_EXCLUDE_BACKGROUND");
                put(4194304, "FLAG_RECEIVER_FROM_SHELL");
                obj = 2097152;
                str = "FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS";
                put(obj, str);
                break;
            case 4:
                obj2 = "FACEBOOK";
                put(EPL.A05, "FACEBOOK");
                put(EPL.A0G, "MESSENGER");
                put(EPL.A08, "FACEBOOK_LITE");
                put(EPL.A0D, "INSTAGRAM");
                epl = EPL.A0E;
                obj3 = "INSTAGRAM_LITE";
                put(epl, obj3);
                put(EPL.A09, obj2);
                put(EPL.A07, obj2);
                break;
            case 5:
                EPL epl2 = EPL.A05;
                obj2 = EPM.A05;
                put(epl2, obj2);
                put(EPL.A0G, EPM.A0G);
                put(EPL.A08, EPM.A08);
                put(EPL.A0D, EPM.A0D);
                epl = EPL.A0E;
                obj3 = EPM.A0E;
                put(epl, obj3);
                put(EPL.A09, obj2);
                put(EPL.A07, obj2);
                break;
            case 6:
            case 9:
            case 10:
                obj = "resolver_type";
                str = "content_provider";
                put(obj, str);
                break;
            case 7:
            case 8:
            default:
                EPL epl3 = EPL.A05;
                EPM epm = EPM.A05;
                put(epl3, new EPQ(epm));
                put(EPL.A06, new EPQ(epm));
                EPL epl4 = EPL.A0G;
                EPM epm2 = EPM.A0G;
                put(epl4, new EPQ(epm2));
                put(EPL.A0H, new EPQ(epm2));
                put(EPL.A08, new EPZ());
                put(EPL.A0E, new C6679EPa());
                put(EPL.A0D, new EPV());
                put(EPL.A0M, new EPW());
                put(EPL.A0F, new EPV());
                A00(EPL.A0L, this, EPM.A0L);
                A00(EPL.A0J, this, EPM.A0J);
                A00(EPL.A0K, this, EPM.A0K);
                A00(EPL.A0N, this, EPM.A0O);
                A00(EPL.A0O, this, EPM.A0P);
                A00(EPL.A0A, this, EPM.A0A);
                A00(EPL.A0B, this, EPM.A0B);
                A00(EPL.A0C, this, EPM.A0C);
                put(EPL.A09, new EPQ(epm));
                put(EPL.A07, new EPQ(epm));
                put(EPL.A0P, new C6682EPp());
                break;
        }
    }

    public static void A00(Object obj, AbstractMap abstractMap, EPM epm) {
        abstractMap.put(obj, new C6681EPh(epm));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.$t) {
            case 1:
                if (obj instanceof Integer) {
                    return super.containsKey(obj);
                }
                return false;
            case 2:
                if (obj instanceof Integer) {
                    return super.containsKey(obj);
                }
                return false;
            case 3:
                if (obj instanceof Integer) {
                    return super.containsKey(obj);
                }
                return false;
            case 4:
                if (obj == null || (obj instanceof EPL)) {
                    return super.containsKey(obj);
                }
                return false;
            case 5:
                if (obj == null || (obj instanceof EPL)) {
                    return super.containsKey(obj);
                }
                return false;
            case 6:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 7:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 8:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 9:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 10:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 11:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 12:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 13:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 14:
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            case 15:
                if (obj == null || (obj instanceof EPL)) {
                    return super.containsKey(obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.$t) {
            case 1:
                if (obj instanceof Float) {
                    return super.containsValue(obj);
                }
                return false;
            case 2:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 3:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 4:
                if (obj == null || (obj instanceof String)) {
                    return super.containsValue(obj);
                }
                return false;
            case 5:
                if (obj == null || (obj instanceof EPM)) {
                    return super.containsValue(obj);
                }
                return false;
            case 6:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 7:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 8:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 9:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 10:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 11:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 12:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 13:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 14:
                if (obj instanceof String) {
                    return super.containsValue(obj);
                }
                return false;
            case 15:
                if (obj == null || (obj instanceof EQ5)) {
                    return super.containsValue(obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Integer, Float>> entrySet() {
        switch (this.$t) {
            case 1:
                return super.entrySet();
            case 2:
                return super.entrySet();
            case 3:
                return super.entrySet();
            case 4:
                return super.entrySet();
            case 5:
                return super.entrySet();
            case 6:
                return super.entrySet();
            case 7:
                return super.entrySet();
            case 8:
                return super.entrySet();
            case 9:
                return super.entrySet();
            case 10:
                return super.entrySet();
            case 11:
                return super.entrySet();
            case 12:
                return super.entrySet();
            case 13:
                return super.entrySet();
            case 14:
                return super.entrySet();
            case 15:
                return super.entrySet();
            default:
                return super.entrySet();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.$t) {
            case 1:
                if (obj instanceof Integer) {
                    return super.get(obj);
                }
                return null;
            case 2:
                if (obj instanceof Integer) {
                    return super.get(obj);
                }
                return null;
            case 3:
                if (obj instanceof Integer) {
                    return super.get(obj);
                }
                return null;
            case 4:
                if (obj == null || (obj instanceof EPL)) {
                    return super.get(obj);
                }
                return null;
            case 5:
                if (obj == null || (obj instanceof EPL)) {
                    return super.get(obj);
                }
                return null;
            case 6:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 7:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 8:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 9:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 10:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 11:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 12:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 13:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 14:
                if (obj instanceof String) {
                    return super.get(obj);
                }
                return null;
            case 15:
                if (obj == null || (obj instanceof EPL)) {
                    return super.get(obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.$t) {
            case 1:
                if (obj instanceof Integer) {
                    break;
                }
                break;
            case 2:
                if (obj instanceof Integer) {
                    break;
                }
                break;
            case 3:
                if (obj instanceof Integer) {
                    break;
                }
                break;
            case 4:
                if (obj == null || (obj instanceof EPL)) {
                    break;
                }
                break;
            case 5:
                if (obj == null || (obj instanceof EPL)) {
                    break;
                }
                break;
            case 6:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 7:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 8:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 9:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 10:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 11:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 12:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 13:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 14:
                if (obj instanceof String) {
                    break;
                }
                break;
            case 15:
                if (obj == null || (obj instanceof EPL)) {
                    break;
                }
                break;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Integer> keySet() {
        switch (this.$t) {
            case 1:
                return super.keySet();
            case 2:
                return super.keySet();
            case 3:
                return super.keySet();
            case 4:
                return super.keySet();
            case 5:
                return super.keySet();
            case 6:
                return super.keySet();
            case 7:
                return super.keySet();
            case 8:
                return super.keySet();
            case 9:
                return super.keySet();
            case 10:
                return super.keySet();
            case 11:
                return super.keySet();
            case 12:
                return super.keySet();
            case 13:
                return super.keySet();
            case 14:
                return super.keySet();
            case 15:
                return super.keySet();
            default:
                return super.keySet();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        switch (this.$t) {
            case 1:
                if (obj instanceof Integer) {
                    return super.remove(obj);
                }
                return null;
            case 2:
                if (obj instanceof Integer) {
                    return super.remove(obj);
                }
                return null;
            case 3:
                if (obj instanceof Integer) {
                    return super.remove(obj);
                }
                return null;
            case 4:
                if (obj == null || (obj instanceof EPL)) {
                    return super.remove(obj);
                }
                return null;
            case 5:
                if (obj == null || (obj instanceof EPL)) {
                    return super.remove(obj);
                }
                return null;
            case 6:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 7:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 8:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 9:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 10:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 11:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 12:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 13:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 14:
                if (obj instanceof String) {
                    return super.remove(obj);
                }
                return null;
            case 15:
                if (obj == null || (obj instanceof EPL)) {
                    return super.remove(obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        switch (this.$t) {
            case 1:
                return super.size();
            case 2:
                return super.size();
            case 3:
                return super.size();
            case 4:
                return super.size();
            case 5:
                return super.size();
            case 6:
                return super.size();
            case 7:
                return super.size();
            case 8:
                return super.size();
            case 9:
                return super.size();
            case 10:
                return super.size();
            case 11:
                return super.size();
            case 12:
                return super.size();
            case 13:
                return super.size();
            case 14:
                return super.size();
            case 15:
                return super.size();
            default:
                return super.size();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Float> values() {
        switch (this.$t) {
            case 1:
                return super.values();
            case 2:
                return super.values();
            case 3:
                return super.values();
            case 4:
                return super.values();
            case 5:
                return super.values();
            case 6:
                return super.values();
            case 7:
                return super.values();
            case 8:
                return super.values();
            case 9:
                return super.values();
            case 10:
                return super.values();
            case 11:
                return super.values();
            case 12:
                return super.values();
            case 13:
                return super.values();
            case 14:
                return super.values();
            case 15:
                return super.values();
            default:
                return super.values();
        }
    }

    public C7144EhA(C5226Ddj c5226Ddj, JSONObject jSONObject, int i) throws JSONException {
        String str;
        String strOptString;
        String string;
        this.$t = i;
        if (8 - i != 0) {
            if (!jSONObject.has("name")) {
                string = "";
            } else {
                string = jSONObject.getString("name");
            }
            put("name", string);
            put("profile_pic_url", jSONObject.has("profilePicUrl") ? jSONObject.getString("profilePicUrl") : "");
            put("resolver_type", "account_manager");
            put("sso_eligibility", c5226Ddj.ssoEligibility);
            str = "nta_eligibility";
            strOptString = c5226Ddj.ntaEligibility;
        } else {
            put("resolver_type", "content_provider");
            put("sso_eligibility", c5226Ddj.ssoEligibility);
            put("nta_eligibility", c5226Ddj.ntaEligibility);
            if (jSONObject.has("name") && !jSONObject.isNull("name")) {
                put("name", jSONObject.optString("name"));
            }
            if (!jSONObject.has("pic_square") || jSONObject.isNull("pic_square")) {
                return;
            }
            str = "profile_pic_url";
            strOptString = jSONObject.optString("pic_square");
        }
        put(str, strOptString);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.$t) {
            case 1:
                if ((obj instanceof Integer) && (obj2 instanceof Float)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof Integer) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof Integer) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 4:
                if (obj == null || (obj instanceof EPL)) {
                    if (obj2 == null || (obj2 instanceof String)) {
                        break;
                    }
                }
                break;
            case 5:
                if (obj == null || (obj instanceof EPL)) {
                    if (obj2 == null || (obj2 instanceof EPM)) {
                        break;
                    }
                }
                break;
            case 6:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 10:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    break;
                }
                break;
            case 15:
                if (obj == null || (obj instanceof EPL)) {
                    if (obj2 == null || (obj2 instanceof EQ5)) {
                        break;
                    }
                }
                break;
        }
        return super.remove(obj, obj2);
    }

    public C7144EhA(Cursor cursor, int i, int i2, int i3) {
        String string;
        String string2;
        String string3;
        this.$t = 14;
        put("resolver_type", "content_provider");
        if (i != -1) {
            string = cursor.getString(i);
        } else {
            string = "FXAccountItemHoldoutStatusNoData";
        }
        put("upsell_holdout_status", string);
        if (i2 != -1 && (string3 = cursor.getString(i2)) != null) {
            put("name", string3);
        }
        if (i3 != -1 && (string2 = cursor.getString(i3)) != null) {
            put("profile_pic_url", string2);
        }
    }

    public C7144EhA(Cursor cursor, C5226Ddj c5226Ddj, int i, int i2, int i3) {
        String string;
        String string2;
        String string3;
        this.$t = 12;
        put("resolver_type", "content_provider");
        if (i != -1) {
            string = cursor.getString(i);
        } else {
            string = "FXAccountItemHoldoutStatusNoData";
        }
        put("upsell_holdout_status", string);
        put("sso_eligibility", c5226Ddj.ssoEligibility);
        put("nta_eligibility", c5226Ddj.ntaEligibility);
        if (i2 != -1 && (string3 = cursor.getString(i2)) != null) {
            put("name", string3);
        }
        if (i3 != -1 && (string2 = cursor.getString(i3)) != null) {
            put("profile_pic_url", string2);
        }
    }

    public C7144EhA(C10543Hqv<String> c10543Hqv, C10543Hqv<String> c10543Hqv2, C5226Ddj c5226Ddj) {
        this.$t = 7;
        put("name", c10543Hqv.element);
        put("profile_pic_url", c10543Hqv2.element);
        put("resolver_type", "account_manager");
        put("sso_eligibility", c5226Ddj.ssoEligibility);
        put("nta_eligibility", c5226Ddj.ntaEligibility);
    }

    public C7144EhA(JSONObject jSONObject) throws JSONException {
        String string;
        this.$t = 13;
        if (jSONObject.has("name")) {
            string = jSONObject.getString("name");
        } else {
            string = "";
        }
        put("name", string);
        put("profile_pic_url", jSONObject.has("profilePicUrl") ? jSONObject.getString("profilePicUrl") : "");
        put("resolver_type", "account_manager");
    }
}
