package com.facebook.aura.graduation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class GraduationChapterUiModel extends C06G {
    public final String body;
    public final String header;
    public final long startTimeMs;
    public final String title;

    public static /* synthetic */ GraduationChapterUiModel copy$default(GraduationChapterUiModel graduationChapterUiModel, String str, String str2, String str3, long j, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        if ((i & 1) != 0) {
            str4 = graduationChapterUiModel.header;
        }
        if ((i & 2) != 0) {
            str5 = graduationChapterUiModel.title;
        }
        if ((i & 4) != 0) {
            str6 = graduationChapterUiModel.body;
        }
        if ((i & 8) != 0) {
            j2 = graduationChapterUiModel.startTimeMs;
        }
        AnonymousClass005.A0x(str4, str5, str6);
        return new GraduationChapterUiModel(str4, str5, str6, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationChapterUiModel) {
                GraduationChapterUiModel graduationChapterUiModel = (GraduationChapterUiModel) obj;
                if (!C7384Etj.areEqual(this.header, graduationChapterUiModel.header) || !C7384Etj.areEqual(this.title, graduationChapterUiModel.title) || !C7384Etj.areEqual(this.body, graduationChapterUiModel.body) || this.startTimeMs != graduationChapterUiModel.startTimeMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final long component4() {
        return this.startTimeMs;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.startTimeMs, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.header))));
    }

    public GraduationChapterUiModel(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        this.header = str;
        this.title = str2;
        this.body = str3;
        this.startTimeMs = j;
    }

    public final GraduationChapterUiModel copy(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GraduationChapterUiModel(str, str2, str3, j);
    }

    public String toString() {
        return super.toString();
    }
}
