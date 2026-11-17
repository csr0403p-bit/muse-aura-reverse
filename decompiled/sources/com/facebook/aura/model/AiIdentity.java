package com.facebook.aura.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C10543Hqv;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.EnumC06837l4;
import X.F1F;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AiIdentity extends C06G {
    public final AvatarMedia avatarMedia;
    public final String avatarStem;
    public final String creature;
    public final String description;
    public final String emoji;
    public final String name;
    public final AHD<IdentitySection> sections;
    public final String tagline;
    public final String vibe;
    public static final Companion Companion = new Companion();
    public static final int $stable = AvatarMedia.$stable;
    public static final C06827l3 BOLD_FIELD_REGEX = new C06827l3("^-\\s*\\*\\*(.+?):\\*\\*\\s*(.+)", EnumC06837l4.A03);
    public static final C06827l3 BLOCKQUOTE_REGEX = new C06827l3("^>\\s*(.+)");
    public static final C06827l3 SECTION_HEADER_REGEX = new C06827l3("^##\\s+(.+)");
    public static final C06827l3 HTML_COMMENT_REGEX = new C06827l3("^\\s*<!--.*-->\\s*$");
    public static final Set<String> KNOWN_SECTION_NAMES = BFI.A0H(new String[]{"name", "tagline", HatchWebPageParserKt.DESCRIPTION, "identity", "identity.md", HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID});

    public final class Companion {

        public final class SectionFlags {
            public boolean inDescription;
            public boolean isDedicated;

            public final boolean getInDescription() {
                return this.inDescription;
            }

            public final boolean isDedicated() {
                return this.isDedicated;
            }

            public final void setDedicated(boolean z) {
                this.isDedicated = z;
            }

            public final void setInDescription(boolean z) {
                this.inDescription = z;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.model.AiIdentity parse(java.lang.String r36) {
            /*
                Method dump skipped, instructions count: 686
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.AiIdentity.Companion.parse(java.lang.String):com.facebook.aura.model.AiIdentity");
        }

        private final boolean isHtmlComment(String str) {
            return AiIdentity.HTML_COMMENT_REGEX.A08(str) || AnonymousClass005.A1a(AnonymousClass002.A0l(str), "<!--");
        }

        public static final void parse$finishCurrentSection(C10543Hqv<String> c10543Hqv, SectionFlags sectionFlags, List<String> list, List<IdentitySection> list2, List<String> list3, F1F f1f, F1F f1f2) {
            String str = c10543Hqv.element;
            if (str != null && !sectionFlags.isDedicated && !list.isEmpty()) {
                String strA0l = AnonymousClass002.A0l(C3cH.A0e(PairsDiscretionDocument.TERMINATOR, list));
                if (!C7BY.A0j(strA0l)) {
                    list2.add(new IdentitySection(str, strA0l));
                }
            }
            if (sectionFlags.inDescription && !list.isEmpty()) {
                list3.addAll(list);
            }
            c10543Hqv.element = null;
            sectionFlags.isDedicated = false;
            list.clear();
            f1f.element = false;
            f1f2.element = false;
            sectionFlags.inDescription = false;
        }

        private final boolean isValidValue(String str) {
            return (str.length() <= 0 || isHtmlComment(str) || str.startsWith("#")) ? false : true;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AiIdentity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, AvatarMedia avatarMedia, AHD<IdentitySection> ahd) {
        AnonymousClass005.A13(str, avatarMedia, ahd, 0);
        return new AiIdentity(str, str2, str3, str4, str5, str6, str7, avatarMedia, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiIdentity) {
                AiIdentity aiIdentity = (AiIdentity) obj;
                if (!C7384Etj.areEqual(this.name, aiIdentity.name) || !C7384Etj.areEqual(this.tagline, aiIdentity.tagline) || !C7384Etj.areEqual(this.description, aiIdentity.description) || !C7384Etj.areEqual(this.creature, aiIdentity.creature) || !C7384Etj.areEqual(this.vibe, aiIdentity.vibe) || !C7384Etj.areEqual(this.emoji, aiIdentity.emoji) || !C7384Etj.areEqual(this.avatarStem, aiIdentity.avatarStem) || !C7384Etj.areEqual(this.avatarMedia, aiIdentity.avatarMedia) || !C7384Etj.areEqual(this.sections, aiIdentity.sections)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AiIdentity(String str, String str2, String str3, String str4, String str5, String str6, String str7, AvatarMedia avatarMedia, AHD ahd, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null, (i & 128) != 0 ? new AvatarMedia(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0) : avatarMedia, (i & 256) != 0 ? AHI.A01 : ahd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiIdentity copy$default(AiIdentity aiIdentity, String str, String str2, String str3, String str4, String str5, String str6, String str7, AvatarMedia avatarMedia, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiIdentity.name;
        }
        if ((i & 2) != 0) {
            str2 = aiIdentity.tagline;
        }
        if ((i & 4) != 0) {
            str3 = aiIdentity.description;
        }
        if ((i & 8) != 0) {
            str4 = aiIdentity.creature;
        }
        if ((i & 16) != 0) {
            str5 = aiIdentity.vibe;
        }
        if ((i & 32) != 0) {
            str6 = aiIdentity.emoji;
        }
        if ((i & 64) != 0) {
            str7 = aiIdentity.avatarStem;
        }
        if ((i & 128) != 0) {
            avatarMedia = aiIdentity.avatarMedia;
        }
        if ((i & 256) != 0) {
            ahd = aiIdentity.sections;
        }
        return aiIdentity.copy(str, str2, str3, str4, str5, str6, str7, avatarMedia, ahd);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.tagline;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.creature;
    }

    public final String component5() {
        return this.vibe;
    }

    public final String component6() {
        return this.emoji;
    }

    public final String component7() {
        return this.avatarStem;
    }

    public final AvatarMedia component8() {
        return this.avatarMedia;
    }

    public final AHD<IdentitySection> component9() {
        return this.sections;
    }

    public final AvatarMedia getAvatarMedia() {
        return this.avatarMedia;
    }

    public final String getAvatarStem() {
        return this.avatarStem;
    }

    public final String getCreature() {
        return this.creature;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getName() {
        return this.name;
    }

    public final AHD<IdentitySection> getSections() {
        return this.sections;
    }

    public final String getTagline() {
        return this.tagline;
    }

    public final String getVibe() {
        return this.vibe;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sections, AnonymousClass005.A0F(this.avatarMedia, (((((((((((AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.tagline)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.creature)) * 31) + AnonymousClass006.A0G(this.vibe)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass005.A0H(this.avatarStem)) * 31));
    }

    public String toString() {
        return super.toString();
    }

    public AiIdentity(String str, String str2, String str3, String str4, String str5, String str6, String str7, AvatarMedia avatarMedia, AHD<IdentitySection> ahd) {
        AnonymousClass005.A13(str, avatarMedia, ahd, 0);
        this.name = str;
        this.tagline = str2;
        this.description = str3;
        this.creature = str4;
        this.vibe = str5;
        this.emoji = str6;
        this.avatarStem = str7;
        this.avatarMedia = avatarMedia;
        this.sections = ahd;
    }
}
