package com.facebook.aura.graduation.repo;

import X.AGI;
import X.AbstractC2159Azp;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HatchGraduationRepositoryJsonKt {
    public static final String DISPLAY_NAME_TOKEN = "{display_name}";
    public static final Set<String> INVALID_FILENAMES = C60O.A1A("", ".", "..");
    public static final String JOINED_DATE_TOKEN = "{joined_date}";

    public static final HatchGraduationDownload toDownload(GraduationDownloadResponseJson graduationDownloadResponseJson) {
        C7384Etj.A0Y(graduationDownloadResponseJson, 0);
        String str = graduationDownloadResponseJson.download_url;
        if (str.length() <= 0) {
            return null;
        }
        String strA0M = C7BY.A0M(graduationDownloadResponseJson.filename);
        String strA0R = C7BY.A0R(strA0M, strA0M, '\\');
        if (INVALID_FILENAMES.contains(strA0R) || strA0R == null) {
            return null;
        }
        String str2 = graduationDownloadResponseJson.mime_type;
        if (AnonymousClass005.A1a(str2, "video/")) {
            return new HatchGraduationDownload(str, strA0R, str2);
        }
        return null;
    }

    public static final HatchGraduationState toGraduationState(GraduationStartResponseJson graduationStartResponseJson) {
        C7384Etj.A0Y(graduationStartResponseJson, 0);
        return new HatchGraduationState(graduationStartResponseJson.should_show, graduationStartResponseJson.is_user_graduation_enabled, toStory(graduationStartResponseJson), true);
    }

    public static final HatchGraduationChapter toChapter(GraduationPageJson graduationPageJson, GraduationTemplateParametersJson graduationTemplateParametersJson) {
        return new HatchGraduationChapter(graduationPageJson.header, AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(graduationPageJson.title, DISPLAY_NAME_TOKEN, graduationTemplateParametersJson.display_name), JOINED_DATE_TOKEN, graduationTemplateParametersJson.joined_date), graduationPageJson.body, graduationPageJson.start_time_ms);
    }

    public static final HatchGraduationStory toStory(GraduationStartResponseJson graduationStartResponseJson) {
        String str;
        String str2 = graduationStartResponseJson.experience_id;
        Long l = null;
        if (str2.length() <= 0 || (str = graduationStartResponseJson.video_url) == null || str.length() <= 0 || graduationStartResponseJson.pages.isEmpty()) {
            return null;
        }
        Long l2 = graduationStartResponseJson.loop_start_time_ms;
        if (l2 != null && l2.longValue() >= 0) {
            l = l2;
        }
        List<GraduationPageJson> list = graduationStartResponseJson.pages;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<GraduationPageJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toChapter(it.next(), graduationStartResponseJson.template_parameters));
        }
        return new HatchGraduationStory(str2, str, l, AGI.A07(arrayListA0i));
    }
}
