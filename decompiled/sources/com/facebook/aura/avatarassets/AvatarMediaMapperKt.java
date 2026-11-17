package com.facebook.aura.avatarassets;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.BFI;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.avatarassets.path.AvatarPathKt;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.model.AppearancePaths;
import com.facebook.aura.model.AvatarDisplayCrop;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class AvatarMediaMapperKt {
    public static final String CALL_IDLE = "call.idle@7:12";
    public static final String DARK = "dark";
    public static final String LIGHT = "light";
    public static final String PORTRAIT = "portrait.base";
    public static final String READY = "ready";
    public static final String STOCK = "stock";
    public static final Map<AvatarVideoVariant, String> VIDEO_ASSETS = AGH.A0D(C3cG.A0r(AvatarVideoVariant.IDLE, "status.idle"), C3cG.A0r(AvatarVideoVariant.CONNECTING, "status.idle"), C3cG.A0r(AvatarVideoVariant.WORKING, "status.working"), C3cG.A0r(AvatarVideoVariant.WAITING_FOR_SUBAGENTS, "status.working"), C3cG.A0r(AvatarVideoVariant.MAKING_SOMETHING, "status.making_something"), C3cG.A0r(AvatarVideoVariant.WAKING, "status.waking"), C3cG.A0r(AvatarVideoVariant.MILESTONE_ACHIEVEMENT, "status.milestone_level_up"), C3cG.A0r(AvatarVideoVariant.MILESTONE_LEVEL_UP, "status.milestone_level_up"));
    public static final Set<String> IMAGE_FORMATS = BFI.A0H(new String[]{"image/webp", HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, MediaDeviceSyncClientKt.FALLBACK_MIME});
    public static final Set<String> VIDEO_FORMATS = Collections.singleton(HatchShareSheetRepository.MUTED_VIDEO_MIME);

    public static final AvatarMedia avatarMedia(AvatarAssetsJson avatarAssetsJson) {
        AvatarDisplayCropJson avatarDisplayCropJson;
        AvatarDisplayCropJson avatarDisplayCropJson2;
        String str;
        String str2;
        AvatarAssetPartJson avatarAssetPartJson;
        C7384Etj.A0Y(avatarAssetsJson, 0);
        AvatarAssetsAvatarJson avatarAssetsAvatarJson = avatarAssetsJson.avatar;
        AvatarDisplayCrop avatarDisplayCrop = null;
        boolean zEquals = STOCK.equals(avatarAssetsAvatarJson != null ? avatarAssetsAvatarJson.source : null);
        Map<AvatarVideoVariant, String> map = VIDEO_ASSETS;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(map.size()));
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            linkedHashMap.put(entry.getKey(), avatarMedia$asset(avatarAssetsJson, (String) entry.getValue()));
        }
        AvatarAssetJson avatarAssetJsonAvatarMedia$asset = avatarMedia$asset(avatarAssetsJson, CALL_IDLE);
        AvatarAssetPartJson avatarAssetPartJson2 = avatarAssetJsonAvatarMedia$asset != null ? avatarAssetJsonAvatarMedia$asset.video : null;
        Set<String> set = VIDEO_FORMATS;
        AvatarAssetFileJson avatarAssetFileJsonAvatarMedia$file = avatarMedia$file(zEquals, avatarAssetPartJson2, LIGHT, set);
        AvatarAssetJson avatarAssetJsonAvatarMedia$asset2 = avatarMedia$asset(avatarAssetsJson, CALL_IDLE);
        AvatarAssetFileJson avatarAssetFileJsonAvatarMedia$file2 = avatarMedia$file(zEquals, avatarAssetJsonAvatarMedia$asset2 != null ? avatarAssetJsonAvatarMedia$asset2.video : null, "dark", set);
        AppearancePaths appearancePathsAvatarMedia$stills = avatarMedia$stills(avatarAssetsJson, zEquals, PORTRAIT);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AIW.A0H(linkedHashMap.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMap);
        while (itA0i.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itA0i.next();
            Object key = entry2.getKey();
            AvatarAssetJson avatarAssetJson = (AvatarAssetJson) entry2.getValue();
            linkedHashMap2.put(key, avatarMedia$paths(zEquals, avatarAssetJson != null ? avatarAssetJson.video : null, set));
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0i2 = C3cG.A0i(linkedHashMap2);
        while (itA0i2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itA0i2.next();
            if (!((AppearancePaths) entry3.getValue()).isEmpty()) {
                linkedHashMapA0j.put(entry3.getKey(), entry3.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AIW.A0H(linkedHashMap.size()));
        Iterator itA0i3 = C3cG.A0i(linkedHashMap);
        while (itA0i3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itA0i3.next();
            Object key2 = entry4.getKey();
            AvatarAssetJson avatarAssetJson2 = (AvatarAssetJson) entry4.getValue();
            AppearancePaths appearancePathsAvatarMedia$paths = avatarMedia$paths(zEquals, avatarAssetJson2 != null ? avatarAssetJson2.still : null, IMAGE_FORMATS);
            AppearancePaths appearancePathsAvatarMedia$stills2 = avatarMedia$stills(avatarAssetsJson, zEquals, (avatarAssetJson2 == null || (avatarAssetPartJson = avatarAssetJson2.video) == null) ? null : avatarAssetPartJson.starts_from);
            List<String> list = appearancePathsAvatarMedia$paths.dark;
            if (list.isEmpty()) {
                list = appearancePathsAvatarMedia$stills2.dark;
            }
            List<String> list2 = appearancePathsAvatarMedia$paths.light;
            if (list2.isEmpty()) {
                list2 = appearancePathsAvatarMedia$stills2.light;
            }
            linkedHashMap3.put(key2, new AppearancePaths(list, list2));
        }
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        Iterator itA0i4 = C3cG.A0i(linkedHashMap3);
        while (itA0i4.hasNext()) {
            Map.Entry entry5 = (Map.Entry) itA0i4.next();
            if (!((AppearancePaths) entry5.getValue()).isEmpty()) {
                linkedHashMapA0j2.put(entry5.getKey(), entry5.getValue());
            }
        }
        AppearancePaths appearancePaths = new AppearancePaths(AbstractC0885AGm.A0z((avatarAssetFileJsonAvatarMedia$file2 == null || (str2 = avatarAssetFileJsonAvatarMedia$file2.path) == null) ? null : AvatarPathKt.avatarPath(str2)), AbstractC0885AGm.A0z((avatarAssetFileJsonAvatarMedia$file == null || (str = avatarAssetFileJsonAvatarMedia$file.path) == null) ? null : AvatarPathKt.avatarPath(str)));
        AvatarDisplayCrop avatarDisplayCrop2 = (avatarAssetFileJsonAvatarMedia$file == null || (avatarDisplayCropJson2 = avatarAssetFileJsonAvatarMedia$file.display_crop) == null) ? null : new AvatarDisplayCrop(avatarDisplayCropJson2.x, avatarDisplayCropJson2.y, avatarDisplayCropJson2.size);
        if (avatarAssetFileJsonAvatarMedia$file2 != null && (avatarDisplayCropJson = avatarAssetFileJsonAvatarMedia$file2.display_crop) != null) {
            avatarDisplayCrop = new AvatarDisplayCrop(avatarDisplayCropJson.x, avatarDisplayCropJson.y, avatarDisplayCropJson.size);
        }
        return new AvatarMedia(appearancePathsAvatarMedia$stills, linkedHashMapA0j, linkedHashMapA0j2, appearancePaths, avatarDisplayCrop2, avatarDisplayCrop, avatarAssetsJson.revision);
    }

    public static final AvatarAssetJson avatarMedia$asset(AvatarAssetsJson avatarAssetsJson, String str) {
        AvatarAssetJson next;
        AvatarAssetJson avatarAssetJson = null;
        if (str == null) {
            return null;
        }
        Iterator<AvatarAssetJson> it = avatarAssetsJson.assets.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.id)) {
                break;
            }
        }
        AvatarAssetJson avatarAssetJson2 = next;
        if (avatarAssetJson2 != null) {
            return avatarAssetJson2;
        }
        Iterator<AvatarAssetJson> it2 = avatarAssetsJson.assets.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AvatarAssetJson next2 = it2.next();
            if (next2.aliases.contains(str)) {
                avatarAssetJson = next2;
                break;
            }
        }
        return avatarAssetJson;
    }

    public static final AvatarAssetFileJson avatarMedia$file(boolean z, AvatarAssetPartJson avatarAssetPartJson, String str, Set<String> set) {
        Map<String, AvatarAppearanceStateJson> map;
        AvatarAppearanceStateJson avatarAppearanceStateJson;
        List<AvatarAssetFileJson> list;
        Object next = null;
        if (avatarAssetPartJson == null || (map = avatarAssetPartJson.appearances) == null || (avatarAppearanceStateJson = map.get(str)) == null || !READY.equals(avatarAppearanceStateJson.status) || (list = avatarAppearanceStateJson.files) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AvatarAssetFileJson avatarAssetFileJson : list) {
            AvatarAssetFileJson avatarAssetFileJson2 = avatarAssetFileJson;
            String str2 = avatarAssetFileJson2.format;
            if (AbstractC0878AGe.A0k(set, str2 != null ? str2.toLowerCase(Locale.ROOT) : null) && (z || !STOCK.equals(avatarAssetFileJson2.source))) {
                String str3 = avatarAssetFileJson2.path;
                if (str3 != null && AvatarPathKt.avatarPath(str3) != null) {
                    arrayList.add(avatarAssetFileJson);
                }
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                AvatarAssetFileJson avatarAssetFileJson3 = (AvatarAssetFileJson) next;
                Integer num = avatarAssetFileJson3.width;
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                Integer num2 = avatarAssetFileJson3.height;
                int iMax = Math.max(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                do {
                    Object next2 = it.next();
                    AvatarAssetFileJson avatarAssetFileJson4 = (AvatarAssetFileJson) next2;
                    Integer num3 = avatarAssetFileJson4.width;
                    int iIntValue2 = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
                    Integer num4 = avatarAssetFileJson4.height;
                    int iMax2 = Math.max(iIntValue2, num4 != null ? num4.intValue() : Integer.MAX_VALUE);
                    if (iMax < iMax2) {
                        next = next2;
                        iMax = iMax2;
                    }
                } while (it.hasNext());
            }
        }
        return (AvatarAssetFileJson) next;
    }

    public static final AppearancePaths avatarMedia$paths(boolean z, AvatarAssetPartJson avatarAssetPartJson, Set<String> set) {
        String str;
        String str2;
        AvatarAssetFileJson avatarAssetFileJsonAvatarMedia$file = avatarMedia$file(z, avatarAssetPartJson, "dark", set);
        String strAvatarPath = null;
        List listA0z = AbstractC0885AGm.A0z((avatarAssetFileJsonAvatarMedia$file == null || (str2 = avatarAssetFileJsonAvatarMedia$file.path) == null) ? null : AvatarPathKt.avatarPath(str2));
        AvatarAssetFileJson avatarAssetFileJsonAvatarMedia$file2 = avatarMedia$file(z, avatarAssetPartJson, LIGHT, set);
        if (avatarAssetFileJsonAvatarMedia$file2 != null && (str = avatarAssetFileJsonAvatarMedia$file2.path) != null) {
            strAvatarPath = AvatarPathKt.avatarPath(str);
        }
        return new AppearancePaths(listA0z, AbstractC0885AGm.A0z(strAvatarPath));
    }

    public static final AppearancePaths avatarMedia$stills(AvatarAssetsJson avatarAssetsJson, boolean z, String str) {
        AvatarAssetJson avatarAssetJsonAvatarMedia$asset = avatarMedia$asset(avatarAssetsJson, str);
        return avatarMedia$paths(z, avatarAssetJsonAvatarMedia$asset != null ? avatarAssetJsonAvatarMedia$asset.still : null, IMAGE_FORMATS);
    }
}
